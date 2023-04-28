package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p164j.AbstractC9457e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public abstract class AbstractC1581h implements AbstractC9457e, AbstractC1584j, AdapterView.OnItemClickListener {

    /* renamed from: k */
    private Rect f1047k;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static int m40596l(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public static boolean m40594v(C1575e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public static C1574d m40593w(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C1574d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C1574d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: b */
    public boolean mo40342b(C1575e eVar, C1579g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: g */
    public boolean mo40341g(C1575e eVar, C1579g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: h */
    public void mo40310h(Context context, C1575e eVar) {
    }

    /* renamed from: i */
    public abstract void mo40578i(C1575e eVar);

    /* renamed from: j */
    protected boolean mo40598j() {
        return true;
    }

    /* renamed from: k */
    public Rect m40597k() {
        return this.f1047k;
    }

    /* renamed from: m */
    public abstract void mo40577m(View view);

    /* renamed from: o */
    public void m40595o(Rect rect) {
        this.f1047k = rect;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C1575e eVar = m40593w(listAdapter).f984k;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo40598j()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        eVar.m40665M(menuItem, this, i2);
    }

    /* renamed from: p */
    public abstract void mo40576p(boolean z);

    /* renamed from: q */
    public abstract void mo40575q(int i);

    /* renamed from: r */
    public abstract void mo40574r(int i);

    /* renamed from: s */
    public abstract void mo40573s(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: t */
    public abstract void mo40572t(boolean z);

    /* renamed from: u */
    public abstract void mo40571u(int i);
}
