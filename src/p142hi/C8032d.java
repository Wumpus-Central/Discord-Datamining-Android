package p142hi;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p217lg.C10416e;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11327h0;
import p268og.AbstractC11346m;
import p268og.AbstractC11363o;
import p268og.AbstractC11368q0;
import p268og.C11321g0;
import pg.AbstractC11672g;

/* renamed from: hi.d */
/* loaded from: classes8.dex */
public final class C8032d implements AbstractC11327h0 {

    /* renamed from: l */
    private static final C11142f f17336l;

    /* renamed from: m */
    private static final List<AbstractC11327h0> f17337m;

    /* renamed from: n */
    private static final List<AbstractC11327h0> f17338n;

    /* renamed from: o */
    private static final Set<AbstractC11327h0> f17339o;

    /* renamed from: k */
    public static final C8032d f17335k = new C8032d();

    /* renamed from: p */
    private static final AbstractC10420h f17340p = C10416e.f22826h.m13452a();

    static {
        List<AbstractC11327h0> i;
        List<AbstractC11327h0> i2;
        Set<AbstractC11327h0> d;
        C11142f i3 = C11142f.m10764i(EnumC8029b.ERROR_MODULE.m20791b());
        C9971q.m14634f(i3, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f17336l = i3;
        i = C9906j.m14820i();
        f17337m = i;
        i2 = C9906j.m14820i();
        f17338n = i2;
        d = C9921w.m14722d();
        f17339o = d;
    }

    private C8032d() {
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> visitor, D d) {
        C9971q.m14633g(visitor, "visitor");
        return null;
    }

    /* renamed from: I */
    public C11142f m20789I() {
        return f17336l;
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: a */
    public AbstractC11346m mo6162a() {
        return this;
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: b */
    public AbstractC11346m mo6104b() {
        return null;
    }

    @Override // pg.AbstractC11664a
    public AbstractC11672g getAnnotations() {
        return AbstractC11672g.f26044g.m9048b();
    }

    @Override // p268og.AbstractC11334j0
    public C11142f getName() {
        return m20789I();
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: m0 */
    public boolean mo6137m0(AbstractC11327h0 targetModule) {
        C9971q.m14633g(targetModule, "targetModule");
        return false;
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: n */
    public AbstractC10420h mo6136n() {
        return f17340p;
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: n0 */
    public AbstractC11368q0 mo6135n0(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: q */
    public Collection<C11137c> mo6134q(C11137c fqName, Function1<? super C11142f, Boolean> nameFilter) {
        List i;
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(nameFilter, "nameFilter");
        i = C9906j.m14820i();
        return i;
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: v0 */
    public <T> T mo6133v0(C11321g0<T> capability) {
        C9971q.m14633g(capability, "capability");
        return null;
    }

    @Override // p268og.AbstractC11327h0
    /* renamed from: x0 */
    public List<AbstractC11327h0> mo6132x0() {
        return f17338n;
    }
}
