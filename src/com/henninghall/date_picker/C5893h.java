package com.henninghall.date_picker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.react.bridge.Dynamic;
import java.util.ArrayList;
import p044ce.C3988a;
import p044ce.C3991d;

/* renamed from: com.henninghall.date_picker.h */
/* loaded from: classes6.dex */
public class C5893h extends RelativeLayout {

    /* renamed from: k */
    private final ViewGroup.LayoutParams f11710k;

    /* renamed from: l */
    private C3991d f11711l;

    /* renamed from: m */
    private C5897k f11712m = new C5897k();

    /* renamed from: n */
    private ArrayList<String> f11713n = new ArrayList<>();

    /* renamed from: o */
    private final Runnable f11714o = new RunnableC5894a();

    /* renamed from: com.henninghall.date_picker.h$a */
    /* loaded from: classes6.dex */
    class RunnableC5894a implements Runnable {
        RunnableC5894a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5893h hVar = C5893h.this;
            hVar.measure(View.MeasureSpec.makeMeasureSpec(hVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C5893h.this.getHeight(), 1073741824));
            C5893h hVar2 = C5893h.this;
            hVar2.layout(hVar2.getLeft(), C5893h.this.getTop(), C5893h.this.getRight(), C5893h.this.getBottom());
        }
    }

    public C5893h(ViewGroup.LayoutParams layoutParams) {
        super(C5882b.f11696a);
        this.f11710k = layoutParams;
    }

    /* renamed from: a */
    private boolean m26961a(String... strArr) {
        for (String str : strArr) {
            if (this.f11713n.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m26960b(int i, int i2) {
        this.f11711l.m33175e(i, i2);
    }

    /* renamed from: c */
    public void m26959c() {
        if (m26961a("androidVariant")) {
            removeAllViewsInLayout();
            LinearLayout linearLayout = new LinearLayout(getContext());
            LayoutInflater.from(getContext()).inflate(this.f11712m.f11745p.m26984d(), linearLayout);
            addView(linearLayout, this.f11710k);
            this.f11711l = new C3991d(this.f11712m, this);
        }
        if (m26961a("fadeToColor")) {
            this.f11711l.m33171i();
        }
        if (m26961a("textColor")) {
            this.f11711l.m33168l();
        }
        if (m26961a("mode", "androidVariant", "is24hourSource")) {
            this.f11711l.m33165o();
        }
        if (m26961a("height")) {
            this.f11711l.m33170j();
        }
        if (m26961a("dividerHeight")) {
            this.f11711l.m33172h();
        }
        if (m26961a("mode", "locale", "androidVariant", "is24hourSource")) {
            this.f11711l.m33167m();
        }
        if (m26961a("mode")) {
            this.f11711l.m33166n();
        }
        if (m26961a("date", "height", "locale", "maximumDate", "minimumDate", "minuteInterval", "mode", "utc", "androidVariant")) {
            this.f11711l.m33173g();
        }
        if (m26961a("locale")) {
            C3988a.m33187h(this.f11712m.m26931u());
        }
        this.f11711l.m33174f();
        this.f11713n = new ArrayList<>();
    }

    /* renamed from: d */
    public void m26958d(String str, Dynamic dynamic) {
        this.f11712m.m26952F(str, dynamic);
        this.f11713n.add(str);
    }

    public String getDate() {
        return this.f11712m.f11745p.m26987a();
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f11714o);
    }
}
