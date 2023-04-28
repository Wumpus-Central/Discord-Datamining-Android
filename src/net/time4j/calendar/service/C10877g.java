package net.time4j.calendar.service;

import net.time4j.C11045z0;
import net.time4j.EnumC11039x0;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8080q;

/* renamed from: net.time4j.calendar.service.g */
/* loaded from: classes8.dex */
public class C10877g<T extends AbstractC8080q<T>> extends C10875e<EnumC11039x0, T> {
    private static final long serialVersionUID = -84764920511581480L;

    /* renamed from: r */
    private final transient C11045z0 f24145r;

    public C10877g(Class<T> cls, C11045z0 z0Var) {
        super("DAY_OF_WEEK", cls, EnumC11039x0.class, 'E');
        this.f24145r = z0Var;
    }

    /* renamed from: R */
    public EnumC11039x0 mo11059f() {
        return this.f24145r.m11133f().m11156d(6);
    }

    /* renamed from: S */
    public EnumC11039x0 mo11062T() {
        return this.f24145r.m11133f();
    }

    /* renamed from: V */
    public int mo11904O(EnumC11039x0 x0Var) {
        return x0Var.m11157c(this.f24145r);
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: o */
    public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
        int c = ((EnumC11039x0) oVar.mo11371r(this)).m11157c(this.f24145r);
        int c2 = ((EnumC11039x0) oVar2.mo11371r(this)).m11157c(this.f24145r);
        if (c < c2) {
            return -1;
        }
        if (c == c2) {
            return 0;
        }
        return 1;
    }
}
