package com.discord.mobile_voice_overlay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MobileVoiceOverlay$menuDialogProvider$1$1$2 extends s implements Function0<Unit> {
    final  MobileVoiceOverlay this$0;

    
    
    public MobileVoiceOverlay$menuDialogProvider$1$1$2(MobileVoiceOverlay mobileVoiceOverlay) {
        super(0);
        this.this$0 = mobileVoiceOverlay;
    }

    @Override 
    
    public final void invoke2() {
        this.this$0.selectorDialogProvider.showViewOnOverlay();
    }
}
