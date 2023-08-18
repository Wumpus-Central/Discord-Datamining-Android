package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import java.util.List;
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
import wi.f;
import wi.f0;
import wi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/row/EmbeddedActivityRow.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/row/EmbeddedActivityRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class EmbeddedActivityRow$$serializer implements f0<EmbeddedActivityRow> {
    public static final EmbeddedActivityRow$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        EmbeddedActivityRow$$serializer embeddedActivityRow$$serializer = new EmbeddedActivityRow$$serializer();
        INSTANCE = embeddedActivityRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("5", embeddedActivityRow$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("index", false);
        pluginGeneratedSerialDescriptor.l("changeType", false);
        pluginGeneratedSerialDescriptor.l("content", false);
        pluginGeneratedSerialDescriptor.l("avatarUrls", false);
        pluginGeneratedSerialDescriptor.l("buttonText", false);
        pluginGeneratedSerialDescriptor.l("embeddedActivityKey", false);
        pluginGeneratedSerialDescriptor.l("dismissButtonAccessibilityLabel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmbeddedActivityRow$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f29755a;
        return new KSerializer[]{m0.f29830a, ChangeType.Serializer.INSTANCE, a2Var, new f(a2Var), a2Var, a2Var, a2Var};
    }

    @Override 
    public EmbeddedActivityRow deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        int i11;
        Object obj;
        Object obj2;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i12 = 6;
        if (b10.p()) {
            i10 = b10.i(descriptor2, 0);
            obj = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            str4 = b10.m(descriptor2, 2);
            obj2 = b10.y(descriptor2, 3, new f(a2.f29755a), null);
            str3 = b10.m(descriptor2, 4);
            str2 = b10.m(descriptor2, 5);
            str = b10.m(descriptor2, 6);
            i11 = 127;
        } else {
            boolean z10 = true;
            int i13 = 0;
            Object obj3 = null;
            String str5 = null;
            Object obj4 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            int i14 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        i12 = 6;
                    case 0:
                        i13 = b10.i(descriptor2, 0);
                        i14 |= 1;
                        i12 = 6;
                    case 1:
                        obj3 = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj3);
                        i14 |= 2;
                        i12 = 6;
                    case 2:
                        str5 = b10.m(descriptor2, 2);
                        i14 |= 4;
                        i12 = 6;
                    case 3:
                        obj4 = b10.y(descriptor2, 3, new f(a2.f29755a), obj4);
                        i14 |= 8;
                        i12 = 6;
                    case 4:
                        str6 = b10.m(descriptor2, 4);
                        i14 |= 16;
                    case 5:
                        str7 = b10.m(descriptor2, 5);
                        i14 |= 32;
                    case 6:
                        str8 = b10.m(descriptor2, i12);
                        i14 |= 64;
                    default:
                        throw new n(o10);
                }
            }
            obj = obj3;
            obj2 = obj4;
            str2 = str7;
            str = str8;
            i11 = i14;
            str3 = str6;
            str4 = str5;
            i10 = i13;
        }
        b10.c(descriptor2);
        return new EmbeddedActivityRow(i11, i10, (ChangeType) obj, str4, (List) obj2, str3, str2, str, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, EmbeddedActivityRow value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        EmbeddedActivityRow.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
