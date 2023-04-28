package com.discord.chat.reactevents;

import bj.AbstractC2522f0;
import bj.C2530h;
import bj.C2555m0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p164j$.util.Spliterator;
import p450yi.C14382n;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/reactevents/ChatScrollPositionEvent.$serializer", "Lbj/f0;", "Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ChatScrollPositionEvent$$serializer implements AbstractC2522f0<ChatScrollPositionEvent> {
    public static final ChatScrollPositionEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChatScrollPositionEvent$$serializer chatScrollPositionEvent$$serializer = new ChatScrollPositionEvent$$serializer();
        INSTANCE = chatScrollPositionEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.ChatScrollPositionEvent", chatScrollPositionEvent$$serializer, 9);
        pluginGeneratedSerialDescriptor.m13841l("isAtBottom", false);
        pluginGeneratedSerialDescriptor.m13841l("isNearBottom", false);
        pluginGeneratedSerialDescriptor.m13841l("isNearTop", false);
        pluginGeneratedSerialDescriptor.m13841l("dragging", false);
        pluginGeneratedSerialDescriptor.m13841l("decelerating", false);
        pluginGeneratedSerialDescriptor.m13841l("shouldShowJumpToPresent", false);
        pluginGeneratedSerialDescriptor.m13841l("isFirstMessageVisible", false);
        pluginGeneratedSerialDescriptor.m13841l("firstVisibleMessageIndex", false);
        pluginGeneratedSerialDescriptor.m13841l("lastVisibleMessageIndex", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChatScrollPositionEvent$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2530h hVar = C2530h.f6761a;
        C2555m0 m0Var = C2555m0.f6794a;
        return new KSerializer[]{hVar, hVar, hVar, hVar, hVar, hVar, hVar, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChatScrollPositionEvent deserialize(Decoder decoder) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i4 = 0;
        if (b.mo13850p()) {
            z7 = b.mo13861C(descriptor2, 0);
            z6 = b.mo13861C(descriptor2, 1);
            z5 = b.mo13861C(descriptor2, 2);
            z4 = b.mo13861C(descriptor2, 3);
            z3 = b.mo13861C(descriptor2, 4);
            z2 = b.mo13861C(descriptor2, 5);
            z = b.mo13861C(descriptor2, 6);
            i2 = b.mo13855i(descriptor2, 7);
            i = b.mo13855i(descriptor2, 8);
            i3 = 511;
        } else {
            boolean z8 = true;
            boolean z9 = false;
            int i5 = 0;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int i6 = 0;
            z3 = false;
            boolean z13 = false;
            boolean z14 = false;
            while (z8) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z8 = false;
                        break;
                    case 0:
                        z9 = b.mo13861C(descriptor2, 0);
                        i4 |= 1;
                        continue;
                    case 1:
                        z14 = b.mo13861C(descriptor2, 1);
                        i4 |= 2;
                        continue;
                    case 2:
                        z13 = b.mo13861C(descriptor2, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        z12 = b.mo13861C(descriptor2, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        z3 = b.mo13861C(descriptor2, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        z11 = b.mo13861C(descriptor2, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        z10 = b.mo13861C(descriptor2, 6);
                        i4 |= 64;
                        break;
                    case 7:
                        i5 = b.mo13855i(descriptor2, 7);
                        i4 |= 128;
                        break;
                    case 8:
                        i6 = b.mo13855i(descriptor2, 8);
                        i4 |= Spliterator.NONNULL;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            i2 = i5;
            i = i6;
            i3 = i4;
            z4 = z12;
            z5 = z13;
            z2 = z11;
            z6 = z14;
            z = z10;
            z7 = z9;
        }
        b.mo13857c(descriptor2);
        return new ChatScrollPositionEvent(i3, z7, z6, z5, z4, z3, z2, z, i2, i, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ChatScrollPositionEvent value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ChatScrollPositionEvent.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
