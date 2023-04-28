package pf;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p267of.AbstractC11273f;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\r"}, m15073d2 = {"Lpf/a;", "", "E", "K", "V", "Lof/f;", "element", "", "b", "(Ljava/util/Map$Entry;)Z", "f", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: pf.a */
/* loaded from: classes8.dex */
public abstract class AbstractC11650a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC11273f<E> {
    /* renamed from: b */
    public final boolean m9141b(E element) {
        C9971q.m14633g(element, "element");
        return mo9063f(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return m9141b((Map.Entry) obj);
    }

    /* renamed from: f */
    public abstract boolean mo9063f(Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: g */
    public abstract /* bridge */ boolean mo9062g(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo9062g((Map.Entry) obj);
    }
}
