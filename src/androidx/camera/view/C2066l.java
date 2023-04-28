package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.AbstractC1947w1;
import androidx.camera.core.C1770a2;
import androidx.camera.core.C1795c3;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1936v2;
import androidx.camera.core.impl.utils.C1869r;
import androidx.camera.view.AbstractC2073m;
import androidx.camera.view.C2066l;
import androidx.core.content.C2337a;
import androidx.core.view.C2733w0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.atomic.AtomicReference;
import p289q0.C11957a;
import p289q0.C11959c;
import p289q0.C11960d;
import p309r0.C12317a;
import p390w.AbstractC13589e0;
import p390w.AbstractC13597g0;

/* renamed from: androidx.camera.view.l */
/* loaded from: classes.dex */
public final class C2066l extends FrameLayout {

    /* renamed from: u */
    private static final EnumC2069c f2334u = EnumC2069c.PERFORMANCE;

    /* renamed from: k */
    EnumC2069c f2335k;

    /* renamed from: l */
    AbstractC2073m f2336l;

    /* renamed from: m */
    final C2059f f2337m;

    /* renamed from: n */
    final MutableLiveData<EnumC2072f> f2338n;

    /* renamed from: o */
    final AtomicReference<C2056e> f2339o;

    /* renamed from: p */
    C2075n f2340p;

    /* renamed from: q */
    private final ScaleGestureDetector f2341q;

    /* renamed from: r */
    private MotionEvent f2342r;

    /* renamed from: s */
    private final View.OnLayoutChangeListener f2343s;

    /* renamed from: t */
    final C1770a2.AbstractC1774d f2344t;

