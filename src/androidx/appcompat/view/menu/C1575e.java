package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C2337a;
import androidx.core.view.AbstractC2599b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p034c1.AbstractMenuC3752a;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C1575e implements AbstractMenuC3752a {

    /* renamed from: A */
    private static final int[] f35170A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f990a;

    /* renamed from: b */
    private final Resources f991b;

    /* renamed from: c */
    private boolean f992c;

    /* renamed from: d */
    private boolean f993d;

    /* renamed from: e */
    private AbstractC1576a f994e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1002m;

    /* renamed from: n */
    CharSequence f1003n;

    /* renamed from: o */
    Drawable f1004o;

    /* renamed from: p */
    View f1005p;

    /* renamed from: x */
    private C1579g f1013x;

    /* renamed from: z */
    private boolean f1015z;

    /* renamed from: l */
    private int f1001l = 0;

    /* renamed from: q */
    private boolean f1006q = false;

    /* renamed from: r */
    private boolean f1007r = false;

    /* renamed from: s */
    private boolean f1008s = false;

    /* renamed from: t */
    private boolean f1009t = false;

    /* renamed from: u */
    private boolean f1010u = false;

    /* renamed from: v */
    private ArrayList<C1579g> f1011v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<AbstractC1584j>> f1012w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f1014y = false;

    /* renamed from: f */
    private ArrayList<C1579g> f995f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C1579g> f996g = new ArrayList<>();

    /* renamed from: h */
    private boolean f997h = true;

    /* renamed from: i */
    private ArrayList<C1579g> f998i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C1579g> f999j = new ArrayList<>();

    /* renamed from: k */
    private boolean f1000k = true;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public interface AbstractC1576a {
        /* renamed from: a */
        boolean mo40516a(C1575e eVar, MenuItem menuItem);

        /* renamed from: b */
        void mo40515b(C1575e eVar);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    public interface AbstractC1577b {
        /* renamed from: b */
        boolean mo40518b(C1579g gVar);
    }

    public C1575e(Context context) {
        this.f990a = context;
        this.f991b = context.getResources();
        m40649b0(true);
    }

    /* renamed from: B */
    private static int m40672B(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f35170A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m40664N(int i, boolean z) {
        if (i >= 0 && i < this.f995f.size()) {
            this.f995f.remove(i);
            if (z) {
                m40667K(true);
            }
        }
    }

    /* renamed from: W */
    private void m40656W(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources C = m40671C();
        if (view != null) {
            this.f1005p = view;
            this.f1003n = null;
            this.f1004o = null;
        } else {
            if (i > 0) {
                this.f1003n = C.getText(i);
            } else if (charSequence != null) {
                this.f1003n = charSequence;
            }
            if (i2 > 0) {
                this.f1004o = C2337a.m38133e(m40632u(), i2);
            } else if (drawable != null) {
                this.f1004o = drawable;
            }
            this.f1005p = null;
        }
        m40667K(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (androidx.core.view.C2632g2.m37249e(android.view.ViewConfiguration.get(r2.f990a), r2.f990a) != false) goto L_0x001d;
     */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m40649b0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f991b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f990a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f990a
            boolean r3 = androidx.core.view.C2632g2.m37249e(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f993d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C1575e.m40649b0(boolean):void");
    }

    /* renamed from: g */
    private C1579g m40643g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C1579g(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m40642i(boolean z) {
        if (!this.f1012w.isEmpty()) {
            m40645d0();
            Iterator<WeakReference<AbstractC1584j>> it = this.f1012w.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC1584j> next = it.next();
                AbstractC1584j jVar = next.get();
                if (jVar == null) {
                    this.f1012w.remove(next);
                } else {
                    jVar.mo40312e(z);
                }
            }
            m40647c0();
        }
    }

    /* renamed from: j */
    private boolean m40641j(SubMenuC1591m mVar, AbstractC1584j jVar) {
        boolean z = false;
        if (this.f1012w.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z = jVar.mo40313d(mVar);
        }
        Iterator<WeakReference<AbstractC1584j>> it = this.f1012w.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC1584j> next = it.next();
            AbstractC1584j jVar2 = next.get();
            if (jVar2 == null) {
                this.f1012w.remove(next);
            } else if (!z) {
                z = jVar2.mo40313d(mVar);
            }
        }
        return z;
    }

    /* renamed from: n */
    private static int m40638n(ArrayList<C1579g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m40619f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m40673A() {
        return this.f1009t;
    }

    /* renamed from: C */
    Resources m40671C() {
        return this.f991b;
    }

    /* renamed from: D */
    public C1575e mo40569D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C1579g> m40670E() {
        if (!this.f997h) {
            return this.f996g;
        }
        this.f996g.clear();
        int size = this.f995f.size();
        for (int i = 0; i < size; i++) {
            C1579g gVar = this.f995f.get(i);
            if (gVar.isVisible()) {
                this.f996g.add(gVar);
            }
        }
        this.f997h = false;
        this.f1000k = true;
        return this.f996g;
    }

    /* renamed from: F */
    public boolean mo40568F() {
        return this.f1014y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo40567G() {
        return this.f992c;
    }

    /* renamed from: H */
    public boolean mo40566H() {
        return this.f993d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m40669I(C1579g gVar) {
        this.f1000k = true;
        m40667K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m40668J(C1579g gVar) {
        this.f997h = true;
        m40667K(true);
    }

    /* renamed from: K */
    public void m40667K(boolean z) {
        if (!this.f1006q) {
            if (z) {
                this.f997h = true;
                this.f1000k = true;
            }
            m40642i(z);
            return;
        }
        this.f1007r = true;
        if (z) {
            this.f1008s = true;
        }
    }

    /* renamed from: L */
    public boolean m40666L(MenuItem menuItem, int i) {
        return m40665M(menuItem, null, i);
    }

    /* renamed from: M */
    public boolean m40665M(MenuItem menuItem, AbstractC1584j jVar, int i) {
        boolean z;
        C1579g gVar = (C1579g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k = gVar.m40614k();
        AbstractC2599b a = gVar.mo16222a();
        if (a == null || !a.mo16210a()) {
            z = false;
        } else {
            z = true;
        }
        if (gVar.m40615j()) {
            k |= gVar.expandActionView();
            if (k) {
                m40644e(true);
            }
        } else if (gVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m40644e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.m40601x(new SubMenuC1591m(m40632u(), this, gVar));
            }
            SubMenuC1591m mVar = (SubMenuC1591m) gVar.getSubMenu();
            if (z) {
                a.mo16207f(mVar);
            }
            k |= m40641j(mVar, jVar);
            if (!k) {
                m40644e(true);
            }
        } else if ((i & 1) == 0) {
            m40644e(true);
        }
        return k;
    }

    /* renamed from: O */
    public void m40663O(AbstractC1584j jVar) {
        Iterator<WeakReference<AbstractC1584j>> it = this.f1012w.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC1584j> next = it.next();
            AbstractC1584j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f1012w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void m40662P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo40560t());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuC1591m) item.getSubMenu()).m40662P(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: Q */
    public void m40661Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1591m) item.getSubMenu()).m40661Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo40560t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo40565R(AbstractC1576a aVar) {
        this.f994e = aVar;
    }

    /* renamed from: S */
    public C1575e m40660S(int i) {
        this.f1001l = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m40659T(MenuItem menuItem) {
        boolean z;
        int groupId = menuItem.getGroupId();
        int size = this.f995f.size();
        m40645d0();
        for (int i = 0; i < size; i++) {
            C1579g gVar = this.f995f.get(i);
            if (gVar.getGroupId() == groupId && gVar.m40612m() && gVar.isCheckable()) {
                if (gVar == menuItem) {
                    z = true;
                } else {
                    z = false;
                }
                gVar.m40606s(z);
            }
        }
        m40647c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public C1575e m40658U(int i) {
        m40656W(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public C1575e m40657V(Drawable drawable) {
        m40656W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public C1575e m40655X(int i) {
        m40656W(i, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public C1575e m40654Y(CharSequence charSequence) {
        m40656W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public C1575e m40653Z(View view) {
        m40656W(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    protected MenuItem m40652a(int i, int i2, int i3, CharSequence charSequence) {
        int B = m40672B(i3);
        C1579g g = m40643g(i, i2, i3, B, charSequence, this.f1001l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1002m;
        if (contextMenuInfo != null) {
            g.m40603v(contextMenuInfo);
        }
        ArrayList<C1579g> arrayList = this.f995f;
        arrayList.add(m40638n(arrayList, B), g);
        m40667K(true);
        return g;
    }

    /* renamed from: a0 */
    public void m40651a0(boolean z) {
        this.f1015z = z;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m40652a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.f990a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent4;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m40650b(AbstractC1584j jVar) {
        m40648c(jVar, this.f990a);
    }

    /* renamed from: c */
    public void m40648c(AbstractC1584j jVar, Context context) {
        this.f1012w.add(new WeakReference<>(jVar));
        jVar.mo40310h(context, this);
        this.f1000k = true;
    }

    /* renamed from: c0 */
    public void m40647c0() {
        this.f1006q = false;
        if (this.f1007r) {
            this.f1007r = false;
            m40667K(this.f1008s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C1579g gVar = this.f1013x;
        if (gVar != null) {
            mo40563f(gVar);
        }
        this.f995f.clear();
        m40667K(true);
    }

    public void clearHeader() {
        this.f1004o = null;
        this.f1003n = null;
        this.f1005p = null;
        m40667K(false);
    }

    @Override // android.view.Menu
    public void close() {
        m40644e(true);
    }

    /* renamed from: d */
    public void m40646d() {
        AbstractC1576a aVar = this.f994e;
        if (aVar != null) {
            aVar.mo40515b(this);
        }
    }

    /* renamed from: d0 */
    public void m40645d0() {
        if (!this.f1006q) {
            this.f1006q = true;
            this.f1007r = false;
            this.f1008s = false;
        }
    }

    /* renamed from: e */
    public final void m40644e(boolean z) {
        if (!this.f1010u) {
            this.f1010u = true;
            Iterator<WeakReference<AbstractC1584j>> it = this.f1012w.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC1584j> next = it.next();
                AbstractC1584j jVar = next.get();
                if (jVar == null) {
                    this.f1012w.remove(next);
                } else {
                    jVar.mo40314a(this, z);
                }
            }
            this.f1010u = false;
        }
    }

    /* renamed from: f */
    public boolean mo40563f(C1579g gVar) {
        boolean z = false;
        if (!this.f1012w.isEmpty() && this.f1013x == gVar) {
            m40645d0();
            Iterator<WeakReference<AbstractC1584j>> it = this.f1012w.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC1584j> next = it.next();
                AbstractC1584j jVar = next.get();
                if (jVar == null) {
                    this.f1012w.remove(next);
                } else {
                    z = jVar.mo40341g(this, gVar);
                    if (z) {
                        break;
                    }
                }
            }
            m40647c0();
            if (z) {
                this.f1013x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C1579g gVar = this.f995f.get(i2);
            if (gVar.getItemId() == i) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f995f.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo40562h(C1575e eVar, MenuItem menuItem) {
        AbstractC1576a aVar = this.f994e;
        return aVar != null && aVar.mo40516a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1015z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f995f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m40636p(i, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo40561k(C1579g gVar) {
        boolean z = false;
        if (this.f1012w.isEmpty()) {
            return false;
        }
        m40645d0();
        Iterator<WeakReference<AbstractC1584j>> it = this.f1012w.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC1584j> next = it.next();
            AbstractC1584j jVar = next.get();
            if (jVar == null) {
                this.f1012w.remove(next);
            } else {
                z = jVar.mo40342b(this, gVar);
                if (z) {
                    break;
                }
            }
        }
        m40647c0();
        if (z) {
            this.f1013x = gVar;
        }
        return z;
    }

    /* renamed from: l */
    public int m40640l(int i) {
        return m40639m(i, 0);
    }

    /* renamed from: m */
    public int m40639m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f995f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public int m40637o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f995f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    C1579g m40636p(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C1579g> arrayList = this.f1011v;
        arrayList.clear();
        m40635q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = mo40567G();
        for (int i2 = 0; i2 < size; i2++) {
            C1579g gVar = arrayList.get(i2);
            if (G) {
                c = gVar.getAlphabeticShortcut();
            } else {
                c = gVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (G && c == '\b' && i == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m40666L(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C1579g p = m40636p(i, keyEvent);
        if (p != null) {
            z = m40666L(p, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            m40644e(true);
        }
        return z;
    }

    /* renamed from: q */
    void m40635q(List<C1579g> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean G = mo40567G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f995f.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1579g gVar = this.f995f.get(i3);
                if (gVar.hasSubMenu()) {
                    ((C1575e) gVar.getSubMenu()).m40635q(list, i, keyEvent);
                }
                if (G) {
                    c = gVar.getAlphabeticShortcut();
                } else {
                    c = gVar.getNumericShortcut();
                }
                if (G) {
                    i2 = gVar.getAlphabeticModifiers();
                } else {
                    i2 = gVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (i2 & 69647)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (G && c == '\b' && i == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void m40634r() {
        ArrayList<C1579g> E = m40670E();
        if (this.f1000k) {
            Iterator<WeakReference<AbstractC1584j>> it = this.f1012w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<AbstractC1584j> next = it.next();
                AbstractC1584j jVar = next.get();
                if (jVar == null) {
                    this.f1012w.remove(next);
                } else {
                    z |= jVar.mo40311f();
                }
            }
            if (z) {
                this.f998i.clear();
                this.f999j.clear();
                int size = E.size();
                for (int i = 0; i < size; i++) {
                    C1579g gVar = E.get(i);
                    if (gVar.m40613l()) {
                        this.f998i.add(gVar);
                    } else {
                        this.f999j.add(gVar);
                    }
                }
            } else {
                this.f998i.clear();
                this.f999j.clear();
                this.f999j.addAll(m40670E());
            }
            this.f1000k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int l = m40640l(i);
        if (l >= 0) {
            int size = this.f995f.size() - l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f995f.get(l).getGroupId() != i) {
                    break;
                }
                m40664N(l, false);
                i2 = i3;
            }
            m40667K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m40664N(m40637o(i), true);
    }

    /* renamed from: s */
    public ArrayList<C1579g> m40633s() {
        m40634r();
        return this.f998i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f995f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1579g gVar = this.f995f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.m40605t(z2);
                gVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1014y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f995f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1579g gVar = this.f995f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f995f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1579g gVar = this.f995f.get(i2);
            if (gVar.getGroupId() == i && gVar.m40600y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m40667K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f992c = z;
        m40667K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f995f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public String mo40560t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context m40632u() {
        return this.f990a;
    }

    /* renamed from: v */
    public C1579g m40631v() {
        return this.f1013x;
    }

    /* renamed from: w */
    public Drawable m40630w() {
        return this.f1004o;
    }

    /* renamed from: x */
    public CharSequence m40629x() {
        return this.f1003n;
    }

    /* renamed from: y */
    public View m40628y() {
        return this.f1005p;
    }

    /* renamed from: z */
    public ArrayList<C1579g> m40627z() {
        m40634r();
        return this.f999j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m40652a(0, 0, 0, this.f991b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f991b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m40652a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1579g gVar = (C1579g) m40652a(i, i2, i3, charSequence);
        SubMenuC1591m mVar = new SubMenuC1591m(this.f990a, this, gVar);
        gVar.m40601x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m40652a(i, i2, i3, this.f991b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f991b.getString(i4));
    }
}
