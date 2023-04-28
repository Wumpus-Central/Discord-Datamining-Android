package com.discord.chat.reactevents;

import bj.AbstractC2522f0;
import bj.C2589w0;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/reactevents/TapSelectActionComponent.$serializer", "Lbj/f0;", "Lcom/discord/chat/reactevents/TapSelectActionComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class TapSelectActionComponent$$serializer implements AbstractC2522f0<TapSelectActionComponent> {
    public static final TapSelectActionComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TapSelectActionComponent$$serializer tapSelectActionComponent$$serializer = new TapSelectActionComponent$$serializer();
        INSTANCE = tapSelectActionComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapSelectActionComponent", tapSelectActionComponent$$serializer, 3);
        pluginGeneratedSerialDescriptor.m13841l("messageId", false);
        pluginGeneratedSerialDescriptor.m13841l("messageFlags", false);
        pluginGeneratedSerialDescriptor.m13841l("selectionActionComponent", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TapSelectActionComponent$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MessageId$$serializer.INSTANCE, C2589w0.f6835a, SelectComponent.Companion.serializer()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TapSelectActionComponent deserialize(Decoder decoder) {
        long j;
        int i;
        Object obj;
        Object obj2;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        String str = null;
        if (b.mo13850p()) {
            obj2 = b.mo13847y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            j = b.mo13856f(descriptor2, 1);
            obj = b.mo13847y(descriptor2, 2, SelectComponent.Companion.serializer(), null);
            i = 7;
        } else {
            long j2 = 0;
            boolean z = true;
            int i2 = 0;
            obj2 = null;
            Object obj3 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    obj2 = b.mo13847y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj2);
                    i2 |= 1;
                } else if (o == 1) {
                    j2 = b.mo13856f(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    obj3 = b.mo13847y(descriptor2, 2, SelectComponent.Companion.serializer(), obj3);
                    i2 |= 4;
                } else {
                    throw new C14382n(o);
                }
            }
            obj = obj3;
            i = i2;
            j = j2;
        }
        b.mo13857c(descriptor2);
        MessageId messageId = (MessageId) obj2;
        if (messageId != null) {
            str = messageId.m42123unboximpl();
        }
        return new TapSelectActionComponent(i, str, j, (SelectComponent) obj, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TapSelectActionComponent value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        TapSelectActionComponent.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
