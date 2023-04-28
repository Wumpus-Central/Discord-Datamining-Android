package p163j$.time;

import p163j$.time.chrono.C9176h;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9228p;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;
import p163j$.time.temporal.EnumC9214b;

/* renamed from: j$.time.k */
/* loaded from: classes2.dex */
public enum EnumC9207k implements AbstractC9223k {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a */
    private static final EnumC9207k[] f20217a = values();

    /* renamed from: g */
    public static EnumC9207k m16663g(int i) {
        if (i >= 1 && i <= 12) {
            return f20217a[i - 1];
        }
        throw new C9167b("Invalid value for MonthOfYear: " + i);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        return lVar == EnumC9213a.MONTH_OF_YEAR ? lVar.mo16627d() : AbstractC9222j.m16643c(this, lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: b */
    public final boolean mo16634b(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? lVar == EnumC9213a.MONTH_OF_YEAR : lVar != null && lVar.mo16630a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: c */
    public final long mo16633c(AbstractC9224l lVar) {
        if (lVar == EnumC9213a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        if (!(lVar instanceof EnumC9213a)) {
            return lVar.mo16625f(this);
        }
        throw new C9228p("Unsupported field: " + lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: d */
    public final Object mo16632d(AbstractC9226n nVar) {
        return nVar == AbstractC9222j.m16642d() ? C9176h.f20141a : nVar == AbstractC9222j.m16638h() ? EnumC9214b.MONTHS : AbstractC9222j.m16644b(this, nVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final int mo16631e(EnumC9213a aVar) {
        return aVar == EnumC9213a.MONTH_OF_YEAR ? ordinal() + 1 : AbstractC9222j.m16645a(this, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final int m16664f(boolean z) {
        switch (AbstractC9206j.f20216a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return z + 152;
            case 4:
                return z + 244;
            case 5:
                return z + 305;
            case 6:
                return 1;
            case 7:
                return z + 60;
            case 8:
                return z + 121;
            case 9:
                return z + 182;
            case 10:
                return z + 213;
            case 11:
                return z + 274;
            default:
                return z + 335;
        }
    }

    /* renamed from: h */
    public final EnumC9207k m16662h() {
        int i = ((int) 1) + 12;
        return f20217a[(i + ordinal()) % 12];
    }
}
