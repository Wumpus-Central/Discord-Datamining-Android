package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.core.C4904a;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.C5037v;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p007a6.C1271b;
import p026b6.AbstractC3388d;
import p095f4.AbstractC7011a;
import p095f4.AbstractC7012b;
import p095f4.C7014c;
import p257o5.C11200c;
import p278p5.AbstractC11534a;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11547i;
import p278p5.AbstractC11557o;
import p278p5.AbstractC11564s;
import p278p5.C11536c;
import p278p5.C11544g;
import p278p5.C11550j;
import p278p5.C11551k;
import p278p5.C11552l;
import p278p5.C11568v;
import p314r5.AbstractC12391e;
import p314r5.AbstractC12392f;
import p314r5.AbstractC12393g;
import p314r5.C12388b;
import p314r5.C12390d;
import p332s3.AbstractC12782a;
import p334s5.AbstractC12785a;
import p334s5.C12786b;
import p346t5.AbstractC12962c;
import p346t5.AbstractC12964e;
import p346t5.C12963d;
import p346t5.C12966g;
import p359u3.AbstractExecutorServiceC13188f;
import p380v5.AbstractC13432c;
import p394w3.C13740j;
import p416x5.AbstractC13937d;
import p437y5.C14253x;
import p437y5.C14256y;
import p455z3.AbstractC14531c;
import p455z3.AbstractC14535g;
import p455z3.C14532d;

/* loaded from: classes7.dex */
public class ImagePipelineConfig implements AbstractC12393g {

    /* renamed from: I */
    private static C4903b f37167I = new C4903b(null);

    /* renamed from: A */
    private final DiskCacheConfig f37168A;

    /* renamed from: B */
    private final C4904a f37169B;

    /* renamed from: C */
    private final boolean f37170C;

    /* renamed from: D */
    private final AbstractC12785a f37171D;

    /* renamed from: E */
    private final AbstractC11564s<CacheKey, AbstractC13432c> f37172E;

    /* renamed from: F */
    private final AbstractC11564s<CacheKey, AbstractC14535g> f37173F;

    /* renamed from: G */
    private final AbstractExecutorServiceC13188f f37174G;

    /* renamed from: H */
    private final AbstractC11534a f37175H;

    /* renamed from: a */
    private final Bitmap.Config f8174a;

    /* renamed from: b */
    private final Supplier<MemoryCacheParams> f8175b;

    /* renamed from: c */
    private final AbstractC11564s.AbstractC11565a f8176c;

    /* renamed from: d */
    private final AbstractC11547i.AbstractC11549b<CacheKey> f8177d;

    /* renamed from: e */
    private final AbstractC11543f f8178e;

    /* renamed from: f */
    private final Context f8179f;

    /* renamed from: g */
    private final boolean f8180g;

    /* renamed from: h */
    private final AbstractC12392f f8181h;

    /* renamed from: i */
    private final Supplier<MemoryCacheParams> f8182i;

    /* renamed from: j */
    private final AbstractC12391e f8183j;

    /* renamed from: k */
    private final AbstractC11557o f8184k;

    /* renamed from: l */
    private final AbstractC12962c f8185l;

    /* renamed from: m */
    private final AbstractC3388d f8186m;

    /* renamed from: n */
    private final Integer f8187n;

    /* renamed from: o */
    private final Supplier<Boolean> f8188o;

    /* renamed from: p */
    private final DiskCacheConfig f8189p;

    /* renamed from: q */
    private final AbstractC14531c f8190q;

    /* renamed from: r */
    private final int f8191r;

    /* renamed from: s */
    private final NetworkFetcher f8192s;

    /* renamed from: t */
    private final int f8193t;

    /* renamed from: u */
    private final PlatformBitmapFactory f8194u;

    /* renamed from: v */
    private final C14256y f8195v;

    /* renamed from: w */
    private final AbstractC12964e f8196w;

    /* renamed from: x */
    private final Set<RequestListener> f8197x;

    /* renamed from: y */
    private final Set<AbstractC13937d> f8198y;

    /* renamed from: z */
    private final boolean f8199z;

    /* loaded from: classes7.dex */
    public static class Builder {

        /* renamed from: A */
        private int f37176A;

        /* renamed from: B */
        private final C4904a.C4905b f37177B;

