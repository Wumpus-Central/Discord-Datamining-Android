package com.discord.chat.bridge;

import aj.e;
import aj.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nf.n;
import nf.p;
import yi.f;

@f(with = Serializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/discord/chat/bridge/MessageState;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Sent", "Sending", "SendFailed", "Unknown", "Companion", "Serializer", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum MessageState {
    Sent("SENT"),
    Sending("SENDING"),
    SendFailed("SEND_FAILED"),
    Unknown("UNKNOWN");
    
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final String key;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, d2 = {"Lcom/discord/chat/bridge/MessageState$Companion;", "", "()V", "fromValue", "Lcom/discord/chat/bridge/MessageState;", "key", "", "serializer", "Lkotlinx/serialization/KSerializer;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return MessageState.$cachedSerializer$delegate;
        }

        public final MessageState fromValue(String key) {
            MessageState messageState;
            q.g(key, "key");
            MessageState[] values = MessageState.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    messageState = null;
                    break;
                }
                messageState = values[i10];
                if (q.b(messageState.getKey(), key)) {
                    break;
                }
                i10++;
            }
            if (messageState == null) {
                return MessageState.Unknown;
            }
            return messageState;
        }

        public final KSerializer<MessageState> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/bridge/MessageState$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/MessageState;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Serializer implements KSerializer<MessageState> {
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
        }

        @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return g.a("MessageState", e.i.f471a);
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public MessageState deserialize(Decoder decoder) {
            q.g(decoder, "decoder");
            return MessageState.Companion.fromValue(decoder.z());
        }

        public void serialize(Encoder encoder, MessageState value) {
            q.g(encoder, "encoder");
            q.g(value, "value");
            throw new UnsupportedOperationException();
        }
    }

    static {
        Lazy<KSerializer<Object>> b10;
        b10 = n.b(p.PUBLICATION, MessageState$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = b10;
    }

    MessageState(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}