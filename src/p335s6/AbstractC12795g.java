package p335s6;

/* renamed from: s6.g */
/* loaded from: classes7.dex */
public abstract class AbstractC12795g {

    /* renamed from: s6.g$a */
    /* loaded from: classes7.dex */
    public enum EnumC12796a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC12795g m5472a() {
        return new C12789b(EnumC12796a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC12795g m5469d() {
        return new C12789b(EnumC12796a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC12795g m5468e(long j) {
        return new C12789b(EnumC12796a.OK, j);
    }

    /* renamed from: f */
    public static AbstractC12795g m5467f() {
        return new C12789b(EnumC12796a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo5471b();

    /* renamed from: c */
    public abstract EnumC12796a mo5470c();
}
