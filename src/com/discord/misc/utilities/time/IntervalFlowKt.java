package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.C9748d;
import kotlinx.coroutines.flow.Flow;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m15073d2 = {"Lsi/a;", "period", "initialDelay", "Lkotlinx/coroutines/flow/Flow;", "", "intervalFlow-QTBD994", "(JJ)Lkotlinx/coroutines/flow/Flow;", "intervalFlow", "", "periodMs", "initialDelayMs", "misc_utilities_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class IntervalFlowKt {
    public static final Flow<Unit> intervalFlow(long j, long j2) {
        return C9748d.m14428e(new IntervalFlowKt$intervalFlow$2(j2, j, null));
    }

    public static /* synthetic */ Flow intervalFlow$default(long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return intervalFlow(j, j2);
    }

    /* renamed from: intervalFlow-QTBD994  reason: not valid java name */
    public static final Flow<Unit> m42005intervalFlowQTBD994(long j, long j2) {
        return C9748d.m14428e(new IntervalFlowKt$intervalFlow$1(j2, j, null));
    }

    /* renamed from: intervalFlow-QTBD994$default  reason: not valid java name */
    public static /* synthetic */ Flow m42006intervalFlowQTBD994$default(long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return m42005intervalFlowQTBD994(j, j2);
    }
}
