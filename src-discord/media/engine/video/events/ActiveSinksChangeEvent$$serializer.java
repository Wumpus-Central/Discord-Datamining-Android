package com.discord.media.engine.video.events;

import bj.a2;
import bj.f0;
import bj.h;
import com.facebook.react.modules.appstate.AppStateModule;
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

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/media/engine/video/events/ActiveSinksChangeEvent.$serializer", "Lbj/f0;", "Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ActiveSinksChangeEvent$$serializer implements f0<ActiveSinksChangeEvent> {
    public static final ActiveSinksChangeEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ActiveSinksChangeEvent$$serializer activeSinksChangeEvent$$serializer = new ActiveSinksChangeEvent$$serializer();
        INSTANCE = activeSinksChangeEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.ActiveSinksChangeEvent", activeSinksChangeEvent$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("streamId", false);
        pluginGeneratedSerialDescriptor.l(AppStateModule.APP_STATE_ACTIVE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActiveSinksChangeEvent$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a2.f5917a, h.f5959a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ActiveSinksChangeEvent deserialize(Decoder decoder) {
        int i10;
        boolean z10;
        String str;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            str = b10.m(descriptor2, 0);
            z10 = b10.C(descriptor2, 1);
            i10 = 3;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            int i11 = 0;
            str = null;
            while (z11) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z11 = false;
                } else if (o10 == 0) {
                    str = b10.m(descriptor2, 0);
                    i11 |= 1;
                } else if (o10 == 1) {
                    z12 = b10.C(descriptor2, 1);
                    i11 |= 2;
                } else {
                    throw new n(o10);
                }
            }
            z10 = z12;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new ActiveSinksChangeEvent(i10, str, z10, null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ActiveSinksChangeEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        ActiveSinksChangeEvent.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
