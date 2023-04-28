package p445yd;

/* renamed from: yd.f */
/* loaded from: classes3.dex */
public enum EnumC14359f {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: p */
    private static final EnumC14359f[] f32493p;

    /* renamed from: k */
    private final int f32495k;

    static {
        EnumC14359f fVar = L;
        EnumC14359f fVar2 = M;
        EnumC14359f fVar3 = Q;
        f32493p = new EnumC14359f[]{fVar2, fVar, H, fVar3};
    }

    EnumC14359f(int i) {
        this.f32495k = i;
    }

    /* renamed from: a */
    public static EnumC14359f m787a(int i) {
        if (i >= 0) {
            EnumC14359f[] fVarArr = f32493p;
            if (i < fVarArr.length) {
                return fVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
