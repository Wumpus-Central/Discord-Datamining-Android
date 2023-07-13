package com.discord.media;

import android.webkit.URLUtil;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.PublicFileDownloader;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import ff.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lf.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.media.MediaManagerModule$downloadMediaAsset$1", f = "MediaManagerModule.kt", l = {109}, m = "invokeSuspend")

final class MediaManagerModule$downloadMediaAsset$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  Promise $promise;
    final  String $uri;
    int label;
    final  MediaManagerModule this$0;

    
    
    public MediaManagerModule$downloadMediaAsset$1(MediaManagerModule mediaManagerModule, String str, Promise promise, Continuation<? super MediaManagerModule$downloadMediaAsset$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaManagerModule;
        this.$uri = str;
        this.$promise = promise;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaManagerModule$downloadMediaAsset$1(this.this$0, this.$uri, this.$promise, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaManagerModule$downloadMediaAsset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20663a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ReactApplicationContext reactApplicationContext;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            PublicFileDownloader publicFileDownloader = PublicFileDownloader.INSTANCE;
            reactApplicationContext = this.this$0.getReactApplicationContext();
            q.f(reactApplicationContext, "reactApplicationContext");
            String str = this.$uri;
            String guessFileName = URLUtil.guessFileName(str, null, null);
            q.f(guessFileName, "guessFileName(uri, null, null)");
            Flow downloadFile$default = PublicFileDownloader.downloadFile$default(publicFileDownloader, reactApplicationContext, str, guessFileName, null, 8, null);
            final Promise promise = this.$promise;
            FlowCollector flowCollector = new FlowCollector() { 
                @Override 
                public   Object emit(Object obj2, Continuation continuation) {
                    return emit((DownloadState) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(DownloadState downloadState, Continuation<? super Unit> continuation) {
                    if (downloadState instanceof DownloadState.Completed) {
                        Promise.this.resolve(b.a(true));
                    } else if (downloadState instanceof DownloadState.Failure) {
                        Promise.this.reject(new IllegalStateException("Unable to download asset."));
                    } else {
                        boolean z10 = downloadState instanceof DownloadState.InProgress;
                    }
                    return Unit.f20663a;
                }
            };
            this.label = 1;
            if (downloadFile$default.collect(flowCollector, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f20663a;
    }
}
