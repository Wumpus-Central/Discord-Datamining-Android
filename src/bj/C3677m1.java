package bj;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p107fg.AbstractC7139c;
import p107fg.AbstractC7150i;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0010\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\bH\u0000\u001a\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b*\u00020\u000eH\u0000\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m15073d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "a", "", "", "b", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlin/reflect/KClass;", "", "f", "e", "className", "d", "Lkotlin/reflect/KType;", "", "c", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "getEMPTY_DESCRIPTOR_ARRAY$annotations", "()V", "EMPTY_DESCRIPTOR_ARRAY", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: bj.m1 */
/* loaded from: classes8.dex */
public final class C3677m1 {

    /* renamed from: a */
    private static final SerialDescriptor[] f5994a = new SerialDescriptor[0];

    /* renamed from: a */
    public static final Set<String> m33830a(SerialDescriptor serialDescriptor) {
        C9971q.m14633g(serialDescriptor, "<this>");
        if (serialDescriptor instanceof AbstractC3671l) {
            return ((AbstractC3671l) serialDescriptor).mo13843a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.mo13681d());
        int d = serialDescriptor.mo13681d();
        for (int i = 0; i < d; i++) {
            hashSet.add(serialDescriptor.mo13680e(i));
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final SerialDescriptor[] m33829b(List<? extends SerialDescriptor> list) {
        boolean z;
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = null;
        }
        if (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) {
            return f5994a;
        }
        return serialDescriptorArr;
    }

    /* renamed from: c */
    public static final KClass<Object> m33828c(KType kType) {
        C9971q.m14633g(kType, "<this>");
        AbstractC7139c d = kType.mo14594d();
        if (d instanceof KClass) {
            return (KClass) d;
        }
        if (d instanceof AbstractC7150i) {
            throw new IllegalStateException(("Captured type parameter " + d + " from generic non-reified function. Such functionality cannot be supported as " + d + " is erased, either specify serializer explicitly or make calling function inline with reified " + d).toString());
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + d).toString());
    }

    /* renamed from: d */
    public static final String m33827d(String className) {
        C9971q.m14633g(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    /* renamed from: e */
    public static final String m33826e(KClass<?> kClass) {
        C9971q.m14633g(kClass, "<this>");
        String l = kClass.mo14598l();
        if (l == null) {
            l = "<local class name not available>";
        }
        return m33827d(l);
    }

    /* renamed from: f */
    public static final Void m33825f(KClass<?> kClass) {
        C9971q.m14633g(kClass, "<this>");
        throw new C14436g(m33826e(kClass));
    }
}
