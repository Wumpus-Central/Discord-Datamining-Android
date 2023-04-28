package p074e2;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: e2.m */
/* loaded from: classes.dex */
public class C6641m {

    /* renamed from: a */
    private String f14042a;

    /* renamed from: d */
    private AbstractC6596a0 f14045d;

    /* renamed from: f */
    private String f14047f;

    /* renamed from: g */
    private String f14048g;

    /* renamed from: h */
    private String f14049h;

    /* renamed from: b */
    private Boolean f14043b = null;

    /* renamed from: c */
    private boolean f14044c = false;

    /* renamed from: e */
    private C0203m f14046e = new C0203m();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.m$a */
    /* loaded from: classes.dex */
    public class RunnableC6642a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Context f14050k;

        RunnableC6642a(Context context) {
            this.f14050k = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C6615e1(this.f14050k).m25059E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.m$b */
    /* loaded from: classes.dex */
    public class RunnableC6643b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Context f14052k;

        RunnableC6643b(Context context) {
            this.f14052k = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C6615e1(this.f14052k).m25060D();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.m$c */
    /* loaded from: classes.dex */
    public class RunnableC6644c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Context f14054k;

        /* renamed from: l */
        final /* synthetic */ Uri f14055l;

        /* renamed from: m */
        final /* synthetic */ long f14056m;

        RunnableC6644c(Context context, Uri uri, long j) {
            this.f14054k = context;
            this.f14055l = uri;
            this.f14056m = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C6615e1(this.f14054k).m25032x(this.f14055l, this.f14056m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.m$d */
    /* loaded from: classes.dex */
    public class RunnableC6645d implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Context f14058k;

        RunnableC6645d(Context context) {
            this.f14058k = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C6615e1(this.f14058k).m25056H();
        }
    }

    /* renamed from: e2.m$e */
    /* loaded from: classes.dex */
    class C6646e implements AbstractC6614e0 {

        /* renamed from: a */
        final /* synthetic */ String f14060a;

        /* renamed from: b */
        final /* synthetic */ String f14061b;

        C6646e(String str, String str2) {
            this.f14060a = str;
            this.f14061b = str2;
        }

        @Override // p074e2.AbstractC6614e0
        /* renamed from: a */
        public void mo24803a(C6551a aVar) {
            aVar.m25205t0(this.f14060a, this.f14061b);
        }
    }

    /* renamed from: e2.m$f */
    /* loaded from: classes.dex */
    class C6647f implements AbstractC6614e0 {

        /* renamed from: a */
        final /* synthetic */ String f14063a;

        /* renamed from: b */
        final /* synthetic */ String f14064b;

        C6647f(String str, String str2) {
            this.f14063a = str;
            this.f14064b = str2;
        }

        @Override // p074e2.AbstractC6614e0
        /* renamed from: a */
        public void mo24803a(C6551a aVar) {
            aVar.m25203u0(this.f14063a, this.f14064b);
        }
    }

    /* renamed from: e2.m$g */
    /* loaded from: classes.dex */
    class C6648g implements AbstractC6614e0 {

        /* renamed from: a */
        final /* synthetic */ String f14066a;

        C6648g(String str) {
            this.f14066a = str;
        }

        @Override // p074e2.AbstractC6614e0
        /* renamed from: a */
        public void mo24803a(C6551a aVar) {
            aVar.m25204t1(this.f14066a);
        }
    }

    /* renamed from: e2.m$h */
    /* loaded from: classes.dex */
    class C6649h implements AbstractC6614e0 {

        /* renamed from: a */
        final /* synthetic */ String f14068a;

        C6649h(String str) {
            this.f14068a = str;
        }

        @Override // p074e2.AbstractC6614e0
        /* renamed from: a */
        public void mo24803a(C6551a aVar) {
            aVar.m25202u1(this.f14068a);
        }
    }

    /* renamed from: e2.m$i */
    /* loaded from: classes.dex */
    class C6650i implements AbstractC6614e0 {
        C6650i() {
        }

        @Override // p074e2.AbstractC6614e0
        /* renamed from: a */
        public void mo24803a(C6551a aVar) {
            aVar.m25200v1();
        }
    }

    /* renamed from: e2.m$j */
    /* loaded from: classes.dex */
    class C6651j implements AbstractC6614e0 {
        C6651j() {
        }

        @Override // p074e2.AbstractC6614e0
        /* renamed from: a */
        public void mo24803a(C6551a aVar) {
            aVar.m25198w1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.m$k */
    /* loaded from: classes.dex */
    public class RunnableC6652k implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Context f14072k;

        /* renamed from: l */
        final /* synthetic */ String f14073l;

        /* renamed from: m */
        final /* synthetic */ long f14074m;

        RunnableC6652k(Context context, String str, long j) {
            this.f14072k = context;
            this.f14073l = str;
            this.f14074m = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C6615e1(this.f14072k).m25063A(this.f14073l, this.f14074m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.m$l */
    /* loaded from: classes.dex */
    public class RunnableC6653l implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Context f14076k;

        /* renamed from: l */
        final /* synthetic */ String f14077l;

        RunnableC6653l(Context context, String str) {
            this.f14076k = context;
            this.f14077l = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C6615e1(this.f14076k).m25030z(this.f14077l);
        }
    }

    /* renamed from: e2.m$m */
    /* loaded from: classes.dex */
    public static class C0203m {

        /* renamed from: a */
        public List<AbstractC6614e0> f14079a = new ArrayList();

        /* renamed from: b */
        public List<C6665s> f14080b = new ArrayList();

        /* renamed from: c */
        public Boolean f14081c = null;
    }

    /* renamed from: E */
    private void m24838E(Context context) {
        C6629i1.m24918d0(new RunnableC6645d(context));
    }

    /* renamed from: d */
    private boolean m24826d(String str) {
        return m24825e(str, false);
    }

    /* renamed from: e */
    private boolean m24825e(String str, boolean z) {
        if (this.f14045d != null) {
            return true;
        }
        if (str == null) {
            C6639l.m24863j().mo24885b("Adjust not initialized correctly", new Object[0]);
            return false;
        }
        if (z) {
            C6639l.m24863j().mo24886a("Adjust not initialized, but %s saved for launch", str);
        } else {
            C6639l.m24863j().mo24886a("Adjust not initialized, can't perform %s", str);
        }
        return false;
    }

    /* renamed from: f */
    private boolean m24824f(boolean z, String str, String str2) {
        if (z) {
            return m24825e(str, true);
        }
        return m24825e(str2, true);
    }

    /* renamed from: m */
    private boolean m24817m() {
        Boolean bool = this.f14043b;
        return bool == null || bool.booleanValue();
    }

    /* renamed from: u */
    private void m24809u(Uri uri, long j, Context context) {
        C6629i1.m24918d0(new RunnableC6644c(context, uri, j));
    }

    /* renamed from: v */
    private void m24808v(Context context) {
        C6629i1.m24918d0(new RunnableC6643b(context));
    }

    /* renamed from: w */
    private void m24807w(Context context) {
        C6629i1.m24918d0(new RunnableC6642a(context));
    }

    /* renamed from: x */
    private void m24806x(String str, Context context) {
        C6629i1.m24918d0(new RunnableC6653l(context, str));
    }

    /* renamed from: y */
    private void m24805y(String str, long j, Context context) {
        C6629i1.m24918d0(new RunnableC6652k(context, str, j));
    }

    /* renamed from: A */
    public void m24842A(String str, Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null || str.length() == 0) {
            C6639l.m24863j().mo24886a("Skipping INSTALL_REFERRER intent referrer processing (null or empty)", new Object[0]);
            return;
        }
        m24805y(str, currentTimeMillis, context);
        if (m24825e("referrer", true) && this.f14045d.isEnabled()) {
            this.f14045d.mo25175E();
        }
    }

    /* renamed from: B */
    public void m24841B(boolean z) {
        this.f14043b = Boolean.valueOf(z);
        if (m24824f(z, "enabled mode", "disabled mode")) {
            this.f14045d.setEnabled(z);
        }
    }

    /* renamed from: C */
    public void m24840C(boolean z) {
        if (!m24824f(z, "offline mode", "online mode")) {
            this.f14044c = z;
        } else {
            this.f14045d.mo25147x(z);
        }
    }

    /* renamed from: D */
    public void m24839D(String str, Context context) {
        m24806x(str, context);
        if (m24825e("push token", true) && this.f14045d.isEnabled()) {
            this.f14045d.mo25160k(str, true);
        }
    }

    /* renamed from: F */
    public void m24837F(C6663r rVar) {
        String str = rVar.f14107e;
        if (str != null) {
            this.f14047f = str;
        }
        String str2 = rVar.f14108f;
        if (str2 != null) {
            this.f14048g = str2;
        }
        String str3 = rVar.f14109g;
        if (str3 != null) {
            this.f14049h = str3;
        }
        String str4 = rVar.f14104b;
        if (str4 != null) {
            C6639l.m24851v(str4);
        }
        String str5 = rVar.f14105c;
        if (str5 != null) {
            C6639l.m24850w(str5);
        }
        String str6 = rVar.f14106d;
        if (str6 != null) {
            C6639l.m24878A(str6);
        }
        Long l = rVar.f14110h;
        if (l != null) {
            C6639l.m24876C(l.longValue());
        }
        if (rVar.f14111i != null) {
            C6639l.m24875D(rVar.f14110h.longValue());
        }
        Long l2 = rVar.f14112j;
        if (l2 != null) {
            C6639l.m24847z(l2.longValue());
        }
        Long l3 = rVar.f14113k;
        if (l3 != null) {
            C6639l.m24877B(l3.longValue());
        }
        Boolean bool = rVar.f14115m;
        if (bool != null) {
            C6639l.m24874E(bool.booleanValue());
        }
        if (rVar.f14116n != null) {
            EnumC6687w wVar = EnumC6687w.NO_WAIT;
            C6639l.m24849x(wVar);
            C6639l.m24848y(wVar);
        }
        Boolean bool2 = rVar.f14117o;
        if (bool2 != null && bool2.booleanValue()) {
            C6639l.m24871b();
        }
        Boolean bool3 = rVar.f14118p;
        if (bool3 != null && bool3.booleanValue()) {
            C6639l.m24872a();
        }
    }

    /* renamed from: G */
    public void m24836G() {
        if (m24826d("teardown")) {
            this.f14045d.mo25169a();
            this.f14045d = null;
        }
    }

    /* renamed from: H */
    public void m24835H(C6616f fVar) {
        if (m24826d("trackAdRevenue")) {
            this.f14045d.mo25154q(fVar);
        }
    }

    /* renamed from: I */
    public void m24834I(String str, JSONObject jSONObject) {
        if (m24826d("trackAdRevenue")) {
            this.f14045d.mo25158m(str, jSONObject);
        }
    }

    /* renamed from: J */
    public void m24833J(C6627i iVar) {
        if (m24826d("trackEvent")) {
            this.f14045d.mo25174F(iVar);
        }
    }

    /* renamed from: K */
    public void m24832K(boolean z) {
        if (!m24825e("measurement consent", true)) {
            this.f14046e.f14081c = Boolean.valueOf(z);
            return;
        }
        this.f14045d.mo25165f(z);
    }

    /* renamed from: L */
    public void m24831L(C6655n nVar) {
        if (m24826d("trackPlayStoreSubscription")) {
            this.f14045d.mo25149v(nVar);
        }
    }

    /* renamed from: M */
    public void m24830M(C6665s sVar) {
        if (!m24825e("third party sharing", true)) {
            this.f14046e.f14080b.add(sVar);
        } else {
            this.f14045d.mo25150u(sVar);
        }
    }

    /* renamed from: a */
    public void m24829a(String str, String str2) {
        if (m24825e("adding session callback parameter", true)) {
            this.f14045d.mo25153r(str, str2);
        } else {
            this.f14046e.f14079a.add(new C6646e(str, str2));
        }
    }

    /* renamed from: b */
    public void m24828b(String str, String str2) {
        if (m24825e("adding session partner parameter", true)) {
            this.f14045d.mo25178B(str, str2);
        } else {
            this.f14046e.f14079a.add(new C6647f(str, str2));
        }
    }

    /* renamed from: c */
    public void m24827c(Uri uri, Context context) {
        if (uri == null || uri.toString().length() == 0) {
            C6639l.m24863j().mo24886a("Skipping deep link processing (null or empty)", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!m24825e("appWillOpenUrl", true)) {
            m24809u(uri, currentTimeMillis, context);
        } else {
            this.f14045d.mo25151t(uri, currentTimeMillis);
        }
    }

    /* renamed from: g */
    public void m24823g(Context context) {
        if (!m24825e("disable third party sharing", true)) {
            m24808v(context);
        } else {
            this.f14045d.mo25152s();
        }
    }

    /* renamed from: h */
    public void m24822h(Context context) {
        m24807w(context);
        if (m24825e("gdpr", true) && this.f14045d.isEnabled()) {
            this.f14045d.mo25145z();
        }
    }

    /* renamed from: i */
    public String m24821i() {
        if (!m24826d("getAdid")) {
            return null;
        }
        return this.f14045d.mo25161j();
    }

    /* renamed from: j */
    public C6619g m24820j() {
        if (!m24826d("getAttribution")) {
            return null;
        }
        return this.f14045d.mo25166e();
    }

    /* renamed from: k */
    public String m24819k() {
        return C6629i1.m24946F();
    }

    /* renamed from: l */
    public boolean m24818l() {
        if (!m24826d("isEnabled")) {
            return m24817m();
        }
        return this.f14045d.isEnabled();
    }

    /* renamed from: n */
    public void m24816n(C6624h hVar) {
        if (hVar == null) {
            C6639l.m24863j().mo24885b("AdjustConfig missing", new Object[0]);
        } else if (!hVar.m24986e()) {
            C6639l.m24863j().mo24885b("AdjustConfig not initialized correctly", new Object[0]);
        } else if (this.f14045d != null) {
            C6639l.m24863j().mo24885b("Adjust already initialized", new Object[0]);
        } else {
            hVar.f13970u = this.f14046e;
            hVar.f13973x = this.f14042a;
            hVar.f13974y = this.f14043b;
            hVar.f13975z = this.f14044c;
            hVar.f13950a = this.f14047f;
            hVar.f13951b = this.f14048g;
            hVar.f13952c = this.f14049h;
            this.f14045d = C6639l.m24870c(hVar);
            m24838E(hVar.f13953d);
        }
    }

    /* renamed from: o */
    public void m24815o() {
        if (m24826d("onPause")) {
            this.f14045d.mo25177C();
        }
    }

    /* renamed from: p */
    public void m24814p() {
        if (m24826d("onResume")) {
            this.f14045d.mo25167c();
        }
    }

    /* renamed from: q */
    public void m24813q(String str) {
        if (m24825e("removing session callback parameter", true)) {
            this.f14045d.mo25148w(str);
        } else {
            this.f14046e.f14079a.add(new C6648g(str));
        }
    }

    /* renamed from: r */
    public void m24812r(String str) {
        if (m24825e("removing session partner parameter", true)) {
            this.f14045d.mo25163h(str);
        } else {
            this.f14046e.f14079a.add(new C6649h(str));
        }
    }

    /* renamed from: s */
    public void m24811s() {
        if (m24825e("resetting session callback parameters", true)) {
            this.f14045d.mo25173G();
        } else {
            this.f14046e.f14079a.add(new C6650i());
        }
    }

    /* renamed from: t */
    public void m24810t() {
        if (m24825e("resetting session partner parameters", true)) {
            this.f14045d.mo25162i();
        } else {
            this.f14046e.f14079a.add(new C6651j());
        }
    }

    /* renamed from: z */
    public void m24804z() {
        if (m24826d("sendFirstPackages")) {
            this.f14045d.mo25156o();
        }
    }
}
