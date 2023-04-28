package p288q;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1921t;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import p308r.C12267f0;
import p390w.AbstractC13662r0;
import p390w.AbstractC13689w0;
import p390w.AbstractC13697x2;
import p390w.C13603h1;
import p390w.C13604h2;
import p390w.C13619k2;
import p390w.C13639n0;
import p390w.C13642n1;
import p390w.C13693w2;
import p390w.C13696x1;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;
import p451z.C14505h;
import p451z.C14509l;

/* renamed from: q.k2 */
/* loaded from: classes.dex */
class C11859k2 {

    /* renamed from: a */
    private AbstractC13689w0 f26481a;

    /* renamed from: b */
    private final C13619k2 f26482b;

    /* renamed from: q.k2$a */
    /* loaded from: classes.dex */
    class C11860a implements AbstractC14182c<Void> {

        /* renamed from: a */
        final /* synthetic */ Surface f26483a;

        /* renamed from: b */
        final /* synthetic */ SurfaceTexture f26484b;

        C11860a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f26483a = surface;
            this.f26484b = surfaceTexture;
        }

        /* renamed from: b */
        public void mo1412a(Void r1) {
            this.f26483a.release();
            this.f26484b.release();
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    /* renamed from: q.k2$b */
    /* loaded from: classes.dex */
    private static class C11861b implements AbstractC13697x2<AbstractC1948w2> {

        /* renamed from: w */
        private final AbstractC13662r0 f26486w;

        C11861b() {
            C13696x1 J = C13696x1.m3002J();
            J.mo2999u(AbstractC13697x2.f30587n, new C11815f1());
            this.f26486w = J;
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

        @Override // p390w.AbstractC13608i2
        /* renamed from: i */
        public AbstractC13662r0 mo2970i() {
            return this.f26486w;
        }

        @Override // p390w.AbstractC13607i1
        /* renamed from: j */
        public /* synthetic */ int mo2969j() {
            return C13603h1.m3257a(this);
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

        @Override // p390w.AbstractC13697x2
        /* renamed from: r */
        public /* synthetic */ int mo2963r(int i) {
            return C13693w2.m3004f(this, i);
        }

        @Override // p390w.AbstractC13662r0
        /* renamed from: x */
        public /* synthetic */ Set mo2959x(AbstractC13662r0.AbstractC13663a aVar) {
            return C13604h2.m3253d(this, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11859k2(C12267f0 f0Var) {
        C11861b bVar = new C11861b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size c = m8444c(f0Var);
        C1915r1.m39527a("MeteringRepeating", "MerteringSession SurfaceTexture size: " + c);
        surfaceTexture.setDefaultBufferSize(c.getWidth(), c.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C13619k2.C13621b o = C13619k2.C13621b.m3183o(bVar);
        o.m3180r(1);
        C13642n1 n1Var = new C13642n1(surface);
        this.f26481a = n1Var;
        C14186f.m1427b(n1Var.m3017i(), new C11860a(surface, surfaceTexture), C13905a.m2339a());
        o.m3187k(this.f26481a);
        this.f26482b = o.m3185m();
    }

    /* renamed from: c */
    private Size m8444c(C12267f0 f0Var) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) f0Var.m7252a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C1915r1.m39525c("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(34);
        if (outputSizes != null) {
            return (Size) Collections.min(Arrays.asList(outputSizes), new Comparator() { // from class: q.j2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f;
                    f = C11859k2.m8441f((Size) obj, (Size) obj2);
                    return f;
                }
            });
        }
        C1915r1.m39525c("MeteringRepeating", "Can not get output size list.");
        return new Size(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ int m8441f(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m8445b() {
        C1915r1.m39527a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC13689w0 w0Var = this.f26481a;
        if (w0Var != null) {
            w0Var.m3023c();
        }
        this.f26481a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m8443d() {
        return "MeteringRepeating";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C13619k2 m8442e() {
        return this.f26482b;
    }
}
