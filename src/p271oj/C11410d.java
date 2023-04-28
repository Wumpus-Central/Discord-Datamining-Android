package p271oj;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10814d;
import net.time4j.base.C10812b;
import net.time4j.base.C10813c;

/* renamed from: oj.d */
/* loaded from: classes8.dex */
public final class C11410d implements Iterable<AbstractC11408b>, Comparator<AbstractC11408b> {

    /* renamed from: p */
    public static final boolean f25326p = Boolean.getBoolean("net.time4j.scale.leapseconds.suppressed");

    /* renamed from: q */
    public static final boolean f25327q = Boolean.getBoolean("net.time4j.scale.leapseconds.final");

    /* renamed from: r */
    public static final String f25328r = System.getProperty("net.time4j.scale.leapseconds.path", "data/leapseconds.data");

    /* renamed from: s */
    private static final AbstractC11407a[] f25329s = new AbstractC11407a[0];

    /* renamed from: t */
    private static final C11410d f25330t = new C11410d();

    /* renamed from: k */
    private final AbstractC11409c f25331k;

    /* renamed from: l */
    private final List<AbstractC11407a> f25332l;

    /* renamed from: m */
    private final AbstractC11407a[] f25333m;

    /* renamed from: n */
    private volatile AbstractC11407a[] f25334n;

    /* renamed from: o */
    private final boolean f25335o;

