package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.AbstractC1413e;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m15073d2 = {"Lbj/w0;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Long;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.w0 */
/* loaded from: classes8.dex */
public final class C3710w0 implements KSerializer<Long> {

    /* renamed from: a */
    public static final C3710w0 f6033a = new C3710w0();

    /* renamed from: b */
    private static final SerialDescriptor f6034b = new C3702t1("kotlin.Long", AbstractC1413e.C1419g.f469a);

    private C3710w0() {
    }

    /* renamed from: a */
    public Long deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        return Long.valueOf(decoder.mo13901l());
    }

    /* renamed from: b */
    public void m33763b(Encoder encoder, long j) {
        C9971q.m14633g(encoder, "encoder");
        encoder.mo13878k(j);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f6034b;
    }

    @Override // p449yi.AbstractC14437h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m33763b(encoder, ((Number) obj).longValue());
    }
}
