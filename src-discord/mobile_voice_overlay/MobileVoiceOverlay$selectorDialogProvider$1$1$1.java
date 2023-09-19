package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.views.OverlayDialog;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MobileVoiceOverlay$selectorDialogProvider$1$1$1 extends s implements Function1<OverlayDialog, Unit> {
    final  OverlayViewProvider<OverlayVoiceSelectorBubbleDialog> $provider;

    
    
    public MobileVoiceOverlay$selectorDialogProvider$1$1$1(OverlayViewProvider<OverlayVoiceSelectorBubbleDialog> overlayViewProvider) {
        super(1);
        this.$provider = overlayViewProvider;
    }

    @Override 
    public   Unit invoke(OverlayDialog overlayDialog) {
        invoke2(overlayDialog);
        return Unit.f21444a;
    }

    
    public final void invoke2(OverlayDialog it) {
        q.h(it, "it");
        this.$provider.removeViewFromOverlay();
    }
}
