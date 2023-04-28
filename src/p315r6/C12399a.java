package p315r6;

import mc.AbstractC10585d;
import mc.AbstractC10586e;
import mc.C10582c;
import nc.AbstractC10774a;
import nc.AbstractC10775b;
import p284pc.C11609a;
import p381v6.C13439a;
import p381v6.C13440b;
import p381v6.C13442c;
import p381v6.C13445d;
import p381v6.C13447e;
import p381v6.C13449f;

/* renamed from: r6.a */
/* loaded from: classes7.dex */
public final class C12399a implements AbstractC10774a {

    /* renamed from: a */
    public static final AbstractC10774a f27901a = new C12399a();

    /* renamed from: r6.a$a */
    /* loaded from: classes7.dex */
    private static final class C0397a implements AbstractC10585d<C13439a> {

        /* renamed from: a */
        static final C0397a f27902a = new C0397a();

        /* renamed from: b */
        private static final C10582c f27903b = C10582c.m12800a("window").m12795b(C11609a.m9269b().m9268c(1).m9270a()).m12796a();

        /* renamed from: c */
        private static final C10582c f27904c = C10582c.m12800a("logSourceMetrics").m12795b(C11609a.m9269b().m9268c(2).m9270a()).m12796a();

        /* renamed from: d */
        private static final C10582c f27905d = C10582c.m12800a("globalMetrics").m12795b(C11609a.m9269b().m9268c(3).m9270a()).m12796a();

        /* renamed from: e */
        private static final C10582c f27906e = C10582c.m12800a("appNamespace").m12795b(C11609a.m9269b().m9268c(4).m9270a()).m12796a();

        private C0397a() {
        }

        /* renamed from: b */
        public void mo6853a(C13439a aVar, AbstractC10586e eVar) {
            eVar.mo9266a(f27903b, aVar.m3687d());
            eVar.mo9266a(f27904c, aVar.m3688c());
            eVar.mo9266a(f27905d, aVar.m3689b());
            eVar.mo9266a(f27906e, aVar.m3690a());
        }
    }

    /* renamed from: r6.a$b */
    /* loaded from: classes7.dex */
    private static final class C12400b implements AbstractC10585d<C13440b> {

        /* renamed from: a */
        static final C12400b f27907a = new C12400b();

        /* renamed from: b */
        private static final C10582c f27908b = C10582c.m12800a("storageMetrics").m12795b(C11609a.m9269b().m9268c(1).m9270a()).m12796a();

        private C12400b() {
        }

        /* renamed from: b */
        public void mo6853a(C13440b bVar, AbstractC10586e eVar) {
            eVar.mo9266a(f27908b, bVar.m3679a());
        }
    }

    /* renamed from: r6.a$c */
    /* loaded from: classes7.dex */
    private static final class C12401c implements AbstractC10585d<C13442c> {

        /* renamed from: a */
        static final C12401c f27909a = new C12401c();

        /* renamed from: b */
        private static final C10582c f27910b = C10582c.m12800a("eventsDroppedCount").m12795b(C11609a.m9269b().m9268c(1).m9270a()).m12796a();

        /* renamed from: c */
        private static final C10582c f27911c = C10582c.m12800a("reason").m12795b(C11609a.m9269b().m9268c(3).m9270a()).m12796a();

        private C12401c() {
        }

        /* renamed from: b */
        public void mo6853a(C13442c cVar, AbstractC10586e eVar) {
            eVar.mo9262e(f27910b, cVar.m3675a());
            eVar.mo9266a(f27911c, cVar.m3674b());
        }
    }

    /* renamed from: r6.a$d */
    /* loaded from: classes7.dex */
    private static final class C12402d implements AbstractC10585d<C13445d> {

        /* renamed from: a */
        static final C12402d f27912a = new C12402d();

        /* renamed from: b */
        private static final C10582c f27913b = C10582c.m12800a("logSource").m12795b(C11609a.m9269b().m9268c(1).m9270a()).m12796a();

        /* renamed from: c */
        private static final C10582c f27914c = C10582c.m12800a("logEventDropped").m12795b(C11609a.m9269b().m9268c(2).m9270a()).m12796a();

        private C12402d() {
        }

        /* renamed from: b */
        public void mo6853a(C13445d dVar, AbstractC10586e eVar) {
            eVar.mo9266a(f27913b, dVar.m3668b());
            eVar.mo9266a(f27914c, dVar.m3669a());
        }
    }

    /* renamed from: r6.a$e */
    /* loaded from: classes7.dex */
    private static final class C12403e implements AbstractC10585d<AbstractC12425l> {

        /* renamed from: a */
        static final C12403e f27915a = new C12403e();

        /* renamed from: b */
        private static final C10582c f27916b = C10582c.m12797d("clientMetrics");

        private C12403e() {
        }

        /* renamed from: b */
        public void mo6853a(AbstractC12425l lVar, AbstractC10586e eVar) {
            eVar.mo9266a(f27916b, lVar.m6816b());
        }
    }

    /* renamed from: r6.a$f */
    /* loaded from: classes7.dex */
    private static final class C12404f implements AbstractC10585d<C13447e> {

        /* renamed from: a */
        static final C12404f f27917a = new C12404f();

        /* renamed from: b */
        private static final C10582c f27918b = C10582c.m12800a("currentCacheSizeBytes").m12795b(C11609a.m9269b().m9268c(1).m9270a()).m12796a();

        /* renamed from: c */
        private static final C10582c f27919c = C10582c.m12800a("maxCacheSizeBytes").m12795b(C11609a.m9269b().m9268c(2).m9270a()).m12796a();

        private C12404f() {
        }

        /* renamed from: b */
        public void mo6853a(C13447e eVar, AbstractC10586e eVar2) {
            eVar2.mo9262e(f27918b, eVar.m3663a());
            eVar2.mo9262e(f27919c, eVar.m3662b());
        }
    }

    /* renamed from: r6.a$g */
    /* loaded from: classes7.dex */
    private static final class C12405g implements AbstractC10585d<C13449f> {

        /* renamed from: a */
        static final C12405g f27920a = new C12405g();

        /* renamed from: b */
        private static final C10582c f27921b = C10582c.m12800a("startMs").m12795b(C11609a.m9269b().m9268c(1).m9270a()).m12796a();

        /* renamed from: c */
        private static final C10582c f27922c = C10582c.m12800a("endMs").m12795b(C11609a.m9269b().m9268c(2).m9270a()).m12796a();

        private C12405g() {
        }

        /* renamed from: b */
        public void mo6853a(C13449f fVar, AbstractC10586e eVar) {
            eVar.mo9262e(f27921b, fVar.m3656b());
            eVar.mo9262e(f27922c, fVar.m3657a());
        }
    }

    private C12399a() {
    }

    @Override // nc.AbstractC10774a
    /* renamed from: a */
    public void mo6860a(AbstractC10775b<?> bVar) {
        bVar.mo9241a(AbstractC12425l.class, C12403e.f27915a);
        bVar.mo9241a(C13439a.class, C0397a.f27902a);
        bVar.mo9241a(C13449f.class, C12405g.f27920a);
        bVar.mo9241a(C13445d.class, C12402d.f27912a);
        bVar.mo9241a(C13442c.class, C12401c.f27909a);
        bVar.mo9241a(C13440b.class, C12400b.f27907a);
        bVar.mo9241a(C13447e.class, C12404f.f27917a);
    }
}
