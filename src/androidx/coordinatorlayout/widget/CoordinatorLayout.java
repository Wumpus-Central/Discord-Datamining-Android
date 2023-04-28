package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C2337a;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.util.AbstractC2516f;
import androidx.core.util.C2513d;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.AbstractC2684p0;
import androidx.core.view.AbstractC2689q0;
import androidx.core.view.AbstractC2694r0;
import androidx.core.view.C2706t;
import androidx.core.view.C2733w0;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.WindowInsetsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p125h1.AbstractC7736a;
import p452z0.C14514a;
import p452z0.C14515b;
import p452z0.C14516c;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements AbstractC2684p0, AbstractC2689q0 {

    /* renamed from: E */
    static final String f35609E;

    /* renamed from: F */
    static final Class<?>[] f35610F;

    /* renamed from: G */
    static final ThreadLocal<Map<String, Constructor<AbstractC2152c>>> f35611G;

    /* renamed from: H */
    static final Comparator<View> f35612H;

    /* renamed from: I */
    private static final AbstractC2516f<Rect> f35613I;

    /* renamed from: A */
    private Drawable f35614A;

    /* renamed from: B */
    ViewGroup.OnHierarchyChangeListener f35615B;

    /* renamed from: C */
    private AbstractC2694r0 f35616C;

    /* renamed from: D */
    private final NestedScrollingParentHelper f35617D;

    /* renamed from: k */
    private final List<View> f2978k;

    /* renamed from: l */
    private final C2160a<View> f2979l;

    /* renamed from: m */
    private final List<View> f2980m;

    /* renamed from: n */
    private final List<View> f2981n;

    /* renamed from: o */
    private Paint f2982o;

    /* renamed from: p */
    private final int[] f2983p;

    /* renamed from: q */
    private final int[] f2984q;

    /* renamed from: r */
    private boolean f2985r;

    /* renamed from: s */
    private boolean f2986s;

    /* renamed from: t */
    private int[] f2987t;

    /* renamed from: u */
    private View f2988u;

    /* renamed from: v */
    private View f2989v;

    /* renamed from: w */
    private ViewTreeObserver$OnPreDrawListenerC2156g f2990w;

    /* renamed from: x */
    private boolean f2991x;

    /* renamed from: y */
    private WindowInsetsCompat f2992y;

    /* renamed from: z */
    private boolean f2993z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C2150a implements AbstractC2694r0 {
        C2150a() {
        }

        @Override // androidx.core.view.AbstractC2694r0
        /* renamed from: a */
        public WindowInsetsCompat mo13081a(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.m38728Q(windowInsetsCompat);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface AbstractC2151b {
        AbstractC2152c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2152c<V extends View> {
        public AbstractC2152c() {
        }

        /* renamed from: A */
        public boolean mo28651A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return m38689z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void m38700B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo28648C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m38700B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo27351D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m38699a(CoordinatorLayout coordinatorLayout, V v) {
            return m38697d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo28048b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m38698c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float m38697d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo27348e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public WindowInsetsCompat m38696f(CoordinatorLayout coordinatorLayout, V v, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        /* renamed from: g */
        public void mo27352g(C2155f fVar) {
        }

        /* renamed from: h */
        public boolean mo27376h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo28781i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo28604j() {
        }

        /* renamed from: k */
        public boolean mo27689k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo27375l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo28600m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean m38695n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo28597o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void m38694p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo28594q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m38694p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void m38693r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void m38692s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                m38693r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo28590t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            m38692s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void m38691u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void m38690v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m38691u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo28780w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo28585x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo28583y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean m38689z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public AbstractC2152c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public @interface AbstractC2153d {
        Class<? extends AbstractC2152c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    private class ViewGroup$OnHierarchyChangeListenerC2154e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC2154e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f35615B;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m38743B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f35615B;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC2156g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC2156g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m38743B(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    /* loaded from: classes.dex */
    static class C2159i implements Comparator<View> {
        C2159i() {
        }

        /* renamed from: b */
        public int compare(View view, View view2) {
            float N = C2733w0.m37039N(view);
            float N2 = C2733w0.m37039N(view2);
            if (N > N2) {
                return -1;
            }
            if (N < N2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        f35609E = str;
        f35612H = new C2159i();
        f35610F = new Class[]{Context.class, AttributeSet.class};
        f35611G = new ThreadLocal<>();
        f35613I = new Pools$SynchronizedPool(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    static AbstractC2152c m38740E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f35609E;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC2152c>>> threadLocal = f35611G;
            Map<String, Constructor<AbstractC2152c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC2152c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f35610F);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: F */
    private boolean m38739F(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2980m;
        m38707t(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C2155f fVar = (C2155f) view.getLayoutParams();
            AbstractC2152c f = fVar.m38683f();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i == 0) {
                        z = f.mo27689k(this, view, motionEvent);
                    } else if (i == 1) {
                        z = f.mo27351D(this, view, motionEvent);
                    }
                    if (z) {
                        this.f2988u = view;
                    }
                }
                boolean c = fVar.m38686c();
                boolean i3 = fVar.m38680i(this, view);
                if (!i3 || c) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i3 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    f.mo27689k(this, view, motionEvent2);
                } else if (i == 1) {
                    f.mo27351D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: G */
    private void m38738G() {
        this.f2978k.clear();
        this.f2979l.m38662c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C2155f s = m38708s(childAt);
            s.m38685d(this, childAt);
            this.f2979l.m38663b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (s.m38687b(this, childAt, childAt2)) {
                        if (!this.f2979l.m38661d(childAt2)) {
                            this.f2979l.m38663b(childAt2);
                        }
                        this.f2979l.m38664a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2978k.addAll(this.f2979l.m38656i());
        Collections.reverse(this.f2978k);
    }

    /* renamed from: I */
    private static void m38736I(Rect rect) {
        rect.setEmpty();
        f35613I.release(rect);
    }

    /* renamed from: K */
    private void m38734K(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC2152c f = ((C2155f) childAt.getLayoutParams()).m38683f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo27689k(this, childAt, obtain);
                } else {
                    f.mo27351D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C2155f) getChildAt(i2).getLayoutParams()).m38676m();
        }
        this.f2988u = null;
        this.f2985r = false;
    }

    /* renamed from: L */
    private static int m38733L(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: M */
    private static int m38732M(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: N */
    private static int m38731N(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: O */
    private void m38730O(View view, int i) {
        C2155f fVar = (C2155f) view.getLayoutParams();
        int i2 = fVar.f3004i;
        if (i2 != i) {
            C2733w0.m37022a0(view, i - i2);
            fVar.f3004i = i;
        }
    }

    /* renamed from: P */
    private void m38729P(View view, int i) {
        C2155f fVar = (C2155f) view.getLayoutParams();
        int i2 = fVar.f3005j;
        if (i2 != i) {
            C2733w0.m37020b0(view, i - i2);
            fVar.f3005j = i;
        }
    }

    /* renamed from: R */
    private void m38727R() {
        if (C2733w0.m36975y(this)) {
            if (this.f35616C == null) {
                this.f35616C = new C2150a();
            }
            C2733w0.m37058D0(this, this.f35616C);
            setSystemUiVisibility(1280);
            return;
        }
        C2733w0.m37058D0(this, null);
    }

    /* renamed from: a */
    private static Rect m38726a() {
        Rect acquire = f35613I.acquire();
        if (acquire == null) {
            return new Rect();
        }
        return acquire;
    }

    /* renamed from: c */
    private static int m38724c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: d */
    private void m38723d(C2155f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: e */
    private WindowInsetsCompat m38722e(WindowInsetsCompat windowInsetsCompat) {
        AbstractC2152c f;
        if (windowInsetsCompat.m37509r()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C2733w0.m36975y(childAt) && (f = ((C2155f) childAt.getLayoutParams()).m38683f()) != null) {
                windowInsetsCompat = f.m38696f(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.m37509r()) {
                    break;
                }
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: p */
    private void m38711p(View view, int i, Rect rect, Rect rect2, C2155f fVar, int i2, int i3) {
        int i4;
        int i5;
        int b = C2706t.m37125b(m38733L(fVar.f2998c), i);
        int b2 = C2706t.m37125b(m38732M(fVar.f2999d), i);
        int i6 = b & 7;
        int i7 = b & 112;
        int i8 = b2 & 7;
        int i9 = b2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: q */
    private int m38710q(int i) {
        int[] iArr = this.f2987t;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: t */
    private void m38707t(List<View> list) {
        int i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (isChildrenDrawingOrderEnabled) {
                i = getChildDrawingOrder(childCount, i2);
            } else {
                i = i2;
            }
            list.add(getChildAt(i));
        }
        Comparator<View> comparator = f35612H;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: u */
    private boolean m38706u(View view) {
        return this.f2979l.m38655j(view);
    }

    /* renamed from: w */
    private void m38704w(View view, int i) {
        C2155f fVar = (C2155f) view.getLayoutParams();
        Rect a = m38726a();
        a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f2992y != null && C2733w0.m36975y(this) && !C2733w0.m36975y(view)) {
            a.left += this.f2992y.m37514m();
            a.top += this.f2992y.m37512o();
            a.right -= this.f2992y.m37513n();
            a.bottom -= this.f2992y.m37515l();
        }
        Rect a2 = m38726a();
        C2706t.m37126a(m38732M(fVar.f2998c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        m38736I(a);
        m38736I(a2);
    }

    /* renamed from: x */
    private void m38703x(View view, View view2, int i) {
        Rect a = m38726a();
        Rect a2 = m38726a();
        try {
            m38713n(view2, a);
            m38712o(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            m38736I(a);
            m38736I(a2);
        }
    }

    /* renamed from: y */
    private void m38702y(View view, int i, int i2) {
        C2155f fVar = (C2155f) view.getLayoutParams();
        int b = C2706t.m37125b(m38731N(fVar.f2998c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int q = m38710q(i) - measuredWidth;
        if (i3 == 1) {
            q += measuredWidth / 2;
        } else if (i3 == 5) {
            q += measuredWidth;
        }
        int i5 = 0;
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(q, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: z */
    private void m38701z(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C2733w0.m37029U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C2155f fVar = (C2155f) view.getLayoutParams();
            AbstractC2152c f = fVar.m38683f();
            Rect a = m38726a();
            Rect a2 = m38726a();
            a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo28048b(this, view, a)) {
                a.set(a2);
            } else if (!a2.contains(a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a.toShortString() + " | Bounds:" + a2.toShortString());
            }
            m38736I(a2);
            if (a.isEmpty()) {
                m38736I(a);
                return;
            }
            int b = C2706t.m37125b(fVar.f3003h, i);
            boolean z3 = true;
            if ((b & 48) != 48 || (i6 = (a.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f3005j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m38729P(view, i7 - i6);
                z = true;
            }
            if ((b & 80) == 80 && (height = ((getHeight() - a.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f3005j) < (i5 = rect.bottom)) {
                m38729P(view, height - i5);
                z = true;
            }
            if (!z) {
                m38729P(view, 0);
            }
            if ((b & 3) != 3 || (i3 = (a.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f3004i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m38730O(view, i4 - i3);
                z2 = true;
            }
            if ((b & 5) != 5 || (width = ((getWidth() - a.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f3004i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m38730O(view, width - i2);
            }
            if (!z3) {
                m38730O(view, 0);
            }
            m38736I(a);
        }
    }

    /* renamed from: A */
    void m38744A(View view, int i) {
        AbstractC2152c f;
        C2155f fVar = (C2155f) view.getLayoutParams();
        if (fVar.f3006k != null) {
            Rect a = m38726a();
            Rect a2 = m38726a();
            Rect a3 = m38726a();
            m38713n(fVar.f3006k, a);
            boolean z = false;
            m38716k(view, false, a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m38711p(view, i, a, a3, fVar, measuredWidth, measuredHeight);
            if (!(a3.left == a2.left && a3.top == a2.top)) {
                z = true;
            }
            m38723d(fVar, a3, measuredWidth, measuredHeight);
            int i2 = a3.left - a2.left;
            int i3 = a3.top - a2.top;
            if (i2 != 0) {
                C2733w0.m37022a0(view, i2);
            }
            if (i3 != 0) {
                C2733w0.m37020b0(view, i3);
            }
            if (z && (f = fVar.m38683f()) != null) {
                f.mo27376h(this, view, fVar.f3006k);
            }
            m38736I(a);
            m38736I(a2);
            m38736I(a3);
        }
    }

    /* renamed from: B */
    final void m38743B(int i) {
        boolean z;
        int B = C2733w0.m37063B(this);
        int size = this.f2978k.size();
        Rect a = m38726a();
        Rect a2 = m38726a();
        Rect a3 = m38726a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2978k.get(i2);
            C2155f fVar = (C2155f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (fVar.f3007l == this.f2978k.get(i3)) {
                        m38744A(view, B);
                    }
                }
                m38716k(view, true, a2);
                if (fVar.f3002g != 0 && !a2.isEmpty()) {
                    int b = C2706t.m37125b(fVar.f3002g, B);
                    int i4 = b & 112;
                    if (i4 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i4 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i5 = b & 7;
                    if (i5 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i5 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar.f3003h != 0 && view.getVisibility() == 0) {
                    m38701z(view, a, B);
                }
                if (i != 2) {
                    m38709r(view, a3);
                    if (!a3.equals(a2)) {
                        m38737H(view, a2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f2978k.get(i6);
                    C2155f fVar2 = (C2155f) view2.getLayoutParams();
                    AbstractC2152c f = fVar2.m38683f();
                    if (f != null && f.mo27348e(this, view2, view)) {
                        if (i != 0 || !fVar2.m38682g()) {
                            if (i != 2) {
                                z = f.mo27376h(this, view2, view);
                            } else {
                                f.mo28781i(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                fVar2.m38673p(z);
                            }
                        } else {
                            fVar2.m38678k();
                        }
                    }
                }
            }
        }
        m38736I(a);
        m38736I(a2);
        m38736I(a3);
    }

    /* renamed from: C */
    public void m38742C(View view, int i) {
        C2155f fVar = (C2155f) view.getLayoutParams();
        if (!fVar.m38688a()) {
            View view2 = fVar.f3006k;
            if (view2 != null) {
                m38703x(view, view2, i);
                return;
            }
            int i2 = fVar.f3000e;
            if (i2 >= 0) {
                m38702y(view, i2, i);
            } else {
                m38704w(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: D */
    public void m38741D(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: H */
    void m38737H(View view, Rect rect) {
        ((C2155f) view.getLayoutParams()).m38672q(rect);
    }

    /* renamed from: J */
    void m38735J() {
        if (this.f2986s && this.f2990w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2990w);
        }
        this.f2991x = false;
    }

    /* renamed from: Q */
    final WindowInsetsCompat m38728Q(WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        if (C2513d.m37601a(this.f2992y, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.f2992y = windowInsetsCompat;
        boolean z2 = true;
        if (windowInsetsCompat == null || windowInsetsCompat.m37512o() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f2993z = z;
        if (z || getBackground() != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        WindowInsetsCompat e = m38722e(windowInsetsCompat);
        requestLayout();
        return e;
    }

    /* renamed from: b */
    void m38725b() {
        if (this.f2986s) {
            if (this.f2990w == null) {
                this.f2990w = new ViewTreeObserver$OnPreDrawListenerC2156g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2990w);
        }
        this.f2991x = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2155f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        C2155f fVar = (C2155f) view.getLayoutParams();
        AbstractC2152c cVar = fVar.f2996a;
        if (cVar != null) {
            float d = cVar.m38697d(this, view);
            if (d > 0.0f) {
                if (this.f2982o == null) {
                    this.f2982o = new Paint();
                }
                this.f2982o.setColor(fVar.f2996a.m38698c(this, view));
                this.f2982o.setAlpha(m38724c(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f2982o);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f35614A;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void m38721f(View view) {
        List g = this.f2979l.m38658g(view);
        if (!(g == null || g.isEmpty())) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                AbstractC2152c f = ((C2155f) view2.getLayoutParams()).m38683f();
                if (f != null) {
                    f.mo27376h(this, view2, view);
                }
            }
        }
    }

    /* renamed from: g */
    void m38720g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m38706u(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f2991x) {
            return;
        }
        if (z) {
            m38725b();
        } else {
            m38735J();
        }
    }

    final List<View> getDependencySortedChildren() {
        m38738G();
        return Collections.unmodifiableList(this.f2978k);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f2992y;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f35617D.m37531a();
    }

    public Drawable getStatusBarBackground() {
        return this.f35614A;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public C2155f generateDefaultLayoutParams() {
        return new C2155f(-2, -2);
    }

    /* renamed from: i */
    public C2155f generateLayoutParams(AttributeSet attributeSet) {
        return new C2155f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public C2155f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2155f) {
            return new C2155f((C2155f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C2155f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C2155f(layoutParams);
    }

    /* renamed from: k */
    void m38716k(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m38713n(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: l */
    public List<View> m38715l(View view) {
        List<View> h = this.f2979l.m38657h(view);
        this.f2981n.clear();
        if (h != null) {
            this.f2981n.addAll(h);
        }
        return this.f2981n;
    }

    /* renamed from: m */
    public List<View> m38714m(View view) {
        List g = this.f2979l.m38658g(view);
        this.f2981n.clear();
        if (g != null) {
            this.f2981n.addAll(g);
        }
        return this.f2981n;
    }

    /* renamed from: n */
    void m38713n(View view, Rect rect) {
        C2161b.m38653a(this, view, rect);
    }

    /* renamed from: o */
    void m38712o(View view, int i, Rect rect, Rect rect2) {
        C2155f fVar = (C2155f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m38711p(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m38723d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m38734K(false);
        if (this.f2991x) {
            if (this.f2990w == null) {
                this.f2990w = new ViewTreeObserver$OnPreDrawListenerC2156g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2990w);
        }
        if (this.f2992y == null && C2733w0.m36975y(this)) {
            C2733w0.m36996n0(this);
        }
        this.f2986s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m38734K(false);
        if (this.f2991x && this.f2990w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2990w);
        }
        View view = this.f2989v;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2986s = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f2993z && this.f35614A != null) {
            WindowInsetsCompat windowInsetsCompat = this.f2992y;
            if (windowInsetsCompat != null) {
                i = windowInsetsCompat.m37512o();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f35614A.setBounds(0, 0, getWidth(), i);
                this.f35614A.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m38734K(true);
        }
        boolean F = m38739F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m38734K(true);
        }
        return F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC2152c f;
        int B = C2733w0.m37063B(this);
        int size = this.f2978k.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2978k.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C2155f) view.getLayoutParams()).m38683f()) == null || !f.mo27375l(this, view, B))) {
                m38742C(view, B);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.mo28600m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC2152c f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C2155f fVar = (C2155f) childAt.getLayoutParams();
                if (fVar.m38679j(0) && (f3 = fVar.m38683f()) != null) {
                    z2 |= f3.m38695n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m38743B(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC2152c f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C2155f fVar = (C2155f) childAt.getLayoutParams();
                if (fVar.m38679j(0) && (f3 = fVar.m38683f()) != null) {
                    z |= f3.mo28597o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2157h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2157h hVar = (C2157h) parcelable;
        super.onRestoreInstanceState(hVar.m21547a());
        SparseArray<Parcelable> sparseArray = hVar.f3015m;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            AbstractC2152c f = m38708s(childAt).m38683f();
            if (!(id2 == -1 || f == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                f.mo28585x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable y;
        C2157h hVar = new C2157h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            AbstractC2152c f = ((C2155f) childAt.getLayoutParams()).m38683f();
            if (!(id2 == -1 || f == null || (y = f.mo28583y(this, childAt)) == null)) {
                sparseArray.append(id2, y);
            }
        }
        hVar.f3015m = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2988u
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m38739F(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f2988u
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C2155f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m38683f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2988u
            boolean r6 = r6.mo27351D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = r5
        L_0x002c:
            android.view.View r7 = r0.f2988u
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m38734K(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    void m38709r(View view, Rect rect) {
        rect.set(((C2155f) view.getLayoutParams()).m38681h());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC2152c f = ((C2155f) view.getLayoutParams()).m38683f();
        if (f == null || !f.mo28780w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2985r) {
            m38734K(false);
            this.f2985r = true;
        }
    }

    /* renamed from: s */
    C2155f m38708s(View view) {
        C2155f fVar = (C2155f) view.getLayoutParams();
        if (!fVar.f2997b) {
            if (view instanceof AbstractC2151b) {
                AbstractC2152c behavior = ((AbstractC2151b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.m38674o(behavior);
                fVar.f2997b = true;
            } else {
                AbstractC2153d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (AbstractC2153d) cls.getAnnotation(AbstractC2153d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.m38674o((AbstractC2152c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                fVar.f2997b = true;
            }
        }
        return fVar;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m38727R();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f35615B = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f35614A;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f35614A = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f35614A.setState(getDrawableState());
                }
                C2400a.m37830m(this.f35614A, C2733w0.m37063B(this));
                Drawable drawable4 = this.f35614A;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f35614A.setCallback(this);
            }
            C2733w0.m37008h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C2337a.m38133e(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f35614A;
        if (drawable != null && drawable.isVisible() != z) {
            this.f35614A.setVisible(z, false);
        }
    }

    /* renamed from: v */
    public boolean m38705v(View view, int i, int i2) {
        Rect a = m38726a();
        m38713n(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m38736I(a);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f35614A;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14514a.f32912a);
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC2152c f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C2155f fVar = (C2155f) childAt.getLayoutParams();
                if (fVar.m38679j(i3) && (f = fVar.m38683f()) != null) {
                    int[] iArr2 = this.f2983p;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo28594q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2983p;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f2983p;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m38743B(1);
        }
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f2984q);
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        AbstractC2152c f;
        this.f35617D.m37529c(view, view2, i, i2);
        this.f2989v = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C2155f fVar = (C2155f) childAt.getLayoutParams();
            if (fVar.m38679j(i2) && (f = fVar.m38683f()) != null) {
                f.m38690v(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // androidx.core.view.AbstractC2684p0
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C2155f fVar = (C2155f) childAt.getLayoutParams();
                AbstractC2152c f = fVar.m38683f();
                if (f != null) {
                    boolean A = f.mo28651A(this, childAt, view, view2, i, i2);
                    z |= A;
                    fVar.m38671r(i2, A);
                } else {
                    fVar.m38671r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.AbstractC2684p0
    public void onStopNestedScroll(View view, int i) {
        this.f35617D.m37527e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C2155f fVar = (C2155f) childAt.getLayoutParams();
            if (fVar.m38679j(i)) {
                AbstractC2152c f = fVar.m38683f();
                if (f != null) {
                    f.mo28648C(this, childAt, view, i);
                }
                fVar.m38677l(i);
                fVar.m38678k();
            }
        }
        this.f2989v = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f2978k = new ArrayList();
        this.f2979l = new C2160a<>();
        this.f2980m = new ArrayList();
        this.f2981n = new ArrayList();
        this.f2983p = new int[2];
        this.f2984q = new int[2];
        this.f35617D = new NestedScrollingParentHelper(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C14516c.f32915b, 0, C14515b.f32913a);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C14516c.f32915b, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C14516c.f32915b, attributeSet, typedArray, 0, C14515b.f32913a);
            } else {
                saveAttributeDataForStyleable(context, C14516c.f32915b, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C14516c.f32916c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2987t = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2987t.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f2987t;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f35614A = typedArray.getDrawable(C14516c.f32917d);
        typedArray.recycle();
        m38727R();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC2154e());
        if (C2733w0.m36973z(this) == 0) {
            C2733w0.m37064A0(this, 1);
        }
    }

    @Override // androidx.core.view.AbstractC2689q0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC2152c f;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C2155f fVar = (C2155f) childAt.getLayoutParams();
                if (fVar.m38679j(i5) && (f = fVar.m38683f()) != null) {
                    int[] iArr2 = this.f2983p;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo28590t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f2983p;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        i7 = Math.max(i7, this.f2983p[1]);
                    } else {
                        z = true;
                        i7 = Math.min(i7, this.f2983p[1]);
                    }
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            m38743B(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    public static class C2157h extends AbstractC7736a {
        public static final Parcelable.Creator<C2157h> CREATOR = new C2158a();

        /* renamed from: m */
        SparseArray<Parcelable> f3015m;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        /* loaded from: classes.dex */
        static class C2158a implements Parcelable.ClassLoaderCreator<C2157h> {
            C2158a() {
            }

            /* renamed from: a */
            public C2157h createFromParcel(Parcel parcel) {
                return new C2157h(parcel, null);
            }

            /* renamed from: b */
            public C2157h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2157h(parcel, classLoader);
            }

            /* renamed from: c */
            public C2157h[] newArray(int i) {
                return new C2157h[i];
            }
        }

        public C2157h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3015m = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3015m.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // p125h1.AbstractC7736a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f3015m;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f3015m.keyAt(i3);
                parcelableArr[i3] = this.f3015m.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public C2157h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public static class C2155f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC2152c f2996a;

        /* renamed from: b */
        boolean f2997b;

        /* renamed from: c */
        public int f2998c;

        /* renamed from: d */
        public int f2999d;

        /* renamed from: e */
        public int f3000e;

        /* renamed from: f */
        int f3001f;

        /* renamed from: g */
        public int f3002g;

        /* renamed from: h */
        public int f3003h;

        /* renamed from: i */
        int f3004i;

        /* renamed from: j */
        int f3005j;

        /* renamed from: k */
        View f3006k;

        /* renamed from: l */
        View f3007l;

        /* renamed from: m */
        private boolean f3008m;

        /* renamed from: n */
        private boolean f3009n;

        /* renamed from: o */
        private boolean f3010o;

        /* renamed from: p */
        private boolean f3011p;

        /* renamed from: q */
        final Rect f3012q;

        /* renamed from: r */
        Object f3013r;

        public C2155f(int i, int i2) {
            super(i, i2);
            this.f2997b = false;
            this.f2998c = 0;
            this.f2999d = 0;
            this.f3000e = -1;
            this.f3001f = -1;
            this.f3002g = 0;
            this.f3003h = 0;
            this.f3012q = new Rect();
        }

        /* renamed from: n */
        private void m38675n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3001f);
            this.f3006k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f3007l = null;
                            this.f3006k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f3007l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f3007l = null;
                    this.f3006k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f3007l = null;
                this.f3006k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3001f) + " to anchor view " + view);
            }
        }

        /* renamed from: s */
        private boolean m38670s(View view, int i) {
            int b = C2706t.m37125b(((C2155f) view.getLayoutParams()).f3002g, i);
            if (b == 0 || (C2706t.m37125b(this.f3003h, i) & b) != b) {
                return false;
            }
            return true;
        }

        /* renamed from: t */
        private boolean m38669t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3006k.getId() != this.f3001f) {
                return false;
            }
            View view2 = this.f3006k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3007l = null;
                    this.f3006k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f3007l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m38688a() {
            return this.f3006k == null && this.f3001f != -1;
        }

        /* renamed from: b */
        boolean m38687b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC2152c cVar;
            if (view2 == this.f3007l || m38670s(view2, C2733w0.m37063B(coordinatorLayout)) || ((cVar = this.f2996a) != null && cVar.mo27348e(coordinatorLayout, view, view2))) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        boolean m38686c() {
            if (this.f2996a == null) {
                this.f3008m = false;
            }
            return this.f3008m;
        }

        /* renamed from: d */
        View m38685d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3001f == -1) {
                this.f3007l = null;
                this.f3006k = null;
                return null;
            }
            if (this.f3006k == null || !m38669t(view, coordinatorLayout)) {
                m38675n(view, coordinatorLayout);
            }
            return this.f3006k;
        }

        /* renamed from: e */
        public int m38684e() {
            return this.f3001f;
        }

        /* renamed from: f */
        public AbstractC2152c m38683f() {
            return this.f2996a;
        }

        /* renamed from: g */
        boolean m38682g() {
            return this.f3011p;
        }

        /* renamed from: h */
        Rect m38681h() {
            return this.f3012q;
        }

        /* renamed from: i */
        boolean m38680i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.f3008m;
            if (z2) {
                return true;
            }
            AbstractC2152c cVar = this.f2996a;
            if (cVar != null) {
                z = cVar.m38699a(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.f3008m = z3;
            return z3;
        }

        /* renamed from: j */
        boolean m38679j(int i) {
            if (i == 0) {
                return this.f3009n;
            }
            if (i != 1) {
                return false;
            }
            return this.f3010o;
        }

        /* renamed from: k */
        void m38678k() {
            this.f3011p = false;
        }

        /* renamed from: l */
        void m38677l(int i) {
            m38671r(i, false);
        }

        /* renamed from: m */
        void m38676m() {
            this.f3008m = false;
        }

        /* renamed from: o */
        public void m38674o(AbstractC2152c cVar) {
            AbstractC2152c cVar2 = this.f2996a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo28604j();
                }
                this.f2996a = cVar;
                this.f3013r = null;
                this.f2997b = true;
                if (cVar != null) {
                    cVar.mo27352g(this);
                }
            }
        }

        /* renamed from: p */
        void m38673p(boolean z) {
            this.f3011p = z;
        }

        /* renamed from: q */
        void m38672q(Rect rect) {
            this.f3012q.set(rect);
        }

        /* renamed from: r */
        void m38671r(int i, boolean z) {
            if (i == 0) {
                this.f3009n = z;
            } else if (i == 1) {
                this.f3010o = z;
            }
        }

        C2155f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2997b = false;
            this.f2998c = 0;
            this.f2999d = 0;
            this.f3000e = -1;
            this.f3001f = -1;
            this.f3002g = 0;
            this.f3003h = 0;
            this.f3012q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14516c.f32918e);
            this.f2998c = obtainStyledAttributes.getInteger(C14516c.f32919f, 0);
            this.f3001f = obtainStyledAttributes.getResourceId(C14516c.f32920g, -1);
            this.f2999d = obtainStyledAttributes.getInteger(C14516c.f32921h, 0);
            this.f3000e = obtainStyledAttributes.getInteger(C14516c.f32925l, -1);
            this.f3002g = obtainStyledAttributes.getInt(C14516c.f32924k, 0);
            this.f3003h = obtainStyledAttributes.getInt(C14516c.f32923j, 0);
            int i = C14516c.f32922i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f2997b = hasValue;
            if (hasValue) {
                this.f2996a = CoordinatorLayout.m38740E(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            AbstractC2152c cVar = this.f2996a;
            if (cVar != null) {
                cVar.mo27352g(this);
            }
        }

        public C2155f(C2155f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f2997b = false;
            this.f2998c = 0;
            this.f2999d = 0;
            this.f3000e = -1;
            this.f3001f = -1;
            this.f3002g = 0;
            this.f3003h = 0;
            this.f3012q = new Rect();
        }

        public C2155f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2997b = false;
            this.f2998c = 0;
            this.f2999d = 0;
            this.f3000e = -1;
            this.f3001f = -1;
            this.f3002g = 0;
            this.f3003h = 0;
            this.f3012q = new Rect();
        }

        public C2155f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2997b = false;
            this.f2998c = 0;
            this.f2999d = 0;
            this.f3000e = -1;
            this.f3001f = -1;
            this.f3002g = 0;
            this.f3003h = 0;
            this.f3012q = new Rect();
        }
    }
}
