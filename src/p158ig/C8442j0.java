package p158ig;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* renamed from: ig.j0 */
/* loaded from: classes8.dex */
public class C8442j0 {

    /* renamed from: ig.j0$a */
    /* loaded from: classes8.dex */
    public static class C8443a<T> extends AbstractC8445c<T> implements Function0<T> {

        /* renamed from: l */
        private final Function0<T> f18390l;

        /* renamed from: m */
        private volatile SoftReference<Object> f18391m;

        public C8443a(T t, Function0<T> function0) {
            if (function0 == null) {
                m19767d(0);
            }
            this.f18391m = null;
            this.f18390l = function0;
            if (t != null) {
                this.f18391m = new SoftReference<>(m19765a(t));
            }
        }

        /* renamed from: d */
        private static /* synthetic */ void m19767d(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // p158ig.C8442j0.AbstractC8445c, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f18391m;
            if (softReference != null && (obj = softReference.get()) != null) {
                return m19763c(obj);
            }
            T invoke = this.f18390l.invoke();
            this.f18391m = new SoftReference<>(m19765a(invoke));
            return invoke;
        }
    }

    /* renamed from: ig.j0$b */
    /* loaded from: classes8.dex */
    public static class C8444b<T> extends AbstractC8445c<T> {

        /* renamed from: l */
        private final Function0<T> f18392l;

        /* renamed from: m */
        private volatile Object f18393m;

        public C8444b(Function0<T> function0) {
            if (function0 == null) {
                m19766d(0);
            }
            this.f18393m = null;
            this.f18392l = function0;
        }

        /* renamed from: d */
        private static /* synthetic */ void m19766d(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // p158ig.C8442j0.AbstractC8445c, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj = this.f18393m;
            if (obj != null) {
                return m19763c(obj);
            }
            T invoke = this.f18392l.invoke();
            this.f18393m = m19765a(invoke);
            return invoke;
        }
    }

    /* renamed from: ig.j0$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC8445c<T> {

        /* renamed from: k */
        private static final Object f18394k = new C8446a();

        /* renamed from: ig.j0$c$a */
        /* loaded from: classes8.dex */
        static class C8446a {
            C8446a() {
            }
        }

        /* renamed from: a */
        protected Object m19765a(T t) {
            return t == null ? f18394k : t;
        }

        /* renamed from: b */
        public final T m19764b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        protected T m19763c(Object obj) {
            if (obj == f18394k) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    /* renamed from: a */
    private static /* synthetic */ void m19771a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <T> C8444b<T> m19770b(Function0<T> function0) {
        if (function0 == null) {
            m19771a(0);
        }
        return new C8444b<>(function0);
    }

    /* renamed from: c */
    public static <T> C8443a<T> m19769c(T t, Function0<T> function0) {
        if (function0 == null) {
            m19771a(1);
        }
        return new C8443a<>(t, function0);
    }

    /* renamed from: d */
    public static <T> C8443a<T> m19768d(Function0<T> function0) {
        if (function0 == null) {
            m19771a(2);
        }
        return m19769c(null, function0);
    }
}
