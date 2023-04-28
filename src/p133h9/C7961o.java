package p133h9;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.facebook.react.uimanager.ViewProps;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;

/* renamed from: h9.o */
/* loaded from: classes5.dex */
public final class C7961o {

    /* renamed from: a */
    private final C7948e f17135a = new C7948e();

    /* renamed from: b */
    private final WindowManager f17136b;

    /* renamed from: c */
    private final Choreographer$FrameCallbackC7963b f17137c;

    /* renamed from: d */
    private final C7962a f17138d;

    /* renamed from: e */
    private boolean f17139e;

    /* renamed from: f */
    private Surface f17140f;

    /* renamed from: g */
    private float f17141g;

    /* renamed from: h */
    private float f17142h;

    /* renamed from: i */
    private float f17143i;

    /* renamed from: j */
    private float f17144j;

    /* renamed from: k */
    private long f17145k;

    /* renamed from: l */
    private long f17146l;

    /* renamed from: m */
    private long f17147m;

    /* renamed from: n */
    private long f17148n;

    /* renamed from: o */
    private long f17149o;

    /* renamed from: p */
    private long f17150p;

    /* renamed from: q */
    private long f17151q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h9.o$a */
    /* loaded from: classes5.dex */
    public final class C7962a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f17152a;

        public C7962a(DisplayManager displayManager) {
            this.f17152a = displayManager;
        }

        /* renamed from: a */
        public void m20990a() {
            this.f17152a.registerDisplayListener(this, C7557q0.m22117x());
        }

        /* renamed from: b */
        public void m20989b() {
            this.f17152a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                C7961o.this.m20993r();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: h9.o$b */
    /* loaded from: classes5.dex */
    private static final class Choreographer$FrameCallbackC7963b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: p */
        private static final Choreographer$FrameCallbackC7963b f17154p = new Choreographer$FrameCallbackC7963b();

        /* renamed from: k */
        public volatile long f17155k = -9223372036854775807L;

        /* renamed from: l */
        private final Handler f17156l;

        /* renamed from: m */
        private final HandlerThread f17157m;

        /* renamed from: n */
        private Choreographer f17158n;

        /* renamed from: o */
        private int f17159o;

        private Choreographer$FrameCallbackC7963b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f17157m = handlerThread;
            handlerThread.start();
            Handler w = C7557q0.m22119w(handlerThread.getLooper(), this);
            this.f17156l = w;
            w.sendEmptyMessage(0);
        }

        /* renamed from: b */
        private void m20987b() {
            int i = this.f17159o + 1;
            this.f17159o = i;
            if (i == 1) {
                ((Choreographer) C7510a.m22367e(this.f17158n)).postFrameCallback(this);
            }
        }

        /* renamed from: c */
        private void m20986c() {
            this.f17158n = Choreographer.getInstance();
        }

        /* renamed from: d */
        public static Choreographer$FrameCallbackC7963b m20985d() {
            return f17154p;
        }

        /* renamed from: f */
        private void m20983f() {
            int i = this.f17159o - 1;
            this.f17159o = i;
            if (i == 0) {
                ((Choreographer) C7510a.m22367e(this.f17158n)).removeFrameCallback(this);
                this.f17155k = -9223372036854775807L;
            }
        }

        /* renamed from: a */
        public void m20988a() {
            this.f17156l.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f17155k = j;
            ((Choreographer) C7510a.m22367e(this.f17158n)).postFrameCallbackDelayed(this, 500L);
        }

