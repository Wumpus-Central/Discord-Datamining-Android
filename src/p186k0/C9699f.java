package p186k0;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.core.C1915r1;
import androidx.camera.video.internal.encoder.AbstractC2044x0;
import androidx.core.util.C2517g;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p186k0.AbstractC9712j;
import p186k0.C9699f;
import p186k0.C9709i;
import p204l0.C10305c;
import p204l0.C10312j;
import p390w.AbstractC13568a2;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* renamed from: k0.f */
/* loaded from: classes.dex */
public final class C9699f {

    /* renamed from: n */
    public static final List<Integer> f21563n = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* renamed from: a */
    final Executor f21564a;

    /* renamed from: b */
    private AudioManager.AudioRecordingCallback f21565b;

    /* renamed from: d */
    final AudioRecord f21567d;

    /* renamed from: e */
    final int f21568e;

    /* renamed from: h */
    boolean f21571h;

    /* renamed from: i */
    Executor f21572i;

    /* renamed from: j */
    AbstractC9704e f21573j;

    /* renamed from: k */
    AbstractC9712j<AbstractC2044x0> f21574k;

    /* renamed from: l */
    private AbstractC14182c<AbstractC2044x0> f21575l;

    /* renamed from: m */
    private AbstractC13568a2.AbstractC13569a<AbstractC9712j.EnumC9713a> f21576m;

    /* renamed from: c */
    AtomicBoolean f21566c = new AtomicBoolean(false);

    /* renamed from: f */
    EnumC0295f f21569f = EnumC0295f.CONFIGURED;

    /* renamed from: g */
    AbstractC9712j.EnumC9713a f21570g = AbstractC9712j.EnumC9713a.INACTIVE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0.f$a */
    /* loaded from: classes.dex */
    public class C9700a implements AbstractC13568a2.AbstractC13569a<AbstractC9712j.EnumC9713a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC9712j f21577a;

        C9700a(AbstractC9712j jVar) {
            this.f21577a = jVar;
        }

        /* renamed from: b */
        public void mo3341a(AbstractC9712j.EnumC9713a aVar) {
            if (C9699f.this.f21574k == this.f21577a) {
                C1915r1.m39527a("AudioSource", "Receive BufferProvider state change: " + C9699f.this.f21570g + " to " + aVar);
                C9699f fVar = C9699f.this;
                fVar.f21570g = aVar;
                fVar.m15560y();
            }
        }

