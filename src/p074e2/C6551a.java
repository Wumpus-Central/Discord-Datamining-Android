package p074e2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;
import p093f2.C7002a;
import p093f2.C7006d;
import p112g2.AbstractC7404f;
import p112g2.C7397d;
import p112g2.C7408i;
import p112g2.C7410j;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public class C6551a implements AbstractC6596a0 {

    /* renamed from: q */
    private static long f13725q;

    /* renamed from: r */
    private static long f13726r;

    /* renamed from: s */
    private static long f13727s;

    /* renamed from: t */
    private static long f13728t;

    /* renamed from: u */
    private static long f13729u;

    /* renamed from: a */
    private AbstractC7404f f13730a = new C7397d("ActivityHandler");

    /* renamed from: b */
    private AbstractC6611d0 f13731b;

    /* renamed from: c */
    private C6610d f13732c;

    /* renamed from: d */
    private AbstractC6608c0 f13733d;

    /* renamed from: e */
    private C7408i f13734e;

    /* renamed from: f */
    private C7410j f13735f;

    /* renamed from: g */
    private C7410j f13736g;

    /* renamed from: h */
    private C6588s0 f13737h;

    /* renamed from: i */
    private C6689x f13738i;

    /* renamed from: j */
    private C6624h f13739j;

    /* renamed from: k */
    private C6619g f13740k;

    /* renamed from: l */
    private AbstractC6605b0 f13741l;

    /* renamed from: m */
    private AbstractC6617f0 f13742m;

    /* renamed from: n */
    private C6609c1 f13743n;

    /* renamed from: o */
    private C6620g0 f13744o;

    /* renamed from: p */
    private C6625h0 f13745p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0202a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6690x0 f13746k;

        /* renamed from: l */
        final /* synthetic */ String f13747l;

        RunnableC0202a(C6690x0 x0Var, String str) {
            this.f13746k = x0Var;
            this.f13747l = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25321A1(this.f13746k, this.f13747l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$a0 */
    /* loaded from: classes.dex */
    public class RunnableC6552a0 implements Runnable {
        RunnableC6552a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25286P0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$b */
    /* loaded from: classes.dex */
    public class RunnableC6553b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6691y f13750k;

        RunnableC6553b(C6691y yVar) {
            this.f13750k = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25243d1(this.f13750k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$b0 */
    /* loaded from: classes.dex */
    public class RunnableC6554b0 implements Runnable {
        RunnableC6554b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25201v0();
        }
    }

    /* renamed from: e2.a$c */
    /* loaded from: classes.dex */
    class RunnableC6555c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6606b1 f13753k;

        RunnableC6555c(C6606b1 b1Var) {
            this.f13753k = b1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25240e1(this.f13753k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$c0 */
    /* loaded from: classes.dex */
    public class RunnableC6556c0 implements Runnable {
        RunnableC6556c0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.mo25156o();
        }
    }

    /* renamed from: e2.a$d */
    /* loaded from: classes.dex */
    class RunnableC6557d implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6612d1 f13756k;

        RunnableC6557d(C6612d1 d1Var) {
            this.f13756k = d1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25234g1(this.f13756k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$d0 */
    /* loaded from: classes.dex */
    public class C6558d0 implements AbstractC6628i0 {
        C6558d0() {
        }

        @Override // p074e2.AbstractC6628i0
        /* renamed from: a */
        public void mo24952a(C6690x0 x0Var, String str) {
            C6551a.this.m25192z1(x0Var, str);
        }
    }

    /* renamed from: e2.a$e */
    /* loaded from: classes.dex */
    class RunnableC6559e implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6678v f13759k;

        RunnableC6559e(C6678v vVar) {
            this.f13759k = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25253a1(this.f13759k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$e0 */
    /* loaded from: classes.dex */
    public class C6560e0 implements AbstractC6628i0 {
        C6560e0() {
        }

        @Override // p074e2.AbstractC6628i0
        /* renamed from: a */
        public void mo24952a(C6690x0 x0Var, String str) {
            C6551a.this.m25192z1(x0Var, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$f */
    /* loaded from: classes.dex */
    public class RunnableC6561f implements Runnable {
        RunnableC6561f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25194y1();
        }
    }

    /* renamed from: e2.a$f0 */
    /* loaded from: classes.dex */
    class RunnableC6562f0 implements Runnable {
        RunnableC6562f0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25294M1();
            C6551a.this.m25307H1();
            C6551a.this.f13733d.mo24880g("Subsession end", new Object[0]);
            C6551a.this.m25289O0();
        }
    }

    /* renamed from: e2.a$g */
    /* loaded from: classes.dex */
    class RunnableC6563g implements Runnable {

        /* renamed from: k */
        final /* synthetic */ String f13764k;

        /* renamed from: l */
        final /* synthetic */ String f13765l;

        RunnableC6563g(String str, String str2) {
            this.f13764k = str;
            this.f13765l = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25205t0(this.f13764k, this.f13765l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$g0 */
    /* loaded from: classes.dex */
    public class RunnableC6564g0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6691y f13767k;

        RunnableC6564g0(C6691y yVar) {
            this.f13767k = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6551a.this.f13739j != null && C6551a.this.f13739j.f13963n != null) {
                C6551a.this.f13739j.f13963n.onFinishedEventTrackingSucceeded(this.f13767k.m24638c());
            }
        }
    }

    /* renamed from: e2.a$h */
    /* loaded from: classes.dex */
    class RunnableC6565h implements Runnable {

        /* renamed from: k */
        final /* synthetic */ String f13769k;

        /* renamed from: l */
        final /* synthetic */ String f13770l;

        RunnableC6565h(String str, String str2) {
            this.f13769k = str;
            this.f13770l = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25203u0(this.f13769k, this.f13770l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$h0 */
    /* loaded from: classes.dex */
    public class RunnableC6566h0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6691y f13772k;

        RunnableC6566h0(C6691y yVar) {
            this.f13772k = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6551a.this.f13739j != null && C6551a.this.f13739j.f13964o != null) {
                C6551a.this.f13739j.f13964o.onFinishedEventTrackingFailed(this.f13772k.m24639b());
            }
        }
    }

    /* renamed from: e2.a$i */
    /* loaded from: classes.dex */
    class RunnableC6567i implements Runnable {

        /* renamed from: k */
        final /* synthetic */ String f13774k;

        RunnableC6567i(String str) {
            this.f13774k = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25204t1(this.f13774k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$i0 */
    /* loaded from: classes.dex */
    public class RunnableC6568i0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6612d1 f13776k;

        RunnableC6568i0(C6612d1 d1Var) {
            this.f13776k = d1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6551a.this.f13739j != null && C6551a.this.f13739j.f13965p != null) {
                C6551a.this.f13739j.f13965p.onFinishedSessionTrackingSucceeded(this.f13776k.m25096c());
            }
        }
    }

    /* renamed from: e2.a$j */
    /* loaded from: classes.dex */
    class RunnableC6569j implements Runnable {
        RunnableC6569j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25268V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$j0 */
    /* loaded from: classes.dex */
    public class RunnableC6570j0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6612d1 f13779k;

        RunnableC6570j0(C6612d1 d1Var) {
            this.f13779k = d1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6551a.this.f13739j != null && C6551a.this.f13739j.f13966q != null) {
                C6551a.this.f13739j.f13966q.onFinishedSessionTrackingFailed(this.f13779k.m25097b());
            }
        }
    }

    /* renamed from: e2.a$k */
    /* loaded from: classes.dex */
    class RunnableC6571k implements Runnable {

        /* renamed from: k */
        final /* synthetic */ String f13781k;

        RunnableC6571k(String str) {
            this.f13781k = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25202u1(this.f13781k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$k0 */
    /* loaded from: classes.dex */
    public class RunnableC6572k0 implements Runnable {
        RunnableC6572k0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6551a.this.f13739j != null && C6551a.this.f13739j.f13960k != null) {
                C6551a.this.f13739j.f13960k.onAttributionChanged(C6551a.this.f13740k);
            }
        }
    }

    /* renamed from: e2.a$l */
    /* loaded from: classes.dex */
    class RunnableC6573l implements Runnable {
        RunnableC6573l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25200v1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$l0 */
    /* loaded from: classes.dex */
    public class RunnableC6574l0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Uri f13785k;

        /* renamed from: l */
        final /* synthetic */ Intent f13786l;

        RunnableC6574l0(Uri uri, Intent intent) {
            this.f13785k = uri;
            this.f13786l = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (C6551a.this.f13739j != null) {
                if (C6551a.this.f13739j.f13967r != null) {
                    z = C6551a.this.f13739j.f13967r.launchReceivedDeeplink(this.f13785k);
                } else {
                    z = true;
                }
                if (z) {
                    C6551a.this.m25250b1(this.f13786l, this.f13785k);
                }
            }
        }
    }

    /* renamed from: e2.a$m */
    /* loaded from: classes.dex */
    class RunnableC6575m implements Runnable {
        RunnableC6575m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25198w1();
        }
    }

    /* renamed from: e2.a$m0 */
    /* loaded from: classes.dex */
    class RunnableC6576m0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6627i f13789k;

        RunnableC6576m0(C6627i iVar) {
            this.f13789k = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6551a.this.f13737h.m25191a()) {
                C6551a.this.f13733d.mo24886a("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new Object[0]);
                C6551a.this.m25300K1();
            }
            C6551a.this.m25270U1(this.f13789k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$n */
    /* loaded from: classes.dex */
    public class RunnableC6577n implements Runnable {

        /* renamed from: k */
        final /* synthetic */ boolean f13791k;

        /* renamed from: l */
        final /* synthetic */ String f13792l;

        RunnableC6577n(boolean z, String str) {
            this.f13791k = z;
            this.f13792l = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f13791k) {
                new C6615e1(C6551a.this.getContext()).m25030z(this.f13792l);
            }
            if (!C6551a.this.f13737h.m25191a()) {
                C6551a.this.m25309G1(this.f13792l);
            }
        }
    }

    /* renamed from: e2.a$n0 */
    /* loaded from: classes.dex */
    class RunnableC6578n0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ boolean f13794k;

        RunnableC6578n0(boolean z) {
            this.f13794k = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25313E1(this.f13794k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$o */
    /* loaded from: classes.dex */
    public class RunnableC6579o implements Runnable {
        RunnableC6579o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25280R0();
        }
    }

    /* renamed from: e2.a$o0 */
    /* loaded from: classes.dex */
    class RunnableC6580o0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ boolean f13797k;

        RunnableC6580o0(boolean z) {
            this.f13797k = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25311F1(this.f13797k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$p */
    /* loaded from: classes.dex */
    public class RunnableC6581p implements Runnable {
        RunnableC6581p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25292N0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$p0 */
    /* loaded from: classes.dex */
    public class RunnableC6582p0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Uri f13800k;

        /* renamed from: l */
        final /* synthetic */ long f13801l;

        RunnableC6582p0(Uri uri, long j) {
            this.f13800k = uri;
            this.f13801l = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25210q1(this.f13800k, this.f13801l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$q */
    /* loaded from: classes.dex */
    public class RunnableC6583q implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6665s f13803k;

        RunnableC6583q(C6665s sVar) {
            this.f13803k = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25258Y1(this.f13803k);
        }
    }

    /* renamed from: e2.a$q0 */
    /* loaded from: classes.dex */
    class RunnableC6584q0 implements Runnable {

        /* renamed from: k */
        final /* synthetic */ boolean f13805k;

        RunnableC6584q0(boolean z) {
            this.f13805k = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25315D1(this.f13805k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$r */
    /* loaded from: classes.dex */
    public class RunnableC6585r implements Runnable {

        /* renamed from: k */
        final /* synthetic */ boolean f13807k;

        RunnableC6585r(boolean z) {
            this.f13807k = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25267V1(this.f13807k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$r0 */
    /* loaded from: classes.dex */
    public class RunnableC6586r0 implements Runnable {
        RunnableC6586r0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25317C1();
        }
    }

    /* renamed from: e2.a$s */
    /* loaded from: classes.dex */
    class RunnableC6587s implements Runnable {

        /* renamed from: k */
        final /* synthetic */ String f13810k;

        /* renamed from: l */
        final /* synthetic */ JSONObject f13811l;

        RunnableC6587s(String str, JSONObject jSONObject) {
            this.f13810k = str;
            this.f13811l = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25273T1(this.f13810k, this.f13811l);
        }
    }

    /* renamed from: e2.a$s0 */
    /* loaded from: classes.dex */
    public class C6588s0 {

        /* renamed from: a */
        boolean f13813a;

        /* renamed from: b */
        boolean f13814b;

        /* renamed from: c */
        boolean f13815c;

        /* renamed from: d */
        boolean f13816d;

        /* renamed from: e */
        boolean f13817e;

        /* renamed from: f */
        boolean f13818f;

        /* renamed from: g */
        boolean f13819g;

        /* renamed from: h */
        boolean f13820h;

        /* renamed from: i */
        boolean f13821i;

        public C6588s0() {
        }

        /* renamed from: a */
        public boolean m25191a() {
            return !this.f13820h;
        }

        /* renamed from: b */
        public boolean m25190b() {
            return this.f13820h;
        }

        /* renamed from: c */
        public boolean m25189c() {
            return this.f13821i;
        }

        /* renamed from: d */
        public boolean m25188d() {
            return !this.f13819g;
        }

        /* renamed from: e */
        public boolean m25187e() {
            return this.f13813a;
        }

        /* renamed from: f */
        public boolean m25186f() {
            return this.f13818f;
        }

        /* renamed from: g */
        public boolean m25185g() {
            return this.f13815c;
        }

        /* renamed from: h */
        public boolean m25184h() {
            return this.f13816d;
        }

        /* renamed from: i */
        public boolean m25183i() {
            return !this.f13815c;
        }

        /* renamed from: j */
        public boolean m25182j() {
            return !this.f13816d;
        }

        /* renamed from: k */
        public boolean m25181k() {
            return this.f13814b;
        }

        /* renamed from: l */
        public boolean m25180l() {
            return this.f13817e;
        }
    }

    /* renamed from: e2.a$t */
    /* loaded from: classes.dex */
    class RunnableC6589t implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6616f f13823k;

        RunnableC6589t(C6616f fVar) {
            this.f13823k = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25276S1(this.f13823k);
        }
    }

    /* renamed from: e2.a$u */
    /* loaded from: classes.dex */
    class RunnableC6590u implements Runnable {
        RunnableC6590u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25308H0();
            C6551a.this.m25297L1();
            C6551a.this.m25303J1();
            C6551a.this.f13733d.mo24880g("Subsession start", new Object[0]);
            C6551a.this.m25300K1();
        }
    }

    /* renamed from: e2.a$v */
    /* loaded from: classes.dex */
    class RunnableC6591v implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6655n f13826k;

        RunnableC6591v(C6655n nVar) {
            this.f13826k = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25261X1(this.f13826k);
        }
    }

    /* renamed from: e2.a$w */
    /* loaded from: classes.dex */
    class RunnableC6592w implements Runnable {
        RunnableC6592w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25274T0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$x */
    /* loaded from: classes.dex */
    public class RunnableC6593x implements Runnable {
        RunnableC6593x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25283Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$y */
    /* loaded from: classes.dex */
    public class RunnableC6594y implements Runnable {
        RunnableC6594y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6551a.this.m25199w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$z */
    /* loaded from: classes.dex */
    public class C6595z implements AbstractC6614e0 {
        C6595z() {
        }

        @Override // p074e2.AbstractC6614e0
        /* renamed from: a */
        public void mo24803a(C6551a aVar) {
            aVar.m25313E1(C6551a.this.f13739j.f13974y.booleanValue());
        }
    }

    private C6551a(C6624h hVar) {
        boolean z;
        mo25170J(hVar);
        AbstractC6608c0 j = C6639l.m24863j();
        this.f13733d = j;
        j.mo24883d();
        C6588s0 s0Var = new C6588s0();
        this.f13737h = s0Var;
        Boolean bool = hVar.f13974y;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        s0Var.f13813a = z;
        C6588s0 s0Var2 = this.f13737h;
        s0Var2.f13814b = hVar.f13975z;
        s0Var2.f13815c = true;
        s0Var2.f13816d = false;
        s0Var2.f13817e = false;
        s0Var2.f13819g = false;
        s0Var2.f13820h = false;
        s0Var2.f13821i = false;
        this.f13730a.submit(new RunnableC6569j());
    }

    /* renamed from: A0 */
    private void m25322A0(C6615e1 e1Var) {
        String k = e1Var.m25045k();
        if (k != null && !k.equals(this.f13732c.f13906z)) {
            mo25160k(k, true);
        }
        if (e1Var.m25043m() != null) {
            mo25175E();
        }
        m25314E0();
        this.f13744o.m24994s();
        this.f13745p.m24962c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public void m25321A1(C6690x0 x0Var, String str) {
        if (m25265W0() && m25259Y0(x0Var) && !C6629i1.m24932T(x0Var, str, this.f13732c)) {
            this.f13742m.mo25014g(C6677u0.m24714b(x0Var, str, this.f13732c, this.f13739j, this.f13738i, this.f13743n));
        }
    }

    /* renamed from: B0 */
    private void m25320B0() {
        if (m25197x0(this.f13732c)) {
            if (this.f13737h.m25186f() && this.f13737h.m25188d()) {
                return;
            }
            if (this.f13740k == null || this.f13732c.f13896p) {
                this.f13741l.mo24736e();
            }
        }
    }

    /* renamed from: B1 */
    private void m25319B1() {
        String j;
        if (m25265W0() && !this.f13737h.m25191a() && (j = new C6615e1(getContext()).m25046j()) != null && !j.isEmpty()) {
            this.f13742m.mo25015f(j, "system_installer_referrer");
        }
    }

    /* renamed from: C0 */
    private boolean m25318C0(C6627i iVar) {
        if (iVar == null) {
            this.f13733d.mo24885b("Event missing", new Object[0]);
            return false;
        } else if (iVar.m24956e()) {
            return true;
        } else {
            this.f13733d.mo24885b("Event not initialized correctly", new Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public void m25317C1() {
        if (m25265W0() && !this.f13737h.m25191a()) {
            this.f13742m.mo25016e();
        }
    }

    /* renamed from: D0 */
    private void m25316D0(C6606b1 b1Var) {
        boolean z;
        if (b1Var.f13864o) {
            String str = b1Var.f13872w;
            boolean z2 = true;
            if (str == null || !str.equalsIgnoreCase("huawei_ads")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C6610d dVar = this.f13732c;
                dVar.f37945I = b1Var.f13865p;
                dVar.f37946J = b1Var.f13866q;
                dVar.f37947K = b1Var.f13867r;
                m25233g2();
                return;
            }
            String str2 = b1Var.f13872w;
            if (str2 == null || !str2.equalsIgnoreCase("huawei_app_gallery")) {
                z2 = false;
            }
            if (z2) {
                C6610d dVar2 = this.f13732c;
                dVar2.f37945I = b1Var.f13865p;
                dVar2.f37946J = b1Var.f13866q;
                dVar2.f37948L = b1Var.f13867r;
                m25233g2();
                return;
            }
            C6610d dVar3 = this.f13732c;
            dVar3.f37938B = b1Var.f13865p;
            dVar3.f37939C = b1Var.f13866q;
            dVar3.f37940D = b1Var.f13867r;
            dVar3.f37942F = b1Var.f13868s;
            dVar3.f37943G = b1Var.f13869t;
            dVar3.f37944H = b1Var.f13870u;
            dVar3.f37941E = b1Var.f13871v;
            m25233g2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public void m25315D1(boolean z) {
        this.f13732c.f13896p = z;
        m25233g2();
    }

    /* renamed from: E0 */
    private void m25314E0() {
        C6610d dVar = this.f13732c;
        if (dVar != null && dVar.f13893m && !dVar.f13894n) {
            m25319B1();
            if (this.f13739j.f37952D && !this.f13737h.m25189c()) {
                String str = this.f13738i.f14208k;
                if (str == null || str.isEmpty()) {
                    this.f13733d.mo24884c("Can't read preinstall payload, invalid package name", new Object[0]);
                    return;
                }
                C6615e1 e1Var = new C6615e1(getContext());
                long i = e1Var.m25047i();
                if (C6688w0.m24675i(i)) {
                    this.f13737h.f13821i = true;
                    return;
                }
                if (C6688w0.m24674j("system_properties", i)) {
                    String c = C6688w0.m24681c(this.f13738i.f14208k, this.f13733d);
                    if (c == null || c.isEmpty()) {
                        i = C6688w0.m24673k("system_properties", i);
                    } else {
                        this.f13742m.mo25015f(c, "system_properties");
                    }
                }
                if (C6688w0.m24674j("system_properties_reflection", i)) {
                    String f = C6688w0.m24678f(this.f13738i.f14208k, this.f13733d);
                    if (f == null || f.isEmpty()) {
                        i = C6688w0.m24673k("system_properties_reflection", i);
                    } else {
                        this.f13742m.mo25015f(f, "system_properties_reflection");
                    }
                }
                if (C6688w0.m24674j("system_properties_path", i)) {
                    String d = C6688w0.m24680d(this.f13738i.f14208k, this.f13733d);
                    if (d == null || d.isEmpty()) {
                        i = C6688w0.m24673k("system_properties_path", i);
                    } else {
                        this.f13742m.mo25015f(d, "system_properties_path");
                    }
                }
                if (C6688w0.m24674j("system_properties_path_reflection", i)) {
                    String e = C6688w0.m24679e(this.f13738i.f14208k, this.f13733d);
                    if (e == null || e.isEmpty()) {
                        i = C6688w0.m24673k("system_properties_path_reflection", i);
                    } else {
                        this.f13742m.mo25015f(e, "system_properties_path_reflection");
                    }
                }
                if (C6688w0.m24674j("content_provider", i)) {
                    String a = C6688w0.m24683a(this.f13739j.f13953d, this.f13738i.f14208k, this.f13733d);
                    if (a == null || a.isEmpty()) {
                        i = C6688w0.m24673k("content_provider", i);
                    } else {
                        this.f13742m.mo25015f(a, "content_provider");
                    }
                }
                if (C6688w0.m24674j("content_provider_intent_action", i)) {
                    List<String> g = C6688w0.m24677g(this.f13739j.f13953d, this.f13738i.f14208k, this.f13733d);
                    if (g == null || g.isEmpty()) {
                        i = C6688w0.m24673k("content_provider_intent_action", i);
                    } else {
                        for (String str2 : g) {
                            this.f13742m.mo25015f(str2, "content_provider_intent_action");
                        }
                    }
                }
                if (C6688w0.m24674j("content_provider_no_permission", i)) {
                    List<String> h = C6688w0.m24676h(this.f13739j.f13953d, this.f13738i.f14208k, this.f13733d);
                    if (h == null || h.isEmpty()) {
                        i = C6688w0.m24673k("content_provider_no_permission", i);
                    } else {
                        for (String str3 : h) {
                            this.f13742m.mo25015f(str3, "content_provider_no_permission");
                        }
                    }
                }
                if (C6688w0.m24674j("file_system", i)) {
                    String b = C6688w0.m24682b(this.f13738i.f14208k, this.f13739j.f37955G, this.f13733d);
                    if (b == null || b.isEmpty()) {
                        i = C6688w0.m24673k("file_system", i);
                    } else {
                        this.f13742m.mo25015f(b, "file_system");
                    }
                }
                e1Var.m25057G(i);
                this.f13737h.f13821i = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public void m25313E1(boolean z) {
        C6610d dVar;
        if (m25271U0(m25265W0(), z, "Adjust already enabled", "Adjust already disabled")) {
            if (!z || (dVar = this.f13732c) == null || !dVar.f13894n) {
                C6588s0 s0Var = this.f13737h;
                s0Var.f13813a = z;
                if (s0Var.m25191a()) {
                    m25236f2(!z, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
                    return;
                }
                this.f13732c.f13893m = z;
                m25233g2();
                if (z) {
                    C6615e1 e1Var = new C6615e1(getContext());
                    if (e1Var.m25050f()) {
                        m25280R0();
                    } else {
                        if (e1Var.m25051e()) {
                            m25292N0();
                        }
                        for (C6665s sVar : this.f13739j.f13970u.f14080b) {
                            m25258Y1(sVar);
                        }
                        Boolean bool = this.f13739j.f13970u.f14081c;
                        if (bool != null) {
                            m25267V1(bool.booleanValue());
                        }
                        this.f13739j.f13970u.f14080b = new ArrayList();
                        this.f13739j.f13970u.f14081c = null;
                    }
                    if (!e1Var.m25049g()) {
                        this.f13733d.mo24884c("Detected that install was not tracked at enable time", new Object[0]);
                        m25264W1(System.currentTimeMillis());
                    }
                    m25322A0(e1Var);
                }
                m25236f2(!z, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
                return;
            }
            this.f13733d.mo24885b("Re-enabling SDK not possible for forgotten user", new Object[0]);
        }
    }

    /* renamed from: F0 */
    private boolean m25312F0(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.f13732c.m25100c(str)) {
                this.f13733d.mo24879h("Skipping duplicated order ID '%s'", str);
                return false;
            }
            this.f13732c.m25101a(str);
            this.f13733d.mo24880g("Added order ID '%s'", str);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public void m25311F1(boolean z) {
        if (m25271U0(this.f13737h.m25181k(), z, "Adjust already in offline mode", "Adjust already in online mode")) {
            C6588s0 s0Var = this.f13737h;
            s0Var.f13814b = z;
            if (s0Var.m25191a()) {
                m25236f2(z, "Handlers will start paused due to SDK being offline", "Handlers will still start as paused", "Handlers will start as active due to SDK being online");
            } else {
                m25236f2(z, "Pausing handlers to put SDK offline mode", "Handlers remain paused", "Resuming handlers to put SDK in online mode");
            }
        }
    }

    /* renamed from: G0 */
    private Intent m25310G0(Uri uri) {
        Intent intent;
        if (this.f13739j.f13962m == null) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            C6624h hVar = this.f13739j;
            intent = new Intent("android.intent.action.VIEW", uri, hVar.f13953d, hVar.f13962m);
        }
        intent.setFlags(268435456);
        intent.setPackage(this.f13739j.f13953d.getPackageName());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public void m25309G1(String str) {
        if (m25197x0(this.f13732c) && m25265W0()) {
            C6610d dVar = this.f13732c;
            if (!dVar.f13894n && str != null && !str.equals(dVar.f13906z)) {
                this.f13732c.f13906z = str;
                m25233g2();
                C6607c t = new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, System.currentTimeMillis()).m24747t("push");
                this.f13731b.mo24702h(t);
                new C6615e1(getContext()).m25035u();
                if (this.f13739j.f13958i) {
                    this.f13733d.mo24879h("Buffered event %s", t.m25112q());
                } else {
                    this.f13731b.mo24703g();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public void m25308H0() {
        double d;
        if (!this.f13737h.m25182j() && !m25262X0()) {
            Double d2 = this.f13739j.f13969t;
            if (d2 != null) {
                d = d2.doubleValue();
            } else {
                d = 0.0d;
            }
            long k = C6639l.m24862k();
            long j = (long) (1000.0d * d);
            if (j > k) {
                double d3 = k / 1000;
                DecimalFormat decimalFormat = C6629i1.f13988a;
                this.f13733d.mo24886a("Delay start of %s seconds bigger than max allowed value of %s seconds", decimalFormat.format(d), decimalFormat.format(d3));
                d = d3;
            } else {
                k = j;
            }
            this.f13733d.mo24879h("Waiting %s seconds before starting first session", C6629i1.f13988a.format(d));
            this.f13736g.m22719h(k);
            this.f13737h.f13817e = true;
            C6610d dVar = this.f13732c;
            if (dVar != null) {
                dVar.f13904x = true;
                m25233g2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public void m25307H1() {
        if (this.f13735f != null && m25282Q1() && this.f13735f.m22720g() <= 0) {
            this.f13735f.m22719h(f13727s);
        }
    }

    /* renamed from: I0 */
    public static boolean m25306I0(Context context) {
        return context.deleteFile("AdjustIoActivityState");
    }

    /* renamed from: I1 */
    private void m25305I1() {
        this.f13732c = new C6610d();
        this.f13737h.f13820h = true;
        m25242d2();
        long currentTimeMillis = System.currentTimeMillis();
        C6615e1 e1Var = new C6615e1(getContext());
        this.f13732c.f13906z = e1Var.m25045k();
        if (this.f13737h.m25187e()) {
            if (e1Var.m25050f()) {
                m25280R0();
            } else {
                if (e1Var.m25051e()) {
                    m25292N0();
                }
                for (C6665s sVar : this.f13739j.f13970u.f14080b) {
                    m25258Y1(sVar);
                }
                Boolean bool = this.f13739j.f13970u.f14081c;
                if (bool != null) {
                    m25267V1(bool.booleanValue());
                }
                this.f13739j.f13970u.f14080b = new ArrayList();
                this.f13739j.f13970u.f14081c = null;
                this.f13732c.f13898r = 1;
                m25255Z1(currentTimeMillis);
                m25322A0(e1Var);
            }
        }
        this.f13732c.m25099d(currentTimeMillis);
        this.f13732c.f13893m = this.f13737h.m25187e();
        this.f13732c.f13904x = this.f13737h.m25180l();
        m25233g2();
        e1Var.m25035u();
        e1Var.m25037s();
        e1Var.m25038r();
        m25220l1();
    }

    /* renamed from: J0 */
    public static boolean m25304J0(Context context) {
        return context.deleteFile("AdjustAttribution");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public void m25303J1() {
        if (m25265W0()) {
            this.f13734e.m22729e();
        }
    }

    /* renamed from: K0 */
    public static boolean m25301K0(Context context) {
        return context.deleteFile("AdjustSessionCallbackParameters");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K1 */
    public void m25300K1() {
        if (this.f13737h.m25191a()) {
            C6661q.m24785d(this.f13739j.f13971v);
            m25305I1();
        } else if (this.f13732c.f13893m) {
            C6661q.m24785d(this.f13739j.f13971v);
            m25242d2();
            m25218m1();
            m25320B0();
            m25220l1();
        }
    }

    /* renamed from: L0 */
    public static boolean m25298L0(Context context) {
        return context.deleteFile("AdjustSessionPartnerParameters");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public void m25297L1() {
        C7410j jVar = this.f13735f;
        if (jVar != null) {
            jVar.m22722e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public static void m25295M0(Context context) {
        m25306I0(context);
        m25304J0(context);
        m25301K0(context);
        m25298L0(context);
        new C6615e1(context).m25055a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public void m25294M1() {
        this.f13734e.m22728f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public void m25292N0() {
        C6615e1 e1Var = new C6615e1(getContext());
        e1Var.m25060D();
        if (m25197x0(this.f13732c) && m25265W0()) {
            C6610d dVar = this.f13732c;
            if (!dVar.f13894n && !dVar.f13895o) {
                dVar.f13895o = true;
                m25233g2();
                C6607c q = new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, System.currentTimeMillis()).m24750q();
                this.f13731b.mo24702h(q);
                e1Var.m25038r();
                if (this.f13739j.f13958i) {
                    this.f13733d.mo24879h("Buffered event %s", q.m25112q());
                } else {
                    this.f13731b.mo24703g();
                }
            }
        }
    }

    /* renamed from: N1 */
    private void m25291N1() {
        synchronized (C6610d.class) {
            if (this.f13732c != null) {
                this.f13732c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public void m25289O0() {
        if (!m25282Q1()) {
            m25231h1();
        }
        if (m25252a2(System.currentTimeMillis())) {
            m25233g2();
        }
    }

    /* renamed from: O1 */
    private void m25288O1() {
        synchronized (C6609c1.class) {
            if (this.f13743n != null) {
                this.f13743n = null;
            }
        }
    }

    /* renamed from: P1 */
    private void m25285P1() {
        synchronized (C6619g.class) {
            if (this.f13740k != null) {
                this.f13740k = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m25283Q0() {
        if (!m25265W0()) {
            m25294M1();
            return;
        }
        if (m25282Q1()) {
            this.f13731b.mo24703g();
        }
        if (m25252a2(System.currentTimeMillis())) {
            m25233g2();
        }
    }

    /* renamed from: Q1 */
    private boolean m25282Q1() {
        return m25279R1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public void m25280R0() {
        if (m25197x0(this.f13732c) && m25265W0()) {
            C6610d dVar = this.f13732c;
            if (!dVar.f13894n) {
                dVar.f13894n = true;
                m25233g2();
                C6607c s = new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, System.currentTimeMillis()).m24748s();
                this.f13731b.mo24702h(s);
                new C6615e1(getContext()).m25037s();
                if (this.f13739j.f13958i) {
                    this.f13733d.mo24879h("Buffered event %s", s.m25112q());
                } else {
                    this.f13731b.mo24703g();
                }
            }
        }
    }

    /* renamed from: R1 */
    private boolean m25279R1(boolean z) {
        if (m25228i1(z)) {
            return false;
        }
        if (this.f13739j.f13968s) {
            return true;
        }
        return this.f13737h.m25183i();
    }

    /* renamed from: S0 */
    public static C6551a m25277S0(C6624h hVar) {
        if (hVar == null) {
            C6639l.m24863j().mo24885b("AdjustConfig missing", new Object[0]);
            return null;
        } else if (!hVar.m24986e()) {
            C6639l.m24863j().mo24885b("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        } else {
            if (hVar.f13956g != null) {
                int myPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) hVar.f13953d.getSystemService("activity");
                if (activityManager != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == myPid) {
                            if (!next.processName.equalsIgnoreCase(hVar.f13956g)) {
                                C6639l.m24863j().mo24879h("Skipping initialization in background process (%s)", next.processName);
                                return null;
                            }
                        }
                    }
                } else {
                    return null;
                }
            }
            return new C6551a(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public void m25276S1(C6616f fVar) {
        if (m25197x0(this.f13732c) && m25265W0() && m25195y0(fVar) && !this.f13732c.f13894n) {
            this.f13731b.mo24702h(new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, System.currentTimeMillis()).m24754m(fVar, this.f13737h.m25184h()));
            this.f13731b.mo24703g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public void m25274T0() {
        this.f13732c.f13894n = true;
        m25233g2();
        this.f13731b.flush();
        m25313E1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T1 */
    public void m25273T1(String str, JSONObject jSONObject) {
        if (m25197x0(this.f13732c) && m25265W0() && !this.f13732c.f13894n) {
            this.f13731b.mo24702h(new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, System.currentTimeMillis()).m24753n(str, jSONObject));
            this.f13731b.mo24703g();
        }
    }

    /* renamed from: U0 */
    private boolean m25271U0(boolean z, boolean z2, String str, String str2) {
        if (z != z2) {
            return true;
        }
        if (z) {
            this.f13733d.mo24884c(str, new Object[0]);
        } else {
            this.f13733d.mo24884c(str2, new Object[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U1 */
    public void m25270U1(C6627i iVar) {
        if (m25197x0(this.f13732c) && m25265W0() && m25318C0(iVar) && m25312F0(iVar.f13986f) && !this.f13732c.f13894n) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f13732c.f13897q++;
            m25252a2(currentTimeMillis);
            C6607c r = new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, currentTimeMillis).m24749r(iVar, this.f13737h.m25184h());
            this.f13731b.mo24702h(r);
            if (this.f13739j.f13958i) {
                this.f13733d.mo24879h("Buffered event %s", r.m25112q());
            } else {
                this.f13731b.mo24703g();
            }
            if (this.f13739j.f13968s && this.f13737h.m25185g()) {
                m25307H1();
            }
            m25233g2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public void m25268V0() {
        Double d;
        f13728t = C6639l.m24857p();
        f13729u = C6639l.m24855r();
        f13725q = C6639l.m24854s();
        f13726r = C6639l.m24853t();
        f13727s = C6639l.m24854s();
        m25214o1(this.f13739j.f13953d);
        m25216n1(this.f13739j.f13953d);
        this.f13743n = new C6609c1();
        m25208r1(this.f13739j.f13953d);
        m25206s1(this.f13739j.f13953d);
        C6624h hVar = this.f13739j;
        if (hVar.f13974y != null) {
            hVar.f13970u.f14079a.add(new C6595z());
        }
        if (this.f13737h.m25190b()) {
            C6588s0 s0Var = this.f13737h;
            C6610d dVar = this.f13732c;
            s0Var.f13813a = dVar.f13893m;
            s0Var.f13817e = dVar.f13904x;
            s0Var.f13818f = false;
        } else {
            this.f13737h.f13818f = true;
        }
        m25212p1(this.f13739j.f13953d);
        C6624h hVar2 = this.f13739j;
        this.f13738i = new C6689x(hVar2.f13953d, hVar2.f13957h);
        if (this.f13739j.f13958i) {
            this.f13733d.mo24879h("Event buffering is enabled", new Object[0]);
        }
        this.f13738i.m24666A(this.f13739j.f13953d);
        if (this.f13738i.f14198a == null) {
            this.f13733d.mo24886a("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
            C6689x xVar = this.f13738i;
            if (xVar.f14203f == null && xVar.f14204g == null && xVar.f14205h == null) {
                this.f13733d.mo24885b("Unable to get any device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
            }
        } else {
            this.f13733d.mo24879h("Google Play Services Advertising ID read correctly at start time", new Object[0]);
        }
        String str = this.f13739j.f13959j;
        if (str != null) {
            this.f13733d.mo24879h("Default tracker: '%s'", str);
        }
        String str2 = this.f13739j.f13973x;
        if (str2 != null) {
            this.f13733d.mo24879h("Push token: '%s'", str2);
            if (this.f13737h.m25190b()) {
                mo25160k(this.f13739j.f13973x, false);
            } else {
                new C6615e1(getContext()).m25030z(this.f13739j.f13973x);
            }
        } else if (this.f13737h.m25190b()) {
            mo25160k(new C6615e1(getContext()).m25045k(), true);
        }
        if (this.f13737h.m25190b()) {
            C6615e1 e1Var = new C6615e1(getContext());
            if (e1Var.m25050f()) {
                mo25145z();
            } else {
                if (e1Var.m25051e()) {
                    mo25152s();
                }
                for (C6665s sVar : this.f13739j.f13970u.f14080b) {
                    mo25150u(sVar);
                }
                Boolean bool = this.f13739j.f13970u.f14081c;
                if (bool != null) {
                    mo25165f(bool.booleanValue());
                }
                this.f13739j.f13970u.f14080b = new ArrayList();
                this.f13739j.f13970u.f14081c = null;
            }
        }
        this.f13734e = new C7408i(new RunnableC6552a0(), f13726r, f13725q, "Foreground timer");
        if (this.f13739j.f13968s) {
            this.f13733d.mo24879h("Send in background configured", new Object[0]);
            this.f13735f = new C7410j(new RunnableC6554b0(), "Background timer");
        }
        if (this.f13737h.m25191a() && (d = this.f13739j.f13969t) != null && d.doubleValue() > 0.0d) {
            this.f13733d.mo24879h("Delay start configured", new Object[0]);
            this.f13737h.f13816d = true;
            this.f13736g = new C7410j(new RunnableC6556c0(), "Delay Start timer");
        }
        C7006d.m23662f(this.f13739j.f13972w);
        C6624h hVar3 = this.f13739j;
        this.f13731b = C6639l.m24861l(this, this.f13739j.f13953d, m25279R1(false), new C7002a(hVar3.f37954F, hVar3.f13950a, hVar3.f13951b, hVar3.f13952c, this.f13738i.f14207j));
        C6624h hVar4 = this.f13739j;
        this.f13741l = C6639l.m24869d(this, m25279R1(false), new C7002a(hVar4.f37954F, hVar4.f13950a, hVar4.f13951b, hVar4.f13952c, this.f13738i.f14207j));
        C6624h hVar5 = this.f13739j;
        this.f13742m = C6639l.m24858o(this, m25279R1(true), new C7002a(hVar5.f37954F, hVar5.f13950a, hVar5.f13951b, hVar5.f13952c, this.f13738i.f14207j));
        if (m25262X0()) {
            m25239e2();
        }
        this.f13744o = new C6620g0(this.f13739j.f13953d, new C6558d0());
        this.f13745p = new C6625h0(this.f13739j.f13953d, new C6560e0());
        m25225j1(this.f13739j.f13970u.f14079a);
        m25317C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V1 */
    public void m25267V1(boolean z) {
        if (!m25197x0(this.f13732c)) {
            this.f13739j.f13970u.f14081c = Boolean.valueOf(z);
        } else if (m25265W0() && !this.f13732c.f13894n) {
            C6607c u = new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, System.currentTimeMillis()).m24746u(z);
            this.f13731b.mo24702h(u);
            if (this.f13739j.f13958i) {
                this.f13733d.mo24879h("Buffered event %s", u.m25112q());
            } else {
                this.f13731b.mo24703g();
            }
        }
    }

    /* renamed from: W0 */
    private boolean m25265W0() {
        C6610d dVar = this.f13732c;
        if (dVar != null) {
            return dVar.f13893m;
        }
        return this.f13737h.m25187e();
    }

    /* renamed from: W1 */
    private void m25264W1(long j) {
        C6610d dVar = this.f13732c;
        dVar.f13898r++;
        dVar.f13903w = j - dVar.f13902v;
        m25255Z1(j);
        this.f13732c.m25099d(j);
        m25233g2();
    }

    /* renamed from: X0 */
    private boolean m25262X0() {
        C6610d dVar = this.f13732c;
        if (dVar != null) {
            return dVar.f13904x;
        }
        return this.f13737h.m25180l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X1 */
    public void m25261X1(C6655n nVar) {
        if (m25197x0(this.f13732c) && m25265W0() && !this.f13732c.f13894n) {
            this.f13731b.mo24702h(new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, System.currentTimeMillis()).m24744w(nVar, this.f13737h.m25184h()));
            this.f13731b.mo24703g();
        }
    }

    /* renamed from: Y0 */
    private boolean m25259Y0(C6690x0 x0Var) {
        String str;
        if (x0Var == null || (str = x0Var.f14224a) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m25258Y1(C6665s sVar) {
        if (!m25197x0(this.f13732c)) {
            this.f13739j.f13970u.f14080b.add(sVar);
        } else if (m25265W0() && !this.f13732c.f13894n) {
            C6607c x = new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, System.currentTimeMillis()).m24743x(sVar);
            this.f13731b.mo24702h(x);
            if (this.f13739j.f13958i) {
                this.f13733d.mo24879h("Buffered event %s", x.m25112q());
            } else {
                this.f13731b.mo24703g();
            }
        }
    }

    /* renamed from: Z0 */
    private void m25256Z0(Handler handler) {
        if (this.f13739j.f13960k != null) {
            handler.post(new RunnableC6572k0());
        }
    }

    /* renamed from: Z1 */
    private void m25255Z1(long j) {
        this.f13731b.mo24702h(new C6668t0(this.f13739j, this.f13738i, this.f13732c, this.f13743n, j).m24745v(this.f13737h.m25184h()));
        this.f13731b.mo24703g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public void m25253a1(C6678v vVar) {
        m25249b2(vVar.f14242c);
        Handler handler = new Handler(this.f13739j.f13953d.getMainLooper());
        if (m25246c2(vVar.f14248i)) {
            m25256Z0(handler);
        }
        m25222k1(vVar.f14168o, handler);
    }

    /* renamed from: a2 */
    private boolean m25252a2(long j) {
        if (!m25197x0(this.f13732c)) {
            return false;
        }
        C6610d dVar = this.f13732c;
        long j2 = j - dVar.f13902v;
        if (j2 > f13728t) {
            return false;
        }
        dVar.f13902v = j;
        if (j2 < 0) {
            this.f13733d.mo24885b("Time travel!", new Object[0]);
            return true;
        }
        dVar.f13900t += j2;
        dVar.f13901u += j2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public void m25250b1(Intent intent, Uri uri) {
        boolean z;
        if (this.f13739j.f13953d.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f13733d.mo24885b("Unable to open deferred deep link (%s)", uri);
            return;
        }
        this.f13733d.mo24879h("Open deferred deep link (%s)", uri);
        this.f13739j.f13953d.startActivity(intent);
    }

    /* renamed from: b2 */
    private void m25249b2(String str) {
        if (str != null && !str.equals(this.f13732c.f37937A)) {
            this.f13732c.f37937A = str;
            m25233g2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public void m25243d1(C6691y yVar) {
        m25249b2(yVar.f14242c);
        Handler handler = new Handler(this.f13739j.f13953d.getMainLooper());
        boolean z = yVar.f14240a;
        if (z && this.f13739j.f13963n != null) {
            this.f13733d.mo24884c("Launching success event tracking listener", new Object[0]);
            handler.post(new RunnableC6564g0(yVar));
        } else if (!z && this.f13739j.f13964o != null) {
            this.f13733d.mo24884c("Launching failed event tracking listener", new Object[0]);
            handler.post(new RunnableC6566h0(yVar));
        }
    }

    /* renamed from: d2 */
    private void m25242d2() {
        if (!m25282Q1()) {
            m25231h1();
            return;
        }
        m25196x1();
        if (!this.f13739j.f13958i || (this.f13737h.m25186f() && this.f13737h.m25188d())) {
            this.f13731b.mo24703g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public void m25240e1(C6606b1 b1Var) {
        m25249b2(b1Var.f14242c);
        Handler handler = new Handler(this.f13739j.f13953d.getMainLooper());
        if (m25246c2(b1Var.f14248i)) {
            m25256Z0(handler);
        }
    }

    /* renamed from: e2 */
    private void m25239e2() {
        this.f13731b.mo24704e(this.f13743n);
        this.f13737h.f13817e = false;
        C6610d dVar = this.f13732c;
        if (dVar != null) {
            dVar.f13904x = false;
            m25233g2();
        }
    }

    /* renamed from: f1 */
    private void m25237f1(C6612d1 d1Var, Handler handler) {
        boolean z = d1Var.f14240a;
        if (z && this.f13739j.f13965p != null) {
            this.f13733d.mo24884c("Launching success session tracking listener", new Object[0]);
            handler.post(new RunnableC6568i0(d1Var));
        } else if (!z && this.f13739j.f13966q != null) {
            this.f13733d.mo24884c("Launching failed session tracking listener", new Object[0]);
            handler.post(new RunnableC6570j0(d1Var));
        }
    }

    /* renamed from: f2 */
    private void m25236f2(boolean z, String str, String str2, String str3) {
        if (z) {
            this.f13733d.mo24879h(str, new Object[0]);
        } else if (!m25228i1(false)) {
            this.f13733d.mo24879h(str3, new Object[0]);
        } else if (m25228i1(true)) {
            this.f13733d.mo24879h(str2, new Object[0]);
        } else {
            AbstractC6608c0 c0Var = this.f13733d;
            c0Var.mo24879h(str2 + ", except the Sdk Click Handler", new Object[0]);
        }
        m25242d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public void m25234g1(C6612d1 d1Var) {
        this.f13733d.mo24884c("Launching SessionResponse tasks", new Object[0]);
        m25249b2(d1Var.f14242c);
        Handler handler = new Handler(this.f13739j.f13953d.getMainLooper());
        if (m25246c2(d1Var.f14248i)) {
            m25256Z0(handler);
        }
        if (this.f13740k == null && !this.f13732c.f13896p) {
            this.f13741l.mo24736e();
        }
        if (d1Var.f14240a) {
            new C6615e1(getContext()).m25058F();
        }
        m25237f1(d1Var, handler);
        this.f13737h.f13819g = true;
    }

    /* renamed from: g2 */
    private void m25233g2() {
        synchronized (C6610d.class) {
            C6610d dVar = this.f13732c;
            if (dVar != null) {
                C6629i1.m24910h0(dVar, this.f13739j.f13953d, "AdjustIoActivityState", "Activity state");
            }
        }
    }

    /* renamed from: h1 */
    private void m25231h1() {
        this.f13741l.mo24739b();
        this.f13731b.mo24707b();
        if (!m25279R1(true)) {
            this.f13742m.mo25019b();
        } else {
            this.f13742m.mo25018c();
        }
    }

    /* renamed from: h2 */
    private void m25230h2() {
        synchronized (C6619g.class) {
            C6619g gVar = this.f13740k;
            if (gVar != null) {
                C6629i1.m24910h0(gVar, this.f13739j.f13953d, "AdjustAttribution", "Attribution");
            }
        }
    }

    /* renamed from: i1 */
    private boolean m25228i1(boolean z) {
        if (z) {
            if (this.f13737h.m25181k() || !m25265W0()) {
                return true;
            }
            return false;
        } else if (this.f13737h.m25181k() || !m25265W0() || this.f13737h.m25184h()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i2 */
    private void m25227i2() {
        synchronized (C6609c1.class) {
            C6609c1 c1Var = this.f13743n;
            if (c1Var != null) {
                C6629i1.m24910h0(c1Var.f13889a, this.f13739j.f13953d, "AdjustSessionCallbackParameters", "Session Callback parameters");
            }
        }
    }

    /* renamed from: j1 */
    private void m25225j1(List<AbstractC6614e0> list) {
        if (list != null) {
            for (AbstractC6614e0 e0Var : list) {
                e0Var.mo24803a(this);
            }
        }
    }

    /* renamed from: j2 */
    private void m25224j2() {
        synchronized (C6609c1.class) {
            C6609c1 c1Var = this.f13743n;
            if (c1Var != null) {
                C6629i1.m24910h0(c1Var.f13890b, this.f13739j.f13953d, "AdjustSessionPartnerParameters", "Session Partner parameters");
            }
        }
    }

    /* renamed from: k1 */
    private void m25222k1(Uri uri, Handler handler) {
        if (uri != null) {
            this.f13733d.mo24879h("Deferred deeplink received (%s)", uri);
            handler.post(new RunnableC6574l0(uri, m25310G0(uri)));
        }
    }

    /* renamed from: l1 */
    private void m25220l1() {
        if (m25197x0(this.f13732c)) {
            C6615e1 e1Var = new C6615e1(getContext());
            String d = e1Var.m25052d();
            long c = e1Var.m25053c();
            if (d != null && c != -1) {
                mo25151t(Uri.parse(d), c);
                e1Var.m25039q();
            }
        }
    }

    /* renamed from: m1 */
    private void m25218m1() {
        if (!this.f13732c.f13894n) {
            long currentTimeMillis = System.currentTimeMillis();
            C6610d dVar = this.f13732c;
            long j = currentTimeMillis - dVar.f13902v;
            if (j < 0) {
                this.f13733d.mo24885b("Time travel!", new Object[0]);
                this.f13732c.f13902v = currentTimeMillis;
                m25233g2();
            } else if (j > f13728t) {
                m25264W1(currentTimeMillis);
                m25193z0();
            } else if (j > f13729u) {
                int i = dVar.f13899s + 1;
                dVar.f13899s = i;
                dVar.f13900t += j;
                dVar.f13902v = currentTimeMillis;
                this.f13733d.mo24880g("Started subsession %d of session %d", Integer.valueOf(i), Integer.valueOf(this.f13732c.f13898r));
                m25233g2();
                m25314E0();
                this.f13744o.m24994s();
                this.f13745p.m24962c();
            } else {
                this.f13733d.mo24880g("Time span since last activity too short for a new subsession", new Object[0]);
            }
        }
    }

    /* renamed from: n1 */
    private void m25216n1(Context context) {
        try {
            this.f13732c = (C6610d) C6629i1.m24922b0(context, "AdjustIoActivityState", "Activity state", C6610d.class);
        } catch (Exception e) {
            this.f13733d.mo24885b("Failed to read %s file (%s)", "Activity state", e.getMessage());
            this.f13732c = null;
        }
        if (this.f13732c != null) {
            this.f13737h.f13820h = true;
        }
    }

    /* renamed from: o1 */
    private void m25214o1(Context context) {
        try {
            this.f13740k = (C6619g) C6629i1.m24922b0(context, "AdjustAttribution", "Attribution", C6619g.class);
        } catch (Exception e) {
            this.f13733d.mo24885b("Failed to read %s file (%s)", "Attribution", e.getMessage());
            this.f13740k = null;
        }
    }

    /* renamed from: p1 */
    private void m25212p1(Context context) {
        try {
            InputStream open = context.getAssets().open("adjust_config.properties");
            Properties properties = new Properties();
            properties.load(open);
            this.f13733d.mo24880g("adjust_config.properties file read and loaded", new Object[0]);
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                this.f13739j.f13959j = property;
            }
        } catch (Exception e) {
            this.f13733d.mo24884c("%s file not found in this app", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public void m25210q1(Uri uri, long j) {
        if (m25265W0()) {
            if (C6629i1.m24930V(uri)) {
                AbstractC6608c0 c0Var = this.f13733d;
                c0Var.mo24884c("Deep link (" + uri.toString() + ") processing skipped", new Object[0]);
                return;
            }
            C6607c a = C6677u0.m24715a(uri, j, this.f13732c, this.f13739j, this.f13738i, this.f13743n);
            if (a != null) {
                this.f13742m.mo25014g(a);
            }
        }
    }

    /* renamed from: r1 */
    private void m25208r1(Context context) {
        try {
            this.f13743n.f13889a = (Map) C6629i1.m24922b0(context, "AdjustSessionCallbackParameters", "Session Callback parameters", Map.class);
        } catch (Exception e) {
            this.f13733d.mo24885b("Failed to read %s file (%s)", "Session Callback parameters", e.getMessage());
            this.f13743n.f13889a = null;
        }
    }

    /* renamed from: s1 */
    private void m25206s1(Context context) {
        try {
            this.f13743n.f13890b = (Map) C6629i1.m24922b0(context, "AdjustSessionPartnerParameters", "Session Partner parameters", Map.class);
        } catch (Exception e) {
            this.f13733d.mo24885b("Failed to read %s file (%s)", "Session Partner parameters", e.getMessage());
            this.f13743n.f13890b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public void m25199w0() {
        if (m25282Q1()) {
            this.f13731b.mo24703g();
        }
    }

    /* renamed from: x0 */
    private boolean m25197x0(C6610d dVar) {
        if (!this.f13737h.m25191a()) {
            return true;
        }
        this.f13733d.mo24885b("Sdk did not yet start", new Object[0]);
        return false;
    }

    /* renamed from: x1 */
    private void m25196x1() {
        this.f13741l.mo24738c();
        this.f13731b.mo24706c();
        this.f13742m.mo25018c();
    }

    /* renamed from: y0 */
    private boolean m25195y0(C6616f fVar) {
        if (fVar == null) {
            this.f13733d.mo24885b("Ad revenue object missing", new Object[0]);
            return false;
        } else if (fVar.m25027c()) {
            return true;
        } else {
            this.f13733d.mo24885b("Ad revenue object not initialized correctly", new Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public void m25194y1() {
        if (this.f13737h.m25182j()) {
            this.f13733d.mo24879h("Start delay expired or never configured", new Object[0]);
            return;
        }
        m25239e2();
        this.f13737h.f13816d = false;
        this.f13736g.m22722e();
        this.f13736g = null;
        m25242d2();
    }

    /* renamed from: z0 */
    private void m25193z0() {
        m25322A0(new C6615e1(getContext()));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: A */
    public C6610d mo25179A() {
        return this.f13732c;
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: B */
    public void mo25178B(String str, String str2) {
        this.f13730a.submit(new RunnableC6565h(str, str2));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: C */
    public void mo25177C() {
        this.f13737h.f13815c = true;
        this.f13730a.submit(new RunnableC6562f0());
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: D */
    public C6624h mo25176D() {
        return this.f13739j;
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: E */
    public void mo25175E() {
        this.f13730a.submit(new RunnableC6586r0());
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: F */
    public void mo25174F(C6627i iVar) {
        this.f13730a.submit(new RunnableC6576m0(iVar));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: G */
    public void mo25173G() {
        this.f13730a.submit(new RunnableC6573l());
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: H */
    public void mo25172H() {
        this.f13730a.submit(new RunnableC6592w());
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: I */
    public void mo25171I(C6697z0 z0Var) {
        if (z0Var instanceof C6612d1) {
            this.f13733d.mo24884c("Finished tracking session", new Object[0]);
            this.f13741l.mo24734h((C6612d1) z0Var);
        } else if (z0Var instanceof C6606b1) {
            C6606b1 b1Var = (C6606b1) z0Var;
            m25316D0(b1Var);
            this.f13741l.mo24735g(b1Var);
        } else if (z0Var instanceof C6691y) {
            m25247c1((C6691y) z0Var);
        }
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: J */
    public void mo25170J(C6624h hVar) {
        this.f13739j = hVar;
    }

    /* renamed from: P0 */
    public void m25286P0() {
        this.f13730a.submit(new RunnableC6593x());
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: a */
    public void mo25169a() {
        C7410j jVar = this.f13735f;
        if (jVar != null) {
            jVar.m22718i();
        }
        C7408i iVar = this.f13734e;
        if (iVar != null) {
            iVar.m22727g();
        }
        C7410j jVar2 = this.f13736g;
        if (jVar2 != null) {
            jVar2.m22718i();
        }
        AbstractC7404f fVar = this.f13730a;
        if (fVar != null) {
            fVar.mo22735a();
        }
        AbstractC6611d0 d0Var = this.f13731b;
        if (d0Var != null) {
            d0Var.mo24708a();
        }
        AbstractC6605b0 b0Var = this.f13741l;
        if (b0Var != null) {
            b0Var.mo24740a();
        }
        AbstractC6617f0 f0Var = this.f13742m;
        if (f0Var != null) {
            f0Var.mo25020a();
        }
        C6609c1 c1Var = this.f13743n;
        if (c1Var != null) {
            Map<String, String> map = c1Var.f13889a;
            if (map != null) {
                map.clear();
            }
            Map<String, String> map2 = this.f13743n.f13890b;
            if (map2 != null) {
                map2.clear();
            }
        }
        m25291N1();
        m25285P1();
        m25288O1();
        this.f13731b = null;
        this.f13733d = null;
        this.f13734e = null;
        this.f13730a = null;
        this.f13735f = null;
        this.f13736g = null;
        this.f13737h = null;
        this.f13738i = null;
        this.f13739j = null;
        this.f13741l = null;
        this.f13742m = null;
        this.f13743n = null;
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: b */
    public C6609c1 mo25168b() {
        return this.f13743n;
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: c */
    public void mo25167c() {
        this.f13737h.f13815c = false;
        this.f13730a.submit(new RunnableC6590u());
    }

    /* renamed from: c1 */
    public void m25247c1(C6691y yVar) {
        this.f13730a.submit(new RunnableC6553b(yVar));
    }

    /* renamed from: c2 */
    public boolean m25246c2(C6619g gVar) {
        if (gVar == null || gVar.equals(this.f13740k)) {
            return false;
        }
        this.f13740k = gVar;
        m25230h2();
        return true;
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: e */
    public C6619g mo25166e() {
        return this.f13740k;
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: f */
    public void mo25165f(boolean z) {
        this.f13730a.submit(new RunnableC6585r(z));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: g */
    public void mo25164g(C6612d1 d1Var) {
        this.f13730a.submit(new RunnableC6557d(d1Var));
    }

    @Override // p074e2.AbstractC6596a0
    public Context getContext() {
        return this.f13739j.f13953d;
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: h */
    public void mo25163h(String str) {
        this.f13730a.submit(new RunnableC6571k(str));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: i */
    public void mo25162i() {
        this.f13730a.submit(new RunnableC6575m());
    }

    @Override // p074e2.AbstractC6596a0
    public boolean isEnabled() {
        return m25265W0();
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: j */
    public String mo25161j() {
        C6610d dVar = this.f13732c;
        if (dVar == null) {
            return null;
        }
        return dVar.f37937A;
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: k */
    public void mo25160k(String str, boolean z) {
        this.f13730a.submit(new RunnableC6577n(z, str));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: l */
    public void mo25159l(C6606b1 b1Var) {
        this.f13730a.submit(new RunnableC6555c(b1Var));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: m */
    public void mo25158m(String str, JSONObject jSONObject) {
        this.f13730a.submit(new RunnableC6587s(str, jSONObject));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: n */
    public void mo25157n(boolean z) {
        this.f13730a.submit(new RunnableC6584q0(z));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: o */
    public void mo25156o() {
        this.f13730a.submit(new RunnableC6561f());
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: p */
    public void mo25155p(C6678v vVar) {
        this.f13730a.submit(new RunnableC6559e(vVar));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: q */
    public void mo25154q(C6616f fVar) {
        this.f13730a.submit(new RunnableC6589t(fVar));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: r */
    public void mo25153r(String str, String str2) {
        this.f13730a.submit(new RunnableC6563g(str, str2));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: s */
    public void mo25152s() {
        this.f13730a.submit(new RunnableC6581p());
    }

    @Override // p074e2.AbstractC6596a0
    public void setEnabled(boolean z) {
        this.f13730a.submit(new RunnableC6578n0(z));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: t */
    public void mo25151t(Uri uri, long j) {
        this.f13730a.submit(new RunnableC6582p0(uri, j));
    }

    /* renamed from: t0 */
    public void m25205t0(String str, String str2) {
        if (C6629i1.m24929W(str, "key", "Session Callback") && C6629i1.m24929W(str2, "value", "Session Callback")) {
            C6609c1 c1Var = this.f13743n;
            if (c1Var.f13889a == null) {
                c1Var.f13889a = new LinkedHashMap();
            }
            String str3 = this.f13743n.f13889a.get(str);
            if (str2.equals(str3)) {
                this.f13733d.mo24880g("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.f13733d.mo24886a("Key %s will be overwritten", str);
            }
            this.f13743n.f13889a.put(str, str2);
            m25227i2();
        }
    }

    /* renamed from: t1 */
    public void m25204t1(String str) {
        if (C6629i1.m24929W(str, "key", "Session Callback")) {
            Map<String, String> map = this.f13743n.f13889a;
            if (map == null) {
                this.f13733d.mo24886a("Session Callback parameters are not set", new Object[0]);
            } else if (map.remove(str) == null) {
                this.f13733d.mo24886a("Key %s does not exist", str);
            } else {
                this.f13733d.mo24884c("Key %s will be removed", str);
                m25227i2();
            }
        }
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: u */
    public void mo25150u(C6665s sVar) {
        this.f13730a.submit(new RunnableC6583q(sVar));
    }

    /* renamed from: u0 */
    public void m25203u0(String str, String str2) {
        if (C6629i1.m24929W(str, "key", "Session Partner") && C6629i1.m24929W(str2, "value", "Session Partner")) {
            C6609c1 c1Var = this.f13743n;
            if (c1Var.f13890b == null) {
                c1Var.f13890b = new LinkedHashMap();
            }
            String str3 = this.f13743n.f13890b.get(str);
            if (str2.equals(str3)) {
                this.f13733d.mo24880g("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.f13733d.mo24886a("Key %s will be overwritten", str);
            }
            this.f13743n.f13890b.put(str, str2);
            m25224j2();
        }
    }

    /* renamed from: u1 */
    public void m25202u1(String str) {
        if (C6629i1.m24929W(str, "key", "Session Partner")) {
            Map<String, String> map = this.f13743n.f13890b;
            if (map == null) {
                this.f13733d.mo24886a("Session Partner parameters are not set", new Object[0]);
            } else if (map.remove(str) == null) {
                this.f13733d.mo24886a("Key %s does not exist", str);
            } else {
                this.f13733d.mo24884c("Key %s will be removed", str);
                m25224j2();
            }
        }
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: v */
    public void mo25149v(C6655n nVar) {
        this.f13730a.submit(new RunnableC6591v(nVar));
    }

    /* renamed from: v0 */
    public void m25201v0() {
        this.f13730a.submit(new RunnableC6594y());
    }

    /* renamed from: v1 */
    public void m25200v1() {
        if (this.f13743n.f13889a == null) {
            this.f13733d.mo24886a("Session Callback parameters are not set", new Object[0]);
        }
        this.f13743n.f13889a = null;
        m25227i2();
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: w */
    public void mo25148w(String str) {
        this.f13730a.submit(new RunnableC6567i(str));
    }

    /* renamed from: w1 */
    public void m25198w1() {
        if (this.f13743n.f13890b == null) {
            this.f13733d.mo24886a("Session Partner parameters are not set", new Object[0]);
        }
        this.f13743n.f13890b = null;
        m25224j2();
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: x */
    public void mo25147x(boolean z) {
        this.f13730a.submit(new RunnableC6580o0(z));
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: y */
    public C6689x mo25146y() {
        return this.f13738i;
    }

    @Override // p074e2.AbstractC6596a0
    /* renamed from: z */
    public void mo25145z() {
        this.f13730a.submit(new RunnableC6579o());
    }

    /* renamed from: z1 */
    public void m25192z1(C6690x0 x0Var, String str) {
        this.f13730a.submit(new RunnableC0202a(x0Var, str));
    }
}
