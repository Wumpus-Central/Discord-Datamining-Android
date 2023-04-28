package p458z6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p008a7.AbstractC1280c;
import p008a7.AbstractC1282d;
import p008a7.AbstractC1300k;
import p027b7.AbstractC3394b;
import p027b7.C3393a;
import p040c7.AbstractC3770a;
import p279p6.C11572b;
import p315r6.AbstractC12420i;
import p315r6.AbstractC12430o;
import p315r6.C12419h;
import p335s6.AbstractC12792e;
import p335s6.AbstractC12793f;
import p335s6.AbstractC12795g;
import p335s6.AbstractC12803m;
import p381v6.C13439a;
import p381v6.C13442c;
import p397w6.C13750a;

/* renamed from: z6.r */
/* loaded from: classes7.dex */
public class C14569r {

    /* renamed from: a */
    private final Context f33019a;

    /* renamed from: b */
    private final AbstractC12792e f33020b;

    /* renamed from: c */
    private final AbstractC1282d f33021c;

    /* renamed from: d */
    private final AbstractC14575x f33022d;

    /* renamed from: e */
    private final Executor f33023e;

    /* renamed from: f */
    private final AbstractC3394b f33024f;

    /* renamed from: g */
    private final AbstractC3770a f33025g;

    /* renamed from: h */
    private final AbstractC3770a f33026h;

    /* renamed from: i */
    private final AbstractC1280c f33027i;

