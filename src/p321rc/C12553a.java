package p321rc;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rc.a */
/* loaded from: classes3.dex */
public final class C12553a extends AbstractC12567m {

    /* renamed from: a */
    private final String f28237a;

    /* renamed from: b */
    private final List<String> f28238b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12553a(String str, List<String> list) {
        if (str != null) {
            this.f28237a = str;
            if (list != null) {
                this.f28238b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // p321rc.AbstractC12567m
    /* renamed from: b */
    public List<String> mo6534b() {
        return this.f28238b;
    }

    @Override // p321rc.AbstractC12567m
    /* renamed from: c */
    public String mo6533c() {
        return this.f28237a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12567m)) {
            return false;
        }
        AbstractC12567m mVar = (AbstractC12567m) obj;
        if (!this.f28237a.equals(mVar.mo6533c()) || !this.f28238b.equals(mVar.mo6534b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f28237a.hashCode() ^ 1000003) * 1000003) ^ this.f28238b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f28237a + ", usedDates=" + this.f28238b + "}";
    }
}
