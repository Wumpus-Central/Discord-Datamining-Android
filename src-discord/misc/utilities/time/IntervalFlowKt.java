package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lpj/a;", "period", "initialDelay", "Lkotlinx/coroutines/flow/Flow;", "", "intervalFlow-QTBD994", "(JJ)Lkotlinx/coroutines/flow/Flow;", "intervalFlow", "", "periodMs", "initialDelayMs", "misc_utilities_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class IntervalFlowKt {
    public static final Flow<Unit> intervalFlow(long j10, long j11) {
        return d.e(new IntervalFlowKt$intervalFlow$2(j11, j10, null));
    }

    public static /* synthetic */ Flow intervalFlow$default(long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        return intervalFlow(j10, j11);
    }

    /* renamed from: intervalFlow-QTBD994  reason: not valid java name */
    public static final Flow<Unit> m448intervalFlowQTBD994(long j10, long j11) {
        return d.e(new IntervalFlowKt$intervalFlow$1(j11, j10, null));
    }

    /* renamed from: intervalFlow-QTBD994$default  reason: not valid java name */
    public static /* synthetic */ Flow m449intervalFlowQTBD994$default(long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        return m448intervalFlowQTBD994(j10, j11);
    }
}
