package com.reactnativecommunity.webview;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ThemedReactContext;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p414x3.C13925a;

/* renamed from: com.reactnativecommunity.webview.b */
/* loaded from: classes6.dex */
public class C6158b extends FrameLayout {

    /* renamed from: k */
    public int f12575k = 0;

    /* renamed from: l */
    private RNCWebViewManager.C6144e f12576l;

    /* renamed from: com.reactnativecommunity.webview.b$a */
    /* loaded from: classes6.dex */
    class ViewGroup$OnHierarchyChangeListenerC6159a implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC6159a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(C6158b.this.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C6158b.this.getMeasuredHeight(), 1073741824));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }

    /* renamed from: com.reactnativecommunity.webview.b$b */
    /* loaded from: classes6.dex */
    public interface AbstractC0183b {
        /* renamed from: a */
        void mo26108a(RNCWebViewManager.C6144e eVar);
    }

    public C6158b(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC6159a());
    }

    /* renamed from: c */
    public static int m26115c(WebView webView) {
        Integer num = C6161b1.f12579a.m26110c().get(Integer.valueOf(webView.getId()));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public void m26117a(RNCWebViewManager.C6144e eVar) {
        this.f12576l = eVar;
        if (eVar.getParent() == null) {
            addView(eVar, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        throw new IllegalArgumentException("WebView with key: " + eVar.f12522p + " parent is non null. Cannot re-attach webview.");
    }

    /* renamed from: b */
    public RNCWebViewManager.C6144e m26116b() {
        if (this.f12576l != null) {
            m26113e();
            RNCWebViewManager.C6144e eVar = this.f12576l;
            this.f12576l = null;
            return eVar;
        }
        throw new IllegalStateException("Webview is null");
    }

    /* renamed from: d */
    public void m26114d(AbstractC0183b bVar) {
        RNCWebViewManager.C6144e eVar = this.f12576l;
        if (eVar != null) {
            bVar.mo26108a(eVar);
        } else {
            C13925a.m2285m(RNCWebViewModule.MODULE_NAME, new Throwable(), "Internal WebView is null", new Object[0]);
        }
    }

    /* renamed from: e */
    public void m26113e() {
        RNCWebViewManager.C6144e eVar = this.f12576l;
        if (eVar != null) {
            endViewTransition(eVar);
            removeView(this.f12576l);
        }
    }

    public RNCWebViewManager.C6144e getWebView() {
        return this.f12576l;
    }
}
