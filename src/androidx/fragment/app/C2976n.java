package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public class C2976n {

    /* renamed from: a */
    private final ArrayList<Fragment> f4250a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C2973m> f4251b = new HashMap<>();

    /* renamed from: c */
    private C2968j f4252c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35954a(Fragment fragment) {
        if (!this.f4250a.contains(fragment)) {
            synchronized (this.f4250a) {
                this.f4250a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35953b() {
        this.f4251b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m35952c(String str) {
        return this.f4251b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35951d(int i) {
        for (C2973m mVar : this.f4251b.values()) {
            if (mVar != null) {
                mVar.m35957t(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35950e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4251b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C2973m mVar : this.f4251b.values()) {
                printWriter.print(str);
                if (mVar != null) {
                    Fragment k = mVar.m35966k();
                    printWriter.println(k);
                    k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4250a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f4250a.get(i).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment m35949f(String str) {
        C2973m mVar = this.f4251b.get(str);
        if (mVar != null) {
            return mVar.m35966k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m35948g(int i) {
        for (int size = this.f4250a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4250a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C2973m mVar : this.f4251b.values()) {
            if (mVar != null) {
                Fragment k = mVar.m35966k();
                if (k.mFragmentId == i) {
                    return k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m35947h(String str) {
        if (str != null) {
            for (int size = this.f4250a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4250a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C2973m mVar : this.f4251b.values()) {
            if (mVar != null) {
                Fragment k = mVar.m35966k();
                if (str.equals(k.mTag)) {
                    return k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment m35946i(String str) {
        Fragment findFragmentByWho;
        for (C2973m mVar : this.f4251b.values()) {
            if (!(mVar == null || (findFragmentByWho = mVar.m35966k().findFragmentByWho(str)) == null)) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m35945j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4250a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f4250a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4250a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4250a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C2973m> m35944k() {
        ArrayList arrayList = new ArrayList();
        for (C2973m mVar : this.f4251b.values()) {
            if (mVar != null) {
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> m35943l() {
        ArrayList arrayList = new ArrayList();
        for (C2973m mVar : this.f4251b.values()) {
            if (mVar != null) {
                arrayList.add(mVar.m35966k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C2973m m35942m(String str) {
        return this.f4251b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public List<Fragment> m35941n() {
        ArrayList arrayList;
        if (this.f4250a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4250a) {
            arrayList = new ArrayList(this.f4250a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C2968j m35940o() {
        return this.f4252c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m35939p(C2973m mVar) {
        Fragment k = mVar.m35966k();
        if (!m35952c(k.mWho)) {
            this.f4251b.put(k.mWho, mVar);
            if (k.mRetainInstanceChangedWhileDetached) {
                if (k.mRetainInstance) {
                    this.f4252c.m35990f(k);
                } else {
                    this.f4252c.m35982n(k);
                }
                k.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m35938q(C2973m mVar) {
        Fragment k = mVar.m35966k();
        if (k.mRetainInstance) {
            this.f4252c.m35982n(k);
        }
        if (this.f4251b.put(k.mWho, null) != null && FragmentManager.m36195H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m35937r() {
        boolean z;
        Iterator<Fragment> it = this.f4250a.iterator();
        while (it.hasNext()) {
            C2973m mVar = this.f4251b.get(it.next().mWho);
            if (mVar != null) {
                mVar.m35964m();
            }
        }
        for (C2973m mVar2 : this.f4251b.values()) {
            if (mVar2 != null) {
                mVar2.m35964m();
                Fragment k = mVar2.m35966k();
                if (!k.mRemoving || k.isInBackStack()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    m35938q(mVar2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m35936s(Fragment fragment) {
        synchronized (this.f4250a) {
            this.f4250a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m35935t() {
        this.f4251b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m35934u(List<String> list) {
        this.f4250a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f = m35949f(str);
                if (f != null) {
                    if (FragmentManager.m36195H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f);
                    }
                    m35954a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public ArrayList<C2971l> m35933v() {
        ArrayList<C2971l> arrayList = new ArrayList<>(this.f4251b.size());
        for (C2973m mVar : this.f4251b.values()) {
            if (mVar != null) {
                Fragment k = mVar.m35966k();
                C2971l r = mVar.m35959r();
                arrayList.add(r);
                if (FragmentManager.m36195H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + r.f4241w);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public ArrayList<String> m35932w() {
        synchronized (this.f4250a) {
            if (this.f4250a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4250a.size());
            Iterator<Fragment> it = this.f4250a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.m36195H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m35931x(C2968j jVar) {
        this.f4252c = jVar;
    }
}
