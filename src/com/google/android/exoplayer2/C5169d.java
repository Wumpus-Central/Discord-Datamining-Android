package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.C5169d;
import org.webrtc.MediaStreamTrack;
import p117g7.C7445e;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.d */
/* loaded from: classes7.dex */
public final class C5169d {

    /* renamed from: a */
    private final AudioManager f9121a;

    /* renamed from: b */
    private final C5170a f9122b;

    /* renamed from: c */
    private AbstractC5171b f9123c;

    /* renamed from: d */
    private C7445e f9124d;

    /* renamed from: f */
    private int f9126f;

    /* renamed from: h */
    private AudioFocusRequest f9128h;

    /* renamed from: i */
    private boolean f9129i;

    /* renamed from: g */
    private float f9127g = 1.0f;

    /* renamed from: e */
    private int f9125e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.d$a */
    /* loaded from: classes7.dex */
    public class C5170a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: k */
        private final Handler f9130k;

        public C5170a(Handler handler) {
            this.f9130k = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m30384b(int i) {
            C5169d.this.m30395h(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f9130k.post(new Runnable() { // from class: com.google.android.exoplayer2.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5169d.C5170a.this.m30384b(i);
                }
            });
        }
    }

    /* renamed from: com.google.android.exoplayer2.d$b */
    /* loaded from: classes7.dex */
    public interface AbstractC5171b {
        /* renamed from: p */
        void mo30383p(float f);

        /* renamed from: r */
        void mo30382r(int i);
    }

    public C5169d(Context context, Handler handler, AbstractC5171b bVar) {
        this.f9121a = (AudioManager) C7510a.m22367e((AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f9123c = bVar;
        this.f9122b = new C5170a(handler);
    }

    /* renamed from: a */
    private void m30402a() {
        if (this.f9125e != 0) {
            if (C7557q0.f16368a >= 26) {
                m30400c();
            } else {
                m30401b();
            }
            m30389n(0);
        }
    }

    /* renamed from: b */
    private void m30401b() {
        this.f9121a.abandonAudioFocus(this.f9122b);
    }

    /* renamed from: c */
    private void m30400c() {
        AudioFocusRequest audioFocusRequest = this.f9128h;
        if (audioFocusRequest != null) {
            this.f9121a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private static int m30398e(C7445e eVar) {
        if (eVar == null) {
            return 0;
        }
        switch (eVar.f16071c) {
            case 0:
                C7558r.m22104h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (eVar.f16069a == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                C7558r.m22104h("AudioFocusManager", "Unidentified audio usage: " + eVar.f16071c);
                return 0;
            case 16:
                if (C7557q0.f16368a >= 19) {
                    return 4;
                }
                return 2;
        }
        return 3;
    }

    /* renamed from: f */
    private void m30397f(int i) {
        AbstractC5171b bVar = this.f9123c;
        if (bVar != null) {
            bVar.mo30382r(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m30395h(int i) {
        if (i == -3 || i == -2) {
            if (i == -2 || m30386q()) {
                m30397f(0);
                m30389n(2);
                return;
            }
            m30389n(3);
        } else if (i == -1) {
            m30397f(-1);
            m30402a();
        } else if (i != 1) {
            C7558r.m22104h("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            m30389n(1);
            m30397f(1);
        }
    }

    /* renamed from: j */
    private int m30393j() {
        int i;
        if (this.f9125e == 1) {
            return 1;
        }
        if (C7557q0.f16368a >= 26) {
            i = m30391l();
        } else {
            i = m30392k();
        }
        if (i == 1) {
            m30389n(1);
            return 1;
        }
        m30389n(0);
        return -1;
    }

    /* renamed from: k */
    private int m30392k() {
        return this.f9121a.requestAudioFocus(this.f9122b, C7557q0.m22154e0(((C7445e) C7510a.m22367e(this.f9124d)).f16071c), this.f9126f);
    }

    /* renamed from: l */
    private int m30391l() {
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        AudioFocusRequest audioFocusRequest = this.f9128h;
        if (audioFocusRequest == null || this.f9129i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f9126f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f9128h);
            }
            boolean q = m30386q();
            audioAttributes = builder.setAudioAttributes(((C7445e) C7510a.m22367e(this.f9124d)).m22606a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(q);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f9122b);
            build = onAudioFocusChangeListener.build();
            this.f9128h = build;
            this.f9129i = false;
        }
        requestAudioFocus = this.f9121a.requestAudioFocus(this.f9128h);
        return requestAudioFocus;
    }

    /* renamed from: n */
    private void m30389n(int i) {
        float f;
        if (this.f9125e != i) {
            this.f9125e = i;
            if (i == 3) {
                f = 0.2f;
            } else {
                f = 1.0f;
            }
            if (this.f9127g != f) {
                this.f9127g = f;
                AbstractC5171b bVar = this.f9123c;
                if (bVar != null) {
                    bVar.mo30383p(f);
                }
            }
        }
    }

    /* renamed from: o */
    private boolean m30388o(int i) {
        return i == 1 || this.f9126f != 1;
    }

    /* renamed from: q */
    private boolean m30386q() {
        C7445e eVar = this.f9124d;
        return eVar != null && eVar.f16069a == 1;
    }

    /* renamed from: g */
    public float m30396g() {
        return this.f9127g;
    }

    /* renamed from: i */
    public void m30394i() {
        this.f9123c = null;
        m30402a();
    }

    /* renamed from: m */
    public void m30390m(C7445e eVar) {
        if (!C7557q0.m22159c(this.f9124d, eVar)) {
            this.f9124d = eVar;
            int e = m30398e(eVar);
            this.f9126f = e;
            boolean z = true;
            if (!(e == 1 || e == 0)) {
                z = false;
            }
            C7510a.m22370b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    /* renamed from: p */
    public int m30387p(boolean z, int i) {
        if (m30388o(i)) {
            m30402a();
            if (z) {
                return 1;
            }
            return -1;
        } else if (z) {
            return m30393j();
        } else {
            return -1;
        }
    }
}
