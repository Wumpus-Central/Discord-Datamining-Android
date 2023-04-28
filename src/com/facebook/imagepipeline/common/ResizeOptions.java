package com.facebook.imagepipeline.common;

import p076e4.C6701b;
import p394w3.C13740j;

/* loaded from: classes7.dex */
public class ResizeOptions {

    /* renamed from: a */
    public final int f8141a;

    /* renamed from: b */
    public final int f8142b;

    /* renamed from: c */
    public final float f8143c;

    /* renamed from: d */
    public final float f8144d;

    public ResizeOptions(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    /* renamed from: a */
    public static ResizeOptions m31498a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        return new ResizeOptions(i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResizeOptions)) {
            return false;
        }
        ResizeOptions resizeOptions = (ResizeOptions) obj;
        if (this.f8141a == resizeOptions.f8141a && this.f8142b == resizeOptions.f8142b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6701b.m24618a(this.f8141a, this.f8142b);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.f8141a), Integer.valueOf(this.f8142b));
    }

    public ResizeOptions(int i, int i2, float f) {
        this(i, i2, f, 0.6666667f);
    }

    public ResizeOptions(int i, int i2, float f, float f2) {
        boolean z = true;
        C13740j.m2839b(Boolean.valueOf(i > 0));
        C13740j.m2839b(Boolean.valueOf(i2 <= 0 ? false : z));
        this.f8141a = i;
        this.f8142b = i2;
        this.f8143c = f;
        this.f8144d = f2;
    }
}
