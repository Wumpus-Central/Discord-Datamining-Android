package com.discord.zoom_layout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.otaliastudios.zoom.ZoomLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/zoom_layout/ZoomLayoutFixed;", "Lcom/otaliastudios/zoom/ZoomLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gestureEnabled", "", "getGestureEnabled", "()Z", "setGestureEnabled", "(Z)V", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "pinchDetector", "Landroid/view/ScaleGestureDetector;", "onDetachedFromWindow", "", "onGlobalLayout", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "ev", "Landroid/view/MotionEvent;", "zoom_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ZoomLayoutFixed extends ZoomLayout {
    private boolean gestureEnabled;
    private final View.OnLayoutChangeListener layoutChangeListener;
    private final ScaleGestureDetector pinchDetector;

    
    public ZoomLayoutFixed(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public ZoomLayoutFixed(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  ZoomLayoutFixed(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    
    public static final void layoutChangeListener$lambda$0(ZoomLayoutFixed this$0, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        q.h(this$0, "this$0");
        this$0.getEngine().Z(view.getWidth(), view.getHeight(), true);
    }

    
    public static final void onMeasure$lambda$1(ZoomLayoutFixed this$0) {
        q.h(this$0, "this$0");
        this$0.getViewTreeObserver().dispatchOnGlobalLayout();
    }

    public final boolean getGestureEnabled() {
        return this.gestureEnabled;
    }

    
    @Override 
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.removeOnLayoutChangeListener(this.layoutChangeListener);
        }
    }

    @Override 
    public void onGlobalLayout() {
        super.onGlobalLayout();
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.addOnLayoutChangeListener(this.layoutChangeListener);
        }
    }

    @Override 
    protected void onMeasure(int i10, int i11) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        post(new Runnable() { 
            @Override 
            public final void run() {
                ZoomLayoutFixed.onMeasure$lambda$1(ZoomLayoutFixed.this);
            }
        });
    }

    @Override 
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent ev) {
        q.h(ev, "ev");
        if (!this.gestureEnabled) {
            return true;
        }
        if (ev.getPointerCount() > 1 && this.pinchDetector.onTouchEvent(ev)) {
            GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this).requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(ev);
    }

    public final void setGestureEnabled(boolean z10) {
        this.gestureEnabled = z10;
    }

    
    public ZoomLayoutFixed(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        this.pinchDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener());
        this.gestureEnabled = true;
        this.layoutChangeListener = new View.OnLayoutChangeListener() { 
            @Override 
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                ZoomLayoutFixed.layoutChangeListener$lambda$0(ZoomLayoutFixed.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
    }
}
