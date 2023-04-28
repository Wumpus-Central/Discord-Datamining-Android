package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.swmansion.reanimated.BuildConfig;
import io.sentry.AbstractC8807b2;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8805b0;
import io.sentry.C8843d;
import io.sentry.C8908j3;
import io.sentry.C8915k2;
import io.sentry.C8951o3;
import io.sentry.C9035r4;
import io.sentry.C9116v;
import io.sentry.EnumC8942n3;
import io.sentry.Scope;
import io.sentry.android.core.C8702b1;
import io.sentry.android.core.C8709d0;
import io.sentry.android.core.C8715f0;
import io.sentry.android.core.C8723i0;
import io.sentry.android.core.C8770n;
import io.sentry.android.core.C8782s0;
import io.sentry.android.core.C8793w0;
import io.sentry.android.core.C8796y;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C8750h;
import io.sentry.protocol.C8997n;
import io.sentry.protocol.C8999o;
import io.sentry.protocol.C9003q;
import io.sentry.protocol.C9020z;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@ReactModule(name = RNSentryModule.NAME)
/* loaded from: classes8.dex */
public class RNSentryModule extends ReactContextBaseJavaModule {
    private static final int FROZEN_FRAME_THRESHOLD = 700;
    public static final String NAME = "RNSentry";
    private static final int SLOW_FRAME_THRESHOLD = 16;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final C8715f0 buildInfo;
    private static boolean didFetchAppStart = false;
    private static final AbstractC8869g0 logger;
    private static final String modulesPath = "modules.json";
    private boolean androidXAvailable;
    private FrameMetricsAggregator frameMetricsAggregator = null;
    private final PackageInfo packageInfo;
    private C8793w0 screenshotEventProcessor;

    static {
        C8770n nVar = new C8770n(NAME);
        logger = nVar;
        buildInfo = new C8715f0(nVar);
    }

