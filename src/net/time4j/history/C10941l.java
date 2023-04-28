package net.time4j.history;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.InvalidObjectException;
import java.text.ParsePosition;
import java.util.List;
import java.util.Locale;
import net.time4j.C10892f0;
import net.time4j.EnumC10809b0;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.C10813c;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8050e;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8091z;
import p143hj.C8058h;
import p143hj.C8081r;
import p143hj.C8087x;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.C8668s;
import p161ij.EnumC8637g;
import p161ij.EnumC8641j;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p201kj.AbstractC9886a;
import p219lj.EnumC10455a;
import p234mj.C10671c;

/* renamed from: net.time4j.history.l */
/* loaded from: classes8.dex */
final class C10941l extends C10671c implements AbstractC9886a {
    private static final long serialVersionUID = -6283098762945747308L;
    private final C10929d history;

    /* renamed from: p */
    private final transient int f24298p;

    /* renamed from: net.time4j.history.l$a */
    /* loaded from: classes8.dex */
    private static class C10942a<C extends AbstractC8080q<C>> implements AbstractC8091z<C, Integer> {

        /* renamed from: k */
        private final int f24299k;

        /* renamed from: l */
        private final C10929d f24300l;

        C10942a(int i, C10929d dVar) {
            this.f24299k = i;
            this.f24300l = dVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        private C10934h m11505a(C c, int i) {
            EnumC10455a aVar;
            C10934h e = this.f24300l.m11577e((C10892f0) c.mo11371r(C10892f0.f24173y));
            EnumC10455a aVar2 = EnumC10455a.DUAL_DATING;
            C10954o w = this.f24300l.m11559w();
            int i2 = this.f24299k;
            switch (i2) {
                case 2:
                    break;
                case 3:
                    return this.f24300l.m11581a(C10934h.m11540g(e.m11544c(), e.m11542e(), i, e.m11545b()));
                case 4:
                    return C10934h.m11540g(e.m11544c(), e.m11542e(), e.m11543d(), i);
                case 5:
                    int f = e.m11541f(this.f24300l.m11559w());
                    C10934h n = this.f24300l.m11568n(e.m11544c(), f);
                    int v = this.f24300l.m11560v(e.m11544c(), f);
                    if (i == 1) {
                        return n;
                    }
                    if (i <= 1 || i > v) {
                        throw new IllegalArgumentException("Out of range: " + i);
                    }
                    return this.f24300l.m11577e(this.f24300l.m11578d(n).m20668U(C8058h.m20716c(i - 1)));
                case 6:
                case 7:
                    if (i2 == 6) {
                        aVar = EnumC10455a.AFTER_NEW_YEAR;
                    } else {
                        aVar = EnumC10455a.BEFORE_NEW_YEAR;
                    }
                    aVar2 = aVar;
                    break;
                case 8:
                    int i3 = 100;
                    int e2 = e.m11542e() % 100;
                    int i4 = (i - 1) * 100;
                    if (e2 != 0) {
                        i3 = e2;
                    }
                    return this.f24300l.m11581a(C10934h.m11539h(e.m11544c(), i4 + i3, e.m11543d(), e.m11545b(), aVar2, w));
                default:
                    throw new UnsupportedOperationException("Unknown element index: " + this.f24299k);
            }
            return this.f24300l.m11581a(C10934h.m11539h(e.m11544c(), i, e.m11543d(), e.m11545b(), aVar2, w));
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        /* renamed from: i */
        public Integer mo11084d(C c) {
            int i;
            C10934h hVar;
            int i2;
            int i3;
            try {
                C10934h e = this.f24300l.m11577e((C10892f0) c.mo11371r(C10892f0.f24173y));
                int i4 = 8;
                int i5 = 999984973;
                switch (this.f24299k) {
                    case 2:
                    case 6:
                    case 7:
                    case 8:
                        C10929d dVar = this.f24300l;
                        if (dVar != C10929d.f38935C) {
                            if (dVar == C10929d.f38934B) {
                                if (e.m11544c() == EnumC10937j.BC) {
                                    i5 = 999979466;
                                } else {
                                    i5 = 999979465;
                                }
                            } else if (dVar != C10929d.f38933A) {
                                if (e.m11544c() == EnumC10937j.BC) {
                                    i = 45;
                                } else {
                                    i = 9999;
                                }
                                i5 = i;
                            } else if (e.m11544c() == EnumC10937j.BC) {
                                i5 = 1000000000;
                            } else {
                                i5 = 999999999;
                            }
                        }
                        if (this.f24299k == 8) {
                            i5 = ((i5 - 1) / 100) + 1;
                        }
                        return Integer.valueOf(i5);
                    case 3:
                        if (e.m11544c() != EnumC10937j.BYZANTINE || e.m11542e() != 999984973) {
                            i4 = 12;
                        }
                        hVar = m11505a(c, i4);
                        i2 = i4;
                        break;
                    case 4:
                        i2 = this.f24300l.m11571k(e).mo11597b(e);
                        hVar = m11505a(c, i2);
                        break;
                    case 5:
                        int v = this.f24300l.m11560v(e.m11544c(), e.m11541f(this.f24300l.m11559w()));
                        if (v != -1) {
                            return Integer.valueOf(v);
                        }
                        throw new C8081r("Length of historic year undefined.");
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f24299k);
                }
                if (this.f24300l.m11593B(hVar)) {
                    return Integer.valueOf(i2);
                }
                List<C10932f> q = this.f24300l.m11565q();
                int size = q.size() - 1;
                while (true) {
                    if (size >= 0) {
                        C10932f fVar = q.get(size);
                        if (e.compareTo(fVar.f24275c) < 0) {
                            hVar = fVar.f24276d;
                        } else {
                            size--;
                        }
                    }
                }
                if (this.f24299k == 3) {
                    i3 = hVar.m11543d();
                } else {
                    i3 = hVar.m11545b();
                }
                return Integer.valueOf(i3);
            } catch (RuntimeException e2) {
                throw new C8081r(e2.getMessage(), e2);
            }
        }

        /* renamed from: j */
        public Integer mo11078k(C c) {
            int i;
            try {
                C10934h e = this.f24300l.m11577e((C10892f0) c.mo11371r(C10892f0.f24173y));
                int i2 = this.f24299k;
                if (!(i2 == 2 || i2 == 6 || i2 == 7 || i2 == 8)) {
                    C10934h a = m11505a(c, 1);
                    if (this.f24300l.m11593B(a)) {
                        return 1;
                    }
                    if (this.f24299k != 5) {
                        List<C10932f> q = this.f24300l.m11565q();
                        int size = q.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            C10932f fVar = q.get(size);
                            if (e.compareTo(fVar.f24275c) >= 0) {
                                a = fVar.f24275c;
                                break;
                            }
                            size--;
                        }
                        if (this.f24299k == 3) {
                            i = a.m11543d();
                        } else {
                            i = a.m11545b();
                        }
                        return Integer.valueOf(i);
                    }
                    throw new C8081r("Historic New Year cannot be determined.");
                }
                if (e.m11544c() != EnumC10937j.BYZANTINE || e.m11543d() < 9) {
                    return 1;
                }
                return 0;
            } catch (IllegalArgumentException e2) {
                throw new C8081r(e2.getMessage(), e2);
            }
        }