    /* renamed from: androidx.camera.view.l$a */
    /* loaded from: classes.dex */
    class C2067a implements C1770a2.AbstractC1774d {
        C2067a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m39127e(C1936v2 v2Var) {
            C2066l.this.f2344t.mo341a(v2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m39126f(AbstractC13597g0 g0Var, C1936v2 v2Var, C1936v2.AbstractC1943g gVar) {
            boolean z;
            C1915r1.m39527a("PreviewView", "Preview transformation info updated. " + gVar);
            if (g0Var.mo3265j().mo3296c().intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            C2066l.this.f2337m.m39139o(gVar, v2Var.m39470l(), z);
            C2066l.this.m39132e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m39125g(C2056e eVar, AbstractC13597g0 g0Var) {
            if (C2062h.m39137a(C2066l.this.f2339o, eVar, null)) {
                eVar.m39156l(EnumC2072f.IDLE);
            }
            eVar.m39162f();
            g0Var.mo3264l().mo3076d(eVar);
        }

        @Override // androidx.camera.core.C1770a2.AbstractC1774d
        @SuppressLint({"UnsafeOptInUsageError"})
        /* renamed from: a */
        public void mo341a(final C1936v2 v2Var) {
            AbstractC2073m mVar;
            if (!C1869r.m39613b()) {
                C2337a.m38130h(C2066l.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2066l.C2067a.this.m39127e(v2Var);
                    }
                });
                return;
            }
            C1915r1.m39527a("PreviewView", "Surface requested by Preview.");
            final AbstractC13597g0 j = v2Var.m39472j();
            v2Var.m39459w(C2337a.m38130h(C2066l.this.getContext()), new C1936v2.AbstractC1944h() { // from class: androidx.camera.view.j
                @Override // androidx.camera.core.C1936v2.AbstractC1944h
                /* renamed from: a */
                public final void mo20571a(C1936v2.AbstractC1943g gVar) {
                    C2066l.C2067a.this.m39126f(j, v2Var, gVar);
                }
            });
            C2066l lVar = C2066l.this;
            if (C2066l.m39131f(v2Var, lVar.f2335k)) {
                C2066l lVar2 = C2066l.this;
                mVar = new C2050a0(lVar2, lVar2.f2337m);
            } else {
                C2066l lVar3 = C2066l.this;
                mVar = new C2081t(lVar3, lVar3.f2337m);
            }
            lVar.f2336l = mVar;
            AbstractC13589e0 j2 = j.mo3265j();
            C2066l lVar4 = C2066l.this;
            final C2056e eVar = new C2056e(j2, lVar4.f2338n, lVar4.f2336l);
            C2066l.this.f2339o.set(eVar);
            j.mo3264l().mo3078b(C2337a.m38130h(C2066l.this.getContext()), eVar);
            C2066l.this.f2336l.mo39109g(v2Var, new AbstractC2073m.AbstractC2074a() { // from class: androidx.camera.view.k
                @Override // androidx.camera.view.AbstractC2073m.AbstractC2074a
                /* renamed from: a */
                public final void mo39117a() {
                    C2066l.C2067a.this.m39125g(eVar, j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.l$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2068b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2346a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2347b;

        static {
            int[] iArr = new int[EnumC2069c.values().length];
            f2347b = iArr;
            try {
                iArr[EnumC2069c.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2347b[EnumC2069c.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC2071e.values().length];
            f2346a = iArr2;
            try {
                iArr2[EnumC2071e.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2346a[EnumC2071e.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2346a[EnumC2071e.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2346a[EnumC2071e.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2346a[EnumC2071e.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2346a[EnumC2071e.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.camera.view.l$c */
    /* loaded from: classes.dex */
    public enum EnumC2069c {
        PERFORMANCE(0),
        COMPATIBLE(1);
        

        /* renamed from: k */
        private final int f2351k;

        EnumC2069c(int i) {
            this.f2351k = i;
        }

        /* renamed from: a */
        static EnumC2069c m39124a(int i) {
            EnumC2069c[] values;
            for (EnumC2069c cVar : values()) {
                if (cVar.f2351k == i) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i);
        }

        /* renamed from: b */
        int m39123b() {
            return this.f2351k;
        }
    }

    /* renamed from: androidx.camera.view.l$d */
    /* loaded from: classes.dex */
    class C2070d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        C2070d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C2066l.this.getClass();
            return true;
        }
    }

    /* renamed from: androidx.camera.view.l$e */
    /* loaded from: classes.dex */
    public enum EnumC2071e {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        

        /* renamed from: k */
        private final int f2360k;

        EnumC2071e(int i) {
            this.f2360k = i;
        }

        /* renamed from: a */
        static EnumC2071e m39122a(int i) {
            EnumC2071e[] values;
            for (EnumC2071e eVar : values()) {
                if (eVar.f2360k == i) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i);
        }

        /* renamed from: b */
        int m39121b() {
            return this.f2360k;
        }
    }

    /* renamed from: androidx.camera.view.l$f */
    /* loaded from: classes.dex */
    public enum EnumC2072f {
        IDLE,
        STREAMING
    }

    public C2066l(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m39135b(boolean z) {
        C1869r.m39614a();
        getDisplay();
        getViewPort();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m39133d(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m39132e();
            m39135b(true);
        }
    }

    /* renamed from: f */
    static boolean m39131f(C1936v2 v2Var, EnumC2069c cVar) {
        boolean z;
        int i;
        boolean equals = v2Var.m39472j().mo3265j().mo8420f().equals("androidx.camera.camera2.legacy");
        if (C11957a.m8142a(C11960d.class) == null && C11957a.m8142a(C11959c.class) == null) {
            z = false;
        } else {
            z = true;
        }
        if (v2Var.m39469m() || Build.VERSION.SDK_INT <= 24 || equals || z || (i = C2068b.f2347b[cVar.ordinal()]) == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private int getViewPortScaleType() {
        switch (C2068b.f2346a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    @SuppressLint({"WrongConstant", "UnsafeOptInUsageError"})
    /* renamed from: c */
    public C1795c3 m39134c(int i) {
        C1869r.m39614a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new C1795c3.C1796a(new Rational(getWidth(), getHeight()), i).m39802c(getViewPortScaleType()).m39803b(getLayoutDirection()).m39804a();
    }

    /* renamed from: e */
    void m39132e() {
        C1869r.m39614a();
        AbstractC2073m mVar = this.f2336l;
        if (mVar != null) {
            mVar.m39118h();
        }
        this.f2340p.m39115e(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        C1869r.m39614a();
        AbstractC2073m mVar = this.f2336l;
        if (mVar == null) {
            return null;
        }
        return mVar.m39120a();
    }

    public AbstractC2049a getController() {
        C1869r.m39614a();
        return null;
    }

    public EnumC2069c getImplementationMode() {
        C1869r.m39614a();
        return this.f2335k;
    }

    public AbstractC1947w1 getMeteringPointFactory() {
        C1869r.m39614a();
        return this.f2340p;
    }

    public C12317a getOutputTransform() {
        Matrix matrix;
        C1869r.m39614a();
        try {
            matrix = this.f2337m.m39146h(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect g = this.f2337m.m39147g();
        if (matrix == null || g == null) {
            C1915r1.m39527a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrix.preConcat(C2053b0.m39172a(g));
        if (this.f2336l instanceof C2050a0) {
            matrix.postConcat(getMatrix());
        } else {
            C1915r1.m39517k("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new C12317a(matrix, new Size(g.width(), g.height()));
    }

    public LiveData<EnumC2072f> getPreviewStreamState() {
        return this.f2338n;
    }

    public EnumC2071e getScaleType() {
        C1869r.m39614a();
        return this.f2337m.m39148f();
    }

    public C1770a2.AbstractC1774d getSurfaceProvider() {
        C1869r.m39614a();
        return this.f2344t;
    }

    public C1795c3 getViewPort() {
        C1869r.m39614a();
        if (getDisplay() == null) {
            return null;
        }
        return m39134c(getDisplay().getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.f2343s);
        AbstractC2073m mVar = this.f2336l;
        if (mVar != null) {
            mVar.mo39111d();
        }
        m39135b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f2343s);
        AbstractC2073m mVar = this.f2336l;
        if (mVar != null) {
            mVar.mo39110e();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f2342r = null;
        return super.performClick();
    }

    public void setController(AbstractC2049a aVar) {
        C1869r.m39614a();
        m39135b(false);
    }

    public void setImplementationMode(EnumC2069c cVar) {
        C1869r.m39614a();
        this.f2335k = cVar;
    }

    public void setScaleType(EnumC2071e eVar) {
        C1869r.m39614a();
        this.f2337m.m39140n(eVar);
        m39132e();
        m39135b(false);
    }

    public C2066l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2066l(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Finally extract failed */
    public C2066l(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        EnumC2069c cVar = f2334u;
        this.f2335k = cVar;
        C2059f fVar = new C2059f();
        this.f2337m = fVar;
        this.f2338n = new MutableLiveData<>(EnumC2072f.IDLE);
        this.f2339o = new AtomicReference<>();
        this.f2340p = new C2075n(fVar);
        this.f2343s = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                C2066l.this.m39133d(view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        };
        this.f2344t = new C2067a();
        C1869r.m39614a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C2076o.f2371a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C2733w0.m36994o0(this, context, iArr, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(EnumC2071e.m39122a(obtainStyledAttributes.getInteger(C2076o.f2373c, fVar.m39148f().m39121b())));
            setImplementationMode(EnumC2069c.m39124a(obtainStyledAttributes.getInteger(C2076o.f2372b, cVar.m39123b())));
            obtainStyledAttributes.recycle();
            this.f2341q = new ScaleGestureDetector(context, new C2070d());
            if (getBackground() == null) {
                setBackgroundColor(C2337a.m38135c(getContext(), 17170444));
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
