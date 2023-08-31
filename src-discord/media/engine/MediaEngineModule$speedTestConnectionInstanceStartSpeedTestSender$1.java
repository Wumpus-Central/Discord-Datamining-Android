package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "code", "", "desc", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$speedTestConnectionInstanceStartSpeedTestSender$1 extends s implements Function2<Integer, String, Unit> {
    final  Callback $callback;

    
    
    public MediaEngineModule$speedTestConnectionInstanceStartSpeedTestSender$1(Callback callback) {
        super(2);
        this.$callback = callback;
    }

    @Override 
    public   Unit invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return Unit.f21215a;
    }

    public final void invoke(int i10, String desc) {
        q.h(desc, "desc");
        this.$callback.invoke(Integer.valueOf(i10), desc);
    }
}
