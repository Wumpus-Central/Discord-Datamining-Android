package fi;

import gi.AbstractC7664g;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p142hi.C8034f;
import p142hi.C8040l;
import p448yh.AbstractC14411h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fi.p0 */
/* loaded from: classes8.dex */
public final class C7308p0 extends AbstractC7304o0 {

    /* renamed from: l */
    private final AbstractC7268g1 f15785l;

    /* renamed from: m */
    private final List<AbstractC7290k1> f15786m;

    /* renamed from: n */
    private final boolean f15787n;

    /* renamed from: o */
    private final AbstractC14411h f15788o;

    /* renamed from: p */
    private final Function1<AbstractC7664g, AbstractC7304o0> f15789p;

    /* JADX WARN: Multi-variable type inference failed */
    public C7308p0(AbstractC7268g1 constructor, List<? extends AbstractC7290k1> arguments, boolean z, AbstractC14411h memberScope, Function1<? super AbstractC7664g, ? extends AbstractC7304o0> refinedTypeFactory) {
        C9971q.m14633g(constructor, "constructor");
        C9971q.m14633g(arguments, "arguments");
        C9971q.m14633g(memberScope, "memberScope");
        C9971q.m14633g(refinedTypeFactory, "refinedTypeFactory");
        this.f15785l = constructor;
        this.f15786m = arguments;
        this.f15787n = z;
        this.f15788o = memberScope;
        this.f15789p = refinedTypeFactory;
        if ((mo5161o() instanceof C8034f) && !(mo5161o() instanceof C8040l)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + mo5161o() + '\n' + mo5172N0());
        }
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: L0 */
    public List<AbstractC7290k1> mo5174L0() {
        return this.f15786m;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: M0 */
    public C7232c1 mo5173M0() {
        return C7232c1.f15671l.m23149h();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: N0 */
    public AbstractC7268g1 mo5172N0() {
        return this.f15785l;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return this.f15787n;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: U0 */
    public AbstractC7304o0 mo5169R0(boolean z) {
        if (z == mo5171O0()) {
            return this;
        }
        if (z) {
            return new C7295m0(this);
        }
        return new C7289k0(this);
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: V0 */
    public AbstractC7304o0 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        if (newAttributes.isEmpty()) {
            return this;
        }
        return new C7315q0(this, newAttributes);
    }

    /* renamed from: W0 */
    public AbstractC7304o0 mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7304o0 invoke = this.f15789p.invoke(kotlinTypeRefiner);
        if (invoke == null) {
            return this;
        }
        return invoke;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        return this.f15788o;
    }
}
