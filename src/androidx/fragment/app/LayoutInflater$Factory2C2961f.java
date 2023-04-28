package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p222m1.C10468c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C2961f implements LayoutInflater.Factory2 {

    /* renamed from: k */
    final FragmentManager f4207k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC2962a implements View.OnAttachStateChangeListener {

        /* renamed from: k */
        final /* synthetic */ C2973m f4208k;

        View$OnAttachStateChangeListenerC2962a(C2973m mVar) {
            this.f4208k = mVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f4208k.m35966k();
            this.f4208k.m35964m();
            AbstractC2997s.m35872n((ViewGroup) k.mView.getParent(), LayoutInflater$Factory2C2961f.this.f4207k).m35876j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C2961f(FragmentManager fragmentManager) {
        this.f4207k = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C2973m mVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4207k);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10468c.f23094d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C10468c.f23095e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C10468c.f23096f, -1);
        String string = obtainStyledAttributes.getString(C10468c.f23097g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C2960e.m36009b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f4207k.m36133i0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f4207k.m36130j0(string);
        }
        if (fragment == null && id2 != -1) {
            fragment = this.f4207k.m36133i0(id2);
        }
        if (fragment == null) {
            fragment = this.f4207k.m36103s0().mo36010a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id2;
            fragment.mContainerId = id2;
            fragment.mTag = string;
            fragment.mInLayout = true;
            FragmentManager fragmentManager = this.f4207k;
            fragment.mFragmentManager = fragmentManager;
            fragment.mHost = fragmentManager.m36096v0();
            fragment.onInflate(this.f4207k.m36096v0().m36220f(), attributeSet, fragment.mSavedFragmentState);
            mVar = this.f4207k.m36140g(fragment);
            if (FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            FragmentManager fragmentManager2 = this.f4207k;
            fragment.mFragmentManager = fragmentManager2;
            fragment.mHost = fragmentManager2.m36096v0();
            fragment.onInflate(this.f4207k.m36096v0().m36220f(), attributeSet, fragment.mSavedFragmentState);
            mVar = this.f4207k.m36097v(fragment);
            if (FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
        }
        fragment.mContainer = (ViewGroup) view;
        mVar.m35964m();
        mVar.m35967j();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2962a(mVar));
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
