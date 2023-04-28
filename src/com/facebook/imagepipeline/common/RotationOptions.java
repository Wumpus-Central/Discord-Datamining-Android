package com.facebook.imagepipeline.common;

import p076e4.C6701b;

/* loaded from: classes7.dex */
public class RotationOptions {

    /* renamed from: c */
    private static final RotationOptions f8145c = new RotationOptions(-1, false);

    /* renamed from: d */
    private static final RotationOptions f8146d = new RotationOptions(-2, false);

    /* renamed from: e */
    private static final RotationOptions f8147e = new RotationOptions(-1, true);

    /* renamed from: a */
    private final int f8148a;

    /* renamed from: b */
    private final boolean f8149b;

    private RotationOptions(int i, boolean z) {
        this.f8148a = i;
        this.f8149b = z;
    }

    /* renamed from: a */
    public static RotationOptions m31497a() {
        return f8145c;
    }

    /* renamed from: b */
    public static RotationOptions m31496b() {
        return f8147e;
    }

    /* renamed from: d */
    public static RotationOptions m31494d() {
        return f8146d;
    }

    /* renamed from: c */
    public boolean m31495c() {
        return this.f8149b;
    }

    /* renamed from: e */
    public int m31493e() {
        if (!m31491g()) {
            return this.f8148a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RotationOptions)) {
            return false;
        }
        RotationOptions rotationOptions = (RotationOptions) obj;
        if (this.f8148a == rotationOptions.f8148a && this.f8149b == rotationOptions.f8149b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m31492f() {
        return this.f8148a != -2;
    }

    /* renamed from: g */
    public boolean m31491g() {
        return this.f8148a == -1;
    }

    public int hashCode() {
        return C6701b.m24616c(Integer.valueOf(this.f8148a), Boolean.valueOf(this.f8149b));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.f8148a), Boolean.valueOf(this.f8149b));
    }
}
