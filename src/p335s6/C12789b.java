package p335s6;

import p335s6.AbstractC12795g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s6.b */
/* loaded from: classes7.dex */
public final class C12789b extends AbstractC12795g {

    /* renamed from: a */
    private final AbstractC12795g.EnumC12796a f28713a;

    /* renamed from: b */
    private final long f28714b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12789b(AbstractC12795g.EnumC12796a aVar, long j) {
        if (aVar != null) {
            this.f28713a = aVar;
            this.f28714b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // p335s6.AbstractC12795g
    /* renamed from: b */
    public long mo5471b() {
        return this.f28714b;
    }

    @Override // p335s6.AbstractC12795g
    /* renamed from: c */
    public AbstractC12795g.EnumC12796a mo5470c() {
        return this.f28713a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12795g)) {
            return false;
        }
        AbstractC12795g gVar = (AbstractC12795g) obj;
        if (!this.f28713a.equals(gVar.mo5470c()) || this.f28714b != gVar.mo5471b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f28714b;
        return ((this.f28713a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f28713a + ", nextRequestWaitMillis=" + this.f28714b + "}";
    }
}
