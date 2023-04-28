package com.discord.safearea.events;

import bj.AbstractC3644f0;
import bj.C3640e0;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p449yi.C14447n;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/safearea/events/OnSafeAreaInsetsDidChangeData.$serializer", "Lbj/f0;", "Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "safe_area_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class OnSafeAreaInsetsDidChangeData$$serializer implements AbstractC3644f0<OnSafeAreaInsetsDidChangeData> {
    public static final OnSafeAreaInsetsDidChangeData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OnSafeAreaInsetsDidChangeData$$serializer onSafeAreaInsetsDidChangeData$$serializer = new OnSafeAreaInsetsDidChangeData$$serializer();
        INSTANCE = onSafeAreaInsetsDidChangeData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.safearea.events.OnSafeAreaInsetsDidChangeData", onSafeAreaInsetsDidChangeData$$serializer, 5);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.TOP, false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BOTTOM, false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.LEFT, false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.RIGHT, false);
        pluginGeneratedSerialDescriptor.m13841l("imeInsetsBottom", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnSafeAreaInsetsDidChangeData$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3640e0 e0Var = C3640e0.f5942a;
        return new KSerializer[]{e0Var, e0Var, e0Var, e0Var, e0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public OnSafeAreaInsetsDidChangeData deserialize(Decoder decoder) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            f5 = b.mo13848u(descriptor2, 0);
            f4 = b.mo13848u(descriptor2, 1);
            f3 = b.mo13848u(descriptor2, 2);
            f2 = b.mo13848u(descriptor2, 3);
            f = b.mo13848u(descriptor2, 4);
            i = 31;
        } else {
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    f6 = b.mo13848u(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    f10 = b.mo13848u(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    f9 = b.mo13848u(descriptor2, 2);
                    i2 |= 4;
                } else if (o == 3) {
                    f7 = b.mo13848u(descriptor2, 3);
                    i2 |= 8;
                } else if (o == 4) {
                    f8 = b.mo13848u(descriptor2, 4);
                    i2 |= 16;
                } else {
                    throw new C14447n(o);
                }
            }
            f5 = f6;
            f2 = f7;
            f = f8;
            f3 = f9;
            f4 = f10;
            i = i2;
        }
        b.mo13857c(descriptor2);
        return new OnSafeAreaInsetsDidChangeData(i, f5, f4, f3, f2, f, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OnSafeAreaInsetsDidChangeData value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        OnSafeAreaInsetsDidChangeData.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
