package p183jj;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10817f;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.EnumC10996f;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.EnumC8637g;
import p163j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.n */
/* loaded from: classes8.dex */
public final class C9668n implements AbstractC9657h<AbstractC11001k> {

    /* renamed from: s */
    private static final C11028p f21468s = C11028p.m11181p(64800);

    /* renamed from: t */
    private static final ConcurrentMap<Locale, String> f21469t = new ConcurrentHashMap();

    /* renamed from: u */
    private static final ConcurrentMap<Locale, C9669a> f21470u = new ConcurrentHashMap();

    /* renamed from: k */
    private final boolean f21471k;

    /* renamed from: l */
    private final boolean f21472l;

    /* renamed from: m */
    private final boolean f21473m;

    /* renamed from: n */
    private final Locale f21474n;

    /* renamed from: o */
    private final String f21475o;

    /* renamed from: p */
    private final String f21476p;

    /* renamed from: q */
    private final char f21477q;

    /* renamed from: r */
    private final EnumC8637g f21478r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jj.n$a */
    /* loaded from: classes8.dex */
    public static class C9669a {

        /* renamed from: a */
        private final String f21479a;

        /* renamed from: b */
        private final String f21480b;

        /* renamed from: c */
        private final int f21481c;

        /* renamed from: d */
        private final int f21482d;

