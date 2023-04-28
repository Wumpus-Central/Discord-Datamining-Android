package bj;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m15073d2 = {"Lbj/n2;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "b", "(Lkotlinx/serialization/encoding/Encoder;Lkotlin/Unit;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.n2 */
/* loaded from: classes8.dex */
public final class C3682n2 implements KSerializer<Unit> {

    /* renamed from: b */
    public static final C3682n2 f5999b = new C3682n2();

    /* renamed from: a */
    private final /* synthetic */ C3654h1<Unit> f6000a = new C3654h1<>("kotlin.Unit", Unit.f22042a);

    private C3682n2() {
    }

    /* renamed from: a */
    public void m33817a(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        this.f6000a.deserialize(decoder);
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, Unit value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        this.f6000a.serialize(encoder, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        m33817a(decoder);
        return Unit.f22042a;
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f6000a.getDescriptor();
    }
}
