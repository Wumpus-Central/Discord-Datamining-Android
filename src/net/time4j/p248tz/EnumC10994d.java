package net.time4j.p248tz;

/* renamed from: net.time4j.tz.d */
/* loaded from: classes8.dex */
public enum EnumC10994d {
    SHORT_STANDARD_TIME,
    LONG_STANDARD_TIME,
    SHORT_DAYLIGHT_TIME,
    LONG_DAYLIGHT_TIME;

    /* renamed from: a */
    public boolean m11332a() {
        return this == SHORT_STANDARD_TIME || this == SHORT_DAYLIGHT_TIME;
    }

    /* renamed from: b */
    public boolean m11331b() {
        return this == SHORT_DAYLIGHT_TIME || this == LONG_DAYLIGHT_TIME;
    }
}
