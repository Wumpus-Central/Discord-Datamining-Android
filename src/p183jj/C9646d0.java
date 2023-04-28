package p183jj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10817f;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.EnumC10994d;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p161ij.C8627a;
import p161ij.EnumC8637g;
import p163j$.util.concurrent.ConcurrentHashMap;
import p183jj.C9654g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.d0 */
/* loaded from: classes8.dex */
public final class C9646d0 implements AbstractC9657h<AbstractC11001k> {

    /* renamed from: q */
    private static final ConcurrentMap<Locale, C9647a> f21379q = new ConcurrentHashMap();

    /* renamed from: r */
    private static final ConcurrentMap<Locale, C9647a> f21380r = new ConcurrentHashMap();

    /* renamed from: k */
    private final boolean f21381k;

    /* renamed from: l */
    private final AbstractC9657h<AbstractC11001k> f21382l;

    /* renamed from: m */
    private final Set<AbstractC11001k> f21383m;

    /* renamed from: n */
    private final EnumC8637g f21384n;

    /* renamed from: o */
    private final Locale f21385o;

    /* renamed from: p */
    private final int f21386p;

    /* renamed from: jj.d0$a */
    /* loaded from: classes8.dex */
    private static class C9647a {

        /* renamed from: a */
        private final C9654g0 f21387a;

        /* renamed from: b */
        private final C9654g0 f21388b;

        C9647a(C9654g0 g0Var, C9654g0 g0Var2) {
            this.f21387a = g0Var;
            this.f21388b = g0Var2;
        }

