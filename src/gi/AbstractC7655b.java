package gi;

import fi.AbstractC7223a0;
import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7275h1;
import fi.AbstractC7290k1;
import fi.AbstractC7292l0;
import fi.AbstractC7298n0;
import fi.AbstractC7304o0;
import fi.AbstractC7316q1;
import fi.AbstractC7335v1;
import fi.C7245f0;
import fi.C7250f1;
import fi.C7270h0;
import fi.C7278i0;
import fi.C7306p;
import fi.C7309p1;
import fi.C7318r0;
import fi.C7322s1;
import fi.C7332v;
import fi.EnumC7338w1;
import java.util.Collection;
import java.util.List;
import ki.C9883a;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9612c;
import p182ji.AbstractC9613d;
import p182ji.AbstractC9614e;
import p182ji.AbstractC9615f;
import p182ji.AbstractC9616g;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9619j;
import p182ji.AbstractC9620k;
import p182ji.AbstractC9621l;
import p182ji.AbstractC9622m;
import p182ji.AbstractC9623n;
import p182ji.AbstractC9624o;
import p182ji.AbstractC9628r;
import p182ji.AbstractC9630t;
import p182ji.C9626q;
import p182ji.EnumC9611b;
import p182ji.EnumC9631u;
import p217lg.AbstractC10420h;
import p217lg.C10434k;
import p217lg.EnumC10426i;
import p249nh.C11137c;
import p249nh.C11138d;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11329h1;
import p268og.C11318f0;
import p268og.C11403z;
import p268og.EnumC11317f;
import p325rh.C12665g;
import p388vh.C13508c;
import sh.C12899a;
import th.C13115n;

/* renamed from: gi.b */
/* loaded from: classes8.dex */
public interface AbstractC7655b extends AbstractC7316q1, AbstractC9628r {

    /* renamed from: gi.b$a */
    /* loaded from: classes8.dex */
    public static final class C7656a {

        /* renamed from: gi.b$a$a */
        /* loaded from: classes8.dex */
        public static final class C0242a extends C7250f1.AbstractC7253c.AbstractC7254a {

            /* renamed from: a */
            final /* synthetic */ AbstractC7655b f16657a;

            /* renamed from: b */
            final /* synthetic */ C7309p1 f16658b;

            C0242a(AbstractC7655b bVar, C7309p1 p1Var) {
                this.f16657a = bVar;
                this.f16658b = p1Var;
            }

            @Override // fi.C7250f1.AbstractC7253c
            /* renamed from: a */
            public AbstractC9620k mo21709a(C7250f1 state, AbstractC9618i type) {
                C9971q.m14633g(state, "state");
                C9971q.m14633g(type, "type");
                AbstractC7655b bVar = this.f16657a;
                C7309p1 p1Var = this.f16658b;
                AbstractC9620k m = bVar.mo5907m(type);
                C9971q.m14635e(m, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                AbstractC7267g0 n = p1Var.m22972n((AbstractC7267g0) m, EnumC7338w1.INVARIANT);
                C9971q.m14634f(n, "substitutor.safeSubstitu…VARIANT\n                )");
                AbstractC9620k f = bVar.mo5921f(n);
                C9971q.m14636d(f);
                return f;
            }
        }

