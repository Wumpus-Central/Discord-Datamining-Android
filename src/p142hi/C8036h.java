package p142hi;

import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import gi.AbstractC7664g;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p448yh.AbstractC14411h;

/* renamed from: hi.h */
/* loaded from: classes8.dex */
public final class C8036h extends AbstractC7304o0 {

    /* renamed from: l */
    private final AbstractC7268g1 f17356l;

    /* renamed from: m */
    private final AbstractC14411h f17357m;

    /* renamed from: n */
    private final EnumC8038j f17358n;

    /* renamed from: o */
    private final List<AbstractC7290k1> f17359o;

    /* renamed from: p */
    private final boolean f17360p;

    /* renamed from: q */
    private final String[] f17361q;

    /* renamed from: r */
    private final String f17362r;

    public /* synthetic */ C8036h(AbstractC7268g1 g1Var, AbstractC14411h hVar, EnumC8038j jVar, List list, boolean z, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g1Var, hVar, jVar, (i & 8) != 0 ? C9906j.m14820i() : list, (i & 16) != 0 ? false : z, strArr);
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: L0 */
    public List<AbstractC7290k1> mo5174L0() {
        return this.f17359o;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: M0 */
    public C7232c1 mo5173M0() {
        return C7232c1.f15671l.m23149h();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: N0 */
    public AbstractC7268g1 mo5172N0() {
        return this.f17356l;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return this.f17360p;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: U0 */
    public AbstractC7304o0 mo5169R0(boolean z) {
        AbstractC7268g1 N0 = mo5172N0();
        AbstractC14411h o = mo5161o();
        EnumC8038j jVar = this.f17358n;
        List<AbstractC7290k1> L0 = mo5174L0();
        String[] strArr = this.f17361q;
        return new C8036h(N0, o, jVar, L0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: V0 */
    public AbstractC7304o0 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return this;
    }

    /* renamed from: W0 */
    public final String m20785W0() {
        return this.f17362r;
    }

    /* renamed from: X0 */
    public final EnumC8038j m20784X0() {
        return this.f17358n;
    }

    /* renamed from: Y0 */
    public C8036h mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        return this.f17357m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8036h(AbstractC7268g1 constructor, AbstractC14411h memberScope, EnumC8038j kind, List<? extends AbstractC7290k1> arguments, boolean z, String... formatParams) {
        C9971q.m14633g(constructor, "constructor");
        C9971q.m14633g(memberScope, "memberScope");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(arguments, "arguments");
        C9971q.m14633g(formatParams, "formatParams");
        this.f17356l = constructor;
        this.f17357m = memberScope;
        this.f17358n = kind;
        this.f17359o = arguments;
        this.f17360p = z;
        this.f17361q = formatParams;
        C9962k0 k0Var = C9962k0.f22091a;
        String b = kind.m20779b();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(b, Arrays.copyOf(copyOf, copyOf.length));
        C9971q.m14634f(format, "format(format, *args)");
        this.f17362r = format;
    }
}
