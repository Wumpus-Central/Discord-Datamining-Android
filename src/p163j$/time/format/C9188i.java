package p163j$.time.format;

import p163j$.time.AbstractC9166a;
import p163j$.time.LocalDateTime;
import p163j$.time.ZoneOffset;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.EnumC9213a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.i */
/* loaded from: classes2.dex */
public final class C9188i implements AbstractC9186g {
    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        Long e = rVar.m16688e(EnumC9213a.INSTANT_SECONDS);
        AbstractC9223k d = rVar.m16689d();
        EnumC9213a aVar = EnumC9213a.NANO_OF_SECOND;
        Long valueOf = d.mo16634b(aVar) ? Long.valueOf(rVar.m16689d().mo16633c(aVar)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int g = aVar.m16654g(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j = (longValue - 315569520000L) + 62167219200L;
            long d2 = AbstractC9166a.m16730d(j, 315569520000L) + 1;
            LocalDateTime i2 = LocalDateTime.m16742i(AbstractC9166a.m16731c(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (d2 > 0) {
                sb2.append('+');
                sb2.append(d2);
            }
            sb2.append(i2);
            if (i2.m16744g() == 0) {
                sb2.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime i3 = LocalDateTime.m16742i(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(i3);
            if (i3.m16744g() == 0) {
                sb2.append(":00");
            }
            if (j3 < 0) {
                if (i3.m16743h() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb2.insert(length, j3);
                } else {
                    sb2.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (g > 0) {
            sb2.append('.');
            int i4 = 100000000;
            while (true) {
                if (g <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i5 = g / i4;
                sb2.append((char) (i5 + 48));
                g -= i5 * i4;
                i4 /= 10;
                i++;
            }
        }
        sb2.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
