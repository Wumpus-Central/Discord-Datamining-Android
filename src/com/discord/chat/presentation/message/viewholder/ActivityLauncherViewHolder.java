package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.codedlinks.ActivityLauncherEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.ActivityLauncherMessageAccessory;
import com.discord.chat.presentation.message.view.ActivityLauncherView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m15073d2 = {"Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "activityLauncherView", "Lcom/discord/chat/presentation/message/view/ActivityLauncherView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/ActivityLauncherView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "bind", "", "activityMessageAccessory", "Lcom/discord/chat/presentation/message/messagepart/ActivityLauncherMessageAccessory;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ActivityLauncherViewHolder extends MessagePartViewHolder {
    private final ActivityLauncherView activityLauncherView;
    private final ChatEventHandler eventHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityLauncherViewHolder(ActivityLauncherView activityLauncherView, ChatEventHandler eventHandler) {
        super(activityLauncherView, null);
        C9677q.m14633g(activityLauncherView, "activityLauncherView");
        C9677q.m14633g(eventHandler, "eventHandler");
        this.activityLauncherView = activityLauncherView;
        this.eventHandler = eventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(ActivityLauncherEmbedImpl activityLauncherEmbed, ActivityLauncherViewHolder this$0, View view) {
        C9677q.m14633g(activityLauncherEmbed, "$activityLauncherEmbed");
        C9677q.m14633g(this$0, "this$0");
        this$0.eventHandler.mo41710onTapActivityLauncherEmbeduU1mFKc(activityLauncherEmbed.mo41595getApplicationIdVavddsQ(), activityLauncherEmbed.mo41596getChannelIdo4g7jtM());
    }

    public final void bind(ActivityLauncherMessageAccessory activityMessageAccessory) {
        C9677q.m14633g(activityMessageAccessory, "activityMessageAccessory");
        final ActivityLauncherEmbedImpl activityLauncherEmbed = activityMessageAccessory.getActivityLauncherEmbed();
        ActivityLauncherView activityLauncherView = this.activityLauncherView;
        activityLauncherView.setSplash(activityLauncherEmbed.getSplashUrl(), activityMessageAccessory.getConstrainedWidth());
        activityLauncherView.setHeaderText(activityLauncherEmbed.getHeaderText());
        activityLauncherView.setLaunchButton(activityLauncherEmbed.getAcceptLabelText(), activityLauncherEmbed.getAcceptLabelBackgroundColor());
        activityLauncherView.setDescription(activityLauncherEmbed.getDescription());
        activityLauncherView.setAvatarUris(activityLauncherEmbed.getParticipantAvatarUris());
        activityLauncherView.setParticipantsText(activityLauncherEmbed.getParticipantsText());
        activityLauncherView.setOnLaunchButtonClickListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityLauncherViewHolder.bind$lambda$1$lambda$0(ActivityLauncherEmbedImpl.this, this, view);
            }
        });
    }

    public final ChatEventHandler getEventHandler() {
        return this.eventHandler;
    }
}
