package com.discord.chat.bridge.activityinviteembed;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3643f;
import bj.C3652h;
import bj.C3676m0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p163j$.util.Spliterator;
import p449yi.C14447n;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ActivityInviteEmbed$$serializer implements AbstractC3644f0<ActivityInviteEmbed> {
    public static final ActivityInviteEmbed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ActivityInviteEmbed$$serializer activityInviteEmbed$$serializer = new ActivityInviteEmbed$$serializer();
        INSTANCE = activityInviteEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed", activityInviteEmbed$$serializer, 10);
        pluginGeneratedSerialDescriptor.m13841l("coverImage", true);
        pluginGeneratedSerialDescriptor.m13841l("isListening", false);
        pluginGeneratedSerialDescriptor.m13841l("headerText", false);
        pluginGeneratedSerialDescriptor.m13841l("partyStatus", false);
        pluginGeneratedSerialDescriptor.m13841l("avatarsToRender", true);
        pluginGeneratedSerialDescriptor.m13841l("maxPartySize", false);
        pluginGeneratedSerialDescriptor.m13841l("name", true);
        pluginGeneratedSerialDescriptor.m13841l("subtext", true);
        pluginGeneratedSerialDescriptor.m13841l("joinable", false);
        pluginGeneratedSerialDescriptor.m13841l("ctaText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityInviteEmbed$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        C3652h hVar = C3652h.f5959a;
        return new KSerializer[]{C14667a.m13u(a2Var), hVar, a2Var, a2Var, C14667a.m13u(new C3643f(C14667a.m13u(a2Var))), C3676m0.f5992a, C14667a.m13u(a2Var), C14667a.m13u(a2Var), hVar, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ActivityInviteEmbed deserialize(Decoder decoder) {
        String str;
        boolean z;
        Object obj;
        int i;
        Object obj2;
        String str2;
        String str3;
        boolean z2;
        Object obj3;
        int i2;
        Object obj4;
        char c;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        if (b.mo13850p()) {
            C3622a2 a2Var = C3622a2.f5917a;
            obj = b.mo13852n(descriptor2, 0, a2Var, null);
            z2 = b.mo13861C(descriptor2, 1);
            str3 = b.mo13853m(descriptor2, 2);
            str2 = b.mo13853m(descriptor2, 3);
            obj2 = b.mo13852n(descriptor2, 4, new C3643f(C14667a.m13u(a2Var)), null);
            i = b.mo13855i(descriptor2, 5);
            obj3 = b.mo13852n(descriptor2, 6, a2Var, null);
            obj4 = b.mo13852n(descriptor2, 7, a2Var, null);
            z = b.mo13861C(descriptor2, 8);
            str = b.mo13853m(descriptor2, 9);
            i2 = 1023;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i6 = 0;
            boolean z5 = false;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Object obj8 = null;
            int i7 = 0;
            while (z3) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z3 = false;
                        i4 = 7;
                        i5 = 6;
                    case 0:
                        obj7 = b.mo13852n(descriptor2, 0, C3622a2.f5917a, obj7);
                        i6 |= 1;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 1:
                        z5 = b.mo13861C(descriptor2, 1);
                        i6 |= 2;
                        i3 = 9;
                    case 2:
                        c = 3;
                        str4 = b.mo13853m(descriptor2, 2);
                        i6 |= 4;
                        i3 = 9;
                    case 3:
                        c = 3;
                        str5 = b.mo13853m(descriptor2, 3);
                        i6 |= 8;
                        i3 = 9;
                    case 4:
                        obj8 = b.mo13852n(descriptor2, 4, new C3643f(C14667a.m13u(C3622a2.f5917a)), obj8);
                        i6 |= 16;
                        i3 = 9;
                    case 5:
                        i7 = b.mo13855i(descriptor2, 5);
                        i6 |= 32;
                    case 6:
                        obj6 = b.mo13852n(descriptor2, i5, C3622a2.f5917a, obj6);
                        i6 |= 64;
                    case 7:
                        obj5 = b.mo13852n(descriptor2, i4, C3622a2.f5917a, obj5);
                        i6 |= 128;
                    case 8:
                        z4 = b.mo13861C(descriptor2, 8);
                        i6 |= Spliterator.NONNULL;
                    case 9:
                        str6 = b.mo13853m(descriptor2, i3);
                        i6 |= 512;
                    default:
                        throw new C14447n(o);
                }
            }
            obj2 = obj8;
            i2 = i6;
            z2 = z5;
            str3 = str4;
            str2 = str5;
            str = str6;
            obj = obj7;
            obj3 = obj6;
            z = z4;
            obj4 = obj5;
            i = i7;
        }
        b.mo13857c(descriptor2);
        return new ActivityInviteEmbed(i2, (String) obj, z2, str3, str2, (List) obj2, i, (String) obj3, (String) obj4, z, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ActivityInviteEmbed value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ActivityInviteEmbed.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
