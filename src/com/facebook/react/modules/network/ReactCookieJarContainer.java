package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import p307qj.C12231k;

/* loaded from: classes7.dex */
public class ReactCookieJarContainer implements CookieJarContainer {
    private CookieJar cookieJar = null;

    @Override // com.facebook.react.modules.network.CookieJarContainer, okhttp3.CookieJar
    public List<C12231k> loadForRequest(HttpUrl httpUrl) {
        CookieJar cookieJar = this.cookieJar;
        if (cookieJar == null) {
            return Collections.emptyList();
        }
        List<C12231k> loadForRequest = cookieJar.loadForRequest(httpUrl);
        ArrayList arrayList = new ArrayList();
        for (C12231k kVar : loadForRequest) {
            try {
                new Headers.C11418a().m10065a(kVar.m7326e(), kVar.m7324g());
                arrayList.add(kVar);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer
    public void removeCookieJar() {
        this.cookieJar = null;
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer, okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<C12231k> list) {
        CookieJar cookieJar = this.cookieJar;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(httpUrl, list);
        }
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer
    public void setCookieJar(CookieJar cookieJar) {
        this.cookieJar = cookieJar;
    }
}
