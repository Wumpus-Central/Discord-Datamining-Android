package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8050e;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8082s;
import p143hj.AbstractC8083t;
import p143hj.AbstractC8091z;
import p143hj.C8087x;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;

/* renamed from: net.time4j.k */
/* loaded from: classes8.dex */
public final class C10961k {

    /* renamed from: d */
    private static final SortedMap<C10906g0, String> f24338d;

    /* renamed from: e */
    private static C10961k f24339e;

    /* renamed from: f */
    private static final AbstractC8046c<C10961k> f24340f = C8627a.m18482e("CUSTOM_DAY_PERIOD", C10961k.class);

    /* renamed from: a */
    private final transient Locale f24341a;

    /* renamed from: b */
    private final transient String f24342b;

    /* renamed from: c */
    private final transient SortedMap<C10906g0, String> f24343c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.k$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10962a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24344a;

        static {
            int[] iArr = new int[EnumC8671v.values().length];
            f24344a = iArr;
            try {
                iArr[EnumC8671v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24344a[EnumC8671v.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.k$b */
    /* loaded from: classes8.dex */
    public static class C10963b extends AbstractC8050e<String> implements AbstractC8669t<String>, AbstractC8091z<AbstractC8080q<?>, String> {
        private static final long serialVersionUID = 5589976208326940032L;

        /* renamed from: k */
        private final transient boolean f24345k;

        /* renamed from: l */
        private final transient C10961k f24346l;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10963b(boolean z, Locale locale, String str) {
            this(z, C10961k.m11447r(locale, str));
        }

        /* renamed from: A */
        private boolean m11444A(char c, char c2) {
            if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a') + 65);
            }
            if (c2 >= 'a' && c2 <= 'z') {
                c2 = (char) ((c2 - 'a') + 65);
            }
            if (c < 'A' || c > 'Z') {
                Locale J = m11437J();
                return String.valueOf(c).toUpperCase(J).equals(String.valueOf(c2).toUpperCase(J));
            } else if (c == c2) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: R */
        private String m11430R(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar, EnumC8658m mVar) {
            String str;
            boolean z;
            String str2;
            EnumC8658m mVar2 = mVar;
            ArrayList arrayList = new ArrayList();
            String str3 = "pm";
            String str4 = "am";
            if (this.f24345k) {
                arrayList.add(str4);
                arrayList.add(str3);
                arrayList.add("midnight");
                arrayList.add("noon");
            } else {
                arrayList.addAll(new LinkedHashSet(this.f24346l.f24343c.values()));
                if (this.f24346l.m11449p()) {
                    arrayList.add("midnight");
                    arrayList.add("noon");
                }
            }
            Map q = this.f24346l.m11449p() ? C10961k.m11448q(m11437J(), m11443D()) : null;
            EnumC8671v vVar = (EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE);
            boolean booleanValue = ((Boolean) dVar.mo15674c(C8627a.f19060i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) dVar.mo15674c(C8627a.f19061j, Boolean.FALSE)).booleanValue();
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            String str5 = null;
            int i = 0;
            for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                String str6 = (String) it.next();
                if (this.f24346l.m11449p()) {
                    if (this.f24345k) {
                        str2 = C10961k.m11454k(q, vVar, mVar2, str6);
                        if (!q.containsKey(str2)) {
                            if (str6.equals("midnight")) {
                                str2 = C10961k.m11454k(q, vVar, mVar2, str4);
                            } else if (str6.equals("noon")) {
                                str2 = C10961k.m11454k(q, vVar, mVar2, str3);
                            }
                        }
                    } else {
                        str2 = C10961k.m11454k(q, vVar, mVar2, str6);
                    }
                    str = q.containsKey(str2) ? (String) q.get(str2) : null;
                } else {
                    str = str6;
                }
                if (str != null) {
                    i = str.length();
                    q = q;
                    int i2 = index;
                    int i3 = 0;
                    boolean z2 = true;
                    while (z2 && i3 < i) {
                        int i4 = index + i3;
                        if (i4 >= length) {
                            str4 = str4;
                            z2 = false;
                        } else {
                            str4 = str4;
                            char charAt = charSequence.charAt(i4);
                            char charAt2 = str.charAt(i3);
                            if (booleanValue) {
                                z = m11444A(charAt, charAt2);
                            } else {
                                z = charAt == charAt2;
                            }
                            if (z) {
                                i2++;
                            }
                            z2 = z;
                        }
                        i3++;
                        str3 = str3;
                    }
                    str3 = str3;
                    str4 = str4;
                    if (booleanValue2 || i == 1) {
                        i = i2 - index;
                        if (i >= i) {
                            if (str5 != null && i == i) {
                                if (!this.f24345k) {
                                    str5 = str5 + "|" + str6;
                                }
                                str5 = null;
                            }
                        }
                        str5 = str6;
                    } else if (z2) {
                        if (str5 != null) {
                            if (this.f24345k) {
                                i = i;
                                str5 = null;
                            } else {
                                str5 = str5 + "|" + str6;
                                i = i;
                            }
                        }
                        str5 = str6;
                    }
                } else {
                    q = q;
                    str3 = str3;
                    str4 = str4;
                }
                mVar2 = mVar;
            }
            if (str5 == null) {
                parsePosition.setErrorIndex(index);
            } else {
                parsePosition.setIndex(index + i);
            }
            return str5;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Serialization proxy required.");
        }

        private Object writeReplace() {
            return new SPX(this, 7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: D */
        public String m11443D() {
            return this.f24346l.f24342b;
        }

        /* renamed from: E */
        public AbstractC8079p<?> mo11086b(AbstractC8080q<?> qVar) {
            return null;
        }

        /* renamed from: F */
        public AbstractC8079p<?> mo11085c(AbstractC8080q<?> qVar) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: G */
        public Object m11440G() {
            return this.f24346l.f24343c;
        }

        /* renamed from: H */
        public String mo11059f() {
            if (this.f24345k) {
                return "pm";
            }
            return (String) this.f24346l.f24343c.get((C10906g0) this.f24346l.f24343c.lastKey());
        }

        /* renamed from: I */
        public String mo11062T() {
            if (this.f24345k) {
                return "am";
            }
            return (String) this.f24346l.f24343c.get((C10906g0) this.f24346l.f24343c.firstKey());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J */
        public Locale m11437J() {
            return this.f24346l.f24341a;
        }

        /* renamed from: K */
        public String mo11084d(AbstractC8080q<?> qVar) {
            return mo11059f();
        }

        /* renamed from: L */
        public String mo11078k(AbstractC8080q<?> qVar) {
            return mo11062T();
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: M */
        public boolean mo11063M() {
            return false;
        }

        /* renamed from: N */
        public String mo11076n(AbstractC8080q<?> qVar) {
            String str;
            C10906g0 g0Var = (C10906g0) qVar.mo11371r(C10906g0.f24208z);
            if (this.f24345k) {
                return C10961k.m11451n(g0Var);
            }
            if (this.f24346l.m11449p()) {
                Map q = C10961k.m11448q(m11437J(), m11443D());
                if (g0Var.m11780E0()) {
                    str = "midnight";
                } else if (g0Var.m11779F0(C10906g0.m11775J0(12))) {
                    str = "noon";
                } else {
                    str = null;
                }
                if (str != null && q.containsKey(C10961k.m11454k(q, EnumC8671v.ABBREVIATED, EnumC8658m.FORMAT, str))) {
                    return str;
                }
            }
            return (String) this.f24346l.f24343c.get(this.f24346l.m11450o(g0Var));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O */
        public boolean m11433O() {
            return this.f24345k;
        }

        /* renamed from: P */
        public boolean mo11081h(AbstractC8080q<?> qVar, String str) {
            return false;
        }

        /* renamed from: Q */
        public String mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
            int index = parsePosition.getIndex();
            AbstractC8046c<EnumC8658m> cVar = C8627a.f19059h;
            EnumC8658m mVar = EnumC8658m.FORMAT;
            EnumC8658m mVar2 = (EnumC8658m) dVar.mo15674c(cVar, mVar);
            String R = m11430R(charSequence, parsePosition, dVar, mVar2);
            if (R != null || !((Boolean) dVar.mo15674c(C8627a.f19062k, Boolean.TRUE)).booleanValue()) {
                return R;
            }
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = EnumC8658m.STANDALONE;
            }
            return m11430R(charSequence, parsePosition, dVar, mVar);
        }

        /* renamed from: S */
        public AbstractC8080q<?> mo11077m(AbstractC8080q<?> qVar, String str, boolean z) {
            throw new IllegalArgumentException("Day period element cannot be set.");
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: U */
        public boolean mo11061U() {
            return true;
        }

        @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
        /* renamed from: a */
        public char mo11060a() {
            return this.f24345k ? 'b' : 'B';
        }

        @Override // p143hj.AbstractC8079p
        public Class<String> getType() {
            return String.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: q */
        public <T extends AbstractC8080q<T>> AbstractC8091z<T, String> mo11057q(C8087x<T> xVar) {
            if (xVar.m20657A(C10906g0.f24208z)) {
                return this;
            }
            return null;
        }

        @Override // p143hj.AbstractC8050e
        /* renamed from: s */
        protected boolean mo11055s(AbstractC8050e<?> eVar) {
            return this.f24346l.equals(((C10963b) eVar).f24346l);
        }

        @Override // p143hj.AbstractC8050e
        public String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(name());
            sb2.append('@');
            sb2.append(this.f24346l);
            return sb2.toString();
        }

        @Override // p161ij.AbstractC8669t
        /* renamed from: z */
        public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
            String str;
            EnumC8671v vVar = (EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE);
            EnumC8658m mVar = (EnumC8658m) dVar.mo15674c(C8627a.f19059h, EnumC8658m.FORMAT);
            if (this.f24345k) {
                str = this.f24346l.m11453l(vVar, mVar).apply(oVar);
            } else {
                str = this.f24346l.m11455j(vVar, mVar).apply(oVar);
            }
            appendable.append(str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10963b(boolean z, C10961k kVar) {
            super(z ? "FIXED_DAY_PERIOD" : "APPROXIMATE_DAY_PERIOD");
            this.f24345k = z;
            this.f24346l = kVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.k$c */
    /* loaded from: classes8.dex */
    public static class C10964c implements AbstractC8082s {
        /* renamed from: e */
        private static C10961k m11428e(Locale locale, AbstractC8048d dVar) {
            if (dVar.mo15676a(C10961k.f24340f)) {
                return (C10961k) dVar.mo15675b(C10961k.f24340f);
            }
            return C10961k.m11447r(locale, (String) dVar.mo15674c(C8627a.f19053b, "iso8601"));
        }

        /* renamed from: f */
        private static int m11427f(AbstractC8080q<?> qVar) {
            AbstractC10819c<Integer, C10906g0> cVar = C10906g0.f38909B;
            if (qVar.mo11377e(cVar)) {
                int intValue = ((Integer) qVar.mo11371r(cVar)).intValue();
                if (intValue == 12) {
                    return 0;
                }
                return intValue;
            }
            AbstractC10966k0<Integer, C10906g0> k0Var = C10906g0.f38911D;
            if (qVar.mo11377e(k0Var)) {
                return ((Integer) qVar.mo11371r(k0Var)).intValue();
            }
            return -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x012b A[LOOP:0: B:13:0x003f->B:75:0x012b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x011a A[EDGE_INSN: B:86:0x011a->B:71:0x011a ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0115 A[SYNTHETIC] */
        @Override // p143hj.AbstractC8082s
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p143hj.AbstractC8080q<?> mo10716a(p143hj.AbstractC8080q<?> r17, java.util.Locale r18, p143hj.AbstractC8048d r19) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10961k.C10964c.mo10716a(hj.q, java.util.Locale, hj.d):hj.q");
        }

        @Override // p143hj.AbstractC8082s
        /* renamed from: b */
        public Set<AbstractC8079p<?>> mo10715b(Locale locale, AbstractC8048d dVar) {
            C10961k e = m11428e(locale, dVar);
            HashSet hashSet = new HashSet();
            hashSet.add(new C10963b(false, e));
            if (!dVar.mo15676a(C10961k.f24340f)) {
                hashSet.add(new C10963b(true, e));
            }
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // p143hj.AbstractC8082s
        /* renamed from: c */
        public boolean mo10714c(Class<?> cls) {
            return C10906g0.class.isAssignableFrom(cls);
        }

        @Override // p143hj.AbstractC8082s
        /* renamed from: d */
        public boolean mo10713d(AbstractC8079p<?> pVar) {
            return pVar instanceof C10963b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.k$d */
    /* loaded from: classes8.dex */
    public class C10965d implements AbstractC8083t<AbstractC8077o, String> {

        /* renamed from: a */
        private final boolean f24347a;

        /* renamed from: b */
        private final EnumC8671v f24348b;

        /* renamed from: c */
        private final EnumC8658m f24349c;

        C10965d(boolean z, EnumC8671v vVar, EnumC8658m mVar) {
            if (vVar == null) {
                throw new NullPointerException("Missing text width.");
            } else if (mVar != null) {
                this.f24347a = z;
                this.f24348b = vVar;
                this.f24349c = mVar;
            } else {
                throw new NullPointerException("Missing output context.");
            }
        }

        /* renamed from: a */
        public String apply(AbstractC8077o oVar) {
            C10906g0 g0Var = (C10906g0) oVar.mo11371r(C10906g0.f24208z);
            C10961k kVar = C10961k.this;
            Locale locale = kVar.f24341a;
            if (this.f24347a) {
                String n = C10961k.m11451n(g0Var);
                if (!kVar.m11449p()) {
                    return n;
                }
                Map q = C10961k.m11448q(locale, kVar.f24342b);
                String k = C10961k.m11454k(q, this.f24348b, this.f24349c, n);
                if (!q.containsKey(k)) {
                    if (n.equals("midnight")) {
                        k = C10961k.m11454k(q, this.f24348b, this.f24349c, "am");
                    } else if (n.equals("noon")) {
                        k = C10961k.m11454k(q, this.f24348b, this.f24349c, "pm");
                    }
                }
                if (q.containsKey(k)) {
                    return (String) q.get(k);
                }
            } else if (!kVar.m11449p()) {
                return (String) kVar.f24343c.get(kVar.m11450o(g0Var));
            } else {
                Map q2 = C10961k.m11448q(locale, kVar.f24342b);
                if (g0Var.m11780E0()) {
                    String k2 = C10961k.m11454k(q2, this.f24348b, this.f24349c, "midnight");
                    if (q2.containsKey(k2)) {
                        return (String) q2.get(k2);
                    }
                } else if (g0Var.m11779F0(C10906g0.m11775J0(12))) {
                    String k3 = C10961k.m11454k(q2, this.f24348b, this.f24349c, "noon");
                    if (q2.containsKey(k3)) {
                        return (String) q2.get(k3);
                    }
                }
                String k4 = C10961k.m11454k(q2, this.f24348b, this.f24349c, (String) kVar.f24343c.get(kVar.m11450o(g0Var)));
                if (q2.containsKey(k4)) {
                    return (String) q2.get(k4);
                }
            }
            EnumC11044z zVar = (EnumC11044z) g0Var.mo11371r(C10906g0.f38908A);
            if (locale == null) {
                locale = Locale.ROOT;
            }
            return zVar.m11142a(locale);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        treeMap.put(C10906g0.m11776I0(), "am");
        treeMap.put(C10906g0.m11775J0(12), "pm");
        SortedMap<C10906g0, String> unmodifiableSortedMap = Collections.unmodifiableSortedMap(treeMap);
        f24338d = unmodifiableSortedMap;
        f24339e = new C10961k(Locale.ROOT, "iso8601", unmodifiableSortedMap);
    }

    private C10961k(Locale locale, String str, SortedMap<C10906g0, String> sortedMap) {
        this.f24341a = locale;
        this.f24342b = str;
        this.f24343c = Collections.unmodifiableSortedMap(sortedMap);
    }

    /* renamed from: a */
    private static boolean m11464a(String str) {
        return str.charAt(0) == 'T' && str.length() == 5 && Character.isDigit(str.charAt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static String m11454k(Map<String, String> map, EnumC8671v vVar, EnumC8658m mVar, String str) {
        if (vVar == EnumC8671v.SHORT) {
            vVar = EnumC8671v.ABBREVIATED;
        }
        String str2 = m11445t(vVar, mVar) + str;
        if (map.containsKey(str2)) {
            return str2;
        }
        if (mVar == EnumC8658m.STANDALONE) {
            EnumC8671v vVar2 = EnumC8671v.ABBREVIATED;
            if (vVar == vVar2) {
                return m11454k(map, vVar, EnumC8658m.FORMAT, str);
            }
            return m11454k(map, vVar2, mVar, str);
        }
        EnumC8671v vVar3 = EnumC8671v.ABBREVIATED;
        if (vVar != vVar3) {
            return m11454k(map, vVar3, mVar, str);
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static String m11451n(C10906g0 g0Var) {
        int intValue = ((Integer) g0Var.mo11371r(C10906g0.f38915H)).intValue();
        return (intValue == 0 || intValue == 1440) ? "midnight" : intValue < 720 ? "am" : intValue == 720 ? "noon" : "pm";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public boolean m11449p() {
        return this.f24341a != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static Map<String, String> m11448q(Locale locale, String str) {
        Map<String, String> o = C8629b.m18469c(str, locale).m18457o();
        if (str.equals("iso8601") || "true".equals(o.get("hasDayPeriods"))) {
            return o;
        }
        return C8629b.m18468d(locale).m18457o();
    }

    /* renamed from: r */
    static C10961k m11447r(Locale locale, String str) {
        String language = locale.getLanguage();
        if (language.equals("nn")) {
            locale = new Locale("nb");
        }
        Map<String, String> q = m11448q(locale, str);
        TreeMap treeMap = new TreeMap();
        for (String str2 : q.keySet()) {
            if (m11464a(str2)) {
                int parseInt = Integer.parseInt(str2.substring(1, 3));
                int parseInt2 = Integer.parseInt(str2.substring(3, 5));
                C10906g0 I0 = C10906g0.m11776I0();
                if (parseInt == 24) {
                    if (parseInt2 != 0) {
                        throw new IllegalStateException("Invalid time key: " + str2);
                    }
                } else if (parseInt < 0 || parseInt >= 24 || parseInt2 < 0 || parseInt2 >= 60) {
                    throw new IllegalStateException("Invalid time key: " + str2);
                } else {
                    I0 = I0.m20683K((parseInt * 60) + parseInt2, EnumC10899g.f24190l);
                }
                treeMap.put(I0, q.get(str2));
            }
        }
        if (treeMap.isEmpty() || language.isEmpty()) {
            return f24339e;
        }
        Iterator it = treeMap.keySet().iterator();
        String str3 = "";
        while (it.hasNext()) {
            String str4 = (String) treeMap.get((C10906g0) it.next());
            if (str4.equals(str3)) {
                it.remove();
            } else {
                str3 = str4;
            }
        }
        return new C10961k(locale, str, treeMap);
    }

    /* renamed from: s */
    public static C10961k m11446s(Map<C10906g0, String> map) {
        if (!map.isEmpty()) {
            TreeMap treeMap = new TreeMap(map);
            for (C10906g0 g0Var : map.keySet()) {
                if (g0Var.mo11640p() == 24) {
                    treeMap.put(C10906g0.m11776I0(), map.get(g0Var));
                    treeMap.remove(g0Var);
                } else if (map.get(g0Var).isEmpty()) {
                    throw new IllegalArgumentException("Map has empty label: " + map);
                }
            }
            return new C10961k(null, "", treeMap);
        }
        throw new IllegalArgumentException("Label map is empty.");
    }

    /* renamed from: t */
    private static String m11445t(EnumC8671v vVar, EnumC8658m mVar) {
        char c;
        int i = C10962a.f24344a[vVar.ordinal()];
        if (i == 1) {
            c = 'w';
        } else if (i != 2) {
            c = 'a';
        } else {
            c = 'n';
        }
        if (mVar == EnumC8658m.STANDALONE) {
            c = Character.toUpperCase(c);
        }
        return "P(" + c + ")_";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10961k)) {
            return false;
        }
        C10961k kVar = (C10961k) obj;
        Locale locale = this.f24341a;
        if (locale == null) {
            if (kVar.f24341a != null) {
                return false;
            }
        } else if (!locale.equals(kVar.f24341a)) {
            return false;
        }
        if (!this.f24343c.equals(kVar.f24343c) || !this.f24342b.equals(kVar.f24342b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f24343c.hashCode();
    }

    /* renamed from: j */
    public AbstractC8083t<AbstractC8077o, String> m11455j(EnumC8671v vVar, EnumC8658m mVar) {
        return new C10965d(false, vVar, mVar);
    }

    /* renamed from: l */
    public AbstractC8083t<AbstractC8077o, String> m11453l(EnumC8671v vVar, EnumC8658m mVar) {
        return new C10965d(true, vVar, mVar);
    }

    /* renamed from: m */
    public C10906g0 m11452m(C10906g0 g0Var) {
        if (g0Var.mo11640p() == 24) {
            g0Var = C10906g0.m11776I0();
        }
        for (C10906g0 g0Var2 : this.f24343c.keySet()) {
            if (g0Var.m11783B0(g0Var2)) {
                return g0Var2;
            }
        }
        return this.f24343c.firstKey();
    }

    /* renamed from: o */
    public C10906g0 m11450o(C10906g0 g0Var) {
        if (g0Var.mo11640p() == 24) {
            g0Var = C10906g0.m11776I0();
        }
        C10906g0 lastKey = this.f24343c.lastKey();
        for (C10906g0 g0Var2 : this.f24343c.keySet()) {
            if (g0Var.m11779F0(g0Var2)) {
                return g0Var2;
            }
            if (g0Var.m11783B0(g0Var2)) {
                break;
            }
            lastKey = g0Var2;
        }
        return lastKey;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayPeriod[");
        if (m11449p()) {
            sb2.append("locale=");
            sb2.append(this.f24341a);
            sb2.append(',');
            if (!this.f24342b.equals("iso8601")) {
                sb2.append(",calendar-type=");
                sb2.append(this.f24342b);
                sb2.append(',');
            }
        }
        sb2.append(this.f24343c);
        sb2.append(']');
        return sb2.toString();
    }
}
