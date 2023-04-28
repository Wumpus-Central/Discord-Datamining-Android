package com.discord.chat.input.events;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2555m0;
import com.facebook.react.uimanager.ViewProps;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/input/events/OnSelectionOrTextChangeEvent.$serializer", "Lbj/f0;", "Lcom/discord/chat/input/events/OnSelectionOrTextChangeEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class OnSelectionOrTextChangeEvent$$serializer implements AbstractC2522f0<OnSelectionOrTextChangeEvent> {
    public static final OnSelectionOrTextChangeEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OnSelectionOrTextChangeEvent$$serializer onSelectionOrTextChangeEvent$$serializer = new OnSelectionOrTextChangeEvent$$serializer();
        INSTANCE = onSelectionOrTextChangeEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.events.OnSelectionOrTextChangeEvent", onSelectionOrTextChangeEvent$$serializer, 4);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.START, false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.END, false);
        pluginGeneratedSerialDescriptor.m13841l("text", false);
        pluginGeneratedSerialDescriptor.m13841l("editId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnSelectionOrTextChangeEvent$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2555m0 m0Var = C2555m0.f6794a;
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{m0Var, m0Var, a2Var, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public OnSelectionOrTextChangeEvent deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            i2 = b.mo13855i(descriptor2, 0);
            i = b.mo13855i(descriptor2, 1);
            str2 = b.mo13853m(descriptor2, 2);
            str = b.mo13853m(descriptor2, 3);
            i3 = 15;
        } else {
            String str3 = null;
            String str4 = null;
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i4 = b.mo13855i(descriptor2, 0);
                    i6 |= 1;
                } else if (o == 1) {
                    i5 = b.mo13855i(descriptor2, 1);
                    i6 |= 2;
                } else if (o == 2) {
                    str4 = b.mo13853m(descriptor2, 2);
                    i6 |= 4;
                } else if (o == 3) {
                    str3 = b.mo13853m(descriptor2, 3);
                    i6 |= 8;
                } else {
                    throw new C14382n(o);
                }
            }
            i2 = i4;
            str = str3;
            str2 = str4;
            i = i5;
            i3 = i6;
        }
        b.mo13857c(descriptor2);
        return new OnSelectionOrTextChangeEvent(i3, i2, i, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OnSelectionOrTextChangeEvent value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        OnSelectionOrTextChangeEvent.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
