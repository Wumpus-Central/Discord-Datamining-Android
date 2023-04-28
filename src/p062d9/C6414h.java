package p062d9;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.Player;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p062d9.C6406a;
import p062d9.View$OnTouchListenerC6416i;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: d9.h */
/* loaded from: classes5.dex */
public final class C6414h extends GLSurfaceView {

    /* renamed from: k */
    private final SensorManager f13435k;

    /* renamed from: l */
    private final Sensor f13436l;

    /* renamed from: m */
    private final C6406a f13437m;

    /* renamed from: n */
    private final Handler f13438n;

    /* renamed from: o */
    private final View$OnTouchListenerC6416i f13439o;

    /* renamed from: p */
    private final C6410d f13440p;

    /* renamed from: q */
    private SurfaceTexture f13441q;

    /* renamed from: r */
    private Surface f13442r;

    /* renamed from: s */
    private Player.AbstractC5155c f13443s;

    /* renamed from: t */
    private boolean f13444t;

    /* renamed from: u */
    private boolean f13445u;

    /* renamed from: v */
    private boolean f13446v;

    /* renamed from: d9.h$a */
    /* loaded from: classes5.dex */
    class C6415a implements GLSurfaceView.Renderer, View$OnTouchListenerC6416i.AbstractC6417a, C6406a.AbstractC0189a {

        /* renamed from: k */
        private final C6410d f13447k;

        /* renamed from: n */
        private final float[] f13450n;

        /* renamed from: o */
        private final float[] f13451o;

        /* renamed from: p */
        private final float[] f13452p;

        /* renamed from: q */
        private float f13453q;

        /* renamed from: l */
        private final float[] f13448l = new float[16];

        /* renamed from: m */
        private final float[] f13449m = new float[16];

        /* renamed from: s */
        private final float[] f13455s = new float[16];

        /* renamed from: t */
        private final float[] f13456t = new float[16];

        /* renamed from: r */
        private float f13454r = 3.1415927f;

        public C6415a(C6410d dVar) {
            float[] fArr = new float[16];
            this.f13450n = fArr;
            float[] fArr2 = new float[16];
            this.f13451o = fArr2;
            float[] fArr3 = new float[16];
            this.f13452p = fArr3;
            this.f13447k = dVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
        }

        /* renamed from: c */
        private float m25583c(float f) {
            boolean z;
            if (f > 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
            }
            return 90.0f;
        }

        /* renamed from: d */
        private void m25582d() {
            Matrix.setRotateM(this.f13451o, 0, -this.f13453q, (float) Math.cos(this.f13454r), (float) Math.sin(this.f13454r), 0.0f);
        }

        @Override // p062d9.C6406a.AbstractC0189a
        /* renamed from: a */
        public synchronized void mo25581a(float[] fArr, float f) {
            float[] fArr2 = this.f13450n;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f13454r = -f;
            m25582d();
        }

        @Override // p062d9.View$OnTouchListenerC6416i.AbstractC6417a
        /* renamed from: b */
        public synchronized void mo25579b(PointF pointF) {
            this.f13453q = pointF.y;
            m25582d();
            Matrix.setRotateM(this.f13452p, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f13456t, 0, this.f13450n, 0, this.f13452p, 0);
                Matrix.multiplyMM(this.f13455s, 0, this.f13451o, 0, this.f13456t, 0);
            }
            Matrix.multiplyMM(this.f13449m, 0, this.f13448l, 0, this.f13455s, 0);
            this.f13447k.m25596e(this.f13449m, false);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f13448l, 0, m25583c(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C6414h.this.m25586f(this.f13447k.m25595f());
        }
    }

    public C6414h(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m25588d() {
        Surface surface = this.f13442r;
        if (surface != null) {
            Player.AbstractC5155c cVar = this.f13443s;
            if (cVar != null) {
                cVar.mo30499f(surface);
            }
            m25585g(this.f13441q, this.f13442r);
            this.f13441q = null;
            this.f13442r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m25587e(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f13441q;
        Surface surface = this.f13442r;
        this.f13441q = surfaceTexture;
        Surface surface2 = new Surface(surfaceTexture);
        this.f13442r = surface2;
        Player.AbstractC5155c cVar = this.f13443s;
        if (cVar != null) {
            cVar.mo30507a(surface2);
        }
        m25585g(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m25586f(final SurfaceTexture surfaceTexture) {
        this.f13438n.post(new Runnable() { // from class: d9.g
            @Override // java.lang.Runnable
            public final void run() {
                C6414h.this.m25587e(surfaceTexture);
            }
        });
    }

    /* renamed from: g */
    private static void m25585g(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: h */
    private void m25584h() {
        boolean z;
        if (!this.f13444t || !this.f13445u) {
            z = false;
        } else {
            z = true;
        }
        Sensor sensor = this.f13436l;
        if (sensor != null && z != this.f13446v) {
            if (z) {
                this.f13435k.registerListener(this.f13437m, sensor, 0);
            } else {
                this.f13435k.unregisterListener(this.f13437m);
            }
            this.f13446v = z;
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13438n.post(new Runnable() { // from class: d9.f
            @Override // java.lang.Runnable
            public final void run() {
                C6414h.this.m25588d();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f13445u = false;
        m25584h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f13445u = true;
        m25584h();
    }

    public void setDefaultStereoMode(int i) {
        this.f13440p.m25593h(i);
    }

    public void setSingleTapListener(AbstractC6411e eVar) {
        this.f13439o.m25580b(eVar);
    }

    public void setUseSensorRotation(boolean z) {
        this.f13444t = z;
        m25584h();
    }

    public void setVideoComponent(Player.AbstractC5155c cVar) {
        Player.AbstractC5155c cVar2 = this.f13443s;
        if (cVar != cVar2) {
            if (cVar2 != null) {
                Surface surface = this.f13442r;
                if (surface != null) {
                    cVar2.mo30499f(surface);
                }
                this.f13443s.mo30488k(this.f13440p);
                this.f13443s.mo30468z(this.f13440p);
            }
            this.f13443s = cVar;
            if (cVar != null) {
                cVar.mo30479r(this.f13440p);
                this.f13443s.mo30470y(this.f13440p);
                this.f13443s.mo30507a(this.f13442r);
            }
        }
    }

    public C6414h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13438n = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C7510a.m22367e(context.getSystemService("sensor"));
        this.f13435k = sensorManager;
        Sensor defaultSensor = C7557q0.f16368a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f13436l = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C6410d dVar = new C6410d();
        this.f13440p = dVar;
        C6415a aVar = new C6415a(dVar);
        View$OnTouchListenerC6416i iVar = new View$OnTouchListenerC6416i(context, aVar, 25.0f);
        this.f13439o = iVar;
        this.f13437m = new C6406a(((WindowManager) C7510a.m22367e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), iVar, aVar);
        this.f13444t = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(iVar);
    }
}
