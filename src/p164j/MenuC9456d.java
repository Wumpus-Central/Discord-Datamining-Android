package p164j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p034c1.AbstractMenuC3752a;

/* renamed from: j.d */
/* loaded from: classes.dex */
public class MenuC9456d extends AbstractC9450b implements Menu {

    /* renamed from: d */
    private final AbstractMenuC3752a f20838d;

    public MenuC9456d(Context context, AbstractMenuC3752a aVar) {
        super(context);
        if (aVar != null) {
            this.f20838d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m16216c(this.f20838d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f20838d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m16216c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m16215d(this.f20838d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m16214e();
        this.f20838d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f20838d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m16216c(this.f20838d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m16216c(this.f20838d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f20838d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f20838d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f20838d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f20838d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m16213f(i);
        this.f20838d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m16212g(i);
        this.f20838d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f20838d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f20838d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f20838d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f20838d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f20838d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m16216c(this.f20838d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m16215d(this.f20838d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m16216c(this.f20838d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m16215d(this.f20838d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m16216c(this.f20838d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m16215d(this.f20838d.addSubMenu(i, i2, i3, i4));
    }
}
