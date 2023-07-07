package com.discord.analytics;

import android.content.SharedPreferences;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/discord/analytics/InstallReferrerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "get", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getName", "", "Companion", "analytics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstallReferrerModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_ATTEMPTS = 10;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/analytics/InstallReferrerModule$Companion;", "", "()V", "MAX_ATTEMPTS", "", "analytics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerModule(ReactApplicationContext context) {
        super(context);
        q.g(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    @ReactMethod
    public final void get(Promise promise) {
        q.g(promise, "promise");
        SharedPreferences sharedPreferences = getReactApplicationContext().getSharedPreferences("InstallReferrer", 0);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f20744k = sharedPreferences.getString("referrer", null);
        int i10 = sharedPreferences.getInt("attempts", 0);
        Object obj = ref$ObjectRef.f20744k;
        if (obj != null) {
            promise.resolve(obj);
        } else if (i10 < 10) {
            l.d(k0.b(), null, null, new InstallReferrerModule$get$1(new Ref$ObjectRef(), this, ref$ObjectRef, sharedPreferences, promise, i10, null), 3, null);
        } else {
            promise.resolve(null);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "InstallReferrer";
    }
}
