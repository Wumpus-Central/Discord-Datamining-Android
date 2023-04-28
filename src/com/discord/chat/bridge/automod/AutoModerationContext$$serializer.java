package com.discord.chat.bridge.automod;

import bj.AbstractC2522f0;
import bj.C2500a2;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/automod/AutoModerationContext.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AutoModerationContext$$serializer implements AbstractC2522f0<AutoModerationContext> {
    public static final AutoModerationContext$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AutoModerationContext$$serializer autoModerationContext$$serializer = new AutoModerationContext$$serializer();
        INSTANCE = autoModerationContext$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.AutoModerationContext", autoModerationContext$$serializer, 9);
        pluginGeneratedSerialDescriptor.m13841l("headerText", false);
        pluginGeneratedSerialDescriptor.m13841l("headerBadgeText", false);
        pluginGeneratedSerialDescriptor.m13841l("ruleDisplayText", true);
        pluginGeneratedSerialDescriptor.m13841l("keywordDisplayText", true);
        pluginGeneratedSerialDescriptor.m13841l("actionsIconURL", true);
        pluginGeneratedSerialDescriptor.m13841l("actionsText", false);
        pluginGeneratedSerialDescriptor.m13841l("feedbackText", false);
        pluginGeneratedSerialDescriptor.m13841l("message", false);
        pluginGeneratedSerialDescriptor.m13841l("notification", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AutoModerationContext$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{a2Var, a2Var, C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(a2Var), a2Var, a2Var, FlaggedMessageEmbed$$serializer.INSTANCE, C14606a.m13u(AutoModerationNotification$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AutoModerationContext deserialize(Decoder decoder) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        String str3;
        String str4;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i2 = 7;
        String str5 = null;
        if (b.mo13850p()) {
            str4 = b.mo13853m(descriptor2, 0);
            str3 = b.mo13853m(descriptor2, 1);
            C2500a2 a2Var = C2500a2.f6719a;
            obj = b.mo13852n(descriptor2, 2, a2Var, null);
            obj4 = b.mo13852n(descriptor2, 3, a2Var, null);
            obj2 = b.mo13852n(descriptor2, 4, a2Var, null);
            str = b.mo13853m(descriptor2, 5);
            str2 = b.mo13853m(descriptor2, 6);
            obj5 = b.mo13847y(descriptor2, 7, FlaggedMessageEmbed$$serializer.INSTANCE, null);
            obj3 = b.mo13852n(descriptor2, 8, AutoModerationNotification$$serializer.INSTANCE, null);
            i = 511;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj6 = null;
            Object obj7 = null;
            obj2 = null;
            String str6 = null;
            obj = null;
            Object obj8 = null;
            str = null;
            String str7 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str5 = b.mo13853m(descriptor2, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        str6 = b.mo13853m(descriptor2, 1);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        obj = b.mo13852n(descriptor2, 2, C2500a2.f6719a, obj);
                        i3 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        obj8 = b.mo13852n(descriptor2, 3, C2500a2.f6719a, obj8);
                        i3 |= 8;
                        i2 = 7;
                        continue;
                    case 4:
                        obj2 = b.mo13852n(descriptor2, 4, C2500a2.f6719a, obj2);
                        i3 |= 16;
                        break;
                    case 5:
                        str = b.mo13853m(descriptor2, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        str7 = b.mo13853m(descriptor2, 6);
                        i3 |= 64;
                        break;
                    case 7:
                        obj7 = b.mo13847y(descriptor2, i2, FlaggedMessageEmbed$$serializer.INSTANCE, obj7);
                        i3 |= 128;
                        break;
                    case 8:
                        obj6 = b.mo13852n(descriptor2, 8, AutoModerationNotification$$serializer.INSTANCE, obj6);
                        i3 |= Spliterator.NONNULL;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            i = i3;
            obj3 = obj6;
            obj5 = obj7;
            str4 = str5;
            str3 = str6;
            obj4 = obj8;
            str2 = str7;
        }
        b.mo13857c(descriptor2);
        return new AutoModerationContext(i, str4, str3, (String) obj, (String) obj4, (String) obj2, str, str2, (FlaggedMessageEmbed) obj5, (AutoModerationNotification) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, AutoModerationContext value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        AutoModerationContext.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
