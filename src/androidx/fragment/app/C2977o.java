package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C2094a;
import androidx.core.app.SharedElementCallback;
import androidx.core.p018os.C2437e;
import androidx.core.view.C2733w0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC2722u0;
import androidx.transition.C3233j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public class C2977o {

    /* renamed from: a */
    private static final int[] f4253a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final AbstractC2992q f4254b = new C2986p();

    /* renamed from: c */
    static final AbstractC2992q f4255c = m35904x();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$a */
    /* loaded from: classes.dex */
    public class RunnableC2978a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractC2984g f4256k;

        /* renamed from: l */
        final /* synthetic */ Fragment f4257l;

        /* renamed from: m */
        final /* synthetic */ C2437e f4258m;

        RunnableC2978a(AbstractC2984g gVar, Fragment fragment, C2437e eVar) {
            this.f4256k = gVar;
            this.f4257l = fragment;
            this.f4258m = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4256k.mo35901a(this.f4257l, this.f4258m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$b */
    /* loaded from: classes.dex */
    public class RunnableC2979b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ ArrayList f4259k;

        RunnableC2979b(ArrayList arrayList) {
            this.f4259k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2977o.m35929B(this.f4259k, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$c */
    /* loaded from: classes.dex */
    public class RunnableC2980c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractC2984g f4260k;

        /* renamed from: l */
        final /* synthetic */ Fragment f4261l;

        /* renamed from: m */
        final /* synthetic */ C2437e f4262m;

        RunnableC2980c(AbstractC2984g gVar, Fragment fragment, C2437e eVar) {
            this.f4260k = gVar;
            this.f4261l = fragment;
            this.f4262m = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4260k.mo35901a(this.f4261l, this.f4262m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$d */
    /* loaded from: classes.dex */
    public class RunnableC2981d implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Object f4263k;

        /* renamed from: l */
        final /* synthetic */ AbstractC2992q f4264l;

        /* renamed from: m */
        final /* synthetic */ View f4265m;

        /* renamed from: n */
        final /* synthetic */ Fragment f4266n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f4267o;

        /* renamed from: p */
        final /* synthetic */ ArrayList f4268p;

        /* renamed from: q */
        final /* synthetic */ ArrayList f4269q;

        /* renamed from: r */
        final /* synthetic */ Object f4270r;

        RunnableC2981d(Object obj, AbstractC2992q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f4263k = obj;
            this.f4264l = qVar;
            this.f4265m = view;
            this.f4266n = fragment;
            this.f4267o = arrayList;
            this.f4268p = arrayList2;
            this.f4269q = arrayList3;
            this.f4270r = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f4263k;
            if (obj != null) {
                this.f4264l.mo34897p(obj, this.f4265m);
                this.f4268p.addAll(C2977o.m35917k(this.f4264l, this.f4263k, this.f4266n, this.f4267o, this.f4265m));
            }
            if (this.f4269q != null) {
                if (this.f4270r != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f4265m);
                    this.f4264l.mo34896q(this.f4270r, this.f4269q, arrayList);
                }
                this.f4269q.clear();
                this.f4269q.add(this.f4265m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$e */
    /* loaded from: classes.dex */
    public class RunnableC2982e implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Fragment f4271k;

        /* renamed from: l */
        final /* synthetic */ Fragment f4272l;

        /* renamed from: m */
        final /* synthetic */ boolean f4273m;

        /* renamed from: n */
        final /* synthetic */ C2094a f4274n;

        /* renamed from: o */
        final /* synthetic */ View f4275o;

        /* renamed from: p */
        final /* synthetic */ AbstractC2992q f4276p;

        /* renamed from: q */
        final /* synthetic */ Rect f4277q;

        RunnableC2982e(Fragment fragment, Fragment fragment2, boolean z, C2094a aVar, View view, AbstractC2992q qVar, Rect rect) {
            this.f4271k = fragment;
            this.f4272l = fragment2;
            this.f4273m = z;
            this.f4274n = aVar;
            this.f4275o = view;
            this.f4276p = qVar;
            this.f4277q = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2977o.m35922f(this.f4271k, this.f4272l, this.f4273m, this.f4274n, false);
            View view = this.f4275o;
            if (view != null) {
                this.f4276p.m35893k(view, this.f4277q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$f */
    /* loaded from: classes.dex */
    public class RunnableC2983f implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractC2992q f4278k;

        /* renamed from: l */
        final /* synthetic */ C2094a f4279l;

        /* renamed from: m */
        final /* synthetic */ Object f4280m;

        /* renamed from: n */
        final /* synthetic */ C2985h f4281n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f4282o;

        /* renamed from: p */
        final /* synthetic */ View f4283p;

        /* renamed from: q */
        final /* synthetic */ Fragment f4284q;

        /* renamed from: r */
        final /* synthetic */ Fragment f4285r;

        /* renamed from: s */
        final /* synthetic */ boolean f4286s;

        /* renamed from: t */
        final /* synthetic */ ArrayList f4287t;

        /* renamed from: u */
        final /* synthetic */ Object f4288u;

        /* renamed from: v */
        final /* synthetic */ Rect f4289v;

        RunnableC2983f(AbstractC2992q qVar, C2094a aVar, Object obj, C2985h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f4278k = qVar;
            this.f4279l = aVar;
            this.f4280m = obj;
            this.f4281n = hVar;
            this.f4282o = arrayList;
            this.f4283p = view;
            this.f4284q = fragment;
            this.f4285r = fragment2;
            this.f4286s = z;
            this.f4287t = arrayList2;
            this.f4288u = obj2;
            this.f4289v = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2094a<String, View> h = C2977o.m35920h(this.f4278k, this.f4279l, this.f4280m, this.f4281n);
            if (h != null) {
                this.f4282o.addAll(h.values());
                this.f4282o.add(this.f4283p);
            }
            C2977o.m35922f(this.f4284q, this.f4285r, this.f4286s, h, false);
            Object obj = this.f4280m;
            if (obj != null) {
                this.f4278k.mo34907A(obj, this.f4287t, this.f4282o);
                View t = C2977o.m35908t(h, this.f4281n, this.f4288u, this.f4286s);
                if (t != null) {
                    this.f4278k.m35893k(t, this.f4289v);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$g */
    /* loaded from: classes.dex */
    public interface AbstractC2984g {
        /* renamed from: a */
        void mo35901a(Fragment fragment, C2437e eVar);

        /* renamed from: b */
        void mo35900b(Fragment fragment, C2437e eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$h */
    /* loaded from: classes.dex */
    public static class C2985h {

        /* renamed from: a */
        public Fragment f4290a;

        /* renamed from: b */
        public boolean f4291b;

        /* renamed from: c */
        public C2937a f4292c;

        /* renamed from: d */
        public Fragment f4293d;

        /* renamed from: e */
        public boolean f4294e;

        /* renamed from: f */
        public C2937a f4295f;

        C2985h() {
        }
    }

    /* renamed from: A */
    private static void m35930A(AbstractC2992q qVar, Object obj, Object obj2, C2094a<String, View> aVar, boolean z, C2937a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f4113p;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.f4114q.get(0);
            } else {
                str = aVar2.f4113p.get(0);
            }
            View view = aVar.get(str);
            qVar.mo34892v(obj, view);
            if (obj2 != null) {
                qVar.mo34892v(obj2, view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static void m35929B(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static void m35928C(Context context, FragmentContainer fragmentContainer, ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, AbstractC2984g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C2937a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m35923e(aVar, sparseArray, z);
            } else {
                m35925c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C2094a<String, String> d = m35924d(keyAt, arrayList, arrayList2, i, i2);
                C2985h hVar = (C2985h) sparseArray.valueAt(i4);
                if (fragmentContainer.mo36222d() && (viewGroup = (ViewGroup) fragmentContainer.mo36223c(keyAt)) != null) {
                    if (z) {
                        m35913o(viewGroup, hVar, view, d, gVar);
                    } else {
                        m35914n(viewGroup, hVar, view, d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m35927a(ArrayList<View> arrayList, C2094a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View n = aVar.m39048n(size);
            if (collection.contains(C2733w0.m37045K(n))) {
                arrayList.add(n);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
        if (r0.mAdded != false) goto L_0x008d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006f, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008b, code lost:
        if (r0.mHidden == false) goto L_0x008d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008d, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m35926b(androidx.fragment.app.C2937a r8, androidx.fragment.app.FragmentTransaction.C2936a r9, android.util.SparseArray<androidx.fragment.app.C2977o.C2985h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2977o.m35926b(androidx.fragment.app.a, androidx.fragment.app.FragmentTransaction$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m35925c(C2937a aVar, SparseArray<C2985h> sparseArray, boolean z) {
        int size = aVar.f4100c.size();
        for (int i = 0; i < size; i++) {
            m35926b(aVar, aVar.f4100c.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C2094a<String, String> m35924d(int i, ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C2094a<String, String> aVar = new C2094a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C2937a aVar2 = arrayList.get(i4);
            if (aVar2.m36055B(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f4113p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f4113p;
                        arrayList4 = aVar2.f4114q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f4113p;
                        arrayList3 = aVar2.f4114q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m35923e(C2937a aVar, SparseArray<C2985h> sparseArray, boolean z) {
        if (aVar.f4129t.m36109q0().mo36222d()) {
            for (int size = aVar.f4100c.size() - 1; size >= 0; size--) {
                m35926b(aVar, aVar.f4100c.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m35922f(Fragment fragment, Fragment fragment2, boolean z, C2094a<String, View> aVar, boolean z2) {
        SharedElementCallback sharedElementCallback;
        int i;
        if (z) {
            sharedElementCallback = fragment2.getEnterTransitionCallback();
        } else {
            sharedElementCallback = fragment.getEnterTransitionCallback();
        }
        if (sharedElementCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.m39052j(i2));
                arrayList.add(aVar.m39048n(i2));
            }
            if (z2) {
                sharedElementCallback.m38348g(arrayList2, arrayList, null);
            } else {
                sharedElementCallback.m38349f(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: g */
    private static boolean m35921g(AbstractC2992q qVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!qVar.mo34901e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C2094a<String, View> m35920h(AbstractC2992q qVar, C2094a<String, String> aVar, Object obj, C2985h hVar) {
        SharedElementCallback sharedElementCallback;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.f4290a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        C2094a<String, View> aVar2 = new C2094a<>();
        qVar.m35894j(aVar2, view);
        C2937a aVar3 = hVar.f4292c;
        if (hVar.f4291b) {
            sharedElementCallback = fragment.getExitTransitionCallback();
            arrayList = aVar3.f4113p;
        } else {
            sharedElementCallback = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f4114q;
        }
        if (arrayList != null) {
            aVar2.m39035p(arrayList);
            aVar2.m39035p(aVar.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.m38351d(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = aVar2.get(str);
                if (view2 == null) {
                    String q2 = m35911q(aVar, str);
                    if (q2 != null) {
                        aVar.remove(q2);
                    }
                } else if (!str.equals(C2733w0.m37045K(view2)) && (q = m35911q(aVar, str)) != null) {
                    aVar.put(q, C2733w0.m37045K(view2));
                }
            }
        } else {
            m35903y(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: i */
    private static C2094a<String, View> m35919i(AbstractC2992q qVar, C2094a<String, String> aVar, Object obj, C2985h hVar) {
        SharedElementCallback sharedElementCallback;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f4293d;
        C2094a<String, View> aVar2 = new C2094a<>();
        qVar.m35894j(aVar2, fragment.requireView());
        C2937a aVar3 = hVar.f4295f;
        if (hVar.f4294e) {
            sharedElementCallback = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f4114q;
        } else {
            sharedElementCallback = fragment.getExitTransitionCallback();
            arrayList = aVar3.f4113p;
        }
        if (arrayList != null) {
            aVar2.m39035p(arrayList);
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.m38351d(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C2733w0.m37045K(view))) {
                    aVar.put(C2733w0.m37045K(view), aVar.remove(str));
                }
            }
        } else {
            aVar.m39035p(aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: j */
    private static AbstractC2992q m35918j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC2992q qVar = f4254b;
        if (qVar != null && m35921g(qVar, arrayList)) {
            return qVar;
        }
        AbstractC2992q qVar2 = f4255c;
        if (qVar2 != null && m35921g(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m35917k(AbstractC2992q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            qVar.m35897f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.mo34903b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m35916l(AbstractC2992q qVar, ViewGroup viewGroup, View view, C2094a<String, String> aVar, C2985h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C2094a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        Fragment fragment = hVar.f4290a;
        Fragment fragment2 = hVar.f4293d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f4291b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m35907u(qVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C2094a<String, View> i = m35919i(qVar, aVar2, obj3, hVar);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(i.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        m35922f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            qVar.mo34891z(obj4, view, arrayList);
            m35930A(qVar, obj4, obj2, i, hVar.f4294e, hVar.f4295f);
            if (obj != null) {
                qVar.mo34893u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(viewGroup, new RunnableC2983f(qVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj4;
    }

    /* renamed from: m */
    private static Object m35915m(AbstractC2992q qVar, ViewGroup viewGroup, View view, C2094a<String, String> aVar, C2985h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        Fragment fragment = hVar.f4290a;
        Fragment fragment2 = hVar.f4293d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f4291b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m35907u(qVar, fragment, fragment2, z);
        }
        C2094a<String, View> i = m35919i(qVar, aVar, obj3, hVar);
        C2094a<String, View> h = m35920h(qVar, aVar, obj3, hVar);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj4 = null;
        } else {
            m35927a(arrayList, i, aVar.keySet());
            m35927a(arrayList2, h, aVar.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        m35922f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            arrayList2.add(view);
            qVar.mo34891z(obj4, view, arrayList);
            m35930A(qVar, obj4, obj2, i, hVar.f4294e, hVar.f4295f);
            Rect rect2 = new Rect();
            View t = m35908t(h, hVar, obj, z);
            if (t != null) {
                qVar.mo34893u(obj, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(viewGroup, new RunnableC2982e(fragment, fragment2, z, h, view2, qVar, rect));
        return obj4;
    }

    /* renamed from: n */
    private static void m35914n(ViewGroup viewGroup, C2985h hVar, View view, C2094a<String, String> aVar, AbstractC2984g gVar) {
        Object obj;
        Fragment fragment = hVar.f4290a;
        Fragment fragment2 = hVar.f4293d;
        AbstractC2992q j = m35918j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar.f4291b;
            boolean z2 = hVar.f4294e;
            Object r = m35910r(j, fragment, z);
            Object s = m35909s(j, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object l = m35916l(j, viewGroup, view, aVar, hVar, arrayList, arrayList2, r, s);
            if (r == null && l == null) {
                obj = s;
                if (obj == null) {
                    return;
                }
            } else {
                obj = s;
            }
            ArrayList<View> k = m35917k(j, obj, fragment2, arrayList, view);
            if (k == null || k.isEmpty()) {
                obj = null;
            }
            j.mo34904a(r, view);
            Object v = m35906v(j, r, obj, l, fragment, hVar.f4291b);
            if (!(fragment2 == null || k == null || (k.size() <= 0 && arrayList.size() <= 0))) {
                C2437e eVar = new C2437e();
                gVar.mo35900b(fragment2, eVar);
                j.mo35889w(fragment2, v, eVar, new RunnableC2980c(gVar, fragment2, eVar));
            }
            if (v != null) {
                ArrayList<View> arrayList3 = new ArrayList<>();
                j.mo34894t(v, r, arrayList3, obj, k, l, arrayList2);
                m35902z(j, viewGroup, fragment, view, arrayList2, r, arrayList3, obj, k);
                j.m35888x(viewGroup, arrayList2, aVar);
                j.mo34902c(viewGroup, v);
                j.m35890s(viewGroup, arrayList2, aVar);
            }
        }
    }

    /* renamed from: o */
    private static void m35913o(ViewGroup viewGroup, C2985h hVar, View view, C2094a<String, String> aVar, AbstractC2984g gVar) {
        Object obj;
        Fragment fragment = hVar.f4290a;
        Fragment fragment2 = hVar.f4293d;
        AbstractC2992q j = m35918j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar.f4291b;
            boolean z2 = hVar.f4294e;
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object r = m35910r(j, fragment, z);
            Object s = m35909s(j, fragment2, z2);
            Object m = m35915m(j, viewGroup, view, aVar, hVar, arrayList2, arrayList, r, s);
            if (r == null && m == null) {
                obj = s;
                if (obj == null) {
                    return;
                }
            } else {
                obj = s;
            }
            ArrayList<View> k = m35917k(j, obj, fragment2, arrayList2, view);
            ArrayList<View> k2 = m35917k(j, r, fragment, arrayList, view);
            m35929B(k2, 4);
            Object v = m35906v(j, r, obj, m, fragment, z);
            if (!(fragment2 == null || k == null || (k.size() <= 0 && arrayList2.size() <= 0))) {
                C2437e eVar = new C2437e();
                gVar.mo35900b(fragment2, eVar);
                j.mo35889w(fragment2, v, eVar, new RunnableC2978a(gVar, fragment2, eVar));
            }
            if (v != null) {
                m35905w(j, obj, fragment2, k);
                ArrayList<String> o = j.m35891o(arrayList);
                j.mo34894t(v, r, k2, obj, k, m, arrayList);
                j.mo34902c(viewGroup, v);
                j.m35887y(viewGroup, arrayList2, arrayList, o, aVar);
                m35929B(k2, 0);
                j.mo34907A(m, arrayList2, arrayList);
            }
        }
    }

    /* renamed from: p */
    private static C2985h m35912p(C2985h hVar, SparseArray<C2985h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C2985h hVar2 = new C2985h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static String m35911q(C2094a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.m39048n(i))) {
                return aVar.m39052j(i);
            }
        }
        return null;
    }

    /* renamed from: r */
    private static Object m35910r(AbstractC2992q qVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return qVar.mo34900g(obj);
    }

    /* renamed from: s */
    private static Object m35909s(AbstractC2992q qVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return qVar.mo34900g(obj);
    }

    /* renamed from: t */
    static View m35908t(C2094a<String, View> aVar, C2985h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        C2937a aVar2 = hVar.f4292c;
        if (obj == null || aVar == null || (arrayList = aVar2.f4113p) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.f4113p.get(0);
        } else {
            str = aVar2.f4114q.get(0);
        }
        return aVar.get(str);
    }

    /* renamed from: u */
    private static Object m35907u(AbstractC2992q qVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return qVar.mo34906B(qVar.mo34900g(obj));
    }

    /* renamed from: v */
    private static Object m35906v(AbstractC2992q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else if (z) {
            z2 = fragment.getAllowReturnTransitionOverlap();
        } else {
            z2 = fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return qVar.mo34898n(obj2, obj, obj3);
        }
        return qVar.mo34899m(obj2, obj, obj3);
    }

    /* renamed from: w */
    private static void m35905w(AbstractC2992q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            qVar.mo34895r(obj, fragment.getView(), arrayList);
            ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(fragment.mContainer, new RunnableC2979b(arrayList));
        }
    }

    /* renamed from: x */
    private static AbstractC2992q m35904x() {
        try {
            return (AbstractC2992q) C3233j.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static void m35903y(C2094a<String, String> aVar, C2094a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m39048n(size))) {
                aVar.m39050l(size);
            }
        }
    }

    /* renamed from: z */
    private static void m35902z(AbstractC2992q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(viewGroup, new RunnableC2981d(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
