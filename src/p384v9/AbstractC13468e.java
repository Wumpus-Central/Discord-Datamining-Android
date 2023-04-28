package p384v9;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ca.C3803j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.AbstractC5374b;
import com.google.android.gms.common.api.internal.AbstractC5389h;
import com.google.android.gms.common.api.internal.C5376c;
import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.common.api.internal.C5382e;
import com.google.android.gms.common.api.internal.C5386g;
import com.google.android.gms.common.api.internal.C5400m;
import com.google.android.gms.common.api.internal.C5411t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import p384v9.C13456a;
import p384v9.C13456a.AbstractC13459d;
import p400w9.AbstractC13831k;
import p400w9.BinderC13820e0;
import p400w9.C13811a;
import p400w9.C13813b;
import p400w9.C13839q;
import p400w9.ServiceConnectionC13823g;
import p420x9.AbstractC13957c;
import p420x9.C13964d;
import p420x9.C14004p;

/* renamed from: v9.e */
/* loaded from: classes5.dex */
public abstract class AbstractC13468e<O extends C13456a.AbstractC13459d> {

    /* renamed from: a */
    private final Context f30068a;

    /* renamed from: b */
    private final String f30069b;

    /* renamed from: c */
    private final C13456a<O> f30070c;

    /* renamed from: d */
    private final O f30071d;

    /* renamed from: e */
    private final C13813b<O> f30072e;

    /* renamed from: f */
    private final Looper f30073f;

    /* renamed from: g */
    private final int f30074g;

    /* renamed from: h */
    private final AbstractC13470f f30075h;

    /* renamed from: i */
    private final AbstractC13831k f30076i;

    /* renamed from: j */
    protected final C5376c f30077j;

    /* renamed from: v9.e$a */
    /* loaded from: classes5.dex */
    public static class C13469a {

        /* renamed from: c */
        public static final C13469a f30078c = new C0439a().m3617a();

        /* renamed from: a */
        public final AbstractC13831k f30079a;

        /* renamed from: b */
        public final Looper f30080b;

        /* renamed from: v9.e$a$a */
        /* loaded from: classes5.dex */
        public static class C0439a {

            /* renamed from: a */
            private AbstractC13831k f30081a;

            /* renamed from: b */
            private Looper f30082b;

            /* renamed from: a */
            public C13469a m3617a() {
                if (this.f30081a == null) {
                    this.f30081a = new C13811a();
                }
                if (this.f30082b == null) {
                    this.f30082b = Looper.getMainLooper();
                }
                return new C13469a(this.f30081a, this.f30082b);
            }

            /* renamed from: b */
            public C0439a m3616b(Looper looper) {
                C14004p.m2050k(looper, "Looper must not be null.");
                this.f30082b = looper;
                return this;
            }

            /* renamed from: c */
            public C0439a m3615c(AbstractC13831k kVar) {
                C14004p.m2050k(kVar, "StatusExceptionMapper must not be null.");
                this.f30081a = kVar;
                return this;
            }
        }

        private C13469a(AbstractC13831k kVar, Account account, Looper looper) {
            this.f30079a = kVar;
            this.f30080b = looper;
        }
    }

    public AbstractC13468e(Activity activity, C13456a<O> aVar, O o, C13469a aVar2) {
        this(activity, activity, aVar, o, aVar2);
    }

    /* renamed from: A */
    private final <A extends C13456a.AbstractC13457b, T extends AbstractC5374b<? extends AbstractC13478k, A>> T m3638A(int i, T t) {
        t.zak();
        this.f30077j.m29086G(this, i, t);
        return t;
    }

    /* renamed from: B */
    private final <TResult, A extends C13456a.AbstractC13457b> Task<TResult> m3637B(int i, AbstractC5389h<A, TResult> hVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f30077j.m29085H(this, i, hVar, taskCompletionSource, this.f30076i);
        return taskCompletionSource.m28902a();
    }

