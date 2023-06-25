package com.discord.chat.reactevents;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import qi.n;
import ti.f0;
import ti.h;
import ti.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/reactevents/ChatScrollPositionEvent.$serializer", "Lti/f0;", "Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class ChatScrollPositionEvent$$serializer implements f0<ChatScrollPositionEvent> {
    public static final ChatScrollPositionEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChatScrollPositionEvent$$serializer chatScrollPositionEvent$$serializer = new ChatScrollPositionEvent$$serializer();
        INSTANCE = chatScrollPositionEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.ChatScrollPositionEvent", chatScrollPositionEvent$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("isAtBottom", false);
        pluginGeneratedSerialDescriptor.l("isNearBottom", false);
        pluginGeneratedSerialDescriptor.l("isNearTop", false);
        pluginGeneratedSerialDescriptor.l("dragging", false);
        pluginGeneratedSerialDescriptor.l("decelerating", false);
        pluginGeneratedSerialDescriptor.l("shouldShowJumpToPresent", false);
        pluginGeneratedSerialDescriptor.l("isFirstMessageVisible", false);
        pluginGeneratedSerialDescriptor.l("firstVisibleMessageIndex", false);
        pluginGeneratedSerialDescriptor.l("lastVisibleMessageIndex", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChatScrollPositionEvent$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        h hVar = h.f26981a;
        m0 m0Var = m0.f27014a;
        return new KSerializer[]{hVar, hVar, hVar, hVar, hVar, hVar, hVar, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChatScrollPositionEvent deserialize(Decoder decoder) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i12;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i13 = 0;
        if (c10.y()) {
            z16 = c10.s(descriptor2, 0);
            z15 = c10.s(descriptor2, 1);
            z14 = c10.s(descriptor2, 2);
            z13 = c10.s(descriptor2, 3);
            z12 = c10.s(descriptor2, 4);
            z11 = c10.s(descriptor2, 5);
            z10 = c10.s(descriptor2, 6);
            i11 = c10.k(descriptor2, 7);
            i10 = c10.k(descriptor2, 8);
            i12 = 511;
        } else {
            boolean z17 = true;
            boolean z18 = false;
            int i14 = 0;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            int i15 = 0;
            z12 = false;
            boolean z22 = false;
            boolean z23 = false;
            while (z17) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z17 = false;
                        break;
                    case 0:
                        z18 = c10.s(descriptor2, 0);
                        i13 |= 1;
                        continue;
                    case 1:
                        z23 = c10.s(descriptor2, 1);
                        i13 |= 2;
                        continue;
                    case 2:
                        z22 = c10.s(descriptor2, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        z21 = c10.s(descriptor2, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        z12 = c10.s(descriptor2, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        z20 = c10.s(descriptor2, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        z19 = c10.s(descriptor2, 6);
                        i13 |= 64;
                        break;
                    case 7:
                        i14 = c10.k(descriptor2, 7);
                        i13 |= 128;
                        break;
                    case 8:
                        i15 = c10.k(descriptor2, 8);
                        i13 |= 256;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            i11 = i14;
            i10 = i15;
            i12 = i13;
            z13 = z21;
            z14 = z22;
            z11 = z20;
            z15 = z23;
            z10 = z19;
            z16 = z18;
        }
        c10.b(descriptor2);
        return new ChatScrollPositionEvent(i12, z16, z15, z14, z13, z12, z11, z10, i11, i10, null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ChatScrollPositionEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        ChatScrollPositionEvent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
