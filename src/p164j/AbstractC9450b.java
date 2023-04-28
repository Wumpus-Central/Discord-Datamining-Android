package p164j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import p034c1.AbstractMenuItemC3753b;
import p034c1.AbstractSubMenuC3754c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j.b */
/* loaded from: classes.dex */
public abstract class AbstractC9450b {

    /* renamed from: a */
    final Context f20824a;

    /* renamed from: b */
    private SimpleArrayMap<AbstractMenuItemC3753b, MenuItem> f20825b;

    /* renamed from: c */
    private SimpleArrayMap<AbstractSubMenuC3754c, SubMenu> f20826c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9450b(Context context) {
        this.f20824a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m16216c(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemC3753b)) {
            return menuItem;
        }
        AbstractMenuItemC3753b bVar = (AbstractMenuItemC3753b) menuItem;
        if (this.f20825b == null) {
            this.f20825b = new SimpleArrayMap<>();
        }
        MenuItem menuItem2 = this.f20825b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC9451c cVar = new MenuItemC9451c(this.f20824a, bVar);
        this.f20825b.put(bVar, cVar);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m16215d(SubMenu subMenu) {
        if (!(subMenu instanceof AbstractSubMenuC3754c)) {
            return subMenu;
        }
        AbstractSubMenuC3754c cVar = (AbstractSubMenuC3754c) subMenu;
        if (this.f20826c == null) {
            this.f20826c = new SimpleArrayMap<>();
        }
        SubMenu subMenu2 = this.f20826c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC9458f fVar = new SubMenuC9458f(this.f20824a, cVar);
        this.f20826c.put(cVar, fVar);
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m16214e() {
        SimpleArrayMap<AbstractMenuItemC3753b, MenuItem> simpleArrayMap = this.f20825b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap<AbstractSubMenuC3754c, SubMenu> simpleArrayMap2 = this.f20826c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m16213f(int i) {
        if (this.f20825b != null) {
            int i2 = 0;
            while (i2 < this.f20825b.size()) {
                if (this.f20825b.m39052j(i2).getGroupId() == i) {
                    this.f20825b.m39050l(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m16212g(int i) {
        if (this.f20825b != null) {
            for (int i2 = 0; i2 < this.f20825b.size(); i2++) {
                if (this.f20825b.m39052j(i2).getItemId() == i) {
                    this.f20825b.m39050l(i2);
                    return;
                }
            }
        }
    }
}