        C9669a(String str, String str2, int i, int i2) {
            this.f21479a = str;
            this.f21480b = str2;
            this.f21481c = i;
            this.f21482d = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9668n(boolean z) {
        this(z, true, false, Locale.ROOT, "+", "-", '0', EnumC8637g.SMART);
    }

    /* renamed from: a */
    private static boolean m15690a(char c, char c2) {
        if (c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static String m15689h(Locale locale) {
        ConcurrentMap<Locale, String> concurrentMap = f21469t;
        String str = concurrentMap.get(locale);
        if (str != null) {
            return str;
        }
        String m = C11028p.f24516u.m11184m(locale);
        String putIfAbsent = concurrentMap.putIfAbsent(locale, m);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return m;
    }

    /* renamed from: i */
    private static C11028p m15688i(AbstractC8077o oVar, AbstractC8048d dVar) {
        AbstractC8046c<AbstractC11001k> cVar = C8627a.f19055d;
        if (dVar.mo15676a(cVar)) {
            AbstractC11001k kVar = (AbstractC11001k) dVar.mo15675b(cVar);
            if (kVar instanceof C11028p) {
                return (C11028p) kVar;
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + oVar);
    }

    /* renamed from: j */
    private static C9669a m15687j(Locale locale) {
        C9669a aVar = f21470u.get(locale);
        if (aVar != null) {
            return aVar;
        }
        String m = f21468s.m11184m(locale);
        int length = m.length();
        for (int i = 0; i < length; i++) {
            if (m.charAt(i) == 177) {
                int indexOf = m.indexOf("hh", i) + 2;
                int indexOf2 = m.indexOf("mm", indexOf);
                C9669a aVar2 = new C9669a(m, m.substring(indexOf, indexOf2), i, indexOf2 + 2);
                C9669a putIfAbsent = f21470u.putIfAbsent(locale, aVar2);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return aVar2;
            }
        }
        return aVar;
    }

    /* renamed from: k */
    private static int m15686k(CharSequence charSequence, int i, char c) {
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = i + i3;
            if (i4 < charSequence.length()) {
                int charAt = charSequence.charAt(i4) - c;
                if (charAt >= 0 && charAt <= 9) {
                    i2 = (i2 * 10) + charAt;
                } else if (i3 == 0) {
                    return -1000;
                } else {
                    return ~i2;
                }
            } else if (i3 == 0) {
                return -1000;
            } else {
                return ~i2;
            }
        }
        return i2;
    }

    /* renamed from: l */
    private static int m15685l(CharSequence charSequence, int i, char c) {
        int charAt;
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = i + i3;
            if (i4 >= charSequence.length() || (charAt = charSequence.charAt(i4) - c) < 0 || charAt > 9) {
                return -1000;
            }
            i2 = (i2 * 10) + charAt;
        }
        return i2;
    }

    /* renamed from: m */
    private static int m15684m(CharSequence charSequence, int i, int i2, Locale locale, boolean z) {
        String[] strArr = {"GMT", m15689h(locale), "UTC", "UT"};
        for (int i3 = 0; i3 < 4; i3++) {
            String str = strArr[i3];
            int length = str.length();
            if (i - i2 >= length) {
                String charSequence2 = charSequence.subSequence(i2, i2 + length).toString();
                if ((z && charSequence2.equalsIgnoreCase(str)) || (!z && charSequence2.equals(str))) {
                    return length;
                }
            }
        }
        return 0;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<AbstractC11001k> mo15599b() {
        return EnumC9636b0.TIMEZONE_OFFSET;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        int i;
        AbstractC11001k kVar;
        C11028p pVar;
        Locale locale;
        char c;
        String str;
        String str2;
        boolean z2;
        int i2;
        C11028p pVar2;
        char c2;
        int i3;
        if (appendable instanceof CharSequence) {
            i = ((CharSequence) appendable).length();
        } else {
            i = -1;
        }
        if (oVar.mo11376f()) {
            kVar = oVar.mo11372q();
        } else {
            kVar = null;
        }
        if (kVar == null) {
            pVar = m15688i(oVar, dVar);
        } else if (kVar instanceof C11028p) {
            pVar = (C11028p) kVar;
        } else if (oVar instanceof AbstractC10817f) {
            pVar = AbstractC11002l.m11310N(kVar).mo11322B((AbstractC10817f) oVar);
        } else {
            throw new IllegalArgumentException("Cannot extract timezone offset from: " + oVar);
        }
        if (z) {
            locale = this.f21474n;
        } else {
            locale = (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT);
        }
        char c3 = '0';
        if (z) {
            c = this.f21477q;
        } else {
            c = ((Character) dVar.mo15674c(C8627a.f19064m, '0')).charValue();
        }
        if (z) {
            str = this.f21475o;
        } else {
            str = (String) dVar.mo15674c(C9634b.f21315g, "+");
        }
        if (z) {
            str2 = this.f21476p;
        } else {
            str2 = (String) dVar.mo15674c(C9634b.f21316h, "-");
        }
        if (z) {
            z2 = this.f21473m;
        } else {
            z2 = ((Boolean) dVar.mo15674c(C8627a.f19065n, Boolean.FALSE)).booleanValue();
        }
        int j = pVar.m11187j();
        int i4 = pVar.m11188i();
        if (!z2 && j == 0 && i4 == 0) {
            String h = m15689h(locale);
            appendable.append(h);
            i2 = h.length();
        } else {
            C9669a j2 = m15687j(locale);
            int length = j2.f21479a.length();
            int i5 = 0;
            int i6 = 0;
            while (i6 < length) {
                char charAt = j2.f21479a.charAt(i6);
                if (j2.f21481c > i6 || j2.f21482d <= i6) {
                    pVar2 = pVar;
                    c2 = c3;
                    if (!z2) {
                        appendable.append(charAt);
                        i5++;
                    }
                } else {
                    if (pVar.m11185l() == EnumC10996f.BEHIND_UTC) {
                        appendable.append(str2);
                        i3 = str2.length();
                    } else {
                        appendable.append(str);
                        i3 = str.length();
                    }
                    i5 += i3;
                    int f = pVar.m11191f();
                    int g = pVar.m11190g();
                    int h2 = pVar.m11189h();
                    if (f < 10 && !this.f21471k) {
                        appendable.append(c);
                        i5++;
                    }
                    String valueOf = String.valueOf(f);
                    pVar2 = pVar;
                    for (int i7 = 0; i7 < valueOf.length(); i7++) {
                        appendable.append((char) ((valueOf.charAt(i7) - '0') + c));
                        i5++;
                    }
                    if (!(g == 0 && h2 == 0 && this.f21471k)) {
                        appendable.append(j2.f21480b);
                        i5 += j2.f21480b.length();
                        if (g < 10) {
                            appendable.append(c);
                            i5++;
                        }
                        String valueOf2 = String.valueOf(g);
                        for (int i8 = 0; i8 < valueOf2.length(); i8++) {
                            appendable.append((char) ((valueOf2.charAt(i8) - '0') + c));
                            i5++;
                        }
                        if (h2 != 0) {
                            appendable.append(j2.f21480b);
                            i5 += j2.f21480b.length();
                            if (h2 < 10) {
                                appendable.append(c);
                                i5++;
                            }
                            String valueOf3 = String.valueOf(h2);
                            for (int i9 = 0; i9 < valueOf3.length(); i9++) {
                                appendable.append((char) ((valueOf3.charAt(i9) - '0') + c));
                                i5++;
                            }
                        }
                    }
                    c2 = '0';
                    i6 = j2.f21482d - 1;
                }
                i6++;
                c3 = c2;
                pVar = pVar2;
            }
            i2 = i5;
        }
        if (!(i == -1 || i2 <= 0 || set == null)) {
            set.add(new C9653g(EnumC9636b0.TIMEZONE_ID, i, i + i2));
        }
        return i2;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<AbstractC11001k> mo15597d(AbstractC8079p<AbstractC11001k> pVar) {
        return this;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    public void mo15596e(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, AbstractC9676t<?> tVar, boolean z) {
        Locale locale;
        boolean z2;
        boolean z3;
        char c;
        String str;
        String str2;
        boolean z4;
        Locale locale2;
        int i;
        String str3;
        String str4;
        char c2;
        EnumC10996f fVar;
        int i2;
        EnumC8637g gVar;
        int i3;
        int i4;
        C11028p pVar;
        int n;
        int length = charSequence.length();
        int f = sVar.m15664f();
        if (f >= length) {
            sVar.m15659k(f, "Missing localized time zone offset.");
            return;
        }
        if (z) {
            locale = this.f21474n;
        } else {
            locale = (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT);
        }
        boolean q = C8629b.m18455q(locale);
        if (z) {
            z2 = this.f21473m;
        } else {
            z2 = ((Boolean) dVar.mo15674c(C8627a.f19065n, Boolean.FALSE)).booleanValue();
        }
        if (z) {
            z3 = this.f21472l;
        } else {
            z3 = ((Boolean) dVar.mo15674c(C8627a.f19060i, Boolean.TRUE)).booleanValue();
        }
        if (z) {
            c = this.f21477q;
        } else {
            c = ((Character) dVar.mo15674c(C8627a.f19064m, '0')).charValue();
        }
        if (z) {
            str = this.f21475o;
        } else {
            str = (String) dVar.mo15674c(C9634b.f21315g, "+");
        }
        if (z) {
            str2 = this.f21476p;
        } else {
            str2 = (String) dVar.mo15674c(C9634b.f21316h, "-");
        }
        C9669a j = m15687j(locale);
        int length2 = j.f21479a.length();
        int i5 = 0;
        int i6 = f;
        int i7 = 0;
        C11028p pVar2 = null;
        while (i7 < length2) {
            char charAt = j.f21479a.charAt(i7);
            if (j.f21481c > i7 || j.f21482d <= i7) {
                i = f;
                locale2 = locale;
                z4 = q;
                str4 = str;
                str3 = str2;
                if (z2) {
                    continue;
                } else {
                    if (i6 < length) {
                        c2 = charSequence.charAt(i6);
                    } else {
                        c2 = 0;
                    }
                    if ((z3 || charAt != c2) && (!z3 || !m15690a(charAt, c2))) {
                        int m = m15684m(charSequence, length, i, locale2, z3);
                        if (m > 0) {
                            tVar.mo15648I(EnumC9636b0.TIMEZONE_OFFSET, C11028p.f24516u);
                            sVar.m15658l(i + m);
                            return;
                        }
                        sVar.m15659k(i, "Literal mismatched in localized time zone offset.");
                        return;
                    }
                    i6++;
                }
            } else {
                int n2 = C9667m.m15691n(charSequence, i6, str, z3, q);
                if (n2 == -1) {
                    n2 = C9667m.m15691n(charSequence, i6, str2, z3, q);
                    if (n2 == -1) {
                        if (!z2) {
                            i5 = m15684m(charSequence, length, f, locale, z3);
                        }
                        if (i5 > 0) {
                            tVar.mo15648I(EnumC9636b0.TIMEZONE_OFFSET, C11028p.f24516u);
                            sVar.m15658l(f + i5);
                            return;
                        }
                        sVar.m15659k(f, "Missing sign in localized time zone offset.");
                        return;
                    }
                    fVar = EnumC10996f.BEHIND_UTC;
                } else {
                    fVar = EnumC10996f.AHEAD_OF_UTC;
                }
                int i8 = i6 + n2;
                int k = m15686k(charSequence, i8, c);
                str4 = str;
                if (k == -1000) {
                    sVar.m15659k(i8, "Missing hour part in localized time zone offset.");
                    return;
                }
                if (k < 0) {
                    k = ~k;
                    i2 = i8 + 1;
                } else {
                    i2 = i8 + 2;
                }
                if (i2 < length) {
                    str3 = str2;
                    if (z) {
                        gVar = this.f21478r;
                        i = f;
                        locale2 = locale;
                    } else {
                        i = f;
                        locale2 = locale;
                        gVar = (EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART);
                    }
                    int n3 = C9667m.m15691n(charSequence, i2, j.f21480b, z3, q);
                    if (n3 != -1) {
                        i2 += n3;
                    } else if (this.f21471k) {
                        tVar.mo15648I(EnumC9636b0.TIMEZONE_OFFSET, C11028p.m11183n(fVar, k));
                        sVar.m15658l(i2);
                        return;
                    } else if (gVar.m18441c()) {
                        sVar.m15659k(i2, "Mismatch of localized time zone offset separator.");
                        return;
                    }
                    int l = m15685l(charSequence, i2, c);
                    if (l == -1000) {
                        sVar.m15659k(i2, "Minute part in localized time zone offset does not match expected pattern mm.");
                        return;
                    }
                    i6 = i2 + 2;
                    if (i6 >= length || (n = C9667m.m15691n(charSequence, i6, j.f21480b, z3, q)) == -1) {
                        z4 = q;
                        i4 = -1000;
                        i3 = 0;
                    } else {
                        int i9 = i6 + n;
                        i3 = m15685l(charSequence, i9, c);
                        z4 = q;
                        i4 = -1000;
                        if (i3 == -1000) {
                            i6 = i9 - n;
                        } else {
                            i6 = i9 + 2;
                        }
                    }
                    if (i3 == 0 || i3 == i4) {
                        pVar = C11028p.m11182o(fVar, k, l);
                    } else {
                        int i10 = (k * 3600) + (l * 60) + i3;
                        if (fVar == EnumC10996f.BEHIND_UTC) {
                            i10 = -i10;
                        }
                        pVar = C11028p.m11181p(i10);
                    }
                    pVar2 = pVar;
                    i7 = j.f21482d - 1;
                } else if (this.f21471k) {
                    tVar.mo15648I(EnumC9636b0.TIMEZONE_OFFSET, C11028p.m11183n(fVar, k));
                    sVar.m15658l(i2);
                    return;
                } else {
                    sVar.m15659k(i2, "Missing minute part in localized time zone offset.");
                    return;
                }
            }
            f = i;
            locale = locale2;
            i7++;
            length2 = length2;
            str = str4;
            str2 = str3;
            q = z4;
        }
        if (pVar2 == null) {
            sVar.m15659k(i6, "Unable to determine localized time zone offset.");
            return;
        }
        tVar.mo15648I(EnumC9636b0.TIMEZONE_OFFSET, pVar2);
        sVar.m15658l(i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9668n) || this.f21471k != ((C9668n) obj).f21471k) {
            return false;
        }
        return true;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<AbstractC11001k> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        return new C9668n(this.f21471k, ((Boolean) dVar.mo15674c(C8627a.f19060i, Boolean.TRUE)).booleanValue(), ((Boolean) dVar.mo15674c(C8627a.f19065n, Boolean.FALSE)).booleanValue(), (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT), (String) dVar.mo15674c(C9634b.f21315g, "+"), (String) dVar.mo15674c(C9634b.f21316h, "-"), ((Character) dVar.mo15674c(C8627a.f19064m, '0')).charValue(), (EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART));
    }

    public int hashCode() {
        return this.f21471k ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9668n.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f21471k);
        sb2.append(']');
        return sb2.toString();
    }

    private C9668n(boolean z, boolean z2, boolean z3, Locale locale, String str, String str2, char c, EnumC8637g gVar) {
        this.f21471k = z;
        this.f21472l = z2;
        this.f21473m = z3;
        this.f21474n = locale;
        this.f21475o = str;
        this.f21476p = str2;
        this.f21477q = c;
        this.f21478r = gVar;
    }
}
