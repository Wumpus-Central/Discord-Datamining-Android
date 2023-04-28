package p093f2;

import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* renamed from: f2.d */
/* loaded from: classes.dex */
public class C7006d {

    /* renamed from: a */
    private static String f15293a;

    /* renamed from: f2.d$a */
    /* loaded from: classes.dex */
    static class C7007a implements AbstractC7009c {
        C7007a() {
        }

        @Override // p093f2.C7006d.AbstractC7009c
        /* renamed from: a */
        public void mo23661a(HttpsURLConnection httpsURLConnection, String str) {
            httpsURLConnection.setRequestProperty("Client-SDK", str);
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setReadTimeout(60000);
            if (C7006d.f15293a != null) {
                httpsURLConnection.setRequestProperty("User-Agent", C7006d.f15293a);
            }
        }
    }

    /* renamed from: f2.d$b */
    /* loaded from: classes.dex */
    static class C7008b implements AbstractC0215d {
        C7008b() {
        }

        @Override // p093f2.C7006d.AbstractC0215d
        /* renamed from: a */
        public HttpsURLConnection mo23660a(URL url) {
            return (HttpsURLConnection) url.openConnection();
        }
    }

    /* renamed from: f2.d$c */
    /* loaded from: classes.dex */
    public interface AbstractC7009c {
        /* renamed from: a */
        void mo23661a(HttpsURLConnection httpsURLConnection, String str);
    }

    /* renamed from: f2.d$d */
    /* loaded from: classes.dex */
    public interface AbstractC0215d {
        /* renamed from: a */
        HttpsURLConnection mo23660a(URL url);
    }

    /* renamed from: b */
    public static AbstractC7009c m23666b() {
        return new C7007a();
    }

    /* renamed from: c */
    public static AbstractC0215d m23665c() {
        return new C7008b();
    }

    /* renamed from: d */
    public static Long m23664d(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof Long) {
            return (Long) opt;
        }
        if (opt instanceof Number) {
            return Long.valueOf(((Number) opt).longValue());
        }
        if (!(opt instanceof String)) {
            return null;
        }
        try {
            return Long.valueOf((long) Double.parseDouble((String) opt));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m23663e(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            return (String) opt;
        }
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    /* renamed from: f */
    public static void m23662f(String str) {
        f15293a = str;
    }
}