    public C14569r(Context context, AbstractC12792e eVar, AbstractC1282d dVar, AbstractC14575x xVar, Executor executor, AbstractC3394b bVar, AbstractC3770a aVar, AbstractC3770a aVar2, AbstractC1280c cVar) {
        this.f33019a = context;
        this.f33020b = eVar;
        this.f33021c = dVar;
        this.f33022d = xVar;
        this.f33023e = executor;
        this.f33024f = bVar;
        this.f33025g = aVar;
        this.f33026h = aVar2;
        this.f33027i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m210l(AbstractC12430o oVar) {
        return Boolean.valueOf(this.f33021c.mo41389q0(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m209m(AbstractC12430o oVar) {
        return this.f33021c.mo41448D0(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m208n(Iterable iterable, AbstractC12430o oVar, long j) {
        this.f33021c.mo41418Z(iterable);
        this.f33021c.mo41374y0(oVar, this.f33025g.mo33601a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m207o(Iterable iterable) {
        this.f33021c.mo41396m(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m206p() {
        this.f33027i.mo41415b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m205q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f33027i.mo41406g(((Integer) entry.getValue()).intValue(), C13442c.EnumC13444b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m204r(AbstractC12430o oVar, long j) {
        this.f33021c.mo41374y0(oVar, this.f33025g.mo33601a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m203s(AbstractC12430o oVar, int i) {
        this.f33022d.mo188a(oVar, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m202t(final AbstractC12430o oVar, final int i, Runnable runnable) {
        try {
            try {
                AbstractC3394b bVar = this.f33024f;
                final AbstractC1282d dVar = this.f33021c;
                Objects.requireNonNull(dVar);
                bVar.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.i
                    @Override // p027b7.AbstractC3394b.AbstractC3395a
                    public final Object execute() {
                        return Integer.valueOf(AbstractC1282d.this.mo41410e());
                    }
                });
                if (!m211k()) {
                    this.f33024f.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.j
                        @Override // p027b7.AbstractC3394b.AbstractC3395a
                        public final Object execute() {
                            Object s;
                            s = C14569r.this.m203s(oVar, i);
                            return s;
                        }
                    });
                } else {
                    m201u(oVar, i);
                }
            } catch (C3393a unused) {
                this.f33022d.mo188a(oVar, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC12420i m212j(AbstractC12803m mVar) {
        AbstractC3394b bVar = this.f33024f;
        final AbstractC1280c cVar = this.f33027i;
        Objects.requireNonNull(cVar);
        return mVar.mo5449a(AbstractC12420i.m6845a().mo6825i(this.f33025g.mo33601a()).mo6823k(this.f33026h.mo33601a()).mo6824j("GDT_CLIENT_METRICS").mo6826h(new C12419h(C11572b.m9324b("proto"), ((C13439a) bVar.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.h
            @Override // p027b7.AbstractC3394b.AbstractC3395a
            public final Object execute() {
                return AbstractC1280c.this.mo41403i();
            }
        })).m3685f())).mo6830d());
    }

    /* renamed from: k */
    boolean m211k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f33019a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    void m201u(final AbstractC12430o oVar, int i) {
        AbstractC12795g gVar;
        AbstractC12803m a = this.f33020b.mo5457a(oVar.mo6801b());
        final long j = 0;
        while (true) {
            while (((Boolean) this.f33024f.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.k
                @Override // p027b7.AbstractC3394b.AbstractC3395a
                public final Object execute() {
                    Boolean l;
                    l = C14569r.this.m210l(oVar);
                    return l;
                }
            })).booleanValue()) {
                final Iterable<AbstractC1300k> iterable = (Iterable) this.f33024f.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.l
                    @Override // p027b7.AbstractC3394b.AbstractC3395a
                    public final Object execute() {
                        Iterable m;
                        m = C14569r.this.m209m(oVar);
                        return m;
                    }
                });
                if (iterable.iterator().hasNext()) {
                    if (a == null) {
                        C13750a.m2814a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                        gVar = AbstractC12795g.m5472a();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (AbstractC1300k kVar : iterable) {
                            arrayList.add(kVar.mo41456b());
                        }
                        if (oVar.m6798e()) {
                            arrayList.add(m212j(a));
                        }
                        gVar = a.mo5448b(AbstractC12793f.m5478a().mo5474b(arrayList).mo5473c(oVar.mo6800c()).mo5475a());
                    }
                    if (gVar.mo5470c() == AbstractC12795g.EnumC12796a.TRANSIENT_ERROR) {
                        this.f33024f.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.m
                            @Override // p027b7.AbstractC3394b.AbstractC3395a
                            public final Object execute() {
                                Object n;
                                n = C14569r.this.m208n(iterable, oVar, j);
                                return n;
                            }
                        });
                        this.f33022d.mo187b(oVar, i + 1, true);
                        return;
                    }
                    this.f33024f.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.n
                        @Override // p027b7.AbstractC3394b.AbstractC3395a
                        public final Object execute() {
                            Object o;
                            o = C14569r.this.m207o(iterable);
                            return o;
                        }
                    });
                    if (gVar.mo5470c() == AbstractC12795g.EnumC12796a.OK) {
                        j = Math.max(j, gVar.mo5471b());
                        if (oVar.m6798e()) {
                            this.f33024f.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.o
                                @Override // p027b7.AbstractC3394b.AbstractC3395a
                                public final Object execute() {
                                    Object p;
                                    p = C14569r.this.m206p();
                                    return p;
                                }
                            });
                        }
                    } else if (gVar.mo5470c() == AbstractC12795g.EnumC12796a.INVALID_PAYLOAD) {
                        final HashMap hashMap = new HashMap();
                        for (AbstractC1300k kVar2 : iterable) {
                            String j2 = kVar2.mo41456b().mo6836j();
                            if (!hashMap.containsKey(j2)) {
                                hashMap.put(j2, 1);
                            } else {
                                hashMap.put(j2, Integer.valueOf(((Integer) hashMap.get(j2)).intValue() + 1));
                            }
                        }
                        this.f33024f.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.p
                            @Override // p027b7.AbstractC3394b.AbstractC3395a
                            public final Object execute() {
                                Object q;
                                q = C14569r.this.m205q(hashMap);
                                return q;
                            }
                        });
                    }
                } else {
                    return;
                }
            }
            this.f33024f.mo34521h(new AbstractC3394b.AbstractC3395a() { // from class: z6.q
                @Override // p027b7.AbstractC3394b.AbstractC3395a
                public final Object execute() {
                    Object r;
                    r = C14569r.this.m204r(oVar, j);
                    return r;
                }
            });
            return;
        }
    }

    /* renamed from: v */
    public void m200v(final AbstractC12430o oVar, final int i, final Runnable runnable) {
        this.f33023e.execute(new Runnable() { // from class: z6.g
            @Override // java.lang.Runnable
            public final void run() {
                C14569r.this.m202t(oVar, i, runnable);
            }
        });
    }
}
