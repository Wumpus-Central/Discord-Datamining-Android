package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.AbstractC1413e;
import si.C12905a;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, m15073d2 = {"Lbj/y;", "Lkotlinx/serialization/KSerializer;", "Lsi/a;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "(Lkotlinx/serialization/encoding/Encoder;J)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)J", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.y */
/* loaded from: classes8.dex */
public final class C3717y implements KSerializer<C12905a> {

    /* renamed from: a */
    public static final C3717y f6045a = new C3717y();

    /* renamed from: b */
    private static final SerialDescriptor f6046b = new C3702t1("kotlin.time.Duration", AbstractC1413e.C1421i.f471a);

    private C3717y() {
    }

    /* renamed from: a */
    public long m33751a(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        return C12905a.f28981l.m5110c(decoder.mo13894z());
    }

    /* renamed from: b */
    public void m33750b(Encoder encoder, long j) {
        C9971q.m14633g(encoder, "encoder");
        encoder.mo13888F(C12905a.m5142F(j));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return C12905a.m5133e(m33751a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f6046b;
    }

    @Override // p449yi.AbstractC14437h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m33750b(encoder, ((C12905a) obj).m5138K());
    }
}
