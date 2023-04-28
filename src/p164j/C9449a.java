package p164j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C2337a;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.AbstractC2599b;
import p034c1.AbstractMenuItemC3753b;

/* renamed from: j.a */
/* loaded from: classes.dex */
public class C9449a implements AbstractMenuItemC3753b {

    /* renamed from: a */
    private final int f20804a;

    /* renamed from: b */
    private final int f20805b;

    /* renamed from: c */
    private final int f20806c;

    /* renamed from: d */
    private CharSequence f20807d;

    /* renamed from: e */
    private CharSequence f20808e;

    /* renamed from: f */
    private Intent f20809f;

    /* renamed from: g */
    private char f20810g;

    /* renamed from: i */
    private char f20812i;

    /* renamed from: k */
    private Drawable f20814k;

    /* renamed from: l */
    private Context f20815l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f20816m;

    /* renamed from: n */
    private CharSequence f20817n;

    /* renamed from: o */
    private CharSequence f20818o;

    /* renamed from: h */
    private int f20811h = 4096;

    /* renamed from: j */
    private int f20813j = 4096;

    /* renamed from: p */
    private ColorStateList f20819p = null;

    /* renamed from: q */
    private PorterDuff.Mode f20820q = null;

    /* renamed from: r */
    private boolean f20821r = false;

    /* renamed from: s */
    private boolean f20822s = false;

    /* renamed from: t */
    private int f20823t = 16;

    public C9449a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f20815l = context;
        this.f20804a = i2;
        this.f20805b = i;
        this.f20806c = i4;
        this.f20807d = charSequence;
    }

    /* renamed from: c */
    private void m16220c() {
        Drawable drawable = this.f20814k;
        if (drawable == null) {
            return;
        }
        if (this.f20821r || this.f20822s) {
            Drawable r = C2400a.m37825r(drawable);
            this.f20814k = r;
            Drawable mutate = r.mutate();
            this.f20814k = mutate;
            if (this.f20821r) {
                C2400a.m37828o(mutate, this.f20819p);
            }
            if (this.f20822s) {
                C2400a.m37827p(this.f20814k, this.f20820q);
            }
        }
    }

    @Override // p034c1.AbstractMenuItemC3753b
    /* renamed from: a */
    public AbstractC2599b mo16222a() {
        return null;
    }

    @Override // p034c1.AbstractMenuItemC3753b
    /* renamed from: b */
    public AbstractMenuItemC3753b mo16221b(AbstractC2599b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public AbstractMenuItemC3753b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public AbstractMenuItemC3753b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public AbstractMenuItemC3753b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f20813j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f20812i;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f20817n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f20805b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f20814k;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f20819p;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f20820q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f20809f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f20804a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f20811h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f20810g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f20806c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f20807d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20808e;
        return charSequence != null ? charSequence : this.f20807d;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f20818o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f20823t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f20823t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f20823t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f20823t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f20812i = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f20823t = (z ? 1 : 0) | (this.f20823t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f20823t = (z ? 2 : 0) | (this.f20823t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f20823t = (z ? 16 : 0) | (this.f20823t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f20814k = drawable;
        m16220c();
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20819p = colorStateList;
        this.f20821r = true;
        m16220c();
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20820q = mode;
        this.f20822s = true;
        m16220c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f20809f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f20810g = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f20816m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f20810g = c;
        this.f20812i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f20807d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20808e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f20823t & 8;
        if (z) {
            i = 0;
        }
        this.f20823t = i2 | i;
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f20812i = Character.toLowerCase(c);
        this.f20813j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public AbstractMenuItemC3753b setContentDescription(CharSequence charSequence) {
        this.f20817n = charSequence;
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f20810g = c;
        this.f20811h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f20807d = this.f20815l.getResources().getString(i);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public AbstractMenuItemC3753b setTooltipText(CharSequence charSequence) {
        this.f20818o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f20814k = C2337a.m38133e(this.f20815l, i);
        m16220c();
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f20810g = c;
        this.f20811h = KeyEvent.normalizeMetaState(i);
        this.f20812i = Character.toLowerCase(c2);
        this.f20813j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
