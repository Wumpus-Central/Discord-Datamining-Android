package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.d;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"intervalFlow", "Lkotlinx/coroutines/flow/Flow;", "", "periodMs", "", "initialDelayMs", "period", "Lkotlin/time/Duration;", "initialDelay", "intervalFlow-QTBD994", "(JJ)Lkotlinx/coroutines/flow/Flow;", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class IntervalFlowKt {
    public static final Flow<Unit> intervalFlow(long j10, long j11) {
        return d.e(new IntervalFlowKt$intervalFlow$2(j11, j10, null));
    }

    public static  Flow intervalFlow$default(long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        return intervalFlow(j10, j11);
    }

    
    public static final Flow<Unit> m512intervalFlowQTBD994(long j10, long j11) {
        return d.e(new IntervalFlowKt$intervalFlow$1(j11, j10, null));
    }

    
    public static  Flow m513intervalFlowQTBD994$default(long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        return m512intervalFlowQTBD994(j10, j11);
    }
}
