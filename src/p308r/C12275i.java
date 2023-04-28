package p308r;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: r.i */
/* loaded from: classes.dex */
public class C12275i extends Exception {

    /* renamed from: m */
    static final Set<Integer> f27588m = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: n */
    static final Set<Integer> f27589n = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* renamed from: k */
    private final int f27590k;

    /* renamed from: l */
    private final CameraAccessException f27591l;

    public C12275i(int i, String str, Throwable th2) {
        super(m7232a(i, str), th2);
        this.f27590k = i;
        this.f27591l = f27588m.contains(Integer.valueOf(i)) ? new CameraAccessException(i, str, th2) : null;
    }

    /* renamed from: a */
    private static String m7232a(int i, String str) {
        return String.format("%s (%d): %s", m7230c(i), Integer.valueOf(i), str);
    }

    /* renamed from: b */
    private static String m7231b(int i) {
        if (i == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i == 4) {
            return "The camera device is in use already";
        }
        if (i == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    /* renamed from: c */
    private static String m7230c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 1000 ? i != 10001 ? i != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    /* renamed from: e */
    public static C12275i m7228e(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new C12275i(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    /* renamed from: d */
    public final int m7229d() {
        return this.f27590k;
    }

    public C12275i(int i, Throwable th2) {
        super(m7231b(i), th2);
        this.f27590k = i;
        this.f27591l = f27588m.contains(Integer.valueOf(i)) ? new CameraAccessException(i, null, th2) : null;
    }

    private C12275i(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f27590k = cameraAccessException.getReason();
        this.f27591l = cameraAccessException;
    }
}
