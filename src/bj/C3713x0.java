package bj;

import ag.AbstractC1385a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.AbstractC1432i;
import p014aj.C1407a;
import p014aj.C1427g;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0017B#\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0018"}, m15073d2 = {"Lbj/x0;", "K", "V", "Lbj/p0;", "", "key", "value", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "d", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "e", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "a", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.x0 */
/* loaded from: classes8.dex */
public final class C3713x0<K, V> extends AbstractC3688p0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c */
    private final SerialDescriptor f6040c;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0010\u001a\u00028\u0002\u0012\u0006\u0010\u0013\u001a\u00028\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001a\u0010\u0010\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, m15073d2 = {"Lbj/x0$a;", "K", "V", "", "", "toString", "", "hashCode", "", "other", "", "equals", "k", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "l", "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: bj.x0$a */
    /* loaded from: classes8.dex */
    public static final class C3714a<K, V> implements Map.Entry<K, V>, AbstractC1385a {

        /* renamed from: k */
        private final K f6041k;

        /* renamed from: l */
        private final V f6042l;

        public C3714a(K k, V v) {
            this.f6041k = k;
            this.f6042l = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3714a)) {
                return false;
            }
            C3714a aVar = (C3714a) obj;
            return C9971q.m14638b(getKey(), aVar.getKey()) && C9971q.m14638b(getValue(), aVar.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f6041k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6042l;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i = 0;
            int hashCode = (getKey() == null ? 0 : getKey().hashCode()) * 31;
            if (getValue() != null) {
                i = getValue().hashCode();
            }
            return hashCode + i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + ')';
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"K", "V", "Laj/a;", "", "a", "(Laj/a;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: bj.x0$b */
    /* loaded from: classes8.dex */
    static final class C3715b extends AbstractC9973s implements Function1<C1407a, Unit> {

        /* renamed from: k */
        final /* synthetic */ KSerializer<K> f6043k;

        /* renamed from: l */
        final /* synthetic */ KSerializer<V> f6044l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3715b(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
            super(1);
            this.f6043k = kSerializer;
            this.f6044l = kSerializer2;
        }

        /* renamed from: a */
        public final void m33753a(C1407a buildSerialDescriptor) {
            C9971q.m14633g(buildSerialDescriptor, "$this$buildSerialDescriptor");
            C1407a.m41145b(buildSerialDescriptor, "key", this.f6043k.getDescriptor(), null, false, 12, null);
            C1407a.m41145b(buildSerialDescriptor, "value", this.f6044l.getDescriptor(), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C1407a aVar) {
            m33753a(aVar);
            return Unit.f22042a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3713x0(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        C9971q.m14633g(keySerializer, "keySerializer");
        C9971q.m14633g(valueSerializer, "valueSerializer");
        this.f6040c = C1427g.m41129c("kotlin.collections.Map.Entry", AbstractC1432i.C1435c.f483a, new SerialDescriptor[0], new C3715b(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public K mo33759a(Map.Entry<? extends K, ? extends V> entry) {
        C9971q.m14633g(entry, "<this>");
        return (K) entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public V mo33758b(Map.Entry<? extends K, ? extends V> entry) {
        C9971q.m14633g(entry, "<this>");
        return (V) entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public Map.Entry<K, V> mo33757c(K k, V v) {
        return new C3714a(k, v);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f6040c;
    }
}
