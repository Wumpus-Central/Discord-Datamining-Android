package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.C2733w0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p083eb.C6807f;
import p083eb.C6809h;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: k */
    private final Chip f11402k;

    /* renamed from: l */
    private final Chip f11403l;

    /* renamed from: m */
    private final ClockHandView f11404m;

    /* renamed from: n */
    private final ClockFaceView f11405n;

    /* renamed from: o */
    private final MaterialButtonToggleGroup f11406o;

    /* renamed from: p */
    private final View.OnClickListener f11407p;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC5770a implements View.OnClickListener {
        View$OnClickListenerC5770a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.this.getClass();
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    /* loaded from: classes3.dex */
    class C5771b implements MaterialButtonToggleGroup.AbstractC5549d {
        C5771b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.AbstractC5549d
        /* renamed from: a */
        public void mo27392a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            TimePickerView.this.getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    /* loaded from: classes3.dex */
    public class C5772c extends GestureDetector.SimpleOnGestureListener {
        C5772c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.this.getClass();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC5773d implements View.OnTouchListener {

        /* renamed from: k */
        final /* synthetic */ GestureDetector f11411k;

        View$OnTouchListenerC5773d(GestureDetector gestureDetector) {
            this.f11411k = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f11411k.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    /* loaded from: classes3.dex */
    interface AbstractC5774e {
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    /* loaded from: classes3.dex */
    interface AbstractC5775f {
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    /* loaded from: classes3.dex */
    interface AbstractC5776g {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private void m27395e() {
        Chip chip = this.f11402k;
        int i = C6807f.f38021G;
        chip.setTag(i, 12);
        this.f11403l.setTag(i, 10);
        this.f11402k.setOnClickListener(this.f11407p);
        this.f11403l.setOnClickListener(this.f11407p);
        this.f11402k.setAccessibilityClassName("android.view.View");
        this.f11403l.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: f */
    private void m27394f() {
        View$OnTouchListenerC5773d dVar = new View$OnTouchListenerC5773d(new GestureDetector(getContext(), new C5772c()));
        this.f11402k.setOnTouchListener(dVar);
        this.f11403l.setOnTouchListener(dVar);
    }

    /* renamed from: g */
    private void m27393g() {
        boolean z;
        if (this.f11406o.getVisibility() == 0) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.m38794g(this);
            int i = 1;
            if (C2733w0.m37063B(this) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 2;
            }
            constraintSet.m38796e(C6807f.f14598g, i);
            constraintSet.m38798c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m27393g();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m27393g();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11407p = new View$OnClickListenerC5770a();
        LayoutInflater.from(context).inflate(C6809h.f14629i, this);
        this.f11405n = (ClockFaceView) findViewById(C6807f.f14599h);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C6807f.f14601j);
        this.f11406o = materialButtonToggleGroup;
        materialButtonToggleGroup.m28547b(new C5771b());
        this.f11402k = (Chip) findViewById(C6807f.f14604m);
        this.f11403l = (Chip) findViewById(C6807f.f14602k);
        this.f11404m = (ClockHandView) findViewById(C6807f.f14600i);
        m27394f();
        m27395e();
    }
}
