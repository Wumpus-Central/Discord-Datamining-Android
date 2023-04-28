package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p329s0.C12758a;
import p329s0.C12759b;
import p329s0.C12760c;
import p329s0.C12761d;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private static final CardViewImpl IMPL;
    private final CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: classes.dex */
    class C2090a implements CardViewDelegate {

        /* renamed from: a */
        private Drawable f2396a;

        C2090a() {
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: a */
        public void mo39093a(int i, int i2, int i3, int i4) {
            CardView.this.mShadowBounds.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: b */
        public void mo39092b(Drawable drawable) {
            this.f2396a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: c */
        public boolean mo39091c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: d */
        public Drawable mo39090d() {
            return this.f2396a;
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: e */
        public boolean mo39089e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: f */
        public View mo39088f() {
            return CardView.this;
        }
    }

    static {
        C2091a aVar = new C2091a();
        IMPL = aVar;
        aVar.mo39076l();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.mo39083e(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.mo39079i(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.mo39084d(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.mo39086b(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CardViewImpl cardViewImpl = IMPL;
        if (!(cardViewImpl instanceof C2091a)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.mo39075m(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.mo39082f(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        IMPL.mo39074n(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        IMPL.mo39085c(this.mCardViewDelegate, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.mo39077k(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.mo39073o(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.mo39081g(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.mo39087a(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.mo39078j(this.mCardViewDelegate);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12758a.f28618a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.mo39074n(this.mCardViewDelegate, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        C2090a aVar = new C2090a();
        this.mCardViewDelegate = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12761d.f28622a, i, C12760c.f28621a);
        int i3 = C12761d.f28625d;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C12759b.f28620b);
            } else {
                i2 = getResources().getColor(C12759b.f28619a);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        float dimension = obtainStyledAttributes.getDimension(C12761d.f28626e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C12761d.f28627f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C12761d.f28628g, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(C12761d.f28630i, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(C12761d.f28629h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C12761d.f28631j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C12761d.f28633l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C12761d.f28635n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C12761d.f28634m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C12761d.f28632k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(C12761d.f28623b, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(C12761d.f28624c, 0);
        obtainStyledAttributes.recycle();
        IMPL.mo39080h(aVar, context, valueOf, dimension, dimension2, f);
    }
}
