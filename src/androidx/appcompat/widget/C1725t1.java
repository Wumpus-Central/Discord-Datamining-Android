package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p052d.C6382d;
import p052d.C6384f;
import p052d.C6385g;
import p052d.C6387i;

/* renamed from: androidx.appcompat.widget.t1 */
/* loaded from: classes.dex */
class C1725t1 {

    /* renamed from: a */
    private final Context f1500a;

    /* renamed from: b */
    private final View f1501b;

    /* renamed from: c */
    private final TextView f1502c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1503d;

    /* renamed from: e */
    private final Rect f1504e = new Rect();

    /* renamed from: f */
    private final int[] f1505f = new int[2];

    /* renamed from: g */
    private final int[] f1506g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1725t1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1503d = layoutParams;
        this.f1500a = context;
        View inflate = LayoutInflater.from(context).inflate(C6385g.f13215s, (ViewGroup) null);
        this.f1501b = inflate;
        this.f1502c = (TextView) inflate.findViewById(C6384f.f13189s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C6387i.f13231a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m40024a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        int i5;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1500a.getResources().getDimensionPixelOffset(C6382d.f13142m);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1500a.getResources().getDimensionPixelOffset(C6382d.f13141l);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f1500a.getResources();
        if (z) {
            i5 = C6382d.f13144o;
        } else {
            i5 = C6382d.f13143n;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
        View b = m40023b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f1504e);
        Rect rect = this.f1504e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f1500a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i6 = resources2.getDimensionPixelSize(identifier);
            } else {
                i6 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f1504e.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f1506g);
        view.getLocationOnScreen(this.f1505f);
        int[] iArr = this.f1505f;
        int i7 = iArr[0];
        int[] iArr2 = this.f1506g;
        int i8 = i7 - iArr2[0];
        iArr[0] = i8;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i8 + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1501b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1501b.getMeasuredHeight();
        int i9 = this.f1505f[1];
        int i10 = ((i3 + i9) - dimensionPixelOffset3) - measuredHeight;
        int i11 = i9 + i4 + dimensionPixelOffset3;
        if (z) {
            if (i10 >= 0) {
                layoutParams.y = i10;
            } else {
                layoutParams.y = i11;
            }
        } else if (measuredHeight + i11 <= this.f1504e.height()) {
            layoutParams.y = i11;
        } else {
            layoutParams.y = i10;
        }
    }

    /* renamed from: b */
    private static View m40023b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m40022c() {
        if (m40021d()) {
            ((WindowManager) this.f1500a.getSystemService("window")).removeView(this.f1501b);
        }
    }

    /* renamed from: d */
    boolean m40021d() {
        return this.f1501b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m40020e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m40021d()) {
            m40022c();
        }
        this.f1502c.setText(charSequence);
        m40024a(view, i, i2, z, this.f1503d);
        ((WindowManager) this.f1500a.getSystemService("window")).addView(this.f1501b, this.f1503d);
    }
}
