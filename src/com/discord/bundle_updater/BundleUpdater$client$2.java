package com.discord.bundle_updater;

import android.webkit.CookieManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p307qj.C12231k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class BundleUpdater$client$2 extends AbstractC9973s implements Function0<OkHttpClient> {
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
        return builder.m9911f(new CookieJar() { // from class: com.discord.bundle_updater.BundleUpdater$client$2.1
            @Override // okhttp3.CookieJar
            public List<C12231k> loadForRequest(HttpUrl url) {
                CookieManager cookieManager;
                C9971q.m14633g(url, "url");
                cookieManager = BundleUpdater.this.getCookieManager();
                C9971q.m14634f(cookieManager, "cookieManager");
                return CookieValidatorKt.getCookiesForUrl(cookieManager, url.toString());
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl url, List<C12231k> cookies) {
                CookieManager cookieManager;
                String e0;
                C9971q.m14633g(url, "url");
                C9971q.m14633g(cookies, "cookies");
                cookieManager = BundleUpdater.this.getCookieManager();
                String httpUrl = url.toString();
                e0 = C9914r.m14760e0(cookies, "; ", null, null, 0, null, null, 62, null);
                cookieManager.setCookie(httpUrl, e0);
            }
        }).m9918O(1L, TimeUnit.MINUTES).m9914c();
    }
}
