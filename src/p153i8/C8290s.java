package p153i8;

/* renamed from: i8.s */
/* loaded from: classes7.dex */
public class C8290s {

    /* renamed from: a */
    public final Object f18059a;

    /* renamed from: b */
    public final int f18060b;

    /* renamed from: c */
    public final int f18061c;

    /* renamed from: d */
    public final long f18062d;

    /* renamed from: e */
    public final int f18063e;

    public C8290s(Object obj) {
        this(obj, -1L);
    }

    /* renamed from: a */
    public C8290s m20021a(Object obj) {
        if (this.f18059a.equals(obj)) {
            return this;
        }
        return new C8290s(obj, this.f18060b, this.f18061c, this.f18062d, this.f18063e);
    }

    /* renamed from: b */
    public boolean m20020b() {
        return this.f18060b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8290s)) {
            return false;
        }
        C8290s sVar = (C8290s) obj;
        if (this.f18059a.equals(sVar.f18059a) && this.f18060b == sVar.f18060b && this.f18061c == sVar.f18061c && this.f18062d == sVar.f18062d && this.f18063e == sVar.f18063e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f18059a.hashCode()) * 31) + this.f18060b) * 31) + this.f18061c) * 31) + ((int) this.f18062d)) * 31) + this.f18063e;
    }

    public C8290s(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public C8290s(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public C8290s(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8290s(C8290s sVar) {
        this.f18059a = sVar.f18059a;
        this.f18060b = sVar.f18060b;
        this.f18061c = sVar.f18061c;
        this.f18062d = sVar.f18062d;
        this.f18063e = sVar.f18063e;
    }

    private C8290s(Object obj, int i, int i2, long j, int i3) {
        this.f18059a = obj;
        this.f18060b = i;
        this.f18061c = i2;
        this.f18062d = j;
        this.f18063e = i3;
    }
}
