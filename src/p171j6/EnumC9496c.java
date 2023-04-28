package p171j6;

/* renamed from: j6.c */
/* loaded from: classes7.dex */
public enum EnumC9496c {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    ALLOW_MISSING_VALUES(false),
    ALLOW_TRAILING_COMMA(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNDEFINED(false),
    INCLUDE_SOURCE_IN_LOCATION(true);
    

    /* renamed from: k */
    private final boolean f21075k;

    /* renamed from: l */
    private final int f21076l = 1 << ordinal();

    EnumC9496c(boolean z) {
        this.f21075k = z;
    }

    /* renamed from: a */
    public static int m16126a() {
        EnumC9496c[] values;
        int i = 0;
        for (EnumC9496c cVar : values()) {
            if (cVar.m16125b()) {
                i |= cVar.m16124c();
            }
        }
        return i;
    }

    /* renamed from: b */
    public boolean m16125b() {
        return this.f21075k;
    }

    /* renamed from: c */
    public int m16124c() {
        return this.f21076l;
    }
}
