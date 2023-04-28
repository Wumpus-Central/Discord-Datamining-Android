package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.AbstractC4795a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.drawable.C4826n;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p007a6.C1271b;
import p115g5.AbstractC7419e;
import p169j4.AbstractC9487a;
import p208l4.C10336a;
import p225m4.C10480a;
import p225m4.C10481b;
import p240n4.AbstractC10709b;
import p240n4.AbstractC10713f;
import p240n4.C10708a;
import p240n4.C10710c;
import p240n4.C10711d;
import p240n4.C10714g;
import p277p4.AbstractC11528a;
import p278p5.AbstractC11564s;
import p313r4.C12386a;
import p333s4.C12783a;
import p361u5.AbstractC13192a;
import p380v5.AbstractC13432c;
import p394w3.C13732e;
import p394w3.C13736i;
import p394w3.C13740j;
import p414x3.C13925a;
import p416x5.C13936c;

/* renamed from: com.facebook.drawee.backends.pipeline.a */
/* loaded from: classes7.dex */
public class C4791a extends AbstractC4795a<CloseableReference<AbstractC13432c>, ImageInfo> {

    /* renamed from: N */
    private static final Class<?> f37127N = C4791a.class;

    /* renamed from: A */
    private final C13732e<AbstractC13192a> f37128A;

    /* renamed from: B */
    private final AbstractC11564s<CacheKey, AbstractC13432c> f37129B;

    /* renamed from: C */
    private CacheKey f37130C;

    /* renamed from: D */
    private Supplier<DataSource<CloseableReference<AbstractC13432c>>> f37131D;

    /* renamed from: E */
    private boolean f37132E;

    /* renamed from: F */
    private C13732e<AbstractC13192a> f37133F;

    /* renamed from: G */
    private C10714g f37134G;

    /* renamed from: H */
    private Set<RequestListener> f37135H;

    /* renamed from: I */
    private AbstractC10709b f37136I;

    /* renamed from: J */
    private C10481b f37137J;

    /* renamed from: K */
    private ImageRequest f37138K;

    /* renamed from: L */
    private ImageRequest[] f37139L;

    /* renamed from: M */
    private ImageRequest f37140M;

    /* renamed from: y */
    private final Resources f7626y;

    /* renamed from: z */
    private final AbstractC13192a f7627z;

    public C4791a(Resources resources, AbstractC11528a aVar, AbstractC13192a aVar2, Executor executor, AbstractC11564s<CacheKey, AbstractC13432c> sVar, C13732e<AbstractC13192a> eVar) {
        super(aVar, executor, null, null);
        this.f7626y = resources;
        this.f7627z = new C10336a(resources, aVar2);
        this.f37128A = eVar;
        this.f37129B = sVar;
    }

    /* renamed from: n0 */
    private void m31949n0(Supplier<DataSource<CloseableReference<AbstractC13432c>>> supplier) {
        this.f37131D = supplier;
        m31945r0(null);
    }

