package bh;

import eg.C6884j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6902n;
import p086eh.AbstractC6905q;
import p086eh.AbstractC6906r;
import p086eh.AbstractC6911w;
import p086eh.C6904p;
import p249nh.C11142f;
import p267of.C11288u;
import p306qi.C12200o;

/* renamed from: bh.a */
/* loaded from: classes8.dex */
public class C3492a implements AbstractC3493b {

    /* renamed from: a */
    private final AbstractC6895g f5624a;

    /* renamed from: b */
    private final Function1<AbstractC6905q, Boolean> f5625b;

    /* renamed from: c */
    private final Function1<AbstractC6906r, Boolean> f5626c;

    /* renamed from: d */
    private final Map<C11142f, List<AbstractC6906r>> f5627d;

    /* renamed from: e */
    private final Map<C11142f, AbstractC6902n> f5628e;

    /* renamed from: f */
    private final Map<C11142f, AbstractC6911w> f5629f;

    /* renamed from: bh.a$a */
    /* loaded from: classes8.dex */
    static final class C0086a extends AbstractC9973s implements Function1<AbstractC6906r, Boolean> {
        C0086a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC6906r m) {
            boolean z;
            C9971q.m14633g(m, "m");
            if (!((Boolean) C3492a.this.f5625b.invoke(m)).booleanValue() || C6904p.m23942c(m)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3492a(AbstractC6895g jClass, Function1<? super AbstractC6905q, Boolean> memberFilter) {
        Sequence K;
        Sequence p;
        Sequence K2;
        Sequence p2;
        int t;
        int d;
        int c;
        C9971q.m14633g(jClass, "jClass");
        C9971q.m14633g(memberFilter, "memberFilter");
        this.f5624a = jClass;
        this.f5625b = memberFilter;
        C0086a aVar = new C0086a();
        this.f5626c = aVar;
        K = C9914r.m14782K(jClass.mo4029B());
        p = C12200o.m7429p(K, aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : p) {
            C11142f name = ((AbstractC6906r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f5627d = linkedHashMap;
        K2 = C9914r.m14782K(this.f5624a.mo4008x());
        p2 = C12200o.m7429p(K2, this.f5625b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : p2) {
            linkedHashMap2.put(((AbstractC6902n) obj3).getName(), obj3);
        }
        this.f5628e = linkedHashMap2;
        Collection<AbstractC6911w> p3 = this.f5624a.mo4013p();
        Function1<AbstractC6905q, Boolean> function1 = this.f5625b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : p3) {
            if (((Boolean) function1.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        t = C9907k.m14809t(arrayList, 10);
        d = C11288u.m10255d(t);
        c = C6884j.m23961c(d, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c);
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((AbstractC6911w) obj5).getName(), obj5);
        }
        this.f5629f = linkedHashMap3;
    }

    @Override // bh.AbstractC3493b
    /* renamed from: a */
    public Set<C11142f> mo34301a() {
        Sequence K;
        Sequence<AbstractC6906r> p;
        K = C9914r.m14782K(this.f5624a.mo4029B());
        p = C12200o.m7429p(K, this.f5626c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC6906r rVar : p) {
            linkedHashSet.add(rVar.getName());
        }
        return linkedHashSet;
    }

    @Override // bh.AbstractC3493b
    /* renamed from: b */
    public Set<C11142f> mo34300b() {
        return this.f5629f.keySet();
    }

    @Override // bh.AbstractC3493b
    /* renamed from: c */
    public Set<C11142f> mo34299c() {
        Sequence K;
        Sequence<AbstractC6902n> p;
        K = C9914r.m14782K(this.f5624a.mo4008x());
        p = C12200o.m7429p(K, this.f5625b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC6902n nVar : p) {
            linkedHashSet.add(nVar.getName());
        }
        return linkedHashSet;
    }

    @Override // bh.AbstractC3493b
    /* renamed from: d */
    public AbstractC6911w mo34298d(C11142f name) {
        C9971q.m14633g(name, "name");
        return this.f5629f.get(name);
    }

    @Override // bh.AbstractC3493b
    /* renamed from: e */
    public Collection<AbstractC6906r> mo34297e(C11142f name) {
        List i;
        C9971q.m14633g(name, "name");
        List<AbstractC6906r> list = this.f5627d.get(name);
        if (list != null) {
            return list;
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // bh.AbstractC3493b
    /* renamed from: f */
    public AbstractC6902n mo34296f(C11142f name) {
        C9971q.m14633g(name, "name");
        return this.f5628e.get(name);
    }
}
