package com.discord.chat.bridge.referencedmessage;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.Message$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ti.a2;
import ti.n1;

@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "seen1", "", "message", "Lcom/discord/chat/bridge/Message;", "systemContent", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/Message;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/Message;Ljava/lang/String;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getSystemContent", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LoadedReferencedMessage extends ReferencedMessage {
    public static final Companion Companion = new Companion(null);
    private final Message message;
    private final String systemContent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoadedReferencedMessage> serializer() {
            return LoadedReferencedMessage$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadedReferencedMessage(int i10, Message message, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, LoadedReferencedMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.message = message;
        if ((i10 & 2) == 0) {
            this.systemContent = null;
        } else {
            this.systemContent = str;
        }
    }

    public static /* synthetic */ LoadedReferencedMessage copy$default(LoadedReferencedMessage loadedReferencedMessage, Message message, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            message = loadedReferencedMessage.message;
        }
        if ((i10 & 2) != 0) {
            str = loadedReferencedMessage.systemContent;
        }
        return loadedReferencedMessage.copy(message, str);
    }

    public static final void write$Self(LoadedReferencedMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z10 = false;
        output.C(serialDesc, 0, Message$$serializer.INSTANCE, self.message);
        if (output.w(serialDesc, 1) || self.systemContent != null) {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 1, a2.f26939a, self.systemContent);
        }
    }

    public final Message component1() {
        return this.message;
    }

    public final String component2() {
        return this.systemContent;
    }

    public final LoadedReferencedMessage copy(Message message, String str) {
        q.g(message, "message");
        return new LoadedReferencedMessage(message, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadedReferencedMessage)) {
            return false;
        }
        LoadedReferencedMessage loadedReferencedMessage = (LoadedReferencedMessage) obj;
        return q.b(this.message, loadedReferencedMessage.message) && q.b(this.systemContent, loadedReferencedMessage.systemContent);
    }

    public final Message getMessage() {
        return this.message;
    }

    public final String getSystemContent() {
        return this.systemContent;
    }

    public int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        String str = this.systemContent;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        Message message = this.message;
        String str = this.systemContent;
        return "LoadedReferencedMessage(message=" + message + ", systemContent=" + str + ")";
    }

    public /* synthetic */ LoadedReferencedMessage(Message message, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(message, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadedReferencedMessage(Message message, String str) {
        super(null);
        q.g(message, "message");
        this.message = message;
        this.systemContent = str;
    }
}