    /* renamed from: q0 */
    private Drawable m31946q0(C13732e<AbstractC13192a> eVar, AbstractC13432c cVar) {
        Drawable a;
        if (eVar == null) {
            return null;
        }
        Iterator<AbstractC13192a> it = eVar.iterator();
        while (it.hasNext()) {
            AbstractC13192a next = it.next();
            if (next.mo4367b(cVar) && (a = next.mo4368a(cVar)) != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: r0 */
    private void m31945r0(AbstractC13432c cVar) {
        if (this.f37132E) {
            if (m31862r() == null) {
                C12386a aVar = new C12386a();
                C12783a aVar2 = new C12783a(aVar);
                this.f37137J = new C10481b();
                m31870j(aVar2);
                m31880Y(aVar);
            }
            if (this.f37136I == null) {
                m31957f0(this.f37137J);
            }
            if (m31862r() instanceof C12386a) {
                m31937z0(cVar, (C12386a) m31862r());
            }
        }
    }

    @Override // com.facebook.drawee.controller.AbstractC4795a
    /* renamed from: N */
    protected void mo31891N(Drawable drawable) {
        if (drawable instanceof AbstractC9487a) {
            ((AbstractC9487a) drawable).mo16155a();
        }
    }

    @Override // com.facebook.drawee.controller.AbstractC4795a, com.facebook.drawee.interfaces.DraweeController
    /* renamed from: e */
    public void mo31694e(DraweeHierarchy draweeHierarchy) {
        super.mo31694e(draweeHierarchy);
        m31945r0(null);
    }

    /* renamed from: f0 */
    public synchronized void m31957f0(AbstractC10709b bVar) {
        AbstractC10709b bVar2 = this.f37136I;
        if (bVar2 instanceof C10708a) {
            ((C10708a) bVar2).m12621b(bVar);
        } else if (bVar2 != null) {
            this.f37136I = new C10708a(bVar2, bVar);
        } else {
            this.f37136I = bVar;
        }
    }

    /* renamed from: g0 */
    public synchronized void m31956g0(RequestListener requestListener) {
        if (this.f37135H == null) {
            this.f37135H = new HashSet();
        }
        this.f37135H.add(requestListener);
    }

    /* renamed from: h0 */
    protected void m31955h0() {
        synchronized (this) {
            this.f37136I = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i0 */
    public Drawable mo31868l(CloseableReference<AbstractC13432c> closeableReference) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("PipelineDraweeController#createDrawable");
            }
            C13740j.m2832i(CloseableReference.m32036R(closeableReference));
            AbstractC13432c C = closeableReference.m32039C();
            m31945r0(C);
            Drawable q0 = m31946q0(this.f37133F, C);
            if (q0 != null) {
                return q0;
            }
            Drawable q02 = m31946q0(this.f37128A, C);
            if (q02 != null) {
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
                return q02;
            }
            Drawable a = this.f7627z.mo4368a(C);
            if (a != null) {
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
                return a;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + C);
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j0 */
    public CloseableReference<AbstractC13432c> mo31866n() {
        CacheKey cacheKey;
        if (C1271b.m41491d()) {
            C1271b.m41494a("PipelineDraweeController#getCachedImage");
        }
        try {
            AbstractC11564s<CacheKey, AbstractC13432c> sVar = this.f37129B;
            if (!(sVar == null || (cacheKey = this.f37130C) == null)) {
                CloseableReference<AbstractC13432c> closeableReference = sVar.get(cacheKey);
                if (closeableReference == null || closeableReference.m32039C().mo3734b().mo3693a()) {
                    if (C1271b.m41491d()) {
                        C1271b.m41493b();
                    }
                    return closeableReference;
                }
                closeableReference.close();
                return null;
            }
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
            return null;
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k0 */
    public int mo31856x(CloseableReference<AbstractC13432c> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.m32038H();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l0 */
    public ImageInfo mo31855y(CloseableReference<AbstractC13432c> closeableReference) {
        C13740j.m2832i(CloseableReference.m32036R(closeableReference));
        return closeableReference.m32039C();
    }

    /* renamed from: m0 */
    public synchronized RequestListener m31950m0() {
        C10710c cVar;
        if (this.f37136I != null) {
            cVar = new C10710c(m31858v(), this.f37136I);
        } else {
            cVar = null;
        }
        Set<RequestListener> set = this.f37135H;
        if (set == null) {
            return cVar;
        }
        C13936c cVar2 = new C13936c(set);
        if (cVar != null) {
            cVar2.m2238a(cVar);
        }
        return cVar2;
    }

    /* renamed from: o0 */
    public void m31948o0(Supplier<DataSource<CloseableReference<AbstractC13432c>>> supplier, String str, CacheKey cacheKey, Object obj, C13732e<AbstractC13192a> eVar, AbstractC10709b bVar) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("PipelineDraweeController#initialize");
        }
        super.m31902C(str, obj);
        m31949n0(supplier);
        this.f37130C = cacheKey;
        m31939x0(eVar);
        m31955h0();
        m31945r0(null);
        m31957f0(bVar);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p0 */
    public synchronized void m31947p0(AbstractC10713f fVar, AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<AbstractC13432c>, ImageInfo> abstractDraweeControllerBuilder, Supplier<Boolean> supplier) {
        C10714g gVar = this.f37134G;
        if (gVar != null) {
            gVar.m12611f();
        }
        if (fVar != null) {
            if (this.f37134G == null) {
                this.f37134G = new C10714g(AwakeTimeSinceBootClock.get(), this, supplier);
            }
            this.f37134G.m12614c(fVar);
            this.f37134G.m12610g(true);
            this.f37134G.m12608i(abstractDraweeControllerBuilder);
        }
        this.f37138K = abstractDraweeControllerBuilder.m31918n();
        this.f37139L = abstractDraweeControllerBuilder.m31919m();
        this.f37140M = abstractDraweeControllerBuilder.m31917o();
    }

    @Override // com.facebook.drawee.controller.AbstractC4795a
    /* renamed from: s */
    protected DataSource<CloseableReference<AbstractC13432c>> mo31861s() {
        if (C1271b.m41491d()) {
            C1271b.m41494a("PipelineDraweeController#getDataSource");
        }
        if (C13925a.m2276v(2)) {
            C13925a.m2274x(f37127N, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        DataSource<CloseableReference<AbstractC13432c>> dataSource = this.f37131D.get();
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return dataSource;
    }

    /* renamed from: s0 */
    public Map<String, Object> mo31896I(ImageInfo imageInfo) {
        if (imageInfo == null) {
            return null;
        }
        return imageInfo.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t0 */
    public void mo31894K(String str, CloseableReference<AbstractC13432c> closeableReference) {
        super.mo31894K(str, closeableReference);
        synchronized (this) {
            AbstractC10709b bVar = this.f37136I;
            if (bVar != null) {
                bVar.mo10505a(str, 6, true, "PipelineDraweeController");
            }
        }
    }

    @Override // com.facebook.drawee.controller.AbstractC4795a
    public String toString() {
        return C13736i.m2846c(this).m2844b("super", super.toString()).m2844b("dataSourceSupplier", this.f37131D).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo31889P(CloseableReference<AbstractC13432c> closeableReference) {
        CloseableReference.m32025t(closeableReference);
    }

    /* renamed from: v0 */
    public synchronized void m31941v0(AbstractC10709b bVar) {
        AbstractC10709b bVar2 = this.f37136I;
        if (bVar2 instanceof C10708a) {
            ((C10708a) bVar2).m12620c(bVar);
            return;
        }
        if (bVar2 == bVar) {
            this.f37136I = null;
        }
    }

    /* renamed from: w0 */
    public synchronized void m31940w0(RequestListener requestListener) {
        Set<RequestListener> set = this.f37135H;
        if (set != null) {
            set.remove(requestListener);
        }
    }

    /* renamed from: x0 */
    public void m31939x0(C13732e<AbstractC13192a> eVar) {
        this.f37133F = eVar;
    }

    /* renamed from: y0 */
    public void m31938y0(boolean z) {
        this.f37132E = z;
    }

    @Override // com.facebook.drawee.controller.AbstractC4795a
    /* renamed from: z */
    protected Uri mo31854z() {
        return AbstractC7419e.m22713a(this.f37138K, this.f37140M, this.f37139L, ImageRequest.REQUEST_TO_URI_FN);
    }

    /* renamed from: z0 */
    protected void m31937z0(AbstractC13432c cVar, C12386a aVar) {
        C4826n a;
        aVar.m6979i(m31858v());
        DraweeHierarchy f = mo31693f();
        ScalingUtils.ScaleType scaleType = null;
        if (!(f == null || (a = ScalingUtils.m31843a(f.mo31692d())) == null)) {
            scaleType = a.m31794k();
        }
        aVar.m6975m(scaleType);
        int b = this.f37137J.m13079b();
        aVar.m6976l(C10711d.m12617b(b), C10480a.m13080a(b));
        if (cVar != null) {
            aVar.m6978j(cVar.getWidth(), cVar.getHeight());
            aVar.m6977k(cVar.mo3733g());
            return;
        }
        aVar.m6980h();
    }
}
