package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC1586k;
import androidx.appcompat.widget.C1698n1;
import androidx.core.view.C2733w0;
import p052d.C6379a;
import p052d.C6384f;
import p052d.C6385g;
import p052d.C6388j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements AbstractC1586k.AbstractC1587a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A */
    private boolean f35157A;

    /* renamed from: k */
    private C1579g f922k;

    /* renamed from: l */
    private ImageView f923l;

    /* renamed from: m */
    private RadioButton f924m;

    /* renamed from: n */
    private TextView f925n;

    /* renamed from: o */
    private CheckBox f926o;

    /* renamed from: p */
    private TextView f927p;

    /* renamed from: q */
    private ImageView f928q;

    /* renamed from: r */
    private ImageView f929r;

    /* renamed from: s */
    private LinearLayout f930s;

    /* renamed from: t */
    private Drawable f931t;

    /* renamed from: u */
    private int f932u;

    /* renamed from: v */
    private Context f933v;

    /* renamed from: w */
    private boolean f934w;

    /* renamed from: x */
    private Drawable f935x;

    /* renamed from: y */
    private boolean f936y;

    /* renamed from: z */
    private LayoutInflater f937z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f37738D);
    }

    /* renamed from: a */
    private void m40699a(View view) {
        m40698b(view, -1);
    }

    /* renamed from: b */
    private void m40698b(View view, int i) {
        LinearLayout linearLayout = this.f930s;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: e */
    private void m40697e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C6385g.f13204h, (ViewGroup) this, false);
        this.f926o = checkBox;
        m40699a(checkBox);
    }

    /* renamed from: f */
    private void m40696f() {
        ImageView imageView = (ImageView) getInflater().inflate(C6385g.f13205i, (ViewGroup) this, false);
        this.f923l = imageView;
        m40698b(imageView, 0);
    }

    /* renamed from: g */
    private void m40695g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C6385g.f13207k, (ViewGroup) this, false);
        this.f924m = radioButton;
        m40699a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f937z == null) {
            this.f937z = LayoutInflater.from(getContext());
        }
        return this.f937z;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f928q;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f929r;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f929r.getLayoutParams();
            rect.top += this.f929r.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k.AbstractC1587a
    /* renamed from: c */
    public void mo27966c(C1579g gVar, int i) {
        int i2;
        this.f922k = gVar;
        if (gVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(gVar.m40616i(this));
        setCheckable(gVar.isCheckable());
        m40694h(gVar.m40624A(), gVar.m40618g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k.AbstractC1587a
    /* renamed from: d */
    public boolean mo27965d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k.AbstractC1587a
    public C1579g getItemData() {
        return this.f922k;
    }

    /* renamed from: h */
    public void m40694h(boolean z, char c) {
        int i;
        if (!z || !this.f922k.m40624A()) {
            i = 8;
        } else {
            i = 0;
        }
        if (i == 0) {
            this.f927p.setText(this.f922k.m40617h());
        }
        if (this.f927p.getVisibility() != i) {
            this.f927p.setVisibility(i);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C2733w0.m36982u0(this, this.f931t);
        TextView textView = (TextView) findViewById(C6384f.f37781M);
        this.f925n = textView;
        int i = this.f932u;
        if (i != -1) {
            textView.setTextAppearance(this.f933v, i);
        }
        this.f927p = (TextView) findViewById(C6384f.f37774F);
        ImageView imageView = (ImageView) findViewById(C6384f.f37777I);
        this.f928q = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f935x);
        }
        this.f929r = (ImageView) findViewById(C6384f.f13188r);
        this.f930s = (LinearLayout) findViewById(C6384f.f13182l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f923l != null && this.f934w) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f923l.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.f924m != null || this.f926o != null) {
            if (this.f922k.m40612m()) {
                if (this.f924m == null) {
                    m40695g();
                }
                compoundButton = this.f924m;
                view = this.f926o;
            } else {
                if (this.f926o == null) {
                    m40697e();
                }
                compoundButton = this.f926o;
                view = this.f924m;
            }
            if (z) {
                compoundButton.setChecked(this.f922k.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f926o;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f924m;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f922k.m40612m()) {
            if (this.f924m == null) {
                m40695g();
            }
            compoundButton = this.f924m;
        } else {
            if (this.f926o == null) {
                m40697e();
            }
            compoundButton = this.f926o;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f35157A = z;
        this.f934w = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f929r;
        if (imageView != null) {
            if (this.f936y || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.f922k.m40599z() || this.f35157A) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f934w) {
            ImageView imageView = this.f923l;
            if (imageView != null || drawable != null || this.f934w) {
                if (imageView == null) {
                    m40696f();
                }
                if (drawable != null || this.f934w) {
                    ImageView imageView2 = this.f923l;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f923l.getVisibility() != 0) {
                        this.f923l.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f923l.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f925n.setText(charSequence);
            if (this.f925n.getVisibility() != 0) {
                this.f925n.setVisibility(0);
            }
        } else if (this.f925n.getVisibility() != 8) {
            this.f925n.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C1698n1 v = C1698n1.m40105v(getContext(), attributeSet, C6388j.f37881T1, i, 0);
        this.f931t = v.m40120g(C6388j.f37889V1);
        this.f932u = v.m40113n(C6388j.f37885U1, -1);
        this.f934w = v.m40126a(C6388j.f37893W1, false);
        this.f933v = context;
        this.f935x = v.m40120g(C6388j.f37897X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C6379a.f37735A, 0);
        this.f936y = obtainStyledAttributes.hasValue(0);
        v.m40104w();
        obtainStyledAttributes.recycle();
    }
}
