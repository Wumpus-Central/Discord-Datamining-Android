package androidx.camera.core;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p120gc.AbstractFutureC7576b;
import p163j$.util.Spliterator;
import p390w.AbstractC13617k1;
import p390w.AbstractC13662r0;
import p390w.AbstractC13689w0;
import p390w.AbstractC13692w1;
import p390w.AbstractC13697x2;
import p390w.AbstractC13702y2;
import p390w.C13582c2;
import p390w.C13619k2;
import p390w.C13642n1;
import p390w.C13656q0;
import p390w.C13696x1;
import p390w.C13709z2;
import p410x.C13905a;
import p451z.AbstractC14506i;

/* renamed from: androidx.camera.core.b3 */
/* loaded from: classes.dex */
public final class C1781b3 extends AbstractC1948w2 {

    /* renamed from: J */
    public static final C1785d f35316J = new C1785d();

    /* renamed from: K */
    private static final int[] f35317K = {8, 6, 5, 4};

    /* renamed from: A */
    private volatile int f35318A;

    /* renamed from: B */
    private volatile boolean f35319B;

    /* renamed from: C */
    private int f35320C;

    /* renamed from: D */
    private int f35321D;

    /* renamed from: E */
    private int f35322E;

    /* renamed from: F */
    private AbstractC13689w0 f35323F;

    /* renamed from: G */
    private final AtomicBoolean f35324G;

    /* renamed from: H */
    private EnumC1786e f35325H;

    /* renamed from: I */
    private Throwable f35326I;

    /* renamed from: l */
    private final Object f1620l;

    /* renamed from: m */
    private final AtomicBoolean f1621m;

    /* renamed from: n */
    private final AtomicBoolean f1622n;

    /* renamed from: o */
    private HandlerThread f1623o;

    /* renamed from: p */
    private Handler f1624p;

    /* renamed from: q */
    private HandlerThread f1625q;

    /* renamed from: r */
    private Handler f1626r;

    /* renamed from: s */
    MediaCodec f1627s;

    /* renamed from: t */
    private MediaCodec f1628t;

    /* renamed from: u */
    private AbstractFutureC7576b<Void> f1629u;

    /* renamed from: v */
    private C13619k2.C13621b f1630v;

    /* renamed from: w */
    private int f1631w;

    /* renamed from: x */
    private int f1632x;

    /* renamed from: y */
    Surface f1633y;

    /* renamed from: z */
    private volatile AudioRecord f1634z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.b3$a */
    /* loaded from: classes.dex */
    public class C1782a implements C13619k2.AbstractC13622c {

        /* renamed from: a */
        final /* synthetic */ String f1635a;

        /* renamed from: b */
        final /* synthetic */ Size f1636b;

        C1782a(String str, Size size) {
            this.f1635a = str;
            this.f1636b = size;
        }

