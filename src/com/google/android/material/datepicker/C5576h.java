package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C2515e;
import androidx.core.view.C2549a;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.C3143k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p083eb.C6805d;
import p083eb.C6807f;
import p083eb.C6808g;
import p083eb.C6809h;
import p083eb.C6810i;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes3.dex */
public final class C5576h<S> extends AbstractC5604p<S> {

    /* renamed from: v */
    static final Object f10793v = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: w */
    static final Object f10794w = "NAVIGATION_PREV_TAG";

    /* renamed from: x */
    static final Object f10795x = "NAVIGATION_NEXT_TAG";

    /* renamed from: y */
    static final Object f10796y = "SELECTOR_TOGGLE_TAG";

    /* renamed from: l */
    private int f10797l;

    /* renamed from: m */
    private AbstractC5571d<S> f10798m;

    /* renamed from: n */
    private C5566a f10799n;

    /* renamed from: o */
    private C5597l f10800o;

    /* renamed from: p */
    private EnumC5586k f10801p;

    /* renamed from: q */
    private C5570c f10802q;

    /* renamed from: r */
    private RecyclerView f10803r;

    /* renamed from: s */
    private RecyclerView f10804s;

    /* renamed from: t */
    private View f10805t;

    /* renamed from: u */
    private View f10806u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$a */
    /* loaded from: classes3.dex */
    public class RunnableC5577a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ int f10807k;

