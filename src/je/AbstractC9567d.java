package je;

/* renamed from: je.d */
/* loaded from: classes6.dex */
public abstract class AbstractC9567d extends Exception {

    /* renamed from: k */
    private String f21205k;

    public AbstractC9567d(Throwable th2) {
        super(th2);
    }

    /* renamed from: a */
    public void m15981a(String str) {
        this.f21205k = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "Media transformation failed for job id: " + this.f21205k;
    }
}
