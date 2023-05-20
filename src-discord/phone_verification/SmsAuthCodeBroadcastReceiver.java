package com.discord.phone_verification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.discord.logging.Log;
import com.google.android.gms.common.api.Status;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/discord/phone_verification/SmsAuthCodeBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "", "message", "extractCode", "Landroid/os/Bundle;", "", "extractSecurityCode", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "Lkotlin/Function1;", "onReceiveCallback", "Lkotlin/jvm/functions/Function1;", "", "handled", "Z", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "phone_verification_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SmsAuthCodeBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SmsAuthCodeBroadcastReceiver";
    private boolean handled;
    private final Function1<String, Unit> onReceiveCallback;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/phone_verification/SmsAuthCodeBroadcastReceiver$Companion;", "", "()V", "TAG", "", "phone_verification_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmsAuthCodeBroadcastReceiver(Function1<? super String, Unit> onReceiveCallback) {
        q.g(onReceiveCallback, "onReceiveCallback");
        this.onReceiveCallback = onReceiveCallback;
    }

    private final String extractCode(String str) {
        String value;
        String str2 = null;
        MatchResult c10 = Regex.c(new Regex("[\\d-]{6,11}"), str, 0, 2, null);
        if (!(c10 == null || (value = c10.getValue()) == null)) {
            StringBuilder sb2 = new StringBuilder();
            int length = value.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = value.charAt(i10);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            str2 = sb2.toString();
            q.f(str2, "filterTo(StringBuilder(), predicate).toString()");
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    private final void extractSecurityCode(Bundle bundle) {
        String str;
        boolean z10;
        String str2 = (String) bundle.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
        if (str2 != null) {
            str = extractCode(str2);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Log.i$default(Log.INSTANCE, TAG, "Failed to extract code from SMS.", (Throwable) null, 4, (Object) null);
            return;
        }
        Log.i$default(Log.INSTANCE, TAG, "Successfully extracted code from SMS: " + str, (Throwable) null, 4, (Object) null);
        this.onReceiveCallback.invoke(str);
        this.handled = true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object obj;
        Status status;
        Integer num;
        q.g(context, "context");
        q.g(intent, "intent");
        if (!this.handled) {
            Bundle extras = intent.getExtras();
            Integer num2 = null;
            if (extras != null) {
                obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            } else {
                obj = null;
            }
            if (obj instanceof Status) {
                status = (Status) obj;
            } else {
                status = null;
            }
            if (status != null) {
                num = Integer.valueOf(status.p());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                Log.i$default(Log.INSTANCE, TAG, "Successfully caught SMS code.", (Throwable) null, 4, (Object) null);
                extractSecurityCode(extras);
            } else if (num != null && num.intValue() == 15) {
                Log.i$default(Log.INSTANCE, TAG, "Timeout waiting for SMS code.", (Throwable) null, 4, (Object) null);
            } else {
                Log log = Log.INSTANCE;
                if (status != null) {
                    num2 = Integer.valueOf(status.p());
                }
                Log.i$default(log, TAG, "Unexpected status code while waiting for SMS code: " + num2, (Throwable) null, 4, (Object) null);
            }
        }
    }
}
