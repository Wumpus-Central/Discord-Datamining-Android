package com.discord.bundle_updater;

import android.webkit.CookieManager;
import eg.C6884j;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p267of.AbstractC11283p;
import p307qj.C12231k;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\b\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\t"}, m15073d2 = {"Landroid/webkit/CookieManager;", "", "url", "", "Lqj/k;", "getCookiesForUrl", "version", "", "validateBuildOverrideCookie", "bundle_updater_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CookieValidatorKt {
    public static final List<C12231k> getCookiesForUrl(CookieManager cookieManager, String url) {
        List<String> z0;
        List<C12231k> i;
        C9971q.m14633g(cookieManager, "<this>");
        C9971q.m14633g(url, "url");
        String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            i = C9906j.m14820i();
            return i;
        }
        z0 = C12719v.m5660z0(cookie, new String[]{"; "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (String str : z0) {
            C12231k c = C12231k.f27520n.m7316c(HttpUrl.f25380l.m9997d(url), str);
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
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(version, "version");
        z0 = C12719v.m5660z0(str, new String[]{"."}, false, 0, 6, null);
        X = C9914r.m14767X(z0, 1);
        String str2 = (String) X;
        if (str2 == null) {
            return false;
        }
        String base64String = URLDecoder.decode(str2, "UTF-8");
        ByteString.C11437a aVar = ByteString.f25542o;
        C9971q.m14634f(base64String, "base64String");
        ByteString a = aVar.m9693a(base64String);
        if (!(a == null || (B = a.m9721B()) == null)) {
            try {
                JSONObject objectOrNull = BundleUpdaterUtilsKt.getObjectOrNull(new JSONObject(B), "$meta");
                if (objectOrNull == null || (arrayOrNull = BundleUpdaterUtilsKt.getArrayOrNull(objectOrNull, "allowedVersions")) == null) {
                    return false;
                }
                q = C6884j.m23947q(0, arrayOrNull.length());
                if (!(q instanceof Collection) || !((Collection) q).isEmpty()) {
                    Iterator<Integer> it = q.iterator();
                    while (it.hasNext()) {
                        if (C9971q.m14638b(arrayOrNull.get(((AbstractC11283p) it).nextInt()), version)) {
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
