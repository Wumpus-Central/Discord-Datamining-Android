package pe;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* renamed from: pe.j */
/* loaded from: classes6.dex */
class C11648j implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: k */
    private SurfaceTexture f25983k;

    /* renamed from: l */
    private Surface f25984l;

    /* renamed from: o */
    private boolean f25987o;

    /* renamed from: n */
    private final Object f25986n = new Object();

    /* renamed from: m */
    private int f25985m = m9152b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11648j(int i, int i2) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f25985m);
        this.f25983k = surfaceTexture;
        if (!(i == -1 || i2 == -1)) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this.f25984l = new Surface(this.f25983k);
        this.f25983k.setOnFrameAvailableListener(this);
    }

    /* renamed from: b */
    private int m9152b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        C11644f.m9165a("glBindTexture textureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        C11644f.m9165a("glTexParameter");
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9153a() {
        synchronized (this.f25986n) {
            while (!this.f25987o) {
                try {
                    this.f25986n.wait(10000L);
                    if (!this.f25987o) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f25987o = false;
        }
        C11644f.m9165a("before updateTexImage");
        this.f25983k.updateTexImage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Surface m9151c() {
        return this.f25984l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m9150d() {
        return this.f25985m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float[] m9149e() {
        float[] fArr = new float[16];
        this.f25983k.getTransformMatrix(fArr);
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m9148f() {
        Surface surface = this.f25984l;
        if (surface != null) {
            surface.release();
            this.f25984l = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f25986n) {
            if (!this.f25987o) {
                this.f25987o = true;
                this.f25986n.notifyAll();
            } else {
                throw new RuntimeException("frameAvailable already set, frame could be dropped");
            }
        }
    }
}
