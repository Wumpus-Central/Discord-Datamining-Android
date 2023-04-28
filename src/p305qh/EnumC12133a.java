package p305qh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qh.a */
/* loaded from: classes8.dex */
public enum EnumC12133a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);
    

    /* renamed from: k */
    private final boolean f27219k;

    /* renamed from: l */
    private final boolean f27220l;

    EnumC12133a(boolean z, boolean z2) {
        this.f27219k = z;
        this.f27220l = z2;
    }

    /* renamed from: b */
    public final boolean m7762b() {
        return this.f27219k;
    }

    /* renamed from: c */
    public final boolean m7761c() {
        return this.f27220l;
    }

    /* synthetic */ EnumC12133a(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
