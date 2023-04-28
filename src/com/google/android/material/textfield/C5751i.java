package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C1650d;
import androidx.appcompat.widget.C1755z0;
import com.google.android.material.internal.C5650g;
import com.google.android.material.internal.C5662m;
import p083eb.C6803b;
import p083eb.C6809h;
import p083eb.C6811j;
import p083eb.C6812k;
import p462zb.C14615a;

/* renamed from: com.google.android.material.textfield.i */
/* loaded from: classes3.dex */
public class C5751i extends C1650d {

    /* renamed from: o */
    private final C1755z0 f11341o;

    /* renamed from: p */
    private final AccessibilityManager f11342p;

    /* renamed from: q */
    private final Rect f11343q;

    /* renamed from: r */
    private final int f11344r;

    /* renamed from: com.google.android.material.textfield.i$a */
    /* loaded from: classes3.dex */
    class C5752a implements AdapterView.OnItemClickListener {
        C5752a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object obj;
            C5751i iVar = C5751i.this;
            if (i < 0) {
                obj = iVar.f11341o.m39925t();
            } else {
                obj = iVar.getAdapter().getItem(i);
            }
            C5751i.this.m27463f(obj);
            AdapterView.OnItemClickListener onItemClickListener = C5751i.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C5751i.this.f11341o.m39922w();
                    i = C5751i.this.f11341o.m39923v();
                    j = C5751i.this.f11341o.m39924u();
                }
                onItemClickListener.onItemClick(C5751i.this.f11341o.mo16201n(), view, i, j);
            }
            C5751i.this.f11341o.dismiss();
        }
    }

    public C5751i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14528b);
    }

    /* renamed from: d */
    private TextInputLayout m27465d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: e */
    private int m27464e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout d = m27465d();
        int i = 0;
        if (adapter == null || d == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f11341o.m39923v()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, d);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable f = this.f11341o.m39934f();
        if (f != null) {
            f.getPadding(this.f11343q);
            Rect rect = this.f11343q;
            i2 += rect.left + rect.right;
        }
        return i2 + d.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public <T extends ListAdapter & Filterable> void m27463f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout d = m27465d();
        if (d == null || !d.m27638O()) {
            return super.getHint();
        }
        return d.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d = m27465d();
        if (d != null && d.m27638O() && super.getHint() == null && C5650g.m27868a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m27464e()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f11341o.mo39931l(getAdapter());
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f11342p;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f11341o.show();
        }
    }

    public C5751i(Context context, AttributeSet attributeSet, int i) {
        super(C14615a.m126c(context, attributeSet, i, 0), attributeSet, i);
        this.f11343q = new Rect();
        Context context2 = getContext();
        TypedArray h = C5662m.m27838h(context2, attributeSet, C6812k.f14816r2, i, C6811j.f14657c, new int[0]);
        int i2 = C6812k.f14824s2;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f11344r = h.getResourceId(C6812k.f14832t2, C6809h.f14630j);
        this.f11342p = (AccessibilityManager) context2.getSystemService("accessibility");
        C1755z0 z0Var = new C1755z0(context2);
        this.f11341o = z0Var;
        z0Var.m39945H(true);
        z0Var.m39951B(this);
        z0Var.m39946G(2);
        z0Var.mo39931l(getAdapter());
        z0Var.m39943J(new C5752a());
        int i3 = C6812k.f14840u2;
        if (h.hasValue(i3)) {
            setSimpleItems(h.getResourceId(i3, 0));
        }
        h.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f11344r, strArr));
    }
}
