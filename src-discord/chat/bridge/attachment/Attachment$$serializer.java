package com.discord.chat.bridge.attachment;

import androidx.recyclerview.widget.RecyclerView;
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
import kotlinx.serialization.internal.b;
import ti.n;
import ui.a;
import wi.a2;
import wi.e0;
import wi.f0;
import wi.h;
import wi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/attachment/Attachment.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/attachment/Attachment;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class Attachment$$serializer implements f0<Attachment> {
    public static final Attachment$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        Attachment$$serializer attachment$$serializer = new Attachment$$serializer();
        INSTANCE = attachment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.attachment.Attachment", attachment$$serializer, 27);
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
        pluginGeneratedSerialDescriptor.l(ViewProps.BACKGROUND_COLOR, true);
        pluginGeneratedSerialDescriptor.l("attachmentTagText", true);
        pluginGeneratedSerialDescriptor.l("attachmentTagBackgroundColor", true);
        pluginGeneratedSerialDescriptor.l("attachmentTagTextColor", true);
        pluginGeneratedSerialDescriptor.l("attachmentTagIconType", true);
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

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f29764a;
        m0 m0Var = m0.f29839a;
        h hVar = h.f29806a;
        return new KSerializer[]{a2Var, a.u(a2Var), a2Var, a2Var, a.u(m0Var), a.u(m0Var), hVar, a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), hVar, a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(a2Var), a.u(m0Var), a.u(m0Var), a.u(a2Var), a.u(e0.f29789a), a.u(a2Var), hVar, a.u(b.f21731c), a.u(a2Var), a.u(m0Var), a.u(m0Var)};
    }

    @Override 
    public Attachment deserialize(Decoder decoder) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        String str3;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        int i11;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            str3 = b10.m(descriptor2, 0);
            a2 a2Var = a2.f29764a;
            obj7 = b10.n(descriptor2, 1, a2Var, null);
            str2 = b10.m(descriptor2, 2);
            str = b10.m(descriptor2, 3);
            m0 m0Var = m0.f29839a;
            obj8 = b10.n(descriptor2, 4, m0Var, null);
            obj6 = b10.n(descriptor2, 5, m0Var, null);
            z10 = b10.C(descriptor2, 6);
            obj5 = b10.n(descriptor2, 7, a2Var, null);
            obj3 = b10.n(descriptor2, 8, a2Var, null);
            obj12 = b10.n(descriptor2, 9, a2Var, null);
            obj11 = b10.n(descriptor2, 10, a2Var, null);
            z12 = b10.C(descriptor2, 11);
            obj21 = b10.n(descriptor2, 12, m0Var, null);
            obj9 = b10.n(descriptor2, 13, a2Var, null);
            obj20 = b10.n(descriptor2, 14, a2Var, null);
            obj10 = b10.n(descriptor2, 15, m0Var, null);
            obj16 = b10.n(descriptor2, 16, a2Var, null);
            obj15 = b10.n(descriptor2, 17, m0Var, null);
            obj19 = b10.n(descriptor2, 18, m0Var, null);
            obj18 = b10.n(descriptor2, 19, a2Var, null);
            obj17 = b10.n(descriptor2, 20, e0.f29789a, null);
            obj = b10.n(descriptor2, 21, a2Var, null);
            z11 = b10.C(descriptor2, 22);
            obj14 = b10.n(descriptor2, 23, b.f21731c, null);
            obj4 = b10.n(descriptor2, 24, a2Var, null);
            obj2 = b10.n(descriptor2, 25, m0Var, null);
            obj13 = b10.n(descriptor2, 26, m0Var, null);
            i10 = 134217727;
        } else {
            obj16 = null;
            boolean z13 = true;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj27 = null;
            obj15 = null;
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Object obj32 = null;
            Object obj33 = null;
            Object obj34 = null;
            Object obj35 = null;
            Object obj36 = null;
            Object obj37 = null;
            Object obj38 = null;
            Object obj39 = null;
            int i12 = 0;
            boolean z14 = false;
            z11 = false;
            z10 = false;
            Object obj40 = null;
            while (z13) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        obj22 = obj22;
                        obj23 = obj23;
                        obj24 = obj24;
                        obj26 = obj26;
                        z13 = false;
                        break;
                    case 0:
                        obj22 = obj22;
                        obj23 = obj23;
                        obj24 = obj24;
                        obj26 = obj26;
                        str6 = b10.m(descriptor2, 0);
                        i12 |= 1;
                        break;
                    case 1:
                        obj24 = obj24;
                        obj32 = b10.n(descriptor2, 1, a2.f29764a, obj32);
                        i12 |= 2;
                        obj22 = obj22;
                        obj23 = obj23;
                        obj26 = obj26;
                        obj33 = obj33;
                        break;
                    case 2:
                        obj22 = obj22;
                        obj23 = obj23;
                        obj24 = obj24;
                        obj26 = obj26;
                        str4 = b10.m(descriptor2, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        obj22 = obj22;
                        obj23 = obj23;
                        obj24 = obj24;
                        obj26 = obj26;
                        str5 = b10.m(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        obj24 = obj24;
                        obj33 = b10.n(descriptor2, 4, m0.f29839a, obj33);
                        i12 |= 16;
                        obj22 = obj22;
                        obj23 = obj23;
                        obj26 = obj26;
                        obj34 = obj34;
                        break;
                    case 5:
                        obj24 = obj24;
                        obj34 = b10.n(descriptor2, 5, m0.f29839a, obj34);
                        i12 |= 32;
                        obj22 = obj22;
                        obj23 = obj23;
                        obj26 = obj26;
                        obj35 = obj35;
                        break;
                    case 6:
                        obj22 = obj22;
                        obj23 = obj23;
                        obj24 = obj24;
                        obj26 = obj26;
                        z10 = b10.C(descriptor2, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        obj24 = obj24;
                        obj35 = b10.n(descriptor2, 7, a2.f29764a, obj35);
                        i12 |= 128;
                        obj22 = obj22;
                        obj23 = obj23;
                        obj26 = obj26;
                        obj36 = obj36;
                        break;
                    case 8:
                        obj24 = obj24;
                        obj36 = b10.n(descriptor2, 8, a2.f29764a, obj36);
                        i12 |= 256;
                        obj22 = obj22;
                        obj23 = obj23;
                        obj26 = obj26;
                        obj37 = obj37;
                        break;
                    case 9:
                        obj22 = obj22;
                        obj23 = obj23;
                        obj26 = obj26;
                        obj24 = obj24;
                        obj37 = b10.n(descriptor2, 9, a2.f29764a, obj37);
                        i12 |= 512;
                        break;
                    case 10:
                        obj38 = b10.n(descriptor2, 10, a2.f29764a, obj38);
                        i12 |= 1024;
                        obj22 = obj22;
                        obj23 = obj23;
                        obj26 = obj26;
                        obj39 = obj39;
                        break;
                    case 11:
                        obj22 = obj22;
                        obj23 = obj23;
                        obj26 = obj26;
                        z14 = b10.C(descriptor2, 11);
                        i12 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        break;
                    case 12:
                        obj22 = obj22;
                        obj23 = obj23;
                        obj26 = obj26;
                        obj39 = b10.n(descriptor2, 12, m0.f29839a, obj39);
                        i12 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        break;
                    case 13:
                        obj26 = b10.n(descriptor2, 13, a2.f29764a, obj26);
                        i12 |= 8192;
                        obj22 = obj22;
                        obj23 = obj23;
                        break;
                    case 14:
                        obj29 = b10.n(descriptor2, 14, a2.f29764a, obj29);
                        i12 |= 16384;
                        obj22 = obj22;
                        obj26 = obj26;
                        break;
                    case 15:
                        obj29 = obj29;
                        obj28 = b10.n(descriptor2, 15, m0.f29839a, obj28);
                        i11 = 32768;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 16:
                        obj29 = obj29;
                        obj16 = b10.n(descriptor2, 16, a2.f29764a, obj16);
                        i11 = 65536;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 17:
                        obj29 = obj29;
                        obj15 = b10.n(descriptor2, 17, m0.f29839a, obj15);
                        i11 = 131072;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 18:
                        obj29 = obj29;
                        obj40 = b10.n(descriptor2, 18, m0.f29839a, obj40);
                        i11 = 262144;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 19:
                        obj29 = obj29;
                        obj22 = b10.n(descriptor2, 19, a2.f29764a, obj22);
                        i11 = 524288;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 20:
                        obj29 = obj29;
                        obj27 = b10.n(descriptor2, 20, e0.f29789a, obj27);
                        i11 = 1048576;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 21:
                        obj29 = obj29;
                        obj24 = b10.n(descriptor2, 21, a2.f29764a, obj24);
                        i11 = 2097152;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 22:
                        z11 = b10.C(descriptor2, 22);
                        i12 |= 4194304;
                        obj26 = obj26;
                        break;
                    case 23:
                        obj29 = obj29;
                        obj25 = b10.n(descriptor2, 23, b.f21731c, obj25);
                        i11 = 8388608;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 24:
                        obj29 = obj29;
                        obj23 = b10.n(descriptor2, 24, a2.f29764a, obj23);
                        i11 = 16777216;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 25:
                        obj29 = obj29;
                        obj31 = b10.n(descriptor2, 25, m0.f29839a, obj31);
                        i11 = 33554432;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    case 26:
                        obj29 = obj29;
                        obj30 = b10.n(descriptor2, 26, m0.f29839a, obj30);
                        i11 = 67108864;
                        i12 |= i11;
                        obj26 = obj26;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj = obj24;
            obj8 = obj33;
            obj6 = obj34;
            obj5 = obj35;
            obj3 = obj36;
            obj7 = obj32;
            obj11 = obj38;
            obj17 = obj27;
            obj19 = obj40;
            obj10 = obj28;
            obj20 = obj29;
            obj4 = obj23;
            obj9 = obj26;
            obj12 = obj37;
            obj21 = obj39;
            z12 = z14;
            str3 = str6;
            obj14 = obj25;
            i10 = i12;
            obj2 = obj31;
            obj18 = obj22;
            str2 = str4;
            str = str5;
            obj13 = obj30;
        }
        b10.c(descriptor2);
        return new Attachment(i10, str3, (String) obj7, str2, str, (Integer) obj8, (Integer) obj6, z10, (String) obj5, (String) obj3, (String) obj12, (String) obj11, z12, (Integer) obj21, (String) obj9, (String) obj20, (Integer) obj10, (String) obj16, (Integer) obj15, (Integer) obj19, (String) obj18, (Float) obj17, (String) obj, z11, (byte[]) obj14, (String) obj4, (Integer) obj2, (Integer) obj13, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Attachment value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        Attachment.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
