package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120gc.AbstractFutureC7576b;
import p431y.C14186f;

/* renamed from: androidx.camera.video.internal.encoder.g */
/* loaded from: classes.dex */
public class C2007g implements AbstractC2003e {

    /* renamed from: k */
    private final MediaCodec f2216k;

    /* renamed from: l */
    private final MediaCodec.BufferInfo f2217l;

    /* renamed from: m */
    private final int f2218m;

    /* renamed from: n */
    private final ByteBuffer f2219n;

    /* renamed from: o */
    private final AbstractFutureC7576b<Void> f2220o;

    /* renamed from: p */
    private final C2114c.C2115a<Void> f2221p;

    /* renamed from: q */
    private final AtomicBoolean f2222q = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2007g(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f2216k = (MediaCodec) C2517g.m37588g(mediaCodec);
        this.f2218m = i;
        this.f2219n = mediaCodec.getOutputBuffer(i);
        this.f2217l = (MediaCodec.BufferInfo) C2517g.m37588g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f2220o = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.video.internal.encoder.f
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object obj;
                obj = atomicReference.set(aVar);
                return obj;
            }
        });
        this.f2221p = (C2114c.C2115a) C2517g.m37588g((C2114c.C2115a) atomicReference.get());
    }

    /* renamed from: i */
    private void m39198i() {
        if (this.f2222q.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2003e
    /* renamed from: D */
    public MediaCodec.BufferInfo mo39205D() {
        return this.f2217l;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2003e
    /* renamed from: G */
    public boolean mo39204G() {
        return (this.f2217l.flags & 1) != 0;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2003e
    /* renamed from: W */
    public long mo39203W() {
        return this.f2217l.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2003e
    /* renamed from: a */
    public ByteBuffer mo39202a() {
        m39198i();
        this.f2219n.position(this.f2217l.offset);
        ByteBuffer byteBuffer = this.f2219n;
        MediaCodec.BufferInfo bufferInfo = this.f2217l;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f2219n;
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2003e, java.lang.AutoCloseable
    public void close() {
        if (!this.f2222q.getAndSet(true)) {
            try {
                this.f2216k.releaseOutputBuffer(this.f2218m, false);
                this.f2221p.m38961c(null);
            } catch (IllegalStateException e) {
                this.f2221p.m38958f(e);
            }
        }
    }

    /* renamed from: g */
    public AbstractFutureC7576b<Void> m39200g() {
        return C14186f.m1419j(this.f2220o);
    }

    @Override // androidx.camera.video.internal.encoder.AbstractC2003e
    public long size() {
        return this.f2217l.size;
    }
}
