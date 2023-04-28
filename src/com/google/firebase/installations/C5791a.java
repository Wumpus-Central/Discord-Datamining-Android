package com.google.firebase.installations;

import com.google.firebase.installations.AbstractC5801g;

/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes3.dex */
final class C5791a extends AbstractC5801g {

    /* renamed from: a */
    private final String f11462a;

    /* renamed from: b */
    private final long f11463b;

    /* renamed from: c */
    private final long f11464c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.a$b */
    /* loaded from: classes3.dex */
    public static final class C5792b extends AbstractC5801g.AbstractC5802a {

        /* renamed from: a */
        private String f11465a;

        /* renamed from: b */
        private Long f11466b;

        /* renamed from: c */
        private Long f11467c;

        @Override // com.google.firebase.installations.AbstractC5801g.AbstractC5802a
        /* renamed from: a */
        public AbstractC5801g mo27298a() {
            String str = "";
            if (this.f11465a == null) {
                str = str + " token";
            }
            if (this.f11466b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f11467c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C5791a(this.f11465a, this.f11466b.longValue(), this.f11467c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.AbstractC5801g.AbstractC5802a
        /* renamed from: b */
        public AbstractC5801g.AbstractC5802a mo27297b(String str) {
            if (str != null) {
                this.f11465a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.AbstractC5801g.AbstractC5802a
        /* renamed from: c */
        public AbstractC5801g.AbstractC5802a mo27296c(long j) {
            this.f11467c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC5801g.AbstractC5802a
        /* renamed from: d */
        public AbstractC5801g.AbstractC5802a mo27295d(long j) {
            this.f11466b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC5801g
    /* renamed from: b */
    public String mo27301b() {
        return this.f11462a;
    }

    @Override // com.google.firebase.installations.AbstractC5801g
    /* renamed from: c */
    public long mo27300c() {
        return this.f11464c;
    }

    @Override // com.google.firebase.installations.AbstractC5801g
    /* renamed from: d */
    public long mo27299d() {
        return this.f11463b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5801g)) {
            return false;
        }
        AbstractC5801g gVar = (AbstractC5801g) obj;
        if (this.f11462a.equals(gVar.mo27301b()) && this.f11463b == gVar.mo27299d() && this.f11464c == gVar.mo27300c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f11463b;
        long j2 = this.f11464c;
        return ((((this.f11462a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f11462a + ", tokenExpirationTimestamp=" + this.f11463b + ", tokenCreationTimestamp=" + this.f11464c + "}";
    }

    private C5791a(String str, long j, long j2) {
        this.f11462a = str;
        this.f11463b = j;
        this.f11464c = j2;
    }
}
