package io.sentry;

import io.sentry.hints.AbstractC8883b;
import io.sentry.protocol.C8975d;
import io.sentry.protocol.C8999o;
import io.sentry.protocol.C9015w;
import io.sentry.protocol.C9020z;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C9105h;
import io.sentry.util.C9111k;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.d1 */
/* loaded from: classes8.dex */
public final class C8846d1 implements AbstractC9053t, Closeable {

    /* renamed from: k */
    private final C8951o3 f19528k;

    /* renamed from: l */
    private final C9034r3 f19529l;

    /* renamed from: m */
    private final C8917k3 f19530m;

    /* renamed from: n */
    private volatile C9151y f19531n = null;

    public C8846d1(C8951o3 o3Var) {
        C8951o3 o3Var2 = (C8951o3) C9111k.m16995a(o3Var, "The SentryOptions is required.");
        this.f19528k = o3Var2;
        C9026q3 q3Var = new C9026q3(o3Var2.getInAppExcludes(), o3Var2.getInAppIncludes());
        this.f19530m = new C8917k3(q3Var);
        this.f19529l = new C9034r3(q3Var, o3Var2);
    }

    /* renamed from: C */
    private void m17901C(C8908j3 j3Var) {
        Map<String, String> a = this.f19528k.getModulesLoader().mo17755a();
        if (a != null) {
            Map<String, String> p0 = j3Var.m17736p0();
            if (p0 == null) {
                j3Var.m17726z0(a);
            } else {
                p0.putAll(a);
            }
        }
    }

    /* renamed from: H */
    private void m17900H(AbstractC8926l2 l2Var) {
        if (l2Var.m17663G() == null) {
            l2Var.m17649U("java");
        }
    }

    /* renamed from: Q */
    private void m17899Q(AbstractC8926l2 l2Var) {
        if (l2Var.m17662H() == null) {
            l2Var.m17648V(this.f19528k.getRelease());
        }
    }

    /* renamed from: R */
    private void m17898R(AbstractC8926l2 l2Var) {
        if (l2Var.m17660J() == null) {
            l2Var.m17646X(this.f19528k.getSdkVersion());
        }
    }

    /* renamed from: S */
    private void m17897S(AbstractC8926l2 l2Var) {
        if (l2Var.m17659K() == null) {
            l2Var.m17645Y(this.f19528k.getServerName());
        }
        if (this.f19528k.isAttachServerName() && l2Var.m17659K() == null) {
            m17893h();
            if (this.f19531n != null) {
                l2Var.m17645Y(this.f19531n.m16784d());
            }
        }
    }

    /* renamed from: U */
    private void m17896U(AbstractC8926l2 l2Var) {
        if (l2Var.m17658L() == null) {
            l2Var.m17642a0(new HashMap(this.f19528k.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f19528k.getTags().entrySet()) {
            if (!l2Var.m17658L().containsKey(entry.getKey())) {
                l2Var.m17644Z(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: Y */
    private void m17895Y(C8908j3 j3Var, C9116v vVar) {
        if (j3Var.m17735q0() == null) {
            List<C8999o> n0 = j3Var.m17738n0();
            ArrayList arrayList = null;
            if (n0 != null && !n0.isEmpty()) {
                for (C8999o oVar : n0) {
                    if (!(oVar.m17327g() == null || oVar.m17326h() == null)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(oVar.m17326h());
                    }
                }
            }
            if (this.f19528k.isAttachThreads()) {
                j3Var.m17752A0(this.f19529l.m17184b(arrayList));
            } else if (this.f19528k.isAttachStacktrace()) {
                if ((n0 == null || n0.isEmpty()) && !m17892i(vVar)) {
                    j3Var.m17752A0(this.f19529l.m17185a());
                }
            }
        }
    }

    /* renamed from: b0 */
    private boolean m17894b0(AbstractC8926l2 l2Var, C9116v vVar) {
        if (C9105h.m17000s(vVar)) {
            return true;
        }
        this.f19528k.getLogger().mo17722c(EnumC8942n3.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", l2Var.m17665E());
        return false;
    }

    /* renamed from: h */
    private void m17893h() {
        if (this.f19531n == null) {
            synchronized (this) {
                if (this.f19531n == null) {
                    this.f19531n = C9151y.m16783e();
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m17892i(C9116v vVar) {
        return C9105h.m17012g(vVar, AbstractC8883b.class);
    }

    /* renamed from: l */
    private void m17891l(AbstractC8926l2 l2Var) {
        if (!this.f19528k.isSendDefaultPii()) {
            return;
        }
        if (l2Var.m17655O() == null) {
            C9020z zVar = new C9020z();
            zVar.m17215q("{{auto}}");
            l2Var.m17640b0(zVar);
        } else if (l2Var.m17655O().m17221k() == null) {
            l2Var.m17655O().m17215q("{{auto}}");
        }
    }

    /* renamed from: n */
    private void m17890n(AbstractC8926l2 l2Var) {
        m17899Q(l2Var);
        m17886t(l2Var);
        m17897S(l2Var);
        m17887s(l2Var);
        m17898R(l2Var);
        m17896U(l2Var);
        m17891l(l2Var);
    }

    /* renamed from: p */
    private void m17889p(AbstractC8926l2 l2Var) {
        m17900H(l2Var);
    }

    /* renamed from: r */
    private void m17888r(C8908j3 j3Var) {
        if (this.f19528k.getProguardUuid() != null) {
            C8975d m0 = j3Var.m17739m0();
            if (m0 == null) {
                m0 = new C8975d();
            }
            if (m0.m17488c() == null) {
                m0.m17487d(new ArrayList());
            }
            List<DebugImage> c = m0.m17488c();
            if (c != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(this.f19528k.getProguardUuid());
                c.add(debugImage);
                j3Var.m17731u0(m0);
            }
        }
    }

    /* renamed from: s */
    private void m17887s(AbstractC8926l2 l2Var) {
        if (l2Var.m17667C() == null) {
            l2Var.m17653Q(this.f19528k.getDist());
        }
    }

    /* renamed from: t */
    private void m17886t(AbstractC8926l2 l2Var) {
        String str;
        if (l2Var.m17666D() == null) {
            if (this.f19528k.getEnvironment() != null) {
                str = this.f19528k.getEnvironment();
            } else {
                str = "production";
            }
            l2Var.m17652R(str);
        }
    }

    /* renamed from: z */
    private void m17885z(C8908j3 j3Var) {
        Throwable N = j3Var.m17656N();
        if (N != null) {
            j3Var.m17730v0(this.f19530m.m17687c(N));
        }
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: b */
    public C8908j3 mo17164b(C8908j3 j3Var, C9116v vVar) {
        m17889p(j3Var);
        m17885z(j3Var);
        m17888r(j3Var);
        m17901C(j3Var);
        if (m17894b0(j3Var, vVar)) {
            m17890n(j3Var);
            m17895Y(j3Var, vVar);
        }
        return j3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19531n != null) {
            this.f19531n.m16785c();
        }
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: g */
    public C9015w mo17163g(C9015w wVar, C9116v vVar) {
        m17889p(wVar);
        if (m17894b0(wVar, vVar)) {
            m17890n(wVar);
        }
        return wVar;
    }
}
