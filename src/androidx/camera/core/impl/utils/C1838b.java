package androidx.camera.core.impl.utils;

import androidx.camera.core.C1915r1;

/* renamed from: androidx.camera.core.impl.utils.b */
/* loaded from: classes.dex */
public final class C1838b {
    /* renamed from: a */
    public static int m39692a(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (C1915r1.m39522f("CameraOrientationUtil")) {
            C1915r1.m39527a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)));
        }
        return i3;
    }

    /* renamed from: b */
    public static int m39691b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i);
    }
}
