package p145i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i0.d */
/* loaded from: classes.dex */
public final class C8121d extends AbstractC8108b {

    /* renamed from: b */
    private final int f17573b;

    /* renamed from: c */
    private final Throwable f17574c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8121d(int i, Throwable th2) {
        this.f17573b = i;
        this.f17574c = th2;
    }

    @Override // p145i0.AbstractC8108b
    /* renamed from: a */
    public int mo20529a() {
        return this.f17573b;
    }

    @Override // p145i0.AbstractC8108b
    /* renamed from: b */
    public Throwable mo20528b() {
        return this.f17574c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8108b)) {
            return false;
        }
        AbstractC8108b bVar = (AbstractC8108b) obj;
        if (this.f17573b == bVar.mo20529a()) {
            Throwable th2 = this.f17574c;
            if (th2 == null) {
                if (bVar.mo20528b() == null) {
                    return true;
                }
            } else if (th2.equals(bVar.mo20528b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (this.f17573b ^ 1000003) * 1000003;
        Throwable th2 = this.f17574c;
        if (th2 == null) {
            i = 0;
        } else {
            i = th2.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f17573b + ", errorCause=" + this.f17574c + "}";
    }
}
