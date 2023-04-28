package p439y7;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p119g9.C7510a;
import p119g9.C7522f;
import p119g9.C7557q0;
import p152i7.C8216b;

/* renamed from: y7.f */
/* loaded from: classes7.dex */
class C14277f {

    /* renamed from: h */
    private static final ArrayDeque<C14279b> f32264h = new ArrayDeque<>();

    /* renamed from: i */
    private static final Object f32265i = new Object();

    /* renamed from: a */
    private final MediaCodec f32266a;

    /* renamed from: b */
    private final HandlerThread f32267b;

    /* renamed from: c */
    private Handler f32268c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f32269d;

    /* renamed from: e */
    private final C7522f f32270e;

    /* renamed from: f */
    private final boolean f32271f;

    /* renamed from: g */
    private boolean f32272g;

    /* renamed from: y7.f$a */
    /* loaded from: classes7.dex */
    class HandlerC14278a extends Handler {
        HandlerC14278a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C14277f.this.m1186f(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y7.f$b */
    /* loaded from: classes7.dex */
    public static class C14279b {

        /* renamed from: a */
        public int f32274a;

        /* renamed from: b */
        public int f32275b;

        /* renamed from: c */
        public int f32276c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f32277d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f32278e;

        /* renamed from: f */
        public int f32279f;

        C14279b() {
        }

        /* renamed from: a */
        public void m1171a(int i, int i2, int i3, long j, int i4) {
            this.f32274a = i;
            this.f32275b = i2;
            this.f32276c = i3;
            this.f32278e = j;
            this.f32279f = i4;
        }
    }

    public C14277f(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new C7522f());
    }

    /* renamed from: b */
    private void m1190b() {
        this.f32270e.m22337b();
        ((Handler) C7557q0.m22145j(this.f32268c)).obtainMessage(2).sendToTarget();
        this.f32270e.m22338a();
    }

    /* renamed from: c */
    private static void m1189c(C8216b bVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = bVar.f17779f;
        cryptoInfo.numBytesOfClearData = m1187e(bVar.f17777d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m1187e(bVar.f17778e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C7510a.m22367e(m1188d(bVar.f17775b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C7510a.m22367e(m1188d(bVar.f17774a, cryptoInfo.iv));
        cryptoInfo.mode = bVar.f17776c;
        if (C7557q0.f16368a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f17780g, bVar.f17781h));
        }
    }

    /* renamed from: d */
    private static byte[] m1188d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: e */
    private static int[] m1187e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m1186f(Message message) {
        C14279b bVar;
        int i = message.what;
        if (i == 0) {
            bVar = (C14279b) message.obj;
            m1185g(bVar.f32274a, bVar.f32275b, bVar.f32276c, bVar.f32278e, bVar.f32279f);
        } else if (i != 1) {
            if (i != 2) {
                m1175q(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f32270e.m22335d();
            }
            bVar = null;
        } else {
            bVar = (C14279b) message.obj;
            m1184h(bVar.f32274a, bVar.f32275b, bVar.f32277d, bVar.f32278e, bVar.f32279f);
        }
        if (bVar != null) {
            m1176p(bVar);
        }
    }

    /* renamed from: g */
    private void m1185g(int i, int i2, int i3, long j, int i4) {
        try {
            this.f32266a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            m1175q(e);
        }
    }

    /* renamed from: h */
    private void m1184h(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            if (this.f32271f) {
                synchronized (f32265i) {
                    this.f32266a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
                }
            } else {
                this.f32266a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            m1175q(e);
        }
    }

    /* renamed from: j */
    private void m1182j() {
        ((Handler) C7557q0.m22145j(this.f32268c)).removeCallbacksAndMessages(null);
        m1190b();
        m1180l();
    }

    /* renamed from: k */
    private static C14279b m1181k() {
        ArrayDeque<C14279b> arrayDeque = f32264h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C14279b();
            }
            return arrayDeque.removeFirst();
        }
    }

    /* renamed from: l */
    private void m1180l() {
        RuntimeException andSet = this.f32269d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: m */
    private static boolean m1179m() {
        String U0 = C7557q0.m22174U0(C7557q0.f16370c);
        if (U0.contains("samsung") || U0.contains("motorola")) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private static void m1176p(C14279b bVar) {
        ArrayDeque<C14279b> arrayDeque = f32264h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    /* renamed from: i */
    public void m1183i() {
        if (this.f32272g) {
            try {
                m1182j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: n */
    public void m1178n(int i, int i2, int i3, long j, int i4) {
        m1180l();
        C14279b k = m1181k();
        k.m1171a(i, i2, i3, j, i4);
        ((Handler) C7557q0.m22145j(this.f32268c)).obtainMessage(0, k).sendToTarget();
    }

    /* renamed from: o */
    public void m1177o(int i, int i2, C8216b bVar, long j, int i3) {
        m1180l();
        C14279b k = m1181k();
        k.m1171a(i, i2, 0, j, i3);
        m1189c(bVar, k.f32277d);
        ((Handler) C7557q0.m22145j(this.f32268c)).obtainMessage(1, k).sendToTarget();
    }

    /* renamed from: q */
    void m1175q(RuntimeException runtimeException) {
        this.f32269d.set(runtimeException);
    }

    /* renamed from: r */
    public void m1174r() {
        if (this.f32272g) {
            m1183i();
            this.f32267b.quit();
        }
        this.f32272g = false;
    }

    /* renamed from: s */
    public void m1173s() {
        if (!this.f32272g) {
            this.f32267b.start();
            this.f32268c = new HandlerC14278a(this.f32267b.getLooper());
            this.f32272g = true;
        }
    }

    /* renamed from: t */
    public void m1172t() {
        m1190b();
    }

    C14277f(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, C7522f fVar) {
        this.f32266a = mediaCodec;
        this.f32267b = handlerThread;
        this.f32270e = fVar;
        this.f32269d = new AtomicReference<>();
        this.f32271f = z || m1179m();
    }
}
