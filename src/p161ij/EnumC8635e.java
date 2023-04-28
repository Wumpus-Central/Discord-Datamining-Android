package p161ij;

import p143hj.AbstractC8090y;

/* renamed from: ij.e */
/* loaded from: classes8.dex */
public enum EnumC8635e implements AbstractC8090y {
    FULL(0),
    LONG(1),
    MEDIUM(2),
    SHORT(3);
    

    /* renamed from: p */
    private static EnumC8635e[] f19104p = values();

    /* renamed from: k */
    private final transient int f19106k;

    EnumC8635e(int i) {
        this.f19106k = i;
    }

    /* renamed from: b */
    public static EnumC8635e m18444b(int i) {
        EnumC8635e[] eVarArr;
        for (EnumC8635e eVar : f19104p) {
            if (eVar.mo18445a() == i) {
                return eVar;
            }
        }
        throw new UnsupportedOperationException("Unknown format style: " + i);
    }

    @Override // p143hj.AbstractC8090y
    /* renamed from: a */
    public int mo18445a() {
        return this.f19106k;
    }
}
