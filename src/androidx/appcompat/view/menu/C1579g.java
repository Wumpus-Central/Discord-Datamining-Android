package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.AbstractC1586k;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.AbstractC2599b;
import p034c1.AbstractMenuItemC3753b;
import p052d.C6386h;
import p071e.C6525a;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class C1579g implements AbstractMenuItemC3753b {

    /* renamed from: A */
    private View f35171A;

    /* renamed from: B */
    private AbstractC2599b f35172B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f35173C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f35175E;

    /* renamed from: a */
    private final int f1020a;

    /* renamed from: b */
    private final int f1021b;

    /* renamed from: c */
    private final int f1022c;

    /* renamed from: d */
    private final int f1023d;

    /* renamed from: e */
    private CharSequence f1024e;

    /* renamed from: f */
    private CharSequence f1025f;

    /* renamed from: g */
    private Intent f1026g;

    /* renamed from: h */
    private char f1027h;

    /* renamed from: j */
    private char f1029j;

    /* renamed from: l */
    private Drawable f1031l;

    /* renamed from: n */
    C1575e f1033n;

    /* renamed from: o */
    private SubMenuC1591m f1034o;

    /* renamed from: p */
    private Runnable f1035p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1036q;

    /* renamed from: r */
    private CharSequence f1037r;

    /* renamed from: s */
    private CharSequence f1038s;

    /* renamed from: z */
    private int f1045z;

    /* renamed from: i */
    private int f1028i = 4096;

    /* renamed from: k */
    private int f1030k = 4096;

    /* renamed from: m */
    private int f1032m = 0;

    /* renamed from: t */
    private ColorStateList f1039t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1040u = null;

    /* renamed from: v */
    private boolean f1041v = false;

    /* renamed from: w */
    private boolean f1042w = false;

    /* renamed from: x */
    private boolean f1043x = false;

    /* renamed from: y */
    private int f1044y = 16;

    /* renamed from: D */
    private boolean f35174D = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    class C1580a implements AbstractC2599b.AbstractC0045b {
        C1580a() {
        }

        @Override // androidx.core.view.AbstractC2599b.AbstractC0045b
        public void onActionProviderVisibilityChanged(boolean z) {
            C1579g gVar = C1579g.this;
            gVar.f1033n.m40668J(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1579g(C1575e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1033n = eVar;
        this.f1020a = i2;
        this.f1021b = i;
        this.f1022c = i3;
        this.f1023d = i4;
        this.f1024e = charSequence;
        this.f1045z = i5;
    }

    /* renamed from: d */
    private static void m40621d(StringBuilder sb2, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb2.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m40620e(Drawable drawable) {
        if (drawable != null && this.f1043x && (this.f1041v || this.f1042w)) {
            drawable = C2400a.m37825r(drawable).mutate();
            if (this.f1041v) {
                C2400a.m37828o(drawable, this.f1039t);
            }
            if (this.f1042w) {
                C2400a.m37827p(drawable, this.f1040u);
            }
            this.f1043x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m40624A() {
        return this.f1033n.mo40566H() && m40618g() != 0;
    }

    /* renamed from: B */
    public boolean m40623B() {
        return (this.f1045z & 4) == 4;
    }

    @Override // p034c1.AbstractMenuItemC3753b
    /* renamed from: a */
    public AbstractC2599b mo16222a() {
        return this.f35172B;
    }

    @Override // p034c1.AbstractMenuItemC3753b
    /* renamed from: b */
    public AbstractMenuItemC3753b mo16221b(AbstractC2599b bVar) {
        AbstractC2599b bVar2 = this.f35172B;
        if (bVar2 != null) {
            bVar2.m37286h();
        }
        this.f35171A = null;
        this.f35172B = bVar;
        this.f1033n.m40667K(true);
        AbstractC2599b bVar3 = this.f35172B;
        if (bVar3 != null) {
            bVar3.mo16203j(new C1580a());
        }
        return this;
    }

    /* renamed from: c */
    public void m40622c() {
        this.f1033n.m40669I(this);
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1045z & 8) == 0) {
            return false;
        }
        if (this.f35171A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f35173C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1033n.mo40563f(this);
        }
        return false;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m40615j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f35173C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1033n.mo40561k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int m40619f() {
        return this.f1023d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public char m40618g() {
        return this.f1033n.mo40567G() ? this.f1029j : this.f1027h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public View getActionView() {
        View view = this.f35171A;
        if (view != null) {
            return view;
        }
        AbstractC2599b bVar = this.f35172B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo16205d(this);
        this.f35171A = d;
        return d;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1030k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1029j;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1037r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1021b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1031l;
        if (drawable != null) {
            return m40620e(drawable);
        }
        if (this.f1032m == 0) {
            return null;
        }
        Drawable b = C6525a.m25364b(this.f1033n.m40632u(), this.f1032m);
        this.f1032m = 0;
        this.f1031l = b;
        return m40620e(b);
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1039t;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1040u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1026g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1020a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f35175E;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1028i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1027h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1022c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1034o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1024e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1025f;
        return charSequence != null ? charSequence : this.f1024e;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1038s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public String m40617h() {
        int i;
        char g = m40618g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f1033n.m40632u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1033n.m40632u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C6386h.f13229m));
        }
        if (this.f1033n.mo40567G()) {
            i = this.f1030k;
        } else {
            i = this.f1028i;
        }
        m40621d(sb2, i, 65536, resources.getString(C6386h.f13225i));
        m40621d(sb2, i, 4096, resources.getString(C6386h.f13221e));
        m40621d(sb2, i, 2, resources.getString(C6386h.f13220d));
        m40621d(sb2, i, 1, resources.getString(C6386h.f13226j));
        m40621d(sb2, i, 4, resources.getString(C6386h.f13228l));
        m40621d(sb2, i, 8, resources.getString(C6386h.f13224h));
        if (g == '\b') {
            sb2.append(resources.getString(C6386h.f13222f));
        } else if (g == '\n') {
            sb2.append(resources.getString(C6386h.f13223g));
        } else if (g != ' ') {
            sb2.append(g);
        } else {
            sb2.append(resources.getString(C6386h.f13227k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1034o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence m40616i(AbstractC1586k.AbstractC1587a aVar) {
        if (aVar == null || !aVar.mo27965d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f35174D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1044y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1044y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1044y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC2599b bVar = this.f35172B;
        if (bVar == null || !bVar.mo16204g()) {
            if ((this.f1044y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1044y & 8) != 0 || !this.f35172B.mo16206b()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public boolean m40615j() {
        AbstractC2599b bVar;
        if ((this.f1045z & 8) == 0) {
            return false;
        }
        if (this.f35171A == null && (bVar = this.f35172B) != null) {
            this.f35171A = bVar.mo16205d(this);
        }
        if (this.f35171A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m40614k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1036q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C1575e eVar = this.f1033n;
        if (eVar.mo40562h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f1035p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1026g != null) {
            try {
                this.f1033n.m40632u().startActivity(this.f1026g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        AbstractC2599b bVar = this.f35172B;
        if (bVar == null || !bVar.mo16208e()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m40613l() {
        return (this.f1044y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m40612m() {
        return (this.f1044y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m40611n() {
        return (this.f1045z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m40610o() {
        return (this.f1045z & 2) == 2;
    }

    /* renamed from: p */
    public AbstractMenuItemC3753b setActionView(int i) {
        Context u = this.f1033n.m40632u();
        setActionView(LayoutInflater.from(u).inflate(i, (ViewGroup) new LinearLayout(u), false));
        return this;
    }

    /* renamed from: q */
    public AbstractMenuItemC3753b setActionView(View view) {
        int i;
        this.f35171A = view;
        this.f35172B = null;
        if (view != null && view.getId() == -1 && (i = this.f1020a) > 0) {
            view.setId(i);
        }
        this.f1033n.m40669I(this);
        return this;
    }

    /* renamed from: r */
    public void m40607r(boolean z) {
        this.f35174D = z;
        this.f1033n.m40667K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m40606s(boolean z) {
        int i;
        int i2 = this.f1044y;
        int i3 = i2 & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.f1044y = i4;
        if (i2 != i4) {
            this.f1033n.m40667K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1029j == c) {
            return this;
        }
        this.f1029j = Character.toLowerCase(c);
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1044y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f1044y = i2;
        if (i != i2) {
            this.f1033n.m40667K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1044y & 4) != 0) {
            this.f1033n.m40659T(this);
        } else {
            m40606s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1044y |= 16;
        } else {
            this.f1044y &= -17;
        }
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1032m = 0;
        this.f1031l = drawable;
        this.f1043x = true;
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1039t = colorStateList;
        this.f1041v = true;
        this.f1043x = true;
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1040u = mode;
        this.f1042w = true;
        this.f1043x = true;
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1026g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f1027h == c) {
            return this;
        }
        this.f1027h = c;
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f35173C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1036q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1027h = c;
        this.f1029j = Character.toLowerCase(c2);
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1045z = i;
            this.f1033n.m40669I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1024e = charSequence;
        this.f1033n.m40667K(false);
        SubMenuC1591m mVar = this.f1034o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1025f = charSequence;
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m40600y(z)) {
            this.f1033n.m40668J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m40605t(boolean z) {
        this.f1044y = (z ? 4 : 0) | (this.f1044y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1024e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m40604u(boolean z) {
        if (z) {
            this.f1044y |= 32;
        } else {
            this.f1044y &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m40603v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f35175E = contextMenuInfo;
    }

    /* renamed from: w */
    public AbstractMenuItemC3753b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void m40601x(SubMenuC1591m mVar) {
        this.f1034o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m40600y(boolean z) {
        int i;
        int i2 = this.f1044y;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f1044y = i4;
        if (i2 != i4) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m40599z() {
        return this.f1033n.m40673A();
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public AbstractMenuItemC3753b setContentDescription(CharSequence charSequence) {
        this.f1037r = charSequence;
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public AbstractMenuItemC3753b setTooltipText(CharSequence charSequence) {
        this.f1038s = charSequence;
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1029j == c && this.f1030k == i) {
            return this;
        }
        this.f1029j = Character.toLowerCase(c);
        this.f1030k = KeyEvent.normalizeMetaState(i);
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1027h == c && this.f1028i == i) {
            return this;
        }
        this.f1027h = c;
        this.f1028i = KeyEvent.normalizeMetaState(i);
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // p034c1.AbstractMenuItemC3753b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1027h = c;
        this.f1028i = KeyEvent.normalizeMetaState(i);
        this.f1029j = Character.toLowerCase(c2);
        this.f1030k = KeyEvent.normalizeMetaState(i2);
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1031l = null;
        this.f1032m = i;
        this.f1043x = true;
        this.f1033n.m40667K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f1033n.m40632u().getString(i));
    }
}
