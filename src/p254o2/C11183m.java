package p254o2;

import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9481q;
import p238n2.AbstractC10705m;
import p275p2.AbstractC11511b;

/* renamed from: o2.m */
/* loaded from: classes.dex */
public class C11183m implements AbstractC11170c {

    /* renamed from: a */
    private final String f24923a;

    /* renamed from: b */
    private final AbstractC10705m<Float, Float> f24924b;

    public C11183m(String str, AbstractC10705m<Float, Float> mVar) {
        this.f24923a = str;
        this.f24924b = mVar;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9481q(e0Var, bVar, this);
    }

    /* renamed from: b */
    public AbstractC10705m<Float, Float> m10559b() {
        return this.f24924b;
    }

    /* renamed from: c */
    public String m10558c() {
        return this.f24923a;
    }
}
