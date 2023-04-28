package p171j6;

/* renamed from: j6.b */
/* loaded from: classes7.dex */
public enum EnumC9495b {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNKNOWN(false);
    

    /* renamed from: k */
    private final boolean f21059k;

    /* renamed from: l */
    private final int f21060l = 1 << ordinal();

    EnumC9495b(boolean z) {
        this.f21059k = z;
    }

    /* renamed from: a */
    public static int m16129a() {
        EnumC9495b[] values;
        int i = 0;
        for (EnumC9495b bVar : values()) {
            if (bVar.m16128b()) {
                i |= bVar.m16127c();
            }
        }
        return i;
    }

    /* renamed from: b */
    public boolean m16128b() {
        return this.f21059k;
    }

    /* renamed from: c */
    public int m16127c() {
        return this.f21060l;
    }
}
