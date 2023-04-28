package androidx.camera.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p390w.AbstractC13597g0;
import p390w.C13646o1;

/* renamed from: androidx.camera.core.t */
/* loaded from: classes.dex */
public final class C1921t {

    /* renamed from: b */
    public static final C1921t f1956b = new C1922a().m39507d(0).m39509b();

    /* renamed from: c */
    public static final C1921t f1957c = new C1922a().m39507d(1).m39509b();

    /* renamed from: a */
    private LinkedHashSet<AbstractC1906q> f1958a;

    C1921t(LinkedHashSet<AbstractC1906q> linkedHashSet) {
        this.f1958a = linkedHashSet;
    }

    /* renamed from: a */
    public LinkedHashSet<AbstractC13597g0> m39515a(LinkedHashSet<AbstractC13597g0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC13597g0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo330a());
        }
        List<AbstractC1911r> b = m39514b(arrayList);
        LinkedHashSet<AbstractC13597g0> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<AbstractC13597g0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            AbstractC13597g0 next = it2.next();
            if (b.contains(next.mo330a())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: b */
    public List<AbstractC1911r> m39514b(List<AbstractC1911r> list) {
        List<AbstractC1911r> arrayList = new ArrayList<>(list);
        Iterator<AbstractC1906q> it = this.f1958a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().mo3123b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* renamed from: c */
    public LinkedHashSet<AbstractC1906q> m39513c() {
        return this.f1958a;
    }

    /* renamed from: d */
    public Integer m39512d() {
        Iterator<AbstractC1906q> it = this.f1958a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            AbstractC1906q next = it.next();
            if (next instanceof C13646o1) {
                Integer valueOf = Integer.valueOf(((C13646o1) next).m3122c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: e */
    public AbstractC13597g0 m39511e(LinkedHashSet<AbstractC13597g0> linkedHashSet) {
        Iterator<AbstractC13597g0> it = m39515a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    /* renamed from: androidx.camera.core.t$a */
    /* loaded from: classes.dex */
    public static final class C1922a {

        /* renamed from: a */
        private final LinkedHashSet<AbstractC1906q> f1959a;

        public C1922a() {
            this.f1959a = new LinkedHashSet<>();
        }

        /* renamed from: c */
        public static C1922a m39508c(C1921t tVar) {
            return new C1922a(tVar.m39513c());
        }

        /* renamed from: a */
        public C1922a m39510a(AbstractC1906q qVar) {
            this.f1959a.add(qVar);
            return this;
        }

        /* renamed from: b */
        public C1921t m39509b() {
            return new C1921t(this.f1959a);
        }

        /* renamed from: d */
        public C1922a m39507d(int i) {
            this.f1959a.add(new C13646o1(i));
            return this;
        }

        private C1922a(LinkedHashSet<AbstractC1906q> linkedHashSet) {
            this.f1959a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}
