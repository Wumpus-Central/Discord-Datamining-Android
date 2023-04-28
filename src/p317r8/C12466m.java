package p317r8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import p079e7.AbstractC6712b;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6732s;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;

/* renamed from: r8.m */
/* loaded from: classes7.dex */
public final class C12466m extends AbstractC6712b implements Handler.Callback {

    /* renamed from: A */
    private boolean f39289A;

    /* renamed from: B */
    private boolean f39290B;

    /* renamed from: C */
    private boolean f39291C;

    /* renamed from: D */
    private int f39292D;

    /* renamed from: E */
    private C6722k f39293E;

    /* renamed from: F */
    private AbstractC12459g f39294F;

    /* renamed from: G */
    private C12463j f39295G;

    /* renamed from: H */
    private AbstractC12464k f39296H;

    /* renamed from: I */
    private AbstractC12464k f39297I;

    /* renamed from: J */
    private int f39298J;

    /* renamed from: K */
    private long f39299K;

    /* renamed from: w */
    private final Handler f28118w;

    /* renamed from: x */
    private final AbstractC12465l f28119x;

    /* renamed from: y */
    private final AbstractC12461i f28120y;

    /* renamed from: z */
    private final C6725l f28121z;

    public C12466m(AbstractC12465l lVar, Looper looper) {
        this(lVar, looper, AbstractC12461i.f28114a);
    }

    /* renamed from: M */
    private void m6664M() {
        m6655V(Collections.emptyList());
    }

    /* renamed from: N */
    private long m6663N() {
        if (this.f39298J == -1) {
            return Long.MAX_VALUE;
        }
        C7510a.m22367e(this.f39296H);
        if (this.f39298J >= this.f39296H.mo150d()) {
            return Long.MAX_VALUE;
        }
        return this.f39296H.mo151c(this.f39298J);
    }

