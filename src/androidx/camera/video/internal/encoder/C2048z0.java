package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120gc.AbstractFutureC7576b;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.video.internal.encoder.z0 */
/* loaded from: classes.dex */
public class C2048z0 implements AbstractC2044x0 {

    /* renamed from: a */
    private final MediaCodec f2280a;

    /* renamed from: b */
    private final int f2281b;

    /* renamed from: c */
    private final ByteBuffer f2282c;

    /* renamed from: d */
    private final AbstractFutureC7576b<Void> f2283d;

    /* renamed from: e */
    private final C2114c.C2115a<Void> f2284e;

    /* renamed from: f */
    private final AtomicBoolean f2285f = new AtomicBoolean(false);

    /* renamed from: g */
    private long f2286g = 0;

    /* renamed from: h */
    private boolean f2287h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2048z0(MediaCodec mediaCodec, int i) {
        this.f2280a = (MediaCodec) C2517g.m37588g(mediaCodec);
        this.f2281b = C2517g.m37591d(i);
        this.f2282c = mediaCodec.getInputBuffer(i);
        final AtomicReference atomicReference = new AtomicReference();
        this.f2283d = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.video.internal.encoder.y0
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object obj;
                obj = atomicReference.set(aVar);
                return obj;
            }
        });
        this.f2284e = (C2114c.C2115a) C2517g.m37588g((C2114c.C2115a) atomicReference.get());
    }

    /* renamed from: h */
    private void m39186h() {
        if (this.f2285f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2044x0
    /* renamed from: a */
    public ByteBuffer mo39193a() {
        m39186h();
        return this.f2282c;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2044x0
    /* renamed from: b */
    public void mo39192b(boolean z) {
        m39186h();
        this.f2287h = z;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2044x0
    /* renamed from: c */
    public boolean mo39191c() {
        int i;
        if (this.f2285f.getAndSet(true)) {
            return false;
        }
        try {
            MediaCodec mediaCodec = this.f2280a;
            int i2 = this.f2281b;
            int position = this.f2282c.position();
            int limit = this.f2282c.limit();
            long j = this.f2286g;
            if (this.f2287h) {
                i = 4;
            } else {
                i = 0;
            }
            mediaCodec.queueInputBuffer(i2, position, limit, j, i);
            this.f2284e.m38961c(null);
            return true;
        } catch (IllegalStateException e) {
            this.f2284e.m38958f(e);
            return false;
        }
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2044x0
    public boolean cancel() {
        if (this.f2285f.getAndSet(true)) {
            return false;
        }
        try {
            this.f2280a.queueInputBuffer(this.f2281b, 0, 0, 0L, 0);
            this.f2284e.m38961c(null);
        } catch (IllegalStateException e) {
            this.f2284e.m38958f(e);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2044x0
    /* renamed from: d */
    public void mo39190d(long j) {
        boolean z;
        m39186h();
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37594a(z);
        this.f2286g = j;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2044x0
    /* renamed from: e */
    public AbstractFutureC7576b<Void> mo39189e() {
        return C14186f.m1419j(this.f2283d);
    }
}
