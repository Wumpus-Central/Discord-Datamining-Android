package p087ei;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p163j$.util.concurrent.ConcurrentHashMap;
import p286pi.C11761c;
import p286pi.C11777g;
import p326ri.C12719v;

/* renamed from: ei.f */
/* loaded from: classes8.dex */
public class C6920f implements AbstractC6944n {

    /* renamed from: d */
    private static final String f15066d;

    /* renamed from: e */
    public static final AbstractC6944n f15067e = new C6921a("NO_LOCKS", AbstractC0209f.f15076a, C6919e.f15065b);

    /* renamed from: a */
    protected final AbstractC6940k f15068a;

    /* renamed from: b */
    private final AbstractC0209f f15069b;

    /* renamed from: c */
    private final String f15070c;

    /* renamed from: ei.f$a */
    /* loaded from: classes8.dex */
    static class C6921a extends C6920f {
        C6921a(String str, AbstractC0209f fVar, AbstractC6940k kVar) {
            super(str, fVar, kVar, null);
        }

        /* renamed from: j */
        private static /* synthetic */ void m23933j(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // p087ei.C6920f
        /* renamed from: p */
        protected <K, V> C6935o<V> mo23932p(String str, K k) {
            if (str == null) {
                m23933j(0);
            }
            C6935o<V> a = C6935o.m23911a();
            if (a == null) {
                m23933j(1);
            }
            return a;
        }
    }

    /* renamed from: ei.f$b */
    /* loaded from: classes8.dex */
    class C6922b extends C6930j<T> {

        /* renamed from: n */
        final /* synthetic */ Object f15071n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6922b(C6920f fVar, Function0 function0, Object obj) {
            super(fVar, function0);
            this.f15071n = obj;
        }

        /* renamed from: a */
        private static /* synthetic */ void m23931a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // p087ei.C6920f.C6928h
        /* renamed from: c */
        protected C6935o<T> mo23922c(boolean z) {
            C6935o<T> d = C6935o.m23908d(this.f15071n);
            if (d == 0) {
                m23931a(0);
            }
            return d;
        }
    }

    /* renamed from: ei.f$c */
    /* loaded from: classes8.dex */
    class C6923c extends AbstractC6931k<T> {

        /* renamed from: o */
        final /* synthetic */ Function1 f15073o;

        /* renamed from: p */
        final /* synthetic */ Function1 f15074p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6923c(C6920f fVar, Function0 function0, Function1 function1, Function1 function12) {
            super(fVar, function0);
            this.f15073o = function1;
            this.f15074p = function12;
        }

        /* renamed from: a */
        private static /* synthetic */ void m23930a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // p087ei.C6920f.C6928h
        /* renamed from: c */
        protected C6935o<T> mo23922c(boolean z) {
            Function1 function1 = this.f15073o;
            if (function1 == null) {
                C6935o<T> c = super.mo23922c(z);
                if (c == 0) {
                    m23930a(0);
                }
                return c;
            }
            C6935o<T> d = C6935o.m23908d(function1.invoke(Boolean.valueOf(z)));
            if (d == 0) {
                m23930a(1);
            }
            return d;
        }

        @Override // p087ei.C6920f.AbstractC6929i
        /* renamed from: d */
        protected void mo23918d(T t) {
            if (t == 0) {
                m23930a(2);
            }
            this.f15074p.invoke(t);
        }
    }

    /* renamed from: ei.f$d */
    /* loaded from: classes8.dex */
    private static class C6924d<K, V> extends C6925e<K, V> implements AbstractC6915a<K, V> {
        /* synthetic */ C6924d(C6920f fVar, ConcurrentMap concurrentMap, C6921a aVar) {
            this(fVar, concurrentMap);
        }

        /* renamed from: b */
        private static /* synthetic */ void m23929b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // p087ei.C6920f.C6925e, p087ei.AbstractC6915a
        /* renamed from: a */
        public V mo23928a(K k, Function0<? extends V> function0) {
            if (function0 == null) {
                m23929b(2);
            }
            V v = (V) super.mo23928a(k, function0);
            if (v == null) {
                m23929b(3);
            }
            return v;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C6924d(C6920f fVar, ConcurrentMap<C6927g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                m23929b(0);
            }
            if (concurrentMap == null) {
                m23929b(1);
            }
        }
    }

