package p324rg;

import fi.AbstractC7267g0;
import fi.AbstractC7299n1;
import fi.C7309p1;
import fi.C7324t;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p087ei.AbstractC6939j;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.AbstractC11363o;
import p268og.AbstractC11386t0;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11390v0;
import p268og.AbstractC11391w;
import p268og.AbstractC11392w0;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p286pi.C11773f;
import p388vh.C13508c;
import p468zh.AbstractC14662f;
import p468zh.C14659c;
import p468zh.C14660d;
import pg.AbstractC11672g;
import th.AbstractC13104g;

/* renamed from: rg.c0 */
/* loaded from: classes8.dex */
public class C12591c0 extends AbstractC12630n0 implements AbstractC11388u0 {

    /* renamed from: A */
    private final boolean f39308A;

    /* renamed from: B */
    private final boolean f39309B;

    /* renamed from: C */
    private final boolean f39310C;

    /* renamed from: D */
    private List<AbstractC11396x0> f39311D;

    /* renamed from: E */
    private AbstractC11396x0 f39312E;

    /* renamed from: F */
    private AbstractC11396x0 f39313F;

    /* renamed from: G */
    private List<AbstractC11319f1> f39314G;

    /* renamed from: H */
    private C12597d0 f39315H;

    /* renamed from: I */
    private AbstractC11392w0 f39316I;

    /* renamed from: J */
    private boolean f39317J;

    /* renamed from: K */
    private AbstractC11391w f39318K;

    /* renamed from: L */
    private AbstractC11391w f39319L;

    /* renamed from: s */
    private final EnumC11314e0 f28301s;

    /* renamed from: t */
    private AbstractC11387u f28302t;

    /* renamed from: u */
    private Collection<? extends AbstractC11388u0> f28303u;

    /* renamed from: v */
    private final AbstractC11388u0 f28304v;

    /* renamed from: w */
    private final AbstractC11301b.EnumC11302a f28305w;

    /* renamed from: x */
    private final boolean f28306x;

    /* renamed from: y */
    private final boolean f28307y;

    /* renamed from: z */
    private final boolean f28308z;

    /* renamed from: rg.c0$a */
    /* loaded from: classes8.dex */
    public class C12592a {

        /* renamed from: a */
        private AbstractC11346m f28309a;

        /* renamed from: b */
        private EnumC11314e0 f28310b;

        /* renamed from: c */
        private AbstractC11387u f28311c;

        /* renamed from: f */
        private AbstractC11301b.EnumC11302a f28314f;

        /* renamed from: i */
        private AbstractC11396x0 f28317i;

        /* renamed from: k */
        private C11142f f28319k;

        /* renamed from: l */
        private AbstractC7267g0 f28320l;

        /* renamed from: d */
        private AbstractC11388u0 f28312d = null;

        /* renamed from: e */
        private boolean f28313e = false;

        /* renamed from: g */
        private AbstractC7299n1 f28315g = AbstractC7299n1.f15779b;

        /* renamed from: h */
        private boolean f28316h = true;

        /* renamed from: j */
        private List<AbstractC11319f1> f28318j = null;

        public C12592a() {
            this.f28309a = C12591c0.this.mo6104b();
            this.f28310b = C12591c0.this.mo6108s();
            this.f28311c = C12591c0.this.getVisibility();
            this.f28314f = C12591c0.this.mo6245g();
            this.f28317i = C12591c0.this.f39312E;
            this.f28319k = C12591c0.this.getName();
            this.f28320l = C12591c0.this.getType();
        }

