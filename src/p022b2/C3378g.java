package p022b2;

/* renamed from: b2.g */
/* loaded from: classes.dex */
public class C3378g<TResult> {

    /* renamed from: a */
    private final C3373f<TResult> f5394a = new C3373f<>();

    /* renamed from: a */
    public C3373f<TResult> m34562a() {
        return this.f5394a;
    }

    /* renamed from: b */
    public void m34561b() {
        if (!m34558e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: c */
    public void m34560c(Exception exc) {
        if (!m34557f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* renamed from: d */
    public void m34559d(TResult tresult) {
        if (!m34556g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    /* renamed from: e */
    public boolean m34558e() {
        return this.f5394a.m34566p();
    }

    /* renamed from: f */
    public boolean m34557f(Exception exc) {
        return this.f5394a.m34565q(exc);
    }

    /* renamed from: g */
    public boolean m34556g(TResult tresult) {
        return this.f5394a.m34564r(tresult);
    }
}
