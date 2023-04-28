package p183jj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p143hj.AbstractC8079p;
import p143hj.C8081r;

/* renamed from: jj.u */
/* loaded from: classes8.dex */
class C9677u extends AbstractC9676t<C9677u> {

    /* renamed from: l */
    private Map<AbstractC8079p<?>, Object> f21511l = null;

    /* renamed from: k */
    private Object f21510k = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p183jj.AbstractC9676t
    /* renamed from: F */
    public <E> E mo15650F() {
        return (E) this.f21510k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p183jj.AbstractC9676t
    /* renamed from: G */
    public void mo15649G(AbstractC8079p<?> pVar, int i) {
        pVar.getClass();
        Map map = this.f21511l;
        if (map == null) {
            map = new HashMap();
            this.f21511l = map;
        }
        map.put(pVar, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p183jj.AbstractC9676t
    /* renamed from: I */
    public void mo15648I(AbstractC8079p<?> pVar, Object obj) {
        pVar.getClass();
        if (obj == null) {
            Map<AbstractC8079p<?>, Object> map = this.f21511l;
            if (map != null) {
                map.remove(pVar);
                if (this.f21511l.isEmpty()) {
                    this.f21511l = null;
                    return;
                }
                return;
            }
            return;
        }
        Map map2 = this.f21511l;
        if (map2 == null) {
            map2 = new HashMap();
            this.f21511l = map2;
        }
        map2.put(pVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p183jj.AbstractC9676t
    /* renamed from: J */
    public void mo15647J(Object obj) {
        this.f21510k = obj;
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: e */
    public boolean mo11377e(AbstractC8079p<?> pVar) {
        Map<AbstractC8079p<?>, Object> map;
        if (pVar == null || (map = this.f21511l) == null) {
            return false;
        }
        return map.containsKey(pVar);
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: r */
    public <V> V mo11371r(AbstractC8079p<V> pVar) {
        pVar.getClass();
        Map<AbstractC8079p<?>, Object> map = this.f21511l;
        if (map != null && map.containsKey(pVar)) {
            return pVar.getType().cast(map.get(pVar));
        }
        throw new C8081r("No value found for: " + pVar.name());
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: s */
    public int mo11370s(AbstractC8079p<Integer> pVar) {
        pVar.getClass();
        Map<AbstractC8079p<?>, Object> map = this.f21511l;
        if (map == null || !map.containsKey(pVar)) {
            return Integer.MIN_VALUE;
        }
        return pVar.getType().cast(map.get(pVar)).intValue();
    }

    @Override // p143hj.AbstractC8080q
    /* renamed from: v */
    public Set<AbstractC8079p<?>> mo15628v() {
        Map<AbstractC8079p<?>, Object> map = this.f21511l;
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }
}