    /* renamed from: h */
    public AbstractC13470f m3636h() {
        return this.f30075h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public C13964d.C13965a mo3635i() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount f;
        C13964d.C13965a aVar = new C13964d.C13965a();
        O o = this.f30071d;
        if (!(o instanceof C13456a.AbstractC13459d.AbstractC13460b) || (f = ((C13456a.AbstractC13459d.AbstractC13460b) o).m3642f()) == null) {
            O o2 = this.f30071d;
            if (o2 instanceof C13456a.AbstractC13459d.AbstractC0438a) {
                account = ((C13456a.AbstractC13459d.AbstractC0438a) o2).m3643j();
            } else {
                account = null;
            }
        } else {
            account = f.m29164j();
        }
        aVar.m2128d(account);
        O o3 = this.f30071d;
        if (o3 instanceof C13456a.AbstractC13459d.AbstractC13460b) {
            GoogleSignInAccount f2 = ((C13456a.AbstractC13459d.AbstractC13460b) o3).m3642f();
            if (f2 == null) {
                set = Collections.emptySet();
            } else {
                set = f2.m29170C();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.m2129c(set);
        aVar.m2127e(this.f30068a.getClass().getName());
        aVar.m2130b(this.f30068a.getPackageName());
        return aVar;
    }

    /* renamed from: j */
    public <TResult, A extends C13456a.AbstractC13457b> Task<TResult> m3634j(AbstractC5389h<A, TResult> hVar) {
        return m3637B(2, hVar);
    }

    /* renamed from: k */
    public <A extends C13456a.AbstractC13457b, T extends AbstractC5374b<? extends AbstractC13478k, A>> T m3633k(T t) {
        m3638A(0, t);
        return t;
    }

    /* renamed from: l */
    public <TResult, A extends C13456a.AbstractC13457b> Task<TResult> m3632l(AbstractC5389h<A, TResult> hVar) {
        return m3637B(0, hVar);
    }

    /* renamed from: m */
    public <A extends C13456a.AbstractC13457b> Task<Void> m3631m(C5386g<A, ?> gVar) {
        C14004p.m2051j(gVar);
        C14004p.m2050k(gVar.f10151a.m29049b(), "Listener has already been released.");
        C14004p.m2050k(gVar.f10152b.m29025a(), "Listener has already been released.");
        return this.f30077j.m29092A(this, gVar.f10151a, gVar.f10152b, gVar.f10153c);
    }

    /* renamed from: n */
    public Task<Boolean> m3630n(C5378d.C5379a<?> aVar) {
        return m3629o(aVar, 0);
    }

    /* renamed from: o */
    public Task<Boolean> m3629o(C5378d.C5379a<?> aVar, int i) {
        C14004p.m2050k(aVar, "Listener key cannot be null.");
        return this.f30077j.m29091B(this, aVar, i);
    }

    /* renamed from: p */
    public <A extends C13456a.AbstractC13457b, T extends AbstractC5374b<? extends AbstractC13478k, A>> T m3628p(T t) {
        m3638A(1, t);
        return t;
    }

    /* renamed from: q */
    public <TResult, A extends C13456a.AbstractC13457b> Task<TResult> m3627q(AbstractC5389h<A, TResult> hVar) {
        return m3637B(1, hVar);
    }

    /* renamed from: r */
    public final C13813b<O> m3626r() {
        return this.f30072e;
    }

    /* renamed from: s */
    public O m3625s() {
        return this.f30071d;
    }

    /* renamed from: t */
    public Context m3624t() {
        return this.f30068a;
    }

    /* renamed from: u */
    protected String m3623u() {
        return this.f30069b;
    }

    /* renamed from: v */
    public Looper m3622v() {
        return this.f30073f;
    }

    /* renamed from: w */
    public <L> C5378d<L> m3621w(L l, String str) {
        return C5382e.m29052a(l, this.f30073f, str);
    }

    /* renamed from: x */
    public final int m3620x() {
        return this.f30074g;
    }

    /* renamed from: y */
    public final C13456a.AbstractC13463f m3619y(Looper looper, C5411t<O> tVar) {
        C13456a.AbstractC13463f a = ((C13456a.AbstractC0437a) C14004p.m2051j(this.f30070c.m3647a())).mo3644a(this.f30068a, looper, mo3635i().m2131a(), this.f30071d, tVar, tVar);
        String u = m3623u();
        if (u != null && (a instanceof AbstractC13957c)) {
            ((AbstractC13957c) a).m2180O(u);
        }
        if (u != null && (a instanceof ServiceConnectionC13823g)) {
            ((ServiceConnectionC13823g) a).m2565r(u);
        }
        return a;
    }

    /* renamed from: z */
    public final BinderC13820e0 m3618z(Context context, Handler handler) {
        return new BinderC13820e0(context, handler, mo3635i().m2131a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC13468e(android.app.Activity r2, p384v9.C13456a<O> r3, O r4, p400w9.AbstractC13831k r5) {
        /*
            r1 = this;
            v9.e$a$a r0 = new v9.e$a$a
            r0.<init>()
            r0.m3615c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.m3616b(r5)
            v9.e$a r5 = r0.m3617a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p384v9.AbstractC13468e.<init>(android.app.Activity, v9.a, v9.a$d, w9.k):void");
    }

    private AbstractC13468e(Context context, Activity activity, C13456a<O> aVar, O o, C13469a aVar2) {
        C14004p.m2050k(context, "Null context is not permitted.");
        C14004p.m2050k(aVar, "Api must not be null.");
        C14004p.m2050k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f30068a = context.getApplicationContext();
        String str = null;
        if (C3803j.m33556k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f30069b = str;
        this.f30070c = aVar;
        this.f30071d = o;
        this.f30073f = aVar2.f30080b;
        C13813b<O> a = C13813b.m2593a(aVar, o, str);
        this.f30072e = a;
        this.f30075h = new C13839q(this);
        C5376c y = C5376c.m29058y(this.f30068a);
        this.f30077j = y;
        this.f30074g = y.m29069n();
        this.f30076i = aVar2.f30079a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C5400m.m29005u(activity, y, a);
        }
        y.m29080c(this);
    }

    public AbstractC13468e(Context context, C13456a<O> aVar, O o, C13469a aVar2) {
        this(context, null, aVar, o, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC13468e(android.content.Context r2, p384v9.C13456a<O> r3, O r4, p400w9.AbstractC13831k r5) {
        /*
            r1 = this;
            v9.e$a$a r0 = new v9.e$a$a
            r0.<init>()
            r0.m3615c(r5)
            v9.e$a r5 = r0.m3617a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p384v9.AbstractC13468e.<init>(android.content.Context, v9.a, v9.a$d, w9.k):void");
    }
}
