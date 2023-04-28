package p314r5;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.producers.AbstractC5001l0;
import com.facebook.imagepipeline.producers.AbstractC5041v0;
import com.facebook.imagepipeline.producers.AbstractC5059z0;
import com.facebook.imagepipeline.producers.C4950a;
import com.facebook.imagepipeline.producers.C5014p;
import com.facebook.imagepipeline.producers.C5018q;
import com.facebook.imagepipeline.producers.C5026s;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import p007a6.C1271b;
import p026b6.AbstractC3388d;
import p095f4.C7014c;
import p380v5.AbstractC13432c;
import p380v5.C13434e;
import p394w3.C13740j;
import p435y3.C14221a;

/* renamed from: r5.k */
/* loaded from: classes7.dex */
public class C12398k {

    /* renamed from: A */
    AbstractC5001l0<CloseableReference<AbstractC13432c>> f39233A;

    /* renamed from: B */
    AbstractC5001l0<CloseableReference<AbstractC13432c>> f39234B;

    /* renamed from: C */
    Map<AbstractC5001l0<CloseableReference<AbstractC13432c>>, AbstractC5001l0<CloseableReference<AbstractC13432c>>> f39235C = new HashMap();

    /* renamed from: D */
    Map<AbstractC5001l0<CloseableReference<AbstractC13432c>>, AbstractC5001l0<Void>> f39236D = new HashMap();

    /* renamed from: E */
    Map<AbstractC5001l0<CloseableReference<AbstractC13432c>>, AbstractC5001l0<CloseableReference<AbstractC13432c>>> f39237E = new HashMap();

    /* renamed from: a */
    private final ContentResolver f27875a;

    /* renamed from: b */
    private final C12397j f27876b;

    /* renamed from: c */
    private final NetworkFetcher f27877c;

    /* renamed from: d */
    private final boolean f27878d;

    /* renamed from: e */
    private final boolean f27879e;

    /* renamed from: f */
    private final boolean f27880f;

    /* renamed from: g */
    private final AbstractC5041v0 f27881g;

    /* renamed from: h */
    private final boolean f27882h;

    /* renamed from: i */
    private final boolean f27883i;

    /* renamed from: j */
    private final boolean f27884j;

    /* renamed from: k */
    private final AbstractC3388d f27885k;

    /* renamed from: l */
    private final boolean f27886l;

    /* renamed from: m */
    private final boolean f27887m;

    /* renamed from: n */
    private final boolean f27888n;

    /* renamed from: o */
    private final boolean f27889o;

    /* renamed from: p */
    AbstractC5001l0<CloseableReference<AbstractC13432c>> f27890p;

    /* renamed from: q */
    AbstractC5001l0<C13434e> f27891q;

    /* renamed from: r */
    AbstractC5001l0<C13434e> f27892r;

    /* renamed from: s */
    AbstractC5001l0<Void> f27893s;

    /* renamed from: t */
    AbstractC5001l0<Void> f27894t;

    /* renamed from: u */
    private AbstractC5001l0<C13434e> f27895u;

    /* renamed from: v */
    AbstractC5001l0<CloseableReference<AbstractC13432c>> f27896v;

    /* renamed from: w */
    AbstractC5001l0<CloseableReference<AbstractC13432c>> f27897w;

    /* renamed from: x */
    AbstractC5001l0<CloseableReference<AbstractC13432c>> f27898x;

    /* renamed from: y */
    AbstractC5001l0<CloseableReference<AbstractC13432c>> f27899y;

    /* renamed from: z */
    AbstractC5001l0<CloseableReference<AbstractC13432c>> f27900z;

