package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.ReactViewGroup;
import p059d6.C6399a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public class SafeAreaProvider extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: k */
    private AbstractC6347a f12947k;

    /* renamed from: l */
    private EdgeInsets f12948l;

    /* renamed from: m */
    private Rect f12949m;

    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaProvider$a */
    /* loaded from: classes8.dex */
    public interface AbstractC6347a {
        void onInsetsChange(SafeAreaProvider safeAreaProvider, EdgeInsets edgeInsets, Rect rect);
    }

    public SafeAreaProvider(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m25782a() {
        EdgeInsets c = C6351c.m25779c(this);
        Rect a = C6351c.m25781a((ViewGroup) getRootView(), this);
        if (c != null && a != null) {
            EdgeInsets edgeInsets = this.f12948l;
            if (edgeInsets == null || this.f12949m == null || !edgeInsets.m25784a(c) || !this.f12949m.m25783a(a)) {
                ((AbstractC6347a) C6399a.m25622c(this.f12947k)).onInsetsChange(this, c, a);
                this.f12948l = c;
                this.f12949m = a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        m25782a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m25782a();
        return true;
    }

    public void setOnInsetsChangeListener(AbstractC6347a aVar) {
        this.f12947k = aVar;
    }
}
