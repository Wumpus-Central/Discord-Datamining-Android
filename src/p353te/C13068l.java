package p353te;

import androidx.camera.core.ImageProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m15073d2 = {"Landroidx/camera/core/ImageProxy;", "", "a", "(Landroidx/camera/core/ImageProxy;)Z", "isRaw", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.l */
/* loaded from: classes6.dex */
public final class C13068l {
    /* renamed from: a */
    public static final boolean m4661a(ImageProxy imageProxy) {
        C9971q.m14633g(imageProxy, "<this>");
        int format = imageProxy.getFormat();
        if (format != 32) {
            switch (format) {
                case 36:
                case 37:
                case 38:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
