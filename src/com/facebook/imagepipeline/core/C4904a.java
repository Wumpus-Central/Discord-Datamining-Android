package com.facebook.imagepipeline.core;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import p095f4.AbstractC7012b;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11564s;
import p278p5.C11538e;
import p314r5.AbstractC12391e;
import p314r5.C12387a;
import p314r5.C12397j;
import p346t5.AbstractC12962c;
import p346t5.AbstractC12964e;
import p380v5.AbstractC13432c;
import p394w3.C13743m;
import p455z3.AbstractC14529a;
import p455z3.AbstractC14535g;
import p455z3.AbstractC14537h;
import p455z3.C14540k;

/* renamed from: com.facebook.imagepipeline.core.a */
/* loaded from: classes7.dex */
public class C4904a {

    /* renamed from: A */
    private final boolean f37184A;

    /* renamed from: B */
    private final boolean f37185B;

    /* renamed from: a */
    private final boolean f8228a;

    /* renamed from: b */
    private final boolean f8229b;

    /* renamed from: c */
    private final AbstractC7012b f8230c;

    /* renamed from: d */
    private final boolean f8231d;

    /* renamed from: e */
    private final boolean f8232e;

    /* renamed from: f */
    private final int f8233f;

    /* renamed from: g */
    private final int f8234g;

    /* renamed from: h */
    private boolean f8235h;

    /* renamed from: i */
    private final int f8236i;

    /* renamed from: j */
    private final boolean f8237j;

    /* renamed from: k */
    private final boolean f8238k;

    /* renamed from: l */
    private final AbstractC4907d f8239l;

    /* renamed from: m */
    private final Supplier<Boolean> f8240m;

    /* renamed from: n */
    private final boolean f8241n;

    /* renamed from: o */
    private final boolean f8242o;

    /* renamed from: p */
    private final int f8243p;

    /* renamed from: q */
    private final Supplier<Boolean> f8244q;

    /* renamed from: r */
    private final boolean f8245r;

    /* renamed from: s */
    private final long f8246s;

    /* renamed from: t */
    private boolean f8247t;

    /* renamed from: u */
    private boolean f8248u;

    /* renamed from: v */
    private boolean f8249v;

    /* renamed from: w */
    private final boolean f8250w;

    /* renamed from: x */
    private final boolean f8251x;

    /* renamed from: y */
    private final boolean f8252y;

    /* renamed from: z */
    private final int f8253z;

    /* renamed from: com.facebook.imagepipeline.core.a$b */
    /* loaded from: classes7.dex */
    public static class C4905b {

        /* renamed from: a */
        private final ImagePipelineConfig.Builder f8254a;

        /* renamed from: d */
        private AbstractC7012b f8257d;

        /* renamed from: m */
        private AbstractC4907d f8266m;

        /* renamed from: n */
        public Supplier<Boolean> f8267n;

        /* renamed from: o */
        public boolean f8268o;

        /* renamed from: p */
        public boolean f8269p;

        /* renamed from: q */
        public int f8270q;

        /* renamed from: s */
        public boolean f8272s;

        /* renamed from: u */
        private boolean f8274u;

        /* renamed from: v */
        public boolean f8275v;

        /* renamed from: b */
        private boolean f8255b = false;

        /* renamed from: c */
        private boolean f8256c = false;

        /* renamed from: e */
        private boolean f8258e = false;

        /* renamed from: f */
        private boolean f8259f = false;

        /* renamed from: g */
        private int f8260g = 0;

        /* renamed from: h */
        private int f8261h = 0;

        /* renamed from: i */
        public boolean f8262i = false;

        /* renamed from: j */
        private int f8263j = RecyclerView.ItemAnimator.FLAG_MOVED;

        /* renamed from: k */
        private boolean f8264k = false;

        /* renamed from: l */
        private boolean f8265l = false;

        /* renamed from: r */
        public Supplier<Boolean> f8271r = C13743m.m2826a(Boolean.FALSE);

        /* renamed from: t */
        public long f8273t = 0;

        /* renamed from: w */
        public boolean f8276w = true;

        /* renamed from: x */
        public boolean f8277x = true;

        /* renamed from: y */
        private boolean f8278y = false;

        /* renamed from: z */
        private boolean f8279z = false;

        /* renamed from: A */
        private int f37186A = 20;

        /* renamed from: B */
        private boolean f37187B = false;

        /* renamed from: C */
        private boolean f37188C = false;

        public C4905b(ImagePipelineConfig.Builder builder) {
            this.f8254a = builder;
        }

        /* renamed from: s */
        public C4904a m31365s() {
            return new C4904a(this);
        }

        /* renamed from: t */
        public ImagePipelineConfig.Builder m31364t(boolean z) {
            this.f8269p = z;
            return this.f8254a;
        }
    }

    /* renamed from: com.facebook.imagepipeline.core.a$c */
    /* loaded from: classes7.dex */
    public static class C4906c implements AbstractC4907d {
        @Override // com.facebook.imagepipeline.core.C4904a.AbstractC4907d
        /* renamed from: a */
        public C12397j mo31363a(Context context, AbstractC14529a aVar, AbstractC12962c cVar, AbstractC12964e eVar, boolean z, boolean z2, boolean z3, AbstractC12391e eVar2, AbstractC14537h hVar, C14540k kVar, AbstractC11564s<CacheKey, AbstractC13432c> sVar, AbstractC11564s<CacheKey, AbstractC14535g> sVar2, C11538e eVar3, C11538e eVar4, AbstractC11543f fVar, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4, int i3, C12387a aVar2, boolean z5, int i4) {
            return new C12397j(context, aVar, cVar, eVar, z, z2, z3, eVar2, hVar, sVar, sVar2, eVar3, eVar4, fVar, platformBitmapFactory, i, i2, z4, i3, aVar2, z5, i4);
        }
    }

