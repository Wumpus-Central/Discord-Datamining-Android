package com.discord.file_downloader;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.utils.FilenameSanitizedKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.d;
import ui.x;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007J*\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002J*\u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000eH\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/file_downloader/PublicFileDownloader;", "", "()V", "onDownloadListeners", "", "", "Lkotlin/Function0;", "", "downloadFile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/discord/file_downloader/DownloadState;", "context", "Landroid/content/Context;", "url", "", "fileName", "description", "getFileDownloadRequest", "Landroid/app/DownloadManager$Request;", "kotlin.jvm.PlatformType", "onFileDownloaded", "", "Lkotlinx/coroutines/channels/ProducerScope;", "downloadManager", "Landroid/app/DownloadManager;", "downloadId", "downloadFileName", "PublicFileDownloadBroadcastReceiver", "file_downloader_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PublicFileDownloader {
    public static final PublicFileDownloader INSTANCE = new PublicFileDownloader();
    private static final Map<Long, Function0<Unit>> onDownloadListeners = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/discord/file_downloader/PublicFileDownloader$PublicFileDownloadBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "file_downloader_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PublicFileDownloadBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            q.g(context, "context");
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (str != null && str.hashCode() == 1248865515 && str.equals("android.intent.action.DOWNLOAD_COMPLETE")) {
                Function0 function0 = (Function0) PublicFileDownloader.onDownloadListeners.get(Long.valueOf(intent.getLongExtra("extra_download_id", 0L)));
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    private PublicFileDownloader() {
    }

    public static /* synthetic */ Flow downloadFile$default(PublicFileDownloader publicFileDownloader, Context context, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return publicFileDownloader.downloadFile(context, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DownloadManager.Request getFileDownloadRequest(String str, String str2, String str3) {
        DownloadManager.Request destinationInExternalPublicDir = new DownloadManager.Request(Uri.parse(str)).setTitle(str2).setDescription(str3).setNotificationVisibility(1).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, FilenameSanitizedKt.filenameSanitized(str2));
        destinationInExternalPublicDir.allowScanningByMediaScanner();
        return destinationInExternalPublicDir;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onFileDownloaded(ProducerScope<? super DownloadState> producerScope, DownloadManager downloadManager, long j10, String str) {
        try {
            if (downloadManager.query(new DownloadManager.Query().setFilterById(j10)).moveToFirst()) {
                producerScope.d(new DownloadState.Completed(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str)));
            } else {
                producerScope.d(new DownloadState.Failure(new IllegalStateException(new FileNotFoundException())));
            }
            th = null;
            return x.a.a(producerScope, th, 1, th);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final Flow<DownloadState> downloadFile(Context context, String url, String fileName, String str) {
        q.g(context, "context");
        q.g(url, "url");
        q.g(fileName, "fileName");
        return d.a(new PublicFileDownloader$downloadFile$1(context, url, fileName, str, null));
    }
}
