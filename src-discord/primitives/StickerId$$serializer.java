package com.discord.primitives;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import si.f0;
import si.w0;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002HÖ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"com/discord/primitives/StickerId.$serializer", "Lsi/f0;", "Lcom/discord/primitives/StickerId;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-aEuejx8", "(Lkotlinx/serialization/encoding/Decoder;)J", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-Pw5-X2A", "(Lkotlinx/serialization/encoding/Encoder;J)V", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "primitives_release"}, k = 1, mv = {1, 8, 0})

public final class StickerId$$serializer implements f0<StickerId> {
    public static final StickerId$$serializer INSTANCE;
    private static final  InlineClassDescriptor descriptor;

    static {
        StickerId$$serializer stickerId$$serializer = new StickerId$$serializer();
        INSTANCE = stickerId$$serializer;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.discord.primitives.StickerId", stickerId$$serializer);
        inlineClassDescriptor.l("snowflake", false);
        descriptor = inlineClassDescriptor;
    }

    private StickerId$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{w0.f26346a};
    }

    @Override 
    public   Object deserialize(Decoder decoder) {
        return StickerId.m615boximpl(m625deserializeaEuejx8(decoder));
    }

    
    public long m625deserializeaEuejx8(Decoder decoder) {
        q.g(decoder, "decoder");
        return StickerId.m616constructorimpl(decoder.z(getDescriptor()).r());
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override 
    public   void serialize(Encoder encoder, Object obj) {
        m626serializePw5X2A(encoder, ((StickerId) obj).m624unboximpl());
    }

    
    public void m626serializePw5X2A(Encoder encoder, long j10) {
        q.g(encoder, "encoder");
        Encoder y10 = encoder.y(getDescriptor());
        if (y10 != null) {
            y10.C(j10);
        }
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
