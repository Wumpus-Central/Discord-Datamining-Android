package com.facebook.imageutils;

import java.io.InputStream;
import p414x3.C13925a;

/* renamed from: com.facebook.imageutils.e */
/* loaded from: classes7.dex */
class C5068e {

    /* renamed from: a */
    private static final Class<?> f8717a = C5068e.class;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imageutils.e$b */
    /* loaded from: classes7.dex */
    public static class C5070b {

        /* renamed from: a */
        boolean f8718a;

        /* renamed from: b */
        int f8719b;

        /* renamed from: c */
        int f8720c;

        private C5070b() {
        }
    }

    C5068e() {
    }

    /* renamed from: a */
    public static int m30850a(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: b */
    private static int m30849b(InputStream inputStream, int i, boolean z) {
        if (i >= 10 && C5067d.m30851a(inputStream, 2, z) == 3 && C5067d.m30851a(inputStream, 4, z) == 1) {
            return C5067d.m30851a(inputStream, 2, z);
        }
        return 0;
    }

    /* renamed from: c */
    private static int m30848c(InputStream inputStream, int i, boolean z, int i2) {
        if (i < 14) {
            return 0;
        }
        int a = C5067d.m30851a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = a - 1;
            if (a <= 0 || i3 < 12) {
                break;
            }
            int i5 = i3 - 2;
            if (C5067d.m30851a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10L);
            i3 = i5 - 10;
            a = i4;
        }
        return 0;
    }

    /* renamed from: d */
    public static int m30847d(InputStream inputStream, int i) {
        C5070b bVar = new C5070b();
        int e = m30846e(inputStream, i, bVar);
        int i2 = bVar.f8720c - 8;
        if (e == 0 || i2 > e) {
            return 0;
        }
        inputStream.skip(i2);
        return m30849b(inputStream, m30848c(inputStream, e - i2, bVar.f8718a, 274), bVar.f8718a);
    }

    /* renamed from: e */
    private static int m30846e(InputStream inputStream, int i, C5070b bVar) {
        boolean z;
        if (i <= 8) {
            return 0;
        }
        int a = C5067d.m30851a(inputStream, 4, false);
        bVar.f8719b = a;
        int i2 = i - 4;
        if (a == 1229531648 || a == 1296891946) {
            if (a == 1229531648) {
                z = true;
            } else {
                z = false;
            }
            bVar.f8718a = z;
            int a2 = C5067d.m30851a(inputStream, 4, z);
            bVar.f8720c = a2;
            int i3 = i2 - 4;
            if (a2 >= 8 && a2 - 8 <= i3) {
                return i3;
            }
            C13925a.m2292f(f8717a, "Invalid offset");
            return 0;
        }
        C13925a.m2292f(f8717a, "Invalid TIFF header");
        return 0;
    }
}
