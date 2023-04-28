package p390w;

import android.util.Size;
import androidx.camera.core.AbstractC1895n1;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1813g1;
import androidx.camera.core.C1921t;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p390w.AbstractC13662r0;
import p390w.C13619k2;
import p390w.C13639n0;
import p451z.AbstractC14504g;
import p451z.C14505h;
import p451z.C14509l;

/* renamed from: w.f1 */
/* loaded from: classes.dex */
public final class C13594f1 implements AbstractC13697x2<C1813g1>, AbstractC13617k1, AbstractC14504g {

    /* renamed from: F */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f39409F;

    /* renamed from: G */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f39410G;

    /* renamed from: x */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30387x;

    /* renamed from: y */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30388y;

    /* renamed from: w */
    private final C13582c2 f30390w;

    /* renamed from: z */
    public static final AbstractC13662r0.AbstractC13663a<AbstractC13634m0> f30389z = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.captureBundle", AbstractC13634m0.class);

    /* renamed from: A */
    public static final AbstractC13662r0.AbstractC13663a<AbstractC13645o0> f39404A = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.captureProcessor", AbstractC13645o0.class);

    /* renamed from: B */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f39405B = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.bufferFormat", Integer.class);

    /* renamed from: C */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f39406C = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.maxCaptureStages", Integer.class);

    /* renamed from: D */
    public static final AbstractC13662r0.AbstractC13663a<AbstractC1895n1> f39407D = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.imageReaderProxyProvider", AbstractC1895n1.class);

