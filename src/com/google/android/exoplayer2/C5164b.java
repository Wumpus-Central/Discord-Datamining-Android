package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: com.google.android.exoplayer2.b */
/* loaded from: classes7.dex */
final class C5164b {

    /* renamed from: a */
    private final Context f9111a;

    /* renamed from: b */
    private final RunnableC5165a f9112b;

    /* renamed from: c */
    private boolean f9113c;

    /* renamed from: com.google.android.exoplayer2.b$a */
    /* loaded from: classes7.dex */
    private final class RunnableC5165a extends BroadcastReceiver implements Runnable {

        /* renamed from: k */
        private final AbstractC0139b f9114k;

        /* renamed from: l */
        private final Handler f9115l;

        public RunnableC5165a(Handler handler, AbstractC0139b bVar) {
            this.f9115l = handler;
            this.f9114k = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f9115l.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5164b.this.f9113c) {
                this.f9114k.mo30403b();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.b$b */
    /* loaded from: classes7.dex */
    public interface AbstractC0139b {
        /* renamed from: b */
        void mo30403b();
    }

    public C5164b(Context context, Handler handler, AbstractC0139b bVar) {
        this.f9111a = context.getApplicationContext();
        this.f9112b = new RunnableC5165a(handler, bVar);
    }

    /* renamed from: b */
    public void m30404b(boolean z) {
        if (z && !this.f9113c) {
            this.f9111a.registerReceiver(this.f9112b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f9113c = true;
        } else if (!z && this.f9113c) {
            this.f9111a.unregisterReceiver(this.f9112b);
            this.f9113c = false;
        }
    }
}
