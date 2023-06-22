package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.view.EmbedView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Jf\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\b0\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/EmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "embedView", "Lcom/discord/chat/presentation/message/view/EmbedView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/EmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;", "maxHeightPx", "", "radiusPx", "onTapSpoiler", "Lkotlin/Function0;", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "onMediaClicked", "Lkotlin/Function2;", "", "onMediaLongClicked", "Landroid/view/View$OnLongClickListener;", "portal", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmbedViewHolder extends MessagePartViewHolder {
    private final EmbedView embedView;
    private final ChatEventHandler eventHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedViewHolder(EmbedView embedView, ChatEventHandler eventHandler) {
        super(embedView, null);
        q.g(embedView, "embedView");
        q.g(eventHandler, "eventHandler");
        this.embedView = embedView;
        this.eventHandler = eventHandler;
    }

    public final void bind(EmbedMessageAccessory accessory, int i10, int i11, Function0<Unit> onTapSpoiler, SpoilerConfig spoilerConfig, Function2<? super Double, ? super Integer, Unit> onMediaClicked, View.OnLongClickListener onLongClickListener, double d10) {
        q.g(accessory, "accessory");
        q.g(onTapSpoiler, "onTapSpoiler");
        q.g(onMediaClicked, "onMediaClicked");
        this.embedView.m304setEmbedlKx2FiY(accessory.getEmbed(), accessory.mo215getMessageId3Eiw7ao(), accessory.getConstrainedWidth(), i10, i11, accessory.getShouldAutoPlayGifs(), accessory.getShouldAnimateEmoji(), accessory.getShouldShowRoleDot(), accessory.getShouldShowRoleOnName(), new EmbedViewHolder$bind$1(this.eventHandler), new EmbedViewHolder$bind$2(this.eventHandler), onMediaClicked, onLongClickListener, new EmbedViewHolder$bind$3(this.eventHandler), new EmbedViewHolder$bind$4(this.eventHandler), new EmbedViewHolder$bind$5(this.eventHandler), onTapSpoiler, new EmbedViewHolder$bind$6(this.eventHandler), new EmbedViewHolder$bind$7(this.eventHandler), new EmbedViewHolder$bind$8(this.eventHandler), new EmbedViewHolder$bind$9(this.eventHandler), spoilerConfig, d10);
    }
}
