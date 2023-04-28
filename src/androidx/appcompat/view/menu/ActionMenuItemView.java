package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.AbstractC1586k;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.widget.AbstractView$OnTouchListenerC1728u0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1715r1;
import p052d.C6388j;
import p164j.AbstractC9457e;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements AbstractC1586k.AbstractC1587a, View.OnClickListener, ActionMenuView.AbstractC1598a {

    /* renamed from: k */
    C1579g f907k;

    /* renamed from: l */
    private CharSequence f908l;

    /* renamed from: m */
    private Drawable f909m;

    /* renamed from: n */
    C1575e.AbstractC1577b f910n;

    /* renamed from: o */
    private AbstractView$OnTouchListenerC1728u0 f911o;

    /* renamed from: p */
    AbstractC1565b f912p;

    /* renamed from: q */
    private boolean f913q;

    /* renamed from: r */
    private boolean f914r;

    /* renamed from: s */
    private int f915s;

    /* renamed from: t */
    private int f916t;

    /* renamed from: u */
    private int f917u;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C1564a extends AbstractView$OnTouchListenerC1728u0 {
        public C1564a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1728u0
        /* renamed from: b */
        public AbstractC9457e mo39977b() {
            AbstractC1565b bVar = ActionMenuItemView.this.f912p;
            if (bVar != null) {
                return bVar.mo40295a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1728u0
        /* renamed from: c */
        protected boolean mo39976c() {
            AbstractC9457e b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C1575e.AbstractC1577b bVar = actionMenuItemView.f910n;
            if (bVar == null || !bVar.mo40518b(actionMenuItemView.f907k) || (b = mo39977b()) == null || !b.isShowing()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1565b {
        /* renamed from: a */
        public abstract AbstractC9457e mo40295a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: f */
    private boolean m40701f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i2 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m40700g() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f908l);
        if (this.f909m != null && (!this.f907k.m40623B() || (!this.f913q && !this.f914r))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.f908l;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f907k.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f907k.getTitle();
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f907k.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence3 = this.f907k.getTitle();
            }
            C1715r1.m40049a(this, charSequence3);
            return;
        }
        C1715r1.m40049a(this, tooltipText);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC1598a
    /* renamed from: a */
    public boolean mo40294a() {
        return m40702e();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC1598a
    /* renamed from: b */
    public boolean mo40293b() {
        return m40702e() && this.f907k.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k.AbstractC1587a
    /* renamed from: c */
    public void mo27966c(C1579g gVar, int i) {
        int i2;
        this.f907k = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.m40616i(this));
        setId(gVar.getItemId());
        if (gVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f911o == null) {
            this.f911o = new C1564a();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k.AbstractC1587a
    /* renamed from: d */
    public boolean mo27965d() {
        return true;
    }

    /* renamed from: e */
    public boolean m40702e() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k.AbstractC1587a
    public C1579g getItemData() {
        return this.f907k;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1575e.AbstractC1577b bVar = this.f910n;
        if (bVar != null) {
            bVar.mo40518b(this.f907k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f913q = m40701f();
        m40700g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean e = m40702e();
        if (e && (i4 = this.f916t) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f915s);
        } else {
            i3 = this.f915s;
        }
        if (mode != 1073741824 && this.f915s > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!e && this.f909m != null) {
            super.setPadding((getMeasuredWidth() - this.f909m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC1728u0 u0Var;
        if (!this.f907k.hasSubMenu() || (u0Var = this.f911o) == null || !u0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f914r != z) {
            this.f914r = z;
            C1579g gVar = this.f907k;
            if (gVar != null) {
                gVar.m40622c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f909m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f917u;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m40700g();
    }

    public void setItemInvoker(C1575e.AbstractC1577b bVar) {
        this.f910n = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f916t = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC1565b bVar) {
        this.f912p = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f908l = charSequence;
        m40700g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f913q = m40701f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6388j.f13340v, i, 0);
        this.f915s = obtainStyledAttributes.getDimensionPixelSize(C6388j.f13345w, 0);
        obtainStyledAttributes.recycle();
        this.f917u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f916t = -1;
        setSaveEnabled(false);
    }
}
