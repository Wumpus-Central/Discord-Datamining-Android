package p390w;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p390w.AbstractC13662r0;

/* renamed from: w.c2 */
/* loaded from: classes.dex */
public class C13582c2 implements AbstractC13662r0 {

    /* renamed from: x */
    protected static final Comparator<AbstractC13662r0.AbstractC13663a<?>> f30372x;

    /* renamed from: y */
    private static final C13582c2 f30373y;

    /* renamed from: w */
    protected final TreeMap<AbstractC13662r0.AbstractC13663a<?>, Map<AbstractC13662r0.EnumC13665c, Object>> f30374w;

    static {
        Comparator<AbstractC13662r0.AbstractC13663a<?>> b2Var = new Comparator() { // from class: w.b2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int I;
                I = C13582c2.m3309I((AbstractC13662r0.AbstractC13663a) obj, (AbstractC13662r0.AbstractC13663a) obj2);
                return I;
            }
        };
        f30372x = b2Var;
        f30373y = new C13582c2(new TreeMap(b2Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13582c2(TreeMap<AbstractC13662r0.AbstractC13663a<?>, Map<AbstractC13662r0.EnumC13665c, Object>> treeMap) {
        this.f30374w = treeMap;
    }

    /* renamed from: G */
    public static C13582c2 m3311G() {
        return f30373y;
    }

    /* renamed from: H */
    public static C13582c2 m3310H(AbstractC13662r0 r0Var) {
        if (C13582c2.class.equals(r0Var.getClass())) {
            return (C13582c2) r0Var;
        }
        TreeMap treeMap = new TreeMap(f30372x);
        for (AbstractC13662r0.AbstractC13663a<?> aVar : r0Var.mo2975c()) {
            Set<AbstractC13662r0.EnumC13665c> x = r0Var.mo2959x(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (AbstractC13662r0.EnumC13665c cVar : x) {
                arrayMap.put(cVar, r0Var.mo2987A(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C13582c2(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ int m3309I(AbstractC13662r0.AbstractC13663a aVar, AbstractC13662r0.AbstractC13663a aVar2) {
        return aVar.mo3100c().compareTo(aVar2.mo3100c());
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: A */
    public <ValueT> ValueT mo2987A(AbstractC13662r0.AbstractC13663a<ValueT> aVar, AbstractC13662r0.EnumC13665c cVar) {
        Map<AbstractC13662r0.EnumC13665c, Object> map = this.f30374w.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
        }
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: a */
    public <ValueT> ValueT mo2977a(AbstractC13662r0.AbstractC13663a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) mo2976b(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: b */
    public <ValueT> ValueT mo2976b(AbstractC13662r0.AbstractC13663a<ValueT> aVar) {
        Map<AbstractC13662r0.EnumC13665c, Object> map = this.f30374w.get(aVar);
        if (map != null) {
            return (ValueT) map.get((AbstractC13662r0.EnumC13665c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: c */
    public Set<AbstractC13662r0.AbstractC13663a<?>> mo2975c() {
        return Collections.unmodifiableSet(this.f30374w.keySet());
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: d */
    public AbstractC13662r0.EnumC13665c mo2974d(AbstractC13662r0.AbstractC13663a<?> aVar) {
        Map<AbstractC13662r0.EnumC13665c, Object> map = this.f30374w.get(aVar);
        if (map != null) {
            return (AbstractC13662r0.EnumC13665c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: e */
    public boolean mo2973e(AbstractC13662r0.AbstractC13663a<?> aVar) {
        return this.f30374w.containsKey(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    @Override // p390w.AbstractC13662r0
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2967l(java.lang.String r4, p390w.AbstractC13662r0.AbstractC13664b r5) {
        /*
            r3 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            w.r0$a r0 = p390w.AbstractC13662r0.AbstractC13663a.m3102a(r4, r0)
            java.util.TreeMap<w.r0$a<?>, java.util.Map<w.r0$c, java.lang.Object>> r1 = r3.f30374w
            java.util.SortedMap r0 = r1.tailMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            w.r0$a r2 = (p390w.AbstractC13662r0.AbstractC13663a) r2
            java.lang.String r2 = r2.mo3100c()
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            java.lang.Object r1 = r1.getKey()
            w.r0$a r1 = (p390w.AbstractC13662r0.AbstractC13663a) r1
            boolean r1 = r5.mo3097a(r1)
            if (r1 != 0) goto L_0x0014
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p390w.C13582c2.mo2967l(java.lang.String, w.r0$b):void");
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: x */
    public Set<AbstractC13662r0.EnumC13665c> mo2959x(AbstractC13662r0.AbstractC13663a<?> aVar) {
        Map<AbstractC13662r0.EnumC13665c, Object> map = this.f30374w.get(aVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }
}
