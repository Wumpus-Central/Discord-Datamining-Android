package com.discord.chat.bridge.automod;

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
import pi.n;
import qi.a;
import si.a2;
import si.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/automod/AutoModerationContext.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class AutoModerationContext$$serializer implements f0<AutoModerationContext> {
    public static final AutoModerationContext$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        AutoModerationContext$$serializer autoModerationContext$$serializer = new AutoModerationContext$$serializer();
        INSTANCE = autoModerationContext$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.AutoModerationContext", autoModerationContext$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("headerText", false);
        pluginGeneratedSerialDescriptor.l("headerBadgeText", false);
        pluginGeneratedSerialDescriptor.l("ruleDisplayText", true);
        pluginGeneratedSerialDescriptor.l("keywordDisplayText", true);
        pluginGeneratedSerialDescriptor.l("actionsIconURL", true);
        pluginGeneratedSerialDescriptor.l("actionsText", false);
        pluginGeneratedSerialDescriptor.l("feedbackText", false);
        pluginGeneratedSerialDescriptor.l("message", false);
        pluginGeneratedSerialDescriptor.l("notification", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AutoModerationContext$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26237a;
        return new KSerializer[]{a2Var, a2Var, a.u(a2Var), a.u(a2Var), a.u(a2Var), a2Var, a2Var, FlaggedMessageEmbed$$serializer.INSTANCE, a.u(AutoModerationNotification$$serializer.INSTANCE)};
    }

    @Override 
    public AutoModerationContext deserialize(Decoder decoder) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        String str3;
        String str4;
        int i10;
        Object obj3;
        Object obj4;
        Object obj5;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i11 = 7;
        String str5 = null;
        if (c10.y()) {
            str4 = c10.t(descriptor2, 0);
            str3 = c10.t(descriptor2, 1);
            a2 a2Var = a2.f26237a;
            obj = c10.v(descriptor2, 2, a2Var, null);
            obj4 = c10.v(descriptor2, 3, a2Var, null);
            obj2 = c10.v(descriptor2, 4, a2Var, null);
            str = c10.t(descriptor2, 5);
            str2 = c10.t(descriptor2, 6);
            obj5 = c10.m(descriptor2, 7, FlaggedMessageEmbed$$serializer.INSTANCE, null);
            obj3 = c10.v(descriptor2, 8, AutoModerationNotification$$serializer.INSTANCE, null);
            i10 = 511;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object obj6 = null;
            Object obj7 = null;
            obj2 = null;
            String str6 = null;
            obj = null;
            Object obj8 = null;
            str = null;
            String str7 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str5 = c10.t(descriptor2, 0);
                        i12 |= 1;
                        i11 = 7;
                        break;
                    case 1:
                        str6 = c10.t(descriptor2, 1);
                        i12 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        obj = c10.v(descriptor2, 2, a2.f26237a, obj);
                        i12 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        obj8 = c10.v(descriptor2, 3, a2.f26237a, obj8);
                        i12 |= 8;
                        i11 = 7;
                        continue;
                    case 4:
                        obj2 = c10.v(descriptor2, 4, a2.f26237a, obj2);
                        i12 |= 16;
                        break;
                    case 5:
                        str = c10.t(descriptor2, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        str7 = c10.t(descriptor2, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        obj7 = c10.m(descriptor2, i11, FlaggedMessageEmbed$$serializer.INSTANCE, obj7);
                        i12 |= 128;
                        break;
                    case 8:
                        obj6 = c10.v(descriptor2, 8, AutoModerationNotification$$serializer.INSTANCE, obj6);
                        i12 |= 256;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            i10 = i12;
            obj3 = obj6;
            obj5 = obj7;
            str4 = str5;
            str3 = str6;
            obj4 = obj8;
            str2 = str7;
        }
        c10.b(descriptor2);
        return new AutoModerationContext(i10, str4, str3, (String) obj, (String) obj4, (String) obj2, str, str2, (FlaggedMessageEmbed) obj5, (AutoModerationNotification) obj3, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, AutoModerationContext value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        AutoModerationContext.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
