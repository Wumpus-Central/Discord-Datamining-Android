package com.discord.chat.bridge.contentnode;

import bj.n1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/discord/chat/bridge/contentnode/HandleDelete;", "", "seen1", "", "action", "", "message", "Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;)V", "getAction", "()Ljava/lang/String;", "getMessage", "()Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HandleDelete {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final HandleDeleteMessage message;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/HandleDelete$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/HandleDelete;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HandleDelete> serializer() {
            return HandleDelete$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HandleDelete(int i10, String str, HandleDeleteMessage handleDeleteMessage, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, HandleDelete$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
        this.message = handleDeleteMessage;
    }

    public static /* synthetic */ HandleDelete copy$default(HandleDelete handleDelete, String str, HandleDeleteMessage handleDeleteMessage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = handleDelete.action;
        }
        if ((i10 & 2) != 0) {
            handleDeleteMessage = handleDelete.message;
        }
        return handleDelete.copy(str, handleDeleteMessage);
    }

    public static final void write$Self(HandleDelete self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.z(serialDesc, 0, self.action);
        output.t(serialDesc, 1, HandleDeleteMessage$$serializer.INSTANCE, self.message);
    }

    public final String component1() {
        return this.action;
    }

    public final HandleDeleteMessage component2() {
        return this.message;
    }

    public final HandleDelete copy(String action, HandleDeleteMessage message) {
        q.g(action, "action");
        q.g(message, "message");
        return new HandleDelete(action, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandleDelete)) {
            return false;
        }
        HandleDelete handleDelete = (HandleDelete) obj;
        return q.b(this.action, handleDelete.action) && q.b(this.message, handleDelete.message);
    }

    public final String getAction() {
        return this.action;
    }

    public final HandleDeleteMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        String str = this.action;
        HandleDeleteMessage handleDeleteMessage = this.message;
        return "HandleDelete(action=" + str + ", message=" + handleDeleteMessage + ")";
    }

    public HandleDelete(String action, HandleDeleteMessage message) {
        q.g(action, "action");
        q.g(message, "message");
        this.action = action;
        this.message = message;
    }
}
