package bh;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9921w;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6902n;
import p086eh.AbstractC6906r;
import p086eh.AbstractC6911w;
import p249nh.C11142f;

/* renamed from: bh.b */
/* loaded from: classes8.dex */
public interface AbstractC3493b {

    /* renamed from: bh.b$a */
    /* loaded from: classes8.dex */
    public static final class C3494a implements AbstractC3493b {

        /* renamed from: a */
        public static final C3494a f5631a = new C3494a();

        private C3494a() {
        }

        @Override // bh.AbstractC3493b
        /* renamed from: a */
        public Set<C11142f> mo34301a() {
            Set<C11142f> d;
            d = C9921w.m14722d();
            return d;
        }

        @Override // bh.AbstractC3493b
        /* renamed from: b */
        public Set<C11142f> mo34300b() {
            Set<C11142f> d;
            d = C9921w.m14722d();
            return d;
        }

        @Override // bh.AbstractC3493b
        /* renamed from: c */
        public Set<C11142f> mo34299c() {
            Set<C11142f> d;
            d = C9921w.m14722d();
            return d;
        }

        @Override // bh.AbstractC3493b
        /* renamed from: d */
        public AbstractC6911w mo34298d(C11142f name) {
            C9971q.m14633g(name, "name");
            return null;
        }

        @Override // bh.AbstractC3493b
        /* renamed from: f */
        public AbstractC6902n mo34296f(C11142f name) {
            C9971q.m14633g(name, "name");
            return null;
        }

        /* renamed from: g */
        public List<AbstractC6906r> mo34297e(C11142f name) {
            List<AbstractC6906r> i;
            C9971q.m14633g(name, "name");
            i = C9906j.m14820i();
            return i;
        }
    }

    /* renamed from: a */
    Set<C11142f> mo34301a();

    /* renamed from: b */
    Set<C11142f> mo34300b();

    /* renamed from: c */
    Set<C11142f> mo34299c();

    /* renamed from: d */
    AbstractC6911w mo34298d(C11142f fVar);

    /* renamed from: e */
    Collection<AbstractC6906r> mo34297e(C11142f fVar);

    /* renamed from: f */
    AbstractC6902n mo34296f(C11142f fVar);
}
