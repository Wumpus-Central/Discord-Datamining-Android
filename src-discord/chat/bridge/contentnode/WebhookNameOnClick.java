package com.discord.chat.bridge.contentnode;

import cj.n1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import zi.f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;", "", "seen1", "", "action", "", "messageReference", "Lcom/discord/chat/bridge/contentnode/MessageReference;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/contentnode/MessageReference;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/MessageReference;)V", "getAction", "()Ljava/lang/String;", "getMessageReference", "()Lcom/discord/chat/bridge/contentnode/MessageReference;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class WebhookNameOnClick {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final MessageReference messageReference;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WebhookNameOnClick> serializer() {
            return WebhookNameOnClick$$serializer.INSTANCE;
        }
    }

    public  WebhookNameOnClick(int i10, String str, MessageReference messageReference, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, WebhookNameOnClick$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
        if ((i10 & 2) == 0) {
            this.messageReference = null;
        } else {
            this.messageReference = messageReference;
        }
    }

    public static  WebhookNameOnClick copy$default(WebhookNameOnClick webhookNameOnClick, String str, MessageReference messageReference, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webhookNameOnClick.action;
        }
        if ((i10 & 2) != 0) {
            messageReference = webhookNameOnClick.messageReference;
        }
        return webhookNameOnClick.copy(str, messageReference);
    }

    public static final void write$Self(WebhookNameOnClick self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z10 = false;
        output.y(serialDesc, 0, self.action);
        if (output.z(serialDesc, 1) || self.messageReference != null) {
            z10 = true;
        }
        if (z10) {
            output.E(serialDesc, 1, MessageReference$$serializer.INSTANCE, self.messageReference);
        }
    }

    public final String component1() {
        return this.action;
    }

    public final MessageReference component2() {
        return this.messageReference;
    }

    public final WebhookNameOnClick copy(String action, MessageReference messageReference) {
        q.h(action, "action");
        return new WebhookNameOnClick(action, messageReference);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebhookNameOnClick)) {
            return false;
        }
        WebhookNameOnClick webhookNameOnClick = (WebhookNameOnClick) obj;
        return q.c(this.action, webhookNameOnClick.action) && q.c(this.messageReference, webhookNameOnClick.messageReference);
    }

    public final String getAction() {
        return this.action;
    }

    public final MessageReference getMessageReference() {
        return this.messageReference;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        MessageReference messageReference = this.messageReference;
        return hashCode + (messageReference == null ? 0 : messageReference.hashCode());
    }

    public String toString() {
        String str = this.action;
        MessageReference messageReference = this.messageReference;
        return "WebhookNameOnClick(action=" + str + ", messageReference=" + messageReference + ")";
    }

    public WebhookNameOnClick(String action, MessageReference messageReference) {
        q.h(action, "action");
        this.action = action;
        this.messageReference = messageReference;
    }

    public  WebhookNameOnClick(String str, MessageReference messageReference, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : messageReference);
    }
}
