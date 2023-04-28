package p074e2;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;
import p112g2.AbstractC7404f;
import p112g2.C7397d;
import p112g2.C7410j;
import p413x2.AbstractC13923a;

/* renamed from: e2.g0 */
/* loaded from: classes.dex */
public class C6620g0 implements InvocationHandler {

    /* renamed from: d */
    private AbstractC6608c0 f13938d;

    /* renamed from: e */
    private Object f13939e;

    /* renamed from: f */
    private Context f13940f;

    /* renamed from: h */
    private final AbstractC6628i0 f13942h;

    /* renamed from: i */
    private Object f13943i;

    /* renamed from: a */
    private int f13935a = 3000;

    /* renamed from: c */
    private final AtomicBoolean f13937c = new AtomicBoolean(true);

    /* renamed from: b */
    private int f13936b = 0;

    /* renamed from: g */
    private C7410j f13941g = new C7410j(new RunnableC6621a(), "InstallReferrer");

    /* renamed from: j */
    private AbstractC7404f f13944j = new C7397d("InstallReferrer");

    /* renamed from: e2.g0$a */
    /* loaded from: classes.dex */
    class RunnableC6621a implements Runnable {
        RunnableC6621a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6620g0.this.m24994s();
        }
    }

    /* renamed from: e2.g0$b */
    /* loaded from: classes.dex */
    class RunnableC6622b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Object f13946k;

        /* renamed from: l */
        final /* synthetic */ Method f13947l;

        /* renamed from: m */
        final /* synthetic */ Object[] f13948m;

        RunnableC6622b(Object obj, Method method, Object[] objArr) {
            this.f13946k = obj;
            this.f13947l = method;
            this.f13948m = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6620g0.this.m24997p(this.f13946k, this.f13947l, this.f13948m);
            } catch (Throwable th2) {
                C6620g0.this.f13938d.mo24885b("invoke error (%s) thrown by (%s)", th2.getMessage(), th2.getClass().getCanonicalName());
            }
        }
    }

    public C6620g0(Context context, AbstractC6628i0 i0Var) {
        AbstractC6608c0 j = C6639l.m24863j();
        this.f13938d = j;
        this.f13943i = m25009d(context, i0Var, j);
        this.f13940f = context;
        this.f13942h = i0Var;
    }

    /* renamed from: c */
    private void m25010c() {
        Object obj = this.f13939e;
        if (obj != null) {
            try {
                C6692y0.m24629i(obj, "endConnection", null, new Object[0]);
                this.f13938d.mo24884c("Install Referrer API connection closed", new Object[0]);
            } catch (Exception e) {
                this.f13938d.mo24885b("closeReferrerClient error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            }
            this.f13939e = null;
        }
    }

    /* renamed from: d */
    private Object m25009d(Context context, AbstractC6628i0 i0Var, AbstractC6608c0 c0Var) {
        return C6692y0.m24635c("com.adjust.sdk.play.InstallReferrer", new Class[]{Context.class, AbstractC6628i0.class, AbstractC6608c0.class}, context, i0Var, c0Var);
    }

    /* renamed from: e */
    private Object m25008e(Context context) {
        try {
            return C6692y0.m24629i(C6692y0.m24627k("com.android.installreferrer.api.InstallReferrerClient", "newBuilder", new Class[]{Context.class}, context), "build", null, new Object[0]);
        } catch (ClassNotFoundException e) {
            this.f13938d.mo24886a("InstallReferrer not integrated in project (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        } catch (Exception e2) {
            this.f13938d.mo24885b("createInstallReferrerClient error (%s) from (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            return null;
        }
    }

    /* renamed from: f */
    private Object m25007f(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (IllegalArgumentException unused) {
            this.f13938d.mo24885b("InstallReferrer proxy violating parameter restrictions", new Object[0]);
            return null;
        } catch (NullPointerException unused2) {
            this.f13938d.mo24885b("Null argument passed to InstallReferrer proxy", new Object[0]);
            return null;
        }
    }

    /* renamed from: g */
    private Boolean m25006g(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return Boolean.valueOf(((Boolean) C6692y0.m24629i(obj, "getGooglePlayInstantParam", null, new Object[0])).booleanValue());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    private long m25005h(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) C6692y0.m24629i(obj, "getInstallBeginTimestampSeconds", null, new Object[0])).longValue();
        } catch (Exception e) {
            this.f13938d.mo24885b("getInstallBeginTimestampSeconds error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return -1L;
        }
    }

    /* renamed from: i */
    private long m25004i(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) C6692y0.m24629i(obj, "getInstallBeginTimestampServerSeconds", null, new Object[0])).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* renamed from: j */
    private Object m25003j() {
        Object obj = this.f13939e;
        if (obj == null) {
            return null;
        }
        try {
            return C6692y0.m24629i(obj, "getInstallReferrer", null, new Object[0]);
        } catch (Exception e) {
            this.f13938d.mo24885b("getInstallReferrer error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        }
    }

    /* renamed from: k */
    private Class m25002k() {
        return AbstractC13923a.class;
    }

    /* renamed from: l */
    private long m25001l(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) C6692y0.m24629i(obj, "getReferrerClickTimestampSeconds", null, new Object[0])).longValue();
        } catch (Exception e) {
            this.f13938d.mo24885b("getReferrerClickTimestampSeconds error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return -1L;
        }
    }

    /* renamed from: m */
    private long m25000m(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) C6692y0.m24629i(obj, "getReferrerClickTimestampServerSeconds", null, new Object[0])).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* renamed from: n */
    private String m24999n(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (String) C6692y0.m24629i(obj, "getInstallReferrer", null, new Object[0]);
        } catch (Exception e) {
            this.f13938d.mo24885b("getStringInstallReferrer error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        }
    }

    /* renamed from: o */
    private String m24998o(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (String) C6692y0.m24629i(obj, "getInstallVersion", null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public Object m24997p(Object obj, Method method, Object[] objArr) {
        if (method == null) {
            this.f13938d.mo24885b("InstallReferrer invoke method null", new Object[0]);
            return null;
        }
        String name = method.getName();
        if (name == null) {
            this.f13938d.mo24885b("InstallReferrer invoke method name null", new Object[0]);
            return null;
        }
        this.f13938d.mo24884c("InstallReferrer invoke method name: %s", name);
        if (objArr == null) {
            this.f13938d.mo24886a("InstallReferrer invoke args null", new Object[0]);
            objArr = new Object[0];
        }
        for (Object obj2 : objArr) {
            this.f13938d.mo24884c("InstallReferrer invoke arg: %s", obj2);
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                this.f13938d.mo24885b("InstallReferrer invoke onInstallReferrerSetupFinished args lenght not 1: %d", Integer.valueOf(objArr.length));
                return null;
            }
            Object obj3 = objArr[0];
            if (!(obj3 instanceof Integer)) {
                this.f13938d.mo24885b("InstallReferrer invoke onInstallReferrerSetupFinished arg not int", new Object[0]);
                return null;
            }
            Integer num = (Integer) obj3;
            if (num == null) {
                this.f13938d.mo24885b("InstallReferrer invoke onInstallReferrerSetupFinished responseCode arg is null", new Object[0]);
                return null;
            }
            m24996q(num.intValue());
        } else if (name.equals("onInstallReferrerServiceDisconnected")) {
            this.f13938d.mo24884c("Connection to install referrer service was lost. Retrying ...", new Object[0]);
            m24995r();
        }
        return null;
    }

    /* renamed from: q */
    private void m24996q(int i) {
        boolean z = true;
        if (i != -1) {
            if (i == 0) {
                try {
                    Object j = m25003j();
                    String n = m24999n(j);
                    long l = m25001l(j);
                    long h = m25005h(j);
                    this.f13938d.mo24884c("installReferrer: %s, clickTime: %d, installBeginTime: %d", n, Long.valueOf(l), Long.valueOf(h));
                    String o = m24998o(j);
                    long m = m25000m(j);
                    long i2 = m25004i(j);
                    Boolean g = m25006g(j);
                    this.f13938d.mo24884c("installVersion: %s, clickTimeServer: %d, installBeginServer: %d, googlePlayInstant: %b", o, Long.valueOf(m), Long.valueOf(i2), g);
                    this.f13938d.mo24884c("Install Referrer read successfully. Closing connection", new Object[0]);
                    this.f13942h.mo24952a(new C6690x0(n, l, h, m, i2, o, g), "google");
                } catch (Exception e) {
                    this.f13938d.mo24886a("Couldn't get install referrer from client (%s). Retrying...", e.getMessage());
                }
            } else if (i == 1) {
                this.f13938d.mo24884c("Could not initiate connection to the Install Referrer service. Retrying...", new Object[0]);
            } else if (i == 2) {
                this.f13938d.mo24884c("Install Referrer API not supported by the installed Play Store app. Closing connection", new Object[0]);
            } else if (i != 3) {
                this.f13938d.mo24884c("Unexpected response code of install referrer response: %d. Closing connection", Integer.valueOf(i));
            } else {
                this.f13938d.mo24884c("Install Referrer API general errors caused by incorrect usage. Retrying...", new Object[0]);
            }
            z = false;
        } else {
            this.f13938d.mo24884c("Play Store service is not connected now. Retrying...", new Object[0]);
        }
        if (z) {
            m24995r();
            return;
        }
        this.f13937c.set(false);
        m25010c();
    }

    /* renamed from: r */
    private void m24995r() {
        if (!this.f13937c.get()) {
            this.f13938d.mo24884c("Should not try to read Install referrer", new Object[0]);
            m25010c();
        } else if (this.f13936b + 1 > 2) {
            this.f13938d.mo24884c("Limit number of retry of %d for install referrer surpassed", 2);
        } else {
            long g = this.f13941g.m22720g();
            if (g > 0) {
                this.f13938d.mo24884c("Already waiting to retry to read install referrer in %d milliseconds", Long.valueOf(g));
                return;
            }
            int i = this.f13936b + 1;
            this.f13936b = i;
            this.f13938d.mo24884c("Retry number %d to connect to install referrer API", Integer.valueOf(i));
            this.f13941g.m22719h(this.f13935a);
        }
    }

    /* renamed from: t */
    private void m24993t(Class cls, Object obj) {
        try {
            C6692y0.m24629i(this.f13939e, "startConnection", new Class[]{cls}, obj);
        } catch (InvocationTargetException e) {
            if (C6629i1.m24943I(e)) {
                this.f13938d.mo24885b("InstallReferrer encountered an InvocationTargetException %s", C6629i1.m24949C(e));
            }
        } catch (Exception e2) {
            this.f13938d.mo24885b("startConnection error (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f13944j.submit(new RunnableC6622b(obj, method, objArr));
        return null;
    }

    /* renamed from: s */
    public void m24994s() {
        Class k;
        Object f;
        Object obj = this.f13943i;
        if (obj != null) {
            try {
                C6692y0.m24629i(obj, "startConnection", null, new Object[0]);
                return;
            } catch (Exception e) {
                this.f13938d.mo24885b("Call to Play startConnection error: %s", e.getMessage());
            }
        }
        if (C6639l.m24852u()) {
            m25010c();
            if (!this.f13937c.get()) {
                this.f13938d.mo24884c("Should not try to read Install referrer", new Object[0]);
                return;
            }
            Context context = this.f13940f;
            if (context != null) {
                Object e2 = m25008e(context);
                this.f13939e = e2;
                if (e2 != null && (k = m25002k()) != null && (f = m25007f(k)) != null) {
                    m24993t(k, f);
                }
            }
        }
    }
}
