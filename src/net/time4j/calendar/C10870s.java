package net.time4j.calendar;

import net.time4j.C11045z0;
import net.time4j.EnumC11039x0;
import net.time4j.base.C10813c;
import p143hj.AbstractC8056g;
import p143hj.AbstractC8068k;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8083t;
import p143hj.AbstractC8091z;

/* renamed from: net.time4j.calendar.s */
/* loaded from: classes8.dex */
class C10870s<D extends AbstractC8056g> implements AbstractC8091z<D, EnumC11039x0> {

    /* renamed from: k */
    private final C11045z0 f24129k;

    /* renamed from: l */
    private final AbstractC8083t<D, AbstractC8068k<D>> f24130l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10870s(C11045z0 z0Var, AbstractC8083t<D, AbstractC8068k<D>> tVar) {
        this.f24129k = z0Var;
        this.f24130l = tVar;
    }

    /* renamed from: o */
    private static EnumC11039x0 m11929o(long j) {
        return EnumC11039x0.m11154f(C10813c.m12199d(j + 5, 7) + 1);
    }

    /* renamed from: a */
    public AbstractC8079p<?> mo11086b(D d) {
        return null;
    }

    /* renamed from: e */
    public AbstractC8079p<?> mo11085c(D d) {
        return null;
    }

    /* renamed from: f */
    public EnumC11039x0 mo11084d(D d) {
        AbstractC8068k<D> apply = this.f24130l.apply(d);
        if ((d.mo12079c() + 7) - mo11076n(d).m11157c(this.f24129k) > apply.mo11791a()) {
            return m11929o(apply.mo11791a());
        }
        return this.f24129k.m11133f().m11156d(6);
    }

    /* renamed from: i */
    public EnumC11039x0 mo11078k(D d) {
        AbstractC8068k<D> apply = this.f24130l.apply(d);
        if ((d.mo12079c() + 1) - mo11076n(d).m11157c(this.f24129k) < apply.mo11788d()) {
            return m11929o(apply.mo11788d());
        }
        return this.f24129k.m11133f();
    }

    /* renamed from: j */
    public EnumC11039x0 mo11076n(D d) {
        return m11929o(d.mo12079c());
    }

    /* renamed from: p */
    public boolean mo11081h(D d, EnumC11039x0 x0Var) {
        if (x0Var == null) {
            return false;
        }
        int c = mo11076n(d).m11157c(this.f24129k);
        long c2 = (d.mo12079c() + x0Var.m11157c(this.f24129k)) - c;
        AbstractC8068k<D> apply = this.f24130l.apply(d);
        if (c2 < apply.mo11788d() || c2 > apply.mo11791a()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public D mo11077m(D d, EnumC11039x0 x0Var, boolean z) {
        if (x0Var != null) {
            int c = mo11076n(d).m11157c(this.f24129k);
            long c2 = (d.mo12079c() + x0Var.m11157c(this.f24129k)) - c;
            AbstractC8068k<D> apply = this.f24130l.apply(d);
            if (c2 >= apply.mo11788d() && c2 <= apply.mo11791a()) {
                return apply.mo11790b(c2);
            }
            throw new IllegalArgumentException("New day out of supported range.");
        }
        throw new IllegalArgumentException("Missing weekday.");
    }
}
