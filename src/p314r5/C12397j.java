package p314r5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.producers.AbstractC5001l0;
import com.facebook.imagepipeline.producers.AbstractC5041v0;
import com.facebook.imagepipeline.producers.AbstractC5059z0;
import com.facebook.imagepipeline.producers.C4950a;
import com.facebook.imagepipeline.producers.C4952a0;
import com.facebook.imagepipeline.producers.C4955b0;
import com.facebook.imagepipeline.producers.C4956b1;
import com.facebook.imagepipeline.producers.C4964d0;
import com.facebook.imagepipeline.producers.C4966e0;
import com.facebook.imagepipeline.producers.C4967f;
import com.facebook.imagepipeline.producers.C4968f0;
import com.facebook.imagepipeline.producers.C4971g;
import com.facebook.imagepipeline.producers.C4976h;
import com.facebook.imagepipeline.producers.C4978h0;
import com.facebook.imagepipeline.producers.C4980i;
import com.facebook.imagepipeline.producers.C4982i0;
import com.facebook.imagepipeline.producers.C4986j;
import com.facebook.imagepipeline.producers.C4988j0;
import com.facebook.imagepipeline.producers.C4990k;
import com.facebook.imagepipeline.producers.C4993k0;
import com.facebook.imagepipeline.producers.C5000l;
import com.facebook.imagepipeline.producers.C5002m;
import com.facebook.imagepipeline.producers.C5009n;
import com.facebook.imagepipeline.producers.C5014p;
import com.facebook.imagepipeline.producers.C5017p0;
import com.facebook.imagepipeline.producers.C5018q;
import com.facebook.imagepipeline.producers.C5021q0;
import com.facebook.imagepipeline.producers.C5024r;
import com.facebook.imagepipeline.producers.C5026s;
import com.facebook.imagepipeline.producers.C5029t;
import com.facebook.imagepipeline.producers.C5031t0;
import com.facebook.imagepipeline.producers.C5034u0;
import com.facebook.imagepipeline.producers.C5045x0;
import com.facebook.imagepipeline.producers.C5056y0;
import com.facebook.imagepipeline.producers.C5058z;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import p026b6.AbstractC3388d;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11564s;
import p278p5.C11537d;
import p278p5.C11538e;
import p346t5.AbstractC12962c;
import p346t5.AbstractC12964e;
import p380v5.AbstractC13432c;
import p380v5.C13434e;
import p394w3.C13743m;
import p455z3.AbstractC14529a;
import p455z3.AbstractC14535g;
import p455z3.AbstractC14537h;

/* renamed from: r5.j */
/* loaded from: classes7.dex */
public class C12397j {

    /* renamed from: a */
    protected ContentResolver f27850a;

    /* renamed from: b */
    protected Resources f27851b;

    /* renamed from: c */
    protected AssetManager f27852c;

    /* renamed from: d */
    protected final AbstractC14529a f27853d;

    /* renamed from: e */
    protected final AbstractC12962c f27854e;

    /* renamed from: f */
    protected final AbstractC12964e f27855f;

    /* renamed from: g */
    protected final boolean f27856g;

    /* renamed from: h */
    protected final boolean f27857h;

    /* renamed from: i */
    protected final boolean f27858i;

    /* renamed from: j */
    protected final AbstractC12391e f27859j;

    /* renamed from: k */
    protected final AbstractC14537h f27860k;

    /* renamed from: l */
    protected final C11538e f27861l;

    /* renamed from: m */
    protected final C11538e f27862m;

    /* renamed from: n */
    protected final AbstractC11564s<CacheKey, AbstractC14535g> f27863n;

    /* renamed from: o */
    protected final AbstractC11564s<CacheKey, AbstractC13432c> f27864o;

    /* renamed from: p */
    protected final AbstractC11543f f27865p;

    /* renamed from: q */
    protected final C11537d<CacheKey> f27866q;

    /* renamed from: r */
    protected final C11537d<CacheKey> f27867r;

    /* renamed from: s */
    protected final PlatformBitmapFactory f27868s;

