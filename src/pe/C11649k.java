package pe;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import org.webrtc.EglBase;

/* renamed from: pe.k */
/* loaded from: classes6.dex */
class C11649k {

    /* renamed from: a */
    private EGLDisplay f25988a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f25989b = EGL14.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLSurface f25990c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    private Surface f25991d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11649k(Surface surface) {
        this.f25991d = surface;
        m9146b();
        m9145c();
    }

    /* renamed from: a */
    private void m9147a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    /* renamed from: b */
    private void m9146b() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f25988a = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f25988a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    this.f25989b = EGL14.eglCreateContext(this.f25988a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    m9147a("eglCreateContext");
                    if (this.f25989b != null) {
                        this.f25990c = EGL14.eglCreateWindowSurface(this.f25988a, eGLConfigArr[0], this.f25991d, new int[]{12344}, 0);
                        m9147a("eglCreateWindowSurface");
                        if (this.f25990c == null) {
                            throw new RuntimeException("surface was null");
                        }
                        return;
                    }
                    throw new RuntimeException("null context");
                }
                throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            this.f25988a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    /* renamed from: c */
    private void m9145c() {
        EGLDisplay eGLDisplay = this.f25988a;
        EGLSurface eGLSurface = this.f25990c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f25989b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: d */
    public void m9144d() {
        EGLDisplay eGLDisplay = this.f25988a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, this.f25990c);
            EGL14.eglDestroyContext(this.f25988a, this.f25989b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f25988a);
            this.f25988a = EGL14.EGL_NO_DISPLAY;
            this.f25989b = EGL14.EGL_NO_CONTEXT;
            this.f25990c = EGL14.EGL_NO_SURFACE;
        }
        Surface surface = this.f25991d;
        if (surface != null) {
            surface.release();
            this.f25991d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m9143e(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f25988a, this.f25990c, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m9142f() {
        return EGL14.eglSwapBuffers(this.f25988a, this.f25990c);
    }
}
