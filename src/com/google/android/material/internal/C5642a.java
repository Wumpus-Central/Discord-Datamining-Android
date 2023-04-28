package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.AbstractC5651h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes3.dex */
public class C5642a<T extends AbstractC5651h<T>> {

    /* renamed from: a */
    private final Map<Integer, T> f10974a = new HashMap();

    /* renamed from: b */
    private final Set<Integer> f10975b = new HashSet();

    /* renamed from: c */
    private AbstractC5643b f10976c;

    /* renamed from: d */
    private boolean f10977d;

    /* renamed from: e */
    private boolean f10978e;

    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes3.dex */
    class C0158a implements AbstractC5651h.AbstractC5652a<T> {
        C0158a() {
        }

        /* renamed from: b */
        public void mo27867a(T t, boolean z) {
            if (!z) {
                C5642a aVar = C5642a.this;
                if (!aVar.m27945r(t, aVar.f10978e)) {
                    return;
                }
            } else if (!C5642a.this.m27956g(t)) {
                return;
            }
            C5642a.this.m27950m();
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    /* loaded from: classes3.dex */
    public interface AbstractC5643b {
        /* renamed from: a */
        void mo27943a(Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m27956g(AbstractC5651h<T> hVar) {
        int id2 = hVar.getId();
        if (this.f10975b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t = this.f10974a.get(Integer.valueOf(m27952k()));
        if (t != null) {
            m27945r(t, false);
        }
        boolean add = this.f10975b.add(Integer.valueOf(id2));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m27950m() {
        AbstractC5643b bVar = this.f10976c;
        if (bVar != null) {
            bVar.mo27943a(m27954i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public boolean m27945r(AbstractC5651h<T> hVar, boolean z) {
        int id2 = hVar.getId();
        if (!this.f10975b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (!z || this.f10975b.size() != 1 || !this.f10975b.contains(Integer.valueOf(id2))) {
            boolean remove = this.f10975b.remove(Integer.valueOf(id2));
            if (hVar.isChecked()) {
                hVar.setChecked(false);
            }
            return remove;
        }
        hVar.setChecked(true);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public void m27958e(T t) {
        this.f10974a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            m27956g(t);
        }
        t.setInternalOnCheckedChangeListener(new C0158a());
    }

    /* renamed from: f */
    public void m27957f(int i) {
        T t = this.f10974a.get(Integer.valueOf(i));
        if (t != null && m27956g(t)) {
            m27950m();
        }
    }

    /* renamed from: h */
    public void m27955h() {
        boolean z = !this.f10975b.isEmpty();
        for (T t : this.f10974a.values()) {
            m27945r(t, false);
        }
        if (z) {
            m27950m();
        }
    }

    /* renamed from: i */
    public Set<Integer> m27954i() {
        return new HashSet(this.f10975b);
    }

    /* renamed from: j */
    public List<Integer> m27953j(ViewGroup viewGroup) {
        Set<Integer> i = m27954i();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof AbstractC5651h) && i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public int m27952k() {
        if (!this.f10977d || this.f10975b.isEmpty()) {
            return -1;
        }
        return this.f10975b.iterator().next().intValue();
    }

    /* renamed from: l */
    public boolean m27951l() {
        return this.f10977d;
    }

    /* renamed from: n */
    public void m27949n(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f10974a.remove(Integer.valueOf(t.getId()));
        this.f10975b.remove(Integer.valueOf(t.getId()));
    }

    /* renamed from: o */
    public void m27948o(AbstractC5643b bVar) {
        this.f10976c = bVar;
    }

    /* renamed from: p */
    public void m27947p(boolean z) {
        this.f10978e = z;
    }

    /* renamed from: q */
    public void m27946q(boolean z) {
        if (this.f10977d != z) {
            this.f10977d = z;
            m27955h();
        }
    }
}
