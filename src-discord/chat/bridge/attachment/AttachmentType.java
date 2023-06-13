package com.discord.chat.bridge.attachment;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/discord/chat/bridge/attachment/AttachmentType;", "", "indexLabel", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getIndexLabel", "()Ljava/lang/String;", "Image", "Video", "File", "Audio", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AttachmentType {
    Image("imageAttachmentIndex"),
    Video("videoAttachmentIndex"),
    File("fileAttachmentIndex"),
    Audio("audioAttachmentIndex");
    
    private final String indexLabel;

    AttachmentType(String str) {
        this.indexLabel = str;
    }

    public final String getIndexLabel() {
        return this.indexLabel;
    }
}
