package p163j$.time.temporal;

/* renamed from: j$.time.temporal.a */
/* loaded from: classes2.dex */
public enum EnumC9213a implements AbstractC9224l {
    NANO_OF_SECOND("NanoOfSecond", C9229q.m16615i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", C9229q.m16615i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", C9229q.m16615i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", C9229q.m16615i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", C9229q.m16615i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", C9229q.m16615i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", C9229q.m16615i(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", C9229q.m16615i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", C9229q.m16615i(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", C9229q.m16615i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", C9229q.m16615i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", C9229q.m16615i(1, 12)),
    HOUR_OF_DAY("HourOfDay", C9229q.m16615i(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", C9229q.m16615i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", C9229q.m16615i(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", C9229q.m16615i(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", C9229q.m16615i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", C9229q.m16615i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", C9229q.m16614j(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", C9229q.m16614j(365, 366)),
    EPOCH_DAY("EpochDay", C9229q.m16615i(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", C9229q.m16614j(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", C9229q.m16615i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", C9229q.m16615i(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", C9229q.m16615i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", C9229q.m16614j(999999999, 1000000000)),
    YEAR("Year", C9229q.m16615i(-999999999, 999999999), 0),
    ERA("Era", C9229q.m16615i(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", C9229q.m16615i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", C9229q.m16615i(-64800, 64800));
    

    /* renamed from: a */
    private final String f20225a;

    /* renamed from: b */
    private final C9229q f20226b;

    static {
        EnumC9214b bVar = EnumC9214b.NANOS;
    }

    EnumC9213a(String str, C9229q qVar) {
        this.f20225a = str;
        this.f20226b = qVar;
    }

    EnumC9213a(String str, C9229q qVar, int i) {
        this.f20225a = str;
        this.f20226b = qVar;
    }

    @Override // p163j$.time.temporal.AbstractC9224l
    /* renamed from: a */
    public final boolean mo16630a(AbstractC9223k kVar) {
        return kVar.mo16634b(this);
    }

    @Override // p163j$.time.temporal.AbstractC9224l
    /* renamed from: b */
    public final C9229q mo16629b(AbstractC9223k kVar) {
        return kVar.mo16635a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9224l
    /* renamed from: c */
    public final boolean mo16628c() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // p163j$.time.temporal.AbstractC9224l
    /* renamed from: d */
    public final C9229q mo16627d() {
        return this.f20226b;
    }

    @Override // p163j$.time.temporal.AbstractC9224l
    /* renamed from: e */
    public final boolean mo16626e() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // p163j$.time.temporal.AbstractC9224l
    /* renamed from: f */
    public final long mo16625f(AbstractC9223k kVar) {
        return kVar.mo16633c(this);
    }

    /* renamed from: g */
    public final int m16654g(long j) {
        return this.f20226b.m16623a(j, this);
    }

    /* renamed from: h */
    public final void m16653h(long j) {
        this.f20226b.m16622b(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20225a;
    }
}
