package p145i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i0.k */
/* loaded from: classes.dex */
public final class C8153k extends AbstractC8203y0 {

    /* renamed from: a */
    private final long f17625a;

    /* renamed from: b */
    private final long f17626b;

    /* renamed from: c */
    private final AbstractC8108b f17627c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8153k(long j, long j2, AbstractC8108b bVar) {
        this.f17625a = j;
        this.f17626b = j2;
        if (bVar != null) {
            this.f17627c = bVar;
            return;
        }
        throw new NullPointerException("Null audioStats");
    }

    @Override // p145i0.AbstractC8203y0
    /* renamed from: a */
    public AbstractC8108b mo20313a() {
        return this.f17627c;
    }

    @Override // p145i0.AbstractC8203y0
    /* renamed from: b */
    public long mo20312b() {
        return this.f17626b;
    }

    @Override // p145i0.AbstractC8203y0
    /* renamed from: c */
    public long mo20311c() {
        return this.f17625a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8203y0)) {
            return false;
        }
        AbstractC8203y0 y0Var = (AbstractC8203y0) obj;
        if (this.f17625a == y0Var.mo20311c() && this.f17626b == y0Var.mo20312b() && this.f17627c.equals(y0Var.mo20313a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f17625a;
        long j2 = this.f17626b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f17627c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f17625a + ", numBytesRecorded=" + this.f17626b + ", audioStats=" + this.f17627c + "}";
    }
}
