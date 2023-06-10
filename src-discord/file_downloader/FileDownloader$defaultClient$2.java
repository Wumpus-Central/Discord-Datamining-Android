package com.discord.file_downloader;

import com.discord.resource_usage.DeviceResourceUsageRecorder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FileDownloader$defaultClient$2 extends s implements Function0<OkHttpClient> {
    public static final FileDownloader$defaultClient$2 INSTANCE = new FileDownloader$defaultClient$2();

    FileDownloader$defaultClient$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final OkHttpClient invoke() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        final DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
        return builder.a(new Interceptor() { // from class: com.discord.file_downloader.FileDownloader$defaultClient$2$invoke$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                q.g(chain, "chain");
                return DeviceResourceUsageRecorder.Companion.this.downloadInterceptor(chain);
            }
        }).c();
    }
}
