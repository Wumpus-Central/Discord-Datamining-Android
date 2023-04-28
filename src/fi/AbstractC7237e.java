package fi;

import gi.AbstractC7664g;
import gi.AbstractC7677n;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.C8039k;
import p142hi.EnumC8035g;
import p448yh.AbstractC14411h;

/* renamed from: fi.e */
/* loaded from: classes8.dex */
public abstract class AbstractC7237e extends AbstractC7304o0 {

    /* renamed from: o */
    public static final C7238a f15674o = new C7238a(null);

    /* renamed from: l */
    private final AbstractC7677n f15675l;

    /* renamed from: m */
    private final boolean f15676m;

    /* renamed from: n */
    private final AbstractC14411h f15677n;

    /* renamed from: fi.e$a */
    /* loaded from: classes8.dex */
    public static final class C7238a {
        private C7238a() {
        }

        public /* synthetic */ C7238a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AbstractC7237e(AbstractC7677n originalTypeVariable, boolean z) {
        C9971q.m14633g(originalTypeVariable, "originalTypeVariable");
        this.f15675l = originalTypeVariable;
        this.f15676m = z;
        this.f15677n = C8039k.m20776b(EnumC8035g.STUB_TYPE_SCOPE, originalTypeVariable.toString());
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: L0 */
    public List<AbstractC7290k1> mo5174L0() {
        List<AbstractC7290k1> i;
        i = C9906j.m14820i();
        return i;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: M0 */
    public C7232c1 mo5173M0() {
        return C7232c1.f15671l.m23149h();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return this.f15676m;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: U0 */
    public AbstractC7304o0 mo5169R0(boolean z) {
        return z == mo5171O0() ? this : mo22889X0(z);
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: V0 */
    public AbstractC7304o0 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return this;
    }

    /* renamed from: W0 */
    public final AbstractC7677n m23139W0() {
        return this.f15675l;
    }

    /* renamed from: X0 */
    public abstract AbstractC7237e mo22889X0(boolean z);

    /* renamed from: Y0 */
    public AbstractC7237e mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        return this.f15677n;
    }
}
