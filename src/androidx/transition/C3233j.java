package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC2992q;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.transition.j */
/* loaded from: classes.dex */
public class C3233j extends AbstractC2992q {

    /* renamed from: androidx.transition.j$a */
    /* loaded from: classes.dex */
    class C3234a extends Transition.AbstractC3181f {

        /* renamed from: a */
        final /* synthetic */ Rect f5105a;

        C3234a(Rect rect) {
            this.f5105a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC3181f
        /* renamed from: a */
        public Rect mo34890a(Transition transition) {
            return this.f5105a;
        }
    }

    /* renamed from: androidx.transition.j$b */
    /* loaded from: classes.dex */
    class C3235b implements Transition.AbstractC3182g {

        /* renamed from: a */
        final /* synthetic */ View f5107a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5108b;

        C3235b(View view, ArrayList arrayList) {
            this.f5107a = view;
            this.f5108b = arrayList;
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f5107a.setVisibility(8);
            int size = this.f5108b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5108b.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.j$c */
    /* loaded from: classes.dex */
    class C3236c extends C3282z {

        /* renamed from: a */
        final /* synthetic */ Object f5110a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5111b;

        /* renamed from: c */
        final /* synthetic */ Object f5112c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f5113d;

        /* renamed from: e */
        final /* synthetic */ Object f5114e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f5115f;

        C3236c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5110a = obj;
            this.f5111b = arrayList;
            this.f5112c = obj2;
            this.f5113d = arrayList2;
            this.f5114e = obj3;
            this.f5115f = arrayList3;
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionStart(Transition transition) {
            Object obj = this.f5110a;
            if (obj != null) {
                C3233j.this.mo34896q(obj, this.f5111b, null);
            }
            Object obj2 = this.f5112c;
            if (obj2 != null) {
                C3233j.this.mo34896q(obj2, this.f5113d, null);
            }
            Object obj3 = this.f5114e;
            if (obj3 != null) {
                C3233j.this.mo34896q(obj3, this.f5115f, null);
            }
        }
    }

    /* renamed from: androidx.transition.j$d */
    /* loaded from: classes.dex */
    class C3237d extends Transition.AbstractC3181f {

        /* renamed from: a */
        final /* synthetic */ Rect f5117a;

        C3237d(Rect rect) {
            this.f5117a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC3181f
        /* renamed from: a */
        public Rect mo34890a(Transition transition) {
            Rect rect = this.f5117a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5117a;
        }
    }

    /* renamed from: C */
    private static boolean m34905C(Transition transition) {
        if (!AbstractC2992q.m35892l(transition.getTargetIds()) || !AbstractC2992q.m35892l(transition.getTargetNames()) || !AbstractC2992q.m35892l(transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: A */
    public void mo34907A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C3191c0 c0Var = (C3191c0) obj;
        if (c0Var != null) {
            c0Var.getTargets().clear();
            c0Var.getTargets().addAll(arrayList2);
            mo34896q(c0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: B */
    public Object mo34906B(Object obj) {
        if (obj == null) {
            return null;
        }
        C3191c0 c0Var = new C3191c0();
        c0Var.m34968h((Transition) obj);
        return c0Var;
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
            if (transition instanceof C3191c0) {
                C3191c0 c0Var = (C3191c0) transition;
                int l = c0Var.m34965l();
                while (i < l) {
                    mo34903b(c0Var.m34966k(i), arrayList);
                    i++;
                }
            } else if (!m34905C(transition) && AbstractC2992q.m35892l(transition.getTargets())) {
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
        C3184a0.m34980a(viewGroup, (Transition) obj);
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
            transition = new C3191c0().m34968h(transition).m34968h(transition2).m34957u(1);
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
        C3191c0 c0Var = new C3191c0();
        if (transition != null) {
            c0Var.m34968h(transition);
        }
        c0Var.m34968h(transition3);
        return c0Var;
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: n */
    public Object mo34898n(Object obj, Object obj2, Object obj3) {
        C3191c0 c0Var = new C3191c0();
        if (obj != null) {
            c0Var.m34968h((Transition) obj);
        }
        if (obj2 != null) {
            c0Var.m34968h((Transition) obj2);
        }
        if (obj3 != null) {
            c0Var.m34968h((Transition) obj3);
        }
        return c0Var;
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
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof C3191c0) {
            C3191c0 c0Var = (C3191c0) transition;
            int l = c0Var.m34965l();
            while (i2 < l) {
                mo34896q(c0Var.m34966k(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m34905C(transition)) {
            List<View> targets = transition.getTargets();
            if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
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
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: r */
    public void mo34895r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C3235b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: t */
    public void mo34894t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C3236c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: u */
    public void mo34893u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C3237d(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: v */
    public void mo34892v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m35893k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C3234a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC2992q
    /* renamed from: z */
    public void mo34891z(Object obj, View view, ArrayList<View> arrayList) {
        C3191c0 c0Var = (C3191c0) obj;
        List<View> targets = c0Var.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC2992q.m35898d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo34903b(c0Var, arrayList);
    }
}
