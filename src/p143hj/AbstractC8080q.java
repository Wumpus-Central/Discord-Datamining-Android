package p143hj;

import java.util.Set;
import net.time4j.p248tz.AbstractC11001k;
import p143hj.AbstractC8080q;

/* renamed from: hj.q */
/* loaded from: classes8.dex */
public abstract class AbstractC8080q<T extends AbstractC8080q<T>> implements AbstractC8077o {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public T mo15655B(AbstractC8079p<Integer> pVar, int i) {
        AbstractC8047c0<T> w = mo11639t().m20645w(pVar);
        if (w != null) {
            return w.mo11811g(mo11638u(), i, pVar.mo11088i());
        }
        return mo15654D(pVar, Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public T m20661C(AbstractC8079p<Long> pVar, long j) {
        return mo15654D(pVar, Long.valueOf(j));
    }

    /* renamed from: D */
    public <V> T mo15654D(AbstractC8079p<V> pVar, V v) {
        return mo20659x(pVar).mo11077m(mo11638u(), v, pVar.mo11088i());
    }

    /* renamed from: E */
    public T m20660E(AbstractC8085v<T> vVar) {
        return vVar.apply(mo11638u());
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: b */
    public <V> V mo11380b(AbstractC8079p<V> pVar) {
        return mo20659x(pVar).mo11084d(mo11638u());
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: e */
    public boolean mo11377e(AbstractC8079p<?> pVar) {
        return mo11639t().mo20656D(pVar);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: f */
    public boolean mo11376f() {
        return false;
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: k */
    public <V> V mo11373k(AbstractC8079p<V> pVar) {
        return mo20659x(pVar).mo11078k(mo11638u());
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: q */
    public AbstractC11001k mo11372q() {
        throw new C8081r("Timezone not available: " + this);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: r */
    public <V> V mo11371r(AbstractC8079p<V> pVar) {
        return mo20659x(pVar).mo11076n(mo11638u());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p143hj.AbstractC8077o
    /* renamed from: s */
    public int mo11370s(AbstractC8079p<Integer> pVar) {
        AbstractC8047c0<T> w = mo11639t().m20645w(pVar);
        try {
            if (w == null) {
                return ((Integer) mo11371r(pVar)).intValue();
            }
            return w.mo11808l(mo11638u());
        } catch (C8081r unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public abstract C8087x<T> mo11639t();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public T mo11638u() {
        C8087x<T> t = mo11639t();
        Class<T> q = t.m20648q();
        if (q.isInstance(this)) {
            return q.cast(this);
        }
        for (AbstractC8079p<?> pVar : t.m20644x()) {
            if (q == pVar.getType()) {
                return q.cast(mo11371r(pVar));
            }
        }
        throw new IllegalStateException("Implementation error: Cannot find entity context.");
    }

    /* renamed from: v */
    public Set<AbstractC8079p<?>> mo15628v() {
        return mo11639t().m20644x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public <V> AbstractC8091z<T, V> mo20659x(AbstractC8079p<V> pVar) {
        return mo11639t().m20643y(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public boolean m20658y(AbstractC8079p<Long> pVar, long j) {
        return mo15651z(pVar, Long.valueOf(j));
    }

    /* renamed from: z */
    public <V> boolean mo15651z(AbstractC8079p<V> pVar, V v) {
        if (pVar == null) {
            throw new NullPointerException("Missing chronological element.");
        } else if (!mo11377e(pVar) || !mo20659x(pVar).mo11081h(mo11638u(), v)) {
            return false;
        } else {
            return true;
        }
    }
}
