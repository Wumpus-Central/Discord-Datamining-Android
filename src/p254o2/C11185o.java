package p254o2;

import android.graphics.Path;
import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9469g;
import p238n2.C10693a;
import p238n2.C10696d;
import p275p2.AbstractC11511b;

/* renamed from: o2.o */
/* loaded from: classes.dex */
public class C11185o implements AbstractC11170c {

    /* renamed from: a */
    private final boolean f24928a;

    /* renamed from: b */
    private final Path.FillType f24929b;

    /* renamed from: c */
    private final String f24930c;

    /* renamed from: d */
    private final C10693a f24931d;

    /* renamed from: e */
    private final C10696d f24932e;

    /* renamed from: f */
    private final boolean f24933f;

    public C11185o(String str, boolean z, Path.FillType fillType, C10693a aVar, C10696d dVar, boolean z2) {
        this.f24930c = str;
        this.f24928a = z;
        this.f24929b = fillType;
        this.f24931d = aVar;
        this.f24932e = dVar;
        this.f24933f = z2;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9469g(e0Var, bVar, this);
    }

    /* renamed from: b */
    public C10693a m10551b() {
        return this.f24931d;
    }

    /* renamed from: c */
    public Path.FillType m10550c() {
        return this.f24929b;
    }

    /* renamed from: d */
    public String m10549d() {
        return this.f24930c;
    }

    /* renamed from: e */
    public C10696d m10548e() {
        return this.f24932e;
    }

    /* renamed from: f */
    public boolean m10547f() {
        return this.f24933f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f24928a + '}';
    }
}
