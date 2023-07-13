package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.widget.ProgressBar;
import com.discord.chat.databinding.FileAttachmentViewBinding;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.PublicFileDownloader;
import com.facebook.drawee.view.SimpleDraweeView;
import ff.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.j;
import kotlinx.coroutines.y0;
import lf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1", f = "FileAttachmentView.kt", l = {94}, m = "invokeSuspend")

public final class FileAttachmentView$setContent$2$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  String $attachmentDescription;
    final  String $attachmentName;
    final  String $url;
    int label;
    final  FileAttachmentView this$0;

    
    
    public FileAttachmentView$setContent$2$1(FileAttachmentView fileAttachmentView, String str, String str2, String str3, Continuation<? super FileAttachmentView$setContent$2$1> continuation) {
        super(2, continuation);
        this.this$0 = fileAttachmentView;
        this.$url = str;
        this.$attachmentName = str2;
        this.$attachmentDescription = str3;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileAttachmentView$setContent$2$1(this.this$0, this.$url, this.$attachmentName, this.$attachmentDescription, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileAttachmentView$setContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20663a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            PublicFileDownloader publicFileDownloader = PublicFileDownloader.INSTANCE;
            Context context = this.this$0.getContext();
            q.f(context, "context");
            Flow<DownloadState> downloadFile = publicFileDownloader.downloadFile(context, this.$url, this.$attachmentName, this.$attachmentDescription);
            final FileAttachmentView fileAttachmentView = this.this$0;
            FlowCollector<? super DownloadState> flowCollector = new FlowCollector() { 

                
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @e(c = "com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1$1$1", f = "FileAttachmentView.kt", l = {}, m = "invokeSuspend")
                
                
                public static final class C01031 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final  DownloadState $downloadState;
                    int label;
                    final  FileAttachmentView this$0;

                    
                    C01031(DownloadState downloadState, FileAttachmentView fileAttachmentView, Continuation<? super C01031> continuation) {
                        super(2, continuation);
                        this.$downloadState = downloadState;
                        this.this$0 = fileAttachmentView;
                    }

                    @Override 
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C01031(this.$downloadState, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C01031) create(coroutineScope, continuation)).invokeSuspend(Unit.f20663a);
                    }

                    @Override 
                    public final Object invokeSuspend(Object obj) {
                        FileAttachmentViewBinding fileAttachmentViewBinding;
                        int i10;
                        FileAttachmentViewBinding fileAttachmentViewBinding2;
                        d.d();
                        if (this.label == 0) {
                            t.b(obj);
                            boolean z10 = this.$downloadState instanceof DownloadState.InProgress;
                            fileAttachmentViewBinding = this.this$0.binding;
                            ProgressBar progressBar = fileAttachmentViewBinding.fileAttachmentDownloadProgressBar;
                            q.f(progressBar, "binding.fileAttachmentDownloadProgressBar");
                            int i11 = 0;
                            if (z10) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            progressBar.setVisibility(i10);
                            fileAttachmentViewBinding2 = this.this$0.binding;
                            SimpleDraweeView simpleDraweeView = fileAttachmentViewBinding2.fileAttachmentDownload;
                            q.f(simpleDraweeView, "binding.fileAttachmentDownload");
                            if (!(!z10)) {
                                i11 = 8;
                            }
                            simpleDraweeView.setVisibility(i11);
                            return Unit.f20663a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override 
                public   Object emit(Object obj2, Continuation continuation) {
                    return emit((DownloadState) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(DownloadState downloadState, Continuation<? super Unit> continuation) {
                    Object d11;
                    Object g10 = j.g(y0.c(), new C01031(downloadState, FileAttachmentView.this, null), continuation);
                    d11 = d.d();
                    return g10 == d11 ? g10 : Unit.f20663a;
                }
            };
            this.label = 1;
            if (downloadFile.collect(flowCollector, this) == d10) {
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
