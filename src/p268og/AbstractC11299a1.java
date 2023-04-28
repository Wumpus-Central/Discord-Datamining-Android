package p268og;

/* renamed from: og.a1 */
/* loaded from: classes8.dex */
public interface AbstractC11299a1 {

    /* renamed from: a */
    public static final AbstractC11299a1 f25230a = new C11300a();

    /* renamed from: og.a1$a */
    /* loaded from: classes8.dex */
    static class C11300a implements AbstractC11299a1 {
        C11300a() {
        }

        /* renamed from: d */
        private static /* synthetic */ void m10225d(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // p268og.AbstractC11299a1
        /* renamed from: b */
        public AbstractC11304b1 mo4612b() {
            AbstractC11304b1 b1Var = AbstractC11304b1.f25237a;
            if (b1Var == null) {
                m10225d(0);
            }
            return b1Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    /* renamed from: b */
    AbstractC11304b1 mo4612b();
}
