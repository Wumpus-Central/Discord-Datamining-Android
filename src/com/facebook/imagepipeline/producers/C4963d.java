package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p314r5.AbstractC12393g;
import p380v5.EnumC13435f;
import p394w3.C13734g;

/* renamed from: com.facebook.imagepipeline.producers.d */
/* loaded from: classes7.dex */
public class C4963d implements ProducerContext {

    /* renamed from: o */
    public static final Set<String> f8405o = C13734g.m2850a("id", "uri_source");

    /* renamed from: a */
    private final ImageRequest f8406a;

    /* renamed from: b */
    private final String f8407b;

    /* renamed from: c */
    private final String f8408c;

    /* renamed from: d */
    private final AbstractC5011n0 f8409d;

    /* renamed from: e */
    private final Object f8410e;

    /* renamed from: f */
    private final ImageRequest.RequestLevel f8411f;

    /* renamed from: g */
    private final Map<String, Object> f8412g;

    /* renamed from: h */
    private boolean f8413h;

    /* renamed from: i */
    private Priority f8414i;

    /* renamed from: j */
    private boolean f8415j;

    /* renamed from: k */
    private boolean f8416k;

    /* renamed from: l */
    private final List<AbstractC5008m0> f8417l;

    /* renamed from: m */
    private final AbstractC12393g f8418m;

    /* renamed from: n */
    private EnumC13435f f8419n;

    public C4963d(ImageRequest imageRequest, String str, AbstractC5011n0 n0Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, AbstractC12393g gVar) {
        this(imageRequest, str, null, n0Var, obj, requestLevel, z, z2, priority, gVar);
    }

    /* renamed from: q */
    public static void m31154q(List<AbstractC5008m0> list) {
        if (list != null) {
            for (AbstractC5008m0 m0Var : list) {
                m0Var.mo30945b();
            }
        }
    }

    /* renamed from: r */
    public static void m31153r(List<AbstractC5008m0> list) {
        if (list != null) {
            for (AbstractC5008m0 m0Var : list) {
                m0Var.mo30969a();
            }
        }
    }

    /* renamed from: s */
    public static void m31152s(List<AbstractC5008m0> list) {
        if (list != null) {
            for (AbstractC5008m0 m0Var : list) {
                m0Var.mo31003d();
            }
        }
    }

    /* renamed from: t */
    public static void m31151t(List<AbstractC5008m0> list) {
        if (list != null) {
            for (AbstractC5008m0 m0Var : list) {
                m0Var.mo31004c();
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: a */
    public Object mo31170a() {
        return this.f8410e;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: b */
    public void mo31169b(String str, Object obj) {
        if (!f8405o.contains(str)) {
            this.f8412g.put(str, obj);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: c */
    public void mo31168c(AbstractC5008m0 m0Var) {
        boolean z;
        synchronized (this) {
            this.f8417l.add(m0Var);
            z = this.f8416k;
        }
        if (z) {
            m0Var.mo30945b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: d */
    public AbstractC12393g mo31167d() {
        return this.f8418m;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: e */
    public void mo31166e(String str, String str2) {
        this.f8412g.put("origin", str);
        this.f8412g.put("origin_sub", str2);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: f */
    public String mo31165f() {
        return this.f8408c;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: g */
    public void mo31164g(String str) {
        mo31166e(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public Map<String, Object> getExtras() {
        return this.f8412g;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public String getId() {
        return this.f8407b;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: h */
    public AbstractC5011n0 mo31163h() {
        return this.f8409d;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: i */
    public synchronized boolean mo31162i() {
        return this.f8415j;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: j */
    public synchronized Priority mo31161j() {
        return this.f8414i;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: k */
    public void mo31160k(EnumC13435f fVar) {
        this.f8419n = fVar;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: l */
    public ImageRequest mo31159l() {
        return this.f8406a;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: m */
    public void mo31158m(Map<String, ?> map) {
        if (map != null) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                mo31169b(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: n */
    public synchronized boolean mo31157n() {
        return this.f8413h;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: o */
    public <T> T mo31156o(String str) {
        return (T) this.f8412g.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: p */
    public ImageRequest.RequestLevel mo31155p() {
        return this.f8411f;
    }

    /* renamed from: u */
    public void m31150u() {
        m31154q(m31149v());
    }

    /* renamed from: v */
    public synchronized List<AbstractC5008m0> m31149v() {
        if (this.f8416k) {
            return null;
        }
        this.f8416k = true;
        return new ArrayList(this.f8417l);
    }

    /* renamed from: w */
    public synchronized List<AbstractC5008m0> m31148w(boolean z) {
        if (z == this.f8415j) {
            return null;
        }
        this.f8415j = z;
        return new ArrayList(this.f8417l);
    }

    /* renamed from: x */
    public synchronized List<AbstractC5008m0> m31147x(boolean z) {
        if (z == this.f8413h) {
            return null;
        }
        this.f8413h = z;
        return new ArrayList(this.f8417l);
    }

    /* renamed from: y */
    public synchronized List<AbstractC5008m0> m31146y(Priority priority) {
        if (priority == this.f8414i) {
            return null;
        }
        this.f8414i = priority;
        return new ArrayList(this.f8417l);
    }

    public C4963d(ImageRequest imageRequest, String str, String str2, AbstractC5011n0 n0Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, AbstractC12393g gVar) {
        this.f8419n = EnumC13435f.NOT_SET;
        this.f8406a = imageRequest;
        this.f8407b = str;
        HashMap hashMap = new HashMap();
        this.f8412g = hashMap;
        hashMap.put("id", str);
        hashMap.put("uri_source", imageRequest == null ? "null-request" : imageRequest.getSourceUri());
        this.f8408c = str2;
        this.f8409d = n0Var;
        this.f8410e = obj;
        this.f8411f = requestLevel;
        this.f8413h = z;
        this.f8414i = priority;
        this.f8415j = z2;
        this.f8416k = false;
        this.f8417l = new ArrayList();
        this.f8418m = gVar;
    }
}
