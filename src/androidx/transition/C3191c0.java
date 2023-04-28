package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.c0 */
/* loaded from: classes.dex */
public class C3191c0 extends Transition {

    /* renamed from: m */
    int f4985m;

    /* renamed from: k */
    private ArrayList<Transition> f4983k = new ArrayList<>();

    /* renamed from: l */
    private boolean f4984l = true;

    /* renamed from: n */
    boolean f4986n = false;

    /* renamed from: o */
    private int f4987o = 0;

    /* renamed from: androidx.transition.c0$a */
    /* loaded from: classes.dex */
    class C3192a extends C3282z {

        /* renamed from: a */
        final /* synthetic */ Transition f4988a;

        C3192a(Transition transition) {
            this.f4988a = transition;
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            this.f4988a.runAnimators();
            transition.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.c0$b */
    /* loaded from: classes.dex */
    public static class C3193b extends C3282z {

        /* renamed from: a */
        C3191c0 f4990a;

        C3193b(C3191c0 c0Var) {
            this.f4990a = c0Var;
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            C3191c0 c0Var = this.f4990a;
            int i = c0Var.f4985m - 1;
            c0Var.f4985m = i;
            if (i == 0) {
                c0Var.f4986n = false;
                c0Var.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionStart(Transition transition) {
            C3191c0 c0Var = this.f4990a;
            if (!c0Var.f4986n) {
                c0Var.start();
                this.f4990a.f4986n = true;
            }
        }
    }

    /* renamed from: j */
    private void m34967j(Transition transition) {
        this.f4983k.add(transition);
        transition.mParent = this;
    }

    /* renamed from: x */
    private void m34954x() {
        C3193b bVar = new C3193b(this);
        Iterator<Transition> it = this.f4983k.iterator();
        while (it.hasNext()) {
            it.next().addListener(bVar);
        }
        this.f4985m = this.f4983k.size();
    }

    /* renamed from: a */
    public C3191c0 addListener(Transition.AbstractC3182g gVar) {
        return (C3191c0) super.addListener(gVar);
    }

    /* renamed from: c */
    public C3191c0 addTarget(int i) {
        for (int i2 = 0; i2 < this.f4983k.size(); i2++) {
            this.f4983k.get(i2).addTarget(i);
        }
        return (C3191c0) super.addTarget(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    public void cancel() {
        super.cancel();
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            this.f4983k.get(i).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(C3215f0 f0Var) {
        if (isValidTarget(f0Var.f5053b)) {
            Iterator<Transition> it = this.f4983k.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(f0Var.f5053b)) {
                    next.captureEndValues(f0Var);
                    f0Var.f5054c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public void capturePropagationValues(C3215f0 f0Var) {
        super.capturePropagationValues(f0Var);
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            this.f4983k.get(i).capturePropagationValues(f0Var);
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C3215f0 f0Var) {
        if (isValidTarget(f0Var.f5053b)) {
            Iterator<Transition> it = this.f4983k.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(f0Var.f5053b)) {
                    next.captureStartValues(f0Var);
                    f0Var.f5054c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    public void createAnimators(ViewGroup viewGroup, C3224g0 g0Var, C3224g0 g0Var2, ArrayList<C3215f0> arrayList, ArrayList<C3215f0> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f4983k.get(i);
            if (startDelay > 0 && (this.f4984l || i == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, g0Var, g0Var2, arrayList, arrayList2);
        }
    }

    /* renamed from: d */
    public C3191c0 addTarget(View view) {
        for (int i = 0; i < this.f4983k.size(); i++) {
            this.f4983k.get(i).addTarget(view);
        }
        return (C3191c0) super.addTarget(view);
    }

    /* renamed from: e */
    public C3191c0 addTarget(Class<?> cls) {
        for (int i = 0; i < this.f4983k.size(); i++) {
            this.f4983k.get(i).addTarget(cls);
        }
        return (C3191c0) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.f4983k.size(); i++) {
            this.f4983k.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    /* renamed from: f */
    public C3191c0 addTarget(String str) {
        for (int i = 0; i < this.f4983k.size(); i++) {
            this.f4983k.get(i).addTarget(str);
        }
        return (C3191c0) super.addTarget(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            this.f4983k.get(i).forceToEnd(viewGroup);
        }
    }

    /* renamed from: h */
    public C3191c0 m34968h(Transition transition) {
        m34967j(transition);
        long j = this.mDuration;
        if (j >= 0) {
            transition.setDuration(j);
        }
        if ((this.f4987o & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.f4987o & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.f4987o & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.f4987o & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    /* renamed from: k */
    public Transition m34966k(int i) {
        if (i < 0 || i >= this.f4983k.size()) {
            return null;
        }
        return this.f4983k.get(i);
    }

    /* renamed from: l */
    public int m34965l() {
        return this.f4983k.size();
    }

    /* renamed from: m */
    public C3191c0 removeListener(Transition.AbstractC3182g gVar) {
        return (C3191c0) super.removeListener(gVar);
    }

    /* renamed from: n */
    public C3191c0 removeTarget(int i) {
        for (int i2 = 0; i2 < this.f4983k.size(); i2++) {
            this.f4983k.get(i2).removeTarget(i);
        }
        return (C3191c0) super.removeTarget(i);
    }

    /* renamed from: o */
    public C3191c0 removeTarget(View view) {
        for (int i = 0; i < this.f4983k.size(); i++) {
            this.f4983k.get(i).removeTarget(view);
        }
        return (C3191c0) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    public void pause(View view) {
        super.pause(view);
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            this.f4983k.get(i).pause(view);
        }
    }

    /* renamed from: q */
    public C3191c0 removeTarget(Class<?> cls) {
        for (int i = 0; i < this.f4983k.size(); i++) {
            this.f4983k.get(i).removeTarget(cls);
        }
        return (C3191c0) super.removeTarget(cls);
    }

    /* renamed from: r */
    public C3191c0 removeTarget(String str) {
        for (int i = 0; i < this.f4983k.size(); i++) {
            this.f4983k.get(i).removeTarget(str);
        }
        return (C3191c0) super.removeTarget(str);
    }

    @Override // androidx.transition.Transition
    public void resume(View view) {
        super.resume(view);
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            this.f4983k.get(i).resume(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    public void runAnimators() {
        if (this.f4983k.isEmpty()) {
            start();
            end();
            return;
        }
        m34954x();
        if (!this.f4984l) {
            for (int i = 1; i < this.f4983k.size(); i++) {
                this.f4983k.get(i - 1).addListener(new C3192a(this.f4983k.get(i)));
            }
            Transition transition = this.f4983k.get(0);
            if (transition != null) {
                transition.runAnimators();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.f4983k.iterator();
        while (it.hasNext()) {
            it.next().runAnimators();
        }
    }

    /* renamed from: s */
    public C3191c0 setDuration(long j) {
        ArrayList<Transition> arrayList;
        super.setDuration(j);
        if (this.mDuration >= 0 && (arrayList = this.f4983k) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4983k.get(i).setDuration(j);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            this.f4983k.get(i).setCanRemoveViews(z);
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(Transition.AbstractC3181f fVar) {
        super.setEpicenterCallback(fVar);
        this.f4987o |= 8;
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            this.f4983k.get(i).setEpicenterCallback(fVar);
        }
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(AbstractC3257r rVar) {
        super.setPathMotion(rVar);
        this.f4987o |= 4;
        if (this.f4983k != null) {
            for (int i = 0; i < this.f4983k.size(); i++) {
                this.f4983k.get(i).setPathMotion(rVar);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(AbstractC3188b0 b0Var) {
        super.setPropagation(b0Var);
        this.f4987o |= 2;
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            this.f4983k.get(i).setPropagation(b0Var);
        }
    }

    /* renamed from: t */
    public C3191c0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f4987o |= 1;
        ArrayList<Transition> arrayList = this.f4983k;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4983k.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (C3191c0) super.setInterpolator(timeInterpolator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public String toString(String str) {
        String transition = super.toString(str);
        for (int i = 0; i < this.f4983k.size(); i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(transition);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb2.append(this.f4983k.get(i).toString(str + "  "));
            transition = sb2.toString();
        }
        return transition;
    }

    /* renamed from: u */
    public C3191c0 m34957u(int i) {
        if (i == 0) {
            this.f4984l = true;
        } else if (i == 1) {
            this.f4984l = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C3191c0 setSceneRoot(ViewGroup viewGroup) {
        super.setSceneRoot(viewGroup);
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            this.f4983k.get(i).setSceneRoot(viewGroup);
        }
        return this;
    }

    /* renamed from: w */
    public C3191c0 setStartDelay(long j) {
        return (C3191c0) super.setStartDelay(j);
    }

    @Override // androidx.transition.Transition
    public Transition clone() {
        C3191c0 c0Var = (C3191c0) super.clone();
        c0Var.f4983k = new ArrayList<>();
        int size = this.f4983k.size();
        for (int i = 0; i < size; i++) {
            c0Var.m34967j(this.f4983k.get(i).clone());
        }
        return c0Var;
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.f4983k.size(); i++) {
            this.f4983k.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f4983k.size(); i2++) {
            this.f4983k.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(Class<?> cls, boolean z) {
        for (int i = 0; i < this.f4983k.size(); i++) {
            this.f4983k.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }
}
