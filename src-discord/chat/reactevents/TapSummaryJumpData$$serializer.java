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

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/reactevents/TapSummaryJumpData.$serializer", "Lwi/f0;", "Lcom/discord/chat/reactevents/TapSummaryJumpData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class TapSummaryJumpData$$serializer implements f0<TapSummaryJumpData> {
    public static final TapSummaryJumpData$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        TapSummaryJumpData$$serializer tapSummaryJumpData$$serializer = new TapSummaryJumpData$$serializer();
        INSTANCE = tapSummaryJumpData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapSummaryJumpData", tapSummaryJumpData$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("channelId", false);
        pluginGeneratedSerialDescriptor.l("messageId", false);
        pluginGeneratedSerialDescriptor.l("summaryId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TapSummaryJumpData$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f29755a;
        return new KSerializer[]{a2Var, a2Var, a2Var};
    }

    @Override 
    public TapSummaryJumpData deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i10;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            str3 = b10.m(descriptor2, 0);
            str2 = b10.m(descriptor2, 1);
            str = b10.m(descriptor2, 2);
            i10 = 7;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    str4 = b10.m(descriptor2, 0);
                    i11 |= 1;
                } else if (o10 == 1) {
                    str6 = b10.m(descriptor2, 1);
                    i11 |= 2;
                } else if (o10 == 2) {
                    str5 = b10.m(descriptor2, 2);
                    i11 |= 4;
                } else {
                    throw new n(o10);
                }
            }
            str3 = str4;
            str = str5;
            str2 = str6;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new TapSummaryJumpData(i10, str3, str2, str, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TapSummaryJumpData value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        TapSummaryJumpData.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}