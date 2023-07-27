package com.discord.safearea.react.events;

import com.facebook.react.uimanager.ViewProps;
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
import si.e0;
import si.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/safearea/react/events/OnSafeAreaInsetsDidChangeData.$serializer", "Lsi/f0;", "Lcom/discord/safearea/react/events/OnSafeAreaInsetsDidChangeData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "safe_area_release"}, k = 1, mv = {1, 8, 0})

public final class OnSafeAreaInsetsDidChangeData$$serializer implements f0<OnSafeAreaInsetsDidChangeData> {
    public static final OnSafeAreaInsetsDidChangeData$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        OnSafeAreaInsetsDidChangeData$$serializer onSafeAreaInsetsDidChangeData$$serializer = new OnSafeAreaInsetsDidChangeData$$serializer();
        INSTANCE = onSafeAreaInsetsDidChangeData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.safearea.react.events.OnSafeAreaInsetsDidChangeData", onSafeAreaInsetsDidChangeData$$serializer, 5);
        pluginGeneratedSerialDescriptor.l(ViewProps.TOP, false);
        pluginGeneratedSerialDescriptor.l(ViewProps.BOTTOM, false);
        pluginGeneratedSerialDescriptor.l(ViewProps.LEFT, false);
        pluginGeneratedSerialDescriptor.l(ViewProps.RIGHT, false);
        pluginGeneratedSerialDescriptor.l("imeInsetsBottom", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnSafeAreaInsetsDidChangeData$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        e0 e0Var = e0.f26262a;
        return new KSerializer[]{e0Var, e0Var, e0Var, e0Var, e0Var};
    }

    @Override 
    public OnSafeAreaInsetsDidChangeData deserialize(Decoder decoder) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            f14 = c10.G(descriptor2, 0);
            f13 = c10.G(descriptor2, 1);
            f12 = c10.G(descriptor2, 2);
            f11 = c10.G(descriptor2, 3);
            f10 = c10.G(descriptor2, 4);
            i10 = 31;
        } else {
            float f15 = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    f15 = c10.G(descriptor2, 0);
                    i11 |= 1;
                } else if (x10 == 1) {
                    f19 = c10.G(descriptor2, 1);
                    i11 |= 2;
                } else if (x10 == 2) {
                    f18 = c10.G(descriptor2, 2);
                    i11 |= 4;
                } else if (x10 == 3) {
                    f16 = c10.G(descriptor2, 3);
                    i11 |= 8;
                } else if (x10 == 4) {
                    f17 = c10.G(descriptor2, 4);
                    i11 |= 16;
                } else {
                    throw new n(x10);
                }
            }
            f14 = f15;
            f11 = f16;
            f10 = f17;
            f12 = f18;
            f13 = f19;
            i10 = i11;
        }
        c10.b(descriptor2);
        return new OnSafeAreaInsetsDidChangeData(i10, f14, f13, f12, f11, f10, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OnSafeAreaInsetsDidChangeData value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        OnSafeAreaInsetsDidChangeData.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
