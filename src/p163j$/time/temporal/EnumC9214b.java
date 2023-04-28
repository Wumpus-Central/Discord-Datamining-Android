package p163j$.time.temporal;

import p163j$.time.C9177d;

/* renamed from: j$.time.temporal.b */
/* loaded from: classes2.dex */
public enum EnumC9214b implements AbstractC9227o {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a */
    private final String f20228a;

    static {
        C9177d.m16725b(1L);
        C9177d.m16725b(1000L);
        C9177d.m16725b(1000000L);
        C9177d.m16724c();
    }

    EnumC9214b(String str) {
        this.f20228a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20228a;
    }
}
