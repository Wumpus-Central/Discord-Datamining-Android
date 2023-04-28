package p390w;

import android.util.Size;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1781b3;
import androidx.camera.core.C1921t;
import java.util.List;
import java.util.Set;
import p390w.AbstractC13662r0;
import p390w.C13619k2;
import p390w.C13639n0;
import p451z.AbstractC14508k;
import p451z.C14505h;
import p451z.C14509l;

/* renamed from: w.z2 */
/* loaded from: classes.dex */
public final class C13709z2 implements AbstractC13697x2<C1781b3>, AbstractC13617k1, AbstractC14508k {

    /* renamed from: A */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f39411A;

    /* renamed from: B */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f39412B;

    /* renamed from: C */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f39413C;

    /* renamed from: D */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f39414D;

    /* renamed from: x */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30607x;

    /* renamed from: y */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30608y;

    /* renamed from: z */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30609z;

    /* renamed from: w */
    private final C13582c2 f30610w;

    static {
        Class cls = Integer.TYPE;
        f30607x = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.videoCapture.recordingFrameRate", cls);
        f30608y = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.videoCapture.bitRate", cls);
        f30609z = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.videoCapture.intraFrameInterval", cls);
        f39411A = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.videoCapture.audioBitRate", cls);
        f39412B = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.videoCapture.audioSampleRate", cls);
        f39413C = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.videoCapture.audioChannelCount", cls);
        f39414D = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public C13709z2(C13582c2 c2Var) {
        this.f30610w = c2Var;
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
    public int m2984F() {
        return ((Integer) mo2976b(f39411A)).intValue();
    }

    /* renamed from: G */
    public int m2983G() {
        return ((Integer) mo2976b(f39413C)).intValue();
    }

    /* renamed from: H */
    public int m2982H() {
        return ((Integer) mo2976b(f39414D)).intValue();
    }

    /* renamed from: I */
    public int m2981I() {
        return ((Integer) mo2976b(f39412B)).intValue();
    }

    /* renamed from: J */
    public int m2980J() {
        return ((Integer) mo2976b(f30608y)).intValue();
    }

    /* renamed from: K */
    public int m2979K() {
        return ((Integer) mo2976b(f30609z)).intValue();
    }

    /* renamed from: L */
    public int m2978L() {
        return ((Integer) mo2976b(f30607x)).intValue();
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
        return this.f30610w;
    }

    @Override // p390w.AbstractC13607i1
    /* renamed from: j */
    public int mo2969j() {
        return 34;
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
