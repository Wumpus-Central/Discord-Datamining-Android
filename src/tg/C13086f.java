package tg;

import gh.AbstractC7637r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p141hh.C8019a;
import p141hh.C8020b;
import p249nh.C11136b;
import p326ri.C12718u;
import ug.C13283d;

/* renamed from: tg.f */
/* loaded from: classes8.dex */
public final class C13086f implements AbstractC7637r {

    /* renamed from: c */
    public static final C13087a f29393c = new C13087a(null);

    /* renamed from: a */
    private final Class<?> f29394a;

    /* renamed from: b */
    private final C8019a f29395b;

    /* renamed from: tg.f$a */
    /* loaded from: classes8.dex */
    public static final class C13087a {
        private C13087a() {
        }

        public /* synthetic */ C13087a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13086f m4627a(Class<?> klass) {
            C9971q.m14633g(klass, "klass");
            C8020b bVar = new C8020b();
            C13083c.f29391a.m4642b(klass, bVar);
            C8019a m = bVar.m20820m();
            if (m == null) {
                return null;
            }
            return new C13086f(klass, m, null);
        }
    }

    private C13086f(Class<?> cls, C8019a aVar) {
        this.f29394a = cls;
        this.f29395b = aVar;
    }

    public /* synthetic */ C13086f(Class cls, C8019a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, aVar);
    }

    @Override // gh.AbstractC7637r
    /* renamed from: a */
    public String mo4633a() {
        String C;
        StringBuilder sb2 = new StringBuilder();
        String name = this.f29394a.getName();
        C9971q.m14634f(name, "klass.name");
        C = C12718u.m5741C(name, '.', '/', false, 4, null);
        sb2.append(C);
        sb2.append(".class");
        return sb2.toString();
    }

    @Override // gh.AbstractC7637r
    /* renamed from: b */
    public void mo4632b(AbstractC7637r.AbstractC7641d visitor, byte[] bArr) {
        C9971q.m14633g(visitor, "visitor");
        C13083c.f29391a.m4635i(this.f29394a, visitor);
    }

    @Override // gh.AbstractC7637r
    /* renamed from: c */
    public void mo4631c(AbstractC7637r.AbstractC7640c visitor, byte[] bArr) {
        C9971q.m14633g(visitor, "visitor");
        C13083c.f29391a.m4642b(this.f29394a, visitor);
    }

    @Override // gh.AbstractC7637r
    /* renamed from: d */
    public C8019a mo4630d() {
        return this.f29395b;
    }

    /* renamed from: e */
    public final Class<?> m4629e() {
        return this.f29394a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13086f) && C9971q.m14638b(this.f29394a, ((C13086f) obj).f29394a);
    }

    public int hashCode() {
        return this.f29394a.hashCode();
    }

    @Override // gh.AbstractC7637r
    /* renamed from: k */
    public C11136b mo4628k() {
        return C13283d.m4053a(this.f29394a);
    }

    public String toString() {
        return C13086f.class.getName() + ": " + this.f29394a;
    }
}