    /* renamed from: com.facebook.imagepipeline.core.a$d */
    /* loaded from: classes7.dex */
    public interface AbstractC4907d {
        /* renamed from: a */
        C12397j mo31363a(Context context, AbstractC14529a aVar, AbstractC12962c cVar, AbstractC12964e eVar, boolean z, boolean z2, boolean z3, AbstractC12391e eVar2, AbstractC14537h hVar, C14540k kVar, AbstractC11564s<CacheKey, AbstractC13432c> sVar, AbstractC11564s<CacheKey, AbstractC14535g> sVar2, C11538e eVar3, C11538e eVar4, AbstractC11543f fVar, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4, int i3, C12387a aVar2, boolean z5, int i4);
    }

    /* renamed from: A */
    public boolean m31412A() {
        return this.f8242o;
    }

    /* renamed from: B */
    public boolean m31411B() {
        return this.f8247t;
    }

    /* renamed from: C */
    public boolean m31410C() {
        return this.f37184A;
    }

    /* renamed from: a */
    public boolean m31409a() {
        return this.f37185B;
    }

    /* renamed from: b */
    public int m31408b() {
        return this.f8243p;
    }

    /* renamed from: c */
    public boolean m31407c() {
        return this.f8235h;
    }

    /* renamed from: d */
    public int m31406d() {
        return this.f8234g;
    }

    /* renamed from: e */
    public int m31405e() {
        return this.f8233f;
    }

    /* renamed from: f */
    public int m31404f() {
        return this.f8236i;
    }

    /* renamed from: g */
    public long m31403g() {
        return this.f8246s;
    }

    /* renamed from: h */
    public AbstractC4907d m31402h() {
        return this.f8239l;
    }

    /* renamed from: i */
    public Supplier<Boolean> m31401i() {
        return this.f8244q;
    }

    /* renamed from: j */
    public int m31400j() {
        return this.f8253z;
    }

    /* renamed from: k */
    public boolean m31399k() {
        return this.f8232e;
    }

    /* renamed from: l */
    public boolean m31398l() {
        return this.f8231d;
    }

    /* renamed from: m */
    public AbstractC7012b m31397m() {
        return this.f8230c;
    }

    /* renamed from: n */
    public AbstractC7012b.AbstractC7013a m31396n() {
        return null;
    }

    /* renamed from: o */
    public boolean m31395o() {
        return this.f8229b;
    }

    /* renamed from: p */
    public boolean m31394p() {
        return this.f8252y;
    }

    /* renamed from: q */
    public boolean m31393q() {
        return this.f8249v;
    }

    /* renamed from: r */
    public boolean m31392r() {
        return this.f8251x;
    }

    /* renamed from: s */
    public boolean m31391s() {
        return this.f8250w;
    }

    /* renamed from: t */
    public boolean m31390t() {
        return this.f8245r;
    }

    /* renamed from: u */
    public boolean m31389u() {
        return this.f8241n;
    }

    /* renamed from: v */
    public Supplier<Boolean> m31388v() {
        return this.f8240m;
    }

    /* renamed from: w */
    public boolean m31387w() {
        return this.f8237j;
    }

    /* renamed from: x */
    public boolean m31386x() {
        return this.f8238k;
    }

    /* renamed from: y */
    public boolean m31385y() {
        return this.f8228a;
    }

    /* renamed from: z */
    public boolean m31384z() {
        return this.f8248u;
    }

    private C4904a(C4905b bVar) {
        this.f8228a = bVar.f8255b;
        bVar.getClass();
        this.f8229b = bVar.f8256c;
        this.f8230c = bVar.f8257d;
        this.f8231d = bVar.f8258e;
        this.f8232e = bVar.f8259f;
        this.f8233f = bVar.f8260g;
        this.f8234g = bVar.f8261h;
        this.f8235h = bVar.f8262i;
        this.f8236i = bVar.f8263j;
        this.f8237j = bVar.f8264k;
        this.f8238k = bVar.f8265l;
        if (bVar.f8266m == null) {
            this.f8239l = new C4906c();
        } else {
            this.f8239l = bVar.f8266m;
        }
        this.f8240m = bVar.f8267n;
        this.f8241n = bVar.f8268o;
        this.f8242o = bVar.f8269p;
        this.f8243p = bVar.f8270q;
        this.f8244q = bVar.f8271r;
        this.f8245r = bVar.f8272s;
        this.f8246s = bVar.f8273t;
        this.f8247t = bVar.f8274u;
        this.f8248u = bVar.f8275v;
        this.f8249v = bVar.f8276w;
        this.f8250w = bVar.f8277x;
        this.f8251x = bVar.f8278y;
        this.f8252y = bVar.f8279z;
        this.f8253z = bVar.f37186A;
        this.f37184A = bVar.f37187B;
        this.f37185B = bVar.f37188C;
    }
}
