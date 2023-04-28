package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.C2094a;
import androidx.core.app.SharedElementCallback;
import androidx.core.p018os.C2437e;
import androidx.core.util.C2517g;
import androidx.core.view.C2649j2;
import androidx.core.view.C2733w0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC2722u0;
import androidx.fragment.app.AbstractC2997s;
import androidx.fragment.app.C2954d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
class C2940c extends AbstractC2997s {

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2941a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4146a;

        static {
            int[] iArr = new int[AbstractC2997s.C3002e.EnumC3005c.values().length];
            f4146a = iArr;
            try {
                iArr[AbstractC2997s.C3002e.EnumC3005c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4146a[AbstractC2997s.C3002e.EnumC3005c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4146a[AbstractC2997s.C3002e.EnumC3005c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4146a[AbstractC2997s.C3002e.EnumC3005c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* loaded from: classes.dex */
    class RunnableC2942b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ List f4147k;

        /* renamed from: l */
        final /* synthetic */ AbstractC2997s.C3002e f4148l;

        RunnableC2942b(List list, AbstractC2997s.C3002e eVar) {
            this.f4147k = list;
            this.f4148l = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4147k.contains(this.f4148l)) {
                this.f4147k.remove(this.f4148l);
                C2940c.this.m36031s(this.f4148l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: classes.dex */
    public class C0056c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4150a;

        /* renamed from: b */
        final /* synthetic */ View f4151b;

        /* renamed from: c */
        final /* synthetic */ boolean f4152c;

        /* renamed from: d */
        final /* synthetic */ AbstractC2997s.C3002e f4153d;

        /* renamed from: e */
        final /* synthetic */ C2951k f4154e;

        C0056c(ViewGroup viewGroup, View view, boolean z, AbstractC2997s.C3002e eVar, C2951k kVar) {
            this.f4150a = viewGroup;
            this.f4151b = view;
            this.f4152c = z;
            this.f4153d = eVar;
            this.f4154e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4150a.endViewTransition(this.f4151b);
            if (this.f4152c) {
                this.f4153d.m35863e().m35855a(this.f4151b);
            }
            this.f4154e.m36024a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$d */
    /* loaded from: classes.dex */
    public class C2943d implements C2437e.AbstractC2439b {

        /* renamed from: a */
        final /* synthetic */ Animator f4156a;

        C2943d(Animator animator) {
            this.f4156a = animator;
        }

        @Override // androidx.core.p018os.C2437e.AbstractC2439b
        public void onCancel() {
            this.f4156a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$e  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC2944e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4158a;

        /* renamed from: b */
        final /* synthetic */ View f4159b;

        /* renamed from: c */
        final /* synthetic */ C2951k f4160c;

        /* renamed from: androidx.fragment.app.c$e$a */
        /* loaded from: classes.dex */
        class RunnableC2945a implements Runnable {
            RunnableC2945a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                animationAnimation$AnimationListenerC2944e eVar = animationAnimation$AnimationListenerC2944e.this;
                eVar.f4158a.endViewTransition(eVar.f4159b);
                animationAnimation$AnimationListenerC2944e.this.f4160c.m36024a();
            }
        }

        animationAnimation$AnimationListenerC2944e(ViewGroup viewGroup, View view, C2951k kVar) {
            this.f4158a = viewGroup;
            this.f4159b = view;
            this.f4160c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4158a.post(new RunnableC2945a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$f */
    /* loaded from: classes.dex */
    public class C2946f implements C2437e.AbstractC2439b {

        /* renamed from: a */
        final /* synthetic */ View f4163a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4164b;

        /* renamed from: c */
        final /* synthetic */ C2951k f4165c;

        C2946f(View view, ViewGroup viewGroup, C2951k kVar) {
            this.f4163a = view;
            this.f4164b = viewGroup;
            this.f4165c = kVar;
        }

        @Override // androidx.core.p018os.C2437e.AbstractC2439b
        public void onCancel() {
            this.f4163a.clearAnimation();
            this.f4164b.endViewTransition(this.f4163a);
            this.f4165c.m36024a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$g */
    /* loaded from: classes.dex */
    public class RunnableC2947g implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractC2997s.C3002e f4167k;

        /* renamed from: l */
        final /* synthetic */ AbstractC2997s.C3002e f4168l;

        /* renamed from: m */
        final /* synthetic */ boolean f4169m;

        /* renamed from: n */
        final /* synthetic */ C2094a f4170n;

        RunnableC2947g(AbstractC2997s.C3002e eVar, AbstractC2997s.C3002e eVar2, boolean z, C2094a aVar) {
            this.f4167k = eVar;
            this.f4168l = eVar2;
            this.f4169m = z;
            this.f4170n = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2977o.m35922f(this.f4167k.m35862f(), this.f4168l.m35862f(), this.f4169m, this.f4170n, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$h */
    /* loaded from: classes.dex */
    public class RunnableC2948h implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractC2992q f4172k;

        /* renamed from: l */
        final /* synthetic */ View f4173l;

        /* renamed from: m */
        final /* synthetic */ Rect f4174m;

        RunnableC2948h(AbstractC2992q qVar, View view, Rect rect) {
            this.f4172k = qVar;
            this.f4173l = view;
            this.f4174m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4172k.m35893k(this.f4173l, this.f4174m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$i */
    /* loaded from: classes.dex */
    public class RunnableC2949i implements Runnable {

        /* renamed from: k */
        final /* synthetic */ ArrayList f4176k;

        RunnableC2949i(ArrayList arrayList) {
            this.f4176k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2977o.m35929B(this.f4176k, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$j */
    /* loaded from: classes.dex */
    public class RunnableC2950j implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C2953m f4178k;

        RunnableC2950j(C2953m mVar) {
            this.f4178k = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4178k.m36024a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$k */
    /* loaded from: classes.dex */
    public static class C2951k extends C2952l {

        /* renamed from: c */
        private boolean f4180c;

        /* renamed from: d */
        private boolean f4181d = false;

        /* renamed from: e */
        private C2954d.C0057d f4182e;

        C2951k(AbstractC2997s.C3002e eVar, C2437e eVar2, boolean z) {
            super(eVar, eVar2);
            this.f4180c = z;
        }

        /* renamed from: e */
        C2954d.C0057d m36025e(Context context) {
            boolean z;
            if (this.f4181d) {
                return this.f4182e;
            }
            Fragment f = m36023b().m35862f();
            if (m36023b().m35863e() == AbstractC2997s.C3002e.EnumC3005c.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            C2954d.C0057d c = C2954d.m36012c(context, f, z, this.f4180c);
            this.f4182e = c;
            this.f4181d = true;
            return c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$l */
    /* loaded from: classes.dex */
    public static class C2952l {

        /* renamed from: a */
        private final AbstractC2997s.C3002e f4183a;

        /* renamed from: b */
        private final C2437e f4184b;

        C2952l(AbstractC2997s.C3002e eVar, C2437e eVar2) {
            this.f4183a = eVar;
            this.f4184b = eVar2;
        }

        /* renamed from: a */
        void m36024a() {
            this.f4183a.m35864d(this.f4184b);
        }

        /* renamed from: b */
        AbstractC2997s.C3002e m36023b() {
            return this.f4183a;
        }

        /* renamed from: c */
        C2437e m36022c() {
            return this.f4184b;
        }

        /* renamed from: d */
        boolean m36021d() {
            AbstractC2997s.C3002e.EnumC3005c cVar;
            AbstractC2997s.C3002e.EnumC3005c c = AbstractC2997s.C3002e.EnumC3005c.m35853c(this.f4183a.m35862f().mView);
            AbstractC2997s.C3002e.EnumC3005c e = this.f4183a.m35863e();
            if (c == e || (c != (cVar = AbstractC2997s.C3002e.EnumC3005c.VISIBLE) && e != cVar)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$m */
    /* loaded from: classes.dex */
    public static class C2953m extends C2952l {

        /* renamed from: c */
        private final Object f4185c;

        /* renamed from: d */
        private final boolean f4186d;

        /* renamed from: e */
        private final Object f4187e;

        C2953m(AbstractC2997s.C3002e eVar, C2437e eVar2, boolean z, boolean z2) {
            super(eVar, eVar2);
            Object obj;
            Object obj2;
            boolean z3;
            if (eVar.m35863e() == AbstractC2997s.C3002e.EnumC3005c.VISIBLE) {
                if (z) {
                    obj2 = eVar.m35862f().getReenterTransition();
                } else {
                    obj2 = eVar.m35862f().getEnterTransition();
                }
                this.f4185c = obj2;
                if (z) {
                    z3 = eVar.m35862f().getAllowReturnTransitionOverlap();
                } else {
                    z3 = eVar.m35862f().getAllowEnterTransitionOverlap();
                }
                this.f4186d = z3;
            } else {
                if (z) {
                    obj = eVar.m35862f().getReturnTransition();
                } else {
                    obj = eVar.m35862f().getExitTransition();
                }
                this.f4185c = obj;
                this.f4186d = true;
            }
            if (!z2) {
                this.f4187e = null;
            } else if (z) {
                this.f4187e = eVar.m35862f().getSharedElementReturnTransition();
            } else {
                this.f4187e = eVar.m35862f().getSharedElementEnterTransition();
            }
        }

        /* renamed from: f */
        private AbstractC2992q m36019f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC2992q qVar = C2977o.f4254b;
            if (qVar != null && qVar.mo34901e(obj)) {
                return qVar;
            }
            AbstractC2992q qVar2 = C2977o.f4255c;
            if (qVar2 != null && qVar2.mo34901e(obj)) {
                return qVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m36023b().m35862f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        AbstractC2992q m36020e() {
            AbstractC2992q f = m36019f(this.f4185c);
            AbstractC2992q f2 = m36019f(this.f4187e);
            if (f != null && f2 != null && f != f2) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m36023b().m35862f() + " returned Transition " + this.f4185c + " which uses a different Transition  type than its shared element transition " + this.f4187e);
            } else if (f != null) {
                return f;
            } else {
                return f2;
            }
        }

        /* renamed from: g */
        public Object m36018g() {
            return this.f4187e;
        }

        /* renamed from: h */
        Object m36017h() {
            return this.f4185c;
        }

        /* renamed from: i */
        public boolean m36016i() {
            return this.f4187e != null;
        }

        /* renamed from: j */
        boolean m36015j() {
            return this.f4186d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2940c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m36027w(List<C2951k> list, List<AbstractC2997s.C3002e> list2, boolean z, Map<AbstractC2997s.C3002e, Boolean> map) {
        boolean z2;
        ViewGroup m = m35873m();
        Context context = m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (C2951k kVar : list) {
            if (kVar.m36021d()) {
                kVar.m36024a();
            } else {
                C2954d.C0057d e = kVar.m36025e(context);
                if (e == null) {
                    kVar.m36024a();
                } else {
                    Animator animator = e.f4200b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        AbstractC2997s.C3002e b = kVar.m36023b();
                        Fragment f = b.m35862f();
                        if (Boolean.TRUE.equals(map.get(b))) {
                            if (FragmentManager.m36195H0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f + " as this Fragment was involved in a Transition.");
                            }
                            kVar.m36024a();
                        } else {
                            if (b.m35863e() == AbstractC2997s.C3002e.EnumC3005c.GONE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                list2.remove(b);
                            }
                            View view = f.mView;
                            m.startViewTransition(view);
                            animator.addListener(new C0056c(m, view, z2, b, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.m36022c().m37743c(new C2943d(animator));
                            z3 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2951k kVar2 = (C2951k) it.next();
            AbstractC2997s.C3002e b2 = kVar2.m36023b();
            Fragment f2 = b2.m35862f();
            if (z) {
                if (FragmentManager.m36195H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f2 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.m36024a();
            } else if (z3) {
                if (FragmentManager.m36195H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f2 + " as Animations cannot run alongside Animators.");
                }
                kVar2.m36024a();
            } else {
                View view2 = f2.mView;
                Animation animation = (Animation) C2517g.m37588g(((C2954d.C0057d) C2517g.m37588g(kVar2.m36025e(context))).f4199a);
                if (b2.m35863e() != AbstractC2997s.C3002e.EnumC3005c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m36024a();
                } else {
                    m.startViewTransition(view2);
                    C2954d.RunnableC2959e eVar = new C2954d.RunnableC2959e(animation, m, view2);
                    eVar.setAnimationListener(new animationAnimation$AnimationListenerC2944e(m, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m36022c().m37743c(new C2946f(view2, m, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* renamed from: x */
    private Map<AbstractC2997s.C3002e, Boolean> m36026x(List<C2953m> list, List<AbstractC2997s.C3002e> list2, boolean z, AbstractC2997s.C3002e eVar, AbstractC2997s.C3002e eVar2) {
        AbstractC2997s.C3002e eVar3;
        Object obj;
        Object obj2;
        SharedElementCallback sharedElementCallback;
        SharedElementCallback sharedElementCallback2;
        ArrayList<String> arrayList;
        View view;
        View view2;
        String q;
        C2940c cVar = this;
        boolean z2 = z;
        AbstractC2997s.C3002e eVar4 = eVar;
        AbstractC2997s.C3002e eVar5 = eVar2;
        HashMap hashMap = new HashMap();
        AbstractC2992q qVar = 0;
        for (C2953m mVar : list) {
            if (!mVar.m36021d()) {
                AbstractC2992q e = mVar.m36020e();
                if (qVar == null) {
                    qVar = e;
                } else if (!(e == null || qVar == e)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m36023b().m35862f() + " returned Transition " + mVar.m36017h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (qVar == null) {
            for (C2953m mVar2 : list) {
                hashMap.put(mVar2.m36023b(), Boolean.FALSE);
                mVar2.m36024a();
            }
            return hashMap;
        }
        View view3 = new View(m35873m().getContext());
        Rect rect = new Rect();
        ArrayList<View> arrayList2 = new ArrayList<>();
        ArrayList<View> arrayList3 = new ArrayList<>();
        C2094a aVar = new C2094a();
        Object obj3 = null;
        View view4 = null;
        boolean z3 = false;
        for (C2953m mVar3 : list) {
            if (!mVar3.m36016i() || eVar4 == null || eVar5 == null) {
                aVar = aVar;
                arrayList3 = arrayList3;
                cVar = cVar;
                eVar4 = eVar4;
                arrayList2 = arrayList2;
                rect = rect;
                qVar = qVar;
                eVar5 = eVar5;
                view3 = view3;
                view4 = view4;
            } else {
                Object B = qVar.mo34906B(qVar.mo34900g(mVar3.m36018g()));
                ArrayList<String> sharedElementSourceNames = eVar2.m35862f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.m35862f().getSharedElementSourceNames();
                int i = 0;
                for (ArrayList<String> sharedElementTargetNames = eVar.m35862f().getSharedElementTargetNames(); i < sharedElementTargetNames.size(); sharedElementTargetNames = sharedElementTargetNames) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.m35862f().getSharedElementTargetNames();
                if (!z2) {
                    sharedElementCallback2 = eVar.m35862f().getExitTransitionCallback();
                    sharedElementCallback = eVar2.m35862f().getEnterTransitionCallback();
                } else {
                    sharedElementCallback2 = eVar.m35862f().getEnterTransitionCallback();
                    sharedElementCallback = eVar2.m35862f().getExitTransitionCallback();
                }
                int i2 = 0;
                for (int size = sharedElementSourceNames.size(); i2 < size; size = size) {
                    aVar.put(sharedElementSourceNames.get(i2), sharedElementTargetNames2.get(i2));
                    i2++;
                }
                C2094a aVar2 = new C2094a();
                cVar.m36029u(aVar2, eVar.m35862f().mView);
                aVar2.m39035p(sharedElementSourceNames);
                if (sharedElementCallback2 != null) {
                    sharedElementCallback2.m38351d(sharedElementSourceNames, aVar2);
                    for (int size2 = sharedElementSourceNames.size() - 1; size2 >= 0; size2--) {
                        String str = sharedElementSourceNames.get(size2);
                        View view5 = (View) aVar2.get(str);
                        if (view5 == null) {
                            aVar.remove(str);
                            sharedElementSourceNames = sharedElementSourceNames;
                        } else {
                            sharedElementSourceNames = sharedElementSourceNames;
                            if (!str.equals(C2733w0.m37045K(view5))) {
                                aVar.put(C2733w0.m37045K(view5), (String) aVar.remove(str));
                            }
                        }
                    }
                    arrayList = sharedElementSourceNames;
                } else {
                    arrayList = sharedElementSourceNames;
                    aVar.m39035p(aVar2.keySet());
                }
                C2094a aVar3 = new C2094a();
                cVar.m36029u(aVar3, eVar2.m35862f().mView);
                aVar3.m39035p(sharedElementTargetNames2);
                aVar3.m39035p(aVar.values());
                if (sharedElementCallback != null) {
                    sharedElementCallback.m38351d(sharedElementTargetNames2, aVar3);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view6 = (View) aVar3.get(str2);
                        if (view6 == null) {
                            String q2 = C2977o.m35911q(aVar, str2);
                            if (q2 != null) {
                                aVar.remove(q2);
                            }
                        } else if (!str2.equals(C2733w0.m37045K(view6)) && (q = C2977o.m35911q(aVar, str2)) != null) {
                            aVar.put(q, C2733w0.m37045K(view6));
                        }
                    }
                } else {
                    C2977o.m35903y(aVar, aVar3);
                }
                cVar.m36028v(aVar2, aVar.keySet());
                cVar.m36028v(aVar3, aVar.values());
                if (aVar.isEmpty()) {
                    arrayList2.clear();
                    arrayList3.clear();
                    eVar4 = eVar;
                    aVar = aVar;
                    arrayList3 = arrayList3;
                    cVar = cVar;
                    arrayList2 = arrayList2;
                    rect = rect;
                    view3 = view3;
                    qVar = qVar;
                    view4 = view4;
                    obj3 = null;
                    eVar5 = eVar2;
                } else {
                    C2977o.m35922f(eVar2.m35862f(), eVar.m35862f(), z2, aVar2, true);
                    aVar = aVar;
                    ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(m35873m(), new RunnableC2947g(eVar2, eVar, z, aVar3));
                    arrayList2.addAll(aVar2.values());
                    if (!arrayList.isEmpty()) {
                        View view7 = (View) aVar2.get(arrayList.get(0));
                        qVar.mo34892v(B, view7);
                        view4 = view7;
                    } else {
                        view4 = view4;
                    }
                    arrayList3 = arrayList3;
                    arrayList3.addAll(aVar3.values());
                    if (sharedElementTargetNames2.isEmpty() || (view2 = (View) aVar3.get(sharedElementTargetNames2.get(0))) == null) {
                        cVar = this;
                        view = view3;
                    } else {
                        cVar = this;
                        ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(m35873m(), new RunnableC2948h(qVar, view2, rect));
                        view = view3;
                        z3 = true;
                    }
                    qVar.mo34891z(B, view, arrayList2);
                    arrayList2 = arrayList2;
                    rect = rect;
                    view3 = view;
                    qVar = qVar;
                    qVar.mo34894t(B, null, null, null, null, B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar4 = eVar;
                    hashMap = hashMap;
                    hashMap.put(eVar4, bool);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool);
                    obj3 = B;
                }
            }
            z2 = z;
        }
        View view8 = view4;
        ArrayList<View> arrayList4 = arrayList3;
        ArrayList<View> arrayList5 = arrayList2;
        AbstractC2997s.C3002e eVar6 = eVar5;
        View view9 = view3;
        ArrayList arrayList6 = new ArrayList();
        Iterator<C2953m> it = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it.hasNext()) {
            C2953m next = it.next();
            if (next.m36021d()) {
                hashMap.put(next.m36023b(), Boolean.FALSE);
                next.m36024a();
            } else {
                Object g = qVar.mo34900g(next.m36017h());
                AbstractC2997s.C3002e b = next.m36023b();
                boolean z4 = obj3 != null && (b == eVar4 || b == eVar6);
                if (g == null) {
                    if (!z4) {
                        hashMap.put(b, Boolean.FALSE);
                        next.m36024a();
                    }
                    arrayList4 = arrayList4;
                    arrayList5 = arrayList5;
                    it = it;
                    view9 = view9;
                    obj4 = obj4;
                    eVar6 = eVar6;
                    view8 = view8;
                } else {
                    it = it;
                    ArrayList<View> arrayList7 = new ArrayList<>();
                    cVar.m36030t(arrayList7, b.m35862f().mView);
                    if (z4) {
                        if (b == eVar4) {
                            arrayList7.removeAll(arrayList5);
                        } else {
                            arrayList7.removeAll(arrayList4);
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        qVar.mo34904a(g, view9);
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        view9 = view9;
                        eVar3 = b;
                        obj2 = obj5;
                        eVar6 = eVar6;
                        obj = obj4;
                    } else {
                        qVar.mo34903b(g, arrayList7);
                        view9 = view9;
                        obj = obj4;
                        arrayList5 = arrayList5;
                        obj2 = obj5;
                        arrayList4 = arrayList4;
                        eVar6 = eVar6;
                        qVar.mo34894t(g, g, arrayList7, null, null, null, null);
                        if (b.m35863e() == AbstractC2997s.C3002e.EnumC3005c.GONE) {
                            eVar3 = b;
                            list2.remove(eVar3);
                            ArrayList<View> arrayList8 = new ArrayList<>(arrayList7);
                            arrayList8.remove(eVar3.m35862f().mView);
                            qVar.mo34895r(g, eVar3.m35862f().mView, arrayList8);
                            ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(m35873m(), new RunnableC2949i(arrayList7));
                        } else {
                            eVar3 = b;
                        }
                    }
                    if (eVar3.m35863e() == AbstractC2997s.C3002e.EnumC3005c.VISIBLE) {
                        arrayList6.addAll(arrayList7);
                        if (z3) {
                            qVar.mo34893u(g, rect);
                        }
                        view8 = view8;
                    } else {
                        view8 = view8;
                        qVar.mo34892v(g, view8);
                    }
                    hashMap.put(eVar3, Boolean.TRUE);
                    if (next.m36015j()) {
                        obj5 = qVar.mo34898n(obj2, g, null);
                        obj4 = obj;
                    } else {
                        obj4 = qVar.mo34898n(obj, g, null);
                        obj5 = obj2;
                    }
                }
            }
        }
        Object m = qVar.mo34899m(obj5, obj4, obj3);
        for (C2953m mVar4 : list) {
            if (!mVar4.m36021d()) {
                Object h = mVar4.m36017h();
                AbstractC2997s.C3002e b2 = mVar4.m36023b();
                boolean z5 = obj3 != null && (b2 == eVar4 || b2 == eVar6);
                if (h != null || z5) {
                    if (!C2733w0.m37029U(m35873m())) {
                        if (FragmentManager.m36195H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m35873m() + " has not been laid out. Completing operation " + b2);
                        }
                        mVar4.m36024a();
                    } else {
                        qVar.mo35889w(mVar4.m36023b().m35862f(), m, mVar4.m36022c(), new RunnableC2950j(mVar4));
                    }
                }
            }
        }
        if (!C2733w0.m37029U(m35873m())) {
            return hashMap;
        }
        C2977o.m35929B(arrayList6, 4);
        ArrayList<String> o = qVar.m35891o(arrayList4);
        qVar.mo34902c(m35873m(), m);
        qVar.m35887y(m35873m(), arrayList5, arrayList4, o, aVar);
        C2977o.m35929B(arrayList6, 0);
        qVar.mo34907A(obj3, arrayList5, arrayList4);
        return hashMap;
    }

    @Override // androidx.fragment.app.AbstractC2997s
    /* renamed from: f */
    void mo35880f(List<AbstractC2997s.C3002e> list, boolean z) {
        AbstractC2997s.C3002e eVar = null;
        AbstractC2997s.C3002e eVar2 = null;
        for (AbstractC2997s.C3002e eVar3 : list) {
            AbstractC2997s.C3002e.EnumC3005c c = AbstractC2997s.C3002e.EnumC3005c.m35853c(eVar3.m35862f().mView);
            int i = C2941a.f4146a[eVar3.m35863e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (c == AbstractC2997s.C3002e.EnumC3005c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i == 4 && c != AbstractC2997s.C3002e.EnumC3005c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<AbstractC2997s.C3002e> arrayList3 = new ArrayList(list);
        for (AbstractC2997s.C3002e eVar4 : list) {
            C2437e eVar5 = new C2437e();
            eVar4.m35858j(eVar5);
            arrayList.add(new C2951k(eVar4, eVar5, z));
            C2437e eVar6 = new C2437e();
            eVar4.m35858j(eVar6);
            boolean z2 = false;
            if (z) {
                if (eVar4 != eVar) {
                    arrayList2.add(new C2953m(eVar4, eVar6, z, z2));
                    eVar4.m35867a(new RunnableC2942b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new C2953m(eVar4, eVar6, z, z2));
                eVar4.m35867a(new RunnableC2942b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new C2953m(eVar4, eVar6, z, z2));
                    eVar4.m35867a(new RunnableC2942b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new C2953m(eVar4, eVar6, z, z2));
                eVar4.m35867a(new RunnableC2942b(arrayList3, eVar4));
            }
        }
        Map<AbstractC2997s.C3002e, Boolean> x = m36026x(arrayList2, arrayList3, z, eVar, eVar2);
        m36027w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (AbstractC2997s.C3002e eVar7 : arrayList3) {
            m36031s(eVar7);
        }
        arrayList3.clear();
    }

    /* renamed from: s */
    void m36031s(AbstractC2997s.C3002e eVar) {
        eVar.m35863e().m35855a(eVar.m35862f().mView);
    }

    /* renamed from: t */
    void m36030t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!C2649j2.m37230a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        m36030t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: u */
    void m36029u(Map<String, View> map, View view) {
        String K = C2733w0.m37045K(view);
        if (K != null) {
            map.put(K, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m36029u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    void m36028v(C2094a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C2733w0.m37045K(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
