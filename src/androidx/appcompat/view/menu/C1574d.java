package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.AbstractC1586k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public class C1574d extends BaseAdapter {

    /* renamed from: k */
    C1575e f984k;

    /* renamed from: l */
    private int f985l = -1;

    /* renamed from: m */
    private boolean f986m;

    /* renamed from: n */
    private final boolean f987n;

    /* renamed from: o */
    private final LayoutInflater f988o;

    /* renamed from: p */
    private final int f989p;

    public C1574d(C1575e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f987n = z;
        this.f988o = layoutInflater;
        this.f984k = eVar;
        this.f989p = i;
        m40677a();
    }

    /* renamed from: a */
    void m40677a() {
        C1579g v = this.f984k.m40631v();
        if (v != null) {
            ArrayList<C1579g> z = this.f984k.m40627z();
            int size = z.size();
            for (int i = 0; i < size; i++) {
                if (z.get(i) == v) {
                    this.f985l = i;
                    return;
                }
            }
        }
        this.f985l = -1;
    }

    /* renamed from: b */
    public C1575e m40676b() {
        return this.f984k;
    }

    /* renamed from: c */
    public C1579g getItem(int i) {
        ArrayList<C1579g> arrayList;
        if (this.f987n) {
            arrayList = this.f984k.m40627z();
        } else {
            arrayList = this.f984k.m40670E();
        }
        int i2 = this.f985l;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    /* renamed from: d */
    public void m40674d(boolean z) {
        this.f986m = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C1579g> arrayList;
        if (this.f987n) {
            arrayList = this.f984k.m40627z();
        } else {
            arrayList = this.f984k.m40670E();
        }
        if (this.f985l < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f988o.inflate(this.f989p, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f984k.mo40568F() || groupId == i2) {
            z = false;
        } else {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        AbstractC1586k.AbstractC1587a aVar = (AbstractC1586k.AbstractC1587a) view;
        if (this.f986m) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo27966c(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m40677a();
        super.notifyDataSetChanged();
    }
}
