package p136hc;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.camera.view.C2062h;
import androidx.collection.C2094a;
import androidx.core.p018os.C2461v;
import ca.C3796c;
import ca.C3803j;
import ca.C3804k;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C5372a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p177jc.C9523d;
import p177jc.C9530g;
import p177jc.C9540n;
import p177jc.C9554w;
import p300qc.AbstractC12105c;
import p321rc.C12559g;
import p420x9.C13996n;
import p420x9.C14004p;
import p463zc.C14616a;
import tc.AbstractC13053b;

/* renamed from: hc.d */
/* loaded from: classes3.dex */
public class C7984d {

    /* renamed from: k */
    private static final Object f17202k = new Object();

    /* renamed from: l */
    private static final Executor f17203l = new ExecutorC0248d();

    /* renamed from: m */
    static final Map<String, C7984d> f17204m = new C2094a();

    /* renamed from: a */
    private final Context f17205a;

    /* renamed from: b */
    private final String f17206b;

    /* renamed from: c */
    private final C7995k f17207c;

    /* renamed from: d */
    private final C9540n f17208d;

    /* renamed from: g */
    private final C9554w<C14616a> f17211g;

    /* renamed from: h */
    private final AbstractC13053b<C12559g> f17212h;

    /* renamed from: e */
    private final AtomicBoolean f17209e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f17210f = new AtomicBoolean();

    /* renamed from: i */
    private final List<AbstractC7986b> f17213i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List<Object> f17214j = new CopyOnWriteArrayList();

    /* renamed from: hc.d$b */
    /* loaded from: classes3.dex */
    public interface AbstractC7986b {
        /* renamed from: a */
        void mo20952a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: hc.d$c */
    /* loaded from: classes3.dex */
    public static class C7987c implements ComponentCallbacks2C5372a.AbstractC0150a {

        /* renamed from: a */
        private static AtomicReference<C7987c> f17215a = new AtomicReference<>();

