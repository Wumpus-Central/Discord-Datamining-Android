package com.adjust.nativemodule;

import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p074e2.AbstractC6654m0;
import p074e2.AbstractC6656n0;
import p074e2.AbstractC6658o0;
import p074e2.AbstractC6660p0;
import p074e2.AbstractC6662q0;
import p074e2.AbstractC6664r0;
import p074e2.AbstractC6666s0;
import p074e2.C6613e;
import p074e2.C6616f;
import p074e2.C6619g;
import p074e2.C6624h;
import p074e2.C6627i;
import p074e2.C6635j;
import p074e2.C6637k;
import p074e2.C6657o;
import p074e2.C6659p;
import p074e2.C6663r;
import p074e2.C6665s;
import p074e2.EnumC6636j0;

/* loaded from: classes.dex */
public class Adjust extends ReactContextBaseJavaModule implements LifecycleEventListener, AbstractC6654m0, AbstractC6662q0, AbstractC6660p0, AbstractC6666s0, AbstractC6664r0, AbstractC6656n0 {
    private static String TAG = "AdjustBridge";
    private boolean attributionCallback;
    private boolean deferredDeeplinkCallback;
    private boolean eventTrackingFailedCallback;
    private boolean eventTrackingSucceededCallback;
    private boolean sessionTrackingFailedCallback;
    private boolean sessionTrackingSucceededCallback;
    private boolean shouldLaunchDeeplink = true;

    /* renamed from: com.adjust.nativemodule.Adjust$a */
    /* loaded from: classes.dex */
    class C4086a implements AbstractC6658o0 {

        /* renamed from: a */
        final /* synthetic */ Callback f6725a;

        C4086a(Callback callback) {
            this.f6725a = callback;
        }

        @Override // p074e2.AbstractC6658o0
        /* renamed from: a */
        public void mo24789a(String str) {
            this.f6725a.invoke(str);
        }
    }

