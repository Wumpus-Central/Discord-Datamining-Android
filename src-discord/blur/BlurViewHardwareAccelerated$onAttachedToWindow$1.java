package com.discord.blur;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BlurViewHardwareAccelerated$onAttachedToWindow$1 extends s implements Function0<Unit> {
    final  BlurViewHardwareAccelerated this$0;

    
    
    public BlurViewHardwareAccelerated$onAttachedToWindow$1(BlurViewHardwareAccelerated blurViewHardwareAccelerated) {
        super(0);
        this.this$0 = blurViewHardwareAccelerated;
    }

    @Override 
    
    public final void invoke2() {
        this.this$0.maybeUpdate();
    }
}