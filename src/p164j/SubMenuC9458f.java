package p164j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p034c1.AbstractSubMenuC3754c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j.f */
/* loaded from: classes.dex */
public class SubMenuC9458f extends MenuC9456d implements SubMenu {

    /* renamed from: e */
    private final AbstractSubMenuC3754c f20839e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC9458f(Context context, AbstractSubMenuC3754c cVar) {
        super(context, cVar);
        this.f20839e = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f20839e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m16216c(this.f20839e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f20839e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f20839e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f20839e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f20839e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f20839e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f20839e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f20839e.setIcon(drawable);
        return this;
    }
}
