package p164j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2599b;
import java.lang.reflect.Method;
import p034c1.AbstractMenuItemC3753b;
import p144i.AbstractC8095b;

/* renamed from: j.c */
/* loaded from: classes.dex */
public class MenuItemC9451c extends AbstractC9450b implements MenuItem {

    /* renamed from: d */
    private final AbstractMenuItemC3753b f20827d;

    /* renamed from: e */
    private Method f20828e;

    /* renamed from: j.c$a */
    /* loaded from: classes.dex */
    private class C9452a extends AbstractC2599b {

        /* renamed from: d */
        final ActionProvider f20829d;

        C9452a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f20829d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC2599b
        /* renamed from: a */
        public boolean mo16210a() {
            return this.f20829d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC2599b
        /* renamed from: c */
        public View mo16209c() {
            return this.f20829d.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC2599b
        /* renamed from: e */
        public boolean mo16208e() {
            return this.f20829d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC2599b
        /* renamed from: f */
        public void mo16207f(SubMenu subMenu) {
            this.f20829d.onPrepareSubMenu(MenuItemC9451c.this.m16215d(subMenu));
        }
    }

    /* renamed from: j.c$b */
    /* loaded from: classes.dex */
    private class ActionProvider$VisibilityListenerC9453b extends C9452a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private AbstractC2599b.AbstractC0045b f20831f;

        ActionProvider$VisibilityListenerC9453b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC2599b
        /* renamed from: b */
        public boolean mo16206b() {
            return this.f20829d.isVisible();
        }

        @Override // androidx.core.view.AbstractC2599b
        /* renamed from: d */
        public View mo16205d(MenuItem menuItem) {
            return this.f20829d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC2599b
        /* renamed from: g */
        public boolean mo16204g() {
            return this.f20829d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC2599b
        /* renamed from: j */
        public void mo16203j(AbstractC2599b.AbstractC0045b bVar) {
            ActionProvider$VisibilityListenerC9453b bVar2;
            this.f20831f = bVar;
            ActionProvider actionProvider = this.f20829d;
            if (bVar != null) {
                bVar2 = this;
            } else {
                bVar2 = null;
            }
            actionProvider.setVisibilityListener(bVar2);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC2599b.AbstractC0045b bVar = this.f20831f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: j.c$c */
    /* loaded from: classes.dex */
    static class C0280c extends FrameLayout implements AbstractC8095b {

        /* renamed from: k */
        final CollapsibleActionView f20833k;

        C0280c(View view) {
            super(view.getContext());
            this.f20833k = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m16202a() {
            return (View) this.f20833k;
        }

        @Override // p144i.AbstractC8095b
        public void onActionViewCollapsed() {
            this.f20833k.onActionViewCollapsed();
        }

        @Override // p144i.AbstractC8095b
        public void onActionViewExpanded() {
            this.f20833k.onActionViewExpanded();
        }
    }

    /* renamed from: j.c$d */
    /* loaded from: classes.dex */
    private class MenuItem$OnActionExpandListenerC9454d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f20834a;

        MenuItem$OnActionExpandListenerC9454d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f20834a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f20834a.onMenuItemActionCollapse(MenuItemC9451c.this.m16216c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f20834a.onMenuItemActionExpand(MenuItemC9451c.this.m16216c(menuItem));
        }
    }

    /* renamed from: j.c$e */
    /* loaded from: classes.dex */
    private class MenuItem$OnMenuItemClickListenerC9455e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f20836a;

        MenuItem$OnMenuItemClickListenerC9455e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f20836a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f20836a.onMenuItemClick(MenuItemC9451c.this.m16216c(menuItem));
        }
    }

    public MenuItemC9451c(Context context, AbstractMenuItemC3753b bVar) {
        super(context);
        if (bVar != null) {
            this.f20827d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f20827d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f20827d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC2599b a = this.f20827d.mo16222a();
        if (a instanceof C9452a) {
            return ((C9452a) a).f20829d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f20827d.getActionView();
        if (actionView instanceof C0280c) {
            return ((C0280c) actionView).m16202a();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f20827d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f20827d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f20827d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f20827d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f20827d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f20827d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f20827d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f20827d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f20827d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f20827d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f20827d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f20827d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f20827d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m16215d(this.f20827d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f20827d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f20827d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f20827d.getTooltipText();
    }

    /* renamed from: h */
    public void m16211h(boolean z) {
        try {
            if (this.f20828e == null) {
                this.f20828e = this.f20827d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f20828e.invoke(this.f20827d, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f20827d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f20827d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f20827d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f20827d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f20827d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f20827d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProvider$VisibilityListenerC9453b bVar = new ActionProvider$VisibilityListenerC9453b(this.f20824a, actionProvider);
        AbstractMenuItemC3753b bVar2 = this.f20827d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo16221b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0280c(view);
        }
        this.f20827d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f20827d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f20827d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f20827d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f20827d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f20827d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f20827d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20827d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20827d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f20827d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f20827d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        MenuItem$OnActionExpandListenerC9454d dVar;
        AbstractMenuItemC3753b bVar = this.f20827d;
        if (onActionExpandListener != null) {
            dVar = new MenuItem$OnActionExpandListenerC9454d(onActionExpandListener);
        } else {
            dVar = null;
        }
        bVar.setOnActionExpandListener(dVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItem$OnMenuItemClickListenerC9455e eVar;
        AbstractMenuItemC3753b bVar = this.f20827d;
        if (onMenuItemClickListener != null) {
            eVar = new MenuItem$OnMenuItemClickListenerC9455e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        bVar.setOnMenuItemClickListener(eVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f20827d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f20827d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f20827d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f20827d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20827d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f20827d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f20827d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f20827d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f20827d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f20827d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f20827d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f20827d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f20827d.setActionView(i);
        View actionView = this.f20827d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f20827d.setActionView(new C0280c(actionView));
        }
        return this;
    }
}
