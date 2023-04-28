package com.discord.media;

import android.net.Uri;
import com.discord.crash_reporting.CrashReporting;
import com.discord.media.utils.MediaResolver;
import com.discord.media.utils.VideoCompressionQuality;
import com.facebook.react.bridge.Promise;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.CoroutineScope;
import nf.C11090s;
import nf.C11093t;
import nf.C11098x;
import p267of.C11289v;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.media.MediaManagerModule$resolveToMediaFilePath$1", m14701f = "MediaManagerModule.kt", m14700l = {75}, m14699m = "invokeSuspend")
/* loaded from: classes5.dex */
final class MediaManagerModule$resolveToMediaFilePath$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $canCancelCompression;
    final /* synthetic */ int $imageCompressionQuality;
    final /* synthetic */ Uri $inputUri;
    final /* synthetic */ boolean $isLowQuality;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $uri;
    final /* synthetic */ VideoCompressionQuality $videoCompressionQuality;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaManagerModule$resolveToMediaFilePath$1(MediaManagerModule mediaManagerModule, Uri uri, int i, VideoCompressionQuality videoCompressionQuality, boolean z, Promise promise, boolean z2, String str, Continuation<? super MediaManagerModule$resolveToMediaFilePath$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaManagerModule;
        this.$inputUri = uri;
        this.$imageCompressionQuality = i;
        this.$videoCompressionQuality = videoCompressionQuality;
        this.$isLowQuality = z;
        this.$promise = promise;
        this.$canCancelCompression = z2;
        this.$uri = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaManagerModule$resolveToMediaFilePath$1 mediaManagerModule$resolveToMediaFilePath$1 = new MediaManagerModule$resolveToMediaFilePath$1(this.this$0, this.$inputUri, this.$imageCompressionQuality, this.$videoCompressionQuality, this.$isLowQuality, this.$promise, this.$canCancelCompression, this.$uri, continuation);
        mediaManagerModule$resolveToMediaFilePath$1.L$0 = obj;
        return mediaManagerModule$resolveToMediaFilePath$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaManagerModule$resolveToMediaFilePath$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object obj2;
        MediaResolver mediaResolver;
        Map k;
        Object obj3;
        Promise promise;
        MediaResolver mediaResolver2;
        boolean z;
        d = C13080d.m4646d();
        int i = this.label;
        try {
            if (i == 0) {
                C11093t.m10930b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                MediaManagerModule mediaManagerModule = this.this$0;
                Uri inputUri = this.$inputUri;
                int i2 = this.$imageCompressionQuality;
                VideoCompressionQuality videoCompressionQuality = this.$videoCompressionQuality;
                boolean z2 = this.$isLowQuality;
                Promise promise2 = this.$promise;
                C11090s.C11091a aVar = C11090s.f24606l;
                mediaResolver2 = mediaManagerModule.mediaResolver;
                C9971q.m14634f(inputUri, "inputUri");
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                this.L$0 = promise2;
                this.label = 1;
                obj3 = mediaResolver2.resolveToUri(inputUri, i2, videoCompressionQuality, z, this);
                if (obj3 == d) {
                    return d;
                }
                promise = promise2;
            } else if (i == 1) {
                promise = (Promise) this.L$0;
                C11093t.m10930b(obj);
                obj3 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            promise.resolve(((Uri) obj3).toString());
            obj2 = C11090s.m10940b(Unit.f22042a);
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj2 = C11090s.m10940b(C11093t.m10931a(th2));
        }
        boolean z3 = this.$canCancelCompression;
        Promise promise3 = this.$promise;
        String str = this.$uri;
        MediaManagerModule mediaManagerModule2 = this.this$0;
        Uri inputUri2 = this.$inputUri;
        Throwable e = C11090s.m10937e(obj2);
        if (e != null) {
            if (e instanceof CancellationException) {
                if (z3) {
                    promise3.reject(e);
                } else {
                    throw e;
                }
            }
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            mediaResolver = mediaManagerModule2.mediaResolver;
            C9971q.m14634f(inputUri2, "inputUri");
            k = C11289v.m10248k(C11098x.m10921a("uri", str), C11098x.m10921a("mimeType", String.valueOf(mediaResolver.getMimeType(inputUri2))));
            CrashReporting.addBreadcrumb$default(crashReporting, "Failed to resolve URI to file", k, null, 4, null);
            crashReporting.captureException(e);
            promise3.reject(e);
        }
        return Unit.f22042a;
    }
}
