package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2733w0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p083eb.C6802a;
import p102fb.C7108h;
import p102fb.C7110j;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f11456i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m27345g0(View view, boolean z) {
        boolean z2;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f11456i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.C2155f) || !(((CoordinatorLayout.C2155f) childAt.getLayoutParams()).m38683f() instanceof FabTransformationScrimBehavior)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f11456i;
                        if (map != null && map.containsKey(childAt)) {
                            C2733w0.m37064A0(childAt, this.f11456i.get(childAt).intValue());
                        }
                    } else {
                        this.f11456i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C2733w0.m37064A0(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f11456i = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo27347H(View view, View view2, boolean z, boolean z2) {
        m27345g0(view2, z);
        return super.mo27347H(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    protected FabTransformationBehavior.C5789e mo27346e0(Context context, boolean z) {
        int i;
        if (z) {
            i = C6802a.f14526d;
        } else {
            i = C6802a.f14525c;
        }
        FabTransformationBehavior.C5789e eVar = new FabTransformationBehavior.C5789e();
        eVar.f11449a = C7108h.m23384c(context, i);
        eVar.f11450b = new C7110j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
