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
import ti.n;
import wi.a2;
import wi.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/reactevents/TapDismissEmbeddedActivityData.$serializer", "Lwi/f0;", "Lcom/discord/chat/reactevents/TapDismissEmbeddedActivityData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class TapDismissEmbeddedActivityData$$serializer implements f0<TapDismissEmbeddedActivityData> {
    public static final TapDismissEmbeddedActivityData$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        TapDismissEmbeddedActivityData$$serializer tapDismissEmbeddedActivityData$$serializer = new TapDismissEmbeddedActivityData$$serializer();
        INSTANCE = tapDismissEmbeddedActivityData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapDismissEmbeddedActivityData", tapDismissEmbeddedActivityData$$serializer, 1);
        pluginGeneratedSerialDescriptor.l("embeddedActivityKey", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TapDismissEmbeddedActivityData$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a2.f29540a};
    }

    @Override 
    public TapDismissEmbeddedActivityData deserialize(Decoder decoder) {
        String str;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i10 = 1;
        if (c10.y()) {
            str = c10.t(descriptor2, 0);
        } else {
            int i11 = 0;
            str = null;
            while (i10 != 0) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    i10 = 0;
                } else if (x10 == 0) {
                    str = c10.t(descriptor2, 0);
                    i11 |= 1;
                } else {
                    throw new n(x10);
                }
            }
            i10 = i11;
        }
        c10.b(descriptor2);
        return new TapDismissEmbeddedActivityData(i10, str, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TapDismissEmbeddedActivityData value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        TapDismissEmbeddedActivityData.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
