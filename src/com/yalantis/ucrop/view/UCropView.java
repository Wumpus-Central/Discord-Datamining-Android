package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gf.C7584d;
import gf.C7585e;
import gf.C7588h;
import p139hf.AbstractC8012c;
import p139hf.AbstractC8013d;

/* loaded from: classes8.dex */
public class UCropView extends FrameLayout {

    /* renamed from: k */
    private GestureCropImageView f13038k;

    /* renamed from: l */
    private final OverlayView f13039l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.view.UCropView$a */
    /* loaded from: classes8.dex */
    public class C6372a implements AbstractC8012c {
        C6372a() {
        }

        @Override // p139hf.AbstractC8012c
        /* renamed from: a */
        public void mo20857a(float f) {
            UCropView.this.f13039l.setTargetAspectRatio(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.view.UCropView$b */
    /* loaded from: classes8.dex */
    public class C6373b implements AbstractC8013d {
        C6373b() {
        }

        @Override // p139hf.AbstractC8013d
        /* renamed from: a */
        public void mo20856a(RectF rectF) {
            UCropView.this.f13038k.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m25689c() {
        this.f13038k.setCropBoundsChangeListener(new C6372a());
        this.f13039l.setOverlayViewChangeListener(new C6373b());
    }

    public GestureCropImageView getCropImageView() {
        return this.f13038k;
    }

    public OverlayView getOverlayView() {
        return this.f13039l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C7585e.f16499d, (ViewGroup) this, true);
        this.f13038k = (GestureCropImageView) findViewById(C7584d.f16471b);
        OverlayView overlayView = (OverlayView) findViewById(C7584d.f16494y);
        this.f13039l = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7588h.f38392U);
        overlayView.m25695g(obtainStyledAttributes);
        this.f13038k.m25673y(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        m25689c();
    }
}
