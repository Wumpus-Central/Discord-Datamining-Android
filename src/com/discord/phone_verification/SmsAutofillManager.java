package com.discord.phone_verification;

import android.content.Context;
import android.content.IntentFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import p262o9.AbstractC11000b;
import p262o9.C10999a;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/phone_verification/SmsAutofillManager;", "", "", "startSmsRetriever", "unregisterReceiver", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/discord/phone_verification/SmsAuthCodeBroadcastReceiver;", "broadcastReceiver", "Lcom/discord/phone_verification/SmsAuthCodeBroadcastReceiver;", "Lkotlin/Function1;", "", "onSMSRetrieved", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "phone_verification_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SmsAutofillManager {
    private final SmsAuthCodeBroadcastReceiver broadcastReceiver;
    private final Context context;

    public SmsAutofillManager(Context context, Function1<? super String, Unit> onSMSRetrieved) {
        C9677q.m14633g(context, "context");
        C9677q.m14633g(onSMSRetrieved, "onSMSRetrieved");
        this.context = context;
        SmsAuthCodeBroadcastReceiver smsAuthCodeBroadcastReceiver = new SmsAuthCodeBroadcastReceiver(onSMSRetrieved);
        this.broadcastReceiver = smsAuthCodeBroadcastReceiver;
        context.registerReceiver(smsAuthCodeBroadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
    }

    public final void startSmsRetriever() {
        AbstractC11000b a = C10999a.m10371a(this.context);
        C9677q.m14634f(a, "getClient(context)");
        a.mo10370C();
    }

    public final void unregisterReceiver() {
        try {
            this.context.unregisterReceiver(this.broadcastReceiver);
        } catch (Exception unused) {
        }
    }
}
