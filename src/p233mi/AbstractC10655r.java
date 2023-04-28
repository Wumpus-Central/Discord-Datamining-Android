package p233mi;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217lg.AbstractC10420h;
import p233mi.AbstractC10628f;
import p268og.AbstractC11397y;
import p388vh.C13508c;

/* renamed from: mi.r */
/* loaded from: classes8.dex */
public abstract class AbstractC10655r implements AbstractC10628f {

    /* renamed from: a */
    private final String f23577a;

    /* renamed from: b */
    private final Function1<AbstractC10420h, AbstractC7267g0> f23578b;

    /* renamed from: c */
    private final String f23579c;

    /* renamed from: mi.r$a */
    /* loaded from: classes8.dex */
    public static final class C10656a extends AbstractC10655r {

        /* renamed from: d */
        public static final C10656a f23580d = new C10656a();

        /* renamed from: mi.r$a$a */
        /* loaded from: classes8.dex */
        static final class C0344a extends AbstractC9973s implements Function1<AbstractC10420h, AbstractC7267g0> {

            /* renamed from: k */
            public static final C0344a f23581k = new C0344a();

            C0344a() {
                super(1);
            }

            /* renamed from: a */
            public final AbstractC7267g0 invoke(AbstractC10420h hVar) {
                C9971q.m14633g(hVar, "$this$null");
                AbstractC7304o0 booleanType = hVar.m13377n();
                C9971q.m14634f(booleanType, "booleanType");
                return booleanType;
            }
        }

        private C10656a() {
            super("Boolean", C0344a.f23581k, null);
        }
    }

    /* renamed from: mi.r$b */
    /* loaded from: classes8.dex */
    public static final class C10657b extends AbstractC10655r {

        /* renamed from: d */
        public static final C10657b f23582d = new C10657b();

        /* renamed from: mi.r$b$a */
        /* loaded from: classes8.dex */
        static final class C10658a extends AbstractC9973s implements Function1<AbstractC10420h, AbstractC7267g0> {

            /* renamed from: k */
            public static final C10658a f23583k = new C10658a();

            C10658a() {
                super(1);
            }

            /* renamed from: a */
            public final AbstractC7267g0 invoke(AbstractC10420h hVar) {
                C9971q.m14633g(hVar, "$this$null");
                AbstractC7304o0 intType = hVar.m13425D();
                C9971q.m14634f(intType, "intType");
                return intType;
            }
        }

        private C10657b() {
            super("Int", C10658a.f23583k, null);
        }
    }

    /* renamed from: mi.r$c */
    /* loaded from: classes8.dex */
    public static final class C10659c extends AbstractC10655r {

        /* renamed from: d */
        public static final C10659c f23584d = new C10659c();

        /* renamed from: mi.r$c$a */
        /* loaded from: classes8.dex */
        static final class C10660a extends AbstractC9973s implements Function1<AbstractC10420h, AbstractC7267g0> {

            /* renamed from: k */
            public static final C10660a f23585k = new C10660a();

            C10660a() {
                super(1);
            }

            /* renamed from: a */
            public final AbstractC7267g0 invoke(AbstractC10420h hVar) {
                C9971q.m14633g(hVar, "$this$null");
                AbstractC7304o0 unitType = hVar.m13403Z();
                C9971q.m14634f(unitType, "unitType");
                return unitType;
            }
        }

        private C10659c() {
            super("Unit", C10660a.f23585k, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC10655r(String str, Function1<? super AbstractC10420h, ? extends AbstractC7267g0> function1) {
        this.f23577a = str;
        this.f23578b = function1;
        this.f23579c = "must return " + str;
    }

    public /* synthetic */ AbstractC10655r(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    @Override // p233mi.AbstractC10628f
    /* renamed from: a */
    public boolean mo12674a(AbstractC11397y functionDescriptor) {
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        return C9971q.m14638b(functionDescriptor.getReturnType(), this.f23578b.invoke(C13508c.m3531j(functionDescriptor)));
    }

    @Override // p233mi.AbstractC10628f
    /* renamed from: b */
    public String mo12675b(AbstractC11397y yVar) {
        return AbstractC10628f.C10629a.m12707a(this, yVar);
    }

    @Override // p233mi.AbstractC10628f
    public String getDescription() {
        return this.f23579c;
    }
}
