package p381v6;

import p284pc.AbstractC11612d;

/* renamed from: v6.f */
/* loaded from: classes7.dex */
public final class C13449f {

    /* renamed from: c */
    private static final C13449f f30044c = new C13450a().m3654a();

    /* renamed from: a */
    private final long f30045a;

    /* renamed from: b */
    private final long f30046b;

    /* renamed from: v6.f$a */
    /* loaded from: classes7.dex */
    public static final class C13450a {

        /* renamed from: a */
        private long f30047a = 0;

        /* renamed from: b */
        private long f30048b = 0;

        C13450a() {
        }

        /* renamed from: a */
        public C13449f m3654a() {
            return new C13449f(this.f30047a, this.f30048b);
        }

        /* renamed from: b */
        public C13450a m3653b(long j) {
            this.f30048b = j;
            return this;
        }

        /* renamed from: c */
        public C13450a m3652c(long j) {
            this.f30047a = j;
            return this;
        }
    }

    C13449f(long j, long j2) {
        this.f30045a = j;
        this.f30046b = j2;
    }

    /* renamed from: c */
    public static C13450a m3655c() {
        return new C13450a();
    }

    @AbstractC11612d(tag = 2)
    /* renamed from: a */
    public long m3657a() {
        return this.f30046b;
    }

    @AbstractC11612d(tag = 1)
    /* renamed from: b */
    public long m3656b() {
        return this.f30045a;
    }
}
