package ph;

import java.util.Iterator;
import java.util.Map;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: ph.l */
/* loaded from: classes8.dex */
public class C11714l extends C11718m {

    /* renamed from: e */
    private final AbstractC11724q f26166e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ph.l$b */
    /* loaded from: classes8.dex */
    public static class C11716b<K> implements Map.Entry<K, Object> {

        /* renamed from: k */
        private Map.Entry<K, C11714l> f26167k;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f26167k.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C11714l value = this.f26167k.getValue();
            if (value == null) {
                return null;
            }
            return value.m8799e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof AbstractC11724q) {
                return this.f26167k.getValue().m8794d((AbstractC11724q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C11716b(Map.Entry<K, C11714l> entry) {
            this.f26167k = entry;
        }
    }

    /* renamed from: ph.l$c */
    /* loaded from: classes8.dex */
    static class C11717c<K> implements Iterator<Map.Entry<K, Object>>, p163j$.util.Iterator {

        /* renamed from: k */
        private Iterator<Map.Entry<K, Object>> f26168k;

        public C11717c(Iterator<Map.Entry<K, Object>> it) {
            this.f26168k = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f26168k.next();
            if (next.getValue() instanceof C11714l) {
                return new C11716b(next);
            }
            return next;
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f26168k.hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            this.f26168k.remove();
        }
    }

    /* renamed from: e */
    public AbstractC11724q m8799e() {
        return m8795c(this.f26166e);
    }

    public boolean equals(Object obj) {
        return m8799e().equals(obj);
    }

    public int hashCode() {
        return m8799e().hashCode();
    }

    public String toString() {
        return m8799e().toString();
    }
}
