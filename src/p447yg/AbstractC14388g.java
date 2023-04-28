package p447yg;

import p086eh.AbstractC6895g;
import p086eh.AbstractC6900l;
import p086eh.AbstractC6902n;
import p086eh.AbstractC6905q;
import p249nh.C11137c;
import p268og.AbstractC11313e;
import p268og.AbstractC11343l;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;

/* renamed from: yg.g */
/* loaded from: classes8.dex */
public interface AbstractC14388g {

    /* renamed from: a */
    public static final AbstractC14388g f32565a = new C14389a();

    /* renamed from: yg.g$a */
    /* loaded from: classes8.dex */
    static class C14389a implements AbstractC14388g {
        C14389a() {
        }

        /* renamed from: f */
        private static /* synthetic */ void m702f(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p447yg.AbstractC14388g
        /* renamed from: a */
        public void mo707a(AbstractC6905q qVar, AbstractC11404z0 z0Var) {
            if (qVar == null) {
                m702f(1);
            }
            if (z0Var == null) {
                m702f(2);
            }
        }

        @Override // p447yg.AbstractC14388g
        /* renamed from: b */
        public void mo706b(AbstractC6895g gVar, AbstractC11313e eVar) {
            if (gVar == null) {
                m702f(7);
            }
            if (eVar == null) {
                m702f(8);
            }
        }

        @Override // p447yg.AbstractC14388g
        /* renamed from: c */
        public AbstractC11313e mo705c(C11137c cVar) {
            if (cVar != null) {
                return null;
            }
            m702f(0);
            return null;
        }

        @Override // p447yg.AbstractC14388g
        /* renamed from: d */
        public void mo704d(AbstractC6900l lVar, AbstractC11343l lVar2) {
            if (lVar == null) {
                m702f(3);
            }
            if (lVar2 == null) {
                m702f(4);
            }
        }

        @Override // p447yg.AbstractC14388g
        /* renamed from: e */
        public void mo703e(AbstractC6902n nVar, AbstractC11388u0 u0Var) {
            if (nVar == null) {
                m702f(5);
            }
            if (u0Var == null) {
                m702f(6);
            }
        }
    }

    /* renamed from: a */
    void mo707a(AbstractC6905q qVar, AbstractC11404z0 z0Var);

    /* renamed from: b */
    void mo706b(AbstractC6895g gVar, AbstractC11313e eVar);

    /* renamed from: c */
    AbstractC11313e mo705c(C11137c cVar);

    /* renamed from: d */
    void mo704d(AbstractC6900l lVar, AbstractC11343l lVar2);

    /* renamed from: e */
    void mo703e(AbstractC6902n nVar, AbstractC11388u0 u0Var);
}
