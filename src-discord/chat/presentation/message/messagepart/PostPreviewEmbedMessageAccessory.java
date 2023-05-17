package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "postPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "index", "", "(Ljava/lang/String;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex", "()I", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getPostPreviewEmbed", "()Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;I)Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostPreviewEmbedMessageAccessory extends MessageAccessory {
    private final int index;
    private final String messageId;
    private final PostPreviewEmbed postPreviewEmbed;

    private PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i10) {
        super(str, "post preview embed " + i10, null);
        this.messageId = str;
        this.postPreviewEmbed = postPreviewEmbed;
        this.index = i10;
    }

    public /* synthetic */ PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, postPreviewEmbed, i10);
    }

    /* renamed from: copy-u7_MRrM$default  reason: not valid java name */
    public static /* synthetic */ PostPreviewEmbedMessageAccessory m263copyu7_MRrM$default(PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory, String str, PostPreviewEmbed postPreviewEmbed, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = postPreviewEmbedMessageAccessory.mo203getMessageId3Eiw7ao();
        }
        if ((i11 & 2) != 0) {
            postPreviewEmbed = postPreviewEmbedMessageAccessory.postPreviewEmbed;
        }
        if ((i11 & 4) != 0) {
            i10 = postPreviewEmbedMessageAccessory.index;
        }
        return postPreviewEmbedMessageAccessory.m265copyu7_MRrM(str, postPreviewEmbed, i10);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m264component13Eiw7ao() {
        return mo203getMessageId3Eiw7ao();
    }

    public final PostPreviewEmbed component2() {
        return this.postPreviewEmbed;
    }

    public final int component3() {
        return this.index;
    }

    /* renamed from: copy-u7_MRrM  reason: not valid java name */
    public final PostPreviewEmbedMessageAccessory m265copyu7_MRrM(String messageId, PostPreviewEmbed postPreviewEmbed, int i10) {
        q.g(messageId, "messageId");
        q.g(postPreviewEmbed, "postPreviewEmbed");
        return new PostPreviewEmbedMessageAccessory(messageId, postPreviewEmbed, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPreviewEmbedMessageAccessory)) {
            return false;
        }
        PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory = (PostPreviewEmbedMessageAccessory) obj;
        return MessageId.m567equalsimpl0(mo203getMessageId3Eiw7ao(), postPreviewEmbedMessageAccessory.mo203getMessageId3Eiw7ao()) && q.b(this.postPreviewEmbed, postPreviewEmbedMessageAccessory.postPreviewEmbed) && this.index == postPreviewEmbedMessageAccessory.index;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo203getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final PostPreviewEmbed getPostPreviewEmbed() {
        return this.postPreviewEmbed;
    }

    public int hashCode() {
        return (((MessageId.m568hashCodeimpl(mo203getMessageId3Eiw7ao()) * 31) + this.postPreviewEmbed.hashCode()) * 31) + this.index;
    }

    public String toString() {
        String str = MessageId.m569toStringimpl(mo203getMessageId3Eiw7ao());
        PostPreviewEmbed postPreviewEmbed = this.postPreviewEmbed;
        int i10 = this.index;
        return "PostPreviewEmbedMessageAccessory(messageId=" + str + ", postPreviewEmbed=" + postPreviewEmbed + ", index=" + i10 + ")";
    }
}
