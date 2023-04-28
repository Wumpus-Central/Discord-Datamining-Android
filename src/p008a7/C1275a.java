package p008a7;

import p008a7.AbstractC1284e;

/* renamed from: a7.a */
/* loaded from: classes7.dex */
final class C1275a extends AbstractC1284e {

    /* renamed from: b */
    private final long f144b;

    /* renamed from: c */
    private final int f145c;

    /* renamed from: d */
    private final int f146d;

    /* renamed from: e */
    private final long f147e;

    /* renamed from: f */
    private final int f148f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a7.a$b */
    /* loaded from: classes7.dex */
    public static final class C1276b extends AbstractC1284e.AbstractC1285a {

        /* renamed from: a */
        private Long f149a;

        /* renamed from: b */
        private Integer f150b;

        /* renamed from: c */
        private Integer f151c;

        /* renamed from: d */
        private Long f152d;

        /* renamed from: e */
        private Integer f153e;

        @Override // p008a7.AbstractC1284e.AbstractC1285a
        /* renamed from: a */
        AbstractC1284e mo41482a() {
            String str = "";
            if (this.f149a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f150b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f151c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f152d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f153e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C1275a(this.f149a.longValue(), this.f150b.intValue(), this.f151c.intValue(), this.f152d.longValue(), this.f153e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p008a7.AbstractC1284e.AbstractC1285a
        /* renamed from: b */
        AbstractC1284e.AbstractC1285a mo41481b(int i) {
            this.f151c = Integer.valueOf(i);
            return this;
        }

        @Override // p008a7.AbstractC1284e.AbstractC1285a
        /* renamed from: c */
        AbstractC1284e.AbstractC1285a mo41480c(long j) {
            this.f152d = Long.valueOf(j);
            return this;
        }

        @Override // p008a7.AbstractC1284e.AbstractC1285a
        /* renamed from: d */
        AbstractC1284e.AbstractC1285a mo41479d(int i) {
            this.f150b = Integer.valueOf(i);
            return this;
        }

        @Override // p008a7.AbstractC1284e.AbstractC1285a
        /* renamed from: e */
        AbstractC1284e.AbstractC1285a mo41478e(int i) {
            this.f153e = Integer.valueOf(i);
            return this;
        }

        @Override // p008a7.AbstractC1284e.AbstractC1285a
        /* renamed from: f */
        AbstractC1284e.AbstractC1285a mo41477f(long j) {
            this.f149a = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p008a7.AbstractC1284e
    /* renamed from: b */
    public int mo41487b() {
        return this.f146d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p008a7.AbstractC1284e
    /* renamed from: c */
    public long mo41486c() {
        return this.f147e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p008a7.AbstractC1284e
    /* renamed from: d */
    public int mo41485d() {
        return this.f145c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p008a7.AbstractC1284e
    /* renamed from: e */
    public int mo41484e() {
        return this.f148f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1284e)) {
            return false;
        }
        AbstractC1284e eVar = (AbstractC1284e) obj;
        if (this.f144b == eVar.mo41483f() && this.f145c == eVar.mo41485d() && this.f146d == eVar.mo41487b() && this.f147e == eVar.mo41486c() && this.f148f == eVar.mo41484e()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p008a7.AbstractC1284e
    /* renamed from: f */
    public long mo41483f() {
        return this.f144b;
    }

    public int hashCode() {
        long j = this.f144b;
        long j2 = this.f147e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f145c) * 1000003) ^ this.f146d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f148f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f144b + ", loadBatchSize=" + this.f145c + ", criticalSectionEnterTimeoutMs=" + this.f146d + ", eventCleanUpAge=" + this.f147e + ", maxBlobByteSizePerRow=" + this.f148f + "}";
    }

    private C1275a(long j, int i, int i2, long j2, int i3) {
        this.f144b = j;
        this.f145c = i;
        this.f146d = i2;
        this.f147e = j2;
        this.f148f = i3;
    }
}
