package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.u0 */
/* loaded from: classes7.dex */
public final class C5255u0 {

    /* renamed from: a */
    private final Context f9549a;

    /* renamed from: b */
    private final Handler f9550b;

    /* renamed from: c */
    private final AbstractC5257b f9551c;

    /* renamed from: d */
    private final AudioManager f9552d;

    /* renamed from: e */
    private C5258c f9553e;

    /* renamed from: f */
    private int f9554f = 3;

    /* renamed from: g */
    private int f9555g;

    /* renamed from: h */
    private boolean f9556h;

    /* renamed from: com.google.android.exoplayer2.u0$b */
    /* loaded from: classes7.dex */
    public interface AbstractC5257b {
        /* renamed from: i */
        void mo29818i(int i);

        /* renamed from: m */
        void mo29817m(int i, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.u0$c */
    /* loaded from: classes7.dex */
    private final class C5258c extends BroadcastReceiver {
        private C5258c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = C5255u0.this.f9550b;
            final C5255u0 u0Var = C5255u0.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.v0
                @Override // java.lang.Runnable
                public final void run() {
                    C5255u0.m29826b(C5255u0.this);
                }
            });
        }
    }

    public C5255u0(Context context, Handler handler, AbstractC5257b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f9549a = applicationContext;
        this.f9550b = handler;
        this.f9551c = bVar;
        AudioManager audioManager = (AudioManager) C7510a.m22364h((AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f9552d = audioManager;
        this.f9555g = m29822f(audioManager, 3);
        this.f9556h = m29823e(audioManager, this.f9554f);
        C5258c cVar = new C5258c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f9553e = cVar;
        } catch (RuntimeException e) {
            C7558r.m22103i("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m29826b(C5255u0 u0Var) {
        u0Var.m29819i();
    }

    /* renamed from: e */
    private static boolean m29823e(AudioManager audioManager, int i) {
        if (C7557q0.f16368a >= 23) {
            return audioManager.isStreamMute(i);
        }
        if (m29822f(audioManager, i) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static int m29822f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            C7558r.m22103i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m29819i() {
        int f = m29822f(this.f9552d, this.f9554f);
        boolean e = m29823e(this.f9552d, this.f9554f);
        if (this.f9555g != f || this.f9556h != e) {
            this.f9555g = f;
            this.f9556h = e;
            this.f9551c.mo29817m(f, e);
        }
    }

    /* renamed from: c */
    public int m29825c() {
        return this.f9552d.getStreamMaxVolume(this.f9554f);
    }

    /* renamed from: d */
    public int m29824d() {
        int streamMinVolume;
        if (C7557q0.f16368a < 28) {
            return 0;
        }
        streamMinVolume = this.f9552d.getStreamMinVolume(this.f9554f);
        return streamMinVolume;
    }

    /* renamed from: g */
    public void m29821g() {
        C5258c cVar = this.f9553e;
        if (cVar != null) {
            try {
                this.f9549a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                C7558r.m22103i("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f9553e = null;
        }
    }

    /* renamed from: h */
    public void m29820h(int i) {
        if (this.f9554f != i) {
            this.f9554f = i;
            m29819i();
            this.f9551c.mo29818i(i);
        }
    }
}
