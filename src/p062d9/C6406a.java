package p062d9;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import p154i9.C8312c;

/* renamed from: d9.a */
/* loaded from: classes5.dex */
final class C6406a implements SensorEventListener {

    /* renamed from: k */
    private final float[] f13391k = new float[16];

    /* renamed from: l */
    private final float[] f13392l = new float[16];

    /* renamed from: m */
    private final float[] f13393m = new float[16];

    /* renamed from: n */
    private final float[] f13394n = new float[3];

    /* renamed from: o */
    private final Display f13395o;

    /* renamed from: p */
    private final AbstractC0189a[] f13396p;

    /* renamed from: q */
    private boolean f13397q;

    /* renamed from: d9.a$a */
    /* loaded from: classes5.dex */
    public interface AbstractC0189a {
        /* renamed from: a */
        void mo25581a(float[] fArr, float f);
    }

    public C6406a(Display display, AbstractC0189a... aVarArr) {
        this.f13395o = display;
        this.f13396p = aVarArr;
    }

    /* renamed from: a */
    private float m25610a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f13392l);
        SensorManager.getOrientation(this.f13392l, this.f13394n);
        return this.f13394n[2];
    }

    /* renamed from: b */
    private void m25609b(float[] fArr, float f) {
        for (AbstractC0189a aVar : this.f13396p) {
            aVar.mo25581a(fArr, f);
        }
    }

    /* renamed from: c */
    private void m25608c(float[] fArr) {
        if (!this.f13397q) {
            C8312c.m19981a(this.f13393m, fArr);
            this.f13397q = true;
        }
        float[] fArr2 = this.f13392l;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f13392l, 0, this.f13393m, 0);
    }

    /* renamed from: d */
    private void m25607d(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 129;
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
            } else if (i == 3) {
                i2 = 130;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f13392l;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f13392l, i2, i3, fArr);
        }
    }

    /* renamed from: e */
    private static void m25606e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f13391k, sensorEvent.values);
        m25607d(this.f13391k, this.f13395o.getRotation());
        float a = m25610a(this.f13391k);
        m25606e(this.f13391k);
        m25608c(this.f13391k);
        m25609b(this.f13391k, a);
    }
}
