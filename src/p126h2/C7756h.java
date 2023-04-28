package p126h2;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C1696n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import p071e.C6525a;
import p223m2.C10474e;
import p343t2.C12945f;
import p343t2.C12949j;
import p358u2.C13180c;

/* renamed from: h2.h */
/* loaded from: classes.dex */
public class C7756h extends C1696n {

    /* renamed from: y */
    private static final String f16827y = "h";

    /* renamed from: z */
    private static final AbstractC7755g0<Throwable> f16828z = new AbstractC7755g0() { // from class: h2.f
        @Override // p126h2.AbstractC7755g0
        public final void onResult(Object obj) {
            C7756h.m21412u((Throwable) obj);
        }
    };

    /* renamed from: m */
    private AbstractC7755g0<Throwable> f16831m;

    /* renamed from: p */
    private String f16834p;

    /* renamed from: q */
    private int f16835q;

    /* renamed from: w */
    private C7771m0<C7762i> f16841w;

    /* renamed from: x */
    private C7762i f16842x;

    /* renamed from: k */
    private final AbstractC7755g0<C7762i> f16829k = new AbstractC7755g0() { // from class: h2.e
        @Override // p126h2.AbstractC7755g0
        public final void onResult(Object obj) {
            C7756h.this.setComposition((C7762i) obj);
        }
    };

    /* renamed from: l */
    private final AbstractC7755g0<Throwable> f16830l = new C7757a();

    /* renamed from: n */
    private int f16832n = 0;

    /* renamed from: o */
    private final C7748e0 f16833o = new C7748e0();

    /* renamed from: r */
    private boolean f16836r = false;

    /* renamed from: s */
    private boolean f16837s = false;

    /* renamed from: t */
    private boolean f16838t = true;

    /* renamed from: u */
    private final Set<EnumC7760c> f16839u = new HashSet();

    /* renamed from: v */
    private final Set<AbstractC7763i0> f16840v = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h2.h$a */
    /* loaded from: classes.dex */
    public class C7757a implements AbstractC7755g0<Throwable> {
        C7757a() {
        }

