package p346t5;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.platform.AbstractC4945g;
import java.io.InputStream;
import java.util.Map;
import p039c6.C3769b;
import p170j5.C9489b;
import p170j5.C9490c;
import p170j5.C9492d;
import p380v5.AbstractC13432c;
import p380v5.AbstractC13438i;
import p380v5.C13433d;
import p380v5.C13434e;
import p380v5.C13437h;

/* renamed from: t5.b */
/* loaded from: classes7.dex */
public class C12960b implements AbstractC12962c {

    /* renamed from: a */
    private final AbstractC12962c f29049a;

    /* renamed from: b */
    private final AbstractC12962c f29050b;

    /* renamed from: c */
    private final AbstractC4945g f29051c;

    /* renamed from: d */
    private final AbstractC12962c f29052d;

    /* renamed from: e */
    private final Map<C9490c, AbstractC12962c> f29053e;

    /* renamed from: t5.b$a */
    /* loaded from: classes7.dex */
    class C12961a implements AbstractC12962c {
        C12961a() {
        }

        @Override // p346t5.AbstractC12962c
        /* renamed from: a */
        public AbstractC13432c mo4939a(C13434e eVar, int i, AbstractC13438i iVar, ImageDecodeOptions imageDecodeOptions) {
            C9490c t = eVar.m3698t();
            if (t == C9489b.f21011a) {
                return C12960b.this.m4941d(eVar, i, iVar, imageDecodeOptions);
            }
            if (t == C9489b.f21013c) {
                return C12960b.this.m4942c(eVar, i, iVar, imageDecodeOptions);
            }
            if (t == C9489b.f21020j) {
                return C12960b.this.m4943b(eVar, i, iVar, imageDecodeOptions);
            }
            if (t != C9490c.f21023c) {
                return C12960b.this.m4940e(eVar, imageDecodeOptions);
            }
            throw new C12959a("unknown image format", eVar);
        }
    }

    public C12960b(AbstractC12962c cVar, AbstractC12962c cVar2, AbstractC4945g gVar) {
        this(cVar, cVar2, gVar, null);
    }

    @Override // p346t5.AbstractC12962c
    /* renamed from: a */
    public AbstractC13432c mo4939a(C13434e eVar, int i, AbstractC13438i iVar, ImageDecodeOptions imageDecodeOptions) {
        AbstractC12962c cVar;
        InputStream z;
        AbstractC12962c cVar2 = imageDecodeOptions.f8134i;
        if (cVar2 != null) {
            return cVar2.mo4939a(eVar, i, iVar, imageDecodeOptions);
        }
        C9490c t = eVar.m3698t();
        if ((t == null || t == C9490c.f21023c) && (z = eVar.m3696z()) != null) {
            t = C9492d.m16139c(z);
            eVar.m3719K0(t);
        }
        Map<C9490c, AbstractC12962c> map = this.f29053e;
        if (map == null || (cVar = map.get(t)) == null) {
            return this.f29052d.mo4939a(eVar, i, iVar, imageDecodeOptions);
        }
        return cVar.mo4939a(eVar, i, iVar, imageDecodeOptions);
    }

    /* renamed from: b */
    public AbstractC13432c m4943b(C13434e eVar, int i, AbstractC13438i iVar, ImageDecodeOptions imageDecodeOptions) {
        AbstractC12962c cVar = this.f29050b;
        if (cVar != null) {
            return cVar.mo4939a(eVar, i, iVar, imageDecodeOptions);
        }
        throw new C12959a("Animated WebP support not set up!", eVar);
    }

    /* renamed from: c */
    public AbstractC13432c m4942c(C13434e eVar, int i, AbstractC13438i iVar, ImageDecodeOptions imageDecodeOptions) {
        AbstractC12962c cVar;
        if (eVar.getWidth() == -1 || eVar.getHeight() == -1) {
            throw new C12959a("image width or height is incorrect", eVar);
        } else if (imageDecodeOptions.f8131f || (cVar = this.f29049a) == null) {
            return m4940e(eVar, imageDecodeOptions);
        } else {
            return cVar.mo4939a(eVar, i, iVar, imageDecodeOptions);
        }
    }

    /* renamed from: d */
    public C13433d m4941d(C13434e eVar, int i, AbstractC13438i iVar, ImageDecodeOptions imageDecodeOptions) {
        CloseableReference<Bitmap> b = this.f29051c.mo31228b(eVar, imageDecodeOptions.f8132g, null, i, imageDecodeOptions.f8135j);
        try {
            C3769b.m33612a(null, b);
            C13433d dVar = new C13433d(b, iVar, eVar.m3723H(), eVar.m3700r());
            dVar.m3737i("is_rounded", false);
            return dVar;
        } finally {
            b.close();
        }
    }

    /* renamed from: e */
    public C13433d m4940e(C13434e eVar, ImageDecodeOptions imageDecodeOptions) {
        CloseableReference<Bitmap> a = this.f29051c.mo31229a(eVar, imageDecodeOptions.f8132g, null, imageDecodeOptions.f8135j);
        try {
            C3769b.m33612a(null, a);
            C13433d dVar = new C13433d(a, C13437h.f30004d, eVar.m3723H(), eVar.m3700r());
            dVar.m3737i("is_rounded", false);
            return dVar;
        } finally {
            a.close();
        }
    }

    public C12960b(AbstractC12962c cVar, AbstractC12962c cVar2, AbstractC4945g gVar, Map<C9490c, AbstractC12962c> map) {
        this.f29052d = new C12961a();
        this.f29049a = cVar;
        this.f29050b = cVar2;
        this.f29051c = gVar;
        this.f29053e = map;
    }
}
