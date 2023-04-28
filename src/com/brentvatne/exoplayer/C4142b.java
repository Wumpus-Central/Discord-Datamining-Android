package com.brentvatne.exoplayer;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.google.android.exoplayer2.upstream.AbstractC5311f;
import com.google.android.exoplayer2.upstream.C5291c;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Map;
import okhttp3.OkHttpClient;
import p081e9.C6781o;
import p119g9.C7557q0;
import p211l7.C10352b;
import p307qj.C12245p;

/* renamed from: com.brentvatne.exoplayer.b */
/* loaded from: classes.dex */
public class C4142b {

    /* renamed from: a */
    private static DataSource.Factory f6938a;

    /* renamed from: b */
    private static AbstractC5311f.AbstractC5314c f6939b;

    /* renamed from: c */
    private static String f6940c;

    /* renamed from: a */
    private static DataSource.Factory m32659a(ReactContext reactContext, C6781o oVar, Map<String, String> map) {
        return new C5291c(reactContext, oVar, m32658b(reactContext, oVar, map));
    }

    /* renamed from: b */
    private static AbstractC5311f.AbstractC5314c m32658b(ReactContext reactContext, C6781o oVar, Map<String, String> map) {
        OkHttpClient okHttpClient = OkHttpClientProvider.getOkHttpClient();
        ((CookieJarContainer) okHttpClient.m9942q()).setCookieJar(new C12245p(new ForwardingCookieHandler(reactContext)));
        C10352b bVar = new C10352b(okHttpClient, m32655e(reactContext), oVar);
        if (map != null) {
            bVar.m29492b().m29490b(map);
        }
        return bVar;
    }

    /* renamed from: c */
    public static DataSource.Factory m32657c(ReactContext reactContext, C6781o oVar, Map<String, String> map) {
        if (f6938a == null || (map != null && !map.isEmpty())) {
            f6938a = m32659a(reactContext, oVar, map);
        }
        return f6938a;
    }

    /* renamed from: d */
    public static AbstractC5311f.AbstractC5314c m32656d(ReactContext reactContext, C6781o oVar, Map<String, String> map) {
        if (f6939b == null || (map != null && !map.isEmpty())) {
            f6939b = m32658b(reactContext, oVar, map);
        }
        return f6939b;
    }

    /* renamed from: e */
    public static String m32655e(ReactContext reactContext) {
        if (f6940c == null) {
            f6940c = C7557q0.m22142k0(reactContext, "ReactNativeVideo");
        }
        return f6940c;
    }

    /* renamed from: f */
    public static void m32654f(DataSource.Factory factory) {
        f6938a = factory;
    }
}
