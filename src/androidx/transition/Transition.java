package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.collection.C2094a;
import androidx.collection.C2098d;
import androidx.core.content.res.C2379l;
import androidx.core.view.C2733w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<C3215f0> mEndValuesList;
    private AbstractC3181f mEpicenterCallback;
    private C2094a<String, String> mNameOverrides;
    AbstractC3188b0 mPropagation;
    private ArrayList<C3215f0> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final AbstractC3257r STRAIGHT_PATH_MOTION = new C3176a();
    private static ThreadLocal<C2094a<Animator, C3179d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private C3224g0 mStartValues = new C3224g0();
    private C3224g0 mEndValues = new C3224g0();
    C3191c0 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    private ViewGroup mSceneRoot = null;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<AbstractC3182g> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private AbstractC3257r mPathMotion = STRAIGHT_PATH_MOTION;

    /* renamed from: androidx.transition.Transition$a */
    /* loaded from: classes.dex */
    static class C3176a extends AbstractC3257r {
        C3176a() {
        }

        @Override // androidx.transition.AbstractC3257r
        /* renamed from: a */
        public Path mo34839a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.Transition$b */
    /* loaded from: classes.dex */
    public class C3177b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C2094a f4967a;

        C3177b(C2094a aVar) {
            this.f4967a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4967a.remove(animator);
            Transition.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.mCurrentAnimators.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.Transition$c */
    /* loaded from: classes.dex */
    public class C3178c extends AnimatorListenerAdapter {
        C3178c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.end();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.Transition$d */
    /* loaded from: classes.dex */
    public static class C3179d {

        /* renamed from: a */
        View f4970a;

        /* renamed from: b */
        String f4971b;

        /* renamed from: c */
        C3215f0 f4972c;

        /* renamed from: d */
        AbstractC3225g1 f4973d;

        /* renamed from: e */
        Transition f4974e;

        C3179d(View view, String str, Transition transition, AbstractC3225g1 g1Var, C3215f0 f0Var) {
            this.f4970a = view;
            this.f4971b = str;
            this.f4972c = f0Var;
            this.f4973d = g1Var;
            this.f4974e = transition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.Transition$e */
    /* loaded from: classes.dex */
    public static class C3180e {
        /* renamed from: a */
        static <T> ArrayList<T> m34985a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        /* renamed from: b */
        static <T> ArrayList<T> m34984b(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.transition.Transition$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3181f {
        /* renamed from: a */
        public abstract Rect mo34890a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$g */
    /* loaded from: classes.dex */
    public interface AbstractC3182g {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);
    }

    public Transition() {
    }

    private void addUnmatched(C2094a<View, C3215f0> aVar, C2094a<View, C3215f0> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C3215f0 n = aVar.m39048n(i);
            if (isValidTarget(n.f5053b)) {
                this.mStartValuesList.add(n);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C3215f0 n2 = aVar2.m39048n(i2);
            if (isValidTarget(n2.f5053b)) {
                this.mEndValuesList.add(n2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(C3224g0 g0Var, View view, C3215f0 f0Var) {
        g0Var.f5086a.put(view, f0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (g0Var.f5087b.indexOfKey(id2) >= 0) {
                g0Var.f5087b.put(id2, null);
            } else {
                g0Var.f5087b.put(id2, view);
            }
        }
        String K = C2733w0.m37045K(view);
        if (K != null) {
            if (g0Var.f5089d.containsKey(K)) {
                g0Var.f5089d.put(K, null);
            } else {
                g0Var.f5089d.put(K, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (g0Var.f5088c.m39013k(itemIdAtPosition) >= 0) {
                    View h = g0Var.f5088c.m39015h(itemIdAtPosition);
                    if (h != null) {
                        C2733w0.m36972z0(h, false);
                        g0Var.f5088c.m39011m(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C2733w0.m36972z0(view, true);
                g0Var.f5088c.m39011m(itemIdAtPosition, view);
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z) {
        if (view != null) {
            int id2 = view.getId();
            ArrayList<Integer> arrayList = this.mTargetIdExcludes;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
                ArrayList<View> arrayList2 = this.mTargetExcludes;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C3215f0 f0Var = new C3215f0(view);
                        if (z) {
                            captureStartValues(f0Var);
                        } else {
                            captureEndValues(f0Var);
                        }
                        f0Var.f5054c.add(this);
                        capturePropagationValues(f0Var);
                        if (z) {
                            addViewValues(this.mStartValues, view, f0Var);
                        } else {
                            addViewValues(this.mEndValues, view, f0Var);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                            ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    captureHierarchy(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return C3180e.m34985a(arrayList, Integer.valueOf(i));
        }
        return C3180e.m34984b(arrayList, Integer.valueOf(i));
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        if (t == null) {
            return arrayList;
        }
        if (z) {
            return C3180e.m34985a(arrayList, t);
        }
        return C3180e.m34984b(arrayList, t);
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return C3180e.m34985a(arrayList, cls);
        }
        return C3180e.m34984b(arrayList, cls);
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return C3180e.m34985a(arrayList, view);
        }
        return C3180e.m34984b(arrayList, view);
    }

    private static C2094a<Animator, C3179d> getRunningAnimators() {
        C2094a<Animator, C3179d> aVar = sRunningAnimators.get();
        if (aVar != null) {
            return aVar;
        }
        C2094a<Animator, C3179d> aVar2 = new C2094a<>();
        sRunningAnimators.set(aVar2);
        return aVar2;
    }

    private static boolean isValidMatch(int i) {
        return i >= 1 && i <= 4;
    }

    private static boolean isValueChanged(C3215f0 f0Var, C3215f0 f0Var2, String str) {
        Object obj = f0Var.f5052a.get(str);
        Object obj2 = f0Var2.f5052a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchIds(C2094a<View, C3215f0> aVar, C2094a<View, C3215f0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C3215f0 f0Var = aVar.get(valueAt);
                C3215f0 f0Var2 = aVar2.get(view);
                if (!(f0Var == null || f0Var2 == null)) {
                    this.mStartValuesList.add(f0Var);
                    this.mEndValuesList.add(f0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchInstances(C2094a<View, C3215f0> aVar, C2094a<View, C3215f0> aVar2) {
        C3215f0 remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View j = aVar.m39052j(size);
            if (j != null && isValidTarget(j) && (remove = aVar2.remove(j)) != null && isValidTarget(remove.f5053b)) {
                this.mStartValuesList.add(aVar.m39050l(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(C2094a<View, C3215f0> aVar, C2094a<View, C3215f0> aVar2, C2098d<View> dVar, C2098d<View> dVar2) {
        View h;
        int q = dVar.m39008q();
        for (int i = 0; i < q; i++) {
            View r = dVar.m39007r(i);
            if (r != null && isValidTarget(r) && (h = dVar2.m39015h(dVar.m39012l(i))) != null && isValidTarget(h)) {
                C3215f0 f0Var = aVar.get(r);
                C3215f0 f0Var2 = aVar2.get(h);
                if (!(f0Var == null || f0Var2 == null)) {
                    this.mStartValuesList.add(f0Var);
                    this.mEndValuesList.add(f0Var2);
                    aVar.remove(r);
                    aVar2.remove(h);
                }
            }
        }
    }

    private void matchNames(C2094a<View, C3215f0> aVar, C2094a<View, C3215f0> aVar2, C2094a<String, View> aVar3, C2094a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View n = aVar3.m39048n(i);
            if (n != null && isValidTarget(n) && (view = aVar4.get(aVar3.m39052j(i))) != null && isValidTarget(view)) {
                C3215f0 f0Var = aVar.get(n);
                C3215f0 f0Var2 = aVar2.get(view);
                if (!(f0Var == null || f0Var2 == null)) {
                    this.mStartValuesList.add(f0Var);
                    this.mEndValuesList.add(f0Var2);
                    aVar.remove(n);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(C3224g0 g0Var, C3224g0 g0Var2) {
        C2094a<View, C3215f0> aVar = new C2094a<>(g0Var.f5086a);
        C2094a<View, C3215f0> aVar2 = new C2094a<>(g0Var2.f5086a);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    matchInstances(aVar, aVar2);
                } else if (i2 == 2) {
                    matchNames(aVar, aVar2, g0Var.f5089d, g0Var2.f5089d);
                } else if (i2 == 3) {
                    matchIds(aVar, aVar2, g0Var.f5087b, g0Var2.f5087b);
                } else if (i2 == 4) {
                    matchItemIds(aVar, aVar2, g0Var.f5088c, g0Var2.f5088c);
                }
                i++;
            } else {
                addUnmatched(aVar, aVar2);
                return;
            }
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (MATCH_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if (MATCH_NAME_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, C2094a<Animator, C3179d> aVar) {
        if (animator != null) {
            animator.addListener(new C3177b(aVar));
            animate(animator);
        }
    }

    public Transition addListener(AbstractC3182g gVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(gVar);
        return this;
    }

    public Transition addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    protected void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new C3178c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<AbstractC3182g> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((AbstractC3182g) arrayList2.get(i)).onTransitionCancel(this);
            }
        }
    }

    public abstract void captureEndValues(C3215f0 f0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void capturePropagationValues(C3215f0 f0Var) {
        String[] propagationProperties;
        if (this.mPropagation != null && !f0Var.f5052a.isEmpty() && (propagationProperties = this.mPropagation.getPropagationProperties()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= propagationProperties.length) {
                    z = true;
                    break;
                } else if (!f0Var.f5052a.containsKey(propagationProperties[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.mPropagation.captureValues(f0Var);
            }
        }
    }

    public abstract void captureStartValues(C3215f0 f0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void captureValues(ViewGroup viewGroup, boolean z) {
        C2094a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (findViewById != null) {
                    C3215f0 f0Var = new C3215f0(findViewById);
                    if (z) {
                        captureStartValues(f0Var);
                    } else {
                        captureEndValues(f0Var);
                    }
                    f0Var.f5054c.add(this);
                    capturePropagationValues(f0Var);
                    if (z) {
                        addViewValues(this.mStartValues, findViewById, f0Var);
                    } else {
                        addViewValues(this.mEndValues, findViewById, f0Var);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                C3215f0 f0Var2 = new C3215f0(view);
                if (z) {
                    captureStartValues(f0Var2);
                } else {
                    captureEndValues(f0Var2);
                }
                f0Var2.f5054c.add(this);
                capturePropagationValues(f0Var2);
                if (z) {
                    addViewValues(this.mStartValues, view, f0Var2);
                } else {
                    addViewValues(this.mEndValues, view, f0Var2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (!(z || (aVar = this.mNameOverrides) == null)) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.mStartValues.f5089d.remove(this.mNameOverrides.m39052j(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.mStartValues.f5089d.put(this.mNameOverrides.m39048n(i4), view2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.f5086a.clear();
            this.mStartValues.f5087b.clear();
            this.mStartValues.f5088c.m39019c();
            return;
        }
        this.mEndValues.f5086a.clear();
        this.mEndValues.f5087b.clear();
        this.mEndValues.f5088c.m39019c();
    }

    public Animator createAnimator(ViewGroup viewGroup, C3215f0 f0Var, C3215f0 f0Var2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createAnimators(ViewGroup viewGroup, C3224g0 g0Var, C3224g0 g0Var2, ArrayList<C3215f0> arrayList, ArrayList<C3215f0> arrayList2) {
        int i;
        boolean z;
        Animator createAnimator;
        View view;
        Animator animator;
        C3215f0 f0Var;
        C3215f0 f0Var2;
        Animator animator2;
        C2094a<Animator, C3179d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            C3215f0 f0Var3 = arrayList.get(i2);
            C3215f0 f0Var4 = arrayList2.get(i2);
            if (f0Var3 != null && !f0Var3.f5054c.contains(this)) {
                f0Var3 = null;
            }
            if (f0Var4 != null && !f0Var4.f5054c.contains(this)) {
                f0Var4 = null;
            }
            if (!(f0Var3 == null && f0Var4 == null)) {
                if (f0Var3 == null || f0Var4 == null || isTransitionRequired(f0Var3, f0Var4)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (createAnimator = createAnimator(viewGroup, f0Var3, f0Var4)) != null) {
                    if (f0Var4 != null) {
                        view = f0Var4.f5053b;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            f0Var2 = new C3215f0(view);
                            i = size;
                            C3215f0 f0Var5 = g0Var2.f5086a.get(view);
                            if (f0Var5 != null) {
                                int i3 = 0;
                                while (i3 < transitionProperties.length) {
                                    Map<String, Object> map = f0Var2.f5052a;
                                    String str = transitionProperties[i3];
                                    map.put(str, f0Var5.f5052a.get(str));
                                    i3++;
                                    transitionProperties = transitionProperties;
                                }
                            }
                            int size2 = runningAnimators.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    animator2 = createAnimator;
                                    break;
                                }
                                C3179d dVar = runningAnimators.get(runningAnimators.m39052j(i4));
                                if (dVar.f4972c != null && dVar.f4970a == view && dVar.f4971b.equals(getName()) && dVar.f4972c.equals(f0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i = size;
                            animator2 = createAnimator;
                            f0Var2 = null;
                        }
                        animator = animator2;
                        f0Var = f0Var2;
                    } else {
                        i = size;
                        view = f0Var3.f5053b;
                        animator = createAnimator;
                        f0Var = null;
                    }
                    if (animator != null) {
                        AbstractC3188b0 b0Var = this.mPropagation;
                        if (b0Var != null) {
                            long startDelay = b0Var.getStartDelay(viewGroup, this, f0Var3, f0Var4);
                            sparseIntArray.put(this.mAnimators.size(), (int) startDelay);
                            j = Math.min(startDelay, j);
                        }
                        runningAnimators.put(animator, new C3179d(view, getName(), this, C3252p0.m34853d(viewGroup), f0Var));
                        this.mAnimators.add(animator);
                        j = j;
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i5));
                animator3.setStartDelay((sparseIntArray.valueAt(i5) - j) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            ArrayList<AbstractC3182g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC3182g) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            for (int i3 = 0; i3 < this.mStartValues.f5088c.m39008q(); i3++) {
                View r = this.mStartValues.f5088c.m39007r(i3);
                if (r != null) {
                    C2733w0.m36972z0(r, false);
                }
            }
            for (int i4 = 0; i4 < this.mEndValues.f5088c.m39008q(); i4++) {
                View r2 = this.mEndValues.f5088c.m39007r(i4);
                if (r2 != null) {
                    C2733w0.m36972z0(r2, false);
                }
            }
            this.mEnded = true;
        }
    }

    public Transition excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    public Transition excludeTarget(View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void forceToEnd(ViewGroup viewGroup) {
        C2094a<Animator, C3179d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (!(viewGroup == null || size == 0)) {
            AbstractC3225g1 d = C3252p0.m34853d(viewGroup);
            C2094a aVar = new C2094a(runningAnimators);
            runningAnimators.clear();
            for (int i = size - 1; i >= 0; i--) {
                C3179d dVar = (C3179d) aVar.m39048n(i);
                if (!(dVar.f4970a == null || d == null || !d.equals(dVar.f4973d))) {
                    ((Animator) aVar.m39052j(i)).end();
                }
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        AbstractC3181f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.mo34890a(this);
    }

    public AbstractC3181f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3215f0 getMatchedTransitionValues(View view, boolean z) {
        ArrayList<C3215f0> arrayList;
        ArrayList<C3215f0> arrayList2;
        C3191c0 c0Var = this.mParent;
        if (c0Var != null) {
            return c0Var.getMatchedTransitionValues(view, z);
        }
        if (z) {
            arrayList = this.mStartValuesList;
        } else {
            arrayList = this.mEndValuesList;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C3215f0 f0Var = arrayList.get(i);
            if (f0Var == null) {
                return null;
            }
            if (f0Var.f5053b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.mEndValuesList;
        } else {
            arrayList2 = this.mStartValuesList;
        }
        return arrayList2.get(i);
    }

    public String getName() {
        return this.mName;
    }

    public AbstractC3257r getPathMotion() {
        return this.mPathMotion;
    }

    public AbstractC3188b0 getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public C3215f0 getTransitionValues(View view, boolean z) {
        C3224g0 g0Var;
        C3191c0 c0Var = this.mParent;
        if (c0Var != null) {
            return c0Var.getTransitionValues(view, z);
        }
        if (z) {
            g0Var = this.mStartValues;
        } else {
            g0Var = this.mEndValues;
        }
        return g0Var.f5086a.get(view);
    }

    public boolean isTransitionRequired(C3215f0 f0Var, C3215f0 f0Var2) {
        if (f0Var == null || f0Var2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties != null) {
            for (String str : transitionProperties) {
                if (!isValueChanged(f0Var, f0Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : f0Var.f5052a.keySet()) {
            if (isValueChanged(f0Var, f0Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.mTargetNameExcludes == null || C2733w0.m37045K(view) == null || !this.mTargetNameExcludes.contains(C2733w0.m37045K(view)))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(C2733w0.m37045K(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pause(View view) {
        if (!this.mEnded) {
            C2094a<Animator, C3179d> runningAnimators = getRunningAnimators();
            int size = runningAnimators.size();
            AbstractC3225g1 d = C3252p0.m34853d(view);
            for (int i = size - 1; i >= 0; i--) {
                C3179d n = runningAnimators.m39048n(i);
                if (n.f4970a != null && d.equals(n.f4973d)) {
                    C3183a.m34982b(runningAnimators.m39052j(i));
                }
            }
            ArrayList<AbstractC3182g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((AbstractC3182g) arrayList2.get(i2)).onTransitionPause(this);
                }
            }
            this.mPaused = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void playTransition(ViewGroup viewGroup) {
        C3179d dVar;
        boolean z;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        C2094a<Animator, C3179d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        AbstractC3225g1 d = C3252p0.m34853d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator j = runningAnimators.m39052j(i);
            if (!(j == null || (dVar = runningAnimators.get(j)) == null || dVar.f4970a == null || !d.equals(dVar.f4973d))) {
                C3215f0 f0Var = dVar.f4972c;
                View view = dVar.f4970a;
                C3215f0 transitionValues = getTransitionValues(view, true);
                C3215f0 matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f5086a.get(view);
                }
                if (!(transitionValues == null && matchedTransitionValues == null) && dVar.f4974e.isTransitionRequired(f0Var, matchedTransitionValues)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (j.isRunning() || j.isStarted()) {
                        j.cancel();
                    } else {
                        runningAnimators.remove(j);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public Transition removeListener(AbstractC3182g gVar) {
        ArrayList<AbstractC3182g> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(gVar);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public Transition removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                C2094a<Animator, C3179d> runningAnimators = getRunningAnimators();
                int size = runningAnimators.size();
                AbstractC3225g1 d = C3252p0.m34853d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C3179d n = runningAnimators.m39048n(i);
                    if (n.f4970a != null && d.equals(n.f4973d)) {
                        C3183a.m34981c(runningAnimators.m39052j(i));
                    }
                }
                ArrayList<AbstractC3182g> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((AbstractC3182g) arrayList2.get(i2)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void runAnimators() {
        start();
        C2094a<Animator, C3179d> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public Transition setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(AbstractC3181f fVar) {
        this.mEpicenterCallback = fVar;
    }

    public Transition setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!isValidMatch(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (alreadyContains(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(AbstractC3257r rVar) {
        if (rVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = rVar;
        }
    }

    public void setPropagation(AbstractC3188b0 b0Var) {
        this.mPropagation = b0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Transition setSceneRoot(ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        return this;
    }

    public Transition setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<AbstractC3182g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC3182g) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    public Transition addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new C3224g0();
            transition.mEndValues = new C3224g0();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Transition excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    public Transition excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    public Transition removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.mTargetIds.size() > 0) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargetIds.get(i);
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargets.get(i2);
            }
        }
        return str3 + ")";
    }

    public Transition addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public Transition excludeChildren(Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    public Transition excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    public Transition removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public Transition excludeTarget(Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public Transition removeTarget(Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public Transition addTarget(Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3280y.f5169c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long g = C2379l.m37953g(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (g >= 0) {
            setDuration(g);
        }
        long g2 = C2379l.m37953g(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (g2 > 0) {
            setStartDelay(g2);
        }
        int h = C2379l.m37952h(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (h > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, h));
        }
        String i = C2379l.m37951i(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (i != null) {
            setMatchOrder(parseMatchOrder(i));
        }
        obtainStyledAttributes.recycle();
    }
}
