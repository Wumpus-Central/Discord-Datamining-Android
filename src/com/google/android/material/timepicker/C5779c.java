package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.C2733w0;
import p083eb.C6807f;
import p083eb.C6809h;
import p083eb.C6812k;
import p422xb.C14038g;
import p422xb.C14043i;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes3.dex */
class C5779c extends ConstraintLayout {

    /* renamed from: k */
    private final Runnable f11414k;

    /* renamed from: l */
    private int f11415l;

    /* renamed from: m */
    private C14038g f11416m;

    /* renamed from: com.google.android.material.timepicker.c$a */
    /* loaded from: classes3.dex */
    class RunnableC5780a implements Runnable {
        RunnableC5780a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5779c.this.m27386f();
        }
    }

    public C5779c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private Drawable m27390b() {
        C14038g gVar = new C14038g();
        this.f11416m = gVar;
        gVar.m1983W(new C14043i(0.5f));
        this.f11416m.m1981Y(ColorStateList.valueOf(-1));
        return this.f11416m;
    }

    /* renamed from: e */
    private static boolean m27387e(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: g */
    private void m27385g() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f11414k);
            handler.post(this.f11414k);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C2733w0.m37003k());
        }
        m27385g();
    }

    /* renamed from: c */
    public int m27389c() {
        return this.f11415l;
    }

    /* renamed from: d */
    public void mo27388d(int i) {
        this.f11415l = i;
        m27386f();
    }

    /* renamed from: f */
    protected void m27386f() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m27387e(getChildAt(i2))) {
                i++;
            }
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.m38794g(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id2 = childAt.getId();
            int i4 = C6807f.f14593b;
            if (id2 != i4 && !m27387e(childAt)) {
                constraintSet.m38792i(childAt.getId(), i4, this.f11415l, f);
                f += 360.0f / (childCount - i);
            }
        }
        constraintSet.m38798c(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m27386f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m27385g();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f11416m.m1981Y(ColorStateList.valueOf(i));
    }

    public C5779c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C6809h.f14626f, this);
        C2733w0.m36982u0(this, m27390b());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f14810q4, i, 0);
        this.f11415l = obtainStyledAttributes.getDimensionPixelSize(C6812k.f14818r4, 0);
        this.f11414k = new RunnableC5780a();
        obtainStyledAttributes.recycle();
    }
}
