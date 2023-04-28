package p249nh;

/* renamed from: nh.f */
/* loaded from: classes8.dex */
public final class C11142f implements Comparable<C11142f> {

    /* renamed from: k */
    private final String f24729k;

    /* renamed from: l */
    private final boolean f24730l;

    private C11142f(String str, boolean z) {
        if (str == null) {
            m10772a(0);
        }
        this.f24729k = str;
        this.f24730l = z;
    }

    /* renamed from: a */
    private static /* synthetic */ void m10772a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: e */
    public static C11142f m10768e(String str) {
        if (str == null) {
            m10772a(8);
        }
        if (str.startsWith("<")) {
            return m10764i(str);
        }
        return m10767f(str);
    }

    /* renamed from: f */
    public static C11142f m10767f(String str) {
        if (str == null) {
            m10772a(5);
        }
        return new C11142f(str, false);
    }

    /* renamed from: h */
    public static boolean m10765h(String str) {
        if (str == null) {
            m10772a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static C11142f m10764i(String str) {
        if (str == null) {
            m10772a(7);
        }
        if (str.startsWith("<")) {
            return new C11142f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    /* renamed from: b */
    public String m10771b() {
        String str = this.f24729k;
        if (str == null) {
            m10772a(1);
        }
        return str;
    }

    /* renamed from: c */
    public int compareTo(C11142f fVar) {
        return this.f24729k.compareTo(fVar.f24729k);
    }

    /* renamed from: d */
    public String m10769d() {
        if (!this.f24730l) {
            String b = m10771b();
            if (b == null) {
                m10772a(2);
            }
            return b;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11142f)) {
            return false;
        }
        C11142f fVar = (C11142f) obj;
        if (this.f24730l == fVar.f24730l && this.f24729k.equals(fVar.f24729k)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m10766g() {
        return this.f24730l;
    }

    public int hashCode() {
        return (this.f24729k.hashCode() * 31) + (this.f24730l ? 1 : 0);
    }

    public String toString() {
        return this.f24729k;
    }
}
