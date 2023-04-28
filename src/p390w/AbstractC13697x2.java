package p390w;

import androidx.camera.core.AbstractC1807f0;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1921t;
import p390w.AbstractC13662r0;
import p390w.C13619k2;
import p390w.C13639n0;
import p451z.AbstractC14506i;
import p451z.AbstractC14510m;

/* renamed from: w.x2 */
/* loaded from: classes.dex */
public interface AbstractC13697x2<T extends AbstractC1948w2> extends AbstractC14506i<T>, AbstractC14510m, AbstractC13607i1 {

    /* renamed from: l */
    public static final AbstractC13662r0.AbstractC13663a<C13619k2> f30585l = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.useCase.defaultSessionConfig", C13619k2.class);

    /* renamed from: m */
    public static final AbstractC13662r0.AbstractC13663a<C13639n0> f30586m = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.useCase.defaultCaptureConfig", C13639n0.class);

    /* renamed from: n */
    public static final AbstractC13662r0.AbstractC13663a<C13619k2.AbstractC13623d> f30587n = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.useCase.sessionConfigUnpacker", C13619k2.AbstractC13623d.class);

    /* renamed from: o */
    public static final AbstractC13662r0.AbstractC13663a<C13639n0.AbstractC13641b> f30588o = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.useCase.captureConfigUnpacker", C13639n0.AbstractC13641b.class);

    /* renamed from: p */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30589p = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: q */
    public static final AbstractC13662r0.AbstractC13663a<C1921t> f30590q = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.useCase.cameraSelector", C1921t.class);

    /* renamed from: w.x2$a */
    /* loaded from: classes.dex */
    public interface AbstractC13698a<T extends AbstractC1948w2, C extends AbstractC13697x2<T>, B> extends AbstractC1807f0<T> {
        /* renamed from: d */
        C mo2998d();
    }

    /* renamed from: B */
    C13619k2 mo2986B(C13619k2 k2Var);

    /* renamed from: C */
    C1921t mo2985C(C1921t tVar);

    /* renamed from: k */
    C13619k2.AbstractC13623d mo2968k(C13619k2.AbstractC13623d dVar);

    /* renamed from: o */
    C13639n0 mo2966o(C13639n0 n0Var);

    /* renamed from: p */
    C13639n0.AbstractC13641b mo2965p(C13639n0.AbstractC13641b bVar);

    /* renamed from: r */
    int mo2963r(int i);
}
