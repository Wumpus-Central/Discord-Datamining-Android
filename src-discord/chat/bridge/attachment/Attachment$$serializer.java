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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.attachment.Attachment", attachment$$serializer, 23);
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
        a2 a2Var = a2.f29550a;
        m0 m0Var = m0.f29625a;
        h hVar = h.f29592a;
        return new KSerializer[]{a2Var, a.u(a2Var), a2Var, a2Var, a.u(m0Var), a.u(m0Var), hVar, a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), hVar, a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(e0.f29575a), a.u(a2Var), hVar, a.u(b.f21528c), a.u(a2Var), a.u(m0Var), a.u(m0Var)};
    }

    @Override 
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
        Object obj10;
        int i10;
        Object obj11;
        Object obj12;
        String str3;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        int i11;
        int i12;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            str3 = c10.t(descriptor2, 0);
            a2 a2Var = a2.f29550a;
            obj9 = c10.v(descriptor2, 1, a2Var, null);
            str2 = c10.t(descriptor2, 2);
            str = c10.t(descriptor2, 3);
            m0 m0Var = m0.f29625a;
            obj5 = c10.v(descriptor2, 4, m0Var, null);
            obj4 = c10.v(descriptor2, 5, m0Var, null);
            z10 = c10.s(descriptor2, 6);
            obj10 = c10.v(descriptor2, 7, a2Var, null);
            obj3 = c10.v(descriptor2, 8, a2Var, null);
            obj2 = c10.v(descriptor2, 9, a2Var, null);
            obj8 = c10.v(descriptor2, 10, a2Var, null);
            z12 = c10.s(descriptor2, 11);
            obj17 = c10.v(descriptor2, 12, m0Var, null);
            obj6 = c10.v(descriptor2, 13, a2Var, null);
            obj16 = c10.v(descriptor2, 14, a2Var, null);
            obj15 = c10.v(descriptor2, 15, m0Var, null);
            obj14 = c10.v(descriptor2, 16, e0.f29575a, null);
            obj11 = c10.v(descriptor2, 17, a2Var, null);
            z11 = c10.s(descriptor2, 18);
            obj13 = c10.v(descriptor2, 19, b.f21528c, null);
            obj12 = c10.v(descriptor2, 20, a2Var, null);
            obj7 = c10.v(descriptor2, 21, m0Var, null);
            obj = c10.v(descriptor2, 22, m0Var, null);
            i10 = 8388607;
        } else {
            Object obj18 = null;
            boolean z13 = true;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            obj11 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj27 = null;
            Object obj28 = null;
            str2 = null;
            String str4 = null;
            String str5 = null;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            int i13 = 0;
            z12 = false;
            z11 = false;
            z10 = false;
            Object obj33 = null;
            while (z13) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj21 = obj21;
                        z13 = false;
                        obj22 = obj22;
                        break;
                    case 0:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj21 = obj21;
                        obj22 = obj22;
                        str5 = c10.t(descriptor2, 0);
                        i13 |= 1;
                        break;
                    case 1:
                        obj20 = obj20;
                        obj21 = obj21;
                        obj22 = obj22;
                        obj29 = c10.v(descriptor2, 1, a2.f29550a, obj29);
                        i13 |= 2;
                        obj19 = obj19;
                        obj30 = obj30;
                        break;
                    case 2:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj21 = obj21;
                        obj22 = obj22;
                        str2 = c10.t(descriptor2, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj21 = obj21;
                        obj22 = obj22;
                        str4 = c10.t(descriptor2, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        obj20 = obj20;
                        obj21 = obj21;
                        obj22 = obj22;
                        obj30 = c10.v(descriptor2, 4, m0.f29625a, obj30);
                        i13 |= 16;
                        obj19 = obj19;
                        obj31 = obj31;
                        break;
                    case 5:
                        obj20 = obj20;
                        obj21 = obj21;
                        obj22 = obj22;
                        obj31 = c10.v(descriptor2, 5, m0.f29625a, obj31);
                        i13 |= 32;
                        obj19 = obj19;
                        obj32 = obj32;
                        break;
                    case 6:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj21 = obj21;
                        obj22 = obj22;
                        z10 = c10.s(descriptor2, 6);
                        i13 |= 64;
                        break;
                    case 7:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj21 = obj21;
                        obj22 = obj22;
                        obj32 = c10.v(descriptor2, 7, a2.f29550a, obj32);
                        i13 |= 128;
                        break;
                    case 8:
                        obj19 = obj19;
                        obj21 = obj21;
                        obj20 = obj20;
                        obj22 = c10.v(descriptor2, 8, a2.f29550a, obj22);
                        i13 |= 256;
                        break;
                    case 9:
                        obj20 = c10.v(descriptor2, 9, a2.f29550a, obj20);
                        i13 |= 512;
                        obj19 = obj19;
                        obj21 = obj21;
                        obj22 = obj22;
                        break;
                    case 10:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj28 = c10.v(descriptor2, 10, a2.f29550a, obj28);
                        i13 |= 1024;
                        obj22 = obj22;
                        break;
                    case 11:
                        obj19 = obj19;
                        obj20 = obj20;
                        z12 = c10.s(descriptor2, 11);
                        i13 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        obj22 = obj22;
                        break;
                    case 12:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj27 = c10.v(descriptor2, 12, m0.f29625a, obj27);
                        i13 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        obj22 = obj22;
                        break;
                    case 13:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj23 = c10.v(descriptor2, 13, a2.f29550a, obj23);
                        i13 |= 8192;
                        obj22 = obj22;
                        break;
                    case 14:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj26 = c10.v(descriptor2, 14, a2.f29550a, obj26);
                        i13 |= 16384;
                        obj22 = obj22;
                        break;
                    case 15:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj25 = c10.v(descriptor2, 15, m0.f29625a, obj25);
                        i11 = 32768;
                        i13 |= i11;
                        obj22 = obj22;
                        break;
                    case 16:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj18 = c10.v(descriptor2, 16, e0.f29575a, obj18);
                        i11 = 65536;
                        i13 |= i11;
                        obj22 = obj22;
                        break;
                    case 17:
                        obj19 = obj19;
                        obj20 = obj20;
                        obj11 = c10.v(descriptor2, 17, a2.f29550a, obj11);
                        i11 = 131072;
                        i13 |= i11;
                        obj22 = obj22;
                        break;
                    case 18:
                        obj19 = obj19;
                        obj20 = obj20;
                        z11 = c10.s(descriptor2, 18);
                        i13 |= 262144;
                        obj22 = obj22;
                        break;
                    case 19:
                        obj20 = obj20;
                        obj19 = obj19;
                        obj33 = c10.v(descriptor2, 19, b.f21528c, obj33);
                        i13 |= 524288;
                        obj22 = obj22;
                        break;
                    case 20:
                        obj20 = obj20;
                        obj19 = c10.v(descriptor2, 20, a2.f29550a, obj19);
                        i12 = 1048576;
                        i13 |= i12;
                        obj22 = obj22;
                        break;
                    case 21:
                        obj20 = obj20;
                        obj24 = c10.v(descriptor2, 21, m0.f29625a, obj24);
                        i12 = 2097152;
                        i13 |= i12;
                        obj22 = obj22;
                        break;
                    case 22:
                        obj20 = obj20;
                        obj21 = c10.v(descriptor2, 22, m0.f29625a, obj21);
                        i12 = 4194304;
                        i13 |= i12;
                        obj22 = obj22;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            obj2 = obj20;
            obj = obj21;
            obj3 = obj22;
            obj5 = obj30;
            obj4 = obj31;
            obj9 = obj29;
            obj6 = obj23;
            obj7 = obj24;
            obj14 = obj18;
            obj13 = obj33;
            obj15 = obj25;
            obj16 = obj26;
            obj17 = obj27;
            obj8 = obj28;
            obj10 = obj32;
            str3 = str5;
            i10 = i13;
            str = str4;
            obj12 = obj19;
        }
        c10.b(descriptor2);
        return new Attachment(i10, str3, (String) obj9, str2, str, (Integer) obj5, (Integer) obj4, z10, (String) obj10, (String) obj3, (String) obj2, (String) obj8, z12, (Integer) obj17, (String) obj6, (String) obj16, (Integer) obj15, (Float) obj14, (String) obj11, z11, (byte[]) obj13, (String) obj12, (Integer) obj7, (Integer) obj, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Attachment value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        Attachment.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
