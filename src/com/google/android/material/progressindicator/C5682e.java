package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C5662m;
import p083eb.C6803b;
import p083eb.C6805d;
import p083eb.C6812k;
import p366ub.C13242c;

/* renamed from: com.google.android.material.progressindicator.e */
/* loaded from: classes3.dex */
public final class C5682e extends AbstractC5676b {

    /* renamed from: g */
    public int f11119g;

    /* renamed from: h */
    public int f11120h;

    /* renamed from: i */
    public int f11121i;

    public C5682e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14533g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC5676b
    /* renamed from: e */
    public void mo27776e() {
    }

    public C5682e(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f11074z);
    }

    public C5682e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C6805d.f38007O);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C6805d.f38006N);
        TypedArray h = C5662m.m27838h(context, attributeSet, C6812k.f14767l1, i, i2, new int[0]);
        this.f11119g = Math.max(C13242c.m4239c(context, h, C6812k.f14791o1, dimensionPixelSize), this.f11094a * 2);
        this.f11120h = C13242c.m4239c(context, h, C6812k.f14783n1, dimensionPixelSize2);
        this.f11121i = h.getInt(C6812k.f14775m1, 0);
        h.recycle();
        mo27776e();
    }
}
