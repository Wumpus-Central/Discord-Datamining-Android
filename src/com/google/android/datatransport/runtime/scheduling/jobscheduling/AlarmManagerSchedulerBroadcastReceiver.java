package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p060d7.C6400a;
import p315r6.AbstractC12430o;
import p315r6.C12436t;

/* loaded from: classes7.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m30564b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C12436t.m6781f(context);
        AbstractC12430o.AbstractC12431a d = AbstractC12430o.m6802a().mo6795b(queryParameter).mo6793d(C6400a.m25617b(intValue));
        if (queryParameter2 != null) {
            d.mo6794c(Base64.decode(queryParameter2, 0));
        }
        C12436t.m6784c().m6782e().m200v(d.mo6796a(), i, new Runnable() { // from class: z6.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m30564b();
            }
        });
    }
}
