package com.discord.bundle_updater;

import android.webkit.CookieManager;
import gf.p;
import hj.k;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ji.v;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\b\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\t"}, d2 = {"Landroid/webkit/CookieManager;", "", "url", "", "Lhj/k;", "getCookiesForUrl", "version", "", "validateBuildOverrideCookie", "bundle_updater_release"}, k = 2, mv = {1, 8, 0})

public final class CookieValidatorKt {
    public static final List<k> getCookiesForUrl(CookieManager cookieManager, String url) {
        List<String> z02;
        List<k> h10;
        q.g(cookieManager, "<this>");
        q.g(url, "url");
        String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            h10 = j.h();
            return h10;
        }
        z02 = v.z0(cookie, new String[]{"; "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (String str : z02) {
            k c10 = k.f16746n.c(HttpUrl.f23785l.d(url), str);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        return arrayList;
    }

    public static final boolean validateBuildOverrideCookie(String str, String version) {
        List z02;
        Object V;
        String C;
        JSONArray arrayOrNull;
        IntRange p10;
        q.g(str, "<this>");
        q.g(version, "version");
        z02 = v.z0(str, new String[]{"."}, false, 0, 6, null);
        V = r.V(z02, 1);
        String str2 = (String) V;
        if (str2 == null) {
            return false;
        }
        String base64String = URLDecoder.decode(str2, "UTF-8");
        ByteString.a aVar = ByteString.f23947o;
        q.f(base64String, "base64String");
        ByteString a10 = aVar.a(base64String);
        if (!(a10 == null || (C = a10.C()) == null)) {
            try {
                JSONObject objectOrNull = BundleUpdaterUtilsKt.getObjectOrNull(new JSONObject(C), "$meta");
                if (objectOrNull == null || (arrayOrNull = BundleUpdaterUtilsKt.getArrayOrNull(objectOrNull, "allowedVersions")) == null) {
                    return false;
                }
                p10 = wf.j.p(0, arrayOrNull.length());
                if (!(p10 instanceof Collection) || !((Collection) p10).isEmpty()) {
                    Iterator<Integer> it = p10.iterator();
                    while (it.hasNext()) {
                        if (q.b(arrayOrNull.get(((p) it).nextInt()), version)) {
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
