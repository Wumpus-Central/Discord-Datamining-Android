package p145i0;

import androidx.camera.core.impl.utils.C1842f;
import androidx.core.util.C2517g;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: i0.x0 */
/* loaded from: classes.dex */
public final class C8201x0 implements AutoCloseable {

    /* renamed from: k */
    private final AtomicBoolean f17733k;

    /* renamed from: l */
    private final C8166o0 f17734l;

    /* renamed from: m */
    private final long f17735m;

    /* renamed from: n */
    private final AbstractC8188s f17736n;

    /* renamed from: o */
    private final C1842f f17737o;

    C8201x0(C8166o0 o0Var, long j, AbstractC8188s sVar, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f17733k = atomicBoolean;
        C1842f b = C1842f.m39686b();
        this.f17737o = b;
        this.f17734l = o0Var;
        this.f17735m = j;
        this.f17736n = sVar;
        if (z) {
            atomicBoolean.set(true);
        } else {
            b.m39685c("stop");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C8201x0 m20320b(C8192u uVar, long j) {
        C2517g.m37587h(uVar, "The given PendingRecording cannot be null.");
        return new C8201x0(uVar.m20338e(), j, uVar.m20339d(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C8201x0 m20319g(C8192u uVar, long j) {
        C2517g.m37587h(uVar, "The given PendingRecording cannot be null.");
        return new C8201x0(uVar.m20338e(), j, uVar.m20339d(), false);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m20314p();
    }

    protected void finalize() {
        try {
            this.f17737o.m39684d();
            m20314p();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public AbstractC8188s m20318h() {
        return this.f17736n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public long m20317i() {
        return this.f17735m;
    }

    /* renamed from: l */
    public void m20316l() {
        if (!this.f17733k.get()) {
            this.f17734l.m20453d0(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    /* renamed from: n */
    public void m20315n() {
        if (!this.f17733k.get()) {
            this.f17734l.m20429p0(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    /* renamed from: p */
    public void m20314p() {
        this.f17737o.m39687a();
        if (!this.f17733k.getAndSet(true)) {
            this.f17734l.m20493A0(this);
        }
    }
}