        /* renamed from: a */
        private static /* synthetic */ void m6431a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) {
                throw new IllegalStateException(format);
            }
        }

        /* renamed from: n */
        public AbstractC11388u0 m6418n() {
            return C12591c0.this.m6451Q0(this);
        }

        /* renamed from: o */
        AbstractC11390v0 m6417o() {
            AbstractC11388u0 u0Var = this.f28312d;
            if (u0Var == null) {
                return null;
            }
            return u0Var.mo6437f();
        }

        /* renamed from: p */
        AbstractC11392w0 m6416p() {
            AbstractC11388u0 u0Var = this.f28312d;
            if (u0Var == null) {
                return null;
            }
            return u0Var.mo6436h();
        }

        /* renamed from: q */
        public C12592a m6415q(boolean z) {
            this.f28316h = z;
            return this;
        }

        /* renamed from: r */
        public C12592a m6414r(AbstractC11301b.EnumC11302a aVar) {
            if (aVar == null) {
                m6431a(10);
            }
            this.f28314f = aVar;
            return this;
        }

        /* renamed from: s */
        public C12592a m6413s(EnumC11314e0 e0Var) {
            if (e0Var == null) {
                m6431a(6);
            }
            this.f28310b = e0Var;
            return this;
        }

        /* renamed from: t */
        public C12592a m6412t(AbstractC11301b bVar) {
            this.f28312d = (AbstractC11388u0) bVar;
            return this;
        }

        /* renamed from: u */
        public C12592a m6411u(AbstractC11346m mVar) {
            if (mVar == null) {
                m6431a(0);
            }
            this.f28309a = mVar;
            return this;
        }

        /* renamed from: v */
        public C12592a m6410v(AbstractC7299n1 n1Var) {
            if (n1Var == null) {
                m6431a(15);
            }
            this.f28315g = n1Var;
            return this;
        }

        /* renamed from: w */
        public C12592a m6409w(AbstractC11387u uVar) {
            if (uVar == null) {
                m6431a(8);
            }
            this.f28311c = uVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12591c0(AbstractC11346m mVar, AbstractC11388u0 u0Var, AbstractC11672g gVar, EnumC11314e0 e0Var, AbstractC11387u uVar, boolean z, C11142f fVar, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(mVar, gVar, fVar, null, z, a1Var);
        if (mVar == null) {
            m6456I(0);
        }
        if (gVar == null) {
            m6456I(1);
        }
        if (e0Var == null) {
            m6456I(2);
        }
        if (uVar == null) {
            m6456I(3);
        }
        if (fVar == null) {
            m6456I(4);
        }
        if (aVar == null) {
            m6456I(5);
        }
        if (a1Var == null) {
            m6456I(6);
        }
        this.f28303u = null;
        this.f39311D = Collections.emptyList();
        this.f28301s = e0Var;
        this.f28302t = uVar;
        this.f28304v = u0Var == null ? this : u0Var;
        this.f28305w = aVar;
        this.f28306x = z2;
        this.f28307y = z3;
        this.f28308z = z4;
        this.f39308A = z5;
        this.f39309B = z6;
        this.f39310C = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m6456I(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p324rg.C12591c0.m6456I(int):void");
    }

    /* renamed from: O0 */
    public static C12591c0 m6452O0(AbstractC11346m mVar, AbstractC11672g gVar, EnumC11314e0 e0Var, AbstractC11387u uVar, boolean z, C11142f fVar, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (mVar == null) {
            m6456I(7);
        }
        if (gVar == null) {
            m6456I(8);
        }
        if (e0Var == null) {
            m6456I(9);
        }
        if (uVar == null) {
            m6456I(10);
        }
        if (fVar == null) {
            m6456I(11);
        }
        if (aVar == null) {
            m6456I(12);
        }
        if (a1Var == null) {
            m6456I(13);
        }
        return new C12591c0(mVar, null, gVar, e0Var, uVar, z, fVar, aVar, a1Var, z2, z3, z4, z5, z6, z7);
    }

    /* renamed from: S0 */
    private AbstractC11299a1 m6449S0(boolean z, AbstractC11388u0 u0Var) {
        AbstractC11299a1 a1Var;
        if (z) {
            if (u0Var == null) {
                u0Var = mo6162a();
            }
            a1Var = u0Var.mo6102j();
        } else {
            a1Var = AbstractC11299a1.f25230a;
        }
        if (a1Var == null) {
            m6456I(28);
        }
        return a1Var;
    }

    /* renamed from: T0 */
    private static AbstractC11397y m6448T0(C7309p1 p1Var, AbstractC11386t0 t0Var) {
        if (p1Var == null) {
            m6456I(30);
        }
        if (t0Var == null) {
            m6456I(31);
        }
        if (t0Var.mo6239p0() != null) {
            return t0Var.mo6239p0().mo6167c(p1Var);
        }
        return null;
    }

    /* renamed from: Y0 */
    private static AbstractC11387u m6443Y0(AbstractC11387u uVar, AbstractC11301b.EnumC11302a aVar) {
        if (aVar != AbstractC11301b.EnumC11302a.FAKE_OVERRIDE || !C11373t.m10169g(uVar.mo10150f())) {
            return uVar;
        }
        return C11373t.f25302h;
    }

    /* renamed from: d1 */
    private static AbstractC11396x0 m6439d1(C7309p1 p1Var, AbstractC11388u0 u0Var, AbstractC11396x0 x0Var) {
        AbstractC7267g0 p = p1Var.m22970p(x0Var.getType(), EnumC7338w1.IN_VARIANCE);
        if (p == null) {
            return null;
        }
        return new C12605f0(u0Var, new C14659c(u0Var, p, ((AbstractC14662f) x0Var.getValue()).mo47a(), x0Var.getValue()), x0Var.getAnnotations());
    }

    /* renamed from: e1 */
    private static AbstractC11396x0 m6438e1(C7309p1 p1Var, AbstractC11388u0 u0Var, AbstractC11396x0 x0Var) {
        AbstractC7267g0 p = p1Var.m22970p(x0Var.getType(), EnumC7338w1.IN_VARIANCE);
        if (p == null) {
            return null;
        }
        return new C12605f0(u0Var, new C14660d(u0Var, p, x0Var.getValue()), x0Var.getAnnotations());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p268og.AbstractC11301b
    /* renamed from: B0 */
    public void mo6272B0(Collection<? extends AbstractC11301b> collection) {
        if (collection == 0) {
            m6456I(40);
        }
        this.f28303u = collection;
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return oVar.mo7601i(this, d);
    }

    @Override // p324rg.AbstractC12624m0, p268og.AbstractC11297a
    /* renamed from: J */
    public AbstractC11396x0 mo6266J() {
        return this.f39312E;
    }

    @Override // p324rg.AbstractC12624m0, p268og.AbstractC11297a
    /* renamed from: M */
    public AbstractC11396x0 mo6264M() {
        return this.f39313F;
    }

    @Override // p268og.AbstractC11388u0
    /* renamed from: N */
    public AbstractC11391w mo6454N() {
        return this.f39319L;
    }

    /* renamed from: N0 */
    public AbstractC11388u0 mo6270E0(AbstractC11346m mVar, EnumC11314e0 e0Var, AbstractC11387u uVar, AbstractC11301b.EnumC11302a aVar, boolean z) {
        AbstractC11388u0 n = m6444X0().m6411u(mVar).m6412t(null).m6413s(e0Var).m6409w(uVar).m6414r(aVar).m6415q(z).m6418n();
        if (n == null) {
            m6456I(42);
        }
        return n;
    }

    /* renamed from: P0 */
    protected C12591c0 mo60P0(AbstractC11346m mVar, EnumC11314e0 e0Var, AbstractC11387u uVar, AbstractC11388u0 u0Var, AbstractC11301b.EnumC11302a aVar, C11142f fVar, AbstractC11299a1 a1Var) {
        if (mVar == null) {
            m6456I(32);
        }
        if (e0Var == null) {
            m6456I(33);
        }
        if (uVar == null) {
            m6456I(34);
        }
        if (aVar == null) {
            m6456I(35);
        }
        if (fVar == null) {
            m6456I(36);
        }
        if (a1Var == null) {
            m6456I(37);
        }
        return new C12591c0(mVar, u0Var, getAnnotations(), e0Var, uVar, mo6277L(), fVar, aVar, a1Var, mo6433w0(), mo59Y(), mo6114h0(), mo6120V(), isExternal(), mo6432z());
    }

    /* renamed from: Q0 */
    protected AbstractC11388u0 m6451Q0(C12592a aVar) {
        List<AbstractC11319f1> list;
        AbstractC11396x0 x0Var;
        AbstractC11396x0 x0Var2;
        C12597d0 d0Var;
        C12603e0 e0Var;
        C12631o oVar;
        Function0<AbstractC6939j<AbstractC13104g<?>>> function0;
        AbstractC7267g0 g0Var;
        if (aVar == null) {
            m6456I(29);
        }
        C12591c0 P0 = mo60P0(aVar.f28309a, aVar.f28310b, aVar.f28311c, aVar.f28312d, aVar.f28314f, aVar.f28319k, m6449S0(aVar.f28313e, aVar.f28312d));
        if (aVar.f28318j == null) {
            list = getTypeParameters();
        } else {
            list = aVar.f28318j;
        }
        ArrayList arrayList = new ArrayList(list.size());
        C7309p1 b = C7324t.m22917b(list, aVar.f28315g, P0, arrayList);
        AbstractC7267g0 g0Var2 = aVar.f28320l;
        AbstractC7267g0 p = b.m22970p(g0Var2, EnumC7338w1.OUT_VARIANCE);
        C12631o oVar2 = null;
        if (p == null) {
            return null;
        }
        AbstractC7267g0 p2 = b.m22970p(g0Var2, EnumC7338w1.IN_VARIANCE);
        if (p2 != null) {
            P0.mo58Z0(p2);
        }
        AbstractC11396x0 x0Var3 = aVar.f28317i;
        if (x0Var3 != null) {
            AbstractC11396x0 c = x0Var3.mo6167c(b);
            if (c == null) {
                return null;
            }
            x0Var = c;
        } else {
            x0Var = null;
        }
        AbstractC11396x0 x0Var4 = this.f39313F;
        if (x0Var4 != null) {
            x0Var2 = m6438e1(b, P0, x0Var4);
        } else {
            x0Var2 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC11396x0 x0Var5 : this.f39311D) {
            AbstractC11396x0 d1 = m6439d1(b, P0, x0Var5);
            if (d1 != null) {
                arrayList2.add(d1);
            }
        }
        P0.m6441b1(p, arrayList, x0Var, x0Var2, arrayList2);
        if (this.f39315H == null) {
            d0Var = null;
        } else {
            d0Var = new C12597d0(P0, this.f39315H.getAnnotations(), aVar.f28310b, m6443Y0(this.f39315H.getVisibility(), aVar.f28314f), this.f39315H.mo6466D(), this.f39315H.isExternal(), this.f39315H.isInline(), aVar.f28314f, aVar.m6417o(), AbstractC11299a1.f25230a);
        }
        if (d0Var != null) {
            AbstractC7267g0 returnType = this.f39315H.getReturnType();
            d0Var.m6461N0(m6448T0(b, this.f39315H));
            if (returnType != null) {
                g0Var = b.m22970p(returnType, EnumC7338w1.OUT_VARIANCE);
            } else {
                g0Var = null;
            }
            d0Var.m6397Q0(g0Var);
        }
        if (this.f39316I == null) {
            e0Var = null;
        } else {
            e0Var = new C12603e0(P0, this.f39316I.getAnnotations(), aVar.f28310b, m6443Y0(this.f39316I.getVisibility(), aVar.f28314f), this.f39316I.mo6466D(), this.f39316I.isExternal(), this.f39316I.isInline(), aVar.f28314f, aVar.m6416p(), AbstractC11299a1.f25230a);
        }
        if (e0Var != null) {
            List<AbstractC11335j1> P02 = AbstractC12632p.m6260P0(e0Var, this.f39316I.mo6242i(), b, false, false, null);
            if (P02 == null) {
                P0.m6442a1(true);
                P02 = Collections.singletonList(C12603e0.m6378P0(e0Var, C13508c.m3531j(aVar.f28309a).m13420H(), this.f39316I.mo6242i().get(0).getAnnotations()));
            }
            if (P02.size() == 1) {
                e0Var.m6461N0(m6448T0(b, this.f39316I));
                e0Var.m6376R0(P02.get(0));
            } else {
                throw new IllegalStateException();
            }
        }
        AbstractC11391w wVar = this.f39318K;
        if (wVar == null) {
            oVar = null;
        } else {
            oVar = new C12631o(wVar.getAnnotations(), P0);
        }
        AbstractC11391w wVar2 = this.f39319L;
        if (wVar2 != null) {
            oVar2 = new C12631o(wVar2.getAnnotations(), P0);
        }
        P0.m6446V0(d0Var, e0Var, oVar, oVar2);
        if (aVar.f28316h) {
            C11773f a = C11773f.m8658a();
            for (AbstractC11388u0 u0Var : mo6249d()) {
                a.add(u0Var.mo6167c(b));
            }
            P0.mo6272B0(a);
        }
        if (mo59Y() && (function0 = this.f28397r) != null) {
            P0.m6278K0(this.f28396q, function0);
        }
        return P0;
    }

    /* renamed from: R0 */
    public C12597d0 mo6437f() {
        return this.f39315H;
    }

    /* renamed from: U0 */
    public void m6447U0(C12597d0 d0Var, AbstractC11392w0 w0Var) {
        m6446V0(d0Var, w0Var, null, null);
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: V */
    public boolean mo6120V() {
        return this.f39308A;
    }

    /* renamed from: V0 */
    public void m6446V0(C12597d0 d0Var, AbstractC11392w0 w0Var, AbstractC11391w wVar, AbstractC11391w wVar2) {
        this.f39315H = d0Var;
        this.f39316I = w0Var;
        this.f39318K = wVar;
        this.f39319L = wVar2;
    }

    /* renamed from: W0 */
    public boolean m6445W0() {
        return this.f39317J;
    }

    /* renamed from: X0 */
    public C12592a m6444X0() {
        return new C12592a();
    }

    @Override // p268og.AbstractC11342k1
    /* renamed from: Y */
    public boolean mo59Y() {
        return this.f28307y;
    }

    /* renamed from: Z0 */
    public void mo58Z0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m6456I(14);
        }
    }

    /* renamed from: a1 */
    public void m6442a1(boolean z) {
        this.f39317J = z;
    }

    /* renamed from: b1 */
    public void m6441b1(AbstractC7267g0 g0Var, List<? extends AbstractC11319f1> list, AbstractC11396x0 x0Var, AbstractC11396x0 x0Var2, List<AbstractC11396x0> list2) {
        if (g0Var == null) {
            m6456I(17);
        }
        if (list == null) {
            m6456I(18);
        }
        if (list2 == null) {
            m6456I(19);
        }
        m6297G0(g0Var);
        this.f39314G = new ArrayList(list);
        this.f39313F = x0Var2;
        this.f39312E = x0Var;
        this.f39311D = list2;
    }

    /* renamed from: c1 */
    public void m6440c1(AbstractC11387u uVar) {
        if (uVar == null) {
            m6456I(20);
        }
        this.f28302t = uVar;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: d */
    public Collection<? extends AbstractC11388u0> mo6249d() {
        Collection<? extends AbstractC11388u0> collection = this.f28303u;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m6456I(41);
        }
        return collection;
    }

    @Override // p268og.AbstractC11301b
    /* renamed from: g */
    public AbstractC11301b.EnumC11302a mo6245g() {
        AbstractC11301b.EnumC11302a aVar = this.f28305w;
        if (aVar == null) {
            m6456I(39);
        }
        return aVar;
    }

    @Override // p324rg.AbstractC12624m0, p268og.AbstractC11297a
    public AbstractC7267g0 getReturnType() {
        AbstractC7267g0 type = getType();
        if (type == null) {
            m6456I(23);
        }
        return type;
    }

    @Override // p324rg.AbstractC12624m0, p268og.AbstractC11297a
    public List<AbstractC11319f1> getTypeParameters() {
        List<AbstractC11319f1> list = this.f39314G;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    @Override // p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u uVar = this.f28302t;
        if (uVar == null) {
            m6456I(25);
        }
        return uVar;
    }

    @Override // p268og.AbstractC11388u0
    /* renamed from: h */
    public AbstractC11392w0 mo6436h() {
        return this.f39316I;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: h0 */
    public boolean mo6114h0() {
        return this.f28308z;
    }

    public boolean isExternal() {
        return this.f39309B;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: s */
    public EnumC11314e0 mo6108s() {
        EnumC11314e0 e0Var = this.f28301s;
        if (e0Var == null) {
            m6456I(24);
        }
        return e0Var;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: s0 */
    public <V> V mo55s0(AbstractC11297a.AbstractC0362a<V> aVar) {
        return null;
    }

    @Override // p268og.AbstractC11388u0
    /* renamed from: t0 */
    public AbstractC11391w mo6435t0() {
        return this.f39318K;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: u0 */
    public List<AbstractC11396x0> mo6237u0() {
        List<AbstractC11396x0> list = this.f39311D;
        if (list == null) {
            m6456I(22);
        }
        return list;
    }

    @Override // p268og.AbstractC11388u0
    /* renamed from: v */
    public List<AbstractC11386t0> mo6434v() {
        ArrayList arrayList = new ArrayList(2);
        C12597d0 d0Var = this.f39315H;
        if (d0Var != null) {
            arrayList.add(d0Var);
        }
        AbstractC11392w0 w0Var = this.f39316I;
        if (w0Var != null) {
            arrayList.add(w0Var);
        }
        return arrayList;
    }

    @Override // p268og.AbstractC11342k1
    /* renamed from: w0 */
    public boolean mo6433w0() {
        return this.f28306x;
    }

    @Override // p268og.AbstractC11345l1
    /* renamed from: z */
    public boolean mo6432z() {
        return this.f39310C;
    }

    @Override // p268og.AbstractC11308c1
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public AbstractC11297a mo6167c(C7309p1 p1Var) {
        if (p1Var == null) {
            m6456I(27);
        }
        return p1Var.m22975k() ? this : m6444X0().m6410v(p1Var.m22976j()).m6412t(mo6162a()).m6418n();
    }

    @Override // p324rg.AbstractC12616k, p324rg.AbstractC12612j, p268og.AbstractC11346m
    /* renamed from: a */
    public AbstractC11388u0 mo6162a() {
        AbstractC11388u0 u0Var = this.f28304v;
        AbstractC11388u0 a = u0Var == this ? this : u0Var.mo6162a();
        if (a == null) {
            m6456I(38);
        }
        return a;
    }
}
