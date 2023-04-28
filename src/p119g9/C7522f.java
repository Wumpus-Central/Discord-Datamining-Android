package p119g9;

/* renamed from: g9.f */
/* loaded from: classes5.dex */
public class C7522f {

    /* renamed from: a */
    private final AbstractC7516c f16301a;

    /* renamed from: b */
    private boolean f16302b;

    public C7522f() {
        this(AbstractC7516c.f16293a);
    }

    /* renamed from: a */
    public synchronized void m22338a() {
        while (!this.f16302b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized boolean m22337b() {
        boolean z;
        z = this.f16302b;
        this.f16302b = false;
        return z;
    }

    /* renamed from: c */
    public synchronized boolean m22336c() {
        return this.f16302b;
    }

    /* renamed from: d */
    public synchronized boolean m22335d() {
        if (this.f16302b) {
            return false;
        }
        this.f16302b = true;
        notifyAll();
        return true;
    }

    public C7522f(AbstractC7516c cVar) {
        this.f16301a = cVar;
    }
}
