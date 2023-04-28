package p390w;

/* renamed from: w.q2 */
/* loaded from: classes.dex */
public abstract class AbstractC13658q2 {

    /* renamed from: w.q2$a */
    /* loaded from: classes.dex */
    public enum EnumC13659a {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        

        /* renamed from: k */
        final int f30520k;

        EnumC13659a(int i) {
            this.f30520k = i;
        }

        /* renamed from: a */
        int m3103a() {
            return this.f30520k;
        }
    }

    /* renamed from: w.q2$b */
    /* loaded from: classes.dex */
    public enum EnumC13660b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    /* renamed from: a */
    public static AbstractC13658q2 m3107a(EnumC13660b bVar, EnumC13659a aVar) {
        return new C13596g(bVar, aVar);
    }

    /* renamed from: b */
    public abstract EnumC13659a mo3106b();

    /* renamed from: c */
    public abstract EnumC13660b mo3105c();

    /* renamed from: d */
    public final boolean m3104d(AbstractC13658q2 q2Var) {
        EnumC13660b c = q2Var.mo3105c();
        if (q2Var.mo3106b().m3103a() > mo3106b().m3103a() || c != mo3105c()) {
            return false;
        }
        return true;
    }
}
