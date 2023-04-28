package p031bk;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0004B%\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u0011"}, m15073d2 = {"Lbk/j;", "", "", "closer", "a", "closeGuardInstance", "", "b", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "getMethod", "openMethod", "c", "warnIfOpenMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "d", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: bk.j */
/* loaded from: classes8.dex */
public final class C3738j {

    /* renamed from: d */
    public static final C3739a f6081d = new C3739a(null);

    /* renamed from: a */
    private final Method f6082a;

    /* renamed from: b */
    private final Method f6083b;

    /* renamed from: c */
    private final Method f6084c;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, m15073d2 = {"Lbk/j$a;", "", "Lbk/j;", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: bk.j$a */
    /* loaded from: classes8.dex */
    public static final class C3739a {
        private C3739a() {
        }

        public /* synthetic */ C3739a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3738j m33712a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method2 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", String.class);
                method3 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method2 = null;
                method3 = null;
                method = null;
            }
            return new C3738j(method2, method, method3);
        }
    }

    public C3738j(Method method, Method method2, Method method3) {
        this.f6082a = method;
        this.f6083b = method2;
        this.f6084c = method3;
    }

    /* renamed from: a */
    public final Object m33714a(String closer) {
        C9971q.m14633g(closer, "closer");
        Method method = this.f6082a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f6083b;
                C9971q.m14636d(method2);
                method2.invoke(invoke, closer);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m33713b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f6084c;
            C9971q.m14636d(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
