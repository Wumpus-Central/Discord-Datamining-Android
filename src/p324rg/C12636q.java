package p324rg;

import p268og.AbstractC11313e;
import p268og.AbstractC11346m;
import p468zh.AbstractC14663g;
import p468zh.C14661e;
import pg.AbstractC11672g;

/* renamed from: rg.q */
/* loaded from: classes8.dex */
public class C12636q extends AbstractC12590c {

    /* renamed from: m */
    private final AbstractC11313e f28438m;

    /* renamed from: n */
    private final C14661e f28439n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12636q(AbstractC11313e eVar) {
        super(AbstractC11672g.f26044g.m9048b());
        if (eVar == null) {
            m6186I(0);
        }
        this.f28438m = eVar;
        this.f28439n = new C14661e(eVar, null);
    }

    /* renamed from: I */
    private static /* synthetic */ void m6186I(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: b */
    public AbstractC11346m mo6104b() {
        AbstractC11313e eVar = this.f28438m;
        if (eVar == null) {
            m6186I(2);
        }
        return eVar;
    }

    @Override // p268og.AbstractC11396x0
    public AbstractC14663g getValue() {
        C14661e eVar = this.f28439n;
        if (eVar == null) {
            m6186I(1);
        }
        return eVar;
    }

    @Override // p324rg.AbstractC12612j
    public String toString() {
        return "class " + this.f28438m.getName() + "::this";
    }
}