        /* renamed from: a */
        public void onResult(Throwable th2) {
            AbstractC7755g0 g0Var;
            if (C7756h.this.f16832n != 0) {
                C7756h hVar = C7756h.this;
                hVar.setImageResource(hVar.f16832n);
            }
            if (C7756h.this.f16831m == null) {
                g0Var = C7756h.f16828z;
            } else {
                g0Var = C7756h.this.f16831m;
            }
            g0Var.onResult(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h2.h$b */
    /* loaded from: classes.dex */
    public static class C7758b extends View.BaseSavedState {
        public static final Parcelable.Creator<C7758b> CREATOR = new C7759a();

        /* renamed from: k */
        String f16844k;

        /* renamed from: l */
        int f16845l;

        /* renamed from: m */
        float f16846m;

        /* renamed from: n */
        boolean f16847n;

        /* renamed from: o */
        String f16848o;

        /* renamed from: p */
        int f16849p;

        /* renamed from: q */
        int f16850q;

        /* renamed from: h2.h$b$a */
        /* loaded from: classes.dex */
        class C7759a implements Parcelable.Creator<C7758b> {
            C7759a() {
            }

            /* renamed from: a */
            public C7758b createFromParcel(Parcel parcel) {
                return new C7758b(parcel, null);
            }

            /* renamed from: b */
            public C7758b[] newArray(int i) {
                return new C7758b[i];
            }
        }

        /* synthetic */ C7758b(Parcel parcel, C7757a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f16844k);
            parcel.writeFloat(this.f16846m);
            parcel.writeInt(this.f16847n ? 1 : 0);
            parcel.writeString(this.f16848o);
            parcel.writeInt(this.f16849p);
            parcel.writeInt(this.f16850q);
        }

        C7758b(Parcelable parcelable) {
            super(parcelable);
        }

        private C7758b(Parcel parcel) {
            super(parcel);
            this.f16844k = parcel.readString();
            this.f16846m = parcel.readFloat();
            this.f16847n = parcel.readInt() != 1 ? false : true;
            this.f16848o = parcel.readString();
            this.f16849p = parcel.readInt();
            this.f16850q = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h2.h$c */
    /* loaded from: classes.dex */
    public enum EnumC7760c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public C7756h(Context context) {
        super(context);
        m21416q(null, C7778o0.f16926a);
    }

    /* renamed from: l */
    private void m21421l() {
        C7771m0<C7762i> m0Var = this.f16841w;
        if (m0Var != null) {
            m0Var.m21369j(this.f16829k);
            this.f16841w.m21370i(this.f16830l);
        }
    }

    /* renamed from: m */
    private void m21420m() {
        this.f16842x = null;
        this.f16833o.m21449u();
    }

    /* renamed from: o */
    private C7771m0<C7762i> m21418o(final String str) {
        if (isInEditMode()) {
            return new C7771m0<>(new Callable() { // from class: h2.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C7767k0 s;
                    s = C7756h.this.m21414s(str);
                    return s;
                }
            }, true);
        }
        if (this.f16838t) {
            return C7781q.m21344j(getContext(), str);
        }
        return C7781q.m21343k(getContext(), str, null);
    }

    /* renamed from: p */
    private C7771m0<C7762i> m21417p(final int i) {
        if (isInEditMode()) {
            return new C7771m0<>(new Callable() { // from class: h2.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C7767k0 t;
                    t = C7756h.this.m21413t(i);
                    return t;
                }
            }, true);
        }
        if (this.f16838t) {
            return C7781q.m21335s(getContext(), i);
        }
        return C7781q.m21334t(getContext(), i, null);
    }

    /* renamed from: q */
    private void m21416q(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7780p0.f38437C, i, 0);
        this.f16838t = obtainStyledAttributes.getBoolean(C7780p0.f38439E, true);
        int i2 = C7780p0.f38449O;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C7780p0.f38444J;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C7780p0.f38454T;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(C7780p0.f38443I, 0));
            if (obtainStyledAttributes.getBoolean(C7780p0.f38438D, false)) {
                this.f16837s = true;
            }
            if (obtainStyledAttributes.getBoolean(C7780p0.f38447M, false)) {
                this.f16833o.m21504R0(-1);
            }
            int i5 = C7780p0.f38452R;
            if (obtainStyledAttributes.hasValue(i5)) {
                setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
            }
            int i6 = C7780p0.f38451Q;
            if (obtainStyledAttributes.hasValue(i6)) {
                setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
            }
            int i7 = C7780p0.f38453S;
            if (obtainStyledAttributes.hasValue(i7)) {
                setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
            }
            int i8 = C7780p0.f38440F;
            if (obtainStyledAttributes.hasValue(i8)) {
                setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i8, true));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(C7780p0.f38446L));
            setProgress(obtainStyledAttributes.getFloat(C7780p0.f38448N, 0.0f));
            m21419n(obtainStyledAttributes.getBoolean(C7780p0.f38442H, false));
            int i9 = C7780p0.f38441G;
            if (obtainStyledAttributes.hasValue(i9)) {
                m21423j(new C10474e("**"), AbstractC7765j0.f38430K, new C13180c(new C7785r0(C6525a.m25365a(getContext(), obtainStyledAttributes.getResourceId(i9, -1)).getDefaultColor())));
            }
            int i10 = C7780p0.f38450P;
            if (obtainStyledAttributes.hasValue(i10)) {
                EnumC7782q0 q0Var = EnumC7782q0.AUTOMATIC;
                int i11 = obtainStyledAttributes.getInt(i10, q0Var.ordinal());
                if (i11 >= EnumC7782q0.values().length) {
                    i11 = q0Var.ordinal();
                }
                setRenderMode(EnumC7782q0.values()[i11]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C7780p0.f38445K, false));
            obtainStyledAttributes.recycle();
            C7748e0 e0Var = this.f16833o;
            if (C12949j.m4966f(getContext()) != 0.0f) {
                z = true;
            }
            e0Var.m21496V0(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ C7767k0 m21414s(String str) {
        if (this.f16838t) {
            return C7781q.m21342l(getContext(), str);
        }
        return C7781q.m21341m(getContext(), str, null);
    }

    private void setCompositionTask(C7771m0<C7762i> m0Var) {
        this.f16839u.add(EnumC7760c.SET_ANIMATION);
        m21420m();
        m21421l();
        this.f16841w = m0Var.m21375d(this.f16829k).m21376c(this.f16830l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ C7767k0 m21413t(int i) {
        if (this.f16838t) {
            return C7781q.m21333u(getContext(), i);
        }
        return C7781q.m21332v(getContext(), i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ void m21412u(Throwable th2) {
        if (C12949j.m4961k(th2)) {
            C12945f.m5008d("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    /* renamed from: z */
    private void m21407z() {
        boolean r = m21415r();
        setImageDrawable(null);
        setImageDrawable(this.f16833o);
        if (r) {
            this.f16833o.m21450t0();
        }
    }

    /* renamed from: A */
    public void m21431A(int i, int i2) {
        this.f16833o.m21522I0(i, i2);
    }

    public boolean getClipToCompositionBounds() {
        return this.f16833o.m21529F();
    }

    public C7762i getComposition() {
        return this.f16842x;
    }

    public long getDuration() {
        C7762i iVar = this.f16842x;
        if (iVar != null) {
            return iVar.m21400d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f16833o.m21521J();
    }

    public String getImageAssetsFolder() {
        return this.f16833o.m21517L();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f16833o.m21513N();
    }

    public float getMaxFrame() {
        return this.f16833o.m21511O();
    }

    public float getMinFrame() {
        return this.f16833o.m21509P();
    }

    public C7774n0 getPerformanceTracker() {
        return this.f16833o.m21507Q();
    }

    public float getProgress() {
        return this.f16833o.m21505R();
    }

    public EnumC7782q0 getRenderMode() {
        return this.f16833o.m21503S();
    }

    public int getRepeatCount() {
        return this.f16833o.m21501T();
    }

    public int getRepeatMode() {
        return this.f16833o.m21499U();
    }

    public float getSpeed() {
        return this.f16833o.m21497V();
    }

    /* renamed from: i */
    public void m21424i(Animator.AnimatorListener animatorListener) {
        this.f16833o.m21459p(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof C7748e0) && ((C7748e0) drawable).m21503S() == EnumC7782q0.SOFTWARE) {
            this.f16833o.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C7748e0 e0Var = this.f16833o;
        if (drawable2 == e0Var) {
            super.invalidateDrawable(e0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public <T> void m21423j(C10474e eVar, T t, C13180c<T> cVar) {
        this.f16833o.m21457q(eVar, t, cVar);
    }

    /* renamed from: k */
    public void m21422k() {
        this.f16839u.add(EnumC7760c.PLAY_OPTION);
        this.f16833o.m21451t();
    }

    /* renamed from: n */
    public void m21419n(boolean z) {
        this.f16833o.m21439z(z);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f16837s) {
            this.f16833o.m21456q0();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C7758b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7758b bVar = (C7758b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f16834p = bVar.f16844k;
        Set<EnumC7760c> set = this.f16839u;
        EnumC7760c cVar = EnumC7760c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.f16834p)) {
            setAnimation(this.f16834p);
        }
        this.f16835q = bVar.f16845l;
        if (!this.f16839u.contains(cVar) && (i = this.f16835q) != 0) {
            setAnimation(i);
        }
        if (!this.f16839u.contains(EnumC7760c.SET_PROGRESS)) {
            setProgress(bVar.f16846m);
        }
        if (!this.f16839u.contains(EnumC7760c.PLAY_OPTION) && bVar.f16847n) {
            playAnimation();
        }
        if (!this.f16839u.contains(EnumC7760c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bVar.f16848o);
        }
        if (!this.f16839u.contains(EnumC7760c.SET_REPEAT_MODE)) {
            setRepeatMode(bVar.f16849p);
        }
        if (!this.f16839u.contains(EnumC7760c.SET_REPEAT_COUNT)) {
            setRepeatCount(bVar.f16850q);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C7758b bVar = new C7758b(super.onSaveInstanceState());
        bVar.f16844k = this.f16834p;
        bVar.f16845l = this.f16835q;
        bVar.f16846m = this.f16833o.m21505R();
        bVar.f16847n = this.f16833o.m21488a0();
        bVar.f16848o = this.f16833o.m21517L();
        bVar.f16849p = this.f16833o.m21499U();
        bVar.f16850q = this.f16833o.m21501T();
        return bVar;
    }

    public void pauseAnimation() {
        this.f16837s = false;
        this.f16833o.m21458p0();
    }

    public void playAnimation() {
        this.f16839u.add(EnumC7760c.PLAY_OPTION);
        this.f16833o.m21456q0();
    }

    /* renamed from: r */
    public boolean m21415r() {
        return this.f16833o.m21490Z();
    }

    public void setAnimation(int i) {
        this.f16835q = i;
        this.f16834p = null;
        setCompositionTask(m21417p(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        m21408y(str, null);
    }

    public void setAnimationFromUrl(String str) {
        C7771m0<C7762i> m0Var;
        if (this.f16838t) {
            m0Var = C7781q.m21331w(getContext(), str);
        } else {
            m0Var = C7781q.m21330x(getContext(), str, null);
        }
        setCompositionTask(m0Var);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f16833o.m21444w0(z);
    }

    public void setCacheComposition(boolean z) {
        this.f16838t = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f16833o.m21442x0(z);
    }

    public void setComposition(C7762i iVar) {
        if (C7742c.f16781a) {
            String str = f16827y;
            Log.v(str, "Set Composition \n" + iVar);
        }
        this.f16833o.setCallback(this);
        this.f16842x = iVar;
        this.f16836r = true;
        boolean y0 = this.f16833o.m21440y0(iVar);
        this.f16836r = false;
        if (getDrawable() != this.f16833o || y0) {
            if (!y0) {
                m21407z();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (AbstractC7763i0 i0Var : this.f16840v) {
                i0Var.m21381a(iVar);
            }
        }
    }

    public void setFailureListener(AbstractC7755g0<Throwable> g0Var) {
        this.f16831m = g0Var;
    }

    public void setFallbackResource(int i) {
        this.f16832n = i;
    }

    public void setFontAssetDelegate(C7738a aVar) {
        this.f16833o.m21438z0(aVar);
    }

    public void setFrame(int i) {
        this.f16833o.m21538A0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f16833o.m21536B0(z);
    }

    public void setImageAssetDelegate(AbstractC7740b bVar) {
        this.f16833o.m21534C0(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f16833o.m21532D0(str);
    }

    @Override // androidx.appcompat.widget.C1696n, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m21421l();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.C1696n, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m21421l();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C1696n, android.widget.ImageView
    public void setImageResource(int i) {
        m21421l();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f16833o.m21530E0(z);
    }

    public void setMaxFrame(int i) {
        this.f16833o.m21528F0(i);
    }

    public void setMaxProgress(float f) {
        this.f16833o.m21524H0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f16833o.m21520J0(str);
    }

    public void setMinFrame(int i) {
        this.f16833o.m21518K0(i);
    }

    public void setMinProgress(float f) {
        this.f16833o.m21514M0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f16833o.m21512N0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f16833o.m21510O0(z);
    }

    public void setProgress(float f) {
        this.f16839u.add(EnumC7760c.SET_PROGRESS);
        this.f16833o.m21508P0(f);
    }

    public void setRenderMode(EnumC7782q0 q0Var) {
        this.f16833o.m21506Q0(q0Var);
    }

    public void setRepeatCount(int i) {
        this.f16839u.add(EnumC7760c.SET_REPEAT_COUNT);
        this.f16833o.m21504R0(i);
    }

    public void setRepeatMode(int i) {
        this.f16839u.add(EnumC7760c.SET_REPEAT_MODE);
        this.f16833o.m21502S0(i);
    }

    public void setSafeMode(boolean z) {
        this.f16833o.m21500T0(z);
    }

    public void setSpeed(float f) {
        this.f16833o.m21498U0(f);
    }

    public void setTextDelegate(C7787s0 s0Var) {
        this.f16833o.m21494W0(s0Var);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        C7748e0 e0Var;
        if (!this.f16836r && drawable == (e0Var = this.f16833o) && e0Var.m21490Z()) {
            pauseAnimation();
        } else if (!this.f16836r && (drawable instanceof C7748e0)) {
            C7748e0 e0Var2 = (C7748e0) drawable;
            if (e0Var2.m21490Z()) {
                e0Var2.m21458p0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* renamed from: v */
    public void m21411v() {
        this.f16839u.add(EnumC7760c.PLAY_OPTION);
        this.f16833o.m21450t0();
    }

    /* renamed from: w */
    public void m21410w() {
        this.f16833o.m21448u0();
    }

    /* renamed from: x */
    public void m21409x(InputStream inputStream, String str) {
        setCompositionTask(C7781q.m21340n(inputStream, str));
    }

    /* renamed from: y */
    public void m21408y(String str, String str2) {
        m21409x(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f16833o.m21526G0(str);
    }

    public void setMinFrame(String str) {
        this.f16833o.m21516L0(str);
    }

    public void setAnimation(String str) {
        this.f16834p = str;
        this.f16835q = 0;
        setCompositionTask(m21418o(str));
    }
}
