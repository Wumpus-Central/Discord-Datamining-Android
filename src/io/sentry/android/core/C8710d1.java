package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8843d;
import io.sentry.C8951o3;
import io.sentry.C9116v;
import io.sentry.EnumC8942n3;
import io.sentry.util.C9111k;
import java.io.Closeable;

/* renamed from: io.sentry.android.core.d1 */
/* loaded from: classes8.dex */
public final class C8710d1 implements AbstractC9023q0, Closeable, SensorEventListener {

    /* renamed from: k */
    private final Context f19267k;

    /* renamed from: l */
    private AbstractC8861f0 f19268l;

    /* renamed from: m */
    private SentryAndroidOptions f19269m;

    /* renamed from: n */
    SensorManager f19270n;

    public C8710d1(Context context) {
        this.f19267k = (Context) C9111k.m16995a(context, "Context is required");
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        SentryAndroidOptions sentryAndroidOptions;
        this.f19268l = (AbstractC8861f0) C9111k.m16995a(f0Var, "Hub is required");
        if (o3Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) o3Var;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19269m = sentryAndroidOptions2;
        AbstractC8869g0 logger = sentryAndroidOptions2.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.f19269m.isEnableSystemEventBreadcrumbs()));
        if (this.f19269m.isEnableSystemEventBreadcrumbs()) {
            try {
                SensorManager sensorManager = (SensorManager) this.f19267k.getSystemService("sensor");
                this.f19270n = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                    if (defaultSensor != null) {
                        this.f19270n.registerListener(this, defaultSensor, 3);
                        o3Var.getLogger().mo17722c(n3Var, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                    } else {
                        this.f19269m.getLogger().mo17722c(EnumC8942n3.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                    }
                } else {
                    this.f19269m.getLogger().mo17722c(EnumC8942n3.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
                }
            } catch (Throwable th2) {
                o3Var.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SensorManager sensorManager = this.f19270n;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f19270n = null;
            SentryAndroidOptions sentryAndroidOptions = this.f19269m;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr != null && fArr.length != 0 && fArr[0] != 0.0f && this.f19268l != null) {
            C8843d dVar = new C8843d();
            dVar.m17905p("system");
            dVar.m17909l("device.event");
            dVar.m17908m("action", "TYPE_AMBIENT_TEMPERATURE");
            dVar.m17908m("accuracy", Integer.valueOf(sensorEvent.accuracy));
            dVar.m17908m("timestamp", Long.valueOf(sensorEvent.timestamp));
            dVar.m17907n(EnumC8942n3.INFO);
            dVar.m17908m("degree", Float.valueOf(sensorEvent.values[0]));
            C9116v vVar = new C9116v();
            vVar.m16973h("android:sensorEvent", sensorEvent);
            this.f19268l.mo17830h(dVar, vVar);
        }
    }
}
