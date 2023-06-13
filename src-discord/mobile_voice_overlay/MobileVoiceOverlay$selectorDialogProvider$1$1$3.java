package com.discord.mobile_voice_overlay;

import android.content.Context;
import androidx.core.os.d;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import com.discord.primitives.ChannelId;
import kg.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "channelId", "Lcom/discord/primitives/ChannelId;", "invoke-R7gqayM", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class MobileVoiceOverlay$selectorDialogProvider$1$1$3 extends s implements Function1<ChannelId, Unit> {
    final /* synthetic */ OverlayVoiceSelectorBubbleDialog $this_apply;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$selectorDialogProvider$1$1$3(OverlayVoiceSelectorBubbleDialog overlayVoiceSelectorBubbleDialog) {
        super(1);
        this.$this_apply = overlayVoiceSelectorBubbleDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChannelId channelId) {
        m450invokeR7gqayM(channelId.m555unboximpl());
        return Unit.f22105a;
    }

    /* renamed from: invoke-R7gqayM  reason: not valid java name */
    public final void m450invokeR7gqayM(long j10) {
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.Companion;
        Context context = this.$this_apply.getContext();
        q.f(context, "context");
        companion.startHeadlessTask(context, "SelectChannel", d.a(x.a("channelId", String.valueOf(j10)), x.a("connectToVoice", Boolean.TRUE)));
    }
}
