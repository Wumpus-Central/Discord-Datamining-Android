package com.discord.chat.bridge.truncation;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3652h;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.C14447n;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/truncation/Truncation.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/truncation/Truncation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Truncation$$serializer implements AbstractC3644f0<Truncation> {
    public static final Truncation$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Truncation$$serializer truncation$$serializer = new Truncation$$serializer();
        INSTANCE = truncation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.truncation.Truncation", truncation$$serializer, 4);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.NUMBER_OF_LINES, false);
        pluginGeneratedSerialDescriptor.m13841l("seeMoreLabel", false);
        pluginGeneratedSerialDescriptor.m13841l("seeMoreLabelColor", true);
        pluginGeneratedSerialDescriptor.m13841l("forceShow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Truncation$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3676m0 m0Var = C3676m0.f5992a;
        return new KSerializer[]{m0Var, C3622a2.f5917a, C14667a.m13u(m0Var), C14667a.m13u(C3652h.f5959a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Truncation deserialize(Decoder decoder) {
        String str;
        int i;
        int i2;
        Object obj;
        Object obj2;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            i = b.mo13855i(descriptor2, 0);
            str = b.mo13853m(descriptor2, 1);
            obj = b.mo13852n(descriptor2, 2, C3676m0.f5992a, null);
            obj2 = b.mo13852n(descriptor2, 3, C3652h.f5959a, null);
            i2 = 15;
        } else {
            boolean z = true;
            int i3 = 0;
            String str2 = null;
            Object obj3 = null;
            Object obj4 = null;
            int i4 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i3 = b.mo13855i(descriptor2, 0);
                    i4 |= 1;
                } else if (o == 1) {
                    str2 = b.mo13853m(descriptor2, 1);
                    i4 |= 2;
                } else if (o == 2) {
                    obj3 = b.mo13852n(descriptor2, 2, C3676m0.f5992a, obj3);
                    i4 |= 4;
                } else if (o == 3) {
                    obj4 = b.mo13852n(descriptor2, 3, C3652h.f5959a, obj4);
                    i4 |= 8;
                } else {
                    throw new C14447n(o);
                }
            }
            i = i3;
            i2 = i4;
            str = str2;
            obj = obj3;
            obj2 = obj4;
        }
        b.mo13857c(descriptor2);
        return new Truncation(i2, i, str, (Integer) obj, (Boolean) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Truncation value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        Truncation.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
