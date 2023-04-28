package gi;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.C7232c1;
import fi.C7235d0;
import fi.C7245f0;
import fi.C7306p;
import fi.C7321s0;
import fi.C7337w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KDeclarationContainer;
import th.C13115n;

/* renamed from: gi.w */
/* loaded from: classes8.dex */
public final class C7686w {

    /* renamed from: a */
    public static final C7686w f16691a = new C7686w();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: gi.w$a */
    /* loaded from: classes8.dex */
    public static final class EnumC7687a extends Enum<EnumC7687a> {

        /* renamed from: k */
        public static final EnumC7687a f16692k = new C7689c("START", 0);

        /* renamed from: l */
        public static final EnumC7687a f16693l = new C0243a("ACCEPT_NULL", 1);

        /* renamed from: m */
        public static final EnumC7687a f16694m = new C7690d("UNKNOWN", 2);

        /* renamed from: n */
        public static final EnumC7687a f16695n = new C7688b("NOT_NULL", 3);

        /* renamed from: o */
        private static final /* synthetic */ EnumC7687a[] f16696o = m21651a();

        /* renamed from: gi.w$a$a */
        /* loaded from: classes8.dex */
        static final class C0243a extends EnumC7687a {
            C0243a(String str, int i) {
                super(str, i, null);
            }

            @Override // gi.C7686w.EnumC7687a
            /* renamed from: b */
            public EnumC7687a mo21648b(AbstractC7335v1 nextType) {
                C9971q.m14633g(nextType, "nextType");
                return m21650c(nextType);
            }
        }

        /* renamed from: gi.w$a$b */
        /* loaded from: classes8.dex */
        static final class C7688b extends EnumC7687a {
            C7688b(String str, int i) {
                super(str, i, null);
            }

            /* renamed from: d */
            public C7688b mo21648b(AbstractC7335v1 nextType) {
                C9971q.m14633g(nextType, "nextType");
                return this;
            }
        }

        /* renamed from: gi.w$a$c */
        /* loaded from: classes8.dex */
        static final class C7689c extends EnumC7687a {
            C7689c(String str, int i) {
                super(str, i, null);
            }

            @Override // gi.C7686w.EnumC7687a
            /* renamed from: b */
            public EnumC7687a mo21648b(AbstractC7335v1 nextType) {
                C9971q.m14633g(nextType, "nextType");
                return m21650c(nextType);
            }
        }

        /* renamed from: gi.w$a$d */
        /* loaded from: classes8.dex */
        static final class C7690d extends EnumC7687a {
            C7690d(String str, int i) {
                super(str, i, null);
            }

            @Override // gi.C7686w.EnumC7687a
            /* renamed from: b */
            public EnumC7687a mo21648b(AbstractC7335v1 nextType) {
                C9971q.m14633g(nextType, "nextType");
                EnumC7687a c = m21650c(nextType);
                if (c == EnumC7687a.f16693l) {
                    return this;
                }
                return c;
            }
        }

        private EnumC7687a(String str, int i) {
        }

        public /* synthetic */ EnumC7687a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        /* renamed from: a */
        private static final /* synthetic */ EnumC7687a[] m21651a() {
            return new EnumC7687a[]{f16692k, f16693l, f16694m, f16695n};
        }

        public static EnumC7687a valueOf(String str) {
            return (EnumC7687a) Enum.valueOf(EnumC7687a.class, str);
        }

        public static EnumC7687a[] values() {
            return (EnumC7687a[]) f16696o.clone();
        }

        /* renamed from: b */
        public abstract EnumC7687a mo21648b(AbstractC7335v1 v1Var);

