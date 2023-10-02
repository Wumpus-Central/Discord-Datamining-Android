package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.codedlinks.ActivityBookmarkEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.ActivityBookmarkMessageAccessory;
import com.discord.chat.presentation.message.view.ActivityBookmarkView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ActivityBookmarkViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "activityBookmarkView", "Lcom/discord/chat/presentation/message/view/ActivityBookmarkView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/ActivityBookmarkView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "bind", "", "activityMessageAccessory", "Lcom/discord/chat/presentation/message/messagepart/ActivityBookmarkMessageAccessory;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ActivityBookmarkViewHolder extends MessagePartViewHolder {
    private final ActivityBookmarkView activityBookmarkView;
    private final ChatEventHandler eventHandler;

    
    public ActivityBookmarkViewHolder(ActivityBookmarkView activityBookmarkView, ChatEventHandler eventHandler) {
        super(activityBookmarkView, null);
        q.h(activityBookmarkView, "activityBookmarkView");
        q.h(eventHandler, "eventHandler");
        this.activityBookmarkView = activityBookmarkView;
        this.eventHandler = eventHandler;
    }

    
    public static final void bind$lambda$1$lambda$0(ActivityBookmarkEmbedImpl activityBookmarkEmbed, ActivityBookmarkViewHolder this$0, View view) {
        q.h(activityBookmarkEmbed, "$activityBookmarkEmbed");
        q.h(this$0, "this$0");
        this$0.eventHandler.mo170onTapActivityBookmarkEmbeduU1mFKc(activityBookmarkEmbed.mo40getApplicationIdVavddsQ(), activityBookmarkEmbed.mo41getChannelIdo4g7jtM());
    }

    public final void bind(ActivityBookmarkMessageAccessory activityMessageAccessory) {
        q.h(activityMessageAccessory, "activityMessageAccessory");
        final ActivityBookmarkEmbedImpl activityBookmarkEmbed = activityMessageAccessory.getActivityBookmarkEmbed();
        ActivityBookmarkView activityBookmarkView = this.activityBookmarkView;
        activityBookmarkView.setSplash(activityBookmarkEmbed.getSplashUrl(), activityMessageAccessory.getConstrainedWidth());
        activityBookmarkView.setHeaderText(activityBookmarkEmbed.getHeaderText());
        activityBookmarkView.setLaunchButton(activityBookmarkEmbed.getAcceptLabelText(), activityBookmarkEmbed.getAcceptLabelBackgroundColor());
        activityBookmarkView.setDescription(activityBookmarkEmbed.getDescription());
        activityBookmarkView.setAvatarUris(activityBookmarkEmbed.getParticipantAvatarUris());
        activityBookmarkView.setParticipantsText(activityBookmarkEmbed.getParticipantsText());
        activityBookmarkView.setOnLaunchButtonClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                ActivityBookmarkViewHolder.bind$lambda$1$lambda$0(ActivityBookmarkEmbedImpl.this, this, view);
            }
        });
    }

    public final ChatEventHandler getEventHandler() {
        return this.eventHandler;
    }
}
