package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;
import p052d.C6388j;

/* loaded from: classes.dex */
public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$b */
    /* loaded from: classes.dex */
    public interface AbstractC1500b {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1501c {
        /* renamed from: a */
        public abstract CharSequence m40959a();

        /* renamed from: b */
        public abstract View m40958b();

        /* renamed from: c */
        public abstract Drawable m40957c();

        /* renamed from: d */
        public abstract CharSequence m40956d();

        /* renamed from: e */
        public abstract void m40955e();
    }

    /* renamed from: g */
    public boolean mo40772g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo40741h() {
        return false;
    }

    /* renamed from: i */
    public void mo40740i(boolean z) {
    }

    /* renamed from: j */
    public abstract int mo40739j();

    /* renamed from: k */
    public Context mo40738k() {
        return null;
    }

    /* renamed from: l */
    public boolean mo40771l() {
        return false;
    }

    /* renamed from: m */
    public void mo40737m(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo40770n() {
    }

    /* renamed from: o */
    public boolean mo40736o(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: p */
    public boolean mo40769p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo40768q() {
        return false;
    }

    /* renamed from: r */
    public void mo40735r(boolean z) {
    }

    /* renamed from: s */
    public abstract void mo40734s(boolean z);

    /* renamed from: t */
    public abstract void mo40733t(boolean z);

    /* renamed from: u */
    public void mo40732u(Drawable drawable) {
    }

    /* renamed from: v */
    public void mo40731v(boolean z) {
    }

    /* renamed from: w */
    public abstract void mo40730w(CharSequence charSequence);

    /* renamed from: x */
    public void mo40729x(CharSequence charSequence) {
    }

    /* renamed from: y */
    public ActionMode mo40728y(ActionMode.Callback callback) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    /* loaded from: classes.dex */
    public static class C1499a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f658a;

        public C1499a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f658a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6388j.f13330t);
            this.f658a = obtainStyledAttributes.getInt(C6388j.f13335u, 0);
            obtainStyledAttributes.recycle();
        }

        public C1499a(int i, int i2) {
            super(i, i2);
            this.f658a = 8388627;
        }

        public C1499a(C1499a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f658a = 0;
            this.f658a = aVar.f658a;
        }

        public C1499a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f658a = 0;
        }
    }
}
