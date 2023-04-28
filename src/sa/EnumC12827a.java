package sa;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.a */
/* loaded from: classes3.dex */
public enum EnumC12827a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11);
    

    /* renamed from: z */
    private static final AbstractC12836e0 f28891z;

    /* renamed from: k */
    private final int f28892k;

    static {
        EnumC12827a[] values;
        C12834d0 d0Var = new C12834d0();
        for (EnumC12827a aVar : values()) {
            d0Var.m5308a(Integer.valueOf(aVar.f28892k), aVar);
        }
        f28891z = d0Var.m5307b();
    }

    EnumC12827a(int i) {
        this.f28892k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static EnumC12827a m5318a(int i) {
        AbstractC12836e0 e0Var = f28891z;
        Integer valueOf = Integer.valueOf(i);
        if (!e0Var.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (EnumC12827a) e0Var.get(valueOf);
    }
}
