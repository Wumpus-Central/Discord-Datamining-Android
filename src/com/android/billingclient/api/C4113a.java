package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import p377v2.AbstractC13391a;
import p377v2.AbstractC13395b0;
import p377v2.AbstractC13396c;
import p377v2.AbstractC13398d;
import p377v2.AbstractC13400e;
import p377v2.AbstractC13401f;
import p377v2.AbstractC13402g;
import p377v2.AbstractC13414s;
import p377v2.C13393b;
import p377v2.C13415t;
import p393w2.C13727a;
import sa.AbstractC12830b0;
import sa.AbstractC12847n;
import sa.C12844k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.a */
/* loaded from: classes.dex */
public class C4113a extends BillingClient {

    /* renamed from: a */
    private volatile int f6837a;

    /* renamed from: b */
    private final String f6838b;

    /* renamed from: c */
    private final Handler f6839c;

    /* renamed from: d */
    private volatile C4130r f6840d;

    /* renamed from: e */
    private Context f6841e;

    /* renamed from: f */
    private volatile AbstractC12847n f6842f;

    /* renamed from: g */
    private volatile ServiceConnectionC4122j f6843g;

    /* renamed from: h */
    private boolean f6844h;

    /* renamed from: i */
    private boolean f6845i;

    /* renamed from: j */
    private int f6846j;

    /* renamed from: k */
    private boolean f6847k;

    /* renamed from: l */
    private boolean f6848l;

    /* renamed from: m */
    private boolean f6849m;

    /* renamed from: n */
    private boolean f6850n;

    /* renamed from: o */
    private boolean f6851o;

    /* renamed from: p */
    private boolean f6852p;

    /* renamed from: q */
    private boolean f6853q;

    /* renamed from: r */
    private boolean f6854r;

    /* renamed from: s */
    private boolean f6855s;

    /* renamed from: t */
    private boolean f6856t;

    /* renamed from: u */
    private boolean f6857u;

    /* renamed from: v */
    private ExecutorService f6858v;

