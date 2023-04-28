package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C1575e;
import androidx.appcompat.widget.C1698n1;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C1575e.AbstractC1577b, AbstractC1586k, AdapterView.OnItemClickListener {

    /* renamed from: m */
    private static final int[] f919m = {16842964, 16843049};

    /* renamed from: k */
    private C1575e f920k;

    /* renamed from: l */
    private int f921l;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k
    /* renamed from: a */
    public void mo27963a(C1575e eVar) {
        this.f920k = eVar;
    }

    @Override // androidx.appcompat.view.menu.C1575e.AbstractC1577b
    /* renamed from: b */
    public boolean mo40518b(C1579g gVar) {
        return this.f920k.m40666L(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f921l;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo40518b((C1579g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1698n1 v = C1698n1.m40105v(context, attributeSet, f919m, i, 0);
        if (v.m40108s(0)) {
            setBackgroundDrawable(v.m40120g(0));
        }
        if (v.m40108s(1)) {
            setDivider(v.m40120g(1));
        }
        v.m40104w();
    }
}
