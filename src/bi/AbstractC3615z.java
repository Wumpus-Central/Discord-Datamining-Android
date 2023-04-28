package bi;

import kh.AbstractC9874c;
import kh.C9870b;
import kh.C9879g;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p159ih.C8544c;
import p249nh.C11136b;
import p249nh.C11137c;
import p268og.AbstractC11299a1;

/* renamed from: bi.z */
/* loaded from: classes8.dex */
public abstract class AbstractC3615z {

    /* renamed from: a */
    private final AbstractC9874c f5902a;

    /* renamed from: b */
    private final C9879g f5903b;

    /* renamed from: c */
    private final AbstractC11299a1 f5904c;

    /* renamed from: bi.z$a */
    /* loaded from: classes8.dex */
    public static final class C3616a extends AbstractC3615z {

        /* renamed from: d */
        private final C8544c f5905d;

        /* renamed from: e */
        private final C3616a f5906e;

        /* renamed from: f */
        private final C11136b f5907f;

        /* renamed from: g */
        private final C8544c.EnumC0270c f5908g;

        /* renamed from: h */
        private final boolean f5909h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3616a(C8544c classProto, AbstractC9874c nameResolver, C9879g typeTable, AbstractC11299a1 a1Var, C3616a aVar) {
            super(nameResolver, typeTable, a1Var, null);
            C9971q.m14633g(classProto, "classProto");
            C9971q.m14633g(nameResolver, "nameResolver");
            C9971q.m14633g(typeTable, "typeTable");
            this.f5905d = classProto;
            this.f5906e = aVar;
            this.f5907f = C3613x.m33980a(nameResolver, classProto.m19440F0());
            C8544c.EnumC0270c d = C9870b.f22005f.mo15135d(classProto.m19442E0());
            this.f5908g = d == null ? C8544c.EnumC0270c.CLASS : d;
            Boolean g = C9870b.f22006g.mo15135d(classProto.m19442E0());
            C9971q.m14634f(g, "IS_INNER.get(classProto.flags)");
            this.f5909h = g.booleanValue();
        }

        @Override // bi.AbstractC3615z
        /* renamed from: a */
        public C11137c mo33969a() {
            C11137c b = this.f5907f.m10816b();
            C9971q.m14634f(b, "classId.asSingleFqName()");
            return b;
        }

        /* renamed from: e */
        public final C11136b m33974e() {
            return this.f5907f;
        }

        /* renamed from: f */
        public final C8544c m33973f() {
            return this.f5905d;
        }

        /* renamed from: g */
        public final C8544c.EnumC0270c m33972g() {
            return this.f5908g;
        }

        /* renamed from: h */
        public final C3616a m33971h() {
            return this.f5906e;
        }

        /* renamed from: i */
        public final boolean m33970i() {
            return this.f5909h;
        }
    }

    /* renamed from: bi.z$b */
    /* loaded from: classes8.dex */
    public static final class C3617b extends AbstractC3615z {

        /* renamed from: d */
        private final C11137c f5910d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3617b(C11137c fqName, AbstractC9874c nameResolver, C9879g typeTable, AbstractC11299a1 a1Var) {
            super(nameResolver, typeTable, a1Var, null);
            C9971q.m14633g(fqName, "fqName");
            C9971q.m14633g(nameResolver, "nameResolver");
            C9971q.m14633g(typeTable, "typeTable");
            this.f5910d = fqName;
        }

        @Override // bi.AbstractC3615z
        /* renamed from: a */
        public C11137c mo33969a() {
            return this.f5910d;
        }
    }

    private AbstractC3615z(AbstractC9874c cVar, C9879g gVar, AbstractC11299a1 a1Var) {
        this.f5902a = cVar;
        this.f5903b = gVar;
        this.f5904c = a1Var;
    }

    public /* synthetic */ AbstractC3615z(AbstractC9874c cVar, C9879g gVar, AbstractC11299a1 a1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, gVar, a1Var);
    }

    /* renamed from: a */
    public abstract C11137c mo33969a();

    /* renamed from: b */
    public final AbstractC9874c m33977b() {
        return this.f5902a;
    }

    /* renamed from: c */
    public final AbstractC11299a1 m33976c() {
        return this.f5904c;
    }

    /* renamed from: d */
    public final C9879g m33975d() {
        return this.f5903b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + mo33969a();
    }
}
