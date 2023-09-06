package com.discord.samsung;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.samsung.SamsungConnectActivity;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kf.s;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.p;
import kotlin.text.r;
import kotlinx.coroutines.l;
import okhttp3.Response;

@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\b\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J,\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010!\u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006&"}, d2 = {"Lcom/discord/samsung/SamsungModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "connectionPromise", "Lcom/facebook/react/bridge/Promise;", "samsungActivityEventListener", "com/discord/samsung/SamsungModule$samsungActivityEventListener$1", "Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;", "checkIfOAuthRequest", "", "clientId", "", BaseJavaModule.METHOD_TYPE_PROMISE, "finishSamsungAuthorization", "authCode", "location", "state", "getAccountUrlAndAuthCode", "getAccountUrlFromAuthServerUrl", "authServerUrl", "getName", "handleAuthResult", "result", "Lcom/discord/samsung/SamsungConnectActivity$Result;", "handleSamsungCallback", "Landroid/net/Uri;", "response", "Lokhttp3/Response;", "rejectConnection", "throwable", "", "resolveConnection", "what", "", "showConnectionDisclaimer", "Companion", "samsung_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SamsungModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final Intent disclaimerIntent;
    private Promise connectionPromise;
    private final SamsungModule$samsungActivityEventListener$1 samsungActivityEventListener;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/samsung/SamsungModule$Companion;", "", "()V", "disclaimerIntent", "Landroid/content/Intent;", "RequestCode", "SamsungCallbackException", "samsung_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/samsung/SamsungModule$Companion$RequestCode;", "", "()V", "Auth", "", "ConnectionDisclaimer", "samsung_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class RequestCode {
            public static final int Auth = 101;
            public static final int ConnectionDisclaimer = 100;
            public static final RequestCode INSTANCE = new RequestCode();

            private RequestCode() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/samsung/SamsungModule$Companion$SamsungCallbackException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "errorCode", "", "errorMsg", "(Ljava/lang/String;Ljava/lang/String;)V", "samsung_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class SamsungCallbackException extends IllegalStateException {
            
            public SamsungCallbackException(String errorCode, String str) {
                super("[" + errorCode + "] " + str);
                q.h(errorCode, "errorCode");
            }
        }

        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Intent putExtra = new Intent("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT").putExtra("client_id", BuildConfig.SAMSUNGxDISCORD_CLIENT_ID).putExtra("progress_theme", "dark");
        q.g(putExtra, "Intent(\"com.msc.action.s…\"progress_theme\", \"dark\")");
        disclaimerIntent = putExtra;
    }

    
    
    
    
    public SamsungModule(com.facebook.react.bridge.ReactApplicationContext r2) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.samsung.SamsungModule.<init>(com.facebook.react.bridge.ReactApplicationContext):void");
    }

    private final String getAccountUrlFromAuthServerUrl(String str) {
        String a12;
        a12 = r.a1(str, 2);
        int hashCode = a12.hashCode();
        if (hashCode == 3179) {
            return !a12.equals("cn") ? "https:
        }
        if (hashCode != 3248) {
            return (hashCode == 3742 && a12.equals("us")) ? "https:
        }
        a12.equals("eu");
        return "https:
    }

    
    public final void handleAuthResult(SamsungConnectActivity.Result result) {
        if (result instanceof SamsungConnectActivity.Result.Success) {
            SamsungConnectActivity.Result.Success success = (SamsungConnectActivity.Result.Success) result;
            resolveConnection(NativeArrayExtensionsKt.nativeArrayOf(getAccountUrlFromAuthServerUrl(success.getServerUrl()), success.getAuthCode()));
        } else if (result instanceof SamsungConnectActivity.Result.Failure) {
            SamsungConnectActivity.Result.Failure failure = (SamsungConnectActivity.Result.Failure) result;
            if (!failure.isRetryAllowed() || failure.getAttemptCount() >= 2) {
                int attemptCount = failure.getAttemptCount();
                boolean isRetryAllowed = failure.isRetryAllowed();
                rejectConnection(new Throwable("Attempts: " + attemptCount + ", Retry: " + isRetryAllowed));
                return;
            }
            Activity currentActivity = getCurrentActivity();
            q.e(currentActivity);
            SamsungConnectActivity.Companion companion = SamsungConnectActivity.Companion;
            Activity currentActivity2 = getCurrentActivity();
            q.e(currentActivity2);
            currentActivity.startActivityForResult(companion.getIntent(currentActivity2, failure.getAttemptCount()), 101);
        }
    }

    
    public final Uri handleSamsungCallback(Response response) {
        Uri uri;
        String str;
        String query;
        String str2 = null;
        String v10 = Response.v(response, "Location", null, 2, null);
        if (v10 != null) {
            uri = Uri.parse(v10);
        } else {
            uri = null;
        }
        boolean z10 = false;
        if (!(uri == null || (query = uri.getQuery()) == null)) {
            z10 = p.M(query, "error", false, 2, null);
        }
        if (!z10 && (response.W() || response.D())) {
            return uri;
        }
        if (uri == null || (str = uri.getQueryParameter("error")) == null) {
            str = "unknown";
        }
        if (uri != null) {
            str2 = uri.getQueryParameter("error_description");
        }
        throw new Companion.SamsungCallbackException(str, str2);
    }

    
    public final void rejectConnection(Throwable th2) {
        Promise promise = this.connectionPromise;
        if (promise != null) {
            promise.reject(th2);
        }
        this.connectionPromise = null;
    }

    private final void resolveConnection(Object obj) {
        Promise promise = this.connectionPromise;
        if (promise != null) {
            promise.resolve(obj);
        }
        this.connectionPromise = null;
    }

    
    public static  void resolveConnection$default(SamsungModule samsungModule, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        samsungModule.resolveConnection(obj);
    }

    
    @com.facebook.react.bridge.ReactMethod
    
    public final void checkIfOAuthRequest(java.lang.String r3, com.facebook.react.bridge.Promise r4) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.samsung.SamsungModule.checkIfOAuthRequest(java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public final void finishSamsungAuthorization(String authCode, String str, String str2, Promise promise) {
        q.h(authCode, "authCode");
        q.h(promise, "promise");
        this.connectionPromise = promise;
        Activity currentActivity = getCurrentActivity();
        q.f(currentActivity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        l.d(androidx.lifecycle.p.a((LifecycleOwner) currentActivity), null, null, new SamsungModule$finishSamsungAuthorization$1(str, this, str2, authCode, null), 3, null);
    }

    @ReactMethod
    public final void getAccountUrlAndAuthCode(Promise promise) {
        Object obj;
        q.h(promise, "promise");
        this.connectionPromise = promise;
        try {
            s.a aVar = s.f21214k;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            SamsungConnectActivity.Companion companion = SamsungConnectActivity.Companion;
            Activity currentActivity = getCurrentActivity();
            q.e(currentActivity);
            obj = s.b(Boolean.valueOf(reactApplicationContext.startActivityForResult(SamsungConnectActivity.Companion.getIntent$default(companion, currentActivity, 0, 2, null), 101, Bundle.EMPTY)));
        } catch (Throwable th2) {
            s.a aVar2 = s.f21214k;
            obj = s.b(t.a(th2));
        }
        Throwable e10 = s.e(obj);
        if (e10 != null) {
            rejectConnection(e10);
        }
    }

    @Override 
    public String getName() {
        return "Samsung";
    }

    @ReactMethod
    public final void showConnectionDisclaimer(Promise promise) {
        Object obj;
        q.h(promise, "promise");
        this.connectionPromise = promise;
        try {
            s.a aVar = s.f21214k;
            obj = s.b(Boolean.valueOf(getReactApplicationContext().startActivityForResult(disclaimerIntent, 100, Bundle.EMPTY)));
        } catch (Throwable th2) {
            s.a aVar2 = s.f21214k;
            obj = s.b(t.a(th2));
        }
        Throwable e10 = s.e(obj);
        if (e10 != null) {
            rejectConnection(e10);
        }
    }
}
