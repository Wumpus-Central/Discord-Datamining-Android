package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeElapsed$durationMillis$2 extends s implements Function0<Long> {
    final /* synthetic */ TimeElapsed this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeElapsed$durationMillis$2(TimeElapsed timeElapsed) {
        super(0);
        this.this$0 = timeElapsed;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        j10 = this.this$0.startTime;
        return Long.valueOf(currentTimeMillis - j10);
    }
}
