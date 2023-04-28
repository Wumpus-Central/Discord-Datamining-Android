package p233mi;

import fi.AbstractC7267g0;
import java.util.Collection;
import java.util.List;
import ki.C9883a;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217lg.AbstractC10420h;
import p233mi.AbstractC10641k;
import p233mi.AbstractC10655r;
import p233mi.AbstractC10663t;
import p249nh.C11136b;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11326h;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.C11393x;
import p388vh.C13508c;
import p468zh.AbstractC14663g;
import p468zh.C14661e;

/* renamed from: mi.p */
/* loaded from: classes8.dex */
public final class C10650p extends AbstractC10622b {

    /* renamed from: a */
    public static final C10650p f23546a = new C10650p();

    /* renamed from: b */
    private static final List<C10634h> f23547b;

    /* renamed from: mi.p$a */
    /* loaded from: classes8.dex */
    static final class C10651a extends AbstractC9973s implements Function1<AbstractC11397y, String> {

        /* renamed from: k */
        public static final C10651a f23548k = new C10651a();

        C10651a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(AbstractC11397y $receiver) {
            Object i0;
            boolean z;
            C9971q.m14633g($receiver, "$this$$receiver");
            List<AbstractC11335j1> valueParameters = $receiver.mo6242i();
            C9971q.m14634f(valueParameters, "valueParameters");
            i0 = C9914r.m14756i0(valueParameters);
            AbstractC11335j1 j1Var = (AbstractC11335j1) i0;
            boolean z2 = false;
            if (j1Var != null) {
                if (C13508c.m3538c(j1Var) || j1Var.mo6304r0() != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z2 = true;
                }
            }
            C10650p pVar = C10650p.f23546a;
            if (!z2) {
                return "last parameter should not have a default value or be a vararg";
            }
            return null;
        }
    }

    /* renamed from: mi.p$b */
    /* loaded from: classes8.dex */
    static final class C10652b extends AbstractC9973s implements Function1<AbstractC11397y, String> {

        /* renamed from: k */
        public static final C10652b f23549k = new C10652b();

        C10652b() {
            super(1);
        }

        /* renamed from: b */
        private static final boolean m12686b(AbstractC11346m mVar) {
            return (mVar instanceof AbstractC11313e) && AbstractC10420h.m13401a0((AbstractC11313e) mVar);
        }

