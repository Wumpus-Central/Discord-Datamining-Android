package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.util.C2517g;
import androidx.core.view.C2733w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.internal.C5653i;
import java.util.ArrayList;
import java.util.Iterator;
import p083eb.C6803b;
import p083eb.C6808g;
import p102fb.C7101a;
import p102fb.C7102b;
import p102fb.C7106f;
import p102fb.C7107g;
import p102fb.C7108h;
import p320rb.C12552a;
import p385vb.C13488b;
import p402wb.AbstractC13858b;
import p422xb.AbstractC14061n;
import p422xb.C14038g;
import p422xb.C14042h;
import p422xb.C14045k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes3.dex */
public class C5623a {

    /* renamed from: C */
    static final TimeInterpolator f37506C = C7101a.f15488c;

    /* renamed from: D */
    static final int[] f37507D = {16842919, 16842910};

    /* renamed from: E */
    static final int[] f37508E = {16843623, 16842908, 16842910};

    /* renamed from: F */
    static final int[] f37509F = {16842908, 16842910};

    /* renamed from: G */
    static final int[] f37510G = {16843623, 16842910};

    /* renamed from: H */
    static final int[] f37511H = {16842910};

    /* renamed from: I */
    static final int[] f37512I = new int[0];

    /* renamed from: B */
    private ViewTreeObserver.OnPreDrawListener f37514B;

    /* renamed from: a */
    C14045k f10912a;

    /* renamed from: b */
    C14038g f10913b;

    /* renamed from: c */
    Drawable f10914c;

    /* renamed from: d */
    Drawable f10915d;

    /* renamed from: e */
    boolean f10916e;

    /* renamed from: g */
    float f10918g;

    /* renamed from: h */
    float f10919h;

    /* renamed from: i */
    float f10920i;

    /* renamed from: j */
    int f10921j;

    /* renamed from: k */
    private final C5653i f10922k;

    /* renamed from: l */
    private Animator f10923l;

    /* renamed from: m */
    private C7108h f10924m;

    /* renamed from: n */
    private C7108h f10925n;

    /* renamed from: o */
    private float f10926o;

    /* renamed from: q */
    private int f10928q;

    /* renamed from: s */
    private ArrayList<Animator.AnimatorListener> f10930s;

    /* renamed from: t */
    private ArrayList<Animator.AnimatorListener> f10931t;

    /* renamed from: u */
    private ArrayList<AbstractC5632j> f10932u;

    /* renamed from: v */
    final FloatingActionButton f10933v;

    /* renamed from: w */
    final AbstractC13858b f10934w;

    /* renamed from: f */
    boolean f10917f = true;

    /* renamed from: p */
    private float f10927p = 1.0f;

    /* renamed from: r */
    private int f10929r = 0;

    /* renamed from: x */
    private final Rect f10935x = new Rect();

    /* renamed from: y */
    private final RectF f10936y = new RectF();

    /* renamed from: z */
    private final RectF f10937z = new RectF();

    /* renamed from: A */
    private final Matrix f37513A = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes3.dex */
    public class C0157a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f10938a;

        /* renamed from: b */
        final /* synthetic */ boolean f10939b;

        /* renamed from: c */
        final /* synthetic */ AbstractC5633k f10940c;