        @Override // p390w.C13619k2.AbstractC13622c
        /* renamed from: a */
        public void mo3179a(C13619k2 k2Var, C13619k2.EnumC13624e eVar) {
            if (C1781b3.this.m39426o(this.f1635a)) {
                C1781b3.this.m39842X(this.f1635a, this.f1636b);
                C1781b3.this.m39422s();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.b3$b */
    /* loaded from: classes.dex */
    public static class C1783b {
        /* renamed from: a */
        static int m39840a(MediaCodec.CodecException codecException) {
            return codecException.getErrorCode();
        }
    }

    /* renamed from: androidx.camera.core.b3$c */
    /* loaded from: classes.dex */
    public static final class C1784c implements AbstractC13697x2.AbstractC13698a<C1781b3, C13709z2, C1784c>, AbstractC13617k1.AbstractC13618a<C1784c> {

        /* renamed from: a */
        private final C13696x1 f1638a;

        public C1784c() {
            this(C13696x1.m3002J());
        }

        /* renamed from: e */
        static C1784c m39839e(AbstractC13662r0 r0Var) {
            return new C1784c(C13696x1.m3001K(r0Var));
        }

        @Override // androidx.camera.core.AbstractC1807f0
        /* renamed from: a */
        public AbstractC13692w1 mo3781a() {
            return this.f1638a;
        }

        /* renamed from: f */
        public C13709z2 mo2998d() {
            return new C13709z2(C13582c2.m3310H(this.f1638a));
        }

        /* renamed from: g */
        public C1784c m39837g(int i) {
            mo3781a().mo2999u(C13709z2.f39411A, Integer.valueOf(i));
            return this;
        }

        /* renamed from: h */
        public C1784c m39836h(int i) {
            mo3781a().mo2999u(C13709z2.f39413C, Integer.valueOf(i));
            return this;
        }

        /* renamed from: i */
        public C1784c m39835i(int i) {
            mo3781a().mo2999u(C13709z2.f39414D, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C1784c m39834j(int i) {
            mo3781a().mo2999u(C13709z2.f39412B, Integer.valueOf(i));
            return this;
        }

        /* renamed from: k */
        public C1784c m39833k(int i) {
            mo3781a().mo2999u(C13709z2.f30608y, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C1784c m39832l(int i) {
            mo3781a().mo2999u(C13709z2.f30609z, Integer.valueOf(i));
            return this;
        }

        /* renamed from: m */
        public C1784c m39831m(Size size) {
            mo3781a().mo2999u(AbstractC13617k1.f30424j, size);
            return this;
        }

        /* renamed from: n */
        public C1784c m39830n(int i) {
            mo3781a().mo2999u(AbstractC13697x2.f30589p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: o */
        public C1784c m39829o(int i) {
            mo3781a().mo2999u(AbstractC13617k1.f30420f, Integer.valueOf(i));
            return this;
        }

        /* renamed from: p */
        public C1784c m39828p(Class<C1781b3> cls) {
            mo3781a().mo2999u(AbstractC14506i.f32900t, cls);
            if (mo3781a().mo2977a(AbstractC14506i.f32899s, null) == null) {
                m39827q(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: q */
        public C1784c m39827q(String str) {
            mo3781a().mo2999u(AbstractC14506i.f32899s, str);
            return this;
        }

        /* renamed from: r */
        public C1784c mo3208c(Size size) {
            mo3781a().mo2999u(AbstractC13617k1.f30422h, size);
            return this;
        }

        /* renamed from: s */
        public C1784c mo3209b(int i) {
            mo3781a().mo2999u(AbstractC13617k1.f30421g, Integer.valueOf(i));
            return this;
        }

        /* renamed from: t */
        public C1784c m39824t(int i) {
            mo3781a().mo2999u(C13709z2.f30607x, Integer.valueOf(i));
            return this;
        }

        private C1784c(C13696x1 x1Var) {
            this.f1638a = x1Var;
            Class cls = (Class) x1Var.mo2977a(AbstractC14506i.f32900t, null);
            if (cls == null || cls.equals(C1781b3.class)) {
                m39828p(C1781b3.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: androidx.camera.core.b3$d */
    /* loaded from: classes.dex */
    public static final class C1785d {

        /* renamed from: a */
        private static final Size f1639a;

        /* renamed from: b */
        private static final C13709z2 f1640b;

        static {
            Size size = new Size(1920, 1080);
            f1639a = size;
            f1640b = new C1784c().m39824t(30).m39833k(8388608).m39832l(1).m39837g(64000).m39834j(8000).m39836h(1).m39835i(Spliterator.IMMUTABLE).m39831m(size).m39830n(3).m39829o(1).mo2998d();
        }

        /* renamed from: a */
        public C13709z2 m39823a() {
            return f1640b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.b3$e */
    /* loaded from: classes.dex */
    public enum EnumC1786e {
        VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED,
        VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED,
        VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE,
        VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED
    }

    /* renamed from: N */
    private AudioRecord m39852N(C13709z2 z2Var) {
        int i;
        if (this.f35320C == 1) {
            i = 16;
        } else {
            i = 12;
        }
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(this.f35321D, i, 2);
            if (minBufferSize <= 0) {
                minBufferSize = z2Var.m2982H();
            }
            AudioRecord audioRecord = new AudioRecord(5, this.f35321D, i, 2, minBufferSize * 2);
            if (audioRecord.getState() != 1) {
                return null;
            }
            this.f35318A = minBufferSize;
            C1915r1.m39523e("VideoCapture", "source: 5 audioSampleRate: " + this.f35321D + " channelConfig: " + i + " audioFormat: 2 bufferSize: " + minBufferSize);
            return audioRecord;
        } catch (Exception e) {
            C1915r1.m39524d("VideoCapture", "Exception, keep trying.", e);
            return null;
        }
    }

    /* renamed from: O */
    private MediaFormat m39851O() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.f35321D, this.f35320C);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", this.f35322E);
        return createAudioFormat;
    }

    /* renamed from: P */
    private static MediaFormat m39850P(C13709z2 z2Var, Size size) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", z2Var.m2980J());
        createVideoFormat.setInteger("frame-rate", z2Var.m2978L());
        createVideoFormat.setInteger("i-frame-interval", z2Var.m2979K());
        return createVideoFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static /* synthetic */ void m39848R(boolean z, MediaCodec mediaCodec) {
        if (z && mediaCodec != null) {
            mediaCodec.release();
        }
    }

    /* renamed from: T */
    private void m39846T() {
        this.f1625q.quitSafely();
        MediaCodec mediaCodec = this.f1628t;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f1628t = null;
        }
        if (this.f1634z != null) {
            this.f1634z.release();
            this.f1634z = null;
        }
    }

    /* renamed from: U */
    private void m39845U(final boolean z) {
        AbstractC13689w0 w0Var = this.f35323F;
        if (w0Var != null) {
            final MediaCodec mediaCodec = this.f1627s;
            w0Var.m3023c();
            this.f35323F.m3017i().mo1409a(new Runnable() { // from class: androidx.camera.core.y2
                @Override // java.lang.Runnable
                public final void run() {
                    C1781b3.m39848R(z, mediaCodec);
                }
            }, C13905a.m2336d());
            if (z) {
                this.f1627s = null;
            }
            this.f1633y = null;
            this.f35323F = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m39849Q() {
        this.f1623o.quitSafely();
        m39846T();
        if (this.f1633y != null) {
            m39845U(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r7.f35320C = r4.audioChannels;
        r7.f35321D = r4.audioSampleRate;
        r7.f35322E = r4.audioBitRate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        r0 = true;
     */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m39843W(android.util.Size r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            int[] r1 = androidx.camera.core.C1781b3.f35317K     // Catch: NumberFormatException -> 0x003d
            int r2 = r1.length     // Catch: NumberFormatException -> 0x003d
            r3 = r0
        L_0x0005:
            if (r3 >= r2) goto L_0x0044
            r4 = r1[r3]     // Catch: NumberFormatException -> 0x003d
            int r5 = java.lang.Integer.parseInt(r9)     // Catch: NumberFormatException -> 0x003d
            boolean r5 = android.media.CamcorderProfile.hasProfile(r5, r4)     // Catch: NumberFormatException -> 0x003d
            if (r5 == 0) goto L_0x003a
            int r5 = java.lang.Integer.parseInt(r9)     // Catch: NumberFormatException -> 0x003d
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r5, r4)     // Catch: NumberFormatException -> 0x003d
            int r5 = r8.getWidth()     // Catch: NumberFormatException -> 0x003d
            int r6 = r4.videoFrameWidth     // Catch: NumberFormatException -> 0x003d
            if (r5 != r6) goto L_0x003a
            int r5 = r8.getHeight()     // Catch: NumberFormatException -> 0x003d
            int r6 = r4.videoFrameHeight     // Catch: NumberFormatException -> 0x003d
            if (r5 != r6) goto L_0x003a
            int r8 = r4.audioChannels     // Catch: NumberFormatException -> 0x003d
            r7.f35320C = r8     // Catch: NumberFormatException -> 0x003d
            int r8 = r4.audioSampleRate     // Catch: NumberFormatException -> 0x003d
            r7.f35321D = r8     // Catch: NumberFormatException -> 0x003d
            int r8 = r4.audioBitRate     // Catch: NumberFormatException -> 0x003d
            r7.f35322E = r8     // Catch: NumberFormatException -> 0x003d
            r8 = 1
            r0 = r8
            goto L_0x0044
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x003d:
            java.lang.String r8 = "VideoCapture"
            java.lang.String r9 = "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings."
            androidx.camera.core.C1915r1.m39523e(r8, r9)
        L_0x0044:
            if (r0 != 0) goto L_0x005e
            w.x2 r8 = r7.m39433f()
            w.z2 r8 = (p390w.C13709z2) r8
            int r9 = r8.m2983G()
            r7.f35320C = r9
            int r9 = r8.m2981I()
            r7.f35321D = r9
            int r8 = r8.m2984F()
            r7.f35322E = r8
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1781b3.m39843W(android.util.Size, java.lang.String):void");
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: C */
    public void mo20568C() {
        m39847S();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: D */
    protected Size mo20567D(Size size) {
        if (this.f1633y != null) {
            this.f1627s.stop();
            this.f1627s.release();
            this.f1628t.stop();
            this.f1628t.release();
            m39845U(false);
        }
        try {
            this.f1627s = MediaCodec.createEncoderByType("video/avc");
            this.f1628t = MediaCodec.createEncoderByType("audio/mp4a-latm");
            m39842X(m39434e(), size);
            m39424q();
            return size;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e.getCause());
        }
    }

    /* renamed from: X */
    void m39842X(String str, Size size) {
        Throwable e;
        C13709z2 z2Var = (C13709z2) m39433f();
        this.f1627s.reset();
        this.f35325H = EnumC1786e.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
        try {
            this.f1627s.configure(m39850P(z2Var, size), (Surface) null, (MediaCrypto) null, 1);
            if (this.f1633y != null) {
                m39845U(false);
            }
            final Surface createInputSurface = this.f1627s.createInputSurface();
            this.f1633y = createInputSurface;
            this.f1630v = C13619k2.C13621b.m3183o(z2Var);
            AbstractC13689w0 w0Var = this.f35323F;
            if (w0Var != null) {
                w0Var.m3023c();
            }
            C13642n1 n1Var = new C13642n1(this.f1633y, size, m39432h());
            this.f35323F = n1Var;
            AbstractFutureC7576b<Void> i = n1Var.m3017i();
            Objects.requireNonNull(createInputSurface);
            i.mo1409a(new Runnable() { // from class: androidx.camera.core.a3
                @Override // java.lang.Runnable
                public final void run() {
                    createInputSurface.release();
                }
            }, C13905a.m2336d());
            this.f1630v.m3190h(this.f35323F);
            this.f1630v.m3192f(new C1782a(str, size));
            m39440I(this.f1630v.m3185m());
            this.f35324G.set(true);
            m39843W(size, str);
            this.f1628t.reset();
            this.f1628t.configure(m39851O(), (Surface) null, (MediaCrypto) null, 1);
            if (this.f1634z != null) {
                this.f1634z.release();
            }
            this.f1634z = m39852N(z2Var);
            if (this.f1634z == null) {
                C1915r1.m39525c("VideoCapture", "AudioRecord object cannot initialized correctly!");
                this.f35324G.set(false);
            }
            synchronized (this.f1620l) {
                this.f1631w = -1;
                this.f1632x = -1;
            }
            this.f35319B = false;
        } catch (MediaCodec.CodecException e2) {
            int a = C1783b.m39840a(e2);
            String diagnosticInfo = e2.getDiagnosticInfo();
            if (a == 1100) {
                C1915r1.m39523e("VideoCapture", "CodecException: code: " + a + " diagnostic: " + diagnosticInfo);
                this.f35325H = EnumC1786e.VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE;
            } else if (a == 1101) {
                C1915r1.m39523e("VideoCapture", "CodecException: code: " + a + " diagnostic: " + diagnosticInfo);
                this.f35325H = EnumC1786e.VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED;
            }
            this.f35326I = e2;
        } catch (IllegalArgumentException e3) {
            e = e3;
            this.f35325H = EnumC1786e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.f35326I = e;
        } catch (IllegalStateException e4) {
            e = e4;
            this.f35325H = EnumC1786e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.f35326I = e;
        }
    }

    /* renamed from: Y */
    public void m39847S() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C13905a.m2336d().execute(new Runnable() { // from class: androidx.camera.core.x2
                @Override // java.lang.Runnable
                public final void run() {
                    C1781b3.this.m39847S();
                }
            });
            return;
        }
        C1915r1.m39523e("VideoCapture", "stopRecording");
        this.f1630v.m3184n();
        this.f1630v.m3190h(this.f35323F);
        m39440I(this.f1630v.m3185m());
        m39420u();
        if (!this.f35319B) {
            return;
        }
        if (this.f35324G.get()) {
            this.f1622n.set(true);
        } else {
            this.f1621m.set(true);
        }
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: g */
    public AbstractC13697x2<?> mo20549g(boolean z, AbstractC13702y2 y2Var) {
        AbstractC13662r0 a = y2Var.mo2994a(AbstractC13702y2.EnumC13704b.VIDEO_CAPTURE);
        if (z) {
            a = C13656q0.m3108b(a, f35316J.m39823a());
        }
        if (a == null) {
            return null;
        }
        return mo20548m(a).mo2998d();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: m */
    public AbstractC13697x2.AbstractC13698a<?, ?, ?> mo20548m(AbstractC13662r0 r0Var) {
        return C1784c.m39839e(r0Var);
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: w */
    public void mo20547w() {
        this.f1623o = new HandlerThread("CameraX-video encoding thread");
        this.f1625q = new HandlerThread("CameraX-audio encoding thread");
        this.f1623o.start();
        this.f1624p = new Handler(this.f1623o.getLooper());
        this.f1625q.start();
        this.f1626r = new Handler(this.f1625q.getLooper());
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: z */
    public void mo20546z() {
        m39847S();
        AbstractFutureC7576b<Void> bVar = this.f1629u;
        if (bVar != null) {
            bVar.mo1409a(new Runnable() { // from class: androidx.camera.core.z2
                @Override // java.lang.Runnable
                public final void run() {
                    C1781b3.this.m39849Q();
                }
            }, C13905a.m2336d());
        } else {
            m39849Q();
        }
    }
}
