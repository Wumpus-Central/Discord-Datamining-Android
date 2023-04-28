package p381v6;

import p284pc.AbstractC11612d;

/* renamed from: v6.e */
/* loaded from: classes7.dex */
public final class C13447e {

    /* renamed from: c */
    private static final C13447e f30039c = new C13448a().m3660a();

    /* renamed from: a */
    private final long f30040a;

    /* renamed from: b */
    private final long f30041b;

    /* renamed from: v6.e$a */
    /* loaded from: classes7.dex */
    public static final class C13448a {

        /* renamed from: a */
        private long f30042a = 0;

        /* renamed from: b */
        private long f30043b = 0;

        C13448a() {
        }

        /* renamed from: a */
        public C13447e m3660a() {
            return new C13447e(this.f30042a, this.f30043b);
        }

        /* renamed from: b */
        public C13448a m3659b(long j) {
            this.f30042a = j;
            return this;
        }

        /* renamed from: c */
        public C13448a m3658c(long j) {
            this.f30043b = j;
            return this;
        }
    }

    C13447e(long j, long j2) {
        this.f30040a = j;
        this.f30041b = j2;
    }

    /* renamed from: c */
    public static C13448a m3661c() {
        return new C13448a();
    }

    @AbstractC11612d(tag = 1)
    /* renamed from: a */
    public long m3663a() {
        return this.f30040a;
    }

    @AbstractC11612d(tag = 2)
    /* renamed from: b */
    public long m3662b() {
        return this.f30041b;
    }
}