    private C4113a(Context context, boolean z, AbstractC13401f fVar, String str, String str2, AbstractC13395b0 b0Var) {
        this.f6837a = 0;
        this.f6839c = new Handler(Looper.getMainLooper());
        this.f6846j = 0;
        this.f6838b = str;
        m32702k(context, fVar, z, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static /* bridge */ /* synthetic */ C13415t m32727C(C4113a aVar, String str) {
        Bundle bundle;
        C12844k.m5286l("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle g = C12844k.m5291g(aVar.f6849m, aVar.f6856t, aVar.f6838b);
        String str2 = null;
        do {
            try {
                if (aVar.f6849m) {
                    bundle = aVar.f6842f.mo5280B(9, aVar.f6841e.getPackageName(), str, str2, g);
                } else {
                    bundle = aVar.f6842f.mo5273o(3, aVar.f6841e.getPackageName(), str, str2);
                }
                BillingResult a = C4126n.m32682a(bundle, "BillingClient", "getPurchase()");
                if (a != C4123k.f6893l) {
                    return new C13415t(a, null);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    C12844k.m5286l("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.m32769d())) {
                            C12844k.m5285m("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        C12844k.m5284n("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new C13415t(C4123k.f6891j, null);
                    }
                }
                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                C12844k.m5286l("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (Exception e2) {
                C12844k.m5284n("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new C13415t(C4123k.f6894m, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new C13415t(C4123k.f6893l, arrayList);
    }

    /* renamed from: k */
    private void m32702k(Context context, AbstractC13401f fVar, boolean z, AbstractC13395b0 b0Var) {
        boolean z2;
        this.f6841e = context.getApplicationContext();
        if (fVar == null) {
            C12844k.m5285m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f6840d = new C4130r(this.f6841e, fVar, b0Var);
        this.f6856t = z;
        if (b0Var != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f6857u = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final Handler m32696q() {
        return Looper.myLooper() == null ? this.f6839c : new Handler(Looper.myLooper());
    }

    /* renamed from: r */
    private final BillingResult m32695r(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.f6839c.post(new Runnable() { // from class: com.android.billingclient.api.e
            @Override // java.lang.Runnable
            public final void run() {
                C4113a.this.m32697p(billingResult);
            }
        });
        return billingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final BillingResult m32694s() {
        if (this.f6837a == 0 || this.f6837a == 3) {
            return C4123k.f6894m;
        }
        return C4123k.f6891j;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: t */
    private static String m32693t() {
        try {
            return (String) C13727a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "5.1.0";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final Future m32692u(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.f6858v == null) {
            this.f6858v = Executors.newFixedThreadPool(C12844k.f28923a, new ThreadFactoryC4119g(this));
        }
        try {
            final Future submit = this.f6858v.submit(callable);
            handler.postDelayed(new Runnable() { // from class: v2.h
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (!future.isDone() && !future.isCancelled()) {
                        future.cancel(true);
                        C12844k.m5285m("BillingClient", "Async task is taking too long, cancel it!");
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            C12844k.m5284n("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* renamed from: v */
    private final void m32691v(String str, final AbstractC13400e eVar) {
        if (!mo32708d()) {
            eVar.mo3760a(C4123k.f6894m, AbstractC12830b0.m5313u());
        } else if (TextUtils.isEmpty(str)) {
            C12844k.m5285m("BillingClient", "Please provide a valid product type.");
            eVar.mo3760a(C4123k.f6888g, AbstractC12830b0.m5313u());
        } else if (m32692u(new CallableC4118f(this, str, eVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.d
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13400e.this.mo3760a(C4123k.f6895n, AbstractC12830b0.m5313u());
            }
        }, m32696q()) == null) {
            eVar.mo3760a(m32694s(), AbstractC12830b0.m5313u());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final /* synthetic */ Object m32725E(C13393b bVar, AbstractC13396c cVar) {
        String str;
        int i;
        String a = bVar.m3767a();
        try {
            C12844k.m5286l("BillingClient", "Consuming purchase with token: " + a);
            if (this.f6849m) {
                Bundle K = this.f6842f.mo5278K(9, this.f6841e.getPackageName(), a, C12844k.m5295c(bVar, this.f6849m, this.f6838b));
                i = K.getInt("RESPONSE_CODE");
                str = C12844k.m5289i(K, "BillingClient");
            } else {
                i = this.f6842f.mo5274h(3, this.f6841e.getPackageName(), a);
                str = "";
            }
            BillingResult.C4104a b = BillingResult.m32800b();
            b.m32795c(i);
            b.m32796b(str);
            BillingResult a2 = b.m32797a();
            if (i == 0) {
                C12844k.m5286l("BillingClient", "Successfully consumed purchase.");
                cVar.mo3762a(a2, a);
                return null;
            }
            C12844k.m5285m("BillingClient", "Error consuming purchase with token. Response code: " + i);
            cVar.mo3762a(a2, a);
            return null;
        } catch (Exception e) {
            C12844k.m5284n("BillingClient", "Error consuming purchase!", e);
            cVar.mo3762a(C4123k.f6894m, a);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ Object m32724F(QueryProductDetailsParams queryProductDetailsParams, AbstractC13398d dVar) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        String c = queryProductDetailsParams.m32762c();
        AbstractC12830b0 b = queryProductDetailsParams.m32763b();
        int size = b.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                str = "";
                break;
            }
            int i4 = i3 + 20;
            if (i4 > size) {
                i = size;
            } else {
                i = i4;
            }
            ArrayList arrayList2 = new ArrayList(b.subList(i3, i));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList3.add(((QueryProductDetailsParams.C4110b) arrayList2.get(i5)).m32757b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f6838b);
            try {
                Bundle J = this.f6842f.mo5279J(17, this.f6841e.getPackageName(), c, bundle, C12844k.m5292f(this.f6838b, arrayList2, null));
                str = "Item is unavailable for purchase.";
                if (J == null) {
                    C12844k.m5285m("BillingClient", "queryProductDetailsAsync got empty product details response.");
                    break;
                } else if (!J.containsKey("DETAILS_LIST")) {
                    i2 = C12844k.m5296b(J, "BillingClient");
                    str = C12844k.m5289i(J, "BillingClient");
                    if (i2 != 0) {
                        C12844k.m5285m("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i2);
                    } else {
                        C12844k.m5285m("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                    }
                } else {
                    ArrayList<String> stringArrayList = J.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        C12844k.m5285m("BillingClient", "queryProductDetailsAsync got null response list");
                        break;
                    }
                    for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                        try {
                            ProductDetails productDetails = new ProductDetails(stringArrayList.get(i6));
                            C12844k.m5286l("BillingClient", "Got product details: ".concat(productDetails.toString()));
                            arrayList.add(productDetails);
                        } catch (JSONException e) {
                            C12844k.m5284n("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            str = "Error trying to decode SkuDetails.";
                            i2 = 6;
                            BillingResult.C4104a b2 = BillingResult.m32800b();
                            b2.m32795c(i2);
                            b2.m32796b(str);
                            dVar.mo3761a(b2.m32797a(), arrayList);
                            return null;
                        }
                    }
                    i3 = i4;
                }
            } catch (Exception e2) {
                C12844k.m5284n("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                str = "An internal error occurred.";
            }
        }
        i2 = 4;
        BillingResult.C4104a b22 = BillingResult.m32800b();
        b22.m32795c(i2);
        b22.m32796b(str);
        dVar.mo3761a(b22.m32797a(), arrayList);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        r0 = null;
        r4 = 4;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object m32723G(java.lang.String r19, java.util.List r20, java.lang.String r21, p377v2.AbstractC13402g r22) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C4113a.m32723G(java.lang.String, java.util.List, java.lang.String, v2.g):java.lang.Object");
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: a */
    public final void mo32711a(final C13393b bVar, final AbstractC13396c cVar) {
        if (!mo32708d()) {
            cVar.mo3762a(C4123k.f6894m, bVar.m3767a());
        } else if (m32692u(new Callable() { // from class: com.android.billingclient.api.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C4113a.this.m32725E(bVar, cVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.w
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13396c.this.mo3762a(C4123k.f6895n, bVar.m3767a());
            }
        }, m32696q()) == null) {
            cVar.mo3762a(m32694s(), bVar.m3767a());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: b */
    public final void mo32710b() {
        try {
            this.f6840d.m32671d();
            if (this.f6843g != null) {
                this.f6843g.m32684c();
            }
            if (!(this.f6843g == null || this.f6842f == null)) {
                C12844k.m5286l("BillingClient", "Unbinding from service.");
                this.f6841e.unbindService(this.f6843g);
                this.f6843g = null;
            }
            this.f6842f = null;
            ExecutorService executorService = this.f6858v;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f6858v = null;
            }
        } catch (Exception e) {
            C12844k.m5284n("BillingClient", "There was an exception while ending connection!", e);
        } finally {
            this.f6837a = 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: c */
    public final BillingResult mo32709c(String str) {
        char c;
        if (!mo32708d()) {
            return C4123k.f6894m;
        }
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97314:
                if (str.equals("bbb")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 101286:
                if (str.equals("fff")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 102279:
                if (str.equals("ggg")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (this.f6844h) {
                    return C4123k.f6893l;
                }
                return C4123k.f6896o;
            case 1:
                if (this.f6845i) {
                    return C4123k.f6893l;
                }
                return C4123k.f6897p;
            case 2:
                if (this.f6848l) {
                    return C4123k.f6893l;
                }
                return C4123k.f6899r;
            case 3:
                if (this.f6851o) {
                    return C4123k.f6893l;
                }
                return C4123k.f6904w;
            case 4:
                if (this.f6853q) {
                    return C4123k.f6893l;
                }
                return C4123k.f6900s;
            case 5:
                if (this.f6852p) {
                    return C4123k.f6893l;
                }
                return C4123k.f6902u;
            case 6:
            case 7:
                if (this.f6854r) {
                    return C4123k.f6893l;
                }
                return C4123k.f6901t;
            case '\b':
                if (this.f6855s) {
                    return C4123k.f6893l;
                }
                return C4123k.f6903v;
            case '\t':
                if (this.f6855s) {
                    return C4123k.f6893l;
                }
                return C4123k.f6907z;
            default:
                C12844k.m5285m("BillingClient", "Unsupported feature: ".concat(str));
                return C4123k.f6906y;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: d */
    public final boolean mo32708d() {
        return (this.f6837a != 2 || this.f6842f == null || this.f6843g == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0325 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037a A[Catch: Exception -> 0x03ba, CancellationException -> 0x03c6, TimeoutException -> 0x03c8, TryCatch #4 {CancellationException -> 0x03c6, TimeoutException -> 0x03c8, Exception -> 0x03ba, blocks: (B:136:0x0366, B:138:0x037a, B:140:0x03a0), top: B:155:0x0366 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a0 A[Catch: Exception -> 0x03ba, CancellationException -> 0x03c6, TimeoutException -> 0x03c8, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x03c6, TimeoutException -> 0x03c8, Exception -> 0x03ba, blocks: (B:136:0x0366, B:138:0x037a, B:140:0x03a0), top: B:155:0x0366 }] */
    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult mo32707e(android.app.Activity r32, final com.android.billingclient.api.BillingFlowParams r33) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C4113a.mo32707e(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: g */
    public void mo32706g(final QueryProductDetailsParams queryProductDetailsParams, final AbstractC13398d dVar) {
        if (!mo32708d()) {
            dVar.mo3761a(C4123k.f6894m, new ArrayList());
        } else if (!this.f6855s) {
            C12844k.m5285m("BillingClient", "Querying product details is not supported.");
            dVar.mo3761a(C4123k.f6903v, new ArrayList());
        } else if (m32692u(new Callable() { // from class: com.android.billingclient.api.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C4113a.this.m32724F(queryProductDetailsParams, dVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.u
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13398d.this.mo3761a(C4123k.f6895n, new ArrayList());
            }
        }, m32696q()) == null) {
            dVar.mo3761a(m32694s(), new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: h */
    public void mo32705h(String str, AbstractC13400e eVar) {
        m32691v(str, eVar);
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: i */
    public final void mo32704i(SkuDetailsParams skuDetailsParams, final AbstractC13402g gVar) {
        if (!mo32708d()) {
            gVar.mo3758a(C4123k.f6894m, null);
            return;
        }
        final String a = skuDetailsParams.m32737a();
        List<String> b = skuDetailsParams.m32736b();
        if (TextUtils.isEmpty(a)) {
            C12844k.m5285m("BillingClient", "Please fix the input params. SKU type can't be empty.");
            gVar.mo3758a(C4123k.f6887f, null);
        } else if (b != null) {
            final ArrayList arrayList = new ArrayList();
            for (String str : b) {
                C4127o oVar = new C4127o(null);
                oVar.m32681a(str);
                arrayList.add(oVar.m32680b());
            }
            if (m32692u(new Callable(a, arrayList, null, gVar) { // from class: com.android.billingclient.api.s

                /* renamed from: b */
                public final /* synthetic */ String f6916b;

                /* renamed from: c */
                public final /* synthetic */ List f6917c;

                /* renamed from: d */
                public final /* synthetic */ AbstractC13402g f6918d;

                {
                    this.f6918d = gVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C4113a.this.m32723G(this.f6916b, this.f6917c, null, this.f6918d);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.x
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC13402g.this.mo3758a(C4123k.f6895n, null);
                }
            }, m32696q()) == null) {
                gVar.mo3758a(m32694s(), null);
            }
        } else {
            C12844k.m5285m("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            gVar.mo3758a(C4123k.f6886e, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: j */
    public final void mo32703j(AbstractC13391a aVar) {
        ServiceInfo serviceInfo;
        if (mo32708d()) {
            C12844k.m5286l("BillingClient", "Service connection is valid. No need to re-initialize.");
            aVar.onBillingSetupFinished(C4123k.f6893l);
        } else if (this.f6837a == 1) {
            C12844k.m5285m("BillingClient", "Client is already in the process of connecting to billing service.");
            aVar.onBillingSetupFinished(C4123k.f6885d);
        } else if (this.f6837a == 3) {
            C12844k.m5285m("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            aVar.onBillingSetupFinished(C4123k.f6894m);
        } else {
            this.f6837a = 1;
            this.f6840d.m32670e();
            C12844k.m5286l("BillingClient", "Starting in-app billing setup.");
            this.f6843g = new ServiceConnectionC4122j(this, aVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f6841e.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null)) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    C12844k.m5285m("BillingClient", "The device doesn't have valid Play Store.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f6838b);
                    if (this.f6841e.bindService(intent2, this.f6843g, 1)) {
                        C12844k.m5286l("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    C12844k.m5285m("BillingClient", "Connection to Billing service is blocked.");
                }
            }
            this.f6837a = 0;
            C12844k.m5286l("BillingClient", "Billing service unavailable on device.");
            aVar.onBillingSetupFinished(C4123k.f6884c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void m32697p(BillingResult billingResult) {
        if (this.f6840d.m32672c() != null) {
            this.f6840d.m32672c().mo3759a(billingResult, null);
            return;
        }
        this.f6840d.m32673b();
        C12844k.m5285m("BillingClient", "No valid listener is set in BroadcastManager");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ Bundle m32688y(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) {
        return this.f6842f.mo5272t(i, this.f6841e.getPackageName(), str, str2, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ Bundle m32687z(String str, String str2) {
        return this.f6842f.mo5277N(3, this.f6841e.getPackageName(), str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4113a(String str, boolean z, Context context, AbstractC13414s sVar) {
        this.f6837a = 0;
        this.f6839c = new Handler(Looper.getMainLooper());
        this.f6846j = 0;
        this.f6838b = m32693t();
        this.f6841e = context.getApplicationContext();
        C12844k.m5285m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f6840d = new C4130r(this.f6841e, null);
        this.f6856t = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4113a(String str, boolean z, Context context, AbstractC13401f fVar, AbstractC13395b0 b0Var) {
        this(context, z, fVar, m32693t(), null, null);
    }
}