    public RNSentryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.packageInfo = getPackageInfo(reactApplicationContext);
    }

    private void addPackages(C8908j3 j3Var, C8997n nVar) {
        C8997n J = j3Var.m17660J();
        if (!(J == null || !J.m17341f().equals("sentry.javascript.react-native") || nVar == null)) {
            List<C9003q> g = nVar.m17340g();
            if (g != null) {
                for (C9003q qVar : g) {
                    J.m17343d(qVar.m17314a(), qVar.m17313b());
                }
            }
            List<String> e = nVar.m17342e();
            if (e != null) {
                for (String str : e) {
                    J.m17344c(str);
                }
            }
            j3Var.m17646X(J);
        }
    }

    private boolean checkAndroidXAvailability() {
        return true;
    }

    private static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            logger.mo17722c(EnumC8942n3.WARNING, "Error getting package info.", new Object[0]);
            return null;
        }
    }

    private boolean isFrameMetricsAggregatorAvailable() {
        return this.androidXAvailable && this.frameMetricsAggregator != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ void lambda$addBreadcrumb$3(ReadableMap readableMap, Scope scope) {
        char c;
        C8843d dVar = new C8843d();
        if (readableMap.hasKey("message")) {
            dVar.m17906o(readableMap.getString("message"));
        }
        if (readableMap.hasKey("type")) {
            dVar.m17905p(readableMap.getString("type"));
        }
        if (readableMap.hasKey("category")) {
            dVar.m17909l(readableMap.getString("category"));
        }
        if (readableMap.hasKey("level")) {
            String string = readableMap.getString("level");
            switch (string.hashCode()) {
                case 3237038:
                    if (string.equals("info")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 95458899:
                    if (string.equals(BuildConfig.BUILD_TYPE)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (string.equals("error")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 97203460:
                    if (string.equals("fatal")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1124446108:
                    if (string.equals("warning")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                dVar.m17907n(EnumC8942n3.FATAL);
            } else if (c == 1) {
                dVar.m17907n(EnumC8942n3.WARNING);
            } else if (c == 2) {
                dVar.m17907n(EnumC8942n3.DEBUG);
            } else if (c != 3) {
                dVar.m17907n(EnumC8942n3.INFO);
            } else {
                dVar.m17907n(EnumC8942n3.ERROR);
            }
        }
        if (readableMap.hasKey("data")) {
            for (Map.Entry<String, Object> entry : readableMap.getMap("data").toHashMap().entrySet()) {
                if (entry.getValue() != null) {
                    dVar.m17908m(entry.getKey(), entry.getValue());
                }
            }
        }
        scope.m18393a(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C8908j3 lambda$initNativeSdk$0(SentryAndroidOptions sentryAndroidOptions, C8908j3 j3Var, C9116v vVar) {
        try {
            C8999o oVar = j3Var.m17738n0().get(0);
            if (oVar != null) {
                if (oVar.m17325i().contains("JavascriptException")) {
                    return null;
                }
            }
        } catch (Throwable unused) {
        }
        setEventOriginTag(j3Var);
        addPackages(j3Var, sentryAndroidOptions.getSdkVersion());
        return j3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initNativeSdk$1(ReadableMap readableMap, final SentryAndroidOptions sentryAndroidOptions) {
        if (readableMap.hasKey(BuildConfig.BUILD_TYPE) && readableMap.getBoolean(BuildConfig.BUILD_TYPE)) {
            sentryAndroidOptions.setDebug(true);
        }
        if (!readableMap.hasKey("dsn") || readableMap.getString("dsn") == null) {
            sentryAndroidOptions.setDsn("");
        } else {
            String string = readableMap.getString("dsn");
            logger.mo17722c(EnumC8942n3.INFO, String.format("Starting with DSN: '%s'", string), new Object[0]);
            sentryAndroidOptions.setDsn(string);
        }
        if (readableMap.hasKey("sendClientReports")) {
            sentryAndroidOptions.setSendClientReports(readableMap.getBoolean("sendClientReports"));
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("attachScreenshot")) {
            sentryAndroidOptions.setAttachScreenshot(readableMap.getBoolean("attachScreenshot"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("maxQueueSize")) {
            sentryAndroidOptions.setMaxQueueSize(readableMap.getInt("maxQueueSize"));
        }
        sentryAndroidOptions.setBeforeSend(new C8951o3.AbstractC8953b() { // from class: io.sentry.react.d
            @Override // io.sentry.C8951o3.AbstractC8953b
            /* renamed from: a */
            public final C8908j3 mo17169a(C8908j3 j3Var, C9116v vVar) {
                C8908j3 lambda$initNativeSdk$0;
                lambda$initNativeSdk$0 = RNSentryModule.this.lambda$initNativeSdk$0(sentryAndroidOptions, j3Var, vVar);
                return lambda$initNativeSdk$0;
            }
        });
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            List<AbstractC9023q0> integrations = sentryAndroidOptions.getIntegrations();
            for (AbstractC9023q0 q0Var : integrations) {
                if ((q0Var instanceof C9035r4) || (q0Var instanceof C8796y) || (q0Var instanceof C8782s0)) {
                    integrations.remove(q0Var);
                }
            }
        }
        logger.mo17722c(EnumC8942n3.INFO, String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations()), new Object[0]);
        C8723i0 c = C8723i0.m18272c();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            c.m18271d(currentActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setContext$6(ReadableMap readableMap, String str, Scope scope) {
        scope.m18374t(str, readableMap.toHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUser$2(ReadableMap readableMap, ReadableMap readableMap2, Scope scope) {
        if (readableMap == null && readableMap2 == null) {
            scope.m18369y(null);
            return;
        }
        C9020z zVar = new C9020z();
        if (readableMap != null) {
            if (readableMap.hasKey("email")) {
                zVar.m17217o(readableMap.getString("email"));
            }
            if (readableMap.hasKey("id")) {
                zVar.m17216p(readableMap.getString("id"));
            }
            if (readableMap.hasKey("username")) {
                zVar.m17212t(readableMap.getString("username"));
            }
            if (readableMap.hasKey("ip_address")) {
                zVar.m17215q(readableMap.getString("ip_address"));
            }
            if (readableMap.hasKey("segment")) {
                zVar.m17214r(readableMap.getString("segment"));
            }
        }
        if (readableMap2 != null) {
            HashMap hashMap = new HashMap();
            ReadableMapKeySetIterator keySetIterator = readableMap2.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                String string = readableMap2.getString(nextKey);
                if (string != null) {
                    hashMap.put(nextKey, string);
                }
            }
            zVar.m17218n(hashMap);
        }
        scope.m18369y(zVar);
    }

    private void setEventEnvironmentTag(C8908j3 j3Var, String str) {
        j3Var.m17644Z("event.origin", "android");
        j3Var.m17644Z("event.environment", str);
    }

    private void setEventOriginTag(C8908j3 j3Var) {
        C8997n J = j3Var.m17660J();
        if (J != null) {
            String f = J.m17341f();
            f.hashCode();
            if (f.equals("sentry.native")) {
                setEventEnvironmentTag(j3Var, "native");
            } else if (f.equals("sentry.java.android")) {
                setEventEnvironmentTag(j3Var, "java");
            }
        }
    }

    @ReactMethod
    public void addBreadcrumb(final ReadableMap readableMap) {
        C8915k2.m17704j(new AbstractC8807b2() { // from class: io.sentry.react.a
            @Override // io.sentry.AbstractC8807b2
            /* renamed from: a */
            public final void mo16755a(Scope scope) {
                RNSentryModule.lambda$addBreadcrumb$3(ReadableMap.this, scope);
            }
        });
    }

    @ReactMethod
    public void captureEnvelope(ReadableArray readableArray, ReadableMap readableMap, Promise promise) {
        byte[] bArr = new byte[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            bArr[i] = (byte) readableArray.getInt(i);
        }
        try {
            String outboxPath = C8805b0.m18042a().mo17826l().getOutboxPath();
            if (outboxPath == null) {
                logger.mo17722c(EnumC8942n3.ERROR, "Error retrieving outboxPath. Envelope will not be sent. Is the Android SDK initialized?", new Object[0]);
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(outboxPath, UUID.randomUUID().toString()));
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            }
        } catch (Throwable unused) {
            logger.mo17722c(EnumC8942n3.ERROR, "Error while writing envelope to outbox.", new Object[0]);
        }
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void captureScreenshot(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            logger.mo17722c(EnumC8942n3.WARNING, "CurrentActivity is null, can't capture screenshot.", new Object[0]);
            promise.resolve(null);
            return;
        }
        AbstractC8869g0 g0Var = logger;
        byte[] b = C8750h.m18205b(currentActivity, g0Var, buildInfo);
        if (b == null) {
            g0Var.mo17722c(EnumC8942n3.WARNING, "Screenshot is null, screen was not captured.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (byte b2 : b) {
            writableNativeArray.pushInt(b2);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("contentType", "image/png");
        writableNativeMap.putArray("data", writableNativeArray);
        writableNativeMap.putString("filename", "screenshot.png");
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        writableNativeArray2.pushMap(writableNativeMap);
        promise.resolve(writableNativeArray2);
    }

    @ReactMethod
    public void clearBreadcrumbs() {
        C8915k2.m17704j(new AbstractC8807b2() { // from class: io.sentry.react.f
            @Override // io.sentry.AbstractC8807b2
            /* renamed from: a */
            public final void mo16755a(Scope scope) {
                scope.m18391c();
            }
        });
    }

    @ReactMethod
    public void closeNativeSdk(Promise promise) {
        C8915k2.m17705i();
        disableNativeFramesTracking();
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void crash() {
        throw new RuntimeException("TEST - Sentry Client Crash (only works in release mode)");
    }

    @ReactMethod
    public void disableNativeFramesTracking() {
        if (isFrameMetricsAggregatorAvailable()) {
            this.frameMetricsAggregator.m38644e();
            this.frameMetricsAggregator = null;
        }
    }

    @ReactMethod
    public void enableNativeFramesTracking() {
        boolean checkAndroidXAvailability = checkAndroidXAvailability();
        this.androidXAvailable = checkAndroidXAvailability;
        if (checkAndroidXAvailability) {
            this.frameMetricsAggregator = new FrameMetricsAggregator();
            Activity currentActivity = getCurrentActivity();
            FrameMetricsAggregator frameMetricsAggregator = this.frameMetricsAggregator;
            if (frameMetricsAggregator == null || currentActivity == null) {
                logger.mo17722c(EnumC8942n3.INFO, "currentActivity isn't available.", new Object[0]);
                return;
            }
            try {
                frameMetricsAggregator.m38648a(currentActivity);
                logger.mo17722c(EnumC8942n3.INFO, "FrameMetricsAggregator installed.", new Object[0]);
            } catch (Throwable unused) {
                logger.mo17722c(EnumC8942n3.ERROR, "Error adding Activity to frameMetricsAggregator.", new Object[0]);
            }
        } else {
            logger.mo17722c(EnumC8942n3.WARNING, "androidx.core' isn't available as a dependency.", new Object[0]);
        }
    }

    @ReactMethod
    public void fetchModules(Promise promise) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(getReactApplicationContext().getResources().getAssets().open(modulesPath));
            try {
                byte[] bArr = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(bArr);
                bufferedInputStream.close();
                promise.resolve(new String(bArr, UTF_8));
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            promise.resolve(null);
        } catch (Throwable unused2) {
            logger.mo17722c(EnumC8942n3.WARNING, "Fetching JS Modules failed.", new Object[0]);
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void fetchNativeAppStart(Promise promise) {
        C8709d0 d = C8709d0.m18315d();
        Date c = d.m18316c();
        Boolean e = d.m18314e();
        if (c == null) {
            logger.mo17722c(EnumC8942n3.WARNING, "App start won't be sent due to missing appStartTime.", new Object[0]);
            promise.resolve(null);
        } else if (e == null) {
            logger.mo17722c(EnumC8942n3.WARNING, "App start won't be sent due to missing isColdStart.", new Object[0]);
            promise.resolve(null);
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("appStartTime", c.getTime());
            createMap.putBoolean("isColdStart", e.booleanValue());
            createMap.putBoolean("didFetchAppStart", didFetchAppStart);
            promise.resolve(createMap);
        }
        didFetchAppStart = true;
    }

    @ReactMethod
    public void fetchNativeFrames(Promise promise) {
        int i;
        int i2;
        int i3;
        SparseIntArray sparseIntArray;
        if (!isFrameMetricsAggregatorAvailable()) {
            promise.resolve(null);
            return;
        }
        try {
            SparseIntArray[] b = this.frameMetricsAggregator.m38647b();
            if (b == null || (sparseIntArray = b[0]) == null) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                i3 = 0;
                i2 = 0;
                i = 0;
                for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                    int keyAt = sparseIntArray.keyAt(i4);
                    int valueAt = sparseIntArray.valueAt(i4);
                    i3 += valueAt;
                    if (keyAt > 700) {
                        i += valueAt;
                    } else if (keyAt > 16) {
                        i2 += valueAt;
                    }
                }
            }
            if (i3 == 0 && i2 == 0 && i == 0) {
                promise.resolve(null);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("totalFrames", i3);
            createMap.putInt("slowFrames", i2);
            createMap.putInt("frozenFrames", i);
            promise.resolve(createMap);
        } catch (Throwable unused) {
            logger.mo17722c(EnumC8942n3.WARNING, "Error fetching native frames.", new Object[0]);
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void fetchNativeRelease(Promise promise) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("id", this.packageInfo.packageName);
        createMap.putString("version", this.packageInfo.versionName);
        createMap.putString("build", String.valueOf(this.packageInfo.versionCode));
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void initNativeSdk(final ReadableMap readableMap, Promise promise) {
        C8702b1.m18330f(getReactApplicationContext(), new C8915k2.AbstractC8916a() { // from class: io.sentry.react.e
            @Override // io.sentry.C8915k2.AbstractC8916a
            /* renamed from: a */
            public final void mo17168a(C8951o3 o3Var) {
                RNSentryModule.this.lambda$initNativeSdk$1(readableMap, (SentryAndroidOptions) o3Var);
            }
        });
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void setContext(final String str, final ReadableMap readableMap) {
        if (str != null && readableMap != null) {
            C8915k2.m17704j(new AbstractC8807b2() { // from class: io.sentry.react.c
                @Override // io.sentry.AbstractC8807b2
                /* renamed from: a */
                public final void mo16755a(Scope scope) {
                    RNSentryModule.lambda$setContext$6(ReadableMap.this, str, scope);
                }
            });
        }
    }

    @ReactMethod
    public void setExtra(final String str, final String str2) {
        C8915k2.m17704j(new AbstractC8807b2() { // from class: io.sentry.react.h
            @Override // io.sentry.AbstractC8807b2
            /* renamed from: a */
            public final void mo16755a(Scope scope) {
                scope.m18373u(str, str2);
            }
        });
    }

    @ReactMethod
    public void setTag(final String str, final String str2) {
        C8915k2.m17704j(new AbstractC8807b2() { // from class: io.sentry.react.g
            @Override // io.sentry.AbstractC8807b2
            /* renamed from: a */
            public final void mo16755a(Scope scope) {
                scope.m18371w(str, str2);
            }
        });
    }

    @ReactMethod
    public void setUser(final ReadableMap readableMap, final ReadableMap readableMap2) {
        C8915k2.m17704j(new AbstractC8807b2() { // from class: io.sentry.react.b
            @Override // io.sentry.AbstractC8807b2
            /* renamed from: a */
            public final void mo16755a(Scope scope) {
                RNSentryModule.lambda$setUser$2(ReadableMap.this, readableMap2, scope);
            }
        });
    }
}
