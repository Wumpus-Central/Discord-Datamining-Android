package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.C2733w0;
import androidx.core.widget.C2800k;
import com.facebook.react.uimanager.ViewDefaults;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.reflect.Method;
import p052d.C6379a;
import p052d.C6388j;
import p164j.AbstractC9457e;

/* renamed from: androidx.appcompat.widget.z0 */
/* loaded from: classes.dex */
public class C1755z0 implements AbstractC9457e {

    /* renamed from: Q */
    private static Method f35293Q;

    /* renamed from: R */
    private static Method f35294R;

    /* renamed from: S */
    private static Method f35295S;

    /* renamed from: A */
    private int f35296A;

    /* renamed from: B */
    private DataSetObserver f35297B;

    /* renamed from: C */
    private View f35298C;

    /* renamed from: D */
    private Drawable f35299D;

    /* renamed from: E */
    private AdapterView.OnItemClickListener f35300E;

    /* renamed from: F */
    private AdapterView.OnItemSelectedListener f35301F;

    /* renamed from: G */
    final RunnableC1762g f35302G;

    /* renamed from: H */
    private final View$OnTouchListenerC1761f f35303H;

    /* renamed from: I */
    private final C1760e f35304I;

    /* renamed from: J */
    private final RunnableC1758c f35305J;

    /* renamed from: K */
    private Runnable f35306K;

    /* renamed from: L */
    final Handler f35307L;

    /* renamed from: M */
    private final Rect f35308M;

    /* renamed from: N */
    private Rect f35309N;

    /* renamed from: O */
    private boolean f35310O;

    /* renamed from: P */
    PopupWindow f35311P;

    /* renamed from: k */
    private Context f1560k;

    /* renamed from: l */
    private ListAdapter f1561l;

    /* renamed from: m */
    C1717s0 f1562m;

    /* renamed from: n */
    private int f1563n;

    /* renamed from: o */
    private int f1564o;

    /* renamed from: p */
    private int f1565p;

    /* renamed from: q */
    private int f1566q;

    /* renamed from: r */
    private int f1567r;

    /* renamed from: s */
    private boolean f1568s;

    /* renamed from: t */
    private boolean f1569t;

    /* renamed from: u */
    private boolean f1570u;

    /* renamed from: v */
    private int f1571v;

    /* renamed from: w */
    private boolean f1572w;

    /* renamed from: x */
    private boolean f1573x;

    /* renamed from: y */
    int f1574y;