    /* renamed from: ei.f$e */
    /* loaded from: classes8.dex */
    private static class C6925e<K, V> extends C6932l<C6927g<K, V>, V> implements AbstractC6916b<K, V> {

        /* renamed from: ei.f$e$a */
        /* loaded from: classes8.dex */
        class C6926a implements Function1<C6927g<K, V>, V> {
            C6926a() {
            }

            /* renamed from: a */
            public V invoke(C6927g<K, V> gVar) {
                return (V) ((C6927g) gVar).f15078b.invoke();
            }
        }

        /* synthetic */ C6925e(C6920f fVar, ConcurrentMap concurrentMap, C6921a aVar) {
            this(fVar, concurrentMap);
        }

        /* renamed from: b */
        private static /* synthetic */ void m23927b(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public V mo23928a(K k, Function0<? extends V> function0) {
            if (function0 == null) {
                m23927b(2);
            }
            return invoke(new C6927g(k, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C6925e(C6920f fVar, ConcurrentMap<C6927g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new C6926a());
            if (fVar == null) {
                m23927b(0);
            }
            if (concurrentMap == null) {
                m23927b(1);
            }
        }
    }

    /* renamed from: ei.f$f */
    /* loaded from: classes8.dex */
    public interface AbstractC0209f {

        /* renamed from: a */
        public static final AbstractC0209f f15076a = new a();

        /* renamed from: ei.f$f$a */
        /* loaded from: classes8.dex */
        static class a implements AbstractC0209f {
            a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m23925a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // p087ei.C6920f.AbstractC0209f
            public RuntimeException handleException(Throwable th2) {
                if (th2 == null) {
                    m23925a(0);
                }
                throw C11761c.m8673b(th2);
            }
        }

        RuntimeException handleException(Throwable th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ei.f$g */
    /* loaded from: classes8.dex */
    public static class C6927g<K, V> {

        /* renamed from: a */
        private final K f15077a;

        /* renamed from: b */
        private final Function0<? extends V> f15078b;

        public C6927g(K k, Function0<? extends V> function0) {
            this.f15077a = k;
            this.f15078b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !this.f15077a.equals(((C6927g) obj).f15077a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f15077a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ei.f$h */
    /* loaded from: classes8.dex */
    public static class C6928h<T> implements AbstractC6939j<T> {

        /* renamed from: k */
        private final C6920f f15079k;

        /* renamed from: l */
        private final Function0<? extends T> f15080l;

        /* renamed from: m */
        private volatile Object f15081m;

        public C6928h(C6920f fVar, Function0<? extends T> function0) {
            if (fVar == null) {
                m23923a(0);
            }
            if (function0 == null) {
                m23923a(1);
            }
            this.f15081m = EnumC6934n.NOT_COMPUTED;
            this.f15079k = fVar;
            this.f15080l = function0;
        }

        /* renamed from: a */
        private static /* synthetic */ void m23923a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2 || i == 3) {
                throw new IllegalStateException(format);
            }
        }

        /* renamed from: b */
        protected void mo23919b(T t) {
        }

        /* renamed from: c */
        protected C6935o<T> mo23922c(boolean z) {
            C6935o<T> p = this.f15079k.mo23932p("in a lazy value", null);
            if (p == null) {
                m23923a(2);
            }
            return p;
        }

        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T t;
            Object obj = this.f15081m;
            if (!(obj instanceof EnumC6934n)) {
                return (T) C11777g.m8646f(obj);
            }
            this.f15079k.f15068a.lock();
            try {
                Object obj2 = this.f15081m;
                if (!(obj2 instanceof EnumC6934n)) {
                    t = (T) C11777g.m8646f(obj2);
                } else {
                    EnumC6934n nVar = EnumC6934n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f15081m = EnumC6934n.RECURSION_WAS_DETECTED;
                        C6935o<T> c = mo23922c(true);
                        if (!c.m23909c()) {
                            t = c.m23910b();
                        }
                    }
                    if (obj2 == EnumC6934n.RECURSION_WAS_DETECTED) {
                        C6935o<T> c2 = mo23922c(false);
                        if (!c2.m23909c()) {
                            t = c2.m23910b();
                        }
                    }
                    this.f15081m = nVar;
                    t = (T) this.f15080l.invoke();
                    mo23919b(t);
                    this.f15081m = t;
                }
                return t;
            } finally {
                this.f15079k.f15068a.unlock();
            }
        }

        /* renamed from: p */
        public boolean m23921p() {
            return (this.f15081m == EnumC6934n.NOT_COMPUTED || this.f15081m == EnumC6934n.COMPUTING) ? false : true;
        }
    }

    /* renamed from: ei.f$i */
    /* loaded from: classes8.dex */
    private static abstract class AbstractC6929i<T> extends C6928h<T> {

        /* renamed from: n */
        private volatile C6942l<T> f15082n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC6929i(C6920f fVar, Function0<? extends T> function0) {
            super(fVar, function0);
            if (fVar == null) {
                m23920a(0);
            }
            if (function0 == null) {
                m23920a(1);
            }
            this.f15082n = null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m23920a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p087ei.C6920f.C6928h
        /* renamed from: b */
        protected final void mo23919b(T t) {
            this.f15082n = new C6942l<>(t);
            try {
                mo23918d(t);
            } finally {
                this.f15082n = null;
            }
        }

        /* renamed from: d */
        protected abstract void mo23918d(T t);

        @Override // p087ei.C6920f.C6928h, kotlin.jvm.functions.Function0
        public T invoke() {
            C6942l<T> lVar = this.f15082n;
            if (lVar == null || !lVar.m23903b()) {
                return (T) super.invoke();
            }
            return lVar.m23904a();
        }
    }

    /* renamed from: ei.f$j */
    /* loaded from: classes8.dex */
    private static class C6930j<T> extends C6928h<T> implements AbstractC6938i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6930j(C6920f fVar, Function0<? extends T> function0) {
            super(fVar, function0);
            if (fVar == null) {
                m23917a(0);
            }
            if (function0 == null) {
                m23917a(1);
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m23917a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // p087ei.C6920f.C6928h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m23917a(2);
            }
            return t;
        }
    }

    /* renamed from: ei.f$k */
    /* loaded from: classes8.dex */
    private static abstract class AbstractC6931k<T> extends AbstractC6929i<T> implements AbstractC6938i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC6931k(C6920f fVar, Function0<? extends T> function0) {
            super(fVar, function0);
            if (fVar == null) {
                m23916a(0);
            }
            if (function0 == null) {
                m23916a(1);
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m23916a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // p087ei.C6920f.AbstractC6929i, p087ei.C6920f.C6928h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m23916a(2);
            }
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ei.f$l */
    /* loaded from: classes8.dex */
    public static class C6932l<K, V> implements AbstractC6937h<K, V> {

        /* renamed from: k */
        private final C6920f f15083k;

        /* renamed from: l */
        private final ConcurrentMap<K, Object> f15084l;

        /* renamed from: m */
        private final Function1<? super K, ? extends V> f15085m;

        public C6932l(C6920f fVar, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            if (fVar == null) {
                m23915b(0);
            }
            if (concurrentMap == null) {
                m23915b(1);
            }
            if (function1 == null) {
                m23915b(2);
            }
            this.f15083k = fVar;
            this.f15084l = concurrentMap;
            this.f15085m = function1;
        }

        /* renamed from: b */
        private static /* synthetic */ void m23915b(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3 || i == 4) {
                throw new IllegalStateException(format);
            }
        }

        /* renamed from: c */
        private AssertionError m23914c(K k, Object obj) {
            AssertionError assertionError = (AssertionError) C6920f.m23934q(new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f15083k));
            if (assertionError == null) {
                m23915b(4);
            }
            return assertionError;
        }

        /* renamed from: d */
        protected C6935o<V> m23913d(K k, boolean z) {
            C6935o<V> p = this.f15083k.mo23932p("", k);
            if (p == null) {
                m23915b(3);
            }
            return p;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(K k) {
            V v;
            Object obj = this.f15084l.get(k);
            if (obj != null && obj != EnumC6934n.COMPUTING) {
                return (V) C11777g.m8648d(obj);
            }
            this.f15083k.f15068a.lock();
            try {
                Object obj2 = this.f15084l.get(k);
                EnumC6934n nVar = EnumC6934n.COMPUTING;
                if (obj2 == nVar) {
                    obj2 = EnumC6934n.RECURSION_WAS_DETECTED;
                    C6935o<V> d = m23913d(k, true);
                    if (!d.m23909c()) {
                        v = d.m23910b();
                        return v;
                    }
                }
                if (obj2 == EnumC6934n.RECURSION_WAS_DETECTED) {
                    C6935o<V> d2 = m23913d(k, false);
                    if (!d2.m23909c()) {
                        v = d2.m23910b();
                        return v;
                    }
                }
                if (obj2 != null) {
                    v = (V) C11777g.m8648d(obj2);
                    return v;
                }
                this.f15084l.put(k, nVar);
                V v2 = (V) this.f15085m.invoke(k);
                Object put = this.f15084l.put(k, C11777g.m8650b(v2));
                if (put == nVar) {
                    return v2;
                }
                throw m23914c(k, put);
            } finally {
                this.f15083k.f15068a.unlock();
            }
        }

        @Override // p087ei.AbstractC6937h
        /* renamed from: t */
        public boolean mo23907t(K k) {
            Object obj = this.f15084l.get(k);
            if (obj == null || obj == EnumC6934n.COMPUTING) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ei.f$m */
    /* loaded from: classes8.dex */
    public static class C6933m<K, V> extends C6932l<K, V> implements AbstractC6936g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6933m(C6920f fVar, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            super(fVar, concurrentMap, function1);
            if (fVar == null) {
                m23912b(0);
            }
            if (concurrentMap == null) {
                m23912b(1);
            }
            if (function1 == null) {
                m23912b(2);
            }
        }

        /* renamed from: b */
        private static /* synthetic */ void m23912b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // p087ei.C6920f.C6932l, kotlin.jvm.functions.Function1
        public V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v == null) {
                m23912b(3);
            }
            return v;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ei.f$n */
    /* loaded from: classes8.dex */
    public enum EnumC6934n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ei.f$o */
    /* loaded from: classes8.dex */
    public static class C6935o<T> {

        /* renamed from: a */
        private final T f15090a;

        /* renamed from: b */
        private final boolean f15091b;

        private C6935o(T t, boolean z) {
            this.f15090a = t;
            this.f15091b = z;
        }

        /* renamed from: a */
        public static <T> C6935o<T> m23911a() {
            return new C6935o<>(null, true);
        }

        /* renamed from: d */
        public static <T> C6935o<T> m23908d(T t) {
            return new C6935o<>(t, false);
        }

        /* renamed from: b */
        public T m23910b() {
            return this.f15090a;
        }

        /* renamed from: c */
        public boolean m23909c() {
            return this.f15091b;
        }

        public String toString() {
            return m23909c() ? "FALL_THROUGH" : String.valueOf(this.f15090a);
        }
    }

    static {
        String S0;
        S0 = C12719v.m5696S0(C6920f.class.getCanonicalName(), ".", "");
        f15066d = S0;
    }

    /* synthetic */ C6920f(String str, AbstractC0209f fVar, AbstractC6940k kVar, C6921a aVar) {
        this(str, fVar, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m23940j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p087ei.C6920f.m23940j(int):void");
    }

    /* renamed from: k */
    static /* synthetic */ AbstractC0209f m23939k(C6920f fVar) {
        return fVar.f15069b;
    }

    /* renamed from: m */
    private static <K> ConcurrentMap<K, Object> m23937m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static <T extends Throwable> T m23934q(T t) {
        if (t == null) {
            m23940j(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(f15066d)) {
                break;
            } else {
                i++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    @Override // p087ei.AbstractC6944n
    /* renamed from: a */
    public <K, V> AbstractC6915a<K, V> mo23900a() {
        return new C6924d(this, m23937m(), null);
    }

    @Override // p087ei.AbstractC6944n
    /* renamed from: b */
    public <T> AbstractC6938i<T> mo23899b(Function0<? extends T> function0, T t) {
        if (function0 == null) {
            m23940j(26);
        }
        if (t == null) {
            m23940j(27);
        }
        return new C6922b(this, function0, t);
    }

    @Override // p087ei.AbstractC6944n
    /* renamed from: c */
    public <T> AbstractC6938i<T> mo23898c(Function0<? extends T> function0) {
        if (function0 == null) {
            m23940j(23);
        }
        return new C6930j(this, function0);
    }

    @Override // p087ei.AbstractC6944n
    /* renamed from: d */
    public <T> T mo23897d(Function0<? extends T> function0) {
        AbstractC0209f fVar;
        if (function0 == null) {
            m23940j(34);
        }
        this.f15068a.lock();
        try {
            return (T) function0.invoke();
        } finally {
            try {
                throw fVar.handleException(th);
            } finally {
            }
        }
    }

    @Override // p087ei.AbstractC6944n
    /* renamed from: e */
    public <T> AbstractC6939j<T> mo23896e(Function0<? extends T> function0) {
        if (function0 == null) {
            m23940j(30);
        }
        return new C6928h(this, function0);
    }

    @Override // p087ei.AbstractC6944n
    /* renamed from: f */
    public <T> AbstractC6938i<T> mo23895f(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, Unit> function12) {
        if (function0 == null) {
            m23940j(28);
        }
        if (function12 == null) {
            m23940j(29);
        }
        return new C6923c(this, function0, function1, function12);
    }

    @Override // p087ei.AbstractC6944n
    /* renamed from: g */
    public <K, V> AbstractC6937h<K, V> mo23894g(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m23940j(19);
        }
        AbstractC6937h<K, V> o = m23935o(function1, m23937m());
        if (o == null) {
            m23940j(20);
        }
        return o;
    }

    @Override // p087ei.AbstractC6944n
    /* renamed from: h */
    public <K, V> AbstractC6916b<K, V> mo23893h() {
        return new C6925e(this, m23937m(), null);
    }

    @Override // p087ei.AbstractC6944n
    /* renamed from: i */
    public <K, V> AbstractC6936g<K, V> mo23892i(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m23940j(9);
        }
        AbstractC6936g<K, V> n = m23936n(function1, m23937m());
        if (n == null) {
            m23940j(10);
        }
        return n;
    }

    /* renamed from: n */
    public <K, V> AbstractC6936g<K, V> m23936n(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m23940j(14);
        }
        if (concurrentMap == null) {
            m23940j(15);
        }
        return new C6933m(this, concurrentMap, function1);
    }

    /* renamed from: o */
    public <K, V> AbstractC6937h<K, V> m23935o(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m23940j(21);
        }
        if (concurrentMap == null) {
            m23940j(22);
        }
        return new C6932l(this, concurrentMap, function1);
    }

    /* renamed from: p */
    protected <K, V> C6935o<V> mo23932p(String str, K k) {
        String str2;
        if (str == null) {
            m23940j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) m23934q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f15070c + ")";
    }

    private C6920f(String str, AbstractC0209f fVar, AbstractC6940k kVar) {
        if (str == null) {
            m23940j(4);
        }
        if (fVar == null) {
            m23940j(5);
        }
        if (kVar == null) {
            m23940j(6);
        }
        this.f15068a = kVar;
        this.f15069b = fVar;
        this.f15070c = str;
    }

    public C6920f(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public C6920f(String str, Runnable runnable, Function1<InterruptedException, Unit> function1) {
        this(str, AbstractC0209f.f15076a, AbstractC6940k.f15092a.m23905a(runnable, function1));
    }
}
