package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.ActivityBookmarkEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ActivityBookmarkMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "activityBookmarkEmbed", "Lcom/discord/chat/bridge/codedlinks/ActivityBookmarkEmbedImpl;", "constrainedWidth", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/ActivityBookmarkEmbedImpl;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActivityBookmarkEmbed", "()Lcom/discord/chat/bridge/codedlinks/ActivityBookmarkEmbedImpl;", "getCodedLinkIndex", "()I", "getConstrainedWidth", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/ActivityBookmarkEmbedImpl;I)Lcom/discord/chat/presentation/message/messagepart/ActivityBookmarkMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ActivityBookmarkMessageAccessory extends MessageAccessory {
    private final ActivityBookmarkEmbedImpl activityBookmarkEmbed;
    private final int codedLinkIndex;
    private final int constrainedWidth;
    private final String messageId;

    private ActivityBookmarkMessageAccessory(String str, int i10, ActivityBookmarkEmbedImpl activityBookmarkEmbedImpl, int i11) {
        super(str, "activity launcher " + i10, null);
        this.messageId = str;
        this.codedLinkIndex = i10;
        this.activityBookmarkEmbed = activityBookmarkEmbedImpl;
        this.constrainedWidth = i11;
    }

    public  ActivityBookmarkMessageAccessory(String str, int i10, ActivityBookmarkEmbedImpl activityBookmarkEmbedImpl, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, activityBookmarkEmbedImpl, i11);
    }

    
    public static  ActivityBookmarkMessageAccessory m229copyAFFcxXc$default(ActivityBookmarkMessageAccessory activityBookmarkMessageAccessory, String str, int i10, ActivityBookmarkEmbedImpl activityBookmarkEmbedImpl, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = activityBookmarkMessageAccessory.mo232getMessageId3Eiw7ao();
        }
        if ((i12 & 2) != 0) {
            i10 = activityBookmarkMessageAccessory.codedLinkIndex;
        }
        if ((i12 & 4) != 0) {
            activityBookmarkEmbedImpl = activityBookmarkMessageAccessory.activityBookmarkEmbed;
        }
        if ((i12 & 8) != 0) {
            i11 = activityBookmarkMessageAccessory.constrainedWidth;
        }
        return activityBookmarkMessageAccessory.m231copyAFFcxXc(str, i10, activityBookmarkEmbedImpl, i11);
    }

    
    public final String m230component13Eiw7ao() {
        return mo232getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.codedLinkIndex;
    }

    public final ActivityBookmarkEmbedImpl component3() {
        return this.activityBookmarkEmbed;
    }

    public final int component4() {
        return this.constrainedWidth;
    }

    
    public final ActivityBookmarkMessageAccessory m231copyAFFcxXc(String messageId, int i10, ActivityBookmarkEmbedImpl activityBookmarkEmbed, int i11) {
        q.h(messageId, "messageId");
        q.h(activityBookmarkEmbed, "activityBookmarkEmbed");
        return new ActivityBookmarkMessageAccessory(messageId, i10, activityBookmarkEmbed, i11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityBookmarkMessageAccessory)) {
            return false;
        }
        ActivityBookmarkMessageAccessory activityBookmarkMessageAccessory = (ActivityBookmarkMessageAccessory) obj;
        return MessageId.m621equalsimpl0(mo232getMessageId3Eiw7ao(), activityBookmarkMessageAccessory.mo232getMessageId3Eiw7ao()) && this.codedLinkIndex == activityBookmarkMessageAccessory.codedLinkIndex && q.c(this.activityBookmarkEmbed, activityBookmarkMessageAccessory.activityBookmarkEmbed) && this.constrainedWidth == activityBookmarkMessageAccessory.constrainedWidth;
    }

    public final ActivityBookmarkEmbedImpl getActivityBookmarkEmbed() {
        return this.activityBookmarkEmbed;
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @Override 
    
    public String mo232getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((((MessageId.m622hashCodeimpl(mo232getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.activityBookmarkEmbed.hashCode()) * 31) + this.constrainedWidth;
    }

    public String toString() {
        String str = MessageId.m623toStringimpl(mo232getMessageId3Eiw7ao());
        int i10 = this.codedLinkIndex;
        ActivityBookmarkEmbedImpl activityBookmarkEmbedImpl = this.activityBookmarkEmbed;
        int i11 = this.constrainedWidth;
        return "ActivityBookmarkMessageAccessory(messageId=" + str + ", codedLinkIndex=" + i10 + ", activityBookmarkEmbed=" + activityBookmarkEmbedImpl + ", constrainedWidth=" + i11 + ")";
    }
}
