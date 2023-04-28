package p325rh;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.C7235d0;
import fi.C7241f;
import fi.C7250f1;
import fi.C7278i0;
import gi.AbstractC7659e;
import gi.AbstractC7661f;
import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11301b;
import p268og.AbstractC11310d0;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.AbstractC11367q;
import p268og.AbstractC11386t0;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p286pi.C11773f;
import p324rg.AbstractC12589b0;
import p324rg.AbstractC12632p;
import p324rg.C12591c0;
import p325rh.AbstractC12662f;
import p388vh.C13508c;

/* renamed from: rh.k */
/* loaded from: classes8.dex */
public class C12669k {

    /* renamed from: e */
    private static final List<AbstractC12662f> f28506e;

    /* renamed from: f */
    public static final C12669k f28507f;

    /* renamed from: g */
    private static final AbstractC7659e.AbstractC7660a f28508g;

    /* renamed from: a */
    private final AbstractC7664g f28509a;

    /* renamed from: b */
    private final AbstractC7661f f28510b;

    /* renamed from: c */
    private final AbstractC7659e.AbstractC7660a f28511c;

    /* renamed from: d */
    private final Function2<AbstractC7267g0, AbstractC7267g0, Boolean> f28512d;

    /* renamed from: rh.k$a */
    /* loaded from: classes8.dex */
    static class C12670a implements AbstractC7659e.AbstractC7660a {
        C12670a() {
        }

