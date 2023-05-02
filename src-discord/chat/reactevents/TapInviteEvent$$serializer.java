package com.discord.chat.reactevents;

import bj.a2;
import bj.f0;
import bj.h;
import bj.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import yi.n;
import zi.a;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/reactevents/TapInviteEvent.$serializer", "Lbj/f0;", "Lcom/discord/chat/reactevents/TapInviteEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class TapInviteEvent$$serializer implements f0<TapInviteEvent> {
    public static final TapInviteEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TapInviteEvent$$serializer tapInviteEvent$$serializer = new TapInviteEvent$$serializer();
        INSTANCE = tapInviteEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapInviteEvent", tapInviteEvent$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("messageId", false);
        pluginGeneratedSerialDescriptor.l("index", false);
        pluginGeneratedSerialDescriptor.l("primary", false);
        pluginGeneratedSerialDescriptor.l("secondary", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TapInviteEvent$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        h hVar = h.f5959a;
        return new KSerializer[]{a2.f5917a, m0.f5992a, a.u(hVar), a.u(hVar)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TapInviteEvent deserialize(Decoder decoder) {
        int i10;
        String str;
        int i11;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            str = b10.m(descriptor2, 0);
            i10 = b10.i(descriptor2, 1);
            h hVar = h.f5959a;
            obj = b10.n(descriptor2, 2, hVar, null);
            obj2 = b10.n(descriptor2, 3, hVar, null);
            i11 = 15;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str2 = null;
            Object obj3 = null;
            Object obj4 = null;
            int i13 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    str2 = b10.m(descriptor2, 0);
                    i13 |= 1;
                } else if (o10 == 1) {
                    i12 = b10.i(descriptor2, 1);
                    i13 |= 2;
                } else if (o10 == 2) {
                    obj3 = b10.n(descriptor2, 2, h.f5959a, obj3);
                    i13 |= 4;
                } else if (o10 == 3) {
                    obj4 = b10.n(descriptor2, 3, h.f5959a, obj4);
                    i13 |= 8;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i12;
            i11 = i13;
            str = str2;
            obj = obj3;
            obj2 = obj4;
        }
        b10.c(descriptor2);
        return new TapInviteEvent(i11, str, i10, (Boolean) obj, (Boolean) obj2, null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TapInviteEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        TapInviteEvent.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
