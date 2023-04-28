package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C1575e;

/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
public class SubMenuC1591m extends C1575e implements SubMenu {

    /* renamed from: B */
    private C1575e f35182B;

    /* renamed from: C */
    private C1579g f35183C;

    public SubMenuC1591m(Context context, C1575e eVar, C1579g gVar) {
        super(context);
        this.f35182B = eVar;
        this.f35183C = gVar;
    }

    @Override // androidx.appcompat.view.menu.C1575e
    /* renamed from: D */
    public C1575e mo40569D() {
        return this.f35182B.mo40569D();
    }

    @Override // androidx.appcompat.view.menu.C1575e
    /* renamed from: F */
    public boolean mo40568F() {
        return this.f35182B.mo40568F();
    }

    @Override // androidx.appcompat.view.menu.C1575e
    /* renamed from: G */
    public boolean mo40567G() {
        return this.f35182B.mo40567G();
    }

    @Override // androidx.appcompat.view.menu.C1575e
    /* renamed from: H */
    public boolean mo40566H() {
        return this.f35182B.mo40566H();
    }

    @Override // androidx.appcompat.view.menu.C1575e
    /* renamed from: R */
    public void mo40565R(C1575e.AbstractC1576a aVar) {
        this.f35182B.mo40565R(aVar);
    }

    /* renamed from: e0 */
    public Menu m40564e0() {
        return this.f35182B;
    }

    @Override // androidx.appcompat.view.menu.C1575e
    /* renamed from: f */
    public boolean mo40563f(C1579g gVar) {
        return this.f35182B.mo40563f(gVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f35183C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C1575e
    /* renamed from: h */
    public boolean mo40562h(C1575e eVar, MenuItem menuItem) {
        if (super.mo40562h(eVar, menuItem) || this.f35182B.mo40562h(eVar, menuItem)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.C1575e
    /* renamed from: k */
    public boolean mo40561k(C1579g gVar) {
        return this.f35182B.mo40561k(gVar);
    }

    @Override // androidx.appcompat.view.menu.C1575e, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f35182B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m40657V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m40654Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m40653Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f35183C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C1575e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f35182B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C1575e
    /* renamed from: t */
    public String mo40560t() {
        int i;
        C1579g gVar = this.f35183C;
        if (gVar != null) {
            i = gVar.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.mo40560t() + ":" + i;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m40658U(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m40655X(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f35183C.setIcon(i);
        return this;
    }
}
