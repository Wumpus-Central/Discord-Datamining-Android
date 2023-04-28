package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p083eb.C6803b;
import p083eb.C6812k;
import p366ub.C13241b;
import p366ub.C13242c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes3.dex */
public final class C5570c {

    /* renamed from: a */
    final C5569b f10780a;

    /* renamed from: b */
    final C5569b f10781b;

    /* renamed from: c */
    final C5569b f10782c;

    /* renamed from: d */
    final C5569b f10783d;

    /* renamed from: e */
    final C5569b f10784e;

    /* renamed from: f */
    final C5569b f10785f;

    /* renamed from: g */
    final C5569b f10786g;

    /* renamed from: h */
    final Paint f10787h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5570c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C13241b.m4243d(context, C6803b.f14547u, C5576h.class.getCanonicalName()), C6812k.f38186T2);
        this.f10780a = C5569b.m28227a(context, obtainStyledAttributes.getResourceId(C6812k.f38210W2, 0));
        this.f10786g = C5569b.m28227a(context, obtainStyledAttributes.getResourceId(C6812k.f38194U2, 0));
        this.f10781b = C5569b.m28227a(context, obtainStyledAttributes.getResourceId(C6812k.f38202V2, 0));
        this.f10782c = C5569b.m28227a(context, obtainStyledAttributes.getResourceId(C6812k.f38217X2, 0));
        ColorStateList a = C13242c.m4241a(context, obtainStyledAttributes, C6812k.f38224Y2);
        this.f10783d = C5569b.m28227a(context, obtainStyledAttributes.getResourceId(C6812k.f14681a3, 0));
        this.f10784e = C5569b.m28227a(context, obtainStyledAttributes.getResourceId(C6812k.f38231Z2, 0));
        this.f10785f = C5569b.m28227a(context, obtainStyledAttributes.getResourceId(C6812k.f14689b3, 0));
        Paint paint = new Paint();
        this.f10787h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
