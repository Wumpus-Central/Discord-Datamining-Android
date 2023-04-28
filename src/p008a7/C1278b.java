package p008a7;

import p315r6.AbstractC12420i;
import p315r6.AbstractC12430o;

/* renamed from: a7.b */
/* loaded from: classes7.dex */
final class C1278b extends AbstractC1300k {

    /* renamed from: a */
    private final long f154a;

    /* renamed from: b */
    private final AbstractC12430o f155b;

    /* renamed from: c */
    private final AbstractC12420i f156c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1278b(long j, AbstractC12430o oVar, AbstractC12420i iVar) {
        this.f154a = j;
        if (oVar != null) {
            this.f155b = oVar;
            if (iVar != null) {
                this.f156c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // p008a7.AbstractC1300k
    /* renamed from: b */
    public AbstractC12420i mo41456b() {
        return this.f156c;
    }

    @Override // p008a7.AbstractC1300k
    /* renamed from: c */
    public long mo41455c() {
        return this.f154a;
    }

    @Override // p008a7.AbstractC1300k
    /* renamed from: d */
    public AbstractC12430o mo41454d() {
        return this.f155b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1300k)) {
            return false;
        }
        AbstractC1300k kVar = (AbstractC1300k) obj;
        if (this.f154a != kVar.mo41455c() || !this.f155b.equals(kVar.mo41454d()) || !this.f156c.equals(kVar.mo41456b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f154a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f155b.hashCode()) * 1000003) ^ this.f156c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f154a + ", transportContext=" + this.f155b + ", event=" + this.f156c + "}";
    }
}