        /* renamed from: a */
        void m15781a(CharSequence charSequence, int i, List<AbstractC11001k> list, List<AbstractC11001k> list2, int[] iArr) {
            String f = this.f21387a.m15764f(charSequence, i);
            int length = f.length();
            iArr[0] = i + length;
            String f2 = this.f21388b.m15764f(charSequence, i);
            int length2 = f2.length();
            iArr[1] = i + length2;
            if (length2 > length) {
                list2.addAll(this.f21388b.m15768b(f2));
            } else if (length2 < length) {
                list.addAll(this.f21387a.m15768b(f));
            } else if (length > 0) {
                list.addAll(this.f21387a.m15768b(f));
                list2.addAll(this.f21388b.m15768b(f2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9646d0(boolean z) {
        this.f21381k = z;
        this.f21382l = new C9668n(z);
        this.f21383m = null;
        this.f21384n = EnumC8637g.SMART;
        this.f21385o = Locale.ROOT;
        this.f21386p = 0;
    }

    /* renamed from: a */
    private C9654g0 m15787a(Locale locale, boolean z) {
        EnumC10994d j = m15784j(z);
        C9654g0.C9656b bVar = null;
        for (AbstractC11001k kVar : AbstractC11002l.m11292t()) {
            String x = AbstractC11002l.m11288x(kVar, j, locale);
            if (!x.equals(kVar.mo11196a())) {
                bVar = C9654g0.m15766d(bVar, x, kVar);
            }
        }
        return new C9654g0(bVar);
    }

    /* renamed from: h */
    private static List<AbstractC11001k> m15786h(List<AbstractC11001k> list) {
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            int size = list.size();
            for (int i = 1; i < size; i++) {
                AbstractC11001k kVar = list.get(i);
                if (kVar.mo11196a().startsWith("WINDOWS~")) {
                    arrayList.remove(kVar);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    /* renamed from: i */
    private String m15785i(CharSequence charSequence, int i, int i2) {
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = charSequence.charAt(i3);
            if (!Character.isLetter(charAt) && (this.f21381k || i3 <= i || Character.isDigit(charAt))) {
                break;
            }
            sb2.append(charAt);
        }
        return sb2.toString().trim();
    }

    /* renamed from: j */
    private EnumC10994d m15784j(boolean z) {
        if (z) {
            if (this.f21381k) {
                return EnumC10994d.SHORT_DAYLIGHT_TIME;
            }
            return EnumC10994d.LONG_DAYLIGHT_TIME;
        } else if (this.f21381k) {
            return EnumC10994d.SHORT_STANDARD_TIME;
        } else {
            return EnumC10994d.LONG_STANDARD_TIME;
        }
    }

    /* renamed from: k */
    private List<AbstractC11001k> m15783k(List<AbstractC11001k> list, Locale locale, EnumC8637g gVar) {
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("DEFAULT", new ArrayList());
        Iterator<AbstractC11001k> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String a = it.next().mo11196a();
            Set<AbstractC11001k> set = this.f21383m;
            int indexOf = a.indexOf(126);
            if (indexOf >= 0) {
                str = a.substring(0, indexOf);
            } else {
                str = "DEFAULT";
            }
            if (set == null) {
                set = AbstractC11002l.m11321C(locale, gVar.m18442b(), str);
            }
            Iterator<AbstractC11001k> it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    AbstractC11001k next = it2.next();
                    if (next.mo11196a().equals(a)) {
                        List list2 = (List) hashMap.get(str);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hashMap.put(str, list2);
                        }
                        list2.add(next);
                    }
                }
            }
        }
        List<AbstractC11001k> list3 = (List) hashMap.get("DEFAULT");
        if (!list3.isEmpty()) {
            return list3;
        }
        hashMap.remove("DEFAULT");
        Iterator it3 = hashMap.keySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            List<AbstractC11001k> list4 = (List) hashMap.get((String) it3.next());
            if (!list4.isEmpty()) {
                z = true;
                list = list4;
                break;
            }
        }
        if (!z) {
            list = Collections.emptyList();
        }
        return list;
    }

    /* renamed from: l */
    private static String m15782l(List<AbstractC11001k> list) {
        StringBuilder sb2 = new StringBuilder(list.size() * 16);
        sb2.append('{');
        boolean z = true;
        for (AbstractC11001k kVar : list) {
            if (z) {
                z = false;
            } else {
                sb2.append(',');
            }
            sb2.append(kVar.mo11196a());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<AbstractC11001k> mo15599b() {
        return EnumC9636b0.TIMEZONE_ID;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        Locale locale;
        int i;
        if (oVar.mo11376f()) {
            AbstractC11001k q = oVar.mo11372q();
            if (q instanceof C11028p) {
                return this.f21382l.mo15598c(oVar, appendable, dVar, set, z);
            }
            if (oVar instanceof AbstractC10817f) {
                AbstractC11002l N = AbstractC11002l.m11310N(q);
                EnumC10994d j = m15784j(N.mo11315I((AbstractC10817f) AbstractC10817f.class.cast(oVar)));
                if (z) {
                    locale = this.f21385o;
                } else {
                    locale = (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT);
                }
                String w = N.mo11289w(j, locale);
                if (appendable instanceof CharSequence) {
                    i = ((CharSequence) appendable).length();
                } else {
                    i = -1;
                }
                appendable.append(w);
                int length = w.length();
                if (!(i == -1 || length <= 0 || set == null)) {
                    set.add(new C9653g(EnumC9636b0.TIMEZONE_ID, i, i + length));
                }
                return length;
            }
            throw new IllegalArgumentException("Cannot extract timezone name from: " + oVar);
        }
        throw new IllegalArgumentException("Cannot extract timezone name from: " + oVar);
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<AbstractC11001k> mo15597d(AbstractC8079p<AbstractC11001k> pVar) {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0216, code lost:
        if (r4 != false) goto L_0x0228;
     */
    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo15596e(java.lang.CharSequence r19, p183jj.C9675s r20, p143hj.AbstractC8048d r21, p183jj.AbstractC9676t<?> r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9646d0.mo15596e(java.lang.CharSequence, jj.s, hj.d, jj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9646d0)) {
            return false;
        }
        C9646d0 d0Var = (C9646d0) obj;
        if (this.f21381k == d0Var.f21381k) {
            Set<AbstractC11001k> set = this.f21383m;
            Set<AbstractC11001k> set2 = d0Var.f21383m;
            if (set == null) {
                if (set2 == null) {
                    return true;
                }
            } else if (set.equals(set2)) {
                return true;
            }
        }
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<AbstractC11001k> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        return new C9646d0(this.f21381k, this.f21382l, this.f21383m, (EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART), (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT), ((Integer) dVar.mo15674c(C8627a.f19070s, 0)).intValue());
    }

    public int hashCode() {
        Set<AbstractC11001k> set = this.f21383m;
        return (set == null ? 0 : set.hashCode()) + (this.f21381k ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9646d0.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f21381k);
        sb2.append(", preferredZones=");
        sb2.append(this.f21383m);
        sb2.append(']');
        return sb2.toString();
    }

    private C9646d0(boolean z, AbstractC9657h<AbstractC11001k> hVar, Set<AbstractC11001k> set, EnumC8637g gVar, Locale locale, int i) {
        this.f21381k = z;
        this.f21382l = hVar;
        this.f21383m = set;
        this.f21384n = gVar;
        this.f21385o = locale;
        this.f21386p = i;
    }
}