    public Adjust(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private boolean checkKey(ReadableMap readableMap, String str) {
        return readableMap.hasKey(str) && !readableMap.isNull(str);
    }

    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void addSessionCallbackParameter(String str, String str2) {
        C6613e.m25089a(str, str2);
    }

    @ReactMethod
    public void addSessionPartnerParameter(String str, String str2) {
        C6613e.m25088b(str, str2);
    }

    @ReactMethod
    public void appWillOpenUrl(String str) {
        C6613e.m25087c(Uri.parse(str), getReactApplicationContext());
    }

    @ReactMethod
    public void convertUniversalLink(String str, String str2, Callback callback) {
        callback.invoke("");
    }

    @ReactMethod
    public void create(ReadableMap readableMap) {
        boolean z;
        String str;
        if (readableMap != null) {
            if (!checkKey(readableMap, "logLevel") || !readableMap.getString("logLevel").equals("SUPPRESS")) {
                z = false;
            } else {
                z = true;
            }
            String str2 = null;
            if (checkKey(readableMap, "appToken")) {
                str = readableMap.getString("appToken");
            } else {
                str = null;
            }
            if (checkKey(readableMap, "environment")) {
                str2 = readableMap.getString("environment");
            }
            C6624h hVar = new C6624h(getReactApplicationContext(), str, str2, z);
            if (hVar.m24986e()) {
                if (checkKey(readableMap, "logLevel")) {
                    String string = readableMap.getString("logLevel");
                    if (string.equals("VERBOSE")) {
                        hVar.m24979l(EnumC6636j0.VERBOSE);
                    } else if (string.equals("DEBUG")) {
                        hVar.m24979l(EnumC6636j0.DEBUG);
                    } else if (string.equals("INFO")) {
                        hVar.m24979l(EnumC6636j0.INFO);
                    } else if (string.equals("WARN")) {
                        hVar.m24979l(EnumC6636j0.WARN);
                    } else if (string.equals("ERROR")) {
                        hVar.m24979l(EnumC6636j0.ERROR);
                    } else if (string.equals("ASSERT")) {
                        hVar.m24979l(EnumC6636j0.ASSERT);
                    } else if (string.equals("SUPPRESS")) {
                        hVar.m24979l(EnumC6636j0.SUPRESS);
                    } else {
                        hVar.m24979l(EnumC6636j0.INFO);
                    }
                }
                if (checkKey(readableMap, "eventBufferingEnabled")) {
                    hVar.m24981j(Boolean.valueOf(readableMap.getBoolean("eventBufferingEnabled")));
                }
                if (checkKey(readableMap, "sdkPrefix")) {
                    hVar.m24967x(readableMap.getString("sdkPrefix"));
                }
                if (checkKey(readableMap, "processName")) {
                    hVar.m24968w(readableMap.getString("processName"));
                }
                if (checkKey(readableMap, "defaultTracker")) {
                    hVar.m24984g(readableMap.getString("defaultTracker"));
                }
                if (checkKey(readableMap, "externalDeviceId")) {
                    hVar.m24980k(readableMap.getString("externalDeviceId"));
                }
                if (checkKey(readableMap, "urlStrategy")) {
                    String string2 = readableMap.getString("urlStrategy");
                    if (string2.equalsIgnoreCase("china")) {
                        hVar.m24965z("url_strategy_china");
                    } else if (string2.equalsIgnoreCase("india")) {
                        hVar.m24965z("url_strategy_india");
                    } else if (string2.equalsIgnoreCase("data-residency-eu")) {
                        hVar.m24965z("data_residency_eu");
                    } else if (string2.equalsIgnoreCase("data-residency-us")) {
                        hVar.m24965z("data_residency_us");
                    } else if (string2.equalsIgnoreCase("data-residency-tr")) {
                        hVar.m24965z("data_residency_tr");
                    }
                }
                if (checkKey(readableMap, "userAgent")) {
                    hVar.m24991A(readableMap.getString("userAgent"));
                }
                if (checkKey(readableMap, "preinstallFilePath")) {
                    hVar.m24970u(readableMap.getString("preinstallFilePath"));
                }
                if (checkKey(readableMap, "secretId") && checkKey(readableMap, "info1") && checkKey(readableMap, "info2") && checkKey(readableMap, "info3") && checkKey(readableMap, "info4")) {
                    try {
                        hVar.m24985f(Long.parseLong(readableMap.getString("secretId"), 10), Long.parseLong(readableMap.getString("info1"), 10), Long.parseLong(readableMap.getString("info2"), 10), Long.parseLong(readableMap.getString("info3"), 10), Long.parseLong(readableMap.getString("info4"), 10));
                    } catch (NumberFormatException unused) {
                    }
                }
                if (checkKey(readableMap, "sendInBackground")) {
                    hVar.m24966y(readableMap.getBoolean("sendInBackground"));
                }
                if (checkKey(readableMap, "isDeviceKnown")) {
                    hVar.m24982i(readableMap.getBoolean("isDeviceKnown"));
                }
                if (checkKey(readableMap, "preinstallTrackingEnabled")) {
                    hVar.m24969v(readableMap.getBoolean("preinstallTrackingEnabled"));
                }
                if (checkKey(readableMap, "needsCost")) {
                    hVar.m24977n(readableMap.getBoolean("needsCost"));
                }
                if (checkKey(readableMap, "shouldLaunchDeeplink")) {
                    this.shouldLaunchDeeplink = readableMap.getBoolean("shouldLaunchDeeplink");
                }
                if (checkKey(readableMap, "delayStart")) {
                    hVar.m24983h(readableMap.getDouble("delayStart"));
                }
                if (this.attributionCallback) {
                    hVar.m24976o(this);
                }
                if (this.eventTrackingSucceededCallback) {
                    hVar.m24973r(this);
                }
                if (this.eventTrackingFailedCallback) {
                    hVar.m24974q(this);
                }
                if (this.sessionTrackingSucceededCallback) {
                    hVar.m24971t(this);
                }
                if (this.sessionTrackingFailedCallback) {
                    hVar.m24972s(this);
                }
                if (this.deferredDeeplinkCallback) {
                    hVar.m24975p(this);
                }
                C6613e.m25076n(hVar);
                C6613e.m25074p();
            }
        }
    }

    @ReactMethod
    public void disableThirdPartySharing() {
        C6613e.m25086d(getReactApplicationContext());
    }

    @ReactMethod
    public void gdprForgetMe() {
        C6613e.m25084f(getReactApplicationContext());
    }

    @ReactMethod
    public void getAdid(Callback callback) {
        callback.invoke(C6613e.m25083g());
    }

    @ReactMethod
    public void getAmazonAdId(Callback callback) {
        callback.invoke(C6613e.m25082h(getReactApplicationContext()));
    }

    @ReactMethod
    public void getAppTrackingAuthorizationStatus(Callback callback) {
        callback.invoke("-1");
    }

    @ReactMethod
    public void getAttribution(Callback callback) {
        callback.invoke(C4087a.m32868a(C6613e.m25081i()));
    }

    @ReactMethod
    public void getGoogleAdId(Callback callback) {
        C6613e.m25079k(getReactApplicationContext(), new C4086a(callback));
    }

    @ReactMethod
    public void getIdfa(Callback callback) {
        callback.invoke("");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Adjust";
    }

    @ReactMethod
    public void getSdkVersion(String str, Callback callback) {
        String l = C6613e.m25078l();
        if (l == null) {
            callback.invoke("");
            return;
        }
        callback.invoke(str + "@" + l);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @ReactMethod
    public void isEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(C6613e.m25077m()));
    }

