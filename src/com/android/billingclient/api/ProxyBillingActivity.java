package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import sa.C12844k;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: k */
    private ResultReceiver f6818k;

    /* renamed from: l */
    private ResultReceiver f6819l;

    /* renamed from: m */
    private boolean f6820m;

    /* renamed from: n */
    private boolean f6821n;

    /* renamed from: a */
    private Intent m32774a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* renamed from: b */
    private Intent m32773b() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = 100
            r1 = 0
            r2 = 0
            r3 = 110(0x6e, float:1.54E-43)
            java.lang.String r4 = "ProxyBillingActivity"
            if (r8 == r0) goto L_0x0043
            if (r8 != r3) goto L_0x0010
            goto L_0x0043
        L_0x0010:
            r9 = 101(0x65, float:1.42E-43)
            if (r8 != r9) goto L_0x0028
            int r8 = sa.C12844k.m5297a(r10, r4)
            android.os.ResultReceiver r9 = r7.f6819l
            if (r9 == 0) goto L_0x00ca
            if (r10 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            android.os.Bundle r1 = r10.getExtras()
        L_0x0023:
            r9.send(r8, r1)
            goto L_0x00ca
        L_0x0028:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Got onActivityResult with wrong requestCode: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = "; skipping..."
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            sa.C12844k.m5285m(r4, r8)
            goto L_0x00ca
        L_0x0043:
            com.android.billingclient.api.BillingResult r0 = sa.C12844k.m5290h(r10, r4)
            int r0 = r0.m32801a()
            r5 = -1
            if (r9 != r5) goto L_0x0054
            if (r0 == 0) goto L_0x0052
            r9 = r5
            goto L_0x0054
        L_0x0052:
            r0 = r2
            goto L_0x0070
        L_0x0054:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Activity finished with resultCode "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r9 = " and billing's responseCode: "
            r5.append(r9)
            r5.append(r0)
            java.lang.String r9 = r5.toString()
            sa.C12844k.m5285m(r4, r9)
        L_0x0070:
            android.os.ResultReceiver r9 = r7.f6818k
            if (r9 == 0) goto L_0x007f
            if (r10 != 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            android.os.Bundle r1 = r10.getExtras()
        L_0x007b:
            r9.send(r0, r1)
            goto L_0x00ca
        L_0x007f:
            if (r10 == 0) goto L_0x00bb
            android.os.Bundle r9 = r10.getExtras()
            if (r9 == 0) goto L_0x00a4
            android.os.Bundle r9 = r10.getExtras()
            java.lang.String r0 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r9 = r9.getString(r0)
            if (r9 == 0) goto L_0x0098
            android.content.Intent r9 = r7.m32774a(r9)
            goto L_0x00bf
        L_0x0098:
            android.content.Intent r9 = r7.m32773b()
            android.os.Bundle r10 = r10.getExtras()
            r9.putExtras(r10)
            goto L_0x00bf
        L_0x00a4:
            android.content.Intent r9 = r7.m32773b()
            java.lang.String r10 = "Got null bundle!"
            sa.C12844k.m5285m(r4, r10)
            java.lang.String r10 = "RESPONSE_CODE"
            r0 = 6
            r9.putExtra(r10, r0)
            java.lang.String r10 = "DEBUG_MESSAGE"
            java.lang.String r0 = "An internal error occurred."
            r9.putExtra(r10, r0)
            goto L_0x00bf
        L_0x00bb:
            android.content.Intent r9 = r7.m32773b()
        L_0x00bf:
            if (r8 != r3) goto L_0x00c7
            java.lang.String r8 = "IS_FIRST_PARTY_PURCHASE"
            r10 = 1
            r9.putExtra(r8, r10)
        L_0x00c7:
            r7.sendBroadcast(r9)
        L_0x00ca:
            r7.f6820m = r2
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i;
        PendingIntent pendingIntent;
        int i2;
        super.onCreate(bundle);
        if (bundle == null) {
            C12844k.m5286l("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f6821n = true;
                    i2 = 110;
                    i = i2;
                }
                i = 100;
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f6818k = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                i = 100;
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f6819l = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i2 = 101;
                i = i2;
            } else {
                i = 100;
                pendingIntent = null;
            }
            try {
                this.f6820m = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                C12844k.m5284n("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.f6818k;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.f6819l;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent b = m32773b();
                        if (this.f6821n) {
                            b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        b.putExtra("RESPONSE_CODE", 6);
                        b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(b);
                    }
                }
                this.f6820m = false;
                finish();
            }
        } else {
            C12844k.m5286l("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f6820m = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f6818k = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f6819l = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f6821n = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f6820m) {
            Intent b = m32773b();
            b.putExtra("RESPONSE_CODE", 1);
            b.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(b);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f6818k;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f6819l;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f6820m);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f6821n);
    }
}
