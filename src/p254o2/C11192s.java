package p254o2;

import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9485u;
import p238n2.C10694b;
import p275p2.AbstractC11511b;

/* renamed from: o2.s */
/* loaded from: classes.dex */
public class C11192s implements AbstractC11170c {

    /* renamed from: a */
    private final String f24961a;

    /* renamed from: b */
    private final EnumC11193a f24962b;

    /* renamed from: c */
    private final C10694b f24963c;

    /* renamed from: d */
    private final C10694b f24964d;

    /* renamed from: e */
    private final C10694b f24965e;

    /* renamed from: f */
    private final boolean f24966f;

    /* renamed from: o2.s$a */
    /* loaded from: classes.dex */
    public enum EnumC11193a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: a */
        public static EnumC11193a m10521a(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public C11192s(String str, EnumC11193a aVar, C10694b bVar, C10694b bVar2, C10694b bVar3, boolean z) {
        this.f24961a = str;
        this.f24962b = aVar;
        this.f24963c = bVar;
        this.f24964d = bVar2;
        this.f24965e = bVar3;
        this.f24966f = z;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9485u(bVar, this);
    }

    /* renamed from: b */
    public C10694b m10527b() {
        return this.f24964d;
    }

    /* renamed from: c */
    public String m10526c() {
        return this.f24961a;
    }

    /* renamed from: d */
    public C10694b m10525d() {
        return this.f24965e;
    }

    /* renamed from: e */
    public C10694b m10524e() {
        return this.f24963c;
    }

    /* renamed from: f */
    public EnumC11193a m10523f() {
        return this.f24962b;
    }

    /* renamed from: g */
    public boolean m10522g() {
        return this.f24966f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f24963c + ", end: " + this.f24964d + ", offset: " + this.f24965e + "}";
    }
}
