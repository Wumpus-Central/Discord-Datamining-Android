package com.discord.file_downloader;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.coroutines.flow.C9748d;
import kotlinx.coroutines.flow.Flow;
import nf.C10839n;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p268of.C11053v;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004J:\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, m15073d2 = {"Lcom/discord/file_downloader/FileDownloader;", "", "()V", "defaultClient", "Lokhttp3/OkHttpClient;", "getDefaultClient", "()Lokhttp3/OkHttpClient;", "defaultClient$delegate", "Lkotlin/Lazy;", "downloadBlob", "Lokhttp3/Response;", "fileUrl", "", "headers", "", "client", "downloadFile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/discord/file_downloader/DownloadState;", "context", "Landroid/content/Context;", "fileName", "downloadDirectory", "Ljava/io/File;", "logErrors", "", "file_downloader_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class FileDownloader {
    public static final FileDownloader INSTANCE = new FileDownloader();
    private static final Lazy defaultClient$delegate;

    static {
        Lazy a;
        a = C10839n.m10945a(FileDownloader$defaultClient$2.INSTANCE);
        defaultClient$delegate = a;
    }

    private FileDownloader() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response downloadBlob$default(FileDownloader fileDownloader, String str, Map map, OkHttpClient okHttpClient, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C11053v.m10251h();
        }
        if ((i & 4) != 0) {
            okHttpClient = fileDownloader.getDefaultClient();
        }
        return fileDownloader.downloadBlob(str, map, okHttpClient);
    }

    public static /* synthetic */ Flow downloadFile$default(FileDownloader fileDownloader, Context context, String str, String str2, File file, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            file = context.getCacheDir();
            C9677q.m14634f(file, "context.cacheDir");
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return fileDownloader.downloadFile(context, str, str2, file, z);
    }

    private final OkHttpClient getDefaultClient() {
        return (OkHttpClient) defaultClient$delegate.getValue();
    }

    public final Response downloadBlob(String fileUrl, Map<String, String> headers, OkHttpClient client) {
        C9677q.m14633g(fileUrl, "fileUrl");
        C9677q.m14633g(headers, "headers");
        C9677q.m14633g(client, "client");
        Request.Builder builder = new Request.Builder();
        Iterator<T> it = headers.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.m9876a((String) entry.getKey(), (String) entry.getValue());
        }
        return client.mo9954a(builder.m9865l(fileUrl).m9875b()).execute();
    }

    public final Flow<DownloadState> downloadFile(Context context, String fileUrl, String fileName, File downloadDirectory, boolean z) {
        C9677q.m14633g(context, "context");
        C9677q.m14633g(fileUrl, "fileUrl");
        C9677q.m14633g(fileName, "fileName");
        C9677q.m14633g(downloadDirectory, "downloadDirectory");
        return C9748d.m14428e(new FileDownloader$downloadFile$1(downloadDirectory, fileName, fileUrl, z, null));
    }
}
