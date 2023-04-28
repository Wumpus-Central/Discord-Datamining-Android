package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.activity.AbstractC1486b;
import androidx.activity.AbstractC1487c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC1493b;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C1492a;
import androidx.activity.result.C1494c;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.C1498a;
import androidx.collection.C2095b;
import androidx.core.p018os.C2437e;
import androidx.fragment.app.C2954d;
import androidx.fragment.app.C2977o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC3038j;
import androidx.lifecycle.AbstractC3056x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p032c.C3748a;
import p163j$.util.DesugarCollections;
import p222m1.C10467b;

/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: O */
    private static boolean f35704O = false;

    /* renamed from: P */
    static boolean f35705P = true;

    /* renamed from: A */
    private ActivityResultLauncher<C1494c> f35706A;

    /* renamed from: B */
    private ActivityResultLauncher<String[]> f35707B;

    /* renamed from: D */
    private boolean f35709D;

    /* renamed from: E */
    private boolean f35710E;

    /* renamed from: F */
    private boolean f35711F;

    /* renamed from: G */
    private boolean f35712G;

    /* renamed from: H */
    private boolean f35713H;

    /* renamed from: I */
    private ArrayList<C2937a> f35714I;

    /* renamed from: J */
    private ArrayList<Boolean> f35715J;

    /* renamed from: K */
    private ArrayList<Fragment> f35716K;

    /* renamed from: L */
    private ArrayList<C2935p> f35717L;

    /* renamed from: M */
    private C2968j f35718M;

    /* renamed from: b */
    private boolean f4047b;

    /* renamed from: d */
    ArrayList<C2937a> f4049d;

    /* renamed from: e */
    private ArrayList<Fragment> f4050e;

    /* renamed from: g */
    private OnBackPressedDispatcher f4052g;

    /* renamed from: l */
    private ArrayList<AbstractC2932m> f4057l;

    /* renamed from: r */
    private FragmentHostCallback<?> f4063r;

    /* renamed from: s */
    private FragmentContainer f4064s;

    /* renamed from: t */
    private Fragment f4065t;

    /* renamed from: u */
    Fragment f4066u;

    /* renamed from: z */
    private ActivityResultLauncher<Intent> f4071z;

    /* renamed from: a */
    private final ArrayList<AbstractC2933n> f4046a = new ArrayList<>();

    /* renamed from: c */
    private final C2976n f4048c = new C2976n();

    /* renamed from: f */
    private final LayoutInflater$Factory2C2961f f4051f = new LayoutInflater$Factory2C2961f(this);

    /* renamed from: h */
    private final AbstractC1486b f4053h = new C2921c(false);

    /* renamed from: i */
    private final AtomicInteger f4054i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, Bundle> f4055j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Object> f4056k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private Map<Fragment, HashSet<C2437e>> f4058m = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C2977o.AbstractC2984g f4059n = new C2922d();

    /* renamed from: o */
    private final C2963g f4060o = new C2963g(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<AbstractC2970k> f4061p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f4062q = -1;

    /* renamed from: v */
    private C2960e f4067v = null;

    /* renamed from: w */
    private C2960e f4068w = new C2923e();

    /* renamed from: x */
    private AbstractC3006t f4069x = null;

    /* renamed from: y */
    private AbstractC3006t f4070y = new C2924f();

    /* renamed from: C */
    ArrayDeque<C2930l> f35708C = new ArrayDeque<>();

    /* renamed from: N */
    private Runnable f35719N = new RunnableC2925g();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    /* loaded from: classes.dex */
    class AnonymousClass6 implements AbstractC3038j {

        /* renamed from: k */
        final /* synthetic */ String f4072k;

        /* renamed from: l */
        final /* synthetic */ Lifecycle f4073l;

        /* renamed from: m */
        final /* synthetic */ FragmentManager f4074m;

        @Override // androidx.lifecycle.AbstractC3038j
        /* renamed from: c */
        public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
            if (bVar == Lifecycle.EnumC3010b.ON_START && ((Bundle) this.f4074m.f4055j.get(this.f4072k)) != null) {
                throw null;
            } else if (bVar == Lifecycle.EnumC3010b.ON_DESTROY) {
                this.f4073l.mo35842c(this);
                this.f4074m.f4056k.remove(this.f4072k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$a */
    /* loaded from: classes.dex */
    public class C2919a implements ActivityResultCallback<C1492a> {
        C2919a() {
        }

        /* renamed from: b */
        public void mo36085a(C1492a aVar) {
            C2930l pollFirst = FragmentManager.this.f35708C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f4089k;
            int i = pollFirst.f4090l;
            Fragment i2 = FragmentManager.this.f4048c.m35946i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, aVar.m40978b(), aVar.m40979a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$b */
    /* loaded from: classes.dex */
    public class C2920b implements ActivityResultCallback<Map<String, Boolean>> {
        C2920b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo36085a(Map<String, Boolean> map) {
            int i;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            C2930l pollFirst = FragmentManager.this.f35708C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f4089k;
            int i3 = pollFirst.f4090l;
            Fragment i4 = FragmentManager.this.f4048c.m35946i(str);
            if (i4 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i4.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    /* loaded from: classes.dex */
    class C2921c extends AbstractC1486b {
        C2921c(boolean z) {
            super(z);
        }

        @Override // androidx.activity.AbstractC1486b
        /* renamed from: b */
        public void mo25970b() {
            FragmentManager.this.m36203D0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    /* loaded from: classes.dex */
    class C2922d implements C2977o.AbstractC2984g {
        C2922d() {
        }

        @Override // androidx.fragment.app.C2977o.AbstractC2984g
        /* renamed from: a */
        public void mo35901a(Fragment fragment, C2437e eVar) {
            if (!eVar.m37744b()) {
                FragmentManager.this.m36147d1(fragment, eVar);
            }
        }

        @Override // androidx.fragment.app.C2977o.AbstractC2984g
        /* renamed from: b */
        public void mo35900b(Fragment fragment, C2437e eVar) {
            FragmentManager.this.m36143f(fragment, eVar);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    /* loaded from: classes.dex */
    class C2923e extends C2960e {
        C2923e() {
        }

        @Override // androidx.fragment.app.C2960e
        /* renamed from: a */
        public Fragment mo36010a(ClassLoader classLoader, String str) {
            return FragmentManager.this.m36096v0().m36249b(FragmentManager.this.m36096v0().m36220f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    /* loaded from: classes.dex */
    class C2924f implements AbstractC3006t {
        C2924f() {
        }

        @Override // androidx.fragment.app.AbstractC3006t
        /* renamed from: a */
        public AbstractC2997s mo35852a(ViewGroup viewGroup) {
            return new C2940c(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    /* loaded from: classes.dex */
    class RunnableC2925g implements Runnable {
        RunnableC2925g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m36157a0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$h */
    /* loaded from: classes.dex */
    public class C2926h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4082a;

        /* renamed from: b */
        final /* synthetic */ View f4083b;

        /* renamed from: c */
        final /* synthetic */ Fragment f4084c;

        C2926h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f4082a = viewGroup;
            this.f4083b = view;
            this.f4084c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4082a.endViewTransition(this.f4083b);
            animator.removeListener(this);
            Fragment fragment = this.f4084c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$i */
    /* loaded from: classes.dex */
    public class C2927i implements AbstractC2970k {

        /* renamed from: k */
        final /* synthetic */ Fragment f4086k;

        C2927i(Fragment fragment) {
            this.f4086k = fragment;
        }

        @Override // androidx.fragment.app.AbstractC2970k
        /* renamed from: a */
        public void mo35979a(FragmentManager fragmentManager, Fragment fragment) {
            this.f4086k.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$j */
    /* loaded from: classes.dex */
    public class C2928j implements ActivityResultCallback<C1492a> {
        C2928j() {
        }

        /* renamed from: b */
        public void mo36085a(C1492a aVar) {
            C2930l pollFirst = FragmentManager.this.f35708C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f4089k;
            int i = pollFirst.f4090l;
            Fragment i2 = FragmentManager.this.f4048c.m35946i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, aVar.m40978b(), aVar.m40979a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$k */
    /* loaded from: classes.dex */
    public static class C2929k extends ActivityResultContract<C1494c, C1492a> {
        C2929k() {
        }

        /* renamed from: d */
        public Intent mo33700a(Context context, C1494c cVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = cVar.m40974a();
            if (!(a == null || (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    cVar = new C1494c.C1496b(cVar.m40971f()).m40967b(null).m40966c(cVar.m40972e(), cVar.m40973b()).m40968a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", cVar);
            if (FragmentManager.m36195H0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public C1492a mo33699c(int i, Intent intent) {
            return new C1492a(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    /* loaded from: classes.dex */
    public interface AbstractC2932m {
        void onBackStackChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$n */
    /* loaded from: classes.dex */
    public interface AbstractC2933n {
        /* renamed from: a */
        boolean mo36048a(ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    /* loaded from: classes.dex */
    private class C2934o implements AbstractC2933n {

        /* renamed from: a */
        final String f4091a;

        /* renamed from: b */
        final int f4092b;

        /* renamed from: c */
        final int f4093c;

        C2934o(String str, int i, int i2) {
            this.f4091a = str;
            this.f4092b = i;
            this.f4093c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC2933n
        /* renamed from: a */
        public boolean mo36048a(ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f4066u;
            if (fragment == null || this.f4092b >= 0 || this.f4091a != null || !fragment.getChildFragmentManager().m36159Z0()) {
                return FragmentManager.this.m36153b1(arrayList, arrayList2, this.f4091a, this.f4092b, this.f4093c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$p */
    /* loaded from: classes.dex */
    public static class C2935p implements Fragment.OnStartEnterTransitionListener {

        /* renamed from: a */
        final boolean f4095a;

        /* renamed from: b */
        final C2937a f4096b;

        /* renamed from: c */
        private int f4097c;

        C2935p(C2937a aVar, boolean z) {
            this.f4095a = z;
            this.f4096b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        /* renamed from: a */
        public void mo36079a() {
            this.f4097c++;
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        /* renamed from: b */
        public void mo36078b() {
            int i = this.f4097c - 1;
            this.f4097c = i;
            if (i == 0) {
                this.f4096b.f4129t.m36123l1();
            }
        }

        /* renamed from: c */
        void m36077c() {
            C2937a aVar = this.f4096b;
            aVar.f4129t.m36101t(aVar, this.f4095a, false, false);
        }

        /* renamed from: d */
        void m36076d() {
            boolean z;
            if (this.f4097c > 0) {
                z = true;
            } else {
                z = false;
            }
            for (Fragment fragment : this.f4096b.f4129t.m36098u0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C2937a aVar = this.f4096b;
            aVar.f4129t.m36101t(aVar, this.f4095a, !z, true);
        }

        /* renamed from: e */
        public boolean m36075e() {
            return this.f4097c == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public static Fragment m36207B0(View view) {
        Object tag = view.getTag(C10467b.f23088a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public static boolean m36195H0(int i) {
        return f35704O || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: I0 */
    private boolean m36193I0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m36116o();
    }

    /* renamed from: L */
    private void m36188L(Fragment fragment) {
        if (fragment != null && fragment.equals(m36139g0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: Q0 */
    private void m36177Q0(C2095b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment p = bVar.m39027p(i);
            if (!p.mAdded) {
                View requireView = p.requireView();
                p.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: S */
    private void m36174S(int i) {
        try {
            this.f4047b = true;
            this.f4048c.m35951d(i);
            m36173S0(i, false);
            if (f35705P) {
                for (AbstractC2997s sVar : m36107r()) {
                    sVar.m35876j();
                }
            }
            this.f4047b = false;
            m36157a0(true);
        } catch (Throwable th2) {
            this.f4047b = false;
            throw th2;
        }
    }

    /* renamed from: V */
    private void m36168V() {
        if (this.f35713H) {
            this.f35713H = false;
            m36105r1();
        }
    }

    /* renamed from: X */
    private void m36164X() {
        if (f35705P) {
            for (AbstractC2997s sVar : m36107r()) {
                sVar.m35876j();
            }
        } else if (!this.f4058m.isEmpty()) {
            for (Fragment fragment : this.f4058m.keySet()) {
                m36119n(fragment);
                m36171T0(fragment);
            }
        }
    }

    /* renamed from: Z */
    private void m36160Z(boolean z) {
        if (this.f4047b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f4063r == null) {
            if (this.f35712G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f4063r.m36219g().getLooper()) {
            if (!z) {
                m36113p();
            }
            if (this.f35714I == null) {
                this.f35714I = new ArrayList<>();
                this.f35715J = new ArrayList<>();
            }
            this.f4047b = true;
            try {
                m36142f0(null, null);
            } finally {
                this.f4047b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: a1 */
    private boolean m36156a1(String str, int i, int i2) {
        m36157a0(false);
        m36160Z(true);
        Fragment fragment = this.f4066u;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().m36159Z0()) {
            return true;
        }
        boolean b1 = m36153b1(this.f35714I, this.f35715J, str, i, i2);
        if (b1) {
            this.f4047b = true;
            try {
                m36141f1(this.f35714I, this.f35715J);
            } finally {
                m36110q();
            }
        }
        m36102s1();
        m36168V();
        this.f4048c.m35953b();
        return b1;
    }

    /* renamed from: c0 */
    private static void m36151c0(ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C2937a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.m36041t(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.m36036y(z);
            } else {
                aVar.m36041t(1);
                aVar.m36037x();
            }
            i++;
        }
    }

    /* renamed from: c1 */
    private int m36150c1(ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C2095b<Fragment> bVar) {
        boolean z;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C2937a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (!aVar.m36052E() || aVar.m36054C(arrayList, i4 + 1, i2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f35717L == null) {
                    this.f35717L = new ArrayList<>();
                }
                C2935p pVar = new C2935p(aVar, booleanValue);
                this.f35717L.add(pVar);
                aVar.m36050G(pVar);
                if (booleanValue) {
                    aVar.m36037x();
                } else {
                    aVar.m36036y(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m36149d(bVar);
            }
        }
        return i3;
    }

    /* renamed from: d */
    private void m36149d(C2095b<Fragment> bVar) {
        int i = this.f4062q;
        if (i >= 1) {
            int min = Math.min(i, 5);
            for (Fragment fragment : this.f4048c.m35941n()) {
                if (fragment.mState < min) {
                    m36169U0(fragment, min);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01be  */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m36148d0(java.util.ArrayList<androidx.fragment.app.C2937a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m36148d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: f0 */
    private void m36142f0(ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2) {
        int i;
        int indexOf;
        int indexOf2;
        ArrayList<C2935p> arrayList3 = this.f35717L;
        if (arrayList3 == null) {
            i = 0;
        } else {
            i = arrayList3.size();
        }
        int i2 = 0;
        while (i2 < i) {
            C2935p pVar = this.f35717L.get(i2);
            if (arrayList != null && !pVar.f4095a && (indexOf2 = arrayList.indexOf(pVar.f4096b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.f35717L.remove(i2);
                i2--;
                i--;
                pVar.m36077c();
            } else if (pVar.m36075e() || (arrayList != null && pVar.f4096b.m36054C(arrayList, 0, arrayList.size()))) {
                this.f35717L.remove(i2);
                i2--;
                i--;
                if (arrayList == null || pVar.f4095a || (indexOf = arrayList.indexOf(pVar.f4096b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    pVar.m36076d();
                } else {
                    pVar.m36077c();
                }
            }
            i2++;
        }
    }

    /* renamed from: f1 */
    private void m36141f1(ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m36142f0(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f4115r) {
                        if (i2 != i) {
                            m36148d0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f4115r) {
                                i2++;
                            }
                        }
                        m36148d0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m36148d0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: h0 */
    public static <F extends Fragment> F m36136h0(View view) {
        F f = (F) m36124l0(view);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    /* renamed from: h1 */
    private void m36135h1() {
        if (this.f4057l != null) {
            for (int i = 0; i < this.f4057l.size(); i++) {
                this.f4057l.get(i).onBackStackChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1 */
    public static int m36129j1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: l0 */
    private static Fragment m36124l0(View view) {
        while (view != null) {
            Fragment B0 = m36207B0(view);
            if (B0 != null) {
                return B0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* renamed from: m0 */
    private void m36121m0() {
        if (f35705P) {
            for (AbstractC2997s sVar : m36107r()) {
                sVar.m35875k();
            }
        } else if (this.f35717L != null) {
            while (!this.f35717L.isEmpty()) {
                this.f35717L.remove(0).m36076d();
            }
        }
    }

    /* renamed from: n */
    private void m36119n(Fragment fragment) {
        HashSet<C2437e> hashSet = this.f4058m.get(fragment);
        if (hashSet != null) {
            Iterator<C2437e> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m37745a();
            }
            hashSet.clear();
            m36095w(fragment);
            this.f4058m.remove(fragment);
        }
    }

    /* renamed from: n0 */
    private boolean m36118n0(ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f4046a) {
            if (this.f4046a.isEmpty()) {
                return false;
            }
            int size = this.f4046a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f4046a.get(i).mo36048a(arrayList, arrayList2);
            }
            this.f4046a.clear();
            this.f4063r.m36219g().removeCallbacks(this.f35719N);
            return z;
        }
    }

    /* renamed from: p */
    private void m36113p() {
        if (m36185M0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: p0 */
    private C2968j m36112p0(Fragment fragment) {
        return this.f35718M.m35987i(fragment);
    }

    /* renamed from: p1 */
    private void m36111p1(Fragment fragment) {
        ViewGroup r0 = m36106r0(fragment);
        if (r0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i = C10467b.f23090c;
            if (r0.getTag(i) == null) {
                r0.setTag(i, fragment);
            }
            ((Fragment) r0.getTag(i)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* renamed from: q */
    private void m36110q() {
        this.f4047b = false;
        this.f35715J.clear();
        this.f35714I.clear();
    }

    /* renamed from: r */
    private Set<AbstractC2997s> m36107r() {
        HashSet hashSet = new HashSet();
        for (C2973m mVar : this.f4048c.m35944k()) {
            ViewGroup viewGroup = mVar.m35966k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC2997s.m35871o(viewGroup, m36209A0()));
            }
        }
        return hashSet;
    }

    /* renamed from: r0 */
    private ViewGroup m36106r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4064s.mo36222d()) {
            View c = this.f4064s.mo36223c(fragment.mContainerId);
            if (c instanceof ViewGroup) {
                return (ViewGroup) c;
            }
        }
        return null;
    }

    /* renamed from: r1 */
    private void m36105r1() {
        for (C2973m mVar : this.f4048c.m35944k()) {
            m36163X0(mVar);
        }
    }

    /* renamed from: s */
    private Set<AbstractC2997s> m36104s(ArrayList<C2937a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<FragmentTransaction.C2936a> it = arrayList.get(i).f4100c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4118b;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(AbstractC2997s.m35872n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: s1 */
    private void m36102s1() {
        synchronized (this.f4046a) {
            boolean z = true;
            if (!this.f4046a.isEmpty()) {
                this.f4053h.m41000f(true);
                return;
            }
            AbstractC1486b bVar = this.f4053h;
            if (m36115o0() <= 0 || !m36189K0(this.f4065t)) {
                z = false;
            }
            bVar.m41000f(z);
        }
    }

    /* renamed from: u */
    private void m36099u(Fragment fragment) {
        int i;
        Animator animator;
        if (fragment.mView != null) {
            C2954d.C0057d c = C2954d.m36012c(this.f4063r.m36220f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (c == null || (animator = c.f4200b) == null) {
                if (c != null) {
                    fragment.mView.startAnimation(c.f4199a);
                    c.f4199a.start();
                }
                if (!fragment.mHidden || fragment.isHideReplaced()) {
                    i = 0;
                } else {
                    i = 8;
                }
                fragment.mView.setVisibility(i);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    c.f4200b.addListener(new C2926h(viewGroup, view, fragment));
                }
                c.f4200b.start();
            }
        }
        m36199F0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: w */
    private void m36095w(Fragment fragment) {
        fragment.performDestroyView();
        this.f4060o.m35993n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo35726o(null);
        fragment.mInLayout = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m36210A(Configuration configuration) {
        for (Fragment fragment : this.f4048c.m35941n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public AbstractC3006t m36209A0() {
        AbstractC3006t tVar = this.f4069x;
        if (tVar != null) {
            return tVar;
        }
        Fragment fragment = this.f4065t;
        if (fragment != null) {
            return fragment.mFragmentManager.m36209A0();
        }
        return this.f4070y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m36208B(MenuItem menuItem) {
        if (this.f4062q < 1) {
            return false;
        }
        for (Fragment fragment : this.f4048c.m35941n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m36206C() {
        this.f35710E = false;
        this.f35711F = false;
        this.f35718M.m35981o(false);
        m36174S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public ViewModelStore m36205C0(Fragment fragment) {
        return this.f35718M.m35984l(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m36204D(Menu menu, MenuInflater menuInflater) {
        if (this.f4062q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f4048c.m35941n()) {
            if (fragment != null && m36191J0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f4050e != null) {
            for (int i = 0; i < this.f4050e.size(); i++) {
                Fragment fragment2 = this.f4050e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4050e = arrayList;
        return z;
    }

    /* renamed from: D0 */
    void m36203D0() {
        m36157a0(true);
        if (this.f4053h.m41003c()) {
            m36159Z0();
        } else {
            this.f4052g.m41005c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m36202E() {
        this.f35712G = true;
        m36157a0(true);
        m36164X();
        m36174S(-1);
        this.f4063r = null;
        this.f4064s = null;
        this.f4065t = null;
        if (this.f4052g != null) {
            this.f4053h.m41002d();
            this.f4052g = null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.f4071z;
        if (activityResultLauncher != null) {
            activityResultLauncher.mo36252c();
            this.f35706A.mo36252c();
            this.f35707B.mo36252c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m36201E0(Fragment fragment) {
        if (m36195H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            m36111p1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m36200F() {
        m36174S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void m36199F0(Fragment fragment) {
        if (fragment.mAdded && m36193I0(fragment)) {
            this.f35709D = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m36198G() {
        for (Fragment fragment : this.f4048c.m35941n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* renamed from: G0 */
    public boolean m36197G0() {
        return this.f35712G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m36196H(boolean z) {
        for (Fragment fragment : this.f4048c.m35941n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m36194I(Fragment fragment) {
        Iterator<AbstractC2970k> it = this.f4061p.iterator();
        while (it.hasNext()) {
            it.next().mo35979a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean m36192J(MenuItem menuItem) {
        if (this.f4062q < 1) {
            return false;
        }
        for (Fragment fragment : this.f4048c.m35941n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean m36191J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m36190K(Menu menu) {
        if (this.f4062q >= 1) {
            for (Fragment fragment : this.f4048c.m35941n()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public boolean m36189K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.m36088z0()) || !m36189K0(fragmentManager.f4065t)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean m36187L0(int i) {
        return this.f4062q >= i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m36186M() {
        m36174S(5);
    }

    /* renamed from: M0 */
    public boolean m36185M0() {
        return this.f35710E || this.f35711F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m36184N(boolean z) {
        for (Fragment fragment : this.f4048c.m35941n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void m36183N0(Fragment fragment, String[] strArr, int i) {
        if (this.f35707B != null) {
            this.f35708C.addLast(new C2930l(fragment.mWho, i));
            this.f35707B.m40994a(strArr);
            return;
        }
        this.f4063r.m36216j(fragment, strArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean m36182O(Menu menu) {
        boolean z = false;
        if (this.f4062q < 1) {
            return false;
        }
        for (Fragment fragment : this.f4048c.m35941n()) {
            if (fragment != null && m36191J0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void m36181O0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f4071z != null) {
            this.f35708C.addLast(new C2930l(fragment.mWho, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f4071z.m40994a(intent);
            return;
        }
        this.f4063r.m36213m(fragment, intent, i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m36180P() {
        m36102s1();
        m36188L(this.f4066u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void m36179P0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.f35706A != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m36195H0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            C1494c a = new C1494c.C1496b(intentSender).m40967b(intent2).m40966c(i3, i2).m40968a();
            this.f35708C.addLast(new C2930l(fragment.mWho, i));
            if (m36195H0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.f35706A.m40994a(a);
            return;
        }
        this.f4063r.m36212n(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m36178Q() {
        this.f35710E = false;
        this.f35711F = false;
        this.f35718M.m35981o(false);
        m36174S(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m36176R() {
        this.f35710E = false;
        this.f35711F = false;
        this.f35718M.m35981o(false);
        m36174S(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void m36175R0(Fragment fragment) {
        if (this.f4048c.m35952c(fragment.mWho)) {
            m36171T0(fragment);
            View view = fragment.mView;
            if (!(view == null || !fragment.mIsNewlyAdded || fragment.mContainer == null)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    view.setAlpha(f);
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                C2954d.C0057d c = C2954d.m36012c(this.f4063r.m36220f(), fragment, true, fragment.getPopDirection());
                if (c != null) {
                    Animation animation = c.f4199a;
                    if (animation != null) {
                        fragment.mView.startAnimation(animation);
                    } else {
                        c.f4200b.setTarget(fragment.mView);
                        c.f4200b.start();
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                m36099u(fragment);
            }
        } else if (m36195H0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f4062q + "since it is not added to " + this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void m36173S0(int i, boolean z) {
        FragmentHostCallback<?> fragmentHostCallback;
        boolean z2;
        if (this.f4063r == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f4062q) {
            this.f4062q = i;
            if (f35705P) {
                this.f4048c.m35937r();
            } else {
                for (Fragment fragment : this.f4048c.m35941n()) {
                    m36175R0(fragment);
                }
                for (C2973m mVar : this.f4048c.m35944k()) {
                    Fragment k = mVar.m35966k();
                    if (!k.mIsNewlyAdded) {
                        m36175R0(k);
                    }
                    if (!k.mRemoving || k.isInBackStack()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        this.f4048c.m35938q(mVar);
                    }
                }
            }
            m36105r1();
            if (this.f35709D && (fragmentHostCallback = this.f4063r) != null && this.f4062q == 7) {
                fragmentHostCallback.mo36211o();
                this.f35709D = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m36172T() {
        this.f35711F = true;
        this.f35718M.m35981o(true);
        m36174S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void m36171T0(Fragment fragment) {
        m36169U0(fragment, this.f4062q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m36170U() {
        m36174S(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r2 != 5) goto L_0x0165;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0161  */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m36169U0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m36169U0(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void m36167V0() {
        if (this.f4063r != null) {
            this.f35710E = false;
            this.f35711F = false;
            this.f35718M.m35981o(false);
            for (Fragment fragment : this.f4048c.m35941n()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    /* renamed from: W */
    public void m36166W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4048c.m35950e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f4050e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f4050e.get(i).toString());
            }
        }
        ArrayList<C2937a> arrayList2 = this.f4049d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C2937a aVar = this.f4049d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.m36039v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4054i.get());
        synchronized (this.f4046a) {
            int size3 = this.f4046a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f4046a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4063r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4064s);
        if (this.f4065t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4065t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4062q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f35710E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f35711F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f35712G);
        if (this.f35709D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f35709D);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void m36165W0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C2973m mVar : this.f4048c.m35944k()) {
            Fragment k = mVar.m35966k();
            if (k.mContainerId == fragmentContainerView.getId() && (view = k.mView) != null && view.getParent() == null) {
                k.mContainer = fragmentContainerView;
                mVar.m35975b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void m36163X0(C2973m mVar) {
        Fragment k = mVar.m35966k();
        if (!k.mDeferStart) {
            return;
        }
        if (this.f4047b) {
            this.f35713H = true;
            return;
        }
        k.mDeferStart = false;
        if (f35705P) {
            mVar.m35964m();
        } else {
            m36171T0(k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m36162Y(AbstractC2933n nVar, boolean z) {
        if (!z) {
            if (this.f4063r != null) {
                m36113p();
            } else if (this.f35712G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f4046a) {
            if (this.f4063r != null) {
                this.f4046a.add(nVar);
                m36123l1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: Y0 */
    public void m36161Y0(int i, int i2) {
        if (i >= 0) {
            m36162Y(new C2934o(null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: Z0 */
    public boolean m36159Z0() {
        return m36156a1(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean m36157a0(boolean z) {
        m36160Z(z);
        boolean z2 = false;
        while (m36118n0(this.f35714I, this.f35715J)) {
            z2 = true;
            this.f4047b = true;
            try {
                m36141f1(this.f35714I, this.f35715J);
            } finally {
                m36110q();
            }
        }
        m36102s1();
        m36168V();
        this.f4048c.m35953b();
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m36154b0(AbstractC2933n nVar, boolean z) {
        if (!z || (this.f4063r != null && !this.f35712G)) {
            m36160Z(z);
            if (nVar.mo36048a(this.f35714I, this.f35715J)) {
                this.f4047b = true;
                try {
                    m36141f1(this.f35714I, this.f35715J);
                } finally {
                    m36110q();
                }
            }
            m36102s1();
            m36168V();
            this.f4048c.m35953b();
        }
    }

    /* renamed from: b1 */
    boolean m36153b1(ArrayList<C2937a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C2937a> arrayList3 = this.f4049d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f4049d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C2937a aVar = this.f4049d.get(size2);
                    if ((str != null && str.equals(aVar.m36056A())) || (i >= 0 && i == aVar.f4131v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C2937a aVar2 = this.f4049d.get(size2);
                        if (str == null || !str.equals(aVar2.m36056A())) {
                            if (i < 0 || i != aVar2.f4131v) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f4049d.size() - 1) {
                return false;
            }
            for (int size3 = this.f4049d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f4049d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: d1 */
    void m36147d1(Fragment fragment, C2437e eVar) {
        HashSet<C2437e> hashSet = this.f4058m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f4058m.remove(fragment);
            if (fragment.mState < 5) {
                m36095w(fragment);
                m36171T0(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36146e(C2937a aVar) {
        if (this.f4049d == null) {
            this.f4049d = new ArrayList<>();
        }
        this.f4049d.add(aVar);
    }

    /* renamed from: e0 */
    public boolean m36145e0() {
        boolean a0 = m36157a0(true);
        m36121m0();
        return a0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void m36144e1(Fragment fragment) {
        if (m36195H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f4048c.m35936s(fragment);
            if (m36193I0(fragment)) {
                this.f35709D = true;
            }
            fragment.mRemoving = true;
            m36111p1(fragment);
        }
    }

    /* renamed from: f */
    void m36143f(Fragment fragment, C2437e eVar) {
        if (this.f4058m.get(fragment) == null) {
            this.f4058m.put(fragment, new HashSet<>());
        }
        this.f4058m.get(fragment).add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C2973m m36140g(Fragment fragment) {
        if (m36195H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C2973m v = m36097v(fragment);
        fragment.mFragmentManager = this;
        this.f4048c.m35939p(v);
        if (!fragment.mDetached) {
            this.f4048c.m35954a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m36193I0(fragment)) {
                this.f35709D = true;
            }
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public Fragment m36139g0(String str) {
        return this.f4048c.m35949f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void m36138g1(Fragment fragment) {
        this.f35718M.m35982n(fragment);
    }

    /* renamed from: h */
    public void m36137h(AbstractC2970k kVar) {
        this.f4061p.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m36134i(Fragment fragment) {
        this.f35718M.m35990f(fragment);
    }

    /* renamed from: i0 */
    public Fragment m36133i0(int i) {
        return this.f4048c.m35948g(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void m36132i1(Parcelable parcelable) {
        C2973m mVar;
        if (parcelable != null) {
            C2966i iVar = (C2966i) parcelable;
            if (iVar.f4213k != null) {
                this.f4048c.m35935t();
                Iterator<C2971l> it = iVar.f4213k.iterator();
                while (it.hasNext()) {
                    C2971l next = it.next();
                    if (next != null) {
                        Fragment h = this.f35718M.m35988h(next.f4230l);
                        if (h != null) {
                            if (m36195H0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h);
                            }
                            mVar = new C2973m(this.f4060o, this.f4048c, h, next);
                        } else {
                            mVar = new C2973m(this.f4060o, this.f4048c, this.f4063r.m36220f().getClassLoader(), m36103s0(), next);
                        }
                        Fragment k = mVar.m35966k();
                        k.mFragmentManager = this;
                        if (m36195H0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k.mWho + "): " + k);
                        }
                        mVar.m35962o(this.f4063r.m36220f().getClassLoader());
                        this.f4048c.m35939p(mVar);
                        mVar.m35957t(this.f4062q);
                    }
                }
                for (Fragment fragment : this.f35718M.m35985k()) {
                    if (!this.f4048c.m35952c(fragment.mWho)) {
                        if (m36195H0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + iVar.f4213k);
                        }
                        this.f35718M.m35982n(fragment);
                        fragment.mFragmentManager = this;
                        C2973m mVar2 = new C2973m(this.f4060o, this.f4048c, fragment);
                        mVar2.m35957t(1);
                        mVar2.m35964m();
                        fragment.mRemoving = true;
                        mVar2.m35964m();
                    }
                }
                this.f4048c.m35934u(iVar.f4214l);
                if (iVar.f4215m != null) {
                    this.f4049d = new ArrayList<>(iVar.f4215m.length);
                    int i = 0;
                    while (true) {
                        C2938b[] bVarArr = iVar.f4215m;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        C2937a a = bVarArr[i].m36034a(this);
                        if (m36195H0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + a.f4131v + "): " + a);
                            PrintWriter printWriter = new PrintWriter(new C2996r("FragmentManager"));
                            a.m36038w("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f4049d.add(a);
                        i++;
                    }
                } else {
                    this.f4049d = null;
                }
                this.f4054i.set(iVar.f4216n);
                String str = iVar.f4217o;
                if (str != null) {
                    Fragment g0 = m36139g0(str);
                    this.f4066u = g0;
                    m36188L(g0);
                }
                ArrayList<String> arrayList = iVar.f4218p;
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Bundle bundle = iVar.f4219q.get(i2);
                        bundle.setClassLoader(this.f4063r.m36220f().getClassLoader());
                        this.f4055j.put(arrayList.get(i2), bundle);
                    }
                }
                this.f35708C = new ArrayDeque<>(iVar.f4220r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m36131j() {
        return this.f4054i.getAndIncrement();
    }

    /* renamed from: j0 */
    public Fragment m36130j0(String str) {
        return this.f4048c.m35947h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: k */
    public void m36128k(FragmentHostCallback<?> fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        String str;
        if (this.f4063r == null) {
            this.f4063r = fragmentHostCallback;
            this.f4064s = fragmentContainer;
            this.f4065t = fragment;
            if (fragment != null) {
                m36137h(new C2927i(fragment));
            } else if (fragmentHostCallback instanceof AbstractC2970k) {
                m36137h((AbstractC2970k) fragmentHostCallback);
            }
            if (this.f4065t != null) {
                m36102s1();
            }
            if (fragmentHostCallback instanceof AbstractC1487c) {
                AbstractC1487c cVar = (AbstractC1487c) fragmentHostCallback;
                OnBackPressedDispatcher onBackPressedDispatcher = cVar.getOnBackPressedDispatcher();
                this.f4052g = onBackPressedDispatcher;
                LifecycleOwner lifecycleOwner = cVar;
                if (fragment != null) {
                    lifecycleOwner = fragment;
                }
                onBackPressedDispatcher.m41007a(lifecycleOwner, this.f4053h);
            }
            if (fragment != null) {
                this.f35718M = fragment.mFragmentManager.m36112p0(fragment);
            } else if (fragmentHostCallback instanceof AbstractC3056x) {
                this.f35718M = C2968j.m35986j(((AbstractC3056x) fragmentHostCallback).getViewModelStore());
            } else {
                this.f35718M = new C2968j(false);
            }
            this.f35718M.m35981o(m36185M0());
            this.f4048c.m35931x(this.f35718M);
            FragmentHostCallback<?> fragmentHostCallback2 = this.f4063r;
            if (fragmentHostCallback2 instanceof AbstractC1493b) {
                ActivityResultRegistry activityResultRegistry = ((AbstractC1493b) fragmentHostCallback2).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f4071z = activityResultRegistry.m40985i(str2 + "StartActivityForResult", new C3748a(), new C2928j());
                this.f35706A = activityResultRegistry.m40985i(str2 + "StartIntentSenderForResult", new C2929k(), new C2919a());
                this.f35707B = activityResultRegistry.m40985i(str2 + "RequestPermissions", new C1498a(), new C2920b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public Fragment m36127k0(String str) {
        return this.f4048c.m35946i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1 */
    public Parcelable m36126k1() {
        int size;
        m36121m0();
        m36164X();
        m36157a0(true);
        this.f35710E = true;
        this.f35718M.m35981o(true);
        ArrayList<C2971l> v = this.f4048c.m35933v();
        C2938b[] bVarArr = null;
        if (v.isEmpty()) {
            if (m36195H0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w = this.f4048c.m35932w();
        ArrayList<C2937a> arrayList = this.f4049d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new C2938b[size];
            for (int i = 0; i < size; i++) {
                bVarArr[i] = new C2938b(this.f4049d.get(i));
                if (m36195H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f4049d.get(i));
                }
            }
        }
        C2966i iVar = new C2966i();
        iVar.f4213k = v;
        iVar.f4214l = w;
        iVar.f4215m = bVarArr;
        iVar.f4216n = this.f4054i.get();
        Fragment fragment = this.f4066u;
        if (fragment != null) {
            iVar.f4217o = fragment.mWho;
        }
        iVar.f4218p.addAll(this.f4055j.keySet());
        iVar.f4219q.addAll(this.f4055j.values());
        iVar.f4220r = new ArrayList<>(this.f35708C);
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m36125l(Fragment fragment) {
        if (m36195H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f4048c.m35954a(fragment);
                if (m36195H0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m36193I0(fragment)) {
                    this.f35709D = true;
                }
            }
        }
    }

    /* renamed from: l1 */
    void m36123l1() {
        boolean z;
        synchronized (this.f4046a) {
            ArrayList<C2935p> arrayList = this.f35717L;
            boolean z2 = false;
            if (arrayList == null || arrayList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f4046a.size() == 1) {
                z2 = true;
            }
            if (z || z2) {
                this.f4063r.m36219g().removeCallbacks(this.f35719N);
                this.f4063r.m36219g().post(this.f35719N);
                m36102s1();
            }
        }
    }

    /* renamed from: m */
    public FragmentTransaction m36122m() {
        return new C2937a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void m36120m1(Fragment fragment, boolean z) {
        ViewGroup r0 = m36106r0(fragment);
        if (r0 != null && (r0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) r0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void m36117n1(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(m36139g0(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    /* renamed from: o */
    boolean m36116o() {
        boolean z = false;
        for (Fragment fragment : this.f4048c.m35943l()) {
            if (fragment != null) {
                z = m36193I0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    public int m36115o0() {
        ArrayList<C2937a> arrayList = this.f4049d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void m36114o1(Fragment fragment) {
        if (fragment == null || (fragment.equals(m36139g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f4066u;
            this.f4066u = fragment;
            m36188L(fragment2);
            m36188L(this.f4066u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public FragmentContainer m36109q0() {
        return this.f4064s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void m36108q1(Fragment fragment) {
        if (m36195H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: s0 */
    public C2960e m36103s0() {
        C2960e eVar = this.f4067v;
        if (eVar != null) {
            return eVar;
        }
        Fragment fragment = this.f4065t;
        if (fragment != null) {
            return fragment.mFragmentManager.m36103s0();
        }
        return this.f4068w;
    }

    /* renamed from: t */
    void m36101t(C2937a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.m36036y(z3);
        } else {
            aVar.m36037x();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f4062q >= 1) {
            C2977o.m35928C(this.f4063r.m36220f(), this.f4064s, arrayList, arrayList2, 0, 1, true, this.f4059n);
        }
        if (z3) {
            m36173S0(this.f4062q, true);
        }
        for (Fragment fragment : this.f4048c.m35943l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.m36055B(fragment.mContainerId)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    fragment.mView.setAlpha(f);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public C2976n m36100t0() {
        return this.f4048c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f4065t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f4065t)));
            sb2.append("}");
        } else {
            FragmentHostCallback<?> fragmentHostCallback = this.f4063r;
            if (fragmentHostCallback != null) {
                sb2.append(fragmentHostCallback.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f4063r)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* renamed from: u0 */
    public List<Fragment> m36098u0() {
        return this.f4048c.m35941n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C2973m m36097v(Fragment fragment) {
        C2973m m = this.f4048c.m35942m(fragment.mWho);
        if (m != null) {
            return m;
        }
        C2973m mVar = new C2973m(this.f4060o, this.f4048c, fragment);
        mVar.m35962o(this.f4063r.m36220f().getClassLoader());
        mVar.m35957t(this.f4062q);
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public FragmentHostCallback<?> m36096v0() {
        return this.f4063r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public LayoutInflater.Factory2 m36094w0() {
        return this.f4051f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m36093x(Fragment fragment) {
        if (m36195H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m36195H0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f4048c.m35936s(fragment);
                if (m36193I0(fragment)) {
                    this.f35709D = true;
                }
                m36111p1(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public C2963g m36092x0() {
        return this.f4060o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m36091y() {
        this.f35710E = false;
        this.f35711F = false;
        this.f35718M.m35981o(false);
        m36174S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public Fragment m36090y0() {
        return this.f4065t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m36089z() {
        this.f35710E = false;
        this.f35711F = false;
        this.f35718M.m35981o(false);
        m36174S(0);
    }

    /* renamed from: z0 */
    public Fragment m36088z0() {
        return this.f4066u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.FragmentManager$l */
    /* loaded from: classes.dex */
    public static class C2930l implements Parcelable {
        public static final Parcelable.Creator<C2930l> CREATOR = new C2931a();

        /* renamed from: k */
        String f4089k;

        /* renamed from: l */
        int f4090l;

        /* renamed from: androidx.fragment.app.FragmentManager$l$a */
        /* loaded from: classes.dex */
        class C2931a implements Parcelable.Creator<C2930l> {
            C2931a() {
            }

            /* renamed from: a */
            public C2930l createFromParcel(Parcel parcel) {
                return new C2930l(parcel);
            }

            /* renamed from: b */
            public C2930l[] newArray(int i) {
                return new C2930l[i];
            }
        }

        C2930l(String str, int i) {
            this.f4089k = str;
            this.f4090l = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f4089k);
            parcel.writeInt(this.f4090l);
        }

        C2930l(Parcel parcel) {
            this.f4089k = parcel.readString();
            this.f4090l = parcel.readInt();
        }
    }
}
