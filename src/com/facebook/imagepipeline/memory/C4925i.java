package com.facebook.imagepipeline.memory;

import p394w3.C13740j;

/* renamed from: com.facebook.imagepipeline.memory.i */
/* loaded from: classes7.dex */
public class C4925i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m31273a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m31272b(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i4 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z3));
        if (i + i4 <= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z4));
        if (i3 + i4 > i2) {
            z5 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z5));
    }
}