    /* renamed from: t */
    protected final int f27869t;

    /* renamed from: u */
    protected final int f27870u;

    /* renamed from: v */
    protected boolean f27871v;

    /* renamed from: w */
    protected final C12387a f27872w;

    /* renamed from: x */
    protected final int f27873x;

    /* renamed from: y */
    protected final boolean f27874y;

    public C12397j(Context context, AbstractC14529a aVar, AbstractC12962c cVar, AbstractC12964e eVar, boolean z, boolean z2, boolean z3, AbstractC12391e eVar2, AbstractC14537h hVar, AbstractC11564s<CacheKey, AbstractC13432c> sVar, AbstractC11564s<CacheKey, AbstractC14535g> sVar2, C11538e eVar3, C11538e eVar4, AbstractC11543f fVar, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4, int i3, C12387a aVar2, boolean z5, int i4) {
        this.f27850a = context.getApplicationContext().getContentResolver();
        this.f27851b = context.getApplicationContext().getResources();
        this.f27852c = context.getApplicationContext().getAssets();
        this.f27853d = aVar;
        this.f27854e = cVar;
        this.f27855f = eVar;
        this.f27856g = z;
        this.f27857h = z2;
        this.f27858i = z3;
        this.f27859j = eVar2;
        this.f27860k = hVar;
        this.f27864o = sVar;
        this.f27863n = sVar2;
        this.f27861l = eVar3;
        this.f27862m = eVar4;
        this.f27865p = fVar;
        this.f27868s = platformBitmapFactory;
        this.f27866q = new C11537d<>(i4);
        this.f27867r = new C11537d<>(i4);
        this.f27869t = i;
        this.f27870u = i2;
        this.f27871v = z4;
        this.f27873x = i3;
        this.f27872w = aVar2;
        this.f27874y = z5;
    }

    /* renamed from: a */
    public static C4950a m6915a(AbstractC5001l0<C13434e> l0Var) {
        return new C4950a(l0Var);
    }

    /* renamed from: h */
    public static C4990k m6908h(AbstractC5001l0<C13434e> l0Var, AbstractC5001l0<C13434e> l0Var2) {
        return new C4990k(l0Var, l0Var2);
    }

    /* renamed from: A */
    public C4988j0 m6923A(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        return new C4988j0(this.f27864o, this.f27865p, l0Var);
    }

    /* renamed from: B */
    public C4993k0 m6922B(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        return new C4993k0(l0Var, this.f27868s, this.f27859j.mo6961e());
    }

    /* renamed from: C */
    public C5017p0 m6921C() {
        return new C5017p0(this.f27859j.mo6960f(), this.f27860k, this.f27850a);
    }

    /* renamed from: D */
    public C5021q0 m6920D(AbstractC5001l0<C13434e> l0Var, boolean z, AbstractC3388d dVar) {
        return new C5021q0(this.f27859j.mo6961e(), this.f27860k, l0Var, z, dVar);
    }

    /* renamed from: E */
    public <T> C5031t0<T> m6919E(AbstractC5001l0<T> l0Var) {
        return new C5031t0<>(l0Var);
    }

    /* renamed from: F */
    public <T> C5045x0<T> m6918F(AbstractC5001l0<T> l0Var) {
        return new C5045x0<>(5, this.f27859j.mo6965a(), l0Var);
    }

    /* renamed from: G */
    public C5056y0 m6917G(AbstractC5059z0<C13434e>[] z0VarArr) {
        return new C5056y0(z0VarArr);
    }

    /* renamed from: H */
    public C4956b1 m6916H(AbstractC5001l0<C13434e> l0Var) {
        return new C4956b1(this.f27859j.mo6961e(), this.f27860k, l0Var);
    }

    /* renamed from: b */
    public <T> AbstractC5001l0<T> m6914b(AbstractC5001l0<T> l0Var, AbstractC5041v0 v0Var) {
        return new C5034u0(l0Var, v0Var);
    }

    /* renamed from: c */
    public C4967f m6913c(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        return new C4967f(this.f27864o, this.f27865p, l0Var);
    }

