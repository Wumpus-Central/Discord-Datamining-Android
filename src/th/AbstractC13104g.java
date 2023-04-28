package th;

import fi.AbstractC7267g0;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11327h0;

/* renamed from: th.g */
/* loaded from: classes8.dex */
public abstract class AbstractC13104g<T> {

    /* renamed from: a */
    private final T f29409a;

    public AbstractC13104g(T t) {
        this.f29409a = t;
    }

    /* renamed from: a */
    public abstract AbstractC7267g0 mo4552a(AbstractC11327h0 h0Var);

    /* renamed from: b */
    public T mo4590b() {
        return this.f29409a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T b = mo4590b();
            Object obj2 = null;
            AbstractC13104g gVar = obj instanceof AbstractC13104g ? (AbstractC13104g) obj : null;
            if (gVar != null) {
                obj2 = gVar.mo4590b();
            }
            if (!C9971q.m14638b(b, obj2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T b = mo4590b();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo4590b());
    }
}
