package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "activityInviteEmbed", "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "(Ljava/lang/String;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActivityInviteEmbed", "()Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;)Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ActivityInviteEmbedMessageAccessory extends MessageAccessory {
    private final ActivityInviteEmbed activityInviteEmbed;
    private final String messageId;

    private ActivityInviteEmbedMessageAccessory(String str, ActivityInviteEmbed activityInviteEmbed) {
        super(str, "activity invite embed message", null);
        this.messageId = str;
        this.activityInviteEmbed = activityInviteEmbed;
    }

    public /* synthetic */ ActivityInviteEmbedMessageAccessory(String str, ActivityInviteEmbed activityInviteEmbed, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, activityInviteEmbed);
    }

    /* renamed from: copy-ntcYbpo$default  reason: not valid java name */
    public static /* synthetic */ ActivityInviteEmbedMessageAccessory m201copyntcYbpo$default(ActivityInviteEmbedMessageAccessory activityInviteEmbedMessageAccessory, String str, ActivityInviteEmbed activityInviteEmbed, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activityInviteEmbedMessageAccessory.mo204getMessageId3Eiw7ao();
        }
        if ((i10 & 2) != 0) {
            activityInviteEmbed = activityInviteEmbedMessageAccessory.activityInviteEmbed;
        }
        return activityInviteEmbedMessageAccessory.m203copyntcYbpo(str, activityInviteEmbed);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m202component13Eiw7ao() {
        return mo204getMessageId3Eiw7ao();
    }

    public final ActivityInviteEmbed component2() {
        return this.activityInviteEmbed;
    }

    /* renamed from: copy-ntcYbpo  reason: not valid java name */
    public final ActivityInviteEmbedMessageAccessory m203copyntcYbpo(String messageId, ActivityInviteEmbed activityInviteEmbed) {
        q.g(messageId, "messageId");
        q.g(activityInviteEmbed, "activityInviteEmbed");
        return new ActivityInviteEmbedMessageAccessory(messageId, activityInviteEmbed, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityInviteEmbedMessageAccessory)) {
            return false;
        }
        ActivityInviteEmbedMessageAccessory activityInviteEmbedMessageAccessory = (ActivityInviteEmbedMessageAccessory) obj;
        return MessageId.m576equalsimpl0(mo204getMessageId3Eiw7ao(), activityInviteEmbedMessageAccessory.mo204getMessageId3Eiw7ao()) && q.b(this.activityInviteEmbed, activityInviteEmbedMessageAccessory.activityInviteEmbed);
    }

    public final ActivityInviteEmbed getActivityInviteEmbed() {
        return this.activityInviteEmbed;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public String mo204getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (MessageId.m577hashCodeimpl(mo204getMessageId3Eiw7ao()) * 31) + this.activityInviteEmbed.hashCode();
    }

    public String toString() {
        String str = MessageId.m578toStringimpl(mo204getMessageId3Eiw7ao());
        ActivityInviteEmbed activityInviteEmbed = this.activityInviteEmbed;
        return "ActivityInviteEmbedMessageAccessory(messageId=" + str + ", activityInviteEmbed=" + activityInviteEmbed + ")";
    }
}
