package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import p200kf.C9864h;

/* loaded from: classes8.dex */
public class GestureCropImageView extends C6374a {

    /* renamed from: L */
    private ScaleGestureDetector f37704L;

    /* renamed from: M */
    private C9864h f37705M;

    /* renamed from: N */
    private GestureDetector f37706N;

    /* renamed from: O */
    private float f37707O;

    /* renamed from: P */
    private float f37708P;

    /* renamed from: Q */
    private boolean f37709Q;

    /* renamed from: R */
    private boolean f37710R;

    /* renamed from: S */
    private int f37711S;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$b */
    /* loaded from: classes8.dex */
    public class C6369b extends GestureDetector.SimpleOnGestureListener {
        private C6369b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.m25687B(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.m25661m(-f, -f2);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$c */
    /* loaded from: classes8.dex */
    public class C6370c extends C9864h.C9866b {
        private C6370c() {
        }

        @Override // p200kf.C9864h.AbstractC9865a
        /* renamed from: a */
        public boolean mo15160a(C9864h hVar) {
            GestureCropImageView.this.m25663k(hVar.m15162c(), GestureCropImageView.this.f37707O, GestureCropImageView.this.f37708P);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$d */
    /* loaded from: classes8.dex */
    public class C6371d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C6371d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.mo25662l(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.f37707O, GestureCropImageView.this.f37708P);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: I */
    private void m25702I() {
        this.f37706N = new GestureDetector(getContext(), new C6369b(), null, true);
        this.f37704L = new ScaleGestureDetector(getContext(), new C6371d());
        this.f37705M = new C9864h(new C6370c());
    }

    public int getDoubleTapScaleSteps() {
        return this.f37711S;
    }

    protected float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.f37711S));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yalantis.ucrop.view.C6376b
    /* renamed from: i */
    public void mo25665i() {
        super.mo25665i();
        m25702I();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            m25678t();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f37707O = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.f37708P = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        this.f37706N.onTouchEvent(motionEvent);
        if (this.f37710R) {
            this.f37704L.onTouchEvent(motionEvent);
        }
        if (this.f37709Q) {
            this.f37705M.m15161d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            m25672z();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.f37711S = i;
    }

    public void setRotateEnabled(boolean z) {
        this.f37709Q = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f37710R = z;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37709Q = true;
        this.f37710R = true;
        this.f37711S = 5;
    }
}
