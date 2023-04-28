package p272p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p390w.AbstractC13684v1;
import p390w.C13639n0;

/* renamed from: p.d */
/* loaded from: classes.dex */
public final class C11505d extends AbstractC13684v1<AbstractC11504c> {

    /* renamed from: p.d$a */
    /* loaded from: classes.dex */
    public static final class C11506a {

        /* renamed from: a */
        private final List<AbstractC11504c> f25641a = new ArrayList();

        C11506a(List<AbstractC11504c> list) {
            for (AbstractC11504c cVar : list) {
                this.f25641a.add(cVar);
            }
        }

        /* renamed from: a */
        public List<C13639n0> m9545a() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC11504c cVar : this.f25641a) {
                C13639n0 d = cVar.mo9551d();
                if (d != null) {
                    arrayList.add(d);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public List<C13639n0> m9544b() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC11504c cVar : this.f25641a) {
                C13639n0 e = cVar.mo9550e();
                if (e != null) {
                    arrayList.add(e);
                }
            }
            return arrayList;
        }

        /* renamed from: c */
        public List<C13639n0> m9543c() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC11504c cVar : this.f25641a) {
                C13639n0 f = cVar.mo9549f();
                if (f != null) {
                    arrayList.add(f);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public List<C13639n0> m9542d() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC11504c cVar : this.f25641a) {
                C13639n0 g = cVar.mo9548g();
                if (g != null) {
                    arrayList.add(g);
                }
            }
            return arrayList;
        }
    }

    public C11505d(AbstractC11504c... cVarArr) {
        m3055a(Arrays.asList(cVarArr));
    }

    /* renamed from: e */
    public static C11505d m9546e() {
        return new C11505d(new AbstractC11504c[0]);
    }

    @Override // p390w.AbstractC13684v1
    /* renamed from: b */
    public AbstractC13684v1<AbstractC11504c> clone() {
        C11505d e = m9546e();
        e.m3055a(m3053c());
        return e;
    }

    /* renamed from: d */
    public C11506a m9547d() {
        return new C11506a(m3053c());
    }
}
