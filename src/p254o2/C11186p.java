package p254o2;

import java.util.Arrays;
import java.util.List;
import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9466d;
import p275p2.AbstractC11511b;

/* renamed from: o2.p */
/* loaded from: classes.dex */
public class C11186p implements AbstractC11170c {

    /* renamed from: a */
    private final String f24934a;

    /* renamed from: b */
    private final List<AbstractC11170c> f24935b;

    /* renamed from: c */
    private final boolean f24936c;

    public C11186p(String str, List<AbstractC11170c> list, boolean z) {
        this.f24934a = str;
        this.f24935b = list;
        this.f24936c = z;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9466d(e0Var, bVar, this);
    }

    /* renamed from: b */
    public List<AbstractC11170c> m10546b() {
        return this.f24935b;
    }

    /* renamed from: c */
    public String m10545c() {
        return this.f24934a;
    }

    /* renamed from: d */
    public boolean m10544d() {
        return this.f24936c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f24934a + "' Shapes: " + Arrays.toString(this.f24935b.toArray()) + '}';
    }
}
