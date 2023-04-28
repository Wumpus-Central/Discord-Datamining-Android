package fi;

import gi.AbstractC7664g;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import nf.EnumC11087p;
import p268og.AbstractC11319f1;

/* renamed from: fi.u0 */
/* loaded from: classes8.dex */
public final class C7329u0 extends AbstractC7293l1 {

    /* renamed from: a */
    private final AbstractC11319f1 f15814a;

    /* renamed from: b */
    private final Lazy f15815b;

    /* renamed from: fi.u0$a */
    /* loaded from: classes8.dex */
    static final class C7330a extends AbstractC9973s implements Function0<AbstractC7267g0> {
        C7330a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke() {
            return C7333v0.m22891b(C7329u0.this.f15814a);
        }
    }

    public C7329u0(AbstractC11319f1 typeParameter) {
        Lazy b;
        C9971q.m14633g(typeParameter, "typeParameter");
        this.f15814a = typeParameter;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C7330a());
        this.f15815b = b;
    }

    /* renamed from: d */
    private final AbstractC7267g0 m22904d() {
        return (AbstractC7267g0) this.f15815b.getValue();
    }

    @Override // fi.AbstractC7290k1
    /* renamed from: a */
    public boolean mo22907a() {
        return true;
    }

    @Override // fi.AbstractC7290k1
    /* renamed from: b */
    public EnumC7338w1 mo22906b() {
        return EnumC7338w1.OUT_VARIANCE;
    }

    @Override // fi.AbstractC7290k1
    public AbstractC7267g0 getType() {
        return m22904d();
    }

    @Override // fi.AbstractC7290k1
    /* renamed from: o */
    public AbstractC7290k1 mo22903o(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