    @Override // p074e2.AbstractC6656n0
    public boolean launchReceivedDeeplink(Uri uri) {
        sendEvent(getReactApplicationContext(), "adjust_deferredDeeplink", C4087a.m32867b(uri));
        return this.shouldLaunchDeeplink;
    }

    @Override // p074e2.AbstractC6654m0
    public void onAttributionChanged(C6619g gVar) {
        sendEvent(getReactApplicationContext(), "adjust_attribution", C4087a.m32868a(gVar));
    }

    @Override // p074e2.AbstractC6660p0
    public void onFinishedEventTrackingFailed(C6635j jVar) {
        sendEvent(getReactApplicationContext(), "adjust_eventTrackingFailed", C4087a.m32866c(jVar));
    }

    @Override // p074e2.AbstractC6662q0
    public void onFinishedEventTrackingSucceeded(C6637k kVar) {
        sendEvent(getReactApplicationContext(), "adjust_eventTrackingSucceeded", C4087a.m32865d(kVar));
    }

    @Override // p074e2.AbstractC6664r0
    public void onFinishedSessionTrackingFailed(C6657o oVar) {
        sendEvent(getReactApplicationContext(), "adjust_sessionTrackingFailed", C4087a.m32864e(oVar));
    }

    @Override // p074e2.AbstractC6666s0
    public void onFinishedSessionTrackingSucceeded(C6659p pVar) {
        sendEvent(getReactApplicationContext(), "adjust_sessionTrackingSucceeded", C4087a.m32863f(pVar));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        C6613e.m25075o();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        C6613e.m25074p();
    }

    @ReactMethod
    public void onPause() {
        C6613e.m25075o();
    }

    @ReactMethod
    public void onResume() {
        C6613e.m25074p();
    }

    @ReactMethod
    public void removeListeners(double d) {
    }

    @ReactMethod
    public void removeSessionCallbackParameter(String str) {
        C6613e.m25073q(str);
    }

    @ReactMethod
    public void removeSessionPartnerParameter(String str) {
        C6613e.m25072r(str);
    }

    @ReactMethod
    public void requestTrackingAuthorizationWithCompletionHandler(Callback callback) {
        callback.invoke("");
    }

    @ReactMethod
    public void resetSessionCallbackParameters() {
        C6613e.m25071s();
    }

    @ReactMethod
    public void resetSessionPartnerParameters() {
        C6613e.m25070t();
    }

    @ReactMethod
    public void sendFirstPackages() {
        C6613e.m25069u();
    }

    @ReactMethod
    public void setAttributionCallbackListener() {
        this.attributionCallback = true;
    }

    @ReactMethod
    public void setDeferredDeeplinkCallbackListener() {
        this.deferredDeeplinkCallback = true;
    }

    @ReactMethod
    public void setEnabled(Boolean bool) {
        C6613e.m25068v(bool.booleanValue());
    }

    @ReactMethod
    public void setEventTrackingFailedCallbackListener() {
        this.eventTrackingFailedCallback = true;
    }

