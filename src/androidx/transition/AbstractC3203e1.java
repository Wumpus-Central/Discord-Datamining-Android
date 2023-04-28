package androidx.transition;

import android.view.View;

/* renamed from: androidx.transition.e1 */
/* loaded from: classes.dex */
public abstract class AbstractC3203e1 extends AbstractC3188b0 {
    private static final String PROPNAME_VISIBILITY = "android:visibilityPropagation:visibility";
    private static final String PROPNAME_VIEW_CENTER = "android:visibilityPropagation:center";
    private static final String[] VISIBILITY_PROPAGATION_VALUES = {PROPNAME_VISIBILITY, PROPNAME_VIEW_CENTER};

    private static int getViewCoordinate(C3215f0 f0Var, int i) {
        int[] iArr;
        if (f0Var == null || (iArr = (int[]) f0Var.f5052a.get(PROPNAME_VIEW_CENTER)) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // androidx.transition.AbstractC3188b0
    public void captureValues(C3215f0 f0Var) {
        View view = f0Var.f5053b;
        Integer num = (Integer) f0Var.f5052a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        f0Var.f5052a.put(PROPNAME_VISIBILITY, num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = round;
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        f0Var.f5052a.put(PROPNAME_VIEW_CENTER, iArr);
    }

    @Override // androidx.transition.AbstractC3188b0
    public String[] getPropagationProperties() {
        return VISIBILITY_PROPAGATION_VALUES;
    }

    public int getViewVisibility(C3215f0 f0Var) {
        Integer num;
        if (f0Var == null || (num = (Integer) f0Var.f5052a.get(PROPNAME_VISIBILITY)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int getViewX(C3215f0 f0Var) {
        return getViewCoordinate(f0Var, 0);
    }

    public int getViewY(C3215f0 f0Var) {
        return getViewCoordinate(f0Var, 1);
    }
}
