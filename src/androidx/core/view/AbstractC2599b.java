package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC2599b {

    /* renamed from: a */
    private final Context f3593a;

    /* renamed from: b */
    private AbstractC2600a f3594b;

    /* renamed from: c */
    private AbstractC0045b f3595c;

    /* renamed from: androidx.core.view.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC2600a {
    }

    /* renamed from: androidx.core.view.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0045b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC2599b(Context context) {
        this.f3593a = context;
    }

    /* renamed from: a */
    public boolean mo16210a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo16206b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo16209c();

    /* renamed from: d */
    public View mo16205d(MenuItem menuItem) {
        return mo16209c();
    }

    /* renamed from: e */
    public boolean mo16208e() {
        return false;
    }

    /* renamed from: f */
    public void mo16207f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo16204g() {
        return false;
    }

    /* renamed from: h */
    public void m37286h() {
        this.f3595c = null;
        this.f3594b = null;
    }

    /* renamed from: i */
    public void m37285i(AbstractC2600a aVar) {
        this.f3594b = aVar;
    }

    /* renamed from: j */
    public void mo16203j(AbstractC0045b bVar) {
        if (!(this.f3595c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3595c = bVar;
    }
}
