package p439y7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p119g9.C7510a;
import p119g9.C7547n;
import p119g9.C7557q0;

/* renamed from: y7.h */
/* loaded from: classes7.dex */
final class C14281h extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f32283b;

    /* renamed from: c */
    private Handler f32284c;

    /* renamed from: h */
    private MediaFormat f32289h;

    /* renamed from: i */
    private MediaFormat f32290i;

    /* renamed from: j */
    private MediaCodec.CodecException f32291j;

    /* renamed from: k */
    private long f32292k;

    /* renamed from: l */
    private boolean f32293l;

    /* renamed from: m */
    private IllegalStateException f32294m;

    /* renamed from: a */
    private final Object f32282a = new Object();

    /* renamed from: d */
    private final C7547n f32285d = new C7547n();

    /* renamed from: e */
    private final C7547n f32286e = new C7547n();

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f32287f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f32288g = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14281h(HandlerThread handlerThread) {
        this.f32283b = handlerThread;
    }

    /* renamed from: b */
    private void m1169b(MediaFormat mediaFormat) {
        this.f32286e.m22241a(-2);
        this.f32288g.add(mediaFormat);
    }

    /* renamed from: f */
    private void m1165f() {
        if (!this.f32288g.isEmpty()) {
            this.f32290i = this.f32288g.getLast();
        }
        this.f32285d.m22240b();
        this.f32286e.m22240b();
        this.f32287f.clear();
        this.f32288g.clear();
        this.f32291j = null;
    }

    /* renamed from: i */
    private boolean m1162i() {
        return this.f32292k > 0 || this.f32293l;
    }

    /* renamed from: k */
    private void m1160k() {
        m1159l();
        m1158m();
    }

    /* renamed from: l */
    private void m1159l() {
        IllegalStateException illegalStateException = this.f32294m;
        if (illegalStateException != null) {
            this.f32294m = null;
            throw illegalStateException;
        }
    }

    /* renamed from: m */
    private void m1158m() {
        MediaCodec.CodecException codecException = this.f32291j;
        if (codecException != null) {
            this.f32291j = null;
            throw codecException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m1161j(Runnable runnable) {
        synchronized (this.f32282a) {
            m1156o(runnable);
        }
    }

    /* renamed from: o */
    private void m1156o(Runnable runnable) {
        if (!this.f32293l) {
            long j = this.f32292k - 1;
            this.f32292k = j;
            if (j <= 0) {
                if (j < 0) {
                    m1155p(new IllegalStateException());
                    return;
                }
                m1165f();
                try {
                    runnable.run();
                } catch (IllegalStateException e) {
                    m1155p(e);
                } catch (Exception e2) {
                    m1155p(new IllegalStateException(e2));
                }
            }
        }
    }

    /* renamed from: p */
    private void m1155p(IllegalStateException illegalStateException) {
        synchronized (this.f32282a) {
            this.f32294m = illegalStateException;
        }
    }

    /* renamed from: c */
    public int m1168c() {
        synchronized (this.f32282a) {
            int i = -1;
            if (m1162i()) {
                return -1;
            }
            m1160k();
            if (!this.f32285d.m22238d()) {
                i = this.f32285d.m22237e();
            }
            return i;
        }
    }

    /* renamed from: d */
    public int m1167d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f32282a) {
            if (m1162i()) {
                return -1;
            }
            m1160k();
            if (this.f32286e.m22238d()) {
                return -1;
            }
            int e = this.f32286e.m22237e();
            if (e >= 0) {
                C7510a.m22364h(this.f32289h);
                MediaCodec.BufferInfo remove = this.f32287f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e == -2) {
                this.f32289h = this.f32288g.remove();
            }
            return e;
        }
    }

    /* renamed from: e */
    public void m1166e(final Runnable runnable) {
        synchronized (this.f32282a) {
            this.f32292k++;
            ((Handler) C7557q0.m22145j(this.f32284c)).post(new Runnable() { // from class: y7.g
                @Override // java.lang.Runnable
                public final void run() {
                    C14281h.this.m1161j(runnable);
                }
            });
        }
    }

    /* renamed from: g */
    public MediaFormat m1164g() {
        MediaFormat mediaFormat;
        synchronized (this.f32282a) {
            mediaFormat = this.f32289h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void m1163h(MediaCodec mediaCodec) {
        boolean z;
        if (this.f32284c == null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        this.f32283b.start();
        Handler handler = new Handler(this.f32283b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f32284c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f32282a) {
            this.f32291j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f32282a) {
            this.f32285d.m22241a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f32282a) {
            MediaFormat mediaFormat = this.f32290i;
            if (mediaFormat != null) {
                m1169b(mediaFormat);
                this.f32290i = null;
            }
            this.f32286e.m22241a(i);
            this.f32287f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f32282a) {
            m1169b(mediaFormat);
            this.f32290i = null;
        }
    }

    /* renamed from: q */
    public void m1154q() {
        synchronized (this.f32282a) {
            this.f32293l = true;
            this.f32283b.quit();
            m1165f();
        }
    }
}
