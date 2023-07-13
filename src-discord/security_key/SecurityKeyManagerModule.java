package com.discord.security_key;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/security_key/SecurityKeyManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "activityEventListener", "com/discord/security_key/SecurityKeyManagerModule$activityEventListener$1", "Lcom/discord/security_key/SecurityKeyManagerModule$activityEventListener$1;", "currentPromise", "Lcom/facebook/react/bridge/Promise;", "webauthn", "Lcom/discord/security_key/WebAuthn;", "authenticate", "", "data", "", BaseJavaModule.METHOD_TYPE_PROMISE, "getName", "initialize", "invalidate", "register", "reject", "message", "resolve", "security_key_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SecurityKeyManagerModule extends ReactContextBaseJavaModule {
    private Promise currentPromise;
    private final WebAuthn webauthn = new WebAuthn(new SecurityKeyManagerModule$webauthn$1(this), new SecurityKeyManagerModule$webauthn$2(this));
    private final SecurityKeyManagerModule$activityEventListener$1 activityEventListener = new BaseActivityEventListener() { 
        @Override 
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            WebAuthn webAuthn;
            webAuthn = SecurityKeyManagerModule.this.webauthn;
            webAuthn.onActivityResult(i10, i11, intent);
        }
    };

    
    
    public SecurityKeyManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    
    public final void reject(String str) {
        Promise promise = this.currentPromise;
        q.d(promise);
        promise.reject("failed", str);
        this.currentPromise = null;
    }

    
    public final void resolve(String str) {
        Promise promise = this.currentPromise;
        q.d(promise);
        promise.resolve(str);
        this.currentPromise = null;
    }

    @ReactMethod
    public final void authenticate(String data, Promise promise) {
        q.g(data, "data");
        q.g(promise, "promise");
        if (this.currentPromise != null) {
            promise.reject("failed", "already running");
            return;
        }
        this.currentPromise = promise;
        this.webauthn.authenticate(data, getCurrentActivity());
    }

    @Override 
    public String getName() {
        return "DCDSecurityKeyManager";
    }

    @Override 
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addActivityEventListener(this.activityEventListener);
    }

    @Override 
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
    }

    @ReactMethod
    public final void register(String data, Promise promise) {
        q.g(data, "data");
        q.g(promise, "promise");
        if (this.currentPromise != null) {
            promise.reject("failed", "already running");
            return;
        }
        this.currentPromise = promise;
        this.webauthn.register(data, getCurrentActivity());
    }
}
