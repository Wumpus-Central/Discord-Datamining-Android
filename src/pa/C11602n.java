package pa;

/* renamed from: pa.n */
/* loaded from: classes3.dex */
final class C11602n extends AbstractC11605q {

    /* renamed from: r */
    final /* synthetic */ C11603o f25863r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11602n(C11603o oVar, C11606r rVar, CharSequence charSequence) {
        super(rVar, charSequence);
        this.f25863r = oVar;
    }

    @Override // pa.AbstractC11605q
    /* renamed from: d */
    final int mo9282d(int i) {
        return i + 1;
    }

    @Override // pa.AbstractC11605q
    /* renamed from: e */
    final int mo9281e(int i) {
        AbstractC11599k kVar = this.f25863r.f25864a;
        CharSequence charSequence = this.f25867m;
        int length = charSequence.length();
        C11601m.m9285a(i, length, "index");
        while (i < length) {
            if (kVar.mo9288a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
