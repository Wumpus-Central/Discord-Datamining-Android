package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.Message$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ui.n;
import xi.a2;
import xi.f0;
import xi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/row/UploadProgressRow.$serializer", "Lxi/f0;", "Lcom/discord/chat/bridge/row/UploadProgressRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class UploadProgressRow$$serializer implements f0<UploadProgressRow> {
    public static final UploadProgressRow$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        UploadProgressRow$$serializer uploadProgressRow$$serializer = new UploadProgressRow$$serializer();
        INSTANCE = uploadProgressRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("3", uploadProgressRow$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("index", false);
        pluginGeneratedSerialDescriptor.l("changeType", false);
        pluginGeneratedSerialDescriptor.l("message", false);
        pluginGeneratedSerialDescriptor.l("fileId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UploadProgressRow$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{m0.f30649a, ChangeType.Serializer.INSTANCE, Message$$serializer.INSTANCE, a2.f30574a};
    }

    @Override 
    public UploadProgressRow deserialize(Decoder decoder) {
        String str;
        int i10;
        int i11;
        Object obj;
        Object obj2;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i10 = b10.i(descriptor2, 0);
            obj = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            obj2 = b10.y(descriptor2, 2, Message$$serializer.INSTANCE, null);
            str = b10.m(descriptor2, 3);
            i11 = 15;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object obj3 = null;
            Object obj4 = null;
            String str2 = null;
            int i13 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    i12 = b10.i(descriptor2, 0);
                    i13 |= 1;
                } else if (o10 == 1) {
                    obj3 = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj3);
                    i13 |= 2;
                } else if (o10 == 2) {
                    obj4 = b10.y(descriptor2, 2, Message$$serializer.INSTANCE, obj4);
                    i13 |= 4;
                } else if (o10 == 3) {
                    str2 = b10.m(descriptor2, 3);
                    i13 |= 8;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i12;
            i11 = i13;
            obj = obj3;
            obj2 = obj4;
            str = str2;
        }
        b10.c(descriptor2);
        return new UploadProgressRow(i11, i10, (ChangeType) obj, (Message) obj2, str, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UploadProgressRow value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        UploadProgressRow.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
