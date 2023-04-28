package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.internal.C5665o;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p054d1.C6391a;
import p083eb.C6803b;
import p083eb.C6805d;
import p083eb.C6810i;
import p083eb.C6811j;
import p083eb.C6812k;
import p125h1.AbstractC7736a;
import p366ub.C13242c;
import p422xb.C14038g;
import p422xb.C14045k;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC2152c<V> {

    /* renamed from: d0 */
    private static final int f10570d0 = C6811j.f14659e;

    /* renamed from: A */
    private ValueAnimator f37403A;

    /* renamed from: B */
    int f37404B;

    /* renamed from: C */
    int f37405C;

    /* renamed from: D */
    int f37406D;

    /* renamed from: E */
    float f37407E;

    /* renamed from: F */
    int f37408F;

    /* renamed from: G */
    float f37409G;

    /* renamed from: H */
    boolean f37410H;

    /* renamed from: I */
    private boolean f37411I;

    /* renamed from: J */
    private boolean f37412J;

    /* renamed from: K */
    int f37413K;

    /* renamed from: L */
    int f37414L;

    /* renamed from: M */
    ViewDragHelper f37415M;

    /* renamed from: N */
    private boolean f37416N;

    /* renamed from: O */
    private int f37417O;

    /* renamed from: P */
    private boolean f37418P;

    /* renamed from: Q */
    private int f37419Q;

    /* renamed from: R */
    int f37420R;

    /* renamed from: S */
    int f37421S;

    /* renamed from: T */
    WeakReference<V> f37422T;

    /* renamed from: U */
    WeakReference<View> f37423U;

    /* renamed from: V */
    private final ArrayList<AbstractC5537f> f37424V;

    /* renamed from: W */
    private VelocityTracker f37425W;

    /* renamed from: X */
    int f37426X;

    /* renamed from: Y */
    private int f37427Y;

    /* renamed from: Z */
    boolean f37428Z;

    /* renamed from: a */
    private int f10571a;

    /* renamed from: a0 */
    private Map<View, Integer> f10572a0;

    /* renamed from: b */
    private boolean f10573b;

    /* renamed from: b0 */
    private int f10574b0;

    /* renamed from: c */
    private boolean f10575c;

    /* renamed from: c0 */
    private final ViewDragHelper.AbstractC2820c f10576c0;

    /* renamed from: d */
    private float f10577d;

    /* renamed from: e */
    private int f10578e;

    /* renamed from: f */
    private boolean f10579f;

    /* renamed from: g */
    private int f10580g;

    /* renamed from: h */
    private int f10581h;

    /* renamed from: i */
    private C14038g f10582i;

    /* renamed from: j */
    private ColorStateList f10583j;

    /* renamed from: k */
    private int f10584k;

    /* renamed from: l */
    private int f10585l;

    /* renamed from: m */
    private int f10586m;

    /* renamed from: n */
    private boolean f10587n;

    /* renamed from: o */
    private boolean f10588o;

    /* renamed from: p */
    private boolean f10589p;

    /* renamed from: q */
    private boolean f10590q;

    /* renamed from: r */
    private boolean f10591r;

    /* renamed from: s */
    private boolean f10592s;

    /* renamed from: t */
    private boolean f10593t;

    /* renamed from: u */
    private boolean f10594u;

    /* renamed from: v */
    private int f10595v;

    /* renamed from: w */
    private int f10596w;

    /* renamed from: x */
    private C14045k f10597x;

    /* renamed from: y */
    private boolean f10598y;

    /* renamed from: z */
    private final BottomSheetBehavior<V>.C5540h f10599z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes3.dex */
    public class RunnableC5532a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ View f10600k;

        /* renamed from: l */
        final /* synthetic */ int f10601l;

        RunnableC5532a(View view, int i) {
            this.f10600k = view;
            this.f10601l = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m28634J0(this.f10600k, this.f10601l, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes3.dex */
    public class C5533b implements ValueAnimator.AnimatorUpdateListener {
        C5533b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f10582i != null) {
                BottomSheetBehavior.this.f10582i.m1980Z(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes3.dex */
    public class C5534c implements C5665o.AbstractC5669d {

        /* renamed from: a */
        final /* synthetic */ boolean f10604a;

        C5534c(boolean z) {
            this.f10604a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        @Override // com.google.android.material.internal.C5665o.AbstractC5669d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.core.view.WindowInsetsCompat mo27822a(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, com.google.android.material.internal.C5665o.C5670e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.WindowInsetsCompat.C2542m.m37455g()
                androidx.core.graphics.Insets r0 = r12.m37521f(r0)
                int r1 = androidx.core.view.WindowInsetsCompat.C2542m.m37458d()
                androidx.core.graphics.Insets r1 = r12.m37521f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f3327b
                com.google.android.material.bottomsheet.BottomSheetBehavior.m28627N(r2, r3)
                boolean r2 = com.google.android.material.internal.C5665o.m27826e(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m28625O(r6)
                if (r6 == 0) goto L_0x0041
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.m37515l()
                com.google.android.material.bottomsheet.BottomSheetBehavior.m28623Q(r3, r6)
                int r3 = r13.f11072d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m28624P(r6)
                int r3 = r3 + r6
            L_0x0041:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m28622R(r6)
                if (r6 == 0) goto L_0x0053
                if (r2 == 0) goto L_0x004e
                int r4 = r13.f11071c
                goto L_0x0050
            L_0x004e:
                int r4 = r13.f11069a
            L_0x0050:
                int r6 = r0.f3326a
                int r4 = r4 + r6
            L_0x0053:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m28621S(r6)
                if (r6 == 0) goto L_0x0066
                if (r2 == 0) goto L_0x0060
                int r13 = r13.f11069a
                goto L_0x0062
            L_0x0060:
                int r13 = r13.f11071c
            L_0x0062:
                int r2 = r0.f3328c
                int r5 = r13 + r2
            L_0x0066:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.m28620T(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L_0x0080
                int r2 = r13.leftMargin
                int r8 = r0.f3326a
                if (r2 == r8) goto L_0x0080
                r13.leftMargin = r8
                r2 = r7
                goto L_0x0081
            L_0x0080:
                r2 = r6
            L_0x0081:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.m28619U(r8)
                if (r8 == 0) goto L_0x0092
                int r8 = r13.rightMargin
                int r9 = r0.f3328c
                if (r8 == r9) goto L_0x0092
                r13.rightMargin = r9
                r2 = r7
            L_0x0092:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.m28643F(r8)
                if (r8 == 0) goto L_0x00a3
                int r8 = r13.topMargin
                int r0 = r0.f3327b
                if (r8 == r0) goto L_0x00a3
                r13.topMargin = r0
                goto L_0x00a4
            L_0x00a3:
                r7 = r2
            L_0x00a4:
                if (r7 == 0) goto L_0x00a9
                r11.setLayoutParams(r13)
            L_0x00a9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f10604a
                if (r11 == 0) goto L_0x00bb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f3329d
                com.google.android.material.bottomsheet.BottomSheetBehavior.m28641G(r11, r13)
            L_0x00bb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.m28625O(r11)
                if (r11 != 0) goto L_0x00c7
                boolean r11 = r10.f10604a
                if (r11 == 0) goto L_0x00cc
            L_0x00c7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.m28639H(r11, r6)
            L_0x00cc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C5534c.mo27822a(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.o$e):androidx.core.view.WindowInsetsCompat");
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes3.dex */
    class C5535d extends ViewDragHelper.AbstractC2820c {

        /* renamed from: a */
        private long f10606a;

        C5535d() {
        }

        /* renamed from: n */
        private boolean m28573n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f37421S + bottomSheetBehavior.m28608f0()) / 2;
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: a */
        public int mo28580a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: b */
        public int mo28579b(View view, int i, int i2) {
            int i3;
            int f0 = BottomSheetBehavior.this.m28608f0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f37410H) {
                i3 = bottomSheetBehavior.f37421S;
            } else {
                i3 = bottomSheetBehavior.f37408F;
            }
            return C6391a.m25632b(i, f0, i3);
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: e */
        public int mo28578e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f37410H) {
                return bottomSheetBehavior.f37421S;
            }
            return bottomSheetBehavior.f37408F;
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: j */
        public void mo28577j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f37412J) {
                BottomSheetBehavior.this.m28647C0(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: k */
        public void mo28576k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m28611c0(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r7.f10607b.m28644E0(r0, (r9 * 100.0f) / r10.f37421S) != false) goto L_0x0010;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
            if (r9 > r7.f10607b.f37406D) goto L_0x0124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f10607b.m28608f0()) < java.lang.Math.abs(r8.getTop() - r7.f10607b.f37406D)) goto L_0x0010;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
            if (r7.f10607b.m28638H0() == false) goto L_0x0124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
            if (java.lang.Math.abs(r9 - r7.f10607b.f37405C) < java.lang.Math.abs(r9 - r7.f10607b.f37408F)) goto L_0x0010;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
            if (r7.f10607b.m28638H0() != false) goto L_0x00a7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
            if (r7.f10607b.m28638H0() == false) goto L_0x0124;
         */
        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo28575l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C5535d.mo28575l(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC2820c
        /* renamed from: m */
        public boolean mo28574m(View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f37413K;
            if (i2 == 1 || bottomSheetBehavior.f37428Z) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f37426X == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f37423U;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f10606a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f37422T;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes3.dex */
    public class C5536e implements AccessibilityViewCommand {

        /* renamed from: a */
        final /* synthetic */ int f10608a;

        C5536e(int i) {
            this.f10608a = i;
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        /* renamed from: a */
        public boolean mo28572a(View view, AccessibilityViewCommand.AbstractC2563a aVar) {
            BottomSheetBehavior.this.m28649B0(this.f10608a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC5537f {
        /* renamed from: a */
        void m28571a(View view) {
        }

        /* renamed from: b */
        public abstract void m28570b(View view, float f);

        /* renamed from: c */
        public abstract void m28569c(View view, int i);
    }

    public BottomSheetBehavior() {
        this.f10571a = 0;
        this.f10573b = true;
        this.f10575c = false;
        this.f10584k = -1;
        this.f10585l = -1;
        this.f10599z = new C5540h(this, null);
        this.f37407E = 0.5f;
        this.f37409G = -1.0f;
        this.f37412J = true;
        this.f37413K = 4;
        this.f37414L = 4;
        this.f37424V = new ArrayList<>();
        this.f10574b0 = -1;
        this.f10576c0 = new C5535d();
    }

    /* renamed from: D0 */
    private void m28646D0(View view) {
        boolean z;
        if (Build.VERSION.SDK_INT < 29 || m28605i0() || this.f10579f) {
            z = false;
        } else {
            z = true;
        }
        if (this.f10588o || this.f10589p || this.f10590q || this.f10592s || this.f10593t || this.f10594u || z) {
            C5665o.m27830a(view, new C5534c(z));
        }
    }

    /* renamed from: F0 */
    private boolean m28642F0() {
        return this.f37415M != null && (this.f37412J || this.f37413K == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public void m28634J0(View view, int i, boolean z) {
        boolean z2;
        int g0 = m28607g0(i);
        ViewDragHelper viewDragHelper = this.f37415M;
        if (viewDragHelper == null || (!z ? !viewDragHelper.m36596Q(view, view.getLeft(), g0) : !viewDragHelper.m36598O(view.getLeft(), g0))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            m28647C0(2);
            m28630L0(i);
            this.f10599z.m28563c(i);
            return;
        }
        m28647C0(i);
    }

    /* renamed from: K0 */
    private void m28632K0() {
        V v;
        WeakReference<V> weakReference = this.f37422T;
        if (weakReference != null && (v = weakReference.get()) != null) {
            C2733w0.m37002k0(v, 524288);
            C2733w0.m37002k0(v, 262144);
            C2733w0.m37002k0(v, 1048576);
            int i = this.f10574b0;
            if (i != -1) {
                C2733w0.m37002k0(v, i);
            }
            int i2 = 6;
            if (!this.f10573b && this.f37413K != 6) {
                this.f10574b0 = m28618V(v, C6810i.f14639a, 6);
            }
            if (this.f37410H && this.f37413K != 5) {
                m28601l0(v, AccessibilityNodeInfoCompat.C2556a.f3577y, 5);
            }
            int i3 = this.f37413K;
            if (i3 == 3) {
                if (this.f10573b) {
                    i2 = 4;
                }
                m28601l0(v, AccessibilityNodeInfoCompat.C2556a.f3576x, i2);
            } else if (i3 == 4) {
                if (this.f10573b) {
                    i2 = 3;
                }
                m28601l0(v, AccessibilityNodeInfoCompat.C2556a.f3575w, i2);
            } else if (i3 == 6) {
                m28601l0(v, AccessibilityNodeInfoCompat.C2556a.f3576x, 4);
                m28601l0(v, AccessibilityNodeInfoCompat.C2556a.f3575w, 3);
            }
        }
    }

    /* renamed from: L0 */
    private void m28630L0(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i != 2) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (this.f10598y != z) {
                this.f10598y = z;
                if (this.f10582i != null && (valueAnimator = this.f37403A) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f37403A.reverse();
                        return;
                    }
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    this.f37403A.setFloatValues(1.0f - f, f);
                    this.f37403A.start();
                }
            }
        }
    }

    /* renamed from: M0 */
    private void m28628M0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f37422T;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f10572a0 == null) {
                        this.f10572a0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f37422T.get()) {
                        if (z) {
                            this.f10572a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f10575c) {
                                C2733w0.m37064A0(childAt, 4);
                            }
                        } else if (this.f10575c && (map = this.f10572a0) != null && map.containsKey(childAt)) {
                            C2733w0.m37064A0(childAt, this.f10572a0.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f10572a0 = null;
                } else if (this.f10575c) {
                    this.f37422T.get().sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public void m28626N0(boolean z) {
        V v;
        if (this.f37422T != null) {
            m28617W();
            if (this.f37413K == 4 && (v = this.f37422T.get()) != null) {
                if (z) {
                    m28649B0(4);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    /* renamed from: V */
    private int m28618V(V v, int i, int i2) {
        return C2733w0.m37019c(v, v.getResources().getString(i), m28614Z(i2));
    }

    /* renamed from: W */
    private void m28617W() {
        int Y = m28615Y();
        if (this.f10573b) {
            this.f37408F = Math.max(this.f37421S - Y, this.f37405C);
        } else {
            this.f37408F = this.f37421S - Y;
        }
    }

    /* renamed from: X */
    private void m28616X() {
        this.f37406D = (int) (this.f37421S * (1.0f - this.f37407E));
    }

    /* renamed from: Y */
    private int m28615Y() {
        int i;
        if (this.f10579f) {
            return Math.min(Math.max(this.f10580g, this.f37421S - ((this.f37420R * 9) / 16)), this.f37419Q) + this.f10595v;
        }
        if (this.f10587n || this.f10588o || (i = this.f10586m) <= 0) {
            return this.f10578e + this.f10595v;
        }
        return Math.max(this.f10578e, i + this.f10581h);
    }

    /* renamed from: Z */
    private AccessibilityViewCommand m28614Z(int i) {
        return new C5536e(i);
    }

    /* renamed from: a0 */
    private void m28613a0(Context context) {
        if (this.f10597x != null) {
            C14038g gVar = new C14038g(this.f10597x);
            this.f10582i = gVar;
            gVar.m1991O(context);
            ColorStateList colorStateList = this.f10583j;
            if (colorStateList != null) {
                this.f10582i.m1981Y(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f10582i.setTint(typedValue.data);
        }
    }

    /* renamed from: b0 */
    private void m28612b0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f37403A = ofFloat;
        ofFloat.setDuration(500L);
        this.f37403A.addUpdateListener(new C5533b());
    }

    /* renamed from: e0 */
    private int m28609e0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* renamed from: g0 */
    private int m28607g0(int i) {
        if (i == 3) {
            return m28608f0();
        }
        if (i == 4) {
            return this.f37408F;
        }
        if (i == 5) {
            return this.f37421S;
        }
        if (i == 6) {
            return this.f37406D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    /* renamed from: h0 */
    private float m28606h0() {
        VelocityTracker velocityTracker = this.f37425W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f10577d);
        return this.f37425W.getYVelocity(this.f37426X);
    }

    /* renamed from: j0 */
    private boolean m28603j0(V v) {
        ViewParent parent = v.getParent();
        if (parent == null || !parent.isLayoutRequested() || !C2733w0.m37030T(v)) {
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    private void m28601l0(V v, AccessibilityNodeInfoCompat.C2556a aVar, int i) {
        C2733w0.m36998m0(v, aVar, null, m28614Z(i));
    }

    /* renamed from: m0 */
    private void m28599m0() {
        this.f37426X = -1;
        VelocityTracker velocityTracker = this.f37425W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37425W = null;
        }
    }

    /* renamed from: n0 */
    private void m28598n0(C5538g gVar) {
        int i = this.f10571a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f10578e = gVar.f10611n;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f10573b = gVar.f10612o;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f37410H = gVar.f10613p;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f37411I = gVar.f10614q;
            }
        }
    }

    /* renamed from: o0 */
    private void m28596o0(V v, Runnable runnable) {
        if (m28603j0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: A */
    public boolean mo28651A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f37417O = 0;
        this.f37418P = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public void m28650A0(boolean z) {
        this.f37411I = z;
    }

    /* renamed from: B0 */
    public void m28649B0(int i) {
        String str;
        int i2;
        if (i == 1 || i == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            if (i == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            sb2.append(str);
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        } else if (this.f37410H || i != 5) {
            if (i != 6 || !this.f10573b || m28607g0(i) > this.f37405C) {
                i2 = i;
            } else {
                i2 = 3;
            }
            WeakReference<V> weakReference = this.f37422T;
            if (weakReference == null || weakReference.get() == null) {
                m28647C0(i);
                return;
            }
            V v = this.f37422T.get();
            m28596o0(v, new RunnableC5532a(v, i2));
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r4.getTop() <= r2.f37406D) goto L_0x00aa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f37405C) < java.lang.Math.abs(r3 - r2.f37408F)) goto L_0x00aa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
        if (m28638H0() != false) goto L_0x0092;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f37408F)) goto L_0x00a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f37406D) < java.lang.Math.abs(r3 - r2.f37408F)) goto L_0x00a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo28648C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m28608f0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.m28647C0(r0)
            return
        L_0x000f:
            boolean r3 = r2.m28602k0()
            if (r3 == 0) goto L_0x0024
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f37423U
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x0023
            boolean r3 = r2.f37418P
            if (r3 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            int r3 = r2.f37417O
            r5 = 6
            if (r3 <= 0) goto L_0x0039
            boolean r3 = r2.f10573b
            if (r3 == 0) goto L_0x002f
            goto L_0x00aa
        L_0x002f:
            int r3 = r4.getTop()
            int r6 = r2.f37406D
            if (r3 <= r6) goto L_0x00aa
            goto L_0x00a9
        L_0x0039:
            boolean r3 = r2.f37410H
            if (r3 == 0) goto L_0x0049
            float r3 = r2.m28606h0()
            boolean r3 = r2.m28640G0(r4, r3)
            if (r3 == 0) goto L_0x0049
            r0 = 5
            goto L_0x00aa
        L_0x0049:
            int r3 = r2.f37417O
            r6 = 4
            if (r3 != 0) goto L_0x008e
            int r3 = r4.getTop()
            boolean r1 = r2.f10573b
            if (r1 == 0) goto L_0x0068
            int r5 = r2.f37405C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f37408F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0092
            goto L_0x00aa
        L_0x0068:
            int r1 = r2.f37406D
            if (r3 >= r1) goto L_0x007e
            int r1 = r2.f37408F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0077
            goto L_0x00aa
        L_0x0077:
            boolean r3 = r2.m28638H0()
            if (r3 == 0) goto L_0x00a9
            goto L_0x0092
        L_0x007e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f37408F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r2.f10573b
            if (r3 == 0) goto L_0x0094
        L_0x0092:
            r0 = r6
            goto L_0x00aa
        L_0x0094:
            int r3 = r4.getTop()
            int r0 = r2.f37406D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f37408F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
        L_0x00a9:
            r0 = r5
        L_0x00aa:
            r3 = 0
            r2.m28634J0(r4, r0, r3)
            r2.f37418P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo28648C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: C0 */
    void m28647C0(int i) {
        V v;
        if (this.f37413K != i) {
            this.f37413K = i;
            if (i == 4 || i == 3 || i == 6 || (this.f37410H && i == 5)) {
                this.f37414L = i;
            }
            WeakReference<V> weakReference = this.f37422T;
            if (!(weakReference == null || (v = weakReference.get()) == null)) {
                if (i == 3) {
                    m28628M0(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m28628M0(false);
                }
                m28630L0(i);
                for (int i2 = 0; i2 < this.f37424V.size(); i2++) {
                    this.f37424V.get(i2).m28569c(v, i);
                }
                m28632K0();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: D */
    public boolean mo27351D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f37413K == 1 && actionMasked == 0) {
            return true;
        }
        if (m28642F0()) {
            this.f37415M.m36607F(motionEvent);
        }
        if (actionMasked == 0) {
            m28599m0();
        }
        if (this.f37425W == null) {
            this.f37425W = VelocityTracker.obtain();
        }
        this.f37425W.addMovement(motionEvent);
        if (m28642F0() && actionMasked == 2 && !this.f37416N && Math.abs(this.f37427Y - motionEvent.getY()) > this.f37415M.m36569z()) {
            this.f37415M.m36593b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f37416N;
    }

    /* renamed from: E0 */
    public boolean m28644E0(long j, float f) {
        return false;
    }

    /* renamed from: G0 */
    boolean m28640G0(View view, float f) {
        if (this.f37411I) {
            return true;
        }
        if (view.getTop() < this.f37408F) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * 0.1f)) - this.f37408F) / m28615Y() > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: H0 */
    public boolean m28638H0() {
        return false;
    }

    /* renamed from: I0 */
    public boolean m28636I0() {
        return true;
    }

    /* renamed from: c0 */
    void m28611c0(int i) {
        float f;
        float f2;
        V v = this.f37422T.get();
        if (!(v == null || this.f37424V.isEmpty())) {
            int i2 = this.f37408F;
            if (i > i2 || i2 == m28608f0()) {
                int i3 = this.f37408F;
                f = i3 - i;
                f2 = this.f37421S - i3;
            } else {
                int i4 = this.f37408F;
                f = i4 - i;
                f2 = i4 - m28608f0();
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f37424V.size(); i5++) {
                this.f37424V.get(i5).m28570b(v, f3);
            }
        }
    }

    /* renamed from: d0 */
    View m28610d0(View view) {
        if (C2733w0.m37028V(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View d0 = m28610d0(viewGroup.getChildAt(i));
            if (d0 != null) {
                return d0;
            }
        }
        return null;
    }

    /* renamed from: f0 */
    public int m28608f0() {
        int i;
        if (this.f10573b) {
            return this.f37405C;
        }
        int i2 = this.f37404B;
        if (this.f10591r) {
            i = 0;
        } else {
            i = this.f10596w;
        }
        return Math.max(i2, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: g */
    public void mo27352g(CoordinatorLayout.C2155f fVar) {
        super.mo27352g(fVar);
        this.f37422T = null;
        this.f37415M = null;
    }

    /* renamed from: i0 */
    public boolean m28605i0() {
        return this.f10587n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: j */
    public void mo28604j() {
        super.mo28604j();
        this.f37422T = null;
        this.f37415M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: k */
    public boolean mo27689k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        boolean z;
        View view;
        if (!v.isShown() || !this.f37412J) {
            this.f37416N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m28599m0();
        }
        if (this.f37425W == null) {
            this.f37425W = VelocityTracker.obtain();
        }
        this.f37425W.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f37427Y = (int) motionEvent.getY();
            if (this.f37413K != 2) {
                WeakReference<View> weakReference = this.f37423U;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && coordinatorLayout.m38705v(view, x, this.f37427Y)) {
                    this.f37426X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f37428Z = true;
                }
            }
            if (this.f37426X != -1 || coordinatorLayout.m38705v(v, x, this.f37427Y)) {
                z = false;
            } else {
                z = true;
            }
            this.f37416N = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f37428Z = false;
            this.f37426X = -1;
            if (this.f37416N) {
                this.f37416N = false;
                return false;
            }
        }
        if (!this.f37416N && (viewDragHelper = this.f37415M) != null && viewDragHelper.m36597P(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f37423U;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.f37416N || this.f37413K == 1 || coordinatorLayout.m38705v(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f37415M == null || Math.abs(this.f37427Y - motionEvent.getY()) <= this.f37415M.m36569z()) {
            return false;
        }
        return true;
    }

    /* renamed from: k0 */
    public boolean m28602k0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: l */
    public boolean mo27375l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean z;
        float f;
        if (C2733w0.m36975y(coordinatorLayout) && !C2733w0.m36975y(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f37422T == null) {
            this.f10580g = coordinatorLayout.getResources().getDimensionPixelSize(C6805d.f14560b);
            m28646D0(v);
            this.f37422T = new WeakReference<>(v);
            C14038g gVar = this.f10582i;
            if (gVar != null) {
                C2733w0.m36982u0(v, gVar);
                C14038g gVar2 = this.f10582i;
                float f2 = this.f37409G;
                if (f2 == -1.0f) {
                    f2 = C2733w0.m36979w(v);
                }
                gVar2.m1982X(f2);
                if (this.f37413K == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.f10598y = z;
                C14038g gVar3 = this.f10582i;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                gVar3.m1980Z(f);
            } else {
                ColorStateList colorStateList = this.f10583j;
                if (colorStateList != null) {
                    C2733w0.m36980v0(v, colorStateList);
                }
            }
            m28632K0();
            if (C2733w0.m36973z(v) == 0) {
                C2733w0.m37064A0(v, 1);
            }
        }
        if (this.f37415M == null) {
            this.f37415M = ViewDragHelper.m36580o(coordinatorLayout, this.f10576c0);
        }
        int top = v.getTop();
        coordinatorLayout.m38742C(v, i);
        this.f37420R = coordinatorLayout.getWidth();
        this.f37421S = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f37419Q = height;
        int i2 = this.f37421S;
        int i3 = i2 - height;
        int i4 = this.f10596w;
        if (i3 < i4) {
            if (this.f10591r) {
                this.f37419Q = i2;
            } else {
                this.f37419Q = i2 - i4;
            }
        }
        this.f37405C = Math.max(0, i2 - this.f37419Q);
        m28616X();
        m28617W();
        int i5 = this.f37413K;
        if (i5 == 3) {
            C2733w0.m37020b0(v, m28608f0());
        } else if (i5 == 6) {
            C2733w0.m37020b0(v, this.f37406D);
        } else if (this.f37410H && i5 == 5) {
            C2733w0.m37020b0(v, this.f37421S);
        } else if (i5 == 4) {
            C2733w0.m37020b0(v, this.f37408F);
        } else if (i5 == 1 || i5 == 2) {
            C2733w0.m37020b0(v, top - v.getTop());
        }
        this.f37423U = new WeakReference<>(m28610d0(v));
        for (int i6 = 0; i6 < this.f37424V.size(); i6++) {
            this.f37424V.get(i6).m28571a(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: m */
    public boolean mo28600m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m28609e0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f10584k, marginLayoutParams.width), m28609e0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f10585l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: o */
    public boolean mo28597o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (!m28602k0() || (weakReference = this.f37423U) == null || view != weakReference.get()) {
            return false;
        }
        if (this.f37413K != 3 || super.mo28597o(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    public void m28595p0(boolean z) {
        this.f37412J = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: q */
    public void mo28594q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f37423U;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (!m28602k0() || view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < m28608f0()) {
                        int f0 = top - m28608f0();
                        iArr[1] = f0;
                        C2733w0.m37020b0(v, -f0);
                        m28647C0(3);
                    } else if (this.f37412J) {
                        iArr[1] = i2;
                        C2733w0.m37020b0(v, -i2);
                        m28647C0(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f37408F;
                    if (i4 > i5 && !this.f37410H) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        C2733w0.m37020b0(v, -i6);
                        m28647C0(4);
                    } else if (this.f37412J) {
                        iArr[1] = i2;
                        C2733w0.m37020b0(v, -i2);
                        m28647C0(1);
                    } else {
                        return;
                    }
                }
                m28611c0(v.getTop());
                this.f37417O = i2;
                this.f37418P = true;
            }
        }
    }

    /* renamed from: q0 */
    public void m28593q0(int i) {
        if (i >= 0) {
            this.f37404B = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: r0 */
    public void m28592r0(boolean z) {
        int i;
        if (this.f10573b != z) {
            this.f10573b = z;
            if (this.f37422T != null) {
                m28617W();
            }
            if (!this.f10573b || this.f37413K != 6) {
                i = this.f37413K;
            } else {
                i = 3;
            }
            m28647C0(i);
            m28632K0();
        }
    }

    /* renamed from: s0 */
    public void m28591s0(boolean z) {
        this.f10587n = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: t */
    public void mo28590t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: t0 */
    public void m28589t0(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f37407E = f;
        if (this.f37422T != null) {
            m28616X();
        }
    }

    /* renamed from: u0 */
    public void m28588u0(boolean z) {
        if (this.f37410H != z) {
            this.f37410H = z;
            if (!z && this.f37413K == 5) {
                m28649B0(4);
            }
            m28632K0();
        }
    }

    /* renamed from: v0 */
    public void m28587v0(int i) {
        this.f10585l = i;
    }

    /* renamed from: w0 */
    public void m28586w0(int i) {
        this.f10584k = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: x */
    public void mo28585x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C5538g gVar = (C5538g) parcelable;
        super.mo28585x(coordinatorLayout, v, gVar.m21547a());
        m28598n0(gVar);
        int i = gVar.f10610m;
        if (i == 1 || i == 2) {
            this.f37413K = 4;
            this.f37414L = 4;
            return;
        }
        this.f37413K = i;
        this.f37414L = i;
    }

    /* renamed from: x0 */
    public void m28584x0(int i) {
        m28582y0(i, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: y */
    public Parcelable mo28583y(CoordinatorLayout coordinatorLayout, V v) {
        return new C5538g(super.mo28583y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* renamed from: y0 */
    public final void m28582y0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.f10579f) {
                this.f10579f = true;
            }
            z2 = false;
        } else {
            if (this.f10579f || this.f10578e != i) {
                this.f10579f = false;
                this.f10578e = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            m28626N0(z);
        }
    }

    /* renamed from: z0 */
    public void m28581z0(int i) {
        this.f10571a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    /* loaded from: classes3.dex */
    public class C5540h {

        /* renamed from: a */
        private int f10615a;

        /* renamed from: b */
        private boolean f10616b;

        /* renamed from: c */
        private final Runnable f10617c;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h$a */
        /* loaded from: classes3.dex */
        class RunnableC5541a implements Runnable {
            RunnableC5541a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5540h.this.f10616b = false;
                ViewDragHelper viewDragHelper = BottomSheetBehavior.this.f37415M;
                if (viewDragHelper == null || !viewDragHelper.m36582m(true)) {
                    C5540h hVar = C5540h.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f37413K == 2) {
                        bottomSheetBehavior.m28647C0(hVar.f10615a);
                        return;
                    }
                    return;
                }
                C5540h hVar2 = C5540h.this;
                hVar2.m28563c(hVar2.f10615a);
            }
        }

        private C5540h() {
            this.f10617c = new RunnableC5541a();
        }

        /* renamed from: c */
        void m28563c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f37422T;
            if (weakReference != null && weakReference.get() != null) {
                this.f10615a = i;
                if (!this.f10616b) {
                    C2733w0.m37006i0(BottomSheetBehavior.this.f37422T.get(), this.f10617c);
                    this.f10616b = true;
                }
            }
        }

        /* synthetic */ C5540h(BottomSheetBehavior bottomSheetBehavior, RunnableC5532a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    /* loaded from: classes3.dex */
    public static class C5538g extends AbstractC7736a {
        public static final Parcelable.Creator<C5538g> CREATOR = new C5539a();

        /* renamed from: m */
        final int f10610m;

        /* renamed from: n */
        int f10611n;

        /* renamed from: o */
        boolean f10612o;

        /* renamed from: p */
        boolean f10613p;

        /* renamed from: q */
        boolean f10614q;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        /* loaded from: classes3.dex */
        class C5539a implements Parcelable.ClassLoaderCreator<C5538g> {
            C5539a() {
            }

            /* renamed from: a */
            public C5538g createFromParcel(Parcel parcel) {
                return new C5538g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C5538g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5538g(parcel, classLoader);
            }

            /* renamed from: c */
            public C5538g[] newArray(int i) {
                return new C5538g[i];
            }
        }

        public C5538g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10610m = parcel.readInt();
            this.f10611n = parcel.readInt();
            boolean z = false;
            this.f10612o = parcel.readInt() == 1;
            this.f10613p = parcel.readInt() == 1;
            this.f10614q = parcel.readInt() == 1 ? true : z;
        }

        @Override // p125h1.AbstractC7736a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10610m);
            parcel.writeInt(this.f10611n);
            parcel.writeInt(this.f10612o ? 1 : 0);
            parcel.writeInt(this.f10613p ? 1 : 0);
            parcel.writeInt(this.f10614q ? 1 : 0);
        }

        public C5538g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f10610m = bottomSheetBehavior.f37413K;
            this.f10611n = ((BottomSheetBehavior) bottomSheetBehavior).f10578e;
            this.f10612o = ((BottomSheetBehavior) bottomSheetBehavior).f10573b;
            this.f10613p = bottomSheetBehavior.f37410H;
            this.f10614q = ((BottomSheetBehavior) bottomSheetBehavior).f37411I;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f10571a = 0;
        this.f10573b = true;
        this.f10575c = false;
        this.f10584k = -1;
        this.f10585l = -1;
        this.f10599z = new C5540h(this, null);
        this.f37407E = 0.5f;
        this.f37409G = -1.0f;
        this.f37412J = true;
        this.f37413K = 4;
        this.f37414L = 4;
        this.f37424V = new ArrayList<>();
        this.f10574b0 = -1;
        this.f10576c0 = new C5535d();
        this.f10581h = context.getResources().getDimensionPixelSize(C6805d.f38005M);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f38151P);
        int i2 = C6812k.f38183T;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f10583j = C13242c.m4241a(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(C6812k.f14758k0)) {
            this.f10597x = C14045k.m1931e(context, attributeSet, C6803b.f14529c, f10570d0).m1892m();
        }
        m28613a0(context);
        m28612b0();
        this.f37409G = obtainStyledAttributes.getDimension(C6812k.f38175S, -1.0f);
        int i3 = C6812k.f38159Q;
        if (obtainStyledAttributes.hasValue(i3)) {
            m28586w0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = C6812k.f38167R;
        if (obtainStyledAttributes.hasValue(i4)) {
            m28587v0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = C6812k.f38228Z;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue == null || (i = peekValue.data) != -1) {
            m28584x0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        } else {
            m28584x0(i);
        }
        m28588u0(obtainStyledAttributes.getBoolean(C6812k.f38221Y, false));
        m28591s0(obtainStyledAttributes.getBoolean(C6812k.f14694c0, false));
        m28592r0(obtainStyledAttributes.getBoolean(C6812k.f38207W, true));
        m28650A0(obtainStyledAttributes.getBoolean(C6812k.f14686b0, false));
        m28595p0(obtainStyledAttributes.getBoolean(C6812k.f38191U, true));
        m28581z0(obtainStyledAttributes.getInt(C6812k.f14678a0, 0));
        m28589t0(obtainStyledAttributes.getFloat(C6812k.f38214X, 0.5f));
        int i6 = C6812k.f38199V;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 == null || peekValue2.type != 16) {
            m28593q0(obtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        } else {
            m28593q0(peekValue2.data);
        }
        this.f10588o = obtainStyledAttributes.getBoolean(C6812k.f14726g0, false);
        this.f10589p = obtainStyledAttributes.getBoolean(C6812k.f14734h0, false);
        this.f10590q = obtainStyledAttributes.getBoolean(C6812k.f14742i0, false);
        this.f10591r = obtainStyledAttributes.getBoolean(C6812k.f14750j0, true);
        this.f10592s = obtainStyledAttributes.getBoolean(C6812k.f14702d0, false);
        this.f10593t = obtainStyledAttributes.getBoolean(C6812k.f14710e0, false);
        this.f10594u = obtainStyledAttributes.getBoolean(C6812k.f14718f0, false);
        obtainStyledAttributes.recycle();
        this.f10577d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
