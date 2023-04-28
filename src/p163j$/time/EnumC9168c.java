package p163j$.time;

import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9228p;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;
import p163j$.time.temporal.EnumC9214b;

/* renamed from: j$.time.c */
/* loaded from: classes2.dex */
public enum EnumC9168c implements AbstractC9223k {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a */
    private static final EnumC9168c[] f20138a = values();

    /* renamed from: f */
    public static EnumC9168c m16729f(int i) {
        if (i >= 1 && i <= 7) {
            return f20138a[i - 1];
        }
        throw new C9167b("Invalid value for DayOfWeek: " + i);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        return lVar == EnumC9213a.DAY_OF_WEEK ? lVar.mo16627d() : AbstractC9222j.m16643c(this, lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: b */
    public final boolean mo16634b(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? lVar == EnumC9213a.DAY_OF_WEEK : lVar != null && lVar.mo16630a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: c */
    public final long mo16633c(AbstractC9224l lVar) {
        if (lVar == EnumC9213a.DAY_OF_WEEK) {
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
        return nVar == AbstractC9222j.m16638h() ? EnumC9214b.DAYS : AbstractC9222j.m16644b(this, nVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final int mo16631e(EnumC9213a aVar) {
        return aVar == EnumC9213a.DAY_OF_WEEK ? ordinal() + 1 : AbstractC9222j.m16645a(this, aVar);
    }
}
