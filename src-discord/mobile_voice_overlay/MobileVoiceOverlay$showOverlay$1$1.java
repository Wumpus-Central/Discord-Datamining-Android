package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MobileVoiceOverlay$showOverlay$1$1 extends s implements Function1<OverlayVoiceBubble, Unit> {
    final  MobileVoiceOverlay this$0;

    
    
    public MobileVoiceOverlay$showOverlay$1$1(MobileVoiceOverlay mobileVoiceOverlay) {
        super(1);
        this.this$0 = mobileVoiceOverlay;
    }

    @Override 
    public   Unit invoke(OverlayVoiceBubble overlayVoiceBubble) {
        invoke2(overlayVoiceBubble);
        return Unit.f20666a;
    }

    
    public final void invoke2(OverlayVoiceBubble it) {
        q.g(it, "it");
        this.this$0.floatBubbleToHorizontalEdge(it);
    }
}
