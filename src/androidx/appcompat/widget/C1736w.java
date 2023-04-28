package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC1509a;
import androidx.core.view.C2733w0;
import p052d.C6379a;
import p071e.C6525a;
import p164j.AbstractC9457e;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public class C1736w extends Spinner {

    /* renamed from: s */
    private static final int[] f1536s = {16843505};

    /* renamed from: k */
    private final AppCompatBackgroundHelper f1537k;

    /* renamed from: l */
    private final Context f1538l;

    /* renamed from: m */
    private AbstractView$OnTouchListenerC1728u0 f1539m;

    /* renamed from: n */
    private SpinnerAdapter f1540n;

    /* renamed from: o */
    private final boolean f1541o;

    /* renamed from: p */
    private AbstractC1747g f1542p;

    /* renamed from: q */
    int f1543q;

    /* renamed from: r */
    final Rect f1544r;

    /* renamed from: androidx.appcompat.widget.w$a */
    /* loaded from: classes.dex */
    class C1737a extends AbstractView$OnTouchListenerC1728u0 {

        /* renamed from: t */
        final /* synthetic */ C1741e f1545t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1737a(View view, C1741e eVar) {
            super(view);
            this.f1545t = eVar;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1728u0
        /* renamed from: b */
        public AbstractC9457e mo39977b() {
            return this.f1545t;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1728u0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo39976c() {
            if (C1736w.this.getInternalPopup().isShowing()) {
                return true;
            }
            C1736w.this.m39978b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC1738b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC1738b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C1736w.this.getInternalPopup().isShowing()) {
                C1736w.this.m39978b();
            }
            ViewTreeObserver viewTreeObserver = C1736w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    /* loaded from: classes.dex */
    class DialogInterface$OnClickListenerC1739c implements AbstractC1747g, DialogInterface.OnClickListener {

        /* renamed from: k */
        DialogInterfaceC1509a f1548k;

        /* renamed from: l */
        private ListAdapter f1549l;

        /* renamed from: m */
        private CharSequence f1550m;

        DialogInterface$OnClickListenerC1739c() {
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: b */
        public void mo39969b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: c */
        public int mo39968c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: d */
        public void mo39967d(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        public void dismiss() {
            DialogInterfaceC1509a aVar = this.f1548k;
            if (aVar != null) {
                aVar.dismiss();
                this.f1548k = null;
            }
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: e */
        public CharSequence mo39966e() {
            return this.f1550m;
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: f */
        public Drawable mo39965f() {
            return null;
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: g */
        public void mo39964g(CharSequence charSequence) {
            this.f1550m = charSequence;
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: h */
        public void mo39963h(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: i */
        public void mo39962i(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        public boolean isShowing() {
            DialogInterfaceC1509a aVar = this.f1548k;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: j */
        public void mo39961j(int i, int i2) {
            if (this.f1549l != null) {
                DialogInterfaceC1509a.C0014a aVar = new DialogInterfaceC1509a.C0014a(C1736w.this.getPopupContext());
                CharSequence charSequence = this.f1550m;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                DialogInterfaceC1509a create = aVar.m40912e(this.f1549l, C1736w.this.getSelectedItemPosition(), this).create();
                this.f1548k = create;
                ListView e = create.m40918e();
                e.setTextDirection(i);
                e.setTextAlignment(i2);
                this.f1548k.show();
            }
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: k */
        public int mo39960k() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: l */
        public void mo39931l(ListAdapter listAdapter) {
            this.f1549l = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1736w.this.setSelection(i);
            if (C1736w.this.getOnItemClickListener() != null) {
                C1736w.this.performItemClick(null, i, this.f1549l.getItemId(i));
            }
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.w$d */
    /* loaded from: classes.dex */
    public static class C1740d implements ListAdapter, SpinnerAdapter {

        /* renamed from: k */
        private SpinnerAdapter f1552k;

        /* renamed from: l */
        private ListAdapter f1553l;

        public C1740d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1552k = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1553l = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof AbstractC1686j1) {
                AbstractC1686j1 j1Var = (AbstractC1686j1) spinnerAdapter;
                if (j1Var.getDropDownViewTheme() == null) {
                    j1Var.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1553l;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1552k;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1552k;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1552k;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1552k;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1552k;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1553l;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1552k;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1552k;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$e */
    /* loaded from: classes.dex */
    class C1741e extends C1755z0 implements AbstractC1747g {

        /* renamed from: T */
        private CharSequence f35288T;

        /* renamed from: U */
        ListAdapter f35289U;

        /* renamed from: V */
        private final Rect f35290V = new Rect();

        /* renamed from: W */
        private int f35291W;

        /* renamed from: androidx.appcompat.widget.w$e$a */
        /* loaded from: classes.dex */
        class C1742a implements AdapterView.OnItemClickListener {

            /* renamed from: k */
            final /* synthetic */ C1736w f1554k;

            C1742a(C1736w wVar) {
                this.f1554k = wVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C1736w.this.setSelection(i);
                if (C1736w.this.getOnItemClickListener() != null) {
                    C1741e eVar = C1741e.this;
                    C1736w.this.performItemClick(view, i, eVar.f35289U.getItemId(i));
                }
                C1741e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.w$e$b */
        /* loaded from: classes.dex */
        class ViewTreeObserver$OnGlobalLayoutListenerC1743b implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerC1743b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C1741e eVar = C1741e.this;
                if (!eVar.m39972S(C1736w.this)) {
                    C1741e.this.dismiss();
                    return;
                }
                C1741e.this.m39974Q();
                C1741e.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.w$e$c */
        /* loaded from: classes.dex */
        class C1744c implements PopupWindow.OnDismissListener {

            /* renamed from: k */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1557k;

            C1744c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1557k = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C1736w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1557k);
                }
            }
        }

        public C1741e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            m39951B(C1736w.this);
            m39945H(true);
            m39940M(0);
            m39943J(new C1742a(C1736w.this));
        }

        /* renamed from: Q */
        void m39974Q() {
            int i;
            int i2;
            Drawable f = m39934f();
            if (f != null) {
                f.getPadding(C1736w.this.f1544r);
                if (C1735v1.m39981b(C1736w.this)) {
                    i = C1736w.this.f1544r.right;
                } else {
                    i = -C1736w.this.f1544r.left;
                }
            } else {
                Rect rect = C1736w.this.f1544r;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = C1736w.this.getPaddingLeft();
            int paddingRight = C1736w.this.getPaddingRight();
            int width = C1736w.this.getWidth();
            C1736w wVar = C1736w.this;
            int i3 = wVar.f1543q;
            if (i3 == -2) {
                int a = wVar.m39979a((SpinnerAdapter) this.f35289U, m39934f());
                int i4 = C1736w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C1736w.this.f1544r;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a > i5) {
                    a = i5;
                }
                m39949D(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                m39949D((width - paddingLeft) - paddingRight);
            } else {
                m39949D(i3);
            }
            if (C1735v1.m39981b(C1736w.this)) {
                i2 = i + (((width - paddingRight) - m39921x()) - m39973R());
            } else {
                i2 = i + paddingLeft + m39973R();
            }
            m39935d(i2);
        }

        /* renamed from: R */
        public int m39973R() {
            return this.f35291W;
        }

        /* renamed from: S */
        boolean m39972S(View view) {
            return C2733w0.m37030T(view) && view.getGlobalVisibleRect(this.f35290V);
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: e */
        public CharSequence mo39966e() {
            return this.f35288T;
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: g */
        public void mo39964g(CharSequence charSequence) {
            this.f35288T = charSequence;
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: i */
        public void mo39962i(int i) {
            this.f35291W = i;
        }

        @Override // androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: j */
        public void mo39961j(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            m39974Q();
            m39946G(2);
            super.show();
            ListView n = mo16201n();
            n.setChoiceMode(1);
            n.setTextDirection(i);
            n.setTextAlignment(i2);
            m39939N(C1736w.this.getSelectedItemPosition());
            if (!isShowing && (viewTreeObserver = C1736w.this.getViewTreeObserver()) != null) {
                ViewTreeObserver$OnGlobalLayoutListenerC1743b bVar = new ViewTreeObserver$OnGlobalLayoutListenerC1743b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                m39944I(new C1744c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.C1755z0, androidx.appcompat.widget.C1736w.AbstractC1747g
        /* renamed from: l */
        public void mo39931l(ListAdapter listAdapter) {
            super.mo39931l(listAdapter);
            this.f35289U = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w$f */
    /* loaded from: classes.dex */
    public static class C1745f extends View.BaseSavedState {
        public static final Parcelable.Creator<C1745f> CREATOR = new C1746a();

        /* renamed from: k */
        boolean f1559k;

        /* renamed from: androidx.appcompat.widget.w$f$a */
        /* loaded from: classes.dex */
        class C1746a implements Parcelable.Creator<C1745f> {
            C1746a() {
            }

            /* renamed from: a */
            public C1745f createFromParcel(Parcel parcel) {
                return new C1745f(parcel);
            }

            /* renamed from: b */
            public C1745f[] newArray(int i) {
                return new C1745f[i];
            }
        }

        C1745f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1559k ? (byte) 1 : (byte) 0);
        }

        C1745f(Parcel parcel) {
            super(parcel);
            this.f1559k = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w$g */
    /* loaded from: classes.dex */
    public interface AbstractC1747g {
        /* renamed from: b */
        void mo39969b(Drawable drawable);

        /* renamed from: c */
        int mo39968c();

        /* renamed from: d */
        void mo39967d(int i);

        void dismiss();

        /* renamed from: e */
        CharSequence mo39966e();

        /* renamed from: f */
        Drawable mo39965f();

        /* renamed from: g */
        void mo39964g(CharSequence charSequence);

        /* renamed from: h */
        void mo39963h(int i);

        /* renamed from: i */
        void mo39962i(int i);

        boolean isShowing();

        /* renamed from: j */
        void mo39961j(int i, int i2);

        /* renamed from: k */
        int mo39960k();

        /* renamed from: l */
        void mo39931l(ListAdapter listAdapter);
    }

    public C1736w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f37745K);
    }

    /* renamed from: a */
    int m39979a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1544r);
        Rect rect = this.f1544r;
        return i2 + rect.left + rect.right;
    }

    /* renamed from: b */
    void m39978b() {
        this.f1542p.mo39961j(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1537k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40509b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        AbstractC1747g gVar = this.f1542p;
        if (gVar != null) {
            return gVar.mo39968c();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        AbstractC1747g gVar = this.f1542p;
        if (gVar != null) {
            return gVar.mo39960k();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1542p != null) {
            return this.f1543q;
        }
        return super.getDropDownWidth();
    }

    final AbstractC1747g getInternalPopup() {
        return this.f1542p;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        AbstractC1747g gVar = this.f1542p;
        if (gVar != null) {
            return gVar.mo39965f();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1538l;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        AbstractC1747g gVar = this.f1542p;
        return gVar != null ? gVar.mo39966e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1537k;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40508c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1537k;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40507d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC1747g gVar = this.f1542p;
        if (gVar != null && gVar.isShowing()) {
            this.f1542p.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1542p != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m39979a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1745f fVar = (C1745f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1559k && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC1738b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        C1745f fVar = new C1745f(super.onSaveInstanceState());
        AbstractC1747g gVar = this.f1542p;
        if (gVar == null || !gVar.isShowing()) {
            z = false;
        } else {
            z = true;
        }
        fVar.f1559k = z;
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC1728u0 u0Var = this.f1539m;
        if (u0Var == null || !u0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        AbstractC1747g gVar = this.f1542p;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.isShowing()) {
            return true;
        }
        m39978b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1537k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40505f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1537k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40504g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        AbstractC1747g gVar = this.f1542p;
        if (gVar != null) {
            gVar.mo39962i(i);
            this.f1542p.mo39967d(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        AbstractC1747g gVar = this.f1542p;
        if (gVar != null) {
            gVar.mo39963h(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1542p != null) {
            this.f1543q = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        AbstractC1747g gVar = this.f1542p;
        if (gVar != null) {
            gVar.mo39969b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C6525a.m25364b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        AbstractC1747g gVar = this.f1542p;
        if (gVar != null) {
            gVar.mo39964g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1537k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40502i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1537k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40501j(mode);
        }
    }

    public C1736w(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1541o) {
            this.f1540n = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1542p != null) {
            Context context = this.f1538l;
            if (context == null) {
                context = getContext();
            }
            this.f1542p.mo39931l(new C1740d(spinnerAdapter, context.getTheme()));
        }
    }

    public C1736w(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r11 == null) goto L_0x006b;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1736w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1736w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
