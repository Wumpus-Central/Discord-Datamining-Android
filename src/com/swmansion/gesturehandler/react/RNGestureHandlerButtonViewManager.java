package com.swmansion.gesturehandler.react;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2655k2;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import p085ef.C6832d;
import p085ef.C6847m;

@ReactModule(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002'(B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0017J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nH\u0017J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0017J!\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0017J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\nH\u0017J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\nH\u0017J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0010\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 H\u0014R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "view", "", "useDrawableOnForeground", "", "setForeground", "useBorderlessDrawable", "setBorderless", ViewProps.ENABLED, "setEnabled", "", ViewProps.BORDER_RADIUS, "setBorderRadius", "", "rippleColor", "setRippleColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "<init>", "()V", "Companion", "a", "b", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<C6233a> implements RNGestureHandlerButtonManagerInterface<C6233a> {
    public static final C6234b Companion = new C6234b(null);
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final ViewManagerDelegate<C6233a> mDelegate = new RNGestureHandlerButtonManagerDelegate(this);

    @Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b-\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001VB\u0011\u0012\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bS\u0010TJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010H\u0017J\u0006\u0010\u0015\u001a\u00020\u0005J0\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0014J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0007H\u0016J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016R.\u0010+\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u0010/\u001a\u0004\u0018\u00010\r2\b\u0010,\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R*\u00106\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R*\u0010@\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00101\u001a\u0004\bB\u00103\"\u0004\bC\u00105R\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00101R\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010FR\"\u0010O\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00101\u001a\u0004\bO\u00103\"\u0004\bP\u00105¨\u0006W"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Landroid/view/ViewGroup;", "Lef/m$d;", "Landroid/graphics/drawable/Drawable;", "h", "", "l", "", "m", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "children", "j", "", ViewProps.COLOR, "setBackgroundColor", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "event", "onTouchEvent", "n", "changed", "t", "r", "b", ViewProps.ON_LAYOUT, "", "x", "y", "drawableHotspotChanged", "c", "f", "performClick", "pressed", "setPressed", "dispatchDrawableHotspotChanged", "k", "Ljava/lang/Integer;", "getRippleColor", "()Ljava/lang/Integer;", "setRippleColor", "(Ljava/lang/Integer;)V", "rippleColor", "radius", "getRippleRadius", "setRippleRadius", "rippleRadius", "useForeground", "Z", "getUseDrawableOnForeground", "()Z", "setUseDrawableOnForeground", "(Z)V", "useDrawableOnForeground", "getUseBorderlessDrawable", "setUseBorderlessDrawable", "useBorderlessDrawable", "o", "F", "getBorderRadius", "()F", "setBorderRadius", "(F)V", ViewProps.BORDER_RADIUS, "p", "getExclusive", "setExclusive", "exclusive", "q", "I", "_backgroundColor", "needBackgroundUpdate", "", "s", "J", "lastEventTime", "lastAction", "u", "isTouched", "setTouched", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "v", "a", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a */
    /* loaded from: classes8.dex */
    public static final class C6233a extends ViewGroup implements C6847m.AbstractC6851d {

        /* renamed from: x */
        private static C6233a f12660x;

        /* renamed from: y */
        private static C6233a f12661y;

        /* renamed from: k */
        private Integer f12663k;

        /* renamed from: l */
        private Integer f12664l;

        /* renamed from: m */
        private boolean f12665m;

        /* renamed from: n */
        private boolean f12666n;

        /* renamed from: o */
        private float f12667o;

        /* renamed from: q */
        private int f12669q;

        /* renamed from: u */
        private boolean f12673u;

        /* renamed from: v */
        public static final C0184a f12658v = new C0184a(null);

        /* renamed from: w */
        private static TypedValue f12659w = new TypedValue();

        /* renamed from: z */
        private static View.OnClickListener f12662z = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.C6233a.m26060i(view);
            }
        };

        /* renamed from: p */
        private boolean f12668p = true;

        /* renamed from: s */
        private long f12671s = -1;

        /* renamed from: t */
        private int f12672t = -1;

        /* renamed from: r */
        private boolean f12670r = true;

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a$a;", "", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a */
        /* loaded from: classes8.dex */
        public static final class C0184a {
            private C0184a() {
            }

            public /* synthetic */ C0184a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C6233a(Context context) {
            super(context);
            setOnClickListener(f12662z);
            setClickable(true);
            setFocusable(true);
        }

        /* renamed from: h */
        private final Drawable m26061h() {
            ColorStateList colorStateList;
            ShapeDrawable shapeDrawable;
            int[][] iArr = {new int[]{16842910}};
            Integer num = this.f12664l;
            Integer num2 = this.f12663k;
            if (num2 != null) {
                C9971q.m14636d(num2);
                colorStateList = new ColorStateList(iArr, new int[]{num2.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(16843820, f12659w, true);
                colorStateList = new ColorStateList(iArr, new int[]{f12659w.data});
            }
            if (this.f12666n) {
                shapeDrawable = null;
            } else {
                shapeDrawable = new ShapeDrawable(new RectShape());
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, shapeDrawable);
            if (num != null) {
                rippleDrawable.setRadius((int) PixelUtil.toPixelFromDIP(num.intValue()));
            }
            return rippleDrawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m26060i(View view) {
        }

        /* renamed from: j */
        private final boolean m26059j(Sequence<? extends View> sequence) {
            for (View view : sequence) {
                if (view instanceof C6233a) {
                    C6233a aVar = (C6233a) view;
                    if (aVar.f12673u || aVar.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && m26059j(C2655k2.m37222a((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        static /* synthetic */ boolean m26058k(C6233a aVar, Sequence sequence, int i, Object obj) {
            if ((i & 1) != 0) {
                sequence = C2655k2.m37222a(aVar);
            }
            return aVar.m26059j(sequence);
        }

        /* renamed from: l */
        private final void m26057l() {
            if (f12660x == this) {
                f12660x = null;
                f12661y = this;
            }
        }

        /* renamed from: m */
        private final boolean m26056m() {
            boolean z;
            if (m26058k(this, null, 1, null)) {
                return false;
            }
            C6233a aVar = f12660x;
            if (aVar == null) {
                f12660x = this;
                return true;
            }
            if (!this.f12668p) {
                if (aVar != null) {
                    z = aVar.f12668p;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
            } else if (aVar == this) {
                return true;
            }
            return false;
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: a */
        public boolean mo24094a() {
            return C6847m.AbstractC6851d.C6852a.m24085d(this);
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: b */
        public boolean mo24093b() {
            return C6847m.AbstractC6851d.C6852a.m24083f(this);
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: c */
        public boolean mo24092c() {
            boolean m = m26056m();
            if (m) {
                this.f12673u = true;
            }
            return m;
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: d */
        public boolean mo24091d(C6832d<?> dVar) {
            return C6847m.AbstractC6851d.C6852a.m24084e(this, dVar);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f, float f2) {
            C6233a aVar = f12660x;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: e */
        public void mo24090e(MotionEvent motionEvent) {
            C6847m.AbstractC6851d.C6852a.m24086c(this, motionEvent);
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: f */
        public void mo24089f(MotionEvent event) {
            C9971q.m14633g(event, "event");
            m26057l();
            this.f12673u = false;
        }

        public final float getBorderRadius() {
            return this.f12667o;
        }

        public final boolean getExclusive() {
            return this.f12668p;
        }

        public final Integer getRippleColor() {
            return this.f12663k;
        }

        public final Integer getRippleRadius() {
            return this.f12664l;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f12666n;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f12665m;
        }

        /* renamed from: n */
        public final void m26055n() {
            boolean z;
            boolean z2;
            if (this.f12670r) {
                this.f12670r = false;
                if (this.f12669q == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable h = m26061h();
                if (this.f12667o == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && (h instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadius(this.f12667o);
                    ((RippleDrawable) h).setDrawableByLayerId(16908334, paintDrawable);
                }
                if (this.f12665m) {
                    setForeground(h);
                    int i = this.f12669q;
                    if (i != 0) {
                        setBackgroundColor(i);
                    }
                } else if (this.f12669q == 0 && this.f12663k == null) {
                    setBackground(h);
                } else {
                    PaintDrawable paintDrawable2 = new PaintDrawable(this.f12669q);
                    float f = this.f12667o;
                    if (f == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        paintDrawable2.setCornerRadius(f);
                    }
                    setBackground(new LayerDrawable(new Drawable[]{paintDrawable2, h}));
                }
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            C9971q.m14633g(ev, "ev");
            if (super.onInterceptTouchEvent(ev)) {
                return true;
            }
            onTouchEvent(ev);
            return isPressed();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent event) {
            C9971q.m14633g(event, "event");
            if (event.getAction() == 3) {
                m26057l();
            }
            long eventTime = event.getEventTime();
            int action = event.getAction();
            if (this.f12671s == eventTime && this.f12672t == action) {
                return false;
            }
            this.f12671s = eventTime;
            this.f12672t = action;
            return super.onTouchEvent(event);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (m26058k(this, null, 1, null) || !C9971q.m14638b(f12661y, this)) {
                return false;
            }
            m26057l();
            f12661y = null;
            return super.performClick();
        }

        @Override // android.view.View
        public void setBackgroundColor(int i) {
            this.f12669q = i;
            this.f12670r = true;
        }

        public final void setBorderRadius(float f) {
            this.f12667o = f * getResources().getDisplayMetrics().density;
            this.f12670r = true;
        }

        public final void setExclusive(boolean z) {
            this.f12668p = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
            if (m26058k(r3, null, 1, null) == false) goto L_0x0026;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void setPressed(boolean r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x000a
                boolean r0 = r3.m26056m()
                if (r0 == 0) goto L_0x000a
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C6233a.f12661y = r3
            L_0x000a:
                boolean r0 = r3.f12668p
                r1 = 0
                if (r0 != 0) goto L_0x0025
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C6233a.f12660x
                r2 = 1
                if (r0 == 0) goto L_0x001a
                boolean r0 = r0.f12668p
                if (r0 != r2) goto L_0x001a
                r0 = r2
                goto L_0x001b
            L_0x001a:
                r0 = r1
            L_0x001b:
                if (r0 != 0) goto L_0x0025
                r0 = 0
                boolean r0 = m26058k(r3, r0, r2, r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r2 = r1
            L_0x0026:
                if (r4 == 0) goto L_0x002e
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C6233a.f12660x
                if (r0 == r3) goto L_0x002e
                if (r2 == 0) goto L_0x0033
            L_0x002e:
                r3.f12673u = r4
                super.setPressed(r4)
            L_0x0033:
                if (r4 != 0) goto L_0x003b
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r4 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C6233a.f12660x
                if (r4 != r3) goto L_0x003b
                r3.f12673u = r1
            L_0x003b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.C6233a.setPressed(boolean):void");
        }

        public final void setRippleColor(Integer num) {
            this.f12663k = num;
            this.f12670r = true;
        }

        public final void setRippleRadius(Integer num) {
            this.f12664l = num;
            this.f12670r = true;
        }

        public final void setTouched(boolean z) {
            this.f12673u = z;
        }

        public final void setUseBorderlessDrawable(boolean z) {
            this.f12666n = z;
        }

        public final void setUseDrawableOnForeground(boolean z) {
            this.f12665m = z;
            this.f12670r = true;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$b;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$b */
    /* loaded from: classes8.dex */
    public static final class C6234b {
        private C6234b() {
        }

        public /* synthetic */ C6234b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<C6233a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C6233a createViewInstance(ThemedReactContext context) {
        C9971q.m14633g(context, "context");
        return new C6233a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C6233a view) {
        C9971q.m14633g(view, "view");
        view.m26055n();
    }

    @ReactProp(name = ViewProps.BORDER_RADIUS)
    public void setBorderRadius(C6233a view, float f) {
        C9971q.m14633g(view, "view");
        view.setBorderRadius(f);
    }

    @ReactProp(name = "borderless")
    public void setBorderless(C6233a view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setUseBorderlessDrawable(z);
    }

    @ReactProp(name = ViewProps.ENABLED)
    public void setEnabled(C6233a view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setEnabled(z);
    }

    @ReactProp(name = "exclusive")
    public void setExclusive(C6233a view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setExclusive(z);
    }

    @ReactProp(name = "foreground")
    @TargetApi(23)
    public void setForeground(C6233a view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setUseDrawableOnForeground(z);
    }

    @ReactProp(name = "rippleColor")
    public void setRippleColor(C6233a view, Integer num) {
        C9971q.m14633g(view, "view");
        view.setRippleColor(num);
    }

    @ReactProp(name = "rippleRadius")
    public void setRippleRadius(C6233a view, int i) {
        C9971q.m14633g(view, "view");
        view.setRippleRadius(Integer.valueOf(i));
    }

    @ReactProp(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(C6233a view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setSoundEffectsEnabled(!z);
    }
}
