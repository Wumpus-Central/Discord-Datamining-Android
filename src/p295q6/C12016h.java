package p295q6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.h */
/* loaded from: classes7.dex */
public final class C12016h extends AbstractC12028n {

    /* renamed from: a */
    private final long f26949a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12016h(long j) {
        this.f26949a = j;
    }

    @Override // p295q6.AbstractC12028n
    /* renamed from: c */
    public long mo7961c() {
        return this.f26949a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12028n) || this.f26949a != ((AbstractC12028n) obj).mo7961c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f26949a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f26949a + "}";
    }
}
