package com.facebook.react.devsupport;

import android.os.Build;

/* loaded from: classes7.dex */
class WindowOverlayCompat {
    private static final int ANDROID_OREO = 26;
    private static final int TYPE_APPLICATION_OVERLAY = 2038;
    static final int TYPE_SYSTEM_ALERT;
    static final int TYPE_SYSTEM_OVERLAY;

    static {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = TYPE_APPLICATION_OVERLAY;
        if (i2 < 26) {
            i = 2003;
        } else {
            i = TYPE_APPLICATION_OVERLAY;
        }
        TYPE_SYSTEM_ALERT = i;
        if (i2 < 26) {
            i3 = 2006;
        }
        TYPE_SYSTEM_OVERLAY = i3;
    }

    WindowOverlayCompat() {
    }
}
