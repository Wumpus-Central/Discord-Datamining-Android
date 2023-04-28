package p254o2;

import android.graphics.Path;
import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9470h;
import p238n2.C10694b;
import p238n2.C10695c;
import p238n2.C10696d;
import p238n2.C10698f;
import p275p2.AbstractC11511b;

/* renamed from: o2.e */
/* loaded from: classes.dex */
public class C11172e implements AbstractC11170c {

    /* renamed from: a */
    private final EnumC11174g f24854a;

    /* renamed from: b */
    private final Path.FillType f24855b;

    /* renamed from: c */
    private final C10695c f24856c;

    /* renamed from: d */
    private final C10696d f24857d;

    /* renamed from: e */
    private final C10698f f24858e;

    /* renamed from: f */
    private final C10698f f24859f;

    /* renamed from: g */
    private final String f24860g;

    /* renamed from: h */
    private final C10694b f24861h;

    /* renamed from: i */
    private final C10694b f24862i;

    /* renamed from: j */
    private final boolean f24863j;

    public C11172e(String str, EnumC11174g gVar, Path.FillType fillType, C10695c cVar, C10696d dVar, C10698f fVar, C10698f fVar2, C10694b bVar, C10694b bVar2, boolean z) {
        this.f24854a = gVar;
        this.f24855b = fillType;
        this.f24856c = cVar;
        this.f24857d = dVar;
        this.f24858e = fVar;
        this.f24859f = fVar2;
        this.f24860g = str;
        this.f24861h = bVar;
        this.f24862i = bVar2;
        this.f24863j = z;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9470h(e0Var, bVar, this);
    }

    /* renamed from: b */
    public C10698f m10610b() {
        return this.f24859f;
    }

    /* renamed from: c */
    public Path.FillType m10609c() {
        return this.f24855b;
    }

    /* renamed from: d */
    public C10695c m10608d() {
        return this.f24856c;
    }

    /* renamed from: e */
    public EnumC11174g m10607e() {
        return this.f24854a;
    }

    /* renamed from: f */
    public String m10606f() {
        return this.f24860g;
    }

    /* renamed from: g */
    public C10696d m10605g() {
        return this.f24857d;
    }

    /* renamed from: h */
    public C10698f m10604h() {
        return this.f24858e;
    }

    /* renamed from: i */
    public boolean m10603i() {
        return this.f24863j;
    }
}
