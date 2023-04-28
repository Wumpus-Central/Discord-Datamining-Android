package dj;

import dj.AbstractC6511a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import p449yi.AbstractC14437h;

@Metadata(m15074d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B×\u0001\u0012\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00180\u0017\u0012*\u0010\u001b\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u0017\u0012.\u0010\u001f\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u001cj\u0006\u0012\u0002\b\u0003`\u001d0\u0017\u0012&\u0010 \u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u0017\u00122\u0010\"\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u001cj\u0006\u0012\u0002\b\u0003`!0\u0017¢\u0006\u0004\b#\u0010$J9\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ4\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J:\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R$\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R8\u0010\u001b\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R<\u0010\u001f\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u001cj\u0006\u0012\u0002\b\u0003`\u001d0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R4\u0010 \u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R@\u0010\"\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u001cj\u0006\u0012\u0002\b\u0003`!0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006%"}, m15073d2 = {"Ldj/b;", "Ldj/c;", "", "T", "Lkotlin/reflect/KClass;", "baseClass", "value", "Lyi/h;", "e", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lyi/h;", "", "serializedClassName", "Lkotlinx/serialization/DeserializationStrategy;", "d", "kClass", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "b", "Ldj/e;", "collector", "", "a", "", "Ldj/a;", "Ljava/util/Map;", "class2ContextualFactory", "polyBase2Serializers", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "c", "polyBase2DefaultSerializerProvider", "polyBase2NamedSerializers", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: dj.b */
/* loaded from: classes8.dex */
public final class C6513b extends AbstractC6514c {

    /* renamed from: a */
    private final Map<KClass<?>, AbstractC6511a> f13656a;

    /* renamed from: b */
    public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> f13657b;

    /* renamed from: c */
    private final Map<KClass<?>, Function1<?, AbstractC14437h<?>>> f13658c;

    /* renamed from: d */
    private final Map<KClass<?>, Map<String, KSerializer<?>>> f13659d;

    /* renamed from: e */
    private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> f13660e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6513b(Map<KClass<?>, ? extends AbstractC6511a> class2ContextualFactory, Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> polyBase2Serializers, Map<KClass<?>, ? extends Function1<?, ? extends AbstractC14437h<?>>> polyBase2DefaultSerializerProvider, Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> polyBase2NamedSerializers, Map<KClass<?>, ? extends Function1<? super String, ? extends DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider) {
        super(null);
        C9971q.m14633g(class2ContextualFactory, "class2ContextualFactory");
        C9971q.m14633g(polyBase2Serializers, "polyBase2Serializers");
        C9971q.m14633g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        C9971q.m14633g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        C9971q.m14633g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f13656a = class2ContextualFactory;
        this.f13657b = polyBase2Serializers;
        this.f13658c = polyBase2DefaultSerializerProvider;
        this.f13659d = polyBase2NamedSerializers;
        this.f13660e = polyBase2DefaultDeserializerProvider;
    }

    @Override // dj.AbstractC6514c
    /* renamed from: a */
    public void mo25391a(AbstractC6516e collector) {
        C9971q.m14633g(collector, "collector");
        for (Map.Entry<KClass<?>, AbstractC6511a> entry : this.f13656a.entrySet()) {
            KClass<?> key = entry.getKey();
            AbstractC6511a value = entry.getValue();
            if (value instanceof AbstractC6511a.C0199a) {
                C9971q.m14635e(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer<?> b = ((AbstractC6511a.C0199a) value).m25394b();
                C9971q.m14635e(b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.mo25383c(key, b);
            } else if (value instanceof AbstractC6511a.C6512b) {
                collector.mo25381e(key, ((AbstractC6511a.C6512b) value).m25392b());
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, KSerializer<?>>> entry2 : this.f13657b.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                KSerializer<?> value2 = entry3.getValue();
                C9971q.m14635e(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C9971q.m14635e(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C9971q.m14635e(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.mo25385a(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, Function1<?, AbstractC14437h<?>>> entry4 : this.f13658c.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            Function1<?, AbstractC14437h<?>> value3 = entry4.getValue();
            C9971q.m14635e(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C9971q.m14635e(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.mo25382d(key4, (Function1) C9964l0.m14653d(value3, 1));
        }
        for (Map.Entry<KClass<?>, Function1<String, DeserializationStrategy<?>>> entry5 : this.f13660e.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            Function1<String, DeserializationStrategy<?>> value4 = entry5.getValue();
            C9971q.m14635e(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C9971q.m14635e(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.mo25384b(key5, (Function1) C9964l0.m14653d(value4, 1));
        }
    }

    @Override // dj.AbstractC6514c
    /* renamed from: b */
    public <T> KSerializer<T> mo25390b(KClass<T> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers) {
        KSerializer<T> kSerializer;
        C9971q.m14633g(kClass, "kClass");
        C9971q.m14633g(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC6511a aVar = this.f13656a.get(kClass);
        if (aVar != null) {
            kSerializer = (KSerializer<T>) aVar.mo25393a(typeArgumentsSerializers);
        } else {
            kSerializer = null;
        }
        if (kSerializer instanceof KSerializer) {
            return kSerializer;
        }
        return null;
    }

    @Override // dj.AbstractC6514c
    /* renamed from: d */
    public <T> DeserializationStrategy<T> mo25388d(KClass<? super T> baseClass, String str) {
        KSerializer<?> kSerializer;
        Function1<String, DeserializationStrategy<?>> function1;
        C9971q.m14633g(baseClass, "baseClass");
        Map<String, KSerializer<?>> map = this.f13659d.get(baseClass);
        if (map != null) {
            kSerializer = map.get(str);
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Function1<String, DeserializationStrategy<?>> function12 = this.f13660e.get(baseClass);
        if (C9964l0.m14648i(function12, 1)) {
            function1 = function12;
        } else {
            function1 = null;
        }
        if (function1 != null) {
            return (DeserializationStrategy<T>) function1.invoke(str);
        }
        return null;
    }

    @Override // dj.AbstractC6514c
    /* renamed from: e */
    public <T> AbstractC14437h<T> mo25387e(KClass<? super T> baseClass, T value) {
        KSerializer<?> kSerializer;
        Function1<?, AbstractC14437h<?>> function1;
        C9971q.m14633g(baseClass, "baseClass");
        C9971q.m14633g(value, "value");
        if (!baseClass.mo14600e(value)) {
            return null;
        }
        Map<KClass<?>, KSerializer<?>> map = this.f13657b.get(baseClass);
        if (map != null) {
            kSerializer = map.get(C9951f0.m14684b(value.getClass()));
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof AbstractC14437h)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Function1<?, AbstractC14437h<?>> function12 = this.f13658c.get(baseClass);
        if (C9964l0.m14648i(function12, 1)) {
            function1 = function12;
        } else {
            function1 = null;
        }
        if (function1 != null) {
            return (AbstractC14437h<T>) function1.invoke(value);
        }
        return null;
    }
}
