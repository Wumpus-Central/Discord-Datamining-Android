package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.activity_invites.ActivityInviteEmbedView;
import com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed;
import com.discord.chat.presentation.message.messagepart.ActivityInviteEmbedMessageAccessory;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ActivityInviteEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "activityInviteEmbedView", "Lcom/discord/activity_invites/ActivityInviteEmbedView;", "(Lcom/discord/activity_invites/ActivityInviteEmbedView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;", "onTapJoinActivity", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ActivityInviteEmbedViewHolder extends MessagePartViewHolder {
    private final ActivityInviteEmbedView activityInviteEmbedView;

    
    public ActivityInviteEmbedViewHolder(ActivityInviteEmbedView activityInviteEmbedView) {
        super(activityInviteEmbedView, null);
        q.g(activityInviteEmbedView, "activityInviteEmbedView");
        this.activityInviteEmbedView = activityInviteEmbedView;
    }

    
    public static final void bind$lambda$0(Function1 onTapJoinActivity, ActivityInviteEmbedMessageAccessory accessory, View view) {
        q.g(onTapJoinActivity, "$onTapJoinActivity");
        q.g(accessory, "$accessory");
        onTapJoinActivity.invoke(MessageId.m592boximpl(accessory.mo217getMessageId3Eiw7ao()));
    }

    public final void bind(final ActivityInviteEmbedMessageAccessory accessory, final Function1<? super MessageId, Unit> onTapJoinActivity) {
        q.g(accessory, "accessory");
        q.g(onTapJoinActivity, "onTapJoinActivity");
        ActivityInviteEmbed activityInviteEmbed = accessory.getActivityInviteEmbed();
        this.activityInviteEmbedView.setActivityInviteEmbed(activityInviteEmbed.getCoverImage(), activityInviteEmbed.isListening(), activityInviteEmbed.getHeaderText(), activityInviteEmbed.getPartyStatus(), activityInviteEmbed.getAvatarsToRender(), activityInviteEmbed.getMaxPartySize(), activityInviteEmbed.getName(), activityInviteEmbed.getSubtext(), activityInviteEmbed.getJoinable(), activityInviteEmbed.getCtaText(), new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                ActivityInviteEmbedViewHolder.bind$lambda$0(Function1.this, accessory, view);
            }
        });
    }
}
