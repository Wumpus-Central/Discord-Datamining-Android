package bj;

import bj.AbstractC3693q1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\b/\u00100J\u0013\u0010\u0007\u001a\u00020\u0006*\u00028\u0002H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H\u0004¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\f*\u00028\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0001H$¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0006H$¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0001¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00061"}, m15073d2 = {"Lbj/s1;", "Element", "Array", "Lbj/q1;", "Builder", "Lbj/s;", "", "p", "(Lbj/q1;)I", "t", "(Lbj/q1;)Ljava/lang/Object;", "size", "", "q", "(Lbj/q1;I)V", "", "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "s", "(Lbj/q1;ILjava/lang/Object;)V", "o", "()Lbj/q1;", "r", "()Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "u", "(Lkotlinx/serialization/encoding/CompositeEncoder;Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.s1 */
/* loaded from: classes8.dex */
public abstract class AbstractC3699s1<Element, Array, Builder extends AbstractC3693q1<Array>> extends AbstractC3697s<Element, Array, Builder> {

    /* renamed from: b */
    private final SerialDescriptor f6016b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3699s1(KSerializer<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        C9971q.m14633g(primitiveSerializer, "primitiveSerializer");
        this.f6016b = new C3696r1(primitiveSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bj.AbstractC3618a
    /* renamed from: d */
    public final Iterator<Element> mo33777d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // bj.AbstractC3618a, kotlinx.serialization.DeserializationStrategy
    public final Array deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        return m33968f(decoder, null);
    }

    @Override // bj.AbstractC3697s, kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f6016b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final Builder mo33780a() {
        return (Builder) ((AbstractC3693q1) mo13774k(mo13773r()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo33779b(Builder builder) {
        C9971q.m14633g(builder, "<this>");
        return builder.mo33747d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo33778c(Builder builder, int i) {
        C9971q.m14633g(builder, "<this>");
        builder.mo33748b(i);
    }

    /* renamed from: r */
    protected abstract Array mo13773r();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo33775n(Builder builder, int i, Element element) {
        C9971q.m14633g(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // bj.AbstractC3697s, p449yi.AbstractC14437h
    public final void serialize(Encoder encoder, Array array) {
        C9971q.m14633g(encoder, "encoder");
        int e = mo13776e(array);
        SerialDescriptor serialDescriptor = this.f6016b;
        CompositeEncoder h = encoder.mo13880h(serialDescriptor, e);
        mo13772u(h, array, e);
        h.mo13884c(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final Array mo33776l(Builder builder) {
        C9971q.m14633g(builder, "<this>");
        return (Array) builder.mo33749a();
    }

    /* renamed from: u */
    protected abstract void mo13772u(CompositeEncoder compositeEncoder, Array array, int i);
}
