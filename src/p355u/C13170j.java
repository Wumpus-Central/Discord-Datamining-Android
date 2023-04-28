package p355u;

import p340t.C12916d;
import p390w.C13600g2;

/* renamed from: u.j */
/* loaded from: classes.dex */
public class C13170j {

    /* renamed from: a */
    private final boolean f29524a;

    /* renamed from: b */
    private boolean f29525b = false;

    public C13170j(C13600g2 g2Var) {
        boolean z = false;
        this.f29524a = g2Var.m3260b(C12916d.class) != null ? true : z;
    }

    /* renamed from: a */
    public void m4427a() {
        this.f29525b = false;
    }

    /* renamed from: b */
    public void m4426b() {
        this.f29525b = true;
    }

    /* renamed from: c */
    public boolean m4425c(int i) {
        return this.f29525b && i == 0 && this.f29524a;
    }
}
