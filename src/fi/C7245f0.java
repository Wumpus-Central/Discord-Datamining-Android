package fi;

import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9617h;
import p217lg.AbstractC10420h;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p303qf.C12120c;
import p448yh.AbstractC14411h;
import p448yh.C14424n;

/* renamed from: fi.f0 */
/* loaded from: classes8.dex */
public final class C7245f0 implements AbstractC7268g1, AbstractC9617h {

    /* renamed from: a */
    private AbstractC7267g0 f15693a;

    /* renamed from: b */
    private final LinkedHashSet<AbstractC7267g0> f15694b;

    /* renamed from: c */
    private final int f15695c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.f0$a */
    /* loaded from: classes8.dex */
    public static final class C7246a extends AbstractC9973s implements Function1<AbstractC7664g, AbstractC7304o0> {
        C7246a() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC7304o0 invoke(AbstractC7664g kotlinTypeRefiner) {
            C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return C7245f0.this.mo4566o(kotlinTypeRefiner).m23108d();
        }
    }

    /* renamed from: fi.f0$b */
    /* loaded from: classes8.dex */
    public static final class C7247b<T> implements Comparator {

        /* renamed from: k */
        final /* synthetic */ Function1 f15697k;

        public C7247b(Function1 function1) {
            this.f15697k = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            AbstractC7267g0 it = (AbstractC7267g0) t;
            Function1 function1 = this.f15697k;
            C9971q.m14634f(it, "it");
            String obj = function1.invoke(it).toString();
            AbstractC7267g0 it2 = (AbstractC7267g0) t2;
            Function1 function12 = this.f15697k;
            C9971q.m14634f(it2, "it");
            d = C12120c.m7778d(obj, function12.invoke(it2).toString());
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.f0$c */
    /* loaded from: classes8.dex */
    public static final class C7248c extends AbstractC9973s implements Function1<AbstractC7267g0, String> {

        /* renamed from: k */
        public static final C7248c f15698k = new C7248c();

        C7248c() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(AbstractC7267g0 it) {
            C9971q.m14633g(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fi.f0$d */
    /* loaded from: classes8.dex */
    public static final class C7249d extends AbstractC9973s implements Function1<AbstractC7267g0, CharSequence> {

        /* renamed from: k */
        final /* synthetic */ Function1<AbstractC7267g0, Object> f15699k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7249d(Function1<? super AbstractC7267g0, ? extends Object> function1) {
            super(1);
            this.f15699k = function1;
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC7267g0 it) {
            Function1<AbstractC7267g0, Object> function1 = this.f15699k;
            C9971q.m14634f(it, "it");
            return function1.invoke(it).toString();
        }
    }

    public C7245f0(Collection<? extends AbstractC7267g0> typesToIntersect) {
        C9971q.m14633g(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<AbstractC7267g0> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f15694b = linkedHashSet;
        this.f15695c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static /* synthetic */ String m23105g(C7245f0 f0Var, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = C7248c.f15698k;
        }
        return f0Var.m23106f(function1);
    }

    /* renamed from: c */
    public final AbstractC14411h m23109c() {
        return C14424n.f32640d.m622a("member scope for intersection type", this.f15694b);
    }

    /* renamed from: d */
    public final AbstractC7304o0 m23108d() {
        List i;
        C7232c1 h = C7232c1.f15671l.m23149h();
        i = C9906j.m14820i();
        return C7270h0.m23048l(h, this, i, false, m23109c(), new C7246a());
    }

    /* renamed from: e */
    public final AbstractC7267g0 m23107e() {
        return this.f15693a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7245f0)) {
            return false;
        }
        return C9971q.m14638b(this.f15694b, ((C7245f0) obj).f15694b);
    }

    /* renamed from: f */
    public final String m23106f(Function1<? super AbstractC7267g0, ? extends Object> getProperTypeRelatedToStringify) {
        List w0;
        String e0;
        C9971q.m14633g(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        w0 = C9914r.m14742w0(this.f15694b, new C7247b(getProperTypeRelatedToStringify));
        e0 = C9914r.m14760e0(w0, " & ", "{", "}", 0, null, new C7249d(getProperTypeRelatedToStringify), 24, null);
        return e0;
    }

    @Override // fi.AbstractC7268g1
    public List<AbstractC11319f1> getParameters() {
        List<AbstractC11319f1> i;
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: h */
    public C7245f0 mo4566o(AbstractC7664g kotlinTypeRefiner) {
        int t;
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<AbstractC7267g0> m = mo4568m();
        t = C9907k.m14809t(m, 10);
        ArrayList arrayList = new ArrayList(t);
        boolean z = false;
        for (AbstractC7267g0 g0Var : m) {
            arrayList.add(g0Var.mo5170P0(kotlinTypeRefiner));
            z = true;
        }
        C7245f0 f0Var = null;
        AbstractC7267g0 g0Var2 = null;
        if (z) {
            AbstractC7267g0 e = m23107e();
            if (e != null) {
                g0Var2 = e.mo5170P0(kotlinTypeRefiner);
            }
            f0Var = new C7245f0(arrayList).m23103i(g0Var2);
        }
        if (f0Var == null) {
            return this;
        }
        return f0Var;
    }

    public int hashCode() {
        return this.f15695c;
    }

    /* renamed from: i */
    public final C7245f0 m23103i(AbstractC7267g0 g0Var) {
        return new C7245f0(this.f15694b, g0Var);
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: m */
    public Collection<AbstractC7267g0> mo4568m() {
        return this.f15694b;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: n */
    public AbstractC10420h mo4567n() {
        AbstractC10420h n = this.f15694b.iterator().next().mo5172N0().mo4567n();
        C9971q.m14634f(n, "intersectedTypes.iterato…xt().constructor.builtIns");
        return n;
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
        return m23105g(this, null, 1, null);
    }

    private C7245f0(Collection<? extends AbstractC7267g0> collection, AbstractC7267g0 g0Var) {
        this(collection);
        this.f15693a = g0Var;
    }
}
