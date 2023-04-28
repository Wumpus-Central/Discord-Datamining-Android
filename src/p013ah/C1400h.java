package p013ah;

import bh.C3555n;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6913y;
import p086eh.AbstractC6914z;
import p087ei.AbstractC6937h;
import p268og.AbstractC11319f1;
import p268og.AbstractC11346m;
import p286pi.C11754a;

/* renamed from: ah.h */
/* loaded from: classes8.dex */
public final class C1400h implements AbstractC1404k {

    /* renamed from: a */
    private final C1399g f430a;

    /* renamed from: b */
    private final AbstractC11346m f431b;

    /* renamed from: c */
    private final int f432c;

    /* renamed from: d */
    private final Map<AbstractC6913y, Integer> f433d;

    /* renamed from: e */
    private final AbstractC6937h<AbstractC6913y, C3555n> f434e;

    /* renamed from: ah.h$a */
    /* loaded from: classes8.dex */
    static final class C1401a extends AbstractC9973s implements Function1<AbstractC6913y, C3555n> {
        C1401a() {
            super(1);
        }

        /* renamed from: a */
        public final C3555n invoke(AbstractC6913y typeParameter) {
            C9971q.m14633g(typeParameter, "typeParameter");
            Integer num = (Integer) C1400h.this.f433d.get(typeParameter);
            if (num == null) {
                return null;
            }
            C1400h hVar = C1400h.this;
            return new C3555n(C1389a.m41213h(C1389a.m41220a(hVar.f430a, hVar), hVar.f431b.getAnnotations()), typeParameter, hVar.f432c + num.intValue(), hVar.f431b);
        }
    }

    public C1400h(C1399g c, AbstractC11346m containingDeclaration, AbstractC6914z typeParameterOwner, int i) {
        C9971q.m14633g(c, "c");
        C9971q.m14633g(containingDeclaration, "containingDeclaration");
        C9971q.m14633g(typeParameterOwner, "typeParameterOwner");
        this.f430a = c;
        this.f431b = containingDeclaration;
        this.f432c = i;
        this.f433d = C11754a.m8686d(typeParameterOwner.getTypeParameters());
        this.f434e = c.m41170e().mo23894g(new C1401a());
    }

    @Override // p013ah.AbstractC1404k
    /* renamed from: a */
    public AbstractC11319f1 mo41159a(AbstractC6913y javaTypeParameter) {
        C9971q.m14633g(javaTypeParameter, "javaTypeParameter");
        C3555n invoke = this.f434e.invoke(javaTypeParameter);
        if (invoke != null) {
            return invoke;
        }
        return this.f430a.m41169f().mo41159a(javaTypeParameter);
    }
}
