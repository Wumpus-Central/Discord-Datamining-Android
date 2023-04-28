package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
/* loaded from: classes.dex */
public final class C2485a {

    /* renamed from: d */
    static final AbstractC2500o f3449d;

    /* renamed from: e */
    private static final String f3450e = Character.toString(8206);

    /* renamed from: f */
    private static final String f3451f = Character.toString(8207);

    /* renamed from: g */
    static final C2485a f3452g;

    /* renamed from: h */
    static final C2485a f3453h;

    /* renamed from: a */
    private final boolean f3454a;

    /* renamed from: b */
    private final int f3455b;

    /* renamed from: c */
    private final AbstractC2500o f3456c;

    /* renamed from: androidx.core.text.a$a */
    /* loaded from: classes.dex */
    public static final class C0041a {

        /* renamed from: a */
        private boolean f3457a;

        /* renamed from: b */
        private int f3458b;

        /* renamed from: c */
        private AbstractC2500o f3459c;

        public C0041a() {
            m37639c(C2485a.m37648e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C2485a m37640b(boolean z) {
            return z ? C2485a.f3453h : C2485a.f3452g;
        }

        /* renamed from: c */
        private void m37639c(boolean z) {
            this.f3457a = z;
            this.f3459c = C2485a.f3449d;
            this.f3458b = 2;
        }

        /* renamed from: a */
        public C2485a m37641a() {
            if (this.f3458b == 2 && this.f3459c == C2485a.f3449d) {
                return m37640b(this.f3457a);
            }
            return new C2485a(this.f3457a, this.f3458b, this.f3459c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.text.a$b */
    /* loaded from: classes.dex */
    public static class C2486b {

        /* renamed from: f */
        private static final byte[] f3460f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f3461a;

        /* renamed from: b */
        private final boolean f3462b;

        /* renamed from: c */
        private final int f3463c;

        /* renamed from: d */
        private int f3464d;

        /* renamed from: e */
        private char f3465e;

        static {
            for (int i = 0; i < 1792; i++) {
                f3460f[i] = Character.getDirectionality(i);
            }
        }

        C2486b(CharSequence charSequence, boolean z) {
            this.f3461a = charSequence;
            this.f3462b = z;
            this.f3463c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m37636c(char c) {
            return c < 1792 ? f3460f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m37633f() {
            char charAt;
            int i = this.f3464d;
            do {
                int i2 = this.f3464d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3461a;
                int i3 = i2 - 1;
                this.f3464d = i3;
                charAt = charSequence.charAt(i3);
                this.f3465e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f3464d = i;
            this.f3465e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        private byte m37632g() {
            char charAt;
            do {
                int i = this.f3464d;
                if (i >= this.f3463c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f3461a;
                this.f3464d = i + 1;
                charAt = charSequence.charAt(i);
                this.f3465e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        private byte m37631h() {
            char charAt;
            int i = this.f3464d;
            while (true) {
                int i2 = this.f3464d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3461a;
                int i3 = i2 - 1;
                this.f3464d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f3465e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f3464d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f3461a;
                            int i5 = i4 - 1;
                            this.f3464d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f3465e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f3464d = i;
            this.f3465e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        private byte m37630i() {
            char charAt;
            int i = this.f3464d;
            while (true) {
                int i2 = this.f3464d;
                if (i2 < this.f3463c) {
                    CharSequence charSequence = this.f3461a;
                    this.f3464d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f3465e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f3464d;
                            if (i3 < this.f3463c) {
                                CharSequence charSequence2 = this.f3461a;
                                this.f3464d = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.f3465e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f3464d = i;
                    this.f3465e = '<';
                    return (byte) 13;
                }
            }
        }

        /* renamed from: a */
        byte m37638a() {
            char charAt = this.f3461a.charAt(this.f3464d - 1);
            this.f3465e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3461a, this.f3464d);
                this.f3464d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3464d--;
            byte c = m37636c(this.f3465e);
            if (!this.f3462b) {
                return c;
            }
            char c2 = this.f3465e;
            if (c2 == '>') {
                return m37631h();
            }
            if (c2 == ';') {
                return m37633f();
            }
            return c;
        }

        /* renamed from: b */
        byte m37637b() {
            char charAt = this.f3461a.charAt(this.f3464d);
            this.f3465e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f3461a, this.f3464d);
                this.f3464d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3464d++;
            byte c = m37636c(this.f3465e);
            if (!this.f3462b) {
                return c;
            }
            char c2 = this.f3465e;
            if (c2 == '<') {
                return m37630i();
            }
            if (c2 == '&') {
                return m37632g();
            }
            return c;
        }

        /* renamed from: d */
        int m37635d() {
            this.f3464d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f3464d < this.f3463c && i == 0) {
                byte b = m37637b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f3464d > 0) {
                switch (m37638a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        int m37634e() {
            this.f3464d = this.f3463c;
            int i = 0;
            while (true) {
                while (this.f3464d > 0) {
                    byte a = m37638a();
                    if (a != 0) {
                        if (a == 1 || a == 2) {
                            if (i == 0) {
                                return 1;
                            }
                            if (i == 0) {
                                break;
                            }
                        } else if (a != 9) {
                            switch (a) {
                                case 14:
                                case 15:
                                    if (i == i) {
                                        return -1;
                                    }
                                    i--;
                                    break;
                                case 16:
                                case 17:
                                    if (i == i) {
                                        return 1;
                                    }
                                    i--;
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        AbstractC2500o oVar = C2501p.f3468c;
        f3449d = oVar;
        f3452g = new C2485a(false, 2, oVar);
        f3453h = new C2485a(true, 2, oVar);
    }

    C2485a(boolean z, int i, AbstractC2500o oVar) {
        this.f3454a = z;
        this.f3455b = i;
        this.f3456c = oVar;
    }

    /* renamed from: a */
    private static int m37652a(CharSequence charSequence) {
        return new C2486b(charSequence, false).m37635d();
    }

    /* renamed from: b */
    private static int m37651b(CharSequence charSequence) {
        return new C2486b(charSequence, false).m37634e();
    }

    /* renamed from: c */
    public static C2485a m37650c() {
        return new C0041a().m37641a();
    }

    /* renamed from: e */
    static boolean m37648e(Locale locale) {
        return C2508q.m37611a(locale) == 1;
    }

    /* renamed from: f */
    private String m37647f(CharSequence charSequence, AbstractC2500o oVar) {
        boolean isRtl = oVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f3454a && (isRtl || m37651b(charSequence) == 1)) {
            return f3450e;
        }
        if (!this.f3454a) {
            return "";
        }
        if (!isRtl || m37651b(charSequence) == -1) {
            return f3451f;
        }
        return "";
    }

    /* renamed from: g */
    private String m37646g(CharSequence charSequence, AbstractC2500o oVar) {
        boolean isRtl = oVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f3454a && (isRtl || m37652a(charSequence) == 1)) {
            return f3450e;
        }
        if (!this.f3454a) {
            return "";
        }
        if (!isRtl || m37652a(charSequence) == -1) {
            return f3451f;
        }
        return "";
    }

    /* renamed from: d */
    public boolean m37649d() {
        return (this.f3455b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence m37645h(CharSequence charSequence) {
        return m37644i(charSequence, this.f3456c, true);
    }

    /* renamed from: i */
    public CharSequence m37644i(CharSequence charSequence, AbstractC2500o oVar, boolean z) {
        AbstractC2500o oVar2;
        char c;
        AbstractC2500o oVar3;
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = oVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m37649d() && z) {
            if (isRtl) {
                oVar3 = C2501p.f3467b;
            } else {
                oVar3 = C2501p.f3466a;
            }
            spannableStringBuilder.append((CharSequence) m37646g(charSequence, oVar3));
        }
        if (isRtl != this.f3454a) {
            if (isRtl) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (isRtl) {
                oVar2 = C2501p.f3467b;
            } else {
                oVar2 = C2501p.f3466a;
            }
            spannableStringBuilder.append((CharSequence) m37647f(charSequence, oVar2));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m37643j(String str) {
        return m37642k(str, this.f3456c, true);
    }

    /* renamed from: k */
    public String m37642k(String str, AbstractC2500o oVar, boolean z) {
        if (str == null) {
            return null;
        }
        return m37644i(str, oVar, z).toString();
    }
}