        /* renamed from: a */
        public final String invoke(AbstractC11397y $receiver) {
            boolean z;
            C9971q.m14633g($receiver, "$this$$receiver");
            C10650p pVar = C10650p.f23546a;
            AbstractC11346m containingDeclaration = $receiver.mo6104b();
            C9971q.m14634f(containingDeclaration, "containingDeclaration");
            boolean z2 = true;
            if (!m12686b(containingDeclaration)) {
                Collection<? extends AbstractC11397y> overriddenDescriptors = $receiver.mo6249d();
                C9971q.m14634f(overriddenDescriptors, "overriddenDescriptors");
                if (!overriddenDescriptors.isEmpty()) {
                    for (AbstractC11397y yVar : overriddenDescriptors) {
                        AbstractC11346m b = yVar.mo6104b();
                        C9971q.m14634f(b, "it.containingDeclaration");
                        if (m12686b(b)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
            }
            if (!z2) {
                return "must override ''equals()'' in Any";
            }
            return null;
        }
    }

    /* renamed from: mi.p$c */
    /* loaded from: classes8.dex */
    static final class C10653c extends AbstractC9973s implements Function1<AbstractC11397y, String> {

        /* renamed from: k */
        public static final C10653c f23550k = new C10653c();

        C10653c() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(AbstractC11397y $receiver) {
            boolean z;
            C9971q.m14633g($receiver, "$this$$receiver");
            AbstractC11396x0 J = $receiver.mo6266J();
            if (J == null) {
                J = $receiver.mo6264M();
            }
            C10650p pVar = C10650p.f23546a;
            boolean z2 = false;
            if (J != null) {
                AbstractC7267g0 returnType = $receiver.getReturnType();
                if (returnType != null) {
                    AbstractC7267g0 type = J.getType();
                    C9971q.m14634f(type, "receiver.type");
                    z = C9883a.m15089p(returnType, type);
                } else {
                    z = false;
                }
                if (z || pVar.m12689d($receiver, J)) {
                    z2 = true;
                }
            }
            if (!z2) {
                return "receiver must be a supertype of the return type";
            }
            return null;
        }
    }

    static {
        List l;
        List<C10634h> l2;
        C11142f fVar = C10654q.f23561k;
        AbstractC10641k.C10643b bVar = AbstractC10641k.C10643b.f23538b;
        AbstractC10628f[] fVarArr = {bVar, new AbstractC10663t.C10664a(1)};
        C11142f fVar2 = C10654q.f23562l;
        AbstractC10628f[] fVarArr2 = {bVar, new AbstractC10663t.C10664a(2)};
        C11142f fVar3 = C10654q.f23552b;
        C10646m mVar = C10646m.f23540a;
        C10640j jVar = C10640j.f23534a;
        C11142f fVar4 = C10654q.f23558h;
        AbstractC10663t.C10667d dVar = AbstractC10663t.C10667d.f23593b;
        AbstractC10655r.C10656a aVar = AbstractC10655r.C10656a.f23580d;
        C11142f fVar5 = C10654q.f23560j;
        AbstractC10663t.C10666c cVar = AbstractC10663t.C10666c.f23592b;
        l = C9906j.m14817l(C10654q.f23574x, C10654q.f23575y);
        l2 = C9906j.m14817l(new C10634h(fVar, fVarArr, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(fVar2, fVarArr2, C10651a.f23548k), new C10634h(fVar3, new AbstractC10628f[]{bVar, mVar, new AbstractC10663t.C10664a(2), jVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f23553c, new AbstractC10628f[]{bVar, mVar, new AbstractC10663t.C10664a(3), jVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f23554d, new AbstractC10628f[]{bVar, mVar, new AbstractC10663t.C10665b(2), jVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f23559i, new AbstractC10628f[]{bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(fVar4, new AbstractC10628f[]{bVar, dVar, mVar, aVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(fVar5, new AbstractC10628f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f23563m, new AbstractC10628f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f23564n, new AbstractC10628f[]{bVar, cVar, aVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f38810I, new AbstractC10628f[]{bVar, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f38811J, new AbstractC10628f[]{bVar, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f23555e, new AbstractC10628f[]{AbstractC10641k.C10642a.f23537b}, C10652b.f23549k), new C10634h(C10654q.f23557g, new AbstractC10628f[]{bVar, AbstractC10655r.C10657b.f23582d, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f38820S, new AbstractC10628f[]{bVar, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f38819R, new AbstractC10628f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(l, new AbstractC10628f[]{bVar}, C10653c.f23550k), new C10634h(C10654q.f38821T, new AbstractC10628f[]{bVar, AbstractC10655r.C10659c.f23584d, dVar, mVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C10634h(C10654q.f23566p, new AbstractC10628f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null));
        f23547b = l2;
    }

    private C10650p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m12689d(AbstractC11397y yVar, AbstractC11396x0 x0Var) {
        C11136b k;
        AbstractC7267g0 returnType;
        AbstractC14663g value = x0Var.getValue();
        C9971q.m14634f(value, "receiver.value");
        if (!(value instanceof C14661e)) {
            return false;
        }
        AbstractC11313e t = ((C14661e) value).mo45t();
        if (!t.mo6114h0() || (k = C13508c.m3530k(t)) == null) {
            return false;
        }
        AbstractC11326h b = C11393x.m10148b(C13508c.m3525p(t), k);
        if (!(b instanceof AbstractC11316e1)) {
            b = null;
        }
        AbstractC11316e1 e1Var = (AbstractC11316e1) b;
        if (e1Var == null || (returnType = yVar.getReturnType()) == null) {
            return false;
        }
        return C9883a.m15089p(returnType, e1Var.mo10218E());
    }

    @Override // p233mi.AbstractC10622b
    /* renamed from: b */
    public List<C10634h> mo12691b() {
        return f23547b;
    }
}
