package p390w;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.b */
/* loaded from: classes.dex */
public final class C13570b extends AbstractC13616k0 {

    /* renamed from: a */
    private final Executor f30360a;

    /* renamed from: b */
    private final Handler f30361b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13570b(Executor executor, Handler handler) {
        if (executor != null) {
            this.f30360a = executor;
            if (handler != null) {
                this.f30361b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    @Override // p390w.AbstractC13616k0
    /* renamed from: b */
    public Executor mo3211b() {
        return this.f30360a;
    }

    @Override // p390w.AbstractC13616k0
    /* renamed from: c */
    public Handler mo3210c() {
        return this.f30361b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13616k0)) {
            return false;
        }
        AbstractC13616k0 k0Var = (AbstractC13616k0) obj;
        if (!this.f30360a.equals(k0Var.mo3211b()) || !this.f30361b.equals(k0Var.mo3210c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f30360a.hashCode() ^ 1000003) * 1000003) ^ this.f30361b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f30360a + ", schedulerHandler=" + this.f30361b + "}";
    }
}
