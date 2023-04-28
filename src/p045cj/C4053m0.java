package p045cj;

import dj.AbstractC6516e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.AbstractC1410d;
import p014aj.AbstractC1413e;
import p014aj.AbstractC1429h;
import p014aj.AbstractC1432i;
import p449yi.AbstractC14437h;

@Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002JB\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042 \u0010\u000f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fH\u0016JF\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\t\"\b\b\u0001\u0010\u0012*\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016J<\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00160\fH\u0016J>\u0010\u001c\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001c\u0010\u001b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\fH\u0016R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010!\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006$"}, m15073d2 = {"Lcj/m0;", "Ldj/e;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/reflect/KClass;", "actualClass", "", "g", "f", "", "T", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "provider", "e", "Base", "Sub", "baseClass", "actualSerializer", "a", "Lyi/h;", "defaultSerializerProvider", "d", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "b", "", "Z", "useArrayPolymorphism", "Ljava/lang/String;", "discriminator", "<init>", "(ZLjava/lang/String;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.m0 */
/* loaded from: classes8.dex */
public final class C4053m0 implements AbstractC6516e {

    /* renamed from: a */
    private final boolean f6666a;

    /* renamed from: b */
    private final String f6667b;

    public C4053m0(boolean z, String discriminator) {
        C9971q.m14633g(discriminator, "discriminator");
        this.f6666a = z;
        this.f6667b = discriminator;
    }

    /* renamed from: f */
    private final void m32930f(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        int d = serialDescriptor.mo13681d();
        for (int i = 0; i < d; i++) {
            String e = serialDescriptor.mo13680e(i);
            if (C9971q.m14638b(e, this.f6667b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + e + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* renamed from: g */
    private final void m32929g(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        AbstractC1429h g = serialDescriptor.mo13678g();
        if ((g instanceof AbstractC1410d) || C9971q.m14638b(g, AbstractC1429h.C1430a.f479a)) {
            throw new IllegalArgumentException("Serializer for " + kClass.mo14598l() + " can't be registered as a subclass for polymorphic serialization because its kind " + g + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        } else if (!this.f6666a) {
            if (C9971q.m14638b(g, AbstractC1432i.C1434b.f482a) || C9971q.m14638b(g, AbstractC1432i.C1435c.f483a) || (g instanceof AbstractC1413e) || (g instanceof AbstractC1429h.C1431b)) {
                throw new IllegalArgumentException("Serializer for " + kClass.mo14598l() + " of kind " + g + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    @Override // dj.AbstractC6516e
    /* renamed from: a */
    public <Base, Sub extends Base> void mo25385a(KClass<Base> baseClass, KClass<Sub> actualClass, KSerializer<Sub> actualSerializer) {
        C9971q.m14633g(baseClass, "baseClass");
        C9971q.m14633g(actualClass, "actualClass");
        C9971q.m14633g(actualSerializer, "actualSerializer");
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        m32929g(descriptor, actualClass);
        if (!this.f6666a) {
            m32930f(descriptor, actualClass);
        }
    }

    @Override // dj.AbstractC6516e
    /* renamed from: b */
    public <Base> void mo25384b(KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        C9971q.m14633g(baseClass, "baseClass");
        C9971q.m14633g(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // dj.AbstractC6516e
    /* renamed from: c */
    public <T> void mo25383c(KClass<T> kClass, KSerializer<T> kSerializer) {
        AbstractC6516e.C6517a.m25380a(this, kClass, kSerializer);
    }

    @Override // dj.AbstractC6516e
    /* renamed from: d */
    public <Base> void mo25382d(KClass<Base> baseClass, Function1<? super Base, ? extends AbstractC14437h<? super Base>> defaultSerializerProvider) {
        C9971q.m14633g(baseClass, "baseClass");
        C9971q.m14633g(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // dj.AbstractC6516e
    /* renamed from: e */
    public <T> void mo25381e(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
        C9971q.m14633g(kClass, "kClass");
        C9971q.m14633g(provider, "provider");
    }
}
