package com.discord.chat.input.bridge;

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
import ti.f0;
import ti.h;
import ti.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/input/bridge/ChatInputNode.$serializer", "Lti/f0;", "Lcom/discord/chat/input/bridge/ChatInputNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_input_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class ChatInputNode$$serializer implements f0<ChatInputNode> {
    public static final ChatInputNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChatInputNode$$serializer chatInputNode$$serializer = new ChatInputNode$$serializer();
        INSTANCE = chatInputNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.bridge.ChatInputNode", chatInputNode$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("type", false);
        pluginGeneratedSerialDescriptor.l("location", false);
        pluginGeneratedSerialDescriptor.l("length", false);
        pluginGeneratedSerialDescriptor.l("style", true);
        pluginGeneratedSerialDescriptor.l("deleteNodeOnBackspace", true);
        pluginGeneratedSerialDescriptor.l("tapAction", true);
        pluginGeneratedSerialDescriptor.l("editDisabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChatInputNode$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f27014a;
        h hVar = h.f26981a;
        return new KSerializer[]{m0Var, m0Var, m0Var, a.u(ChatInputNodeStyle$$serializer.INSTANCE), hVar, a.u(TapAction$$serializer.INSTANCE), hVar};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChatInputNode deserialize(Decoder decoder) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            i12 = c10.k(descriptor2, 0);
            i11 = c10.k(descriptor2, 1);
            i10 = c10.k(descriptor2, 2);
            obj = c10.v(descriptor2, 3, ChatInputNodeStyle$$serializer.INSTANCE, null);
            z11 = c10.s(descriptor2, 4);
            obj2 = c10.v(descriptor2, 5, TapAction$$serializer.INSTANCE, null);
            z10 = c10.s(descriptor2, 6);
            i13 = 127;
        } else {
            boolean z12 = true;
            int i14 = 0;
            boolean z13 = false;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            Object obj3 = null;
            Object obj4 = null;
            boolean z14 = false;
            while (z12) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        i14 = c10.k(descriptor2, 0);
                        i17 |= 1;
                        continue;
                    case 1:
                        i16 = c10.k(descriptor2, 1);
                        i17 |= 2;
                        continue;
                    case 2:
                        i15 = c10.k(descriptor2, 2);
                        i17 |= 4;
                        break;
                    case 3:
                        obj3 = c10.v(descriptor2, 3, ChatInputNodeStyle$$serializer.INSTANCE, obj3);
                        i17 |= 8;
                        break;
                    case 4:
                        z13 = c10.s(descriptor2, 4);
                        i17 |= 16;
                        break;
                    case 5:
                        obj4 = c10.v(descriptor2, 5, TapAction$$serializer.INSTANCE, obj4);
                        i17 |= 32;
                        break;
                    case 6:
                        z14 = c10.s(descriptor2, 6);
                        i17 |= 64;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            obj2 = obj4;
            z10 = z14;
            i13 = i17;
            obj = obj3;
            z11 = z13;
            i12 = i14;
            i10 = i15;
            i11 = i16;
        }
        c10.b(descriptor2);
        return new ChatInputNode(i13, i12, i11, i10, (ChatInputNodeStyle) obj, z11, (TapAction) obj2, z10, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ChatInputNode value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        ChatInputNode.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
