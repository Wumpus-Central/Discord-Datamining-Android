package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.UploadProgress;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/UploadProgressMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "index", "", "uploadProgress", "Lcom/discord/chat/bridge/UploadProgress;", "(Ljava/lang/String;ILcom/discord/chat/bridge/UploadProgress;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex", "()I", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getUploadProgress", "()Lcom/discord/chat/bridge/UploadProgress;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;ILcom/discord/chat/bridge/UploadProgress;)Lcom/discord/chat/presentation/message/messagepart/UploadProgressMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UploadProgressMessageAccessory extends MessageAccessory {
    private final int index;
    private final String messageId;
    private final UploadProgress uploadProgress;

    private UploadProgressMessageAccessory(String str, int i10, UploadProgress uploadProgress) {
        super(str, "upload " + i10, null);
        this.messageId = str;
        this.index = i10;
        this.uploadProgress = uploadProgress;
    }

    public /* synthetic */ UploadProgressMessageAccessory(String str, int i10, UploadProgress uploadProgress, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, uploadProgress);
    }

    /* renamed from: copy-u7_MRrM$default  reason: not valid java name */
    public static /* synthetic */ UploadProgressMessageAccessory m287copyu7_MRrM$default(UploadProgressMessageAccessory uploadProgressMessageAccessory, String str, int i10, UploadProgress uploadProgress, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadProgressMessageAccessory.mo206getMessageId3Eiw7ao();
        }
        if ((i11 & 2) != 0) {
            i10 = uploadProgressMessageAccessory.index;
        }
        if ((i11 & 4) != 0) {
            uploadProgress = uploadProgressMessageAccessory.uploadProgress;
        }
        return uploadProgressMessageAccessory.m289copyu7_MRrM(str, i10, uploadProgress);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m288component13Eiw7ao() {
        return mo206getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.index;
    }

    public final UploadProgress component3() {
        return this.uploadProgress;
    }

    /* renamed from: copy-u7_MRrM  reason: not valid java name */
    public final UploadProgressMessageAccessory m289copyu7_MRrM(String messageId, int i10, UploadProgress uploadProgress) {
        q.g(messageId, "messageId");
        q.g(uploadProgress, "uploadProgress");
        return new UploadProgressMessageAccessory(messageId, i10, uploadProgress, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadProgressMessageAccessory)) {
            return false;
        }
        UploadProgressMessageAccessory uploadProgressMessageAccessory = (UploadProgressMessageAccessory) obj;
        return MessageId.m584equalsimpl0(mo206getMessageId3Eiw7ao(), uploadProgressMessageAccessory.mo206getMessageId3Eiw7ao()) && this.index == uploadProgressMessageAccessory.index && q.b(this.uploadProgress, uploadProgressMessageAccessory.uploadProgress);
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo206getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final UploadProgress getUploadProgress() {
        return this.uploadProgress;
    }

    public int hashCode() {
        return (((MessageId.m585hashCodeimpl(mo206getMessageId3Eiw7ao()) * 31) + this.index) * 31) + this.uploadProgress.hashCode();
    }

    public String toString() {
        String str = MessageId.m586toStringimpl(mo206getMessageId3Eiw7ao());
        int i10 = this.index;
        UploadProgress uploadProgress = this.uploadProgress;
        return "UploadProgressMessageAccessory(messageId=" + str + ", index=" + i10 + ", uploadProgress=" + uploadProgress + ")";
    }
}
