package com.facebook.hermes.intl;

import p129h5.C7835h;

/* renamed from: com.facebook.hermes.intl.e */
/* loaded from: classes7.dex */
class C4871e {

    /* renamed from: a */
    private CharSequence f8058a;

    /* renamed from: b */
    int f8059b = 0;

    /* renamed from: c */
    int f8060c = -1;

    /* renamed from: com.facebook.hermes.intl.e$a */
    /* loaded from: classes7.dex */
    public class C4872a {

        /* renamed from: a */
        private CharSequence f8061a;

        /* renamed from: b */
        private int f8062b;

        /* renamed from: c */
        private int f8063c;

        C4872a(CharSequence charSequence, int i, int i2) {
            this.f8061a = charSequence;
            this.f8062b = i;
            this.f8063c = i2;
        }

        /* renamed from: a */
        public boolean m31612a() {
            return C7835h.m21274h(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: b */
        public boolean m31611b() {
            return C7835h.m21273i(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: c */
        public boolean m31610c() {
            return C7835h.m21272j(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: d */
        public boolean m31609d() {
            return C7835h.m21271k(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: e */
        public boolean m31608e() {
            return C7835h.m21270l(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: f */
        public boolean m31607f() {
            return C7835h.m21269m(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: g */
        public boolean m31606g() {
            return C7835h.m21268n(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: h */
        public boolean m31605h() {
            return C7835h.m21267o(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: i */
        public boolean m31604i() {
            return C7835h.m21266p(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: j */
        public boolean m31603j() {
            return C7835h.m21265q(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: k */
        public boolean m31602k() {
            return C7835h.m21264r(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: l */
        public boolean m31601l() {
            return C7835h.m21263s(this.f8061a, this.f8062b, this.f8063c);
        }

        /* renamed from: m */
        public String m31600m() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = this.f8062b; i <= this.f8063c; i++) {
                stringBuffer.append(Character.toLowerCase(this.f8061a.charAt(i)));
            }
            return stringBuffer.toString();
        }

        /* renamed from: n */
        public String m31599n() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = this.f8062b; i <= this.f8063c; i++) {
                if (i == this.f8062b) {
                    stringBuffer.append(Character.toUpperCase(this.f8061a.charAt(i)));
                } else {
                    stringBuffer.append(Character.toLowerCase(this.f8061a.charAt(i)));
                }
            }
            return stringBuffer.toString();
        }

        /* renamed from: o */
        public String m31598o() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = this.f8062b; i <= this.f8063c; i++) {
                stringBuffer.append(Character.toUpperCase(this.f8061a.charAt(i)));
            }
            return stringBuffer.toString();
        }

        public String toString() {
            return this.f8061a.subSequence(this.f8062b, this.f8063c + 1).toString();
        }
    }

    /* renamed from: com.facebook.hermes.intl.e$b */
    /* loaded from: classes7.dex */
    public class C4873b extends Exception {
        public C4873b() {
        }
    }

    public C4871e(CharSequence charSequence) {
        this.f8058a = charSequence;
    }

    /* renamed from: b */
    private static boolean m31614b(char c) {
        return c == '-';
    }

    /* renamed from: a */
    public boolean m31615a() {
        return this.f8058a.length() > 0 && this.f8060c < this.f8058a.length() - 1;
    }

    /* renamed from: c */
    public C4872a m31613c() {
        if (m31615a()) {
            int i = this.f8060c;
            if (i >= this.f8059b) {
                if (!m31614b(this.f8058a.charAt(i + 1))) {
                    throw new C4873b();
                } else if (this.f8060c + 2 != this.f8058a.length()) {
                    this.f8059b = this.f8060c + 2;
                } else {
                    throw new C4873b();
                }
            }
            this.f8060c = this.f8059b;
            while (this.f8060c < this.f8058a.length() && !m31614b(this.f8058a.charAt(this.f8060c))) {
                this.f8060c++;
            }
            int i2 = this.f8060c;
            int i3 = this.f8059b;
            if (i2 > i3) {
                int i4 = i2 - 1;
                this.f8060c = i4;
                return new C4872a(this.f8058a, i3, i4);
            }
            throw new C4873b();
        }
        throw new C4873b();
    }
}
