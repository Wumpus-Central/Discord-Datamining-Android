package fi;

import kotlin.jvm.internal.C9971q;
import p142hi.C8039k;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p325rh.C12661e;

/* renamed from: fi.m */
/* loaded from: classes8.dex */
public abstract class AbstractC7294m implements AbstractC7268g1 {

    /* renamed from: a */
    private int f15775a;

    /* renamed from: d */
    private final boolean m23006d(AbstractC11326h hVar) {
        return !C8039k.m20765m(hVar) && !C12661e.m6062E(hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean m23007c(AbstractC11326h first, AbstractC11326h second) {
        C9971q.m14633g(first, "first");
        C9971q.m14633g(second, "second");
        if (!C9971q.m14638b(first.getName(), second.getName())) {
            return false;
        }
        AbstractC11346m b = first.mo6104b();
        for (AbstractC11346m b2 = second.mo6104b(); b != null && b2 != null; b2 = b2.mo6104b()) {
            if (b instanceof AbstractC11327h0) {
                return b2 instanceof AbstractC11327h0;
            }
            if (b2 instanceof AbstractC11327h0) {
                return false;
            }
            if (b instanceof AbstractC11344l0) {
                if (!(b2 instanceof AbstractC11344l0) || !C9971q.m14638b(((AbstractC11344l0) b).mo6103e(), ((AbstractC11344l0) b2).mo6103e())) {
                    return false;
                }
                return true;
            } else if ((b2 instanceof AbstractC11344l0) || !C9971q.m14638b(b.getName(), b2.getName())) {
                return false;
            } else {
                b = b.mo6104b();
            }
        }
        return true;
    }

    /* renamed from: e */
    protected abstract boolean mo6387e(AbstractC11326h hVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7268g1) || obj.hashCode() != hashCode()) {
            return false;
        }
        AbstractC7268g1 g1Var = (AbstractC7268g1) obj;
        if (g1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        AbstractC11326h p = mo4565p();
        AbstractC11326h p2 = g1Var.mo4565p();
        if (p2 != null && m23006d(p) && m23006d(p2)) {
            return mo6387e(p2);
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = this.f15775a;
        if (i2 != 0) {
            return i2;
        }
        AbstractC11326h p = mo4565p();
        if (m23006d(p)) {
            i = C12661e.m6041m(p).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.f15775a = i;
        return i;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: p */
    public abstract AbstractC11326h mo4565p();
}
