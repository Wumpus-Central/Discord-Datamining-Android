package gi;

import fi.AbstractC7267g0;
import fi.AbstractC7335v1;
import fi.C7241f;
import fi.C7250f1;
import gi.AbstractC7661f;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p325rh.C12669k;

/* renamed from: gi.m */
/* loaded from: classes8.dex */
public final class C7676m implements AbstractC7674l {

    /* renamed from: c */
    private final AbstractC7664g f16682c;

    /* renamed from: d */
    private final AbstractC7661f f16683d;

    /* renamed from: e */
    private final C12669k f16684e;

    public C7676m(AbstractC7664g kotlinTypeRefiner, AbstractC7661f kotlinTypePreparator) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        C9971q.m14633g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f16682c = kotlinTypeRefiner;
        this.f16683d = kotlinTypePreparator;
        C12669k m = C12669k.m5993m(mo21672d());
        C9971q.m14634f(m, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f16684e = m;
    }

    @Override // gi.AbstractC7674l
    /* renamed from: a */
    public C12669k mo21675a() {
        return this.f16684e;
    }

    @Override // gi.AbstractC7659e
    /* renamed from: b */
    public boolean mo21674b(AbstractC7267g0 subtype, AbstractC7267g0 supertype) {
        C9971q.m14633g(subtype, "subtype");
        C9971q.m14633g(supertype, "supertype");
        return m21669g(C7654a.m21779b(true, false, null, m21670f(), mo21672d(), 6, null), subtype.mo22868Q0(), supertype.mo22868Q0());
    }

    @Override // gi.AbstractC7659e
    /* renamed from: c */
    public boolean mo21673c(AbstractC7267g0 a, AbstractC7267g0 b) {
        C9971q.m14633g(a, "a");
        C9971q.m14633g(b, "b");
        return m21671e(C7654a.m21779b(false, false, null, m21670f(), mo21672d(), 6, null), a.mo22868Q0(), b.mo22868Q0());
    }

    @Override // gi.AbstractC7674l
    /* renamed from: d */
    public AbstractC7664g mo21672d() {
        return this.f16682c;
    }

    /* renamed from: e */
    public final boolean m21671e(C7250f1 f1Var, AbstractC7335v1 a, AbstractC7335v1 b) {
        C9971q.m14633g(f1Var, "<this>");
        C9971q.m14633g(a, "a");
        C9971q.m14633g(b, "b");
        return C7241f.f15681a.m23123k(f1Var, a, b);
    }

    /* renamed from: f */
    public AbstractC7661f m21670f() {
        return this.f16683d;
    }

    /* renamed from: g */
    public final boolean m21669g(C7250f1 f1Var, AbstractC7335v1 subType, AbstractC7335v1 superType) {
        C9971q.m14633g(f1Var, "<this>");
        C9971q.m14633g(subType, "subType");
        C9971q.m14633g(superType, "superType");
        return C7241f.m23114t(C7241f.f15681a, f1Var, subType, superType, false, 8, null);
    }

    public /* synthetic */ C7676m(AbstractC7664g gVar, AbstractC7661f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i & 2) != 0 ? AbstractC7661f.C7662a.f16660a : fVar);
    }
}
