package p177jc;

/* renamed from: jc.q */
/* loaded from: classes3.dex */
public final class C9548q {

    /* renamed from: a */
    private final Class<?> f21157a;

    /* renamed from: b */
    private final int f21158b;

    /* renamed from: c */
    private final int f21159c;

    private C9548q(Class<?> cls, int i, int i2) {
        this.f21157a = (Class) C9522c0.m16096c(cls, "Null dependency anInterface.");
        this.f21158b = i;
        this.f21159c = i2;
    }

    /* renamed from: a */
    private static String m16026a(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    /* renamed from: g */
    public static C9548q m16020g(Class<?> cls) {
        return new C9548q(cls, 0, 0);
    }

    /* renamed from: h */
    public static C9548q m16019h(Class<?> cls) {
        return new C9548q(cls, 0, 1);
    }

    /* renamed from: i */
    public static C9548q m16018i(Class<?> cls) {
        return new C9548q(cls, 1, 0);
    }

    /* renamed from: j */
    public static C9548q m16017j(Class<?> cls) {
        return new C9548q(cls, 1, 1);
    }

    /* renamed from: k */
    public static C9548q m16016k(Class<?> cls) {
        return new C9548q(cls, 2, 0);
    }

    /* renamed from: b */
    public Class<?> m16025b() {
        return this.f21157a;
    }

    /* renamed from: c */
    public boolean m16024c() {
        return this.f21159c == 2;
    }

    /* renamed from: d */
    public boolean m16023d() {
        return this.f21159c == 0;
    }

    /* renamed from: e */
    public boolean m16022e() {
        return this.f21158b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9548q)) {
            return false;
        }
        C9548q qVar = (C9548q) obj;
        if (this.f21157a == qVar.f21157a && this.f21158b == qVar.f21158b && this.f21159c == qVar.f21159c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m16021f() {
        return this.f21158b == 2;
    }

    public int hashCode() {
        return ((((this.f21157a.hashCode() ^ 1000003) * 1000003) ^ this.f21158b) * 1000003) ^ this.f21159c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f21157a);
        sb2.append(", type=");
        int i = this.f21158b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(m16026a(this.f21159c));
        sb2.append("}");
        return sb2.toString();
    }
}
