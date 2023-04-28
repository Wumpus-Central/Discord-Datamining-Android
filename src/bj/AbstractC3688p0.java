package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0007\u001a\u00028\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0005\u001a\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001aR\u0018\u0010\u0006\u001a\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a\u0082\u0001\u0002\u001d\u001e¨\u0006\u001f"}, m15073d2 = {"Lbj/p0;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "key", "value", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "keySerializer", "b", "getValueSerializer", "valueSerializer", "(Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lbj/x0;", "Lbj/i1;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.p0 */
/* loaded from: classes8.dex */
public abstract class AbstractC3688p0<K, V, R> implements KSerializer<R> {

    /* renamed from: a */
    private final KSerializer<K> f6008a;

    /* renamed from: b */
    private final KSerializer<V> f6009b;

    private AbstractC3688p0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.f6008a = kSerializer;
        this.f6009b = kSerializer2;
    }

    public /* synthetic */ AbstractC3688p0(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    /* renamed from: a */
    protected abstract K mo33759a(R r);

    /* renamed from: b */
    protected abstract V mo33758b(R r);

    /* renamed from: c */
    protected abstract R mo33757c(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.DeserializationStrategy
    public R deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C9971q.m14633g(decoder, "decoder");
        AbstractC10248c b = decoder.mo13905b(getDescriptor());
        if (b.mo13850p()) {
            return (R) mo33757c(AbstractC10248c.C10249a.m13844c(b, getDescriptor(), 0, this.f6008a, null, 8, null), AbstractC10248c.C10249a.m13844c(b, getDescriptor(), 1, this.f6009b, null, 8, null));
        }
        obj = C3642e2.f5947a;
        obj2 = C3642e2.f5947a;
        Object obj5 = obj2;
        while (true) {
            int o = b.mo13851o(getDescriptor());
            if (o == -1) {
                b.mo13857c(getDescriptor());
                obj3 = C3642e2.f5947a;
                if (obj != obj3) {
                    obj4 = C3642e2.f5947a;
                    if (obj5 != obj4) {
                        return (R) mo33757c(obj, obj5);
                    }
                    throw new C14436g("Element 'value' is missing");
                }
                throw new C14436g("Element 'key' is missing");
            } else if (o == 0) {
                obj = AbstractC10248c.C10249a.m13844c(b, getDescriptor(), 0, this.f6008a, null, 8, null);
            } else if (o == 1) {
                obj5 = AbstractC10248c.C10249a.m13844c(b, getDescriptor(), 1, this.f6009b, null, 8, null);
            } else {
                throw new C14436g("Invalid index: " + o);
            }
        }
    }

    @Override // p449yi.AbstractC14437h
    public void serialize(Encoder encoder, R r) {
        C9971q.m14633g(encoder, "encoder");
        CompositeEncoder b = encoder.mo13885b(getDescriptor());
        b.mo13870t(getDescriptor(), 0, this.f6008a, mo33759a(r));
        b.mo13870t(getDescriptor(), 1, this.f6009b, mo33758b(r));
        b.mo13884c(getDescriptor());
    }
}
