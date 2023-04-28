package p324rg;

import fi.AbstractC7267g0;
import fi.C7309p1;
import fi.EnumC7338w1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p249nh.C11144h;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11363o;
import p268og.AbstractC11370r0;
import p268og.AbstractC11387u;
import p268og.AbstractC11396x0;
import p268og.C11373t;
import p468zh.C14666j;
import pg.AbstractC11672g;

/* renamed from: rg.c */
/* loaded from: classes8.dex */
public abstract class AbstractC12590c extends AbstractC12612j implements AbstractC11396x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12590c(AbstractC11672g gVar) {
        super(gVar, C11144h.f24741i);
        if (gVar == null) {
            m6457I(0);
        }
    }

    /* renamed from: I */
    private static /* synthetic */ void m6457I(int i) {
        String str;
        int i2;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return oVar.mo6322b(this, d);
    }

    /* renamed from: D0 */
    public AbstractC11370r0 mo6162a() {
        return this;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: J */
    public AbstractC11396x0 mo6266J() {
        return null;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: M */
    public AbstractC11396x0 mo6264M() {
        return null;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: d */
    public Collection<? extends AbstractC11297a> mo6249d() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            m6457I(6);
        }
        return emptySet;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: d0 */
    public boolean mo57d0() {
        return false;
    }

    @Override // p268og.AbstractC11297a
    public AbstractC7267g0 getReturnType() {
        return getType();
    }

    @Override // p268og.AbstractC11332i1
    public AbstractC7267g0 getType() {
        AbstractC7267g0 type = getValue().getType();
        if (type == null) {
            m6457I(4);
        }
        return type;
    }

    @Override // p268og.AbstractC11297a
    public List<AbstractC11319f1> getTypeParameters() {
        List<AbstractC11319f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6457I(3);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11367q, p268og.AbstractC11310d0
    public AbstractC11387u getVisibility() {
        AbstractC11387u uVar = C11373t.f25300f;
        if (uVar == null) {
            m6457I(7);
        }
        return uVar;
    }

    @Override // p268og.AbstractC11297a
    /* renamed from: i */
    public List<AbstractC11335j1> mo6242i() {
        List<AbstractC11335j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m6457I(5);
        }
        return emptyList;
    }

    @Override // p268og.AbstractC11365p
    /* renamed from: j */
    public AbstractC11299a1 mo6102j() {
        AbstractC11299a1 a1Var = AbstractC11299a1.f25230a;
        if (a1Var == null) {
            m6457I(9);
        }
        return a1Var;
    }

    @Override // p268og.AbstractC11396x0, p268og.AbstractC11308c1
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public AbstractC11297a mo6167c(C7309p1 p1Var) {
        AbstractC7267g0 g0Var;
        if (p1Var == null) {
            m6457I(1);
        }
        if (p1Var.m22975k()) {
            return this;
        }
        if (mo6104b() instanceof AbstractC11313e) {
            g0Var = p1Var.m22970p(getType(), EnumC7338w1.OUT_VARIANCE);
        } else {
            g0Var = p1Var.m22970p(getType(), EnumC7338w1.INVARIANT);
        }
        if (g0Var == null) {
            return null;
        }
        return g0Var == getType() ? this : new C12605f0(mo6104b(), new C14666j(g0Var), getAnnotations());
    }
}
