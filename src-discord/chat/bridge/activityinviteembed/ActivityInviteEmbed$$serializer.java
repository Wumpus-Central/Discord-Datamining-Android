package com.discord.chat.bridge.activityinviteembed;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.n;
import ui.a;
import wi.a2;
import wi.f;
import wi.f0;
import wi.h;
import wi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ActivityInviteEmbed$$serializer implements f0<ActivityInviteEmbed> {
    public static final ActivityInviteEmbed$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        ActivityInviteEmbed$$serializer activityInviteEmbed$$serializer = new ActivityInviteEmbed$$serializer();
        INSTANCE = activityInviteEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed", activityInviteEmbed$$serializer, 10);
        pluginGeneratedSerialDescriptor.l("coverImage", true);
        pluginGeneratedSerialDescriptor.l("isListening", false);
        pluginGeneratedSerialDescriptor.l("headerText", false);
        pluginGeneratedSerialDescriptor.l("partyStatus", false);
        pluginGeneratedSerialDescriptor.l("avatarsToRender", true);
        pluginGeneratedSerialDescriptor.l("maxPartySize", false);
        pluginGeneratedSerialDescriptor.l(ZeroconfModule.KEY_SERVICE_NAME, true);
        pluginGeneratedSerialDescriptor.l("subtext", true);
        pluginGeneratedSerialDescriptor.l("joinable", false);
        pluginGeneratedSerialDescriptor.l("ctaText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityInviteEmbed$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f29540a;
        h hVar = h.f29582a;
        return new KSerializer[]{a.u(a2Var), hVar, a2Var, a2Var, a.u(new f(a.u(a2Var))), m0.f29615a, a.u(a2Var), a.u(a2Var), hVar, a2Var};
    }

    @Override 
    public ActivityInviteEmbed deserialize(Decoder decoder) {
        String str;
        boolean z10;
        Object obj;
        int i10;
        Object obj2;
        String str2;
        String str3;
        boolean z11;
        Object obj3;
        int i11;
        Object obj4;
        char c10;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c11 = decoder.c(descriptor2);
        int i12 = 9;
        int i13 = 7;
        int i14 = 6;
        if (c11.y()) {
            a2 a2Var = a2.f29540a;
            obj = c11.v(descriptor2, 0, a2Var, null);
            z11 = c11.s(descriptor2, 1);
            str3 = c11.t(descriptor2, 2);
            str2 = c11.t(descriptor2, 3);
            obj2 = c11.v(descriptor2, 4, new f(a.u(a2Var)), null);
            i10 = c11.k(descriptor2, 5);
            obj3 = c11.v(descriptor2, 6, a2Var, null);
            obj4 = c11.v(descriptor2, 7, a2Var, null);
            z10 = c11.s(descriptor2, 8);
            str = c11.t(descriptor2, 9);
            i11 = 1023;
        } else {
            boolean z12 = true;
            boolean z13 = false;
            int i15 = 0;
            boolean z14 = false;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Object obj8 = null;
            int i16 = 0;
            while (z12) {
                int x10 = c11.x(descriptor2);
                switch (x10) {
                    case -1:
                        z12 = false;
                        i13 = 7;
                        i14 = 6;
                    case 0:
                        obj7 = c11.v(descriptor2, 0, a2.f29540a, obj7);
                        i15 |= 1;
                        i12 = 9;
                        i13 = 7;
                        i14 = 6;
                    case 1:
                        z14 = c11.s(descriptor2, 1);
                        i15 |= 2;
                        i12 = 9;
                    case 2:
                        c10 = 3;
                        str4 = c11.t(descriptor2, 2);
                        i15 |= 4;
                        i12 = 9;
                    case 3:
                        c10 = 3;
                        str5 = c11.t(descriptor2, 3);
                        i15 |= 8;
                        i12 = 9;
                    case 4:
                        obj8 = c11.v(descriptor2, 4, new f(a.u(a2.f29540a)), obj8);
                        i15 |= 16;
                        i12 = 9;
                    case 5:
                        i16 = c11.k(descriptor2, 5);
                        i15 |= 32;
                    case 6:
                        obj6 = c11.v(descriptor2, i14, a2.f29540a, obj6);
                        i15 |= 64;
                    case 7:
                        obj5 = c11.v(descriptor2, i13, a2.f29540a, obj5);
                        i15 |= 128;
                    case 8:
                        z13 = c11.s(descriptor2, 8);
                        i15 |= 256;
                    case 9:
                        str6 = c11.t(descriptor2, i12);
                        i15 |= 512;
                    default:
                        throw new n(x10);
                }
            }
            obj2 = obj8;
            i11 = i15;
            z11 = z14;
            str3 = str4;
            str2 = str5;
            str = str6;
            obj = obj7;
            obj3 = obj6;
            z10 = z13;
            obj4 = obj5;
            i10 = i16;
        }
        c11.b(descriptor2);
        return new ActivityInviteEmbed(i11, (String) obj, z11, str3, str2, (List) obj2, i10, (String) obj3, (String) obj4, z10, str, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ActivityInviteEmbed value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        ActivityInviteEmbed.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
