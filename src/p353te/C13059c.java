package p353te;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import se.C12884c;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\"\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m15073d2 = {"Landroid/hardware/camera2/CameraCharacteristics;", "Lcom/facebook/react/bridge/ReadableArray;", "a", "", "b", "Landroid/util/Size;", "Landroid/util/Size;", "getSize35mm", "()Landroid/util/Size;", "Size35mm", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.c */
/* loaded from: classes6.dex */
public final class C13059c {

    /* renamed from: a */
    private static final Size f29366a = new Size(36, 24);

    /* renamed from: a */
    public static final ReadableArray m4675a(CameraCharacteristics cameraCharacteristics) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C9971q.m14633g(cameraCharacteristics, "<this>");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        C9971q.m14636d(obj);
        float[] fArr = (float[]) obj;
        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        C9971q.m14636d(obj2);
        float c = C12884c.m5190c(f29366a) / C12884c.m5191b((SizeF) obj2);
        WritableArray deviceTypes = Arguments.createArray();
        int length = fArr.length;
        boolean z6 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (fArr[i] * c > 35.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                z = true;
                break;
            }
            i++;
        }
        int length2 = fArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                z2 = false;
                break;
            }
            float f = fArr[i2] * c;
            if (f < 24.0f || f > 35.0f) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                z2 = true;
                break;
            }
            i2++;
        }
        int length3 = fArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                break;
            }
            if (fArr[i3] * c < 24.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                z6 = true;
                break;
            }
            i3++;
        }
        if (z) {
            deviceTypes.pushString("telephoto-camera");
        }
        if (z2) {
            deviceTypes.pushString("wide-angle-camera");
        }
        if (z6) {
            deviceTypes.pushString("ultra-wide-angle-camera");
        }
        C9971q.m14634f(deviceTypes, "deviceTypes");
        return deviceTypes;
    }

    /* renamed from: b */
    public static final double m4674b(CameraCharacteristics cameraCharacteristics) {
        Object obj;
        Object obj2;
        C9971q.m14633g(cameraCharacteristics, "<this>");
        C9971q.m14636d(cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS));
        C9971q.m14636d(cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE));
        float f = 2;
        return f * ((float) Math.atan(C12884c.m5191b((SizeF) obj2) / (((float[]) obj)[0] * f))) * 57.29577951308232d;
    }
}
