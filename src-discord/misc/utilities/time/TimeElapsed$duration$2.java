package com.discord.misc.utilities.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class TimeElapsed$duration$2 extends s implements Function0<String> {
    final  TimeElapsed this$0;

    
    
    public TimeElapsed$duration$2(TimeElapsed timeElapsed) {
        super(0);
        this.this$0 = timeElapsed;
    }

    @Override 
    public final String invoke() {
        return new SimpleDateFormat("mm:ss:SSS", Locale.getDefault()).format(new Date(this.this$0.getDurationMillis()));
    }
}
