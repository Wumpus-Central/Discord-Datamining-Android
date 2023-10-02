package com.discord.file_downloader;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;


@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/discord/file_downloader/DownloadState;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.file_downloader.FileDownloader$downloadFile$1", f = "FileDownloader.kt", l = {57, 61, 69, 76, 82}, m = "invokeSuspend")

public final class FileDownloader$downloadFile$1 extends k implements Function2<FlowCollector<? super DownloadState>, Continuation<? super Unit>, Object> {
    final  File $downloadDirectory;
    final  String $fileName;
    final  String $fileUrl;
    final  boolean $logErrors;
    private  Object L$0;
    Object L$1;
    int label;

    
    
    public FileDownloader$downloadFile$1(File file, String str, String str2, boolean z10, Continuation<? super FileDownloader$downloadFile$1> continuation) {
        super(2, continuation);
        this.$downloadDirectory = file;
        this.$fileName = str;
        this.$fileUrl = str2;
        this.$logErrors = z10;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileDownloader$downloadFile$1 fileDownloader$downloadFile$1 = new FileDownloader$downloadFile$1(this.$downloadDirectory, this.$fileName, this.$fileUrl, this.$logErrors, continuation);
        fileDownloader$downloadFile$1.L$0 = obj;
        return fileDownloader$downloadFile$1;
    }

    public final Object invoke(FlowCollector<? super DownloadState> flowCollector, Continuation<? super Unit> continuation) {
        return ((FileDownloader$downloadFile$1) create(flowCollector, continuation)).invokeSuspend(Unit.f21601a);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override 
    
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.file_downloader.FileDownloader$downloadFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
