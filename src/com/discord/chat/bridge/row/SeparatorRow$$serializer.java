package com.discord.chat.bridge.row;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2530h;
import bj.C2555m0;
import com.discord.chat.bridge.ChangeType;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/row/SeparatorRow.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SeparatorRow$$serializer implements AbstractC2522f0<SeparatorRow> {
    public static final SeparatorRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SeparatorRow$$serializer separatorRow$$serializer = new SeparatorRow$$serializer();
        INSTANCE = separatorRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", separatorRow$$serializer, 6);
        pluginGeneratedSerialDescriptor.m13841l("changeType", false);
        pluginGeneratedSerialDescriptor.m13841l("index", false);
        pluginGeneratedSerialDescriptor.m13841l("text", false);
        pluginGeneratedSerialDescriptor.m13841l("id", false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l("scrollTo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SeparatorRow$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2555m0 m0Var = C2555m0.f6794a;
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{ChangeType.Serializer.INSTANCE, m0Var, a2Var, a2Var, m0Var, C14606a.m13u(C2530h.f6761a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SeparatorRow deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        Object obj;
        Object obj2;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i4 = 5;
        if (b.mo13850p()) {
            obj2 = b.mo13847y(descriptor2, 0, ChangeType.Serializer.INSTANCE, null);
            i2 = b.mo13855i(descriptor2, 1);
            str2 = b.mo13853m(descriptor2, 2);
            str = b.mo13853m(descriptor2, 3);
            i = b.mo13855i(descriptor2, 4);
            obj = b.mo13852n(descriptor2, 5, C2530h.f6761a, null);
            i3 = 63;
        } else {
            boolean z = true;
            int i5 = 0;
            int i6 = 0;
            Object obj3 = null;
            String str3 = null;
            String str4 = null;
            Object obj4 = null;
            int i7 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i4 = 5;
                    case 0:
                        obj3 = b.mo13847y(descriptor2, 0, ChangeType.Serializer.INSTANCE, obj3);
                        i6 |= 1;
                        i4 = 5;
                    case 1:
                        i7 = b.mo13855i(descriptor2, 1);
                        i6 |= 2;
                    case 2:
                        str3 = b.mo13853m(descriptor2, 2);
                        i6 |= 4;
                    case 3:
                        str4 = b.mo13853m(descriptor2, 3);
                        i6 |= 8;
                    case 4:
                        i5 = b.mo13855i(descriptor2, 4);
                        i6 |= 16;
                    case 5:
                        obj4 = b.mo13852n(descriptor2, i4, C2530h.f6761a, obj4);
                        i6 |= 32;
                    default:
                        throw new C14382n(o);
                }
            }
            i2 = i7;
            i3 = i6;
            str2 = str3;
            str = str4;
            obj = obj4;
            i = i5;
            obj2 = obj3;
        }
        b.mo13857c(descriptor2);
        return new SeparatorRow(i3, (ChangeType) obj2, i2, str2, str, i, (Boolean) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SeparatorRow value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        SeparatorRow.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
