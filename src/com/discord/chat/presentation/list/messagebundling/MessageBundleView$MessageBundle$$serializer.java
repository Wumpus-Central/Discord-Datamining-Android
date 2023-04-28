package com.discord.chat.presentation.list.messagebundling;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3640e0;
import bj.C3643f;
import com.discord.chat.bridge.row.MessageRow$$serializer;
import com.discord.chat.presentation.list.messagebundling.MessageBundleView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView$MessageBundleHeader$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.C14447n;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/presentation/list/messagebundling/MessageBundleView.MessageBundle.$serializer", "Lbj/f0;", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView$MessageBundle;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageBundleView$MessageBundle$$serializer implements AbstractC3644f0<MessageBundleView.MessageBundle> {
    public static final MessageBundleView$MessageBundle$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageBundleView$MessageBundle$$serializer messageBundleView$MessageBundle$$serializer = new MessageBundleView$MessageBundle$$serializer();
        INSTANCE = messageBundleView$MessageBundle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle", messageBundleView$MessageBundle$$serializer, 5);
        pluginGeneratedSerialDescriptor.m13841l("messageFrame", true);
        pluginGeneratedSerialDescriptor.m13841l("rows", false);
        pluginGeneratedSerialDescriptor.m13841l("truncationThreshold", true);
        pluginGeneratedSerialDescriptor.m13841l("referenceMessageRows", true);
        pluginGeneratedSerialDescriptor.m13841l("viewMoreText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageBundleView$MessageBundle$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        MessageRow$$serializer messageRow$$serializer = MessageRow$$serializer.INSTANCE;
        return new KSerializer[]{C14667a.m13u(MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE), new C3643f(messageRow$$serializer), C14667a.m13u(C3640e0.f5942a), new C3643f(messageRow$$serializer), C14667a.m13u(C3622a2.f5917a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageBundleView.MessageBundle deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        Object obj6 = null;
        if (b.mo13850p()) {
            obj5 = b.mo13852n(descriptor2, 0, MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE, null);
            MessageRow$$serializer messageRow$$serializer = MessageRow$$serializer.INSTANCE;
            obj = b.mo13847y(descriptor2, 1, new C3643f(messageRow$$serializer), null);
            obj2 = b.mo13852n(descriptor2, 2, C3640e0.f5942a, null);
            obj4 = b.mo13847y(descriptor2, 3, new C3643f(messageRow$$serializer), null);
            obj3 = b.mo13852n(descriptor2, 4, C3622a2.f5917a, null);
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    obj6 = b.mo13852n(descriptor2, 0, MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE, obj6);
                    i2 |= 1;
                } else if (o == 1) {
                    obj7 = b.mo13847y(descriptor2, 1, new C3643f(MessageRow$$serializer.INSTANCE), obj7);
                    i2 |= 2;
                } else if (o == 2) {
                    obj8 = b.mo13852n(descriptor2, 2, C3640e0.f5942a, obj8);
                    i2 |= 4;
                } else if (o == 3) {
                    obj9 = b.mo13847y(descriptor2, 3, new C3643f(MessageRow$$serializer.INSTANCE), obj9);
                    i2 |= 8;
                } else if (o == 4) {
                    obj10 = b.mo13852n(descriptor2, 4, C3622a2.f5917a, obj10);
                    i2 |= 16;
                } else {
                    throw new C14447n(o);
                }
            }
            obj = obj7;
            obj2 = obj8;
            obj4 = obj9;
            obj3 = obj10;
            i = i2;
            obj5 = obj6;
        }
        b.mo13857c(descriptor2);
        return new MessageBundleView.MessageBundle(i, (MessageFrameFeedHeaderView.MessageBundleHeader) obj5, (List) obj, (Float) obj2, (List) obj4, (String) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MessageBundleView.MessageBundle value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        MessageBundleView.MessageBundle.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
