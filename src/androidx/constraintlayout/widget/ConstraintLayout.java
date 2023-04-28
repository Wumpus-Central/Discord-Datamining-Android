package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.C2125d;
import androidx.constraintlayout.solver.widgets.C2128e;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.HashMap;
import p432y0.C14201b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.1";
    private ConstraintsChangedListener mConstraintsChangedListener;
    private Metrics mMetrics;
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    private ArrayList<AbstractC2143b> mConstraintHelpers = new ArrayList<>(4);
    protected ConstraintWidgetContainer mLayoutWidget = new ConstraintWidgetContainer();
    private int mMinWidth = 0;
    private int mMinHeight = 0;
    private int mMaxWidth = ViewDefaults.NUMBER_OF_LINES;
    private int mMaxHeight = ViewDefaults.NUMBER_OF_LINES;
    protected boolean mDirtyHierarchy = true;
    private int mOptimizationLevel = 263;
    private ConstraintSet mConstraintSet = null;
    protected ConstraintLayoutStates mConstraintLayoutSpec = null;
    private int mConstraintSetId = -1;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    private int mLastMeasureWidth = -1;
    private int mLastMeasureHeight = -1;
    int mLastMeasureWidthSize = -1;
    int mLastMeasureHeightSize = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureHeightMode = 0;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray<>();
    Measurer mMeasurer = new Measurer(this);
    private int mOnMeasureWidthMeasureSpec = 0;
    private int mOnMeasureHeightMeasureSpec = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class Measurer implements C14201b.AbstractC0461b {

        /* renamed from: a */
        ConstraintLayout f2671a;

        /* renamed from: b */
        int f2672b;

        /* renamed from: c */
        int f2673c;

        /* renamed from: d */
        int f2674d;

        /* renamed from: e */
        int f2675e;

        /* renamed from: f */
        int f2676f;

        /* renamed from: g */
        int f2677g;

        public Measurer(ConstraintLayout constraintLayout) {
            this.f2671a = constraintLayout;
        }

        @Override // p432y0.C14201b.AbstractC0461b
        /* renamed from: a */
        public final void mo1397a() {
            int childCount = this.f2671a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2671a.getChildAt(i);
                if (childAt instanceof C2146d) {
                    ((C2146d) childAt).m38748a(this.f2671a);
                }
            }
            int size = this.f2671a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC2143b) this.f2671a.mConstraintHelpers.get(i2)).m38754j(this.f2671a);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x016e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01f8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0204 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x020f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:149:0x021b  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0253  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x015b  */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r16v2 */
        /* JADX WARN: Type inference failed for: r16v3 */
        /* JADX WARN: Type inference failed for: r7v10, types: [int[]] */
        /* JADX WARN: Unknown variable types count: 2 */
        @Override // p432y0.C14201b.AbstractC0461b
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo1396b(androidx.constraintlayout.solver.widgets.ConstraintWidget r20, p432y0.C14201b.C14202a r21) {
            /*
                Method dump skipped, instructions count: 616
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.Measurer.mo1396b(androidx.constraintlayout.solver.widgets.ConstraintWidget, y0.b$a):void");
        }

        /* renamed from: c */
        public void m38808c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2672b = i3;
            this.f2673c = i4;
            this.f2674d = i5;
            this.f2675e = i6;
            this.f2676f = i;
            this.f2677g = i2;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2133a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2679a;

        static {
            int[] iArr = new int[ConstraintWidget.EnumC2121b.values().length];
            f2679a = iArr;
            try {
                iArr[ConstraintWidget.EnumC2121b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2679a[ConstraintWidget.EnumC2121b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2679a[ConstraintWidget.EnumC2121b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2679a[ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2656n0;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m38922Z(this);
        this.mLayoutWidget.m38856c1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2148f.f2813a1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C2148f.f2848f1) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C2148f.f2855g1) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C2148f.f2834d1) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C2148f.f2841e1) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C2148f.f2895m2) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C2148f.f2900n1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C2148f.f2888l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.m38788m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m38855d1(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo2316W();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).m38921a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C2144c)) {
                    this.mConstraintSet = ((C2144c) childAt2).getConstraintSet();
                }
            }
        }
        ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.m38797d(this, true);
        }
        this.mLayoutWidget.m2317J0();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).m38752l(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C2146d) {
                ((C2146d) childAt3).m38747b(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.m2314a(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    protected void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        int i;
        float f;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        layoutParams.m38809a();
        layoutParams.f2658o0 = false;
        constraintWidget.m38949A0(view.getVisibility());
        if (layoutParams.f2632b0) {
            constraintWidget.m38902m0(true);
            constraintWidget.m38949A0(8);
        }
        constraintWidget.m38922Z(view);
        if (view instanceof AbstractC2143b) {
            ((AbstractC2143b) view).mo38756h(constraintWidget, this.mLayoutWidget.m38861X0());
        }
        if (layoutParams.f35424Z) {
            C2128e eVar = (C2128e) constraintWidget;
            int i2 = layoutParams.f2650k0;
            int i3 = layoutParams.f2652l0;
            float f2 = layoutParams.f2654m0;
            if (f2 != -1.0f) {
                eVar.m38820N0(f2);
            } else if (i2 != -1) {
                eVar.m38822L0(i2);
            } else if (i3 != -1) {
                eVar.m38821M0(i3);
            }
        } else {
            int i4 = layoutParams.f2636d0;
            int i5 = layoutParams.f2638e0;
            int i6 = layoutParams.f2640f0;
            int i7 = layoutParams.f2642g0;
            int i8 = layoutParams.f2644h0;
            int i9 = layoutParams.f2646i0;
            float f3 = layoutParams.f2648j0;
            int i10 = layoutParams.f2653m;
            if (i10 != -1) {
                ConstraintWidget constraintWidget6 = sparseArray.get(i10);
                if (constraintWidget6 != null) {
                    constraintWidget.m38910i(constraintWidget6, layoutParams.f2657o, layoutParams.f2655n);
                }
            } else {
                if (i4 != -1) {
                    ConstraintWidget constraintWidget7 = sparseArray.get(i4);
                    if (constraintWidget7 != null) {
                        C2125d.EnumC2127b bVar = C2125d.EnumC2127b.LEFT;
                        f = f3;
                        constraintWidget.m38928R(bVar, constraintWidget7, bVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                    } else {
                        f = f3;
                    }
                } else {
                    f = f3;
                    if (!(i5 == -1 || (constraintWidget5 = sparseArray.get(i5)) == null)) {
                        constraintWidget.m38928R(C2125d.EnumC2127b.LEFT, constraintWidget5, C2125d.EnumC2127b.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                    }
                }
                if (i6 != -1) {
                    ConstraintWidget constraintWidget8 = sparseArray.get(i6);
                    if (constraintWidget8 != null) {
                        constraintWidget.m38928R(C2125d.EnumC2127b.RIGHT, constraintWidget8, C2125d.EnumC2127b.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
                    }
                } else if (!(i7 == -1 || (constraintWidget4 = sparseArray.get(i7)) == null)) {
                    C2125d.EnumC2127b bVar2 = C2125d.EnumC2127b.RIGHT;
                    constraintWidget.m38928R(bVar2, constraintWidget4, bVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
                }
                int i11 = layoutParams.f2643h;
                if (i11 != -1) {
                    ConstraintWidget constraintWidget9 = sparseArray.get(i11);
                    if (constraintWidget9 != null) {
                        C2125d.EnumC2127b bVar3 = C2125d.EnumC2127b.TOP;
                        constraintWidget.m38928R(bVar3, constraintWidget9, bVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2664u);
                    }
                } else {
                    int i12 = layoutParams.f2645i;
                    if (!(i12 == -1 || (constraintWidget3 = sparseArray.get(i12)) == null)) {
                        constraintWidget.m38928R(C2125d.EnumC2127b.TOP, constraintWidget3, C2125d.EnumC2127b.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2664u);
                    }
                }
                int i13 = layoutParams.f2647j;
                if (i13 != -1) {
                    ConstraintWidget constraintWidget10 = sparseArray.get(i13);
                    if (constraintWidget10 != null) {
                        constraintWidget.m38928R(C2125d.EnumC2127b.BOTTOM, constraintWidget10, C2125d.EnumC2127b.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2666w);
                    }
                } else {
                    int i14 = layoutParams.f2649k;
                    if (!(i14 == -1 || (constraintWidget2 = sparseArray.get(i14)) == null)) {
                        C2125d.EnumC2127b bVar4 = C2125d.EnumC2127b.BOTTOM;
                        constraintWidget.m38928R(bVar4, constraintWidget2, bVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2666w);
                    }
                }
                int i15 = layoutParams.f2651l;
                if (i15 != -1) {
                    View view2 = this.mChildrenByIds.get(i15);
                    ConstraintWidget constraintWidget11 = sparseArray.get(layoutParams.f2651l);
                    if (!(constraintWidget11 == null || view2 == null || !(view2.getLayoutParams() instanceof LayoutParams))) {
                        LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                        layoutParams.f35423Y = true;
                        layoutParams2.f35423Y = true;
                        C2125d.EnumC2127b bVar5 = C2125d.EnumC2127b.BASELINE;
                        constraintWidget.mo38816k(bVar5).m38839a(constraintWidget11.mo38816k(bVar5), 0, -1, true);
                        constraintWidget.m38917d0(true);
                        layoutParams2.f2656n0.m38917d0(true);
                        constraintWidget.mo38816k(C2125d.EnumC2127b.TOP).m38829k();
                        constraintWidget.mo38816k(C2125d.EnumC2127b.BOTTOM).m38829k();
                    }
                }
                if (f >= 0.0f) {
                    constraintWidget.m38914f0(f);
                }
                float f4 = layoutParams.f35399A;
                if (f4 >= 0.0f) {
                    constraintWidget.m38886u0(f4);
                }
            }
            if (z && !((i = layoutParams.f35415Q) == -1 && layoutParams.f35416R == -1)) {
                constraintWidget.m38890s0(i, layoutParams.f35416R);
            }
            if (layoutParams.f35421W) {
                constraintWidget.m38909i0(ConstraintWidget.EnumC2121b.FIXED);
                constraintWidget.m38947B0(((ViewGroup.MarginLayoutParams) layoutParams).width);
                if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                    constraintWidget.m38909i0(ConstraintWidget.EnumC2121b.WRAP_CONTENT);
                }
            } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                if (layoutParams.f35418T) {
                    constraintWidget.m38909i0(ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.m38909i0(ConstraintWidget.EnumC2121b.MATCH_PARENT);
                }
                constraintWidget.mo38816k(C2125d.EnumC2127b.LEFT).f2604e = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                constraintWidget.mo38816k(C2125d.EnumC2127b.RIGHT).f2604e = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                constraintWidget.m38909i0(ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT);
                constraintWidget.m38947B0(0);
            }
            if (layoutParams.f35422X) {
                constraintWidget.m38880x0(ConstraintWidget.EnumC2121b.FIXED);
                constraintWidget.m38915e0(((ViewGroup.MarginLayoutParams) layoutParams).height);
                if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                    constraintWidget.m38880x0(ConstraintWidget.EnumC2121b.WRAP_CONTENT);
                }
            } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                if (layoutParams.f35419U) {
                    constraintWidget.m38880x0(ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.m38880x0(ConstraintWidget.EnumC2121b.MATCH_PARENT);
                }
                constraintWidget.mo38816k(C2125d.EnumC2127b.TOP).f2604e = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                constraintWidget.mo38816k(C2125d.EnumC2127b.BOTTOM).f2604e = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                constraintWidget.m38880x0(ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT);
                constraintWidget.m38915e0(0);
            }
            constraintWidget.m38920b0(layoutParams.f35400B);
            constraintWidget.m38906k0(layoutParams.f35403E);
            constraintWidget.m38876z0(layoutParams.f35404F);
            constraintWidget.m38913g0(layoutParams.f35405G);
            constraintWidget.m38884v0(layoutParams.f35406H);
            constraintWidget.m38907j0(layoutParams.f35407I, layoutParams.f35409K, layoutParams.f35411M, layoutParams.f35413O);
            constraintWidget.m38878y0(layoutParams.f35408J, layoutParams.f35410L, layoutParams.f35412N, layoutParams.f35414P);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC2143b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).m38753k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.m38867R0(metrics);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m38865T0();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2656n0;
    }

    protected boolean isRtl() {
        boolean z;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
            }
        } else {
            this.mConstraintLayoutSpec = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f2656n0;
            if ((childAt.getVisibility() != 8 || layoutParams.f35424Z || layoutParams.f2630a0 || layoutParams.f2634c0 || isInEditMode) && !layoutParams.f2632b0) {
                int O = constraintWidget.m38931O();
                int P = constraintWidget.m38930P();
                int N = constraintWidget.m38932N() + O;
                int t = constraintWidget.m38889t() + P;
                childAt.layout(O, P, N, t);
                if ((childAt instanceof C2146d) && (content = ((C2146d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(O, P, N, t);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo38755i(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m38854e1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.m38852g1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m38932N(), this.mLayoutWidget.m38889t(), this.mLayoutWidget.m38860Y0(), this.mLayoutWidget.m38862W0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C2128e)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C2128e eVar = new C2128e();
            layoutParams.f2656n0 = eVar;
            layoutParams.f35424Z = true;
            eVar.m38819O0(layoutParams.f35417S);
        }
        if (view instanceof AbstractC2143b) {
            AbstractC2143b bVar = (AbstractC2143b) view;
            bVar.m38751m();
            ((LayoutParams) view.getLayoutParams()).f2630a0 = true;
            if (!this.mConstraintHelpers.contains(bVar)) {
                this.mConstraintHelpers.add(bVar);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.m2318I0(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Measurer measurer = this.mMeasurer;
        int i5 = measurer.f2675e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + measurer.f2674d, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    protected void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.m38808c(i2, i3, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i4 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            i4 = max4;
        } else {
            i4 = max3;
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i6, mode2, i7);
        constraintWidgetContainer.m38859Z0(i, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, i4, max);
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.m38805c(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m38855d1(i);
    }

    protected void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4) {
        ConstraintWidget.EnumC2121b bVar;
        Measurer measurer = this.mMeasurer;
        int i5 = measurer.f2675e;
        int i6 = measurer.f2674d;
        ConstraintWidget.EnumC2121b bVar2 = ConstraintWidget.EnumC2121b.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            bVar = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            bVar = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
            i2 = 0;
        } else if (i != 1073741824) {
            bVar = bVar2;
            i2 = 0;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            bVar = bVar2;
        }
        if (i3 == Integer.MIN_VALUE) {
            bVar2 = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 != 0) {
            if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            bVar2 = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
            i4 = 0;
        }
        if (!(i2 == constraintWidgetContainer.m38932N() && i4 == constraintWidgetContainer.m38889t())) {
            constraintWidgetContainer.m38863V0();
        }
        constraintWidgetContainer.m38945C0(0);
        constraintWidgetContainer.m38943D0(0);
        constraintWidgetContainer.m38896p0(this.mMaxWidth - i6);
        constraintWidgetContainer.m38898o0(this.mMaxHeight - i5);
        constraintWidgetContainer.m38892r0(0);
        constraintWidgetContainer.m38894q0(0);
        constraintWidgetContainer.m38909i0(bVar);
        constraintWidgetContainer.m38947B0(i2);
        constraintWidgetContainer.m38880x0(bVar2);
        constraintWidgetContainer.m38915e0(i4);
        constraintWidgetContainer.m38892r0(this.mMinWidth - i6);
        constraintWidgetContainer.m38894q0(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.m38804d(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f35399A;

        /* renamed from: B */
        public String f35400B;

        /* renamed from: C */
        float f35401C;

        /* renamed from: D */
        int f35402D;

        /* renamed from: E */
        public float f35403E;

        /* renamed from: F */
        public float f35404F;

        /* renamed from: G */
        public int f35405G;

        /* renamed from: H */
        public int f35406H;

        /* renamed from: I */
        public int f35407I;

        /* renamed from: J */
        public int f35408J;

        /* renamed from: K */
        public int f35409K;

        /* renamed from: L */
        public int f35410L;

        /* renamed from: M */
        public int f35411M;

        /* renamed from: N */
        public int f35412N;

        /* renamed from: O */
        public float f35413O;

        /* renamed from: P */
        public float f35414P;

        /* renamed from: Q */
        public int f35415Q;

        /* renamed from: R */
        public int f35416R;

        /* renamed from: S */
        public int f35417S;

        /* renamed from: T */
        public boolean f35418T;

        /* renamed from: U */
        public boolean f35419U;

        /* renamed from: V */
        public String f35420V;

        /* renamed from: W */
        boolean f35421W;

        /* renamed from: X */
        boolean f35422X;

        /* renamed from: Y */
        boolean f35423Y;

        /* renamed from: Z */
        boolean f35424Z;

        /* renamed from: a */
        public int f2629a;

        /* renamed from: a0 */
        boolean f2630a0;

        /* renamed from: b */
        public int f2631b;

        /* renamed from: b0 */
        boolean f2632b0;

        /* renamed from: c */
        public float f2633c;

        /* renamed from: c0 */
        boolean f2634c0;

        /* renamed from: d */
        public int f2635d;

        /* renamed from: d0 */
        int f2636d0;

        /* renamed from: e */
        public int f2637e;

        /* renamed from: e0 */
        int f2638e0;

        /* renamed from: f */
        public int f2639f;

        /* renamed from: f0 */
        int f2640f0;

        /* renamed from: g */
        public int f2641g;

        /* renamed from: g0 */
        int f2642g0;

        /* renamed from: h */
        public int f2643h;

        /* renamed from: h0 */
        int f2644h0;

        /* renamed from: i */
        public int f2645i;

        /* renamed from: i0 */
        int f2646i0;

        /* renamed from: j */
        public int f2647j;

        /* renamed from: j0 */
        float f2648j0;

        /* renamed from: k */
        public int f2649k;

        /* renamed from: k0 */
        int f2650k0;

        /* renamed from: l */
        public int f2651l;

        /* renamed from: l0 */
        int f2652l0;

        /* renamed from: m */
        public int f2653m;

        /* renamed from: m0 */
        float f2654m0;

        /* renamed from: n */
        public int f2655n;

        /* renamed from: n0 */
        ConstraintWidget f2656n0;

        /* renamed from: o */
        public float f2657o;

        /* renamed from: o0 */
        public boolean f2658o0;

        /* renamed from: p */
        public int f2659p;

        /* renamed from: q */
        public int f2660q;

        /* renamed from: r */
        public int f2661r;

        /* renamed from: s */
        public int f2662s;

        /* renamed from: t */
        public int f2663t;

        /* renamed from: u */
        public int f2664u;

        /* renamed from: v */
        public int f2665v;

        /* renamed from: w */
        public int f2666w;

        /* renamed from: x */
        public int f2667x;

        /* renamed from: y */
        public int f2668y;

        /* renamed from: z */
        public float f2669z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        /* loaded from: classes.dex */
        private static class C2132a {

            /* renamed from: a */
            public static final SparseIntArray f2670a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2670a = sparseIntArray;
                sparseIntArray.append(C2148f.f35527M1, 8);
                sparseIntArray.append(C2148f.f35533N1, 9);
                sparseIntArray.append(C2148f.f35545P1, 10);
                sparseIntArray.append(C2148f.f35551Q1, 11);
                sparseIntArray.append(C2148f.f35587W1, 12);
                sparseIntArray.append(C2148f.f35581V1, 13);
                sparseIntArray.append(C2148f.f2942u1, 14);
                sparseIntArray.append(C2148f.f2936t1, 15);
                sparseIntArray.append(C2148f.f2924r1, 16);
                sparseIntArray.append(C2148f.f2948v1, 2);
                sparseIntArray.append(C2148f.f2960x1, 3);
                sparseIntArray.append(C2148f.f2954w1, 4);
                sparseIntArray.append(C2148f.f2842e2, 49);
                sparseIntArray.append(C2148f.f2849f2, 50);
                sparseIntArray.append(C2148f.f35461B1, 5);
                sparseIntArray.append(C2148f.f35467C1, 6);
                sparseIntArray.append(C2148f.f35473D1, 7);
                sparseIntArray.append(C2148f.f2820b1, 1);
                sparseIntArray.append(C2148f.f35557R1, 17);
                sparseIntArray.append(C2148f.f35563S1, 18);
                sparseIntArray.append(C2148f.f35455A1, 19);
                sparseIntArray.append(C2148f.f2972z1, 20);
                sparseIntArray.append(C2148f.f2870i2, 21);
                sparseIntArray.append(C2148f.f2889l2, 22);
                sparseIntArray.append(C2148f.f2877j2, 23);
                sparseIntArray.append(C2148f.f2856g2, 24);
                sparseIntArray.append(C2148f.f2883k2, 25);
                sparseIntArray.append(C2148f.f2863h2, 26);
                sparseIntArray.append(C2148f.f35503I1, 29);
                sparseIntArray.append(C2148f.f35593X1, 30);
                sparseIntArray.append(C2148f.f2966y1, 44);
                sparseIntArray.append(C2148f.f35515K1, 45);
                sparseIntArray.append(C2148f.f35605Z1, 46);
                sparseIntArray.append(C2148f.f35509J1, 47);
                sparseIntArray.append(C2148f.f35599Y1, 48);
                sparseIntArray.append(C2148f.f2912p1, 27);
                sparseIntArray.append(C2148f.f2906o1, 28);
                sparseIntArray.append(C2148f.f2814a2, 31);
                sparseIntArray.append(C2148f.f35479E1, 32);
                sparseIntArray.append(C2148f.f2828c2, 33);
                sparseIntArray.append(C2148f.f2821b2, 34);
                sparseIntArray.append(C2148f.f2835d2, 35);
                sparseIntArray.append(C2148f.f35491G1, 36);
                sparseIntArray.append(C2148f.f35485F1, 37);
                sparseIntArray.append(C2148f.f35497H1, 38);
                sparseIntArray.append(C2148f.f35521L1, 39);
                sparseIntArray.append(C2148f.f35575U1, 40);
                sparseIntArray.append(C2148f.f35539O1, 41);
                sparseIntArray.append(C2148f.f2930s1, 42);
                sparseIntArray.append(C2148f.f2918q1, 43);
                sparseIntArray.append(C2148f.f35569T1, 51);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.f2629a = -1;
            this.f2631b = -1;
            this.f2633c = -1.0f;
            this.f2635d = -1;
            this.f2637e = -1;
            this.f2639f = -1;
            this.f2641g = -1;
            this.f2643h = -1;
            this.f2645i = -1;
            this.f2647j = -1;
            this.f2649k = -1;
            this.f2651l = -1;
            this.f2653m = -1;
            this.f2655n = 0;
            this.f2657o = 0.0f;
            this.f2659p = -1;
            this.f2660q = -1;
            this.f2661r = -1;
            this.f2662s = -1;
            this.f2663t = -1;
            this.f2664u = -1;
            this.f2665v = -1;
            this.f2666w = -1;
            this.f2667x = -1;
            this.f2668y = -1;
            this.f2669z = 0.5f;
            this.f35399A = 0.5f;
            this.f35400B = null;
            this.f35401C = 0.0f;
            this.f35402D = 1;
            this.f35403E = -1.0f;
            this.f35404F = -1.0f;
            this.f35405G = 0;
            this.f35406H = 0;
            this.f35407I = 0;
            this.f35408J = 0;
            this.f35409K = 0;
            this.f35410L = 0;
            this.f35411M = 0;
            this.f35412N = 0;
            this.f35413O = 1.0f;
            this.f35414P = 1.0f;
            this.f35415Q = -1;
            this.f35416R = -1;
            this.f35417S = -1;
            this.f35418T = false;
            this.f35419U = false;
            this.f35420V = null;
            this.f35421W = true;
            this.f35422X = true;
            this.f35423Y = false;
            this.f35424Z = false;
            this.f2630a0 = false;
            this.f2632b0 = false;
            this.f2634c0 = false;
            this.f2636d0 = -1;
            this.f2638e0 = -1;
            this.f2640f0 = -1;
            this.f2642g0 = -1;
            this.f2644h0 = -1;
            this.f2646i0 = -1;
            this.f2648j0 = 0.5f;
            this.f2656n0 = new ConstraintWidget();
            this.f2658o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2148f.f2813a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C2132a.f2670a.get(index);
                switch (i3) {
                    case 1:
                        this.f35417S = obtainStyledAttributes.getInt(index, this.f35417S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2653m);
                        this.f2653m = resourceId;
                        if (resourceId == -1) {
                            this.f2653m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2655n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2655n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f2657o) % 360.0f;
                        this.f2657o = f;
                        if (f < 0.0f) {
                            this.f2657o = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2629a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2629a);
                        break;
                    case 6:
                        this.f2631b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2631b);
                        break;
                    case 7:
                        this.f2633c = obtainStyledAttributes.getFloat(index, this.f2633c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2635d);
                        this.f2635d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2635d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2637e);
                        this.f2637e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2637e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2639f);
                        this.f2639f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2639f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2641g);
                        this.f2641g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2641g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2643h);
                        this.f2643h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2643h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2645i);
                        this.f2645i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2645i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2647j);
                        this.f2647j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2647j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2649k);
                        this.f2649k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2649k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2651l);
                        this.f2651l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2651l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2659p);
                        this.f2659p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2659p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2660q);
                        this.f2660q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2660q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2661r);
                        this.f2661r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2661r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2662s);
                        this.f2662s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2662s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2663t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2663t);
                        break;
                    case 22:
                        this.f2664u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2664u);
                        break;
                    case 23:
                        this.f2665v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2665v);
                        break;
                    case 24:
                        this.f2666w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2666w);
                        break;
                    case 25:
                        this.f2667x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2667x);
                        break;
                    case 26:
                        this.f2668y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2668y);
                        break;
                    case 27:
                        this.f35418T = obtainStyledAttributes.getBoolean(index, this.f35418T);
                        break;
                    case 28:
                        this.f35419U = obtainStyledAttributes.getBoolean(index, this.f35419U);
                        break;
                    case 29:
                        this.f2669z = obtainStyledAttributes.getFloat(index, this.f2669z);
                        break;
                    case 30:
                        this.f35399A = obtainStyledAttributes.getFloat(index, this.f35399A);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f35407I = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f35408J = i5;
                        if (i5 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f35409K = obtainStyledAttributes.getDimensionPixelSize(index, this.f35409K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f35409K) == -2) {
                                this.f35409K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f35411M = obtainStyledAttributes.getDimensionPixelSize(index, this.f35411M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f35411M) == -2) {
                                this.f35411M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f35413O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f35413O));
                        this.f35407I = 2;
                        break;
                    case 36:
                        try {
                            this.f35410L = obtainStyledAttributes.getDimensionPixelSize(index, this.f35410L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f35410L) == -2) {
                                this.f35410L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f35412N = obtainStyledAttributes.getDimensionPixelSize(index, this.f35412N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f35412N) == -2) {
                                this.f35412N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f35414P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f35414P));
                        this.f35408J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f35400B = string;
                                this.f35401C = Float.NaN;
                                this.f35402D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f35400B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f35400B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f35402D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f35402D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f35400B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.f35400B.substring(i);
                                        if (substring2.length() > 0) {
                                            this.f35401C = Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.f35400B.substring(i, indexOf2);
                                        String substring4 = this.f35400B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f35402D == 1) {
                                                        this.f35401C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.f35401C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f35403E = obtainStyledAttributes.getFloat(index, this.f35403E);
                                continue;
                            case 46:
                                this.f35404F = obtainStyledAttributes.getFloat(index, this.f35404F);
                                continue;
                            case 47:
                                this.f35405G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f35406H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f35415Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f35415Q);
                                continue;
                            case 50:
                                this.f35416R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f35416R);
                                continue;
                            case 51:
                                this.f35420V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m38809a();
        }

        /* renamed from: a */
        public void m38809a() {
            this.f35424Z = false;
            this.f35421W = true;
            this.f35422X = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f35418T) {
                this.f35421W = false;
                if (this.f35407I == 0) {
                    this.f35407I = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f35419U) {
                this.f35422X = false;
                if (this.f35408J == 0) {
                    this.f35408J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f35421W = false;
                if (i == 0 && this.f35407I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f35418T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f35422X = false;
                if (i2 == 0 && this.f35408J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f35419U = true;
                }
            }
            if (this.f2633c != -1.0f || this.f2629a != -1 || this.f2631b != -1) {
                this.f35424Z = true;
                this.f35421W = true;
                this.f35422X = true;
                if (!(this.f2656n0 instanceof C2128e)) {
                    this.f2656n0 = new C2128e();
                }
                ((C2128e) this.f2656n0).m38819O0(this.f35417S);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2629a = -1;
            this.f2631b = -1;
            this.f2633c = -1.0f;
            this.f2635d = -1;
            this.f2637e = -1;
            this.f2639f = -1;
            this.f2641g = -1;
            this.f2643h = -1;
            this.f2645i = -1;
            this.f2647j = -1;
            this.f2649k = -1;
            this.f2651l = -1;
            this.f2653m = -1;
            this.f2655n = 0;
            this.f2657o = 0.0f;
            this.f2659p = -1;
            this.f2660q = -1;
            this.f2661r = -1;
            this.f2662s = -1;
            this.f2663t = -1;
            this.f2664u = -1;
            this.f2665v = -1;
            this.f2666w = -1;
            this.f2667x = -1;
            this.f2668y = -1;
            this.f2669z = 0.5f;
            this.f35399A = 0.5f;
            this.f35400B = null;
            this.f35401C = 0.0f;
            this.f35402D = 1;
            this.f35403E = -1.0f;
            this.f35404F = -1.0f;
            this.f35405G = 0;
            this.f35406H = 0;
            this.f35407I = 0;
            this.f35408J = 0;
            this.f35409K = 0;
            this.f35410L = 0;
            this.f35411M = 0;
            this.f35412N = 0;
            this.f35413O = 1.0f;
            this.f35414P = 1.0f;
            this.f35415Q = -1;
            this.f35416R = -1;
            this.f35417S = -1;
            this.f35418T = false;
            this.f35419U = false;
            this.f35420V = null;
            this.f35421W = true;
            this.f35422X = true;
            this.f35423Y = false;
            this.f35424Z = false;
            this.f2630a0 = false;
            this.f2632b0 = false;
            this.f2634c0 = false;
            this.f2636d0 = -1;
            this.f2638e0 = -1;
            this.f2640f0 = -1;
            this.f2642g0 = -1;
            this.f2644h0 = -1;
            this.f2646i0 = -1;
            this.f2648j0 = 0.5f;
            this.f2656n0 = new ConstraintWidget();
            this.f2658o0 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2629a = -1;
            this.f2631b = -1;
            this.f2633c = -1.0f;
            this.f2635d = -1;
            this.f2637e = -1;
            this.f2639f = -1;
            this.f2641g = -1;
            this.f2643h = -1;
            this.f2645i = -1;
            this.f2647j = -1;
            this.f2649k = -1;
            this.f2651l = -1;
            this.f2653m = -1;
            this.f2655n = 0;
            this.f2657o = 0.0f;
            this.f2659p = -1;
            this.f2660q = -1;
            this.f2661r = -1;
            this.f2662s = -1;
            this.f2663t = -1;
            this.f2664u = -1;
            this.f2665v = -1;
            this.f2666w = -1;
            this.f2667x = -1;
            this.f2668y = -1;
            this.f2669z = 0.5f;
            this.f35399A = 0.5f;
            this.f35400B = null;
            this.f35401C = 0.0f;
            this.f35402D = 1;
            this.f35403E = -1.0f;
            this.f35404F = -1.0f;
            this.f35405G = 0;
            this.f35406H = 0;
            this.f35407I = 0;
            this.f35408J = 0;
            this.f35409K = 0;
            this.f35410L = 0;
            this.f35411M = 0;
            this.f35412N = 0;
            this.f35413O = 1.0f;
            this.f35414P = 1.0f;
            this.f35415Q = -1;
            this.f35416R = -1;
            this.f35417S = -1;
            this.f35418T = false;
            this.f35419U = false;
            this.f35420V = null;
            this.f35421W = true;
            this.f35422X = true;
            this.f35423Y = false;
            this.f35424Z = false;
            this.f2630a0 = false;
            this.f2632b0 = false;
            this.f2634c0 = false;
            this.f2636d0 = -1;
            this.f2638e0 = -1;
            this.f2640f0 = -1;
            this.f2642g0 = -1;
            this.f2644h0 = -1;
            this.f2646i0 = -1;
            this.f2648j0 = 0.5f;
            this.f2656n0 = new ConstraintWidget();
            this.f2658o0 = false;
        }
    }
}
