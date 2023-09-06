package com.discord.chat.presentation.list.messagebundling;

import com.discord.chat.bridge.row.MessageRow$$serializer;
import com.discord.chat.presentation.list.messagebundling.MessageBundleView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView$MessageBundleHeader$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.n;
import vi.a;
import xi.a2;
import xi.e0;
import xi.f;
import xi.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/presentation/list/messagebundling/MessageBundleView.MessageBundle.$serializer", "Lxi/f0;", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView$MessageBundle;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageBundleView$MessageBundle$$serializer implements f0<MessageBundleView.MessageBundle> {
    public static final MessageBundleView$MessageBundle$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageBundleView$MessageBundle$$serializer messageBundleView$MessageBundle$$serializer = new MessageBundleView$MessageBundle$$serializer();
        INSTANCE = messageBundleView$MessageBundle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle", messageBundleView$MessageBundle$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("messageFrame", true);
        pluginGeneratedSerialDescriptor.l("rows", false);
        pluginGeneratedSerialDescriptor.l("truncationThreshold", true);
        pluginGeneratedSerialDescriptor.l("referenceMessageRows", true);
        pluginGeneratedSerialDescriptor.l("viewMoreText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageBundleView$MessageBundle$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        MessageRow$$serializer messageRow$$serializer = MessageRow$$serializer.INSTANCE;
        return new KSerializer[]{a.u(MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE), new f(messageRow$$serializer), a.u(e0.f30593a), new f(messageRow$$serializer), a.u(a2.f30568a)};
    }

    @Override 
    public MessageBundleView.MessageBundle deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        Object obj6 = null;
        if (b10.p()) {
            obj5 = b10.n(descriptor2, 0, MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE, null);
            MessageRow$$serializer messageRow$$serializer = MessageRow$$serializer.INSTANCE;
            obj = b10.y(descriptor2, 1, new f(messageRow$$serializer), null);
            obj2 = b10.n(descriptor2, 2, e0.f30593a, null);
            obj4 = b10.y(descriptor2, 3, new f(messageRow$$serializer), null);
            obj3 = b10.n(descriptor2, 4, a2.f30568a, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj6 = b10.n(descriptor2, 0, MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE, obj6);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj7 = b10.y(descriptor2, 1, new f(MessageRow$$serializer.INSTANCE), obj7);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj8 = b10.n(descriptor2, 2, e0.f30593a, obj8);
                    i11 |= 4;
                } else if (o10 == 3) {
                    obj9 = b10.y(descriptor2, 3, new f(MessageRow$$serializer.INSTANCE), obj9);
                    i11 |= 8;
                } else if (o10 == 4) {
                    obj10 = b10.n(descriptor2, 4, a2.f30568a, obj10);
                    i11 |= 16;
                } else {
                    throw new n(o10);
                }
            }
            obj = obj7;
            obj2 = obj8;
            obj4 = obj9;
            obj3 = obj10;
            i10 = i11;
            obj5 = obj6;
        }
        b10.c(descriptor2);
        return new MessageBundleView.MessageBundle(i10, (MessageFrameFeedHeaderView.MessageBundleHeader) obj5, (List) obj, (Float) obj2, (List) obj4, (String) obj3, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MessageBundleView.MessageBundle value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        MessageBundleView.MessageBundle.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
