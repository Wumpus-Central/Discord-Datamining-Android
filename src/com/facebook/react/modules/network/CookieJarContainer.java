package com.facebook.react.modules.network;

import java.util.List;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import p307qj.C12231k;

/* loaded from: classes7.dex */
public interface CookieJarContainer extends CookieJar {
    @Override // okhttp3.CookieJar
    /* synthetic */ List<C12231k> loadForRequest(HttpUrl httpUrl);

    void removeCookieJar();

    @Override // okhttp3.CookieJar
    /* synthetic */ void saveFromResponse(HttpUrl httpUrl, List<C12231k> list);

    void setCookieJar(CookieJar cookieJar);
}
