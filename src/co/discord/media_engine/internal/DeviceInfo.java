package co.discord.media_engine.internal;

import co.discord.media_engine.CameraEnumeratorProvider;
import java.util.Locale;
import org.webrtc.CameraEnumerator;

/* loaded from: classes.dex */
public final class DeviceInfo {
    private static CameraEnumerator enumerator() {
        return CameraEnumeratorProvider.get();
    }

    private String getDeviceFacingString(int i) {
        if (getDeviceFrontFacing(i)) {
            return "front";
        }
        if (getDeviceBackFacing(i)) {
            return "back";
        }
        return "unknown";
    }

    public boolean getDeviceBackFacing(int i) {
        return enumerator().isBackFacing(getDeviceName(i));
    }

    public boolean getDeviceFrontFacing(int i) {
        return enumerator().isFrontFacing(getDeviceName(i));
    }

    public String getDeviceGuid(int i) {
        return String.format(Locale.US, "android_camera_%d_%s_facing", Integer.valueOf(i), getDeviceFacingString(i));
    }

    public String getDeviceName(int i) {
        return enumerator().getDeviceNames()[i];
    }

    public int numberOfDevices() {
        return enumerator().getDeviceNames().length;
    }
}
