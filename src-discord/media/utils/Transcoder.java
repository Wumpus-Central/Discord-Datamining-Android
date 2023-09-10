package com.discord.media.utils;

import android.content.Context;
import android.net.Uri;
import com.linkedin.android.litr.MediaTransformer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.a;
import kf.s;
import kf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.p;
import qf.c;
import qf.d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J?\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/discord/media/utils/Transcoder;", "", "()V", "cancelCallbacks", "", "", "Lkotlin/Function0;", "", "cancel", "requestId", "convertCompress", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "mediaSource", "Lcom/discord/media/utils/DiscordVideoMediaSource;", "onProgress", "Lkotlin/Function1;", "", "(Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class Transcoder {
    public static final Transcoder INSTANCE = new Transcoder();
    private static final Map<String, Function0<Unit>> cancelCallbacks = new LinkedHashMap();

    private Transcoder() {
    }

    
    public static  Object convertCompress$default(Transcoder transcoder, String str, Context context, DiscordVideoMediaSource discordVideoMediaSource, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = Transcoder$convertCompress$2.INSTANCE;
        }
        return transcoder.convertCompress(str, context, discordVideoMediaSource, function1, continuation);
    }

    public final void cancel(String requestId) {
        q.h(requestId, "requestId");
        Function0<Unit> remove = cancelCallbacks.remove(requestId);
        if (remove != null) {
            remove.invoke();
        }
    }

    public final Object convertCompress(final String str, Context context, final DiscordVideoMediaSource discordVideoMediaSource, final Function1<? super Float, Unit> function1, Continuation<? super Uri> continuation) {
        Continuation c10;
        Object d10;
        c10 = c.c(continuation);
        final p pVar = new p(c10, 1);
        pVar.C();
        final MediaTransformer mediaTransformer = new MediaTransformer(context);
        cancelCallbacks.put(str, new Transcoder$convertCompress$3$1(mediaTransformer, str));
        mediaTransformer.h(str, discordVideoMediaSource.getInputUri(), discordVideoMediaSource.getOutputUri(), discordVideoMediaSource.getVideoFormat(), discordVideoMediaSource.getAudioFormat(), new a() { 
            @Override 
            public void onCancelled(String id2, List<ld.a> list) {
                q.h(id2, "id");
                mediaTransformer.e();
                Transcoder.cancelCallbacks.remove(str);
                if (pVar.a()) {
                    CancellableContinuation.a.a(pVar, null, 1, null);
                }
            }

            @Override 
            public void onCompleted(String id2, List<ld.a> list) {
                q.h(id2, "id");
                mediaTransformer.e();
                function1.invoke(Float.valueOf(1.0f));
                Transcoder.cancelCallbacks.remove(str);
                CancellableContinuation<Uri> cancellableContinuation = pVar;
                s.a aVar = s.f21220k;
                cancellableContinuation.resumeWith(s.b(discordVideoMediaSource.getOutputUri()));
            }

            @Override 
            public void onError(String id2, Throwable th2, List<ld.a> list) {
                q.h(id2, "id");
                mediaTransformer.e();
                Transcoder.cancelCallbacks.remove(str);
                CancellableContinuation<Uri> cancellableContinuation = pVar;
                s.a aVar = s.f21220k;
                if (th2 == null) {
                    th2 = new Throwable("Unknown transcoding error");
                }
                cancellableContinuation.resumeWith(s.b(t.a(th2)));
            }

            @Override 
            public void onProgress(String id2, float f10) {
                q.h(id2, "id");
                function1.invoke(Float.valueOf(f10));
            }

            @Override 
            public void onStarted(String id2) {
                q.h(id2, "id");
                function1.invoke(Float.valueOf(0.0f));
            }
        }, null);
        pVar.l(new Transcoder$convertCompress$3$3(str));
        Object y10 = pVar.y();
        d10 = d.d();
        if (y10 == d10) {
            g.c(continuation);
        }
        return y10;
    }
}
