package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p052d.C6388j;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: k */
    private int f1265k;

    /* renamed from: l */
    private int f1266l;

    /* renamed from: m */
    private WeakReference<View> f1267m;

    /* renamed from: n */
    private LayoutInflater f1268n;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface AbstractC1633a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View m40336a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1265k != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1268n;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1265k, viewGroup, false);
            int i = this.f1266l;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1267m = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1266l;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1268n;
    }

    public int getLayoutResource() {
        return this.f1265k;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1266l = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1268n = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1265k = i;
    }

    public void setOnInflateListener(AbstractC1633a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1267m;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m40336a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1265k = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6388j.f37859O3, i, 0);
        this.f1266l = obtainStyledAttributes.getResourceId(C6388j.f37874R3, -1);
        this.f1265k = obtainStyledAttributes.getResourceId(C6388j.f37869Q3, 0);
        setId(obtainStyledAttributes.getResourceId(C6388j.f37864P3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
