package p427xg;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6937h;
import p087ei.C6920f;
import p249nh.C11137c;
import p249nh.C11140e;

/* renamed from: xg.e0 */
/* loaded from: classes8.dex */
public final class C14116e0<T> implements AbstractC14112d0<T> {

    /* renamed from: b */
    private final Map<C11137c, T> f31896b;

    /* renamed from: c */
    private final C6920f f31897c;

    /* renamed from: d */
    private final AbstractC6937h<C11137c, T> f31898d;

    /* renamed from: xg.e0$a */
    /* loaded from: classes8.dex */
    static final class C14117a extends AbstractC9973s implements Function1<C11137c, T> {

        /* renamed from: k */
        final /* synthetic */ C14116e0<T> f31899k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14117a(C14116e0<T> e0Var) {
            super(1);
            this.f31899k = e0Var;
        }

        /* renamed from: a */
        public final T invoke(C11137c it) {
            C9971q.m14634f(it, "it");
            return (T) C11140e.m10779a(it, this.f31899k.m1607b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14116e0(Map<C11137c, ? extends T> states) {
        C9971q.m14633g(states, "states");
        this.f31896b = states;
        C6920f fVar = new C6920f("Java nullability annotation states");
        this.f31897c = fVar;
        AbstractC6937h<C11137c, T> g = fVar.mo23894g(new C14117a(this));
        C9971q.m14634f(g, "storageManager.createMem…cificFqname(states)\n    }");
        this.f31898d = g;
    }

    @Override // p427xg.AbstractC14112d0
    /* renamed from: a */
    public T mo1608a(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        return this.f31898d.invoke(fqName);
    }

    /* renamed from: b */
    public final Map<C11137c, T> m1607b() {
        return this.f31896b;
    }
}
