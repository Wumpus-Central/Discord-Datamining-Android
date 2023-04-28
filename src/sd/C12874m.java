package sd;

/* renamed from: sd.m */
/* loaded from: classes3.dex */
final class C12874m {

    /* renamed from: a */
    private int f28937a = 0;

    /* renamed from: b */
    private EnumC12875a f28938b = EnumC12875a.NUMERIC;

    /* renamed from: sd.m$a */
    /* loaded from: classes3.dex */
    private enum EnumC12875a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m5232a() {
        return this.f28937a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5231b(int i) {
        this.f28937a += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m5230c() {
        return this.f28938b == EnumC12875a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m5229d() {
        return this.f28938b == EnumC12875a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m5228e() {
        this.f28938b = EnumC12875a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m5227f() {
        this.f28938b = EnumC12875a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m5226g() {
        this.f28938b = EnumC12875a.NUMERIC;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m5225h(int i) {
        this.f28937a = i;
    }
}
