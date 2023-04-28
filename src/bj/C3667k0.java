package bj;

import bj.AbstractC3644f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¨\u0006\u0007"}, m15073d2 = {"T", "", "name", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: bj.k0 */
/* loaded from: classes8.dex */
public final class C3667k0 {

    @Metadata(m15074d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m15073d2 = {"bj/k0$a", "Lbj/f0;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: bj.k0$a */
    /* loaded from: classes8.dex */
    public static final class C3668a implements AbstractC3644f0<T> {

        /* renamed from: a */
        final /* synthetic */ KSerializer<T> f5984a;

        C3668a(KSerializer<T> kSerializer) {
            this.f5984a = kSerializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // bj.AbstractC3644f0
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{this.f5984a};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public T deserialize(Decoder decoder) {
            C9971q.m14633g(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p449yi.AbstractC14437h
        public void serialize(Encoder encoder, T t) {
            C9971q.m14633g(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // bj.AbstractC3644f0
        public KSerializer<?>[] typeParametersSerializers() {
            return AbstractC3644f0.C3645a.m33897a(this);
        }
    }

    /* renamed from: a */
    public static final <T> SerialDescriptor m33855a(String name, KSerializer<T> primitiveSerializer) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(primitiveSerializer, "primitiveSerializer");
        return new InlineClassDescriptor(name, new C3668a(primitiveSerializer));
    }
}
