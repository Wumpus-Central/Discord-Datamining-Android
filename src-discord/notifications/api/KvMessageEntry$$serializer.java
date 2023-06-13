package com.discord.notifications.api;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.t;
import vj.n;
import yj.f;
import yj.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/notifications/api/KvMessageEntry.$serializer", "Lyj/f0;", "Lcom/discord/notifications/api/KvMessageEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "notification_api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class KvMessageEntry$$serializer implements f0<KvMessageEntry> {
    public static final KvMessageEntry$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        KvMessageEntry$$serializer kvMessageEntry$$serializer = new KvMessageEntry$$serializer();
        INSTANCE = kvMessageEntry$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.KvMessageEntry", kvMessageEntry$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("members", true);
        pluginGeneratedSerialDescriptor.l("users", true);
        pluginGeneratedSerialDescriptor.l("message", false);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("channelId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private KvMessageEntry$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        t tVar = t.f22664a;
        return new KSerializer[]{new f(tVar), new f(tVar), tVar, MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public KvMessageEntry deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            t tVar = t.f22664a;
            obj5 = b10.y(descriptor2, 0, new f(tVar), null);
            obj = b10.y(descriptor2, 1, new f(tVar), null);
            obj2 = b10.y(descriptor2, 2, tVar, null);
            obj4 = b10.y(descriptor2, 3, MessageId$$serializer.INSTANCE, null);
            obj3 = b10.y(descriptor2, 4, ChannelId$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj5 = b10.y(descriptor2, 0, new f(t.f22664a), obj5);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj9 = b10.y(descriptor2, 1, new f(t.f22664a), obj9);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj8 = b10.y(descriptor2, 2, t.f22664a, obj8);
                    i11 |= 4;
                } else if (o10 == 3) {
                    obj6 = b10.y(descriptor2, 3, MessageId$$serializer.INSTANCE, obj6);
                    i11 |= 8;
                } else if (o10 == 4) {
                    obj7 = b10.y(descriptor2, 4, ChannelId$$serializer.INSTANCE, obj7);
                    i11 |= 16;
                } else {
                    throw new n(o10);
                }
            }
            obj4 = obj6;
            obj3 = obj7;
            obj2 = obj8;
            obj = obj9;
            i10 = i11;
        }
        b10.c(descriptor2);
        MessageId messageId = (MessageId) obj4;
        return new KvMessageEntry(i10, (List) obj5, (List) obj, (JsonObject) obj2, messageId != null ? messageId.m580unboximpl() : null, (ChannelId) obj3, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, KvMessageEntry value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        KvMessageEntry.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
