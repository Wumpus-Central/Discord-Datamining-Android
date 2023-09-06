package com.discord.bundle_updater;

import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.q;
import kotlin.text.p;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"getCookiesForUrl", "", "Lokhttp3/Cookie;", "Landroid/webkit/CookieManager;", "url", "", "bundle_updater_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class CookieValidatorKt {
    public static final List<Cookie> getCookiesForUrl(CookieManager cookieManager, String url) {
        List<String> z02;
        List<Cookie> h10;
        q.h(cookieManager, "<this>");
        q.h(url, "url");
        String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            h10 = j.h();
            return h10;
        }
        z02 = p.z0(cookie, new String[]{"; "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (String str : z02) {
            Cookie c10 = Cookie.f25734n.c(HttpUrl.f25766l.d(url), str);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        return arrayList;
    }
}
