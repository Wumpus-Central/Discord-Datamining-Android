package com.discord.chat.bridge.reaction;

import bj.AbstractC2522f0;
import bj.C2555m0;
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
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/reaction/ReactionsTheme.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ReactionsTheme$$serializer implements AbstractC2522f0<ReactionsTheme> {
    public static final ReactionsTheme$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ReactionsTheme$$serializer reactionsTheme$$serializer = new ReactionsTheme$$serializer();
        INSTANCE = reactionsTheme$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.ReactionsTheme", reactionsTheme$$serializer, 6);
        pluginGeneratedSerialDescriptor.m13841l("reactionBackgroundColor", true);
        pluginGeneratedSerialDescriptor.m13841l("reactionBorderColor", true);
        pluginGeneratedSerialDescriptor.m13841l("reactionTextColor", true);
        pluginGeneratedSerialDescriptor.m13841l("activeReactionBackgroundColor", true);
        pluginGeneratedSerialDescriptor.m13841l("activeReactionBorderColor", true);
        pluginGeneratedSerialDescriptor.m13841l("activeReactionTextColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReactionsTheme$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2555m0 m0Var = C2555m0.f6794a;
        return new KSerializer[]{C14606a.m13u(m0Var), C14606a.m13u(m0Var), C14606a.m13u(m0Var), C14606a.m13u(m0Var), C14606a.m13u(m0Var), C14606a.m13u(m0Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ReactionsTheme deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i2 = 5;
        Object obj7 = null;
        if (b.mo13850p()) {
            C2555m0 m0Var = C2555m0.f6794a;
            obj2 = b.mo13852n(descriptor2, 0, m0Var, null);
            obj3 = b.mo13852n(descriptor2, 1, m0Var, null);
            obj4 = b.mo13852n(descriptor2, 2, m0Var, null);
            obj = b.mo13852n(descriptor2, 3, m0Var, null);
            obj5 = b.mo13852n(descriptor2, 4, m0Var, null);
            obj6 = b.mo13852n(descriptor2, 5, m0Var, null);
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj8 = null;
            Object obj9 = null;
            obj = null;
            Object obj10 = null;
            Object obj11 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        obj7 = b.mo13852n(descriptor2, 0, C2555m0.f6794a, obj7);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        obj8 = b.mo13852n(descriptor2, 1, C2555m0.f6794a, obj8);
                        i3 |= 2;
                    case 2:
                        obj9 = b.mo13852n(descriptor2, 2, C2555m0.f6794a, obj9);
                        i3 |= 4;
                    case 3:
                        obj = b.mo13852n(descriptor2, 3, C2555m0.f6794a, obj);
                        i3 |= 8;
                    case 4:
                        obj10 = b.mo13852n(descriptor2, 4, C2555m0.f6794a, obj10);
                        i3 |= 16;
                    case 5:
                        obj11 = b.mo13852n(descriptor2, i2, C2555m0.f6794a, obj11);
                        i3 |= 32;
                    default:
                        throw new C14382n(o);
                }
            }
            i = i3;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            obj5 = obj10;
            obj6 = obj11;
        }
        b.mo13857c(descriptor2);
        return new ReactionsTheme(i, (Integer) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj, (Integer) obj5, (Integer) obj6, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ReactionsTheme value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ReactionsTheme.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
