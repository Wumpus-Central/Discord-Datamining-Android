package com.google.firebase.messaging;

import ad.C1360a;
import ad.C1364b;
import mc.AbstractC10585d;
import mc.AbstractC10586e;
import mc.C10582c;
import nc.AbstractC10774a;
import nc.AbstractC10775b;
import p284pc.C11609a;

/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes3.dex */
public final class C5807a implements AbstractC10774a {

    /* renamed from: a */
    public static final AbstractC10774a f11524a = new C5807a();

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes3.dex */
    private static final class C0167a implements AbstractC10585d<C1360a> {

        /* renamed from: a */
        static final C0167a f11525a = new C0167a();

        /* renamed from: b */
        private static final C10582c f11526b = C10582c.m12800a("projectNumber").m12795b(C11609a.m9269b().m9268c(1).m9270a()).m12796a();

        /* renamed from: c */
        private static final C10582c f11527c = C10582c.m12800a("messageId").m12795b(C11609a.m9269b().m9268c(2).m9270a()).m12796a();

        /* renamed from: d */
        private static final C10582c f11528d = C10582c.m12800a("instanceId").m12795b(C11609a.m9269b().m9268c(3).m9270a()).m12796a();

        /* renamed from: e */
        private static final C10582c f11529e = C10582c.m12800a("messageType").m12795b(C11609a.m9269b().m9268c(4).m9270a()).m12796a();

        /* renamed from: f */
        private static final C10582c f11530f = C10582c.m12800a("sdkPlatform").m12795b(C11609a.m9269b().m9268c(5).m9270a()).m12796a();

        /* renamed from: g */
        private static final C10582c f11531g = C10582c.m12800a("packageName").m12795b(C11609a.m9269b().m9268c(6).m9270a()).m12796a();

        /* renamed from: h */
        private static final C10582c f11532h = C10582c.m12800a("collapseKey").m12795b(C11609a.m9269b().m9268c(7).m9270a()).m12796a();

        /* renamed from: i */
        private static final C10582c f11533i = C10582c.m12800a("priority").m12795b(C11609a.m9269b().m9268c(8).m9270a()).m12796a();

        /* renamed from: j */
        private static final C10582c f11534j = C10582c.m12800a("ttl").m12795b(C11609a.m9269b().m9268c(9).m9270a()).m12796a();

        /* renamed from: k */
        private static final C10582c f11535k = C10582c.m12800a("topic").m12795b(C11609a.m9269b().m9268c(10).m9270a()).m12796a();

        /* renamed from: l */
        private static final C10582c f11536l = C10582c.m12800a("bulkId").m12795b(C11609a.m9269b().m9268c(11).m9270a()).m12796a();

        /* renamed from: m */
        private static final C10582c f11537m = C10582c.m12800a("event").m12795b(C11609a.m9269b().m9268c(12).m9270a()).m12796a();

        /* renamed from: n */
        private static final C10582c f11538n = C10582c.m12800a("analyticsLabel").m12795b(C11609a.m9269b().m9268c(13).m9270a()).m12796a();

        /* renamed from: o */
        private static final C10582c f11539o = C10582c.m12800a("campaignId").m12795b(C11609a.m9269b().m9268c(14).m9270a()).m12796a();

        /* renamed from: p */
        private static final C10582c f11540p = C10582c.m12800a("composerLabel").m12795b(C11609a.m9269b().m9268c(15).m9270a()).m12796a();

        private C0167a() {
        }

        /* renamed from: b */
        public void mo6853a(C1360a aVar, AbstractC10586e eVar) {
            eVar.mo9262e(f11526b, aVar.m41243l());
            eVar.mo9266a(f11527c, aVar.m41247h());
            eVar.mo9266a(f11528d, aVar.m41248g());
            eVar.mo9266a(f11529e, aVar.m41246i());
            eVar.mo9266a(f11530f, aVar.m41242m());
            eVar.mo9266a(f11531g, aVar.m41245j());
            eVar.mo9266a(f11532h, aVar.m41251d());
            eVar.mo9263d(f11533i, aVar.m41244k());
            eVar.mo9263d(f11534j, aVar.m41240o());
            eVar.mo9266a(f11535k, aVar.m41241n());
            eVar.mo9262e(f11536l, aVar.m41253b());
            eVar.mo9266a(f11537m, aVar.m41249f());
            eVar.mo9266a(f11538n, aVar.m41254a());
            eVar.mo9262e(f11539o, aVar.m41252c());
            eVar.mo9266a(f11540p, aVar.m41250e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: classes3.dex */
    private static final class C5808b implements AbstractC10585d<C1364b> {

        /* renamed from: a */
        static final C5808b f11541a = new C5808b();

        /* renamed from: b */
        private static final C10582c f11542b = C10582c.m12800a("messagingClientEvent").m12795b(C11609a.m9269b().m9268c(1).m9270a()).m12796a();

        private C5808b() {
        }

        /* renamed from: b */
        public void mo6853a(C1364b bVar, AbstractC10586e eVar) {
            eVar.mo9266a(f11542b, bVar.m41225a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: classes3.dex */
    private static final class C5809c implements AbstractC10585d<AbstractC5832g0> {

        /* renamed from: a */
        static final C5809c f11543a = new C5809c();

        /* renamed from: b */
        private static final C10582c f11544b = C10582c.m12797d("messagingClientEventExtension");

        private C5809c() {
        }

        /* renamed from: b */
        public void mo6853a(AbstractC5832g0 g0Var, AbstractC10586e eVar) {
            eVar.mo9266a(f11544b, g0Var.m27128b());
        }
    }

    private C5807a() {
    }

    @Override // nc.AbstractC10774a
    /* renamed from: a */
    public void mo6860a(AbstractC10775b<?> bVar) {
        bVar.mo9241a(AbstractC5832g0.class, C5809c.f11543a);
        bVar.mo9241a(C1364b.class, C5808b.f11541a);
        bVar.mo9241a(C1360a.class, C0167a.f11525a);
    }
}
