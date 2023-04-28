package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p449yi.AbstractC14437h;
import p449yi.C14433d;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017J'\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m15073d2 = {"Lbj/b;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/c;", "compositeDecoder", "b", "(Lkotlinx/serialization/encoding/c;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "c", "Lyi/h;", "d", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lyi/h;", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.b */
/* loaded from: classes8.dex */
public abstract class AbstractC3623b<T> implements KSerializer<T> {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final T m33959b(AbstractC10248c cVar) {
        return (T) AbstractC10248c.C10249a.m13844c(cVar, getDescriptor(), 1, C14433d.m613a(this, cVar, cVar.mo13853m(getDescriptor(), 0)), null, 8, null);
    }

    /* renamed from: c */
    public DeserializationStrategy<T> mo13932c(AbstractC10248c decoder, String str) {
        C9971q.m14633g(decoder, "decoder");
        return decoder.mo13858a().mo25388d(mo617e(), str);
    }

    /* renamed from: d */
    public AbstractC14437h<T> mo13931d(Encoder encoder, T value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        return encoder.mo13917a().mo25387e(mo617e(), value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        T t;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (b.mo13850p()) {
            t = (T) m33959b(b);
        } else {
            t = null;
            while (true) {
                int o = b.mo13851o(getDescriptor());
                if (o != -1) {
                    if (o == 0) {
                        ref$ObjectRef.f22069k = (T) b.mo13853m(getDescriptor(), o);
                    } else if (o != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) ref$ObjectRef.f22069k;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(o);
                        throw new C14436g(sb2.toString());
                    } else {
                        T t2 = ref$ObjectRef.f22069k;
                        if (t2 != null) {
                            ref$ObjectRef.f22069k = t2;
                            t = (T) AbstractC10248c.C10249a.m13844c(b, getDescriptor(), o, C14433d.m613a(this, b, (String) t2), null, 8, null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                    }
                } else if (t != null) {
                    C9971q.m14635e(t, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.f22069k)).toString());
                }
            }
        }
        b.mo13857c(descriptor);
        return t;
    }

    /* renamed from: e */
    public abstract KClass<T> mo617e();

    @Override // p449yi.AbstractC14437h
    public final void serialize(Encoder encoder, T value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        AbstractC14437h<? super T> b = C14433d.m612b(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder b2 = encoder.mo13885b(descriptor);
        b2.mo13864z(getDescriptor(), 0, b.getDescriptor().mo13676i());
        SerialDescriptor descriptor2 = getDescriptor();
        C9971q.m14635e(b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        b2.mo13870t(descriptor2, 1, b, value);
        b2.mo13884c(descriptor);
    }
}
