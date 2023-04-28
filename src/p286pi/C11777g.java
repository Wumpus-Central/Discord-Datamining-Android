package p286pi;

/* renamed from: pi.g */
/* loaded from: classes8.dex */
public class C11777g {

    /* renamed from: a */
    private static final Object f26281a = new C11778a();

    /* renamed from: b */
    public static volatile boolean f26282b = false;

    /* renamed from: pi.g$a */
    /* loaded from: classes8.dex */
    static class C11778a {
        C11778a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pi.g$b */
    /* loaded from: classes8.dex */
    public static final class C11779b {

        /* renamed from: a */
        private final Throwable f26283a;

        /* synthetic */ C11779b(Throwable th2, C11778a aVar) {
            this(th2);
        }

        /* renamed from: a */
        private static /* synthetic */ void m8645a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format);
            }
        }

        /* renamed from: b */
        public Throwable m8644b() {
            Throwable th2 = this.f26283a;
            if (th2 == null) {
                m8645a(1);
            }
            return th2;
        }

        public String toString() {
            return this.f26283a.toString();
        }

        private C11779b(Throwable th2) {
            if (th2 == null) {
                m8645a(0);
            }
            this.f26283a = th2;
        }
    }

    /* renamed from: pi.g$c */
    /* loaded from: classes8.dex */
    public static class C11780c extends RuntimeException {
        public C11780c(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m8651a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static <V> Object m8650b(V v) {
        if (v == null && (v = (V) f26281a) == null) {
            m8651a(1);
        }
        return v;
    }

    /* renamed from: c */
    public static Object m8649c(Throwable th2) {
        if (th2 == null) {
            m8651a(3);
        }
        return new C11779b(th2, null);
    }

    /* renamed from: d */
    public static <V> V m8648d(Object obj) {
        if (obj == null) {
            m8651a(4);
        }
        return (V) m8647e(m8646f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <V> V m8647e(Object obj) {
        if (obj == 0) {
            m8651a(0);
        }
        if (obj == f26281a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <V> V m8646f(Object obj) {
        if (!(obj instanceof C11779b)) {
            return obj;
        }
        Throwable b = ((C11779b) obj).m8644b();
        if (!f26282b || !C11761c.m8674a(b)) {
            throw C11761c.m8673b(b);
        }
        throw new C11780c(b);
    }
}
