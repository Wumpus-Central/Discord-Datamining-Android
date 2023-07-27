package com.discord.media;

import android.net.Uri;
import com.discord.crash_reporting.CrashReporting;
import com.discord.media.utils.MediaResolver;
import com.discord.media.utils.VideoCompressionQuality;
import com.facebook.react.bridge.Promise;
import ff.s;
import ff.t;
import ff.x;
import gf.v;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import lf.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.media.MediaManagerModule$resolveToMediaFilePath$1", f = "MediaManagerModule.kt", l = {75}, m = "invokeSuspend")

final class MediaManagerModule$resolveToMediaFilePath$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  boolean $canCancelCompression;
    final  int $imageCompressionQuality;
    final  Uri $inputUri;
    final  boolean $isLowQuality;
    final  Promise $promise;
    final  String $uri;
    final  VideoCompressionQuality $videoCompressionQuality;
    private  Object L$0;
    int label;
    final  MediaManagerModule this$0;

    
    
    public MediaManagerModule$resolveToMediaFilePath$1(MediaManagerModule mediaManagerModule, Uri uri, int i10, VideoCompressionQuality videoCompressionQuality, boolean z10, Promise promise, boolean z11, String str, Continuation<? super MediaManagerModule$resolveToMediaFilePath$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaManagerModule;
        this.$inputUri = uri;
        this.$imageCompressionQuality = i10;
        this.$videoCompressionQuality = videoCompressionQuality;
        this.$isLowQuality = z10;
        this.$promise = promise;
        this.$canCancelCompression = z11;
        this.$uri = str;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaManagerModule$resolveToMediaFilePath$1 mediaManagerModule$resolveToMediaFilePath$1 = new MediaManagerModule$resolveToMediaFilePath$1(this.this$0, this.$inputUri, this.$imageCompressionQuality, this.$videoCompressionQuality, this.$isLowQuality, this.$promise, this.$canCancelCompression, this.$uri, continuation);
        mediaManagerModule$resolveToMediaFilePath$1.L$0 = obj;
        return mediaManagerModule$resolveToMediaFilePath$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaManagerModule$resolveToMediaFilePath$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20670a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Object obj2;
        MediaResolver mediaResolver;
        Map k10;
        Object obj3;
        Promise promise;
        MediaResolver mediaResolver2;
        boolean z10;
        d10 = d.d();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                MediaManagerModule mediaManagerModule = this.this$0;
                Uri inputUri = this.$inputUri;
                int i11 = this.$imageCompressionQuality;
                VideoCompressionQuality videoCompressionQuality = this.$videoCompressionQuality;
                boolean z11 = this.$isLowQuality;
                Promise promise2 = this.$promise;
                s.a aVar = s.f14778l;
                mediaResolver2 = mediaManagerModule.mediaResolver;
                q.f(inputUri, "inputUri");
                if (z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.L$0 = promise2;
                this.label = 1;
                obj3 = mediaResolver2.resolveToUri(inputUri, i11, videoCompressionQuality, z10, this);
                if (obj3 == d10) {
                    return d10;
                }
                promise = promise2;
            } else if (i10 == 1) {
                promise = (Promise) this.L$0;
                t.b(obj);
                obj3 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            promise.resolve(((Uri) obj3).toString());
            obj2 = s.b(Unit.f20670a);
        } catch (Throwable th2) {
            s.a aVar2 = s.f14778l;
            obj2 = s.b(t.a(th2));
        }
        boolean z12 = this.$canCancelCompression;
        Promise promise3 = this.$promise;
        String str = this.$uri;
        MediaManagerModule mediaManagerModule2 = this.this$0;
        Uri inputUri2 = this.$inputUri;
        Throwable e10 = s.e(obj2);
        if (e10 != null) {
            if (e10 instanceof CancellationException) {
                if (z12) {
                    promise3.reject(e10);
                } else {
                    throw e10;
                }
            }
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            mediaResolver = mediaManagerModule2.mediaResolver;
            q.f(inputUri2, "inputUri");
            k10 = v.k(x.a("uri", str), x.a("mimeType", String.valueOf(mediaResolver.getMimeType(inputUri2))));
            CrashReporting.addBreadcrumb$default(crashReporting, "Failed to resolve URI to file", k10, null, 4, null);
            crashReporting.captureException(e10);
            promise3.reject(e10);
        }
        return Unit.f20670a;
    }
}
