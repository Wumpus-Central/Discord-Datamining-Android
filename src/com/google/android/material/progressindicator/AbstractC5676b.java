package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C5662m;
import lb.C10395a;
import p083eb.C6803b;
import p083eb.C6805d;
import p083eb.C6812k;
import p366ub.C13242c;

/* renamed from: com.google.android.material.progressindicator.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5676b {

    /* renamed from: a */
    public int f11094a;

    /* renamed from: b */
    public int f11095b;

    /* renamed from: c */
    public int[] f11096c = new int[0];

    /* renamed from: d */
    public int f11097d;

    /* renamed from: e */
    public int f11098e;

    /* renamed from: f */
    public int f11099f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5676b(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C6805d.f38008P);
        TypedArray h = C5662m.m27838h(context, attributeSet, C6812k.f38063E, i, i2, new int[0]);
        this.f11094a = C13242c.m4239c(context, h, C6812k.f38127M, dimensionPixelSize);
        this.f11095b = Math.min(C13242c.m4239c(context, h, C6812k.f38119L, 0), this.f11094a / 2);
        this.f11098e = h.getInt(C6812k.f38095I, 0);
        this.f11099f = h.getInt(C6812k.f38071F, 0);
        m27798c(context, h);
        m27797d(context, h);
        h.recycle();
    }

    /* renamed from: c */
    private void m27798c(Context context, TypedArray typedArray) {
        int i = C6812k.f38079G;
        if (!typedArray.hasValue(i)) {
            this.f11096c = new int[]{C10395a.m13519b(context, C6803b.f14537k, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f11096c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f11096c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    /* renamed from: d */
    private void m27797d(Context context, TypedArray typedArray) {
        int i = C6812k.f38111K;
        if (typedArray.hasValue(i)) {
            this.f11097d = typedArray.getColor(i, -1);
            return;
        }
        this.f11097d = this.f11096c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f11097d = C10395a.m13520a(this.f11097d, (int) (f * 255.0f));
    }

    /* renamed from: a */
    public boolean m27800a() {
        return this.f11099f != 0;
    }

    /* renamed from: b */
    public boolean m27799b() {
        return this.f11098e != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo27776e();
}
