package cc;

import cc.AbstractC3899l0;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import p030bc.C3457i;
import p163j$.util.Map;
import p163j$.util.Set;
import p163j$.util.Spliterator;
import p163j$.util.function.BiConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.f0 */
/* loaded from: classes3.dex */
public final class C3846f0<K extends Enum<K>, V> extends AbstractC3899l0.AbstractC3902c<K, V> {

    /* renamed from: o */
    private final transient EnumMap<K, V> f6371o;

    private C3846f0(EnumMap<K, V> enumMap) {
        this.f6371o = enumMap;
        C3457i.m34357d(!enumMap.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static <K extends Enum<K>, V> AbstractC3899l0<K, V> m33497v(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return AbstractC3899l0.m33370r();
        }
        if (size != 1) {
            return new C3846f0(enumMap);
        }
        Map.Entry entry = (Map.Entry) C3976z0.m33213e(enumMap.entrySet());
        return AbstractC3899l0.m33369s((Enum) entry.getKey(), entry.getValue());
    }

    @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
    public boolean containsKey(Object obj) {
        return this.f6371o.containsKey(obj);
    }

    @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3846f0) {
            obj = ((C3846f0) obj).f6371o;
        }
        return this.f6371o.equals(obj);
    }

    @Override // cc.AbstractC3899l0, p163j$.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Map.EL.forEach(this.f6371o, biConsumer);
    }

    @Override // cc.AbstractC3899l0, java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
    public V get(Object obj) {
        return this.f6371o.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3899l0
    /* renamed from: n */
    public boolean mo33270n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3899l0
    /* renamed from: o */
    public AbstractC3868g2<K> mo33373o() {
        return C3818a1.m33521q(this.f6371o.keySet().iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3899l0
    /* renamed from: q */
    public Spliterator<K> mo33371q() {
        return Set.EL.spliterator(this.f6371o.keySet());
    }

    @Override // java.util.Map, p163j$.util.Map
    public int size() {
        return this.f6371o.size();
    }

    @Override // cc.AbstractC3899l0.AbstractC3902c
    /* renamed from: u */
    AbstractC3868g2<Map.Entry<K, V>> mo33363u() {
        return C3871h1.m33426m(this.f6371o.entrySet().iterator());
    }
}
