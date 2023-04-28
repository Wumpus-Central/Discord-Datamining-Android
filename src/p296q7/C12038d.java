package p296q7;

import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10534y;
import p228m7.C10537z;

/* renamed from: q7.d */
/* loaded from: classes7.dex */
public final class C12038d implements AbstractC10516k {

    /* renamed from: k */
    private final long f27016k;

    /* renamed from: l */
    private final AbstractC10516k f27017l;

    /* renamed from: q7.d$a */
    /* loaded from: classes7.dex */
    class C12039a implements AbstractC10534y {

        /* renamed from: a */
        final /* synthetic */ AbstractC10534y f27018a;

        C12039a(AbstractC10534y yVar) {
            this.f27018a = yVar;
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: f */
        public AbstractC10534y.C10535a mo2208f(long j) {
            AbstractC10534y.C10535a f = this.f27018a.mo2208f(j);
            C10537z zVar = f.f23291a;
            C10537z zVar2 = new C10537z(zVar.f23296a, zVar.f23297b + C12038d.this.f27016k);
            C10537z zVar3 = f.f23292b;
            return new AbstractC10534y.C10535a(zVar2, new C10537z(zVar3.f23296a, zVar3.f23297b + C12038d.this.f27016k));
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: h */
        public boolean mo2207h() {
            return this.f27018a.mo2207h();
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: i */
        public long mo2206i() {
            return this.f27018a.mo2206i();
        }
    }

    public C12038d(long j, AbstractC10516k kVar) {
        this.f27016k = j;
        this.f27017l = kVar;
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: e */
    public AbstractC10500b0 mo7937e(int i, int i2) {
        return this.f27017l.mo7937e(i, i2);
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: j */
    public void mo7936j(AbstractC10534y yVar) {
        this.f27017l.mo7936j(new C12039a(yVar));
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: s */
    public void mo7935s() {
        this.f27017l.mo7935s();
    }
}
