package p119g9;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: g9.i */
/* loaded from: classes5.dex */
public final class RunnableC7534i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: q */
    private static final int[] f16330q = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: k */
    private final Handler f16331k;

    /* renamed from: l */
    private final int[] f16332l;

    /* renamed from: m */
    private EGLDisplay f16333m;

    /* renamed from: n */
    private EGLContext f16334n;

    /* renamed from: o */
    private EGLSurface f16335o;

    /* renamed from: p */
    private SurfaceTexture f16336p;

    /* renamed from: g9.i$b */
    /* loaded from: classes5.dex */
    public static final class C7536b extends RuntimeException {
        private C7536b(String str) {
            super(str);
        }
    }

    /* renamed from: g9.i$c */
    /* loaded from: classes5.dex */
    public interface AbstractC7537c {
    }

    public RunnableC7534i(Handler handler) {
        this(handler, null);
    }

    /* renamed from: a */
    private static EGLConfig m22302a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f16330q, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        throw new C7536b(C7557q0.m22209D("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    /* renamed from: b */
    private static EGLContext m22301b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C7536b("eglCreateContext failed");
    }

    /* renamed from: c */
    private static EGLSurface m22300c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        int[] iArr;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                throw new C7536b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new C7536b("eglMakeCurrent failed");
    }

    /* renamed from: d */
    private void m22299d() {
    }

    /* renamed from: e */
    private static void m22298e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C7543l.m22274b();
    }

    /* renamed from: f */
    private static EGLDisplay m22297f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C7536b("eglInitialize failed");
        }
        throw new C7536b("eglGetDisplay failed");
    }

    /* renamed from: g */
    public SurfaceTexture m22296g() {
        return (SurfaceTexture) C7510a.m22367e(this.f16336p);
    }

    /* renamed from: h */
    public void m22295h(int i) {
        EGLDisplay f = m22297f();
        this.f16333m = f;
        EGLConfig a = m22302a(f);
        EGLContext b = m22301b(this.f16333m, a, i);
        this.f16334n = b;
        this.f16335o = m22300c(this.f16333m, a, b, i);
        m22298e(this.f16332l);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f16332l[0]);
        this.f16336p = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: i */
    public void m22294i() {
        this.f16331k.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f16336p;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f16332l, 0);
            }
            EGLDisplay eGLDisplay = this.f16333m;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f16333m;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f16335o;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f16333m, this.f16335o);
            }
            EGLContext eGLContext = this.f16334n;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f16333m, eGLContext);
            }
            if (C7557q0.f16368a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f16333m;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f16333m);
            }
            this.f16333m = null;
            this.f16334n = null;
            this.f16335o = null;
            this.f16336p = null;
        } catch (Throwable th2) {
            EGLDisplay eGLDisplay4 = this.f16333m;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f16333m;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f16335o;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f16333m, this.f16335o);
            }
            EGLContext eGLContext2 = this.f16334n;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f16333m, eGLContext2);
            }
            if (C7557q0.f16368a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f16333m;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f16333m);
            }
            this.f16333m = null;
            this.f16334n = null;
            this.f16335o = null;
            this.f16336p = null;
            throw th2;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16331k.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m22299d();
        SurfaceTexture surfaceTexture = this.f16336p;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC7534i(Handler handler, AbstractC7537c cVar) {
        this.f16331k = handler;
        this.f16332l = new int[1];
    }
}