    /* renamed from: E */
    public static final AbstractC13662r0.AbstractC13663a<Boolean> f39408E = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);

    static {
        Class cls = Integer.TYPE;
        f30387x = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.captureMode", cls);
        f30388y = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.flashMode", cls);
        f39409F = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.flashType", cls);
        f39410G = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public C13594f1(C13582c2 c2Var) {
        this.f30390w = c2Var;
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: A */
    public /* synthetic */ Object mo2987A(AbstractC13662r0.AbstractC13663a aVar, AbstractC13662r0.EnumC13665c cVar) {
        return C13604h2.m3249h(this, aVar, cVar);
    }

    @Override // p390w.AbstractC13697x2
    /* renamed from: B */
    public /* synthetic */ C13619k2 mo2986B(C13619k2 k2Var) {
        return C13693w2.m3006d(this, k2Var);
    }

    @Override // p390w.AbstractC13697x2
    /* renamed from: C */
    public /* synthetic */ C1921t mo2985C(C1921t tVar) {
        return C13693w2.m3009a(this, tVar);
    }

    @Override // p451z.AbstractC14510m
    /* renamed from: D */
    public /* synthetic */ AbstractC1948w2.AbstractC1950b mo300D(AbstractC1948w2.AbstractC1950b bVar) {
        return C14509l.m301a(this, bVar);
    }

    /* renamed from: F */
    public AbstractC13634m0 m3281F(AbstractC13634m0 m0Var) {
        return (AbstractC13634m0) mo2977a(f30389z, m0Var);
    }

    /* renamed from: G */
    public int m3280G() {
        return ((Integer) mo2976b(f30387x)).intValue();
    }

    /* renamed from: H */
    public AbstractC13645o0 m3279H(AbstractC13645o0 o0Var) {
        return (AbstractC13645o0) mo2977a(f39404A, o0Var);
    }

    /* renamed from: I */
    public int m3278I(int i) {
        return ((Integer) mo2977a(f30388y, Integer.valueOf(i))).intValue();
    }

    /* renamed from: J */
    public int m3277J(int i) {
        return ((Integer) mo2977a(f39409F, Integer.valueOf(i))).intValue();
    }

    /* renamed from: K */
    public AbstractC1895n1 m3276K() {
        return (AbstractC1895n1) mo2977a(f39407D, null);
    }

    /* renamed from: L */
    public Executor m3275L(Executor executor) {
        return (Executor) mo2977a(AbstractC14504g.f32898r, executor);
    }

    /* renamed from: M */
    public int m3274M() {
        return ((Integer) mo2976b(f39410G)).intValue();
    }

    /* renamed from: N */
    public int m3273N(int i) {
        return ((Integer) mo2977a(f39406C, Integer.valueOf(i))).intValue();
    }

    /* renamed from: O */
    public boolean m3272O() {
        return mo2973e(f30387x);
    }

    /* renamed from: P */
    public boolean m3271P() {
        return ((Boolean) mo2977a(f39408E, Boolean.FALSE)).booleanValue();
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: a */
    public /* synthetic */ Object mo2977a(AbstractC13662r0.AbstractC13663a aVar, Object obj) {
        return C13604h2.m3250g(this, aVar, obj);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: b */
    public /* synthetic */ Object mo2976b(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3251f(this, aVar);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: c */
    public /* synthetic */ Set mo2975c() {
        return C13604h2.m3252e(this);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: d */
    public /* synthetic */ AbstractC13662r0.EnumC13665c mo2974d(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3254c(this, aVar);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: e */
    public /* synthetic */ boolean mo2973e(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3256a(this, aVar);
    }

    @Override // p390w.AbstractC13617k1
    /* renamed from: f */
    public /* synthetic */ Size mo2972f(Size size) {
        return C13613j1.m3218b(this, size);
    }

    @Override // p390w.AbstractC13617k1
    /* renamed from: h */
    public /* synthetic */ List mo2971h(List list) {
        return C13613j1.m3217c(this, list);
    }

    @Override // p390w.AbstractC13608i2
    /* renamed from: i */
    public AbstractC13662r0 mo2970i() {
        return this.f30390w;
    }

    @Override // p390w.AbstractC13607i1
    /* renamed from: j */
    public int mo2969j() {
        return ((Integer) mo2976b(AbstractC13607i1.f30410e)).intValue();
    }

    @Override // p390w.AbstractC13697x2
    /* renamed from: k */
    public /* synthetic */ C13619k2.AbstractC13623d mo2968k(C13619k2.AbstractC13623d dVar) {
        return C13693w2.m3005e(this, dVar);
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: l */
    public /* synthetic */ void mo2967l(String str, AbstractC13662r0.AbstractC13664b bVar) {
        C13604h2.m3255b(this, str, bVar);
    }

    @Override // p451z.AbstractC14506i
    /* renamed from: m */
    public /* synthetic */ String mo303m(String str) {
        return C14505h.m304a(this, str);
    }

    @Override // p390w.AbstractC13697x2
    /* renamed from: o */
    public /* synthetic */ C13639n0 mo2966o(C13639n0 n0Var) {
        return C13693w2.m3007c(this, n0Var);
    }

    @Override // p390w.AbstractC13697x2
    /* renamed from: p */
    public /* synthetic */ C13639n0.AbstractC13641b mo2965p(C13639n0.AbstractC13641b bVar) {
        return C13693w2.m3008b(this, bVar);
    }

    @Override // p390w.AbstractC13617k1
    /* renamed from: q */
    public /* synthetic */ boolean mo2964q() {
        return C13613j1.m3213g(this);
    }

    @Override // p390w.AbstractC13697x2
    /* renamed from: r */
    public /* synthetic */ int mo2963r(int i) {
        return C13693w2.m3004f(this, i);
    }

    @Override // p390w.AbstractC13617k1
    /* renamed from: s */
    public /* synthetic */ int mo2962s() {
        return C13613j1.m3216d(this);
    }

    @Override // p390w.AbstractC13617k1
    /* renamed from: t */
    public /* synthetic */ int mo2961t(int i) {
        return C13613j1.m3214f(this, i);
    }

    @Override // p390w.AbstractC13617k1
    /* renamed from: w */
    public /* synthetic */ Size mo2960w(Size size) {
        return C13613j1.m3219a(this, size);
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: x */
    public /* synthetic */ Set mo2959x(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3253d(this, aVar);
    }

    @Override // p390w.AbstractC13617k1
    /* renamed from: y */
    public /* synthetic */ Size mo2958y(Size size) {
        return C13613j1.m3215e(this, size);
    }
}
