package p183jj;

import java.util.Locale;
import java.util.Set;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p161ij.C8627a;
import p161ij.C8629b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.m */
/* loaded from: classes8.dex */
public final class C9667m implements AbstractC9657h<Void> {

    /* renamed from: k */
    private final char f21461k;

    /* renamed from: l */
    private final char f21462l;

    /* renamed from: m */
    private final String f21463m;

    /* renamed from: n */
    private final AbstractC8046c<Character> f21464n;

    /* renamed from: o */
    private final boolean f21465o;

    /* renamed from: p */
    private final boolean f21466p;

    /* renamed from: q */
    private final boolean f21467q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9667m(String str) {
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            this.f21461k = charAt;
            this.f21462l = charAt;
            this.f21464n = null;
            this.f21463m = str;
            if (charAt >= ' ') {
                boolean z = true;
                this.f21465o = true;
                this.f21466p = (str.length() != 1 || !m15695j(charAt)) ? false : z;
                this.f21467q = false;
                return;
            }
            throw new IllegalArgumentException("Literal must not start with non-printable char.");
        }
        throw new IllegalArgumentException("Missing literal.");
    }

    /* renamed from: a */
    private static boolean m15698a(char c, char c2) {
        if (c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m15696i(char c) {
        return c == 8206 || c == 8207 || c == 1564;
    }

    /* renamed from: j */
    private static boolean m15695j(char c) {
        return !Character.isLetter(c) && !Character.isDigit(c) && !m15696i(c);
    }

    /* renamed from: k */
    private void m15694k(CharSequence charSequence, C9675s sVar) {
        int f = sVar.m15664f();
        sVar.m15659k(f, "Cannot parse: \"" + charSequence + "\" (expected: [" + this.f21463m + "], found: [" + charSequence.subSequence(f, Math.min(this.f21463m.length() + f, charSequence.length())) + "])");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (m15698a(r2, r5) != false) goto L_0x008f;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m15693l(java.lang.CharSequence r9, p183jj.C9675s r10, p143hj.AbstractC8048d r11, boolean r12) {
        /*
            r8 = this;
            int r0 = r10.m15664f()
            char r1 = r8.f21461k
            hj.c<java.lang.Character> r2 = r8.f21464n
            r3 = 0
            if (r2 == 0) goto L_0x0019
            java.lang.Character r1 = java.lang.Character.valueOf(r3)
            java.lang.Object r1 = r11.mo15674c(r2, r1)
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
        L_0x0019:
            int r2 = r9.length()
            r4 = 1
            if (r0 >= r2) goto L_0x008d
            if (r1 == 0) goto L_0x008d
            boolean r2 = java.lang.Character.isDigit(r1)
            if (r2 == 0) goto L_0x002a
            goto L_0x008d
        L_0x002a:
            char r2 = r9.charAt(r0)
            char r5 = r8.f21462l
            hj.c<java.lang.Character> r6 = r8.f21464n
            if (r6 == 0) goto L_0x0060
            hj.c<java.lang.Character> r6 = p161ij.C8627a.f19066o
            java.lang.String r6 = r6.name()
            hj.c<java.lang.Character> r7 = r8.f21464n
            java.lang.String r7 = r7.name()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0060
            java.util.Locale r6 = java.util.Locale.ROOT
            hj.c<java.util.Locale> r7 = p161ij.C8627a.f19054c
            java.lang.Object r7 = r11.mo15674c(r7, r6)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0060
            r5 = 46
            r6 = 44
            if (r1 != r6) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            if (r1 != r5) goto L_0x005f
            r5 = r6
            goto L_0x0060
        L_0x005f:
            r5 = r1
        L_0x0060:
            if (r2 == r1) goto L_0x0066
            if (r2 == r5) goto L_0x0066
            r6 = r4
            goto L_0x0067
        L_0x0066:
            r6 = r3
        L_0x0067:
            if (r6 == 0) goto L_0x008b
            if (r12 == 0) goto L_0x006e
            boolean r11 = r8.f21465o
            goto L_0x007c
        L_0x006e:
            hj.c<java.lang.Boolean> r12 = p161ij.C8627a.f19060i
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Object r11 = r11.mo15674c(r12, r7)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
        L_0x007c:
            if (r11 == 0) goto L_0x008b
            boolean r11 = m15698a(r2, r1)
            if (r11 != 0) goto L_0x008f
            boolean r11 = m15698a(r2, r5)
            if (r11 == 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            r3 = r6
            goto L_0x008f
        L_0x008d:
            r2 = r3
            r3 = r4
        L_0x008f:
            if (r3 == 0) goto L_0x00ba
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Cannot parse: \""
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = "\" (expected: ["
            r11.append(r9)
            r11.append(r1)
            java.lang.String r9 = "], found: ["
            r11.append(r9)
            if (r2 == 0) goto L_0x00ad
            r11.append(r2)
        L_0x00ad:
            java.lang.String r9 = "])"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.m15659k(r0, r9)
            goto L_0x00be
        L_0x00ba:
            int r0 = r0 + r4
            r10.m15658l(r0)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9667m.m15693l(java.lang.CharSequence, jj.s, hj.d, boolean):void");
    }

    /* renamed from: m */
    private void m15692m(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, boolean z) {
        boolean z2;
        boolean z3;
        int f = sVar.m15664f();
        if (z) {
            z2 = this.f21465o;
        } else {
            z2 = ((Boolean) dVar.mo15674c(C8627a.f19060i, Boolean.TRUE)).booleanValue();
        }
        if (z) {
            z3 = this.f21467q;
        } else {
            z3 = C8629b.m18455q((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT));
        }
        int n = m15691n(charSequence, f, this.f21463m, z2, z3);
        if (n == -1) {
            m15694k(charSequence, sVar);
        } else {
            sVar.m15658l(f + n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m15691n(CharSequence charSequence, int i, CharSequence charSequence2, boolean z, boolean z2) {
        char c;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            char charAt = charSequence2.charAt(i3);
            if (!m15696i(charAt)) {
                if (z2) {
                    c = 0;
                    while (true) {
                        int i4 = i2 + i;
                        if (i4 >= length) {
                            break;
                        }
                        c = charSequence.charAt(i4);
                        if (!m15696i(c)) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    int i5 = i2 + i;
                    if (i5 < length) {
                        c = charSequence.charAt(i5);
                    } else {
                        c = 0;
                    }
                }
                if (i2 + i >= length) {
                    return -1;
                }
                i2++;
                if (z) {
                    if (!m15698a(c, charAt)) {
                        return -1;
                    }
                } else if (c != charAt) {
                    return -1;
                }
            }
        }
        if (z2) {
            while (true) {
                int i6 = i2 + i;
                if (i6 >= length || !m15696i(charSequence.charAt(i6))) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<Void> mo15599b() {
        return null;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        AbstractC8046c<Character> cVar = this.f21464n;
        if (cVar != null) {
            appendable.append(((Character) dVar.mo15674c(cVar, null)).charValue());
            return 1;
        }
        String str = this.f21463m;
        if (str == null) {
            appendable.append(this.f21461k);
            return 1;
        }
        appendable.append(str);
        return this.f21463m.length();
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<Void> mo15597d(AbstractC8079p<Void> pVar) {
        return this;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    public void mo15596e(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, AbstractC9676t<?> tVar, boolean z) {
        if (z && this.f21466p) {
            int f = sVar.m15664f();
            if (f < charSequence.length() && charSequence.charAt(f) == this.f21461k) {
                sVar.m15658l(f + 1);
            } else if (this.f21461k != '.' || !((Boolean) dVar.mo15674c(C8627a.f19062k, Boolean.TRUE)).booleanValue()) {
                m15694k(charSequence, sVar);
            }
        } else if (this.f21463m == null) {
            m15693l(charSequence, sVar, dVar, z);
        } else {
            m15692m(charSequence, sVar, dVar, z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9667m)) {
            return false;
        }
        C9667m mVar = (C9667m) obj;
        AbstractC8046c<Character> cVar = this.f21464n;
        if (cVar != null) {
            return cVar.equals(mVar.f21464n);
        }
        String str = this.f21463m;
        if (str == null) {
            if (mVar.f21463m == null && this.f21461k == mVar.f21461k && this.f21462l == mVar.f21462l) {
                return true;
            }
            return false;
        } else if (!str.equals(mVar.f21463m) || this.f21466p != mVar.f21466p) {
            return false;
        } else {
            return true;
        }
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        if (this.f21463m != null && m15697h() == this.f21463m.length()) {
            return true;
        }
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<Void> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        boolean z;
        boolean q = C8629b.m18455q((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT));
        char c = this.f21461k;
        char c2 = this.f21462l;
        String str = this.f21463m;
        AbstractC8046c<Character> cVar2 = this.f21464n;
        boolean booleanValue = ((Boolean) dVar.mo15674c(C8627a.f19060i, Boolean.TRUE)).booleanValue();
        if (!this.f21466p || q) {
            z = false;
        } else {
            z = true;
        }
        return new C9667m(c, c2, str, cVar2, booleanValue, z, q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m15697h() {
        String str = this.f21463m;
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length && Character.isDigit(this.f21463m.charAt(i2)); i2++) {
            i++;
        }
        return i;
    }

    public int hashCode() {
        String str;
        AbstractC8046c<Character> cVar = this.f21464n;
        if (cVar == null) {
            str = this.f21463m;
            if (str == null) {
                str = "";
            }
        } else {
            str = cVar.name();
        }
        return str.hashCode() ^ this.f21461k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C9667m.class.getName());
        sb2.append("[literal=");
        if (this.f21464n != null) {
            sb2.append('{');
            sb2.append(this.f21464n);
            sb2.append('}');
        } else {
            String str = this.f21463m;
            if (str == null) {
                sb2.append(this.f21461k);
                if (this.f21462l != this.f21461k) {
                    sb2.append(", alternative=");
                    sb2.append(this.f21462l);
                }
            } else {
                sb2.append(str);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9667m(char c, char c2) {
        this.f21461k = c;
        this.f21462l = c2;
        this.f21464n = null;
        this.f21463m = null;
        if (c < ' ' || c2 < ' ') {
            throw new IllegalArgumentException("Literal must not start with non-printable char.");
        } else if (Character.isDigit(c) || Character.isDigit(c2)) {
            throw new IllegalArgumentException("Literal must not be a decimal digit.");
        } else {
            this.f21465o = true;
            this.f21466p = false;
            this.f21467q = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9667m(AbstractC8046c<Character> cVar) {
        if (cVar != null) {
            this.f21461k = (char) 0;
            this.f21462l = (char) 0;
            this.f21464n = cVar;
            this.f21463m = null;
            this.f21465o = true;
            this.f21466p = false;
            this.f21467q = false;
            return;
        }
        throw new NullPointerException("Missing format attribute.");
    }

    private C9667m(char c, char c2, String str, AbstractC8046c<Character> cVar, boolean z, boolean z2, boolean z3) {
        this.f21461k = c;
        this.f21462l = c2;
        this.f21463m = str;
        this.f21464n = cVar;
        this.f21465o = z;
        this.f21466p = z2;
        this.f21467q = z3;
    }
}
