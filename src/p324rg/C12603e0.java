package p324rg;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p249nh.C11142f;
import p249nh.C11144h;
import p268og.AbstractC11299a1;
import p268og.AbstractC11301b;
import p268og.AbstractC11335j1;
import p268og.AbstractC11363o;
import p268og.AbstractC11386t0;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11392w0;
import p268og.EnumC11314e0;
import p388vh.C13508c;
import pg.AbstractC11672g;

/* renamed from: rg.e0 */
/* loaded from: classes8.dex */
public class C12603e0 extends AbstractC12589b0 implements AbstractC11392w0 {

    /* renamed from: w */
    private AbstractC11335j1 f28344w;

    /* renamed from: x */
    private final AbstractC11392w0 f28345x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12603e0(AbstractC11388u0 u0Var, AbstractC11672g gVar, EnumC11314e0 e0Var, AbstractC11387u uVar, boolean z, boolean z2, boolean z3, AbstractC11301b.EnumC11302a aVar, AbstractC11392w0 w0Var, AbstractC11299a1 a1Var) {
        super(e0Var, uVar, u0Var, gVar, C11142f.m10764i("<set-" + u0Var.getName() + ">"), z, z2, z3, aVar, a1Var);
        C12603e0 e0Var2;
        C12603e0 e0Var3;
        if (u0Var == null) {
            m6380I(0);
        }
        if (gVar == null) {
            m6380I(1);
        }
        if (e0Var == null) {
            m6380I(2);
        }
        if (uVar == null) {
            m6380I(3);
        }
        if (aVar == null) {
            m6380I(4);
        }
        if (a1Var == null) {
            m6380I(5);
        }
        if (w0Var != 0) {
            e0Var2 = this;
            e0Var3 = w0Var;
        } else {
            e0Var3 = this;
            e0Var2 = e0Var3;
        }
        e0Var2.f28345x = e0Var3;
    }

    /* renamed from: I */
    private static /* synthetic */ void m6380I(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: P0 */
    public static C12619l0 m6378P0(AbstractC11392w0 w0Var, AbstractC7267g0 g0Var, AbstractC11672g gVar) {
        if (w0Var == null) {
            m6380I(7);
        }
        if (g0Var == null) {
            m6380I(8);
        }
        if (gVar == null) {
            m6380I(9);
        }
        return new C12619l0(w0Var, null, 0, gVar, C11144h.f24747o, g0Var, false, false, false, null, AbstractC11299a1.f25230a);
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return oVar.mo6321c(this, d);
    }

    /* renamed from: Q0 */
    public AbstractC11392w0 mo6162a() {
        AbstractC11392w0 w0Var = this.f28345x;
        if (w0Var == null) {
            m6380I(13);
        }
        return w0Var;
    }

    /* renamed from: R0 */
    public void m6376R0(AbstractC11335j1 j1Var) {
        if (j1Var == null) {
            m6380I(6);
        }
        this.f28344w = j1Var;
    }

    @Override // p268og.AbstractC11397y, p268og.AbstractC11301b, p268og.AbstractC11297a
    /* renamed from: d */
    public Collection<? extends AbstractC11392w0> mo6249d() {
        Collection<AbstractC11386t0> L0 = super.m6463L0(false);
        if (L0 == null) {
            m6380I(10);
        }
        return L0;
    }

    @Override // p268og.AbstractC11297a
    public AbstractC7267g0 getReturnType() {
        AbstractC7304o0 Z = C13508c.m3531j(this).m13403Z();
        if (Z == null) {
            m6380I(12);
        }
        return Z;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: i */
    public List<AbstractC11335j1> mo6242i() {
        AbstractC11335j1 j1Var = this.f28344w;
        if (j1Var != null) {
            List<AbstractC11335j1> singletonList = Collections.singletonList(j1Var);
            if (singletonList == null) {
                m6380I(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }
}
