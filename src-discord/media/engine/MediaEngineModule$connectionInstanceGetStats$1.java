package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "stats", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$connectionInstanceGetStats$1 extends s implements Function1<String, Unit> {
    final  Callback $callback;

    
    
    public MediaEngineModule$connectionInstanceGetStats$1(Callback callback) {
        super(1);
        this.$callback = callback;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f20666a;
    }

    
    public final void invoke2(String stats) {
        q.g(stats, "stats");
        this.$callback.invoke(stats);
    }
}
