package p399w8;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p103fc.C7115d;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w8.c */
/* loaded from: classes7.dex */
public final class C13807c {

    /* renamed from: a */
    public final String f31087a;

    /* renamed from: b */
    public final int f31088b;

    /* renamed from: c */
    public final Integer f31089c;

    /* renamed from: d */
    public final float f31090d;

    /* renamed from: e */
    public final boolean f31091e;

    /* renamed from: f */
    public final boolean f31092f;

    /* renamed from: w8.c$a */
    /* loaded from: classes7.dex */
    static final class C13808a {

        /* renamed from: a */
        public final int f31093a;

        /* renamed from: b */
        public final int f31094b;

        /* renamed from: c */
        public final int f31095c;

        /* renamed from: d */
        public final int f31096d;

        /* renamed from: e */
        public final int f31097e;

        /* renamed from: f */
        public final int f31098f;

        /* renamed from: g */
        public final int f31099g;

        private C13808a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f31093a = i;
            this.f31094b = i2;
            this.f31095c = i3;
            this.f31096d = i4;
            this.f31097e = i5;
            this.f31098f = i6;
            this.f31099g = i7;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public static C13808a m2598a(String str) {
            char c;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            for (int i7 = 0; i7 < split.length; i7++) {
                String U0 = C7557q0.m22174U0(split[i7].trim());
                U0.hashCode();
                switch (U0.hashCode()) {
                    case -1178781136:
                        if (U0.equals("italic")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -70925746:
                        if (U0.equals("primarycolour")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3029637:
                        if (U0.equals("bold")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (U0.equals("name")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 366554320:
                        if (U0.equals("fontsize")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1767875043:
                        if (U0.equals("alignment")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i6 = i7;
                        break;
                    case 1:
                        i3 = i7;
                        break;
                    case 2:
                        i5 = i7;
                        break;
                    case 3:
                        i = i7;
                        break;
                    case 4:
                        i4 = i7;
                        break;
                    case 5:
                        i2 = i7;
                        break;
                }
            }
            if (i != -1) {
                return new C13808a(i, i2, i3, i4, i5, i6, split.length);
            }
            return null;
        }
    }

    /* renamed from: w8.c$b */
    /* loaded from: classes7.dex */
    static final class C13809b {

        /* renamed from: c */
        private static final Pattern f31100c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        private static final Pattern f31101d = Pattern.compile(C7557q0.m22209D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        private static final Pattern f31102e = Pattern.compile(C7557q0.m22209D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        private static final Pattern f31103f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f31104a;

        /* renamed from: b */
        public final PointF f31105b;

        private C13809b(int i, PointF pointF) {
            this.f31104a = i;
            this.f31105b = pointF;
        }

        /* renamed from: a */
        private static int m2597a(String str) {
            Matcher matcher = f31103f.matcher(str);
            if (matcher.find()) {
                return C13807c.m2602d((String) C7510a.m22367e(matcher.group(1)));
            }
            return -1;
        }

        /* renamed from: b */
        public static C13809b m2596b(String str) {
            Matcher matcher = f31100c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) C7510a.m22367e(matcher.group(1));
                try {
                    PointF c = m2595c(str2);
                    if (c != null) {
                        pointF = c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a = m2597a(str2);
                    if (a != -1) {
                        i = a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new C13809b(i, pointF);
        }

        /* renamed from: c */
        private static PointF m2595c(String str) {
            String str2;
            String str3;
            Matcher matcher = f31101d.matcher(str);
            Matcher matcher2 = f31102e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    C7558r.m22106f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C7510a.m22367e(str2)).trim()), Float.parseFloat(((String) C7510a.m22367e(str3)).trim()));
        }

        /* renamed from: d */
        public static String m2594d(String str) {
            return f31100c.matcher(str).replaceAll("");
        }
    }

    private C13807c(String str, int i, Integer num, float f, boolean z, boolean z2) {
        this.f31087a = str;
        this.f31088b = i;
        this.f31089c = num;
        this.f31090d = f;
        this.f31091e = z;
        this.f31092f = z2;
    }

    /* renamed from: b */
    public static C13807c m2604b(String str, C13808a aVar) {
        int i;
        Integer num;
        float f;
        boolean z;
        C7510a.m22371a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i2 = aVar.f31099g;
        boolean z2 = false;
        if (length != i2) {
            C7558r.m22104h("SsaStyle", C7557q0.m22209D("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f31093a].trim();
            int i3 = aVar.f31094b;
            if (i3 != -1) {
                i = m2602d(split[i3].trim());
            } else {
                i = -1;
            }
            int i4 = aVar.f31095c;
            if (i4 != -1) {
                num = m2600f(split[i4].trim());
            } else {
                num = null;
            }
            int i5 = aVar.f31096d;
            if (i5 != -1) {
                f = m2599g(split[i5].trim());
            } else {
                f = -3.4028235E38f;
            }
            int i6 = aVar.f31097e;
            if (i6 != -1) {
                z = m2601e(split[i6].trim());
            } else {
                z = false;
            }
            int i7 = aVar.f31098f;
            if (i7 != -1) {
                z2 = m2601e(split[i7].trim());
            }
            return new C13807c(trim, i, num, f, z, z2);
        } catch (RuntimeException e) {
            C7558r.m22103i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m2603c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m2602d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m2603c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C7558r.m22104h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: e */
    private static boolean m2601e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 1 || parseInt == -1) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            C7558r.m22103i("SsaStyle", "Failed to parse bold/italic: '" + str + "'", e);
            return false;
        }
    }

    /* renamed from: f */
    public static Integer m2600f(String str) {
        long j;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            if (j <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22371a(z);
            int c = C7115d.m23365c(((j >> 24) & 255) ^ 255);
            int c2 = C7115d.m23365c((j >> 16) & 255);
            return Integer.valueOf(Color.argb(c, C7115d.m23365c(j & 255), C7115d.m23365c((j >> 8) & 255), c2));
        } catch (IllegalArgumentException e) {
            C7558r.m22103i("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: g */
    private static float m2599g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            C7558r.m22103i("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
