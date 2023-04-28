package p304qg;

import fi.AbstractC7267g0;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11404z0;

/* renamed from: qg.a */
/* loaded from: classes8.dex */
public interface AbstractC12125a {

    /* renamed from: qg.a$a */
    /* loaded from: classes8.dex */
    public static final class C0385a implements AbstractC12125a {

        /* renamed from: a */
        public static final C0385a f27210a = new C0385a();

        private C0385a() {
        }

        @Override // p304qg.AbstractC12125a
        /* renamed from: a */
        public Collection<C11142f> mo7773a(AbstractC11313e classDescriptor) {
            List i;
            C9971q.m14633g(classDescriptor, "classDescriptor");
            i = C9906j.m14820i();
            return i;
        }

        @Override // p304qg.AbstractC12125a
        /* renamed from: b */
        public Collection<AbstractC7267g0> mo7772b(AbstractC11313e classDescriptor) {
            List i;
            C9971q.m14633g(classDescriptor, "classDescriptor");
            i = C9906j.m14820i();
            return i;
        }

        @Override // p304qg.AbstractC12125a
        /* renamed from: c */
        public Collection<AbstractC11404z0> mo7771c(C11142f name, AbstractC11313e classDescriptor) {
            List i;
            C9971q.m14633g(name, "name");
            C9971q.m14633g(classDescriptor, "classDescriptor");
            i = C9906j.m14820i();
            return i;
        }

        @Override // p304qg.AbstractC12125a
        /* renamed from: e */
        public Collection<AbstractC11309d> mo7770e(AbstractC11313e classDescriptor) {
            List i;
            C9971q.m14633g(classDescriptor, "classDescriptor");
            i = C9906j.m14820i();
            return i;
        }
    }

    /* renamed from: a */
    Collection<C11142f> mo7773a(AbstractC11313e eVar);

    /* renamed from: b */
    Collection<AbstractC7267g0> mo7772b(AbstractC11313e eVar);

    /* renamed from: c */
    Collection<AbstractC11404z0> mo7771c(C11142f fVar, AbstractC11313e eVar);

    /* renamed from: e */
    Collection<AbstractC11309d> mo7770e(AbstractC11313e eVar);
}
