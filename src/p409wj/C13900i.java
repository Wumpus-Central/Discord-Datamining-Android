package p409wj;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.HttpUrl;
import okhttp3.Request;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, m15073d2 = {"Lwj/i;", "", "Lokhttp3/Request;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "", "a", "Lokhttp3/HttpUrl;", "url", "c", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: wj.i */
/* loaded from: classes8.dex */
public final class C13900i {

    /* renamed from: a */
    public static final C13900i f31341a = new C13900i();

    private C13900i() {
    }

    /* renamed from: b */
    private final boolean m2348b(Request request, Proxy.Type type) {
        return !request.m9882g() && type == Proxy.Type.HTTP;
    }

    /* renamed from: a */
    public final String m2349a(Request request, Proxy.Type proxyType) {
        C9971q.m14633g(request, "request");
        C9971q.m14633g(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.m9881h());
        sb2.append(' ');
        C13900i iVar = f31341a;
        if (iVar.m2348b(request, proxyType)) {
            sb2.append(request.m9877l());
        } else {
            sb2.append(iVar.m2347c(request.m9877l()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: c */
    public final String m2347c(HttpUrl url) {
        C9971q.m14633g(url, "url");
        String d = url.m10046d();
        String f = url.m10044f();
        if (f == null) {
            return d;
        }
        return d + '?' + f;
    }
}
