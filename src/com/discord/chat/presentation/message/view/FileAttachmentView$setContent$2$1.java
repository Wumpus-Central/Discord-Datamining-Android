package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.widget.ProgressBar;
import com.discord.chat.databinding.FileAttachmentViewBinding;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.PublicFileDownloader;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10129j;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C11093t;
import tf.C13080d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1", m14701f = "FileAttachmentView.kt", m14700l = {94}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FileAttachmentView$setContent$2$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $attachmentDescription;
    final /* synthetic */ String $attachmentName;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ FileAttachmentView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAttachmentView$setContent$2$1(FileAttachmentView fileAttachmentView, String str, String str2, String str3, Continuation<? super FileAttachmentView$setContent$2$1> continuation) {
        super(2, continuation);
        this.this$0 = fileAttachmentView;
        this.$url = str;
        this.$attachmentName = str2;
        this.$attachmentDescription = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileAttachmentView$setContent$2$1(this.this$0, this.$url, this.$attachmentName, this.$attachmentDescription, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileAttachmentView$setContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C13080d.m4646d();
        int i = this.label;
        if (i == 0) {
            C11093t.m10930b(obj);
            PublicFileDownloader publicFileDownloader = PublicFileDownloader.INSTANCE;
            Context context = this.this$0.getContext();
            C9971q.m14634f(context, "context");
            Flow<DownloadState> downloadFile = publicFileDownloader.downloadFile(context, this.$url, this.$attachmentName, this.$attachmentDescription);
            final FileAttachmentView fileAttachmentView = this.this$0;
            FlowCollector<? super DownloadState> flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1.1

                /* JADX INFO: Access modifiers changed from: package-private */
                @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
                @AbstractC9931e(m14702c = "com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1$1$1", m14701f = "FileAttachmentView.kt", m14700l = {}, m14699m = "invokeSuspend")
                /* renamed from: com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1$1$1 */
                /* loaded from: classes4.dex */
                public static final class C01051 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ DownloadState $downloadState;
                    int label;
                    final /* synthetic */ FileAttachmentView this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01051(DownloadState downloadState, FileAttachmentView fileAttachmentView, Continuation<? super C01051> continuation) {
                        super(2, continuation);
                        this.$downloadState = downloadState;
                        this.this$0 = fileAttachmentView;
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C01051(this.$downloadState, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C01051) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
                    public final Object invokeSuspend(Object obj) {
                        FileAttachmentViewBinding fileAttachmentViewBinding;
                        int i;
                        FileAttachmentViewBinding fileAttachmentViewBinding2;
                        C13080d.m4646d();
                        if (this.label == 0) {
                            C11093t.m10930b(obj);
                            boolean z = this.$downloadState instanceof DownloadState.InProgress;
                            fileAttachmentViewBinding = this.this$0.binding;
                            ProgressBar progressBar = fileAttachmentViewBinding.fileAttachmentDownloadProgressBar;
                            C9971q.m14634f(progressBar, "binding.fileAttachmentDownloadProgressBar");
                            int i2 = 0;
                            if (z) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            progressBar.setVisibility(i);
                            fileAttachmentViewBinding2 = this.this$0.binding;
                            SimpleDraweeView simpleDraweeView = fileAttachmentViewBinding2.fileAttachmentDownload;
                            C9971q.m14634f(simpleDraweeView, "binding.fileAttachmentDownload");
                            if (!(!z)) {
                                i2 = 8;
                            }
                            simpleDraweeView.setVisibility(i2);
                            return Unit.f22042a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((DownloadState) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(DownloadState downloadState, Continuation<? super Unit> continuation) {
                    Object d2;
                    Object g = C10129j.m14192g(C10230y0.m13945c(), new C01051(downloadState, FileAttachmentView.this, null), continuation);
                    d2 = C13080d.m4646d();
                    return g == d2 ? g : Unit.f22042a;
                }
            };
            this.label = 1;
            if (downloadFile.collect(flowCollector, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C11093t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f22042a;
    }
}