        /* renamed from: c */
        protected final EnumC7687a m21650c(AbstractC7335v1 v1Var) {
            C9971q.m14633g(v1Var, "<this>");
            if (v1Var.mo5171O0()) {
                return f16693l;
            }
            if ((v1Var instanceof C7306p) && (((C7306p) v1Var).m22991Z0() instanceof C7337w0)) {
                return f16695n;
            }
            if (v1Var instanceof C7337w0) {
                return f16694m;
            }
            if (C7678o.f16685a.m21667a(v1Var)) {
                return f16695n;
            }
            return f16694m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gi.w$b */
    /* loaded from: classes8.dex */
    public static final class C7691b extends AbstractC9973s implements Function0<String> {

        /* renamed from: k */
        final /* synthetic */ Set<AbstractC7304o0> f16697k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7691b(Set<? extends AbstractC7304o0> set) {
            super(0);
            this.f16697k = set;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String e0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("This collections cannot be empty! input types: ");
            e0 = C9914r.m14760e0(this.f16697k, null, null, null, 0, null, null, 63, null);
            sb2.append(e0);
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gi.w$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7692c extends C9965m implements Function2<AbstractC7267g0, AbstractC7267g0, Boolean> {
        C7692c(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C7686w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        /* renamed from: i */
        public final Boolean invoke(AbstractC7267g0 p0, AbstractC7267g0 p1) {
            C9971q.m14633g(p0, "p0");
            C9971q.m14633g(p1, "p1");
            return Boolean.valueOf(((C7686w) this.receiver).m21652e(p0, p1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gi.w$d */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7693d extends C9965m implements Function2<AbstractC7267g0, AbstractC7267g0, Boolean> {
        C7693d(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C7676m.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        /* renamed from: i */
        public final Boolean invoke(AbstractC7267g0 p0, AbstractC7267g0 p1) {
            C9971q.m14633g(p0, "p0");
            C9971q.m14633g(p1, "p1");
            return Boolean.valueOf(((C7676m) this.receiver).mo21673c(p0, p1));
        }
    }

    private C7686w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Collection<fi.AbstractC7304o0> m21655b(java.util.Collection<? extends fi.AbstractC7304o0> r8, kotlin.jvm.functions.Function2<? super fi.AbstractC7304o0, ? super fi.AbstractC7304o0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.jvm.internal.C9971q.m14634f(r8, r1)
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r8.next()
            fi.o0 r1 = (fi.AbstractC7304o0) r1
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x0022
            goto L_0x0051
        L_0x0022:
            java.util.Iterator r2 = r0.iterator()
        L_0x0026:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0051
            java.lang.Object r4 = r2.next()
            fi.o0 r4 = (fi.AbstractC7304o0) r4
            r5 = 1
            if (r4 == r1) goto L_0x004d
            java.lang.String r6 = "lower"
            kotlin.jvm.internal.C9971q.m14634f(r4, r6)
            java.lang.String r6 = "upper"
            kotlin.jvm.internal.C9971q.m14634f(r1, r6)
            java.lang.Object r4 = r9.invoke(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x004d
            r4 = r5
            goto L_0x004e
        L_0x004d:
            r4 = r3
        L_0x004e:
            if (r4 == 0) goto L_0x0026
            r3 = r5
        L_0x0051:
            if (r3 == 0) goto L_0x000e
            r8.remove()
            goto L_0x000e
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.C7686w.m21655b(java.util.Collection, kotlin.jvm.functions.Function2):java.util.Collection");
    }

    /* renamed from: d */
    private final AbstractC7304o0 m21653d(Set<? extends AbstractC7304o0> set) {
        Object q0;
        Object q02;
        if (set.size() == 1) {
            q02 = C9914r.m14748q0(set);
            return (AbstractC7304o0) q02;
        }
        new C7691b(set);
        Collection<AbstractC7304o0> b = m21655b(set, new C7692c(this));
        b.isEmpty();
        AbstractC7304o0 b2 = C13115n.f29417f.m4575b(b);
        if (b2 != null) {
            return b2;
        }
        Collection<AbstractC7304o0> b3 = m21655b(b, new C7693d(AbstractC7674l.f16679b.m21676a()));
        b3.isEmpty();
        if (b3.size() >= 2) {
            return new C7245f0(set).m23108d();
        }
        q0 = C9914r.m14748q0(b3);
        return (AbstractC7304o0) q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m21652e(AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2) {
        C7676m a = AbstractC7674l.f16679b.m21676a();
        if (!a.mo21674b(g0Var, g0Var2) || a.mo21674b(g0Var2, g0Var)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final AbstractC7304o0 m21654c(List<? extends AbstractC7304o0> types) {
        int t;
        int t2;
        C9971q.m14633g(types, "types");
        types.size();
        ArrayList<AbstractC7335v1> arrayList = new ArrayList();
        for (AbstractC7304o0 o0Var : types) {
            if (o0Var.mo5172N0() instanceof C7245f0) {
                Collection<AbstractC7267g0> m = o0Var.mo5172N0().mo4568m();
                C9971q.m14634f(m, "type.constructor.supertypes");
                t2 = C9907k.m14809t(m, 10);
                ArrayList arrayList2 = new ArrayList(t2);
                for (AbstractC7267g0 it : m) {
                    C9971q.m14634f(it, "it");
                    AbstractC7304o0 d = C7235d0.m23142d(it);
                    if (o0Var.mo5171O0()) {
                        d = d.mo5166U0(true);
                    }
                    arrayList2.add(d);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(o0Var);
            }
        }
        EnumC7687a aVar = EnumC7687a.f16692k;
        for (AbstractC7335v1 v1Var : arrayList) {
            aVar = aVar.mo21648b(v1Var);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC7304o0 o0Var2 = (AbstractC7304o0) it2.next();
            if (aVar == EnumC7687a.f16695n) {
                if (o0Var2 instanceof C7667i) {
                    o0Var2 = C7321s0.m22947k((C7667i) o0Var2);
                }
                o0Var2 = C7321s0.m22949i(o0Var2, false, 1, null);
            }
            linkedHashSet.add(o0Var2);
        }
        t = C9907k.m14809t(types, 10);
        ArrayList arrayList3 = new ArrayList(t);
        for (AbstractC7304o0 o0Var3 : types) {
            arrayList3.add(o0Var3.mo5173M0());
        }
        Iterator it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            while (it3.hasNext()) {
                next = ((C7232c1) next).m23154p((C7232c1) it3.next());
            }
            return m21653d(linkedHashSet).mo5165V0((C7232c1) next);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
