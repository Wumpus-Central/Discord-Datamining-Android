package p348t7;

import p119g9.C7570y;
import p228m7.AbstractC10515j;

/* renamed from: t7.q */
/* loaded from: classes7.dex */
final class C13000q {

    /* renamed from: a */
    public C12979c f29203a;

    /* renamed from: b */
    public long f29204b;

    /* renamed from: c */
    public long f29205c;

    /* renamed from: d */
    public long f29206d;

    /* renamed from: e */
    public int f29207e;

    /* renamed from: f */
    public int f29208f;

    /* renamed from: m */
    public boolean f29215m;

    /* renamed from: o */
    public C12999p f29217o;

    /* renamed from: q */
    public boolean f29219q;

    /* renamed from: r */
    public long f29220r;

    /* renamed from: s */
    public boolean f29221s;

    /* renamed from: g */
    public long[] f29209g = new long[0];

    /* renamed from: h */
    public int[] f29210h = new int[0];

    /* renamed from: i */
    public int[] f29211i = new int[0];

    /* renamed from: j */
    public int[] f29212j = new int[0];

    /* renamed from: k */
    public long[] f29213k = new long[0];

    /* renamed from: l */
    public boolean[] f29214l = new boolean[0];

    /* renamed from: n */
    public boolean[] f29216n = new boolean[0];

    /* renamed from: p */
    public final C7570y f29218p = new C7570y();

    /* renamed from: a */
    public void m4773a(C7570y yVar) {
        yVar.m22006j(this.f29218p.m22012d(), 0, this.f29218p.m22010f());
        this.f29218p.m22017P(0);
        this.f29219q = false;
    }

    /* renamed from: b */
    public void m4772b(AbstractC10515j jVar) {
        jVar.readFully(this.f29218p.m22012d(), 0, this.f29218p.m22010f());
        this.f29218p.m22017P(0);
        this.f29219q = false;
    }

    /* renamed from: c */
    public long m4771c(int i) {
        return this.f29213k[i] + this.f29212j[i];
    }

    /* renamed from: d */
    public void m4770d(int i) {
        this.f29218p.m22021L(i);
        this.f29215m = true;
        this.f29219q = true;
    }

    /* renamed from: e */
    public void m4769e(int i, int i2) {
        this.f29207e = i;
        this.f29208f = i2;
        if (this.f29210h.length < i) {
            this.f29209g = new long[i];
            this.f29210h = new int[i];
        }
        if (this.f29211i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f29211i = new int[i3];
            this.f29212j = new int[i3];
            this.f29213k = new long[i3];
            this.f29214l = new boolean[i3];
            this.f29216n = new boolean[i3];
        }
    }

    /* renamed from: f */
    public void m4768f() {
        this.f29207e = 0;
        this.f29220r = 0L;
        this.f29221s = false;
        this.f29215m = false;
        this.f29219q = false;
        this.f29217o = null;
    }

    /* renamed from: g */
    public boolean m4767g(int i) {
        return this.f29215m && this.f29216n[i];
    }
}
