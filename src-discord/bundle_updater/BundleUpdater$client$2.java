package com.discord.bundle_updater;

import android.webkit.CookieManager;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class BundleUpdater$client$2 extends s implements Function0<OkHttpClient> {
    final  BundleUpdater this$0;

    
    
    public BundleUpdater$client$2(BundleUpdater bundleUpdater) {
        super(0);
        this.this$0 = bundleUpdater;
    }

    @Override 
    public final OkHttpClient invoke() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        final BundleUpdater bundleUpdater = this.this$0;
        OkHttpClient.Builder O = builder.f(new CookieJar() { 
            @Override 
            public List<Cookie> loadForRequest(HttpUrl url) {
                CookieManager cookieManager;
                List<Cookie> E0;
                q.h(url, "url");
                cookieManager = BundleUpdater.this.getCookieManager();
                q.g(cookieManager, "cookieManager");
                List<Cookie> cookiesForUrl = CookieValidatorKt.getCookiesForUrl(cookieManager, url.toString());
                ArrayList arrayList = new ArrayList();
                for (Object obj : cookiesForUrl) {
                    if (!q.c(((Cookie) obj).e(), "buildOverride")) {
                        arrayList.add(obj);
                    }
                }
                E0 = r.E0(arrayList);
                Cookie buildOverrideCookie = BundleUpdater.this.getBuildOverrideCookie();
                if (buildOverrideCookie != null) {
                    E0.add(buildOverrideCookie);
                }
                return E0;
            }

            @Override 
            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                CookieManager cookieManager;
                String d02;
                q.h(url, "url");
                q.h(cookies, "cookies");
                cookieManager = BundleUpdater.this.getCookieManager();
                String httpUrl = url.toString();
                d02 = r.d0(cookies, "; ", null, null, 0, null, null, 62, null);
                cookieManager.setCookie(httpUrl, d02);
            }
        }).O(1L, TimeUnit.MINUTES);
        final DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
        return O.a(new Interceptor() { 
            @Override 
            public final Response intercept(Interceptor.Chain chain) {
                q.h(chain, "chain");
                return DeviceResourceUsageRecorder.Companion.this.bundleUpdaterInterceptor(chain);
            }
        }).c();
    }
}
