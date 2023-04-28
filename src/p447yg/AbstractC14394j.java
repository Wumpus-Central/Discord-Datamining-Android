package p447yg;

import fi.AbstractC7267g0;
import java.util.Collections;
import java.util.List;
import p086eh.AbstractC6906r;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;

/* renamed from: yg.j */
/* loaded from: classes8.dex */
public interface AbstractC14394j {

    /* renamed from: a */
    public static final AbstractC14394j f32572a = new C14395a();

    /* renamed from: yg.j$a */
    /* loaded from: classes8.dex */
    static class C14395a implements AbstractC14394j {
        C14395a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m696c(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p447yg.AbstractC14394j
        /* renamed from: a */
        public void mo698a(AbstractC11301b bVar, List<String> list) {
            if (bVar == null) {
                m696c(5);
            }
            if (list == null) {
                m696c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // p447yg.AbstractC14394j
        /* renamed from: b */
        public C14396b mo697b(AbstractC6906r rVar, AbstractC11313e eVar, AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2, List<AbstractC11335j1> list, List<AbstractC11319f1> list2) {
            if (rVar == null) {
                m696c(0);
            }
            if (eVar == null) {
                m696c(1);
            }
            if (g0Var == null) {
                m696c(2);
            }
            if (list == null) {
                m696c(3);
            }
            if (list2 == null) {
                m696c(4);
            }
            return new C14396b(g0Var, g0Var2, list, list2, Collections.emptyList(), false);
        }
    }

    /* renamed from: yg.j$b */
    /* loaded from: classes8.dex */
    public static class C14396b {

        /* renamed from: a */
        private final AbstractC7267g0 f32573a;

        /* renamed from: b */
        private final AbstractC7267g0 f32574b;

        /* renamed from: c */
        private final List<AbstractC11335j1> f32575c;

        /* renamed from: d */
        private final List<AbstractC11319f1> f32576d;

        /* renamed from: e */
        private final List<String> f32577e;

        /* renamed from: f */
        private final boolean f32578f;

        public C14396b(AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2, List<AbstractC11335j1> list, List<AbstractC11319f1> list2, List<String> list3, boolean z) {
            if (g0Var == null) {
                m695a(0);
            }
            if (list == null) {
                m695a(1);
            }
            if (list2 == null) {
                m695a(2);
            }
            if (list3 == null) {
                m695a(3);
            }
            this.f32573a = g0Var;
            this.f32574b = g0Var2;
            this.f32575c = list;
            this.f32576d = list2;
            this.f32577e = list3;
            this.f32578f = z;
        }

        /* renamed from: a */
        private static /* synthetic */ void m695a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 4 || i == 5 || i == 6 || i == 7) {
                throw new IllegalStateException(format);
            }
        }

        /* renamed from: b */
        public List<String> m694b() {
            List<String> list = this.f32577e;
            if (list == null) {
                m695a(7);
            }
            return list;
        }

        /* renamed from: c */
        public AbstractC7267g0 m693c() {
            return this.f32574b;
        }

        /* renamed from: d */
        public AbstractC7267g0 m692d() {
            AbstractC7267g0 g0Var = this.f32573a;
            if (g0Var == null) {
                m695a(4);
            }
            return g0Var;
        }

        /* renamed from: e */
        public List<AbstractC11319f1> m691e() {
            List<AbstractC11319f1> list = this.f32576d;
            if (list == null) {
                m695a(6);
            }
            return list;
        }

        /* renamed from: f */
        public List<AbstractC11335j1> m690f() {
            List<AbstractC11335j1> list = this.f32575c;
            if (list == null) {
                m695a(5);
            }
            return list;
        }

        /* renamed from: g */
        public boolean m689g() {
            return this.f32578f;
        }
    }

    /* renamed from: a */
    void mo698a(AbstractC11301b bVar, List<String> list);

    /* renamed from: b */
    C14396b mo697b(AbstractC6906r rVar, AbstractC11313e eVar, AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2, List<AbstractC11335j1> list, List<AbstractC11319f1> list2);
}
