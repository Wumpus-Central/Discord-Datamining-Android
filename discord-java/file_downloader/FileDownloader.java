package com.discord.file_downloader;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.d;
import nf.n;
import of.v;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004J:\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/discord/file_downloader/FileDownloader;", "", "()V", "defaultClient", "Lokhttp3/OkHttpClient;", "getDefaultClient", "()Lokhttp3/OkHttpClient;", "defaultClient$delegate", "Lkotlin/Lazy;", "downloadBlob", "Lokhttp3/Response;", "fileUrl", "", "headers", "", "client", "downloadFile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/discord/file_downloader/DownloadState;", "context", "Landroid/content/Context;", "fileName", "downloadDirectory", "Ljava/io/File;", "logErrors", "", "file_downloader_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileDownloader {
    public static final FileDownloader INSTANCE = new FileDownloader();
    private static final Lazy defaultClient$delegate;

    static {
        Lazy a10;
        a10 = n.a(FileDownloader$defaultClient$2.INSTANCE);
        defaultClient$delegate = a10;
    }

    private FileDownloader() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response downloadBlob$default(FileDownloader fileDownloader, String str, Map map, OkHttpClient okHttpClient, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = v.h();
        }
        if ((i10 & 4) != 0) {
            okHttpClient = fileDownloader.getDefaultClient();
        }
        return fileDownloader.downloadBlob(str, map, okHttpClient);
    }

    public static /* synthetic */ Flow downloadFile$default(FileDownloader fileDownloader, Context context, String str, String str2, File file, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            file = context.getCacheDir();
            q.f(file, "context.cacheDir");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return fileDownloader.downloadFile(context, str, str2, file, z10);
    }

    private final OkHttpClient getDefaultClient() {
        return (OkHttpClient) defaultClient$delegate.getValue();
    }

    public final Response downloadBlob(String fileUrl, Map<String, String> headers, OkHttpClient client) {
        q.g(fileUrl, "fileUrl");
        q.g(headers, "headers");
        q.g(client, "client");
        Request.Builder builder = new Request.Builder();
        Iterator<T> it = headers.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        return client.a(builder.l(fileUrl).b()).execute();
    }

    public final Flow<DownloadState> downloadFile(Context context, String fileUrl, String fileName, File downloadDirectory, boolean z10) {
        q.g(context, "context");
        q.g(fileUrl, "fileUrl");
        q.g(fileName, "fileName");
        q.g(downloadDirectory, "downloadDirectory");
        return d.e(new FileDownloader$downloadFile$1(downloadDirectory, fileName, fileUrl, z10, null));
    }
}
