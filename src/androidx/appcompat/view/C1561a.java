package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p144i.C8097d;

/* renamed from: androidx.appcompat.view.a */
/* loaded from: classes.dex */
public class C1561a extends ActionMode implements C1575e.AbstractC1576a {

    /* renamed from: m */
    private Context f894m;

    /* renamed from: n */
    private ActionBarContextView f895n;

    /* renamed from: o */
    private ActionMode.Callback f896o;

    /* renamed from: p */
    private WeakReference<View> f897p;

    /* renamed from: q */
    private boolean f898q;

    /* renamed from: r */
    private boolean f899r;

    /* renamed from: s */
    private C1575e f900s;

    public C1561a(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z) {
        this.f894m = context;
        this.f895n = actionBarContextView;
        this.f896o = callback;
        C1575e S = new C1575e(actionBarContextView.getContext()).m40660S(1);
        this.f900s = S;
        S.mo40565R(this);
        this.f899r = z;
    }

    @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
    /* renamed from: a */
    public boolean mo40516a(C1575e eVar, MenuItem menuItem) {
        return this.f896o.mo40706c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C1575e.AbstractC1576a
    /* renamed from: b */
    public void mo40515b(C1575e eVar) {
        mo40716k();
        this.f895n.m40552l();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: c */
    public void mo40722c() {
        if (!this.f898q) {
            this.f898q = true;
            this.f896o.mo40708a(this);
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: d */
    public View mo40721d() {
        WeakReference<View> weakReference = this.f897p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: e */
    public Menu mo40720e() {
        return this.f900s;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: f */
    public MenuInflater mo40719f() {
        return new C8097d(this.f895n.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: g */
    public CharSequence mo40718g() {
        return this.f895n.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: i */
    public CharSequence mo40717i() {
        return this.f895n.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: k */
    public void mo40716k() {
        this.f896o.mo40705d(this, this.f900s);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: l */
    public boolean mo40715l() {
        return this.f895n.m40554j();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: m */
    public void mo40714m(View view) {
        WeakReference<View> weakReference;
        this.f895n.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f897p = weakReference;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: n */
    public void mo40713n(int i) {
        mo40712o(this.f894m.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: o */
    public void mo40712o(CharSequence charSequence) {
        this.f895n.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: q */
    public void mo40711q(int i) {
        mo40710r(this.f894m.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: r */
    public void mo40710r(CharSequence charSequence) {
        this.f895n.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: s */
    public void mo40709s(boolean z) {
        super.mo40709s(z);
        this.f895n.setTitleOptional(z);
    }
}
