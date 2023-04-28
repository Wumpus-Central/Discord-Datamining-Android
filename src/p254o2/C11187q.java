package p254o2;

import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9482r;
import p238n2.C10700h;
import p275p2.AbstractC11511b;

/* renamed from: o2.q */
/* loaded from: classes.dex */
public class C11187q implements AbstractC11170c {

    /* renamed from: a */
    private final String f24937a;

    /* renamed from: b */
    private final int f24938b;

    /* renamed from: c */
    private final C10700h f24939c;

    /* renamed from: d */
    private final boolean f24940d;

    public C11187q(String str, int i, C10700h hVar, boolean z) {
        this.f24937a = str;
        this.f24938b = i;
        this.f24939c = hVar;
        this.f24940d = z;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9482r(e0Var, bVar, this);
    }

    /* renamed from: b */
    public String m10543b() {
        return this.f24937a;
    }

    /* renamed from: c */
    public C10700h m10542c() {
        return this.f24939c;
    }

    /* renamed from: d */
    public boolean m10541d() {
        return this.f24940d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f24937a + ", index=" + this.f24938b + '}';
    }
}