        /* renamed from: b */
        private static /* synthetic */ void m5978b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gi.AbstractC7659e.AbstractC7660a
        /* renamed from: a */
        public boolean mo5979a(AbstractC7268g1 g1Var, AbstractC7268g1 g1Var2) {
            if (g1Var == null) {
                m5978b(0);
            }
            if (g1Var2 == null) {
                m5978b(1);
            }
            return g1Var.equals(g1Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.k$b */
    /* loaded from: classes8.dex */
    public static class C12671b implements Function2<D, D, Pair<AbstractC11297a, AbstractC11297a>> {
        C12671b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Log/a;Log/a;>; */
        /* renamed from: a */
        public Pair invoke(AbstractC11297a aVar, AbstractC11297a aVar2) {
            return new Pair(aVar, aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.k$c */
    /* loaded from: classes8.dex */
    public static class C12672c implements Function1<AbstractC11301b, Boolean> {

        /* renamed from: k */
        final /* synthetic */ AbstractC11346m f28513k;

        C12672c(AbstractC11346m mVar) {
            this.f28513k = mVar;
        }

        /* renamed from: a */
        public Boolean invoke(AbstractC11301b bVar) {
            return Boolean.valueOf(bVar.mo6104b() == this.f28513k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.k$d */
    /* loaded from: classes8.dex */
    public static class C12673d implements Function1<AbstractC11301b, AbstractC11297a> {
        C12673d() {
        }

        /* renamed from: a */
        public AbstractC11301b invoke(AbstractC11301b bVar) {
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.k$e */
    /* loaded from: classes8.dex */
    public static class C12674e implements Function1<AbstractC11301b, Boolean> {

        /* renamed from: k */
        final /* synthetic */ AbstractC11313e f28514k;

        C12674e(AbstractC11313e eVar) {
            this.f28514k = eVar;
        }

        /* renamed from: a */
        public Boolean invoke(AbstractC11301b bVar) {
            boolean z = false;
            if (!C11373t.m10169g(bVar.getVisibility()) && C11373t.m10168h(bVar, this.f28514k, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.k$f */
    /* loaded from: classes8.dex */
    public static class C12675f implements Function1<AbstractC11301b, AbstractC11297a> {
        C12675f() {
        }

        /* renamed from: a */
        public AbstractC11297a invoke(AbstractC11301b bVar) {
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.k$g */
    /* loaded from: classes8.dex */
    public static class C12676g implements Function1<AbstractC11301b, Unit> {

        /* renamed from: k */
        final /* synthetic */ AbstractC12668j f28515k;

        /* renamed from: l */
        final /* synthetic */ AbstractC11301b f28516l;

        C12676g(AbstractC12668j jVar, AbstractC11301b bVar) {
            this.f28515k = jVar;
            this.f28516l = bVar;
        }

        /* renamed from: a */
        public Unit invoke(AbstractC11301b bVar) {
            this.f28515k.mo6019b(this.f28516l, bVar);
            return Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.k$h */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C12677h {

        /* renamed from: a */
        static final /* synthetic */ int[] f28517a;

        /* renamed from: b */
        static final /* synthetic */ int[] f28518b;

        /* renamed from: c */
        static final /* synthetic */ int[] f28519c;

        static {
            int[] iArr = new int[EnumC11314e0.values().length];
            f28519c = iArr;
            try {
                iArr[EnumC11314e0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28519c[EnumC11314e0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28519c[EnumC11314e0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28519c[EnumC11314e0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C12678i.EnumC12679a.values().length];
            f28518b = iArr2;
            try {
                iArr2[C12678i.EnumC12679a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28518b[C12678i.EnumC12679a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28518b[C12678i.EnumC12679a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[AbstractC12662f.EnumC12664b.values().length];
            f28517a = iArr3;
            try {
                iArr3[AbstractC12662f.EnumC12664b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28517a[AbstractC12662f.EnumC12664b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28517a[AbstractC12662f.EnumC12664b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28517a[AbstractC12662f.EnumC12664b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* renamed from: rh.k$i */
    /* loaded from: classes8.dex */
    public static class C12678i {

        /* renamed from: c */
        private static final C12678i f28520c = new C12678i(EnumC12679a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        private final EnumC12679a f28521a;

        /* renamed from: b */
        private final String f28522b;

        /* renamed from: rh.k$i$a */
        /* loaded from: classes8.dex */
        public enum EnumC12679a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public C12678i(EnumC12679a aVar, String str) {
            if (aVar == null) {
                m5971a(3);
            }
            if (str == null) {
                m5971a(4);
            }
            this.f28521a = aVar;
            this.f28522b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void m5971a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = r2
                goto L_0x001c
            L_0x001b:
                r5 = r1
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p325rh.C12669k.C12678i.m5971a(int):void");
        }

        /* renamed from: b */
        public static C12678i m5970b(String str) {
            if (str == null) {
                m5971a(2);
            }
            return new C12678i(EnumC12679a.CONFLICT, str);
        }

        /* renamed from: d */
        public static C12678i m5968d(String str) {
            if (str == null) {
                m5971a(1);
            }
            return new C12678i(EnumC12679a.INCOMPATIBLE, str);
        }

        /* renamed from: e */
        public static C12678i m5967e() {
            C12678i iVar = f28520c;
            if (iVar == null) {
                m5971a(0);
            }
            return iVar;
        }

        /* renamed from: c */
        public EnumC12679a m5969c() {
            EnumC12679a aVar = this.f28521a;
            if (aVar == null) {
                m5971a(5);
            }
            return aVar;
        }
    }

    static {
        List<AbstractC12662f> D0;
        D0 = C9914r.m14790D0(ServiceLoader.load(AbstractC12662f.class, AbstractC12662f.class.getClassLoader()));
        f28506e = D0;
        C12670a aVar = new C12670a();
        f28508g = aVar;
        f28507f = new C12669k(aVar, AbstractC7664g.C7665a.f16661a, AbstractC7661f.C7662a.f16660a, null);
    }

    private C12669k(AbstractC7659e.AbstractC7660a aVar, AbstractC7664g gVar, AbstractC7661f fVar, Function2<AbstractC7267g0, AbstractC7267g0, Boolean> function2) {
        if (aVar == null) {
            m6005a(5);
        }
        if (gVar == null) {
            m6005a(6);
        }
        if (fVar == null) {
            m6005a(7);
        }
        this.f28511c = aVar;
        this.f28509a = gVar;
        this.f28510b = fVar;
        this.f28512d = function2;
    }

    /* renamed from: A */
    private static boolean m6017A(AbstractC11386t0 t0Var, AbstractC11386t0 t0Var2) {
        if (t0Var == null || t0Var2 == null) {
            return true;
        }
        return m6010H(t0Var, t0Var2);
    }

    /* renamed from: B */
    public static boolean m6016B(AbstractC11297a aVar, AbstractC11297a aVar2) {
        if (aVar == null) {
            m6005a(67);
        }
        if (aVar2 == null) {
            m6005a(68);
        }
        AbstractC7267g0 returnType = aVar.getReturnType();
        AbstractC7267g0 returnType2 = aVar2.getReturnType();
        if (!m6010H(aVar, aVar2)) {
            return false;
        }
        C7250f1 l = f28507f.m5994l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof AbstractC11397y) {
            return m6011G(aVar, returnType, aVar2, returnType2, l);
        }
        if (aVar instanceof AbstractC11388u0) {
            AbstractC11388u0 u0Var = (AbstractC11388u0) aVar;
            AbstractC11388u0 u0Var2 = (AbstractC11388u0) aVar2;
            if (!m6017A(u0Var.mo6436h(), u0Var2.mo6436h())) {
                return false;
            }
            if (u0Var.mo6277L() && u0Var2.mo6277L()) {
                return C7241f.f15681a.m23123k(l, returnType.mo22868Q0(), returnType2.mo22868Q0());
            }
            if ((u0Var.mo6277L() || !u0Var2.mo6277L()) && m6011G(aVar, returnType, aVar2, returnType2, l)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
    }

    /* renamed from: C */
    private static boolean m6015C(AbstractC11297a aVar, Collection<AbstractC11297a> collection) {
        if (aVar == null) {
            m6005a(71);
        }
        if (collection == null) {
            m6005a(72);
        }
        for (AbstractC11297a aVar2 : collection) {
            if (!m6016B(aVar, aVar2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m6011G(AbstractC11297a aVar, AbstractC7267g0 g0Var, AbstractC11297a aVar2, AbstractC7267g0 g0Var2, C7250f1 f1Var) {
        if (aVar == null) {
            m6005a(73);
        }
        if (g0Var == null) {
            m6005a(74);
        }
        if (aVar2 == null) {
            m6005a(75);
        }
        if (g0Var2 == null) {
            m6005a(76);
        }
        if (f1Var == null) {
            m6005a(77);
        }
        return C7241f.f15681a.m23116r(f1Var, g0Var.mo22868Q0(), g0Var2.mo22868Q0());
    }

    /* renamed from: H */
    private static boolean m6010H(AbstractC11367q qVar, AbstractC11367q qVar2) {
        if (qVar == null) {
            m6005a(69);
        }
        if (qVar2 == null) {
            m6005a(70);
        }
        Integer d = C11373t.m10172d(qVar.getVisibility(), qVar2.getVisibility());
        if (d == null || d.intValue() >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public static boolean m6009I(AbstractC11310d0 d0Var, AbstractC11310d0 d0Var2, boolean z) {
        if (d0Var == null) {
            m6005a(57);
        }
        if (d0Var2 == null) {
            m6005a(58);
        }
        if (C11373t.m10169g(d0Var2.getVisibility()) || !C11373t.m10168h(d0Var2, d0Var, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public static <D extends AbstractC11297a> boolean m6008J(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            m6005a(13);
        }
        if (d2 == null) {
            m6005a(14);
        }
        if (!d.equals(d2) && C12656c.f28488a.m6094f(d.mo6162a(), d2.mo6162a(), z, z2)) {
            return true;
        }
        AbstractC11297a a = d2.mo6162a();
        for (AbstractC11297a aVar : C12661e.m6050d(d)) {
            if (C12656c.f28488a.m6094f(a, aVar, z, z2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static void m6007K(AbstractC11301b bVar, Function1<AbstractC11301b, Unit> function1) {
        AbstractC11387u uVar;
        Function1<AbstractC11301b, Unit> function12;
        if (bVar == null) {
            m6005a(107);
        }
        for (AbstractC11301b bVar2 : bVar.mo6249d()) {
            if (bVar2.getVisibility() == C11373t.f25301g) {
                m6007K(bVar2, function1);
            }
        }
        if (bVar.getVisibility() == C11373t.f25301g) {
            AbstractC11387u h = m5998h(bVar);
            if (h == null) {
                if (function1 != null) {
                    function1.invoke(bVar);
                }
                uVar = C11373t.f25299e;
            } else {
                uVar = h;
            }
            if (bVar instanceof C12591c0) {
                ((C12591c0) bVar).m6440c1(uVar);
                for (AbstractC11386t0 t0Var : ((AbstractC11388u0) bVar).mo6434v()) {
                    if (h == null) {
                        function12 = null;
                    } else {
                        function12 = function1;
                    }
                    m6007K(t0Var, function12);
                }
            } else if (bVar instanceof AbstractC12632p) {
                ((AbstractC12632p) bVar).m6240j1(uVar);
            } else {
                AbstractC12589b0 b0Var = (AbstractC12589b0) bVar;
                b0Var.m6460O0(uVar);
                if (uVar != b0Var.mo6459T().getVisibility()) {
                    b0Var.m6462M0(false);
                }
            }
        }
    }

    /* renamed from: L */
    public static <H> H m6006L(Collection<H> collection, Function1<H, AbstractC11297a> function1) {
        List j0;
        H h;
        Object T;
        Object T2;
        Object T3;
        Object T4;
        if (collection == null) {
            m6005a(78);
        }
        if (function1 == null) {
            m6005a(79);
        }
        if (collection.size() == 1) {
            T4 = C9914r.m14771T(collection);
            H h2 = (H) T4;
            if (h2 == null) {
                m6005a(80);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        j0 = C9914r.m14755j0(collection, function1);
        T = C9914r.m14771T(collection);
        H h3 = (H) T;
        AbstractC11297a invoke = function1.invoke(h3);
        for (H h4 : collection) {
            AbstractC11297a invoke2 = function1.invoke(h4);
            if (m6015C(invoke2, j0)) {
                arrayList.add(h4);
            }
            if (m6016B(invoke2, invoke) && !m6016B(invoke, invoke2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                m6005a(81);
            }
            return h3;
        } else if (arrayList.size() == 1) {
            T3 = C9914r.m14771T(arrayList);
            H h5 = (H) T3;
            if (h5 == null) {
                m6005a(82);
            }
            return h5;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    h = null;
                    break;
                }
                h = (H) it.next();
                if (!C7235d0.m23144b(function1.invoke(h).getReturnType())) {
                    break;
                }
            }
            if (h != null) {
                return h;
            }
            T2 = C9914r.m14771T(arrayList);
            H h6 = (H) T2;
            if (h6 == null) {
                m6005a(84);
            }
            return h6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m6005a(int r24) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p325rh.C12669k.m6005a(int):void");
    }

    /* renamed from: b */
    private static boolean m6004b(Collection<AbstractC11301b> collection) {
        boolean J;
        if (collection == null) {
            m6005a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        J = C9914r.m14784J(collection, new C12672c(collection.iterator().next().mo6104b()));
        return J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        r1.remove();
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m6003c(p268og.AbstractC11319f1 r4, p268og.AbstractC11319f1 r5, fi.C7250f1 r6) {
        /*
            if (r4 != 0) goto L_0x0007
            r0 = 49
            m6005a(r0)
        L_0x0007:
            if (r5 != 0) goto L_0x000e
            r0 = 50
            m6005a(r0)
        L_0x000e:
            if (r6 != 0) goto L_0x0015
            r0 = 51
            m6005a(r0)
        L_0x0015:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L_0x002e
            return r2
        L_0x002e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0032:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0059
            java.lang.Object r5 = r4.next()
            fi.g0 r5 = (fi.AbstractC7267g0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L_0x0042:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r1.next()
            fi.g0 r3 = (fi.AbstractC7267g0) r3
            boolean r3 = m6002d(r5, r3, r6)
            if (r3 == 0) goto L_0x0042
            r1.remove()
            goto L_0x0032
        L_0x0058:
            return r2
        L_0x0059:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p325rh.C12669k.m6003c(og.f1, og.f1, fi.f1):boolean");
    }

    /* renamed from: d */
    private static boolean m6002d(AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2, C7250f1 f1Var) {
        boolean z;
        if (g0Var == null) {
            m6005a(46);
        }
        if (g0Var2 == null) {
            m6005a(47);
        }
        if (f1Var == null) {
            m6005a(48);
        }
        if (!C7278i0.m23035a(g0Var) || !C7278i0.m23035a(g0Var2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return C7241f.f15681a.m23123k(f1Var, g0Var.mo22868Q0(), g0Var2.mo22868Q0());
    }

    /* renamed from: e */
    private static C12678i m6001e(AbstractC11297a aVar, AbstractC11297a aVar2) {
        boolean z;
        boolean z2 = true;
        if (aVar.mo6264M() == null) {
            z = true;
        } else {
            z = false;
        }
        if (aVar2.mo6264M() != null) {
            z2 = false;
        }
        if (z != z2) {
            return C12678i.m5968d("Receiver presence mismatch");
        }
        if (aVar.mo6242i().size() != aVar2.mo6242i().size()) {
            return C12678i.m5968d("Value parameter number mismatch");
        }
        return null;
    }

    /* renamed from: f */
    private static void m6000f(AbstractC11301b bVar, Set<AbstractC11301b> set) {
        if (bVar == null) {
            m6005a(17);
        }
        if (set == null) {
            m6005a(18);
        }
        if (bVar.mo6245g().m10224a()) {
            set.add(bVar);
        } else if (!bVar.mo6249d().isEmpty()) {
            for (AbstractC11301b bVar2 : bVar.mo6249d()) {
                m6000f(bVar2, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    /* renamed from: g */
    private static List<AbstractC7267g0> m5999g(AbstractC11297a aVar) {
        AbstractC11396x0 M = aVar.mo6264M();
        ArrayList arrayList = new ArrayList();
        if (M != null) {
            arrayList.add(M.getType());
        }
        for (AbstractC11335j1 j1Var : aVar.mo6242i()) {
            arrayList.add(j1Var.getType());
        }
        return arrayList;
    }

    /* renamed from: h */
    private static AbstractC11387u m5998h(AbstractC11301b bVar) {
        if (bVar == null) {
            m6005a(108);
        }
        Collection<? extends AbstractC11301b> d = bVar.mo6249d();
        AbstractC11387u u = m5985u(d);
        if (u == null) {
            return null;
        }
        if (bVar.mo6245g() != AbstractC11301b.EnumC11302a.FAKE_OVERRIDE) {
            return u.mo10150f();
        }
        for (AbstractC11301b bVar2 : d) {
            if (!(bVar2.mo6108s() == EnumC11314e0.ABSTRACT || bVar2.getVisibility().equals(u))) {
                return null;
            }
        }
        return u;
    }

    /* renamed from: i */
    public static C12669k m5997i(AbstractC7664g gVar, AbstractC7659e.AbstractC7660a aVar) {
        if (gVar == null) {
            m6005a(3);
        }
        if (aVar == null) {
            m6005a(4);
        }
        return new C12669k(aVar, gVar, AbstractC7661f.C7662a.f16660a, null);
    }

    /* renamed from: j */
    private static void m5996j(Collection<AbstractC11301b> collection, AbstractC11313e eVar, AbstractC12668j jVar) {
        AbstractC11387u uVar;
        if (collection == null) {
            m6005a(85);
        }
        if (eVar == null) {
            m6005a(86);
        }
        if (jVar == null) {
            m6005a(87);
        }
        Collection<AbstractC11301b> t = m5986t(eVar, collection);
        boolean isEmpty = t.isEmpty();
        if (!isEmpty) {
            collection = t;
        }
        EnumC11314e0 n = m5992n(collection, eVar);
        if (isEmpty) {
            uVar = C11373t.f25302h;
        } else {
            uVar = C11373t.f25301g;
        }
        AbstractC11301b E0 = ((AbstractC11301b) m6006L(collection, new C12673d())).mo6270E0(eVar, n, uVar, AbstractC11301b.EnumC11302a.FAKE_OVERRIDE, false);
        jVar.mo728d(E0, collection);
        jVar.mo652a(E0);
    }

    /* renamed from: k */
    private static void m5995k(AbstractC11313e eVar, Collection<AbstractC11301b> collection, AbstractC12668j jVar) {
        if (eVar == null) {
            m6005a(64);
        }
        if (collection == null) {
            m6005a(65);
        }
        if (jVar == null) {
            m6005a(66);
        }
        if (m6004b(collection)) {
            for (AbstractC11301b bVar : collection) {
                m5996j(Collections.singleton(bVar), eVar, jVar);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            m5996j(m5989q(C12687q.m5875a(linkedList), linkedList, jVar), eVar, jVar);
        }
    }

    /* renamed from: l */
    private C7250f1 m5994l(List<AbstractC11319f1> list, List<AbstractC11319f1> list2) {
        if (list == null) {
            m6005a(42);
        }
        if (list2 == null) {
            m6005a(43);
        }
        if (list.isEmpty()) {
            C7250f1 I0 = new C12680l(null, this.f28511c, this.f28509a, this.f28510b, this.f28512d).m5949I0(true, true);
            if (I0 == null) {
                m6005a(44);
            }
            return I0;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(list.get(i).mo6111k(), list2.get(i).mo6111k());
        }
        C7250f1 I02 = new C12680l(hashMap, this.f28511c, this.f28509a, this.f28510b, this.f28512d).m5949I0(true, true);
        if (I02 == null) {
            m6005a(45);
        }
        return I02;
    }

    /* renamed from: m */
    public static C12669k m5993m(AbstractC7664g gVar) {
        if (gVar == null) {
            m6005a(0);
        }
        return new C12669k(f28508g, gVar, AbstractC7661f.C7662a.f16660a, null);
    }

    /* renamed from: n */
    private static EnumC11314e0 m5992n(Collection<AbstractC11301b> collection, AbstractC11313e eVar) {
        EnumC11314e0 e0Var;
        if (collection == null) {
            m6005a(88);
        }
        if (eVar == null) {
            m6005a(89);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (AbstractC11301b bVar : collection) {
            int i = C12677h.f28519c[bVar.mo6108s().ordinal()];
            if (i == 1) {
                EnumC11314e0 e0Var2 = EnumC11314e0.FINAL;
                if (e0Var2 == null) {
                    m6005a(90);
                }
                return e0Var2;
            } else if (i == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + bVar);
            } else if (i == 3) {
                z2 = true;
            } else if (i == 4) {
                z3 = true;
            }
        }
        if (!(!eVar.mo6114h0() || eVar.mo6108s() == EnumC11314e0.ABSTRACT || eVar.mo6108s() == EnumC11314e0.SEALED)) {
            z = true;
        }
        if (z2 && !z3) {
            EnumC11314e0 e0Var3 = EnumC11314e0.OPEN;
            if (e0Var3 == null) {
                m6005a(91);
            }
            return e0Var3;
        } else if (z2 || !z3) {
            HashSet hashSet = new HashSet();
            for (AbstractC11301b bVar2 : collection) {
                hashSet.addAll(m5980z(bVar2));
            }
            return m5981y(m5988r(hashSet), z, eVar.mo6108s());
        } else {
            if (z) {
                e0Var = eVar.mo6108s();
            } else {
                e0Var = EnumC11314e0.ABSTRACT;
            }
            if (e0Var == null) {
                m6005a(92);
            }
            return e0Var;
        }
    }

    /* renamed from: o */
    private Collection<AbstractC11301b> m5991o(AbstractC11301b bVar, Collection<? extends AbstractC11301b> collection, AbstractC11313e eVar, AbstractC12668j jVar) {
        if (bVar == null) {
            m6005a(59);
        }
        if (collection == null) {
            m6005a(60);
        }
        if (eVar == null) {
            m6005a(61);
        }
        if (jVar == null) {
            m6005a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        C11773f a = C11773f.m8658a();
        for (AbstractC11301b bVar2 : collection) {
            C12678i.EnumC12679a c = m6014D(bVar2, bVar, eVar).m5969c();
            boolean I = m6009I(bVar, bVar2, false);
            int i = C12677h.f28518b[c.ordinal()];
            if (i == 1) {
                if (I) {
                    a.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i == 2) {
                if (I) {
                    jVar.mo6018c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        jVar.mo728d(bVar, a);
        return arrayList;
    }

    /* renamed from: p */
    public static <H> Collection<H> m5990p(H h, Collection<H> collection, Function1<H, AbstractC11297a> function1, Function1<H, Unit> function12) {
        if (h == null) {
            m6005a(99);
        }
        if (collection == null) {
            m6005a(100);
        }
        if (function1 == null) {
            m6005a(101);
        }
        if (function12 == null) {
            m6005a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        AbstractC11297a invoke = function1.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            AbstractC11297a invoke2 = function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                C12678i.EnumC12679a x = m5982x(invoke, invoke2);
                if (x == C12678i.EnumC12679a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x == C12678i.EnumC12679a.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private static Collection<AbstractC11301b> m5989q(AbstractC11301b bVar, Queue<AbstractC11301b> queue, AbstractC12668j jVar) {
        if (bVar == null) {
            m6005a(104);
        }
        if (queue == null) {
            m6005a(105);
        }
        if (jVar == null) {
            m6005a(106);
        }
        return m5990p(bVar, queue, new C12675f(), new C12676g(jVar, bVar));
    }

    /* renamed from: r */
    public static <D extends AbstractC11297a> Set<D> m5988r(Set<D> set) {
        boolean z;
        if (set == null) {
            m6005a(8);
        }
        if (set.isEmpty() || !C13508c.m3520u(C13508c.m3525p(set.iterator().next()))) {
            z = false;
        } else {
            z = true;
        }
        return m5987s(set, z, null, new C12671b());
    }

    /* renamed from: s */
    public static <D> Set<D> m5987s(Set<D> set, boolean z, Function0<?> function0, Function2<? super D, ? super D, Pair<AbstractC11297a, AbstractC11297a>> function2) {
        if (set == null) {
            m6005a(9);
        }
        if (function2 == null) {
            m6005a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<AbstractC11297a, AbstractC11297a> invoke = function2.invoke(obj, (Object) it.next());
                AbstractC11297a a = invoke.m15067a();
                AbstractC11297a b = invoke.m15066b();
                if (m6008J(a, b, z, true)) {
                    it.remove();
                } else if (m6008J(b, a, z, true)) {
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: t */
    private static Collection<AbstractC11301b> m5986t(AbstractC11313e eVar, Collection<AbstractC11301b> collection) {
        List Q;
        if (eVar == null) {
            m6005a(96);
        }
        if (collection == null) {
            m6005a(97);
        }
        Q = C9914r.m14774Q(collection, new C12674e(eVar));
        if (Q == null) {
            m6005a(98);
        }
        return Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p268og.AbstractC11387u m5985u(java.util.Collection<? extends p268og.AbstractC11301b> r5) {
        /*
            if (r5 != 0) goto L_0x0007
            r0 = 109(0x6d, float:1.53E-43)
            m6005a(r0)
        L_0x0007:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0010
            og.u r5 = p268og.C11373t.f25306l
            return r5
        L_0x0010:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L_0x0015:
            r2 = r1
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r0.next()
            og.b r3 = (p268og.AbstractC11301b) r3
            og.u r3 = r3.getVisibility()
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            r2 = r3
            goto L_0x0016
        L_0x002a:
            java.lang.Integer r4 = p268og.C11373t.m10172d(r3, r2)
            if (r4 != 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0016
            goto L_0x0028
        L_0x0038:
            if (r2 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.Iterator r5 = r5.iterator()
        L_0x003f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r5.next()
            og.b r0 = (p268og.AbstractC11301b) r0
            og.u r0 = r0.getVisibility()
            java.lang.Integer r0 = p268og.C11373t.m10172d(r2, r0)
            if (r0 == 0) goto L_0x005b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x003f
        L_0x005b:
            return r1
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p325rh.C12669k.m5985u(java.util.Collection):og.u");
    }

    /* renamed from: w */
    public static C12678i m5983w(AbstractC11297a aVar, AbstractC11297a aVar2) {
        boolean z;
        if (aVar == null) {
            m6005a(40);
        }
        if (aVar2 == null) {
            m6005a(41);
        }
        boolean z2 = aVar instanceof AbstractC11397y;
        if ((z2 && !(aVar2 instanceof AbstractC11397y)) || (((z = aVar instanceof AbstractC11388u0)) && !(aVar2 instanceof AbstractC11388u0))) {
            return C12678i.m5968d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        } else if (!aVar.getName().equals(aVar2.getName())) {
            return C12678i.m5968d("Name mismatch");
        } else {
            C12678i e = m6001e(aVar, aVar2);
            if (e != null) {
                return e;
            }
            return null;
        }
    }

    /* renamed from: x */
    public static C12678i.EnumC12679a m5982x(AbstractC11297a aVar, AbstractC11297a aVar2) {
        C12669k kVar = f28507f;
        C12678i.EnumC12679a c = kVar.m6014D(aVar2, aVar, null).m5969c();
        C12678i.EnumC12679a c2 = kVar.m6014D(aVar, aVar2, null).m5969c();
        C12678i.EnumC12679a aVar3 = C12678i.EnumC12679a.OVERRIDABLE;
        if (c == aVar3 && c2 == aVar3) {
            return aVar3;
        }
        C12678i.EnumC12679a aVar4 = C12678i.EnumC12679a.CONFLICT;
        if (c == aVar4 || c2 == aVar4) {
            return aVar4;
        }
        return C12678i.EnumC12679a.INCOMPATIBLE;
    }

    /* renamed from: y */
    private static EnumC11314e0 m5981y(Collection<AbstractC11301b> collection, boolean z, EnumC11314e0 e0Var) {
        EnumC11314e0 e0Var2;
        if (collection == null) {
            m6005a(93);
        }
        if (e0Var == null) {
            m6005a(94);
        }
        EnumC11314e0 e0Var3 = EnumC11314e0.ABSTRACT;
        for (AbstractC11301b bVar : collection) {
            if (!z || bVar.mo6108s() != EnumC11314e0.ABSTRACT) {
                e0Var2 = bVar.mo6108s();
            } else {
                e0Var2 = e0Var;
            }
            if (e0Var2.compareTo(e0Var3) < 0) {
                e0Var3 = e0Var2;
            }
        }
        if (e0Var3 == null) {
            m6005a(95);
        }
        return e0Var3;
    }

    /* renamed from: z */
    public static Set<AbstractC11301b> m5980z(AbstractC11301b bVar) {
        if (bVar == null) {
            m6005a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m6000f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: D */
    public C12678i m6014D(AbstractC11297a aVar, AbstractC11297a aVar2, AbstractC11313e eVar) {
        if (aVar == null) {
            m6005a(19);
        }
        if (aVar2 == null) {
            m6005a(20);
        }
        C12678i E = m6013E(aVar, aVar2, eVar, false);
        if (E == null) {
            m6005a(21);
        }
        return E;
    }

    /* renamed from: E */
    public C12678i m6013E(AbstractC11297a aVar, AbstractC11297a aVar2, AbstractC11313e eVar, boolean z) {
        boolean z2;
        if (aVar == null) {
            m6005a(22);
        }
        if (aVar2 == null) {
            m6005a(23);
        }
        C12678i F = m6012F(aVar, aVar2, z);
        if (F.m5969c() == C12678i.EnumC12679a.OVERRIDABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (AbstractC12662f fVar : f28506e) {
            if (fVar.mo1503b() != AbstractC12662f.EnumC12663a.CONFLICTS_ONLY && (!z2 || fVar.mo1503b() != AbstractC12662f.EnumC12663a.SUCCESS_ONLY)) {
                int i = C12677h.f28517a[fVar.mo1504a(aVar, aVar2, eVar).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    C12678i b = C12678i.m5970b("External condition failed");
                    if (b == null) {
                        m6005a(24);
                    }
                    return b;
                } else if (i == 3) {
                    C12678i d = C12678i.m5968d("External condition");
                    if (d == null) {
                        m6005a(25);
                    }
                    return d;
                }
            }
        }
        if (!z2) {
            return F;
        }
        for (AbstractC12662f fVar2 : f28506e) {
            if (fVar2.mo1503b() == AbstractC12662f.EnumC12663a.CONFLICTS_ONLY) {
                int i2 = C12677h.f28517a[fVar2.mo1504a(aVar, aVar2, eVar).ordinal()];
                if (i2 == 1) {
                    throw new IllegalStateException("Contract violation in " + fVar2.getClass().getName() + " condition. It's not supposed to end with success");
                } else if (i2 == 2) {
                    C12678i b2 = C12678i.m5970b("External condition failed");
                    if (b2 == null) {
                        m6005a(27);
                    }
                    return b2;
                } else if (i2 == 3) {
                    C12678i d2 = C12678i.m5968d("External condition");
                    if (d2 == null) {
                        m6005a(28);
                    }
                    return d2;
                }
            }
        }
        C12678i e = C12678i.m5967e();
        if (e == null) {
            m6005a(29);
        }
        return e;
    }

    /* renamed from: F */
    public C12678i m6012F(AbstractC11297a aVar, AbstractC11297a aVar2, boolean z) {
        if (aVar == null) {
            m6005a(30);
        }
        if (aVar2 == null) {
            m6005a(31);
        }
        C12678i w = m5983w(aVar, aVar2);
        if (w != null) {
            return w;
        }
        List<AbstractC7267g0> g = m5999g(aVar);
        List<AbstractC7267g0> g2 = m5999g(aVar2);
        List<AbstractC11319f1> typeParameters = aVar.getTypeParameters();
        List<AbstractC11319f1> typeParameters2 = aVar2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < g.size()) {
                if (!AbstractC7659e.f16659a.mo21673c(g.get(i), g2.get(i))) {
                    C12678i d = C12678i.m5968d("Type parameter number mismatch");
                    if (d == null) {
                        m6005a(33);
                    }
                    return d;
                }
                i++;
            }
            C12678i b = C12678i.m5970b("Type parameter number mismatch");
            if (b == null) {
                m6005a(34);
            }
            return b;
        }
        C7250f1 l = m5994l(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!m6003c(typeParameters.get(i2), typeParameters2.get(i2), l)) {
                C12678i d2 = C12678i.m5968d("Type parameter bounds mismatch");
                if (d2 == null) {
                    m6005a(35);
                }
                return d2;
            }
        }
        for (int i3 = 0; i3 < g.size(); i3++) {
            if (!m6002d(g.get(i3), g2.get(i3), l)) {
                C12678i d3 = C12678i.m5968d("Value parameter type mismatch");
                if (d3 == null) {
                    m6005a(36);
                }
                return d3;
            }
        }
        if (!(aVar instanceof AbstractC11397y) || !(aVar2 instanceof AbstractC11397y) || ((AbstractC11397y) aVar).isSuspend() == ((AbstractC11397y) aVar2).isSuspend()) {
            if (z) {
                AbstractC7267g0 returnType = aVar.getReturnType();
                AbstractC7267g0 returnType2 = aVar2.getReturnType();
                if (!(returnType == null || returnType2 == null)) {
                    if (C7278i0.m23035a(returnType2) && C7278i0.m23035a(returnType)) {
                        i = 1;
                    }
                    if (i == 0 && !C7241f.f15681a.m23116r(l, returnType2.mo22868Q0(), returnType.mo22868Q0())) {
                        C12678i b2 = C12678i.m5970b("Return type mismatch");
                        if (b2 == null) {
                            m6005a(38);
                        }
                        return b2;
                    }
                }
            }
            C12678i e = C12678i.m5967e();
            if (e == null) {
                m6005a(39);
            }
            return e;
        }
        C12678i b3 = C12678i.m5970b("Incompatible suspendability");
        if (b3 == null) {
            m6005a(37);
        }
        return b3;
    }

    /* renamed from: v */
    public void m5984v(C11142f fVar, Collection<? extends AbstractC11301b> collection, Collection<? extends AbstractC11301b> collection2, AbstractC11313e eVar, AbstractC12668j jVar) {
        if (fVar == null) {
            m6005a(52);
        }
        if (collection == null) {
            m6005a(53);
        }
        if (collection2 == null) {
            m6005a(54);
        }
        if (eVar == null) {
            m6005a(55);
        }
        if (jVar == null) {
            m6005a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (AbstractC11301b bVar : collection2) {
            linkedHashSet.removeAll(m5991o(bVar, collection, eVar, jVar));
        }
        m5995k(eVar, linkedHashSet, jVar);
    }
}
