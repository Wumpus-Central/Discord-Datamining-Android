package p420x9;

/* renamed from: x9.i */
/* loaded from: classes5.dex */
public final class C13980i {

    /* renamed from: a */
    private final String f31533a;

    /* renamed from: b */
    private final String f31534b;

    public C13980i(String str) {
        this(str, null);
    }

    public C13980i(String str, String str2) {
        C14004p.m2050k(str, "log tag cannot be null");
        C14004p.m2058c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f31533a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f31534b = null;
        } else {
            this.f31534b = str2;
        }
    }
}
