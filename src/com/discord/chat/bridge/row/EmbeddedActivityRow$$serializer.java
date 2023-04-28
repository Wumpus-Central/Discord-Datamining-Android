package com.discord.chat.bridge.row;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2521f;
import bj.C2555m0;
import com.discord.chat.bridge.ChangeType;
import java.util.List;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/row/EmbeddedActivityRow.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/row/EmbeddedActivityRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EmbeddedActivityRow$$serializer implements AbstractC2522f0<EmbeddedActivityRow> {
    public static final EmbeddedActivityRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EmbeddedActivityRow$$serializer embeddedActivityRow$$serializer = new EmbeddedActivityRow$$serializer();
        INSTANCE = embeddedActivityRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("5", embeddedActivityRow$$serializer, 7);
        pluginGeneratedSerialDescriptor.m13841l("index", false);
        pluginGeneratedSerialDescriptor.m13841l("changeType", false);
        pluginGeneratedSerialDescriptor.m13841l("content", false);
        pluginGeneratedSerialDescriptor.m13841l("avatarUrls", false);
        pluginGeneratedSerialDescriptor.m13841l("buttonText", false);
        pluginGeneratedSerialDescriptor.m13841l("embeddedActivityKey", false);
        pluginGeneratedSerialDescriptor.m13841l("dismissButtonAccessibilityLabel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmbeddedActivityRow$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{C2555m0.f6794a, ChangeType.Serializer.INSTANCE, a2Var, new C2521f(a2Var), a2Var, a2Var, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EmbeddedActivityRow deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        Object obj;
        Object obj2;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i3 = 6;
        if (b.mo13850p()) {
            i = b.mo13855i(descriptor2, 0);
            obj = b.mo13847y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            str4 = b.mo13853m(descriptor2, 2);
            obj2 = b.mo13847y(descriptor2, 3, new C2521f(C2500a2.f6719a), null);
            str3 = b.mo13853m(descriptor2, 4);
            str2 = b.mo13853m(descriptor2, 5);
            str = b.mo13853m(descriptor2, 6);
            i2 = 127;
        } else {
            boolean z = true;
            int i4 = 0;
            Object obj3 = null;
            String str5 = null;
            Object obj4 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            int i5 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i3 = 6;
                    case 0:
                        i4 = b.mo13855i(descriptor2, 0);
                        i5 |= 1;
                        i3 = 6;
                    case 1:
                        obj3 = b.mo13847y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj3);
                        i5 |= 2;
                        i3 = 6;
                    case 2:
                        str5 = b.mo13853m(descriptor2, 2);
                        i5 |= 4;
                        i3 = 6;
                    case 3:
                        obj4 = b.mo13847y(descriptor2, 3, new C2521f(C2500a2.f6719a), obj4);
                        i5 |= 8;
                        i3 = 6;
                    case 4:
                        str6 = b.mo13853m(descriptor2, 4);
                        i5 |= 16;
                    case 5:
                        str7 = b.mo13853m(descriptor2, 5);
                        i5 |= 32;
                    case 6:
                        str8 = b.mo13853m(descriptor2, i3);
                        i5 |= 64;
                    default:
                        throw new C14382n(o);
                }
            }
            obj = obj3;
            obj2 = obj4;
            str2 = str7;
            str = str8;
            i2 = i5;
            str3 = str6;
            str4 = str5;
            i = i4;
        }
        b.mo13857c(descriptor2);
        return new EmbeddedActivityRow(i2, i, (ChangeType) obj, str4, (List) obj2, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, EmbeddedActivityRow value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        EmbeddedActivityRow.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
