package com.discord.file_downloader;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/discord/file_downloader/DownloadState;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.file_downloader.FileDownloader$downloadFile$1", f = "FileDownloader.kt", l = {57, 61, 69, 76, 82}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class FileDownloader$downloadFile$1 extends k implements Function2<FlowCollector<? super DownloadState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $downloadDirectory;
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $fileUrl;
    final /* synthetic */ boolean $logErrors;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDownloader$downloadFile$1(File file, String str, String str2, boolean z10, Continuation<? super FileDownloader$downloadFile$1> continuation) {
        super(2, continuation);
        this.$downloadDirectory = file;
        this.$fileName = str;
        this.$fileUrl = str2;
        this.$logErrors = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileDownloader$downloadFile$1 fileDownloader$downloadFile$1 = new FileDownloader$downloadFile$1(this.$downloadDirectory, this.$fileName, this.$fileUrl, this.$logErrors, continuation);
        fileDownloader$downloadFile$1.L$0 = obj;
        return fileDownloader$downloadFile$1;
    }

    public final Object invoke(FlowCollector<? super DownloadState> flowCollector, Continuation<? super Unit> continuation) {
        return ((FileDownloader$downloadFile$1) create(flowCollector, continuation)).invokeSuspend(Unit.f20685a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
        if (r0 != null) goto L_0x010b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013b, code lost:
        if (r0 == null) goto L_0x013e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        return kotlin.Unit.f20685a;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0119: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:60:0x0119 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[Catch: all -> 0x0118, Exception -> 0x011b, TryCatch #3 {Exception -> 0x011b, blocks: (B:38:0x00a4, B:40:0x00b8, B:44:0x00d3, B:46:0x00f0, B:57:0x0114, B:58:0x0117), top: B:82:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3 A[Catch: all -> 0x0118, Exception -> 0x011b, TRY_LEAVE, TryCatch #3 {Exception -> 0x011b, blocks: (B:38:0x00a4, B:40:0x00b8, B:44:0x00d3, B:46:0x00f0, B:57:0x0114, B:58:0x0117), top: B:82:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0121 A[Catch: all -> 0x0118, TryCatch #4 {all -> 0x0118, blocks: (B:38:0x00a4, B:40:0x00b8, B:44:0x00d3, B:46:0x00f0, B:57:0x0114, B:58:0x0117, B:63:0x011d, B:65:0x0121, B:66:0x0124), top: B:83:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, okhttp3.ResponseBody] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.file_downloader.FileDownloader$downloadFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
