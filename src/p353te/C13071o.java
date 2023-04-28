package p353te;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m15073d2 = {"Landroid/view/ViewGroup;", "", "a", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.o */
/* loaded from: classes6.dex */
public final class C13071o {

    @Metadata(m15074d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, m15073d2 = {"te/o$a", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "", "onChildViewRemoved", "onChildViewAdded", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: te.o$a */
    /* loaded from: classes6.dex */
    public static final class ViewGroup$OnHierarchyChangeListenerC13072a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: k */
        final /* synthetic */ ViewGroup f29372k;

        ViewGroup$OnHierarchyChangeListenerC13072a(ViewGroup viewGroup) {
            this.f29372k = viewGroup;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(this.f29372k.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f29372k.getMeasuredHeight(), 1073741824));
            }
            if (view != null) {
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }

    /* renamed from: a */
    public static final void m4657a(ViewGroup viewGroup) {
        C9971q.m14633g(viewGroup, "<this>");
        viewGroup.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC13072a(viewGroup));
    }
}
