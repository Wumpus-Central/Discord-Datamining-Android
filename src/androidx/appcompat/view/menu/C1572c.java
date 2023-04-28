package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.view.menu.AbstractC1586k;
import java.util.ArrayList;
import p052d.C6385g;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public class C1572c implements AbstractC1584j, AdapterView.OnItemClickListener {

    /* renamed from: k */
    Context f973k;

    /* renamed from: l */
    LayoutInflater f974l;

    /* renamed from: m */
    C1575e f975m;

    /* renamed from: n */
    ExpandedMenuView f976n;

    /* renamed from: o */
    int f977o;

    /* renamed from: p */
    int f978p;

    /* renamed from: q */
    int f979q;

    /* renamed from: r */
    private AbstractC1584j.AbstractC1585a f980r;

    /* renamed from: s */
    C1573a f981s;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* loaded from: classes.dex */
    public class C1573a extends BaseAdapter {

        /* renamed from: k */
        private int f982k = -1;

        public C1573a() {
            m40679a();
        }

        /* renamed from: a */
        void m40679a() {
            C1579g v = C1572c.this.f975m.m40631v();
            if (v != null) {
                ArrayList<C1579g> z = C1572c.this.f975m.m40627z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    if (z.get(i) == v) {
                        this.f982k = i;
                        return;
                    }
                }
            }
            this.f982k = -1;
        }

        /* renamed from: b */
        public C1579g getItem(int i) {
            ArrayList<C1579g> z = C1572c.this.f975m.m40627z();
            int i2 = i + C1572c.this.f977o;
            int i3 = this.f982k;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return z.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C1572c.this.f975m.m40627z().size() - C1572c.this.f977o;
            if (this.f982k < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C1572c cVar = C1572c.this;
                view = cVar.f974l.inflate(cVar.f979q, viewGroup, false);
            }
            ((AbstractC1586k.AbstractC1587a) view).mo27966c(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m40679a();
            super.notifyDataSetChanged();
        }
    }

    public C1572c(Context context, int i) {
        this(i, 0);
        this.f973k = context;
        this.f974l = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: a */
    public void mo40314a(C1575e eVar, boolean z) {
        AbstractC1584j.AbstractC1585a aVar = this.f980r;
        if (aVar != null) {
            aVar.mo40291a(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: b */
    public boolean mo40342b(C1575e eVar, C1579g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: c */
    public void mo40579c(AbstractC1584j.AbstractC1585a aVar) {
        this.f980r = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: d */
    public boolean mo40313d(SubMenuC1591m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnKeyListenerC1578f(mVar).m40625d(null);
        AbstractC1584j.AbstractC1585a aVar = this.f980r;
        if (aVar == null) {
            return true;
        }
        aVar.mo40290b(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: e */
    public void mo40312e(boolean z) {
        C1573a aVar = this.f981s;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: f */
    public boolean mo40311f() {
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
        if (this.f978p != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f978p);
            this.f973k = contextThemeWrapper;
            this.f974l = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f973k != null) {
            this.f973k = context;
            if (this.f974l == null) {
                this.f974l = LayoutInflater.from(context);
            }
        }
        this.f975m = eVar;
        C1573a aVar = this.f981s;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public ListAdapter m40681i() {
        if (this.f981s == null) {
            this.f981s = new C1573a();
        }
        return this.f981s;
    }

    /* renamed from: j */
    public AbstractC1586k m40680j(ViewGroup viewGroup) {
        if (this.f976n == null) {
            this.f976n = (ExpandedMenuView) this.f974l.inflate(C6385g.f13203g, viewGroup, false);
            if (this.f981s == null) {
                this.f981s = new C1573a();
            }
            this.f976n.setAdapter((ListAdapter) this.f981s);
            this.f976n.setOnItemClickListener(this);
        }
        return this.f976n;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f975m.m40665M(this.f981s.getItem(i), this, 0);
    }

    public C1572c(int i, int i2) {
        this.f979q = i;
        this.f978p = i2;
    }
}
