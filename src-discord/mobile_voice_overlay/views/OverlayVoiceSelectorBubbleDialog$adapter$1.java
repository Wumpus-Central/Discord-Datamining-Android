package com.discord.mobile_voice_overlay.views;

import com.discord.primitives.ChannelId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "channelId", "Lcom/discord/primitives/ChannelId;", "invoke-R7gqayM", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class OverlayVoiceSelectorBubbleDialog$adapter$1 extends s implements Function1<ChannelId, Unit> {
    final  OverlayVoiceSelectorBubbleDialog this$0;

    
    
    public OverlayVoiceSelectorBubbleDialog$adapter$1(OverlayVoiceSelectorBubbleDialog overlayVoiceSelectorBubbleDialog) {
        super(1);
        this.this$0 = overlayVoiceSelectorBubbleDialog;
    }

    @Override 
    public   Unit invoke(ChannelId channelId) {
        m502invokeR7gqayM(channelId.m590unboximpl());
        return Unit.f21213a;
    }

    
    public final void m502invokeR7gqayM(long j10) {
        this.this$0.getOnChannelSelected().invoke(ChannelId.m581boximpl(j10));
    }
}