        /* renamed from: C */
        private boolean f37178C;

        /* renamed from: D */
        private AbstractC12785a f37179D;

        /* renamed from: E */
        private AbstractC11564s<CacheKey, AbstractC13432c> f37180E;

        /* renamed from: F */
        private AbstractC11564s<CacheKey, AbstractC14535g> f37181F;

        /* renamed from: G */
        private AbstractExecutorServiceC13188f f37182G;

        /* renamed from: H */
        private AbstractC11534a f37183H;

        /* renamed from: a */
        private Bitmap.Config f8200a;

        /* renamed from: b */
        private Supplier<MemoryCacheParams> f8201b;

        /* renamed from: c */
        private AbstractC11547i.AbstractC11549b<CacheKey> f8202c;

        /* renamed from: d */
        private AbstractC11564s.AbstractC11565a f8203d;

        /* renamed from: e */
        private AbstractC11543f f8204e;

        /* renamed from: f */
        private final Context f8205f;

        /* renamed from: g */
        private boolean f8206g;

        /* renamed from: h */
        private Supplier<MemoryCacheParams> f8207h;

        /* renamed from: i */
        private AbstractC12391e f8208i;

        /* renamed from: j */
        private AbstractC11557o f8209j;

        /* renamed from: k */
        private AbstractC12962c f8210k;

        /* renamed from: l */
        private AbstractC3388d f8211l;

        /* renamed from: m */
        private Integer f8212m;

        /* renamed from: n */
        private Supplier<Boolean> f8213n;

        /* renamed from: o */
        private DiskCacheConfig f8214o;

        /* renamed from: p */
        private AbstractC14531c f8215p;

        /* renamed from: q */
        private Integer f8216q;

        /* renamed from: r */
        private NetworkFetcher f8217r;

        /* renamed from: s */
        private PlatformBitmapFactory f8218s;

        /* renamed from: t */
        private C14256y f8219t;

        /* renamed from: u */
        private AbstractC12964e f8220u;

        /* renamed from: v */
        private Set<RequestListener> f8221v;

        /* renamed from: w */
        private Set<AbstractC13937d> f8222w;

        /* renamed from: x */
        private boolean f8223x;

        /* renamed from: y */
        private DiskCacheConfig f8224y;

        /* renamed from: z */
        private AbstractC12392f f8225z;

        /* synthetic */ Builder(Context context, C4902a aVar) {
            this(context);
        }

        /* renamed from: K */
        public ImagePipelineConfig m31449K() {
            return new ImagePipelineConfig(this, null);
        }

        /* renamed from: L */
        public C4904a.C4905b m31448L() {
            return this.f37177B;
        }

        /* renamed from: M */
        public Builder m31447M(Supplier<MemoryCacheParams> supplier) {
            this.f8201b = (Supplier) C13740j.m2834g(supplier);
            return this;
        }

        /* renamed from: N */
        public Builder m31446N(boolean z) {
            this.f8206g = z;
            return this;
        }

        /* renamed from: O */
        public Builder m31445O(DiskCacheConfig diskCacheConfig) {
            this.f8214o = diskCacheConfig;
            return this;
        }

        /* renamed from: P */
        public Builder m31444P(NetworkFetcher networkFetcher) {
            this.f8217r = networkFetcher;
            return this;
        }

        /* renamed from: Q */
        public Builder m31443Q(C14256y yVar) {
            this.f8219t = yVar;
            return this;
        }

        /* renamed from: R */
        public Builder m31442R(Set<RequestListener> set) {
            this.f8221v = set;
            return this;
        }

        /* renamed from: S */
        public Builder m31441S(DiskCacheConfig diskCacheConfig) {
            this.f8224y = diskCacheConfig;
            return this;
        }

