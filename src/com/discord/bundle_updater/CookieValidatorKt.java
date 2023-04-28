package com.discord.bundle_updater;

import android.webkit.CookieManager;
import eg.C6322j;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9610j;
import kotlin.collections.C9618r;
import kotlin.jvm.internal.C9677q;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p268of.AbstractC11047p;
import p308qj.C12086k;
import p327ri.C12588v;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\b\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\t"}, m15073d2 = {"Landroid/webkit/CookieManager;", "", "url", "", "Lqj/k;", "getCookiesForUrl", "version", "", "validateBuildOverrideCookie", "bundle_updater_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CookieValidatorKt {
    public static final List<C12086k> getCookiesForUrl(CookieManager cookieManager, String url) {
        List<String> z0;
        List<C12086k> i;
        C9677q.m14633g(cookieManager, "<this>");
        C9677q.m14633g(url, "url");
        String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            i = C9610j.m14820i();
            return i;
        }
        z0 = C12588v.m5660z0(cookie, new String[]{"; "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (String str : z0) {
            C12086k c = C12086k.f31720n.m7316c(HttpUrl.f29360l.m9997d(url), str);
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    public static final boolean validateBuildOverrideCookie(String str, String version) {
        List z0;
        Object X;
        String B;
        JSONArray arrayOrNull;
        IntRange q;
        C9677q.m14633g(str, "<this>");
        C9677q.m14633g(version, "version");
        z0 = C12588v.m5660z0(str, new String[]{"."}, false, 0, 6, null);
        X = C9618r.m14767X(z0, 1);
        String str2 = (String) X;
        if (str2 == null) {
            return false;
        }
        String base64String = URLDecoder.decode(str2, "UTF-8");
        ByteString.C11204a aVar = ByteString.f29543o;
        C9677q.m14634f(base64String, "base64String");
        ByteString a = aVar.m9693a(base64String);
        if (!(a == null || (B = a.m9721B()) == null)) {
            try {
                JSONObject objectOrNull = BundleUpdaterUtilsKt.getObjectOrNull(new JSONObject(B), "$meta");
                if (objectOrNull == null || (arrayOrNull = BundleUpdaterUtilsKt.getArrayOrNull(objectOrNull, "allowedVersions")) == null) {
                    return false;
                }
                q = C6322j.m23947q(0, arrayOrNull.length());
                if (!(q instanceof Collection) || !((Collection) q).isEmpty()) {
                    Iterator<Integer> it = q.iterator();
                    while (it.hasNext()) {
                        if (C9677q.m14638b(arrayOrNull.get(((AbstractC11047p) it).nextInt()), version)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
