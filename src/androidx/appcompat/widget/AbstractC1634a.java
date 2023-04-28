package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2681o2;
import androidx.core.view.C2674n2;
import androidx.core.view.C2733w0;
import p052d.C6379a;
import p052d.C6388j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC1634a extends ViewGroup {

    /* renamed from: k */
    protected final C0018a f1269k;

    /* renamed from: l */
    protected final Context f1270l;

    /* renamed from: m */
    protected ActionMenuView f1271m;

    /* renamed from: n */
    protected C1640c f1272n;

    /* renamed from: o */
    protected int f1273o;

    /* renamed from: p */
    protected C2674n2 f1274p;

    /* renamed from: q */
    private boolean f1275q;

    /* renamed from: r */
    private boolean f1276r;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    protected class C0018a implements AbstractC2681o2 {

        /* renamed from: a */
        private boolean f1277a = false;

        /* renamed from: b */
        int f1278b;

        protected C0018a() {
        }

        @Override // androidx.core.view.AbstractC2681o2
        /* renamed from: a */
        public void mo37153a(View view) {
            this.f1277a = true;
        }

        @Override // androidx.core.view.AbstractC2681o2
        /* renamed from: b */
        public void mo20596b(View view) {
            if (!this.f1277a) {
                AbstractC1634a aVar = AbstractC1634a.this;
                aVar.f1274p = null;
                AbstractC1634a.super.setVisibility(this.f1278b);
            }
        }

        @Override // androidx.core.view.AbstractC2681o2
        /* renamed from: c */
        public void mo20595c(View view) {
            AbstractC1634a.super.setVisibility(0);
            this.f1277a = false;
        }

        /* renamed from: d */
        public C0018a m40329d(C2674n2 n2Var, int i) {
            AbstractC1634a.this.f1274p = n2Var;
            this.f1278b = i;
            return this;
        }
    }

    AbstractC1634a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static int m40332d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m40333c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m40331e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: f */
    public C2674n2 mo40330f(int i, long j) {
        C2674n2 n2Var = this.f1274p;
        if (n2Var != null) {
            n2Var.m37171c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C2674n2 b = C2733w0.m37015e(this).m37172b(1.0f);
            b.m37168f(j);
            b.m37166h(this.f1269k.m40329d(b, i));
            return b;
        }
        C2674n2 b2 = C2733w0.m37015e(this).m37172b(0.0f);
        b2.m37168f(j);
        b2.m37166h(this.f1269k.m40329d(b2, i));
        return b2;
    }

    public int getAnimatedVisibility() {
        if (this.f1274p != null) {
            return this.f1269k.f1278b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1273o;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C6388j.f13235a, C6379a.f13097c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C6388j.f13280j, 0));
        obtainStyledAttributes.recycle();
        C1640c cVar = this.f1272n;
        if (cVar != null) {
            cVar.m40320F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1276r = false;
        }
        if (!this.f1276r) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1276r = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1276r = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1275q = false;
        }
        if (!this.f1275q) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1275q = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1275q = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1273o = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C2674n2 n2Var = this.f1274p;
            if (n2Var != null) {
                n2Var.m37171c();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1634a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1269k = new C0018a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C6379a.f13095a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1270l = context;
        } else {
            this.f1270l = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