    /* renamed from: z */
    private View f1575z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.z0$a */
    /* loaded from: classes.dex */
    public class RunnableC1756a implements Runnable {
        RunnableC1756a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View r = C1755z0.this.m39927r();
            if (r != null && r.getWindowToken() != null) {
                C1755z0.this.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.z0$b */
    /* loaded from: classes.dex */
    public class C1757b implements AdapterView.OnItemSelectedListener {
        C1757b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C1717s0 s0Var;
            if (i != -1 && (s0Var = C1755z0.this.f1562m) != null) {
                s0Var.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.z0$c */
    /* loaded from: classes.dex */
    public class RunnableC1758c implements Runnable {
        RunnableC1758c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1755z0.this.m39929p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.z0$d */
    /* loaded from: classes.dex */
    public class C1759d extends DataSetObserver {
        C1759d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C1755z0.this.isShowing()) {
                C1755z0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C1755z0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.z0$e */
    /* loaded from: classes.dex */
    public class C1760e implements AbsListView.OnScrollListener {
        C1760e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C1755z0.this.m39920y() && C1755z0.this.f35311P.getContentView() != null) {
                C1755z0 z0Var = C1755z0.this;
                z0Var.f35307L.removeCallbacks(z0Var.f35302G);
                C1755z0.this.f35302G.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.z0$f */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC1761f implements View.OnTouchListener {
        View$OnTouchListenerC1761f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C1755z0.this.f35311P) != null && popupWindow.isShowing() && x >= 0 && x < C1755z0.this.f35311P.getWidth() && y >= 0 && y < C1755z0.this.f35311P.getHeight()) {
                C1755z0 z0Var = C1755z0.this;
                z0Var.f35307L.postDelayed(z0Var.f35302G, 250L);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C1755z0 z0Var2 = C1755z0.this;
                z0Var2.f35307L.removeCallbacks(z0Var2.f35302G);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.z0$g */
    /* loaded from: classes.dex */
    public class RunnableC1762g implements Runnable {
        RunnableC1762g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1717s0 s0Var = C1755z0.this.f1562m;
            if (s0Var != null && C2733w0.m37030T(s0Var) && C1755z0.this.f1562m.getCount() > C1755z0.this.f1562m.getChildCount()) {
                int childCount = C1755z0.this.f1562m.getChildCount();
                C1755z0 z0Var = C1755z0.this;
                if (childCount <= z0Var.f1574y) {
                    z0Var.f35311P.setInputMethodMode(2);
                    C1755z0.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f35293Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f35295S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f35294R = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C1755z0(Context context) {
        this(context, null, C6379a.f37739E);
    }

    /* renamed from: A */
    private void m39952A() {
        View view = this.f1575z;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1575z);
            }
        }
    }

    /* renamed from: L */
    private void m39941L(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f35293Q;
            if (method != null) {
                try {
                    method.invoke(this.f35311P, Boolean.valueOf(z));
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f35311P.setIsClippedToScreen(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    private int m39930o() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        if (this.f1562m == null) {
            Context context = this.f1560k;
            this.f35306K = new RunnableC1756a();
            C1717s0 q = mo39928q(context, !this.f35310O);
            this.f1562m = q;
            Drawable drawable = this.f35299D;
            if (drawable != null) {
                q.setSelector(drawable);
            }
            this.f1562m.setAdapter(this.f1561l);
            this.f1562m.setOnItemClickListener(this.f35300E);
            this.f1562m.setFocusable(true);
            this.f1562m.setFocusableInTouchMode(true);
            this.f1562m.setOnItemSelectedListener(new C1757b());
            this.f1562m.setOnScrollListener(this.f35304I);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f35301F;
            if (onItemSelectedListener != null) {
                this.f1562m.setOnItemSelectedListener(onItemSelectedListener);
            }
            C1717s0 s0Var = this.f1562m;
            View view = this.f1575z;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.f35296A;
                if (i5 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(s0Var, layoutParams);
                } else if (i5 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f35296A);
                } else {
                    linearLayout.addView(s0Var, layoutParams);
                    linearLayout.addView(view);
                }
                int i6 = this.f1564o;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                s0Var = linearLayout;
            } else {
                i = 0;
            }
            this.f35311P.setContentView(s0Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f35311P.getContentView();
            View view2 = this.f1575z;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f35311P.getBackground();
        if (background != null) {
            background.getPadding(this.f35308M);
            Rect rect = this.f35308M;
            int i7 = rect.top;
            i2 = rect.bottom + i7;
            if (!this.f1568s) {
                this.f1566q = -i7;
            }
        } else {
            this.f35308M.setEmpty();
            i2 = 0;
        }
        if (this.f35311P.getInputMethodMode() != 2) {
            z = false;
        }
        int s = m39926s(m39927r(), this.f1566q, z);
        if (this.f1572w || this.f1563n == -1) {
            return s + i2;
        }
        int i8 = this.f1564o;
        if (i8 == -2) {
            int i9 = this.f1560k.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f35308M;
            i3 = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i8 != -1) {
            i3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            int i10 = this.f1560k.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f35308M;
            i3 = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
        }
        int d = this.f1562m.mo40045d(i3, 0, -1, s - i, -1);
        if (d > 0) {
            i += i2 + this.f1562m.getPaddingTop() + this.f1562m.getPaddingBottom();
        }
        return d + i;
    }

    /* renamed from: s */
    private int m39926s(View view, int i, boolean z) {
        int maxAvailableHeight;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f35294R;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.f35311P, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.f35311P.getMaxAvailableHeight(view, i);
        }
        maxAvailableHeight = this.f35311P.getMaxAvailableHeight(view, i, z);
        return maxAvailableHeight;
    }

    /* renamed from: B */
    public void m39951B(View view) {
        this.f35298C = view;
    }

    /* renamed from: C */
    public void m39950C(int i) {
        this.f35311P.setAnimationStyle(i);
    }

    /* renamed from: D */
    public void m39949D(int i) {
        Drawable background = this.f35311P.getBackground();
        if (background != null) {
            background.getPadding(this.f35308M);
            Rect rect = this.f35308M;
            this.f1564o = rect.left + rect.right + i;
            return;
        }
        m39938O(i);
    }

    /* renamed from: E */
    public void m39948E(int i) {
        this.f1571v = i;
    }

    /* renamed from: F */
    public void m39947F(Rect rect) {
        this.f35309N = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: G */
    public void m39946G(int i) {
        this.f35311P.setInputMethodMode(i);
    }

    /* renamed from: H */
    public void m39945H(boolean z) {
        this.f35310O = z;
        this.f35311P.setFocusable(z);
    }

    /* renamed from: I */
    public void m39944I(PopupWindow.OnDismissListener onDismissListener) {
        this.f35311P.setOnDismissListener(onDismissListener);
    }

    /* renamed from: J */
    public void m39943J(AdapterView.OnItemClickListener onItemClickListener) {
        this.f35300E = onItemClickListener;
    }

    /* renamed from: K */
    public void m39942K(boolean z) {
        this.f1570u = true;
        this.f1569t = z;
    }

    /* renamed from: M */
    public void m39940M(int i) {
        this.f35296A = i;
    }

    /* renamed from: N */
    public void m39939N(int i) {
        C1717s0 s0Var = this.f1562m;
        if (isShowing() && s0Var != null) {
            s0Var.setListSelectionHidden(false);
            s0Var.setSelection(i);
            if (s0Var.getChoiceMode() != 0) {
                s0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: O */
    public void m39938O(int i) {
        this.f1564o = i;
    }

    /* renamed from: b */
    public void m39937b(Drawable drawable) {
        this.f35311P.setBackgroundDrawable(drawable);
    }

    /* renamed from: c */
    public int m39936c() {
        return this.f1565p;
    }

    /* renamed from: d */
    public void m39935d(int i) {
        this.f1565p = i;
    }

    @Override // p164j.AbstractC9457e
    public void dismiss() {
        this.f35311P.dismiss();
        m39952A();
        this.f35311P.setContentView(null);
        this.f1562m = null;
        this.f35307L.removeCallbacks(this.f35302G);
    }

    /* renamed from: f */
    public Drawable m39934f() {
        return this.f35311P.getBackground();
    }

    /* renamed from: h */
    public void m39933h(int i) {
        this.f1566q = i;
        this.f1568s = true;
    }

    @Override // p164j.AbstractC9457e
    public boolean isShowing() {
        return this.f35311P.isShowing();
    }

    /* renamed from: k */
    public int m39932k() {
        if (!this.f1568s) {
            return 0;
        }
        return this.f1566q;
    }

    /* renamed from: l */
    public void mo39931l(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f35297B;
        if (dataSetObserver == null) {
            this.f35297B = new C1759d();
        } else {
            ListAdapter listAdapter2 = this.f1561l;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1561l = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f35297B);
        }
        C1717s0 s0Var = this.f1562m;
        if (s0Var != null) {
            s0Var.setAdapter(this.f1561l);
        }
    }

    @Override // p164j.AbstractC9457e
    /* renamed from: n */
    public ListView mo16201n() {
        return this.f1562m;
    }

    /* renamed from: p */
    public void m39929p() {
        C1717s0 s0Var = this.f1562m;
        if (s0Var != null) {
            s0Var.setListSelectionHidden(true);
            s0Var.requestLayout();
        }
    }

    /* renamed from: q */
    C1717s0 mo39928q(Context context, boolean z) {
        return new C1717s0(context, z);
    }

    /* renamed from: r */
    public View m39927r() {
        return this.f35298C;
    }

    @Override // p164j.AbstractC9457e
    public void show() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int o = m39930o();
        boolean y = m39920y();
        C2800k.m36694b(this.f35311P, this.f1567r);
        boolean z2 = true;
        if (!this.f35311P.isShowing()) {
            int i5 = this.f1564o;
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = m39927r().getWidth();
            }
            int i6 = this.f1563n;
            if (i6 == -1) {
                o = -1;
            } else if (i6 != -2) {
                o = i6;
            }
            this.f35311P.setWidth(i5);
            this.f35311P.setHeight(o);
            m39941L(true);
            PopupWindow popupWindow = this.f35311P;
            if (this.f1573x || this.f1572w) {
                z = false;
            } else {
                z = true;
            }
            popupWindow.setOutsideTouchable(z);
            this.f35311P.setTouchInterceptor(this.f35303H);
            if (this.f1570u) {
                C2800k.m36695a(this.f35311P, this.f1569t);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f35295S;
                if (method != null) {
                    try {
                        method.invoke(this.f35311P, this.f35309N);
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f35311P.setEpicenterBounds(this.f35309N);
            }
            C2800k.m36693c(this.f35311P, m39927r(), this.f1565p, this.f1566q, this.f1571v);
            this.f1562m.setSelection(-1);
            if (!this.f35310O || this.f1562m.isInTouchMode()) {
                m39929p();
            }
            if (!this.f35310O) {
                this.f35307L.post(this.f35305J);
            }
        } else if (C2733w0.m37030T(m39927r())) {
            int i7 = this.f1564o;
            if (i7 == -1) {
                i7 = -1;
            } else if (i7 == -2) {
                i7 = m39927r().getWidth();
            }
            int i8 = this.f1563n;
            if (i8 == -1) {
                if (!y) {
                    o = -1;
                }
                if (y) {
                    PopupWindow popupWindow2 = this.f35311P;
                    if (this.f1564o == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow2.setWidth(i4);
                    this.f35311P.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.f35311P;
                    if (this.f1564o == -1) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    popupWindow3.setWidth(i3);
                    this.f35311P.setHeight(-1);
                }
            } else if (i8 != -2) {
                o = i8;
            }
            PopupWindow popupWindow4 = this.f35311P;
            if (this.f1573x || this.f1572w) {
                z2 = false;
            }
            popupWindow4.setOutsideTouchable(z2);
            PopupWindow popupWindow5 = this.f35311P;
            View r = m39927r();
            int i9 = this.f1565p;
            int i10 = this.f1566q;
            if (i7 < 0) {
                i = -1;
            } else {
                i = i7;
            }
            if (o < 0) {
                i2 = -1;
            } else {
                i2 = o;
            }
            popupWindow5.update(r, i9, i10, i, i2);
        }
    }

    /* renamed from: t */
    public Object m39925t() {
        if (!isShowing()) {
            return null;
        }
        return this.f1562m.getSelectedItem();
    }

    /* renamed from: u */
    public long m39924u() {
        if (!isShowing()) {
            return Long.MIN_VALUE;
        }
        return this.f1562m.getSelectedItemId();
    }

    /* renamed from: v */
    public int m39923v() {
        if (!isShowing()) {
            return -1;
        }
        return this.f1562m.getSelectedItemPosition();
    }

    /* renamed from: w */
    public View m39922w() {
        if (!isShowing()) {
            return null;
        }
        return this.f1562m.getSelectedView();
    }

    /* renamed from: x */
    public int m39921x() {
        return this.f1564o;
    }

    /* renamed from: y */
    public boolean m39920y() {
        return this.f35311P.getInputMethodMode() == 2;
    }

    /* renamed from: z */
    public boolean m39919z() {
        return this.f35310O;
    }

    public C1755z0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C1755z0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1563n = -2;
        this.f1564o = -2;
        this.f1567r = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        this.f1571v = 0;
        this.f1572w = false;
        this.f1573x = false;
        this.f1574y = ViewDefaults.NUMBER_OF_LINES;
        this.f35296A = 0;
        this.f35302G = new RunnableC1762g();
        this.f35303H = new View$OnTouchListenerC1761f();
        this.f35304I = new C1760e();
        this.f35305J = new RunnableC1758c();
        this.f35308M = new Rect();
        this.f1560k = context;
        this.f35307L = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6388j.f13292l1, i, i2);
        this.f1565p = obtainStyledAttributes.getDimensionPixelOffset(C6388j.f13297m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C6388j.f13302n1, 0);
        this.f1566q = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1568s = true;
        }
        obtainStyledAttributes.recycle();
        C1702p pVar = new C1702p(context, attributeSet, i, i2);
        this.f35311P = pVar;
        pVar.setInputMethodMode(1);
    }
}
