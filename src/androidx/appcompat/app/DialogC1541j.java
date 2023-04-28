package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.C2720u;
import p052d.C6379a;

/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes.dex */
public class DialogC1541j extends Dialog implements AbstractC1512c {

    /* renamed from: k */
    private AppCompatDelegate f805k;

    /* renamed from: l */
    private final C2720u.AbstractC2721a f806l = new C1542a();

    /* renamed from: androidx.appcompat.app.j$a */
    /* loaded from: classes.dex */
    class C1542a implements C2720u.AbstractC2721a {
        C1542a() {
        }

        @Override // androidx.core.view.C2720u.AbstractC2721a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return DialogC1541j.this.m40802c(keyEvent);
        }
    }

    public DialogC1541j(Context context, int i) {
        super(context, m40803b(context, i));
        AppCompatDelegate a = m40804a();
        a.mo40900G(m40803b(context, i));
        a.mo40843r(null);
    }

    /* renamed from: b */
    private static int m40803b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C6379a.f13120z, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public AppCompatDelegate m40804a() {
        if (this.f805k == null) {
            this.f805k = AppCompatDelegate.m40922h(this, this);
        }
        return this.f805k;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m40804a().mo40867d(view, layoutParams);
    }

    /* renamed from: c */
    boolean m40802c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean m40801d(int i) {
        return m40804a().mo40911A(i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m40804a().mo40841s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C2720u.m37087e(this.f806l, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m40804a().mo40860i(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m40804a().mo40847p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m40804a().mo40849o();
        super.onCreate(bundle);
        m40804a().mo40843r(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m40804a().mo40831x();
    }

    @Override // androidx.appcompat.app.AbstractC1512c
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AbstractC1512c
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AbstractC1512c
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m40804a().mo40908C(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m40804a().mo40898H(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m40804a().mo40906D(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m40804a().mo40904E(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m40804a().mo40898H(getContext().getString(i));
    }
}
