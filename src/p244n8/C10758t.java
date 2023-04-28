package p244n8;

import android.util.SparseArray;
import p119g9.C7544l0;

/* renamed from: n8.t */
/* loaded from: classes7.dex */
public final class C10758t {

    /* renamed from: a */
    private final SparseArray<C7544l0> f23909a = new SparseArray<>();

    /* renamed from: a */
    public C7544l0 m12373a(int i) {
        C7544l0 l0Var = this.f23909a.get(i);
        if (l0Var != null) {
            return l0Var;
        }
        C7544l0 l0Var2 = new C7544l0(Long.MAX_VALUE);
        this.f23909a.put(i, l0Var2);
        return l0Var2;
    }

    /* renamed from: b */
    public void m12372b() {
        this.f23909a.clear();
    }
}
