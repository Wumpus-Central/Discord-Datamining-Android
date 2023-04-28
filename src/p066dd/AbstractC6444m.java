package p066dd;

/* renamed from: dd.m */
/* loaded from: classes3.dex */
public abstract class AbstractC6444m extends Exception {

    /* renamed from: k */
    protected static final boolean f13517k;

    /* renamed from: l */
    protected static final StackTraceElement[] f13518l;

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        f13517k = z;
        f13518l = new StackTraceElement[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6444m() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6444m(Throwable th2) {
        super(th2);
    }
}