        /* renamed from: o */
        public Integer mo11076n(C c) {
            int i;
            try {
                C10892f0 f0Var = (C10892f0) c.mo11371r(C10892f0.f24173y);
                C10934h e = this.f24300l.m11577e(f0Var);
                switch (this.f24299k) {
                    case 2:
                        i = e.m11542e();
                        break;
                    case 3:
                        i = e.m11543d();
                        break;
                    case 4:
                        i = e.m11545b();
                        break;
                    case 5:
                        i = (int) ((f0Var.mo12079c() - this.f24300l.m11578d(this.f24300l.m11568n(e.m11544c(), e.m11541f(this.f24300l.m11559w()))).mo12079c()) + 1);
                        break;
                    case 6:
                    case 7:
                        i = e.m11541f(this.f24300l.m11559w());
                        break;
                    case 8:
                        i = ((e.m11542e() - 1) / 100) + 1;
                        break;
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f24299k);
                }
                return Integer.valueOf(i);
            } catch (IllegalArgumentException e2) {
                throw new C8081r(e2.getMessage(), e2);
            }
        }

        /* renamed from: p */
        public boolean mo11081h(C c, Integer num) {
            if (num == null) {
                return false;
            }
            try {
                return this.f24300l.m11593B(m11505a(c, num.intValue()));
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        /* renamed from: q */
        public C mo11077m(C c, Integer num, boolean z) {
            if (num != null) {
                return (C) c.mo15654D(C10892f0.f24173y, this.f24300l.m11578d(m11505a(c, num.intValue())));
            }
            throw new IllegalArgumentException("Missing historic element value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10941l(char c, int i, int i2, C10929d dVar, int i3) {
        super(m11508L(i3), c, i, i2);
        this.history = dVar;
        this.f24298p = i3;
    }

    /* renamed from: E */
    private void m11515E(String str, int i) {
        if (str.length() > i) {
            throw new IllegalArgumentException("Element " + name() + " cannot be printed as the formatted value " + str + " exceeds the maximum width of " + i + ".");
        }
    }

    /* renamed from: F */
    private String m11514F(EnumC8641j jVar, char c, int i, int i2, int i3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.mo18424p(i));
        sb2.append('/');
        if (!jVar.mo18426l() || i2 < 100 || C10813c.m12202a(i, 100) != C10813c.m12202a(i2, 100)) {
            sb2.append(jVar.mo18424p(i2));
        } else {
            int c2 = C10813c.m12200c(i2, 100);
            if (c2 < 10) {
                sb2.append(c);
            }
            sb2.append(jVar.mo18424p(c2));
        }
        if (jVar.mo18426l()) {
            return m11511I(sb2.toString(), i3, c);
        }
        return sb2.toString();
    }

    /* renamed from: G */
    private int m11513G(int i, int i2, int i3) {
        if (i2 < 0) {
            return ViewDefaults.NUMBER_OF_LINES;
        }
        int i4 = 100;
        if (i2 >= 100 || i < 100) {
            return ViewDefaults.NUMBER_OF_LINES;
        }
        if (i2 < 10) {
            i4 = 10;
        }
        if (Math.abs(i2 - C10813c.m12200c(i, i4)) <= i3) {
            return (C10813c.m12202a(i, i4) * i4) + i2;
        }
        return ViewDefaults.NUMBER_OF_LINES;
    }

    /* renamed from: H */
    private C8668s m11512H(AbstractC8048d dVar, EnumC8658m mVar) {
        return C8629b.m18468d((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT)).m18460l((EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE), mVar);
    }

    /* renamed from: I */
    private static String m11511I(String str, int i, char c) {
        int length = str.length();
        if (i <= length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i2 = i - length;
        for (int i3 = 0; i3 < i2; i3++) {
            sb2.append(c);
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: K */
    private static int m11509K(EnumC8641j jVar, char c, CharSequence charSequence, int i, ParsePosition parsePosition, EnumC8637g gVar) {
        boolean z;
        int i2;
        int charAt;
        int i3 = 0;
        long j = 0;
        if (jVar.mo18426l()) {
            if (jVar == EnumC8641j.f19112k && charSequence.charAt(i) == '-') {
                i2 = i + 1;
                z = true;
            } else {
                i2 = i;
                z = false;
            }
            if (!gVar.m18441c()) {
                i3 = jVar.mo18427j().charAt(0);
            }
            int min = Math.min(i2 + 9, charSequence.length());
            int i4 = i2;
            while (i2 < min) {
                int charAt2 = charSequence.charAt(i2) - c;
                if (charAt2 < 0 || charAt2 > 9) {
                    if (i3 == 0 || c == i3 || (charAt = charSequence.charAt(i2) - i3) < 0 || charAt > 9) {
                        break;
                    }
                    j = (j * 10) + charAt;
                    i4++;
                    c = i3;
                } else {
                    j = (j * 10) + charAt2;
                    i4++;
                }
                i2++;
            }
            if (j > 2147483647L) {
                parsePosition.setErrorIndex(i);
                return Integer.MIN_VALUE;
            }
            if (z) {
                if (i4 != i + 1) {
                    j = C10813c.m12192k(j);
                }
            }
            i = i4;
        } else {
            int length = charSequence.length();
            for (int i5 = i; i5 < length && jVar.mo18428h(charSequence.charAt(i5)); i5++) {
                i3++;
            }
            if (i3 > 0) {
                int i6 = i3 + i;
                j = jVar.mo18425n(charSequence.subSequence(i, i6).toString(), gVar);
                i = i6;
            }
        }
        parsePosition.setIndex(i);
        return (int) j;
    }

    /* renamed from: L */
    private static String m11508L(int i) {
        switch (i) {
            case 2:
                return "YEAR_OF_ERA";
            case 3:
                return "HISTORIC_MONTH";
            case 4:
                return "HISTORIC_DAY_OF_MONTH";
            case 5:
                return "HISTORIC_DAY_OF_YEAR";
            case 6:
                return "YEAR_AFTER";
            case 7:
                return "YEAR_BEFORE";
            case 8:
                return "CENTURY_OF_ERA";
            default:
                throw new UnsupportedOperationException("Unknown element index: " + i);
        }
    }

    private Object readResolve() {
        String name = name();
        if (name.equals("YEAR_OF_ERA")) {
            return this.history.m11582M();
        }
        if (name.equals("HISTORIC_MONTH")) {
            return this.history.m11592C();
        }
        if (name.equals("HISTORIC_DAY_OF_MONTH")) {
            return this.history.m11575g();
        }
        if (name.equals("HISTORIC_DAY_OF_YEAR")) {
            return this.history.m11574h();
        }
        if (name.equals("YEAR_AFTER")) {
            return this.history.m11583L(EnumC10455a.AFTER_NEW_YEAR);
        }
        if (name.equals("YEAR_BEFORE")) {
            return this.history.m11583L(EnumC10455a.BEFORE_NEW_YEAR);
        }
        if (name.equals("CENTURY_OF_ERA")) {
            return this.history.m11580b();
        }
        throw new InvalidObjectException("Unknown element: " + name);
    }

    /* renamed from: J */
    public Integer mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
        return mo11506p(charSequence, parsePosition, dVar, null);
    }

    @Override // p201kj.AbstractC9886a
    /* renamed from: j */
    public void mo11507j(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, EnumC8641j jVar, char c, int i, int i2) {
        C10934h hVar;
        int f;
        if (this.f24298p == 5) {
            appendable.append(String.valueOf(oVar.mo11371r(this.history.m11574h())));
            return;
        }
        if (oVar instanceof AbstractC10811a) {
            hVar = this.history.m11577e(C10892f0.m11886A0((AbstractC10811a) oVar));
        } else {
            hVar = (C10934h) oVar.mo11371r(this.history.m11576f());
        }
        int i3 = this.f24298p;
        if (i3 == 2) {
            C10954o w = this.history.m11559w();
            int e = hVar.m11542e();
            String str = null;
            if (!C10954o.f24311d.equals(w) && (f = hVar.m11541f(w)) != e) {
                AbstractC8046c<EnumC10455a> cVar = C10929d.f24251z;
                EnumC10455a aVar = EnumC10455a.DUAL_DATING;
                if (dVar.mo15674c(cVar, aVar) == aVar) {
                    str = m11514F(jVar, c, f, e, i);
                } else {
                    e = f;
                }
            }
            if (str == null) {
                if (jVar.mo18426l()) {
                    str = m11511I(jVar.mo18424p(e), i, c);
                } else {
                    str = jVar.mo18424p(e);
                }
            }
            if (jVar.mo18426l()) {
                char charAt = jVar.mo18427j().charAt(0);
                if (c != charAt) {
                    StringBuilder sb2 = new StringBuilder();
                    int length = str.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        char charAt2 = str.charAt(i4);
                        if (jVar.mo18428h(charAt2)) {
                            sb2.append((char) (charAt2 + (c - charAt)));
                        } else {
                            sb2.append(charAt2);
                        }
                    }
                    str = sb2.toString();
                }
                m11515E(str, i2);
            }
            appendable.append(str);
        } else if (i3 == 3) {
            int intValue = ((Integer) dVar.mo15674c(AbstractC9886a.f22039c, 0)).intValue();
            int d = hVar.m11543d();
            if (intValue == 0) {
                appendable.append(m11512H(dVar, (EnumC8658m) dVar.mo15674c(C8627a.f19059h, EnumC8658m.FORMAT)).m18409f(EnumC10809b0.m12219d(d)));
                return;
            }
            String p = jVar.mo18424p(d);
            if (jVar.mo18426l()) {
                p = m11511I(p, intValue, c);
            }
            appendable.append(p);
        } else if (i3 == 4) {
            appendable.append(String.valueOf(hVar.m11545b()));
        } else {
            throw new C8081r("Not printable as text: " + name());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    @Override // p201kj.AbstractC9886a
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer mo11506p(java.lang.CharSequence r17, java.text.ParsePosition r18, p143hj.AbstractC8048d r19, p143hj.AbstractC8080q<?> r20) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.history.C10941l.mo11506p(java.lang.CharSequence, java.text.ParsePosition, hj.d, hj.q):java.lang.Integer");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8050e
    /* renamed from: q */
    public <T extends AbstractC8080q<T>> AbstractC8091z<T, Integer> mo11057q(C8087x<T> xVar) {
        if (xVar.m20657A(C10892f0.f24173y)) {
            return new C10942a(this.f24298p, this.history);
        }
        return null;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: s */
    protected boolean mo11055s(AbstractC8050e<?> eVar) {
        return this.history.equals(((C10941l) eVar).history);
    }

    @Override // p234mj.C10671c, p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return false;
    }

    @Override // p161ij.AbstractC8669t
    /* renamed from: z */
    public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
        char c;
        EnumC8641j jVar = (EnumC8641j) dVar.mo15674c(C8627a.f19063l, EnumC8641j.f19112k);
        AbstractC8046c<Character> cVar = C8627a.f19064m;
        if (dVar.mo15676a(cVar)) {
            c = ((Character) dVar.mo15675b(cVar)).charValue();
        } else if (jVar.mo18426l()) {
            c = jVar.mo18427j().charAt(0);
        } else {
            c = '0';
        }
        mo11507j(oVar, appendable, dVar, jVar, c, 1, 10);
    }
}
