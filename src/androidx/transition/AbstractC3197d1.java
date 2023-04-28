package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C2379l;
import androidx.transition.Transition;

/* renamed from: androidx.transition.d1 */
/* loaded from: classes.dex */
public abstract class AbstractC3197d1 extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode = 3;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.d1$a */
    /* loaded from: classes.dex */
    public class C3198a extends C3282z {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4993a;

        /* renamed from: b */
        final /* synthetic */ View f4994b;

        /* renamed from: c */
        final /* synthetic */ View f4995c;

        C3198a(ViewGroup viewGroup, View view, View view2) {
            this.f4993a = viewGroup;
            this.f4994b = view;
            this.f4995c = view2;
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            this.f4995c.setTag(C3261t.f5147d, null);
            C3244m0.m34872b(this.f4993a).mo34888d(this.f4994b);
            transition.removeListener(this);
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionPause(Transition transition) {
            C3244m0.m34872b(this.f4993a).mo34888d(this.f4994b);
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionResume(Transition transition) {
            if (this.f4994b.getParent() == null) {
                C3244m0.m34872b(this.f4993a).mo34889c(this.f4994b);
            } else {
                AbstractC3197d1.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.d1$b */
    /* loaded from: classes.dex */
    public static class C3199b extends AnimatorListenerAdapter implements Transition.AbstractC3182g {

        /* renamed from: a */
        private final View f4997a;

        /* renamed from: b */
        private final int f4998b;

        /* renamed from: c */
        private final ViewGroup f4999c;

        /* renamed from: d */
        private final boolean f5000d;

        /* renamed from: e */
        private boolean f5001e;

        /* renamed from: f */
        boolean f5002f = false;

        C3199b(View view, int i, boolean z) {
            this.f4997a = view;
            this.f4998b = i;
            this.f4999c = (ViewGroup) view.getParent();
            this.f5000d = z;
            m34949b(true);
        }

        /* renamed from: a */
        private void m34950a() {
            if (!this.f5002f) {
                C3252p0.m34848i(this.f4997a, this.f4998b);
                ViewGroup viewGroup = this.f4999c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m34949b(false);
        }

        /* renamed from: b */
        private void m34949b(boolean z) {
            ViewGroup viewGroup;
            if (this.f5000d && this.f5001e != z && (viewGroup = this.f4999c) != null) {
                this.f5001e = z;
                C3244m0.m34870d(viewGroup, z);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5002f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m34950a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f5002f) {
                C3252p0.m34848i(this.f4997a, this.f4998b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f5002f) {
                C3252p0.m34848i(this.f4997a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            m34950a();
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionPause(Transition transition) {
            m34949b(false);
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionResume(Transition transition) {
            m34949b(true);
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.d1$c */
    /* loaded from: classes.dex */
    public static class C3200c {

        /* renamed from: a */
        boolean f5003a;

        /* renamed from: b */
        boolean f5004b;

        /* renamed from: c */
        int f5005c;

        /* renamed from: d */
        int f5006d;

        /* renamed from: e */
        ViewGroup f5007e;

        /* renamed from: f */
        ViewGroup f5008f;

        C3200c() {
        }
    }

    public AbstractC3197d1() {
    }

    private void captureValues(C3215f0 f0Var) {
        f0Var.f5052a.put(PROPNAME_VISIBILITY, Integer.valueOf(f0Var.f5053b.getVisibility()));
        f0Var.f5052a.put(PROPNAME_PARENT, f0Var.f5053b.getParent());
        int[] iArr = new int[2];
        f0Var.f5053b.getLocationOnScreen(iArr);
        f0Var.f5052a.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    private C3200c getVisibilityChangeInfo(C3215f0 f0Var, C3215f0 f0Var2) {
        C3200c cVar = new C3200c();
        cVar.f5003a = false;
        cVar.f5004b = false;
        if (f0Var == null || !f0Var.f5052a.containsKey(PROPNAME_VISIBILITY)) {
            cVar.f5005c = -1;
            cVar.f5007e = null;
        } else {
            cVar.f5005c = ((Integer) f0Var.f5052a.get(PROPNAME_VISIBILITY)).intValue();
            cVar.f5007e = (ViewGroup) f0Var.f5052a.get(PROPNAME_PARENT);
        }
        if (f0Var2 == null || !f0Var2.f5052a.containsKey(PROPNAME_VISIBILITY)) {
            cVar.f5006d = -1;
            cVar.f5008f = null;
        } else {
            cVar.f5006d = ((Integer) f0Var2.f5052a.get(PROPNAME_VISIBILITY)).intValue();
            cVar.f5008f = (ViewGroup) f0Var2.f5052a.get(PROPNAME_PARENT);
        }
        if (f0Var != null && f0Var2 != null) {
            int i = cVar.f5005c;
            int i2 = cVar.f5006d;
            if (i == i2 && cVar.f5007e == cVar.f5008f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.f5004b = false;
                    cVar.f5003a = true;
                } else if (i2 == 0) {
                    cVar.f5004b = true;
                    cVar.f5003a = true;
                }
            } else if (cVar.f5008f == null) {
                cVar.f5004b = false;
                cVar.f5003a = true;
            } else if (cVar.f5007e == null) {
                cVar.f5004b = true;
                cVar.f5003a = true;
            }
        } else if (f0Var == null && cVar.f5006d == 0) {
            cVar.f5004b = true;
            cVar.f5003a = true;
        } else if (f0Var2 == null && cVar.f5005c == 0) {
            cVar.f5004b = false;
            cVar.f5003a = true;
        }
        return cVar;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(C3215f0 f0Var) {
        captureValues(f0Var);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C3215f0 f0Var) {
        captureValues(f0Var);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C3215f0 f0Var, C3215f0 f0Var2) {
        C3200c visibilityChangeInfo = getVisibilityChangeInfo(f0Var, f0Var2);
        if (!visibilityChangeInfo.f5003a) {
            return null;
        }
        if (visibilityChangeInfo.f5007e == null && visibilityChangeInfo.f5008f == null) {
            return null;
        }
        if (visibilityChangeInfo.f5004b) {
            return onAppear(viewGroup, f0Var, visibilityChangeInfo.f5005c, f0Var2, visibilityChangeInfo.f5006d);
        }
        return onDisappear(viewGroup, f0Var, visibilityChangeInfo.f5005c, f0Var2, visibilityChangeInfo.f5006d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(C3215f0 f0Var, C3215f0 f0Var2) {
        if (f0Var == null && f0Var2 == null) {
            return false;
        }
        if (f0Var != null && f0Var2 != null && f0Var2.f5052a.containsKey(PROPNAME_VISIBILITY) != f0Var.f5052a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        C3200c visibilityChangeInfo = getVisibilityChangeInfo(f0Var, f0Var2);
        if (!visibilityChangeInfo.f5003a) {
            return false;
        }
        if (visibilityChangeInfo.f5005c == 0 || visibilityChangeInfo.f5006d == 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible(C3215f0 f0Var) {
        if (f0Var == null) {
            return false;
        }
        int intValue = ((Integer) f0Var.f5052a.get(PROPNAME_VISIBILITY)).intValue();
        View view = (View) f0Var.f5052a.get(PROPNAME_PARENT);
        if (intValue != 0 || view == null) {
            return false;
        }
        return true;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, C3215f0 f0Var, C3215f0 f0Var2) {
        return null;
    }

    public Animator onAppear(ViewGroup viewGroup, C3215f0 f0Var, int i, C3215f0 f0Var2, int i2) {
        if ((this.mMode & 1) != 1 || f0Var2 == null) {
            return null;
        }
        if (f0Var == null) {
            View view = (View) f0Var2.f5053b.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f5003a) {
                return null;
            }
        }
        return onAppear(viewGroup, f0Var2.f5053b, f0Var, f0Var2);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, C3215f0 f0Var, C3215f0 f0Var2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (r17.mCanRemoveViews != false) goto L_0x008b;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r18, androidx.transition.C3215f0 r19, int r20, androidx.transition.C3215f0 r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC3197d1.onDisappear(android.view.ViewGroup, androidx.transition.f0, int, androidx.transition.f0, int):android.animation.Animator");
    }

    public void setMode(int i) {
        if ((i & (-4)) == 0) {
            this.mMode = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @SuppressLint({"RestrictedApi"})
    public AbstractC3197d1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3280y.f5171e);
        int g = C2379l.m37953g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (g != 0) {
            setMode(g);
        }
    }
}
