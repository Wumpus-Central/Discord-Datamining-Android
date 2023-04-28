package p467zg;

import fi.AbstractC7267g0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import p233mi.C10650p;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.AbstractC11387u;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p268og.EnumC11314e0;
import p324rg.C12607g0;
import p325rh.C12659d;
import pg.AbstractC11672g;

/* renamed from: zg.e */
/* loaded from: classes8.dex */
public class C14650e extends C12607g0 implements AbstractC14646a {

    /* renamed from: Q */
    public static final AbstractC11297a.AbstractC0362a<AbstractC11335j1> f39524Q = new C14651a();

    /* renamed from: R */
    public static final AbstractC11297a.AbstractC0362a<Boolean> f39525R = new C14652b();

    /* renamed from: O */
    private EnumC14653c f39526O;

    /* renamed from: P */
    private final boolean f39527P;

    /* renamed from: zg.e$a */
    /* loaded from: classes8.dex */
    static class C14651a implements AbstractC11297a.AbstractC0362a<AbstractC11335j1> {
        C14651a() {
        }
    }

    /* renamed from: zg.e$b */
    /* loaded from: classes8.dex */
    static class C14652b implements AbstractC11297a.AbstractC0362a<Boolean> {
        C14652b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zg.e$c */
    /* loaded from: classes8.dex */
    public enum EnumC14653c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: k */
        public final boolean f33131k;

        /* renamed from: l */
        public final boolean f33132l;

        EnumC14653c(boolean z, boolean z2) {
            this.f33131k = z;
            this.f33132l = z2;
        }

        /* renamed from: a */
        private static /* synthetic */ void m64a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        /* renamed from: b */
        public static EnumC14653c m63b(boolean z, boolean z2) {
            EnumC14653c cVar = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                m64a(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C14650e(AbstractC11346m mVar, AbstractC11404z0 z0Var, AbstractC11672g gVar, C11142f fVar, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var, boolean z) {
        super(mVar, z0Var, gVar, fVar, aVar, a1Var);
        if (mVar == null) {
            m72I(0);
        }
        if (gVar == null) {
            m72I(1);
        }
        if (fVar == null) {
            m72I(2);
        }
        if (aVar == null) {
            m72I(3);
        }
        if (a1Var == null) {
            m72I(4);
        }
        this.f39526O = null;
        this.f39527P = z;
    }

    /* renamed from: I */
    private static /* synthetic */ void m72I(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 13 || i == 18 || i == 21) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: p1 */
    public static C14650e m68p1(AbstractC11346m mVar, AbstractC11672g gVar, C11142f fVar, AbstractC11299a1 a1Var, boolean z) {
        if (mVar == null) {
            m72I(5);
        }
        if (gVar == null) {
            m72I(6);
        }
        if (fVar == null) {
            m72I(7);
        }
        if (a1Var == null) {
            m72I(8);
        }
        return new C14650e(mVar, null, gVar, fVar, AbstractC11301b.EnumC11302a.DECLARATION, a1Var, z);
    }

    @Override // p324rg.AbstractC12632p
    /* renamed from: Q0 */
    public boolean mo70Q0() {
        return this.f39526O.f33131k;
    }

    @Override // p324rg.AbstractC12632p, p268og.AbstractC11297a
    /* renamed from: d0 */
    public boolean mo57d0() {
        return this.f39526O.f33132l;
    }

    @Override // p324rg.C12607g0
    /* renamed from: o1 */
    public C12607g0 mo69o1(AbstractC11396x0 x0Var, AbstractC11396x0 x0Var2, List<AbstractC11396x0> list, List<? extends AbstractC11319f1> list2, List<AbstractC11335j1> list3, AbstractC7267g0 g0Var, EnumC11314e0 e0Var, AbstractC11387u uVar, Map<? extends AbstractC11297a.AbstractC0362a<?>, ?> map) {
        if (list == null) {
            m72I(9);
        }
        if (list2 == null) {
            m72I(10);
        }
        if (list3 == null) {
            m72I(11);
        }
        if (uVar == null) {
            m72I(12);
        }
        C12607g0 o1 = super.mo69o1(x0Var, x0Var2, list, list2, list3, g0Var, e0Var, uVar, map);
        m6246f1(C10650p.f23546a.m12712a(o1).m12706a());
        if (o1 == null) {
            m72I(13);
        }
        return o1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q1 */
    public C14650e mo71L0(AbstractC11346m mVar, AbstractC11397y yVar, AbstractC11301b.EnumC11302a aVar, C11142f fVar, AbstractC11672g gVar, AbstractC11299a1 a1Var) {
        if (mVar == null) {
            m72I(14);
        }
        if (aVar == null) {
            m72I(15);
        }
        if (gVar == null) {
            m72I(16);
        }
        if (a1Var == null) {
            m72I(17);
        }
        AbstractC11404z0 z0Var = (AbstractC11404z0) yVar;
        if (fVar == null) {
            fVar = getName();
        }
        C14650e eVar = new C14650e(mVar, z0Var, gVar, fVar, aVar, a1Var, this.f39527P);
        eVar.m65s1(mo70Q0(), mo57d0());
        return eVar;
    }

    /* renamed from: r1 */
    public C14650e mo62H0(AbstractC7267g0 g0Var, List<AbstractC7267g0> list, AbstractC7267g0 g0Var2, Pair<AbstractC11297a.AbstractC0362a<?>, ?> pair) {
        AbstractC11396x0 x0Var;
        if (list == null) {
            m72I(19);
        }
        if (g0Var2 == null) {
            m72I(20);
        }
        List<AbstractC11335j1> a = C14656h.m53a(list, mo6242i(), this);
        if (g0Var == null) {
            x0Var = null;
        } else {
            x0Var = C12659d.m6076i(this, g0Var, AbstractC11672g.f26044g.m9048b());
        }
        C14650e eVar = (C14650e) mo6238u().mo6210c(a).mo6199n(g0Var2).mo6195r(x0Var).mo6212a().mo6202k().build();
        if (pair != null) {
            eVar.m6256U0(pair.m15065c(), pair.m15064d());
        }
        if (eVar == null) {
            m72I(21);
        }
        return eVar;
    }

    /* renamed from: s1 */
    public void m65s1(boolean z, boolean z2) {
        this.f39526O = EnumC14653c.m63b(z, z2);
    }
}
