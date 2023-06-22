package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.summaries.Summary;
import com.discord.chat.bridge.summaries.Summary$$serializer;
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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", separatorRow$$serializer, 8);
        pluginGeneratedSerialDescriptor.l("changeType", false);
        pluginGeneratedSerialDescriptor.l("index", false);
        pluginGeneratedSerialDescriptor.l("text", false);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l(ViewProps.COLOR, false);
        pluginGeneratedSerialDescriptor.l("scrollTo", true);
        pluginGeneratedSerialDescriptor.l("isBeforeContent", true);
        pluginGeneratedSerialDescriptor.l("summary", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SeparatorRow$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f33009a;
        a2 a2Var = a2.f32934a;
        h hVar = h.f32976a;
        return new KSerializer[]{ChangeType.Serializer.INSTANCE, m0Var, a2Var, a2Var, m0Var, a.u(hVar), a.u(hVar), a.u(Summary$$serializer.INSTANCE)};
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
        Object obj3;
        Object obj4;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i13 = 7;
        int i14 = 6;
        if (b10.p()) {
            obj4 = b10.y(descriptor2, 0, ChangeType.Serializer.INSTANCE, null);
            i11 = b10.i(descriptor2, 1);
            str2 = b10.m(descriptor2, 2);
            str = b10.m(descriptor2, 3);
            i10 = b10.i(descriptor2, 4);
            h hVar = h.f32976a;
            obj = b10.n(descriptor2, 5, hVar, null);
            obj2 = b10.n(descriptor2, 6, hVar, null);
            obj3 = b10.n(descriptor2, 7, Summary$$serializer.INSTANCE, null);
            i12 = 255;
        } else {
            boolean z10 = true;
            int i15 = 0;
            int i16 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str3 = null;
            String str4 = null;
            Object obj8 = null;
            int i17 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        i14 = 6;
                        break;
                    case 0:
                        obj7 = b10.y(descriptor2, 0, ChangeType.Serializer.INSTANCE, obj7);
                        i16 |= 1;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 1:
                        i17 = b10.i(descriptor2, 1);
                        i16 |= 2;
                        break;
                    case 2:
                        str3 = b10.m(descriptor2, 2);
                        i16 |= 4;
                        break;
                    case 3:
                        str4 = b10.m(descriptor2, 3);
                        i16 |= 8;
                        break;
                    case 4:
                        i15 = b10.i(descriptor2, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        obj8 = b10.n(descriptor2, 5, h.f32976a, obj8);
                        i16 |= 32;
                        break;
                    case 6:
                        obj6 = b10.n(descriptor2, i14, h.f32976a, obj6);
                        i16 |= 64;
                        break;
                    case 7:
                        obj5 = b10.n(descriptor2, i13, Summary$$serializer.INSTANCE, obj5);
                        i16 |= 128;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj3 = obj5;
            obj2 = obj6;
            obj = obj8;
            i11 = i17;
            i12 = i16;
            str2 = str3;
            str = str4;
            i10 = i15;
            obj4 = obj7;
        }
        b10.c(descriptor2);
        return new SeparatorRow(i12, (ChangeType) obj4, i11, str2, str, i10, (Boolean) obj, (Boolean) obj2, (Summary) obj3, (SerializationConstructorMarker) null);
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