    public C12398k(ContentResolver contentResolver, C12397j jVar, NetworkFetcher networkFetcher, boolean z, boolean z2, AbstractC5041v0 v0Var, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC3388d dVar, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f27875a = contentResolver;
        this.f27876b = jVar;
        this.f27877c = networkFetcher;
        this.f27878d = z;
        this.f27879e = z2;
        this.f27888n = z9;
        this.f27881g = v0Var;
        this.f27882h = z3;
        this.f27883i = z4;
        this.f27880f = z5;
        this.f27884j = z6;
        this.f27885k = dVar;
        this.f27886l = z7;
        this.f27887m = z8;
        this.f27889o = z10;
    }

    /* renamed from: A */
    private AbstractC5001l0<C13434e> m6889A(AbstractC5059z0<C13434e>[] z0VarArr) {
        return this.f27876b.m6920D(this.f27876b.m6917G(z0VarArr), true, this.f27885k);
    }

    /* renamed from: B */
    private AbstractC5001l0<C13434e> m6888B(AbstractC5001l0<C13434e> l0Var, AbstractC5059z0<C13434e>[] z0VarArr) {
        return C12397j.m6908h(m6889A(z0VarArr), this.f27876b.m6918F(this.f27876b.m6920D(C12397j.m6915a(l0Var), true, this.f27885k)));
    }

    /* renamed from: C */
    private static void m6887C(ImageRequest imageRequest) {
        boolean z;
        C13740j.m2834g(imageRequest);
        if (imageRequest.getLowestPermittedRequestLevel().m30904b() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.m30904b()) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
    }

    /* renamed from: a */
    private synchronized AbstractC5001l0<C13434e> m6886a() {
        if (C1271b.m41491d()) {
            C1271b.m41494a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.f27891q == null) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.f27891q = this.f27876b.m6914b(m6861z(this.f27876b.m6894v()), this.f27881g);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return this.f27891q;
    }

    /* renamed from: b */
    private synchronized AbstractC5001l0<C13434e> m6885b() {
        if (C1271b.m41491d()) {
            C1271b.m41494a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.f27892r == null) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.f27892r = this.f27876b.m6914b(m6882e(), this.f27881g);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return this.f27892r;
    }

