package p381v6;

import p284pc.AbstractC11611c;
import p284pc.AbstractC11612d;

/* renamed from: v6.c */
/* loaded from: classes7.dex */
public final class C13442c {

    /* renamed from: c */
    private static final C13442c f30020c = new C13443a().m3672a();

    /* renamed from: a */
    private final long f30021a;

    /* renamed from: b */
    private final EnumC13444b f30022b;

    /* renamed from: v6.c$a */
    /* loaded from: classes7.dex */
    public static final class C13443a {

        /* renamed from: a */
        private long f30023a = 0;

        /* renamed from: b */
        private EnumC13444b f30024b = EnumC13444b.REASON_UNKNOWN;

        C13443a() {
        }

        /* renamed from: a */
        public C13442c m3672a() {
            return new C13442c(this.f30023a, this.f30024b);
        }

        /* renamed from: b */
        public C13443a m3671b(long j) {
            this.f30023a = j;
            return this;
        }

        /* renamed from: c */
        public C13443a m3670c(EnumC13444b bVar) {
            this.f30024b = bVar;
            return this;
        }
    }

    /* renamed from: v6.c$b */
    /* loaded from: classes7.dex */
    public enum EnumC13444b implements AbstractC11611c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: k */
        private final int f30033k;

        EnumC13444b(int i) {
            this.f30033k = i;
        }

        @Override // p284pc.AbstractC11611c
        public int getNumber() {
            return this.f30033k;
        }
    }

    C13442c(long j, EnumC13444b bVar) {
        this.f30021a = j;
        this.f30022b = bVar;
    }

    /* renamed from: c */
    public static C13443a m3673c() {
        return new C13443a();
    }

    @AbstractC11612d(tag = 1)
    /* renamed from: a */
    public long m3675a() {
        return this.f30021a;
    }

    @AbstractC11612d(tag = 3)
    /* renamed from: b */
    public EnumC13444b m3674b() {
        return this.f30022b;
    }
}
