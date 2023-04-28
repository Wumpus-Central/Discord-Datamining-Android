package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.w */
/* loaded from: classes.dex */
public class C3267w extends AbstractC3203e1 {
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r5 != false) goto L_0x0017;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r5 != false) goto L_0x0015;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        r0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        r0 = 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int distance(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.mSide
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 5
            r3 = 3
            r4 = 0
            r5 = 1
            if (r0 != r1) goto L_0x0019
            int r7 = androidx.core.view.C2733w0.m37063B(r7)
            if (r7 != r5) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r5 = r4
        L_0x0013:
            if (r5 == 0) goto L_0x0017
        L_0x0015:
            r0 = r2
            goto L_0x0029
        L_0x0017:
            r0 = r3
            goto L_0x0029
        L_0x0019:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L_0x0029
            int r7 = androidx.core.view.C2733w0.m37063B(r7)
            if (r7 != r5) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            if (r5 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0029:
            if (r0 == r3) goto L_0x0051
            if (r0 == r2) goto L_0x0048
            r7 = 48
            if (r0 == r7) goto L_0x003f
            r7 = 80
            if (r0 == r7) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r4 = r9 + r7
            goto L_0x0059
        L_0x003f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r4 = r15 + r7
            goto L_0x0059
        L_0x0048:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r4 = r8 + r7
            goto L_0x0059
        L_0x0051:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r4 = r14 + r7
        L_0x0059:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C3267w.distance(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int getMaxDistance(ViewGroup viewGroup) {
        int i = this.mSide;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }

    @Override // androidx.transition.AbstractC3188b0
    public long getStartDelay(ViewGroup viewGroup, Transition transition, C3215f0 f0Var, C3215f0 f0Var2) {
        int i;
        int i2;
        int i3;
        C3215f0 f0Var3 = f0Var;
        if (f0Var3 == null && f0Var2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (f0Var2 == null || getViewVisibility(f0Var3) == 0) {
            i = -1;
        } else {
            f0Var3 = f0Var2;
            i = 1;
        }
        int viewX = getViewX(f0Var3);
        int viewY = getViewY(f0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (epicenter != null) {
            i3 = epicenter.centerX();
            i2 = epicenter.centerY();
        } else {
            i3 = (round + width) / 2;
            i2 = (round2 + height) / 2;
        }
        float distance = distance(viewGroup, viewX, viewY, i3, i2, round, round2, width, height) / getMaxDistance(viewGroup);
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i)) / this.mPropagationSpeed) * distance);
    }

    public void setPropagationSpeed(float f) {
        if (f != 0.0f) {
            this.mPropagationSpeed = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    public void setSide(int i) {
        this.mSide = i;
    }
}
