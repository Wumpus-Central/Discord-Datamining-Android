package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.n;
import wj.a;
import yj.a2;
import yj.f0;
import yj.h;
import yj.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/row/SeparatorRow.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class SeparatorRow$$serializer implements f0<SeparatorRow> {
    public static final SeparatorRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SeparatorRow$$serializer separatorRow$$serializer = new SeparatorRow$$serializer();
        INSTANCE = separatorRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", separatorRow$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("changeType", false);
        pluginGeneratedSerialDescriptor.l("index", false);
        pluginGeneratedSerialDescriptor.l("text", false);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l(ViewProps.COLOR, false);
        pluginGeneratedSerialDescriptor.l("scrollTo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SeparatorRow$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f33006a;
        a2 a2Var = a2.f32931a;
        return new KSerializer[]{ChangeType.Serializer.INSTANCE, m0Var, a2Var, a2Var, m0Var, a.u(h.f32973a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SeparatorRow deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        int i11;
        int i12;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i13 = 5;
        if (b10.p()) {
            obj2 = b10.y(descriptor2, 0, ChangeType.Serializer.INSTANCE, null);
            i11 = b10.i(descriptor2, 1);
            str2 = b10.m(descriptor2, 2);
            str = b10.m(descriptor2, 3);
            i10 = b10.i(descriptor2, 4);
            obj = b10.n(descriptor2, 5, h.f32973a, null);
            i12 = 63;
        } else {
            boolean z10 = true;
            int i14 = 0;
            int i15 = 0;
            Object obj3 = null;
            String str3 = null;
            String str4 = null;
            Object obj4 = null;
            int i16 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        i13 = 5;
                    case 0:
                        obj3 = b10.y(descriptor2, 0, ChangeType.Serializer.INSTANCE, obj3);
                        i15 |= 1;
                        i13 = 5;
                    case 1:
                        i16 = b10.i(descriptor2, 1);
                        i15 |= 2;
                    case 2:
                        str3 = b10.m(descriptor2, 2);
                        i15 |= 4;
                    case 3:
                        str4 = b10.m(descriptor2, 3);
                        i15 |= 8;
                    case 4:
                        i14 = b10.i(descriptor2, 4);
                        i15 |= 16;
                    case 5:
                        obj4 = b10.n(descriptor2, i13, h.f32973a, obj4);
                        i15 |= 32;
                    default:
                        throw new n(o10);
                }
            }
            i11 = i16;
            i12 = i15;
            str2 = str3;
            str = str4;
            obj = obj4;
            i10 = i14;
            obj2 = obj3;
        }
        b10.c(descriptor2);
        return new SeparatorRow(i12, (ChangeType) obj2, i11, str2, str, i10, (Boolean) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SeparatorRow value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        SeparatorRow.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
