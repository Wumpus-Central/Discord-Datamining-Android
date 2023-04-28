package p288q;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC1883m;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.AbstractC1926u;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1770a2;
import androidx.camera.core.C1915r1;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.facebook.react.views.text.TypefaceStyle;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p120gc.AbstractFutureC7576b;
import p288q.C11798c3;
import p288q.C11840j0;
import p308r.C12252a;
import p308r.C12275i;
import p308r.C12306v0;
import p390w.AbstractC13568a2;
import p390w.AbstractC13571b0;
import p390w.AbstractC13589e0;
import p390w.AbstractC13597g0;
import p390w.AbstractC13630l2;
import p390w.AbstractC13688w;
import p390w.AbstractC13689w0;
import p390w.C13565a0;
import p390w.C13593f0;
import p390w.C13610j0;
import p390w.C13619k2;
import p390w.C13639n0;
import p390w.C13642n1;
import p390w.C13678u1;
import p390w.C13685v2;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.j0 */
/* loaded from: classes.dex */
public final class C11840j0 implements AbstractC13597g0 {

    /* renamed from: A */
    private final C11844d f39119A;

    /* renamed from: B */
    private final C13610j0 f39120B;

    /* renamed from: D */
    private C11859k2 f39122D;

    /* renamed from: E */
    private final C11940w1 f39123E;

    /* renamed from: F */
    private final C11798c3.C11799a f39124F;

    /* renamed from: H */
    private AbstractC13688w f39126H;

    /* renamed from: J */
    private AbstractC13630l2 f39128J;

    /* renamed from: k */
    private final C13685v2 f26430k;

    /* renamed from: l */
    private final C12306v0 f26431l;

    /* renamed from: m */
    private final Executor f26432m;

    /* renamed from: n */
    private final ScheduledExecutorService f26433n;

    /* renamed from: p */
    private final C13678u1<AbstractC13597g0.EnumC13598a> f26435p;

    /* renamed from: q */
    private final C11867l1 f26436q;

    /* renamed from: r */
    private final C11935w f26437r;

    /* renamed from: s */
    private final C11847g f26438s;

    /* renamed from: t */
    final C11872m0 f26439t;

    /* renamed from: u */
    CameraDevice f26440u;

    /* renamed from: y */
    C2114c.C2115a<Void> f26444y;

    /* renamed from: o */
    volatile EnumC11846f f26434o = EnumC11846f.INITIALIZED;

    /* renamed from: v */
    int f26441v = 0;

    /* renamed from: x */
    final AtomicInteger f26443x = new AtomicInteger(0);

    /* renamed from: z */
    final Map<AbstractC11929u1, AbstractFutureC7576b<Void>> f26445z = new LinkedHashMap();

    /* renamed from: C */
    final Set<C11920t1> f39121C = new HashSet();

    /* renamed from: G */
    private final Set<String> f39125G = new HashSet();

    /* renamed from: I */
    final Object f39127I = new Object();

    /* renamed from: K */
    boolean f39129K = false;

    /* renamed from: w */
    AbstractC11929u1 f26442w = m8511W();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.j0$a */
    /* loaded from: classes.dex */
    public class C11841a implements AbstractC14182c<Void> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11929u1 f26446a;

        C11841a(AbstractC11929u1 u1Var) {
            this.f26446a = u1Var;
        }

