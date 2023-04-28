package com.discord.media.engine.video.events;

import bj.AbstractC2522f0;
import bj.C2500a2;
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
import p450yi.C14382n;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/media/engine/video/events/PingTimeoutCallbackEvent.$serializer", "Lbj/f0;", "Lcom/discord/media/engine/video/events/PingTimeoutCallbackEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PingTimeoutCallbackEvent$$serializer implements AbstractC2522f0<PingTimeoutCallbackEvent> {
    public static final PingTimeoutCallbackEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PingTimeoutCallbackEvent$$serializer pingTimeoutCallbackEvent$$serializer = new PingTimeoutCallbackEvent$$serializer();
        INSTANCE = pingTimeoutCallbackEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.PingTimeoutCallbackEvent", pingTimeoutCallbackEvent$$serializer, 5);
        pluginGeneratedSerialDescriptor.m13841l("connectionId", false);
        pluginGeneratedSerialDescriptor.m13841l("server", false);
        pluginGeneratedSerialDescriptor.m13841l("port", false);
        pluginGeneratedSerialDescriptor.m13841l("seq", false);
        pluginGeneratedSerialDescriptor.m13841l("timeout", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PingTimeoutCallbackEvent$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2555m0 m0Var = C2555m0.f6794a;
        return new KSerializer[]{m0Var, C2500a2.f6719a, m0Var, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PingTimeoutCallbackEvent deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            i4 = b.mo13855i(descriptor2, 0);
            str = b.mo13853m(descriptor2, 1);
            i3 = b.mo13855i(descriptor2, 2);
            i2 = b.mo13855i(descriptor2, 3);
            i = b.mo13855i(descriptor2, 4);
            i5 = 31;
        } else {
            String str2 = null;
            boolean z = true;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i6 = b.mo13855i(descriptor2, 0);
                    i10 |= 1;
                } else if (o == 1) {
                    str2 = b.mo13853m(descriptor2, 1);
                    i10 |= 2;
                } else if (o == 2) {
                    i9 = b.mo13855i(descriptor2, 2);
                    i10 |= 4;
                } else if (o == 3) {
                    i7 = b.mo13855i(descriptor2, 3);
                    i10 |= 8;
                } else if (o == 4) {
                    i8 = b.mo13855i(descriptor2, 4);
                    i10 |= 16;
                } else {
                    throw new C14382n(o);
                }
            }
            i4 = i6;
            i2 = i7;
            i = i8;
            i3 = i9;
            str = str2;
            i5 = i10;
        }
        b.mo13857c(descriptor2);
        return new PingTimeoutCallbackEvent(i5, i4, str, i3, i2, i, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PingTimeoutCallbackEvent value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        PingTimeoutCallbackEvent.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
