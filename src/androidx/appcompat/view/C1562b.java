package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import p034c1.AbstractMenuC3752a;
import p034c1.AbstractMenuItemC3753b;
import p164j.MenuC9456d;
import p164j.MenuItemC9451c;

/* renamed from: androidx.appcompat.view.b */
/* loaded from: classes.dex */
public class C1562b extends ActionMode {

    /* renamed from: a */
    final Context f901a;

    /* renamed from: b */
    final ActionMode f902b;

    /* renamed from: androidx.appcompat.view.b$a */
    /* loaded from: classes.dex */
    public static class C1563a implements ActionMode.Callback {

        /* renamed from: a */
        final ActionMode.Callback f903a;

        /* renamed from: b */
        final Context f904b;

        /* renamed from: c */
        final ArrayList<C1562b> f905c = new ArrayList<>();

        /* renamed from: d */
        final SimpleArrayMap<Menu, Menu> f906d = new SimpleArrayMap<>();

        public C1563a(Context context, ActionMode.Callback callback) {
            this.f904b = context;
            this.f903a = callback;
        }

        /* renamed from: f */
        private Menu m40703f(Menu menu) {
            Menu menu2 = this.f906d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC9456d dVar = new MenuC9456d(this.f904b, (AbstractMenuC3752a) menu);
            this.f906d.put(menu, dVar);
            return dVar;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: a */
        public void mo40708a(ActionMode actionMode) {
            this.f903a.onDestroyActionMode(m40704e(actionMode));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: b */
        public boolean mo40707b(ActionMode actionMode, Menu menu) {
            return this.f903a.onCreateActionMode(m40704e(actionMode), m40703f(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: c */
        public boolean mo40706c(ActionMode actionMode, MenuItem menuItem) {
            return this.f903a.onActionItemClicked(m40704e(actionMode), new MenuItemC9451c(this.f904b, (AbstractMenuItemC3753b) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: d */
        public boolean mo40705d(ActionMode actionMode, Menu menu) {
            return this.f903a.onPrepareActionMode(m40704e(actionMode), m40703f(menu));
        }

        /* renamed from: e */
        public android.view.ActionMode m40704e(ActionMode actionMode) {
            int size = this.f905c.size();
            for (int i = 0; i < size; i++) {
                C1562b bVar = this.f905c.get(i);
                if (bVar != null && bVar.f902b == actionMode) {
                    return bVar;
                }
            }
            C1562b bVar2 = new C1562b(this.f904b, actionMode);
            this.f905c.add(bVar2);
            return bVar2;
        }
    }

    public C1562b(Context context, ActionMode actionMode) {
        this.f901a = context;
        this.f902b = actionMode;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f902b.mo40722c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f902b.mo40721d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC9456d(this.f901a, (AbstractMenuC3752a) this.f902b.mo40720e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f902b.mo40719f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f902b.mo40718g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f902b.m40725h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f902b.mo40717i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f902b.m40724j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f902b.mo40716k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f902b.mo40715l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f902b.mo40714m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f902b.mo40712o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f902b.m40723p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f902b.mo40710r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f902b.mo40709s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f902b.mo40713n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f902b.mo40711q(i);
    }
}
