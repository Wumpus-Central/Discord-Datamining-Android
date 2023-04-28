package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.C1733v0;
import p052d.C6379a;
import p144i.C8094a;

/* renamed from: androidx.appcompat.widget.g1 */
/* loaded from: classes.dex */
public class C1671g1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: t */
    private static final Interpolator f1346t = new DecelerateInterpolator();

    /* renamed from: k */
    Runnable f1347k;

    /* renamed from: l */
    private View$OnClickListenerC1674c f1348l;

    /* renamed from: m */
    C1733v0 f1349m;

    /* renamed from: n */
    private Spinner f1350n;

    /* renamed from: o */
    private boolean f1351o;

    /* renamed from: p */
    int f1352p;

    /* renamed from: q */
    int f1353q;

    /* renamed from: r */
    private int f1354r;

    /* renamed from: s */
    private int f1355s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.g1$a */
    /* loaded from: classes.dex */
    public class RunnableC1672a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ View f1356k;

        RunnableC1672a(View view) {
            this.f1356k = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1671g1.this.smoothScrollTo(this.f1356k.getLeft() - ((C1671g1.this.getWidth() - this.f1356k.getWidth()) / 2), 0);
            C1671g1.this.f1347k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g1$b */
    /* loaded from: classes.dex */
    public class C1673b extends BaseAdapter {
        C1673b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C1671g1.this.f1349m.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C1675d) C1671g1.this.f1349m.getChildAt(i)).m40206b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C1671g1.this.m40211c((ActionBar.AbstractC1501c) getItem(i), true);
            }
            ((C1675d) view).m40207a((ActionBar.AbstractC1501c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g1$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1674c implements View.OnClickListener {
        View$OnClickListenerC1674c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            ((C1675d) view).m40206b().m40955e();
            int childCount = C1671g1.this.f1349m.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C1671g1.this.f1349m.getChildAt(i);
                if (childAt == view) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g1$d */
    /* loaded from: classes.dex */
    public class C1675d extends LinearLayout {

        /* renamed from: k */
        private final int[] f1360k;

        /* renamed from: l */
        private ActionBar.AbstractC1501c f1361l;

        /* renamed from: m */
        private TextView f1362m;

        /* renamed from: n */
        private ImageView f1363n;

        /* renamed from: o */
        private View f1364o;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C1675d(android.content.Context r6, androidx.appcompat.app.ActionBar.AbstractC1501c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C1671g1.this = r5
                int r5 = p052d.C6379a.f13098d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1360k = r1
                r4.f1361l = r7
                androidx.appcompat.widget.n1 r5 = androidx.appcompat.widget.C1698n1.m40105v(r6, r0, r1, r5, r3)
                boolean r6 = r5.m40108s(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.m40120g(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.m40104w()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.m40205c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1671g1.C1675d.<init>(androidx.appcompat.widget.g1, android.content.Context, androidx.appcompat.app.ActionBar$c, boolean):void");
        }

        /* renamed from: a */
        public void m40207a(ActionBar.AbstractC1501c cVar) {
            this.f1361l = cVar;
            m40205c();
        }

        /* renamed from: b */
        public ActionBar.AbstractC1501c m40206b() {
            return this.f1361l;
        }

        /* renamed from: c */
        public void m40205c() {
            ActionBar.AbstractC1501c cVar = this.f1361l;
            View b = cVar.m40958b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1364o = b;
                TextView textView = this.f1362m;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1363n;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1363n.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1364o;
            if (view != null) {
                removeView(view);
                this.f1364o = null;
            }
            Drawable c = cVar.m40957c();
            CharSequence d = cVar.m40956d();
            if (c != null) {
                if (this.f1363n == null) {
                    C1696n nVar = new C1696n(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    nVar.setLayoutParams(layoutParams);
                    addView(nVar, 0);
                    this.f1363n = nVar;
                }
                this.f1363n.setImageDrawable(c);
                this.f1363n.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1363n;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1363n.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1362m == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C6379a.f13099e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1362m = appCompatTextView;
                }
                this.f1362m.setText(d);
                this.f1362m.setVisibility(0);
            } else {
                TextView textView2 = this.f1362m;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1362m.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1363n;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m40959a());
            }
            if (!z) {
                charSequence = cVar.m40959a();
            }
            C1715r1.m40049a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C1671g1.this.f1352p > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C1671g1.this.f1352p;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m40212b() {
        C1736w wVar = new C1736w(getContext(), null, C6379a.f13102h);
        wVar.setLayoutParams(new C1733v0.C1734a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    /* renamed from: d */
    private boolean m40210d() {
        Spinner spinner = this.f1350n;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m40209e() {
        if (!m40210d()) {
            if (this.f1350n == null) {
                this.f1350n = m40212b();
            }
            removeView(this.f1349m);
            addView(this.f1350n, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1350n.getAdapter() == null) {
                this.f1350n.setAdapter((SpinnerAdapter) new C1673b());
            }
            Runnable runnable = this.f1347k;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1347k = null;
            }
            this.f1350n.setSelection(this.f1355s);
        }
    }

    /* renamed from: f */
    private boolean m40208f() {
        if (!m40210d()) {
            return false;
        }
        removeView(this.f1350n);
        addView(this.f1349m, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1350n.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void m40213a(int i) {
        View childAt = this.f1349m.getChildAt(i);
        Runnable runnable = this.f1347k;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC1672a aVar = new RunnableC1672a(childAt);
        this.f1347k = aVar;
        post(aVar);
    }

    /* renamed from: c */
    C1675d m40211c(ActionBar.AbstractC1501c cVar, boolean z) {
        C1675d dVar = new C1675d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1354r));
        } else {
            dVar.setFocusable(true);
            if (this.f1348l == null) {
                this.f1348l = new View$OnClickListenerC1674c();
            }
            dVar.setOnClickListener(this.f1348l);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1347k;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C8094a b = C8094a.m20628b(getContext());
        setContentHeight(b.m20624f());
        this.f1353q = b.m20625e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1347k;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C1675d) view).m40206b().m40955e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = true;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f1349m.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1352p = -1;
        } else {
            if (childCount > 2) {
                this.f1352p = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f1352p = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1352p = Math.min(this.f1352p, this.f1353q);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1354r, 1073741824);
        if (z || !this.f1351o) {
            z2 = false;
        }
        if (z2) {
            this.f1349m.measure(0, makeMeasureSpec);
            if (this.f1349m.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m40209e();
            } else {
                m40208f();
            }
        } else {
            m40208f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1355s);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1351o = z;
    }

    public void setContentHeight(int i) {
        this.f1354r = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        boolean z;
        this.f1355s = i;
        int childCount = this.f1349m.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f1349m.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                m40213a(i);
            }
        }
        Spinner spinner = this.f1350n;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
