package com.discord.chat.input.events;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import vj.n;
import yj.f0;
import yj.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/input/events/OnContentSizeChangeEvent.$serializer", "Lyj/f0;", "Lcom/discord/chat/input/events/OnContentSizeChangeEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_input_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class OnContentSizeChangeEvent$$serializer implements f0<OnContentSizeChangeEvent> {
    public static final OnContentSizeChangeEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OnContentSizeChangeEvent$$serializer onContentSizeChangeEvent$$serializer = new OnContentSizeChangeEvent$$serializer();
        INSTANCE = onContentSizeChangeEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.events.OnContentSizeChangeEvent", onContentSizeChangeEvent$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("width", false);
        pluginGeneratedSerialDescriptor.l("height", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnContentSizeChangeEvent$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f32999a;
        return new KSerializer[]{m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public OnContentSizeChangeEvent deserialize(Decoder decoder) {
        int i10;
        int i11;
        int i12;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i12 = b10.i(descriptor2, 0);
            i11 = b10.i(descriptor2, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    i12 = b10.i(descriptor2, 0);
                    i14 |= 1;
                } else if (o10 == 1) {
                    i13 = b10.i(descriptor2, 1);
                    i14 |= 2;
                } else {
                    throw new n(o10);
                }
            }
            i11 = i13;
            i10 = i14;
        }
        b10.c(descriptor2);
        return new OnContentSizeChangeEvent(i10, i12, i11, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OnContentSizeChangeEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        OnContentSizeChangeEvent.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
