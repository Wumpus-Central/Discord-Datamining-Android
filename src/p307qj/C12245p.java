package p307qj;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import p015ak.C1457k;
import p267of.C11288u;
import p267of.C11289v;
import p307qj.C12231k;
import p326ri.C12718u;
import p327rj.C12728b;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m15073d2 = {"Lqj/p;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "", "header", "", "Lqj/k;", "a", "cookies", "", "saveFromResponse", "loadForRequest", "Ljava/net/CookieHandler;", "c", "Ljava/net/CookieHandler;", "cookieHandler", "<init>", "(Ljava/net/CookieHandler;)V", "okhttp-urlconnection"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.p */
/* loaded from: classes8.dex */
public final class C12245p implements CookieJar {

    /* renamed from: c */
    private final CookieHandler f27552c;

    public C12245p(CookieHandler cookieHandler) {
        C9971q.m14633g(cookieHandler, "cookieHandler");
        this.f27552c = cookieHandler;
    }

    /* renamed from: a */
    private final List<C12231k> m7271a(HttpUrl httpUrl, String str) {
        boolean H;
        String str2;
        boolean H2;
        boolean s;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int n = C12729c.m5604n(str, ";,", i, length);
            int m = C12729c.m5605m(str, '=', i, n);
            String V = C12729c.m5621V(str, i, m);
            H = C12718u.m5736H(V, "$", false, 2, null);
            if (!H) {
                if (m < n) {
                    str2 = C12729c.m5621V(str, m + 1, n);
                } else {
                    str2 = "";
                }
                H2 = C12718u.m5736H(str2, "\"", false, 2, null);
                if (H2) {
                    s = C12718u.m5733s(str2, "\"", false, 2, null);
                    if (s) {
                        str2 = str2.substring(1, str2.length() - 1);
                        C9971q.m14634f(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                }
                arrayList.add(new C12231k.C12232a().m7320d(V).m7319e(str2).m7322b(httpUrl.m10042h()).m7323a());
            }
            i = n + 1;
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public List<C12231k> loadForRequest(HttpUrl url) {
        List<C12231k> i;
        Map<String, List<String>> h;
        List<C12231k> i2;
        boolean t;
        boolean t2;
        C9971q.m14633g(url, "url");
        try {
            CookieHandler cookieHandler = this.f27552c;
            URI r = url.m10032r();
            h = C11289v.m10251h();
            Map<String, List<String>> cookieHeaders = cookieHandler.get(r, h);
            C9971q.m14634f(cookieHeaders, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                t = C12718u.m5732t("Cookie", key, true);
                if (!t) {
                    t2 = C12718u.m5732t("Cookie2", key, true);
                    if (t2) {
                    }
                }
                C9971q.m14634f(value, "value");
                if (!value.isEmpty()) {
                    for (String header : value) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        C9971q.m14634f(header, "header");
                        arrayList.addAll(m7271a(url, header));
                    }
                }
            }
            if (arrayList != null) {
                List<C12231k> unmodifiableList = Collections.unmodifiableList(arrayList);
                C9971q.m14634f(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            i2 = C9906j.m14820i();
            return i2;
        } catch (IOException e) {
            C1457k g = C1457k.f517c.m41079g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Loading cookies failed for ");
            HttpUrl p = url.m10034p("/...");
            C9971q.m14636d(p);
            sb2.append(p);
            g.m41091k(sb2.toString(), 5, e);
            i = C9906j.m14820i();
            return i;
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl url, List<C12231k> cookies) {
        Map<String, List<String>> e;
        C9971q.m14633g(url, "url");
        C9971q.m14633g(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        for (C12231k kVar : cookies) {
            arrayList.add(C12728b.m5643a(kVar, true));
        }
        e = C11288u.m10254e(C11098x.m10921a("Set-Cookie", arrayList));
        try {
            this.f27552c.put(url.m10032r(), e);
        } catch (IOException e2) {
            C1457k g = C1457k.f517c.m41079g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Saving cookies failed for ");
            HttpUrl p = url.m10034p("/...");
            C9971q.m14636d(p);
            sb2.append(p);
            g.m41091k(sb2.toString(), 5, e2);
        }
    }
}
