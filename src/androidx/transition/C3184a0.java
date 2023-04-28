package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C2094a;
import androidx.core.view.C2733w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.a0 */
/* loaded from: classes.dex */
public class C3184a0 {

    /* renamed from: a */
    private static Transition f4975a = new C3187b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C2094a<ViewGroup, ArrayList<Transition>>>> f4976b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f4977c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.a0$a */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC3185a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: k */
        Transition f4978k;

        /* renamed from: l */
        ViewGroup f4979l;

        /* renamed from: androidx.transition.a0$a$a */
        /* loaded from: classes.dex */
        class C0066a extends C3282z {

            /* renamed from: a */
            final /* synthetic */ C2094a f4980a;

            C0066a(C2094a aVar) {
                this.f4980a = aVar;
            }

            @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
            public void onTransitionEnd(Transition transition) {
                ((ArrayList) this.f4980a.get(ViewTreeObserver$OnPreDrawListenerC3185a.this.f4979l)).remove(transition);
                transition.removeListener(this);
            }
        }

        ViewTreeObserver$OnPreDrawListenerC3185a(Transition transition, ViewGroup viewGroup) {
            this.f4978k = transition;
            this.f4979l = viewGroup;
        }

        /* renamed from: a */
        private void m34976a() {
            this.f4979l.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f4979l.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m34976a();
            if (!C3184a0.f4977c.remove(this.f4979l)) {
                return true;
            }
            C2094a<ViewGroup, ArrayList<Transition>> b = C3184a0.m34979b();
            ArrayList<Transition> arrayList = b.get(this.f4979l);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                b.put(this.f4979l, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f4978k);
            this.f4978k.addListener(new C0066a(b));
            this.f4978k.captureValues(this.f4979l, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.f4979l);
                }
            }
            this.f4978k.playTransition(this.f4979l);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m34976a();
            C3184a0.f4977c.remove(this.f4979l);
            ArrayList<Transition> arrayList = C3184a0.m34979b().get(this.f4979l);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f4979l);
                }
            }
            this.f4978k.clearValues(true);
        }
    }

    /* renamed from: a */
    public static void m34980a(ViewGroup viewGroup, Transition transition) {
        if (!f4977c.contains(viewGroup) && C2733w0.m37029U(viewGroup)) {
            f4977c.add(viewGroup);
            if (transition == null) {
                transition = f4975a;
            }
            Transition clone = transition.clone();
            m34977d(viewGroup, clone);
            C3265v.m34827c(viewGroup, null);
            m34978c(viewGroup, clone);
        }
    }

    /* renamed from: b */
    static C2094a<ViewGroup, ArrayList<Transition>> m34979b() {
        C2094a<ViewGroup, ArrayList<Transition>> aVar;
        WeakReference<C2094a<ViewGroup, ArrayList<Transition>>> weakReference = f4976b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        C2094a<ViewGroup, ArrayList<Transition>> aVar2 = new C2094a<>();
        f4976b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    /* renamed from: c */
    private static void m34978c(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            ViewTreeObserver$OnPreDrawListenerC3185a aVar = new ViewTreeObserver$OnPreDrawListenerC3185a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m34977d(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = m34979b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.captureValues(viewGroup, true);
        }
        C3265v b = C3265v.m34828b(viewGroup);
        if (b != null) {
            b.m34829a();
        }
    }
}
