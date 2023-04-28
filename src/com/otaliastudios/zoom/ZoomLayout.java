package com.otaliastudios.zoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ViewProps;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 }2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001}B/\b\u0002\u0012\u0006\u0010v\u001a\u00020u\u0012\b\u0010x\u001a\u0004\u0018\u00010w\u0012\b\b\u0001\u0010y\u001a\u00020\u0006\u0012\b\b\u0002\u0010]\u001a\u00020\\¢\u0006\u0004\bz\u0010{B'\b\u0017\u0012\u0006\u0010v\u001a\u00020u\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010w\u0012\b\b\u0003\u0010y\u001a\u00020\u0006¢\u0006\u0004\bz\u0010|J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\t\u0010\b\u001a\u00020\u0006H\u0096\u0001J\t\u0010\n\u001a\u00020\tH\u0096\u0001J\t\u0010\f\u001a\u00020\u000bH\u0096\u0001J\t\u0010\r\u001a\u00020\u000bH\u0096\u0001J)\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J$\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J\u0019\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J\u0011\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\tH\u0096\u0001J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001J\u0011\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000bH\u0096\u0001J\u0019\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000bH\u0096\u0001J\u0019\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010*\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0096\u0001J\u0011\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\tH\u0096\u0001J\u0011\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\tH\u0096\u0001J\u0011\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020\tH\u0096\u0001J\u0011\u00104\u001a\u00020\u00042\u0006\u0010,\u001a\u000203H\u0096\u0001J\u0011\u00105\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u00106\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0006H\u0096\u0001J\u0019\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010:\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010;\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010<\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0019\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J\t\u0010?\u001a\u00020\u0004H\u0096\u0001J\t\u0010@\u001a\u00020\u0004H\u0096\u0001J\u0019\u0010A\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J\b\u0010B\u001a\u00020\u0004H\u0016J\b\u0010C\u001a\u00020\u0004H\u0014J\b\u0010D\u001a\u00020\u0004H\u0014J\u0018\u0010G\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0006H\u0014J \u0010M\u001a\u00020\u00042\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\u00062\u0006\u0010L\u001a\u00020KH\u0016J\u0010\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020NH\u0016J\u0010\u0010Q\u001a\u00020\t2\u0006\u0010O\u001a\u00020NH\u0017J\b\u0010R\u001a\u00020\u0006H\u0014J\b\u0010S\u001a\u00020\u0006H\u0014J\b\u0010T\u001a\u00020\u0006H\u0014J\b\u0010U\u001a\u00020\u0006H\u0014J \u0010Y\u001a\u00020\t2\u0006\u0010W\u001a\u00020V2\u0006\u0010I\u001a\u00020H2\u0006\u0010X\u001a\u00020\u001fH\u0014J\u000e\u0010[\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\tR\u0017\u0010]\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0016\u0010Z\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010aR\u0014\u0010d\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\be\u0010cR\u0014\u0010\u0019\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bg\u0010cR\u0014\u0010i\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010cR\u0014\u0010k\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bj\u0010cR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bl\u0010cR\u0014\u0010p\u001a\u00020m8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006~"}, m15073d2 = {"Lcom/otaliastudios/zoom/ZoomLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lcom/otaliastudios/zoom/c;", "", "onUpdate", "", "getMaxZoomType", "getMinZoomType", "", "cancelAnimations", "", "getMaxZoom", "getMinZoom", "zoom", "x", "y", "animate", "moveTo", "moveToCenter", "(Ljava/lang/Float;Z)V", "dx", "dy", "panBy", "panTo", "realZoom", "realZoomTo", "alignment", "setAlignment", "allow", "setAllowFlingInOverscroll", "", "duration", "setAnimationDuration", ViewProps.ENABLED, "setFlingEnabled", "setHorizontalPanEnabled", "maxZoom", "setMaxZoom", "type", "minZoom", "setMinZoom", "setOneFingerScrollEnabled", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "provider", "setOverPanRange", "overPinchable", "setOverPinchable", "overScroll", "setOverScrollHorizontal", "setOverScrollVertical", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "setOverZoomRange", "setScrollEnabled", "setThreeFingersScrollEnabled", "transformation", "setTransformation", "gravity", "setTwoFingersScrollEnabled", "setVerticalPanEnabled", "setZoomEnabled", "zoomFactor", "zoomBy", "zoomIn", "zoomOut", "zoomTo", "onGlobalLayout", "onAttachedToWindow", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "onTouchEvent", "computeHorizontalScrollOffset", "computeHorizontalScrollRange", "computeVerticalScrollOffset", "computeVerticalScrollRange", "Landroid/graphics/Canvas;", "canvas", "drawingTime", "drawChild", "hasClickableChildren", "setHasClickableChildren", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "Lcom/otaliastudios/zoom/ZoomEngine;", "getEngine", "()Lcom/otaliastudios/zoom/ZoomEngine;", "Z", "getPanX", "()F", "panX", "getPanY", "panY", "getRealZoom", "getScaledPanX", "scaledPanX", "getScaledPanY", "scaledPanY", "getZoom", "Lcom/otaliastudios/zoom/AbsolutePoint;", "getPan", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "Lcom/otaliastudios/zoom/ScaledPoint;", "getScaledPan", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/otaliastudios/zoom/ZoomEngine;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* loaded from: classes6.dex */
public class ZoomLayout extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, AbstractC6108c {
    public static final Companion Companion = new Companion(null);
    private static final ZoomLogger LOG;
    private static final String TAG;
    private final ZoomEngine engine;
    private boolean hasClickableChildren;

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m15073d2 = {"Lcom/otaliastudios/zoom/ZoomLayout$Companion;", "", "()V", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "TAG", "", "kotlin.jvm.PlatformType", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m15073d2 = {"com/otaliastudios/zoom/ZoomLayout$a", "Lcom/otaliastudios/zoom/ZoomEngine$c;", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "", "onIdle", "Landroid/graphics/Matrix;", "matrix", "onUpdate", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomLayout$a */
    /* loaded from: classes6.dex */
    public static final class C6104a implements ZoomEngine.AbstractC6097c {
        C6104a() {
        }

        @Override // com.otaliastudios.zoom.ZoomEngine.AbstractC6097c
        public void onIdle(ZoomEngine engine) {
            C9971q.m14633g(engine, "engine");
        }

        @Override // com.otaliastudios.zoom.ZoomEngine.AbstractC6097c
        public void onUpdate(ZoomEngine engine, Matrix matrix) {
            C9971q.m14633g(engine, "engine");
            C9971q.m14633g(matrix, "matrix");
            ZoomLayout.this.onUpdate();
        }
    }

    static {
        String TAG2 = ZoomLayout.class.getSimpleName();
        TAG = TAG2;
        ZoomLogger.C6105a aVar = ZoomLogger.f12416b;
        C9971q.m14634f(TAG2, "TAG");
        LOG = aVar.m26250a(TAG2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomLayout(Context context) {
        this(context, null, 0, 6, null);
        C9971q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9971q.m14633g(context, "context");
    }

    /* synthetic */ ZoomLayout(Context context, AttributeSet attributeSet, int i, ZoomEngine zoomEngine, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i, (i2 & 8) != 0 ? new ZoomEngine(context) : zoomEngine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdate() {
        if (!this.hasClickableChildren) {
            invalidate();
        } else if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.setPivotX(0.0f);
            childAt.setPivotY(0.0f);
            childAt.setTranslationX(this.engine.m26331I());
            childAt.setTranslationY(this.engine.m26330J());
            childAt.setScaleX(this.engine.m26333G());
            childAt.setScaleY(this.engine.m26333G());
        }
        if ((isHorizontalScrollBarEnabled() || isVerticalScrollBarEnabled()) && !awakenScrollBars()) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int i, ViewGroup.LayoutParams params) {
        C9971q.m14633g(child, "child");
        C9971q.m14633g(params, "params");
        if (getChildCount() <= 0) {
            super.addView(child, i, params);
            return;
        }
        throw new RuntimeException(C9971q.m14624p(TAG, " accepts only a single child."));
    }

    public boolean cancelAnimations() {
        return this.engine.m26289m();
    }

    @Override // android.view.View
    protected int computeHorizontalScrollOffset() {
        return this.engine.m26287n();
    }

    @Override // android.view.View
    protected int computeHorizontalScrollRange() {
        return this.engine.m26285o();
    }

    @Override // android.view.View
    protected int computeVerticalScrollOffset() {
        return this.engine.m26277s();
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        return this.engine.m26275t();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j) {
        C9971q.m14633g(canvas, "canvas");
        C9971q.m14633g(child, "child");
        if (this.hasClickableChildren) {
            return super.drawChild(canvas, child, j);
        }
        int save = canvas.save();
        canvas.concat(this.engine.m26268y());
        boolean drawChild = super.drawChild(canvas, child, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final ZoomEngine getEngine() {
        return this.engine;
    }

    public float getMaxZoom() {
        return this.engine.m26267z();
    }

    public int getMaxZoomType() {
        return this.engine.m26339A();
    }

    public float getMinZoom() {
        return this.engine.m26338B();
    }

    public int getMinZoomType() {
        return this.engine.m26337C();
    }

    public AbsolutePoint getPan() {
        return this.engine.m26336D();
    }

    public float getPanX() {
        return this.engine.m26335E();
    }

    public float getPanY() {
        return this.engine.m26334F();
    }

    public float getRealZoom() {
        return this.engine.m26333G();
    }

    public ScaledPoint getScaledPan() {
        return this.engine.m26332H();
    }

    public float getScaledPanX() {
        return this.engine.m26331I();
    }

    public float getScaledPanY() {
        return this.engine.m26330J();
    }

    public float getZoom() {
        return this.engine.m26329K();
    }

    public void moveTo(float f, float f2, float f3, boolean z) {
        this.engine.m26327M(f, f2, f3, z);
    }

    public void moveToCenter(Float f, boolean z) {
        this.engine.m26326N(f, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public void onGlobalLayout() {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            ZoomEngine.m26312a0(this.engine, childAt.getWidth(), childAt.getHeight(), false, 4, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        C9971q.m14633g(ev, "ev");
        if (this.engine.m26325O(ev) || (this.hasClickableChildren && super.onInterceptTouchEvent(ev))) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode2 == 0) {
            throw new RuntimeException(C9971q.m14624p(TAG, " must be used with fixed dimensions (e.g. match_parent)"));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        measureChildren(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent ev) {
        C9971q.m14633g(ev, "ev");
        if (this.engine.m26324P(ev) || (this.hasClickableChildren && super.onTouchEvent(ev))) {
            return true;
        }
        return false;
    }

    public void panBy(float f, float f2, boolean z) {
        this.engine.m26323Q(f, f2, z);
    }

    public void panTo(float f, float f2, boolean z) {
        this.engine.m26322R(f, f2, z);
    }

    public void realZoomTo(float f, boolean z) {
        this.engine.m26321S(f, z);
    }

    public void setAlignment(int i) {
        this.engine.m26320T(i);
    }

    public void setAllowFlingInOverscroll(boolean z) {
        this.engine.m26319U(z);
    }

    public void setAnimationDuration(long j) {
        this.engine.m26318V(j);
    }

    public void setFlingEnabled(boolean z) {
        this.engine.m26310b0(z);
    }

    public final void setHasClickableChildren(boolean z) {
        LOG.m26257b("setHasClickableChildren:", "old:", Boolean.valueOf(this.hasClickableChildren), "new:", Boolean.valueOf(z));
        if (this.hasClickableChildren && !z && getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            childAt.setTranslationX(0.0f);
            childAt.setTranslationY(0.0f);
        }
        this.hasClickableChildren = z;
        if (getWidth() > 0 && getHeight() > 0) {
            if (this.hasClickableChildren) {
                onUpdate();
            } else {
                invalidate();
            }
        }
    }

    public void setHorizontalPanEnabled(boolean z) {
        this.engine.m26308c0(z);
    }

    public void setMaxZoom(float f) {
        this.engine.m26306d0(f);
    }

    @Override // com.otaliastudios.zoom.AbstractC6108c
    public void setMaxZoom(float f, int i) {
        this.engine.setMaxZoom(f, i);
    }

    public void setMinZoom(float f) {
        this.engine.m26304e0(f);
    }

    @Override // com.otaliastudios.zoom.AbstractC6108c
    public void setMinZoom(float f, int i) {
        this.engine.setMinZoom(f, i);
    }

    public void setOneFingerScrollEnabled(boolean z) {
        this.engine.m26302f0(z);
    }

    public void setOverPanRange(OverPanRangeProvider provider) {
        C9971q.m14633g(provider, "provider");
        this.engine.m26300g0(provider);
    }

    public void setOverPinchable(boolean z) {
        this.engine.m26298h0(z);
    }

    public void setOverScrollHorizontal(boolean z) {
        this.engine.m26296i0(z);
    }

    public void setOverScrollVertical(boolean z) {
        this.engine.m26294j0(z);
    }

    public void setOverZoomRange(OverZoomRangeProvider provider) {
        C9971q.m14633g(provider, "provider");
        this.engine.m26292k0(provider);
    }

    public void setScrollEnabled(boolean z) {
        this.engine.m26290l0(z);
    }

    public void setThreeFingersScrollEnabled(boolean z) {
        this.engine.m26288m0(z);
    }

    public void setTransformation(int i) {
        this.engine.m26286n0(i);
    }

    @Override // com.otaliastudios.zoom.AbstractC6108c
    public void setTransformation(int i, int i2) {
        this.engine.setTransformation(i, i2);
    }

    public void setTwoFingersScrollEnabled(boolean z) {
        this.engine.m26284o0(z);
    }

    public void setVerticalPanEnabled(boolean z) {
        this.engine.m26282p0(z);
    }

    public void setZoomEnabled(boolean z) {
        this.engine.m26280q0(z);
    }

    public void zoomBy(float f, boolean z) {
        this.engine.m26278r0(f, z);
    }

    public void zoomIn() {
        this.engine.m26276s0();
    }

    public void zoomOut() {
        this.engine.m26274t0();
    }

    public void zoomTo(float f, boolean z) {
        this.engine.m26272u0(f, z);
    }

    private ZoomLayout(Context context, AttributeSet attributeSet, int i, ZoomEngine zoomEngine) {
        super(context, attributeSet, i);
        this.engine = zoomEngine;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C6107b.f12422a, i, 0);
        C9971q.m14634f(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, R.styleable.ZoomEngine, defStyleAttr, 0)");
        boolean z = obtainStyledAttributes.getBoolean(C6107b.f12435n, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C6107b.f12436o, true);
        boolean z3 = obtainStyledAttributes.getBoolean(C6107b.f12428g, true);
        boolean z4 = obtainStyledAttributes.getBoolean(C6107b.f12442u, true);
        boolean z5 = obtainStyledAttributes.getBoolean(C6107b.f12434m, true);
        boolean z6 = obtainStyledAttributes.getBoolean(C6107b.f12443v, true);
        boolean z7 = obtainStyledAttributes.getBoolean(C6107b.f12426e, true);
        boolean z8 = obtainStyledAttributes.getBoolean(C6107b.f12437p, true);
        boolean z9 = obtainStyledAttributes.getBoolean(C6107b.f12433l, true);
        boolean z10 = obtainStyledAttributes.getBoolean(C6107b.f12441t, true);
        boolean z11 = obtainStyledAttributes.getBoolean(C6107b.f12438q, true);
        boolean z12 = obtainStyledAttributes.getBoolean(C6107b.f12424c, true);
        boolean z13 = obtainStyledAttributes.getBoolean(C6107b.f12427f, false);
        float f = obtainStyledAttributes.getFloat(C6107b.f12431j, 0.8f);
        float f2 = obtainStyledAttributes.getFloat(C6107b.f12429h, 2.5f);
        int integer = obtainStyledAttributes.getInteger(C6107b.f12432k, 0);
        int integer2 = obtainStyledAttributes.getInteger(C6107b.f12430i, 0);
        int integer3 = obtainStyledAttributes.getInteger(C6107b.f12439r, 0);
        int i2 = obtainStyledAttributes.getInt(C6107b.f12440s, 0);
        int i3 = obtainStyledAttributes.getInt(C6107b.f12423b, 51);
        obtainStyledAttributes.recycle();
        zoomEngine.m26317W(this);
        zoomEngine.m26291l(new C6104a());
        setTransformation(integer3, i2);
        setAlignment(i3);
        setOverScrollHorizontal(z);
        setOverScrollVertical(z2);
        setHorizontalPanEnabled(z3);
        setVerticalPanEnabled(z4);
        setOverPinchable(z5);
        setZoomEnabled(z6);
        setFlingEnabled(z7);
        setScrollEnabled(z8);
        setOneFingerScrollEnabled(z9);
        setTwoFingersScrollEnabled(z10);
        setThreeFingersScrollEnabled(z11);
        setAllowFlingInOverscroll(z12);
        setAnimationDuration(obtainStyledAttributes.getInt(C6107b.f12425d, 280));
        setMinZoom(f, integer);
        setMaxZoom(f2, integer2);
        setHasClickableChildren(z13);
        setWillNotDraw(false);
    }

    public /* synthetic */ ZoomLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new ZoomEngine(context));
        C9971q.m14633g(context, "context");
    }
}
