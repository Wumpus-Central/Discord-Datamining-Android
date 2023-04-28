package p295q6;

import java.util.List;

/* renamed from: q6.d */
/* loaded from: classes7.dex */
final class C12006d extends AbstractC12020j {

    /* renamed from: a */
    private final List<AbstractC12026m> f26916a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12006d(List<AbstractC12026m> list) {
        if (list != null) {
            this.f26916a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // p295q6.AbstractC12020j
    /* renamed from: c */
    public List<AbstractC12026m> mo8006c() {
        return this.f26916a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12020j) {
            return this.f26916a.equals(((AbstractC12020j) obj).mo8006c());
        }
        return false;
    }

    public int hashCode() {
        return this.f26916a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f26916a + "}";
    }
}
