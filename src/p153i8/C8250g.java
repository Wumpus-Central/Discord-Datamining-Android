package p153i8;

/* renamed from: i8.g */
/* loaded from: classes7.dex */
public class C8250g implements AbstractC8282p0 {

    /* renamed from: k */
    protected final AbstractC8282p0[] f17890k;

    public C8250g(AbstractC8282p0[] p0VarArr) {
        this.f17890k = p0VarArr;
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: b */
    public final long mo12421b() {
        long j = Long.MAX_VALUE;
        for (AbstractC8282p0 p0Var : this.f17890k) {
            long b = p0Var.mo12421b();
            if (b != Long.MIN_VALUE) {
                j = Math.min(j, b);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        for (AbstractC8282p0 p0Var : this.f17890k) {
            if (p0Var.mo12419c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        AbstractC8282p0[] p0VarArr;
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long b = mo12421b();
            if (b == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (AbstractC8282p0 p0Var : this.f17890k) {
                long b2 = p0Var.mo12421b();
                if (b2 == Long.MIN_VALUE || b2 > j) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (b2 == b || z2) {
                    z |= p0Var.mo12415f(j);
                }
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: g */
    public final long mo12413g() {
        long j = Long.MAX_VALUE;
        for (AbstractC8282p0 p0Var : this.f17890k) {
            long g = p0Var.mo12413g();
            if (g != Long.MIN_VALUE) {
                j = Math.min(j, g);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: h */
    public final void mo12411h(long j) {
        for (AbstractC8282p0 p0Var : this.f17890k) {
            p0Var.mo12411h(j);
        }
    }
}
