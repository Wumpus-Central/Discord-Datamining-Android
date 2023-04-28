package cc;

import java.util.Map;
import p030bc.C3457i;
import p163j$.util.function.BiConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.c2 */
/* loaded from: classes3.dex */
public final class C3835c2<K, V> extends AbstractC3826b0<K, V> {

    /* renamed from: o */
    final transient K f6359o;

    /* renamed from: p */
    final transient V f6360p;

    /* renamed from: q */
    private final transient AbstractC3826b0<V, K> f6361q;

    /* renamed from: r */
    private transient AbstractC3826b0<V, K> f6362r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3835c2(K k, V v) {
        C3911m.m33353a(k, v);
        this.f6359o = k;
        this.f6360p = v;
        this.f6361q = null;
    }

    @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
    public boolean containsKey(Object obj) {
        return this.f6359o.equals(obj);
    }

    @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
    public boolean containsValue(Object obj) {
        return this.f6360p.equals(obj);
    }

    @Override // cc.AbstractC3899l0, p163j$.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        ((BiConsumer) C3457i.m34352i(biConsumer)).accept(this.f6359o, this.f6360p);
    }

    @Override // cc.AbstractC3899l0, java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
    public V get(Object obj) {
        if (this.f6359o.equals(obj)) {
            return this.f6360p;
        }
        return null;
    }

    @Override // cc.AbstractC3899l0
    /* renamed from: h */
    AbstractC3960w0<Map.Entry<K, V>> mo33273h() {
        return AbstractC3960w0.m33255y(C3871h1.m33436c(this.f6359o, this.f6360p));
    }

    @Override // cc.AbstractC3899l0
    /* renamed from: i */
    AbstractC3960w0<K> mo33272i() {
        return AbstractC3960w0.m33255y(this.f6359o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3899l0
    /* renamed from: n */
    public boolean mo33270n() {
        return false;
    }

    @Override // java.util.Map, p163j$.util.Map
    public int size() {
        return 1;
    }

    @Override // cc.AbstractC3826b0
    /* renamed from: v */
    public AbstractC3826b0<V, K> mo33499v() {
        AbstractC3826b0<V, K> b0Var = this.f6361q;
        if (b0Var != null) {
            return b0Var;
        }
        AbstractC3826b0<V, K> b0Var2 = this.f6362r;
        if (b0Var2 != null) {
            return b0Var2;
        }
        C3835c2 c2Var = new C3835c2(this.f6360p, this.f6359o, this);
        this.f6362r = c2Var;
        return c2Var;
    }

    private C3835c2(K k, V v, AbstractC3826b0<V, K> b0Var) {
        this.f6359o = k;
        this.f6360p = v;
        this.f6361q = b0Var;
    }
}
