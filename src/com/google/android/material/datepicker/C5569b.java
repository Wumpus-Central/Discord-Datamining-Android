package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.C2517g;
import androidx.core.view.C2733w0;
import p083eb.C6812k;
import p366ub.C13242c;
import p422xb.C14038g;
import p422xb.C14045k;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes3.dex */
final class C5569b {

    /* renamed from: a */
    private final Rect f10774a;

    /* renamed from: b */
    private final ColorStateList f10775b;

    /* renamed from: c */
    private final ColorStateList f10776c;

    /* renamed from: d */
    private final ColorStateList f10777d;

    /* renamed from: e */
    private final int f10778e;

    /* renamed from: f */
    private final C14045k f10779f;

    private C5569b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C14045k kVar, Rect rect) {
        C2517g.m37591d(rect.left);
        C2517g.m37591d(rect.top);
        C2517g.m37591d(rect.right);
        C2517g.m37591d(rect.bottom);
        this.f10774a = rect;
        this.f10775b = colorStateList2;
        this.f10776c = colorStateList;
        this.f10777d = colorStateList3;
        this.f10778e = i;
        this.f10779f = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5569b m28227a(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C6812k.f14697c3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C6812k.f14705d3, 0), obtainStyledAttributes.getDimensionPixelOffset(C6812k.f14721f3, 0), obtainStyledAttributes.getDimensionPixelOffset(C6812k.f14713e3, 0), obtainStyledAttributes.getDimensionPixelOffset(C6812k.f14729g3, 0));
        ColorStateList a = C13242c.m4241a(context, obtainStyledAttributes, C6812k.f14737h3);
        ColorStateList a2 = C13242c.m4241a(context, obtainStyledAttributes, C6812k.f14777m3);
        ColorStateList a3 = C13242c.m4241a(context, obtainStyledAttributes, C6812k.f14761k3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C6812k.f14769l3, 0);
        C14045k m = C14045k.m1934b(context, obtainStyledAttributes.getResourceId(C6812k.f14745i3, 0), obtainStyledAttributes.getResourceId(C6812k.f14753j3, 0)).m1892m();
        obtainStyledAttributes.recycle();
        return new C5569b(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m28226b() {
        return this.f10774a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m28225c() {
        return this.f10774a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m28224d(TextView textView) {
        C14038g gVar = new C14038g();
        C14038g gVar2 = new C14038g();
        gVar.setShapeAppearanceModel(this.f10779f);
        gVar2.setShapeAppearanceModel(this.f10779f);
        gVar.m1981Y(this.f10776c);
        gVar.m1969f0(this.f10778e, this.f10777d);
        textView.setTextColor(this.f10775b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f10775b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f10774a;
        C2733w0.m36982u0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
