package si;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¨\u0006\t"}, m15073d2 = {"", "shortName", "Lsi/d;", "e", "", "isoChar", "", "isTimeComponent", "d", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/time/DurationUnitKt")
/* renamed from: si.f */
/* loaded from: classes8.dex */
class C12910f extends C12909e {
    /* renamed from: d */
    public static final EnumC12908d m5083d(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return EnumC12908d.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        } else if (c == 'H') {
            return EnumC12908d.HOURS;
        } else {
            if (c == 'M') {
                return EnumC12908d.MINUTES;
            }
            if (c == 'S') {
                return EnumC12908d.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
        }
    }

    /* renamed from: e */
    public static final EnumC12908d m5082e(String shortName) {
        C9971q.m14633g(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return EnumC12908d.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return EnumC12908d.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return EnumC12908d.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return EnumC12908d.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return EnumC12908d.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return EnumC12908d.HOURS;
            }
        } else if (shortName.equals("d")) {
            return EnumC12908d.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
