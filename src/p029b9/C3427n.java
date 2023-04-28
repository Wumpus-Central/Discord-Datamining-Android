package p029b9;

import p079e7.C6734u;
import p119g9.C7557q0;

/* renamed from: b9.n */
/* loaded from: classes5.dex */
public final class C3427n {

    /* renamed from: a */
    public final int f5563a;

    /* renamed from: b */
    public final C6734u[] f5564b;

    /* renamed from: c */
    public final AbstractC3415h[] f5565c;

    /* renamed from: d */
    public final Object f5566d;

    public C3427n(C6734u[] uVarArr, AbstractC3415h[] hVarArr, Object obj) {
        this.f5564b = uVarArr;
        this.f5565c = (AbstractC3415h[]) hVarArr.clone();
        this.f5566d = obj;
        this.f5563a = uVarArr.length;
    }

    /* renamed from: a */
    public boolean m34399a(C3427n nVar) {
        if (nVar == null || nVar.f5565c.length != this.f5565c.length) {
            return false;
        }
        for (int i = 0; i < this.f5565c.length; i++) {
            if (!m34398b(nVar, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean m34398b(C3427n nVar, int i) {
        if (nVar != null && C7557q0.m22159c(this.f5564b[i], nVar.f5564b[i]) && C7557q0.m22159c(this.f5565c[i], nVar.f5565c[i])) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m34397c(int i) {
        return this.f5564b[i] != null;
    }
}
