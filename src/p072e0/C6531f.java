package p072e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e0.f */
/* loaded from: classes.dex */
public final class C6531f extends AbstractC6548o {

    /* renamed from: o */
    private final int f13678o;

    /* renamed from: p */
    private final int f13679p;

    /* renamed from: q */
    private final int f13680q;

    /* renamed from: r */
    private final String f13681r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6531f(int i, int i2, int i3, String str) {
        this.f13678o = i;
        this.f13679p = i2;
        this.f13680q = i3;
        if (str != null) {
            this.f13681r = str;
            return;
        }
        throw new NullPointerException("Null description");
    }

    @Override // p072e0.AbstractC6548o
    /* renamed from: d */
    String mo25331d() {
        return this.f13681r;
    }

    @Override // p072e0.AbstractC6548o
    /* renamed from: e */
    public int mo25330e() {
        return this.f13678o;
    }

    @Override // p072e0.AbstractC6548o
    /* renamed from: f */
    int mo25329f() {
        return this.f13679p;
    }

    @Override // p072e0.AbstractC6548o
    /* renamed from: g */
    int mo25328g() {
        return this.f13680q;
    }
}
