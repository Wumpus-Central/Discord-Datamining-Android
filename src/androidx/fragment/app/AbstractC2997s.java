package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p018os.C2437e;
import androidx.core.view.C2733w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p222m1.C10467b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public abstract class AbstractC2997s {

    /* renamed from: a */
    private final ViewGroup f4326a;

    /* renamed from: b */
    final ArrayList<C3002e> f4327b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C3002e> f4328c = new ArrayList<>();

    /* renamed from: d */
    boolean f4329d = false;

    /* renamed from: e */
    boolean f4330e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.s$a */
    /* loaded from: classes.dex */
    public class RunnableC2998a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C3001d f4331k;

        RunnableC2998a(C3001d dVar) {
            this.f4331k = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC2997s.this.f4327b.contains(this.f4331k)) {
                this.f4331k.m35863e().m35855a(this.f4331k.m35862f().mView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.s$b */
    /* loaded from: classes.dex */
    public class RunnableC2999b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C3001d f4333k;

        RunnableC2999b(C3001d dVar) {
            this.f4333k = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2997s.this.f4327b.remove(this.f4333k);
            AbstractC2997s.this.f4328c.remove(this.f4333k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.s$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C3000c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4335a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4336b;

        static {
            int[] iArr = new int[C3002e.EnumC3004b.values().length];
            f4336b = iArr;
            try {
                iArr[C3002e.EnumC3004b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4336b[C3002e.EnumC3004b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4336b[C3002e.EnumC3004b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C3002e.EnumC3005c.values().length];
            f4335a = iArr2;
            try {
                iArr2[C3002e.EnumC3005c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4335a[C3002e.EnumC3005c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4335a[C3002e.EnumC3005c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4335a[C3002e.EnumC3005c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.s$d */
    /* loaded from: classes.dex */
    public static class C3001d extends C3002e {

        /* renamed from: h */
        private final C2973m f4337h;

        C3001d(C3002e.EnumC3005c cVar, C3002e.EnumC3004b bVar, C2973m mVar, C2437e eVar) {
            super(cVar, bVar, mVar.m35966k(), eVar);
            this.f4337h = mVar;
        }

        @Override // androidx.fragment.app.AbstractC2997s.C3002e
        /* renamed from: c */
        public void mo35865c() {
            super.mo35865c();
            this.f4337h.m35964m();
        }

        @Override // androidx.fragment.app.AbstractC2997s.C3002e
        /* renamed from: l */
        void mo35856l() {
            if (m35861g() == C3002e.EnumC3004b.ADDING) {
                Fragment k = this.f4337h.m35966k();
                View findFocus = k.mView.findFocus();
                if (findFocus != null) {
                    k.setFocusedView(findFocus);
                    if (FragmentManager.m36195H0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View requireView = m35862f().requireView();
                if (requireView.getParent() == null) {
                    this.f4337h.m35975b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.s$e */
    /* loaded from: classes.dex */
    public static class C3002e {

        /* renamed from: a */
        private EnumC3005c f4338a;

        /* renamed from: b */
        private EnumC3004b f4339b;

        /* renamed from: c */
        private final Fragment f4340c;

        /* renamed from: d */
        private final List<Runnable> f4341d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C2437e> f4342e = new HashSet<>();

        /* renamed from: f */
        private boolean f4343f = false;

        /* renamed from: g */
        private boolean f4344g = false;

        /* renamed from: androidx.fragment.app.s$e$a */
        /* loaded from: classes.dex */
        class C3003a implements C2437e.AbstractC2439b {
            C3003a() {
            }

            @Override // androidx.core.p018os.C2437e.AbstractC2439b
            public void onCancel() {
                C3002e.this.m35866b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.fragment.app.s$e$b */
        /* loaded from: classes.dex */
        public enum EnumC3004b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.fragment.app.s$e$c */
        /* loaded from: classes.dex */
        public enum EnumC3005c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: b */
            public static EnumC3005c m35854b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: c */
            public static EnumC3005c m35853c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m35854b(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: a */
            public void m35855a(View view) {
                int i = C3000c.f4335a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m36195H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.m36195H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m36195H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (FragmentManager.m36195H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        C3002e(EnumC3005c cVar, EnumC3004b bVar, Fragment fragment, C2437e eVar) {
            this.f4338a = cVar;
            this.f4339b = bVar;
            this.f4340c = fragment;
            eVar.m37743c(new C3003a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final void m35867a(Runnable runnable) {
            this.f4341d.add(runnable);
        }

        /* renamed from: b */
        final void m35866b() {
            if (!m35860h()) {
                this.f4343f = true;
                if (this.f4342e.isEmpty()) {
                    mo35865c();
                    return;
                }
                Iterator it = new ArrayList(this.f4342e).iterator();
                while (it.hasNext()) {
                    ((C2437e) it.next()).m37745a();
                }
            }
        }

        /* renamed from: c */
        public void mo35865c() {
            if (!this.f4344g) {
                if (FragmentManager.m36195H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f4344g = true;
                for (Runnable runnable : this.f4341d) {
                    runnable.run();
                }
            }
        }

        /* renamed from: d */
        public final void m35864d(C2437e eVar) {
            if (this.f4342e.remove(eVar) && this.f4342e.isEmpty()) {
                mo35865c();
            }
        }

        /* renamed from: e */
        public EnumC3005c m35863e() {
            return this.f4338a;
        }

        /* renamed from: f */
        public final Fragment m35862f() {
            return this.f4340c;
        }

        /* renamed from: g */
        EnumC3004b m35861g() {
            return this.f4339b;
        }

        /* renamed from: h */
        final boolean m35860h() {
            return this.f4343f;
        }

        /* renamed from: i */
        final boolean m35859i() {
            return this.f4344g;
        }

        /* renamed from: j */
        public final void m35858j(C2437e eVar) {
            mo35856l();
            this.f4342e.add(eVar);
        }

        /* renamed from: k */
        final void m35857k(EnumC3005c cVar, EnumC3004b bVar) {
            int i = C3000c.f4336b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (FragmentManager.m36195H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4340c + " mFinalState = " + this.f4338a + " -> REMOVED. mLifecycleImpact  = " + this.f4339b + " to REMOVING.");
                    }
                    this.f4338a = EnumC3005c.REMOVED;
                    this.f4339b = EnumC3004b.REMOVING;
                } else if (i == 3 && this.f4338a != EnumC3005c.REMOVED) {
                    if (FragmentManager.m36195H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4340c + " mFinalState = " + this.f4338a + " -> " + cVar + ". ");
                    }
                    this.f4338a = cVar;
                }
            } else if (this.f4338a == EnumC3005c.REMOVED) {
                if (FragmentManager.m36195H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4340c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4339b + " to ADDING.");
                }
                this.f4338a = EnumC3005c.VISIBLE;
                this.f4339b = EnumC3004b.ADDING;
            }
        }

        /* renamed from: l */
        void mo35856l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4338a + "} {mLifecycleImpact = " + this.f4339b + "} {mFragment = " + this.f4340c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2997s(ViewGroup viewGroup) {
        this.f4326a = viewGroup;
    }

    /* renamed from: a */
    private void m35885a(C3002e.EnumC3005c cVar, C3002e.EnumC3004b bVar, C2973m mVar) {
        synchronized (this.f4327b) {
            C2437e eVar = new C2437e();
            C3002e h = m35878h(mVar.m35966k());
            if (h != null) {
                h.m35857k(cVar, bVar);
                return;
            }
            C3001d dVar = new C3001d(cVar, bVar, mVar, eVar);
            this.f4327b.add(dVar);
            dVar.m35867a(new RunnableC2998a(dVar));
            dVar.m35867a(new RunnableC2999b(dVar));
        }
    }

    /* renamed from: h */
    private C3002e m35878h(Fragment fragment) {
        Iterator<C3002e> it = this.f4327b.iterator();
        while (it.hasNext()) {
            C3002e next = it.next();
            if (next.m35862f().equals(fragment) && !next.m35860h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C3002e m35877i(Fragment fragment) {
        Iterator<C3002e> it = this.f4328c.iterator();
        while (it.hasNext()) {
            C3002e next = it.next();
            if (next.m35862f().equals(fragment) && !next.m35860h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static AbstractC2997s m35872n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m35871o(viewGroup, fragmentManager.m36209A0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static AbstractC2997s m35871o(ViewGroup viewGroup, AbstractC3006t tVar) {
        int i = C10467b.f23089b;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof AbstractC2997s) {
            return (AbstractC2997s) tag;
        }
        AbstractC2997s a = tVar.mo35852a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: q */
    private void m35869q() {
        Iterator<C3002e> it = this.f4327b.iterator();
        while (it.hasNext()) {
            C3002e next = it.next();
            if (next.m35861g() == C3002e.EnumC3004b.ADDING) {
                next.m35857k(C3002e.EnumC3005c.m35854b(next.m35862f().requireView().getVisibility()), C3002e.EnumC3004b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35884b(C3002e.EnumC3005c cVar, C2973m mVar) {
        if (FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + mVar.m35966k());
        }
        m35885a(cVar, C3002e.EnumC3004b.ADDING, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35883c(C2973m mVar) {
        if (FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + mVar.m35966k());
        }
        m35885a(C3002e.EnumC3005c.GONE, C3002e.EnumC3004b.NONE, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35882d(C2973m mVar) {
        if (FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + mVar.m35966k());
        }
        m35885a(C3002e.EnumC3005c.REMOVED, C3002e.EnumC3004b.REMOVING, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35881e(C2973m mVar) {
        if (FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + mVar.m35966k());
        }
        m35885a(C3002e.EnumC3005c.VISIBLE, C3002e.EnumC3004b.NONE, mVar);
    }

    /* renamed from: f */
    abstract void mo35880f(List<C3002e> list, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m35879g() {
        if (!this.f4330e) {
            if (!C2733w0.m37030T(this.f4326a)) {
                m35876j();
                this.f4329d = false;
                return;
            }
            synchronized (this.f4327b) {
                if (!this.f4327b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f4328c);
                    this.f4328c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C3002e eVar = (C3002e) it.next();
                        if (FragmentManager.m36195H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.m35866b();
                        if (!eVar.m35859i()) {
                            this.f4328c.add(eVar);
                        }
                    }
                    m35869q();
                    ArrayList arrayList2 = new ArrayList(this.f4327b);
                    this.f4327b.clear();
                    this.f4328c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C3002e) it2.next()).mo35856l();
                    }
                    mo35880f(arrayList2, this.f4329d);
                    this.f4329d = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m35876j() {
        String str;
        String str2;
        boolean T = C2733w0.m37030T(this.f4326a);
        synchronized (this.f4327b) {
            m35869q();
            Iterator<C3002e> it = this.f4327b.iterator();
            while (it.hasNext()) {
                it.next().mo35856l();
            }
            Iterator it2 = new ArrayList(this.f4328c).iterator();
            while (it2.hasNext()) {
                C3002e eVar = (C3002e) it2.next();
                if (FragmentManager.m36195H0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (T) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f4326a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.m35866b();
            }
            Iterator it3 = new ArrayList(this.f4327b).iterator();
            while (it3.hasNext()) {
                C3002e eVar2 = (C3002e) it3.next();
                if (FragmentManager.m36195H0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (T) {
                        str = "";
                    } else {
                        str = "Container " + this.f4326a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.m35866b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m35875k() {
        if (this.f4330e) {
            this.f4330e = false;
            m35879g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C3002e.EnumC3004b m35874l(C2973m mVar) {
        C3002e.EnumC3004b bVar;
        C3002e h = m35878h(mVar.m35966k());
        if (h != null) {
            bVar = h.m35861g();
        } else {
            bVar = null;
        }
        C3002e i = m35877i(mVar.m35966k());
        if (i == null || (bVar != null && bVar != C3002e.EnumC3004b.NONE)) {
            return bVar;
        }
        return i.m35861g();
    }

    /* renamed from: m */
    public ViewGroup m35873m() {
        return this.f4326a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m35870p() {
        synchronized (this.f4327b) {
            m35869q();
            this.f4330e = false;
            int size = this.f4327b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C3002e eVar = this.f4327b.get(size);
                C3002e.EnumC3005c c = C3002e.EnumC3005c.m35853c(eVar.m35862f().mView);
                C3002e.EnumC3005c e = eVar.m35863e();
                C3002e.EnumC3005c cVar = C3002e.EnumC3005c.VISIBLE;
                if (e == cVar && c != cVar) {
                    this.f4330e = eVar.m35862f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m35868r(boolean z) {
        this.f4329d = z;
    }
}
