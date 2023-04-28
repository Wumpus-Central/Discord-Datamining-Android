package p409wj;

import fk.C7361i;
import fk.C7366m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p307qj.C12231k;
import p326ri.C12718u;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lwj/a;", "Lokhttp3/Interceptor;", "", "Lqj/k;", "cookies", "", "a", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lokhttp3/CookieJar;", "Lokhttp3/CookieJar;", "cookieJar", "<init>", "(Lokhttp3/CookieJar;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: wj.a */
/* loaded from: classes8.dex */
public final class C13891a implements Interceptor {

    /* renamed from: a */
    private final CookieJar f31321a;

    public C13891a(CookieJar cookieJar) {
        C9971q.m14633g(cookieJar, "cookieJar");
        this.f31321a = cookieJar;
    }

    /* renamed from: a */
    private final String m2377a(List<C12231k> list) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C9906j.m14810s();
            }
            C12231k kVar = (C12231k) obj;
            if (i > 0) {
                sb2.append("; ");
            }
            sb2.append(kVar.m7326e());
            sb2.append('=');
            sb2.append(kVar.m7324g());
            i = i2;
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        boolean t;
        ResponseBody b;
        C9971q.m14633g(chain, "chain");
        Request b2 = chain.mo2359b();
        Request.Builder i = b2.m9880i();
        RequestBody a = b2.m9888a();
        if (a != null) {
            MediaType contentType = a.contentType();
            if (contentType != null) {
                i.m9872e("Content-Type", contentType.toString());
            }
            long contentLength = a.contentLength();
            if (contentLength != -1) {
                i.m9872e("Content-Length", String.valueOf(contentLength));
                i.m9868i("Transfer-Encoding");
            } else {
                i.m9872e("Transfer-Encoding", "chunked");
                i.m9868i("Content-Length");
            }
        }
        boolean z = false;
        if (b2.m9885d("Host") == null) {
            i.m9872e("Host", C12729c.m5626Q(b2.m9877l(), false, 1, null));
        }
        if (b2.m9885d("Connection") == null) {
            i.m9872e("Connection", "Keep-Alive");
        }
        if (b2.m9885d("Accept-Encoding") == null && b2.m9885d("Range") == null) {
            i.m9872e("Accept-Encoding", "gzip");
            z = true;
        }
        List<C12231k> loadForRequest = this.f31321a.loadForRequest(b2.m9877l());
        if (!loadForRequest.isEmpty()) {
            i.m9872e("Cookie", m2377a(loadForRequest));
        }
        if (b2.m9885d("User-Agent") == null) {
            i.m9872e("User-Agent", "okhttp/4.9.2");
        }
        Response a2 = chain.mo2360a(i.m9875b());
        C13896e.m2368f(this.f31321a, b2.m9877l(), a2.m9833z());
        Response.C11430a r = a2.m9850R().m9815r(b2);
        if (z) {
            t = C12718u.m5732t("gzip", Response.m9834t(a2, "Content-Encoding", null, 2, null), true);
            if (t && C13896e.m2372b(a2) && (b = a2.m9845b()) != null) {
                C7361i iVar = new C7361i(b.source());
                r.m9822k(a2.m9833z().m10070f().m10059g("Content-Encoding").m10059g("Content-Length").m10062d());
                r.m9831b(new C13899h(Response.m9834t(a2, "Content-Type", null, 2, null), -1L, C7366m.m22819d(iVar)));
            }
        }
        return r.m9830c();
    }
}
