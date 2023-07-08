package com.discord.chat.bridge.attachment;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b;
import pi.n;
import qi.a;
import si.a2;
import si.e0;
import si.f0;
import si.h;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/attachment/Attachment.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/attachment/Attachment;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Attachment$$serializer implements f0<Attachment> {
    public static final Attachment$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Attachment$$serializer attachment$$serializer = new Attachment$$serializer();
        INSTANCE = attachment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.attachment.Attachment", attachment$$serializer, 22);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("videoUrl", true);
        pluginGeneratedSerialDescriptor.l("filename", false);
        pluginGeneratedSerialDescriptor.l("size", false);
        pluginGeneratedSerialDescriptor.l("width", true);
        pluginGeneratedSerialDescriptor.l("height", true);
        pluginGeneratedSerialDescriptor.l("isSpoiler", false);
        pluginGeneratedSerialDescriptor.l("spoiler", true);
        pluginGeneratedSerialDescriptor.l("description", true);
        pluginGeneratedSerialDescriptor.l("hint", true);
        pluginGeneratedSerialDescriptor.l("role", true);
        pluginGeneratedSerialDescriptor.l("showDescription", true);
        pluginGeneratedSerialDescriptor.l("progress", true);
        pluginGeneratedSerialDescriptor.l("uploaderId", true);
        pluginGeneratedSerialDescriptor.l("uploaderItemId", true);
        pluginGeneratedSerialDescriptor.l("durationSecs", true);
        pluginGeneratedSerialDescriptor.l("waveform", true);
        pluginGeneratedSerialDescriptor.l("isAnimated", true);
        pluginGeneratedSerialDescriptor.l("waveformByteArray", true);
        pluginGeneratedSerialDescriptor.l("spoilerOrNull", true);
        pluginGeneratedSerialDescriptor.l("proxyWidth", true);
        pluginGeneratedSerialDescriptor.l("proxyHeight", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Attachment$$serializer() {
    }

    @Override // si.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26230a;
        m0 m0Var = m0.f26305a;
        h hVar = h.f26272a;
        return new KSerializer[]{a2Var, a.u(a2Var), a2Var, a2Var, a.u(m0Var), a.u(m0Var), hVar, a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), hVar, a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(e0.f26255a), a.u(a2Var), hVar, a.u(b.f21153c), a.u(a2Var), a.u(m0Var), a.u(m0Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Attachment deserialize(Decoder decoder) {
        boolean z10;
        boolean z11;
        boolean z12;
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
        int i10;
        Object obj10;
        Object obj11;
        Object obj12;
        String str3;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        int i11;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            str3 = c10.t(descriptor2, 0);
            a2 a2Var = a2.f26230a;
            obj12 = c10.v(descriptor2, 1, a2Var, null);
            str2 = c10.t(descriptor2, 2);
            str = c10.t(descriptor2, 3);
            m0 m0Var = m0.f26305a;
            obj4 = c10.v(descriptor2, 4, m0Var, null);
            obj5 = c10.v(descriptor2, 5, m0Var, null);
            z10 = c10.s(descriptor2, 6);
            obj9 = c10.v(descriptor2, 7, a2Var, null);
            obj3 = c10.v(descriptor2, 8, a2Var, null);
            obj2 = c10.v(descriptor2, 9, a2Var, null);
            obj8 = c10.v(descriptor2, 10, a2Var, null);
            z12 = c10.s(descriptor2, 11);
            obj16 = c10.v(descriptor2, 12, m0Var, null);
            obj13 = c10.v(descriptor2, 13, a2Var, null);
            obj6 = c10.v(descriptor2, 14, a2Var, null);
            obj7 = c10.v(descriptor2, 15, e0.f26255a, null);
            obj11 = c10.v(descriptor2, 16, a2Var, null);
            z11 = c10.s(descriptor2, 17);
            obj15 = c10.v(descriptor2, 18, b.f21153c, null);
            obj10 = c10.v(descriptor2, 19, a2Var, null);
            obj = c10.v(descriptor2, 20, m0Var, null);
            obj14 = c10.v(descriptor2, 21, m0Var, null);
            i10 = 4194303;
        } else {
            Object obj17 = null;
            boolean z13 = true;
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
            int i12 = 0;
            z12 = false;
            z11 = false;
            z10 = false;
            Object obj31 = null;
            while (z13) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        z13 = false;
                        break;
                    case 0:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        str6 = c10.t(descriptor2, 0);
                        i12 |= 1;
                        break;
                    case 1:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        obj28 = c10.v(descriptor2, 1, a2.f26230a, obj28);
                        i12 |= 2;
                        obj29 = obj29;
                        break;
                    case 2:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        str4 = c10.t(descriptor2, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        str5 = c10.t(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj20 = obj20;
                        obj21 = obj21;
                        obj29 = c10.v(descriptor2, 4, m0.f26305a, obj29);
                        i12 |= 16;
                        break;
                    case 5:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj20 = obj20;
                        obj30 = c10.v(descriptor2, 5, m0.f26305a, obj30);
                        i12 |= 32;
                        break;
                    case 6:
                        obj18 = obj18;
                        obj19 = obj19;
                        z10 = c10.s(descriptor2, 6);
                        i12 |= 64;
                        obj20 = obj20;
                        break;
                    case 7:
                        obj18 = obj18;
                        obj19 = obj19;
                        obj20 = c10.v(descriptor2, 7, a2.f26230a, obj20);
                        i12 |= 128;
                        break;
                    case 8:
                        obj21 = c10.v(descriptor2, 8, a2.f26230a, obj21);
                        i12 |= 256;
                        obj18 = obj18;
                        obj20 = obj20;
                        break;
                    case 9:
                        obj21 = obj21;
                        obj19 = c10.v(descriptor2, 9, a2.f26230a, obj19);
                        i12 |= 512;
                        obj20 = obj20;
                        break;
                    case 10:
                        obj21 = obj21;
                        obj27 = c10.v(descriptor2, 10, a2.f26230a, obj27);
                        i12 |= 1024;
                        obj20 = obj20;
                        break;
                    case 11:
                        obj21 = obj21;
                        z12 = c10.s(descriptor2, 11);
                        i12 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        obj20 = obj20;
                        break;
                    case 12:
                        obj21 = obj21;
                        obj26 = c10.v(descriptor2, 12, m0.f26305a, obj26);
                        i12 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        obj20 = obj20;
                        break;
                    case 13:
                        obj21 = obj21;
                        obj13 = c10.v(descriptor2, 13, a2.f26230a, obj13);
                        i12 |= 8192;
                        obj20 = obj20;
                        break;
                    case 14:
                        obj21 = obj21;
                        obj25 = c10.v(descriptor2, 14, a2.f26230a, obj25);
                        i12 |= 16384;
                        obj20 = obj20;
                        break;
                    case 15:
                        obj21 = obj21;
                        obj24 = c10.v(descriptor2, 15, e0.f26255a, obj24);
                        i11 = 32768;
                        i12 |= i11;
                        obj20 = obj20;
                        break;
                    case 16:
                        obj21 = obj21;
                        obj17 = c10.v(descriptor2, 16, a2.f26230a, obj17);
                        i11 = 65536;
                        i12 |= i11;
                        obj20 = obj20;
                        break;
                    case 17:
                        obj21 = obj21;
                        z11 = c10.s(descriptor2, 17);
                        i12 |= 131072;
                        obj20 = obj20;
                        break;
                    case 18:
                        obj21 = obj21;
                        obj23 = c10.v(descriptor2, 18, b.f21153c, obj23);
                        i11 = 262144;
                        i12 |= i11;
                        obj20 = obj20;
                        break;
                    case 19:
                        obj21 = obj21;
                        obj31 = c10.v(descriptor2, 19, a2.f26230a, obj31);
                        i11 = 524288;
                        i12 |= i11;
                        obj20 = obj20;
                        break;
                    case 20:
                        obj21 = obj21;
                        obj18 = c10.v(descriptor2, 20, m0.f26305a, obj18);
                        i11 = 1048576;
                        i12 |= i11;
                        obj20 = obj20;
                        break;
                    case 21:
                        obj21 = obj21;
                        obj22 = c10.v(descriptor2, 21, m0.f26305a, obj22);
                        i11 = 2097152;
                        i12 |= i11;
                        obj20 = obj20;
                        break;
                    default:
                        throw new n(x10);
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
            i10 = i12;
            str3 = str6;
            obj10 = obj31;
            obj11 = obj17;
            obj12 = obj28;
        }
        c10.b(descriptor2);
        return new Attachment(i10, str3, (String) obj12, str2, str, (Integer) obj4, (Integer) obj5, z10, (String) obj9, (String) obj3, (String) obj2, (String) obj8, z12, (Integer) obj16, (String) obj13, (String) obj6, (Float) obj7, (String) obj11, z11, (byte[]) obj15, (String) obj10, (Integer) obj, (Integer) obj14, null);
    }

    @Override // kotlinx.serialization.KSerializer, pi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Attachment value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        Attachment.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // si.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