        /* renamed from: e */
        public void m20984e() {
            this.f17156l.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m20986c();
                return true;
            } else if (i == 1) {
                m20987b();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                m20983f();
                return true;
            }
        }
    }

    public C7961o(Context context) {
        C7962a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f17136b = (WindowManager) context.getSystemService("window");
        } else {
            this.f17136b = null;
        }
        if (this.f17136b != null) {
            this.f17138d = C7557q0.f16368a >= 17 ? m21005f((Context) C7510a.m22367e(context)) : aVar;
            this.f17137c = Choreographer$FrameCallbackC7963b.m20985d();
        } else {
            this.f17138d = null;
            this.f17137c = null;
        }
        this.f17145k = -9223372036854775807L;
        this.f17146l = -9223372036854775807L;
        this.f17141g = -1.0f;
        this.f17144j = 1.0f;
    }

    /* renamed from: c */
    private static boolean m21008c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    /* renamed from: d */
    private void m21007d() {
        Surface surface;
        if (C7557q0.f16368a >= 30 && (surface = this.f17140f) != null && this.f17143i != 0.0f) {
            this.f17143i = 0.0f;
            m20994q(surface, 0.0f);
        }
    }

    /* renamed from: e */
    private static long m21006e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* renamed from: f */
    private C7962a m21005f(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
        if (displayManager == null) {
            return null;
        }
        return new C7962a(displayManager);
    }

    /* renamed from: p */
    private void m20995p() {
        this.f17147m = 0L;
        this.f17150p = -1L;
        this.f17148n = -1L;
    }

    /* renamed from: q */
    private static void m20994q(Surface surface, float f) {
        int i;
        if (f == 0.0f) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            C7558r.m22108d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m20993r() {
        Display defaultDisplay = ((WindowManager) C7510a.m22367e(this.f17136b)).getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.f17145k = refreshRate;
            this.f17146l = (refreshRate * 80) / 100;
            return;
        }
        C7558r.m22104h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f17145k = -9223372036854775807L;
        this.f17146l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r7.f17142h) >= r1) goto L_0x006c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r7.f17135a.m21067c() >= 30) goto L_0x006c;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m20992s() {
        /*
            r7 = this;
            int r0 = p119g9.C7557q0.f16368a
            r1 = 30
            if (r0 < r1) goto L_0x0073
            android.view.Surface r0 = r7.f17140f
            if (r0 != 0) goto L_0x000c
            goto L_0x0073
        L_0x000c:
            h9.e r0 = r7.f17135a
            boolean r0 = r0.m21065e()
            if (r0 == 0) goto L_0x001b
            h9.e r0 = r7.f17135a
            float r0 = r0.m21068b()
            goto L_0x001d
        L_0x001b:
            float r0 = r7.f17141g
        L_0x001d:
            float r2 = r7.f17142h
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0061
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0061
            h9.e r1 = r7.f17135a
            boolean r1 = r1.m21065e()
            if (r1 == 0) goto L_0x0049
            h9.e r1 = r7.f17135a
            long r1 = r1.m21066d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0049
            r1 = r6
            goto L_0x004a
        L_0x0049:
            r1 = r5
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0052
        L_0x0050:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            float r2 = r7.f17142h
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            r6 = r5
            goto L_0x006c
        L_0x0061:
            if (r4 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            h9.e r2 = r7.f17135a
            int r2 = r2.m21067c()
            if (r2 < r1) goto L_0x005f
        L_0x006c:
            if (r6 == 0) goto L_0x0073
            r7.f17142h = r0
            r7.m20991t(r5)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p133h9.C7961o.m20992s():void");
    }

    /* renamed from: t */
    private void m20991t(boolean z) {
        Surface surface;
        float f;
        if (C7557q0.f16368a >= 30 && (surface = this.f17140f) != null) {
            if (this.f17139e) {
                float f2 = this.f17142h;
                if (f2 != -1.0f) {
                    f = f2 * this.f17144j;
                    if (!z || this.f17143i != f) {
                        this.f17143i = f;
                        m20994q(surface, f);
                    }
                    return;
                }
            }
            f = 0.0f;
            if (!z) {
            }
            this.f17143i = f;
            m20994q(surface, f);
        }
    }

    /* renamed from: b */
    public long m21009b(long j) {
        long j2;
        Choreographer$FrameCallbackC7963b bVar;
        if (this.f17150p != -1 && this.f17135a.m21065e()) {
            long a = this.f17151q + (((float) (this.f17135a.m21069a() * (this.f17147m - this.f17150p))) / this.f17144j);
            if (m21008c(j, a)) {
                j2 = a;
                this.f17148n = this.f17147m;
                this.f17149o = j2;
                bVar = this.f17137c;
                if (bVar != null || this.f17145k == -9223372036854775807L) {
                    return j2;
                }
                long j3 = bVar.f17155k;
                if (j3 == -9223372036854775807L) {
                    return j2;
                }
                return m21006e(j2, j3, this.f17145k) - this.f17146l;
            }
            m20995p();
        }
        j2 = j;
        this.f17148n = this.f17147m;
        this.f17149o = j2;
        bVar = this.f17137c;
        if (bVar != null) {
        }
        return j2;
    }

    @TargetApi(17)
    /* renamed from: g */
    public void m21004g() {
        if (this.f17136b != null) {
            C7962a aVar = this.f17138d;
            if (aVar != null) {
                aVar.m20989b();
            }
            ((Choreographer$FrameCallbackC7963b) C7510a.m22367e(this.f17137c)).m20984e();
        }
    }

    @TargetApi(17)
    /* renamed from: h */
    public void m21003h() {
        if (this.f17136b != null) {
            ((Choreographer$FrameCallbackC7963b) C7510a.m22367e(this.f17137c)).m20988a();
            C7962a aVar = this.f17138d;
            if (aVar != null) {
                aVar.m20990a();
            }
            m20993r();
        }
    }

    /* renamed from: i */
    public void m21002i(float f) {
        this.f17141g = f;
        this.f17135a.m21063g();
        m20992s();
    }

    /* renamed from: j */
    public void m21001j(long j) {
        long j2 = this.f17148n;
        if (j2 != -1) {
            this.f17150p = j2;
            this.f17151q = this.f17149o;
        }
        this.f17147m++;
        this.f17135a.m21064f(j * 1000);
        m20992s();
    }

    /* renamed from: k */
    public void m21000k(float f) {
        this.f17144j = f;
        m20995p();
        m20991t(false);
    }

    /* renamed from: l */
    public void m20999l() {
        m20995p();
    }

    /* renamed from: m */
    public void m20998m() {
        this.f17139e = true;
        m20995p();
        m20991t(false);
    }

    /* renamed from: n */
    public void m20997n() {
        this.f17139e = false;
        m21007d();
    }

    /* renamed from: o */
    public void m20996o(Surface surface) {
        if (surface instanceof C7945d) {
            surface = null;
        }
        if (this.f17140f != surface) {
            m21007d();
            this.f17140f = surface;
            m20991t(true);
        }
    }
}
