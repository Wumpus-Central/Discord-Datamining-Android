package gi;

import fi.AbstractC7267g0;
import fi.AbstractC7290k1;
import fi.AbstractC7335v1;
import java.util.ArrayList;
import java.util.List;
import ki.C9883a;
import kotlin.Lazy;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;
import nf.EnumC11087p;
import p217lg.AbstractC10420h;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import sh.AbstractC12900b;

/* renamed from: gi.j */
/* loaded from: classes8.dex */
public final class C7668j implements AbstractC12900b {

    /* renamed from: a */
    private final AbstractC7290k1 f16669a;

    /* renamed from: b */
    private Function0<? extends List<? extends AbstractC7335v1>> f16670b;

    /* renamed from: c */
    private final C7668j f16671c;

    /* renamed from: d */
    private final AbstractC11319f1 f16672d;

    /* renamed from: e */
    private final Lazy f16673e;

    /* renamed from: gi.j$a */
    /* loaded from: classes8.dex */
    static final class C7669a extends AbstractC9973s implements Function0<List<? extends AbstractC7335v1>> {

        /* renamed from: k */
        final /* synthetic */ List<AbstractC7335v1> f16674k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7669a(List<? extends AbstractC7335v1> list) {
            super(0);
            this.f16674k = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC7335v1> invoke() {
            return this.f16674k;
        }
    }

    /* renamed from: gi.j$b */
    /* loaded from: classes8.dex */
    static final class C7670b extends AbstractC9973s implements Function0<List<? extends AbstractC7335v1>> {
        C7670b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC7335v1> invoke() {
            Function0 function0 = C7668j.this.f16670b;
            if (function0 != null) {
                return (List) function0.invoke();
            }
            return null;
        }
    }

    /* renamed from: gi.j$c */
    /* loaded from: classes8.dex */
    static final class C7671c extends AbstractC9973s implements Function0<List<? extends AbstractC7335v1>> {

        /* renamed from: k */
        final /* synthetic */ List<AbstractC7335v1> f16676k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7671c(List<? extends AbstractC7335v1> list) {
            super(0);
            this.f16676k = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC7335v1> invoke() {
            return this.f16676k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gi.j$d */
    /* loaded from: classes8.dex */
    public static final class C7672d extends AbstractC9973s implements Function0<List<? extends AbstractC7335v1>> {

        /* renamed from: l */
        final /* synthetic */ AbstractC7664g f16678l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7672d(AbstractC7664g gVar) {
            super(0);
            this.f16678l = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC7335v1> invoke() {
            int t;
            List<AbstractC7335v1> d = C7668j.this.mo4568m();
            AbstractC7664g gVar = this.f16678l;
            t = C9907k.m14809t(d, 10);
            ArrayList arrayList = new ArrayList(t);
            for (AbstractC7335v1 v1Var : d) {
                arrayList.add(v1Var.mo5168S0(gVar));
            }
            return arrayList;
        }
    }

    public C7668j(AbstractC7290k1 projection, Function0<? extends List<? extends AbstractC7335v1>> function0, C7668j jVar, AbstractC11319f1 f1Var) {
        Lazy b;
        C9971q.m14633g(projection, "projection");
        this.f16669a = projection;
        this.f16670b = function0;
        this.f16671c = jVar;
        this.f16672d = f1Var;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C7670b());
        this.f16673e = b;
    }

    /* renamed from: e */
    private final List<AbstractC7335v1> m21682e() {
        return (List) this.f16673e.getValue();
    }

    @Override // sh.AbstractC12900b
    /* renamed from: b */
    public AbstractC7290k1 mo5160b() {
        return this.f16669a;
    }

    /* renamed from: d */
    public List<AbstractC7335v1> mo4568m() {
        List<AbstractC7335v1> i;
        List<AbstractC7335v1> e = m21682e();
        if (e != null) {
            return e;
        }
        i = C9906j.m14820i();
        return i;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C9971q.m14638b(C7668j.class, cls)) {
            return false;
        }
        C9971q.m14635e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C7668j jVar = (C7668j) obj;
        C7668j jVar2 = this.f16671c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        C7668j jVar3 = jVar.f16671c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        if (jVar2 == jVar) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m21681f(List<? extends AbstractC7335v1> supertypes) {
        C9971q.m14633g(supertypes, "supertypes");
        this.f16670b = new C7671c(supertypes);
    }

    /* renamed from: g */
    public C7668j mo4566o(AbstractC7664g kotlinTypeRefiner) {
        C7672d dVar;
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7290k1 o = mo5160b().mo22903o(kotlinTypeRefiner);
        C9971q.m14634f(o, "projection.refine(kotlinTypeRefiner)");
        if (this.f16670b != null) {
            dVar = new C7672d(kotlinTypeRefiner);
        } else {
            dVar = null;
        }
        C7668j jVar = this.f16671c;
        if (jVar == null) {
            jVar = this;
        }
        return new C7668j(o, dVar, jVar, this.f16672d);
    }

    @Override // fi.AbstractC7268g1
    public List<AbstractC11319f1> getParameters() {
        List<AbstractC11319f1> i;
        i = C9906j.m14820i();
        return i;
    }

    public int hashCode() {
        C7668j jVar = this.f16671c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: n */
    public AbstractC10420h mo4567n() {
        AbstractC7267g0 type = mo5160b().getType();
        C9971q.m14634f(type, "projection.type");
        return C9883a.m15096i(type);
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: p */
    public AbstractC11326h mo4565p() {
        return null;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: q */
    public boolean mo4564q() {
        return false;
    }

    public String toString() {
        return "CapturedType(" + mo5160b() + ')';
    }

    public /* synthetic */ C7668j(AbstractC7290k1 k1Var, Function0 function0, C7668j jVar, AbstractC11319f1 f1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k1Var, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : jVar, (i & 8) != 0 ? null : f1Var);
    }

    public /* synthetic */ C7668j(AbstractC7290k1 k1Var, List list, C7668j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k1Var, list, (i & 4) != 0 ? null : jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7668j(AbstractC7290k1 projection, List<? extends AbstractC7335v1> supertypes, C7668j jVar) {
        this(projection, new C7669a(supertypes), jVar, null, 8, null);
        C9971q.m14633g(projection, "projection");
        C9971q.m14633g(supertypes, "supertypes");
    }
}
