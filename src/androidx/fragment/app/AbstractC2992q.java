package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p018os.C2437e;
import androidx.core.view.C2649j2;
import androidx.core.view.C2733w0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC2722u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public abstract class AbstractC2992q {

    /* renamed from: androidx.fragment.app.q$a */
    /* loaded from: classes.dex */
    class RunnableC2993a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ int f4312k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f4313l;

        /* renamed from: m */
        final /* synthetic */ ArrayList f4314m;

        /* renamed from: n */
        final /* synthetic */ ArrayList f4315n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f4316o;

        RunnableC2993a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4312k = i;
            this.f4313l = arrayList;
            this.f4314m = arrayList2;
            this.f4315n = arrayList3;
            this.f4316o = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f4312k; i++) {
                C2733w0.m37046J0((View) this.f4313l.get(i), (String) this.f4314m.get(i));
                C2733w0.m37046J0((View) this.f4315n.get(i), (String) this.f4316o.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$b */
    /* loaded from: classes.dex */
    class RunnableC2994b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ ArrayList f4318k;

        /* renamed from: l */
        final /* synthetic */ Map f4319l;

        RunnableC2994b(ArrayList arrayList, Map map) {
            this.f4318k = arrayList;
            this.f4319l = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4318k.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f4318k.get(i);
                String K = C2733w0.m37045K(view);
                if (K != null) {
                    C2733w0.m37046J0(view, AbstractC2992q.m35895i(this.f4319l, K));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$c */
    /* loaded from: classes.dex */
    class RunnableC2995c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ ArrayList f4321k;

        /* renamed from: l */
        final /* synthetic */ Map f4322l;

        RunnableC2995c(ArrayList arrayList, Map map) {
            this.f4321k = arrayList;
            this.f4322l = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4321k.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f4321k.get(i);
                C2733w0.m37046J0(view, (String) this.f4322l.get(C2733w0.m37045K(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m35898d(List<View> list, View view) {
        int size = list.size();
        if (!m35896h(list, view, size)) {
            if (C2733w0.m37045K(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m35896h(list, childAt, size) && C2733w0.m37045K(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m35896h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m35895i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static boolean m35892l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo34907A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo34906B(Object obj);

    /* renamed from: a */
    public abstract void mo34904a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo34903b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo34902c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo34901e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m35897f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C2649j2.m37230a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m35897f(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: g */
    public abstract Object mo34900g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m35894j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String K = C2733w0.m37045K(view);
            if (K != null) {
                map.put(K, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m35894j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m35893k(View view, Rect rect) {
        if (C2733w0.m37030T(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo34899m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo34898n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> m35891o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C2733w0.m37045K(view));
            C2733w0.m37046J0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo34897p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo34896q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo34895r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m35890s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(viewGroup, new RunnableC2995c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo34894t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo34893u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo34892v(Object obj, View view);

    /* renamed from: w */
    public void mo35889w(Fragment fragment, Object obj, C2437e eVar, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m35888x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(view, new RunnableC2994b(arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m35887y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String K = C2733w0.m37045K(view2);
            arrayList4.add(K);
            if (K != null) {
                C2733w0.m37046J0(view2, null);
                String str = map.get(K);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C2733w0.m37046J0(arrayList2.get(i2), K);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(view, new RunnableC2993a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo34891z(Object obj, View view, ArrayList<View> arrayList);
}
