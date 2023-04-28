package com.discord.chat.input.bridge;

import bj.AbstractC3644f0;
import bj.C3652h;
import bj.C3676m0;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/input/bridge/ChatInputNode.$serializer", "Lbj/f0;", "Lcom/discord/chat/input/bridge/ChatInputNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ChatInputNode$$serializer implements AbstractC3644f0<ChatInputNode> {
    public static final ChatInputNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChatInputNode$$serializer chatInputNode$$serializer = new ChatInputNode$$serializer();
        INSTANCE = chatInputNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.bridge.ChatInputNode", chatInputNode$$serializer, 7);
        pluginGeneratedSerialDescriptor.m13841l("type", false);
        pluginGeneratedSerialDescriptor.m13841l("location", false);
        pluginGeneratedSerialDescriptor.m13841l("length", false);
        pluginGeneratedSerialDescriptor.m13841l("style", true);
        pluginGeneratedSerialDescriptor.m13841l("deleteNodeOnBackspace", true);
        pluginGeneratedSerialDescriptor.m13841l("tapAction", true);
        pluginGeneratedSerialDescriptor.m13841l("editDisabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChatInputNode$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3676m0 m0Var = C3676m0.f5992a;
        C3652h hVar = C3652h.f5959a;
        return new KSerializer[]{m0Var, m0Var, m0Var, C14667a.m13u(ChatInputNodeStyle$$serializer.INSTANCE), hVar, C14667a.m13u(TapAction$$serializer.INSTANCE), hVar};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChatInputNode deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        Object obj;
        Object obj2;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            i3 = b.mo13855i(descriptor2, 0);
            i2 = b.mo13855i(descriptor2, 1);
            i = b.mo13855i(descriptor2, 2);
            obj = b.mo13852n(descriptor2, 3, ChatInputNodeStyle$$serializer.INSTANCE, null);
            z2 = b.mo13861C(descriptor2, 4);
            obj2 = b.mo13852n(descriptor2, 5, TapAction$$serializer.INSTANCE, null);
            z = b.mo13861C(descriptor2, 6);
            i4 = 127;
        } else {
            boolean z3 = true;
            int i5 = 0;
            boolean z4 = false;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            Object obj3 = null;
            Object obj4 = null;
            boolean z5 = false;
            while (z3) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z3 = false;
                        break;
                    case 0:
                        i5 = b.mo13855i(descriptor2, 0);
                        i8 |= 1;
                        continue;
                    case 1:
                        i7 = b.mo13855i(descriptor2, 1);
                        i8 |= 2;
                        continue;
                    case 2:
                        i6 = b.mo13855i(descriptor2, 2);
                        i8 |= 4;
                        break;
                    case 3:
                        obj3 = b.mo13852n(descriptor2, 3, ChatInputNodeStyle$$serializer.INSTANCE, obj3);
                        i8 |= 8;
                        break;
                    case 4:
                        z4 = b.mo13861C(descriptor2, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        obj4 = b.mo13852n(descriptor2, 5, TapAction$$serializer.INSTANCE, obj4);
                        i8 |= 32;
                        break;
                    case 6:
                        z5 = b.mo13861C(descriptor2, 6);
                        i8 |= 64;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            obj2 = obj4;
            z = z5;
            i4 = i8;
            obj = obj3;
            z2 = z4;
            i3 = i5;
            i = i6;
            i2 = i7;
        }
        b.mo13857c(descriptor2);
        return new ChatInputNode(i4, i3, i2, i, (ChatInputNodeStyle) obj, z2, (TapAction) obj2, z, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ChatInputNode value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ChatInputNode.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