        private Builder(Context context) {
            this.f8206g = false;
            this.f8212m = null;
            this.f8216q = null;
            this.f8223x = true;
            this.f37176A = -1;
            this.f37177B = new C4904a.C4905b(this);
            this.f37178C = true;
            this.f37179D = new C12786b();
            this.f8205f = (Context) C13740j.m2834g(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.core.ImagePipelineConfig$a */
    /* loaded from: classes7.dex */
    public class C4902a implements Supplier<Boolean> {
        C4902a() {
        }

        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.facebook.imagepipeline.core.ImagePipelineConfig$b */
    /* loaded from: classes7.dex */
    public static class C4903b {

        /* renamed from: a */
        private boolean f8227a;

        /* synthetic */ C4903b(C4902a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean m31413a() {
            return this.f8227a;
        }

        private C4903b() {
            this.f8227a = false;
        }
    }

    /* synthetic */ ImagePipelineConfig(Builder builder, C4902a aVar) {
        this(builder);
    }

    /* renamed from: F */
    public static C4903b m31465F() {
        return f37167I;
    }

    /* renamed from: G */
    private static DiskCacheConfig m31464G(Context context) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return DiskCacheConfig.m32058m(context).m32043n();
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* renamed from: H */
    private static AbstractC3388d m31463H(Builder builder) {
        if (builder.f8211l != null && builder.f8212m != null) {
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        } else if (builder.f8211l != null) {
            return builder.f8211l;
        } else {
            return null;
        }
    }

    /* renamed from: I */
    private static int m31462I(Builder builder, C4904a aVar) {
        if (builder.f8216q != null) {
            return builder.f8216q.intValue();
        }
        if (aVar.m31403g() == 2 && Build.VERSION.SDK_INT >= 27) {
            return 2;
        }
        if (aVar.m31403g() == 1) {
            return 1;
        }
        aVar.m31403g();
        return 0;
    }

    /* renamed from: J */
    public static Builder m31461J(Context context) {
        return new Builder(context, null);
    }

    /* renamed from: K */
    private static void m31460K(AbstractC7012b bVar, C4904a aVar, AbstractC7011a aVar2) {
        C7014c.f15300d = bVar;
        aVar.m31396n();
        if (aVar2 != null) {
            bVar.mo23659a(aVar2);
        }
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: A */
    public AbstractC11557o mo6957A() {
        return this.f8184k;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: B */
    public AbstractC14531c mo6956B() {
        return this.f8190q;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: C */
    public AbstractC12782a mo6955C() {
        return null;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: D */
    public C4904a mo6954D() {
        return this.f37169B;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: E */
    public AbstractC12391e mo6953E() {
        return this.f8183j;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: a */
    public Set<AbstractC13937d> mo6952a() {
        return Collections.unmodifiableSet(this.f8198y);
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: b */
    public Supplier<Boolean> mo6951b() {
        return this.f8188o;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: c */
    public NetworkFetcher mo6950c() {
        return this.f8192s;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: d */
    public AbstractC11564s<CacheKey, AbstractC14535g> mo6949d() {
        return this.f37173F;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: e */
    public DiskCacheConfig mo6948e() {
        return this.f8189p;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: f */
    public Set<RequestListener> mo6947f() {
        return Collections.unmodifiableSet(this.f8197x);
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: g */
    public AbstractC11564s.AbstractC11565a mo6946g() {
        return this.f8176c;
    }

    @Override // p314r5.AbstractC12393g
    public Context getContext() {
        return this.f8179f;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: h */
    public AbstractC12964e mo6945h() {
        return this.f8196w;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: i */
    public DiskCacheConfig mo6944i() {
        return this.f37168A;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: j */
    public AbstractC11547i.AbstractC11549b<CacheKey> mo6943j() {
        return this.f8177d;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: k */
    public boolean mo6942k() {
        return this.f8180g;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: l */
    public AbstractExecutorServiceC13188f mo6941l() {
        return this.f37174G;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: m */
    public Integer mo6940m() {
        return this.f8187n;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: n */
    public AbstractC3388d mo6939n() {
        return this.f8186m;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: o */
    public C12963d mo6938o() {
        return null;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: p */
    public boolean mo6937p() {
        return this.f37170C;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: q */
    public Supplier<MemoryCacheParams> mo6936q() {
        return this.f8175b;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: r */
    public AbstractC12962c mo6935r() {
        return this.f8185l;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: s */
    public Supplier<MemoryCacheParams> mo6934s() {
        return this.f8182i;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: t */
    public C14256y mo6933t() {
        return this.f8195v;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: u */
    public int mo6932u() {
        return this.f8191r;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: v */
    public AbstractC12392f mo6931v() {
        return this.f8181h;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: w */
    public AbstractC12785a mo6930w() {
        return this.f37171D;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: x */
    public AbstractC11534a mo6929x() {
        return this.f37175H;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: y */
    public AbstractC11543f mo6928y() {
        return this.f8178e;
    }

    @Override // p314r5.AbstractC12393g
    /* renamed from: z */
    public boolean mo6927z() {
        return this.f8199z;
    }

    private ImagePipelineConfig(Builder builder) {
        Supplier<MemoryCacheParams> supplier;
        AbstractC11543f fVar;
        AbstractC11557o oVar;
        DiskCacheConfig diskCacheConfig;
        AbstractC14531c cVar;
        C14256y yVar;
        AbstractC7012b i;
        if (C1271b.m41491d()) {
            C1271b.m41494a("ImagePipelineConfig()");
        }
        C4904a s = builder.f37177B.m31365s();
        this.f37169B = s;
        if (builder.f8201b == null) {
            supplier = new C11550j((ActivityManager) C13740j.m2834g(builder.f8205f.getSystemService("activity")));
        } else {
            supplier = builder.f8201b;
        }
        this.f8175b = supplier;
        this.f8176c = builder.f8203d == null ? new C11536c() : builder.f8203d;
        this.f8177d = builder.f8202c;
        this.f8174a = builder.f8200a == null ? Bitmap.Config.ARGB_8888 : builder.f8200a;
        if (builder.f8204e == null) {
            fVar = C11551k.m9392f();
        } else {
            fVar = builder.f8204e;
        }
        this.f8178e = fVar;
        this.f8179f = (Context) C13740j.m2834g(builder.f8205f);
        this.f8181h = builder.f8225z == null ? new C12388b(new C12390d()) : builder.f8225z;
        this.f8180g = builder.f8206g;
        this.f8182i = builder.f8207h == null ? new C11552l() : builder.f8207h;
        if (builder.f8209j == null) {
            oVar = C11568v.m9335o();
        } else {
            oVar = builder.f8209j;
        }
        this.f8184k = oVar;
        this.f8185l = builder.f8210k;
        this.f8186m = m31463H(builder);
        this.f8187n = builder.f8212m;
        this.f8188o = builder.f8213n == null ? new C4902a() : builder.f8213n;
        if (builder.f8214o == null) {
            diskCacheConfig = m31464G(builder.f8205f);
        } else {
            diskCacheConfig = builder.f8214o;
        }
        this.f8189p = diskCacheConfig;
        if (builder.f8215p == null) {
            cVar = C14532d.m270b();
        } else {
            cVar = builder.f8215p;
        }
        this.f8190q = cVar;
        this.f8191r = m31462I(builder, s);
        int i2 = builder.f37176A < 0 ? 30000 : builder.f37176A;
        this.f8193t = i2;
        if (C1271b.m41491d()) {
            C1271b.m41494a("ImagePipelineConfig->mNetworkFetcher");
        }
        this.f8192s = builder.f8217r == null ? new C5037v(i2) : builder.f8217r;
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        this.f8194u = builder.f8218s;
        if (builder.f8219t == null) {
            yVar = new C14256y(C14253x.m1248n().m1235m());
        } else {
            yVar = builder.f8219t;
        }
        this.f8195v = yVar;
        this.f8196w = builder.f8220u == null ? new C12966g() : builder.f8220u;
        this.f8197x = builder.f8221v == null ? new HashSet<>() : builder.f8221v;
        this.f8198y = builder.f8222w == null ? new HashSet<>() : builder.f8222w;
        this.f8199z = builder.f8223x;
        this.f37168A = builder.f8224y != null ? builder.f8224y : diskCacheConfig;
        builder.getClass();
        this.f8183j = builder.f8208i == null ? new DefaultExecutorSupplier(yVar.m1229e()) : builder.f8208i;
        this.f37170C = builder.f37178C;
        builder.getClass();
        this.f37171D = builder.f37179D;
        this.f37172E = builder.f37180E;
        this.f37175H = builder.f37183H == null ? new C11544g() : builder.f37183H;
        this.f37173F = builder.f37181F;
        this.f37174G = builder.f37182G;
        AbstractC7012b m = s.m31397m();
        if (m != null) {
            m31460K(m, s, new C11200c(mo6933t()));
        } else if (s.m31385y() && C7014c.f15297a && (i = C7014c.m23649i()) != null) {
            m31460K(i, s, new C11200c(mo6933t()));
        }
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }
}
