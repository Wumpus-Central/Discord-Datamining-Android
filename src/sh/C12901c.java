package sh;

import fi.AbstractC7267g0;
import fi.AbstractC7290k1;
import fi.EnumC7338w1;
import gi.AbstractC7664g;
import gi.C7668j;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;

/* renamed from: sh.c */
/* loaded from: classes8.dex */
public final class C12901c implements AbstractC12900b {

    /* renamed from: a */
    private final AbstractC7290k1 f28977a;

    /* renamed from: b */
    private C7668j f28978b;

    public C12901c(AbstractC7290k1 projection) {
        C9971q.m14633g(projection, "projection");
        this.f28977a = projection;
        mo5160b().mo22906b();
        EnumC7338w1 w1Var = EnumC7338w1.INVARIANT;
    }

    @Override // sh.AbstractC12900b
    /* renamed from: b */
    public AbstractC7290k1 mo5160b() {
        return this.f28977a;
    }

    /* renamed from: c */
    public Void m5159c() {
        return null;
    }

    /* renamed from: d */
    public final C7668j m5158d() {
        return this.f28978b;
    }

    /* renamed from: e */
    public C12901c mo4566o(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7290k1 o = mo5160b().mo22903o(kotlinTypeRefiner);
        C9971q.m14634f(o, "projection.refine(kotlinTypeRefiner)");
        return new C12901c(o);
    }

    /* renamed from: f */
    public final void m5156f(C7668j jVar) {
        this.f28978b = jVar;
    }

    @Override // fi.AbstractC7268g1
    public List<AbstractC11319f1> getParameters() {
        List<AbstractC11319f1> i;
        i = C9906j.m14820i();
        return i;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: m */
    public Collection<AbstractC7267g0> mo4568m() {
        AbstractC7267g0 g0Var;
        List d;
        if (mo5160b().mo22906b() == EnumC7338w1.OUT_VARIANCE) {
            g0Var = mo5160b().getType();
        } else {
            g0Var = mo4567n().m13419I();
        }
        C9971q.m14634f(g0Var, "if (projection.projectio… builtIns.nullableAnyType");
        d = C9905i.m14825d(g0Var);
        return d;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: n */
    public AbstractC10420h mo4567n() {
        AbstractC10420h n = mo5160b().getType().mo5172N0().mo4567n();
        C9971q.m14634f(n, "projection.type.constructor.builtIns");
        return n;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: p */
    public /* bridge */ /* synthetic */ AbstractC11326h mo4565p() {
        return (AbstractC11326h) m5159c();
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: q */
    public boolean mo4564q() {
        return false;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + mo5160b() + ')';
    }
}
