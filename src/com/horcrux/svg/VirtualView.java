package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.OnLayoutEvent;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import com.horcrux.svg.SVGLength;
import java.util.ArrayList;
import p414x3.C13925a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public abstract class VirtualView extends ReactViewGroup {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    ArrayList<C5983s> elements;
    private C5965j glyphContext;
    RectF mBox;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    RectF mMarkerBounds;
    String mMarkerEnd;
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    String mMarkerStart;
    String mMask;
    String mName;
    Path mPath;
    PointerEvents mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private C5969l mTextRoot;
    private SvgView svgView;
    float mOpacity = 1.0f;
    Matrix mCTM = new Matrix();
    Matrix mMatrix = new Matrix();
    Matrix mTransform = new Matrix();
    Matrix mInvCTM = new Matrix();
    Matrix mInvMatrix = new Matrix();
    final Matrix mInvTransform = new Matrix();
    boolean mInvertible = true;
    boolean mCTMInvertible = true;
    boolean mTransformInvertible = true;
    private double fontSize = -1.0d;
    private double canvasDiagonal = -1.0d;
    private float canvasHeight = -1.0f;
    private float canvasWidth = -1.0f;
    final float mScale = DisplayMetricsHolder.getScreenDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.VirtualView$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C5939a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11799a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            f11799a = iArr;
            try {
                iArr[SVGLength.UnitType.EMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11799a[SVGLength.UnitType.EXS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11799a[SVGLength.UnitType.CM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11799a[SVGLength.UnitType.MM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11799a[SVGLength.UnitType.IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11799a[SVGLength.UnitType.PT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11799a[SVGLength.UnitType.PC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mContext = reactContext;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (parent instanceof VirtualView) {
                virtualView = (VirtualView) parent;
                if (virtualView.mPath != null) {
                    virtualView.clearCache();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private double fromRelativeFast(SVGLength sVGLength) {
        double d;
        switch (C5939a.f11799a[sVGLength.f11768b.ordinal()]) {
            case 1:
                d = getFontSizeFromContext();
                break;
            case 2:
                d = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                d = 35.43307d;
                break;
            case 4:
                d = 3.543307d;
                break;
            case 5:
                d = 90.0d;
                break;
            case 6:
                d = 1.25d;
                break;
            case 7:
                d = 15.0d;
                break;
            default:
                d = 1.0d;
                break;
        }
        return sVGLength.f11767a * d * this.mScale;
    }

    private double getCanvasDiagonal() {
        double d = this.canvasDiagonal;
        if (d != -1.0d) {
            return d;
        }
        double sqrt = Math.sqrt(Math.pow(getCanvasWidth(), 2.0d) + Math.pow(getCanvasHeight(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = sqrt;
        return sqrt;
    }

    private float getCanvasHeight() {
        float f = this.canvasHeight;
        if (f != -1.0f) {
            return f;
        }
        C5969l textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.m26728c().m26748d();
        }
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f = this.canvasWidth;
        if (f != -1.0f) {
            return f;
        }
        C5969l textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.m26728c().m26745g();
        }
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d = this.fontSize;
        if (d != -1.0d) {
            return d;
        }
        C5969l textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.m26728c();
        }
        double c = this.glyphContext.m26749c();
        this.fontSize = c;
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearChildCache() {
        clearCache();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void draw(Canvas canvas, Paint paint, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getClientRect() {
        return this.mClientRect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5969l getParentTextRoot() {
        ViewParent parent = getParent();
        if (!(parent instanceof VirtualView)) {
            return null;
        }
        return ((VirtualView) parent).getTextRoot();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Path getPath(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgView getSvgView() {
        SvgView svgView = this.svgView;
        if (svgView != null) {
            return svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            C13925a.m2288j(ReactConstants.TAG, "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
        }
        return this.svgView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5969l getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (true) {
                if (virtualView == null) {
                    break;
                }
                if (virtualView instanceof C5969l) {
                    C5969l lVar = (C5969l) virtualView;
                    if (lVar.m26728c() != null) {
                        this.mTextRoot = lVar;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                if (!(parent instanceof VirtualView)) {
                    virtualView = null;
                } else {
                    virtualView = (VirtualView) parent;
                }
            }
        }
        return this.mTextRoot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if (!(this instanceof RenderableView) || this.mPath != null) {
            clearCache();
            clearParentCache();
            super.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isResponsible() {
        return this.mResponsible;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.mClientRect != null) {
            SvgView svgView = getSvgView();
            int[] iArr = new int[2];
            getSvgView().getLocationOnScreen(iArr);
            Rect rect = new Rect();
            boolean z = false;
            rect.left = iArr[0] + ((int) Math.floor(this.mClientRect.left));
            rect.top = iArr[1] + ((int) Math.floor(this.mClientRect.top));
            rect.right = rect.left + ((int) Math.ceil(this.mClientRect.width()));
            rect.bottom = rect.top + ((int) Math.ceil(this.mClientRect.height()));
            Rect rect2 = new Rect();
            if (svgView.getGlobalVisibleRect(rect2) && rect.intersect(rect2)) {
                z = true;
            }
            String canonicalName = getClass().getCanonicalName();
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setClassName(canonicalName);
            accessibilityNodeInfo.setVisibleToUser(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF = this.mClientRect;
        if (rectF != null) {
            if (!(this instanceof C5969l)) {
                setLeft((int) Math.floor(rectF.left));
                setTop((int) Math.floor(this.mClientRect.top));
                setRight((int) Math.ceil(this.mClientRect.right));
                setBottom((int) Math.ceil(this.mClientRect.bottom));
            }
            setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        RectF rectF = this.mClientRect;
        if (rectF != null) {
            i3 = (int) Math.ceil(rectF.width());
        } else {
            i3 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        }
        RectF rectF2 = this.mClientRect;
        if (rectF2 != null) {
            i4 = (int) Math.ceil(rectF2.height());
        } else {
            i4 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        }
        setMeasuredDimension(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnHeight(SVGLength sVGLength) {
        double d;
        float canvasHeight;
        SVGLength.UnitType unitType = sVGLength.f11768b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d = sVGLength.f11767a;
            canvasHeight = this.mScale;
        } else if (unitType != SVGLength.UnitType.PERCENTAGE) {
            return fromRelativeFast(sVGLength);
        } else {
            d = sVGLength.f11767a / 100.0d;
            canvasHeight = getCanvasHeight();
        }
        return d * canvasHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnOther(SVGLength sVGLength) {
        double d;
        double canvasDiagonal;
        SVGLength.UnitType unitType = sVGLength.f11768b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d = sVGLength.f11767a;
            canvasDiagonal = this.mScale;
        } else if (unitType != SVGLength.UnitType.PERCENTAGE) {
            return fromRelativeFast(sVGLength);
        } else {
            d = sVGLength.f11767a / 100.0d;
            canvasDiagonal = getCanvasDiagonal();
        }
        return d * canvasDiagonal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnWidth(SVGLength sVGLength) {
        double d;
        float canvasWidth;
        SVGLength.UnitType unitType = sVGLength.f11768b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d = sVGLength.f11767a;
            canvasWidth = this.mScale;
        } else if (unitType != SVGLength.UnitType.PERCENTAGE) {
            return fromRelativeFast(sVGLength);
        } else {
            d = sVGLength.f11767a / 100.0d;
            canvasWidth = getCanvasWidth();
        }
        return d * canvasWidth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void render(Canvas canvas, Paint paint, float f) {
        draw(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restoreCanvas(Canvas canvas, int i) {
        canvas.restoreToCount(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int save = canvas.save();
        this.mCTM.setConcat(this.mMatrix, this.mTransform);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return save;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setClientRect(RectF rectF) {
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (rectF != null) {
                int ceil = (int) Math.ceil(rectF.width());
                int ceil2 = (int) Math.ceil(this.mClientRect.height());
                int floor = (int) Math.floor(this.mClientRect.left);
                int floor2 = (int) Math.floor(this.mClientRect.top);
                int ceil3 = (int) Math.ceil(this.mClientRect.right);
                int ceil4 = (int) Math.ceil(this.mClientRect.bottom);
                setMeasuredDimension(ceil, ceil2);
                if (!(this instanceof C5969l)) {
                    setLeft(floor);
                    setTop(floor2);
                    setRight(ceil3);
                    setBottom(ceil4);
                }
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.mContext, getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(OnLayoutEvent.obtain(getId(), floor, floor2, ceil, ceil2));
                }
            }
        }
    }

    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    public void setClipRule(int i) {
        this.mClipRule = i;
        invalidate();
    }

    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    public void setMatrix(Dynamic dynamic) {
        setMatrix(!dynamic.isNull() && dynamic.getType().equals(ReadableType.Array) ? dynamic.asArray() : null);
    }

    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    public void setOpacity(float f) {
        this.mOpacity = f;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    public void setResponsible(boolean z) {
        this.mResponsible = z;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path getClipPath(Canvas canvas, Paint paint) {
        Path path;
        if (this.mClipPath != null) {
            C5949c cVar = (C5949c) getSvgView().getDefinedClipPath(this.mClipPath);
            if (cVar != null) {
                if (this.mClipRule == 0) {
                    path = cVar.getPath(canvas, paint);
                } else {
                    path = cVar.mo26604d(canvas, paint, Region.Op.UNION);
                }
                path.transform(cVar.mMatrix);
                path.transform(cVar.mTransform);
                int i = this.mClipRule;
                if (i == 0) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else if (i != 1) {
                    C13925a.m2304H(ReactConstants.TAG, "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = path;
            } else {
                C13925a.m2304H(ReactConstants.TAG, "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    public void setMatrix(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int c = C5992x.m26554c(readableArray, fArr, this.mScale);
            if (c == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (c != -1) {
                C13925a.m2304H(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            this.mInvertible = true;
        }
        super.invalidate();
        clearParentCache();
    }
}