        @Override // p390w.AbstractC13568a2.AbstractC13569a
        public void onError(Throwable th2) {
            C9699f fVar = C9699f.this;
            if (fVar.f21574k == this.f21577a) {
                fVar.m15570o(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0.f$b */
    /* loaded from: classes.dex */
    public class C9701b implements AbstractC14182c<AbstractC2044x0> {

        /* renamed from: a */
        final /* synthetic */ AbstractC9712j f21579a;

        C9701b(AbstractC9712j jVar) {
            this.f21579a = jVar;
        }

        /* renamed from: b */
        public void mo1412a(AbstractC2044x0 x0Var) {
            C9699f fVar = C9699f.this;
            if (!fVar.f21571h || fVar.f21574k != this.f21579a) {
                x0Var.cancel();
                return;
            }
            ByteBuffer a = x0Var.mo39193a();
            C9699f fVar2 = C9699f.this;
            int read = fVar2.f21567d.read(a, fVar2.f21568e);
            if (read > 0) {
                a.limit(read);
                x0Var.mo39190d(C9699f.this.m15578g());
                x0Var.mo39191c();
            } else {
                C1915r1.m39517k("AudioSource", "Unable to read data from AudioRecord.");
                x0Var.cancel();
            }
            C9699f.this.m15567r();
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            if (C9699f.this.f21574k != this.f21579a) {
                C1915r1.m39527a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                C9699f.this.m15570o(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0.f$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C9702c {

        /* renamed from: a */
        static final /* synthetic */ int[] f21581a;

        static {
            int[] iArr = new int[EnumC0295f.values().length];
            f21581a = iArr;
            try {
                iArr[EnumC0295f.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21581a[EnumC0295f.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21581a[EnumC0295f.RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: k0.f$d */
    /* loaded from: classes.dex */
    class C9703d extends AudioManager.AudioRecordingCallback {
        C9703d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m15556b(boolean z) {
            C9699f.this.f21573j.mo15555a(z);
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            super.onRecordingConfigChanged(list);
            C9699f fVar = C9699f.this;
            if (!(fVar.f21572i == null || fVar.f21573j == null)) {
                for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                    if (C10305c.m13655a(audioRecordingConfiguration) == C9699f.this.f21567d.getAudioSessionId()) {
                        final boolean a = C10312j.m13647a(audioRecordingConfiguration);
                        if (C9699f.this.f21566c.getAndSet(a) != a) {
                            C9699f.this.f21572i.execute(new Runnable() { // from class: k0.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9699f.C9703d.this.m15556b(a);
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: k0.f$e */
    /* loaded from: classes.dex */
    public interface AbstractC9704e {
        /* renamed from: a */
        void mo15555a(boolean z);

        void onError(Throwable th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0.f$f */
    /* loaded from: classes.dex */
    public enum EnumC0295f {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    /* renamed from: k0.f$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9705g {

        /* renamed from: k0.f$g$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC9706a {
            /* renamed from: a */
            abstract AbstractC9705g mo15548a();

            /* renamed from: b */
            public final AbstractC9705g m15553b() {
                AbstractC9705g a = mo15548a();
                String str = "";
                if (a.mo15551c() == -1) {
                    str = str + " audioSource";
                }
                if (a.mo15549e() <= 0) {
                    str = str + " sampleRate";
                }
                if (a.mo15550d() <= 0) {
                    str = str + " channelCount";
                }
                if (a.mo15552b() == -1) {
                    str = str + " audioFormat";
                }
                if (str.isEmpty()) {
                    return a;
                }
                throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
            }

            /* renamed from: c */
            public abstract AbstractC9706a mo15547c(int i);

            /* renamed from: d */
            public abstract AbstractC9706a mo15546d(int i);

            /* renamed from: e */
            public abstract AbstractC9706a mo15545e(int i);

            /* renamed from: f */
            public abstract AbstractC9706a mo15544f(int i);
        }

        @SuppressLint({"Range"})
        /* renamed from: a */
        public static AbstractC9706a m15554a() {
            return new C9709i.C9711b().mo15546d(-1).mo15544f(-1).mo15545e(-1).mo15547c(-1);
        }

        /* renamed from: b */
        public abstract int mo15552b();

        /* renamed from: c */
        public abstract int mo15551c();

        /* renamed from: d */
        public abstract int mo15550d();

        /* renamed from: e */
        public abstract int mo15549e();
    }

    public C9699f(AbstractC9705g gVar, Executor executor) {
        boolean z = false;
        if (m15576i(gVar.mo15549e(), gVar.mo15550d(), gVar.mo15552b())) {
            int h = m15577h(gVar.mo15549e(), gVar.mo15550d(), gVar.mo15552b());
            C2517g.m37586i(h > 0 ? true : z);
            Executor g = C13905a.m2333g(executor);
            this.f21564a = g;
            int i = h * 2;
            this.f21568e = i;
            try {
                AudioRecord audioRecord = new AudioRecord(gVar.mo15551c(), gVar.mo15549e(), m15579f(gVar.mo15550d()), gVar.mo15552b(), i);
                this.f21567d = audioRecord;
                if (audioRecord.getState() != 1) {
                    audioRecord.release();
                    throw new C9708h("Unable to initialize AudioRecord");
                } else if (Build.VERSION.SDK_INT >= 29) {
                    C9703d dVar = new C9703d();
                    this.f21565b = dVar;
                    C10312j.m13646b(audioRecord, g, dVar);
                }
            } catch (IllegalArgumentException e) {
                throw new C9708h("Unable to create AudioRecord", e);
            }
        } else {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(gVar.mo15549e()), Integer.valueOf(gVar.mo15550d()), Integer.valueOf(gVar.mo15552b())));
        }
    }

    /* renamed from: f */
    private static int m15579f(int i) {
        return i == 1 ? 16 : 12;
    }

    /* renamed from: h */
    private static int m15577h(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, m15579f(i2), i3);
    }

    /* renamed from: i */
    public static boolean m15576i(int i, int i2, int i3) {
        return i > 0 && i2 > 0 && m15577h(i, i2, i3) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m15575j(Throwable th2) {
        this.f21573j.onError(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m15574k() {
        int i = C9702c.f21581a[this.f21569f.ordinal()];
        if (i == 1 || i == 2) {
            m15568q(null);
            if (Build.VERSION.SDK_INT >= 29) {
                C10312j.m13645c(this.f21567d, this.f21565b);
            }
            this.f21567d.release();
            m15561x();
            m15564u(EnumC0295f.RELEASED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m15573l(Executor executor, AbstractC9704e eVar) {
        int i = C9702c.f21581a[this.f21569f.ordinal()];
        if (i == 1) {
            this.f21572i = executor;
            this.f21573j = eVar;
        } else if (i == 2 || i == 3) {
            throw new IllegalStateException("The audio recording callback must be registered before the audio source is started.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m15572m(AbstractC9712j jVar) {
        int i = C9702c.f21581a[this.f21569f.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f21574k != jVar) {
                m15568q(jVar);
            }
        } else if (i == 3) {
            throw new IllegalStateException("AudioRecorder is released");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m15571n() {
        int i = C9702c.f21581a[this.f21569f.ordinal()];
        if (i == 1) {
            m15564u(EnumC0295f.STARTED);
            m15560y();
        } else if (i == 3) {
            throw new IllegalStateException("AudioRecorder is released");
        }
    }

    /* renamed from: q */
    private void m15568q(AbstractC9712j<AbstractC2044x0> jVar) {
        AbstractC9712j<AbstractC2044x0> jVar2 = this.f21574k;
        if (jVar2 != null) {
            jVar2.mo3076d(this.f21576m);
            this.f21574k = null;
            this.f21576m = null;
            this.f21575l = null;
        }
        this.f21570g = AbstractC9712j.EnumC9713a.INACTIVE;
        m15560y();
        if (jVar != null) {
            this.f21574k = jVar;
            this.f21576m = new C9700a(jVar);
            this.f21575l = new C9701b(jVar);
            this.f21574k.mo3078b(this.f21564a, this.f21576m);
        }
    }

    /* renamed from: w */
    private void m15562w() {
        if (!this.f21571h) {
            try {
                C1915r1.m39527a("AudioSource", "startSendingAudio");
                this.f21567d.startRecording();
                if (this.f21567d.getRecordingState() == 3) {
                    this.f21571h = true;
                    m15567r();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord with state: " + this.f21567d.getRecordingState());
            } catch (IllegalStateException e) {
                C1915r1.m39516l("AudioSource", "Failed to start AudioRecord", e);
                m15564u(EnumC0295f.CONFIGURED);
                m15570o(new C9708h("Unable to start the audio record.", e));
            }
        }
    }

    /* renamed from: x */
    private void m15561x() {
        if (this.f21571h) {
            this.f21571h = false;
            try {
                C1915r1.m39527a("AudioSource", "stopSendingAudio");
                this.f21567d.stop();
                if (this.f21567d.getRecordingState() != 1) {
                    throw new IllegalStateException("Unable to stop AudioRecord with state: " + this.f21567d.getRecordingState());
                }
            } catch (IllegalStateException e) {
                C1915r1.m39516l("AudioSource", "Failed to stop AudioRecord", e);
                m15570o(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    long m15578g() {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = -1
            if (r0 < r1) goto L_0x0026
            android.media.AudioTimestamp r0 = new android.media.AudioTimestamp
            r0.<init>()
            android.media.AudioRecord r1 = r6.f21567d
            r4 = 0
            int r1 = p204l0.C10305c.m13654b(r1, r0, r4)
            if (r1 != 0) goto L_0x001f
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = r0.nanoTime
            long r0 = r1.toMicros(r4)
            goto L_0x0027
        L_0x001f:
            java.lang.String r0 = "AudioSource"
            java.lang.String r1 = "Unable to get audio timestamp"
            androidx.camera.core.C1915r1.m39517k(r0, r1)
        L_0x0026:
            r0 = r2
        L_0x0027:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0035
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            long r0 = r0.toMicros(r1)
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p186k0.C9699f.m15578g():long");
    }

    /* renamed from: o */
    void m15570o(final Throwable th2) {
        Executor executor = this.f21572i;
        if (executor != null && this.f21573j != null) {
            executor.execute(new Runnable() { // from class: k0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C9699f.this.m15575j(th2);
                }
            });
        }
    }

    /* renamed from: p */
    public void m15569p() {
        this.f21564a.execute(new Runnable() { // from class: k0.e
            @Override // java.lang.Runnable
            public final void run() {
                C9699f.this.m15574k();
            }
        });
    }

    /* renamed from: r */
    void m15567r() {
        C14186f.m1427b(this.f21574k.mo15543e(), this.f21575l, this.f21564a);
    }

    /* renamed from: s */
    public void m15566s(final Executor executor, final AbstractC9704e eVar) {
        this.f21564a.execute(new Runnable() { // from class: k0.a
            @Override // java.lang.Runnable
            public final void run() {
                C9699f.this.m15573l(executor, eVar);
            }
        });
    }

    /* renamed from: t */
    public void m15565t(final AbstractC9712j<AbstractC2044x0> jVar) {
        this.f21564a.execute(new Runnable() { // from class: k0.c
            @Override // java.lang.Runnable
            public final void run() {
                C9699f.this.m15572m(jVar);
            }
        });
    }

    /* renamed from: u */
    void m15564u(EnumC0295f fVar) {
        C1915r1.m39527a("AudioSource", "Transitioning internal state: " + this.f21569f + " --> " + fVar);
        this.f21569f = fVar;
    }

    /* renamed from: v */
    public void m15563v() {
        this.f21564a.execute(new Runnable() { // from class: k0.b
            @Override // java.lang.Runnable
            public final void run() {
                C9699f.this.m15571n();
            }
        });
    }

    /* renamed from: y */
    void m15560y() {
        if (this.f21569f == EnumC0295f.STARTED && this.f21570g == AbstractC9712j.EnumC9713a.ACTIVE) {
            m15562w();
        } else {
            m15561x();
        }
    }
}
