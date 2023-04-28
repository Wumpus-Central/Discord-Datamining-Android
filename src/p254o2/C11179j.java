package p254o2;

import android.graphics.PointF;
import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9477n;
import p238n2.AbstractC10705m;
import p238n2.C10694b;
import p275p2.AbstractC11511b;

/* renamed from: o2.j */
/* loaded from: classes.dex */
public class C11179j implements AbstractC11170c {

    /* renamed from: a */
    private final String f24898a;

    /* renamed from: b */
    private final EnumC11180a f24899b;

    /* renamed from: c */
    private final C10694b f24900c;

    /* renamed from: d */
    private final AbstractC10705m<PointF, PointF> f24901d;

    /* renamed from: e */
    private final C10694b f24902e;

    /* renamed from: f */
    private final C10694b f24903f;

    /* renamed from: g */
    private final C10694b f24904g;

    /* renamed from: h */
    private final C10694b f24905h;

    /* renamed from: i */
    private final C10694b f24906i;

    /* renamed from: j */
    private final boolean f24907j;

    /* renamed from: k */
    private final boolean f24908k;

    /* renamed from: o2.j$a */
    /* loaded from: classes.dex */
    public enum EnumC11180a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: k */
        private final int f24912k;

        EnumC11180a(int i) {
            this.f24912k = i;
        }

        /* renamed from: a */
        public static EnumC11180a m10570a(int i) {
            EnumC11180a[] values;
            for (EnumC11180a aVar : values()) {
                if (aVar.f24912k == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C11179j(String str, EnumC11180a aVar, C10694b bVar, AbstractC10705m<PointF, PointF> mVar, C10694b bVar2, C10694b bVar3, C10694b bVar4, C10694b bVar5, C10694b bVar6, boolean z, boolean z2) {
        this.f24898a = str;
        this.f24899b = aVar;
        this.f24900c = bVar;
        this.f24901d = mVar;
        this.f24902e = bVar2;
        this.f24903f = bVar3;
        this.f24904g = bVar4;
        this.f24905h = bVar5;
        this.f24906i = bVar6;
        this.f24907j = z;
        this.f24908k = z2;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9477n(e0Var, bVar, this);
    }

    /* renamed from: b */
    public C10694b m10581b() {
        return this.f24903f;
    }

    /* renamed from: c */
    public C10694b m10580c() {
        return this.f24905h;
    }

    /* renamed from: d */
    public String m10579d() {
        return this.f24898a;
    }

    /* renamed from: e */
    public C10694b m10578e() {
        return this.f24904g;
    }

    /* renamed from: f */
    public C10694b m10577f() {
        return this.f24906i;
    }

    /* renamed from: g */
    public C10694b m10576g() {
        return this.f24900c;
    }

    /* renamed from: h */
    public AbstractC10705m<PointF, PointF> m10575h() {
        return this.f24901d;
    }

    /* renamed from: i */
    public C10694b m10574i() {
        return this.f24902e;
    }

    /* renamed from: j */
    public EnumC11180a m10573j() {
        return this.f24899b;
    }

    /* renamed from: k */
    public boolean m10572k() {
        return this.f24907j;
    }

    /* renamed from: l */
    public boolean m10571l() {
        return this.f24908k;
    }
}
