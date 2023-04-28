package p407wh;

import bh.C3521h;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p013ah.C1397f;
import p086eh.AbstractC6895g;
import p086eh.EnumC6892d0;
import p249nh.C11137c;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p406wg.EnumC13881d;
import p447yg.AbstractC14388g;
import p448yh.AbstractC14411h;

/* renamed from: wh.c */
/* loaded from: classes8.dex */
public final class C13884c {

    /* renamed from: a */
    private final C1397f f31295a;

    /* renamed from: b */
    private final AbstractC14388g f31296b;

    public C13884c(C1397f packageFragmentProvider, AbstractC14388g javaResolverCache) {
        C9971q.m14633g(packageFragmentProvider, "packageFragmentProvider");
        C9971q.m14633g(javaResolverCache, "javaResolverCache");
        this.f31295a = packageFragmentProvider;
        this.f31296b = javaResolverCache;
    }

    /* renamed from: a */
    public final C1397f m2404a() {
        return this.f31295a;
    }

    /* renamed from: b */
    public final AbstractC11313e m2403b(AbstractC6895g javaClass) {
        Object W;
        AbstractC14411h hVar;
        AbstractC11326h hVar2;
        C9971q.m14633g(javaClass, "javaClass");
        C11137c e = javaClass.mo4017e();
        if (e != null && javaClass.mo4026K() == EnumC6892d0.SOURCE) {
            return this.f31296b.mo705c(e);
        }
        AbstractC6895g o = javaClass.mo4014o();
        if (o != null) {
            AbstractC11313e b = m2403b(o);
            if (b != null) {
                hVar = b.mo6170R();
            } else {
                hVar = null;
            }
            if (hVar != null) {
                hVar2 = hVar.mo636e(javaClass.getName(), EnumC13881d.FROM_JAVA_LOADER);
            } else {
                hVar2 = null;
            }
            if (hVar2 instanceof AbstractC11313e) {
                return (AbstractC11313e) hVar2;
            }
            return null;
        } else if (e == null) {
            return null;
        } else {
            C1397f fVar = this.f31295a;
            C11137c e2 = e.m10800e();
            C9971q.m14634f(e2, "fqName.parent()");
            W = C9914r.m14768W(fVar.mo6357a(e2));
            C3521h hVar3 = (C3521h) W;
            if (hVar3 != null) {
                return hVar3.m34193L0(javaClass);
            }
            return null;
        }
    }
}
