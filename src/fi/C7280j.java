package fi;

import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import pg.AbstractC11672g;
import pg.C11676i;

/* renamed from: fi.j */
/* loaded from: classes8.dex */
public final class C7280j extends AbstractC7224a1<C7280j> {

    /* renamed from: a */
    private final AbstractC11672g f15754a;

    public C7280j(AbstractC11672g annotations) {
        C9971q.m14633g(annotations, "annotations");
        this.f15754a = annotations;
    }

    @Override // fi.AbstractC7224a1
    /* renamed from: b */
    public KClass<? extends C7280j> mo23030b() {
        return C9951f0.m14684b(C7280j.class);
    }

    /* renamed from: d */
    public C7280j mo23031a(C7280j jVar) {
        return jVar == null ? this : new C7280j(C11676i.m9044a(this.f15754a, jVar.f15754a));
    }

    /* renamed from: e */
    public final AbstractC11672g m23027e() {
        return this.f15754a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7280j)) {
            return false;
        }
        return C9971q.m14638b(((C7280j) obj).f15754a, this.f15754a);
    }

    /* renamed from: f */
    public C7280j mo23029c(C7280j jVar) {
        if (C9971q.m14638b(jVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f15754a.hashCode();
    }
}
