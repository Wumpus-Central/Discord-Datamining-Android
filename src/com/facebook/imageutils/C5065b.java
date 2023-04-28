package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

/* renamed from: com.facebook.imageutils.b */
/* loaded from: classes7.dex */
public class C5065b {

    /* renamed from: a */
    private final Pair<Integer, Integer> f8715a;

    /* renamed from: b */
    private final ColorSpace f8716b;

    public C5065b(int i, int i2, ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        if (i == -1 || i2 == -1) {
            pair = null;
        } else {
            pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.f8715a = pair;
        this.f8716b = colorSpace;
    }

    /* renamed from: a */
    public ColorSpace m30858a() {
        return this.f8716b;
    }

    /* renamed from: b */
    public Pair<Integer, Integer> m30857b() {
        return this.f8715a;
    }
}
