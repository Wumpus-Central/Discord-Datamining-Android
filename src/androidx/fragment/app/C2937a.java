package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C2937a extends FragmentTransaction implements FragmentManager.AbstractC2933n {

    /* renamed from: t */
    final FragmentManager f4129t;

    /* renamed from: u */
    boolean f4130u;

    /* renamed from: v */
    int f4131v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2937a(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.e r0 = r3.m36103s0()
            androidx.fragment.app.FragmentHostCallback r1 = r3.m36096v0()
            if (r1 == 0) goto L_0x0017
            androidx.fragment.app.FragmentHostCallback r1 = r3.m36096v0()
            android.content.Context r1 = r1.m36220f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f4131v = r0
            r2.f4129t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2937a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    /* renamed from: D */
    private static boolean m36053D(FragmentTransaction.C2936a aVar) {
        Fragment fragment = aVar.f4118b;
        if (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public String m36056A() {
        return this.f4108k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m36055B(int i) {
        int i2;
        int size = this.f4100c.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f4100c.get(i3).f4118b;
            if (fragment != null) {
                i2 = fragment.mContainerId;
            } else {
                i2 = 0;
            }
            if (i2 != 0 && i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m36054C(ArrayList<C2937a> arrayList, int i, int i2) {
        int i3;
        int i4;
        if (i2 == i) {
            return false;
        }
        int size = this.f4100c.size();
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            Fragment fragment = this.f4100c.get(i6).f4118b;
            if (fragment != null) {
                i3 = fragment.mContainerId;
            } else {
                i3 = 0;
            }
            if (!(i3 == 0 || i3 == i5)) {
                for (int i7 = i; i7 < i2; i7++) {
                    C2937a aVar = arrayList.get(i7);
                    int size2 = aVar.f4100c.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.f4100c.get(i8).f4118b;
                        if (fragment2 != null) {
                            i4 = fragment2.mContainerId;
                        } else {
                            i4 = 0;
                        }
                        if (i4 == i3) {
                            return true;
                        }
                    }
                }
                i5 = i3;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean m36052E() {
        for (int i = 0; i < this.f4100c.size(); i++) {
            if (m36053D(this.f4100c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public void m36051F() {
        if (this.f4116s != null) {
            for (int i = 0; i < this.f4116s.size(); i++) {
                this.f4116s.get(i).run();
            }
            this.f4116s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m36050G(Fragment.OnStartEnterTransitionListener onStartEnterTransitionListener) {
        for (int i = 0; i < this.f4100c.size(); i++) {
            FragmentTransaction.C2936a aVar = this.f4100c.get(i);
            if (m36053D(aVar)) {
                aVar.f4118b.setOnStartEnterTransitionListener(onStartEnterTransitionListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public Fragment m36049H(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4100c.size() - 1; size >= 0; size--) {
            FragmentTransaction.C2936a aVar = this.f4100c.get(size);
            int i = aVar.f4117a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f4118b;
                            break;
                        case 10:
                            aVar.f4124h = aVar.f4123g;
                            break;
                    }
                }
                arrayList.add(aVar.f4118b);
            }
            arrayList.remove(aVar.f4118b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC2933n
    /* renamed from: a */
    public boolean mo36048a(ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4106i) {
            return true;
        }
        this.f4129t.m36146e(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: g */
    public int mo36047g() {
        return m36040u(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: h */
    public int mo36046h() {
        return m36040u(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: i */
    public void mo36045i() {
        m36069k();
        this.f4129t.m36154b0(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: j */
    public void mo36044j() {
        m36069k();
        this.f4129t.m36154b0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: l */
    public void mo36043l(int i, Fragment fragment, String str, int i2) {
        super.mo36043l(i, fragment, str, i2);
        fragment.mFragmentManager = this.f4129t;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: m */
    public FragmentTransaction mo36042m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f4129t) {
            return super.mo36042m(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m36041t(int i) {
        FragmentTransaction.C2936a aVar;
        if (this.f4106i) {
            if (FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f4100c.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f4100c.get(i2).f4118b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m36195H0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4118b + " to " + aVar.f4118b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4131v >= 0) {
            sb2.append(" #");
            sb2.append(this.f4131v);
        }
        if (this.f4108k != null) {
            sb2.append(" ");
            sb2.append(this.f4108k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    int m36040u(boolean z) {
        if (!this.f4130u) {
            if (FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C2996r("FragmentManager"));
                m36039v("  ", printWriter);
                printWriter.close();
            }
            this.f4130u = true;
            if (this.f4106i) {
                this.f4131v = this.f4129t.m36131j();
            } else {
                this.f4131v = -1;
            }
            this.f4129t.m36162Y(this, z);
            return this.f4131v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: v */
    public void m36039v(String str, PrintWriter printWriter) {
        m36038w(str, printWriter, true);
    }

    /* renamed from: w */
    public void m36038w(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4108k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4131v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4130u);
            if (this.f4105h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4105h));
            }
            if (!(this.f4101d == 0 && this.f4102e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4101d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4102e));
            }
            if (!(this.f4103f == 0 && this.f4104g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4103f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4104g));
            }
            if (!(this.f4109l == 0 && this.f4110m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4109l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4110m);
            }
            if (!(this.f4111n == 0 && this.f4112o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4111n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4112o);
            }
        }
        if (!this.f4100c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f4100c.size();
            for (int i = 0; i < size; i++) {
                FragmentTransaction.C2936a aVar = this.f4100c.get(i);
                switch (aVar.f4117a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f4117a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f4118b);
                if (z) {
                    if (!(aVar.f4119c == 0 && aVar.f4120d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4119c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4120d));
                    }
                    if (aVar.f4121e != 0 || aVar.f4122f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4121e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4122f));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m36037x() {
        int size = this.f4100c.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C2936a aVar = this.f4100c.get(i);
            Fragment fragment = aVar.f4118b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f4105h);
                fragment.setSharedElementNames(this.f4113p, this.f4114q);
            }
            switch (aVar.f4117a) {
                case 1:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36120m1(fragment, false);
                    this.f4129t.m36140g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4117a);
                case 3:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36144e1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36201E0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36120m1(fragment, false);
                    this.f4129t.m36108q1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36093x(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36120m1(fragment, false);
                    this.f4129t.m36125l(fragment);
                    break;
                case 8:
                    this.f4129t.m36114o1(fragment);
                    break;
                case 9:
                    this.f4129t.m36114o1(null);
                    break;
                case 10:
                    this.f4129t.m36117n1(fragment, aVar.f4124h);
                    break;
            }
            if (!this.f4115r && aVar.f4117a != 1 && fragment != null && !FragmentManager.f35705P) {
                this.f4129t.m36175R0(fragment);
            }
        }
        if (!(this.f4115r || FragmentManager.f35705P)) {
            FragmentManager fragmentManager = this.f4129t;
            fragmentManager.m36173S0(fragmentManager.f4062q, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m36036y(boolean z) {
        for (int size = this.f4100c.size() - 1; size >= 0; size--) {
            FragmentTransaction.C2936a aVar = this.f4100c.get(size);
            Fragment fragment = aVar.f4118b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m36129j1(this.f4105h));
                fragment.setSharedElementNames(this.f4114q, this.f4113p);
            }
            switch (aVar.f4117a) {
                case 1:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36120m1(fragment, true);
                    this.f4129t.m36144e1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4117a);
                case 3:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36140g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36108q1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36120m1(fragment, true);
                    this.f4129t.m36201E0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36125l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4119c, aVar.f4120d, aVar.f4121e, aVar.f4122f);
                    this.f4129t.m36120m1(fragment, true);
                    this.f4129t.m36093x(fragment);
                    break;
                case 8:
                    this.f4129t.m36114o1(null);
                    break;
                case 9:
                    this.f4129t.m36114o1(fragment);
                    break;
                case 10:
                    this.f4129t.m36117n1(fragment, aVar.f4123g);
                    break;
            }
            if (!this.f4115r && aVar.f4117a != 3 && fragment != null && !FragmentManager.f35705P) {
                this.f4129t.m36175R0(fragment);
            }
        }
        if (!(this.f4115r || !z || FragmentManager.f35705P)) {
            FragmentManager fragmentManager = this.f4129t;
            fragmentManager.m36173S0(fragmentManager.f4062q, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public Fragment m36035z(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f4100c.size()) {
            FragmentTransaction.C2936a aVar = this.f4100c.get(i);
            int i2 = aVar.f4117a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f4118b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f4100c.add(i, new FragmentTransaction.C2936a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                FragmentTransaction.C2936a aVar2 = new FragmentTransaction.C2936a(3, fragment4);
                                aVar2.f4119c = aVar.f4119c;
                                aVar2.f4121e = aVar.f4121e;
                                aVar2.f4120d = aVar.f4120d;
                                aVar2.f4122f = aVar.f4122f;
                                this.f4100c.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f4100c.remove(i);
                        i--;
                    } else {
                        aVar.f4117a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f4118b);
                    Fragment fragment5 = aVar.f4118b;
                    if (fragment5 == fragment2) {
                        this.f4100c.add(i, new FragmentTransaction.C2936a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f4100c.add(i, new FragmentTransaction.C2936a(9, fragment2));
                        i++;
                        fragment2 = aVar.f4118b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f4118b);
            i++;
        }
        return fragment2;
    }
}
