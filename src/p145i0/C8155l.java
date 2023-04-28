package p145i0;

import p145i0.AbstractC8205z0;

/* renamed from: i0.l */
/* loaded from: classes.dex */
final class C8155l extends AbstractC8205z0 {

    /* renamed from: d */
    private final Integer f17630d;

    /* renamed from: e */
    private final AbstractC8205z0.EnumC8206a f17631e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8155l(Integer num, AbstractC8205z0.EnumC8206a aVar) {
        if (num != null) {
            this.f17630d = num;
            if (aVar != null) {
                this.f17631e = aVar;
                return;
            }
            throw new NullPointerException("Null streamState");
        }
        throw new NullPointerException("Null id");
    }

    @Override // p145i0.AbstractC8205z0
    /* renamed from: a */
    public Integer mo20309a() {
        return this.f17630d;
    }

    @Override // p145i0.AbstractC8205z0
    /* renamed from: b */
    public AbstractC8205z0.EnumC8206a mo20308b() {
        return this.f17631e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8205z0)) {
            return false;
        }
        AbstractC8205z0 z0Var = (AbstractC8205z0) obj;
        if (!this.f17630d.equals(z0Var.mo20309a()) || !this.f17631e.equals(z0Var.mo20308b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f17630d.hashCode() ^ 1000003) * 1000003) ^ this.f17631e.hashCode();
    }

    public String toString() {
        return "StreamInfo{id=" + this.f17630d + ", streamState=" + this.f17631e + "}";
    }
}
