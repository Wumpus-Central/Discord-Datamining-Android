package p409wj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, m15073d2 = {"Lwj/f;", "", "", "method", "", "e", "b", "a", "d", "c", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: wj.f */
/* loaded from: classes8.dex */
public final class C13897f {

    /* renamed from: a */
    public static final C13897f f31328a = new C13897f();

    private C13897f() {
    }

    /* renamed from: b */
    public static final boolean m2364b(String method) {
        C9971q.m14633g(method, "method");
        if (C9971q.m14638b(method, "GET") || C9971q.m14638b(method, "HEAD")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m2361e(String method) {
        C9971q.m14633g(method, "method");
        if (C9971q.m14638b(method, "POST") || C9971q.m14638b(method, "PUT") || C9971q.m14638b(method, "PATCH") || C9971q.m14638b(method, "PROPPATCH") || C9971q.m14638b(method, "REPORT")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m2365a(String method) {
        C9971q.m14633g(method, "method");
        if (C9971q.m14638b(method, "POST") || C9971q.m14638b(method, "PATCH") || C9971q.m14638b(method, "PUT") || C9971q.m14638b(method, "DELETE") || C9971q.m14638b(method, "MOVE")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m2363c(String method) {
        C9971q.m14633g(method, "method");
        return !C9971q.m14638b(method, "PROPFIND");
    }

    /* renamed from: d */
    public final boolean m2362d(String method) {
        C9971q.m14633g(method, "method");
        return C9971q.m14638b(method, "PROPFIND");
    }
}