    /* renamed from: O */
    private void m6662O(C12460h hVar) {
        C7558r.m22108d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f39293E, hVar);
        m6664M();
        m6657T();
    }

    /* renamed from: P */
    private void m6661P() {
        this.f39291C = true;
        this.f39294F = this.f28120y.mo6667b((C6722k) C7510a.m22367e(this.f39293E));
    }

    /* renamed from: Q */
    private void m6660Q(List<C12453b> list) {
        this.f28119x.mo6665n(list);
    }

    /* renamed from: R */
    private void m6659R() {
        this.f39295G = null;
        this.f39298J = -1;
        AbstractC12464k kVar = this.f39296H;
        if (kVar != null) {
            kVar.mo5319n();
            this.f39296H = null;
        }
        AbstractC12464k kVar2 = this.f39297I;
        if (kVar2 != null) {
            kVar2.mo5319n();
            this.f39297I = null;
        }
    }

    /* renamed from: S */
    private void m6658S() {
        m6659R();
        ((AbstractC12459g) C7510a.m22367e(this.f39294F)).release();
        this.f39294F = null;
        this.f39292D = 0;
    }

    /* renamed from: T */
    private void m6657T() {
        m6658S();
        m6661P();
    }

    /* renamed from: V */
    private void m6655V(List<C12453b> list) {
        Handler handler = this.f28118w;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m6660Q(list);
        }
    }

    @Override // p079e7.AbstractC6712b
    /* renamed from: D */
    protected void mo173D() {
        this.f39293E = null;
        this.f39299K = -9223372036854775807L;
        m6664M();
        m6658S();
    }

    @Override // p079e7.AbstractC6712b
    /* renamed from: F */
    protected void mo172F(long j, boolean z) {
        m6664M();
        this.f39289A = false;
        this.f39290B = false;
        this.f39299K = -9223372036854775807L;
        if (this.f39292D != 0) {
            m6657T();
            return;
        }
        m6659R();
        ((AbstractC12459g) C7510a.m22367e(this.f39294F)).flush();
    }

    @Override // p079e7.AbstractC6712b
    /* renamed from: J */
    protected void mo171J(C6722k[] kVarArr, long j, long j2) {
        this.f39293E = kVarArr[0];
        if (this.f39294F != null) {
            this.f39292D = 1;
        } else {
            m6661P();
        }
    }

    /* renamed from: U */
    public void m6656U(long j) {
        C7510a.m22366f(mo24579k());
        this.f39299K = j;
    }

    @Override // p079e7.AbstractC6733t
    /* renamed from: a */
    public int mo166a(C6722k kVar) {
        int i;
        if (this.f28120y.mo6668a(kVar)) {
            if (kVar.f37975O == null) {
                i = 4;
            } else {
                i = 2;
            }
            return C6732s.m24429a(i);
        } else if (C7562u.m22070r(kVar.f14329v)) {
            return C6732s.m24429a(1);
        } else {
            return C6732s.m24429a(0);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: c */
    public boolean mo165c() {
        return this.f39290B;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: e */
    public boolean mo164e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0, p079e7.AbstractC6733t
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m6660Q((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: r */
    public void mo163r(long j, long j2) {
        boolean z;
        boolean z2;
        if (mo24579k()) {
            long j3 = this.f39299K;
            if (j3 != -9223372036854775807L && j >= j3) {
                m6659R();
                this.f39290B = true;
            }
        }
        if (!this.f39290B) {
            if (this.f39297I == null) {
                ((AbstractC12459g) C7510a.m22367e(this.f39294F)).mo5335a(j);
                try {
                    this.f39297I = ((AbstractC12459g) C7510a.m22367e(this.f39294F)).mo5334b();
                } catch (C12460h e) {
                    m6662O(e);
                    return;
                }
            }
            if (getState() == 2) {
                if (this.f39296H != null) {
                    long N = m6663N();
                    z = false;
                    while (N <= j) {
                        this.f39298J++;
                        N = m6663N();
                        z = true;
                    }
                } else {
                    z = false;
                }
                AbstractC12464k kVar = this.f39297I;
                if (kVar != null) {
                    if (kVar.m20299k()) {
                        if (!z && m6663N() == Long.MAX_VALUE) {
                            if (this.f39292D == 2) {
                                m6657T();
                            } else {
                                m6659R();
                                this.f39290B = true;
                            }
                        }
                    } else if (kVar.f17811l <= j) {
                        AbstractC12464k kVar2 = this.f39296H;
                        if (kVar2 != null) {
                            kVar2.mo5319n();
                        }
                        this.f39298J = kVar.mo153a(j);
                        this.f39296H = kVar;
                        this.f39297I = null;
                        z = true;
                    }
                }
                if (z) {
                    C7510a.m22367e(this.f39296H);
                    m6655V(this.f39296H.mo152b(j));
                }
                if (this.f39292D != 2) {
                    while (!this.f39289A) {
                        try {
                            C12463j jVar = this.f39295G;
                            if (jVar == null) {
                                jVar = ((AbstractC12459g) C7510a.m22367e(this.f39294F)).mo5332d();
                                if (jVar != null) {
                                    this.f39295G = jVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f39292D == 1) {
                                jVar.m20297m(4);
                                ((AbstractC12459g) C7510a.m22367e(this.f39294F)).mo5333c(jVar);
                                this.f39295G = null;
                                this.f39292D = 2;
                                return;
                            }
                            int K = m24584K(this.f28121z, jVar, false);
                            if (K == -4) {
                                if (jVar.m20299k()) {
                                    this.f39289A = true;
                                    this.f39291C = false;
                                } else {
                                    C6722k kVar3 = this.f28121z.f14361b;
                                    if (kVar3 != null) {
                                        jVar.f28115s = kVar3.f14333z;
                                        jVar.m20284p();
                                        boolean z3 = this.f39291C;
                                        if (!jVar.m20298l()) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        this.f39291C = z3 & z2;
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f39291C) {
                                    ((AbstractC12459g) C7510a.m22367e(this.f39294F)).mo5333c(jVar);
                                    this.f39295G = null;
                                }
                            } else if (K == -3) {
                                return;
                            }
                        } catch (C12460h e2) {
                            m6662O(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public C12466m(AbstractC12465l lVar, Looper looper, AbstractC12461i iVar) {
        super(3);
        this.f28119x = (AbstractC12465l) C7510a.m22367e(lVar);
        this.f28118w = looper == null ? null : C7557q0.m22119w(looper, this);
        this.f28120y = iVar;
        this.f28121z = new C6725l();
        this.f39299K = -9223372036854775807L;
    }
}
