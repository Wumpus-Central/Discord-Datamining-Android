package com.discord.mobile_voice_overlay;

import android.content.Context;
import androidx.core.p018os.C1253d;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import com.discord.primitives.ChannelId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;
import nf.C10853x;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "channelId", "Lcom/discord/primitives/ChannelId;", "invoke-R7gqayM", "(J)V"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class MobileVoiceOverlay$selectorDialogProvider$1$1$3 extends AbstractC9679s implements Function1<ChannelId, Unit> {
    final /* synthetic */ OverlayVoiceSelectorBubbleDialog $this_apply;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$selectorDialogProvider$1$1$3(OverlayVoiceSelectorBubbleDialog overlayVoiceSelectorBubbleDialog) {
        super(1);
        this.$this_apply = overlayVoiceSelectorBubbleDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChannelId channelId) {
        m42007invokeR7gqayM(channelId.m42098unboximpl());
        return Unit.f25780a;
    }

    /* renamed from: invoke-R7gqayM  reason: not valid java name */
    public final void m42007invokeR7gqayM(long j) {
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.Companion;
        Context context = this.$this_apply.getContext();
        C9677q.m14634f(context, "context");
        companion.startHeadlessTask(context, "SelectChannel", C1253d.m37746a(C10853x.m10921a("channelId", String.valueOf(j)), C10853x.m10921a("connectToVoice", Boolean.TRUE)));
    }
}
