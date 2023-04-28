package p145i0;

import java.io.File;
import p145i0.C8178p;

/* renamed from: i0.f */
/* loaded from: classes.dex */
final class C8127f extends C8178p.AbstractC8180b {

    /* renamed from: a */
    private final File f17585a;

    /* renamed from: b */
    private final long f17586b;

    /* renamed from: i0.f$b */
    /* loaded from: classes.dex */
    static final class C8129b extends C8178p.AbstractC8180b.AbstractC8181a {

        /* renamed from: a */
        private File f17587a;

        /* renamed from: b */
        private Long f17588b;

        @Override // p145i0.C8178p.AbstractC8180b.AbstractC8181a
        /* renamed from: a */
        C8178p.AbstractC8180b mo20366a() {
            String str = "";
            if (this.f17587a == null) {
                str = str + " file";
            }
            if (this.f17588b == null) {
                str = str + " fileSizeLimit";
            }
            if (str.isEmpty()) {
                return new C8127f(this.f17587a, this.f17588b.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p145i0.C8178p.AbstractC8180b.AbstractC8181a
        /* renamed from: b */
        C8178p.AbstractC8180b.AbstractC8181a mo20365b(File file) {
            if (file != null) {
                this.f17587a = file;
                return this;
            }
            throw new NullPointerException("Null file");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public C8178p.AbstractC8180b.AbstractC8181a m20526c(long j) {
            this.f17588b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p145i0.C8178p.AbstractC8180b
    /* renamed from: a */
    File mo20368a() {
        return this.f17585a;
    }

    @Override // p145i0.C8178p.AbstractC8180b
    /* renamed from: b */
    long mo20367b() {
        return this.f17586b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8178p.AbstractC8180b)) {
            return false;
        }
        C8178p.AbstractC8180b bVar = (C8178p.AbstractC8180b) obj;
        if (!this.f17585a.equals(bVar.mo20368a()) || this.f17586b != bVar.mo20367b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f17586b;
        return ((this.f17585a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "FileOutputOptionsInternal{file=" + this.f17585a + ", fileSizeLimit=" + this.f17586b + "}";
    }

    private C8127f(File file, long j) {
        this.f17585a = file;
        this.f17586b = j;
    }
}
