package p268og;

/* renamed from: og.f */
/* loaded from: classes8.dex */
public enum EnumC11317f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    

    /* renamed from: k */
    private final String f25255k;

    EnumC11317f(String str) {
        this.f25255k = str;
    }

    /* renamed from: b */
    public final boolean m10214b() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
