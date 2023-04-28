package p014aj;

import bj.C3711w1;
import dj.AbstractC6514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000\"$\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"Ldj/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "b", "Lkotlin/reflect/KClass;", "context", "c", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlin/reflect/KClass;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "capturedKClass", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: aj.b */
/* loaded from: classes8.dex */
public final class C1408b {
    /* renamed from: a */
    public static final KClass<?> m41138a(SerialDescriptor serialDescriptor) {
        C9971q.m14633g(serialDescriptor, "<this>");
        if (serialDescriptor instanceof C1409c) {
            return ((C1409c) serialDescriptor).f459b;
        }
        if (serialDescriptor instanceof C3711w1) {
            return m41138a(((C3711w1) serialDescriptor).m33762k());
        }
        return null;
    }

    /* renamed from: b */
    public static final SerialDescriptor m41137b(AbstractC6514c cVar, SerialDescriptor descriptor) {
        KSerializer c;
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(descriptor, "descriptor");
        KClass<?> a = m41138a(descriptor);
        if (a == null || (c = AbstractC6514c.m25389c(cVar, a, null, 2, null)) == null) {
            return null;
        }
        return c.getDescriptor();
    }

    /* renamed from: c */
    public static final SerialDescriptor m41136c(SerialDescriptor serialDescriptor, KClass<?> context) {
        C9971q.m14633g(serialDescriptor, "<this>");
        C9971q.m14633g(context, "context");
        return new C1409c(serialDescriptor, context);
    }
}
