package fi;

/* renamed from: fi.w1 */
/* loaded from: classes8.dex */
public enum EnumC7338w1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    

    /* renamed from: k */
    private final String f15825k;

    /* renamed from: l */
    private final boolean f15826l;

    /* renamed from: m */
    private final boolean f15827m;

    /* renamed from: n */
    private final int f15828n;

    EnumC7338w1(String str, boolean z, boolean z2, int i) {
        this.f15825k = str;
        this.f15826l = z;
        this.f15827m = z2;
        this.f15828n = i;
    }

    /* renamed from: b */
    public final boolean m22887b() {
        return this.f15827m;
    }

    /* renamed from: c */
    public final String m22886c() {
        return this.f15825k;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f15825k;
    }
}