        C0157a(boolean z, AbstractC5633k kVar) {
            this.f10939b = z;
            this.f10940c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10938a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            C5623a.this.f10929r = 0;
            C5623a.this.f10923l = null;
            if (!this.f10938a) {
                FloatingActionButton floatingActionButton = C5623a.this.f10933v;
                boolean z = this.f10939b;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.m27821b(i, z);
                AbstractC5633k kVar = this.f10940c;
                if (kVar != null) {
                    kVar.mo27991b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C5623a.this.f10933v.m27821b(0, this.f10939b);
            C5623a.this.f10929r = 1;
            C5623a.this.f10923l = animator;
            this.f10938a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: classes3.dex */
    public class C5624b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f10942a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5633k f10943b;

        C5624b(boolean z, AbstractC5633k kVar) {
            this.f10942a = z;
            this.f10943b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5623a.this.f10929r = 0;
            C5623a.this.f10923l = null;
            AbstractC5633k kVar = this.f10943b;
            if (kVar != null) {
                kVar.mo27992a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C5623a.this.f10933v.m27821b(0, this.f10942a);
            C5623a.this.f10929r = 2;
            C5623a.this.f10923l = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* loaded from: classes3.dex */
    public class C5625c extends C7107g {
        C5625c() {
        }

        @Override // p102fb.C7107g
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C5623a.this.f10927p = f;
            return super.mo23387a(f, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* loaded from: classes3.dex */
    public class C5626d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f10946a;

        /* renamed from: b */
        final /* synthetic */ float f10947b;

        /* renamed from: c */
        final /* synthetic */ float f10948c;

        /* renamed from: d */
        final /* synthetic */ float f10949d;

        /* renamed from: e */
        final /* synthetic */ float f10950e;

        /* renamed from: f */
        final /* synthetic */ float f10951f;

        /* renamed from: g */
        final /* synthetic */ float f10952g;

        /* renamed from: h */
        final /* synthetic */ Matrix f10953h;

        C5626d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f10946a = f;
            this.f10947b = f2;
            this.f10948c = f3;
            this.f10949d = f4;
            this.f10950e = f5;
            this.f10951f = f6;
            this.f10952g = f7;
            this.f10953h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C5623a.this.f10933v.setAlpha(C7101a.m23398b(this.f10946a, this.f10947b, 0.0f, 0.2f, floatValue));
            C5623a.this.f10933v.setScaleX(C7101a.m23399a(this.f10948c, this.f10949d, floatValue));
            C5623a.this.f10933v.setScaleY(C7101a.m23399a(this.f10950e, this.f10949d, floatValue));
            C5623a.this.f10927p = C7101a.m23399a(this.f10951f, this.f10952g, floatValue);
            C5623a.this.m28011h(C7101a.m23399a(this.f10951f, this.f10952g, floatValue), this.f10953h);
            C5623a.this.f10933v.setImageMatrix(this.f10953h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* loaded from: classes3.dex */
    public class C5627e implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f10955a = new FloatEvaluator();

        C5627e() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f10955a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* loaded from: classes3.dex */
    public class ViewTreeObserver$OnPreDrawListenerC5628f implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC5628f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C5623a.this.m28040F();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* loaded from: classes3.dex */
    private class C5629g extends AbstractC5635m {
        C5629g() {
            super(C5623a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C5623a.AbstractC5635m
        /* renamed from: a */
        protected float mo27990a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* loaded from: classes3.dex */
    private class C5630h extends AbstractC5635m {
        C5630h() {
            super(C5623a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C5623a.AbstractC5635m
        /* renamed from: a */
        protected float mo27990a() {
            C5623a aVar = C5623a.this;
            return aVar.f10918g + aVar.f10919h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* loaded from: classes3.dex */
    private class C5631i extends AbstractC5635m {
        C5631i() {
            super(C5623a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C5623a.AbstractC5635m
        /* renamed from: a */
        protected float mo27990a() {
            C5623a aVar = C5623a.this;
            return aVar.f10918g + aVar.f10920i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$j */
    /* loaded from: classes3.dex */
    public interface AbstractC5632j {
        /* renamed from: a */
        void mo27994a();

        /* renamed from: b */
        void mo27993b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$k */
    /* loaded from: classes3.dex */
    public interface AbstractC5633k {
        /* renamed from: a */
        void mo27992a();

        /* renamed from: b */
        void mo27991b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$l */
    /* loaded from: classes3.dex */
    private class C5634l extends AbstractC5635m {
        C5634l() {
            super(C5623a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C5623a.AbstractC5635m
        /* renamed from: a */
        protected float mo27990a() {
            return C5623a.this.f10918g;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$m */
    /* loaded from: classes3.dex */
    private abstract class AbstractC5635m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f10962a;

        /* renamed from: b */
        private float f10963b;

        /* renamed from: c */
        private float f10964c;

        private AbstractC5635m() {
        }

        /* renamed from: a */
        protected abstract float mo27990a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5623a.this.m28016d0((int) this.f10964c);
            this.f10962a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            if (!this.f10962a) {
                C14038g gVar = C5623a.this.f10913b;
                if (gVar == null) {
                    f = 0.0f;
                } else {
                    f = gVar.m1947w();
                }
                this.f10963b = f;
                this.f10964c = mo27990a();
                this.f10962a = true;
            }
            C5623a aVar = C5623a.this;
            float f2 = this.f10963b;
            aVar.m28016d0((int) (f2 + ((this.f10964c - f2) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ AbstractC5635m(C5623a aVar, C0157a aVar2) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5623a(FloatingActionButton floatingActionButton, AbstractC13858b bVar) {
        this.f10933v = floatingActionButton;
        this.f10934w = bVar;
        C5653i iVar = new C5653i();
        this.f10922k = iVar;
        iVar.m27866a(f37507D, m28008k(new C5631i()));
        iVar.m27866a(f37508E, m28008k(new C5630h()));
        iVar.m27866a(f37509F, m28008k(new C5630h()));
        iVar.m27866a(f37510G, m28008k(new C5630h()));
        iVar.m27866a(f37511H, m28008k(new C5634l()));
        iVar.m27866a(f37512I, m28008k(new C5629g()));
        this.f10926o = floatingActionButton.getRotation();
    }

    /* renamed from: X */
    private boolean m28025X() {
        return C2733w0.m37029U(this.f10933v) && !this.f10933v.isInEditMode();
    }

    /* renamed from: e0 */
    private void m28014e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C5627e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m28011h(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f10933v.getDrawable();
        if (drawable != null && this.f10928q != 0) {
            RectF rectF = this.f10936y;
            RectF rectF2 = this.f10937z;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i = this.f10928q;
            rectF2.set(0.0f, 0.0f, i, i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f10928q;
            matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
        }
    }

    /* renamed from: i */
    private AnimatorSet m28010i(C7108h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10933v, View.ALPHA, f);
        hVar.m23382e(ViewProps.OPACITY).m23377a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f10933v, View.SCALE_X, f2);
        hVar.m23382e("scale").m23377a(ofFloat2);
        m28014e0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f10933v, View.SCALE_Y, f2);
        hVar.m23382e("scale").m23377a(ofFloat3);
        m28014e0(ofFloat3);
        arrayList.add(ofFloat3);
        m28011h(f3, this.f37513A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f10933v, new C7106f(), new C5625c(), new Matrix(this.f37513A));
        hVar.m23382e("iconScale").m23377a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C7102b.m23396a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: j */
    private AnimatorSet m28009j(float f, float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C5626d(this.f10933v.getAlpha(), f, this.f10933v.getScaleX(), f2, this.f10933v.getScaleY(), this.f10927p, f3, new Matrix(this.f37513A)));
        arrayList.add(ofFloat);
        C7102b.m23396a(animatorSet, arrayList);
        animatorSet.setDuration(C12552a.m6565d(this.f10933v.getContext(), C6803b.f14551y, this.f10933v.getContext().getResources().getInteger(C6808g.f14619b)));
        animatorSet.setInterpolator(C12552a.m6564e(this.f10933v.getContext(), C6803b.f14552z, C7101a.f15487b));
        return animatorSet;
    }

    /* renamed from: k */
    private ValueAnimator m28008k(AbstractC5635m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f37506C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: q */
    private ViewTreeObserver.OnPreDrawListener m28003q() {
        if (this.f37514B == null) {
            this.f37514B = new ViewTreeObserver$OnPreDrawListenerC5628f();
        }
        return this.f37514B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo27989A() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m28042B() {
        ViewTreeObserver viewTreeObserver = this.f10933v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f37514B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f37514B = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo27988C(int[] iArr) {
        throw null;
    }

    /* renamed from: D */
    void mo27987D(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: E */
    void m28041E(Rect rect) {
        C2517g.m37587h(this.f10915d, "Didn't initialize content background");
        if (mo27984W()) {
            this.f10934w.mo2527b(new InsetDrawable(this.f10915d, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f10934w.mo2527b(this.f10915d);
    }

    /* renamed from: F */
    void m28040F() {
        float rotation = this.f10933v.getRotation();
        if (this.f10926o != rotation) {
            this.f10926o = rotation;
            mo27983a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m28039G() {
        ArrayList<AbstractC5632j> arrayList = this.f10932u;
        if (arrayList != null) {
            Iterator<AbstractC5632j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo27993b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m28038H() {
        ArrayList<AbstractC5632j> arrayList = this.f10932u;
        if (arrayList != null) {
            Iterator<AbstractC5632j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo27994a();
            }
        }
    }

    /* renamed from: I */
    boolean mo27986I() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m28037J(ColorStateList colorStateList) {
        C14038g gVar = this.f10913b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m28036K(PorterDuff.Mode mode) {
        C14038g gVar = this.f10913b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final void m28035L(float f) {
        if (this.f10918g != f) {
            this.f10918g = f;
            mo27987D(f, this.f10919h, this.f10920i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m28034M(boolean z) {
        this.f10916e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m28033N(C7108h hVar) {
        this.f10925n = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final void m28032O(float f) {
        if (this.f10919h != f) {
            this.f10919h = f;
            mo27987D(this.f10918g, f, this.f10920i);
        }
    }

    /* renamed from: P */
    final void m28031P(float f) {
        this.f10927p = f;
        Matrix matrix = this.f37513A;
        m28011h(f, matrix);
        this.f10933v.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void m28030Q(int i) {
        if (this.f10928q != i) {
            this.f10928q = i;
            m28020b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public final void m28029R(float f) {
        if (this.f10920i != f) {
            this.f10920i = f;
            mo27987D(this.f10918g, this.f10919h, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo27985S(ColorStateList colorStateList) {
        Drawable drawable = this.f10914c;
        if (drawable != null) {
            C2400a.m37828o(drawable, C13488b.m3601a(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m28028T(boolean z) {
        this.f10917f = z;
        m28018c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final void m28027U(C14045k kVar) {
        this.f10912a = kVar;
        C14038g gVar = this.f10913b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f10914c;
        if (drawable instanceof AbstractC14061n) {
            ((AbstractC14061n) drawable).setShapeAppearanceModel(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public final void m28026V(C7108h hVar) {
        this.f10924m = hVar;
    }

    /* renamed from: W */
    boolean mo27984W() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public final boolean m28024Y() {
        return !this.f10916e || this.f10933v.getSizeDimension() >= this.f10921j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public void m28023Z(AbstractC5633k kVar, boolean z) {
        boolean z2;
        AnimatorSet animatorSet;
        float f;
        float f2;
        if (!m27997x()) {
            Animator animator = this.f10923l;
            if (animator != null) {
                animator.cancel();
            }
            if (this.f10924m == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (m28025X()) {
                if (this.f10933v.getVisibility() != 0) {
                    float f3 = 0.0f;
                    this.f10933v.setAlpha(0.0f);
                    FloatingActionButton floatingActionButton = this.f10933v;
                    if (z2) {
                        f = 0.4f;
                    } else {
                        f = 0.0f;
                    }
                    floatingActionButton.setScaleY(f);
                    FloatingActionButton floatingActionButton2 = this.f10933v;
                    if (z2) {
                        f2 = 0.4f;
                    } else {
                        f2 = 0.0f;
                    }
                    floatingActionButton2.setScaleX(f2);
                    if (z2) {
                        f3 = 0.4f;
                    }
                    m28031P(f3);
                }
                C7108h hVar = this.f10924m;
                if (hVar != null) {
                    animatorSet = m28010i(hVar, 1.0f, 1.0f, 1.0f);
                } else {
                    animatorSet = m28009j(1.0f, 1.0f, 1.0f);
                }
                animatorSet.addListener(new C5624b(z, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f10930s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            this.f10933v.m27821b(0, z);
            this.f10933v.setAlpha(1.0f);
            this.f10933v.setScaleY(1.0f);
            this.f10933v.setScaleX(1.0f);
            m28031P(1.0f);
            if (kVar != null) {
                kVar.mo27992a();
            }
        }
    }

    /* renamed from: a0 */
    void mo27983a0() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final void m28020b0() {
        m28031P(this.f10927p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final void m28018c0() {
        Rect rect = this.f10935x;
        mo27980r(rect);
        m28041E(rect);
        this.f10934w.mo2528a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m28016d0(float f) {
        C14038g gVar = this.f10913b;
        if (gVar != null) {
            gVar.m1982X(f);
        }
    }

    /* renamed from: e */
    public void m28015e(Animator.AnimatorListener animatorListener) {
        if (this.f10931t == null) {
            this.f10931t = new ArrayList<>();
        }
        this.f10931t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m28013f(Animator.AnimatorListener animatorListener) {
        if (this.f10930s == null) {
            this.f10930s = new ArrayList<>();
        }
        this.f10930s.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m28012g(AbstractC5632j jVar) {
        if (this.f10932u == null) {
            this.f10932u = new ArrayList<>();
        }
        this.f10932u.add(jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final Drawable m28007l() {
        return this.f10915d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public float mo27981m() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m28006n() {
        return this.f10916e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final C7108h m28005o() {
        return this.f10925n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public float m28004p() {
        return this.f10919h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo27980r(Rect rect) {
        int i;
        float f;
        if (this.f10916e) {
            i = (this.f10921j - this.f10933v.getSizeDimension()) / 2;
        } else {
            i = 0;
        }
        if (this.f10917f) {
            f = mo27981m() + this.f10920i;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil(f));
        int max2 = Math.max(i, (int) Math.ceil(f * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public float m28002s() {
        return this.f10920i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C14045k m28001t() {
        return this.f10912a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final C7108h m28000u() {
        return this.f10924m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m27999v(AbstractC5633k kVar, boolean z) {
        int i;
        AnimatorSet animatorSet;
        if (!m27998w()) {
            Animator animator = this.f10923l;
            if (animator != null) {
                animator.cancel();
            }
            if (m28025X()) {
                C7108h hVar = this.f10925n;
                if (hVar != null) {
                    animatorSet = m28010i(hVar, 0.0f, 0.0f, 0.0f);
                } else {
                    animatorSet = m28009j(0.0f, 0.4f, 0.4f);
                }
                animatorSet.addListener(new C0157a(z, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f10931t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            FloatingActionButton floatingActionButton = this.f10933v;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton.m27821b(i, z);
            if (kVar != null) {
                kVar.mo27991b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m27998w() {
        if (this.f10933v.getVisibility() == 0) {
            if (this.f10929r == 1) {
                return true;
            }
            return false;
        } else if (this.f10929r != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m27997x() {
        if (this.f10933v.getVisibility() != 0) {
            if (this.f10929r == 2) {
                return true;
            }
            return false;
        } else if (this.f10929r != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo27979y() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m27996z() {
        C14038g gVar = this.f10913b;
        if (gVar != null) {
            C14042h.m1938f(this.f10933v, gVar);
        }
        if (mo27986I()) {
            this.f10933v.getViewTreeObserver().addOnPreDrawListener(m28003q());
        }
    }
}
