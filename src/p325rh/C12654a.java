package p325rh;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11326h;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.EnumC11314e0;
import p303qf.C12120c;
import p388vh.C13508c;
import p406wg.EnumC13881d;
import p448yh.AbstractC14411h;
import p448yh.AbstractC14416k;
import p448yh.C14403d;

/* renamed from: rh.a */
/* loaded from: classes8.dex */
public final class C12654a extends AbstractC12686p {

    /* renamed from: a */
    public static final C12654a f28484a = new C12654a();

    /* renamed from: rh.a$a */
    /* loaded from: classes8.dex */
    public static final class C0405a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = C12120c.m7778d(C13508c.m3529l((AbstractC11313e) t).m10803b(), C13508c.m3529l((AbstractC11313e) t2).m10803b());
            return d;
        }
    }

    private C12654a() {
    }

    /* renamed from: b */
    private static final void m6100b(AbstractC11313e eVar, LinkedHashSet<AbstractC11313e> linkedHashSet, AbstractC14411h hVar, boolean z) {
        for (AbstractC11346m mVar : AbstractC14416k.C14417a.m645a(hVar, C14403d.f32602t, null, 2, null)) {
            if (mVar instanceof AbstractC11313e) {
                AbstractC11313e eVar2 = (AbstractC11313e) mVar;
                if (eVar2.mo6114h0()) {
                    C11142f name = eVar2.getName();
                    C9971q.m14634f(name, "descriptor.name");
                    AbstractC11326h e = hVar.mo636e(name, EnumC13881d.WHEN_GET_ALL_DESCRIPTORS);
                    if (e instanceof AbstractC11313e) {
                        eVar2 = (AbstractC11313e) e;
                    } else if (e instanceof AbstractC11316e1) {
                        eVar2 = ((AbstractC11316e1) e).mo10216t();
                    } else {
                        eVar2 = null;
                    }
                }
                if (eVar2 != null) {
                    if (C12661e.m6028z(eVar2, eVar)) {
                        linkedHashSet.add(eVar2);
                    }
                    if (z) {
                        AbstractC14411h R = eVar2.mo6170R();
                        C9971q.m14634f(R, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m6100b(eVar, linkedHashSet, R, z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Collection<AbstractC11313e> m6101a(AbstractC11313e sealedClass, boolean z) {
        AbstractC11346m mVar;
        List w0;
        AbstractC11346m mVar2;
        List i;
        C9971q.m14633g(sealedClass, "sealedClass");
        if (sealedClass.mo6108s() != EnumC11314e0.SEALED) {
            i = C9906j.m14820i();
            return i;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z) {
            mVar = sealedClass.mo6104b();
        } else {
            Iterator<AbstractC11346m> it = C13508c.m3524q(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar2 = null;
                    break;
                }
                mVar2 = it.next();
                if (mVar2 instanceof AbstractC11344l0) {
                    break;
                }
            }
            mVar = mVar2;
        }
        if (mVar instanceof AbstractC11344l0) {
            m6100b(sealedClass, linkedHashSet, ((AbstractC11344l0) mVar).mo6298o(), z);
        }
        AbstractC14411h R = sealedClass.mo6170R();
        C9971q.m14634f(R, "sealedClass.unsubstitutedInnerClassesScope");
        m6100b(sealedClass, linkedHashSet, R, true);
        w0 = C9914r.m14742w0(linkedHashSet, new C0405a());
        return w0;
    }
}