        /* renamed from: A */
        public static EnumC9631u m21778A(AbstractC7655b bVar, AbstractC9622m receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7290k1) {
                EnumC7338w1 b = ((AbstractC7290k1) receiver).mo22906b();
                C9971q.m14634f(b, "this.projectionKind");
                return C9626q.m15919a(b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: B */
        public static EnumC9631u m21777B(AbstractC7655b bVar, AbstractC9624o receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC11319f1) {
                EnumC7338w1 m = ((AbstractC11319f1) receiver).mo6392m();
                C9971q.m14634f(m, "this.variance");
                return C9626q.m15919a(m);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: C */
        public static boolean m21776C(AbstractC7655b bVar, AbstractC9618i receiver, C11137c fqName) {
            C9971q.m14633g(receiver, "$receiver");
            C9971q.m14633g(fqName, "fqName");
            if (receiver instanceof AbstractC7267g0) {
                return ((AbstractC7267g0) receiver).getAnnotations().mo9037l(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: D */
        public static boolean m21775D(AbstractC7655b bVar, AbstractC9624o receiver, AbstractC9623n nVar) {
            boolean z;
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC11319f1) {
                if (nVar == null) {
                    z = true;
                } else {
                    z = nVar instanceof AbstractC7268g1;
                }
                if (z) {
                    return C9883a.m15092m((AbstractC11319f1) receiver, (AbstractC7268g1) nVar, null, 4, null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: E */
        public static boolean m21774E(AbstractC7655b bVar, AbstractC9620k a, AbstractC9620k b) {
            C9971q.m14633g(a, "a");
            C9971q.m14633g(b, "b");
            if (!(a instanceof AbstractC7304o0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a + ", " + C9951f0.m14684b(a.getClass())).toString());
            } else if (!(b instanceof AbstractC7304o0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b + ", " + C9951f0.m14684b(b.getClass())).toString());
            } else if (((AbstractC7304o0) a).mo5174L0() == ((AbstractC7304o0) b).mo5174L0()) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: F */
        public static AbstractC9618i m21773F(AbstractC7655b bVar, List<? extends AbstractC9618i> types) {
            C9971q.m14633g(types, "types");
            return C7658d.m21706a(types);
        }

        /* renamed from: G */
        public static boolean m21772G(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                return AbstractC10420h.m13361v0((AbstractC7268g1) receiver, C10434k.C10435a.f22902b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: H */
        public static boolean m21771H(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                return ((AbstractC7268g1) receiver).mo4565p() instanceof AbstractC11313e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: I */
        public static boolean m21770I(AbstractC7655b bVar, AbstractC9623n receiver) {
            AbstractC11313e eVar;
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                AbstractC11326h p = ((AbstractC7268g1) receiver).mo4565p();
                if (p instanceof AbstractC11313e) {
                    eVar = (AbstractC11313e) p;
                } else {
                    eVar = null;
                }
                if (eVar == null || !C11318f0.m10213a(eVar) || eVar.mo6116g() == EnumC11317f.ENUM_ENTRY || eVar.mo6116g() == EnumC11317f.ANNOTATION_CLASS) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: J */
        public static boolean m21769J(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                return ((AbstractC7268g1) receiver).mo4564q();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: K */
        public static boolean m21768K(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                return C7278i0.m23035a((AbstractC7267g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: L */
        public static boolean m21767L(AbstractC7655b bVar, AbstractC9623n receiver) {
            AbstractC11313e eVar;
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                AbstractC11326h p = ((AbstractC7268g1) receiver).mo4565p();
                AbstractC11329h1<AbstractC7304o0> h1Var = null;
                if (p instanceof AbstractC11313e) {
                    eVar = (AbstractC11313e) p;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    h1Var = eVar.mo6121S();
                }
                return h1Var instanceof C11403z;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: M */
        public static boolean m21766M(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                return receiver instanceof C13115n;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: N */
        public static boolean m21765N(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                return receiver instanceof C7245f0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: O */
        public static boolean m21764O(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7304o0) {
                return ((AbstractC7304o0) receiver).mo5171O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: P */
        public static boolean m21763P(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            return receiver instanceof AbstractC7292l0;
        }

        /* renamed from: Q */
        public static boolean m21762Q(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                return AbstractC10420h.m13361v0((AbstractC7268g1) receiver, C10434k.C10435a.f22904c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: R */
        public static boolean m21761R(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                return C7322s1.m22935l((AbstractC7267g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: S */
        public static boolean m21760S(AbstractC7655b bVar, AbstractC9613d receiver) {
            C9971q.m14633g(receiver, "$receiver");
            return receiver instanceof C12899a;
        }

        /* renamed from: T */
        public static boolean m21759T(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                return AbstractC10420h.m13368r0((AbstractC7267g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: U */
        public static boolean m21758U(AbstractC7655b bVar, AbstractC9613d receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof C7667i) {
                return ((C7667i) receiver).m21687Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: V */
        public static boolean m21757V(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7304o0) {
                if (!C7278i0.m23035a((AbstractC7267g0) receiver)) {
                    AbstractC7304o0 o0Var = (AbstractC7304o0) receiver;
                    if (!(o0Var.mo5172N0().mo4565p() instanceof AbstractC11316e1) && (o0Var.mo5172N0().mo4565p() != null || (receiver instanceof C12899a) || (receiver instanceof C7667i) || (receiver instanceof C7306p) || (o0Var.mo5172N0() instanceof C13115n) || m21756W(bVar, receiver))) {
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: W */
        private static boolean m21756W(AbstractC7655b bVar, AbstractC9620k kVar) {
            return (kVar instanceof C7318r0) && bVar.mo5919g(((C7318r0) kVar).mo22915G0());
        }

        /* renamed from: X */
        public static boolean m21755X(AbstractC7655b bVar, AbstractC9622m receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7290k1) {
                return ((AbstractC7290k1) receiver).mo22907a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: Y */
        public static boolean m21754Y(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7304o0) {
                return C9883a.m15091n((AbstractC7267g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: Z */
        public static boolean m21753Z(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7304o0) {
                return C9883a.m15090o((AbstractC7267g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: a */
        public static boolean m21752a(AbstractC7655b bVar, AbstractC9623n c1, AbstractC9623n c2) {
            C9971q.m14633g(c1, "c1");
            C9971q.m14633g(c2, "c2");
            if (!(c1 instanceof AbstractC7268g1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c1 + ", " + C9951f0.m14684b(c1.getClass())).toString());
            } else if (c2 instanceof AbstractC7268g1) {
                return C9971q.m14638b(c1, c2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c2 + ", " + C9951f0.m14684b(c2.getClass())).toString());
            }
        }

        /* renamed from: a0 */
        public static boolean m21751a0(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (!(receiver instanceof AbstractC7335v1) || !(((AbstractC7335v1) receiver).mo5172N0() instanceof AbstractC7677n)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static int m21750b(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                return ((AbstractC7267g0) receiver).mo5174L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: b0 */
        public static boolean m21749b0(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                AbstractC11326h p = ((AbstractC7268g1) receiver).mo4565p();
                if (p == null || !AbstractC10420h.m13430A0(p)) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: c */
        public static AbstractC9621l m21748c(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7304o0) {
                return (AbstractC9621l) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: c0 */
        public static AbstractC9620k m21747c0(AbstractC7655b bVar, AbstractC9616g receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7223a0) {
                return ((AbstractC7223a0) receiver).m23170V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: d */
        public static AbstractC9613d m21746d(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (!(receiver instanceof AbstractC7304o0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
            } else if (receiver instanceof C7318r0) {
                return bVar.mo5929b(((C7318r0) receiver).mo22915G0());
            } else {
                if (receiver instanceof C7667i) {
                    return (C7667i) receiver;
                }
                return null;
            }
        }

        /* renamed from: d0 */
        public static AbstractC9618i m21745d0(AbstractC7655b bVar, AbstractC9613d receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof C7667i) {
                return ((C7667i) receiver).m21688Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: e */
        public static AbstractC9614e m21744e(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (!(receiver instanceof AbstractC7304o0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
            } else if (receiver instanceof C7306p) {
                return (C7306p) receiver;
            } else {
                return null;
            }
        }

        /* renamed from: e0 */
        public static AbstractC9618i m21743e0(AbstractC7655b bVar, AbstractC9618i receiver) {
            AbstractC7335v1 b;
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7335v1) {
                b = C7657c.m21707b((AbstractC7335v1) receiver);
                return b;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: f */
        public static AbstractC9615f m21742f(AbstractC7655b bVar, AbstractC9616g receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (!(receiver instanceof AbstractC7223a0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
            } else if (receiver instanceof C7332v) {
                return (C7332v) receiver;
            } else {
                return null;
            }
        }

        /* renamed from: f0 */
        public static C7250f1 m21741f0(AbstractC7655b bVar, boolean z, boolean z2) {
            return C7654a.m21779b(z, z2, bVar, null, null, 24, null);
        }

        /* renamed from: g */
        public static AbstractC9616g m21740g(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                AbstractC7335v1 Q0 = ((AbstractC7267g0) receiver).mo22868Q0();
                if (Q0 instanceof AbstractC7223a0) {
                    return (AbstractC7223a0) Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: g0 */
        public static AbstractC9620k m21739g0(AbstractC7655b bVar, AbstractC9614e receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof C7306p) {
                return ((C7306p) receiver).m22991Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: h */
        public static AbstractC9619j m21738h(AbstractC7655b bVar, AbstractC9616g receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (!(receiver instanceof AbstractC7223a0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
            } else if (receiver instanceof AbstractC7298n0) {
                return (AbstractC7298n0) receiver;
            } else {
                return null;
            }
        }

        /* renamed from: h0 */
        public static int m21737h0(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                return ((AbstractC7268g1) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: i */
        public static AbstractC9620k m21736i(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                AbstractC7335v1 Q0 = ((AbstractC7267g0) receiver).mo22868Q0();
                if (Q0 instanceof AbstractC7304o0) {
                    return (AbstractC7304o0) Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: i0 */
        public static Collection<AbstractC9618i> m21735i0(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            AbstractC9623n a = bVar.mo5931a(receiver);
            if (a instanceof C13115n) {
                return ((C13115n) a).m4580g();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: j */
        public static AbstractC9622m m21734j(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                return C9883a.m15104a((AbstractC7267g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: j0 */
        public static AbstractC9622m m21733j0(AbstractC7655b bVar, AbstractC9612c receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof C7668j) {
                return ((C7668j) receiver).mo5160b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: k */
        public static AbstractC9620k m21732k(AbstractC7655b bVar, AbstractC9620k type, EnumC9611b status) {
            C9971q.m14633g(type, "type");
            C9971q.m14633g(status, "status");
            if (type instanceof AbstractC7304o0) {
                return C7673k.m21678b((AbstractC7304o0) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + C9951f0.m14684b(type.getClass())).toString());
        }

        /* renamed from: k0 */
        public static C7250f1.AbstractC7253c m21731k0(AbstractC7655b bVar, AbstractC9620k type) {
            C9971q.m14633g(type, "type");
            if (type instanceof AbstractC7304o0) {
                return new C0242a(bVar, AbstractC7275h1.f15749c.m23040a((AbstractC7267g0) type).m23003c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + C9951f0.m14684b(type.getClass())).toString());
        }

        /* renamed from: l */
        public static EnumC9611b m21730l(AbstractC7655b bVar, AbstractC9613d receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof C7667i) {
                return ((C7667i) receiver).m21690W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: l0 */
        public static Collection<AbstractC9618i> m21729l0(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                Collection<AbstractC7267g0> m = ((AbstractC7268g1) receiver).mo4568m();
                C9971q.m14634f(m, "this.supertypes");
                return m;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: m */
        public static AbstractC9618i m21728m(AbstractC7655b bVar, AbstractC9620k lowerBound, AbstractC9620k upperBound) {
            C9971q.m14633g(lowerBound, "lowerBound");
            C9971q.m14633g(upperBound, "upperBound");
            if (!(lowerBound instanceof AbstractC7304o0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C9951f0.m14684b(bVar.getClass())).toString());
            } else if (upperBound instanceof AbstractC7304o0) {
                return C7270h0.m23056d((AbstractC7304o0) lowerBound, (AbstractC7304o0) upperBound);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C9951f0.m14684b(bVar.getClass())).toString());
            }
        }

        /* renamed from: m0 */
        public static AbstractC9612c m21727m0(AbstractC7655b bVar, AbstractC9613d receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof C7667i) {
                return ((C7667i) receiver).mo5172N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: n */
        public static AbstractC9622m m21726n(AbstractC7655b bVar, AbstractC9618i receiver, int i) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                return ((AbstractC7267g0) receiver).mo5174L0().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: n0 */
        public static AbstractC9623n m21725n0(AbstractC7655b bVar, AbstractC9620k receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7304o0) {
                return ((AbstractC7304o0) receiver).mo5172N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: o */
        public static List<AbstractC9622m> m21724o(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                return ((AbstractC7267g0) receiver).mo5174L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: o0 */
        public static AbstractC9620k m21723o0(AbstractC7655b bVar, AbstractC9616g receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7223a0) {
                return ((AbstractC7223a0) receiver).m23169W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: p */
        public static C11138d m21722p(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                AbstractC11326h p = ((AbstractC7268g1) receiver).mo4565p();
                C9971q.m14635e(p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C13508c.m3528m((AbstractC11313e) p);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: p0 */
        public static AbstractC9618i m21721p0(AbstractC7655b bVar, AbstractC9618i receiver, boolean z) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC9620k) {
                return bVar.mo5925d((AbstractC9620k) receiver, z);
            }
            if (receiver instanceof AbstractC9616g) {
                AbstractC9616g gVar = (AbstractC9616g) receiver;
                return bVar.mo5926c0(bVar.mo5925d(bVar.mo5923e(gVar), z), bVar.mo5925d(bVar.mo5927c(gVar), z));
            }
            throw new IllegalStateException("sealed".toString());
        }

        /* renamed from: q */
        public static AbstractC9624o m21720q(AbstractC7655b bVar, AbstractC9623n receiver, int i) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                AbstractC11319f1 f1Var = ((AbstractC7268g1) receiver).getParameters().get(i);
                C9971q.m14634f(f1Var, "this.parameters[index]");
                return f1Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: q0 */
        public static AbstractC9620k m21719q0(AbstractC7655b bVar, AbstractC9620k receiver, boolean z) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7304o0) {
                return ((AbstractC7304o0) receiver).mo5166U0(z);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: r */
        public static List<AbstractC9624o> m21718r(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                List<AbstractC11319f1> parameters = ((AbstractC7268g1) receiver).getParameters();
                C9971q.m14634f(parameters, "this.parameters");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: s */
        public static EnumC10426i m21717s(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                AbstractC11326h p = ((AbstractC7268g1) receiver).mo4565p();
                C9971q.m14635e(p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC10420h.m13413P((AbstractC11313e) p);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: t */
        public static EnumC10426i m21716t(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                AbstractC11326h p = ((AbstractC7268g1) receiver).mo4565p();
                C9971q.m14635e(p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC10420h.m13410S((AbstractC11313e) p);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: u */
        public static AbstractC9618i m21715u(AbstractC7655b bVar, AbstractC9624o receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC11319f1) {
                return C9883a.m15095j((AbstractC11319f1) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: v */
        public static AbstractC9618i m21714v(AbstractC7655b bVar, AbstractC9622m receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7290k1) {
                return ((AbstractC7290k1) receiver).getType().mo22868Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: w */
        public static AbstractC9624o m21713w(AbstractC7655b bVar, AbstractC9630t receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7677n) {
                return ((AbstractC7677n) receiver).m21668a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: x */
        public static AbstractC9624o m21712x(AbstractC7655b bVar, AbstractC9623n receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7268g1) {
                AbstractC11326h p = ((AbstractC7268g1) receiver).mo4565p();
                if (p instanceof AbstractC11319f1) {
                    return (AbstractC11319f1) p;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: y */
        public static AbstractC9618i m21711y(AbstractC7655b bVar, AbstractC9618i receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC7267g0) {
                return C12665g.m6023e((AbstractC7267g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }

        /* renamed from: z */
        public static List<AbstractC9618i> m21710z(AbstractC7655b bVar, AbstractC9624o receiver) {
            C9971q.m14633g(receiver, "$receiver");
            if (receiver instanceof AbstractC11319f1) {
                List<AbstractC7267g0> upperBounds = ((AbstractC11319f1) receiver).getUpperBounds();
                C9971q.m14634f(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9951f0.m14684b(receiver.getClass())).toString());
        }
    }

    @Override // p182ji.AbstractC9625p
    /* renamed from: a */
    AbstractC9623n mo5931a(AbstractC9620k kVar);

    @Override // p182ji.AbstractC9625p
    /* renamed from: b */
    AbstractC9613d mo5929b(AbstractC9620k kVar);

    @Override // p182ji.AbstractC9625p
    /* renamed from: c */
    AbstractC9620k mo5927c(AbstractC9616g gVar);

    /* renamed from: c0 */
    AbstractC9618i mo5926c0(AbstractC9620k kVar, AbstractC9620k kVar2);

    @Override // p182ji.AbstractC9625p
    /* renamed from: d */
    AbstractC9620k mo5925d(AbstractC9620k kVar, boolean z);

    @Override // p182ji.AbstractC9625p
    /* renamed from: e */
    AbstractC9620k mo5923e(AbstractC9616g gVar);

    @Override // p182ji.AbstractC9625p
    /* renamed from: f */
    AbstractC9620k mo5921f(AbstractC9618i iVar);

    @Override // p182ji.AbstractC9625p
    /* renamed from: g */
    boolean mo5919g(AbstractC9620k kVar);
}
