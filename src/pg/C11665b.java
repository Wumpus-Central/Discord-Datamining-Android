package pg;

/* renamed from: pg.b */
/* loaded from: classes8.dex */
public class C11665b implements AbstractC11664a {

    /* renamed from: k */
    private final AbstractC11672g f26023k;

    public C11665b(AbstractC11672g gVar) {
        if (gVar == null) {
            m9057I(0);
        }
        this.f26023k = gVar;
    }

    /* renamed from: I */
    private static /* synthetic */ void m9057I(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // pg.AbstractC11664a
    public AbstractC11672g getAnnotations() {
        AbstractC11672g gVar = this.f26023k;
        if (gVar == null) {
            m9057I(1);
        }
        return gVar;
    }
}
