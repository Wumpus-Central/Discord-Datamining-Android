package p145i0;

import androidx.core.util.AbstractC2511b;
import java.util.concurrent.Executor;
import p145i0.C8166o0;

/* renamed from: i0.j */
/* loaded from: classes.dex */
final class C8149j extends C8166o0.AbstractC8175i {

    /* renamed from: o */
    private final AbstractC8188s f17615o;

    /* renamed from: p */
    private final Executor f17616p;

    /* renamed from: q */
    private final AbstractC2511b<AbstractC8143i1> f17617q;

    /* renamed from: r */
    private final boolean f17618r;

    /* renamed from: s */
    private final long f17619s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8149j(AbstractC8188s sVar, Executor executor, AbstractC2511b<AbstractC8143i1> bVar, boolean z, long j) {
        if (sVar != null) {
            this.f17615o = sVar;
            this.f17616p = executor;
            this.f17617q = bVar;
            this.f17618r = z;
            this.f17619s = j;
            return;
        }
        throw new NullPointerException("Null getOutputOptions");
    }

    @Override // p145i0.C8166o0.AbstractC8175i
    /* renamed from: C */
    AbstractC2511b<AbstractC8143i1> mo20395C() {
        return this.f17617q;
    }

    @Override // p145i0.C8166o0.AbstractC8175i
    /* renamed from: H */
    AbstractC8188s mo20392H() {
        return this.f17615o;
    }

    @Override // p145i0.C8166o0.AbstractC8175i
    /* renamed from: Q */
    long mo20391Q() {
        return this.f17619s;
    }

    @Override // p145i0.C8166o0.AbstractC8175i
    /* renamed from: R */
    boolean mo20390R() {
        return this.f17618r;
    }

    public boolean equals(Object obj) {
        Executor executor;
        AbstractC2511b<AbstractC8143i1> bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8166o0.AbstractC8175i)) {
            return false;
        }
        C8166o0.AbstractC8175i iVar = (C8166o0.AbstractC8175i) obj;
        if (!this.f17615o.equals(iVar.mo20392H()) || ((executor = this.f17616p) != null ? !executor.equals(iVar.mo20372z()) : iVar.mo20372z() != null) || ((bVar = this.f17617q) != null ? !bVar.equals(iVar.mo20395C()) : iVar.mo20395C() != null) || this.f17618r != iVar.mo20390R() || this.f17619s != iVar.mo20391Q()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = (this.f17615o.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f17616p;
        int i3 = 0;
        if (executor == null) {
            i = 0;
        } else {
            i = executor.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        AbstractC2511b<AbstractC8143i1> bVar = this.f17617q;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        int i5 = (i4 ^ i3) * 1000003;
        if (this.f17618r) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        long j = this.f17619s;
        return ((i5 ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f17615o + ", getCallbackExecutor=" + this.f17616p + ", getEventListener=" + this.f17617q + ", hasAudioEnabled=" + this.f17618r + ", getRecordingId=" + this.f17619s + "}";
    }

    @Override // p145i0.C8166o0.AbstractC8175i
    /* renamed from: z */
    Executor mo20372z() {
        return this.f17616p;
    }
}
