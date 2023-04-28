package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C1574d;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.view.menu.C1579g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.c1 */
/* loaded from: classes.dex */
public class C1648c1 extends C1755z0 implements AbstractC1636a1 {

    /* renamed from: U */
    private static Method f35275U;

    /* renamed from: T */
    private AbstractC1636a1 f35276T;

    /* renamed from: androidx.appcompat.widget.c1$a */
    /* loaded from: classes.dex */
    public static class C1649a extends C1717s0 {

        /* renamed from: A */
        private AbstractC1636a1 f35277A;

        /* renamed from: B */
        private MenuItem f35278B;

        /* renamed from: y */
        final int f1296y;

        /* renamed from: z */
        final int f1297z;

        public C1649a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1296y = 21;
                this.f1297z = 22;
                return;
            }
            this.f1296y = 22;
            this.f1297z = 21;
        }

        @Override // androidx.appcompat.widget.C1717s0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo40045d(int i, int i2, int i3, int i4, int i5) {
            return super.mo40045d(i, i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.C1717s0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo40044e(MotionEvent motionEvent, int i) {
            return super.mo40044e(motionEvent, i);
        }

        @Override // androidx.appcompat.widget.C1717s0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C1717s0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C1717s0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C1717s0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C1717s0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C1574d dVar;
            C1579g gVar;
            int pointToPosition;
            int i2;
            if (this.f35277A != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    dVar = (C1574d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (C1574d) adapter;
                    i = 0;
                }
                if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= dVar.getCount()) {
                    gVar = null;
                } else {
                    gVar = dVar.getItem(i2);
                }
                MenuItem menuItem = this.f35278B;
                if (menuItem != gVar) {
                    C1575e b = dVar.m40676b();
                    if (menuItem != null) {
                        this.f35277A.mo40283m(b, menuItem);
                    }
                    this.f35278B = gVar;
                    if (gVar != null) {
                        this.f35277A.mo40284a(b, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C1574d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1296y) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1297z) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (C1574d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (C1574d) adapter;
                }
                dVar.m40676b().m40644e(false);
                return true;
            }
        }

        @Override // androidx.appcompat.widget.C1717s0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(AbstractC1636a1 a1Var) {
            this.f35277A = a1Var;
        }

        @Override // androidx.appcompat.widget.C1717s0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f35275U = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C1648c1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: P */
    public void m40288P(Object obj) {
        this.f35311P.setEnterTransition((Transition) obj);
    }

    /* renamed from: Q */
    public void m40287Q(Object obj) {
        this.f35311P.setExitTransition((Transition) obj);
    }

    /* renamed from: R */
    public void m40286R(AbstractC1636a1 a1Var) {
        this.f35276T = a1Var;
    }

    /* renamed from: S */
    public void m40285S(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f35275U;
            if (method != null) {
                try {
                    method.invoke(this.f35311P, Boolean.valueOf(z));
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f35311P.setTouchModal(z);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1636a1
    /* renamed from: a */
    public void mo40284a(C1575e eVar, MenuItem menuItem) {
        AbstractC1636a1 a1Var = this.f35276T;
        if (a1Var != null) {
            a1Var.mo40284a(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1636a1
    /* renamed from: m */
    public void mo40283m(C1575e eVar, MenuItem menuItem) {
        AbstractC1636a1 a1Var = this.f35276T;
        if (a1Var != null) {
            a1Var.mo40283m(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C1755z0
    /* renamed from: q */
    C1717s0 mo39928q(Context context, boolean z) {
        C1649a aVar = new C1649a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
