package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.view.menu.AbstractC1586k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC1566a implements AbstractC1584j {

    /* renamed from: k */
    protected Context f938k;

    /* renamed from: l */
    protected Context f939l;

    /* renamed from: m */
    protected C1575e f940m;

    /* renamed from: n */
    protected LayoutInflater f941n;

    /* renamed from: o */
    protected LayoutInflater f942o;

    /* renamed from: p */
    private AbstractC1584j.AbstractC1585a f943p;

    /* renamed from: q */
    private int f944q;

    /* renamed from: r */
    private int f945r;

    /* renamed from: s */
    protected AbstractC1586k f946s;

    /* renamed from: t */
    private int f947t;

    public AbstractC1566a(Context context, int i, int i2) {
        this.f938k = context;
        this.f941n = LayoutInflater.from(context);
        this.f944q = i;
        this.f945r = i2;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: a */
    public void mo40314a(C1575e eVar, boolean z) {
        AbstractC1584j.AbstractC1585a aVar = this.f943p;
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
        this.f943p = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: d */
    public boolean mo40313d(SubMenuC1591m mVar) {
        AbstractC1584j.AbstractC1585a aVar = this.f943p;
        SubMenuC1591m mVar2 = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            mVar2 = this.f940m;
        }
        return aVar.mo40290b(mVar2);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: e */
    public void mo40312e(boolean z) {
        C1579g gVar;
        ViewGroup viewGroup = (ViewGroup) this.f946s;
        if (viewGroup != null) {
            C1575e eVar = this.f940m;
            int i = 0;
            if (eVar != null) {
                eVar.m40634r();
                ArrayList<C1579g> E = this.f940m.m40670E();
                int size = E.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C1579g gVar2 = E.get(i3);
                    if (mo40305q(i2, gVar2)) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof AbstractC1586k.AbstractC1587a) {
                            gVar = ((AbstractC1586k.AbstractC1587a) childAt).getItemData();
                        } else {
                            gVar = null;
                        }
                        View n = mo40307n(gVar2, childAt, viewGroup);
                        if (gVar2 != gVar) {
                            n.setPressed(false);
                            n.jumpDrawablesToCurrentState();
                        }
                        if (n != childAt) {
                            m40693i(n, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo40308l(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: g */
    public boolean mo40341g(C1575e eVar, C1579g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j
    /* renamed from: h */
    public void mo40310h(Context context, C1575e eVar) {
        this.f939l = context;
        this.f942o = LayoutInflater.from(context);
        this.f940m = eVar;
    }

    /* renamed from: i */
    protected void m40693i(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f946s).addView(view, i);
    }

    /* renamed from: j */
    public abstract void mo40309j(C1579g gVar, AbstractC1586k.AbstractC1587a aVar);

    /* renamed from: k */
    public AbstractC1586k.AbstractC1587a m40692k(ViewGroup viewGroup) {
        return (AbstractC1586k.AbstractC1587a) this.f941n.inflate(this.f945r, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo40308l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: m */
    public AbstractC1584j.AbstractC1585a m40691m() {
        return this.f943p;
    }

    /* renamed from: n */
    public View mo40307n(C1579g gVar, View view, ViewGroup viewGroup) {
        AbstractC1586k.AbstractC1587a aVar;
        if (view instanceof AbstractC1586k.AbstractC1587a) {
            aVar = (AbstractC1586k.AbstractC1587a) view;
        } else {
            aVar = m40692k(viewGroup);
        }
        mo40309j(gVar, aVar);
        return (View) aVar;
    }

    /* renamed from: o */
    public AbstractC1586k mo40306o(ViewGroup viewGroup) {
        if (this.f946s == null) {
            AbstractC1586k kVar = (AbstractC1586k) this.f941n.inflate(this.f944q, viewGroup, false);
            this.f946s = kVar;
            kVar.mo27963a(this.f940m);
            mo40312e(true);
        }
        return this.f946s;
    }

    /* renamed from: p */
    public void m40690p(int i) {
        this.f947t = i;
    }

    /* renamed from: q */
    public abstract boolean mo40305q(int i, C1579g gVar);
}
