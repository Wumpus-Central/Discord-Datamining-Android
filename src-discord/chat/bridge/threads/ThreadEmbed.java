package com.discord.chat.bridge.threads;

import cj.a2;
import cj.h;
import cj.n1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import zi.f;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JR\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J!\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-HÇ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u00060"}, d2 = {"Lcom/discord/chat/bridge/threads/ThreadEmbed;", "", "seen1", "", "title", "", "messageCountLabel", "messagePreviewString", "archived", "", "archivedIconUrl", "referencedMessage", "Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;)V", "getArchived", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getArchivedIconUrl", "()Ljava/lang/String;", "getMessageCountLabel", "getMessagePreviewString", "getReferencedMessage", "()Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;)Lcom/discord/chat/bridge/threads/ThreadEmbed;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class ThreadEmbed {
    public static final Companion Companion = new Companion(null);
    private final Boolean archived;
    private final String archivedIconUrl;
    private final String messageCountLabel;
    private final String messagePreviewString;
    private final ThreadEmbedMessage referencedMessage;
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/threads/ThreadEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/threads/ThreadEmbed;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ThreadEmbed> serializer() {
            return ThreadEmbed$$serializer.INSTANCE;
        }
    }

    public  ThreadEmbed(int i10, String str, String str2, String str3, Boolean bool, String str4, ThreadEmbedMessage threadEmbedMessage, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, ThreadEmbed$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.messageCountLabel = str2;
        if ((i10 & 4) == 0) {
            this.messagePreviewString = null;
        } else {
            this.messagePreviewString = str3;
        }
        if ((i10 & 8) == 0) {
            this.archived = null;
        } else {
            this.archived = bool;
        }
        if ((i10 & 16) == 0) {
            this.archivedIconUrl = null;
        } else {
            this.archivedIconUrl = str4;
        }
        if ((i10 & 32) == 0) {
            this.referencedMessage = null;
        } else {
            this.referencedMessage = threadEmbedMessage;
        }
    }

    public static  ThreadEmbed copy$default(ThreadEmbed threadEmbed, String str, String str2, String str3, Boolean bool, String str4, ThreadEmbedMessage threadEmbedMessage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = threadEmbed.title;
        }
        if ((i10 & 2) != 0) {
            str2 = threadEmbed.messageCountLabel;
        }
        if ((i10 & 4) != 0) {
            str3 = threadEmbed.messagePreviewString;
        }
        if ((i10 & 8) != 0) {
            bool = threadEmbed.archived;
        }
        if ((i10 & 16) != 0) {
            str4 = threadEmbed.archivedIconUrl;
        }
        if ((i10 & 32) != 0) {
            threadEmbedMessage = threadEmbed.referencedMessage;
        }
        return threadEmbed.copy(str, str2, str3, bool, str4, threadEmbedMessage);
    }

    public static final void write$Self(ThreadEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z13 = false;
        output.y(serialDesc, 0, self.title);
        output.y(serialDesc, 1, self.messageCountLabel);
        if (!output.z(serialDesc, 2) && self.messagePreviewString == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.E(serialDesc, 2, a2.f6238a, self.messagePreviewString);
        }
        if (!output.z(serialDesc, 3) && self.archived == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.E(serialDesc, 3, h.f6280a, self.archived);
        }
        if (!output.z(serialDesc, 4) && self.archivedIconUrl == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.E(serialDesc, 4, a2.f6238a, self.archivedIconUrl);
        }
        if (output.z(serialDesc, 5) || self.referencedMessage != null) {
            z13 = true;
        }
        if (z13) {
            output.E(serialDesc, 5, ThreadEmbedMessage$$serializer.INSTANCE, self.referencedMessage);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.messageCountLabel;
    }

    public final String component3() {
        return this.messagePreviewString;
    }

    public final Boolean component4() {
        return this.archived;
    }

    public final String component5() {
        return this.archivedIconUrl;
    }

    public final ThreadEmbedMessage component6() {
        return this.referencedMessage;
    }

    public final ThreadEmbed copy(String title, String messageCountLabel, String str, Boolean bool, String str2, ThreadEmbedMessage threadEmbedMessage) {
        q.h(title, "title");
        q.h(messageCountLabel, "messageCountLabel");
        return new ThreadEmbed(title, messageCountLabel, str, bool, str2, threadEmbedMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreadEmbed)) {
            return false;
        }
        ThreadEmbed threadEmbed = (ThreadEmbed) obj;
        return q.c(this.title, threadEmbed.title) && q.c(this.messageCountLabel, threadEmbed.messageCountLabel) && q.c(this.messagePreviewString, threadEmbed.messagePreviewString) && q.c(this.archived, threadEmbed.archived) && q.c(this.archivedIconUrl, threadEmbed.archivedIconUrl) && q.c(this.referencedMessage, threadEmbed.referencedMessage);
    }

    public final Boolean getArchived() {
        return this.archived;
    }

    public final String getArchivedIconUrl() {
        return this.archivedIconUrl;
    }

    public final String getMessageCountLabel() {
        return this.messageCountLabel;
    }

    public final String getMessagePreviewString() {
        return this.messagePreviewString;
    }

    public final ThreadEmbedMessage getReferencedMessage() {
        return this.referencedMessage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.messageCountLabel.hashCode()) * 31;
        String str = this.messagePreviewString;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.archived;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.archivedIconUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThreadEmbedMessage threadEmbedMessage = this.referencedMessage;
        if (threadEmbedMessage != null) {
            i10 = threadEmbedMessage.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.messageCountLabel;
        String str3 = this.messagePreviewString;
        Boolean bool = this.archived;
        String str4 = this.archivedIconUrl;
        ThreadEmbedMessage threadEmbedMessage = this.referencedMessage;
        return "ThreadEmbed(title=" + str + ", messageCountLabel=" + str2 + ", messagePreviewString=" + str3 + ", archived=" + bool + ", archivedIconUrl=" + str4 + ", referencedMessage=" + threadEmbedMessage + ")";
    }

    public ThreadEmbed(String title, String messageCountLabel, String str, Boolean bool, String str2, ThreadEmbedMessage threadEmbedMessage) {
        q.h(title, "title");
        q.h(messageCountLabel, "messageCountLabel");
        this.title = title;
        this.messageCountLabel = messageCountLabel;
        this.messagePreviewString = str;
        this.archived = bool;
        this.archivedIconUrl = str2;
        this.referencedMessage = threadEmbedMessage;
    }

    public  ThreadEmbed(String str, String str2, String str3, Boolean bool, String str4, ThreadEmbedMessage threadEmbedMessage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : threadEmbedMessage);
    }
}