    private C11410d() {
        int i;
        AbstractC11409c cVar;
        AbstractC10811a key;
        boolean z = false;
        if (!f25326p) {
            cVar = null;
            i = 0;
            for (AbstractC11409c cVar2 : AbstractC10814d.m12187c().mo12183g(AbstractC11409c.class)) {
                int size = cVar2.mo8637g().size();
                if (size > i) {
                    cVar = cVar2;
                    i = size;
                }
            }
        } else {
            cVar = null;
            i = 0;
        }
        if (cVar == null || i == 0) {
            this.f25331k = null;
            this.f25332l = Collections.emptyList();
            AbstractC11407a[] aVarArr = f25329s;
            this.f25333m = aVarArr;
            this.f25334n = aVarArr;
            this.f25335o = false;
            return;
        }
        TreeSet treeSet = new TreeSet(this);
        for (Map.Entry<AbstractC10811a, Integer> entry : cVar.mo8637g().entrySet()) {
            treeSet.add(new C11411a(entry.getKey(), Long.MIN_VALUE, (m10123K(key) - 62985600) - 1, entry.getValue().intValue()));
        }
        m10119v(treeSet);
        boolean z2 = f25327q;
        if (z2) {
            this.f25332l = Collections.unmodifiableList(new ArrayList(treeSet));
        } else {
            this.f25332l = new CopyOnWriteArrayList(treeSet);
        }
        AbstractC11407a[] F = m10128F();
        this.f25333m = F;
        this.f25334n = F;
        this.f25331k = cVar;
        if (z2) {
            boolean c = cVar.mo8641c();
            if (c) {
                Iterator<AbstractC11407a> it = this.f25332l.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo10115a() < 0) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                c = z;
            }
            this.f25335o = c;
            return;
        }
        this.f25335o = true;
    }

    /* renamed from: A */
    public static C11410d m10131A() {
        return f25330t;
    }

    /* renamed from: F */
    private AbstractC11407a[] m10128F() {
        ArrayList arrayList = new ArrayList(this.f25332l.size());
        arrayList.addAll(this.f25332l);
        Collections.reverse(arrayList);
        return (AbstractC11407a[]) arrayList.toArray(new AbstractC11407a[arrayList.size()]);
    }

    /* renamed from: K */
    private static long m10123K(AbstractC10811a aVar) {
        return C10813c.m12194i(C10813c.m12190m(C10812b.m12205k(aVar), 40587L), 86400L);
    }

    /* renamed from: v */
    private static void m10119v(SortedSet<AbstractC11407a> sortedSet) {
        ArrayList arrayList = new ArrayList(sortedSet.size());
        int i = 0;
        for (AbstractC11407a aVar : sortedSet) {
            if (aVar.mo10114b() == Long.MIN_VALUE) {
                i += aVar.mo10115a();
                arrayList.add(new C11411a(aVar, i));
            } else {
                arrayList.add(aVar);
            }
        }
        sortedSet.clear();
        sortedSet.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static String m10118w(AbstractC10811a aVar) {
        return String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(aVar.mo11643m()), Integer.valueOf(aVar.mo11642n()), Integer.valueOf(aVar.mo11641o()));
    }

    /* renamed from: y */
    private AbstractC11407a[] m10116y() {
        if (f25326p || f25327q) {
            return this.f25333m;
        }
        return this.f25334n;
    }

    /* renamed from: D */
    public AbstractC11408b m10130D(long j) {
        AbstractC11407a[] y = m10116y();
        AbstractC11407a aVar = null;
        int i = 0;
        while (i < y.length) {
            AbstractC11407a aVar2 = y[i];
            if (j >= aVar2.mo10114b()) {
                break;
            }
            i++;
            aVar = aVar2;
        }
        return aVar;
    }

    /* renamed from: E */
    public int m10129E(long j) {
        AbstractC11407a[] y;
        if (j <= 0) {
            return 0;
        }
        for (AbstractC11407a aVar : m10116y()) {
            if (j > aVar.mo10114b()) {
                return 0;
            }
            long b = aVar.mo10114b() - aVar.mo10115a();
            if (j > b) {
                return (int) (j - b);
            }
        }
        return 0;
    }

    /* renamed from: G */
    public boolean m10127G() {
        return !this.f25332l.isEmpty();
    }

    /* renamed from: H */
    public boolean m10126H(long j) {
        if (j <= 0) {
            return false;
        }
        AbstractC11407a[] y = m10116y();
        for (int i = 0; i < y.length; i++) {
            int i2 = (y[i].mo10114b() > j ? 1 : (y[i].mo10114b() == j ? 0 : -1));
            if (i2 == 0) {
                if (y[i].mo10115a() == 1) {
                    return true;
                }
                return false;
            } else if (i2 < 0) {
                break;
            }
        }
        return false;
    }

    /* renamed from: I */
    public long m10125I(long j) {
        if (j <= 0) {
            return j + 63072000;
        }
        AbstractC11407a[] y = m10116y();
        boolean z = this.f25335o;
        for (AbstractC11407a aVar : y) {
            if (aVar.mo10114b() - aVar.mo10115a() < j || (z && aVar.mo10115a() < 0 && aVar.mo10114b() < j)) {
                j = C10813c.m12197f(j, aVar.mo10112d() - aVar.mo10114b());
                break;
            }
        }
        return j + 63072000;
    }

    /* renamed from: J */
    public boolean m10124J() {
        return this.f25335o;
    }

    /* renamed from: g */
    public int compare(AbstractC11408b bVar, AbstractC11408b bVar2) {
        AbstractC10811a c = bVar.mo10113c();
        AbstractC10811a c2 = bVar2.mo10113c();
        int m = c.mo11643m();
        int m2 = c2.mo11643m();
        if (m < m2) {
            return -1;
        }
        if (m > m2) {
            return 1;
        }
        int n = c.mo11642n();
        int n2 = c2.mo11642n();
        if (n < n2) {
            return -1;
        }
        if (n > n2) {
            return 1;
        }
        int o = c.mo11641o();
        int o2 = c2.mo11641o();
        if (o < o2) {
            return -1;
        }
        if (o == o2) {
            return 0;
        }
        return 1;
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC11408b> iterator() {
        return Collections.unmodifiableList(Arrays.asList(m10116y())).iterator();
    }

    /* renamed from: s */
    public long m10120s(long j) {
        AbstractC11407a[] y;
        long j2 = j - 63072000;
        if (j <= 0) {
            return j2;
        }
        for (AbstractC11407a aVar : m10116y()) {
            if (aVar.mo10112d() < j2) {
                return C10813c.m12197f(j2, aVar.mo10114b() - aVar.mo10112d());
            }
        }
        return j2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((int) RecyclerView.ItemAnimator.FLAG_MOVED);
        sb2.append("[PROVIDER=");
        sb2.append(this.f25331k);
        if (this.f25331k != null) {
            sb2.append(",EXPIRES=");
            sb2.append(m10118w(m10117x()));
        }
        sb2.append(",EVENTS=[");
        if (m10127G()) {
            boolean z = true;
            for (AbstractC11407a aVar : this.f25332l) {
                if (z) {
                    z = false;
                } else {
                    sb2.append('|');
                }
                sb2.append(aVar);
            }
        } else {
            sb2.append("NOT SUPPORTED");
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* renamed from: x */
    public AbstractC10811a m10117x() {
        if (m10127G()) {
            return this.f25331k.mo8639e();
        }
        throw new IllegalStateException("Leap seconds not activated.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oj.d$a */
    /* loaded from: classes8.dex */
    public static class C11411a implements AbstractC11407a, Serializable {
        private static final long serialVersionUID = 5986185471610524587L;
        private final long _raw;
        private final long _utc;
        private final AbstractC10811a date;
        private final int shift;

        C11411a(AbstractC10811a aVar, long j, long j2, int i) {
            this.date = aVar;
            this.shift = i;
            this._utc = j;
            this._raw = j2;
        }

        @Override // p271oj.AbstractC11408b
        /* renamed from: a */
        public int mo10115a() {
            return this.shift;
        }

        @Override // p271oj.AbstractC11407a
        /* renamed from: b */
        public long mo10114b() {
            return this._utc;
        }

        @Override // p271oj.AbstractC11408b
        /* renamed from: c */
        public AbstractC10811a mo10113c() {
            return this.date;
        }

        @Override // p271oj.AbstractC11407a
        /* renamed from: d */
        public long mo10112d() {
            return this._raw;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(AbstractC11408b.class.getName());
            sb2.append('[');
            sb2.append(C11410d.m10118w(this.date));
            sb2.append(": utc=");
            sb2.append(this._utc);
            sb2.append(", raw=");
            sb2.append(this._raw);
            sb2.append(" (shift=");
            sb2.append(this.shift);
            sb2.append(")]");
            return sb2.toString();
        }

        C11411a(AbstractC11407a aVar, int i) {
            this.date = aVar.mo10113c();
            this.shift = aVar.mo10115a();
            this._utc = aVar.mo10112d() + i;
            this._raw = aVar.mo10112d();
        }
    }
}
