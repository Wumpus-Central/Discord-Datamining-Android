package p233mi;

import kotlin.jvm.internal.C9971q;
import kotlin.properties.AbstractC9984d;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import p233mi.AbstractC10621a;

/* renamed from: mi.n */
/* loaded from: classes8.dex */
public final class C10647n<K, V, T extends V> extends AbstractC10621a.AbstractC0343a<K, V, T> implements AbstractC9984d<AbstractC10621a<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10647n(KClass<? extends K> key, int i) {
        super(key, i);
        C9971q.m14633g(key, "key");
    }

    /* renamed from: b */
    public T getValue(AbstractC10621a<K, V> thisRef, KProperty<?> property) {
        C9971q.m14633g(thisRef, "thisRef");
        C9971q.m14633g(property, "property");
        return m12713a(thisRef);
    }
}