    /* renamed from: c */
    private AbstractC5001l0<CloseableReference<AbstractC13432c>> m6884c(ImageRequest imageRequest) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("ProducerSequenceFactory#getBasicDecodedImageSequence");
            }
            C13740j.m2834g(imageRequest);
            Uri sourceUri = imageRequest.getSourceUri();
            C13740j.m2833h(sourceUri, "Uri is null.");
            int sourceUriType = imageRequest.getSourceUriType();
            if (sourceUriType != 0) {
                switch (sourceUriType) {
                    case 2:
                        AbstractC5001l0<CloseableReference<AbstractC13432c>> o = m6872o();
                        if (C1271b.m41491d()) {
                            C1271b.m41493b();
                        }
                        return o;
                    case 3:
                        AbstractC5001l0<CloseableReference<AbstractC13432c>> m = m6874m();
                        if (C1271b.m41491d()) {
                            C1271b.m41493b();
                        }
                        return m;
                    case 4:
                        if (C14221a.m1346c(this.f27875a.getType(sourceUri))) {
                            AbstractC5001l0<CloseableReference<AbstractC13432c>> o2 = m6872o();
                            if (C1271b.m41491d()) {
                                C1271b.m41493b();
                            }
                            return o2;
                        }
                        AbstractC5001l0<CloseableReference<AbstractC13432c>> k = m6876k();
                        if (C1271b.m41491d()) {
                            C1271b.m41493b();
                        }
                        return k;
                    case 5:
                        AbstractC5001l0<CloseableReference<AbstractC13432c>> j = m6877j();
                        if (C1271b.m41491d()) {
                            C1271b.m41493b();
                        }
                        return j;
                    case 6:
                        AbstractC5001l0<CloseableReference<AbstractC13432c>> n = m6873n();
                        if (C1271b.m41491d()) {
                            C1271b.m41493b();
                        }
                        return n;
                    case 7:
                        AbstractC5001l0<CloseableReference<AbstractC13432c>> f = m6881f();
                        if (C1271b.m41491d()) {
                            C1271b.m41493b();
                        }
                        return f;
                    case 8:
                        return m6868s();
                    default:
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + m6867t(sourceUri));
                }
            } else {
                AbstractC5001l0<CloseableReference<AbstractC13432c>> p = m6871p();
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
                return p;
            }
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* renamed from: d */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6883d(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var2;
        l0Var2 = this.f39237E.get(l0Var);
        if (l0Var2 == null) {
            l0Var2 = this.f27876b.m6910f(l0Var);
            this.f39237E.put(l0Var, l0Var2);
        }
        return l0Var2;
    }

    /* renamed from: e */
    private synchronized AbstractC5001l0<C13434e> m6882e() {
        AbstractC5001l0<C13434e> l0Var;
        boolean z;
        if (C1271b.m41491d()) {
            C1271b.m41494a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f27895u == null) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            if (this.f27888n) {
                l0Var = this.f27876b.m6907i(this.f27877c);
            } else {
                l0Var = m6861z(this.f27876b.m6891y(this.f27877c));
            }
            C4950a a = C12397j.m6915a((AbstractC5001l0) C13740j.m2834g(l0Var));
            this.f27895u = a;
            C12397j jVar = this.f27876b;
            if (!this.f27878d || this.f27882h) {
                z = false;
            } else {
                z = true;
            }
            this.f27895u = jVar.m6920D(a, z, this.f27885k);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return this.f27895u;
    }

    /* renamed from: f */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6881f() {
        if (this.f39233A == null) {
            AbstractC5001l0<C13434e> j = this.f27876b.m6906j();
            if (C7014c.f15297a && (!this.f27879e || C7014c.f15300d == null)) {
                j = this.f27876b.m6916H(j);
            }
            this.f39233A = m6865v(this.f27876b.m6920D(C12397j.m6915a(j), true, this.f27885k));
        }
        return this.f39233A;
    }

    /* renamed from: h */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6879h(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        return this.f27876b.m6904l(l0Var);
    }

    /* renamed from: j */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6877j() {
        if (this.f27900z == null) {
            this.f27900z = m6864w(this.f27876b.m6898r());
        }
        return this.f27900z;
    }

    /* renamed from: k */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6876k() {
        if (this.f27898x == null) {
            this.f27898x = m6863x(this.f27876b.m6897s(), new AbstractC5059z0[]{this.f27876b.m6896t(), this.f27876b.m6895u()});
        }
        return this.f27898x;
    }

    /* renamed from: l */
    private synchronized AbstractC5001l0<Void> m6875l() {
        if (C1271b.m41491d()) {
            C1271b.m41494a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f27893s == null) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f27893s = this.f27876b.m6919E(m6886a());
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return this.f27893s;
    }

    /* renamed from: m */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6874m() {
        if (this.f27896v == null) {
            this.f27896v = m6864w(this.f27876b.m6894v());
        }
        return this.f27896v;
    }

    /* renamed from: n */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6873n() {
        if (this.f27899y == null) {
            this.f27899y = m6864w(this.f27876b.m6893w());
        }
        return this.f27899y;
    }

    /* renamed from: o */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6872o() {
        if (this.f27897w == null) {
            this.f27897w = m6866u(this.f27876b.m6892x());
        }
        return this.f27897w;
    }

    /* renamed from: p */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6871p() {
        if (C1271b.m41491d()) {
            C1271b.m41494a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f27890p == null) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f27890p = m6865v(m6882e());
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return this.f27890p;
    }

    /* renamed from: q */
    private synchronized AbstractC5001l0<Void> m6870q() {
        if (C1271b.m41491d()) {
            C1271b.m41494a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f27894t == null) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f27894t = this.f27876b.m6919E(m6885b());
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return this.f27894t;
    }

    /* renamed from: r */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6869r(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var2;
        l0Var2 = this.f39235C.get(l0Var);
        if (l0Var2 == null) {
            l0Var2 = this.f27876b.m6923A(this.f27876b.m6922B(l0Var));
            this.f39235C.put(l0Var, l0Var2);
        }
        return l0Var2;
    }

    /* renamed from: s */
    private synchronized AbstractC5001l0<CloseableReference<AbstractC13432c>> m6868s() {
        if (this.f39234B == null) {
            this.f39234B = m6864w(this.f27876b.m6921C());
        }
        return this.f39234B;
    }

    /* renamed from: t */
    private static String m6867t(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        return valueOf.substring(0, 30) + "...";
    }

    /* renamed from: u */
    private AbstractC5001l0<CloseableReference<AbstractC13432c>> m6866u(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        AbstractC5001l0<CloseableReference<AbstractC13432c>> b = this.f27876b.m6914b(this.f27876b.m6912d(this.f27876b.m6911e(l0Var)), this.f27881g);
        if (!this.f27886l && !this.f27887m) {
            return this.f27876b.m6913c(b);
        }
        return this.f27876b.m6909g(this.f27876b.m6913c(b));
    }

    /* renamed from: v */
    private AbstractC5001l0<CloseableReference<AbstractC13432c>> m6865v(AbstractC5001l0<C13434e> l0Var) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        AbstractC5001l0<CloseableReference<AbstractC13432c>> u = m6866u(this.f27876b.m6905k(l0Var));
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return u;
    }

    /* renamed from: w */
    private AbstractC5001l0<CloseableReference<AbstractC13432c>> m6864w(AbstractC5001l0<C13434e> l0Var) {
        return m6863x(l0Var, new AbstractC5059z0[]{this.f27876b.m6895u()});
    }

    /* renamed from: x */
    private AbstractC5001l0<CloseableReference<AbstractC13432c>> m6863x(AbstractC5001l0<C13434e> l0Var, AbstractC5059z0<C13434e>[] z0VarArr) {
        return m6865v(m6888B(m6861z(l0Var), z0VarArr));
    }

    /* renamed from: y */
    private AbstractC5001l0<C13434e> m6862y(AbstractC5001l0<C13434e> l0Var) {
        C5018q qVar;
        if (C1271b.m41491d()) {
            C1271b.m41494a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f27880f) {
            qVar = this.f27876b.m6902n(this.f27876b.m6890z(l0Var));
        } else {
            qVar = this.f27876b.m6902n(l0Var);
        }
        C5014p m = this.f27876b.m6903m(qVar);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return m;
    }

    /* renamed from: z */
    private AbstractC5001l0<C13434e> m6861z(AbstractC5001l0<C13434e> l0Var) {
        if (C7014c.f15297a && (!this.f27879e || C7014c.f15300d == null)) {
            l0Var = this.f27876b.m6916H(l0Var);
        }
        if (this.f27884j) {
            l0Var = m6862y(l0Var);
        }
        C5026s p = this.f27876b.m6900p(l0Var);
        if (!this.f27887m) {
            return this.f27876b.m6901o(p);
        }
        return this.f27876b.m6901o(this.f27876b.m6899q(p));
    }

    /* renamed from: g */
    public AbstractC5001l0<CloseableReference<AbstractC13432c>> m6880g(ImageRequest imageRequest) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        AbstractC5001l0<CloseableReference<AbstractC13432c>> c = m6884c(imageRequest);
        if (imageRequest.getPostprocessor() != null) {
            c = m6869r(c);
        }
        if (this.f27883i) {
            c = m6883d(c);
        }
        if (this.f27889o && imageRequest.getDelayMs() > 0) {
            c = m6879h(c);
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return c;
    }

    /* renamed from: i */
    public AbstractC5001l0<Void> m6878i(ImageRequest imageRequest) {
        m6887C(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return m6870q();
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            return m6875l();
        }
        Uri sourceUri = imageRequest.getSourceUri();
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + m6867t(sourceUri));
    }
}
