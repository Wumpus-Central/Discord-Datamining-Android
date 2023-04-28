package p079e7;

import com.google.android.exoplayer2.AbstractC5252t0;
import com.google.android.exoplayer2.ExoPlaybackException;
import p119g9.AbstractC7561t;
import p119g9.C7510a;
import p152i7.C8223h;
import p153i8.AbstractC8278o0;

/* renamed from: e7.b */
/* loaded from: classes7.dex */
public abstract class AbstractC6712b implements AbstractC5252t0, AbstractC6733t {

    /* renamed from: k */
    private final int f14265k;

    /* renamed from: m */
    private C6734u f14267m;

    /* renamed from: n */
    private int f14268n;

    /* renamed from: o */
    private int f14269o;

    /* renamed from: p */
    private AbstractC8278o0 f14270p;

    /* renamed from: q */
    private C6722k[] f14271q;

    /* renamed from: r */
    private long f14272r;

    /* renamed from: s */
    private long f14273s;

    /* renamed from: u */
    private boolean f14275u;

    /* renamed from: v */
    private boolean f14276v;

    /* renamed from: l */
    private final C6725l f14266l = new C6725l();

    /* renamed from: t */
    private long f14274t = Long.MIN_VALUE;

    public AbstractC6712b(int i) {
        this.f14265k = i;
    }

    /* renamed from: A */
    protected final int m24587A() {
        return this.f14268n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final C6722k[] m24586B() {
        return (C6722k[]) C7510a.m22367e(this.f14271q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final boolean m24585C() {
        return mo24582g() ? this.f14275u : ((AbstractC8278o0) C7510a.m22367e(this.f14270p)).mo12452e();
    }

    /* renamed from: D */
    protected abstract void mo173D();

    /* renamed from: E */
    protected void mo1099E(boolean z, boolean z2) {
    }

    /* renamed from: F */
    protected abstract void mo172F(long j, boolean z);

    /* renamed from: G */
    protected void mo1096G() {
    }

    /* renamed from: H */
    protected void mo1094H() {
    }

    /* renamed from: I */
    protected void mo1092I() {
    }

    /* renamed from: J */
    protected abstract void mo171J(C6722k[] kVarArr, long j, long j2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public final int m24584K(C6725l lVar, C8223h hVar, boolean z) {
        int j = ((AbstractC8278o0) C7510a.m22367e(this.f14270p)).mo12451j(lVar, hVar, z);
        if (j == -4) {
            if (hVar.m20299k()) {
                this.f14274t = Long.MIN_VALUE;
                if (this.f14275u) {
                    return -4;
                }
                return -3;
            }
            long j2 = hVar.f17800o + this.f14272r;
            hVar.f17800o = j2;
            this.f14274t = Math.max(this.f14274t, j2);
        } else if (j == -5) {
            C6722k kVar = (C6722k) C7510a.m22367e(lVar.f14361b);
            if (kVar.f14333z != Long.MAX_VALUE) {
                lVar.f14361b = kVar.m24531a().m24480i0(kVar.f14333z + this.f14272r).m24519E();
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public int m24583L(long j) {
        return ((AbstractC8278o0) C7510a.m22367e(this.f14270p)).mo12450s(j - this.f14272r);
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0, p079e7.AbstractC6733t
    /* renamed from: d */
    public final int mo24424d() {
        return this.f14265k;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    public final void disable() {
        boolean z = true;
        if (this.f14269o != 1) {
            z = false;
        }
        C7510a.m22366f(z);
        this.f14266l.m24461a();
        this.f14269o = 0;
        this.f14270p = null;
        this.f14271q = null;
        this.f14275u = false;
        mo173D();
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: g */
    public final boolean mo24582g() {
        return this.f14274t == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    public final int getState() {
        return this.f14269o;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: h */
    public final void mo24581h() {
        this.f14275u = true;
    }

    @Override // com.google.android.exoplayer2.C5218r0.AbstractC5220b
    /* renamed from: i */
    public void mo19982i(int i, Object obj) {
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: j */
    public final void mo24580j() {
        ((AbstractC8278o0) C7510a.m22367e(this.f14270p)).mo12456a();
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: k */
    public final boolean mo24579k() {
        return this.f14275u;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: l */
    public final void mo24578l(C6734u uVar, C6722k[] kVarArr, AbstractC8278o0 o0Var, long j, boolean z, boolean z2, long j2, long j3) {
        boolean z3;
        if (this.f14269o == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C7510a.m22366f(z3);
        this.f14267m = uVar;
        this.f14269o = 1;
        this.f14273s = j;
        mo1099E(z, z2);
        mo24577m(kVarArr, o0Var, j2, j3);
        mo172F(j, z);
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: m */
    public final void mo24577m(C6722k[] kVarArr, AbstractC8278o0 o0Var, long j, long j2) {
        C7510a.m22366f(!this.f14275u);
        this.f14270p = o0Var;
        this.f14274t = j2;
        this.f14271q = kVarArr;
        this.f14272r = j2;
        mo171J(kVarArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: n */
    public final AbstractC6733t mo24576n() {
        return this;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: p */
    public /* synthetic */ void mo1032p(float f, float f2) {
        C6731r.m24430a(this, f, f2);
    }

    @Override // p079e7.AbstractC6733t
    /* renamed from: q */
    public int mo1030q() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    public final void reset() {
        boolean z;
        if (this.f14269o == 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        this.f14266l.m24461a();
        mo1096G();
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: s */
    public final AbstractC8278o0 mo24575s() {
        return this.f14270p;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    public final void setIndex(int i) {
        this.f14268n = i;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    public final void start() {
        boolean z = true;
        if (this.f14269o != 1) {
            z = false;
        }
        C7510a.m22366f(z);
        this.f14269o = 2;
        mo1094H();
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    public final void stop() {
        boolean z;
        if (this.f14269o == 2) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        this.f14269o = 1;
        mo1092I();
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: t */
    public final long mo24574t() {
        return this.f14274t;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: u */
    public final void mo24573u(long j) {
        this.f14275u = false;
        this.f14273s = j;
        this.f14274t = j;
        mo172F(j, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: v */
    public AbstractC7561t mo22577v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final ExoPlaybackException m24572w(Throwable th2, C6722k kVar) {
        return m24571x(th2, kVar, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final ExoPlaybackException m24571x(Throwable th2, C6722k kVar, boolean z) {
        int i;
        if (kVar != null && !this.f14276v) {
            this.f14276v = true;
            try {
                i = C6732s.m24426d(mo166a(kVar));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f14276v = false;
            }
            return ExoPlaybackException.m30559c(th2, getName(), m24587A(), kVar, i, z);
        }
        i = 4;
        return ExoPlaybackException.m30559c(th2, getName(), m24587A(), kVar, i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final C6734u m24570y() {
        return (C6734u) C7510a.m22367e(this.f14267m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final C6725l m24569z() {
        this.f14266l.m24461a();
        return this.f14266l;
    }
}
