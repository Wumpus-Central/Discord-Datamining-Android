package p439y7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Objects;
import p030bc.AbstractC3465n;
import p152i7.C8216b;
import p439y7.AbstractC14284k;
import p439y7.C14272c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y7.c */
/* loaded from: classes7.dex */
public final class C14272c implements AbstractC14284k {

    /* renamed from: a */
    private final MediaCodec f32252a;

    /* renamed from: b */
    private final C14281h f32253b;

    /* renamed from: c */
    private final C14277f f32254c;

    /* renamed from: d */
    private final boolean f32255d;

    /* renamed from: e */
    private boolean f32256e;

    /* renamed from: f */
    private int f32257f;

    /* renamed from: y7.c$b */
    /* loaded from: classes7.dex */
    public static final class C14274b implements AbstractC14284k.AbstractC14285a {

        /* renamed from: b */
        private final AbstractC3465n<HandlerThread> f32258b;

        /* renamed from: c */
        private final AbstractC3465n<HandlerThread> f32259c;

        /* renamed from: d */
        private final boolean f32260d;

        /* renamed from: e */
        private final boolean f32261e;

        public C14274b(final int i, boolean z, boolean z2) {
            this(new AbstractC3465n() { // from class: y7.d
                @Override // p030bc.AbstractC3465n, p163j$.util.function.Supplier
                public final Object get() {
                    HandlerThread e;
                    e = C14272c.C14274b.m1193e(i);
                    return e;
                }
            }, new AbstractC3465n() { // from class: y7.e
                @Override // p030bc.AbstractC3465n, p163j$.util.function.Supplier
                public final Object get() {
                    HandlerThread f;
                    f = C14272c.C14274b.m1192f(i);
                    return f;
                }
            }, z, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ HandlerThread m1193e(int i) {
            return new HandlerThread(C14272c.m1201m(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ HandlerThread m1192f(int i) {
            return new HandlerThread(C14272c.m1200n(i));
        }

        /* renamed from: d */
        public C14272c mo1133a(MediaCodec mediaCodec) {
            return new C14272c(mediaCodec, this.f32258b.get(), this.f32259c.get(), this.f32260d, this.f32261e);
        }

        C14274b(AbstractC3465n<HandlerThread> nVar, AbstractC3465n<HandlerThread> nVar2, boolean z, boolean z2) {
            this.f32258b = nVar;
            this.f32259c = nVar2;
            this.f32260d = z;
            this.f32261e = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static String m1201m(int i) {
        return m1199o(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static String m1200n(int i) {
        return m1199o(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: o */
    private static String m1199o(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m1198p(AbstractC14284k.AbstractC14286b bVar, MediaCodec mediaCodec, long j, long j2) {
        bVar.mo1132a(this, j, j2);
    }

    /* renamed from: q */
    private void m1197q() {
        if (this.f32255d) {
            try {
                this.f32254c.m1172t();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: a */
    public void mo1142a(int i, int i2, C8216b bVar, long j, int i3) {
        this.f32254c.m1177o(i, i2, bVar, j, i3);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: b */
    public void mo1141b(int i) {
        m1197q();
        this.f32252a.setVideoScalingMode(i);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: c */
    public ByteBuffer mo1140c(int i) {
        return this.f32252a.getInputBuffer(i);
    }

    @Override // p439y7.AbstractC14284k
    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f32253b.m1163h(this.f32252a);
        this.f32252a.configure(mediaFormat, surface, mediaCrypto, i);
        this.f32257f = 1;
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: d */
    public void mo1139d(Surface surface) {
        m1197q();
        this.f32252a.setOutputSurface(surface);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: e */
    public void mo1138e(final AbstractC14284k.AbstractC14286b bVar, Handler handler) {
        m1197q();
        this.f32252a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: y7.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C14272c.this.m1198p(bVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: f */
    public void mo1137f(int i, long j) {
        this.f32252a.releaseOutputBuffer(i, j);
    }

    @Override // p439y7.AbstractC14284k
    public void flush() {
        this.f32254c.m1183i();
        this.f32252a.flush();
        C14281h hVar = this.f32253b;
        final MediaCodec mediaCodec = this.f32252a;
        Objects.requireNonNull(mediaCodec);
        hVar.m1166e(new Runnable() { // from class: y7.b
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: g */
    public int mo1136g() {
        return this.f32253b.m1168c();
    }

    @Override // p439y7.AbstractC14284k
    public MediaFormat getOutputFormat() {
        return this.f32253b.m1164g();
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: h */
    public int mo1135h(MediaCodec.BufferInfo bufferInfo) {
        return this.f32253b.m1167d(bufferInfo);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: i */
    public ByteBuffer mo1134i(int i) {
        return this.f32252a.getOutputBuffer(i);
    }

    @Override // p439y7.AbstractC14284k
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f32254c.m1178n(i, i2, i3, j, i4);
    }

    @Override // p439y7.AbstractC14284k
    public void release() {
        try {
            if (this.f32257f == 2) {
                this.f32254c.m1174r();
            }
            int i = this.f32257f;
            if (i == 1 || i == 2) {
                this.f32253b.m1154q();
            }
            this.f32257f = 3;
        } finally {
            if (!this.f32256e) {
                this.f32252a.release();
                this.f32256e = true;
            }
        }
    }

    @Override // p439y7.AbstractC14284k
    public void releaseOutputBuffer(int i, boolean z) {
        this.f32252a.releaseOutputBuffer(i, z);
    }

    @Override // p439y7.AbstractC14284k
    public void setParameters(Bundle bundle) {
        m1197q();
        this.f32252a.setParameters(bundle);
    }

    @Override // p439y7.AbstractC14284k
    public void start() {
        this.f32254c.m1173s();
        this.f32252a.start();
        this.f32257f = 2;
    }

    private C14272c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f32252a = mediaCodec;
        this.f32253b = new C14281h(handlerThread);
        this.f32254c = new C14277f(mediaCodec, handlerThread2, z);
        this.f32255d = z2;
        this.f32257f = 0;
    }
}
