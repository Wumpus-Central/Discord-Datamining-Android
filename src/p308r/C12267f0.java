package p308r;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: r.f0 */
/* loaded from: classes.dex */
public class C12267f0 {

    /* renamed from: a */
    private final Map<CameraCharacteristics.Key<?>, Object> f27581a = new HashMap();

    /* renamed from: b */
    private final AbstractC12268a f27582b;

    /* renamed from: r.f0$a */
    /* loaded from: classes.dex */
    public interface AbstractC12268a {
        /* renamed from: a */
        CameraCharacteristics mo7247a();

        /* renamed from: b */
        <T> T mo7246b(CameraCharacteristics.Key<T> key);

        /* renamed from: c */
        Set<String> mo7245c();
    }

    private C12267f0(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27582b = new C12263d0(cameraCharacteristics);
        } else {
            this.f27582b = new C12265e0(cameraCharacteristics);
        }
    }

    /* renamed from: c */
    private boolean m7250c(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    /* renamed from: e */
    public static C12267f0 m7248e(CameraCharacteristics cameraCharacteristics) {
        return new C12267f0(cameraCharacteristics);
    }

    /* renamed from: a */
    public <T> T m7252a(CameraCharacteristics.Key<T> key) {
        if (m7250c(key)) {
            return (T) this.f27582b.mo7246b(key);
        }
        synchronized (this) {
            T t = (T) this.f27581a.get(key);
            if (t != null) {
                return t;
            }
            T t2 = (T) this.f27582b.mo7246b(key);
            if (t2 != null) {
                this.f27581a.put(key, t2);
            }
            return t2;
        }
    }

    /* renamed from: b */
    public Set<String> m7251b() {
        return this.f27582b.mo7245c();
    }

    /* renamed from: d */
    public CameraCharacteristics m7249d() {
        return this.f27582b.mo7247a();
    }
}
