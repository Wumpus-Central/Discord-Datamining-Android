package ng;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9920v;
import kotlin.collections.C9921w;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11137c;
import p268og.AbstractC11313e;
import p325rh.C12661e;
import p388vh.C13508c;

/* renamed from: ng.d */
/* loaded from: classes8.dex */
public final class C11107d {

    /* renamed from: a */
    public static final C11107d f24646a = new C11107d();

    private C11107d() {
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC11313e m10884f(C11107d dVar, C11137c cVar, AbstractC10420h hVar, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return dVar.m10885e(cVar, hVar, num);
    }

    /* renamed from: a */
    public final AbstractC11313e m10889a(AbstractC11313e mutable) {
        C9971q.m14633g(mutable, "mutable");
        C11137c o = C11105c.f24626a.m10895o(C12661e.m6041m(mutable));
        if (o != null) {
            AbstractC11313e o2 = C13508c.m3531j(mutable).m13375o(o);
            C9971q.m14634f(o2, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o2;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    /* renamed from: b */
    public final AbstractC11313e m10888b(AbstractC11313e readOnly) {
        C9971q.m14633g(readOnly, "readOnly");
        C11137c p = C11105c.f24626a.m10894p(C12661e.m6041m(readOnly));
        if (p != null) {
            AbstractC11313e o = C13508c.m3531j(readOnly).m13375o(p);
            C9971q.m14634f(o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    /* renamed from: c */
    public final boolean m10887c(AbstractC11313e mutable) {
        C9971q.m14633g(mutable, "mutable");
        return C11105c.f24626a.m10899k(C12661e.m6041m(mutable));
    }

    /* renamed from: d */
    public final boolean m10886d(AbstractC11313e readOnly) {
        C9971q.m14633g(readOnly, "readOnly");
        return C11105c.f24626a.m10898l(C12661e.m6041m(readOnly));
    }

    /* renamed from: e */
    public final AbstractC11313e m10885e(C11137c fqName, AbstractC10420h builtIns, Integer num) {
        C11136b bVar;
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(builtIns, "builtIns");
        if (num == null || !C9971q.m14638b(fqName, C11105c.f24626a.m10902h())) {
            bVar = C11105c.f24626a.m10897m(fqName);
        } else {
            bVar = C10434k.m13333a(num.intValue());
        }
        if (bVar != null) {
            return builtIns.m13375o(bVar.m10816b());
        }
        return null;
    }

    /* renamed from: g */
    public final Collection<AbstractC11313e> m10883g(C11137c fqName, AbstractC10420h builtIns) {
        List l;
        Set c;
        Set d;
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(builtIns, "builtIns");
        AbstractC11313e f = m10884f(this, fqName, builtIns, null, 4, null);
        if (f == null) {
            d = C9921w.m14722d();
            return d;
        }
        C11137c p = C11105c.f24626a.m10894p(C13508c.m3528m(f));
        if (p == null) {
            c = C9920v.m14723c(f);
            return c;
        }
        AbstractC11313e o = builtIns.m13375o(p);
        C9971q.m14634f(o, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        l = C9906j.m14817l(f, o);
        return l;
    }
}
