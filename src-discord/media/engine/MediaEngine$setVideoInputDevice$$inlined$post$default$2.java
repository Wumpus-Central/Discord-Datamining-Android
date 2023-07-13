package com.discord.media.engine;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/discord/async_init/AsyncInitDispatcher$post$1"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaEngine$setVideoInputDevice$$inlined$post$default$2 extends s implements Function0<Unit> {
    final  int $deviceIndex$inlined;
    final  MediaEngine this$0;

    
    public MediaEngine$setVideoInputDevice$$inlined$post$default$2(MediaEngine mediaEngine, int i10) {
        super(0);
        this.this$0 = mediaEngine;
        this.$deviceIndex$inlined = i10;
    }

    @Override 
    
    public final void invoke2() {
        this.this$0.getEngine().setVideoInputDeviceIndex(this.$deviceIndex$inlined);
    }
}
