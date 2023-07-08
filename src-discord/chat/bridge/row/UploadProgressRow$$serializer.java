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
import pi.n;
import si.a2;
import si.f0;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/row/UploadProgressRow.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/row/UploadProgressRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class UploadProgressRow$$serializer implements f0<UploadProgressRow> {
    public static final UploadProgressRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

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

    @Override // si.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{m0.f26305a, ChangeType.Serializer.INSTANCE, Message$$serializer.INSTANCE, a2.f26230a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UploadProgressRow deserialize(Decoder decoder) {
        String str;
        int i10;
        int i11;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            i10 = c10.k(descriptor2, 0);
            obj = c10.m(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            obj2 = c10.m(descriptor2, 2, Message$$serializer.INSTANCE, null);
            str = c10.t(descriptor2, 3);
            i11 = 15;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object obj3 = null;
            Object obj4 = null;
            String str2 = null;
            int i13 = 0;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    i12 = c10.k(descriptor2, 0);
                    i13 |= 1;
                } else if (x10 == 1) {
                    obj3 = c10.m(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj3);
                    i13 |= 2;
                } else if (x10 == 2) {
                    obj4 = c10.m(descriptor2, 2, Message$$serializer.INSTANCE, obj4);
                    i13 |= 4;
                } else if (x10 == 3) {
                    str2 = c10.t(descriptor2, 3);
                    i13 |= 8;
                } else {
                    throw new n(x10);
                }
            }
            i10 = i12;
            i11 = i13;
            obj = obj3;
            obj2 = obj4;
            str = str2;
        }
        c10.b(descriptor2);
        return new UploadProgressRow(i11, i10, (ChangeType) obj, (Message) obj2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, pi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UploadProgressRow value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        UploadProgressRow.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // si.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
