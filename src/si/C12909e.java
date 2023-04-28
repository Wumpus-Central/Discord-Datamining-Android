package si;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001\u001a \u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¨\u0006\t"}, m15073d2 = {"", "value", "Lsi/d;", "sourceUnit", "targetUnit", "a", "", "c", "b", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/time/DurationUnitKt")
/* renamed from: si.e */
/* loaded from: classes8.dex */
class C12909e {
    /* renamed from: a */
    public static final double m5086a(double d, EnumC12908d sourceUnit, EnumC12908d targetUnit) {
        C9971q.m14633g(sourceUnit, "sourceUnit");
        C9971q.m14633g(targetUnit, "targetUnit");
        long convert = targetUnit.m5087b().convert(1L, sourceUnit.m5087b());
        if (convert > 0) {
            return d * convert;
        }
        return d / sourceUnit.m5087b().convert(1L, targetUnit.m5087b());
    }

    /* renamed from: b */
    public static final long m5085b(long j, EnumC12908d sourceUnit, EnumC12908d targetUnit) {
        C9971q.m14633g(sourceUnit, "sourceUnit");
        C9971q.m14633g(targetUnit, "targetUnit");
        return targetUnit.m5087b().convert(j, sourceUnit.m5087b());
    }

    /* renamed from: c */
    public static final long m5084c(long j, EnumC12908d sourceUnit, EnumC12908d targetUnit) {
        C9971q.m14633g(sourceUnit, "sourceUnit");
        C9971q.m14633g(targetUnit, "targetUnit");
        return targetUnit.m5087b().convert(j, sourceUnit.m5087b());
    }
}
