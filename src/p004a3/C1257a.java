package p004a3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: a3.a */
/* loaded from: classes.dex */
public class C1257a extends BroadcastReceiver {

    /* renamed from: a */
    private final Context f119a;

    /* renamed from: b */
    private AbstractC1258b f120b = AbstractC1258b.f121a;

    public C1257a(Context context) {
        this.f119a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m41518a() {
        this.f120b = AbstractC1258b.f121a;
        try {
            this.f119a.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void m41517b(AbstractC1258b bVar) {
        this.f120b = bVar;
        this.f119a.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f120b.mo32585b();
        }
    }
}
