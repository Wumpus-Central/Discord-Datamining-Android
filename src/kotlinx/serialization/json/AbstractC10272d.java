package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nf.C11075i;
import p014aj.AbstractC1410d;
import p014aj.C1427g;
import p449yi.AbstractC14437h;
import p449yi.C14436g;
import p449yi.C14443j;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\b\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0014\u001a\u00020\u0013H$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m15073d2 = {"Lkotlinx/serialization/json/d;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "subClass", "baseClass", "", "throwSubtypeNotRegistered", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Lkotlin/reflect/KClass;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.d */
/* loaded from: classes8.dex */
public abstract class AbstractC10272d<T> implements KSerializer<T> {
    private final KClass<T> baseClass;
    private final SerialDescriptor descriptor;

    public AbstractC10272d(KClass<T> baseClass) {
        C9971q.m14633g(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = C1427g.m41128d("JsonContentPolymorphicSerializer<" + baseClass.mo14598l() + '>', AbstractC1410d.C1412b.f462a, new SerialDescriptor[0], null, 8, null);
    }

    private final Void throwSubtypeNotRegistered(KClass<?> kClass, KClass<?> kClass2) {
        String l = kClass.mo14598l();
        if (l == null) {
            l = String.valueOf(kClass);
        }
        throw new C14436g("Class '" + l + "' is not registered for polymorphic serialization " + ("in the scope of '" + kClass2.mo14598l() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        AbstractC10273e d = C10281h.m13703d(decoder);
        JsonElement g = d.mo13729g();
        DeserializationStrategy<T> selectDeserializer = selectDeserializer(g);
        C9971q.m14635e(selectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) d.mo13730d().m13766d((KSerializer) selectDeserializer, g);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    protected abstract DeserializationStrategy<T> selectDeserializer(JsonElement jsonElement);

    @Override // p449yi.AbstractC14437h
    public final void serialize(Encoder encoder, T value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        AbstractC14437h<T> e = encoder.mo13917a().mo25387e(this.baseClass, value);
        if (e == null && (e = C14443j.m598g(C9951f0.m14684b(value.getClass()))) == null) {
            throwSubtypeNotRegistered(C9951f0.m14684b(value.getClass()), this.baseClass);
            throw new C11075i();
        } else {
            ((KSerializer) e).serialize(encoder, value);
        }
    }
}
