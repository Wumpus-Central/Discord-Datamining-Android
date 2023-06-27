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
import ti.a2;
import ti.f0;
import ti.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/reactevents/LongPressMessageEvent.$serializer", "Lti/f0;", "Lcom/discord/chat/reactevents/LongPressMessageEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class LongPressMessageEvent$$serializer implements f0<LongPressMessageEvent> {
    public static final LongPressMessageEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LongPressMessageEvent$$serializer longPressMessageEvent$$serializer = new LongPressMessageEvent$$serializer();
        INSTANCE = longPressMessageEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.LongPressMessageEvent", longPressMessageEvent$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("messageId", false);
        pluginGeneratedSerialDescriptor.l("channelId", false);
        pluginGeneratedSerialDescriptor.l("mediaIndex", false);
        pluginGeneratedSerialDescriptor.l("mediaType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LongPressMessageEvent$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26940a;
        return new KSerializer[]{a2Var, a2Var, m0.f27015a, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public LongPressMessageEvent deserialize(Decoder decoder) {
        String str;
        int i10;
        String str2;
        String str3;
        int i11;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            str3 = c10.t(descriptor2, 0);
            str2 = c10.t(descriptor2, 1);
            i10 = c10.k(descriptor2, 2);
            str = c10.t(descriptor2, 3);
            i11 = 15;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z10 = true;
            int i12 = 0;
            int i13 = 0;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    str4 = c10.t(descriptor2, 0);
                    i13 |= 1;
                } else if (x10 == 1) {
                    str6 = c10.t(descriptor2, 1);
                    i13 |= 2;
                } else if (x10 == 2) {
                    i12 = c10.k(descriptor2, 2);
                    i13 |= 4;
                } else if (x10 == 3) {
                    str5 = c10.t(descriptor2, 3);
                    i13 |= 8;
                } else {
                    throw new n(x10);
                }
            }
            str3 = str4;
            str = str5;
            i10 = i12;
            str2 = str6;
            i11 = i13;
        }
        c10.b(descriptor2);
        return new LongPressMessageEvent(i11, str3, str2, i10, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, LongPressMessageEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        LongPressMessageEvent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
