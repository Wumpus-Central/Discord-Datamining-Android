package cc;

import cc.AbstractC3918n0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p030bc.C3457i;
import p163j$.util.Map;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.c1 */
/* loaded from: classes3.dex */
public final class C3834c1<K, V> extends AbstractC3899l0<K, V> {

    /* renamed from: o */
    private final transient Map<K, V> f6357o;

    /* renamed from: p */
    private final transient AbstractC3884i0<Map.Entry<K, V>> f6358p;

    C3834c1(Map<K, V> map, AbstractC3884i0<Map.Entry<K, V>> i0Var) {
        this.f6357o = map;
        this.f6358p = i0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static <K, V> AbstractC3899l0<K, V> m33501v(int i, Map.Entry<K, V>[] entryArr) {
        HashMap e = C3871h1.m33434e(i);
        for (int i2 = 0; i2 < i; i2++) {
            Map.Entry<K, V> entry = entryArr[i2];
            Objects.requireNonNull(entry);
            C3912m0 y = C3956v1.m33265y(entry);
            entryArr[i2] = y;
            Object putIfAbsent = Map.EL.putIfAbsent(e, y.getKey(), entryArr[i2].getValue());
            if (putIfAbsent != null) {
                Map.Entry<K, V> entry2 = entryArr[i2];
                String valueOf = String.valueOf(entry2.getKey());
                String valueOf2 = String.valueOf(putIfAbsent);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
                sb2.append(valueOf);
                sb2.append("=");
                sb2.append(valueOf2);
                throw AbstractC3899l0.m33380c("key", entry2, sb2.toString());
            }
        }
        return new C3834c1(e, AbstractC3884i0.m33404r(entryArr, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ void m33500w(BiConsumer biConsumer, Map.Entry entry) {
        biConsumer.accept(entry.getKey(), entry.getValue());
    }

    @Override // cc.AbstractC3899l0, p163j$.util.Map
    public void forEach(final BiConsumer<? super K, ? super V> biConsumer) {
        C3457i.m34352i(biConsumer);
        this.f6358p.forEach(new Consumer() { // from class: cc.b1
            @Override // p163j$.util.function.Consumer
            public final void accept(Object obj) {
                C3834c1.m33500w(BiConsumer.this, (Map.Entry) obj);
            }

            @Override // p163j$.util.function.Consumer
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }

    @Override // cc.AbstractC3899l0, java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
    public V get(Object obj) {
        return this.f6357o.get(obj);
    }

    @Override // cc.AbstractC3899l0
    /* renamed from: h */
    AbstractC3960w0<Map.Entry<K, V>> mo33273h() {
        return new AbstractC3918n0.C3919a(this, this.f6358p);
    }

    @Override // cc.AbstractC3899l0
    /* renamed from: i */
    AbstractC3960w0<K> mo33272i() {
        return new C3930p0(this);
    }

    @Override // cc.AbstractC3899l0
    /* renamed from: j */
    AbstractC3837d0<V> mo33271j() {
        return new C3939s0(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3899l0
    /* renamed from: n */
    public boolean mo33270n() {
        return false;
    }

    @Override // java.util.Map, p163j$.util.Map
    public int size() {
        return this.f6358p.size();
    }
}
