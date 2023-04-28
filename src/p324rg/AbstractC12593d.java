package p324rg;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.C7278i0;
import fi.C7322s1;
import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6944n;
import p217lg.AbstractC10420h;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p268og.AbstractC11363o;
import p268og.AbstractC11365p;
import p268og.AbstractC11387u;
import p324rg.C12613j0;
import p388vh.C13508c;
import p448yh.AbstractC14411h;
import pg.AbstractC11672g;

/* renamed from: rg.d */
/* loaded from: classes8.dex */
public abstract class AbstractC12593d extends AbstractC12616k implements AbstractC11316e1 {

    /* renamed from: o */
    private final AbstractC11387u f28322o;

    /* renamed from: p */
    private List<? extends AbstractC11319f1> f28323p;

    /* renamed from: q */
    private final C12596c f28324q = new C12596c();

    /* renamed from: rg.d$a */
    /* loaded from: classes8.dex */
    static final class C12594a extends AbstractC9973s implements Function1<AbstractC7664g, AbstractC7304o0> {
        C12594a() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC7304o0 invoke(AbstractC7664g gVar) {
            AbstractC11326h f = gVar.mo21696f(AbstractC12593d.this);
            if (f != null) {
                return f.mo6166p();
            }
            return null;
        }
    }

    /* renamed from: rg.d$b */
    /* loaded from: classes8.dex */
    static final class C12595b extends AbstractC9973s implements Function1<AbstractC7335v1, Boolean> {
        C12595b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC7335v1 type) {
            boolean z;
            C9971q.m14634f(type, "type");
            boolean z2 = false;
            if (!C7278i0.m23035a(type)) {
                AbstractC12593d dVar = AbstractC12593d.this;
                AbstractC11326h p = type.mo5172N0().mo4565p();
                if (!(p instanceof AbstractC11319f1) || C9971q.m14638b(((AbstractC11319f1) p).mo6104b(), dVar)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: rg.d$c */
    /* loaded from: classes8.dex */
    public static final class C12596c implements AbstractC7268g1 {
        C12596c() {
        }

        /* renamed from: c */
        public AbstractC11316e1 mo4565p() {
            return AbstractC12593d.this;
        }

        @Override // fi.AbstractC7268g1
        public List<AbstractC11319f1> getParameters() {
            return AbstractC12593d.this.mo6404M0();
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: m */
        public Collection<AbstractC7267g0> mo4568m() {
            Collection<AbstractC7267g0> m = mo4565p().mo10217q0().mo5172N0().mo4568m();
            C9971q.m14634f(m, "declarationDescriptor.un…pe.constructor.supertypes");
            return m;
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: n */
        public AbstractC10420h mo4567n() {
            return C13508c.m3531j(mo4565p());
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: o */
        public AbstractC7268g1 mo4566o(AbstractC7664g kotlinTypeRefiner) {
            C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // fi.AbstractC7268g1
        /* renamed from: q */
        public boolean mo4564q() {
            return true;
        }

        public String toString() {
            return "[typealias " + mo4565p().getName().m10771b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12593d(AbstractC11346m containingDeclaration, AbstractC11672g annotations, C11142f name, AbstractC11299a1 sourceElement, AbstractC11387u visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(sourceElement, "sourceElement");
        C9971q.m14633g(visibilityImpl, "visibilityImpl");
        this.f28322o = visibilityImpl;
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> visitor, D d) {
        C9971q.m14633g(visitor, "visitor");
        return visitor.mo6317g(this, d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public final AbstractC7304o0 m6408G0() {
        AbstractC14411h hVar;
        AbstractC11313e t = mo10216t();
        if (t == null || (hVar = t.mo6169U()) == null) {
            hVar = AbstractC14411h.C14413b.f32626b;
        }
        AbstractC7304o0 v = C7322s1.m22925v(this, hVar, new C12594a());
        C9971q.m14634f(v, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return v;
    }

    /* renamed from: K */
    protected abstract AbstractC6944n mo6407K();

    /* renamed from: K0 */
    public AbstractC11316e1 mo6162a() {
        AbstractC11365p D0 = super.mo6162a();
        C9971q.m14635e(D0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (AbstractC11316e1) D0;
    }

    /* renamed from: L0 */
    public final Collection<AbstractC12611i0> m6405L0() {
        List i;
        AbstractC11313e t = mo10216t();
        if (t == null) {
            i = C9906j.m14820i();
            return i;
        }
        Collection<AbstractC11309d> l = t.mo6110l();
        C9971q.m14634f(l, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (AbstractC11309d it : l) {
            C12613j0.C12614a aVar = C12613j0.f39321S;
            AbstractC6944n K = mo6407K();
            C9971q.m14634f(it, "it");
            AbstractC12611i0 b = aVar.m6340b(K, this, it);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* renamed from: M0 */
    protected abstract List<AbstractC11319f1> mo6404M0();

    /* renamed from: N0 */
    public final void m6403N0(List<? extends AbstractC11319f1> declaredTypeParameters) {
        C9971q.m14633g(declaredTypeParameters, "declaredTypeParameters");
        this.f28323p = declaredTypeParameters;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: V */
    public boolean mo6120V() {
        return false;
    }

    @Override // p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        return this.f28322o;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: h0 */
    public boolean mo6114h0() {
        return false;
    }

    @Override // p268og.AbstractC11310d0
    public boolean isExternal() {
        return false;
    }

    @Override // p268og.AbstractC11326h
    /* renamed from: k */
    public AbstractC7268g1 mo6111k() {
        return this.f28324q;
    }

    @Override // p268og.AbstractC11330i
    /* renamed from: r */
    public List<AbstractC11319f1> mo6109r() {
        List list = this.f28323p;
        if (list != null) {
            return list;
        }
        C9971q.m14615y("declaredTypeParametersImpl");
        return null;
    }

    @Override // p324rg.AbstractC12612j
    public String toString() {
        return "typealias " + getName().m10771b();
    }

    @Override // p268og.AbstractC11330i
    /* renamed from: y */
    public boolean mo6106y() {
        return C7322s1.m22944c(mo10217q0(), new C12595b());
    }
}
