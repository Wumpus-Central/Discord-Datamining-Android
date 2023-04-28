package p233mi;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p267of.AbstractC11265b;

/* renamed from: mi.d */
/* loaded from: classes8.dex */
public final class C10624d<T> extends AbstractC10623c<T> {

    /* renamed from: m */
    public static final C10625a f23515m = new C10625a(null);

    /* renamed from: k */
    private Object[] f23516k;

    /* renamed from: l */
    private int f23517l;

    /* renamed from: mi.d$a */
    /* loaded from: classes8.dex */
    public static final class C10625a {
        private C10625a() {
        }

        public /* synthetic */ C10625a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mi.d$b */
    /* loaded from: classes8.dex */
    public static final class C10626b extends AbstractC11265b<T> {

        /* renamed from: m */
        private int f23518m = -1;

        /* renamed from: n */
        final /* synthetic */ C10624d<T> f23519n;

        C10626b(C10624d<T> dVar) {
            this.f23519n = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p267of.AbstractC11265b
        /* renamed from: b */
        protected void mo1701b() {
            do {
                int i = this.f23518m + 1;
                this.f23518m = i;
                if (i >= ((C10624d) this.f23519n).f23516k.length) {
                    break;
                }
            } while (((C10624d) this.f23519n).f23516k[this.f23518m] == null);
            if (this.f23518m >= ((C10624d) this.f23519n).f23516k.length) {
                m10308d();
                return;
            }
            Object obj = ((C10624d) this.f23519n).f23516k[this.f23518m];
            C9971q.m14635e(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            m10307f(obj);
        }
    }

    private C10624d(Object[] objArr, int i) {
        super(null);
        this.f23516k = objArr;
        this.f23517l = i;
    }

    /* renamed from: g */
    private final void m12710g(int i) {
        Object[] objArr = this.f23516k;
        if (objArr.length <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            C9971q.m14634f(copyOf, "copyOf(this, newSize)");
            this.f23516k = copyOf;
        }
    }

    @Override // p233mi.AbstractC10623c
    /* renamed from: a */
    public int mo12695a() {
        return this.f23517l;
    }

    @Override // p233mi.AbstractC10623c
    /* renamed from: b */
    public void mo12694b(int i, T value) {
        C9971q.m14633g(value, "value");
        m12710g(i);
        if (this.f23516k[i] == null) {
            this.f23517l = mo12695a() + 1;
        }
        this.f23516k[i] = value;
    }

    @Override // p233mi.AbstractC10623c
    public T get(int i) {
        Object K;
        K = C9899f.m14952K(this.f23516k, i);
        return (T) K;
    }

    @Override // p233mi.AbstractC10623c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new C10626b(this);
    }

    public C10624d() {
        this(new Object[20], 0);
    }
}
