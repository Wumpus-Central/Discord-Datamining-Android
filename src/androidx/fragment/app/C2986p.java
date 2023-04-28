package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p018os.C2437e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
class C2986p extends AbstractC2992q {

    /* renamed from: androidx.fragment.app.p$a */
    /* loaded from: classes.dex */
    class C2987a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4296a;

        C2987a(Rect rect) {
            this.f4296a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f4296a;
        }
    }

    /* renamed from: androidx.fragment.app.p$b */
    /* loaded from: classes.dex */
    class C2988b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f4298a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4299b;

        C2988b(View view, ArrayList arrayList) {
            this.f4298a = view;
            this.f4299b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f4298a.setVisibility(8);
            int size = this.f4299b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4299b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.p$c */
    /* loaded from: classes.dex */
    class C2989c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f4301a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4302b;

        /* renamed from: c */
        final /* synthetic */ Object f4303c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4304d;

        /* renamed from: e */
        final /* synthetic */ Object f4305e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4306f;

        C2989c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4301a = obj;
            this.f4302b = arrayList;
            this.f4303c = obj2;
            this.f4304d = arrayList2;
            this.f4305e = obj3;
            this.f4306f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f4301a;
            if (obj != null) {
                C2986p.this.mo34896q(obj, this.f4302b, null);
            }
            Object obj2 = this.f4303c;
            if (obj2 != null) {
                C2986p.this.mo34896q(obj2, this.f4304d, null);
            }
            Object obj3 = this.f4305e;
            if (obj3 != null) {
                C2986p.this.mo34896q(obj3, this.f4306f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$d */
    /* loaded from: classes.dex */
    class C2990d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f4308a;

        C2990d(Runnable runnable) {
            this.f4308a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f4308a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.p$e */
    /* loaded from: classes.dex */
    class C2991e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4310a;

        C2991e(Rect rect) {
            this.f4310a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4310a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4310a;
        }
    }

    /* renamed from: C */
    private static boolean m35899C(Transition transition) {
        if (!AbstractC2992q.m35892l(transition.getTargetIds()) || !AbstractC2992q.m35892l(transition.getTargetNames()) || !AbstractC2992q.m35892l(transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: A */
    public void mo34907A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo34896q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: B */
    public Object mo34906B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: a */
    public void mo34904a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: b */
    public void mo34903b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo34903b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m35899C(transition) && AbstractC2992q.m35892l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: c */
    public void mo34902c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: e */
    public boolean mo34901e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: g */
    public Object mo34900g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: m */
    public Object mo34899m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: n */
    public Object mo34898n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: p */
    public void mo34897p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: q */
    public void mo34896q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo34896q(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m35899C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: r */
    public void mo34895r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C2988b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: t */
    public void mo34894t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C2989c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: u */
    public void mo34893u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C2991e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: v */
    public void mo34892v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m35893k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C2987a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: w */
    public void mo35889w(Fragment fragment, Object obj, C2437e eVar, Runnable runnable) {
        ((Transition) obj).addListener(new C2990d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: z */
    public void mo34891z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC2992q.m35898d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo34903b(transitionSet, arrayList);
    }
}
