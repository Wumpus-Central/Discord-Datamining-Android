package com.discord.file_downloader;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import okhttp3.OkHttpClient;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class FileDownloader$defaultClient$2 extends AbstractC9679s implements Function0<OkHttpClient> {
    public static final FileDownloader$defaultClient$2 INSTANCE = new FileDownloader$defaultClient$2();

    FileDownloader$defaultClient$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final OkHttpClient invoke() {
        return new OkHttpClient.Builder().m9914c();
    }
}
