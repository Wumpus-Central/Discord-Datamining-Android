package p308r;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.core.util.C2517g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p308r.C12270g0;
import p308r.C12306v0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.b1 */
/* loaded from: classes.dex */
public class C12258b1 implements C12306v0.AbstractC12308b {

    /* renamed from: a */
    final CameraManager f27576a;

    /* renamed from: b */
    final Object f27577b;

    /* renamed from: r.b1$a */
    /* loaded from: classes.dex */
    static final class C12259a {

        /* renamed from: a */
        final Map<CameraManager.AvailabilityCallback, C12306v0.C12307a> f27578a = new HashMap();

        /* renamed from: b */
        final Handler f27579b;

        C12259a(Handler handler) {
            this.f27579b = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12258b1(Context context, Object obj) {
        this.f27576a = (CameraManager) context.getSystemService("camera");
        this.f27577b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C12258b1 m7259f(Context context, Handler handler) {
        return new C12258b1(context, new C12259a(handler));
    }

    @Override // p308r.C12306v0.AbstractC12308b
    /* renamed from: a */
    public void mo7162a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        C12306v0.C12307a aVar;
        if (executor != null) {
            C12259a aVar2 = (C12259a) this.f27577b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f27578a) {
                    aVar = aVar2.f27578a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new C12306v0.C12307a(executor, availabilityCallback);
                        aVar2.f27578a.put(availabilityCallback, aVar);
                    }
                }
            } else {
                aVar = null;
            }
            this.f27576a.registerAvailabilityCallback(aVar, aVar2.f27579b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override // p308r.C12306v0.AbstractC12308b
    /* renamed from: b */
    public CameraCharacteristics mo7161b(String str) {
        try {
            return this.f27576a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw C12275i.m7228e(e);
        }
    }

    @Override // p308r.C12306v0.AbstractC12308b
    /* renamed from: c */
    public void mo7160c(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        C2517g.m37588g(executor);
        C2517g.m37588g(stateCallback);
        try {
            this.f27576a.openCamera(str, new C12270g0.C12272b(executor, stateCallback), ((C12259a) this.f27577b).f27579b);
        } catch (CameraAccessException e) {
            throw C12275i.m7228e(e);
        }
    }

    @Override // p308r.C12306v0.AbstractC12308b
    /* renamed from: d */
    public String[] mo7168d() {
        try {
            return this.f27576a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw C12275i.m7228e(e);
        }
    }

    @Override // p308r.C12306v0.AbstractC12308b
    /* renamed from: e */
    public void mo7159e(CameraManager.AvailabilityCallback availabilityCallback) {
        C12306v0.C12307a aVar;
        if (availabilityCallback != null) {
            C12259a aVar2 = (C12259a) this.f27577b;
            synchronized (aVar2.f27578a) {
                aVar = aVar2.f27578a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.m7169g();
        }
        this.f27576a.unregisterAvailabilityCallback(aVar);
    }
}
