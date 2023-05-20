package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.ActivityLauncherEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ActivityLauncherMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "activityLauncherEmbed", "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;", "constrainedWidth", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActivityLauncherEmbed", "()Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;", "getCodedLinkIndex", "()I", "getConstrainedWidth", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;I)Lcom/discord/chat/presentation/message/messagepart/ActivityLauncherMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityLauncherMessageAccessory extends MessageAccessory {
    private final ActivityLauncherEmbedImpl activityLauncherEmbed;
    private final int codedLinkIndex;
    private final int constrainedWidth;
    private final String messageId;

    private ActivityLauncherMessageAccessory(String str, int i10, ActivityLauncherEmbedImpl activityLauncherEmbedImpl, int i11) {
        super(str, "activity launcher " + i10, null);
        this.messageId = str;
        this.codedLinkIndex = i10;
        this.activityLauncherEmbed = activityLauncherEmbedImpl;
        this.constrainedWidth = i11;
    }

    public /* synthetic */ ActivityLauncherMessageAccessory(String str, int i10, ActivityLauncherEmbedImpl activityLauncherEmbedImpl, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, activityLauncherEmbedImpl, i11);
    }

    /* renamed from: copy-AFFcxXc$default  reason: not valid java name */
    public static /* synthetic */ ActivityLauncherMessageAccessory m205copyAFFcxXc$default(ActivityLauncherMessageAccessory activityLauncherMessageAccessory, String str, int i10, ActivityLauncherEmbedImpl activityLauncherEmbedImpl, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = activityLauncherMessageAccessory.mo204getMessageId3Eiw7ao();
        }
        if ((i12 & 2) != 0) {
            i10 = activityLauncherMessageAccessory.codedLinkIndex;
        }
        if ((i12 & 4) != 0) {
            activityLauncherEmbedImpl = activityLauncherMessageAccessory.activityLauncherEmbed;
        }
        if ((i12 & 8) != 0) {
            i11 = activityLauncherMessageAccessory.constrainedWidth;
        }
        return activityLauncherMessageAccessory.m207copyAFFcxXc(str, i10, activityLauncherEmbedImpl, i11);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m206component13Eiw7ao() {
        return mo204getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.codedLinkIndex;
    }

    public final ActivityLauncherEmbedImpl component3() {
        return this.activityLauncherEmbed;
    }

    public final int component4() {
        return this.constrainedWidth;
    }

    /* renamed from: copy-AFFcxXc  reason: not valid java name */
    public final ActivityLauncherMessageAccessory m207copyAFFcxXc(String messageId, int i10, ActivityLauncherEmbedImpl activityLauncherEmbed, int i11) {
        q.g(messageId, "messageId");
        q.g(activityLauncherEmbed, "activityLauncherEmbed");
        return new ActivityLauncherMessageAccessory(messageId, i10, activityLauncherEmbed, i11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityLauncherMessageAccessory)) {
            return false;
        }
        ActivityLauncherMessageAccessory activityLauncherMessageAccessory = (ActivityLauncherMessageAccessory) obj;
        return MessageId.m576equalsimpl0(mo204getMessageId3Eiw7ao(), activityLauncherMessageAccessory.mo204getMessageId3Eiw7ao()) && this.codedLinkIndex == activityLauncherMessageAccessory.codedLinkIndex && q.b(this.activityLauncherEmbed, activityLauncherMessageAccessory.activityLauncherEmbed) && this.constrainedWidth == activityLauncherMessageAccessory.constrainedWidth;
    }

    public final ActivityLauncherEmbedImpl getActivityLauncherEmbed() {
        return this.activityLauncherEmbed;
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo204getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((((MessageId.m577hashCodeimpl(mo204getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.activityLauncherEmbed.hashCode()) * 31) + this.constrainedWidth;
    }

    public String toString() {
        String str = MessageId.m578toStringimpl(mo204getMessageId3Eiw7ao());
        int i10 = this.codedLinkIndex;
        ActivityLauncherEmbedImpl activityLauncherEmbedImpl = this.activityLauncherEmbed;
        int i11 = this.constrainedWidth;
        return "ActivityLauncherMessageAccessory(messageId=" + str + ", codedLinkIndex=" + i10 + ", activityLauncherEmbed=" + activityLauncherEmbedImpl + ", constrainedWidth=" + i11 + ")";
    }
}
