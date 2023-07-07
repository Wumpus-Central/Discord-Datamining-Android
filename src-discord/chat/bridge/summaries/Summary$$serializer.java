package com.discord.chat.bridge.summaries;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId$$serializer;
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
import qi.n;
import ti.a2;
import ti.f;
import ti.f0;
import ti.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/summaries/Summary.$serializer", "Lti/f0;", "Lcom/discord/chat/bridge/summaries/Summary;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Summary$$serializer implements f0<Summary> {
    public static final Summary$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Summary$$serializer summary$$serializer = new Summary$$serializer();
        INSTANCE = summary$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.summaries.Summary", summary$$serializer, 8);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("topic", false);
        pluginGeneratedSerialDescriptor.l("summShort", false);
        pluginGeneratedSerialDescriptor.l("people", false);
        pluginGeneratedSerialDescriptor.l("startId", false);
        pluginGeneratedSerialDescriptor.l("endId", false);
        pluginGeneratedSerialDescriptor.l("count", false);
        pluginGeneratedSerialDescriptor.l("channelId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Summary$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26972a;
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        return new KSerializer[]{a2Var, a2Var, a2Var, new f(UserId$$serializer.INSTANCE), messageId$$serializer, messageId$$serializer, m0.f27047a, ChannelId$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Summary deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i11 = 7;
        int i12 = 0;
        Object obj5 = null;
        if (c10.y()) {
            str3 = c10.t(descriptor2, 0);
            str2 = c10.t(descriptor2, 1);
            str = c10.t(descriptor2, 2);
            obj2 = c10.m(descriptor2, 3, new f(UserId$$serializer.INSTANCE), null);
            MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
            obj = c10.m(descriptor2, 4, messageId$$serializer, null);
            obj3 = c10.m(descriptor2, 5, messageId$$serializer, null);
            i10 = c10.k(descriptor2, 6);
            obj4 = c10.m(descriptor2, 7, ChannelId$$serializer.INSTANCE, null);
            i12 = 255;
        } else {
            boolean z11 = true;
            int i13 = 0;
            String str4 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            String str5 = null;
            String str6 = null;
            while (z11) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z11 = false;
                    case 0:
                        z10 = true;
                        str4 = c10.t(descriptor2, 0);
                        i12 |= 1;
                        i11 = 7;
                    case 1:
                        z10 = true;
                        str6 = c10.t(descriptor2, 1);
                        i12 |= 2;
                        i11 = 7;
                    case 2:
                        str5 = c10.t(descriptor2, 2);
                        i12 |= 4;
                        i11 = 7;
                    case 3:
                        obj8 = c10.m(descriptor2, 3, new f(UserId$$serializer.INSTANCE), obj8);
                        i12 |= 8;
                        i11 = 7;
                    case 4:
                        obj5 = c10.m(descriptor2, 4, MessageId$$serializer.INSTANCE, obj5);
                        i12 |= 16;
                    case 5:
                        obj7 = c10.m(descriptor2, 5, MessageId$$serializer.INSTANCE, obj7);
                        i12 |= 32;
                    case 6:
                        i13 = c10.k(descriptor2, 6);
                        i12 |= 64;
                    case 7:
                        obj6 = c10.m(descriptor2, i11, ChannelId$$serializer.INSTANCE, obj6);
                        i12 |= 128;
                    default:
                        throw new n(x10);
                }
            }
            obj = obj5;
            obj4 = obj6;
            i10 = i13;
            obj3 = obj7;
            obj2 = obj8;
            str = str5;
            str2 = str6;
            str3 = str4;
        }
        c10.b(descriptor2);
        MessageId messageId = (MessageId) obj;
        MessageId messageId2 = (MessageId) obj3;
        return new Summary(i12, str3, str2, str, (List) obj2, messageId != null ? messageId.m598unboximpl() : null, messageId2 != null ? messageId2.m598unboximpl() : null, i10, (ChannelId) obj4, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Summary value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        Summary.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
