package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u0014\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "postPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "index", "", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "(Ljava/lang/String;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;ILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex", "()I", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getPostPreviewEmbed", "()Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;ILcom/discord/chat/bridge/spoiler/SpoilerAttributes;)Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PostPreviewEmbedMessageAccessory extends MessageAccessory {
    private final int index;
    private final String messageId;
    private final PostPreviewEmbed postPreviewEmbed;
    private final SpoilerAttributes spoilerAttributes;

    public /* synthetic */ PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i10, SpoilerAttributes spoilerAttributes, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, postPreviewEmbed, i10, (i11 & 8) != 0 ? null : spoilerAttributes, null);
    }

    public /* synthetic */ PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i10, SpoilerAttributes spoilerAttributes, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, postPreviewEmbed, i10, spoilerAttributes);
    }

    /* renamed from: copy-AFFcxXc$default  reason: not valid java name */
    public static /* synthetic */ PostPreviewEmbedMessageAccessory m275copyAFFcxXc$default(PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory, String str, PostPreviewEmbed postPreviewEmbed, int i10, SpoilerAttributes spoilerAttributes, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = postPreviewEmbedMessageAccessory.mo215getMessageId3Eiw7ao();
        }
        if ((i11 & 2) != 0) {
            postPreviewEmbed = postPreviewEmbedMessageAccessory.postPreviewEmbed;
        }
        if ((i11 & 4) != 0) {
            i10 = postPreviewEmbedMessageAccessory.index;
        }
        if ((i11 & 8) != 0) {
            spoilerAttributes = postPreviewEmbedMessageAccessory.spoilerAttributes;
        }
        return postPreviewEmbedMessageAccessory.m277copyAFFcxXc(str, postPreviewEmbed, i10, spoilerAttributes);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m276component13Eiw7ao() {
        return mo215getMessageId3Eiw7ao();
    }

    public final PostPreviewEmbed component2() {
        return this.postPreviewEmbed;
    }

    public final int component3() {
        return this.index;
    }

    public final SpoilerAttributes component4() {
        return this.spoilerAttributes;
    }

    /* renamed from: copy-AFFcxXc  reason: not valid java name */
    public final PostPreviewEmbedMessageAccessory m277copyAFFcxXc(String messageId, PostPreviewEmbed postPreviewEmbed, int i10, SpoilerAttributes spoilerAttributes) {
        q.g(messageId, "messageId");
        q.g(postPreviewEmbed, "postPreviewEmbed");
        return new PostPreviewEmbedMessageAccessory(messageId, postPreviewEmbed, i10, spoilerAttributes, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPreviewEmbedMessageAccessory)) {
            return false;
        }
        PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory = (PostPreviewEmbedMessageAccessory) obj;
        return MessageId.m594equalsimpl0(mo215getMessageId3Eiw7ao(), postPreviewEmbedMessageAccessory.mo215getMessageId3Eiw7ao()) && q.b(this.postPreviewEmbed, postPreviewEmbedMessageAccessory.postPreviewEmbed) && this.index == postPreviewEmbedMessageAccessory.index && q.b(this.spoilerAttributes, postPreviewEmbedMessageAccessory.spoilerAttributes);
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo215getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final PostPreviewEmbed getPostPreviewEmbed() {
        return this.postPreviewEmbed;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public int hashCode() {
        int i10 = ((((MessageId.m595hashCodeimpl(mo215getMessageId3Eiw7ao()) * 31) + this.postPreviewEmbed.hashCode()) * 31) + this.index) * 31;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        return i10 + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode());
    }

    public String toString() {
        String str = MessageId.m596toStringimpl(mo215getMessageId3Eiw7ao());
        PostPreviewEmbed postPreviewEmbed = this.postPreviewEmbed;
        int i10 = this.index;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        return "PostPreviewEmbedMessageAccessory(messageId=" + str + ", postPreviewEmbed=" + postPreviewEmbed + ", index=" + i10 + ", spoilerAttributes=" + spoilerAttributes + ")";
    }

    private PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i10, SpoilerAttributes spoilerAttributes) {
        super(str, "post preview embed " + i10, null);
        this.messageId = str;
        this.postPreviewEmbed = postPreviewEmbed;
        this.index = i10;
        this.spoilerAttributes = spoilerAttributes;
    }
}
