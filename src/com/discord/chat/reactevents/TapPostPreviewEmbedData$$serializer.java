package com.discord.chat.reactevents;

import bj.AbstractC2522f0;
import bj.C2500a2;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/reactevents/TapPostPreviewEmbedData.$serializer", "Lbj/f0;", "Lcom/discord/chat/reactevents/TapPostPreviewEmbedData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class TapPostPreviewEmbedData$$serializer implements AbstractC2522f0<TapPostPreviewEmbedData> {
    public static final TapPostPreviewEmbedData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TapPostPreviewEmbedData$$serializer tapPostPreviewEmbedData$$serializer = new TapPostPreviewEmbedData$$serializer();
        INSTANCE = tapPostPreviewEmbedData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapPostPreviewEmbedData", tapPostPreviewEmbedData$$serializer, 4);
        pluginGeneratedSerialDescriptor.m13841l("guildId", false);
        pluginGeneratedSerialDescriptor.m13841l("parentChannelId", false);
        pluginGeneratedSerialDescriptor.m13841l("threadId", false);
        pluginGeneratedSerialDescriptor.m13841l("messageId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TapPostPreviewEmbedData$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{a2Var, a2Var, a2Var, MessageId$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TapPostPreviewEmbedData deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        Object obj;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        String str4 = null;
        if (b.mo13850p()) {
            str3 = b.mo13853m(descriptor2, 0);
            str2 = b.mo13853m(descriptor2, 1);
            str = b.mo13853m(descriptor2, 2);
            obj = b.mo13847y(descriptor2, 3, MessageId$$serializer.INSTANCE, null);
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            Object obj2 = null;
            String str6 = null;
            String str7 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str5 = b.mo13853m(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    str7 = b.mo13853m(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    str6 = b.mo13853m(descriptor2, 2);
                    i2 |= 4;
                } else if (o == 3) {
                    obj2 = b.mo13847y(descriptor2, 3, MessageId$$serializer.INSTANCE, obj2);
                    i2 |= 8;
                } else {
                    throw new C14382n(o);
                }
            }
            str3 = str5;
            obj = obj2;
            str = str6;
            str2 = str7;
            i = i2;
        }
        b.mo13857c(descriptor2);
        MessageId messageId = (MessageId) obj;
        if (messageId != null) {
            str4 = messageId.m42123unboximpl();
        }
        return new TapPostPreviewEmbedData(i, str3, str2, str, str4, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TapPostPreviewEmbedData value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        TapPostPreviewEmbedData.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
