package com.discord.samsung;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.appcompat.app.b;
import com.discord.BuildConfig;
import com.discord.logging.Log;
import com.msc.sa.aidl.ISACallback;
import com.msc.sa.aidl.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\b*\u0001\u0015\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/discord/samsung/SamsungConnectActivity;", "Landroidx/appcompat/app/b;", "", "finishedWithRestartRequested", "", "authCode", "authServerUrl", "finishWithResult", "startAndBindSamsungAuthService", "Lcom/msc/sa/aidl/ISACallback$Stub;", "createCallback", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStop", "Lcom/msc/sa/aidl/ISACallback;", "samsungAccountServiceCallback", "Lcom/msc/sa/aidl/ISACallback;", "", "serviceBound", "Z", "com/discord/samsung/SamsungConnectActivity$serviceConnection$1", "serviceConnection", "Lcom/discord/samsung/SamsungConnectActivity$serviceConnection$1;", "<init>", "()V", "Companion", "Result", "samsung_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SamsungConnectActivity extends b {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ATTEMPT_COUNT = "com.discord.samsung.intent.extra.ATTEMPT_COUNT";
    public static final String EXTRA_REQ_AUTH_PARAM_AUTH_CODE = "com.discord.samsung.intent.extra.AUTH_CODE";
    public static final String EXTRA_REQ_AUTH_PARAM_AUTH_SERVER_URL = "com.discord.samsung.intent.extra.SERVER_URL";
    private static final String LOG_TAG = "Samsung";
    public static final int RESULT_SA_BINDING_FAILED = 500;
    private static final int SAMSUNG_REQ_ID = 1221;
    private static final Intent serviceIntent;
    private ISACallback samsungAccountServiceCallback;
    private boolean serviceBound;
    private final SamsungConnectActivity$serviceConnection$1 serviceConnection = new ServiceConnection() { // from class: com.discord.samsung.SamsungConnectActivity$serviceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ISACallback iSACallback;
            SamsungConnectActivity.this.serviceBound = true;
            a c10 = a.AbstractBinderC0181a.c(iBinder);
            Log log = Log.INSTANCE;
            Log.i$default(log, "Samsung", "Samsung Account service connection established", (Throwable) null, 4, (Object) null);
            try {
                iSACallback = SamsungConnectActivity.this.samsungAccountServiceCallback;
                if (iSACallback == null) {
                    q.y("samsungAccountServiceCallback");
                    iSACallback = null;
                }
                String z10 = c10.z(BuildConfig.SAMSUNGxDISCORD_CLIENT_ID, "dummy", BuildConfig.APPLICATION_ID, iSACallback);
                Log.i$default(log, "Samsung", "Samsung Account service connection established: " + z10, (Throwable) null, 4, (Object) null);
                if (z10 == null) {
                    SamsungConnectActivity.this.finishedWithRestartRequested();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("additional", new String[]{"api_server_url", "auth_server_url"});
                Unit unit = Unit.f20717a;
                Log.i$default(log, "Samsung", "Samsung Account service connection established: isReqSucc? " + c10.K(1221, z10, bundle), (Throwable) null, 4, (Object) null);
            } catch (Throwable th2) {
                Log.INSTANCE.e("Samsung", "Unable to connect to Samsung", th2);
                SamsungConnectActivity.this.finishWithResult(null, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i$default(Log.INSTANCE, "Samsung", "Samsung Account service connection unbound", (Throwable) null, 4, (Object) null);
            SamsungConnectActivity.this.serviceBound = false;
            SamsungConnectActivity.this.finish();
        }
    };

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/samsung/SamsungConnectActivity$Companion;", "", "()V", "EXTRA_ATTEMPT_COUNT", "", "EXTRA_REQ_AUTH_PARAM_AUTH_CODE", "EXTRA_REQ_AUTH_PARAM_AUTH_SERVER_URL", "LOG_TAG", "RESULT_SA_BINDING_FAILED", "", "SAMSUNG_REQ_ID", "serviceIntent", "Landroid/content/Intent;", "getIntent", "context", "Landroid/content/Context;", "attemptCount", "samsung_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent getIntent$default(Companion companion, Context context, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return companion.getIntent(context, i10);
        }

        public final Intent getIntent(Context context, int i10) {
            q.g(context, "context");
            Intent addFlags = new Intent(context, SamsungConnectActivity.class).putExtra(SamsungConnectActivity.EXTRA_ATTEMPT_COUNT, i10).addFlags(65536);
            q.f(addFlags, "Intent(context, SamsungC…AG_ACTIVITY_NO_ANIMATION)");
            return addFlags;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/samsung/SamsungConnectActivity$Result;", "", "()V", "Failure", "Success", "Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;", "Lcom/discord/samsung/SamsungConnectActivity$Result$Success;", "samsung_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Result {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;", "Lcom/discord/samsung/SamsungConnectActivity$Result;", "isRetryAllowed", "", "attemptCount", "", "(ZI)V", "getAttemptCount", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "samsung_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Failure extends Result {
            private final int attemptCount;
            private final boolean isRetryAllowed;

            public /* synthetic */ Failure(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(z10, (i11 & 2) != 0 ? 0 : i10);
            }

            public static /* synthetic */ Failure copy$default(Failure failure, boolean z10, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z10 = failure.isRetryAllowed;
                }
                if ((i11 & 2) != 0) {
                    i10 = failure.attemptCount;
                }
                return failure.copy(z10, i10);
            }

            public final boolean component1() {
                return this.isRetryAllowed;
            }

            public final int component2() {
                return this.attemptCount;
            }

            public final Failure copy(boolean z10, int i10) {
                return new Failure(z10, i10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) obj;
                return this.isRetryAllowed == failure.isRetryAllowed && this.attemptCount == failure.attemptCount;
            }

            public final int getAttemptCount() {
                return this.attemptCount;
            }

            public int hashCode() {
                boolean z10 = this.isRetryAllowed;
                if (z10) {
                    z10 = true;
                }
                int i10 = z10 ? 1 : 0;
                int i11 = z10 ? 1 : 0;
                int i12 = z10 ? 1 : 0;
                return (i10 * 31) + this.attemptCount;
            }

            public final boolean isRetryAllowed() {
                return this.isRetryAllowed;
            }

            public String toString() {
                boolean z10 = this.isRetryAllowed;
                int i10 = this.attemptCount;
                return "Failure(isRetryAllowed=" + z10 + ", attemptCount=" + i10 + ")";
            }

            public Failure(boolean z10, int i10) {
                super(null);
                this.isRetryAllowed = z10;
                this.attemptCount = i10;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/discord/samsung/SamsungConnectActivity$Result$Success;", "Lcom/discord/samsung/SamsungConnectActivity$Result;", "authCode", "", "serverUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthCode", "()Ljava/lang/String;", "getServerUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "samsung_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Success extends Result {
            private final String authCode;
            private final String serverUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String authCode, String serverUrl) {
                super(null);
                q.g(authCode, "authCode");
                q.g(serverUrl, "serverUrl");
                this.authCode = authCode;
                this.serverUrl = serverUrl;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = success.authCode;
                }
                if ((i10 & 2) != 0) {
                    str2 = success.serverUrl;
                }
                return success.copy(str, str2);
            }

            public final String component1() {
                return this.authCode;
            }

            public final String component2() {
                return this.serverUrl;
            }

            public final Success copy(String authCode, String serverUrl) {
                q.g(authCode, "authCode");
                q.g(serverUrl, "serverUrl");
                return new Success(authCode, serverUrl);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return q.b(this.authCode, success.authCode) && q.b(this.serverUrl, success.serverUrl);
            }

            public final String getAuthCode() {
                return this.authCode;
            }

            public final String getServerUrl() {
                return this.serverUrl;
            }

            public int hashCode() {
                return (this.authCode.hashCode() * 31) + this.serverUrl.hashCode();
            }

            public String toString() {
                String str = this.authCode;
                String str2 = this.serverUrl;
                return "Success(authCode=" + str + ", serverUrl=" + str2 + ")";
            }
        }

        private Result() {
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Intent intent = new Intent("com.msc.action.samsungaccount.REQUEST_SERVICE").setPackage("com.osp.app.signin");
        q.f(intent, "Intent(\"com.msc.action.s…age(\"com.osp.app.signin\")");
        serviceIntent = intent;
    }

    private final ISACallback.Stub createCallback() {
        return new ISACallback.Stub() { // from class: com.discord.samsung.SamsungConnectActivity$createCallback$1
            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveAccessToken(int i10, boolean z10, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveAccessToken".toString());
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
                if (r11 == false) goto L_0x009c;
             */
            @Override // com.msc.sa.aidl.ISACallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onReceiveAuthCode(int r10, boolean r11, android.os.Bundle r12) {
                /*
                    r9 = this;
                    r10 = 0
                    if (r12 == 0) goto L_0x000a
                    java.lang.String r0 = "authcode"
                    java.lang.String r0 = r12.getString(r0)
                    goto L_0x000b
                L_0x000a:
                    r0 = r10
                L_0x000b:
                    if (r12 == 0) goto L_0x0014
                    java.lang.String r1 = "auth_server_url"
                    java.lang.String r1 = r12.getString(r1)
                    goto L_0x0015
                L_0x0014:
                    r1 = r10
                L_0x0015:
                    com.discord.logging.Log r8 = com.discord.logging.Log.INSTANCE
                    java.lang.String r3 = "Samsung"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "Samsung onReceiveAuthCode="
                    r2.append(r4)
                    r2.append(r11)
                    java.lang.String r4 = r2.toString()
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r2 = r8
                    com.discord.logging.Log.i$default(r2, r3, r4, r5, r6, r7)
                    if (r11 == 0) goto L_0x0041
                    if (r0 == 0) goto L_0x003e
                    boolean r11 = ki.l.w(r0)
                    if (r11 == 0) goto L_0x003c
                    goto L_0x003e
                L_0x003c:
                    r11 = 0
                    goto L_0x003f
                L_0x003e:
                    r11 = 1
                L_0x003f:
                    if (r11 == 0) goto L_0x009c
                L_0x0041:
                    if (r12 == 0) goto L_0x004a
                    java.lang.String r11 = "error_code"
                    java.lang.String r11 = r12.getString(r11)
                    goto L_0x004b
                L_0x004a:
                    r11 = r10
                L_0x004b:
                    if (r12 == 0) goto L_0x0054
                    java.lang.String r2 = "error_message"
                    java.lang.String r12 = r12.getString(r2)
                    goto L_0x0055
                L_0x0054:
                    r12 = r10
                L_0x0055:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Samsung Account link failure "
                    r2.append(r3)
                    if (r0 == 0) goto L_0x0066
                    r10 = 4
                    java.lang.String r10 = ki.l.b1(r0, r10)
                L_0x0066:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "["
                    r3.append(r4)
                    r3.append(r11)
                    java.lang.String r11 = ":"
                    r3.append(r11)
                    r3.append(r10)
                    java.lang.String r10 = "]: "
                    r3.append(r10)
                    r3.append(r12)
                    java.lang.String r10 = r3.toString()
                    r2.append(r10)
                    java.lang.String r4 = r2.toString()
                    java.lang.String r10 = "StringBuilder()\n        …              .toString()"
                    kotlin.jvm.internal.q.f(r4, r10)
                    java.lang.String r3 = "Samsung"
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r2 = r8
                    com.discord.logging.Log.w$default(r2, r3, r4, r5, r6, r7)
                L_0x009c:
                    com.discord.samsung.SamsungConnectActivity r10 = com.discord.samsung.SamsungConnectActivity.this
                    com.discord.samsung.SamsungConnectActivity.access$finishWithResult(r10, r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.samsung.SamsungConnectActivity$createCallback$1.onReceiveAuthCode(int, boolean, android.os.Bundle):void");
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveChecklistValidation(int i10, boolean z10, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveAccessToken".toString());
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveDisclaimerAgreement(int i10, boolean z10, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveDisclaimerAgreement".toString());
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceivePasswordConfirmation(int i10, boolean z10, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceivePasswordConfirmation".toString());
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveRLControlFMM(int i10, boolean z10, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveRLControlFMM".toString());
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveRubinRequest(int i10, boolean z10, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveRubinRequest".toString());
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveSCloudAccessToken(int i10, boolean z10, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveSCloudAccessToken".toString());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void finishWithResult(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.discord.logging.Log r0 = com.discord.logging.Log.INSTANCE
            java.lang.String r1 = "Samsung"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Finishing With Result. AuthCode: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", AuthServerUrl: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r4 = 4
            r5 = 0
            com.discord.logging.Log.i$default(r0, r1, r2, r3, r4, r5)
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0030
            boolean r2 = ki.l.w(r7)
            if (r2 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = r1
            goto L_0x0031
        L_0x0030:
            r2 = r0
        L_0x0031:
            if (r2 != 0) goto L_0x0056
            if (r8 == 0) goto L_0x003d
            boolean r2 = ki.l.w(r8)
            if (r2 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            goto L_0x0056
        L_0x0040:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.discord.samsung.intent.extra.AUTH_CODE"
            r0.putExtra(r1, r7)
            java.lang.String r7 = "com.discord.samsung.intent.extra.SERVER_URL"
            r0.putExtra(r7, r8)
            kotlin.Unit r7 = kotlin.Unit.f20717a
            r7 = -1
            r6.setResult(r7, r0)
            goto L_0x0059
        L_0x0056:
            r6.setResult(r1)
        L_0x0059:
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.samsung.SamsungConnectActivity.finishWithResult(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishedWithRestartRequested() {
        Log.i$default(Log.INSTANCE, LOG_TAG, "finishedWithRestartRequested", (Throwable) null, 4, (Object) null);
        setResult(500, new Intent().putExtra(EXTRA_ATTEMPT_COUNT, getIntent().getIntExtra(EXTRA_ATTEMPT_COUNT, 0) + 1));
        finish();
    }

    private final void startAndBindSamsungAuthService() {
        Log log = Log.INSTANCE;
        Log.i$default(log, LOG_TAG, "Samsung starting SA Service", (Throwable) null, 4, (Object) null);
        Intent intent = serviceIntent;
        if (startService(intent) == null) {
            Log.e$default(log, LOG_TAG, "Samsung Account service could not be started", (Throwable) null, 4, (Object) null);
        } else if (!bindService(intent, this.serviceConnection, 1)) {
            Log.e$default(log, LOG_TAG, "Samsung Account service could not be bound", (Throwable) null, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i$default(Log.INSTANCE, LOG_TAG, "onCreate SamsungConnectActivity", (Throwable) null, 4, (Object) null);
        this.samsungAccountServiceCallback = createCallback();
        startAndBindSamsungAuthService();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Log.i$default(Log.INSTANCE, LOG_TAG, "onStop SamsungConnectActivity", (Throwable) null, 4, (Object) null);
        if (this.serviceBound) {
            unbindService(this.serviceConnection);
            this.serviceBound = false;
        }
        super.onStop();
    }
}
