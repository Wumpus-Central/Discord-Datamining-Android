package p240n4;

import android.graphics.Rect;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.backends.pipeline.C4791a;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p057d4.AbstractC6395b;
import p256o4.C11195a;
import p256o4.C11196b;
import p256o4.C11197c;
import p380v5.AbstractC13432c;
import p394w3.C13743m;
import p416x5.C13936c;

/* renamed from: n4.g */
/* loaded from: classes7.dex */
public class C10714g implements AbstractC10715h {

    /* renamed from: a */
    private final C4791a f23707a;

    /* renamed from: b */
    private final AbstractC6395b f23708b;

    /* renamed from: c */
    private final C10716i f23709c = new C10716i();

    /* renamed from: d */
    private final Supplier<Boolean> f23710d;

    /* renamed from: e */
    private C10710c f23711e;

    /* renamed from: f */
    private AbstractC10709b f23712f;

    /* renamed from: g */
    private C11197c f23713g;

    /* renamed from: h */
    private C11195a f23714h;

    /* renamed from: i */
    private C13936c f23715i;

    /* renamed from: j */
    private List<AbstractC10713f> f23716j;

    /* renamed from: k */
    private boolean f23717k;

    public C10714g(AbstractC6395b bVar, C4791a aVar, Supplier<Boolean> supplier) {
        this.f23708b = bVar;
        this.f23707a = aVar;
        this.f23710d = supplier;
    }

    /* renamed from: h */
    private void m12609h() {
        if (this.f23714h == null) {
            this.f23714h = new C11195a(this.f23708b, this.f23709c, this, this.f23710d, C13743m.f30712b);
        }
        if (this.f23713g == null) {
            this.f23713g = new C11197c(this.f23708b, this.f23709c);
        }
        if (this.f23712f == null) {
            this.f23712f = new C11196b(this.f23709c, this);
        }
        C10710c cVar = this.f23711e;
        if (cVar == null) {
            this.f23711e = new C10710c(this.f23707a.m31858v(), this.f23712f);
        } else {
            cVar.m12619a(this.f23707a.m31858v());
        }
        if (this.f23715i == null) {
            this.f23715i = new C13936c(this.f23713g, this.f23711e);
        }
    }

    @Override // p240n4.AbstractC10715h
    /* renamed from: a */
    public void mo12607a(C10716i iVar, int i) {
        List<AbstractC10713f> list;
        if (!(!this.f23717k || (list = this.f23716j) == null || list.isEmpty())) {
            C10712e B = iVar.m12604B();
            for (AbstractC10713f fVar : this.f23716j) {
                fVar.m12616a(B, i);
            }
        }
    }

    @Override // p240n4.AbstractC10715h
    /* renamed from: b */
    public void mo12606b(C10716i iVar, int i) {
        List<AbstractC10713f> list;
        iVar.m12589o(i);
        if (!(!this.f23717k || (list = this.f23716j) == null || list.isEmpty())) {
            if (i == 3) {
                m12613d();
            }
            C10712e B = iVar.m12604B();
            for (AbstractC10713f fVar : this.f23716j) {
                fVar.m12615b(B, i);
            }
        }
    }

    /* renamed from: c */
    public void m12614c(AbstractC10713f fVar) {
        if (fVar != null) {
            if (this.f23716j == null) {
                this.f23716j = new CopyOnWriteArrayList();
            }
            this.f23716j.add(fVar);
        }
    }

    /* renamed from: d */
    public void m12613d() {
        DraweeHierarchy f = this.f23707a.mo31693f();
        if (f != null && f.mo31692d() != null) {
            Rect bounds = f.mo31692d().getBounds();
            this.f23709c.m12582v(bounds.width());
            this.f23709c.m12583u(bounds.height());
        }
    }

    /* renamed from: e */
    public void m12612e() {
        List<AbstractC10713f> list = this.f23716j;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: f */
    public void m12611f() {
        m12612e();
        m12610g(false);
        this.f23709c.m12602b();
    }

    /* renamed from: g */
    public void m12610g(boolean z) {
        this.f23717k = z;
        if (z) {
            m12609h();
            AbstractC10709b bVar = this.f23712f;
            if (bVar != null) {
                this.f23707a.m31957f0(bVar);
            }
            C11195a aVar = this.f23714h;
            if (aVar != null) {
                this.f23707a.m31869k(aVar);
            }
            C13936c cVar = this.f23715i;
            if (cVar != null) {
                this.f23707a.m31956g0(cVar);
                return;
            }
            return;
        }
        AbstractC10709b bVar2 = this.f23712f;
        if (bVar2 != null) {
            this.f23707a.m31941v0(bVar2);
        }
        C11195a aVar2 = this.f23714h;
        if (aVar2 != null) {
            this.f23707a.m31888Q(aVar2);
        }
        C13936c cVar2 = this.f23715i;
        if (cVar2 != null) {
            this.f23707a.m31940w0(cVar2);
        }
    }

    /* renamed from: i */
    public void m12608i(AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<AbstractC13432c>, ImageInfo> abstractDraweeControllerBuilder) {
        this.f23709c.m12595i(abstractDraweeControllerBuilder.m31918n(), abstractDraweeControllerBuilder.m31917o(), abstractDraweeControllerBuilder.m31919m());
    }
}