        /* renamed from: b */
        public void mo1412a(Void r2) {
            CameraDevice cameraDevice;
            C11840j0.this.f26445z.remove(this.f26446a);
            int i = C11843c.f26449a[C11840j0.this.f26434o.ordinal()];
            if (i != 3) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                } else if (C11840j0.this.f26441v == 0) {
                    return;
                }
            }
            if (C11840j0.this.m8522L() && (cameraDevice = C11840j0.this.f26440u) != null) {
                C12252a.m7262a(cameraDevice);
                C11840j0.this.f26440u = null;
            }
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.j0$b */
    /* loaded from: classes.dex */
    public class C11842b implements AbstractC14182c<Void> {
        C11842b() {
        }

        /* renamed from: b */
        public void mo1412a(Void r1) {
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            if (th2 instanceof AbstractC13689w0.C13690a) {
                C13619k2 G = C11840j0.this.m8527G(((AbstractC13689w0.C13690a) th2).m3010a());
                if (G != null) {
                    C11840j0.this.m8504c0(G);
                }
            } else if (th2 instanceof CancellationException) {
                C11840j0.this.m8529E("Unable to configure camera cancelled");
            } else {
                EnumC11846f fVar = C11840j0.this.f26434o;
                EnumC11846f fVar2 = EnumC11846f.OPENED;
                if (fVar == fVar2) {
                    C11840j0.this.m8497i0(fVar2, AbstractC1926u.AbstractC1927a.m39501b(4, th2));
                }
                if (th2 instanceof CameraAccessException) {
                    C11840j0 j0Var = C11840j0.this;
                    j0Var.m8529E("Unable to configure camera due to " + th2.getMessage());
                } else if (th2 instanceof TimeoutException) {
                    C1915r1.m39525c("Camera2CameraImpl", "Unable to configure camera " + C11840j0.this.f26439t.mo3297b() + ", timeout!");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.j0$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11843c {

        /* renamed from: a */
        static final /* synthetic */ int[] f26449a;

        static {
            int[] iArr = new int[EnumC11846f.values().length];
            f26449a = iArr;
            try {
                iArr[EnumC11846f.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26449a[EnumC11846f.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26449a[EnumC11846f.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26449a[EnumC11846f.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26449a[EnumC11846f.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26449a[EnumC11846f.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26449a[EnumC11846f.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26449a[EnumC11846f.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.j0$d */
    /* loaded from: classes.dex */
    public final class C11844d extends CameraManager.AvailabilityCallback implements C13610j0.AbstractC13612b {

        /* renamed from: a */
        private final String f26450a;

        /* renamed from: b */
        private boolean f26451b = true;

        C11844d(String str) {
            this.f26450a = str;
        }

        @Override // p390w.C13610j0.AbstractC13612b
        /* renamed from: a */
        public void mo3220a() {
            if (C11840j0.this.f26434o == EnumC11846f.PENDING_OPEN) {
                C11840j0.this.m8485p0(false);
            }
        }

        /* renamed from: b */
        boolean m8471b() {
            return this.f26451b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f26450a.equals(str)) {
                this.f26451b = true;
                if (C11840j0.this.f26434o == EnumC11846f.PENDING_OPEN) {
                    C11840j0.this.m8485p0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f26450a.equals(str)) {
                this.f26451b = false;
            }
        }
    }

    /* renamed from: q.j0$e */
    /* loaded from: classes.dex */
    final class C11845e implements AbstractC13571b0.AbstractC13574c {
        C11845e() {
        }

        @Override // p390w.AbstractC13571b0.AbstractC13574c
        /* renamed from: a */
        public void mo3331a() {
            C11840j0.this.m8483q0();
        }

        @Override // p390w.AbstractC13571b0.AbstractC13574c
        /* renamed from: b */
        public void mo3330b(List<C13639n0> list) {
            C11840j0.this.m8494k0((List) C2517g.m37588g(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.j0$f */
    /* loaded from: classes.dex */
    public enum EnumC11846f {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.j0$g */
    /* loaded from: classes.dex */
    public final class C11847g extends CameraDevice.StateCallback {

        /* renamed from: a */
        private final Executor f26463a;

        /* renamed from: b */
        private final ScheduledExecutorService f26464b;

        /* renamed from: c */
        private RunnableC11849b f26465c;

        /* renamed from: d */
        ScheduledFuture<?> f26466d;

        /* renamed from: e */
        private final C11848a f26467e = new C11848a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q.j0$g$a */
        /* loaded from: classes.dex */
        public class C11848a {

            /* renamed from: a */
            private long f26469a = -1;

            C11848a() {
            }

            /* renamed from: a */
            boolean m8464a() {
                boolean z;
                if (m8463b() >= m8461d()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
                m8460e();
                return false;
            }

            /* renamed from: b */
            long m8463b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f26469a == -1) {
                    this.f26469a = uptimeMillis;
                }
                return uptimeMillis - this.f26469a;
            }

            /* renamed from: c */
            int m8462c() {
                if (!C11847g.this.m8465f()) {
                    return TypefaceStyle.BOLD;
                }
                long b = m8463b();
                if (b <= 120000) {
                    return RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                }
                if (b <= 300000) {
                    return 2000;
                }
                return 4000;
            }

            /* renamed from: d */
            int m8461d() {
                return !C11847g.this.m8465f() ? 10000 : 1800000;
            }

            /* renamed from: e */
            void m8460e() {
                this.f26469a = -1L;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q.j0$g$b */
        /* loaded from: classes.dex */
        public class RunnableC11849b implements Runnable {

            /* renamed from: k */
            private Executor f26471k;

            /* renamed from: l */
            private boolean f26472l = false;

            RunnableC11849b(Executor executor) {
                this.f26471k = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m8457c() {
                boolean z;
                if (!this.f26472l) {
                    if (C11840j0.this.f26434o == EnumC11846f.REOPENING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C2517g.m37586i(z);
                    if (C11847g.this.m8465f()) {
                        C11840j0.this.m8487o0(true);
                    } else {
                        C11840j0.this.m8485p0(true);
                    }
                }
            }

            /* renamed from: b */
            void m8458b() {
                this.f26472l = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f26471k.execute(new Runnable() { // from class: q.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11840j0.C11847g.RunnableC11849b.this.m8457c();
                    }
                });
            }
        }

        C11847g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f26463a = executor;
            this.f26464b = scheduledExecutorService;
        }

        /* renamed from: b */
        private void m8469b(CameraDevice cameraDevice, int i) {
            boolean z;
            int i2;
            if (C11840j0.this.f26434o == EnumC11846f.OPENING || C11840j0.this.f26434o == EnumC11846f.OPENED || C11840j0.this.f26434o == EnumC11846f.REOPENING) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "Attempt to handle open error from non open state: " + C11840j0.this.f26434o);
            if (i == 1 || i == 2 || i == 4) {
                C1915r1.m39527a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), C11840j0.m8525I(i)));
                m8468c(i);
                return;
            }
            C1915r1.m39525c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C11840j0.m8525I(i) + " closing camera.");
            if (i == 3) {
                i2 = 5;
            } else {
                i2 = 6;
            }
            C11840j0.this.m8497i0(EnumC11846f.CLOSING, AbstractC1926u.AbstractC1927a.m39502a(i2));
            C11840j0.this.m8533A(false);
        }

        /* renamed from: c */
        private void m8468c(int i) {
            boolean z;
            int i2 = 1;
            if (C11840j0.this.f26441v != 0) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = 3;
            }
            C11840j0.this.m8497i0(EnumC11846f.REOPENING, AbstractC1926u.AbstractC1927a.m39502a(i2));
            C11840j0.this.m8533A(false);
        }

        /* renamed from: a */
        boolean m8470a() {
            if (this.f26466d == null) {
                return false;
            }
            C11840j0 j0Var = C11840j0.this;
            j0Var.m8529E("Cancelling scheduled re-open: " + this.f26465c);
            this.f26465c.m8458b();
            this.f26465c = null;
            this.f26466d.cancel(false);
            this.f26466d = null;
            return true;
        }

        /* renamed from: d */
        void m8467d() {
            this.f26467e.m8460e();
        }

        /* renamed from: e */
        void m8466e() {
            boolean z;
            boolean z2 = true;
            if (this.f26465c == null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37586i(z);
            if (this.f26466d != null) {
                z2 = false;
            }
            C2517g.m37586i(z2);
            if (this.f26467e.m8464a()) {
                this.f26465c = new RunnableC11849b(this.f26463a);
                C11840j0.this.m8529E("Attempting camera re-open in " + this.f26467e.m8462c() + "ms: " + this.f26465c + " activeResuming = " + C11840j0.this.f39129K);
                this.f26466d = this.f26464b.schedule(this.f26465c, (long) this.f26467e.m8462c(), TimeUnit.MILLISECONDS);
                return;
            }
            C1915r1.m39525c("Camera2CameraImpl", "Camera reopening attempted for " + this.f26467e.m8461d() + "ms without success.");
            C11840j0.this.m8496j0(EnumC11846f.PENDING_OPEN, null, false);
        }

        /* renamed from: f */
        boolean m8465f() {
            int i;
            C11840j0 j0Var = C11840j0.this;
            return (!j0Var.f39129K || (i = j0Var.f26441v) == 4 || i == 2) ? false : true;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            boolean z;
            C11840j0.this.m8529E("CameraDevice.onClosed()");
            if (C11840j0.this.f26440u == null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i = C11843c.f26449a[C11840j0.this.f26434o.ordinal()];
            if (i != 3) {
                if (i == 6) {
                    C11840j0 j0Var = C11840j0.this;
                    if (j0Var.f26441v != 0) {
                        j0Var.m8529E("Camera closed due to error: " + C11840j0.m8525I(C11840j0.this.f26441v));
                        m8466e();
                        return;
                    }
                    j0Var.m8485p0(false);
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + C11840j0.this.f26434o);
                }
            }
            C2517g.m37586i(C11840j0.this.m8522L());
            C11840j0.this.m8526H();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C11840j0.this.m8529E("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            C11840j0 j0Var = C11840j0.this;
            j0Var.f26440u = cameraDevice;
            j0Var.f26441v = i;
            int i2 = C11843c.f26449a[j0Var.f26434o.ordinal()];
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5 || i2 == 6) {
                    C1915r1.m39527a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), C11840j0.m8525I(i), C11840j0.this.f26434o.name()));
                    m8469b(cameraDevice, i);
                    return;
                } else if (i2 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + C11840j0.this.f26434o);
                }
            }
            C1915r1.m39525c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), C11840j0.m8525I(i), C11840j0.this.f26434o.name()));
            C11840j0.this.m8533A(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            C11840j0.this.m8529E("CameraDevice.onOpened()");
            C11840j0 j0Var = C11840j0.this;
            j0Var.f26440u = cameraDevice;
            j0Var.f26441v = 0;
            m8467d();
            int i = C11843c.f26449a[C11840j0.this.f26434o.ordinal()];
            if (i != 3) {
                if (i == 5 || i == 6) {
                    C11840j0.this.m8498h0(EnumC11846f.OPENED);
                    C11840j0.this.m8507a0();
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + C11840j0.this.f26434o);
                }
            }
            C2517g.m37586i(C11840j0.this.m8522L());
            C11840j0.this.f26440u.close();
            C11840j0.this.f26440u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.j0$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11850h {
        /* renamed from: a */
        static AbstractC11850h m8456a(String str, Class<?> cls, C13619k2 k2Var, Size size) {
            return new C11801d(str, cls, k2Var, size);
        }

        /* renamed from: b */
        static AbstractC11850h m8455b(AbstractC1948w2 w2Var) {
            return m8456a(C11840j0.m8524J(w2Var), w2Var.getClass(), w2Var.m39429k(), w2Var.m39437b());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C13619k2 mo8454c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Size mo8453d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract String mo8452e();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract Class<?> mo8451f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11840j0(C12306v0 v0Var, String str, C11872m0 m0Var, C13610j0 j0Var, Executor executor, Handler handler) {
        C13678u1<AbstractC13597g0.EnumC13598a> u1Var = new C13678u1<>();
        this.f26435p = u1Var;
        this.f26431l = v0Var;
        this.f39120B = j0Var;
        ScheduledExecutorService f = C13905a.m2334f(handler);
        this.f26433n = f;
        Executor g = C13905a.m2333g(executor);
        this.f26432m = g;
        this.f26438s = new C11847g(g, f);
        this.f26430k = new C13685v2(str);
        u1Var.m3068m(AbstractC13597g0.EnumC13598a.CLOSED);
        C11867l1 l1Var = new C11867l1(j0Var);
        this.f26436q = l1Var;
        C11940w1 w1Var = new C11940w1(g);
        this.f39123E = w1Var;
        try {
            C11935w wVar = new C11935w(v0Var.m7180c(str), f, g, new C11845e(), m0Var.mo3294e());
            this.f26437r = wVar;
            this.f26439t = m0Var;
            m0Var.m8412o(wVar);
            m0Var.m8409r(l1Var.m8425a());
            this.f39124F = new C11798c3.C11799a(g, f, handler, w1Var, m0Var.m8413n());
            C11844d dVar = new C11844d(str);
            this.f39119A = dVar;
            j0Var.m3227e(this, g, dVar);
            v0Var.m7177f(g, dVar);
        } catch (C12275i e) {
            throw C11874m1.m8406a(e);
        }
    }

    /* renamed from: B */
    private void m8532B() {
        m8529E("Closing camera.");
        int i = C11843c.f26449a[this.f26434o.ordinal()];
        boolean z = false;
        if (i == 2) {
            if (this.f26440u == null) {
                z = true;
            }
            C2517g.m37586i(z);
            m8498h0(EnumC11846f.INITIALIZED);
        } else if (i == 4) {
            m8498h0(EnumC11846f.CLOSING);
            m8533A(false);
        } else if (i == 5 || i == 6) {
            boolean a = this.f26438s.m8470a();
            m8498h0(EnumC11846f.CLOSING);
            if (a) {
                C2517g.m37586i(m8522L());
                m8526H();
            }
        } else {
            m8529E("close() ignored due to being in state: " + this.f26434o);
        }
    }

    /* renamed from: C */
    private void m8531C(boolean z) {
        final C11920t1 t1Var = new C11920t1();
        this.f39121C.add(t1Var);
        m8499g0(z);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(DiscordVideoMediaSource.DEFAULT_WIDTH, DiscordVideoMediaSource.DEFAULT_HEIGHT);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable g0Var = new Runnable() { // from class: q.g0
            @Override // java.lang.Runnable
            public final void run() {
                C11840j0.m8520N(surface, surfaceTexture);
            }
        };
        C13619k2.C13621b bVar = new C13619k2.C13621b();
        final C13642n1 n1Var = new C13642n1(surface);
        bVar.m3190h(n1Var);
        bVar.m3180r(1);
        m8529E("Start configAndClose.");
        t1Var.mo8288b(bVar.m3185m(), (CameraDevice) C2517g.m37588g(this.f26440u), this.f39124F.m8600a()).mo1409a(new Runnable() { // from class: q.h0
            @Override // java.lang.Runnable
            public final void run() {
                C11840j0.this.m8519O(t1Var, n1Var, g0Var);
            }
        }, this.f26432m);
    }

    /* renamed from: D */
    private CameraDevice.StateCallback m8530D() {
        ArrayList arrayList = new ArrayList(this.f26430k.m3048e().m3176b().m3206b());
        arrayList.add(this.f39123E.m8214c());
        arrayList.add(this.f26438s);
        return C11851j1.m8450a(arrayList);
    }

    /* renamed from: F */
    private void m8528F(String str, Throwable th2) {
        C1915r1.m39526b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    /* renamed from: I */
    static String m8525I(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: J */
    static String m8524J(AbstractC1948w2 w2Var) {
        return w2Var.m39431i() + w2Var.hashCode();
    }

    /* renamed from: K */
    private boolean m8523K() {
        if (((C11872m0) mo3265j()).m8413n() == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m8521M(List list) {
        try {
            m8491m0(list);
        } finally {
            this.f26437r.m8233v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static /* synthetic */ void m8520N(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m8517Q(String str, C13619k2 k2Var) {
        m8529E("Use case " + str + " ACTIVE");
        this.f26430k.m3040m(str, k2Var);
        this.f26430k.m3036q(str, k2Var);
        m8483q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m8516R(String str) {
        m8529E("Use case " + str + " INACTIVE");
        this.f26430k.m3037p(str);
        m8483q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m8515S(String str, C13619k2 k2Var) {
        m8529E("Use case " + str + " RESET");
        this.f26430k.m3036q(str, k2Var);
        m8499g0(false);
        m8483q0();
        if (this.f26434o == EnumC11846f.OPENED) {
            m8507a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m8514T(String str, C13619k2 k2Var) {
        m8529E("Use case " + str + " UPDATED");
        this.f26430k.m3036q(str, k2Var);
        m8483q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static /* synthetic */ void m8513U(C13619k2.AbstractC13622c cVar, C13619k2 k2Var) {
        cVar.mo3179a(k2Var, C13619k2.EnumC13624e.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m8512V(boolean z) {
        this.f39129K = z;
        if (!z) {
            return;
        }
        if (this.f26434o == EnumC11846f.PENDING_OPEN || this.f26434o == EnumC11846f.REOPENING) {
            m8487o0(false);
        }
    }

    /* renamed from: W */
    private AbstractC11929u1 m8511W() {
        synchronized (this.f39127I) {
            if (this.f39128J == null) {
                return new C11920t1();
            }
            return new C11889p2(this.f39128J, this.f26439t, this.f26432m, this.f26433n);
        }
    }

    /* renamed from: X */
    private void m8510X(List<AbstractC1948w2> list) {
        for (AbstractC1948w2 w2Var : list) {
            String J = m8524J(w2Var);
            if (!this.f39125G.contains(J)) {
                this.f39125G.add(J);
                w2Var.mo20569B();
            }
        }
    }

    /* renamed from: Y */
    private void m8509Y(List<AbstractC1948w2> list) {
        for (AbstractC1948w2 w2Var : list) {
            String J = m8524J(w2Var);
            if (this.f39125G.contains(J)) {
                w2Var.mo20568C();
                this.f39125G.remove(J);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: Z */
    private void m8508Z(boolean z) {
        if (!z) {
            this.f26438s.m8467d();
        }
        this.f26438s.m8470a();
        m8529E("Opening camera.");
        m8498h0(EnumC11846f.OPENING);
        try {
            this.f26431l.m7178e(this.f26439t.mo3297b(), this.f26432m, m8530D());
        } catch (SecurityException e) {
            m8529E("Unable to open camera due to " + e.getMessage());
            m8498h0(EnumC11846f.REOPENING);
            this.f26438s.m8466e();
        } catch (C12275i e2) {
            m8529E("Unable to open camera due to " + e2.getMessage());
            if (e2.m7229d() == 10001) {
                m8497i0(EnumC11846f.INITIALIZED, AbstractC1926u.AbstractC1927a.m39501b(7, e2));
            }
        }
    }

    /* renamed from: b0 */
    private void m8506b0() {
        int i = C11843c.f26449a[this.f26434o.ordinal()];
        boolean z = false;
        if (i == 1 || i == 2) {
            m8487o0(false);
        } else if (i != 3) {
            m8529E("open() ignored due to being in state: " + this.f26434o);
        } else {
            m8498h0(EnumC11846f.REOPENING);
            if (!m8522L() && this.f26441v == 0) {
                if (this.f26440u != null) {
                    z = true;
                }
                C2517g.m37585j(z, "Camera Device should be open if session close is not complete");
                m8498h0(EnumC11846f.OPENED);
                m8507a0();
            }
        }
    }

    /* renamed from: f0 */
    private void m8500f0() {
        if (this.f39122D != null) {
            C13685v2 v2Var = this.f26430k;
            v2Var.m3038o(this.f39122D.m8443d() + this.f39122D.hashCode());
            C13685v2 v2Var2 = this.f26430k;
            v2Var2.m3037p(this.f39122D.m8443d() + this.f39122D.hashCode());
            this.f39122D.m8445b();
            this.f39122D = null;
        }
    }

    /* renamed from: l0 */
    private Collection<AbstractC11850h> m8493l0(Collection<AbstractC1948w2> collection) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1948w2 w2Var : collection) {
            arrayList.add(AbstractC11850h.m8455b(w2Var));
        }
        return arrayList;
    }

    /* renamed from: m0 */
    private void m8491m0(Collection<AbstractC11850h> collection) {
        Size d;
        boolean isEmpty = this.f26430k.m3047f().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (AbstractC11850h hVar : collection) {
            if (!this.f26430k.m3044i(hVar.mo8452e())) {
                this.f26430k.m3039n(hVar.mo8452e(), hVar.mo8454c());
                arrayList.add(hVar.mo8452e());
                if (hVar.mo8451f() == C1770a2.class && (d = hVar.mo8453d()) != null) {
                    rational = new Rational(d.getWidth(), d.getHeight());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m8529E("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
            if (isEmpty) {
                this.f26437r.m8253d0(true);
                this.f26437r.m8271L();
            }
            m8475y();
            m8483q0();
            m8499g0(false);
            if (this.f26434o == EnumC11846f.OPENED) {
                m8507a0();
            } else {
                m8506b0();
            }
            if (rational != null) {
                this.f26437r.m8252e0(rational);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public void m8518P(Collection<AbstractC11850h> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (AbstractC11850h hVar : collection) {
            if (this.f26430k.m3044i(hVar.mo8452e())) {
                this.f26430k.m3041l(hVar.mo8452e());
                arrayList.add(hVar.mo8452e());
                if (hVar.mo8451f() == C1770a2.class) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m8529E("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
            if (z) {
                this.f26437r.m8252e0(null);
            }
            m8475y();
            if (this.f26430k.m3047f().isEmpty()) {
                this.f26437r.m8233v();
                m8499g0(false);
                this.f26437r.m8253d0(false);
                this.f26442w = m8511W();
                m8532B();
                return;
            }
            m8483q0();
            m8499g0(false);
            if (this.f26434o == EnumC11846f.OPENED) {
                m8507a0();
            }
        }
    }

    /* renamed from: x */
    private void m8476x() {
        if (this.f39122D != null) {
            C13685v2 v2Var = this.f26430k;
            v2Var.m3039n(this.f39122D.m8443d() + this.f39122D.hashCode(), this.f39122D.m8442e());
            C13685v2 v2Var2 = this.f26430k;
            v2Var2.m3040m(this.f39122D.m8443d() + this.f39122D.hashCode(), this.f39122D.m8442e());
        }
    }

    /* renamed from: y */
    private void m8475y() {
        C13619k2 b = this.f26430k.m3048e().m3176b();
        C13639n0 f = b.m3202f();
        int size = f.m3148d().size();
        int size2 = b.m3199i().size();
        if (b.m3199i().isEmpty()) {
            return;
        }
        if (f.m3148d().isEmpty()) {
            if (this.f39122D == null) {
                this.f39122D = new C11859k2(this.f26439t.m8416k());
            }
            m8476x();
        } else if (size2 == 1 && size == 1) {
            m8500f0();
        } else if (size >= 2) {
            m8500f0();
        } else {
            C1915r1.m39527a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    /* renamed from: z */
    private boolean m8474z(C13639n0.C13640a aVar) {
        if (!aVar.m3133l().isEmpty()) {
            C1915r1.m39517k("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (C13619k2 k2Var : this.f26430k.m3049d()) {
            List<AbstractC13689w0> d = k2Var.m3202f().m3148d();
            if (!d.isEmpty()) {
                for (AbstractC13689w0 w0Var : d) {
                    aVar.m3139f(w0Var);
                }
            }
        }
        if (!aVar.m3133l().isEmpty()) {
            return true;
        }
        C1915r1.m39517k("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* renamed from: A */
    void m8533A(boolean z) {
        boolean z2;
        if (this.f26434o == EnumC11846f.CLOSING || this.f26434o == EnumC11846f.RELEASING || (this.f26434o == EnumC11846f.REOPENING && this.f26441v != 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2517g.m37585j(z2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f26434o + " (error: " + m8525I(this.f26441v) + ")");
        int i = Build.VERSION.SDK_INT;
        if (i <= 23 || i >= 29 || !m8523K() || this.f26441v != 0) {
            m8499g0(z);
        } else {
            m8531C(z);
        }
        this.f26442w.mo8287c();
    }

    /* renamed from: E */
    void m8529E(String str) {
        m8528F(str, null);
    }

    /* renamed from: G */
    C13619k2 m8527G(AbstractC13689w0 w0Var) {
        for (C13619k2 k2Var : this.f26430k.m3047f()) {
            if (k2Var.m3199i().contains(w0Var)) {
                return k2Var;
            }
        }
        return null;
    }

    /* renamed from: H */
    void m8526H() {
        boolean z;
        if (this.f26434o == EnumC11846f.RELEASING || this.f26434o == EnumC11846f.CLOSING) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37586i(z);
        C2517g.m37586i(this.f26445z.isEmpty());
        this.f26440u = null;
        if (this.f26434o == EnumC11846f.CLOSING) {
            m8498h0(EnumC11846f.INITIALIZED);
            return;
        }
        this.f26431l.m7176g(this.f39119A);
        m8498h0(EnumC11846f.RELEASED);
        C2114c.C2115a<Void> aVar = this.f26444y;
        if (aVar != null) {
            aVar.m38961c(null);
            this.f26444y = null;
        }
    }

    /* renamed from: L */
    boolean m8522L() {
        return this.f26445z.isEmpty() && this.f39121C.isEmpty();
    }

    @Override // p390w.AbstractC13597g0, androidx.camera.core.AbstractC1874k
    /* renamed from: a */
    public /* synthetic */ AbstractC1911r mo330a() {
        return C13593f0.m3282b(this);
    }

    /* renamed from: a0 */
    void m8507a0() {
        boolean z;
        if (this.f26434o == EnumC11846f.OPENED) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37586i(z);
        C13619k2.C13625f e = this.f26430k.m3048e();
        if (!e.m3174d()) {
            m8529E("Unable to create capture session due to conflicting configurations");
        } else {
            C14186f.m1427b(this.f26442w.mo8288b(e.m3176b(), (CameraDevice) C2517g.m37588g(this.f26440u), this.f39124F.m8600a()), new C11842b(), this.f26432m);
        }
    }

    @Override // androidx.camera.core.AbstractC1874k
    /* renamed from: b */
    public /* synthetic */ AbstractC1883m mo329b() {
        return C13593f0.m3283a(this);
    }

    @Override // androidx.camera.core.AbstractC1948w2.AbstractC1952d
    /* renamed from: c */
    public void mo8505c(AbstractC1948w2 w2Var) {
        C2517g.m37588g(w2Var);
        final String J = m8524J(w2Var);
        final C13619k2 k = w2Var.m39429k();
        this.f26432m.execute(new Runnable() { // from class: q.b0
            @Override // java.lang.Runnable
            public final void run() {
                C11840j0.this.m8517Q(J, k);
            }
        });
    }

    /* renamed from: c0 */
    void m8504c0(final C13619k2 k2Var) {
        ScheduledExecutorService d = C13905a.m2336d();
        List<C13619k2.AbstractC13622c> c = k2Var.m3205c();
        if (!c.isEmpty()) {
            final C13619k2.AbstractC13622c cVar = c.get(0);
            m8528F("Posting surface closed", new Throwable());
            d.execute(new Runnable() { // from class: q.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C11840j0.m8513U(C13619k2.AbstractC13622c.this, k2Var);
                }
            });
        }
    }

    @Override // p390w.AbstractC13597g0
    /* renamed from: d */
    public void mo3270d(AbstractC13688w wVar) {
        if (wVar == null) {
            wVar = C13565a0.m3342a();
        }
        AbstractC13630l2 v = wVar.mo3027v(null);
        this.f39126H = wVar;
        synchronized (this.f39127I) {
            this.f39128J = v;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m8519O(C11920t1 t1Var, AbstractC13689w0 w0Var, Runnable runnable) {
        this.f39121C.remove(t1Var);
        AbstractFutureC7576b<Void> e0 = m8501e0(t1Var, false);
        w0Var.m3023c();
        C14186f.m1415n(Arrays.asList(e0, w0Var.m3017i())).mo1409a(runnable, C13905a.m2339a());
    }

    @Override // androidx.camera.core.AbstractC1948w2.AbstractC1952d
    /* renamed from: e */
    public void mo8502e(AbstractC1948w2 w2Var) {
        C2517g.m37588g(w2Var);
        final String J = m8524J(w2Var);
        final C13619k2 k = w2Var.m39429k();
        this.f26432m.execute(new Runnable() { // from class: q.d0
            @Override // java.lang.Runnable
            public final void run() {
                C11840j0.this.m8514T(J, k);
            }
        });
    }

    /* renamed from: e0 */
    AbstractFutureC7576b<Void> m8501e0(AbstractC11929u1 u1Var, boolean z) {
        u1Var.close();
        AbstractFutureC7576b<Void> e = u1Var.mo8285e(z);
        m8529E("Releasing session in state " + this.f26434o.name());
        this.f26445z.put(u1Var, e);
        C14186f.m1427b(e, new C11841a(u1Var), C13905a.m2339a());
        return e;
    }

    @Override // p390w.AbstractC13597g0
    /* renamed from: f */
    public AbstractC13571b0 mo3269f() {
        return this.f26437r;
    }

    @Override // p390w.AbstractC13597g0
    /* renamed from: g */
    public void mo3268g(final boolean z) {
        this.f26432m.execute(new Runnable() { // from class: q.a0
            @Override // java.lang.Runnable
            public final void run() {
                C11840j0.this.m8512V(z);
            }
        });
    }

    /* renamed from: g0 */
    void m8499g0(boolean z) {
        boolean z2;
        if (this.f26442w != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2517g.m37586i(z2);
        m8529E("Resetting Capture Session");
        AbstractC11929u1 u1Var = this.f26442w;
        C13619k2 g = u1Var.mo8283g();
        List<C13639n0> f = u1Var.mo8284f();
        AbstractC11929u1 W = m8511W();
        this.f26442w = W;
        W.mo8286d(g);
        this.f26442w.mo8289a(f);
        m8501e0(u1Var, z);
    }

    @Override // p390w.AbstractC13597g0
    /* renamed from: h */
    public void mo3267h(Collection<AbstractC1948w2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            this.f26437r.m8271L();
            m8510X(new ArrayList(arrayList));
            final ArrayList arrayList2 = new ArrayList(m8493l0(arrayList));
            try {
                this.f26432m.execute(new Runnable() { // from class: q.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11840j0.this.m8521M(arrayList2);
                    }
                });
            } catch (RejectedExecutionException e) {
                m8528F("Unable to attach use cases.", e);
                this.f26437r.m8233v();
            }
        }
    }

    /* renamed from: h0 */
    void m8498h0(EnumC11846f fVar) {
        m8497i0(fVar, null);
    }

    @Override // p390w.AbstractC13597g0
    /* renamed from: i */
    public void mo3266i(Collection<AbstractC1948w2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            final ArrayList arrayList2 = new ArrayList(m8493l0(arrayList));
            m8509Y(new ArrayList(arrayList));
            this.f26432m.execute(new Runnable() { // from class: q.e0
                @Override // java.lang.Runnable
                public final void run() {
                    C11840j0.this.m8518P(arrayList2);
                }
            });
        }
    }

    /* renamed from: i0 */
    void m8497i0(EnumC11846f fVar, AbstractC1926u.AbstractC1927a aVar) {
        m8496j0(fVar, aVar, true);
    }

    @Override // p390w.AbstractC13597g0
    /* renamed from: j */
    public AbstractC13589e0 mo3265j() {
        return this.f26439t;
    }

    /* renamed from: j0 */
    void m8496j0(EnumC11846f fVar, AbstractC1926u.AbstractC1927a aVar, boolean z) {
        AbstractC13597g0.EnumC13598a aVar2;
        m8529E("Transitioning camera internal state: " + this.f26434o + " --> " + fVar);
        this.f26434o = fVar;
        switch (C11843c.f26449a[fVar.ordinal()]) {
            case 1:
                aVar2 = AbstractC13597g0.EnumC13598a.CLOSED;
                break;
            case 2:
                aVar2 = AbstractC13597g0.EnumC13598a.PENDING_OPEN;
                break;
            case 3:
                aVar2 = AbstractC13597g0.EnumC13598a.CLOSING;
                break;
            case 4:
                aVar2 = AbstractC13597g0.EnumC13598a.OPEN;
                break;
            case 5:
            case 6:
                aVar2 = AbstractC13597g0.EnumC13598a.OPENING;
                break;
            case 7:
                aVar2 = AbstractC13597g0.EnumC13598a.RELEASING;
                break;
            case 8:
                aVar2 = AbstractC13597g0.EnumC13598a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f39120B.m3229c(this, aVar2, z);
        this.f26435p.m3068m(aVar2);
        this.f26436q.m8423c(aVar2, aVar);
    }

    @Override // androidx.camera.core.AbstractC1948w2.AbstractC1952d
    /* renamed from: k */
    public void mo8495k(AbstractC1948w2 w2Var) {
        C2517g.m37588g(w2Var);
        final String J = m8524J(w2Var);
        final C13619k2 k = w2Var.m39429k();
        this.f26432m.execute(new Runnable() { // from class: q.i0
            @Override // java.lang.Runnable
            public final void run() {
                C11840j0.this.m8515S(J, k);
            }
        });
    }

    /* renamed from: k0 */
    void m8494k0(List<C13639n0> list) {
        ArrayList arrayList = new ArrayList();
        for (C13639n0 n0Var : list) {
            C13639n0.C13640a k = C13639n0.C13640a.m3134k(n0Var);
            if (!n0Var.m3148d().isEmpty() || !n0Var.m3145g() || m8474z(k)) {
                arrayList.add(k.m3137h());
            }
        }
        m8529E("Issue capture request");
        this.f26442w.mo8289a(arrayList);
    }

    @Override // p390w.AbstractC13597g0
    /* renamed from: l */
    public AbstractC13568a2<AbstractC13597g0.EnumC13598a> mo3264l() {
        return this.f26435p;
    }

    @Override // androidx.camera.core.AbstractC1948w2.AbstractC1952d
    /* renamed from: m */
    public void mo8492m(AbstractC1948w2 w2Var) {
        C2517g.m37588g(w2Var);
        final String J = m8524J(w2Var);
        this.f26432m.execute(new Runnable() { // from class: q.z
            @Override // java.lang.Runnable
            public final void run() {
                C11840j0.this.m8516R(J);
            }
        });
    }

    /* renamed from: o0 */
    void m8487o0(boolean z) {
        m8529E("Attempting to force open the camera.");
        if (!this.f39120B.m3226f(this)) {
            m8529E("No cameras available. Waiting for available camera before opening camera.");
            m8498h0(EnumC11846f.PENDING_OPEN);
            return;
        }
        m8508Z(z);
    }

    /* renamed from: p0 */
    void m8485p0(boolean z) {
        boolean z2;
        m8529E("Attempting to open the camera.");
        if (!this.f39119A.m8471b() || !this.f39120B.m3226f(this)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            m8529E("No cameras available. Waiting for available camera before opening camera.");
            m8498h0(EnumC11846f.PENDING_OPEN);
            return;
        }
        m8508Z(z);
    }

    /* renamed from: q0 */
    void m8483q0() {
        C13619k2.C13625f c = this.f26430k.m3050c();
        if (c.m3174d()) {
            this.f26437r.m8251f0(c.m3176b().m3198j());
            c.m3177a(this.f26437r.m8279D());
            this.f26442w.mo8286d(c.m3176b());
            return;
        }
        this.f26437r.m8254c0();
        this.f26442w.mo8286d(this.f26437r.m8279D());
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f26439t.mo3297b());
    }
}
