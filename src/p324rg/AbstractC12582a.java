package p324rg;

import fi.AbstractC7299n1;
import fi.AbstractC7304o0;
import fi.C7270h0;
import fi.C7309p1;
import fi.C7322s1;
import gi.AbstractC7664g;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11326h;
import p268og.AbstractC11363o;
import p268og.AbstractC11396x0;
import p325rh.C12661e;
import p388vh.C13508c;
import p448yh.AbstractC14411h;
import p448yh.C14408f;
import p448yh.C14421m;

/* renamed from: rg.a */
/* loaded from: classes8.dex */
public abstract class AbstractC12582a extends AbstractC12644t {

    /* renamed from: l */
    private final C11142f f28281l;

    /* renamed from: m */
    protected final AbstractC6938i<AbstractC7304o0> f28282m;

    /* renamed from: n */
    private final AbstractC6938i<AbstractC14411h> f28283n;

    /* renamed from: o */
    private final AbstractC6938i<AbstractC11396x0> f28284o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rg.a$a */
    /* loaded from: classes8.dex */
    public class C0402a implements Function0<AbstractC7304o0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: rg.a$a$a */
        /* loaded from: classes8.dex */
        public class C0403a implements Function1<AbstractC7664g, AbstractC7304o0> {
            C0403a() {
            }

            /* renamed from: a */
            public AbstractC7304o0 invoke(AbstractC7664g gVar) {
                AbstractC11326h f = gVar.mo21696f(AbstractC12582a.this);
                if (f == null) {
                    return AbstractC12582a.this.f28282m.invoke();
                }
                if (f instanceof AbstractC11316e1) {
                    return C7270h0.m23058b((AbstractC11316e1) f, C7322s1.m22940g(f.mo6111k().getParameters()));
                }
                if (f instanceof AbstractC12644t) {
                    return C7322s1.m22926u(f.mo6111k().mo4566o(gVar), ((AbstractC12644t) f).mo6117e0(gVar), this);
                }
                return f.mo6166p();
            }
        }

        C0402a() {
        }

        /* renamed from: a */
        public AbstractC7304o0 invoke() {
            AbstractC12582a aVar = AbstractC12582a.this;
            return C7322s1.m22925v(aVar, aVar.mo6169U(), new C0403a());
        }
    }

    /* renamed from: rg.a$b */
    /* loaded from: classes8.dex */
    class C12583b implements Function0<AbstractC14411h> {
        C12583b() {
        }

        /* renamed from: a */
        public AbstractC14411h invoke() {
            return new C14408f(AbstractC12582a.this.mo6169U());
        }
    }

    /* renamed from: rg.a$c */
    /* loaded from: classes8.dex */
    class C12584c implements Function0<AbstractC11396x0> {
        C12584c() {
        }

        /* renamed from: a */
        public AbstractC11396x0 invoke() {
            return new C12636q(AbstractC12582a.this);
        }
    }

    public AbstractC12582a(AbstractC6944n nVar, C11142f fVar) {
        if (nVar == null) {
            m6475D0(0);
        }
        if (fVar == null) {
            m6475D0(1);
        }
        this.f28281l = fVar;
        this.f28282m = nVar.mo23898c(new C0402a());
        this.f28283n = nVar.mo23898c(new C12583b());
        this.f28284o = nVar.mo23898c(new C12584c());
    }

    /* renamed from: D0 */
    private static /* synthetic */ void m6475D0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) {
            throw new IllegalStateException(format);
        }
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return oVar.mo6316h(this, d);
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: G */
    public AbstractC14411h mo6176G(AbstractC7299n1 n1Var) {
        if (n1Var == null) {
            m6475D0(15);
        }
        AbstractC14411h I = mo6163I(n1Var, C13508c.m3526o(C12661e.m6047g(this)));
        if (I == null) {
            m6475D0(16);
        }
        return I;
    }

    /* renamed from: G0 */
    public AbstractC11313e mo6167c(C7309p1 p1Var) {
        if (p1Var == null) {
            m6475D0(18);
        }
        if (p1Var.m22975k()) {
            return this;
        }
        return new C12641s(this, p1Var);
    }

    @Override // p324rg.AbstractC12644t
    /* renamed from: I */
    public AbstractC14411h mo6163I(AbstractC7299n1 n1Var, AbstractC7664g gVar) {
        if (n1Var == null) {
            m6475D0(10);
        }
        if (gVar == null) {
            m6475D0(11);
        }
        if (n1Var.mo22911f()) {
            AbstractC14411h e0 = mo6117e0(gVar);
            if (e0 == null) {
                m6475D0(12);
            }
            return e0;
        }
        return new C14421m(mo6117e0(gVar), C7309p1.m22979g(n1Var));
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: J0 */
    public AbstractC11396x0 mo6174J0() {
        AbstractC11396x0 invoke = this.f28284o.invoke();
        if (invoke == null) {
            m6475D0(5);
        }
        return invoke;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: R */
    public AbstractC14411h mo6170R() {
        AbstractC14411h invoke = this.f28283n.invoke();
        if (invoke == null) {
            m6475D0(4);
        }
        return invoke;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: U */
    public AbstractC14411h mo6169U() {
        AbstractC14411h e0 = mo6117e0(C13508c.m3526o(C12661e.m6047g(this)));
        if (e0 == null) {
            m6475D0(17);
        }
        return e0;
    }

    @Override // p268og.AbstractC11313e
    /* renamed from: W */
    public List<AbstractC11396x0> mo6168W() {
        List<AbstractC11396x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6475D0(6);
        }
        return emptyList;
    }

    @Override // p324rg.AbstractC12644t, p268og.AbstractC11313e, p268og.AbstractC11346m
    /* renamed from: a */
    public AbstractC11313e mo6162a() {
        return this;
    }

    @Override // p268og.AbstractC11334j0
    public C11142f getName() {
        C11142f fVar = this.f28281l;
        if (fVar == null) {
            m6475D0(2);
        }
        return fVar;
    }

    @Override // p268og.AbstractC11313e, p268og.AbstractC11326h
    /* renamed from: p */
    public AbstractC7304o0 mo6166p() {
        AbstractC7304o0 invoke = this.f28282m.invoke();
        if (invoke == null) {
            m6475D0(20);
        }
        return invoke;
    }
}