        private C7987c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m20949c(Context context) {
            if (C3803j.m33566a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f17215a.get() == null) {
                    C7987c cVar = new C7987c();
                    if (C2062h.m39137a(f17215a, null, cVar)) {
                        ComponentCallbacks2C5372a.m29099c(application);
                        ComponentCallbacks2C5372a.m29100b().m29101a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C5372a.AbstractC0150a
        /* renamed from: a */
        public void mo20951a(boolean z) {
            synchronized (C7984d.f17202k) {
                Iterator it = new ArrayList(C7984d.f17204m.values()).iterator();
                while (it.hasNext()) {
                    C7984d dVar = (C7984d) it.next();
                    if (dVar.f17209e.get()) {
                        dVar.m20953x(z);
                    }
                }
            }
        }
    }

    /* renamed from: hc.d$d */
    /* loaded from: classes3.dex */
    private static class ExecutorC0248d implements Executor {

        /* renamed from: k */
        private static final Handler f17216k = new Handler(Looper.getMainLooper());

        private ExecutorC0248d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f17216k.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(24)
    /* renamed from: hc.d$e */
    /* loaded from: classes3.dex */
    public static class C7988e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C7988e> f17217b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f17218a;

        public C7988e(Context context) {
            this.f17218a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m20947b(Context context) {
            if (f17217b.get() == null) {
                C7988e eVar = new C7988e(context);
                if (C2062h.m39137a(f17217b, null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m20946c() {
            this.f17218a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C7984d.f17202k) {
                for (C7984d dVar : C7984d.f17204m.values()) {
                    dVar.m20962o();
                }
            }
            m20946c();
        }
    }

    protected C7984d(final Context context, String str, C7995k kVar) {
        this.f17205a = (Context) C14004p.m2051j(context);
        this.f17206b = C14004p.m2055f(str);
        this.f17207c = (C7995k) C14004p.m2051j(kVar);
        C9540n e = C9540n.m16055h(f17203l).m16040d(C9530g.m16068c(context, ComponentDiscoveryService.class).m16069b()).m16041c(new FirebaseCommonRegistrar()).m16042b(C9523d.m16079p(context, Context.class, new Class[0])).m16042b(C9523d.m16079p(this, C7984d.class, new Class[0])).m16042b(C9523d.m16079p(kVar, C7995k.class, new Class[0])).m16039e();
        this.f17208d = e;
        this.f17211g = new C9554w<>(new AbstractC13053b() { // from class: hc.b
            @Override // tc.AbstractC13053b
            public final Object get() {
                C14616a u;
                u = C7984d.this.m20956u(context);
                return u;
            }
        });
        this.f17212h = e.mo16059d(C12559g.class);
        m20970g(new AbstractC7986b() { // from class: hc.c
            @Override // p136hc.C7984d.AbstractC7986b
            /* renamed from: a */
            public final void mo20952a(boolean z) {
                C7984d.this.m20955v(z);
            }
        });
    }

    /* renamed from: h */
    private void m20969h() {
        C14004p.m2048m(!this.f17210f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: k */
    public static C7984d m20966k() {
        C7984d dVar;
        synchronized (f17202k) {
            dVar = f17204m.get("[DEFAULT]");
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C3804k.m33555a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m20962o() {
        if (!C2461v.m37712a(this.f17205a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m20965l());
            C7988e.m20947b(this.f17205a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m20965l());
        this.f17208d.m16052k(m20957t());
        this.f17212h.get().m6552n();
    }

    /* renamed from: p */
    public static C7984d m20961p(Context context) {
        synchronized (f17202k) {
            if (f17204m.containsKey("[DEFAULT]")) {
                return m20966k();
            }
            C7995k a = C7995k.m20943a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m20960q(context, a);
        }
    }

    /* renamed from: q */
    public static C7984d m20960q(Context context, C7995k kVar) {
        return m20959r(context, kVar, "[DEFAULT]");
    }

    /* renamed from: r */
    public static C7984d m20959r(Context context, C7995k kVar, String str) {
        boolean z;
        C7984d dVar;
        C7987c.m20949c(context);
        String w = m20954w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f17202k) {
            Map<String, C7984d> map = f17204m;
            if (!map.containsKey(w)) {
                z = true;
            } else {
                z = false;
            }
            C14004p.m2048m(z, "FirebaseApp name " + w + " already exists!");
            C14004p.m2050k(context, "Application context cannot be null.");
            dVar = new C7984d(context, w, kVar);
            map.put(w, dVar);
        }
        dVar.m20962o();
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ C14616a m20956u(Context context) {
        return new C14616a(context, m20963n(), (AbstractC12105c) this.f17208d.mo16062a(AbstractC12105c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m20955v(boolean z) {
        if (!z) {
            this.f17212h.get().m6552n();
        }
    }

    /* renamed from: w */
    private static String m20954w(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m20953x(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (AbstractC7986b bVar : this.f17213i) {
            bVar.mo20952a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7984d)) {
            return false;
        }
        return this.f17206b.equals(((C7984d) obj).m20965l());
    }

    /* renamed from: g */
    public void m20970g(AbstractC7986b bVar) {
        m20969h();
        if (this.f17209e.get() && ComponentCallbacks2C5372a.m29100b().m29098d()) {
            bVar.mo20952a(true);
        }
        this.f17213i.add(bVar);
    }

    public int hashCode() {
        return this.f17206b.hashCode();
    }

    /* renamed from: i */
    public <T> T m20968i(Class<T> cls) {
        m20969h();
        return (T) this.f17208d.mo16062a(cls);
    }

    /* renamed from: j */
    public Context m20967j() {
        m20969h();
        return this.f17205a;
    }

    /* renamed from: l */
    public String m20965l() {
        m20969h();
        return this.f17206b;
    }

    /* renamed from: m */
    public C7995k m20964m() {
        m20969h();
        return this.f17207c;
    }

    /* renamed from: n */
    public String m20963n() {
        return C3796c.m33582a(m20965l().getBytes(Charset.defaultCharset())) + "+" + C3796c.m33582a(m20964m().m20941c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: s */
    public boolean m20958s() {
        m20969h();
        return this.f17211g.get().m124b();
    }

    /* renamed from: t */
    public boolean m20957t() {
        return "[DEFAULT]".equals(m20965l());
    }

    public String toString() {
        return C13996n.m2069d(this).m2068a("name", this.f17206b).m2068a("options", this.f17207c).toString();
    }
}
