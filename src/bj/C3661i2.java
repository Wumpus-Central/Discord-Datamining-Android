package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9970p;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nf.C11056b0;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, m15073d2 = {"Lbj/i2;", "Lkotlinx/serialization/KSerializer;", "Lnf/b0;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "(Lkotlinx/serialization/encoding/Encoder;I)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)I", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.i2 */
/* loaded from: classes8.dex */
public final class C3661i2 implements KSerializer<C11056b0> {

    /* renamed from: a */
    public static final C3661i2 f5975a = new C3661i2();

    /* renamed from: b */
    private static final SerialDescriptor f5976b = C3667k0.m33855a("kotlin.UInt", C14667a.m42B(C9970p.f22094a));

    private C3661i2() {
    }

    /* renamed from: a */
    public int m33868a(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        return C11056b0.m11030b(decoder.mo13900q(getDescriptor()).mo13903h());
    }

    /* renamed from: b */
    public void m33867b(Encoder encoder, int i) {
        C9971q.m14633g(encoder, "encoder");
        encoder.mo13879j(getDescriptor()).mo13892B(i);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return C11056b0.m11031a(m33868a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5976b;
    }

    @Override // p449yi.AbstractC14437h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m33867b(encoder, ((C11056b0) obj).m11026f());
    }
}
