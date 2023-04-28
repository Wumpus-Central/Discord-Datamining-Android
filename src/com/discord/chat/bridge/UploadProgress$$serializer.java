package com.discord.chat.bridge;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3640e0;
import bj.C3676m0;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p163j$.util.Spliterator;
import p449yi.C14447n;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/UploadProgress.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/UploadProgress;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UploadProgress$$serializer implements AbstractC3644f0<UploadProgress> {
    public static final UploadProgress$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UploadProgress$$serializer uploadProgress$$serializer = new UploadProgress$$serializer();
        INSTANCE = uploadProgress$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.UploadProgress", uploadProgress$$serializer, 11);
        pluginGeneratedSerialDescriptor.m13841l("headerText", false);
        pluginGeneratedSerialDescriptor.m13841l("headerColor", false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l("progress", false);
        pluginGeneratedSerialDescriptor.m13841l("fileId", false);
        pluginGeneratedSerialDescriptor.m13841l("fileType", false);
        pluginGeneratedSerialDescriptor.m13841l("progressTrackColor", false);
        pluginGeneratedSerialDescriptor.m13841l("progressStartColor", false);
        pluginGeneratedSerialDescriptor.m13841l("progressEndColor", false);
        pluginGeneratedSerialDescriptor.m13841l("iconTintColor", false);
        pluginGeneratedSerialDescriptor.m13841l("closeTintColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UploadProgress$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        C3676m0 m0Var = C3676m0.f5992a;
        return new KSerializer[]{a2Var, m0Var, m0Var, C3640e0.f5942a, a2Var, a2Var, m0Var, m0Var, m0Var, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UploadProgress deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        String str2;
        float f;
        int i6;
        int i7;
        String str3;
        int i8;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        int i9 = 0;
        if (b.mo13850p()) {
            str3 = b.mo13853m(descriptor2, 0);
            i7 = b.mo13855i(descriptor2, 1);
            i6 = b.mo13855i(descriptor2, 2);
            f = b.mo13848u(descriptor2, 3);
            str2 = b.mo13853m(descriptor2, 4);
            str = b.mo13853m(descriptor2, 5);
            i5 = b.mo13855i(descriptor2, 6);
            i4 = b.mo13855i(descriptor2, 7);
            i3 = b.mo13855i(descriptor2, 8);
            i2 = b.mo13855i(descriptor2, 9);
            i = b.mo13855i(descriptor2, 10);
            i8 = 2047;
        } else {
            String str4 = null;
            float f2 = 0.0f;
            String str5 = null;
            String str6 = null;
            boolean z = true;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str4 = b.mo13853m(descriptor2, 0);
                        i9 |= 1;
                        continue;
                    case 1:
                        i15 = b.mo13855i(descriptor2, 1);
                        i9 |= 2;
                        continue;
                    case 2:
                        i14 = b.mo13855i(descriptor2, 2);
                        i9 |= 4;
                        break;
                    case 3:
                        f2 = b.mo13848u(descriptor2, 3);
                        i9 |= 8;
                        break;
                    case 4:
                        str6 = b.mo13853m(descriptor2, 4);
                        i9 |= 16;
                        break;
                    case 5:
                        str5 = b.mo13853m(descriptor2, 5);
                        i9 |= 32;
                        break;
                    case 6:
                        i12 = b.mo13855i(descriptor2, 6);
                        i9 |= 64;
                        break;
                    case 7:
                        i11 = b.mo13855i(descriptor2, 7);
                        i9 |= 128;
                        break;
                    case 8:
                        i13 = b.mo13855i(descriptor2, 8);
                        i9 |= Spliterator.NONNULL;
                        break;
                    case 9:
                        i10 = b.mo13855i(descriptor2, 9);
                        i9 |= 512;
                        break;
                    case 10:
                        i16 = b.mo13855i(descriptor2, 10);
                        i9 |= Spliterator.IMMUTABLE;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            i = i16;
            i2 = i10;
            str3 = str4;
            i8 = i9;
            i4 = i11;
            i7 = i15;
            i3 = i13;
            str = str5;
            f = f2;
            str2 = str6;
            i5 = i12;
            i6 = i14;
        }
        b.mo13857c(descriptor2);
        return new UploadProgress(i8, str3, i7, i6, f, str2, str, i5, i4, i3, i2, i, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UploadProgress value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        UploadProgress.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
