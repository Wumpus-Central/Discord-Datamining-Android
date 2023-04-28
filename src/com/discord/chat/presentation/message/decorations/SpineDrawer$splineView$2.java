package com.discord.chat.presentation.message.decorations;

import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.C3147R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Lcom/discord/channel_spine/ChannelSpineView;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class SpineDrawer$splineView$2 extends AbstractC9679s implements Function0<ChannelSpineView> {
    final /* synthetic */ SpineDrawer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpineDrawer$splineView$2(SpineDrawer spineDrawer) {
        super(0);
        this.this$0 = spineDrawer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ChannelSpineView invoke() {
        ChannelSpineView channelSpineView = new ChannelSpineView(this.this$0.getContext(), null, 2, null);
        channelSpineView.setVerticalPadding(0);
        channelSpineView.setHorizontalPadding(channelSpineView.getContext().getResources().getDimensionPixelSize(C3147R.dimen.thread_spine_end_padding));
        channelSpineView.setNumRows(1);
        return channelSpineView;
    }
}
