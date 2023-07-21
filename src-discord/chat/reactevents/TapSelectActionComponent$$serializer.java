package com.discord.chat.reactevents;

import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import pi.n;
import si.f0;
import si.w0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/reactevents/TapSelectActionComponent.$serializer", "Lsi/f0;", "Lcom/discord/chat/reactevents/TapSelectActionComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class TapSelectActionComponent$$serializer implements f0<TapSelectActionComponent> {
    public static final TapSelectActionComponent$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        TapSelectActionComponent$$serializer tapSelectActionComponent$$serializer = new TapSelectActionComponent$$serializer();
        INSTANCE = tapSelectActionComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapSelectActionComponent", tapSelectActionComponent$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("messageId", false);
        pluginGeneratedSerialDescriptor.l("messageFlags", false);
        pluginGeneratedSerialDescriptor.l("selectionActionComponent", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TapSelectActionComponent$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MessageId$$serializer.INSTANCE, w0.f26347a, SelectComponent.Companion.serializer()};
    }

    @Override 
    public TapSelectActionComponent deserialize(Decoder decoder) {
        long j10;
        int i10;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        String str = null;
        if (c10.y()) {
            obj2 = c10.m(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            j10 = c10.h(descriptor2, 1);
            obj = c10.m(descriptor2, 2, SelectComponent.Companion.serializer(), null);
            i10 = 7;
        } else {
            long j11 = 0;
            boolean z10 = true;
            int i11 = 0;
            obj2 = null;
            Object obj3 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    obj2 = c10.m(descriptor2, 0, MessageId$$serializer.INSTANCE, obj2);
                    i11 |= 1;
                } else if (x10 == 1) {
                    j11 = c10.h(descriptor2, 1);
                    i11 |= 2;
                } else if (x10 == 2) {
                    obj3 = c10.m(descriptor2, 2, SelectComponent.Companion.serializer(), obj3);
                    i11 |= 4;
                } else {
                    throw new n(x10);
                }
            }
            obj = obj3;
            i10 = i11;
            j10 = j11;
        }
        c10.b(descriptor2);
        MessageId messageId = (MessageId) obj2;
        if (messageId != null) {
            str = messageId.m598unboximpl();
        }
        return new TapSelectActionComponent(i10, str, j10, (SelectComponent) obj, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TapSelectActionComponent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        TapSelectActionComponent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
