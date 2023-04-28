package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C2733w0;
import androidx.fragment.app.AbstractC2997s;
import androidx.lifecycle.AbstractC3056x;
import androidx.lifecycle.Lifecycle;
import p222m1.C10467b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public class C2973m {

    /* renamed from: a */
    private final C2963g f4242a;

    /* renamed from: b */
    private final C2976n f4243b;

    /* renamed from: c */
    private final Fragment f4244c;

    /* renamed from: d */
    private boolean f4245d = false;

    /* renamed from: e */
    private int f4246e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC2974a implements View.OnAttachStateChangeListener {

        /* renamed from: k */
        final /* synthetic */ View f4247k;

        View$OnAttachStateChangeListenerC2974a(View view) {
            this.f4247k = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4247k.removeOnAttachStateChangeListener(this);
            C2733w0.m36996n0(this.f4247k);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.m$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2975b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4249a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f4249a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4249a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4249a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4249a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2973m(C2963g gVar, C2976n nVar, Fragment fragment) {
        this.f4242a = gVar;
        this.f4243b = nVar;
        this.f4244c = fragment;
    }

    /* renamed from: l */
    private boolean m35965l(View view) {
        if (view == this.f4244c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4244c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m35960q() {
        Bundle bundle = new Bundle();
        this.f4244c.performSaveInstanceState(bundle);
        this.f4242a.m35997j(this.f4244c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4244c.mView != null) {
            m35958s();
        }
        if (this.f4244c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4244c.mSavedViewState);
        }
        if (this.f4244c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4244c.mSavedViewRegistryState);
        }
        if (!this.f4244c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4244c.mUserVisibleHint);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35976a() {
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4244c);
        }
        Fragment fragment = this.f4244c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C2963g gVar = this.f4242a;
        Fragment fragment2 = this.f4244c;
        gVar.m36006a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35975b() {
        int j = this.f4243b.m35945j(this.f4244c);
        Fragment fragment = this.f4244c;
        fragment.mContainer.addView(fragment.mView, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35974c() {
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4244c);
        }
        Fragment fragment = this.f4244c;
        Fragment fragment2 = fragment.mTarget;
        C2973m mVar = null;
        if (fragment2 != null) {
            C2973m m = this.f4243b.m35942m(fragment2.mWho);
            if (m != null) {
                Fragment fragment3 = this.f4244c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                mVar = m;
            } else {
                throw new IllegalStateException("Fragment " + this.f4244c + " declared target fragment " + this.f4244c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (mVar = this.f4243b.m35942m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4244c + " declared target fragment " + this.f4244c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (mVar != null && (FragmentManager.f35705P || mVar.m35966k().mState < 1)) {
            mVar.m35964m();
        }
        Fragment fragment4 = this.f4244c;
        fragment4.mHost = fragment4.mFragmentManager.m36096v0();
        Fragment fragment5 = this.f4244c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m36090y0();
        this.f4242a.m36000g(this.f4244c, false);
        this.f4244c.performAttach();
        this.f4242a.m36005b(this.f4244c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m35973d() {
        AbstractC2997s.C3002e.EnumC3004b bVar;
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f4244c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i = this.f4246e;
        int i2 = C2975b.f4249a[fragment2.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment3 = this.f4244c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i = Math.max(this.f4246e, 2);
                View view = this.f4244c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f4246e < 4 ? Math.min(i, fragment3.mState) : Math.min(i, 1);
            }
        }
        if (!this.f4244c.mAdded) {
            i = Math.min(i, 1);
        }
        if (!FragmentManager.f35705P || (viewGroup = (fragment = this.f4244c).mContainer) == null) {
            bVar = null;
        } else {
            bVar = AbstractC2997s.m35872n(viewGroup, fragment.getParentFragmentManager()).m35874l(this);
        }
        if (bVar == AbstractC2997s.C3002e.EnumC3004b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == AbstractC2997s.C3002e.EnumC3004b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f4244c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f4244c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f4244c);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35972e() {
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4244c);
        }
        Fragment fragment = this.f4244c;
        if (!fragment.mIsCreated) {
            this.f4242a.m35999h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f4244c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C2963g gVar = this.f4242a;
            Fragment fragment3 = this.f4244c;
            gVar.m36004c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f4244c.mState = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m35971f() {
        String str;
        if (!this.f4244c.mFromLayout) {
            if (FragmentManager.m36195H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4244c);
            }
            Fragment fragment = this.f4244c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            Fragment fragment2 = this.f4244c;
            ViewGroup viewGroup = fragment2.mContainer;
            if (viewGroup == null) {
                int i = fragment2.mContainerId;
                if (i == 0) {
                    viewGroup = null;
                } else if (i != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.m36109q0().mo36223c(this.f4244c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f4244c;
                        if (!fragment3.mRestored) {
                            try {
                                str = fragment3.getResources().getResourceName(this.f4244c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4244c.mContainerId) + " (" + str + ") for fragment " + this.f4244c);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4244c + " for a container view with no id");
                }
            }
            Fragment fragment4 = this.f4244c;
            fragment4.mContainer = viewGroup;
            fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
            View view = this.f4244c.mView;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f4244c;
                fragment5.mView.setTag(C10467b.f23088a, fragment5);
                if (viewGroup != null) {
                    m35975b();
                }
                Fragment fragment6 = this.f4244c;
                if (fragment6.mHidden) {
                    fragment6.mView.setVisibility(8);
                }
                if (C2733w0.m37030T(this.f4244c.mView)) {
                    C2733w0.m36996n0(this.f4244c.mView);
                } else {
                    View view2 = this.f4244c.mView;
                    view2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2974a(view2));
                }
                this.f4244c.performViewCreated();
                C2963g gVar = this.f4242a;
                Fragment fragment7 = this.f4244c;
                gVar.m35994m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                int visibility = this.f4244c.mView.getVisibility();
                float alpha = this.f4244c.mView.getAlpha();
                if (FragmentManager.f35705P) {
                    this.f4244c.setPostOnViewCreatedAlpha(alpha);
                    Fragment fragment8 = this.f4244c;
                    if (fragment8.mContainer != null && visibility == 0) {
                        View findFocus = fragment8.mView.findFocus();
                        if (findFocus != null) {
                            this.f4244c.setFocusedView(findFocus);
                            if (FragmentManager.m36195H0(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4244c);
                            }
                        }
                        this.f4244c.mView.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f4244c;
                    if (visibility == 0 && fragment9.mContainer != null) {
                        z = true;
                    }
                    fragment9.mIsNewlyAdded = z;
                }
            }
            this.f4244c.mState = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m35970g() {
        boolean z;
        boolean z2;
        Fragment f;
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4244c);
        }
        Fragment fragment = this.f4244c;
        boolean z3 = true;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.f4243b.m35940o().m35980p(this.f4244c)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            FragmentHostCallback<?> fragmentHostCallback = this.f4244c.mHost;
            if (fragmentHostCallback instanceof AbstractC3056x) {
                z3 = this.f4243b.m35940o().m35983m();
            } else if (fragmentHostCallback.m36220f() instanceof Activity) {
                z3 = true ^ ((Activity) fragmentHostCallback.m36220f()).isChangingConfigurations();
            }
            if (z || z3) {
                this.f4243b.m35940o().m35989g(this.f4244c);
            }
            this.f4244c.performDestroy();
            this.f4242a.m36003d(this.f4244c, false);
            for (C2973m mVar : this.f4243b.m35944k()) {
                if (mVar != null) {
                    Fragment k = mVar.m35966k();
                    if (this.f4244c.mWho.equals(k.mTargetWho)) {
                        k.mTarget = this.f4244c;
                        k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment2 = this.f4244c;
            String str = fragment2.mTargetWho;
            if (str != null) {
                fragment2.mTarget = this.f4243b.m35949f(str);
            }
            this.f4243b.m35938q(this);
            return;
        }
        String str2 = this.f4244c.mTargetWho;
        if (!(str2 == null || (f = this.f4243b.m35949f(str2)) == null || !f.mRetainInstance)) {
            this.f4244c.mTarget = f;
        }
        this.f4244c.mState = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m35969h() {
        View view;
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4244c);
        }
        Fragment fragment = this.f4244c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f4244c.performDestroyView();
        this.f4242a.m35993n(this.f4244c, false);
        Fragment fragment2 = this.f4244c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo35726o(null);
        this.f4244c.mInLayout = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m35968i() {
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4244c);
        }
        this.f4244c.performDetach();
        boolean z = false;
        this.f4242a.m36002e(this.f4244c, false);
        Fragment fragment = this.f4244c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f4243b.m35940o().m35980p(this.f4244c)) {
            if (FragmentManager.m36195H0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4244c);
            }
            this.f4244c.initState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m35967j() {
        Fragment fragment = this.f4244c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m36195H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4244c);
            }
            Fragment fragment2 = this.f4244c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f4244c.mSavedFragmentState);
            View view = this.f4244c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4244c;
                fragment3.mView.setTag(C10467b.f23088a, fragment3);
                Fragment fragment4 = this.f4244c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4244c.performViewCreated();
                C2963g gVar = this.f4242a;
                Fragment fragment5 = this.f4244c;
                gVar.m35994m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f4244c.mState = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment m35966k() {
        return this.f4244c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m35964m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f4245d) {
            try {
                this.f4245d = true;
                while (true) {
                    int d = m35973d();
                    Fragment fragment = this.f4244c;
                    int i = fragment.mState;
                    if (d == i) {
                        if (FragmentManager.f35705P && fragment.mHiddenChanged) {
                            if (!(fragment.mView == null || (viewGroup = fragment.mContainer) == null)) {
                                AbstractC2997s n = AbstractC2997s.m35872n(viewGroup, fragment.getParentFragmentManager());
                                if (this.f4244c.mHidden) {
                                    n.m35883c(this);
                                } else {
                                    n.m35881e(this);
                                }
                            }
                            Fragment fragment2 = this.f4244c;
                            FragmentManager fragmentManager = fragment2.mFragmentManager;
                            if (fragmentManager != null) {
                                fragmentManager.m36199F0(fragment2);
                            }
                            Fragment fragment3 = this.f4244c;
                            fragment3.mHiddenChanged = false;
                            fragment3.onHiddenChanged(fragment3.mHidden);
                        }
                        return;
                    } else if (d > i) {
                        switch (i + 1) {
                            case 0:
                                m35974c();
                                continue;
                            case 1:
                                m35972e();
                                continue;
                            case 2:
                                m35967j();
                                m35971f();
                                continue;
                            case 3:
                                m35976a();
                                continue;
                            case 4:
                                if (!(fragment.mView == null || (viewGroup2 = fragment.mContainer) == null)) {
                                    AbstractC2997s.m35872n(viewGroup2, fragment.getParentFragmentManager()).m35884b(AbstractC2997s.C3002e.EnumC3005c.m35854b(this.f4244c.mView.getVisibility()), this);
                                }
                                this.f4244c.mState = 4;
                                continue;
                            case 5:
                                m35956u();
                                continue;
                            case 6:
                                fragment.mState = 6;
                                continue;
                            case 7:
                                m35961p();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                m35968i();
                                continue;
                            case 0:
                                m35970g();
                                continue;
                            case 1:
                                m35969h();
                                this.f4244c.mState = 1;
                                continue;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                continue;
                            case 3:
                                if (FragmentManager.m36195H0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4244c);
                                }
                                Fragment fragment4 = this.f4244c;
                                if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                    m35958s();
                                }
                                Fragment fragment5 = this.f4244c;
                                if (!(fragment5.mView == null || (viewGroup3 = fragment5.mContainer) == null)) {
                                    AbstractC2997s.m35872n(viewGroup3, fragment5.getParentFragmentManager()).m35882d(this);
                                }
                                this.f4244c.mState = 3;
                                continue;
                            case 4:
                                m35955v();
                                continue;
                            case 5:
                                fragment.mState = 5;
                                continue;
                            case 6:
                                m35963n();
                                continue;
                            default:
                                continue;
                        }
                    }
                }
            } finally {
                this.f4245d = false;
            }
        } else if (FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m35966k());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m35963n() {
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4244c);
        }
        this.f4244c.performPause();
        this.f4242a.m36001f(this.f4244c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m35962o(ClassLoader classLoader) {
        Bundle bundle = this.f4244c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f4244c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f4244c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f4244c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f4244c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f4244c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f4244c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f4244c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m35961p() {
        String str;
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4244c);
        }
        View focusedView = this.f4244c.getFocusedView();
        if (focusedView != null && m35965l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.m36195H0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.f4244c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4244c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f4244c.setFocusedView(null);
        this.f4244c.performResume();
        this.f4242a.m35998i(this.f4244c, false);
        Fragment fragment = this.f4244c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C2971l m35959r() {
        C2971l lVar = new C2971l(this.f4244c);
        Fragment fragment = this.f4244c;
        if (fragment.mState <= -1 || lVar.f4241w != null) {
            lVar.f4241w = fragment.mSavedFragmentState;
        } else {
            Bundle q = m35960q();
            lVar.f4241w = q;
            if (this.f4244c.mTargetWho != null) {
                if (q == null) {
                    lVar.f4241w = new Bundle();
                }
                lVar.f4241w.putString("android:target_state", this.f4244c.mTargetWho);
                int i = this.f4244c.mTargetRequestCode;
                if (i != 0) {
                    lVar.f4241w.putInt("android:target_req_state", i);
                }
            }
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m35958s() {
        if (this.f4244c.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f4244c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f4244c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f4244c.mViewLifecycleOwner.m36058e(bundle);
            if (!bundle.isEmpty()) {
                this.f4244c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m35957t(int i) {
        this.f4246e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m35956u() {
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4244c);
        }
        this.f4244c.performStart();
        this.f4242a.m35996k(this.f4244c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m35955v() {
        if (FragmentManager.m36195H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4244c);
        }
        this.f4244c.performStop();
        this.f4242a.m35995l(this.f4244c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2973m(C2963g gVar, C2976n nVar, ClassLoader classLoader, C2960e eVar, C2971l lVar) {
        this.f4242a = gVar;
        this.f4243b = nVar;
        Fragment a = eVar.mo36010a(classLoader, lVar.f4229k);
        this.f4244c = a;
        Bundle bundle = lVar.f4238t;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.setArguments(lVar.f4238t);
        a.mWho = lVar.f4230l;
        a.mFromLayout = lVar.f4231m;
        a.mRestored = true;
        a.mFragmentId = lVar.f4232n;
        a.mContainerId = lVar.f4233o;
        a.mTag = lVar.f4234p;
        a.mRetainInstance = lVar.f4235q;
        a.mRemoving = lVar.f4236r;
        a.mDetached = lVar.f4237s;
        a.mHidden = lVar.f4239u;
        a.mMaxState = Lifecycle.State.values()[lVar.f4240v];
        Bundle bundle2 = lVar.f4241w;
        if (bundle2 != null) {
            a.mSavedFragmentState = bundle2;
        } else {
            a.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2973m(C2963g gVar, C2976n nVar, Fragment fragment, C2971l lVar) {
        this.f4242a = gVar;
        this.f4243b = nVar;
        this.f4244c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = lVar.f4241w;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
