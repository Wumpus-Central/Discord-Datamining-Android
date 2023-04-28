package p368ud;

/* renamed from: ud.d */
/* loaded from: classes3.dex */
final class C13260d {

    /* renamed from: a */
    private final int f29765a;

    /* renamed from: b */
    private final int f29766b;

    /* renamed from: c */
    private final int f29767c;

    /* renamed from: d */
    private final int f29768d;

    /* renamed from: e */
    private int f29769e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13260d(int i, int i2, int i3, int i4) {
        this.f29765a = i;
        this.f29766b = i2;
        this.f29767c = i3;
        this.f29768d = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m4186a() {
        return this.f29767c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m4185b() {
        return this.f29766b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m4184c() {
        return this.f29769e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m4183d() {
        return this.f29765a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m4182e() {
        return this.f29768d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m4181f() {
        return this.f29766b - this.f29765a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m4180g() {
        return m4179h(this.f29769e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m4179h(int i) {
        return i != -1 && this.f29767c == (i % 3) * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m4178i(int i) {
        this.f29769e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m4177j() {
        this.f29769e = ((this.f29768d / 30) * 3) + (this.f29767c / 3);
    }

    public String toString() {
        return this.f29769e + "|" + this.f29768d;
    }
}
