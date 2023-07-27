package com.discord.file_downloader;

import android.app.DownloadManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.channels.ProducerScope;


@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/discord/file_downloader/DownloadState;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.file_downloader.PublicFileDownloader$downloadFile$1", f = "PublicFileDownloader.kt", l = {29, 37, 62}, m = "invokeSuspend")

public final class PublicFileDownloader$downloadFile$1 extends k implements Function2<ProducerScope<? super DownloadState>, Continuation<? super Unit>, Object> {
    final  Context $context;
    final  String $description;
    final  String $fileName;
    final  String $url;
    private  Object L$0;
    Object L$1;
    int label;

    
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    
    
    public static final class AnonymousClass1 extends s implements Function0<Unit> {
        final  ProducerScope<DownloadState> $$this$callbackFlow;
        final  Ref$LongRef $downloadId;
        final  String $fileName;
        final  DownloadManager $manager;

        
        
        AnonymousClass1(Ref$LongRef ref$LongRef, ProducerScope<? super DownloadState> producerScope, DownloadManager downloadManager, String str) {
            super(0);
            this.$downloadId = ref$LongRef;
            this.$$this$callbackFlow = producerScope;
            this.$manager = downloadManager;
            this.$fileName = str;
        }

        @Override 
        
        public final void invoke2() {
            PublicFileDownloader.onDownloadListeners.remove(Long.valueOf(this.$downloadId.f20696k));
            PublicFileDownloader.INSTANCE.onFileDownloaded(this.$$this$callbackFlow, this.$manager, this.$downloadId.f20696k, this.$fileName);
        }
    }

    
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    
    
    public static final class AnonymousClass2 extends s implements Function0<Unit> {
        final  Ref$LongRef $downloadId;

        
        AnonymousClass2(Ref$LongRef ref$LongRef) {
            super(0);
            this.$downloadId = ref$LongRef;
        }

        @Override 
        
        public final void invoke2() {
            PublicFileDownloader.onDownloadListeners.remove(Long.valueOf(this.$downloadId.f20696k));
        }
    }

    
    
    public PublicFileDownloader$downloadFile$1(Context context, String str, String str2, String str3, Continuation<? super PublicFileDownloader$downloadFile$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$url = str;
        this.$fileName = str2;
        this.$description = str3;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PublicFileDownloader$downloadFile$1 publicFileDownloader$downloadFile$1 = new PublicFileDownloader$downloadFile$1(this.$context, this.$url, this.$fileName, this.$description, continuation);
        publicFileDownloader$downloadFile$1.L$0 = obj;
        return publicFileDownloader$downloadFile$1;
    }

    public final Object invoke(ProducerScope<? super DownloadState> producerScope, Continuation<? super Unit> continuation) {
        return ((PublicFileDownloader$downloadFile$1) create(producerScope, continuation)).invokeSuspend(Unit.f20670a);
    }

    
    
    
    
    
    
    @Override 
    
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.file_downloader.PublicFileDownloader$downloadFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
