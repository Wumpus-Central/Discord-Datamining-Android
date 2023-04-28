package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActivityC1510b;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C2337a;
import androidx.transition.C3184a0;
import androidx.transition.C3187b;
import androidx.transition.Transition;
import com.yalantis.ucrop.view.C6376b;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import gf.C7581a;
import gf.C7582b;
import gf.C7583c;
import gf.C7584d;
import gf.C7585e;
import gf.C7586f;
import gf.C7587g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p001if.a;
import p139hf.AbstractC8010a;
import p200kf.C9867i;

/* loaded from: classes8.dex */
public class UCropActivity extends ActivityC1510b {

    /* renamed from: O */
    public static final Bitmap.CompressFormat f37689O = Bitmap.CompressFormat.JPEG;

    /* renamed from: A */
    private ViewGroup f37690A;

    /* renamed from: B */
    private ViewGroup f37691B;

    /* renamed from: C */
    private ViewGroup f37692C;

    /* renamed from: D */
    private ViewGroup f37693D;

    /* renamed from: F */
    private TextView f37695F;

    /* renamed from: G */
    private TextView f37696G;

    /* renamed from: H */
    private View f37697H;

    /* renamed from: I */
    private Transition f37698I;

    /* renamed from: k */
    private String f12975k;

    /* renamed from: l */
    private int f12976l;

    /* renamed from: m */
    private int f12977m;

    /* renamed from: n */
    private int f12978n;

    /* renamed from: o */
    private int f12979o;

    /* renamed from: p */
    private int f12980p;

    /* renamed from: q */
    private int f12981q;

    /* renamed from: r */
    private int f12982r;

    /* renamed from: s */
    private int f12983s;

    /* renamed from: t */
    private boolean f12984t;

    /* renamed from: v */
    private UCropView f12986v;

    /* renamed from: w */
    private GestureCropImageView f12987w;

    /* renamed from: x */
    private OverlayView f12988x;

    /* renamed from: y */
    private ViewGroup f12989y;

    /* renamed from: z */
    private ViewGroup f12990z;

    /* renamed from: u */
    private boolean f12985u = true;

    /* renamed from: E */
    private List<ViewGroup> f37694E = new ArrayList();

    /* renamed from: J */
    private Bitmap.CompressFormat f37699J = f37689O;

    /* renamed from: K */
    private int f37700K = 90;

    /* renamed from: L */
    private int[] f37701L = {1, 2, 3};

    /* renamed from: M */
    private C6376b.AbstractC0188b f37702M = new C6359a();

    /* renamed from: N */
    private final View.OnClickListener f37703N = new View$OnClickListenerC6365g();

    /* renamed from: com.yalantis.ucrop.UCropActivity$a */
    /* loaded from: classes8.dex */
    class C6359a implements C6376b.AbstractC0188b {
        C6359a() {
        }

