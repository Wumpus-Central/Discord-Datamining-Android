package p045cj;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ;\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R<\u0010\u0014\u001a*\u0012\u0004\u0012\u00020\u0003\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00010\u0011j\b\u0012\u0004\u0012\u00020\u0001`\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lcj/u;", "", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lcj/u$a;", "key", "value", "", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lcj/u$a;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lcj/u$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lcj/u$a;)Ljava/lang/Object;", "", "Lkotlinx/serialization/json/internal/DescriptorData;", "Ljava/util/Map;", "map", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.u */
/* loaded from: classes8.dex */
public final class C4071u {

    /* renamed from: a */
    private final Map<SerialDescriptor, Map<C4072a<Object>, Object>> f6701a = C4069t.m32887a(16);

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"Lcj/u$a;", "", "T", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: cj.u$a */
    /* loaded from: classes8.dex */
    public static final class C4072a<T> {
    }

    /* renamed from: a */
    public final <T> T m32885a(SerialDescriptor descriptor, C4072a<T> key) {
        T t;
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(key, "key");
        Map<C4072a<Object>, Object> map = this.f6701a.get(descriptor);
        if (map != null) {
            t = (T) map.get(key);
        } else {
            t = null;
        }
        if (t == null) {
            return null;
        }
        return t;
    }

    /* renamed from: b */
    public final <T> T m32884b(SerialDescriptor descriptor, C4072a<T> key, Function0<? extends T> defaultValue) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(key, "key");
        C9971q.m14633g(defaultValue, "defaultValue");
        T t = (T) m32885a(descriptor, key);
        if (t != null) {
            return t;
        }
        T t2 = (T) defaultValue.invoke();
        m32883c(descriptor, key, t2);
        return t2;
    }

    /* renamed from: c */
    public final <T> void m32883c(SerialDescriptor descriptor, C4072a<T> key, T value) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(key, "key");
        C9971q.m14633g(value, "value");
        Map<SerialDescriptor, Map<C4072a<Object>, Object>> map = this.f6701a;
        Map<C4072a<Object>, Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = C4069t.m32887a(2);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }
}
