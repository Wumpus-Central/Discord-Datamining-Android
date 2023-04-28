package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.AbstractC2694r0;
import androidx.core.view.C2733w0;
import androidx.core.view.WindowInsetsCompat;

/* renamed from: com.google.android.material.internal.o */
/* loaded from: classes3.dex */
public class C5665o {

    /* renamed from: com.google.android.material.internal.o$a */
    /* loaded from: classes3.dex */
    class RunnableC5666a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ View f11066k;

        RunnableC5666a(View view) {
            this.f11066k = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f11066k.getContext().getSystemService("input_method")).showSoftInput(this.f11066k, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.o$b */
    /* loaded from: classes3.dex */
    public class C5667b implements AbstractC2694r0 {

        /* renamed from: a */
        final /* synthetic */ AbstractC5669d f11067a;

        /* renamed from: b */
        final /* synthetic */ C5670e f11068b;

        C5667b(AbstractC5669d dVar, C5670e eVar) {
            this.f11067a = dVar;
            this.f11068b = eVar;
        }

        @Override // androidx.core.view.AbstractC2694r0
        /* renamed from: a */
        public WindowInsetsCompat mo13081a(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f11067a.mo27822a(view, windowInsetsCompat, new C5670e(this.f11068b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.o$c */
    /* loaded from: classes3.dex */
    public class View$OnAttachStateChangeListenerC5668c implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC5668c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C2733w0.m36996n0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.o$d */
    /* loaded from: classes3.dex */
    public interface AbstractC5669d {
        /* renamed from: a */
        WindowInsetsCompat mo27822a(View view, WindowInsetsCompat windowInsetsCompat, C5670e eVar);
    }

    /* renamed from: a */
    public static void m27830a(View view, AbstractC5669d dVar) {
        C2733w0.m37058D0(view, new C5667b(dVar, new C5670e(C2733w0.m37053G(view), view.getPaddingTop(), C2733w0.m37055F(view), view.getPaddingBottom())));
        m27824g(view);
    }

    /* renamed from: b */
    public static float m27829b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static Integer m27828c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    /* renamed from: d */
    public static float m27827d(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C2733w0.m36979w((View) parent);
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m27826e(View view) {
        return C2733w0.m37063B(view) == 1;
    }

    /* renamed from: f */
    public static PorterDuff.Mode m27825f(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: g */
    public static void m27824g(View view) {
        if (C2733w0.m37030T(view)) {
            C2733w0.m36996n0(view);
        } else {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC5668c());
        }
    }

    /* renamed from: h */
    public static void m27823h(View view) {
        view.requestFocus();
        view.post(new RunnableC5666a(view));
    }

    /* renamed from: com.google.android.material.internal.o$e */
    /* loaded from: classes3.dex */
    public static class C5670e {

        /* renamed from: a */
        public int f11069a;

        /* renamed from: b */
        public int f11070b;

        /* renamed from: c */
        public int f11071c;

        /* renamed from: d */
        public int f11072d;

        public C5670e(int i, int i2, int i3, int i4) {
            this.f11069a = i;
            this.f11070b = i2;
            this.f11071c = i3;
            this.f11072d = i4;
        }

        public C5670e(C5670e eVar) {
            this.f11069a = eVar.f11069a;
            this.f11070b = eVar.f11070b;
            this.f11071c = eVar.f11071c;
            this.f11072d = eVar.f11072d;
        }
    }
}