        @Override // com.yalantis.ucrop.view.C6376b.AbstractC0188b
        /* renamed from: a */
        public void mo25658a() {
            UCropActivity.this.f12986v.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.f37697H.setClickable(false);
            UCropActivity.this.f12985u = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.yalantis.ucrop.view.C6376b.AbstractC0188b
        /* renamed from: b */
        public void mo25657b(Exception exc) {
            UCropActivity.this.m25734w(exc);
            UCropActivity.this.finish();
        }

        @Override // com.yalantis.ucrop.view.C6376b.AbstractC0188b
        /* renamed from: c */
        public void mo25656c(float f) {
            UCropActivity.this.m25732y(f);
        }

        @Override // com.yalantis.ucrop.view.C6376b.AbstractC0188b
        /* renamed from: d */
        public void mo25655d(float f) {
            UCropActivity.this.m25738s(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$b */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC6360b implements View.OnClickListener {
        View$OnClickListenerC6360b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            UCropActivity.this.f12987w.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).m25653f(view.isSelected()));
            UCropActivity.this.f12987w.m25672z();
            if (!view.isSelected()) {
                for (ViewGroup viewGroup : UCropActivity.this.f37694E) {
                    if (viewGroup == view) {
                        z = true;
                    } else {
                        z = false;
                    }
                    viewGroup.setSelected(z);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$c */
    /* loaded from: classes8.dex */
    public class C6361c implements HorizontalProgressWheelView.AbstractC6378a {
        C6361c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.AbstractC6378a
        /* renamed from: a */
        public void mo25647a() {
            UCropActivity.this.f12987w.m25672z();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.AbstractC6378a
        /* renamed from: b */
        public void mo25646b() {
            UCropActivity.this.f12987w.m25678t();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.AbstractC6378a
        /* renamed from: c */
        public void mo25645c(float f, float f2) {
            UCropActivity.this.f12987w.m25674x(f / 42.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$d */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC6362d implements View.OnClickListener {
        View$OnClickListenerC6362d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.m25741p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$e */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC6363e implements View.OnClickListener {
        View$OnClickListenerC6363e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.m25740q(90);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$f */
    /* loaded from: classes8.dex */
    public class C6364f implements HorizontalProgressWheelView.AbstractC6378a {
        C6364f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.AbstractC6378a
        /* renamed from: a */
        public void mo25647a() {
            UCropActivity.this.f12987w.m25672z();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.AbstractC6378a
        /* renamed from: b */
        public void mo25646b() {
            UCropActivity.this.f12987w.m25678t();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.AbstractC6378a
        /* renamed from: c */
        public void mo25645c(float f, float f2) {
            if (f > 0.0f) {
                UCropActivity.this.f12987w.m25686C(UCropActivity.this.f12987w.getCurrentScale() + (f * ((UCropActivity.this.f12987w.getMaxScale() - UCropActivity.this.f12987w.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f12987w.m25684E(UCropActivity.this.f12987w.getCurrentScale() + (f * ((UCropActivity.this.f12987w.getMaxScale() - UCropActivity.this.f12987w.getMinScale()) / 15000.0f)));
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$g */
    /* loaded from: classes8.dex */
    class View$OnClickListenerC6365g implements View.OnClickListener {
        View$OnClickListenerC6365g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity.this.m25763B(view.getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$h */
    /* loaded from: classes8.dex */
    public class C6366h implements AbstractC8010a {
        C6366h() {
        }

        @Override // p139hf.AbstractC8010a
        /* renamed from: a */
        public void mo20860a(Uri uri, int i, int i2, int i3, int i4) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.m25733x(uri, uCropActivity.f12987w.getTargetAspectRatio(), i, i2, i3, i4);
            UCropActivity.this.finish();
        }

        @Override // p139hf.AbstractC8010a
        /* renamed from: b */
        public void mo20859b(Throwable th2) {
            UCropActivity.this.m25734w(th2);
            UCropActivity.this.finish();
        }
    }

    static {
        AppCompatDelegate.m40926B(true);
    }

    @TargetApi(21)
    /* renamed from: A */
    private void m25764A(int i) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m25763B(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        if (this.f12984t) {
            ViewGroup viewGroup = this.f12989y;
            int i4 = C7584d.f16483n;
            if (i == i4) {
                z = true;
            } else {
                z = false;
            }
            viewGroup.setSelected(z);
            ViewGroup viewGroup2 = this.f12990z;
            int i5 = C7584d.f16484o;
            if (i == i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            viewGroup2.setSelected(z2);
            ViewGroup viewGroup3 = this.f37690A;
            int i6 = C7584d.f16485p;
            if (i == i6) {
                z3 = true;
            } else {
                z3 = false;
            }
            viewGroup3.setSelected(z3);
            ViewGroup viewGroup4 = this.f37691B;
            int i7 = 8;
            if (i == i4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            viewGroup4.setVisibility(i2);
            ViewGroup viewGroup5 = this.f37692C;
            if (i == i5) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            viewGroup5.setVisibility(i3);
            ViewGroup viewGroup6 = this.f37693D;
            if (i == i6) {
                i7 = 0;
            }
            viewGroup6.setVisibility(i7);
            m25745l(i);
            if (i == i6) {
                m25739r(0);
            } else if (i == i5) {
                m25739r(1);
            } else {
                m25739r(2);
            }
        }
    }

    /* renamed from: C */
    private void m25762C() {
        m25764A(this.f12977m);
        Toolbar toolbar = (Toolbar) findViewById(C7584d.f16489t);
        toolbar.setBackgroundColor(this.f12976l);
        toolbar.setTitleTextColor(this.f12979o);
        TextView textView = (TextView) toolbar.findViewById(C7584d.f16490u);
        textView.setTextColor(this.f12979o);
        textView.setText(this.f12975k);
        Drawable mutate = C2337a.m38133e(this, this.f12981q).mutate();
        mutate.setColorFilter(this.f12979o, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo40733t(false);
        }
    }

    /* renamed from: D */
    private void m25761D(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new a(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new a(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new a(getString(C7587g.f16503c).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new a(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new a(null, 16.0f, 9.0f));
            intExtra = 2;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C7584d.f16476g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(C7585e.f16497b, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f12978n);
            aspectRatioTextView.setAspectRatio((a) it.next());
            linearLayout.addView(frameLayout);
            this.f37694E.add(frameLayout);
        }
        this.f37694E.get(intExtra).setSelected(true);
        for (ViewGroup viewGroup : this.f37694E) {
            viewGroup.setOnClickListener(new View$OnClickListenerC6360b());
        }
    }

    /* renamed from: E */
    private void m25760E() {
        this.f37695F = (TextView) findViewById(C7584d.f16487r);
        int i = C7584d.f16481l;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new C6361c());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.f12978n);
        findViewById(C7584d.f16495z).setOnClickListener(new View$OnClickListenerC6362d());
        findViewById(C7584d.f38371A).setOnClickListener(new View$OnClickListenerC6363e());
        m25737t(this.f12978n);
    }

    /* renamed from: F */
    private void m25759F() {
        this.f37696G = (TextView) findViewById(C7584d.f16488s);
        int i = C7584d.f16482m;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new C6364f());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.f12978n);
        m25731z(this.f12978n);
    }

    /* renamed from: G */
    private void m25758G() {
        ImageView imageView = (ImageView) findViewById(C7584d.f16475f);
        ImageView imageView2 = (ImageView) findViewById(C7584d.f16474e);
        ImageView imageView3 = (ImageView) findViewById(C7584d.f16473d);
        imageView.setImageDrawable(new C9867i(imageView.getDrawable(), this.f12978n));
        imageView2.setImageDrawable(new C9867i(imageView2.getDrawable(), this.f12978n));
        imageView3.setImageDrawable(new C9867i(imageView3.getDrawable(), this.f12978n));
    }

    /* renamed from: H */
    private void m25757H(Intent intent) {
        this.f12977m = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", C2337a.m38135c(this, C7581a.f16452h));
        this.f12976l = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", C2337a.m38135c(this, C7581a.f16453i));
        this.f12978n = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", C2337a.m38135c(this, C7581a.f16445a));
        this.f12979o = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", C2337a.m38135c(this, C7581a.f16454j));
        this.f12981q = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", C7583c.f16468a);
        this.f12982r = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", C7583c.f16469b);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f12975k = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(C7587g.f16502b);
        }
        this.f12975k = stringExtra;
        this.f12983s = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", C2337a.m38135c(this, C7581a.f16450f));
        this.f12984t = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f12980p = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", C2337a.m38135c(this, C7581a.f16446b));
        m25762C();
        m25743n();
        if (this.f12984t) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(C7584d.f16493x)).findViewById(C7584d.f16470a);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(C7585e.f16498c, viewGroup, true);
            C3187b bVar = new C3187b();
            this.f37698I = bVar;
            bVar.setDuration(50L);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(C7584d.f16483n);
            this.f12989y = viewGroup2;
            viewGroup2.setOnClickListener(this.f37703N);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(C7584d.f16484o);
            this.f12990z = viewGroup3;
            viewGroup3.setOnClickListener(this.f37703N);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(C7584d.f16485p);
            this.f37690A = viewGroup4;
            viewGroup4.setOnClickListener(this.f37703N);
            this.f37691B = (ViewGroup) findViewById(C7584d.f16476g);
            this.f37692C = (ViewGroup) findViewById(C7584d.f16477h);
            this.f37693D = (ViewGroup) findViewById(C7584d.f16478i);
            m25761D(intent);
            m25760E();
            m25759F();
            m25758G();
        }
    }

    /* renamed from: k */
    private void m25746k() {
        if (this.f37697H == null) {
            this.f37697H = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, C7584d.f16489t);
            this.f37697H.setLayoutParams(layoutParams);
            this.f37697H.setClickable(true);
        }
        ((RelativeLayout) findViewById(C7584d.f16493x)).addView(this.f37697H);
    }

    /* renamed from: l */
    private void m25745l(int i) {
        int i2;
        int i3;
        C3184a0.m34980a((ViewGroup) findViewById(C7584d.f16493x), this.f37698I);
        View findViewById = this.f37690A.findViewById(C7584d.f16488s);
        int i4 = 0;
        if (i == C7584d.f16485p) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        View findViewById2 = this.f12989y.findViewById(C7584d.f16486q);
        if (i == C7584d.f16483n) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        findViewById2.setVisibility(i3);
        View findViewById3 = this.f12990z.findViewById(C7584d.f16487r);
        if (i != C7584d.f16484o) {
            i4 = 8;
        }
        findViewById3.setVisibility(i4);
    }

    /* renamed from: n */
    private void m25743n() {
        UCropView uCropView = (UCropView) findViewById(C7584d.f16491v);
        this.f12986v = uCropView;
        this.f12987w = uCropView.getCropImageView();
        this.f12988x = this.f12986v.getOverlayView();
        this.f12987w.setTransformImageListener(this.f37702M);
        ((ImageView) findViewById(C7584d.f16472c)).setColorFilter(this.f12983s, PorterDuff.Mode.SRC_ATOP);
        int i = C7584d.f16492w;
        findViewById(i).setBackgroundColor(this.f12980p);
        if (!this.f12984t) {
            ((RelativeLayout.LayoutParams) findViewById(i).getLayoutParams()).bottomMargin = 0;
            findViewById(i).requestLayout();
        }
    }

    /* renamed from: o */
    private void m25742o(Intent intent) {
        Bitmap.CompressFormat compressFormat;
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        if (!TextUtils.isEmpty(stringExtra)) {
            compressFormat = Bitmap.CompressFormat.valueOf(stringExtra);
        } else {
            compressFormat = null;
        }
        if (compressFormat == null) {
            compressFormat = f37689O;
        }
        this.f37699J = compressFormat;
        this.f37700K = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.f37701L = intArrayExtra;
        }
        this.f12987w.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f12987w.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f12987w.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f12988x.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f12988x.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(C7581a.f16449e)));
        this.f12988x.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f12988x.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.f12988x.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(C7581a.f16447c)));
        this.f12988x.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(C7582b.f16458a)));
        this.f12988x.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.f12988x.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f12988x.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        OverlayView overlayView = this.f12988x;
        Resources resources = getResources();
        int i = C7581a.f16448d;
        overlayView.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", resources.getColor(i)));
        this.f12988x.setCropGridCornerColor(intent.getIntExtra("com.yalantis.ucrop.CropGridCornerColor", getResources().getColor(i)));
        this.f12988x.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(C7582b.f16459b)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra > 0.0f && floatExtra2 > 0.0f) {
            ViewGroup viewGroup = this.f12989y;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f12987w.setTargetAspectRatio(floatExtra / floatExtra2);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.f12987w.setTargetAspectRatio(0.0f);
        } else {
            this.f12987w.setTargetAspectRatio(((a) parcelableArrayListExtra.get(intExtra)).m19850b() / ((a) parcelableArrayListExtra.get(intExtra)).m19849e());
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 > 0 && intExtra3 > 0) {
            this.f12987w.setMaxResultImageSizeX(intExtra2);
            this.f12987w.setMaxResultImageSizeY(intExtra3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m25741p() {
        GestureCropImageView gestureCropImageView = this.f12987w;
        gestureCropImageView.m25674x(-gestureCropImageView.getCurrentAngle());
        this.f12987w.m25672z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m25740q(int i) {
        this.f12987w.m25674x(i);
        this.f12987w.m25672z();
    }

    /* renamed from: r */
    private void m25739r(int i) {
        boolean z;
        GestureCropImageView gestureCropImageView = this.f12987w;
        int i2 = this.f37701L[i];
        boolean z2 = false;
        if (i2 == 3 || i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        gestureCropImageView.setScaleEnabled(z);
        GestureCropImageView gestureCropImageView2 = this.f12987w;
        int i3 = this.f37701L[i];
        if (i3 == 3 || i3 == 2) {
            z2 = true;
        }
        gestureCropImageView2.setRotateEnabled(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m25738s(float f) {
        TextView textView = this.f37695F;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f)));
        }
    }

    /* renamed from: t */
    private void m25737t(int i) {
        TextView textView = this.f37695F;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: u */
    private void m25736u(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        m25742o(intent);
        if (uri == null || uri2 == null) {
            m25734w(new NullPointerException(getString(C7587g.f16501a)));
            finish();
            return;
        }
        try {
            this.f12987w.m25660n(uri, uri2);
        } catch (Exception e) {
            m25734w(e);
            finish();
        }
    }

    /* renamed from: v */
    private void m25735v() {
        if (!this.f12984t) {
            m25739r(0);
        } else if (this.f12989y.getVisibility() == 0) {
            m25763B(C7584d.f16483n);
        } else {
            m25763B(C7584d.f16485p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m25732y(float f) {
        TextView textView = this.f37696G;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f * 100.0f))));
        }
    }

    /* renamed from: z */
    private void m25731z(int i) {
        TextView textView = this.f37696G;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: m */
    protected void m25744m() {
        this.f37697H.setClickable(true);
        this.f12985u = true;
        supportInvalidateOptionsMenu();
        this.f12987w.m25677u(this.f37699J, this.f37700K, new C6366h());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C7585e.f16496a);
        Intent intent = getIntent();
        m25757H(intent);
        m25736u(intent);
        m25735v();
        m25746k();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C7586f.f16500a, menu);
        MenuItem findItem = menu.findItem(C7584d.f16480k);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f12979o, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e) {
                Log.i("UCropActivity", String.format("%s - %s", e.getMessage(), getString(C7587g.f16504d)));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(C7584d.f16479j);
        Drawable e2 = C2337a.m38133e(this, this.f12982r);
        if (e2 != null) {
            e2.mutate();
            e2.setColorFilter(this.f12979o, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(e2);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C7584d.f16479j) {
            m25744m();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(C7584d.f16479j).setVisible(!this.f12985u);
        menu.findItem(C7584d.f16480k).setVisible(this.f12985u);
        return super.onPrepareOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC1510b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f12987w;
        if (gestureCropImageView != null) {
            gestureCropImageView.m25678t();
        }
    }

    /* renamed from: w */
    protected void m25734w(Throwable th2) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th2));
    }

    /* renamed from: x */
    protected void m25733x(Uri uri, float f, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
    }
}
