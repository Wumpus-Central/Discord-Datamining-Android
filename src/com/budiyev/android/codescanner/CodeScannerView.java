package com.budiyev.android.codescanner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CodeScannerView extends ViewGroup {

    /* renamed from: E */
    private static final EnumC4174b f35935E = EnumC4174b.TOP_START;

    /* renamed from: F */
    private static final EnumC4174b f35936F = EnumC4174b.TOP_END;

    /* renamed from: A */
    private C4184i f35937A;

    /* renamed from: B */
    private AbstractC4172e f35938B;

    /* renamed from: C */
    private CodeScanner f35939C;

    /* renamed from: D */
    private int f35940D;

    /* renamed from: k */
    private SurfaceView f7037k;

    /* renamed from: l */
    private C4193o f7038l;

    /* renamed from: m */
    private ImageView f7039m;

    /* renamed from: n */
    private EnumC4174b f7040n;

    /* renamed from: o */
    private int f7041o;

    /* renamed from: p */
    private int f7042p;

    /* renamed from: q */
    private int f7043q;

    /* renamed from: r */
    private Drawable f7044r;

    /* renamed from: s */
    private Drawable f7045s;

    /* renamed from: t */
    private ImageView f7046t;

    /* renamed from: u */
    private EnumC4174b f7047u;

    /* renamed from: v */
    private int f7048v;

    /* renamed from: w */
    private int f7049w;

    /* renamed from: x */
    private int f7050x;

    /* renamed from: y */
    private Drawable f7051y;

    /* renamed from: z */
    private Drawable f7052z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C4168a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7053a;

        static {
            int[] iArr = new int[EnumC4174b.values().length];
            f7053a = iArr;
            try {
                iArr[EnumC4174b.TOP_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7053a[EnumC4174b.TOP_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7053a[EnumC4174b.BOTTOM_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7053a[EnumC4174b.BOTTOM_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$b */
    /* loaded from: classes.dex */
    public final class View$OnClickListenerC4169b implements View.OnClickListener {
        private View$OnClickListenerC4169b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CodeScanner codeScanner = CodeScannerView.this.f35939C;
            if (codeScanner != null && codeScanner.m32501P()) {
                boolean z = !codeScanner.m32502O();
                codeScanner.m32492Y(z);
                CodeScannerView.this.setAutoFocusEnabled(z);
            }
        }

        /* synthetic */ View$OnClickListenerC4169b(CodeScannerView codeScannerView, C4168a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$c */
    /* loaded from: classes.dex */
    public final class View$OnClickListenerC4170c implements View.OnClickListener {
        private View$OnClickListenerC4170c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CodeScanner codeScanner = CodeScannerView.this.f35939C;
            if (codeScanner != null && codeScanner.m32499R()) {
                boolean z = !codeScanner.m32500Q();
                codeScanner.m32483d0(z);
                CodeScannerView.this.setFlashEnabled(z);
            }
        }

        /* synthetic */ View$OnClickListenerC4170c(CodeScannerView codeScannerView, C4168a aVar) {
            this();
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$d */
    /* loaded from: classes.dex */
    public static final class C4171d extends ViewGroup.MarginLayoutParams {
        public C4171d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C4171d(int i, int i2) {
            super(i, i2);
        }

        public C4171d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C4171d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$e */
    /* loaded from: classes.dex */
    public interface AbstractC4172e {
        /* renamed from: a */
        void mo32443a(int i, int i2);
    }

    public CodeScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m32448d(context, attributeSet, 0, 0);
    }

    /* renamed from: b */
    private static EnumC4174b m32450b(int i) {
        if (i == 1) {
            return EnumC4174b.TOP_END;
        }
        if (i == 2) {
            return EnumC4174b.BOTTOM_START;
        }
        if (i != 3) {
            return EnumC4174b.TOP_START;
        }
        return EnumC4174b.BOTTOM_END;
    }

    /* renamed from: c */
    private static int m32449c(EnumC4174b bVar) {
        int i = C4168a.f7053a[bVar.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    /* renamed from: d */
    private void m32448d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArray;
        Throwable th2;
        this.f7037k = new SurfaceView(context);
        this.f7038l = new C4193o(context);
        float f = context.getResources().getDisplayMetrics().density;
        int round = Math.round(16.0f * f);
        this.f35940D = Math.round(20.0f * f);
        ImageView imageView = new ImageView(context);
        this.f7039m = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f7039m.setOnClickListener(new View$OnClickListenerC4169b(this, null));
        ImageView imageView2 = new ImageView(context);
        this.f7046t = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.f7046t.setOnClickListener(new View$OnClickListenerC4170c(this, null));
        if (attributeSet == null) {
            m32444h(1.0f, 1.0f);
            setMaskColor(1996488704);
            setMaskVisible(true);
            setFrameColor(-1);
            setFrameVisible(true);
            setFrameThickness(Math.round(2.0f * f));
            setFrameCornersSize(Math.round(50.0f * f));
            setFrameCornersRadius(Math.round(f * 0.0f));
            setFrameCornersCapRounded(false);
            setFrameSize(0.75f);
            setFrameVerticalBias(0.5f);
            setAutoFocusButtonColor(-1);
            setFlashButtonColor(-1);
            setAutoFocusButtonVisible(true);
            setAutoFocusButtonPosition(f35935E);
            setFlashButtonVisible(true);
            setFlashButtonPosition(f35936F);
            setAutoFocusButtonPaddingHorizontal(round);
            setAutoFocusButtonPaddingVertical(round);
            setFlashButtonPaddingHorizontal(round);
            setFlashButtonPaddingVertical(round);
            setAutoFocusButtonOnIcon(C4189n.m32394l(context, C4185j.f7099b));
            setAutoFocusButtonOffIcon(C4189n.m32394l(context, C4185j.f7098a));
            setFlashButtonOnIcon(C4189n.m32394l(context, C4185j.f7101d));
            setFlashButtonOffIcon(C4189n.m32394l(context, C4185j.f7100c));
        } else {
            try {
                typedArray = context.getTheme().obtainStyledAttributes(attributeSet, C4186k.f7102a, i, i2);
                try {
                    setMaskColor(typedArray.getColor(C4186k.f7127z, 1996488704));
                    setMaskVisible(typedArray.getBoolean(C4186k.f35941A, true));
                    setFrameColor(typedArray.getColor(C4186k.f7119r, -1));
                    setFrameVisible(typedArray.getBoolean(C4186k.f7126y, true));
                    setFrameThickness(typedArray.getDimensionPixelOffset(C4186k.f7124w, Math.round(2.0f * f)));
                    setFrameCornersSize(typedArray.getDimensionPixelOffset(C4186k.f7122u, Math.round(50.0f * f)));
                    setFrameCornersRadius(typedArray.getDimensionPixelOffset(C4186k.f7121t, Math.round(f * 0.0f)));
                    setFrameCornersCapRounded(typedArray.getBoolean(C4186k.f7120s, false));
                    m32444h(typedArray.getFloat(C4186k.f7118q, 1.0f), typedArray.getFloat(C4186k.f7117p, 1.0f));
                    setFrameSize(typedArray.getFloat(C4186k.f7123v, 0.75f));
                    setFrameVerticalBias(typedArray.getFloat(C4186k.f7125x, 0.5f));
                    setAutoFocusButtonVisible(typedArray.getBoolean(C4186k.f7109h, true));
                    setAutoFocusButtonColor(typedArray.getColor(C4186k.f7103b, -1));
                    setAutoFocusButtonPosition(m32450b(typedArray.getInt(C4186k.f7108g, m32449c(f35935E))));
                    setAutoFocusButtonPaddingHorizontal(typedArray.getDimensionPixelOffset(C4186k.f7106e, round));
                    setAutoFocusButtonPaddingVertical(typedArray.getDimensionPixelOffset(C4186k.f7107f, round));
                    Drawable drawable = typedArray.getDrawable(C4186k.f7105d);
                    if (drawable == null) {
                        drawable = C4189n.m32394l(context, C4185j.f7099b);
                    }
                    setAutoFocusButtonOnIcon(drawable);
                    Drawable drawable2 = typedArray.getDrawable(C4186k.f7104c);
                    if (drawable2 == null) {
                        drawable2 = C4189n.m32394l(context, C4185j.f7098a);
                    }
                    setAutoFocusButtonOffIcon(drawable2);
                    setFlashButtonVisible(typedArray.getBoolean(C4186k.f7116o, true));
                    setFlashButtonColor(typedArray.getColor(C4186k.f7110i, -1));
                    setFlashButtonPosition(m32450b(typedArray.getInt(C4186k.f7115n, m32449c(f35936F))));
                    setFlashButtonPaddingHorizontal(typedArray.getDimensionPixelOffset(C4186k.f7113l, round));
                    setFlashButtonPaddingVertical(typedArray.getDimensionPixelOffset(C4186k.f7114m, round));
                    Drawable drawable3 = typedArray.getDrawable(C4186k.f7112k);
                    if (drawable3 == null) {
                        drawable3 = C4189n.m32394l(context, C4185j.f7101d);
                    }
                    setFlashButtonOnIcon(drawable3);
                    Drawable drawable4 = typedArray.getDrawable(C4186k.f7111j);
                    if (drawable4 == null) {
                        drawable4 = C4189n.m32394l(context, C4185j.f7100c);
                    }
                    setFlashButtonOffIcon(drawable4);
                    typedArray.recycle();
                } catch (Throwable th3) {
                    th2 = th3;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                typedArray = null;
            }
        }
        if (isInEditMode()) {
            setAutoFocusEnabled(true);
            setFlashEnabled(true);
        }
        addView(this.f7037k, new C4171d(-1, -1));
        addView(this.f7038l, new C4171d(-1, -1));
        addView(this.f7039m, new C4171d(-2, -2));
        addView(this.f7046t, new C4171d(-2, -2));
    }

    /* renamed from: e */
    private void m32447e() {
        int i = this.f7041o;
        int i2 = this.f7042p;
        this.f7039m.setPadding(i, i2, i, i2);
    }

    /* renamed from: f */
    private void m32446f() {
        int i = this.f7048v;
        int i2 = this.f7049w;
        this.f7046t.setPadding(i, i2, i, i2);
    }

    /* renamed from: g */
    private void m32445g(View view, EnumC4174b bVar, int i, int i2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int layoutDirection = getLayoutDirection();
        int i3 = C4168a.f7053a[bVar.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (layoutDirection == 1) {
                            view.layout(0, i2 - measuredHeight, measuredWidth, i2);
                        } else {
                            view.layout(i - measuredWidth, i2 - measuredHeight, i, i2);
                        }
                    }
                } else if (layoutDirection == 1) {
                    view.layout(i - measuredWidth, i2 - measuredHeight, i, i2);
                } else {
                    view.layout(0, i2 - measuredHeight, measuredWidth, i2);
                }
            } else if (layoutDirection == 1) {
                view.layout(0, 0, measuredWidth, measuredHeight);
            } else {
                view.layout(i - measuredWidth, 0, i, measuredHeight);
            }
        } else if (layoutDirection == 1) {
            view.layout(i - measuredWidth, 0, i, measuredHeight);
        } else {
            view.layout(0, 0, measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4171d;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4171d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4171d(getContext(), attributeSet);
    }

    public int getAutoFocusButtonColor() {
        return this.f7043q;
    }

    public Drawable getAutoFocusButtonOffIcon() {
        return this.f7045s;
    }

    public Drawable getAutoFocusButtonOnIcon() {
        return this.f7044r;
    }

    public int getAutoFocusButtonPaddingHorizontal() {
        return this.f7041o;
    }

    public int getAutoFocusButtonPaddingVertical() {
        return this.f7042p;
    }

    public EnumC4174b getAutoFocusButtonPosition() {
        return this.f7040n;
    }

    public int getFlashButtonColor() {
        return this.f7050x;
    }

    public Drawable getFlashButtonOffIcon() {
        return this.f7052z;
    }

    public Drawable getFlashButtonOnIcon() {
        return this.f7051y;
    }

    public int getFlashButtonPaddingHorizontal() {
        return this.f7048v;
    }

    public int getFlashButtonPaddingVertical() {
        return this.f7049w;
    }

    public EnumC4174b getFlashButtonPosition() {
        return this.f7047u;
    }

    public float getFrameAspectRatioHeight() {
        return this.f7038l.m32383a();
    }

    public float getFrameAspectRatioWidth() {
        return this.f7038l.m32382b();
    }

    public int getFrameColor() {
        return this.f7038l.m32381c();
    }

    public int getFrameCornersRadius() {
        return this.f7038l.m32380d();
    }

    public int getFrameCornersSize() {
        return this.f7038l.m32379e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4187l getFrameRect() {
        return this.f7038l.m32378f();
    }

    public float getFrameSize() {
        return this.f7038l.m32377g();
    }

    public int getFrameThickness() {
        return this.f7038l.m32376h();
    }

    public float getFrameVerticalBias() {
        return this.f7038l.m32375i();
    }

    public int getMaskColor() {
        return this.f7038l.m32374j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SurfaceView getPreviewView() {
        return this.f7037k;
    }

    C4193o getViewFinderView() {
        return this.f7038l;
    }

    /* renamed from: h */
    public void m32444h(float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
        }
        this.f7038l.m32371m(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        if (childCount <= 5) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            C4184i iVar = this.f35937A;
            int i11 = 0;
            if (iVar == null) {
                this.f7037k.layout(0, 0, i9, i10);
            } else {
                int a = iVar.m32417a();
                if (a > i9) {
                    int i12 = (a - i9) / 2;
                    i5 = 0 - i12;
                    i6 = i12 + i9;
                } else {
                    i5 = 0;
                    i6 = i9;
                }
                int b = iVar.m32416b();
                if (b > i10) {
                    int i13 = (b - i10) / 2;
                    i8 = 0 - i13;
                    i7 = i13 + i10;
                } else {
                    i8 = 0;
                    i7 = i10;
                }
                this.f7037k.layout(i5, i8, i6, i7);
            }
            this.f7038l.layout(0, 0, i9, i10);
            m32445g(this.f7039m, this.f7040n, i9, i10);
            m32445g(this.f7046t, this.f7047u, i9, i10);
            if (childCount == 5) {
                C4187l f = this.f7038l.m32378f();
                if (f != null) {
                    i11 = f.m32413c();
                }
                View childAt = getChildAt(4);
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                if (childAt.getVisibility() != 8) {
                    C4171d dVar = (C4171d) childAt.getLayoutParams();
                    int i14 = paddingLeft + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    int i15 = paddingTop + ((ViewGroup.MarginLayoutParams) dVar).topMargin + i11;
                    childAt.layout(i14, i15, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + i15);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("CodeScannerView can have zero or one child");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        if (childCount <= 5) {
            measureChildWithMargins(this.f7037k, i, 0, i2, 0);
            measureChildWithMargins(this.f7038l, i, 0, i2, 0);
            measureChildWithMargins(this.f7039m, i, 0, i2, 0);
            measureChildWithMargins(this.f7046t, i, 0, i2, 0);
            if (childCount == 5) {
                C4187l f = this.f7038l.m32378f();
                View childAt = getChildAt(4);
                if (f != null) {
                    i3 = f.m32413c();
                } else {
                    i3 = 0;
                }
                measureChildWithMargins(childAt, i, 0, i2, i3);
            }
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
            return;
        }
        throw new IllegalStateException("CodeScannerView can have zero or one child");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        AbstractC4172e eVar = this.f35938B;
        if (eVar != null) {
            eVar.mo32443a(i, i2);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CodeScanner codeScanner = this.f35939C;
        C4187l frameRect = getFrameRect();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (codeScanner != null && frameRect != null && codeScanner.m32501P() && codeScanner.m32498S() && motionEvent.getAction() == 0 && frameRect.m32407i(x, y)) {
            int i = this.f35940D;
            codeScanner.m32497T(new C4187l(x - i, y - i, x + i, y + i).m32414b(frameRect));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAutoFocusButtonColor(int i) {
        this.f7043q = i;
        this.f7039m.setColorFilter(i);
    }

    public void setAutoFocusButtonOffIcon(Drawable drawable) {
        boolean z;
        Objects.requireNonNull(drawable);
        if (drawable != this.f7045s) {
            z = true;
        } else {
            z = false;
        }
        this.f7045s = drawable;
        CodeScanner codeScanner = this.f35939C;
        if (z && codeScanner != null) {
            setAutoFocusEnabled(codeScanner.m32502O());
        }
    }

    public void setAutoFocusButtonOnIcon(Drawable drawable) {
        boolean z;
        Objects.requireNonNull(drawable);
        if (drawable != this.f7044r) {
            z = true;
        } else {
            z = false;
        }
        this.f7044r = drawable;
        CodeScanner codeScanner = this.f35939C;
        if (z && codeScanner != null) {
            setAutoFocusEnabled(codeScanner.m32502O());
        }
    }

    public void setAutoFocusButtonPaddingHorizontal(int i) {
        boolean z;
        if (i >= 0) {
            if (i != this.f7041o) {
                z = true;
            } else {
                z = false;
            }
            this.f7041o = i;
            if (z) {
                m32447e();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Padding should be equal to or grater then zero");
    }

    public void setAutoFocusButtonPaddingVertical(int i) {
        boolean z;
        if (i >= 0) {
            if (i != this.f7042p) {
                z = true;
            } else {
                z = false;
            }
            this.f7042p = i;
            if (z) {
                m32447e();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Padding should be equal to or grater then zero");
    }

    public void setAutoFocusButtonPosition(EnumC4174b bVar) {
        boolean z;
        Objects.requireNonNull(bVar);
        if (bVar != this.f7040n) {
            z = true;
        } else {
            z = false;
        }
        this.f7040n = bVar;
        if (z && isLaidOut()) {
            requestLayout();
        }
    }

    public void setAutoFocusButtonVisible(boolean z) {
        this.f7039m.setVisibility(z ? 0 : 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAutoFocusEnabled(boolean z) {
        Drawable drawable;
        ImageView imageView = this.f7039m;
        if (z) {
            drawable = this.f7044r;
        } else {
            drawable = this.f7045s;
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCodeScanner(CodeScanner codeScanner) {
        if (this.f35939C == null) {
            this.f35939C = codeScanner;
            setAutoFocusEnabled(codeScanner.m32502O());
            setFlashEnabled(codeScanner.m32500Q());
            return;
        }
        throw new IllegalStateException("Code scanner has already been set");
    }

    public void setFlashButtonColor(int i) {
        this.f7050x = i;
        this.f7046t.setColorFilter(i);
    }

    public void setFlashButtonOffIcon(Drawable drawable) {
        boolean z;
        Objects.requireNonNull(drawable);
        if (drawable != this.f7052z) {
            z = true;
        } else {
            z = false;
        }
        this.f7052z = drawable;
        CodeScanner codeScanner = this.f35939C;
        if (z && codeScanner != null) {
            setFlashEnabled(codeScanner.m32500Q());
        }
    }

    public void setFlashButtonOnIcon(Drawable drawable) {
        boolean z;
        Objects.requireNonNull(drawable);
        if (drawable != this.f7051y) {
            z = true;
        } else {
            z = false;
        }
        this.f7051y = drawable;
        CodeScanner codeScanner = this.f35939C;
        if (z && codeScanner != null) {
            setFlashEnabled(codeScanner.m32500Q());
        }
    }

    public void setFlashButtonPaddingHorizontal(int i) {
        boolean z;
        if (i >= 0) {
            if (i != this.f7048v) {
                z = true;
            } else {
                z = false;
            }
            this.f7048v = i;
            if (z) {
                m32446f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Padding should be equal to or grater then zero");
    }

    public void setFlashButtonPaddingVertical(int i) {
        boolean z;
        if (i >= 0) {
            if (i != this.f7049w) {
                z = true;
            } else {
                z = false;
            }
            this.f7049w = i;
            if (z) {
                m32446f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Padding should be equal to or grater then zero");
    }

    public void setFlashButtonPosition(EnumC4174b bVar) {
        boolean z;
        Objects.requireNonNull(bVar);
        if (bVar != this.f7047u) {
            z = true;
        } else {
            z = false;
        }
        this.f7047u = bVar;
        if (z) {
            requestLayout();
        }
    }

    public void setFlashButtonVisible(boolean z) {
        this.f7046t.setVisibility(z ? 0 : 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setFlashEnabled(boolean z) {
        this.f7046t.setImageDrawable(z ? this.f7051y : this.f7052z);
    }

    public void setFrameAspectRatioHeight(float f) {
        if (f > 0.0f) {
            this.f7038l.m32370n(f);
            return;
        }
        throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
    }

    public void setFrameAspectRatioWidth(float f) {
        if (f > 0.0f) {
            this.f7038l.m32369o(f);
            return;
        }
        throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
    }

    public void setFrameColor(int i) {
        this.f7038l.m32368p(i);
    }

    public void setFrameCornersCapRounded(boolean z) {
        this.f7038l.m32367q(z);
    }

    public void setFrameCornersRadius(int i) {
        if (i >= 0) {
            this.f7038l.m32366r(i);
            return;
        }
        throw new IllegalArgumentException("Frame corners radius can't be negative");
    }

    public void setFrameCornersSize(int i) {
        if (i >= 0) {
            this.f7038l.m32365s(i);
            return;
        }
        throw new IllegalArgumentException("Frame corners size can't be negative");
    }

    public void setFrameSize(float f) {
        if (f < 0.1d || f > 1.0f) {
            throw new IllegalArgumentException("Max frame size value should be between 0.1 and 1, inclusive");
        }
        this.f7038l.m32364t(f);
    }

    public void setFrameThickness(int i) {
        if (i >= 0) {
            this.f7038l.m32363u(i);
            return;
        }
        throw new IllegalArgumentException("Frame thickness can't be negative");
    }

    public void setFrameVerticalBias(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Max frame size value should be between 0 and 1, inclusive");
        }
        this.f7038l.m32362v(f);
    }

    public void setFrameVisible(boolean z) {
        this.f7038l.m32361w(z);
    }

    public void setMaskColor(int i) {
        this.f7038l.m32360x(i);
    }

    public void setMaskVisible(boolean z) {
        this.f7038l.m32359y(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPreviewSize(C4184i iVar) {
        this.f35937A = iVar;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSizeListener(AbstractC4172e eVar) {
        this.f35938B = eVar;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4171d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4171d(layoutParams);
    }
}
