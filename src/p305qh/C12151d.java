package p305qh;

import fi.AbstractC7223a0;
import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.AbstractC7342x1;
import fi.C7222a;
import fi.C7245f0;
import fi.C7278i0;
import fi.C7306p;
import fi.C7321s0;
import fi.C7322s1;
import fi.C7337w0;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ki.C9883a;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.collections.C9922x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import nf.C11088q;
import ni.C11148a;
import p142hi.C8036h;
import p142hi.C8037i;
import p142hi.C8039k;
import p217lg.AbstractC10420h;
import p217lg.C10419g;
import p217lg.C10434k;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11142f;
import p249nh.C11144h;
import p268og.AbstractC11297a;
import p268og.AbstractC11301b;
import p268og.AbstractC11309d;
import p268og.AbstractC11310d0;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.AbstractC11330i;
import p268og.AbstractC11335j1;
import p268og.AbstractC11342k1;
import p268og.AbstractC11343l;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.AbstractC11363o;
import p268og.AbstractC11365p;
import p268og.AbstractC11368q0;
import p268og.AbstractC11386t0;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11390v0;
import p268og.AbstractC11391w;
import p268og.AbstractC11392w0;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.C11322g1;
import p268og.C11337k0;
import p268og.C11372s0;
import p268og.C11373t;
import p268og.EnumC11314e0;
import p268og.EnumC11317f;
import p305qh.AbstractC12137c;
import p325rh.C12661e;
import p326ri.C12690b;
import p326ri.C12718u;
import p326ri.C12719v;
import p326ri.C12724x;
import p388vh.C13508c;
import pg.AbstractC11664a;
import pg.AbstractC11666c;
import pg.EnumC11669e;
import th.AbstractC13104g;
import th.C13097a;
import th.C13099b;
import th.C13122q;

/* renamed from: qh.d */
/* loaded from: classes8.dex */
public final class C12151d extends AbstractC12137c implements AbstractC12161f {

    /* renamed from: l */
    private final C12163g f27247l;

    /* renamed from: m */
    private final Lazy f27248m;

    /* renamed from: qh.d$a */
    /* loaded from: classes8.dex */
    private final class C12152a implements AbstractC11363o<Unit, StringBuilder> {

        /* renamed from: qh.d$a$a */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C0388a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f27250a;

