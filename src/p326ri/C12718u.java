package p326ri;

import eg.C6884j;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import p267of.AbstractC11283p;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\f\u0010\r\u001a\u00020\u0000*\u00020\fH\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u001c\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u0002*\u00020\u0015\u001a4\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u001c\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0010\"%\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u001ej\b\u0012\u0004\u0012\u00020\u0000`\u001f*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m15073d2 = {"", "other", "", "ignoreCase", "t", "", "oldChar", "newChar", "A", "oldValue", "newValue", "B", "", "q", "prefix", "F", "", "startIndex", "E", "suffix", "r", "", "w", "thisOffset", "otherOffset", "length", "x", "n", "z", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "v", "(Lkotlin/jvm/internal/k0;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/text/StringsKt")
/* renamed from: ri.u */
/* loaded from: classes8.dex */
public class C12718u extends C12717t {
    /* renamed from: A */
    public static final String m5743A(String str, char c, char c2, boolean z) {
        C9971q.m14633g(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            C9971q.m14634f(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C12692c.m5866d(charAt, c, z)) {
                charAt = c2;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    /* renamed from: B */
    public static final String m5742B(String str, String oldValue, String newValue, boolean z) {
        int c;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(oldValue, "oldValue");
        C9971q.m14633g(newValue, "newValue");
        int i = 0;
        int V = C12719v.m5691V(str, oldValue, 0, z);
        if (V < 0) {
            return str;
        }
        int length = oldValue.length();
        c = C6884j.m23961c(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i, V);
                sb2.append(newValue);
                i = V + length;
                if (V >= str.length()) {
                    break;
                }
                V = C12719v.m5691V(str, oldValue, V + c, z);
            } while (V > 0);
            sb2.append((CharSequence) str, i, str.length());
            String sb3 = sb2.toString();
            C9971q.m14634f(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: C */
    public static /* synthetic */ String m5741C(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m5743A(str, c, c2, z);
    }

    /* renamed from: D */
    public static /* synthetic */ String m5740D(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m5742B(str, str2, str3, z);
    }

    /* renamed from: E */
    public static boolean m5739E(String str, String prefix, int i, boolean z) {
        boolean x;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(prefix, "prefix");
        if (!z) {
            return str.startsWith(prefix, i);
        }
        x = m5728x(str, i, prefix, 0, prefix.length(), z);
        return x;
    }

    /* renamed from: F */
    public static boolean m5738F(String str, String prefix, boolean z) {
        boolean x;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(prefix, "prefix");
        if (!z) {
            return str.startsWith(prefix);
        }
        x = m5728x(str, 0, prefix, 0, prefix.length(), z);
        return x;
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m5737G(String str, String str2, int i, boolean z, int i2, Object obj) {
        boolean E;
        if ((i2 & 4) != 0) {
            z = false;
        }
        E = m5739E(str, str2, i, z);
        return E;
    }

    /* renamed from: H */
    public static /* synthetic */ boolean m5736H(String str, String str2, boolean z, int i, Object obj) {
        boolean F;
        if ((i & 2) != 0) {
            z = false;
        }
        F = m5738F(str, str2, z);
        return F;
    }

    /* renamed from: q */
    public static String m5735q(byte[] bArr) {
        C9971q.m14633g(bArr, "<this>");
        return new String(bArr, C12694d.f28536b);
    }

    /* renamed from: r */
    public static boolean m5734r(String str, String suffix, boolean z) {
        boolean x;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(suffix, "suffix");
        if (!z) {
            return str.endsWith(suffix);
        }
        x = m5728x(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
        return x;
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m5733s(String str, String str2, boolean z, int i, Object obj) {
        boolean r;
        if ((i & 2) != 0) {
            z = false;
        }
        r = m5734r(str, str2, z);
        return r;
    }

    /* renamed from: t */
    public static boolean m5732t(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m5731u(String str, String str2, boolean z, int i, Object obj) {
        boolean t;
        if ((i & 2) != 0) {
            z = false;
        }
        t = m5732t(str, str2, z);
        return t;
    }

    /* renamed from: v */
    public static Comparator<String> m5730v(C9962k0 k0Var) {
        C9971q.m14633g(k0Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        C9971q.m14634f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* renamed from: w */
    public static boolean m5729w(CharSequence charSequence) {
        IntRange S;
        boolean z;
        boolean c;
        C9971q.m14633g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        S = C12719v.m5697S(charSequence);
        if (!(S instanceof Collection) || !((Collection) S).isEmpty()) {
            Iterator<Integer> it = S.iterator();
            while (it.hasNext()) {
                c = C12690b.m5868c(charSequence.charAt(((AbstractC11283p) it).nextInt()));
                if (!c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m5728x(String str, int i, String other, int i2, int i3, boolean z) {
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(other, "other");
        if (!z) {
            return str.regionMatches(i, other, i2, i3);
        }
        return str.regionMatches(z, i, other, i2, i3);
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m5727y(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        boolean x;
        if ((i4 & 16) != 0) {
            z = false;
        }
        x = m5728x(str, i, str2, i2, i3, z);
        return x;
    }

    /* renamed from: z */
    public static String m5726z(CharSequence charSequence, int i) {
        boolean z;
        C9971q.m14633g(charSequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb2 = new StringBuilder(charSequence.length() * i);
                AbstractC11283p g = new IntRange(1, i).iterator();
                while (g.hasNext()) {
                    g.nextInt();
                    sb2.append(charSequence);
                }
                String sb3 = sb2.toString();
                C9971q.m14634f(sb3, "{\n                    va…tring()\n                }");
                return sb3;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }
}
