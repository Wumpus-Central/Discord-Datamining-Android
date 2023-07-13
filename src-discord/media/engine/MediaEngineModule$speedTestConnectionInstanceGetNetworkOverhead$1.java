package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "overhead", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$speedTestConnectionInstanceGetNetworkOverhead$1 extends s implements Function1<Integer, Unit> {
    final  Callback $callback;

    
    
    public MediaEngineModule$speedTestConnectionInstanceGetNetworkOverhead$1(Callback callback) {
        super(1);
        this.$callback = callback;
    }

    @Override 
    public   Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f20663a;
    }

    public final void invoke(int i10) {
        this.$callback.invoke(Integer.valueOf(i10));
    }
}