    @ReactMethod
    public void setEventTrackingSucceededCallbackListener() {
        this.eventTrackingSucceededCallback = true;
    }

    @ReactMethod
    public void setOfflineMode(Boolean bool) {
        C6613e.m25067w(bool.booleanValue());
    }

    @ReactMethod
    public void setPushToken(String str) {
        C6613e.m25066x(str, getReactApplicationContext());
    }

    @ReactMethod
    public void setReferrer(String str) {
        C6613e.m25065y(str, getReactApplicationContext());
    }

    @ReactMethod
    public void setSessionTrackingFailedCallbackListener() {
        this.sessionTrackingFailedCallback = true;
    }

    @ReactMethod
    public void setSessionTrackingSucceededCallbackListener() {
        this.sessionTrackingSucceededCallback = true;
    }

    @ReactMethod
    public void setTestOptions(ReadableMap readableMap) {
        if (readableMap != null) {
            C6663r rVar = new C6663r();
            if (checkKey(readableMap, "hasContext") && readableMap.getBoolean("hasContext")) {
                rVar.f14103a = getReactApplicationContext();
            }
            if (checkKey(readableMap, "baseUrl")) {
                rVar.f14104b = readableMap.getString("baseUrl");
            }
            if (checkKey(readableMap, "gdprUrl")) {
                rVar.f14105c = readableMap.getString("gdprUrl");
            }
            if (checkKey(readableMap, "subscriptionUrl")) {
                rVar.f14106d = readableMap.getString("subscriptionUrl");
            }
            if (checkKey(readableMap, "basePath")) {
                rVar.f14107e = readableMap.getString("basePath");
            }
            if (checkKey(readableMap, "gdprPath")) {
                rVar.f14108f = readableMap.getString("gdprPath");
            }
            if (checkKey(readableMap, "subscriptionPath")) {
                rVar.f14109g = readableMap.getString("subscriptionPath");
            }
            if (checkKey(readableMap, "timerIntervalInMilliseconds")) {
                try {
                    rVar.f14110h = Long.valueOf(Long.parseLong(readableMap.getString("timerIntervalInMilliseconds")));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    Log.d(TAG, "Can't format number");
                }
            }
            if (checkKey(readableMap, "timerStartInMilliseconds")) {
                try {
                    rVar.f14111i = Long.valueOf(Long.parseLong(readableMap.getString("timerStartInMilliseconds")));
                } catch (NumberFormatException e2) {
                    e2.printStackTrace();
                    Log.d(TAG, "Can't format number");
                }
            }
            if (checkKey(readableMap, "sessionIntervalInMilliseconds")) {
                try {
                    rVar.f14112j = Long.valueOf(Long.parseLong(readableMap.getString("sessionIntervalInMilliseconds")));
                } catch (NumberFormatException e3) {
                    e3.printStackTrace();
                    Log.d(TAG, "Can't format number");
                }
            }
            if (checkKey(readableMap, "subsessionIntervalInMilliseconds")) {
                try {
                    rVar.f14113k = Long.valueOf(Long.parseLong(readableMap.getString("subsessionIntervalInMilliseconds")));
                } catch (NumberFormatException e4) {
                    e4.printStackTrace();
                    Log.d(TAG, "Can't format number");
                }
            }
            if (checkKey(readableMap, "noBackoffWait")) {
                rVar.f14116n = Boolean.valueOf(readableMap.getBoolean("noBackoffWait"));
            }
            if (checkKey(readableMap, "teardown")) {
                rVar.f14114l = Boolean.valueOf(readableMap.getBoolean("teardown"));
            }
            C6613e.m25064z(rVar);
        }
    }

    @ReactMethod
    public void teardown() {
        this.attributionCallback = false;
        this.eventTrackingSucceededCallback = false;
        this.eventTrackingFailedCallback = false;
        this.sessionTrackingSucceededCallback = false;
        this.sessionTrackingFailedCallback = false;
        this.deferredDeeplinkCallback = false;
    }

    @ReactMethod
    public void trackAdRevenue(String str, String str2) {
        try {
            C6613e.m25094B(str, new JSONObject(str2));
        } catch (JSONException unused) {
            Log.d(TAG, "Give ad revenue payload is not a valid JSON string");
        }
    }

