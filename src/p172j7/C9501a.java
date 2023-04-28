package p172j7;

/* renamed from: j7.a */
/* loaded from: classes7.dex */
public final class C9501a {

    /* renamed from: d */
    public static final C9501a f21077d = new C9501a(0, 0, 0);

    /* renamed from: a */
    public final int f21078a;

    /* renamed from: b */
    public final int f21079b;

    /* renamed from: c */
    public final int f21080c;

    public C9501a(int i, int i2, int i3) {
        this.f21078a = i;
        this.f21079b = i2;
        this.f21080c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9501a)) {
            return false;
        }
        C9501a aVar = (C9501a) obj;
        if (this.f21078a == aVar.f21078a && this.f21079b == aVar.f21079b && this.f21080c == aVar.f21080c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f21078a) * 31) + this.f21079b) * 31) + this.f21080c;
    }
}
