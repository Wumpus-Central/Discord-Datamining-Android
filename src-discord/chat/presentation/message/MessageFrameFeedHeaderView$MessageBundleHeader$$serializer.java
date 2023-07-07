package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import java.util.ArrayList;
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
import qi.n;
import ri.a;
import ti.a2;
import ti.f;
import ti.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/presentation/message/MessageFrameFeedHeaderView.MessageBundleHeader.$serializer", "Lti/f0;", "Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MessageFrameFeedHeaderView$MessageBundleHeader$$serializer implements f0<MessageFrameFeedHeaderView.MessageBundleHeader> {
    public static final MessageFrameFeedHeaderView$MessageBundleHeader$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageFrameFeedHeaderView$MessageBundleHeader$$serializer messageFrameFeedHeaderView$MessageBundleHeader$$serializer = new MessageFrameFeedHeaderView$MessageBundleHeader$$serializer();
        INSTANCE = messageFrameFeedHeaderView$MessageBundleHeader$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader", messageFrameFeedHeaderView$MessageBundleHeader$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("channelIconURL", true);
        pluginGeneratedSerialDescriptor.l("chatIconURL", true);
        pluginGeneratedSerialDescriptor.l("avatarURLs", true);
        pluginGeneratedSerialDescriptor.l("channelName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageFrameFeedHeaderView$MessageBundleHeader$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26972a;
        return new KSerializer[]{a.u(a2Var), a.u(a2Var), a.u(new f(a2Var)), a.u(a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageFrameFeedHeaderView.MessageBundleHeader deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i10;
        Object obj4;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        Object obj5 = null;
        if (c10.y()) {
            a2 a2Var = a2.f26972a;
            obj2 = c10.v(descriptor2, 0, a2Var, null);
            obj3 = c10.v(descriptor2, 1, a2Var, null);
            obj = c10.v(descriptor2, 2, new f(a2Var), null);
            obj4 = c10.v(descriptor2, 3, a2Var, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj6 = null;
            obj = null;
            Object obj7 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    obj5 = c10.v(descriptor2, 0, a2.f26972a, obj5);
                    i11 |= 1;
                } else if (x10 == 1) {
                    obj6 = c10.v(descriptor2, 1, a2.f26972a, obj6);
                    i11 |= 2;
                } else if (x10 == 2) {
                    obj = c10.v(descriptor2, 2, new f(a2.f26972a), obj);
                    i11 |= 4;
                } else if (x10 == 3) {
                    obj7 = c10.v(descriptor2, 3, a2.f26972a, obj7);
                    i11 |= 8;
                } else {
                    throw new n(x10);
                }
            }
            i10 = i11;
            obj2 = obj5;
            obj3 = obj6;
            obj4 = obj7;
        }
        c10.b(descriptor2);
        return new MessageFrameFeedHeaderView.MessageBundleHeader(i10, (String) obj2, (String) obj3, (ArrayList) obj, (String) obj4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MessageFrameFeedHeaderView.MessageBundleHeader value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        MessageFrameFeedHeaderView.MessageBundleHeader.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
