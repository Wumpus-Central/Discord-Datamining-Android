package com.discord.mobile_voice_overlay.views;

import com.discord.primitives.ChannelId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "it", "Lcom/discord/primitives/ChannelId;", "invoke-R7gqayM", "(J)V"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class OverlayVoiceSelectorBubbleDialog$onChannelSelected$1 extends AbstractC9973s implements Function1<ChannelId, Unit> {
    public static final OverlayVoiceSelectorBubbleDialog$onChannelSelected$1 INSTANCE = new OverlayVoiceSelectorBubbleDialog$onChannelSelected$1();

    OverlayVoiceSelectorBubbleDialog$onChannelSelected$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChannelId channelId) {
        m42025invokeR7gqayM(channelId.m42098unboximpl());
        return Unit.f22042a;
    }

    /* renamed from: invoke-R7gqayM  reason: not valid java name */
    public final void m42025invokeR7gqayM(long j) {
    }
}
