package com.discord.chat.bridge.attachment;

import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3640e0;
import bj.C3652h;
import bj.C3676m0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C10255b;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p163j$.util.Spliterator;
import p449yi.C14447n;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/attachment/Attachment.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/attachment/Attachment;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Attachment$$serializer implements AbstractC3644f0<Attachment> {
    public static final Attachment$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Attachment$$serializer attachment$$serializer = new Attachment$$serializer();
        INSTANCE = attachment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.attachment.Attachment", attachment$$serializer, 22);
        pluginGeneratedSerialDescriptor.m13841l("url", false);
        pluginGeneratedSerialDescriptor.m13841l("videoUrl", true);
        pluginGeneratedSerialDescriptor.m13841l("filename", false);
        pluginGeneratedSerialDescriptor.m13841l("size", false);
        pluginGeneratedSerialDescriptor.m13841l("width", true);
        pluginGeneratedSerialDescriptor.m13841l("height", true);
        pluginGeneratedSerialDescriptor.m13841l("isSpoiler", false);
        pluginGeneratedSerialDescriptor.m13841l("spoiler", true);
        pluginGeneratedSerialDescriptor.m13841l("description", true);
        pluginGeneratedSerialDescriptor.m13841l("hint", true);
        pluginGeneratedSerialDescriptor.m13841l("role", true);
        pluginGeneratedSerialDescriptor.m13841l("showDescription", true);
        pluginGeneratedSerialDescriptor.m13841l("progress", true);
        pluginGeneratedSerialDescriptor.m13841l("uploaderId", true);
        pluginGeneratedSerialDescriptor.m13841l("uploaderItemId", true);
        pluginGeneratedSerialDescriptor.m13841l("durationSecs", true);
        pluginGeneratedSerialDescriptor.m13841l("waveform", true);
        pluginGeneratedSerialDescriptor.m13841l("isAnimated", true);
        pluginGeneratedSerialDescriptor.m13841l("waveformByteArray", true);
        pluginGeneratedSerialDescriptor.m13841l("spoilerOrNull", true);
        pluginGeneratedSerialDescriptor.m13841l("proxyWidth", true);
        pluginGeneratedSerialDescriptor.m13841l("proxyHeight", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Attachment$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        C3676m0 m0Var = C3676m0.f5992a;
        C3652h hVar = C3652h.f5959a;
        return new KSerializer[]{a2Var, C14667a.m13u(a2Var), a2Var, a2Var, C14667a.m13u(m0Var), C14667a.m13u(m0Var), hVar, C14667a.m13u(a2Var), C14667a.m13u(a2Var), C14667a.m13u(a2Var), C14667a.m13u(a2Var), hVar, C14667a.m13u(m0Var), C14667a.m13u(a2Var), C14667a.m13u(a2Var), C14667a.m13u(C3640e0.f5942a), C14667a.m13u(a2Var), hVar, C14667a.m13u(C10255b.f22532c), C14667a.m13u(a2Var), C14667a.m13u(m0Var), C14667a.m13u(m0Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Attachment deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        Object obj4;
        Object obj5;
        String str2;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int i;
        Object obj10;
        Object obj11;
        Object obj12;
        String str3;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        int i2;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            str3 = b.mo13853m(descriptor2, 0);
            C3622a2 a2Var = C3622a2.f5917a;
            obj12 = b.mo13852n(descriptor2, 1, a2Var, null);
            str2 = b.mo13853m(descriptor2, 2);
            str = b.mo13853m(descriptor2, 3);
            C3676m0 m0Var = C3676m0.f5992a;
            obj4 = b.mo13852n(descriptor2, 4, m0Var, null);
            obj5 = b.mo13852n(descriptor2, 5, m0Var, null);
            z = b.mo13861C(descriptor2, 6);
            obj9 = b.mo13852n(descriptor2, 7, a2Var, null);
            obj3 = b.mo13852n(descriptor2, 8, a2Var, null);
            obj2 = b.mo13852n(descriptor2, 9, a2Var, null);
            obj8 = b.mo13852n(descriptor2, 10, a2Var, null);
            z3 = b.mo13861C(descriptor2, 11);
            obj16 = b.mo13852n(descriptor2, 12, m0Var, null);
            obj13 = b.mo13852n(descriptor2, 13, a2Var, null);
            obj6 = b.mo13852n(descriptor2, 14, a2Var, null);
            obj7 = b.mo13852n(descriptor2, 15, C3640e0.f5942a, null);
            obj11 = b.mo13852n(descriptor2, 16, a2Var, null);
            z2 = b.mo13861C(descriptor2, 17);
            obj15 = b.mo13852n(descriptor2, 18, C10255b.f22532c, null);
            obj10 = b.mo13852n(descriptor2, 19, a2Var, null);
            obj = b.mo13852n(descriptor2, 20, m0Var, null);
            obj14 = b.mo13852n(descriptor2, 21, m0Var, null);
            i = 4194303;
        } else {
            Object obj17 = null;
            boolean z4 = true;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            obj13 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj27 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            int i3 = 0;
            z3 = false;
            z2 = false;
            z = false;
            Object obj31 = null;
            while (z4) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        z4 = false;
                        break;
                    case 0:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        str6 = b.mo13853m(descriptor2, 0);
                        i3 |= 1;
                        break;
                    case 1:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        obj28 = b.mo13852n(descriptor2, 1, C3622a2.f5917a, obj28);
                        i3 |= 2;
                        obj29 = obj29;
                        break;
                    case 2:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        str4 = b.mo13853m(descriptor2, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        str5 = b.mo13853m(descriptor2, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj20 = obj20;
                        obj21 = obj21;
                        obj29 = b.mo13852n(descriptor2, 4, C3676m0.f5992a, obj29);
                        i3 |= 16;
                        break;
                    case 5:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj20 = obj20;
                        obj30 = b.mo13852n(descriptor2, 5, C3676m0.f5992a, obj30);
                        i3 |= 32;
                        break;
                    case 6:
                        obj18 = obj18;
                        obj19 = obj19;
                        z = b.mo13861C(descriptor2, 6);
                        i3 |= 64;
                        obj20 = obj20;
                        break;
                    case 7:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj20 = b.mo13852n(descriptor2, 7, C3622a2.f5917a, obj20);
                        i3 |= 128;
                        break;
                    case 8:
                        obj21 = b.mo13852n(descriptor2, 8, C3622a2.f5917a, obj21);
                        i3 |= Spliterator.NONNULL;
                        obj18 = obj18;
                        obj20 = obj20;
                        break;
                    case 9:
                        obj21 = obj21;
                        obj19 = b.mo13852n(descriptor2, 9, C3622a2.f5917a, obj19);
                        i3 |= 512;
                        obj20 = obj20;
                        break;
                    case 10:
                        obj21 = obj21;
                        obj27 = b.mo13852n(descriptor2, 10, C3622a2.f5917a, obj27);
                        i3 |= Spliterator.IMMUTABLE;
                        obj20 = obj20;
                        break;
                    case 11:
                        obj21 = obj21;
                        z3 = b.mo13861C(descriptor2, 11);
                        i3 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        obj20 = obj20;
                        break;
                    case 12:
                        obj21 = obj21;
                        obj26 = b.mo13852n(descriptor2, 12, C3676m0.f5992a, obj26);
                        i3 |= 4096;
                        obj20 = obj20;
                        break;
                    case 13:
                        obj21 = obj21;
                        obj13 = b.mo13852n(descriptor2, 13, C3622a2.f5917a, obj13);
                        i3 |= 8192;
                        obj20 = obj20;
                        break;
                    case 14:
                        obj21 = obj21;
                        obj25 = b.mo13852n(descriptor2, 14, C3622a2.f5917a, obj25);
                        i3 |= Spliterator.SUBSIZED;
                        obj20 = obj20;
                        break;
                    case 15:
                        obj21 = obj21;
                        obj24 = b.mo13852n(descriptor2, 15, C3640e0.f5942a, obj24);
                        i2 = 32768;
                        i3 |= i2;
                        obj20 = obj20;
                        break;
                    case 16:
                        obj21 = obj21;
                        obj17 = b.mo13852n(descriptor2, 16, C3622a2.f5917a, obj17);
                        i2 = 65536;
                        i3 |= i2;
                        obj20 = obj20;
                        break;
                    case 17:
                        obj21 = obj21;
                        z2 = b.mo13861C(descriptor2, 17);
                        i3 |= 131072;
                        obj20 = obj20;
                        break;
                    case 18:
                        obj21 = obj21;
                        obj23 = b.mo13852n(descriptor2, 18, C10255b.f22532c, obj23);
                        i2 = 262144;
                        i3 |= i2;
                        obj20 = obj20;
                        break;
                    case 19:
                        obj21 = obj21;
                        obj31 = b.mo13852n(descriptor2, 19, C3622a2.f5917a, obj31);
                        i2 = 524288;
                        i3 |= i2;
                        obj20 = obj20;
                        break;
                    case 20:
                        obj21 = obj21;
                        obj18 = b.mo13852n(descriptor2, 20, C3676m0.f5992a, obj18);
                        i2 = 1048576;
                        i3 |= i2;
                        obj20 = obj20;
                        break;
                    case 21:
                        obj21 = obj21;
                        obj22 = b.mo13852n(descriptor2, 21, C3676m0.f5992a, obj22);
                        i2 = 2097152;
                        i3 |= i2;
                        obj20 = obj20;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            obj = obj18;
            obj2 = obj19;
            obj3 = obj21;
            obj4 = obj29;
            obj15 = obj23;
            obj7 = obj24;
            obj6 = obj25;
            obj16 = obj26;
            obj8 = obj27;
            str2 = str4;
            str = str5;
            obj9 = obj20;
            obj5 = obj30;
            obj14 = obj22;
            i = i3;
            str3 = str6;
            obj10 = obj31;
            obj11 = obj17;
            obj12 = obj28;
        }
        b.mo13857c(descriptor2);
        return new Attachment(i, str3, (String) obj12, str2, str, (Integer) obj4, (Integer) obj5, z, (String) obj9, (String) obj3, (String) obj2, (String) obj8, z3, (Integer) obj16, (String) obj13, (String) obj6, (Float) obj7, (String) obj11, z2, (byte[]) obj15, (String) obj10, (Integer) obj, (Integer) obj14, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Attachment value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        Attachment.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
