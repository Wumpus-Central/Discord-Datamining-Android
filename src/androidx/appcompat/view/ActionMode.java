package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class ActionMode {

    /* renamed from: k */
    private Object f892k;

    /* renamed from: l */
    private boolean f893l;

    /* loaded from: classes.dex */
    public interface Callback {
        /* renamed from: a */
        void mo40708a(ActionMode actionMode);

        /* renamed from: b */
        boolean mo40707b(ActionMode actionMode, Menu menu);

        /* renamed from: c */
        boolean mo40706c(ActionMode actionMode, MenuItem menuItem);

        /* renamed from: d */
        boolean mo40705d(ActionMode actionMode, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo40722c();

    /* renamed from: d */
    public abstract View mo40721d();

    /* renamed from: e */
    public abstract Menu mo40720e();

    /* renamed from: f */
    public abstract MenuInflater mo40719f();

    /* renamed from: g */
    public abstract CharSequence mo40718g();

    /* renamed from: h */
    public Object m40725h() {
        return this.f892k;
    }

    /* renamed from: i */
    public abstract CharSequence mo40717i();

    /* renamed from: j */
    public boolean m40724j() {
        return this.f893l;
    }

    /* renamed from: k */
    public abstract void mo40716k();

    /* renamed from: l */
    public boolean mo40715l() {
        return false;
    }

    /* renamed from: m */
    public abstract void mo40714m(View view);

    /* renamed from: n */
    public abstract void mo40713n(int i);

    /* renamed from: o */
    public abstract void mo40712o(CharSequence charSequence);

    /* renamed from: p */
    public void m40723p(Object obj) {
        this.f892k = obj;
    }

    /* renamed from: q */
    public abstract void mo40711q(int i);

    /* renamed from: r */
    public abstract void mo40710r(CharSequence charSequence);

    /* renamed from: s */
    public void mo40709s(boolean z) {
        this.f893l = z;
    }
}