    /* renamed from: d */
    public C4971g m6912d(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        return new C4971g(this.f27865p, l0Var);
    }

    /* renamed from: e */
    public C4976h m6911e(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        return new C4976h(this.f27864o, this.f27865p, l0Var);
    }

    /* renamed from: f */
    public C4980i m6910f(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        return new C4980i(l0Var, this.f27869t, this.f27870u, this.f27871v);
    }

    /* renamed from: g */
    public C4986j m6909g(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        return new C4986j(this.f27863n, this.f27861l, this.f27862m, this.f27865p, this.f27866q, this.f27867r, l0Var);
    }

    /* renamed from: i */
    public AbstractC5001l0<C13434e> m6907i(NetworkFetcher networkFetcher) {
        return null;
    }

    /* renamed from: j */
    public C5000l m6906j() {
        return new C5000l(this.f27860k);
    }

    /* renamed from: k */
    public C5002m m6905k(AbstractC5001l0<C13434e> l0Var) {
        return new C5002m(this.f27853d, this.f27859j.mo6962d(), this.f27854e, this.f27855f, this.f27856g, this.f27857h, this.f27858i, l0Var, this.f27873x, this.f27872w, null, C13743m.f30712b);
    }

    /* renamed from: l */
    public C5009n m6904l(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        return new C5009n(l0Var, this.f27859j.mo6963c());
    }

    /* renamed from: m */
    public C5014p m6903m(AbstractC5001l0<C13434e> l0Var) {
        return new C5014p(this.f27861l, this.f27862m, this.f27865p, l0Var);
    }

    /* renamed from: n */
    public C5018q m6902n(AbstractC5001l0<C13434e> l0Var) {
        return new C5018q(this.f27861l, this.f27862m, this.f27865p, l0Var);
    }

    /* renamed from: o */
    public C5024r m6901o(AbstractC5001l0<C13434e> l0Var) {
        return new C5024r(this.f27865p, this.f27874y, l0Var);
    }

    /* renamed from: p */
    public C5026s m6900p(AbstractC5001l0<C13434e> l0Var) {
        return new C5026s(this.f27863n, this.f27865p, l0Var);
    }

    /* renamed from: q */
    public C5029t m6899q(AbstractC5001l0<C13434e> l0Var) {
        return new C5029t(this.f27861l, this.f27862m, this.f27865p, this.f27866q, this.f27867r, l0Var);
    }

    /* renamed from: r */
    public C5058z m6898r() {
        return new C5058z(this.f27859j.mo6960f(), this.f27860k, this.f27852c);
    }

    /* renamed from: s */
    public C4952a0 m6897s() {
        return new C4952a0(this.f27859j.mo6960f(), this.f27860k, this.f27850a);
    }

    /* renamed from: t */
    public C4955b0 m6896t() {
        return new C4955b0(this.f27859j.mo6960f(), this.f27860k, this.f27850a);
    }

    /* renamed from: u */
    public LocalExifThumbnailProducer m6895u() {
        return new LocalExifThumbnailProducer(this.f27859j.mo6959g(), this.f27860k, this.f27850a);
    }

    /* renamed from: v */
    public C4964d0 m6894v() {
        return new C4964d0(this.f27859j.mo6960f(), this.f27860k);
    }

    /* renamed from: w */
    public C4966e0 m6893w() {
        return new C4966e0(this.f27859j.mo6960f(), this.f27860k, this.f27851b);
    }

    /* renamed from: x */
    public C4968f0 m6892x() {
        return new C4968f0(this.f27859j.mo6960f(), this.f27850a);
    }

    /* renamed from: y */
    public AbstractC5001l0<C13434e> m6891y(NetworkFetcher networkFetcher) {
        return new C4978h0(this.f27860k, this.f27853d, networkFetcher);
    }

    /* renamed from: z */
    public C4982i0 m6890z(AbstractC5001l0<C13434e> l0Var) {
        return new C4982i0(this.f27861l, this.f27865p, this.f27860k, this.f27853d, l0Var);
    }
}
