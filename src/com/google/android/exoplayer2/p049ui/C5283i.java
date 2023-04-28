package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.p049ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p119g9.C7557q0;
import p317r8.C12452a;
import p317r8.C12453b;

/* renamed from: com.google.android.exoplayer2.ui.i */
/* loaded from: classes5.dex */
final class C5283i extends FrameLayout implements SubtitleView.AbstractC5267a {

    /* renamed from: k */
    private final C5271a f9705k;

    /* renamed from: l */
    private final WebView f9706l;

    /* renamed from: m */
    private List<C12453b> f9707m;

    /* renamed from: n */
    private C12452a f9708n;

    /* renamed from: o */
    private float f9709o;

    /* renamed from: p */
    private int f9710p;

    /* renamed from: q */
    private float f9711q;

    /* renamed from: com.google.android.exoplayer2.ui.i$a */
    /* loaded from: classes5.dex */
    class C5284a extends WebView {
        C5284a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.ui.i$b */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C5285b {

        /* renamed from: a */
        static final /* synthetic */ int[] f9713a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f9713a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9713a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9713a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C5283i(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private static int m29650b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    /* renamed from: c */
    private static String m29649c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = C5285b.f9713a[alignment.ordinal()];
        if (i == 1) {
            return ViewProps.START;
        }
        if (i != 2) {
            return "center";
        }
        return ViewProps.END;
    }

    /* renamed from: d */
    private static String m29648d(C12452a aVar) {
        int i = aVar.f28075d;
        if (i == 1) {
            return C7557q0.m22209D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C5272b.m29681b(aVar.f28076e));
        }
        if (i == 2) {
            return C7557q0.m22209D("0.1em 0.12em 0.15em %s", C5272b.m29681b(aVar.f28076e));
        }
        if (i == 3) {
            return C7557q0.m22209D("0.06em 0.08em 0.15em %s", C5272b.m29681b(aVar.f28076e));
        }
        if (i != 4) {
            return "unset";
        }
        return C7557q0.m22209D("-0.05em -0.05em 0.15em %s", C5272b.m29681b(aVar.f28076e));
    }

    /* renamed from: e */
    private String m29647e(int i, float f) {
        float a = C5280g.m29657a(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (a == -3.4028235E38f) {
            return "unset";
        }
        return C7557q0.m22209D("%.2fpx", Float.valueOf(a / getContext().getResources().getDisplayMetrics().density));
    }

    /* renamed from: f */
    private static String m29646f(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* renamed from: h */
    private static String m29644h(C12453b bVar) {
        String str;
        float f = bVar.f28094p;
        if (f == 0.0f) {
            return "";
        }
        int i = bVar.f28093o;
        if (i == 2 || i == 1) {
            str = "skewY";
        } else {
            str = "skewX";
        }
        return C7557q0.m22209D("%s(%.2fdeg)", str, Float.valueOf(f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0144, code lost:
        if (r13 != 0) goto L_0x014b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0147, code lost:
        if (r13 != 0) goto L_0x0149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0149, code lost:
        r20 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014b, code lost:
        r21 = r22;
        r13 = 2;
        r22 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29643i() {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.C5283i.m29643i():void");
    }

    @Override // com.google.android.exoplayer2.p049ui.SubtitleView.AbstractC5267a
    /* renamed from: a */
    public void mo29651a(List<C12453b> list, C12452a aVar, float f, int i, float f2) {
        this.f9708n = aVar;
        this.f9709o = f;
        this.f9710p = i;
        this.f9711q = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C12453b bVar = list.get(i2);
            if (bVar.f28081c != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f9707m.isEmpty() || !arrayList2.isEmpty()) {
            this.f9707m = arrayList2;
            m29643i();
        }
        this.f9705k.mo29651a(arrayList, aVar, f, i, f2);
        invalidate();
    }

    /* renamed from: g */
    public void m29645g() {
        this.f9706l.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f9707m.isEmpty()) {
            m29643i();
        }
    }

    public C5283i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9707m = Collections.emptyList();
        this.f9708n = C12452a.f28071g;
        this.f9709o = 0.0533f;
        this.f9710p = 0;
        this.f9711q = 0.08f;
        C5271a aVar = new C5271a(context, attributeSet);
        this.f9705k = aVar;
        C5284a aVar2 = new C5284a(context, attributeSet);
        this.f9706l = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
