package com.discord.media.utils;

import android.content.Context;
import android.net.Uri;
import com.linkedin.android.litr.MediaTransformer;
import ge.AbstractC7580a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10156p;
import kotlinx.coroutines.CancellableContinuation;
import nf.C11090s;
import nf.C11093t;
import p138he.C8008a;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J?\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m15073d2 = {"Lcom/discord/media/utils/Transcoder;", "", "()V", "cancelCallbacks", "", "", "Lkotlin/Function0;", "", "cancel", "requestId", "convertCompress", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "mediaSource", "Lcom/discord/media/utils/DiscordVideoMediaSource;", "onProgress", "Lkotlin/Function1;", "", "(Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class Transcoder {
    public static final Transcoder INSTANCE = new Transcoder();
    private static final Map<String, Function0<Unit>> cancelCallbacks = new LinkedHashMap();

    private Transcoder() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object convertCompress$default(Transcoder transcoder, String str, Context context, DiscordVideoMediaSource discordVideoMediaSource, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = Transcoder$convertCompress$2.INSTANCE;
        }
        return transcoder.convertCompress(str, context, discordVideoMediaSource, function1, continuation);
    }

    public final void cancel(String requestId) {
        C9971q.m14633g(requestId, "requestId");
        Function0<Unit> remove = cancelCallbacks.remove(requestId);
        if (remove != null) {
            remove.invoke();
        }
    }

    public final Object convertCompress(final String str, Context context, final DiscordVideoMediaSource discordVideoMediaSource, final Function1<? super Float, Unit> function1, Continuation<? super Uri> continuation) {
        Continuation c;
        Object d;
        c = C13076c.m4647c(continuation);
        final C10156p pVar = new C10156p(c, 1);
        pVar.m14150C();
        final MediaTransformer mediaTransformer = new MediaTransformer(context);
        cancelCallbacks.put(str, new Transcoder$convertCompress$3$1(mediaTransformer, str));
        mediaTransformer.m26471h(str, discordVideoMediaSource.getInputUri(), discordVideoMediaSource.getOutputUri(), discordVideoMediaSource.getVideoFormat(), discordVideoMediaSource.getAudioFormat(), new AbstractC7580a() { // from class: com.discord.media.utils.Transcoder$convertCompress$3$2
            @Override // ge.AbstractC7580a
            public void onCancelled(String id2, List<C8008a> list) {
                C9971q.m14633g(id2, "id");
                mediaTransformer.m26474e();
                Transcoder.cancelCallbacks.remove(str);
                if (pVar.mo14135b()) {
                    CancellableContinuation.C9994a.m14574a(pVar, null, 1, null);
                }
            }

            @Override // ge.AbstractC7580a
            public void onCompleted(String id2, List<C8008a> list) {
                C9971q.m14633g(id2, "id");
                mediaTransformer.m26474e();
                function1.invoke(Float.valueOf(1.0f));
                Transcoder.cancelCallbacks.remove(str);
                CancellableContinuation<Uri> cancellableContinuation = pVar;
                C11090s.C11091a aVar = C11090s.f24606l;
                cancellableContinuation.resumeWith(C11090s.m10940b(discordVideoMediaSource.getOutputUri()));
            }

            @Override // ge.AbstractC7580a
            public void onError(String id2, Throwable th2, List<C8008a> list) {
                C9971q.m14633g(id2, "id");
                mediaTransformer.m26474e();
                Transcoder.cancelCallbacks.remove(str);
                CancellableContinuation<Uri> cancellableContinuation = pVar;
                C11090s.C11091a aVar = C11090s.f24606l;
                if (th2 == null) {
                    th2 = new Throwable("Unknown transcoding error");
                }
                cancellableContinuation.resumeWith(C11090s.m10940b(C11093t.m10931a(th2)));
            }

            @Override // ge.AbstractC7580a
            public void onProgress(String id2, float f) {
                C9971q.m14633g(id2, "id");
                function1.invoke(Float.valueOf(f));
            }

            @Override // ge.AbstractC7580a
            public void onStarted(String id2) {
                C9971q.m14633g(id2, "id");
                function1.invoke(Float.valueOf(0.0f));
            }
        }, null);
        pVar.mo14131k(new Transcoder$convertCompress$3$3(str));
        Object y = pVar.m14117y();
        d = C13080d.m4646d();
        if (y == d) {
            C9933g.m14691c(continuation);
        }
        return y;
    }
}
