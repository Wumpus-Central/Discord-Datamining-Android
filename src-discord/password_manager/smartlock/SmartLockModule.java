package com.discord.password_manager.smartlock;

import aa.b;
import android.app.Activity;
import android.content.IntentSender;
import android.net.Uri;
import com.discord.logging.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialsClient;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.Task;
import ib.d;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import lg.v;

@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010H\u0007J\b\u0010\u0013\u001a\u00020\rH\u0002J\u001a\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0010H\u0007R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/discord/password_manager/smartlock/SmartLockModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "activityEventListener", "com/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1", "Lcom/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1;", "credentialsClient", "Lcom/google/android/gms/auth/api/credentials/CredentialsClient;", "loginPromise", "Lcom/facebook/react/bridge/Promise;", "autoLogin", "", BaseJavaModule.METHOD_TYPE_PROMISE, "getName", "", "removeCredentials", "login", "requestCredentials", "resolvePromiseWithCredentials", "password", "tryResolveResult", "activity", "Landroid/app/Activity;", "requestCode", "", "resolvableApiException", "Lcom/google/android/gms/common/api/ResolvableApiException;", "updateAccountCredentials", "", "usernameWithDiscriminator", "avatarUri", "Companion", "password_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SmartLockModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String DISCORD_ACCOUNT_IDENTITY = "https://discord.com/";
    public static final int GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE = 4008;
    public static final int GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE_FOR_REQUEST = 4009;
    private static final String logTag;
    private final SmartLockModule$activityEventListener$1 activityEventListener;
    private CredentialsClient credentialsClient;
    private Promise loginPromise;
    private final ReactApplicationContext reactContext;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/discord/password_manager/smartlock/SmartLockModule$Companion;", "", "()V", "DISCORD_ACCOUNT_IDENTITY", "", "GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE", "", "GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE_FOR_REQUEST", "logTag", "getLogTag", "()Ljava/lang/String;", "password_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getLogTag() {
            return SmartLockModule.logTag;
        }
    }

    static {
        String simpleName = SmartLockModule.class.getSimpleName();
        q.f(simpleName, "SmartLockModule::class.java.simpleName");
        logTag = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.discord.password_manager.smartlock.SmartLockModule$activityEventListener$1, com.facebook.react.bridge.ActivityEventListener] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SmartLockModule(com.facebook.react.bridge.ReactApplicationContext r3) {
        /*
            r2 = this;
            java.lang.String r0 = "reactContext"
            kotlin.jvm.internal.q.g(r3, r0)
            r2.<init>(r3)
            r2.reactContext = r3
            com.discord.password_manager.smartlock.SmartLockModule$activityEventListener$1 r0 = new com.discord.password_manager.smartlock.SmartLockModule$activityEventListener$1
            r0.<init>()
            r2.activityEventListener = r0
            r3.addActivityEventListener(r0)
            s9.d$a r0 = new s9.d$a
            r0.<init>()
            s9.d$a r0 = r0.c()
            s9.d r0 = r0.b()
            java.lang.String r1 = "Builder()\n            .f…og()\n            .build()"
            kotlin.jvm.internal.q.f(r0, r1)
            com.google.android.gms.auth.api.credentials.CredentialsClient r3 = com.google.android.gms.auth.api.credentials.b.a(r3, r0)
            java.lang.String r0 = "getClient(reactContext, options)"
            kotlin.jvm.internal.q.f(r3, r0)
            r2.credentialsClient = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.password_manager.smartlock.SmartLockModule.<init>(com.facebook.react.bridge.ReactApplicationContext):void");
    }

    private final void requestCredentials() {
        a a10 = new a.C0158a().c(true).b(DISCORD_ACCOUNT_IDENTITY).a();
        q.f(a10, "Builder()\n            .s…ITY)\n            .build()");
        this.credentialsClient.D(a10).b(new d() { // from class: com.discord.password_manager.smartlock.a
            @Override // ib.d
            public final void a(Task task) {
                SmartLockModule.requestCredentials$lambda$0(SmartLockModule.this, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestCredentials$lambda$0(SmartLockModule this$0, Task task) {
        boolean z10;
        String str;
        q.g(this$0, "this$0");
        q.g(task, "task");
        if (task.o()) {
            Credential c10 = ((s9.a) task.k()).c();
            String str2 = null;
            if (c10 != null) {
                str = c10.getId();
            } else {
                str = null;
            }
            Credential c11 = ((s9.a) task.k()).c();
            if (c11 != null) {
                str2 = c11.K();
            }
            if (str != null) {
                this$0.resolvePromiseWithCredentials(str, str2);
                return;
            }
            return;
        }
        Exception j10 = task.j();
        if (j10 instanceof ResolvableApiException) {
            ResolvableApiException resolvableApiException = (ResolvableApiException) j10;
            if (resolvableApiException.b() == 4) {
                z10 = false;
            } else {
                z10 = true;
            }
            Log.INSTANCE.w(logTag, "Resolvable Exception requesting credentials", j10);
            Activity currentActivity = this$0.reactContext.getCurrentActivity();
            if (z10 && currentActivity != null) {
                this$0.tryResolveResult(currentActivity, GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE_FOR_REQUEST, resolvableApiException);
            }
        } else if (j10 instanceof b) {
            Log.INSTANCE.w(logTag, "API Exception requesting credentials", j10);
        } else {
            Log.INSTANCE.w(logTag, "Exception requesting credentials", j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolvePromiseWithCredentials(String str, String str2) {
        Map k10;
        Promise promise = this.loginPromise;
        if (promise != null) {
            k10 = v.k(x.a("login", str), x.a("password", str2));
            promise.resolve(Arguments.makeNativeMap(k10));
        }
    }

    private final void tryResolveResult(ResolvableApiException resolvableApiException) {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            tryResolveResult(currentActivity, GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE, resolvableApiException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateAccountCredentials$lambda$4(SmartLockModule this$0, Task task) {
        q.g(this$0, "this$0");
        q.g(task, "task");
        if (!task.o()) {
            Exception j10 = task.j();
            if (j10 instanceof ResolvableApiException) {
                Log.INSTANCE.w(logTag, "Resolving Exception saving credentials", j10);
                this$0.tryResolveResult((ResolvableApiException) j10);
                return;
            }
            Log.INSTANCE.w(logTag, "Exception saving credentials", j10);
        }
    }

    @ReactMethod
    public final void autoLogin(Promise promise) {
        q.g(promise, "promise");
        this.loginPromise = promise;
        requestCredentials();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SmartLockModule";
    }

    @ReactMethod
    public final void removeCredentials(String login) {
        q.g(login, "login");
        this.credentialsClient.C(new Credential.a(login).a());
    }

    @ReactMethod
    public final boolean updateAccountCredentials(String login, String password, String str, String str2) {
        q.g(login, "login");
        q.g(password, "password");
        Credential.a aVar = new Credential.a(login);
        if (str != null) {
            aVar.b(str);
        }
        if (str2 != null) {
            aVar.d(Uri.parse(str2));
        }
        aVar.c(password);
        Credential a10 = aVar.a();
        q.f(a10, "Builder(login).apply {\n …ssword)\n        }.build()");
        this.credentialsClient.E(a10).b(new d() { // from class: com.discord.password_manager.smartlock.b
            @Override // ib.d
            public final void a(Task task) {
                SmartLockModule.updateAccountCredentials$lambda$4(SmartLockModule.this, task);
            }
        });
        return false;
    }

    private final void tryResolveResult(Activity activity, int i10, ResolvableApiException resolvableApiException) {
        try {
            if ((resolvableApiException.b() != 4) && !activity.isDestroyed() && !activity.isFinishing()) {
                resolvableApiException.c(activity, i10);
            }
        } catch (IntentSender.SendIntentException e10) {
            Log.INSTANCE.w(logTag, "Failed to send resolution.", e10);
        } catch (Exception e11) {
            Log.INSTANCE.w(logTag, "Failed to resolve", e11);
        }
    }
}
