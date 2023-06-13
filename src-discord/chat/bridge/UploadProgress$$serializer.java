package com.discord.chat.bridge;

import com.facebook.react.uimanager.ViewProps;
import j$.util.Spliterator;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import vj.n;
import yj.a2;
import yj.e0;
import yj.f0;
import yj.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/UploadProgress.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/UploadProgress;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class UploadProgress$$serializer implements f0<UploadProgress> {
    public static final UploadProgress$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UploadProgress$$serializer uploadProgress$$serializer = new UploadProgress$$serializer();
        INSTANCE = uploadProgress$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.UploadProgress", uploadProgress$$serializer, 11);
        pluginGeneratedSerialDescriptor.l("headerText", false);
        pluginGeneratedSerialDescriptor.l("headerColor", false);
        pluginGeneratedSerialDescriptor.l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.l("progress", false);
        pluginGeneratedSerialDescriptor.l("fileId", false);
        pluginGeneratedSerialDescriptor.l("fileType", false);
        pluginGeneratedSerialDescriptor.l("progressTrackColor", false);
        pluginGeneratedSerialDescriptor.l("progressStartColor", false);
        pluginGeneratedSerialDescriptor.l("progressEndColor", false);
        pluginGeneratedSerialDescriptor.l("iconTintColor", false);
        pluginGeneratedSerialDescriptor.l("closeTintColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UploadProgress$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f32925a;
        m0 m0Var = m0.f33000a;
        return new KSerializer[]{a2Var, m0Var, m0Var, e0.f32950a, a2Var, a2Var, m0Var, m0Var, m0Var, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UploadProgress deserialize(Decoder decoder) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        String str2;
        float f10;
        int i15;
        int i16;
        String str3;
        int i17;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i18 = 0;
        if (b10.p()) {
            str3 = b10.m(descriptor2, 0);
            i16 = b10.i(descriptor2, 1);
            i15 = b10.i(descriptor2, 2);
            f10 = b10.u(descriptor2, 3);
            str2 = b10.m(descriptor2, 4);
            str = b10.m(descriptor2, 5);
            i14 = b10.i(descriptor2, 6);
            i13 = b10.i(descriptor2, 7);
            i12 = b10.i(descriptor2, 8);
            i11 = b10.i(descriptor2, 9);
            i10 = b10.i(descriptor2, 10);
            i17 = 2047;
        } else {
            String str4 = null;
            float f11 = 0.0f;
            String str5 = null;
            String str6 = null;
            boolean z10 = true;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str4 = b10.m(descriptor2, 0);
                        i18 |= 1;
                        continue;
                    case 1:
                        i24 = b10.i(descriptor2, 1);
                        i18 |= 2;
                        continue;
                    case 2:
                        i23 = b10.i(descriptor2, 2);
                        i18 |= 4;
                        break;
                    case 3:
                        f11 = b10.u(descriptor2, 3);
                        i18 |= 8;
                        break;
                    case 4:
                        str6 = b10.m(descriptor2, 4);
                        i18 |= 16;
                        break;
                    case 5:
                        str5 = b10.m(descriptor2, 5);
                        i18 |= 32;
                        break;
                    case 6:
                        i21 = b10.i(descriptor2, 6);
                        i18 |= 64;
                        break;
                    case 7:
                        i20 = b10.i(descriptor2, 7);
                        i18 |= 128;
                        break;
                    case 8:
                        i22 = b10.i(descriptor2, 8);
                        i18 |= Spliterator.NONNULL;
                        break;
                    case 9:
                        i19 = b10.i(descriptor2, 9);
                        i18 |= 512;
                        break;
                    case 10:
                        i25 = b10.i(descriptor2, 10);
                        i18 |= Spliterator.IMMUTABLE;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            i10 = i25;
            i11 = i19;
            str3 = str4;
            i17 = i18;
            i13 = i20;
            i16 = i24;
            i12 = i22;
            str = str5;
            f10 = f11;
            str2 = str6;
            i14 = i21;
            i15 = i23;
        }
        b10.c(descriptor2);
        return new UploadProgress(i17, str3, i16, i15, f10, str2, str, i14, i13, i12, i11, i10, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UploadProgress value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        UploadProgress.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