        RunnableC5577a(int i) {
            this.f10807k = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5576h.this.f10804s.smoothScrollToPosition(this.f10807k);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    /* loaded from: classes3.dex */
    class C5578b extends C2549a {
        C5578b() {
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37385c0(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$c */
    /* loaded from: classes3.dex */
    class C5579c extends C5605q {

        /* renamed from: S */
        final /* synthetic */ int f37481S;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5579c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f37481S = i2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: V1 */
        public void mo28184V1(RecyclerView.State state, int[] iArr) {
            if (this.f37481S == 0) {
                iArr[0] = C5576h.this.f10804s.getWidth();
                iArr[1] = C5576h.this.f10804s.getWidth();
                return;
            }
            iArr[0] = C5576h.this.f10804s.getHeight();
            iArr[1] = C5576h.this.f10804s.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$d */
    /* loaded from: classes3.dex */
    class C5580d implements AbstractC5587l {
        C5580d() {
        }

        @Override // com.google.android.material.datepicker.C5576h.AbstractC5587l
        /* renamed from: a */
        public void mo28183a(long j) {
            if (C5576h.this.f10799n.m28237j().mo28210o(j)) {
                C5576h.this.f10798m.m28220R(j);
                Iterator<AbstractC5603o<S>> it = C5576h.this.f10875k.iterator();
                while (it.hasNext()) {
                    it.next().mo28125a((S) C5576h.this.f10798m.getSelection());
                }
                C5576h.this.f10804s.getAdapter().notifyDataSetChanged();
                if (C5576h.this.f10803r != null) {
                    C5576h.this.f10803r.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$e */
    /* loaded from: classes3.dex */
    public class C5581e extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private final Calendar f10811a = C5609t.m28107k();

        /* renamed from: b */
        private final Calendar f10812b = C5609t.m28107k();

        C5581e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int i2;
            if ((recyclerView.getAdapter() instanceof C5610u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C5610u uVar = (C5610u) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C2515e<Long, Long> eVar : C5576h.this.f10798m.m28217y()) {
                    Long l = eVar.f3485a;
                    if (!(l == null || eVar.f3486b == null)) {
                        this.f10811a.setTimeInMillis(l.longValue());
                        this.f10812b.setTimeInMillis(eVar.f3486b.longValue());
                        int c = uVar.m28102c(this.f10811a.get(1));
                        int c2 = uVar.m28102c(this.f10812b.get(1));
                        View N = gridLayoutManager.mo35490N(c);
                        View N2 = gridLayoutManager.mo35490N(c2);
                        int g3 = c / gridLayoutManager.m35621g3();
                        int g32 = c2 / gridLayoutManager.m35621g3();
                        for (int i3 = g3; i3 <= g32; i3++) {
                            View N3 = gridLayoutManager.mo35490N(gridLayoutManager.m35621g3() * i3);
                            if (N3 != null) {
                                int top = N3.getTop() + C5576h.this.f10802q.f10783d.m28225c();
                                int bottom = N3.getBottom() - C5576h.this.f10802q.f10783d.m28226b();
                                if (i3 == g3) {
                                    i = N.getLeft() + (N.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i3 == g32) {
                                    i2 = N2.getLeft() + (N2.getWidth() / 2);
                                } else {
                                    i2 = recyclerView.getWidth();
                                }
                                canvas.drawRect(i, top, i2, bottom, C5576h.this.f10802q.f10787h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$f */
    /* loaded from: classes3.dex */
    public class C5582f extends C2549a {
        C5582f() {
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String str;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (C5576h.this.f10806u.getVisibility() == 0) {
                str = C5576h.this.getString(C6810i.f14653o);
            } else {
                str = C5576h.this.getString(C6810i.f14651m);
            }
            accessibilityNodeInfoCompat.m37369k0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$g */
    /* loaded from: classes3.dex */
    public class C5583g extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ C5600n f10815a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f10816b;

        C5583g(C5600n nVar, MaterialButton materialButton) {
            this.f10815a = nVar;
            this.f10816b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f10816b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = C5576h.this.m28190u().m35561i2();
            } else {
                i3 = C5576h.this.m28190u().m35558l2();
            }
            C5576h.this.f10800o = this.f10815a.m28130b(i3);
            this.f10816b.setText(this.f10815a.m28129c(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$h */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC0156h implements View.OnClickListener {
        View$OnClickListenerC0156h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5576h.this.m28185z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$i */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC5584i implements View.OnClickListener {

        /* renamed from: k */
        final /* synthetic */ C5600n f10819k;

        View$OnClickListenerC5584i(C5600n nVar) {
            this.f10819k = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i2 = C5576h.this.m28190u().m35561i2() + 1;
            if (i2 < C5576h.this.f10804s.getAdapter().getItemCount()) {
                C5576h.this.m28187x(this.f10819k.m28130b(i2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$j */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC5585j implements View.OnClickListener {

        /* renamed from: k */
        final /* synthetic */ C5600n f10821k;

        View$OnClickListenerC5585j(C5600n nVar) {
            this.f10821k = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int l2 = C5576h.this.m28190u().m35558l2() - 1;
            if (l2 >= 0) {
                C5576h.this.m28187x(this.f10821k.m28130b(l2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$k */
    /* loaded from: classes3.dex */
    public enum EnumC5586k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$l */
    /* loaded from: classes3.dex */
    public interface AbstractC5587l {
        /* renamed from: a */
        void mo28183a(long j);
    }

    /* renamed from: m */
    private void m28198m(View view, C5600n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C6807f.f14607p);
        materialButton.setTag(f10796y);
        C2733w0.m36990q0(materialButton, new C5582f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C6807f.f14609r);
        materialButton2.setTag(f10794w);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C6807f.f14608q);
        materialButton3.setTag(f10795x);
        this.f10805t = view.findViewById(C6807f.f14616y);
        this.f10806u = view.findViewById(C6807f.f14611t);
        m28186y(EnumC5586k.DAY);
        materialButton.setText(this.f10800o.m28151r());
        this.f10804s.addOnScrollListener(new C5583g(nVar, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC0156h());
        materialButton3.setOnClickListener(new View$OnClickListenerC5584i(nVar));
        materialButton2.setOnClickListener(new View$OnClickListenerC5585j(nVar));
    }

    /* renamed from: n */
    private RecyclerView.ItemDecoration m28197n() {
        return new C5581e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m28192s(Context context) {
        return context.getResources().getDimensionPixelSize(C6805d.f37994B);
    }

    /* renamed from: t */
    private static int m28191t(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C6805d.f38001I) + resources.getDimensionPixelOffset(C6805d.f38002J) + resources.getDimensionPixelOffset(C6805d.f38000H);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C6805d.f37996D);
        int i = C5599m.f10861p;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C6805d.f37994B) * i) + ((i - 1) * resources.getDimensionPixelOffset(C6805d.f37999G)) + resources.getDimensionPixelOffset(C6805d.f14584z);
    }

    /* renamed from: v */
    public static <T> C5576h<T> m28189v(AbstractC5571d<T> dVar, int i, C5566a aVar) {
        C5576h<T> hVar = new C5576h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.m28234t());
        hVar.setArguments(bundle);
        return hVar;
    }

    /* renamed from: w */
    private void m28188w(int i) {
        this.f10804s.post(new RunnableC5577a(i));
    }

    @Override // com.google.android.material.datepicker.AbstractC5604p
    /* renamed from: d */
    public boolean mo28124d(AbstractC5603o<S> oVar) {
        return super.mo28124d(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C5566a m28196o() {
        return this.f10799n;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f10797l = bundle.getInt("THEME_RES_ID_KEY");
        this.f10798m = (AbstractC5571d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f10799n = (C5566a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10800o = (C5597l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f10797l);
        this.f10802q = new C5570c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C5597l u = this.f10799n.m28233u();
        if (C5588i.m28166t(contextThemeWrapper)) {
            i2 = C6809h.f14635o;
            i = 1;
        } else {
            i2 = C6809h.f14633m;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(m28191t(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(C6807f.f14612u);
        C2733w0.m36990q0(gridView, new C5578b());
        gridView.setAdapter((ListAdapter) new C5575g());
        gridView.setNumColumns(u.f10857n);
        gridView.setEnabled(false);
        this.f10804s = (RecyclerView) inflate.findViewById(C6807f.f14615x);
        this.f10804s.setLayoutManager(new C5579c(getContext(), i, false, i));
        this.f10804s.setTag(f10793v);
        C5600n nVar = new C5600n(contextThemeWrapper, this.f10798m, this.f10799n, new C5580d());
        this.f10804s.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(C6808g.f14620c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C6807f.f14616y);
        this.f10803r = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f10803r.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f10803r.setAdapter(new C5610u(this));
            this.f10803r.addItemDecoration(m28197n());
        }
        if (inflate.findViewById(C6807f.f14607p) != null) {
            m28198m(inflate, nVar);
        }
        if (!C5588i.m28166t(contextThemeWrapper)) {
            new C3143k().m35080b(this.f10804s);
        }
        this.f10804s.scrollToPosition(nVar.m28128d(this.f10800o));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f10797l);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f10798m);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10799n);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f10800o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C5570c m28195p() {
        return this.f10802q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C5597l m28194q() {
        return this.f10800o;
    }

    /* renamed from: r */
    public AbstractC5571d<S> m28193r() {
        return this.f10798m;
    }

    /* renamed from: u */
    LinearLayoutManager m28190u() {
        return (LinearLayoutManager) this.f10804s.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m28187x(C5597l lVar) {
        boolean z;
        C5600n nVar = (C5600n) this.f10804s.getAdapter();
        int d = nVar.m28128d(lVar);
        int d2 = d - nVar.m28128d(this.f10800o);
        boolean z2 = true;
        if (Math.abs(d2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (d2 <= 0) {
            z2 = false;
        }
        this.f10800o = lVar;
        if (z && z2) {
            this.f10804s.scrollToPosition(d - 3);
            m28188w(d);
        } else if (z) {
            this.f10804s.scrollToPosition(d + 3);
            m28188w(d);
        } else {
            m28188w(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m28186y(EnumC5586k kVar) {
        this.f10801p = kVar;
        if (kVar == EnumC5586k.YEAR) {
            this.f10803r.getLayoutManager().mo29419G1(((C5610u) this.f10803r.getAdapter()).m28102c(this.f10800o.f10856m));
            this.f10805t.setVisibility(0);
            this.f10806u.setVisibility(8);
        } else if (kVar == EnumC5586k.DAY) {
            this.f10805t.setVisibility(8);
            this.f10806u.setVisibility(0);
            m28187x(this.f10800o);
        }
    }

    /* renamed from: z */
    void m28185z() {
        EnumC5586k kVar = this.f10801p;
        EnumC5586k kVar2 = EnumC5586k.YEAR;
        if (kVar == kVar2) {
            m28186y(EnumC5586k.DAY);
        } else if (kVar == EnumC5586k.DAY) {
            m28186y(kVar2);
        }
    }
}
