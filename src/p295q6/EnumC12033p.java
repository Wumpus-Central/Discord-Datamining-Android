package p295q6;

import android.util.SparseArray;

/* renamed from: q6.p */
/* loaded from: classes7.dex */
public enum EnumC12033p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: r */
    private static final SparseArray<EnumC12033p> f26996r;

    /* renamed from: k */
    private final int f26998k;

    static {
        EnumC12033p pVar = DEFAULT;
        EnumC12033p pVar2 = UNMETERED_ONLY;
        EnumC12033p pVar3 = UNMETERED_OR_DAILY;
        EnumC12033p pVar4 = FAST_IF_RADIO_AWAKE;
        EnumC12033p pVar5 = NEVER;
        EnumC12033p pVar6 = UNRECOGNIZED;
        SparseArray<EnumC12033p> sparseArray = new SparseArray<>();
        f26996r = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    EnumC12033p(int i) {
        this.f26998k = i;
    }
}
