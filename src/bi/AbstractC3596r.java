package bi;

import java.util.List;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;

/* renamed from: bi.r */
/* loaded from: classes8.dex */
public interface AbstractC3596r {

    /* renamed from: a */
    public static final AbstractC3596r f5862a = new C3597a();

    /* renamed from: bi.r$a */
    /* loaded from: classes8.dex */
    static class C3597a implements AbstractC3596r {
        C3597a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m34001c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // bi.AbstractC3596r
        /* renamed from: a */
        public void mo4619a(AbstractC11301b bVar) {
            if (bVar == null) {
                m34001c(2);
            }
        }

        @Override // bi.AbstractC3596r
        /* renamed from: b */
        public void mo4618b(AbstractC11313e eVar, List<String> list) {
            if (eVar == null) {
                m34001c(0);
            }
            if (list == null) {
                m34001c(1);
            }
        }
    }

    /* renamed from: a */
    void mo4619a(AbstractC11301b bVar);

    /* renamed from: b */
    void mo4618b(AbstractC11313e eVar, List<String> list);
}
