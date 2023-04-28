package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.C2410e;
import androidx.core.provider.C2476g;
import androidx.core.util.AbstractC2511b;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p341t0.C12936a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.f */
/* loaded from: classes.dex */
public class C2470f {

    /* renamed from: a */
    static final C12936a<String, Typeface> f3404a = new C12936a<>(16);

    /* renamed from: b */
    private static final ExecutorService f3405b = C2480h.m37666a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f3406c = new Object();

    /* renamed from: d */
    static final SimpleArrayMap<String, ArrayList<AbstractC2511b<C2475e>>> f3407d = new SimpleArrayMap<>();

    /* renamed from: androidx.core.provider.f$a */
    /* loaded from: classes.dex */
    class CallableC2471a implements Callable<C2475e> {

        /* renamed from: a */
        final /* synthetic */ String f3408a;

        /* renamed from: b */
        final /* synthetic */ Context f3409b;

        /* renamed from: c */
        final /* synthetic */ C2469e f3410c;

        /* renamed from: d */
        final /* synthetic */ int f3411d;

        CallableC2471a(String str, Context context, C2469e eVar, int i) {
            this.f3408a = str;
            this.f3409b = context;
            this.f3410c = eVar;
            this.f3411d = i;
        }

        /* renamed from: a */
        public C2475e call() {
            return C2470f.m37688c(this.f3408a, this.f3409b, this.f3410c, this.f3411d);
        }
    }

    /* renamed from: androidx.core.provider.f$b */
    /* loaded from: classes.dex */
    class C2472b implements AbstractC2511b<C2475e> {

        /* renamed from: a */
        final /* synthetic */ C2463a f3412a;

        C2472b(C2463a aVar) {
            this.f3412a = aVar;
        }

        /* renamed from: a */
        public void accept(C2475e eVar) {
            if (eVar == null) {
                eVar = new C2475e(-3);
            }
            this.f3412a.m37709b(eVar);
        }
    }

    /* renamed from: androidx.core.provider.f$c */
    /* loaded from: classes.dex */
    class CallableC2473c implements Callable<C2475e> {

        /* renamed from: a */
        final /* synthetic */ String f3413a;

        /* renamed from: b */
        final /* synthetic */ Context f3414b;

        /* renamed from: c */
        final /* synthetic */ C2469e f3415c;

        /* renamed from: d */
        final /* synthetic */ int f3416d;

        CallableC2473c(String str, Context context, C2469e eVar, int i) {
            this.f3413a = str;
            this.f3414b = context;
            this.f3415c = eVar;
            this.f3416d = i;
        }

        /* renamed from: a */
        public C2475e call() {
            try {
                return C2470f.m37688c(this.f3413a, this.f3414b, this.f3415c, this.f3416d);
            } catch (Throwable unused) {
                return new C2475e(-3);
            }
        }
    }

    /* renamed from: androidx.core.provider.f$d */
    /* loaded from: classes.dex */
    class C2474d implements AbstractC2511b<C2475e> {

        /* renamed from: a */
        final /* synthetic */ String f3417a;

        C2474d(String str) {
            this.f3417a = str;
        }

        /* renamed from: a */
        public void accept(C2475e eVar) {
            synchronized (C2470f.f3406c) {
                SimpleArrayMap<String, ArrayList<AbstractC2511b<C2475e>>> simpleArrayMap = C2470f.f3407d;
                ArrayList<AbstractC2511b<C2475e>> arrayList = simpleArrayMap.get(this.f3417a);
                if (arrayList != null) {
                    simpleArrayMap.remove(this.f3417a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(eVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static String m37690a(C2469e eVar, int i) {
        return eVar.m37694d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m37689b(C2476g.C2477a aVar) {
        int i = 1;
        if (aVar.m37675c() == 0) {
            C2476g.C2478b[] b = aVar.m37676b();
            if (!(b == null || b.length == 0)) {
                i = 0;
                for (C2476g.C2478b bVar : b) {
                    int b2 = bVar.m37673b();
                    if (b2 != 0) {
                        if (b2 < 0) {
                            return -3;
                        } else {
                            return b2;
                        }
                    }
                }
            }
            return i;
        } else if (aVar.m37675c() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    /* renamed from: c */
    static C2475e m37688c(String str, Context context, C2469e eVar, int i) {
        C12936a<String, Typeface> aVar = f3404a;
        Typeface c = aVar.m5032c(str);
        if (c != null) {
            return new C2475e(c);
        }
        try {
            C2476g.C2477a e = C2467d.m37702e(context, eVar, null);
            int b = m37689b(e);
            if (b != 0) {
                return new C2475e(b);
            }
            Typeface b2 = C2410e.m37799b(context, null, e.m37676b(), i);
            if (b2 == null) {
                return new C2475e(-3);
            }
            aVar.m5031d(str, b2);
            return new C2475e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C2475e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Typeface m37687d(Context context, C2469e eVar, int i, Executor executor, C2463a aVar) {
        String a = m37690a(eVar, i);
        Typeface c = f3404a.m5032c(a);
        if (c != null) {
            aVar.m37709b(new C2475e(c));
            return c;
        }
        C2472b bVar = new C2472b(aVar);
        synchronized (f3406c) {
            SimpleArrayMap<String, ArrayList<AbstractC2511b<C2475e>>> simpleArrayMap = f3407d;
            ArrayList<AbstractC2511b<C2475e>> arrayList = simpleArrayMap.get(a);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<AbstractC2511b<C2475e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            simpleArrayMap.put(a, arrayList2);
            CallableC2473c cVar = new CallableC2473c(a, context, eVar, i);
            if (executor == null) {
                executor = f3405b;
            }
            C2480h.m37665b(executor, cVar, new C2474d(a));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Typeface m37686e(Context context, C2469e eVar, C2463a aVar, int i, int i2) {
        String a = m37690a(eVar, i);
        Typeface c = f3404a.m5032c(a);
        if (c != null) {
            aVar.m37709b(new C2475e(c));
            return c;
        } else if (i2 == -1) {
            C2475e c2 = m37688c(a, context, eVar, i);
            aVar.m37709b(c2);
            return c2.f3418a;
        } else {
            try {
                C2475e eVar2 = (C2475e) C2480h.m37664c(f3405b, new CallableC2471a(a, context, eVar, i), i2);
                aVar.m37709b(eVar2);
                return eVar2.f3418a;
            } catch (InterruptedException unused) {
                aVar.m37709b(new C2475e(-3));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$e */
    /* loaded from: classes.dex */
    public static final class C2475e {

        /* renamed from: a */
        final Typeface f3418a;

        /* renamed from: b */
        final int f3419b;

        C2475e(int i) {
            this.f3418a = null;
            this.f3419b = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean m37681a() {
            return this.f3419b == 0;
        }

        @SuppressLint({"WrongConstant"})
        C2475e(Typeface typeface) {
            this.f3418a = typeface;
            this.f3419b = 0;
        }
    }
}
