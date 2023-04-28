package ad;

import com.google.firebase.messaging.AbstractC5832g0;
import p284pc.AbstractC11612d;

/* renamed from: ad.b */
/* loaded from: classes3.dex */
public final class C1364b {

    /* renamed from: b */
    private static final C1364b f350b = new C1365a().m41222a();

    /* renamed from: a */
    private final C1360a f351a;

    /* renamed from: ad.b$a */
    /* loaded from: classes3.dex */
    public static final class C1365a {

        /* renamed from: a */
        private C1360a f352a = null;

        C1365a() {
        }

        /* renamed from: a */
        public C1364b m41222a() {
            return new C1364b(this.f352a);
        }

        /* renamed from: b */
        public C1365a m41221b(C1360a aVar) {
            this.f352a = aVar;
            return this;
        }
    }

    C1364b(C1360a aVar) {
        this.f351a = aVar;
    }

    /* renamed from: b */
    public static C1365a m41224b() {
        return new C1365a();
    }

    @AbstractC11612d(tag = 1)
    /* renamed from: a */
    public C1360a m41225a() {
        return this.f351a;
    }

    /* renamed from: c */
    public byte[] m41223c() {
        return AbstractC5832g0.m27129a(this);
    }
}