    @ReactMethod
    public void trackAdRevenueNew(ReadableMap readableMap) {
        String str;
        double d;
        int i;
        Map<String, Object> h;
        Map<String, Object> h2;
        String string;
        String string2;
        String string3;
        if (readableMap != null) {
            if (checkKey(readableMap, "source")) {
                str = readableMap.getString("source");
            } else {
                str = null;
            }
            C6616f fVar = new C6616f(str);
            if (checkKey(readableMap, "revenue") || checkKey(readableMap, "currency")) {
                try {
                    d = Double.parseDouble(readableMap.getString("revenue"));
                } catch (NumberFormatException unused) {
                    d = -1.0d;
                }
                fVar.m25021i(Double.valueOf(d), readableMap.getString("currency"));
            }
            if (checkKey(readableMap, "adImpressionsCount")) {
                try {
                    i = Integer.parseInt(readableMap.getString("adImpressionsCount"));
                } catch (NumberFormatException unused2) {
                    i = -1;
                }
                fVar.m25025e(Integer.valueOf(i));
            }
            if (checkKey(readableMap, "adRevenueNetwork") && (string3 = readableMap.getString("adRevenueNetwork")) != null) {
                fVar.m25024f(string3);
            }
            if (checkKey(readableMap, "adRevenueUnit") && (string2 = readableMap.getString("adRevenueUnit")) != null) {
                fVar.m25022h(string2);
            }
            if (checkKey(readableMap, "adRevenuePlacement") && (string = readableMap.getString("adRevenuePlacement")) != null) {
                fVar.m25023g(string);
            }
            if (checkKey(readableMap, "callbackParameters") && (h2 = C4087a.m32861h(readableMap.getMap("callbackParameters"))) != null) {
                for (Map.Entry<String, Object> entry : h2.entrySet()) {
                    fVar.m25029a(entry.getKey(), entry.getValue().toString());
                }
            }
            if (checkKey(readableMap, "partnerParameters") && (h = C4087a.m32861h(readableMap.getMap("partnerParameters"))) != null) {
                for (Map.Entry<String, Object> entry2 : h.entrySet()) {
                    fVar.m25028b(entry2.getKey(), entry2.getValue().toString());
                }
            }
            C6613e.m25095A(fVar);
        }
    }

    @ReactMethod
    public void trackEvent(ReadableMap readableMap) {
        String str;
        double d;
        String string;
        String string2;
        Map<String, Object> h;
        Map<String, Object> h2;
        if (readableMap != null) {
            if (checkKey(readableMap, "eventToken")) {
                str = readableMap.getString("eventToken");
            } else {
                str = null;
            }
            C6627i iVar = new C6627i(str);
            if (iVar.m24956e()) {
                if (checkKey(readableMap, "revenue") || checkKey(readableMap, "currency")) {
                    try {
                        d = Double.parseDouble(readableMap.getString("revenue"));
                    } catch (NumberFormatException unused) {
                        d = -1.0d;
                    }
                    iVar.m24953h(d, readableMap.getString("currency"));
                }
                if (checkKey(readableMap, "callbackParameters") && (h2 = C4087a.m32861h(readableMap.getMap("callbackParameters"))) != null) {
                    for (Map.Entry<String, Object> entry : h2.entrySet()) {
                        iVar.m24960a(entry.getKey(), entry.getValue().toString());
                    }
                }
                if (checkKey(readableMap, "partnerParameters") && (h = C4087a.m32861h(readableMap.getMap("partnerParameters"))) != null) {
                    for (Map.Entry<String, Object> entry2 : h.entrySet()) {
                        iVar.m24959b(entry2.getKey(), entry2.getValue().toString());
                    }
                }
                if (checkKey(readableMap, "transactionId") && (string2 = readableMap.getString("transactionId")) != null) {
                    iVar.m24954g(string2);
                }
                if (checkKey(readableMap, "callbackId") && (string = readableMap.getString("callbackId")) != null) {
                    iVar.m24955f(string);
                }
                C6613e.m25093C(iVar);
            }
        }
    }

