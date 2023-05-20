package com.discord.bundle_updater;

import android.webkit.CookieManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import mk.k;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundleUpdater$client$2 extends s implements Function0<OkHttpClient> {
    final /* synthetic */ BundleUpdater this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdater$client$2(BundleUpdater bundleUpdater) {
        super(0);
        this.this$0 = bundleUpdater;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OkHttpClient invoke() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        final BundleUpdater bundleUpdater = this.this$0;
        return builder.f(new CookieJar() { // from class: com.discord.bundle_updater.BundleUpdater$client$2.1
            @Override // okhttp3.CookieJar
            public List<k> loadForRequest(HttpUrl url) {
                CookieManager cookieManager;
                q.g(url, "url");
                cookieManager = BundleUpdater.this.getCookieManager();
                q.f(cookieManager, "cookieManager");
                return CookieValidatorKt.getCookiesForUrl(cookieManager, url.toString());
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl url, List<k> cookies) {
                CookieManager cookieManager;
                String e02;
                q.g(url, "url");
                q.g(cookies, "cookies");
                cookieManager = BundleUpdater.this.getCookieManager();
                String httpUrl = url.toString();
                e02 = r.e0(cookies, "; ", null, null, 0, null, null, 62, null);
                cookieManager.setCookie(httpUrl, e02);
            }
        }).O(1L, TimeUnit.MINUTES).c();
    }
}
