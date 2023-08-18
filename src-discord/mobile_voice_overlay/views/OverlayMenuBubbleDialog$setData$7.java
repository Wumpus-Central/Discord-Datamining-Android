package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import androidx.core.os.e;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import jf.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class OverlayMenuBubbleDialog$setData$7 extends s implements Function0<Unit> {
    final  MobileVoiceOverlayData $data;
    final  OverlayMenuBubbleDialog this$0;

    
    
    public OverlayMenuBubbleDialog$setData$7(OverlayMenuBubbleDialog overlayMenuBubbleDialog, MobileVoiceOverlayData mobileVoiceOverlayData) {
        super(0);
        this.this$0 = overlayMenuBubbleDialog;
        this.$data = mobileVoiceOverlayData;
    }

    @Override 
    
    public final void invoke2() {
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.Companion;
        Context context = this.this$0.getContext();
        q.g(context, "context");
        companion.startHeadlessTask(context, "Disconnect", e.a(x.a("channelId", String.valueOf(this.$data.m490getChannelIdo4g7jtM()))));
    }
}