            static {
                int[] iArr = new int[EnumC12171l.values().length];
                try {
                    iArr[EnumC12171l.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC12171l.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC12171l.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27250a = iArr;
            }
        }

        public C12152a() {
        }

        /* renamed from: t */
        private final void m7594t(AbstractC11386t0 t0Var, StringBuilder sb2, String str) {
            int i = C0388a.f27250a[C12151d.this.m7640l0().ordinal()];
            if (i == 1) {
                C12151d.this.m7687R0(t0Var, sb2);
                sb2.append(str + " for ");
                C12151d dVar = C12151d.this;
                AbstractC11388u0 T = t0Var.mo6459T();
                C9971q.m14634f(T, "descriptor.correspondingProperty");
                dVar.m7737A1(T, sb2);
            } else if (i == 2) {
                m7598p(t0Var, sb2);
            }
        }

        /* renamed from: A */
        public void m7602A(AbstractC11335j1 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7683S1(descriptor, true, builder, true);
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Unit mo6323a(AbstractC11343l lVar, StringBuilder sb2) {
            m7599o(lVar, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Unit mo6322b(AbstractC11396x0 x0Var, StringBuilder sb2) {
            m7590x(x0Var, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Unit mo6321c(AbstractC11392w0 w0Var, StringBuilder sb2) {
            m7591w(w0Var, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: d */
        public /* bridge */ /* synthetic */ Unit mo6320d(AbstractC11327h0 h0Var, StringBuilder sb2) {
            m7597q(h0Var, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: e */
        public /* bridge */ /* synthetic */ Unit mo6319e(AbstractC11368q0 q0Var, StringBuilder sb2) {
            m7595s(q0Var, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Unit mo6318f(AbstractC11344l0 l0Var, StringBuilder sb2) {
            m7596r(l0Var, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: g */
        public /* bridge */ /* synthetic */ Unit mo6317g(AbstractC11316e1 e1Var, StringBuilder sb2) {
            m7589y(e1Var, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Unit mo6316h(AbstractC11313e eVar, StringBuilder sb2) {
            m7600n(eVar, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: i */
        public /* bridge */ /* synthetic */ Unit mo7601i(AbstractC11388u0 u0Var, StringBuilder sb2) {
            m7593u(u0Var, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: j */
        public /* bridge */ /* synthetic */ Unit mo6315j(AbstractC11335j1 j1Var, StringBuilder sb2) {
            m7602A(j1Var, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: k */
        public /* bridge */ /* synthetic */ Unit mo6314k(AbstractC11397y yVar, StringBuilder sb2) {
            m7598p(yVar, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: l */
        public /* bridge */ /* synthetic */ Unit mo6313l(AbstractC11319f1 f1Var, StringBuilder sb2) {
            m7588z(f1Var, sb2);
            return Unit.f22042a;
        }

        @Override // p268og.AbstractC11363o
        /* renamed from: m */
        public /* bridge */ /* synthetic */ Unit mo6312m(AbstractC11390v0 v0Var, StringBuilder sb2) {
            m7592v(v0Var, sb2);
            return Unit.f22042a;
        }

        /* renamed from: n */
        public void m7600n(AbstractC11313e descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7669X0(descriptor, builder);
        }

        /* renamed from: o */
        public void m7599o(AbstractC11343l constructorDescriptor, StringBuilder builder) {
            C9971q.m14633g(constructorDescriptor, "constructorDescriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7657c1(constructorDescriptor, builder);
        }

        /* renamed from: p */
        public void m7598p(AbstractC11397y descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7645i1(descriptor, builder);
        }

        /* renamed from: q */
        public void m7597q(AbstractC11327h0 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7623s1(descriptor, builder, true);
        }

        /* renamed from: r */
        public void m7596r(AbstractC11344l0 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7611w1(descriptor, builder);
        }

        /* renamed from: s */
        public void m7595s(AbstractC11368q0 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7606y1(descriptor, builder);
        }

        /* renamed from: u */
        public void m7593u(AbstractC11388u0 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7737A1(descriptor, builder);
        }

        /* renamed from: v */
        public void m7592v(AbstractC11390v0 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            m7594t(descriptor, builder, "getter");
        }

        /* renamed from: w */
        public void m7591w(AbstractC11392w0 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            m7594t(descriptor, builder, "setter");
        }

        /* renamed from: x */
        public void m7590x(AbstractC11396x0 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            builder.append(descriptor.getName());
        }

        /* renamed from: y */
        public void m7589y(AbstractC11316e1 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7713I1(descriptor, builder);
        }

        /* renamed from: z */
        public void m7588z(AbstractC11319f1 descriptor, StringBuilder builder) {
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(builder, "builder");
            C12151d.this.m7698N1(descriptor, builder, true);
        }
    }

    /* renamed from: qh.d$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C12153b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27251a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f27252b;

        static {
            int[] iArr = new int[EnumC12172m.values().length];
            try {
                iArr[EnumC12172m.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12172m.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27251a = iArr;
            int[] iArr2 = new int[EnumC12170k.values().length];
            try {
                iArr2[EnumC12170k.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC12170k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC12170k.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f27252b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qh.d$c */
    /* loaded from: classes8.dex */
    public static final class C12154c extends AbstractC9973s implements Function1<AbstractC7290k1, CharSequence> {
        C12154c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC7290k1 it) {
            C9971q.m14633g(it, "it");
            if (it.mo22907a()) {
                return "*";
            }
            C12151d dVar = C12151d.this;
            AbstractC7267g0 type = it.getType();
            C9971q.m14634f(type, "it.type");
            String w = dVar.mo7613w(type);
            if (it.mo22906b() == EnumC7338w1.INVARIANT) {
                return w;
            }
            return it.mo22906b() + ' ' + w;
        }
    }

    /* renamed from: qh.d$d */
    /* loaded from: classes8.dex */
    static final class C0389d extends AbstractC9973s implements Function0<C12151d> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qh.d$d$a */
        /* loaded from: classes8.dex */
        public static final class a extends AbstractC9973s implements Function1<AbstractC12161f, Unit> {

            /* renamed from: k */
            public static final a f27255k = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m7585a(AbstractC12161f withOptions) {
                List l;
                Set<C11137c> l2;
                C9971q.m14633g(withOptions, "$this$withOptions");
                Set<C11137c> g = withOptions.mo7539g();
                l = C9906j.m14817l(C10434k.C10435a.f38769C, C10434k.C10435a.f38771D);
                l2 = C9922x.m14714l(g, l);
                withOptions.mo7533j(l2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC12161f fVar) {
                m7585a(fVar);
                return Unit.f22042a;
            }
        }

        C0389d() {
            super(0);
        }

        /* renamed from: a */
        public final C12151d invoke() {
            AbstractC12137c y = C12151d.this.m7756y(a.f27255k);
            C9971q.m14635e(y, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            return (C12151d) y;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qh.d$e */
    /* loaded from: classes8.dex */
    public static final class C12155e extends AbstractC9973s implements Function1<AbstractC13104g<?>, CharSequence> {
        C12155e() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC13104g<?> it) {
            C9971q.m14633g(it, "it");
            return C12151d.this.m7659b1(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qh.d$f */
    /* loaded from: classes8.dex */
    public static final class C12156f extends AbstractC9973s implements Function1<AbstractC11335j1, CharSequence> {

        /* renamed from: k */
        public static final C12156f f27257k = new C12156f();

        C12156f() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC11335j1 j1Var) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qh.d$g */
    /* loaded from: classes8.dex */
    public static final class C12157g extends AbstractC9973s implements Function1<AbstractC7267g0, CharSequence> {
        C12157g() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC7267g0 it) {
            C12151d dVar = C12151d.this;
            C9971q.m14634f(it, "it");
            return dVar.mo7613w(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qh.d$h */
    /* loaded from: classes8.dex */
    public static final class C12158h extends AbstractC9973s implements Function1<AbstractC7267g0, Object> {

        /* renamed from: k */
        public static final C12158h f27259k = new C12158h();

        C12158h() {
            super(1);
        }

        /* renamed from: a */
        public final Object invoke(AbstractC7267g0 it) {
            C9971q.m14633g(it, "it");
            if (it instanceof C7337w0) {
                return ((C7337w0) it).m23139W0();
            }
            return it;
        }
    }

    public C12151d(C12163g options) {
        Lazy a;
        C9971q.m14633g(options, "options");
        this.f27247l = options;
        options.m7530k0();
        a = C11084n.m10945a(new C0389d());
        this.f27248m = a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public final void m7737A1(AbstractC11388u0 u0Var, StringBuilder sb2) {
        boolean z;
        if (!m7607y0()) {
            if (!m7609x0()) {
                m7734B1(u0Var, sb2);
                List<AbstractC11396x0> u0 = u0Var.mo6237u0();
                C9971q.m14634f(u0, "property.contextReceiverParameters");
                m7655d1(u0, sb2);
                AbstractC11387u visibility = u0Var.getVisibility();
                C9971q.m14634f(visibility, "property.visibility");
                m7674V1(visibility, sb2);
                boolean z2 = false;
                if (!m7654e0().contains(EnumC12159e.CONST) || !u0Var.mo59Y()) {
                    z = false;
                } else {
                    z = true;
                }
                m7625r1(sb2, z, "const");
                m7635n1(u0Var, sb2);
                m7628q1(u0Var, sb2);
                m7614v1(u0Var, sb2);
                if (m7654e0().contains(EnumC12159e.LATEINIT) && u0Var.mo6433w0()) {
                    z2 = true;
                }
                m7625r1(sb2, z2, "lateinit");
                m7637m1(u0Var, sb2);
            }
            m7686R1(this, u0Var, sb2, false, 4, null);
            List<AbstractC11319f1> typeParameters = u0Var.getTypeParameters();
            C9971q.m14634f(typeParameters, "property.typeParameters");
            m7692P1(typeParameters, sb2, true);
            m7731C1(u0Var, sb2);
        }
        m7623s1(u0Var, sb2, true);
        sb2.append(": ");
        AbstractC7267g0 type = u0Var.getType();
        C9971q.m14634f(type, "property.type");
        sb2.append(mo7613w(type));
        m7728D1(u0Var, sb2);
        m7641k1(u0Var, sb2);
        List<AbstractC11319f1> typeParameters2 = u0Var.getTypeParameters();
        C9971q.m14634f(typeParameters2, "property.typeParameters");
        m7671W1(typeParameters2, sb2);
    }

    /* renamed from: B1 */
    private final void m7734B1(AbstractC11388u0 u0Var, StringBuilder sb2) {
        Object r0;
        if (m7654e0().contains(EnumC12159e.ANNOTATIONS)) {
            m7675V0(this, sb2, u0Var, null, 2, null);
            AbstractC11391w t0 = u0Var.mo6435t0();
            if (t0 != null) {
                m7678U0(sb2, t0, EnumC11669e.FIELD);
            }
            AbstractC11391w N = u0Var.mo6454N();
            if (N != null) {
                m7678U0(sb2, N, EnumC11669e.PROPERTY_DELEGATE_FIELD);
            }
            if (m7640l0() == EnumC12171l.NONE) {
                AbstractC11390v0 f = u0Var.mo6437f();
                if (f != null) {
                    m7678U0(sb2, f, EnumC11669e.PROPERTY_GETTER);
                }
                AbstractC11392w0 h = u0Var.mo6436h();
                if (h != null) {
                    m7678U0(sb2, h, EnumC11669e.PROPERTY_SETTER);
                    List<AbstractC11335j1> i = h.mo6242i();
                    C9971q.m14634f(i, "setter.valueParameters");
                    r0 = C9914r.m14747r0(i);
                    AbstractC11335j1 it = (AbstractC11335j1) r0;
                    C9971q.m14634f(it, "it");
                    m7678U0(sb2, it, EnumC11669e.SETTER_PARAMETER);
                }
            }
        }
    }

    /* renamed from: C1 */
    private final void m7731C1(AbstractC11297a aVar, StringBuilder sb2) {
        AbstractC11396x0 M = aVar.mo6264M();
        if (M != null) {
            m7678U0(sb2, M, EnumC11669e.RECEIVER);
            AbstractC7267g0 type = M.getType();
            C9971q.m14634f(type, "receiver.type");
            sb2.append(m7649g1(type));
            sb2.append(".");
        }
    }

    /* renamed from: D1 */
    private final void m7728D1(AbstractC11297a aVar, StringBuilder sb2) {
        AbstractC11396x0 M;
        if (m7638m0() && (M = aVar.mo6264M()) != null) {
            sb2.append(" on ");
            AbstractC7267g0 type = M.getType();
            C9971q.m14634f(type, "receiver.type");
            sb2.append(mo7613w(type));
        }
    }

    /* renamed from: E1 */
    private final void m7725E1(StringBuilder sb2, AbstractC7304o0 o0Var) {
        if (C9971q.m14638b(o0Var, C7322s1.f15806b) || C7322s1.m22936k(o0Var)) {
            sb2.append("???");
        } else if (C8039k.m20763o(o0Var)) {
            if (m7735B0()) {
                AbstractC7268g1 N0 = o0Var.mo5172N0();
                C9971q.m14635e(N0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(m7651f1(((C8037i) N0).m20781d(0)));
                return;
            }
            sb2.append("???");
        } else if (C7278i0.m23035a(o0Var)) {
            m7653e1(sb2, o0Var);
        } else if (m7668X1(o0Var)) {
            m7643j1(sb2, o0Var);
        } else {
            m7653e1(sb2, o0Var);
        }
    }

    /* renamed from: F1 */
    private final void m7722F1(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    /* renamed from: G1 */
    private final void m7719G1(AbstractC11313e eVar, StringBuilder sb2) {
        if (!m7714I0() && !AbstractC10420h.m13378m0(eVar.mo6166p())) {
            Collection<AbstractC7267g0> m = eVar.mo6111k().mo4568m();
            C9971q.m14634f(m, "klass.typeConstructor.supertypes");
            if (m.isEmpty()) {
                return;
            }
            if (m.size() != 1 || !AbstractC10420h.m13399b0(m.iterator().next())) {
                m7722F1(sb2);
                sb2.append(": ");
                C9914r.m14762c0(m, sb2, ", ", null, null, 0, null, new C12157g(), 60, null);
            }
        }
    }

    /* renamed from: H1 */
    private final void m7716H1(AbstractC11397y yVar, StringBuilder sb2) {
        m7625r1(sb2, yVar.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public final void m7713I1(AbstractC11316e1 e1Var, StringBuilder sb2) {
        m7675V0(this, sb2, e1Var, null, 2, null);
        AbstractC11387u visibility = e1Var.getVisibility();
        C9971q.m14634f(visibility, "typeAlias.visibility");
        m7674V1(visibility, sb2);
        m7635n1(e1Var, sb2);
        sb2.append(m7639l1("typealias"));
        sb2.append(" ");
        m7623s1(e1Var, sb2, true);
        List<AbstractC11319f1> r = e1Var.mo6109r();
        C9971q.m14634f(r, "typeAlias.declaredTypeParameters");
        m7692P1(r, sb2, false);
        m7672W0(e1Var, sb2);
        sb2.append(" = ");
        sb2.append(mo7613w(e1Var.mo10217q0()));
    }

    /* renamed from: K0 */
    private final String m7708K0() {
        return m7697O(">");
    }

    /* renamed from: L */
    private final void m7706L(StringBuilder sb2, AbstractC11346m mVar) {
        AbstractC11346m b;
        String str;
        String name;
        if (!(mVar instanceof AbstractC11344l0) && !(mVar instanceof AbstractC11368q0) && (b = mVar.mo6104b()) != null && !(b instanceof AbstractC11327h0)) {
            sb2.append(" ");
            sb2.append(m7633o1("defined in"));
            sb2.append(" ");
            C11138d m = C12661e.m6041m(b);
            C9971q.m14634f(m, "getFqName(containingDeclaration)");
            if (m.m10789e()) {
                str = "root package";
            } else {
                str = mo7619u(m);
            }
            sb2.append(str);
            if (m7720G0() && (b instanceof AbstractC11344l0) && (mVar instanceof AbstractC11365p) && (name = ((AbstractC11365p) mVar).mo6102j().mo4612b().getName()) != null) {
                sb2.append(" ");
                sb2.append(m7633o1("in file"));
                sb2.append(" ");
                sb2.append(name);
            }
        }
    }

    /* renamed from: L0 */
    private final boolean m7705L0(AbstractC7267g0 g0Var) {
        return C10419g.m13435q(g0Var) || !g0Var.getAnnotations().isEmpty();
    }

    /* renamed from: L1 */
    private final void m7704L1(StringBuilder sb2, AbstractC7267g0 g0Var, AbstractC7268g1 g1Var) {
        C11372s0 a = C11322g1.m10212a(g0Var);
        if (a == null) {
            sb2.append(m7707K1(g1Var));
            sb2.append(m7710J1(g0Var.mo5174L0()));
            return;
        }
        m7603z1(sb2, a);
    }

    /* renamed from: M */
    private final void m7703M(StringBuilder sb2, List<? extends AbstractC7290k1> list) {
        C9914r.m14762c0(list, sb2, ", ", null, null, 0, null, new C12154c(), 60, null);
    }

    /* renamed from: M0 */
    private final EnumC11314e0 m7702M0(AbstractC11310d0 d0Var) {
        AbstractC11313e eVar;
        if (!(d0Var instanceof AbstractC11313e)) {
            AbstractC11346m b = d0Var.mo6104b();
            if (b instanceof AbstractC11313e) {
                eVar = (AbstractC11313e) b;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                return EnumC11314e0.FINAL;
            }
            if (!(d0Var instanceof AbstractC11301b)) {
                return EnumC11314e0.FINAL;
            }
            AbstractC11301b bVar = (AbstractC11301b) d0Var;
            Collection<? extends AbstractC11301b> d = bVar.mo6249d();
            C9971q.m14634f(d, "this.overriddenDescriptors");
            if ((!d.isEmpty()) && eVar.mo6108s() != EnumC11314e0.FINAL) {
                return EnumC11314e0.OPEN;
            }
            if (eVar.mo6116g() != EnumC11317f.INTERFACE || C9971q.m14638b(bVar.getVisibility(), C11373t.f25295a)) {
                return EnumC11314e0.FINAL;
            }
            EnumC11314e0 s = bVar.mo6108s();
            EnumC11314e0 e0Var = EnumC11314e0.ABSTRACT;
            if (s == e0Var) {
                return e0Var;
            }
            return EnumC11314e0.OPEN;
        } else if (((AbstractC11313e) d0Var).mo6116g() == EnumC11317f.INTERFACE) {
            return EnumC11314e0.ABSTRACT;
        } else {
            return EnumC11314e0.FINAL;
        }
    }

    /* renamed from: M1 */
    static /* synthetic */ void m7701M1(C12151d dVar, StringBuilder sb2, AbstractC7267g0 g0Var, AbstractC7268g1 g1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            g1Var = g0Var.mo5172N0();
        }
        dVar.m7704L1(sb2, g0Var, g1Var);
    }

    /* renamed from: N */
    private final String m7700N() {
        int i = C12153b.f27251a[m7604z0().ordinal()];
        if (i == 1) {
            return m7697O("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new C11088q();
    }

    /* renamed from: N0 */
    private final boolean m7699N0(AbstractC11666c cVar) {
        return C9971q.m14638b(cVar.mo722e(), C10434k.C10435a.f38773E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m7698N1(AbstractC11319f1 f1Var, StringBuilder sb2, boolean z) {
        boolean z2;
        if (z) {
            sb2.append(m7696O0());
        }
        if (m7726E0()) {
            sb2.append("/*");
            sb2.append(f1Var.getIndex());
            sb2.append("*/ ");
        }
        m7625r1(sb2, f1Var.mo6391w(), "reified");
        String c = f1Var.mo6392m().m22886c();
        boolean z3 = true;
        if (c.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        m7625r1(sb2, z2, c);
        m7675V0(this, sb2, f1Var, null, 2, null);
        m7623s1(f1Var, sb2, z);
        int size = f1Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC7267g0 upperBound = f1Var.getUpperBounds().iterator().next();
            if (!AbstractC10420h.m13386i0(upperBound)) {
                sb2.append(" : ");
                C9971q.m14634f(upperBound, "upperBound");
                sb2.append(mo7613w(upperBound));
            }
        } else if (z) {
            for (AbstractC7267g0 upperBound2 : f1Var.getUpperBounds()) {
                if (!AbstractC10420h.m13386i0(upperBound2)) {
                    if (z3) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    C9971q.m14634f(upperBound2, "upperBound");
                    sb2.append(mo7613w(upperBound2));
                    z3 = false;
                }
            }
        }
        if (z) {
            sb2.append(m7708K0());
        }
    }

    /* renamed from: O */
    private final String m7697O(String str) {
        return m7604z0().mo7505b(str);
    }

    /* renamed from: O0 */
    private final String m7696O0() {
        return m7697O("<");
    }

    /* renamed from: O1 */
    private final void m7695O1(StringBuilder sb2, List<? extends AbstractC11319f1> list) {
        Iterator<? extends AbstractC11319f1> it = list.iterator();
        while (it.hasNext()) {
            m7698N1((AbstractC11319f1) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    /* renamed from: P0 */
    private final boolean m7693P0(AbstractC11301b bVar) {
        return !bVar.mo6249d().isEmpty();
    }

    /* renamed from: P1 */
    private final void m7692P1(List<? extends AbstractC11319f1> list, StringBuilder sb2, boolean z) {
        if (!m7711J0() && (!list.isEmpty())) {
            sb2.append(m7696O0());
            m7695O1(sb2, list);
            sb2.append(m7708K0());
            if (z) {
                sb2.append(" ");
            }
        }
    }

    /* renamed from: Q0 */
    private final void m7690Q0(StringBuilder sb2, C7222a aVar) {
        EnumC12172m z0 = m7604z0();
        EnumC12172m mVar = EnumC12172m.HTML;
        if (z0 == mVar) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        m7617u1(sb2, aVar.m23175E());
        sb2.append(" */");
        if (m7604z0() == mVar) {
            sb2.append("</i></font>");
        }
    }

    /* renamed from: Q1 */
    private final void m7689Q1(AbstractC11342k1 k1Var, StringBuilder sb2, boolean z) {
        String str;
        if (z || !(k1Var instanceof AbstractC11335j1)) {
            if (k1Var.mo6277L()) {
                str = "var";
            } else {
                str = "val";
            }
            sb2.append(m7639l1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public final void m7687R0(AbstractC11386t0 t0Var, StringBuilder sb2) {
        m7635n1(t0Var, sb2);
    }

    /* renamed from: R1 */
    static /* synthetic */ void m7686R1(C12151d dVar, AbstractC11342k1 k1Var, StringBuilder sb2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        dVar.m7689Q1(k1Var, sb2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m7684S0(p268og.AbstractC11397y r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.isOperator()
            java.lang.String r1 = "functionDescriptor.overriddenDescriptors"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003a
            java.util.Collection r0 = r6.mo6249d()
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0019
        L_0x0017:
            r0 = r3
            goto L_0x0030
        L_0x0019:
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0017
            java.lang.Object r4 = r0.next()
            og.y r4 = (p268og.AbstractC11397y) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L_0x001d
            r0 = r2
        L_0x0030:
            if (r0 != 0) goto L_0x0038
            boolean r0 = r5.m7691Q()
            if (r0 == 0) goto L_0x003a
        L_0x0038:
            r0 = r3
            goto L_0x003b
        L_0x003a:
            r0 = r2
        L_0x003b:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L_0x0070
            java.util.Collection r4 = r6.mo6249d()
            kotlin.jvm.internal.C9971q.m14634f(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0050
        L_0x004e:
            r1 = r3
            goto L_0x0067
        L_0x0050:
            java.util.Iterator r1 = r4.iterator()
        L_0x0054:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r1.next()
            og.y r4 = (p268og.AbstractC11397y) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L_0x0054
            r1 = r2
        L_0x0067:
            if (r1 != 0) goto L_0x006f
            boolean r1 = r5.m7691Q()
            if (r1 == 0) goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            boolean r1 = r6.mo6274A()
            java.lang.String r3 = "tailrec"
            r5.m7625r1(r7, r1, r3)
            r5.m7716H1(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r1 = "inline"
            r5.m7625r1(r7, r6, r1)
            java.lang.String r6 = "infix"
            r5.m7625r1(r7, r2, r6)
            java.lang.String r6 = "operator"
            r5.m7625r1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305qh.C12151d.m7684S0(og.y, java.lang.StringBuilder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r11 != false) goto L_0x0092;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: S1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7683S1(p268og.AbstractC11335j1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.m7639l1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L_0x0010:
            boolean r0 = r9.m7726E0()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r12.append(r0)
        L_0x0027:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            m7675V0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.mo6305o0()
            java.lang.String r1 = "crossinline"
            r9.m7625r1(r12, r0, r1)
            boolean r0 = r10.mo6306l0()
            java.lang.String r1 = "noinline"
            r9.m7625r1(r12, r0, r1)
            boolean r0 = r9.m7621t0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0065
            og.a r0 = r10.mo6104b()
            boolean r3 = r0 instanceof p268og.AbstractC11309d
            if (r3 == 0) goto L_0x0055
            og.d r0 = (p268og.AbstractC11309d) r0
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.mo6349Z()
            if (r0 != r1) goto L_0x0060
            r0 = r1
            goto L_0x0061
        L_0x0060:
            r0 = r2
        L_0x0061:
            if (r0 == 0) goto L_0x0065
            r8 = r1
            goto L_0x0066
        L_0x0065:
            r8 = r2
        L_0x0066:
            if (r8 == 0) goto L_0x0071
            boolean r0 = r9.m7694P()
            java.lang.String r3 = "actual"
            r9.m7625r1(r12, r0, r3)
        L_0x0071:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.m7677U1(r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function1 r11 = r9.m7676V()
            if (r11 == 0) goto L_0x0091
            boolean r11 = r9.mo7537h()
            if (r11 == 0) goto L_0x008a
            boolean r11 = r10.mo6303y0()
            goto L_0x008e
        L_0x008a:
            boolean r11 = p388vh.C13508c.m3538c(r10)
        L_0x008e:
            if (r11 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r1 = r2
        L_0x0092:
            if (r1 == 0) goto L_0x00b5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            kotlin.jvm.functions.Function1 r13 = r9.m7676V()
            kotlin.jvm.internal.C9971q.m14636d(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305qh.C12151d.m7683S1(og.j1, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* renamed from: T0 */
    private final List<String> m7681T0(AbstractC11666c cVar) {
        AbstractC11313e eVar;
        int t;
        int t2;
        List o0;
        List<String> v0;
        String str;
        AbstractC11309d B;
        List<AbstractC11335j1> i;
        int t3;
        Map<C11142f, AbstractC13104g<?>> a = cVar.mo700a();
        List list = null;
        if (m7629q0()) {
            eVar = C13508c.m3532i(cVar);
        } else {
            eVar = null;
        }
        if (!(eVar == null || (B = eVar.mo6129B()) == null || (i = B.mo6242i()) == null)) {
            ArrayList<AbstractC11335j1> arrayList = new ArrayList();
            for (Object obj : i) {
                if (((AbstractC11335j1) obj).mo6303y0()) {
                    arrayList.add(obj);
                }
            }
            t3 = C9907k.m14809t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t3);
            for (AbstractC11335j1 j1Var : arrayList) {
                arrayList2.add(j1Var.getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = C9906j.m14820i();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            C11142f it = (C11142f) obj2;
            C9971q.m14634f(it, "it");
            if (!a.containsKey(it)) {
                arrayList3.add(obj2);
            }
        }
        t = C9907k.m14809t(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(t);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C11142f) it2.next()).m10771b() + " = ...");
        }
        Set<Map.Entry<C11142f, AbstractC13104g<?>>> entrySet = a.entrySet();
        t2 = C9907k.m14809t(entrySet, 10);
        ArrayList arrayList5 = new ArrayList(t2);
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C11142f fVar = (C11142f) entry.getKey();
            AbstractC13104g<?> gVar = (AbstractC13104g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.m10771b());
            sb2.append(" = ");
            if (!list.contains(fVar)) {
                str = m7659b1(gVar);
            } else {
                str = "...";
            }
            sb2.append(str);
            arrayList5.add(sb2.toString());
        }
        o0 = C9914r.m14750o0(arrayList4, arrayList5);
        v0 = C9914r.m14743v0(o0);
        return v0;
    }

    /* renamed from: T1 */
    private final void m7680T1(Collection<? extends AbstractC11335j1> collection, boolean z, StringBuilder sb2) {
        boolean Y1 = m7665Y1(z);
        int size = collection.size();
        m7729D0().mo7741c(size, sb2);
        int i = 0;
        for (AbstractC11335j1 j1Var : collection) {
            m7729D0().mo7742b(j1Var, i, size, sb2);
            m7683S1(j1Var, Y1, sb2, false);
            m7729D0().mo7743a(j1Var, i, size, sb2);
            i++;
        }
        m7729D0().mo7740d(size, sb2);
    }

    /* renamed from: U0 */
    private final void m7678U0(StringBuilder sb2, AbstractC11664a aVar, EnumC11669e eVar) {
        Set<C11137c> set;
        boolean M;
        if (m7654e0().contains(EnumC12159e.ANNOTATIONS)) {
            if (aVar instanceof AbstractC7267g0) {
                set = mo7539g();
            } else {
                set = m7670X();
            }
            Function1<AbstractC11666c, Boolean> R = m7688R();
            for (AbstractC11666c cVar : aVar.getAnnotations()) {
                M = C9914r.m14778M(set, cVar.mo722e());
                if (!M && !m7699N0(cVar) && (R == null || R.invoke(cVar).booleanValue())) {
                    sb2.append(mo7627r(cVar, eVar));
                    if (m7673W()) {
                        sb2.append('\n');
                        C9971q.m14634f(sb2, "append('\\n')");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    /* renamed from: U1 */
    private final void m7677U1(AbstractC11342k1 k1Var, boolean z, StringBuilder sb2, boolean z2, boolean z3) {
        AbstractC11335j1 j1Var;
        AbstractC7267g0 g0Var;
        boolean z4;
        AbstractC7267g0 type = k1Var.getType();
        C9971q.m14634f(type, "variable.type");
        AbstractC7267g0 g0Var2 = null;
        if (k1Var instanceof AbstractC11335j1) {
            j1Var = (AbstractC11335j1) k1Var;
        } else {
            j1Var = null;
        }
        if (j1Var != null) {
            g0Var2 = j1Var.mo6304r0();
        }
        if (g0Var2 == null) {
            g0Var = type;
        } else {
            g0Var = g0Var2;
        }
        if (g0Var2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        m7625r1(sb2, z4, "vararg");
        if (z3 || (z2 && !m7607y0())) {
            m7689Q1(k1Var, sb2, z3);
        }
        if (z) {
            m7623s1(k1Var, sb2, z2);
            sb2.append(": ");
        }
        sb2.append(mo7613w(g0Var));
        m7641k1(k1Var, sb2);
        if (m7726E0() && g0Var2 != null) {
            sb2.append(" /*");
            sb2.append(mo7613w(type));
            sb2.append("*/");
        }
    }

    /* renamed from: V0 */
    static /* synthetic */ void m7675V0(C12151d dVar, StringBuilder sb2, AbstractC11664a aVar, EnumC11669e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        dVar.m7678U0(sb2, aVar, eVar);
    }

    /* renamed from: V1 */
    private final boolean m7674V1(AbstractC11387u uVar, StringBuilder sb2) {
        if (!m7654e0().contains(EnumC12159e.VISIBILITY)) {
            return false;
        }
        if (m7652f0()) {
            uVar = uVar.mo10150f();
        }
        if (!m7624s0() && C9971q.m14638b(uVar, C11373t.f25306l)) {
            return false;
        }
        sb2.append(m7639l1(uVar.mo10152c()));
        sb2.append(" ");
        return true;
    }

    /* renamed from: W0 */
    private final void m7672W0(AbstractC11330i iVar, StringBuilder sb2) {
        List<AbstractC11319f1> r = iVar.mo6109r();
        C9971q.m14634f(r, "classifier.declaredTypeParameters");
        List<AbstractC11319f1> parameters = iVar.mo6111k().getParameters();
        C9971q.m14634f(parameters, "classifier.typeConstructor.parameters");
        if (m7726E0() && iVar.mo6106y() && parameters.size() > r.size()) {
            sb2.append(" /*captured type parameters: ");
            m7695O1(sb2, parameters.subList(r.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* renamed from: W1 */
    private final void m7671W1(List<? extends AbstractC11319f1> list, StringBuilder sb2) {
        List<AbstractC7267g0> O;
        if (!m7711J0()) {
            ArrayList arrayList = new ArrayList(0);
            for (AbstractC11319f1 f1Var : list) {
                List<AbstractC7267g0> upperBounds = f1Var.getUpperBounds();
                C9971q.m14634f(upperBounds, "typeParameter.upperBounds");
                O = C9914r.m14776O(upperBounds, 1);
                for (AbstractC7267g0 it : O) {
                    StringBuilder sb3 = new StringBuilder();
                    C11142f name = f1Var.getName();
                    C9971q.m14634f(name, "typeParameter.name");
                    sb3.append(mo7616v(name, false));
                    sb3.append(" : ");
                    C9971q.m14634f(it, "it");
                    sb3.append(mo7613w(it));
                    arrayList.add(sb3.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" ");
                sb2.append(m7639l1("where"));
                sb2.append(" ");
                C9914r.m14762c0(arrayList, sb2, ", ", null, null, 0, null, null, 124, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public final void m7669X0(AbstractC11313e eVar, StringBuilder sb2) {
        boolean z;
        AbstractC11309d B;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (eVar.mo6116g() == EnumC11317f.ENUM_ENTRY) {
            z = true;
        } else {
            z = false;
        }
        if (!m7607y0()) {
            m7675V0(this, sb2, eVar, null, 2, null);
            List<AbstractC11396x0> W = eVar.mo6168W();
            C9971q.m14634f(W, "klass.contextReceivers");
            m7655d1(W, sb2);
            if (!z) {
                AbstractC11387u visibility = eVar.getVisibility();
                C9971q.m14634f(visibility, "klass.visibility");
                m7674V1(visibility, sb2);
            }
            if (!(eVar.mo6116g() == EnumC11317f.INTERFACE && eVar.mo6108s() == EnumC11314e0.ABSTRACT) && (!eVar.mo6116g().m10214b() || eVar.mo6108s() != EnumC11314e0.FINAL)) {
                EnumC11314e0 s = eVar.mo6108s();
                C9971q.m14634f(s, "klass.modality");
                m7631p1(s, sb2, m7702M0(eVar));
            }
            m7635n1(eVar, sb2);
            if (!m7654e0().contains(EnumC12159e.INNER) || !eVar.mo6106y()) {
                z2 = false;
            } else {
                z2 = true;
            }
            m7625r1(sb2, z2, "inner");
            if (!m7654e0().contains(EnumC12159e.DATA) || !eVar.mo6127I0()) {
                z3 = false;
            } else {
                z3 = true;
            }
            m7625r1(sb2, z3, "data");
            if (!m7654e0().contains(EnumC12159e.INLINE) || !eVar.isInline()) {
                z4 = false;
            } else {
                z4 = true;
            }
            m7625r1(sb2, z4, "inline");
            if (!m7654e0().contains(EnumC12159e.VALUE) || !eVar.mo6115g0()) {
                z5 = false;
            } else {
                z5 = true;
            }
            m7625r1(sb2, z5, "value");
            if (!m7654e0().contains(EnumC12159e.FUN) || !eVar.mo6118b0()) {
                z6 = false;
            } else {
                z6 = true;
            }
            m7625r1(sb2, z6, "fun");
            m7666Y0(eVar, sb2);
        }
        if (!C12661e.m6030x(eVar)) {
            if (!m7607y0()) {
                m7722F1(sb2);
            }
            m7623s1(eVar, sb2, true);
        } else {
            m7661a1(eVar, sb2);
        }
        if (!z) {
            List<AbstractC11319f1> r = eVar.mo6109r();
            C9971q.m14634f(r, "klass.declaredTypeParameters");
            m7692P1(r, sb2, false);
            m7672W0(eVar, sb2);
            if (!eVar.mo6116g().m10214b() && m7682T() && (B = eVar.mo6129B()) != null) {
                sb2.append(" ");
                m7675V0(this, sb2, B, null, 2, null);
                AbstractC11387u visibility2 = B.getVisibility();
                C9971q.m14634f(visibility2, "primaryConstructor.visibility");
                m7674V1(visibility2, sb2);
                sb2.append(m7639l1("constructor"));
                List<AbstractC11335j1> i = B.mo6242i();
                C9971q.m14634f(i, "primaryConstructor.valueParameters");
                m7680T1(i, B.mo57d0(), sb2);
            }
            m7719G1(eVar, sb2);
            m7671W1(r, sb2);
        }
    }

    /* renamed from: X1 */
    private final boolean m7668X1(AbstractC7267g0 g0Var) {
        boolean z;
        if (!C10419g.m13437o(g0Var)) {
            return false;
        }
        List<AbstractC7290k1> L0 = g0Var.mo5174L0();
        if (!(L0 instanceof Collection) || !L0.isEmpty()) {
            for (AbstractC7290k1 k1Var : L0) {
                if (k1Var.mo22907a()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private final C12151d m7667Y() {
        return (C12151d) this.f27248m.getValue();
    }

    /* renamed from: Y0 */
    private final void m7666Y0(AbstractC11313e eVar, StringBuilder sb2) {
        sb2.append(m7639l1(AbstractC12137c.f27224a.m7745a(eVar)));
    }

    /* renamed from: Y1 */
    private final boolean m7665Y1(boolean z) {
        int i = C12153b.f27252b[m7646i0().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                throw new C11088q();
            }
        } else if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: a1 */
    private final void m7661a1(AbstractC11346m mVar, StringBuilder sb2) {
        if (m7636n0()) {
            if (m7607y0()) {
                sb2.append("companion object");
            }
            m7722F1(sb2);
            AbstractC11346m b = mVar.mo6104b();
            if (b != null) {
                sb2.append("of ");
                C11142f name = b.getName();
                C9971q.m14634f(name, "containingDeclaration.name");
                sb2.append(mo7616v(name, false));
            }
        }
        if (m7726E0() || !C9971q.m14638b(mVar.getName(), C11144h.f24736d)) {
            if (!m7607y0()) {
                m7722F1(sb2);
            }
            C11142f name2 = mVar.getName();
            C9971q.m14634f(name2, "descriptor.name");
            sb2.append(mo7616v(name2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public final String m7659b1(AbstractC13104g<?> gVar) {
        String p0;
        String e0;
        if (gVar instanceof C13099b) {
            e0 = C9914r.m14760e0(((C13099b) gVar).mo4590b(), ", ", "{", "}", 0, null, new C12155e(), 24, null);
            return e0;
        } else if (gVar instanceof C13097a) {
            p0 = C12719v.m5670p0(AbstractC12137c.m7757s(this, ((C13097a) gVar).mo4590b(), null, 2, null), "@");
            return p0;
        } else if (!(gVar instanceof C13122q)) {
            return gVar.toString();
        } else {
            C13122q.AbstractC13124b b = ((C13122q) gVar).mo4590b();
            if (b instanceof C13122q.AbstractC13124b.C13125a) {
                return ((C13122q.AbstractC13124b.C13125a) b).m4561a() + "::class";
            } else if (b instanceof C13122q.AbstractC13124b.C0421b) {
                C13122q.AbstractC13124b.C0421b bVar = (C13122q.AbstractC13124b.C0421b) b;
                String b2 = bVar.m4559b().m10816b().m10803b();
                C9971q.m14634f(b2, "classValue.classId.asSingleFqName().asString()");
                for (int i = 0; i < bVar.m4560a(); i++) {
                    b2 = "kotlin.Array<" + b2 + '>';
                }
                return b2 + "::class";
            } else {
                throw new C11088q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: c1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7657c1(p268og.AbstractC11343l r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305qh.C12151d.m7657c1(og.l, java.lang.StringBuilder):void");
    }

    /* renamed from: d1 */
    private final void m7655d1(List<? extends AbstractC11396x0> list, StringBuilder sb2) {
        int k;
        if (!list.isEmpty()) {
            sb2.append("context(");
            int i = 0;
            for (AbstractC11396x0 x0Var : list) {
                int i2 = i + 1;
                m7678U0(sb2, x0Var, EnumC11669e.RECEIVER);
                AbstractC7267g0 type = x0Var.getType();
                C9971q.m14634f(type, "contextReceiver.type");
                sb2.append(m7649g1(type));
                k = C9906j.m14818k(list);
                if (i == k) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i = i2;
            }
        }
    }

    /* renamed from: e1 */
    private final void m7653e1(StringBuilder sb2, AbstractC7267g0 g0Var) {
        C7306p pVar;
        m7675V0(this, sb2, g0Var, null, 2, null);
        AbstractC7304o0 o0Var = null;
        if (g0Var instanceof C7306p) {
            pVar = (C7306p) g0Var;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            o0Var = pVar.m22991Z0();
        }
        if (C7278i0.m23035a(g0Var)) {
            if (!C9883a.m15086s(g0Var) || !m7642k0()) {
                if (!(g0Var instanceof C8036h) || m7656d0()) {
                    sb2.append(g0Var.mo5172N0().toString());
                } else {
                    sb2.append(((C8036h) g0Var).m20785W0());
                }
                sb2.append(m7710J1(g0Var.mo5174L0()));
            } else {
                sb2.append(m7651f1(C8039k.f17408a.m20762p(g0Var)));
            }
        } else if (g0Var instanceof C7337w0) {
            sb2.append(((C7337w0) g0Var).m23139W0().toString());
        } else if (o0Var instanceof C7337w0) {
            sb2.append(((C7337w0) o0Var).m23139W0().toString());
        } else {
            m7701M1(this, sb2, g0Var, null, 2, null);
        }
        if (g0Var.mo5171O0()) {
            sb2.append("?");
        }
        if (C7321s0.m22955c(g0Var)) {
            sb2.append(" & Any");
        }
    }

    /* renamed from: f1 */
    private final String m7651f1(String str) {
        int i = C12153b.f27251a[m7604z0().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return "<font color=red><b>" + str + "</b></font>";
        }
        throw new C11088q();
    }

    /* renamed from: g1 */
    private final String m7649g1(AbstractC7267g0 g0Var) {
        String w = mo7613w(g0Var);
        if (!m7668X1(g0Var) || C7322s1.m22935l(g0Var)) {
            return w;
        }
        return '(' + w + ')';
    }

    /* renamed from: h1 */
    private final String m7647h1(List<C11142f> list) {
        return m7697O(C12175n.m7502c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public final void m7645i1(AbstractC11397y yVar, StringBuilder sb2) {
        String str;
        if (!m7607y0()) {
            if (!m7609x0()) {
                m7675V0(this, sb2, yVar, null, 2, null);
                List<AbstractC11396x0> u0 = yVar.mo6237u0();
                C9971q.m14634f(u0, "function.contextReceiverParameters");
                m7655d1(u0, sb2);
                AbstractC11387u visibility = yVar.getVisibility();
                C9971q.m14634f(visibility, "function.visibility");
                m7674V1(visibility, sb2);
                m7628q1(yVar, sb2);
                if (m7664Z()) {
                    m7635n1(yVar, sb2);
                }
                m7614v1(yVar, sb2);
                if (m7664Z()) {
                    m7684S0(yVar, sb2);
                } else {
                    m7716H1(yVar, sb2);
                }
                m7637m1(yVar, sb2);
                if (m7726E0()) {
                    if (yVar.mo6273A0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (yVar.mo6269F0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(m7639l1("fun"));
            sb2.append(" ");
            List<AbstractC11319f1> typeParameters = yVar.getTypeParameters();
            C9971q.m14634f(typeParameters, "function.typeParameters");
            m7692P1(typeParameters, sb2, true);
            m7731C1(yVar, sb2);
        }
        m7623s1(yVar, sb2, true);
        List<AbstractC11335j1> i = yVar.mo6242i();
        C9971q.m14634f(i, "function.valueParameters");
        m7680T1(i, yVar.mo57d0(), sb2);
        m7728D1(yVar, sb2);
        AbstractC7267g0 returnType = yVar.getReturnType();
        if (!m7717H0() && (m7732C0() || returnType == null || !AbstractC10420h.m13428B0(returnType))) {
            sb2.append(": ");
            if (returnType == null) {
                str = "[NULL]";
            } else {
                str = mo7613w(returnType);
            }
            sb2.append(str);
        }
        List<AbstractC11319f1> typeParameters2 = yVar.getTypeParameters();
        C9971q.m14634f(typeParameters2, "function.typeParameters");
        m7671W1(typeParameters2, sb2);
    }

    /* renamed from: j1 */
    private final void m7643j1(StringBuilder sb2, AbstractC7267g0 g0Var) {
        boolean z;
        boolean z2;
        C11142f fVar;
        boolean z3;
        char X0;
        int T;
        int T2;
        int k;
        Object g0;
        int length = sb2.length();
        m7675V0(m7667Y(), sb2, g0Var, null, 2, null);
        if (sb2.length() != length) {
            z = true;
        } else {
            z = false;
        }
        AbstractC7267g0 j = C10419g.m13442j(g0Var);
        List<AbstractC7267g0> e = C10419g.m13447e(g0Var);
        if (!e.isEmpty()) {
            sb2.append("context(");
            k = C9906j.m14818k(e);
            for (AbstractC7267g0 g0Var2 : e.subList(0, k)) {
                m7620t1(sb2, g0Var2);
                sb2.append(", ");
            }
            g0 = C9914r.m14758g0(e);
            m7620t1(sb2, (AbstractC7267g0) g0);
            sb2.append(") ");
        }
        boolean q = C10419g.m13435q(g0Var);
        boolean O0 = g0Var.mo5171O0();
        if (O0 || (z && j != null)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (q) {
                sb2.insert(length, '(');
            } else {
                if (z) {
                    X0 = C12724x.m5655X0(sb2);
                    C12690b.m5868c(X0);
                    T = C12719v.m5695T(sb2);
                    if (sb2.charAt(T - 1) != ')') {
                        T2 = C12719v.m5695T(sb2);
                        sb2.insert(T2, "()");
                    }
                }
                sb2.append("(");
            }
        }
        m7625r1(sb2, q, "suspend");
        if (j != null) {
            if ((!m7668X1(j) || j.mo5171O0()) && !m7705L0(j)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                sb2.append("(");
            }
            m7620t1(sb2, j);
            if (z3) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!C10419g.m13439m(g0Var) || g0Var.mo5174L0().size() > 1) {
            int i = 0;
            for (AbstractC7290k1 k1Var : C10419g.m13440l(g0Var)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb2.append(", ");
                }
                if (m7644j0()) {
                    AbstractC7267g0 type = k1Var.getType();
                    C9971q.m14634f(type, "typeProjection.type");
                    fVar = C10419g.m13448d(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb2.append(mo7616v(fVar, false));
                    sb2.append(": ");
                }
                sb2.append(mo7610x(k1Var));
                i = i2;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(m7700N());
        sb2.append(" ");
        m7620t1(sb2, C10419g.m13441k(g0Var));
        if (z2) {
            sb2.append(")");
        }
        if (O0) {
            sb2.append("?");
        }
    }

    /* renamed from: k1 */
    private final void m7641k1(AbstractC11342k1 k1Var, StringBuilder sb2) {
        AbstractC13104g<?> k0;
        if (m7658c0() && (k0 = k1Var.mo6275k0()) != null) {
            sb2.append(" = ");
            sb2.append(m7697O(m7659b1(k0)));
        }
    }

    /* renamed from: l1 */
    private final String m7639l1(String str) {
        int i = C12153b.f27251a[m7604z0().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new C11088q();
        } else if (m7685S()) {
            return str;
        } else {
            return "<b>" + str + "</b>";
        }
    }

    /* renamed from: m1 */
    private final void m7637m1(AbstractC11301b bVar, StringBuilder sb2) {
        if (m7654e0().contains(EnumC12159e.MEMBER_KIND) && m7726E0() && bVar.mo6245g() != AbstractC11301b.EnumC11302a.DECLARATION) {
            sb2.append("/*");
            sb2.append(C11148a.m10720f(bVar.mo6245g().name()));
            sb2.append("*/ ");
        }
    }

    /* renamed from: n1 */
    private final void m7635n1(AbstractC11310d0 d0Var, StringBuilder sb2) {
        boolean z;
        m7625r1(sb2, d0Var.isExternal(), "external");
        boolean z2 = true;
        if (!m7654e0().contains(EnumC12159e.EXPECT) || !d0Var.mo6114h0()) {
            z = false;
        } else {
            z = true;
        }
        m7625r1(sb2, z, "expect");
        if (!m7654e0().contains(EnumC12159e.ACTUAL) || !d0Var.mo6120V()) {
            z2 = false;
        }
        m7625r1(sb2, z2, "actual");
    }

    /* renamed from: p1 */
    private final void m7631p1(EnumC11314e0 e0Var, StringBuilder sb2, EnumC11314e0 e0Var2) {
        if (m7626r0() || e0Var != e0Var2) {
            m7625r1(sb2, m7654e0().contains(EnumC12159e.MODALITY), C11148a.m10720f(e0Var.name()));
        }
    }

    /* renamed from: q1 */
    private final void m7628q1(AbstractC11301b bVar, StringBuilder sb2) {
        if (C12661e.m6057J(bVar) && bVar.mo6108s() == EnumC11314e0.FINAL) {
            return;
        }
        if (m7648h0() != EnumC12169j.RENDER_OVERRIDE || bVar.mo6108s() != EnumC11314e0.OPEN || !m7693P0(bVar)) {
            EnumC11314e0 s = bVar.mo6108s();
            C9971q.m14634f(s, "callable.modality");
            m7631p1(s, sb2, m7702M0(bVar));
        }
    }

    /* renamed from: r1 */
    private final void m7625r1(StringBuilder sb2, boolean z, String str) {
        if (z) {
            sb2.append(m7639l1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m7623s1(AbstractC11346m mVar, StringBuilder sb2, boolean z) {
        C11142f name = mVar.getName();
        C9971q.m14634f(name, "descriptor.name");
        sb2.append(mo7616v(name, z));
    }

    /* renamed from: t1 */
    private final void m7620t1(StringBuilder sb2, AbstractC7267g0 g0Var) {
        C7222a aVar;
        AbstractC7335v1 Q0 = g0Var.mo22868Q0();
        if (Q0 instanceof C7222a) {
            aVar = (C7222a) Q0;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            m7617u1(sb2, g0Var);
        } else if (m7618u0()) {
            m7617u1(sb2, aVar.m23175E());
        } else {
            m7617u1(sb2, aVar.m23174Z0());
            if (m7615v0()) {
                m7690Q0(sb2, aVar);
            }
        }
    }

    /* renamed from: u1 */
    private final void m7617u1(StringBuilder sb2, AbstractC7267g0 g0Var) {
        if (!(g0Var instanceof AbstractC7342x1) || !mo7537h() || ((AbstractC7342x1) g0Var).mo22866S0()) {
            AbstractC7335v1 Q0 = g0Var.mo22868Q0();
            if (Q0 instanceof AbstractC7223a0) {
                sb2.append(((AbstractC7223a0) Q0).mo22896X0(this, this));
            } else if (Q0 instanceof AbstractC7304o0) {
                m7725E1(sb2, (AbstractC7304o0) Q0);
            }
        } else {
            sb2.append("<Not computed yet>");
        }
    }

    /* renamed from: v1 */
    private final void m7614v1(AbstractC11301b bVar, StringBuilder sb2) {
        if (m7654e0().contains(EnumC12159e.OVERRIDE) && m7693P0(bVar) && m7648h0() != EnumC12169j.RENDER_OPEN) {
            m7625r1(sb2, true, "override");
            if (m7726E0()) {
                sb2.append("/*");
                sb2.append(bVar.mo6249d().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public final void m7611w1(AbstractC11344l0 l0Var, StringBuilder sb2) {
        m7608x1(l0Var.mo6103e(), "package-fragment", sb2);
        if (mo7537h()) {
            sb2.append(" in ");
            m7623s1(l0Var.mo6104b(), sb2, false);
        }
    }

    /* renamed from: x1 */
    private final void m7608x1(C11137c cVar, String str, StringBuilder sb2) {
        boolean z;
        sb2.append(m7639l1(str));
        C11138d j = cVar.m10795j();
        C9971q.m14634f(j, "fqName.toUnsafe()");
        String u = mo7619u(j);
        if (u.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb2.append(" ");
            sb2.append(u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m7606y1(AbstractC11368q0 q0Var, StringBuilder sb2) {
        m7608x1(q0Var.mo6182e(), "package", sb2);
        if (mo7537h()) {
            sb2.append(" in context of ");
            m7623s1(q0Var.mo6179z0(), sb2, false);
        }
    }

    /* renamed from: z1 */
    private final void m7603z1(StringBuilder sb2, C11372s0 s0Var) {
        C11372s0 c = s0Var.m10176c();
        if (c != null) {
            m7603z1(sb2, c);
            sb2.append('.');
            C11142f name = s0Var.m10177b().getName();
            C9971q.m14634f(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(mo7616v(name, false));
        } else {
            AbstractC7268g1 k = s0Var.m10177b().mo6111k();
            C9971q.m14634f(k, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(m7707K1(k));
        }
        sb2.append(m7710J1(s0Var.m10178a()));
    }

    /* renamed from: A0 */
    public Function1<AbstractC7267g0, AbstractC7267g0> m7738A0() {
        return this.f27247l.m7550a0();
    }

    /* renamed from: B0 */
    public boolean m7735B0() {
        return this.f27247l.m7548b0();
    }

    /* renamed from: C0 */
    public boolean m7732C0() {
        return this.f27247l.m7546c0();
    }

    /* renamed from: D0 */
    public AbstractC12137c.AbstractC12149l m7729D0() {
        return this.f27247l.m7544d0();
    }

    /* renamed from: E0 */
    public boolean m7726E0() {
        return this.f27247l.m7542e0();
    }

    /* renamed from: F0 */
    public boolean m7723F0() {
        return this.f27247l.m7540f0();
    }

    /* renamed from: G0 */
    public boolean m7720G0() {
        return this.f27247l.m7538g0();
    }

    /* renamed from: H0 */
    public boolean m7717H0() {
        return this.f27247l.m7536h0();
    }

    /* renamed from: I0 */
    public boolean m7714I0() {
        return this.f27247l.m7534i0();
    }

    /* renamed from: J0 */
    public boolean m7711J0() {
        return this.f27247l.m7532j0();
    }

    /* renamed from: J1 */
    public String m7710J1(List<? extends AbstractC7290k1> typeArguments) {
        C9971q.m14633g(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m7696O0());
        m7703M(sb2, typeArguments);
        sb2.append(m7708K0());
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: K1 */
    public String m7707K1(AbstractC7268g1 typeConstructor) {
        boolean z;
        C9971q.m14633g(typeConstructor, "typeConstructor");
        AbstractC11326h p = typeConstructor.mo4565p();
        boolean z2 = true;
        if (p instanceof AbstractC11319f1) {
            z = true;
        } else {
            z = p instanceof AbstractC11313e;
        }
        if (!z) {
            z2 = p instanceof AbstractC11316e1;
        }
        if (z2) {
            return m7663Z0(p);
        }
        if (p != null) {
            throw new IllegalStateException(("Unexpected classifier: " + p.getClass()).toString());
        } else if (typeConstructor instanceof C7245f0) {
            return ((C7245f0) typeConstructor).m23106f(C12158h.f27259k);
        } else {
            return typeConstructor.toString();
        }
    }

    /* renamed from: P */
    public boolean m7694P() {
        return this.f27247l.m7521r();
    }

    /* renamed from: Q */
    public boolean m7691Q() {
        return this.f27247l.m7520s();
    }

    /* renamed from: R */
    public Function1<AbstractC11666c, Boolean> m7688R() {
        return this.f27247l.m7519t();
    }

    /* renamed from: S */
    public boolean m7685S() {
        return this.f27247l.m7518u();
    }

    /* renamed from: T */
    public boolean m7682T() {
        return this.f27247l.m7517v();
    }

    /* renamed from: U */
    public AbstractC12134b m7679U() {
        return this.f27247l.m7516w();
    }

    /* renamed from: V */
    public Function1<AbstractC11335j1, String> m7676V() {
        return this.f27247l.m7515x();
    }

    /* renamed from: W */
    public boolean m7673W() {
        return this.f27247l.m7514y();
    }

    /* renamed from: X */
    public Set<C11137c> m7670X() {
        return this.f27247l.m7513z();
    }

    /* renamed from: Z */
    public boolean m7664Z() {
        return this.f27247l.m7577A();
    }

    /* renamed from: Z0 */
    public String m7663Z0(AbstractC11326h klass) {
        C9971q.m14633g(klass, "klass");
        if (C8039k.m20765m(klass)) {
            return klass.mo6111k().toString();
        }
        return m7679U().mo7760a(klass, this);
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: a */
    public void mo7551a(EnumC12170k kVar) {
        C9971q.m14633g(kVar, "<set-?>");
        this.f27247l.mo7551a(kVar);
    }

    /* renamed from: a0 */
    public boolean m7662a0() {
        return this.f27247l.m7576B();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: b */
    public void mo7549b(boolean z) {
        this.f27247l.mo7549b(z);
    }

    /* renamed from: b0 */
    public boolean m7660b0() {
        return this.f27247l.m7575C();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: c */
    public void mo7547c(boolean z) {
        this.f27247l.mo7547c(z);
    }

    /* renamed from: c0 */
    public boolean m7658c0() {
        return this.f27247l.m7574D();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: d */
    public boolean mo7545d() {
        return this.f27247l.mo7545d();
    }

    /* renamed from: d0 */
    public boolean m7656d0() {
        return this.f27247l.m7573E();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: e */
    public void mo7543e(boolean z) {
        this.f27247l.mo7543e(z);
    }

    /* renamed from: e0 */
    public Set<EnumC12159e> m7654e0() {
        return this.f27247l.m7572F();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: f */
    public void mo7541f(boolean z) {
        this.f27247l.mo7541f(z);
    }

    /* renamed from: f0 */
    public boolean m7652f0() {
        return this.f27247l.m7571G();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: g */
    public Set<C11137c> mo7539g() {
        return this.f27247l.mo7539g();
    }

    /* renamed from: g0 */
    public final C12163g m7650g0() {
        return this.f27247l;
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: h */
    public boolean mo7537h() {
        return this.f27247l.mo7537h();
    }

    /* renamed from: h0 */
    public EnumC12169j m7648h0() {
        return this.f27247l.m7570H();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: i */
    public EnumC12133a mo7535i() {
        return this.f27247l.mo7535i();
    }

    /* renamed from: i0 */
    public EnumC12170k m7646i0() {
        return this.f27247l.m7569I();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: j */
    public void mo7533j(Set<C11137c> set) {
        C9971q.m14633g(set, "<set-?>");
        this.f27247l.mo7533j(set);
    }

    /* renamed from: j0 */
    public boolean m7644j0() {
        return this.f27247l.m7568J();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: k */
    public void mo7531k(EnumC12172m mVar) {
        C9971q.m14633g(mVar, "<set-?>");
        this.f27247l.mo7531k(mVar);
    }

    /* renamed from: k0 */
    public boolean m7642k0() {
        return this.f27247l.m7567K();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: l */
    public void mo7529l(Set<? extends EnumC12159e> set) {
        C9971q.m14633g(set, "<set-?>");
        this.f27247l.mo7529l(set);
    }

    /* renamed from: l0 */
    public EnumC12171l m7640l0() {
        return this.f27247l.m7566L();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: m */
    public void mo7527m(boolean z) {
        this.f27247l.mo7527m(z);
    }

    /* renamed from: m0 */
    public boolean m7638m0() {
        return this.f27247l.m7565M();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: n */
    public void mo7525n(boolean z) {
        this.f27247l.mo7525n(z);
    }

    /* renamed from: n0 */
    public boolean m7636n0() {
        return this.f27247l.m7564N();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: o */
    public void mo7524o(AbstractC12134b bVar) {
        C9971q.m14633g(bVar, "<set-?>");
        this.f27247l.mo7524o(bVar);
    }

    /* renamed from: o0 */
    public boolean m7634o0() {
        return this.f27247l.m7563O();
    }

    /* renamed from: o1 */
    public String m7633o1(String message) {
        C9971q.m14633g(message, "message");
        int i = C12153b.f27251a[m7604z0().ordinal()];
        if (i == 1) {
            return message;
        }
        if (i == 2) {
            return "<i>" + message + "</i>";
        }
        throw new C11088q();
    }

    @Override // p305qh.AbstractC12161f
    /* renamed from: p */
    public void mo7523p(boolean z) {
        this.f27247l.mo7523p(z);
    }

    /* renamed from: p0 */
    public boolean m7632p0() {
        return this.f27247l.m7562P();
    }

    @Override // p305qh.AbstractC12137c
    /* renamed from: q */
    public String mo7630q(AbstractC11346m declarationDescriptor) {
        C9971q.m14633g(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.mo6105C0(new C12152a(), sb2);
        if (m7723F0()) {
            m7706L(sb2, declarationDescriptor);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: q0 */
    public boolean m7629q0() {
        return this.f27247l.m7561Q();
    }

    @Override // p305qh.AbstractC12137c
    /* renamed from: r */
    public String mo7627r(AbstractC11666c annotation, EnumC11669e eVar) {
        C9971q.m14633g(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.m9053b() + ':');
        }
        AbstractC7267g0 type = annotation.getType();
        sb2.append(mo7613w(type));
        if (m7662a0()) {
            List<String> T0 = m7681T0(annotation);
            if (m7660b0() || (!T0.isEmpty())) {
                C9914r.m14762c0(T0, sb2, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (m7726E0() && (C7278i0.m23035a(type) || (type.mo5172N0().mo4565p() instanceof C11337k0.C11339b))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: r0 */
    public boolean m7626r0() {
        return this.f27247l.m7560R();
    }

    /* renamed from: s0 */
    public boolean m7624s0() {
        return this.f27247l.m7559S();
    }

    @Override // p305qh.AbstractC12137c
    /* renamed from: t */
    public String mo7622t(String lowerRendered, String upperRendered, AbstractC10420h builtIns) {
        String Q0;
        String Q02;
        boolean H;
        C9971q.m14633g(lowerRendered, "lowerRendered");
        C9971q.m14633g(upperRendered, "upperRendered");
        C9971q.m14633g(builtIns, "builtIns");
        if (C12175n.m7499f(lowerRendered, upperRendered)) {
            H = C12718u.m5736H(upperRendered, "(", false, 2, null);
            if (H) {
                return '(' + lowerRendered + ")!";
            }
            return lowerRendered + '!';
        }
        AbstractC12134b U = m7679U();
        AbstractC11313e w = builtIns.m13360w();
        C9971q.m14634f(w, "builtIns.collection");
        Q0 = C12719v.m5700Q0(U.mo7760a(w, this), "Collection", null, 2, null);
        String d = C12175n.m7501d(lowerRendered, Q0 + "Mutable", upperRendered, Q0, Q0 + "(Mutable)");
        if (d != null) {
            return d;
        }
        String d2 = C12175n.m7501d(lowerRendered, Q0 + "MutableMap.MutableEntry", upperRendered, Q0 + "Map.Entry", Q0 + "(Mutable)Map.(Mutable)Entry");
        if (d2 != null) {
            return d2;
        }
        AbstractC12134b U2 = m7679U();
        AbstractC11313e j = builtIns.m13385j();
        C9971q.m14634f(j, "builtIns.array");
        Q02 = C12719v.m5700Q0(U2.mo7760a(j, this), "Array", null, 2, null);
        String d3 = C12175n.m7501d(lowerRendered, Q02 + m7697O("Array<"), upperRendered, Q02 + m7697O("Array<out "), Q02 + m7697O("Array<(out) "));
        if (d3 != null) {
            return d3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    /* renamed from: t0 */
    public boolean m7621t0() {
        return this.f27247l.m7558T();
    }

    @Override // p305qh.AbstractC12137c
    /* renamed from: u */
    public String mo7619u(C11138d fqName) {
        C9971q.m14633g(fqName, "fqName");
        List<C11142f> h = fqName.m10786h();
        C9971q.m14634f(h, "fqName.pathSegments()");
        return m7647h1(h);
    }

    /* renamed from: u0 */
    public boolean m7618u0() {
        return this.f27247l.m7557U();
    }

    @Override // p305qh.AbstractC12137c
    /* renamed from: v */
    public String mo7616v(C11142f name, boolean z) {
        C9971q.m14633g(name, "name");
        String O = m7697O(C12175n.m7503b(name));
        if (!m7685S() || m7604z0() != EnumC12172m.HTML || !z) {
            return O;
        }
        return "<b>" + O + "</b>";
    }

    /* renamed from: v0 */
    public boolean m7615v0() {
        return this.f27247l.m7556V();
    }

    @Override // p305qh.AbstractC12137c
    /* renamed from: w */
    public String mo7613w(AbstractC7267g0 type) {
        C9971q.m14633g(type, "type");
        StringBuilder sb2 = new StringBuilder();
        m7620t1(sb2, m7738A0().invoke(type));
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: w0 */
    public boolean m7612w0() {
        return this.f27247l.m7555W();
    }

    @Override // p305qh.AbstractC12137c
    /* renamed from: x */
    public String mo7610x(AbstractC7290k1 typeProjection) {
        List<? extends AbstractC7290k1> d;
        C9971q.m14633g(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        d = C9905i.m14825d(typeProjection);
        m7703M(sb2, d);
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: x0 */
    public boolean m7609x0() {
        return this.f27247l.m7554X();
    }

    /* renamed from: y0 */
    public boolean m7607y0() {
        return this.f27247l.m7553Y();
    }

    /* renamed from: z0 */
    public EnumC12172m m7604z0() {
        return this.f27247l.m7552Z();
    }
}
