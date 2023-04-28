package p324rg;

import fi.C7309p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11319f1;
import p268og.AbstractC11346m;
import p268og.AbstractC11386t0;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.EnumC11314e0;
import pg.AbstractC11672g;

/* renamed from: rg.b0 */
/* loaded from: classes8.dex */
public abstract class AbstractC12589b0 extends AbstractC12616k implements AbstractC11386t0 {

    /* renamed from: o */
    private boolean f28293o;

    /* renamed from: p */
    private final boolean f28294p;

    /* renamed from: q */
    private final EnumC11314e0 f28295q;

    /* renamed from: r */
    private final AbstractC11388u0 f28296r;

    /* renamed from: s */
    private final boolean f28297s;

    /* renamed from: t */
    private final AbstractC11301b.EnumC11302a f28298t;

    /* renamed from: u */
    private AbstractC11387u f28299u;

    /* renamed from: v */
    private AbstractC11397y f28300v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12589b0(EnumC11314e0 e0Var, AbstractC11387u uVar, AbstractC11388u0 u0Var, AbstractC11672g gVar, C11142f fVar, boolean z, boolean z2, boolean z3, AbstractC11301b.EnumC11302a aVar, AbstractC11299a1 a1Var) {
        super(u0Var.mo6104b(), gVar, fVar, a1Var);
        if (e0Var == null) {
            m6464I(0);
        }
        if (uVar == null) {
            m6464I(1);
        }
        if (u0Var == null) {
            m6464I(2);
        }
        if (gVar == null) {
            m6464I(3);
        }
        if (fVar == null) {
            m6464I(4);
        }
        if (a1Var == null) {
            m6464I(5);
        }
        this.f28300v = null;
        this.f28295q = e0Var;
        this.f28299u = uVar;
        this.f28296r = u0Var;
        this.f28293o = z;
        this.f28294p = z2;
        this.f28297s = z3;
        this.f28298t = aVar;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6464I(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p268og.AbstractC11397y
    /* renamed from: A */
    public boolean mo6274A() {
        return false;
    }

    @Override // p268og.AbstractC11397y
    /* renamed from: A0 */
    public boolean mo6273A0() {
        return false;
    }

    @Override // p268og.AbstractC11301b
    /* renamed from: B0 */
    public void mo6272B0(Collection<? extends AbstractC11301b> collection) {
        if (collection == null) {
            m6464I(16);
        }
    }

    @Override // p268og.AbstractC11386t0
    /* renamed from: D */
    public boolean mo6466D() {
        return this.f28293o;
    }

    @Override // p268og.AbstractC11397y
    /* renamed from: F0 */
    public boolean mo6269F0() {
        return false;
    }

    /* renamed from: G0 */
    public AbstractC11386t0 mo6270E0(AbstractC11346m mVar, EnumC11314e0 e0Var, AbstractC11387u uVar, AbstractC11301b.EnumC11302a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: J */
    public AbstractC11396x0 mo6266J() {
        return mo6459T().mo6266J();
    }

    /* renamed from: K0 */
    public abstract AbstractC11386t0 mo6162a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L0 */
    public Collection<AbstractC11386t0> m6463L0(boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList(0);
        for (AbstractC11388u0 u0Var : mo6459T().mo6249d()) {
            if (z) {
                obj = u0Var.mo6437f();
            } else {
                obj = u0Var.mo6436h();
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: M */
    public AbstractC11396x0 mo6264M() {
        return mo6459T().mo6264M();
    }

    /* renamed from: M0 */
    public void m6462M0(boolean z) {
        this.f28293o = z;
    }

    /* renamed from: N0 */
    public void m6461N0(AbstractC11397y yVar) {
        this.f28300v = yVar;
    }

    /* renamed from: O0 */
    public void m6460O0(AbstractC11387u uVar) {
        this.f28299u = uVar;
    }

    @Override // p268og.AbstractC11386t0
    /* renamed from: T */
    public AbstractC11388u0 mo6459T() {
        AbstractC11388u0 u0Var = this.f28296r;
        if (u0Var == null) {
            m6464I(13);
        }
        return u0Var;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: V */
    public boolean mo6120V() {
        return false;
    }

    @Override // p268og.AbstractC11397y, p268og.AbstractC11308c1
    /* renamed from: c */
    public AbstractC11397y mo6167c(C7309p1 p1Var) {
        if (p1Var == null) {
            m6464I(7);
        }
        return this;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: d0 */
    public boolean mo57d0() {
        return false;
    }

    @Override // p268og.AbstractC11301b
    /* renamed from: g */
    public AbstractC11301b.EnumC11302a mo6245g() {
        AbstractC11301b.EnumC11302a aVar = this.f28298t;
        if (aVar == null) {
            m6464I(6);
        }
        return aVar;
    }

    @Override // p268og.AbstractC11297a
    public List<AbstractC11319f1> getTypeParameters() {
        List<AbstractC11319f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6464I(9);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u uVar = this.f28299u;
        if (uVar == null) {
            m6464I(11);
        }
        return uVar;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: h0 */
    public boolean mo6114h0() {
        return false;
    }

    @Override // p268og.AbstractC11310d0
    public boolean isExternal() {
        return this.f28294p;
    }

    @Override // p268og.AbstractC11397y
    public boolean isInfix() {
        return false;
    }

    @Override // p268og.AbstractC11397y
    public boolean isInline() {
        return this.f28297s;
    }

    @Override // p268og.AbstractC11397y
    public boolean isOperator() {
        return false;
    }

    @Override // p268og.AbstractC11397y
    public boolean isSuspend() {
        return false;
    }

    @Override // p268og.AbstractC11397y
    /* renamed from: p0 */
    public AbstractC11397y mo6239p0() {
        return this.f28300v;
    }

    @Override // p268og.AbstractC11310d0
    /* renamed from: s */
    public EnumC11314e0 mo6108s() {
        EnumC11314e0 e0Var = this.f28295q;
        if (e0Var == null) {
            m6464I(10);
        }
        return e0Var;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: s0 */
    public <V> V mo55s0(AbstractC11297a.AbstractC0362a<V> aVar) {
        return null;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: u0 */
    public List<AbstractC11396x0> mo6237u0() {
        List<AbstractC11396x0> u0 = mo6459T().mo6237u0();
        if (u0 == null) {
            m6464I(14);
        }
        return u0;
    }
}
