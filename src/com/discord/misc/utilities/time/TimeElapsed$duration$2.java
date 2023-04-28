package com.discord.misc.utilities.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;

@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class TimeElapsed$duration$2 extends AbstractC9973s implements Function0<String> {
    final /* synthetic */ TimeElapsed this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeElapsed$duration$2(TimeElapsed timeElapsed) {
        super(0);
        this.this$0 = timeElapsed;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return new SimpleDateFormat("mm:ss:SSS", Locale.getDefault()).format(new Date(this.this$0.getDurationMillis()));
    }
}
