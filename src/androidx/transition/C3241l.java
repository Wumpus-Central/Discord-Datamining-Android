package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.l */
/* loaded from: classes.dex */
class C3241l extends FrameLayout {

    /* renamed from: k */
    private ViewGroup f5119k;

    /* renamed from: l */
    private boolean f5120l = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3241l(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f5119k = viewGroup;
        viewGroup.setTag(C3261t.f5145b, this);
        C3244m0.m34872b(this.f5119k).mo34889c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C3241l m34885b(ViewGroup viewGroup) {
        return (C3241l) viewGroup.getTag(C3261t.f5145b);
    }

    /* renamed from: c */
    private int m34884c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m34883d(((C3245n) getChildAt(i2)).f5133m, arrayList2);
            if (m34881f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: d */
    private static void m34883d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m34883d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    private static boolean m34882e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() == view2.getZ()) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(C3244m0.m34873a(viewGroup, i));
                if (childAt == view) {
                    return false;
                }
                if (childAt == view2) {
                    break;
                }
            }
            return true;
        } else if (view.getZ() > view2.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m34881f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m34882e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m34886a(C3245n nVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        m34883d(nVar.f5133m, arrayList);
        int c = m34884c(arrayList);
        if (c < 0 || c >= getChildCount()) {
            addView(nVar);
        } else {
            addView(nVar, c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m34880g() {
        if (this.f5120l) {
            C3244m0.m34872b(this.f5119k).mo34888d(this);
            C3244m0.m34872b(this.f5119k).mo34889c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.f5120l) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f5119k.setTag(C3261t.f5145b, null);
            C3244m0.m34872b(this.f5119k).mo34888d(this);
            this.f5120l = false;
        }
    }
}
