package com.discord.chat.input.events;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.n;
import ti.f0;
import ti.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/input/events/OnFocusEvent.$serializer", "Lti/f0;", "Lcom/discord/chat/input/events/OnFocusEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_input_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class OnFocusEvent$$serializer implements f0<OnFocusEvent> {
    public static final OnFocusEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OnFocusEvent$$serializer onFocusEvent$$serializer = new OnFocusEvent$$serializer();
        INSTANCE = onFocusEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.events.OnFocusEvent", onFocusEvent$$serializer, 3);
        pluginGeneratedSerialDescriptor.l(ViewProps.START, false);
        pluginGeneratedSerialDescriptor.l(ViewProps.END, false);
        pluginGeneratedSerialDescriptor.l(TouchesHelper.TARGET_KEY, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnFocusEvent$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f27015a;
        return new KSerializer[]{m0Var, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public OnFocusEvent deserialize(Decoder decoder) {
        int i10;
        int i11;
        int i12;
        int i13;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            i12 = c10.k(descriptor2, 0);
            i11 = c10.k(descriptor2, 1);
            i10 = c10.k(descriptor2, 2);
            i13 = 7;
        } else {
            boolean z10 = true;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    i14 = c10.k(descriptor2, 0);
                    i17 |= 1;
                } else if (x10 == 1) {
                    i16 = c10.k(descriptor2, 1);
                    i17 |= 2;
                } else if (x10 == 2) {
                    i15 = c10.k(descriptor2, 2);
                    i17 |= 4;
                } else {
                    throw new n(x10);
                }
            }
            i12 = i14;
            i10 = i15;
            i11 = i16;
            i13 = i17;
        }
        c10.b(descriptor2);
        return new OnFocusEvent(i13, i12, i11, i10, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OnFocusEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        OnFocusEvent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
