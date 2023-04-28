package gi;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7277i;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9618i;
import p249nh.C11136b;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.AbstractC11346m;
import p448yh.AbstractC14411h;

/* renamed from: gi.g */
/* loaded from: classes8.dex */
public abstract class AbstractC7664g extends AbstractC7277i {

    /* renamed from: gi.g$a */
    /* loaded from: classes8.dex */
    public static final class C7665a extends AbstractC7664g {

        /* renamed from: a */
        public static final C7665a f16661a = new C7665a();

        private C7665a() {
        }

        @Override // gi.AbstractC7664g
        /* renamed from: b */
        public AbstractC11313e mo21700b(C11136b classId) {
            C9971q.m14633g(classId, "classId");
            return null;
        }

        @Override // gi.AbstractC7664g
        /* renamed from: c */
        public <S extends AbstractC14411h> S mo21699c(AbstractC11313e classDescriptor, Function0<? extends S> compute) {
            C9971q.m14633g(classDescriptor, "classDescriptor");
            C9971q.m14633g(compute, "compute");
            return (S) ((AbstractC14411h) compute.invoke());
        }

        @Override // gi.AbstractC7664g
        /* renamed from: d */
        public boolean mo21698d(AbstractC11327h0 moduleDescriptor) {
            C9971q.m14633g(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // gi.AbstractC7664g
        /* renamed from: e */
        public boolean mo21697e(AbstractC7268g1 typeConstructor) {
            C9971q.m14633g(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // gi.AbstractC7664g
        /* renamed from: g */
        public Collection<AbstractC7267g0> mo21695g(AbstractC11313e classDescriptor) {
            C9971q.m14633g(classDescriptor, "classDescriptor");
            Collection<AbstractC7267g0> m = classDescriptor.mo6111k().mo4568m();
            C9971q.m14634f(m, "classDescriptor.typeConstructor.supertypes");
            return m;
        }

        @Override // gi.AbstractC7664g
        /* renamed from: h */
        public AbstractC7267g0 mo21701a(AbstractC9618i type) {
            C9971q.m14633g(type, "type");
            return (AbstractC7267g0) type;
        }

        /* renamed from: i */
        public AbstractC11313e mo21696f(AbstractC11346m descriptor) {
            C9971q.m14633g(descriptor, "descriptor");
            return null;
        }
    }

    /* renamed from: b */
    public abstract AbstractC11313e mo21700b(C11136b bVar);

    /* renamed from: c */
    public abstract <S extends AbstractC14411h> S mo21699c(AbstractC11313e eVar, Function0<? extends S> function0);

    /* renamed from: d */
    public abstract boolean mo21698d(AbstractC11327h0 h0Var);

    /* renamed from: e */
    public abstract boolean mo21697e(AbstractC7268g1 g1Var);

    /* renamed from: f */
    public abstract AbstractC11326h mo21696f(AbstractC11346m mVar);

    /* renamed from: g */
    public abstract Collection<AbstractC7267g0> mo21695g(AbstractC11313e eVar);

    /* renamed from: h */
    public abstract AbstractC7267g0 mo21694h(AbstractC9618i iVar);
}
