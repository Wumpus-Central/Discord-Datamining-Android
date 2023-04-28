package qa;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qa.n */
/* loaded from: classes3.dex */
public final class C12080n {
    /* renamed from: a */
    public static int m7872a(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = C12078m.m7874b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("negative size: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            str = C12078m.m7874b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    @NonNullDecl
    /* renamed from: b */
    public static <T> T m7871b(@NonNullDecl T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    private static String m7870c(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return C12078m.m7874b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C12078m.m7874b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    public static void m7869d(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m7870c(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m7870c(i2, i3, "end index");
            } else {
                str = C12078m.m7874b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: e */
    public static void m7868e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f */
    public static void m7867f(boolean z, @NullableDecl String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C12078m.m7874b(str, Character.valueOf(c)));
        }
    }

    /* renamed from: g */
    public static int m7866g(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m7870c(i, i2, "index"));
    }
}
