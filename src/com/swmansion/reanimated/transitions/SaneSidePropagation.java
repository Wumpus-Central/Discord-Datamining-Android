package com.swmansion.reanimated.transitions;

import android.view.ViewGroup;
import androidx.transition.C3215f0;
import androidx.transition.C3267w;
import androidx.transition.Transition;

/* loaded from: classes8.dex */
public class SaneSidePropagation extends C3267w {
    @Override // androidx.transition.C3267w, androidx.transition.AbstractC3188b0
    public long getStartDelay(ViewGroup viewGroup, Transition transition, C3215f0 f0Var, C3215f0 f0Var2) {
        long startDelay = super.getStartDelay(viewGroup, transition, f0Var, f0Var2);
        if (startDelay == 0) {
            return startDelay;
        }
        if (f0Var2 == null || getViewVisibility(f0Var) == 0) {
            return -startDelay;
        }
        return startDelay;
    }
}
