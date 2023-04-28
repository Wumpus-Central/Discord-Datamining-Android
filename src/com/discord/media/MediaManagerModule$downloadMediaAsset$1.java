package com.discord.media;

import android.webkit.URLUtil;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.PublicFileDownloader;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.coroutines.jvm.internal.C9633b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C10848t;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.media.MediaManagerModule$downloadMediaAsset$1", m14701f = "MediaManagerModule.kt", m14700l = {109}, m14699m = "invokeSuspend")
/* loaded from: classes5.dex */
final class MediaManagerModule$downloadMediaAsset$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $uri;
    int label;
    final /* synthetic */ MediaManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaManagerModule$downloadMediaAsset$1(MediaManagerModule mediaManagerModule, String str, Promise promise, Continuation<? super MediaManagerModule$downloadMediaAsset$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaManagerModule;
        this.$uri = str;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaManagerModule$downloadMediaAsset$1(this.this$0, this.$uri, this.$promise, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaManagerModule$downloadMediaAsset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        ReactApplicationContext reactApplicationContext;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            PublicFileDownloader publicFileDownloader = PublicFileDownloader.INSTANCE;
            reactApplicationContext = this.this$0.getReactApplicationContext();
            C9677q.m14634f(reactApplicationContext, "reactApplicationContext");
            String str = this.$uri;
            String guessFileName = URLUtil.guessFileName(str, null, null);
            C9677q.m14634f(guessFileName, "guessFileName(uri, null, null)");
            Flow downloadFile$default = PublicFileDownloader.downloadFile$default(publicFileDownloader, reactApplicationContext, str, guessFileName, null, 8, null);
            final Promise promise = this.$promise;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.media.MediaManagerModule$downloadMediaAsset$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((DownloadState) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(DownloadState downloadState, Continuation<? super Unit> continuation) {
                    if (downloadState instanceof DownloadState.Completed) {
                        Promise.this.resolve(C9633b.m14706a(true));
                    } else if (downloadState instanceof DownloadState.Failure) {
                        Promise.this.reject(new IllegalStateException("Unable to download asset."));
                    } else {
                        boolean z = downloadState instanceof DownloadState.InProgress;
                    }
                    return Unit.f25780a;
                }
            };
            this.label = 1;
            if (downloadFile$default.collect(flowCollector, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f25780a;
    }
}