    @ReactMethod
    public void trackMeasurementConsent(boolean z) {
        C6613e.m25092D(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[LOOP:0: B:36:0x0096->B:38:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4 A[LOOP:1: B:44:0x00ce->B:46:0x00d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trackPlayStoreSubscription(com.facebook.react.bridge.ReadableMap r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "price"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L_0x0014
            java.lang.String r0 = r11.getString(r0)     // Catch: NumberFormatException -> 0x0014
            long r0 = java.lang.Long.parseLong(r0)     // Catch: NumberFormatException -> 0x0014
            goto L_0x0016
        L_0x0014:
            r0 = -1
        L_0x0016:
            r3 = r0
            java.lang.String r0 = "currency"
            boolean r1 = r10.checkKey(r11, r0)
            r2 = 0
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r11.getString(r0)
            r5 = r0
            goto L_0x0027
        L_0x0026:
            r5 = r2
        L_0x0027:
            java.lang.String r0 = "sku"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = r11.getString(r0)
            r6 = r0
            goto L_0x0036
        L_0x0035:
            r6 = r2
        L_0x0036:
            java.lang.String r0 = "orderId"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = r11.getString(r0)
            r7 = r0
            goto L_0x0045
        L_0x0044:
            r7 = r2
        L_0x0045:
            java.lang.String r0 = "signature"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = r11.getString(r0)
            r8 = r0
            goto L_0x0054
        L_0x0053:
            r8 = r2
        L_0x0054:
            java.lang.String r0 = "purchaseToken"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = r11.getString(r0)
            r9 = r0
            goto L_0x0063
        L_0x0062:
            r9 = r2
        L_0x0063:
            e2.n r0 = new e2.n
            r2 = r0
            r2.<init>(r3, r5, r6, r7, r8, r9)
            java.lang.String r1 = "purchaseTime"
            boolean r2 = r10.checkKey(r11, r1)
            if (r2 == 0) goto L_0x007c
            java.lang.String r1 = r11.getString(r1)     // Catch: NumberFormatException -> 0x007c
            long r1 = java.lang.Long.parseLong(r1)     // Catch: NumberFormatException -> 0x007c
            r0.m24790m(r1)     // Catch: NumberFormatException -> 0x007c
        L_0x007c:
            java.lang.String r1 = "callbackParameters"
            boolean r2 = r10.checkKey(r11, r1)
            if (r2 == 0) goto L_0x00b4
            com.facebook.react.bridge.ReadableMap r1 = r11.getMap(r1)
            java.util.Map r1 = com.adjust.nativemodule.C4087a.m32861h(r1)
            if (r1 == 0) goto L_0x00b4
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0096:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = r2.toString()
            r0.m24802a(r3, r2)
            goto L_0x0096
        L_0x00b4:
            java.lang.String r1 = "partnerParameters"
            boolean r2 = r10.checkKey(r11, r1)
            if (r2 == 0) goto L_0x00ec
            com.facebook.react.bridge.ReadableMap r11 = r11.getMap(r1)
            java.util.Map r11 = com.adjust.nativemodule.C4087a.m32861h(r11)
            if (r11 == 0) goto L_0x00ec
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x00ce:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00ec
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = r1.toString()
            r0.m24801b(r2, r1)
            goto L_0x00ce
        L_0x00ec:
            p074e2.C6613e.m25091E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.nativemodule.Adjust.trackPlayStoreSubscription(com.facebook.react.bridge.ReadableMap):void");
    }

    @ReactMethod
    public void trackThirdPartySharing(ReadableMap readableMap) {
        Boolean bool;
        List<Object> g;
        if (readableMap != null) {
            if (checkKey(readableMap, "isEnabled")) {
                bool = Boolean.valueOf(readableMap.getBoolean("isEnabled"));
            } else {
                bool = null;
            }
            C6665s sVar = new C6665s(bool);
            if (checkKey(readableMap, "granularOptions") && (g = C4087a.m32862g(readableMap.getArray("granularOptions"))) != null) {
                for (int i = 0; i < g.size(); i += 3) {
                    sVar.m24783a(g.get(i).toString(), g.get(i + 1).toString(), g.get(i + 2).toString());
                }
            }
            C6613e.m25090F(sVar);
        }
    }

    @ReactMethod
    public void updateConversionValue(int i) {
    }
}
