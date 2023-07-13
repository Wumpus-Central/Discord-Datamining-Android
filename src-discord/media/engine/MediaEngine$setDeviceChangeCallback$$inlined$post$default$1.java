package com.discord.media.engine;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/discord/async_init/AsyncInitDispatcher$post$1"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaEngine$setDeviceChangeCallback$$inlined$post$default$1 extends s implements Function0<Unit> {
    final  Function3 $callback$inlined;
    final  MediaEngine this$0;

    
    public MediaEngine$setDeviceChangeCallback$$inlined$post$default$1(MediaEngine mediaEngine, Function3 function3) {
        super(0);
        this.this$0 = mediaEngine;
        this.$callback$inlined = function3;
    }

    @Override 
    
    public final void invoke2() {
        this.this$0.getEngine().setOnDeviceChangeCallback(new MediaEngine$setDeviceChangeCallback$1$1(this.$callback$inlined));
    }
}
