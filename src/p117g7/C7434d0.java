package p117g7;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import p079e7.C6722k;
import p117g7.AbstractC7453h;
import p117g7.AbstractC7481s;
import p117g7.C7489u;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;
import p163j$.util.Spliterator;

/* renamed from: g7.d0 */
/* loaded from: classes7.dex */
public final class C7434d0 implements AbstractC7481s {

    /* renamed from: a0 */
    public static boolean f16014a0 = false;

    /* renamed from: A */
    private long f38331A;

    /* renamed from: B */
    private long f38332B;

    /* renamed from: C */
    private long f38333C;

    /* renamed from: D */
    private int f38334D;

    /* renamed from: E */
    private boolean f38335E;

    /* renamed from: F */
    private boolean f38336F;

    /* renamed from: G */
    private long f38337G;

    /* renamed from: H */
    private float f38338H;

    /* renamed from: I */
    private AbstractC7453h[] f38339I;

    /* renamed from: J */
    private ByteBuffer[] f38340J;

    /* renamed from: K */
    private ByteBuffer f38341K;

    /* renamed from: L */
    private int f38342L;

    /* renamed from: M */
    private ByteBuffer f38343M;

    /* renamed from: N */
    private byte[] f38344N;

    /* renamed from: O */
    private int f38345O;

    /* renamed from: P */
    private int f38346P;

    /* renamed from: Q */
    private boolean f38347Q;

    /* renamed from: R */
    private boolean f38348R;

    /* renamed from: S */
    private boolean f38349S;

    /* renamed from: T */
    private boolean f38350T;

    /* renamed from: U */
    private int f38351U;

    /* renamed from: V */
    private C7491v f38352V;

    /* renamed from: W */
    private boolean f38353W;

    /* renamed from: X */
    private long f38354X;

    /* renamed from: Y */
    private boolean f38355Y;

    /* renamed from: Z */
    private boolean f38356Z;

    /* renamed from: a */
    private final C7449f f16015a;

    /* renamed from: b */
    private final AbstractC7436b f16016b;

    /* renamed from: c */
    private final boolean f16017c;

    /* renamed from: d */
    private final C7493x f16018d;

    /* renamed from: e */
    private final C7480r0 f16019e;

    /* renamed from: f */
    private final AbstractC7453h[] f16020f;

    /* renamed from: g */
    private final AbstractC7453h[] f16021g;

    /* renamed from: h */
    private final ConditionVariable f16022h;

    /* renamed from: i */
    private final C7489u f16023i;

    /* renamed from: j */
    private final ArrayDeque<C7440f> f16024j;

    /* renamed from: k */
    private final boolean f16025k;

    /* renamed from: l */
    private final boolean f16026l;

    /* renamed from: m */
    private C7443i f16027m;

    /* renamed from: n */
    private final C7441g<AbstractC7481s.C7483b> f16028n;

    /* renamed from: o */
    private final C7441g<AbstractC7481s.C7485d> f16029o;

    /* renamed from: p */
    private AbstractC7481s.AbstractC7484c f16030p;

    /* renamed from: q */
    private C7437c f16031q;

    /* renamed from: r */
    private C7437c f16032r;

    /* renamed from: s */
    private AudioTrack f16033s;

    /* renamed from: t */
    private C7445e f16034t;

    /* renamed from: u */
    private C7440f f16035u;

    /* renamed from: v */
    private C7440f f16036v;

    /* renamed from: w */
    private PlaybackParameters f16037w;

    /* renamed from: x */
    private ByteBuffer f16038x;

    /* renamed from: y */
    private int f16039y;

    /* renamed from: z */
    private long f16040z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g7.d0$a */
    /* loaded from: classes7.dex */
    public class C7435a extends Thread {

        /* renamed from: k */
        final /* synthetic */ AudioTrack f16041k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7435a(String str, AudioTrack audioTrack) {
            super(str);
            this.f16041k = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f16041k.flush();
                this.f16041k.release();
            } finally {
                C7434d0.this.f16022h.open();
            }
        }
    }

    /* renamed from: g7.d0$b */
    /* loaded from: classes7.dex */
    public interface AbstractC7436b {
        /* renamed from: a */
        long mo22615a(long j);

        /* renamed from: b */
        AbstractC7453h[] mo22614b();

        /* renamed from: c */
        PlaybackParameters mo22613c(PlaybackParameters playbackParameters);

        /* renamed from: d */
        long mo22612d();

        /* renamed from: e */
        boolean mo22611e(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.d0$c */
    /* loaded from: classes7.dex */
    public static final class C7437c {

        /* renamed from: a */
        public final C6722k f16043a;

        /* renamed from: b */
        public final int f16044b;

        /* renamed from: c */
        public final int f16045c;

        /* renamed from: d */
        public final int f16046d;

        /* renamed from: e */
        public final int f16047e;

        /* renamed from: f */
        public final int f16048f;

        /* renamed from: g */
        public final int f16049g;

        /* renamed from: h */
        public final int f16050h;

        /* renamed from: i */
        public final AbstractC7453h[] f16051i;

        public C7437c(C6722k kVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, AbstractC7453h[] hVarArr) {
            this.f16043a = kVar;
            this.f16044b = i;
            this.f16045c = i2;
            this.f16046d = i3;
            this.f16047e = i4;
            this.f16048f = i5;
            this.f16049g = i6;
            this.f16051i = hVarArr;
            this.f16050h = m22628c(i7, z);
        }

        /* renamed from: c */
        private int m22628c(int i, boolean z) {
            float f;
            if (i != 0) {
                return i;
            }
            int i2 = this.f16045c;
            if (i2 == 0) {
                if (z) {
                    f = 8.0f;
                } else {
                    f = 1.0f;
                }
                return m22618m(f);
            } else if (i2 == 1) {
                return m22619l(50000000L);
            } else {
                if (i2 == 2) {
                    return m22619l(250000L);
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: d */
        private AudioTrack m22627d(boolean z, C7445e eVar, int i) {
            int i2 = C7557q0.f16368a;
            if (i2 >= 29) {
                return m22625f(z, eVar, i);
            }
            if (i2 >= 21) {
                return m22626e(z, eVar, i);
            }
            return m22624g(eVar, i);
        }

        /* renamed from: e */
        private AudioTrack m22626e(boolean z, C7445e eVar, int i) {
            return new AudioTrack(m22621j(eVar, z), C7434d0.m22668L(this.f16047e, this.f16048f, this.f16049g), this.f16050h, 1, i);
        }

        /* renamed from: f */
        private AudioTrack m22625f(boolean z, C7445e eVar, int i) {
            AudioTrack.Builder offloadedPlayback;
            AudioFormat L = C7434d0.m22668L(this.f16047e, this.f16048f, this.f16049g);
            AudioAttributes j = m22621j(eVar, z);
            boolean z2 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(j).setAudioFormat(L).setTransferMode(1).setBufferSizeInBytes(this.f16050h).setSessionId(i);
            if (this.f16045c != 1) {
                z2 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z2);
            return offloadedPlayback.build();
        }

        /* renamed from: g */
        private AudioTrack m22624g(C7445e eVar, int i) {
            int e0 = C7557q0.m22154e0(eVar.f16071c);
            if (i == 0) {
                return new AudioTrack(e0, this.f16047e, this.f16048f, this.f16049g, this.f16050h, 1);
            }
            return new AudioTrack(e0, this.f16047e, this.f16048f, this.f16049g, this.f16050h, 1, i);
        }

        /* renamed from: j */
        private static AudioAttributes m22621j(C7445e eVar, boolean z) {
            if (z) {
                return m22620k();
            }
            return eVar.m22606a();
        }

        /* renamed from: k */
        private static AudioAttributes m22620k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: l */
        private int m22619l(long j) {
            int R = C7434d0.m22662R(this.f16049g);
            if (this.f16049g == 5) {
                R *= 2;
            }
            return (int) ((j * R) / 1000000);
        }

        /* renamed from: m */
        private int m22618m(float f) {
            boolean z;
            int minBufferSize = AudioTrack.getMinBufferSize(this.f16047e, this.f16048f, this.f16049g);
            if (minBufferSize != -2) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z);
            int r = C7557q0.m22129r(minBufferSize * 4, ((int) m22623h(250000L)) * this.f16046d, Math.max(minBufferSize, ((int) m22623h(750000L)) * this.f16046d));
            if (f != 1.0f) {
                return Math.round(r * f);
            }
            return r;
        }

        /* renamed from: a */
        public AudioTrack m22630a(boolean z, C7445e eVar, int i) {
            try {
                AudioTrack d = m22627d(z, eVar, i);
                int state = d.getState();
                if (state == 1) {
                    return d;
                }
                try {
                    d.release();
                } catch (Exception unused) {
                }
                throw new AbstractC7481s.C7483b(state, this.f16047e, this.f16048f, this.f16050h, this.f16043a, m22616o(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AbstractC7481s.C7483b(0, this.f16047e, this.f16048f, this.f16050h, this.f16043a, m22616o(), e);
            }
        }

        /* renamed from: b */
        public boolean m22629b(C7437c cVar) {
            return cVar.f16045c == this.f16045c && cVar.f16049g == this.f16049g && cVar.f16047e == this.f16047e && cVar.f16048f == this.f16048f && cVar.f16046d == this.f16046d;
        }

        /* renamed from: h */
        public long m22623h(long j) {
            return (j * this.f16047e) / 1000000;
        }

        /* renamed from: i */
        public long m22622i(long j) {
            return (j * 1000000) / this.f16047e;
        }

        /* renamed from: n */
        public long m22617n(long j) {
            return (j * 1000000) / this.f16043a.f37970J;
        }

        /* renamed from: o */
        public boolean m22616o() {
            return this.f16045c == 1;
        }
    }

    /* renamed from: g7.d0$d */
    /* loaded from: classes7.dex */
    public static class C7438d implements AbstractC7436b {

        /* renamed from: a */
        private final AbstractC7453h[] f16052a;

        /* renamed from: b */
        private final C7473o0 f16053b;

        /* renamed from: c */
        private final C7477q0 f16054c;

        public C7438d(AbstractC7453h... hVarArr) {
            this(hVarArr, new C7473o0(), new C7477q0());
        }

        @Override // p117g7.C7434d0.AbstractC7436b
        /* renamed from: a */
        public long mo22615a(long j) {
            return this.f16054c.m22523a(j);
        }

        @Override // p117g7.C7434d0.AbstractC7436b
        /* renamed from: b */
        public AbstractC7453h[] mo22614b() {
            return this.f16052a;
        }

        @Override // p117g7.C7434d0.AbstractC7436b
        /* renamed from: c */
        public PlaybackParameters mo22613c(PlaybackParameters playbackParameters) {
            this.f16054c.m22521i(playbackParameters.f9029a);
            this.f16054c.m22522h(playbackParameters.f9030b);
            return playbackParameters;
        }

        @Override // p117g7.C7434d0.AbstractC7436b
        /* renamed from: d */
        public long mo22612d() {
            return this.f16053b.m22554p();
        }

        @Override // p117g7.C7434d0.AbstractC7436b
        /* renamed from: e */
        public boolean mo22611e(boolean z) {
            this.f16053b.m22548v(z);
            return z;
        }

        public C7438d(AbstractC7453h[] hVarArr, C7473o0 o0Var, C7477q0 q0Var) {
            AbstractC7453h[] hVarArr2 = new AbstractC7453h[hVarArr.length + 2];
            this.f16052a = hVarArr2;
            System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
            this.f16053b = o0Var;
            this.f16054c = q0Var;
            hVarArr2[hVarArr.length] = o0Var;
            hVarArr2[hVarArr.length + 1] = q0Var;
        }
    }

    /* renamed from: g7.d0$e */
    /* loaded from: classes7.dex */
    public static final class C7439e extends RuntimeException {
        /* synthetic */ C7439e(String str, C7435a aVar) {
            this(str);
        }

        private C7439e(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.d0$f */
    /* loaded from: classes7.dex */
    public static final class C7440f {

        /* renamed from: a */
        public final PlaybackParameters f16055a;

        /* renamed from: b */
        public final boolean f16056b;

        /* renamed from: c */
        public final long f16057c;

        /* renamed from: d */
        public final long f16058d;

        /* synthetic */ C7440f(PlaybackParameters playbackParameters, boolean z, long j, long j2, C7435a aVar) {
            this(playbackParameters, z, j, j2);
        }

        private C7440f(PlaybackParameters playbackParameters, boolean z, long j, long j2) {
            this.f16055a = playbackParameters;
            this.f16056b = z;
            this.f16057c = j;
            this.f16058d = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.d0$g */
    /* loaded from: classes7.dex */
    public static final class C7441g<T extends Exception> {

        /* renamed from: a */
        private final long f16059a;

        /* renamed from: b */
        private T f16060b;

        /* renamed from: c */
        private long f16061c;

        public C7441g(long j) {
            this.f16059a = j;
        }

        /* renamed from: a */
        public void m22610a() {
            this.f16060b = null;
        }

        /* renamed from: b */
        public void m22609b(T t) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f16060b == null) {
                this.f16060b = t;
                this.f16061c = this.f16059a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f16061c) {
                T t2 = this.f16060b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f16060b;
                m22610a();
                throw t3;
            }
        }
    }

    /* renamed from: g7.d0$h */
    /* loaded from: classes7.dex */
    private final class C7442h implements C7489u.AbstractC7490a {
        private C7442h() {
        }

        @Override // p117g7.C7489u.AbstractC7490a
        /* renamed from: a */
        public void mo22418a(int i, long j) {
            if (C7434d0.this.f16030p != null) {
                C7434d0.this.f16030p.mo22455e(i, j, SystemClock.elapsedRealtime() - C7434d0.this.f38354X);
            }
        }

        @Override // p117g7.C7489u.AbstractC7490a
        /* renamed from: b */
        public void mo22417b(long j) {
            if (C7434d0.this.f16030p != null) {
                C7434d0.this.f16030p.mo22458b(j);
            }
        }

        @Override // p117g7.C7489u.AbstractC7490a
        /* renamed from: c */
        public void mo22416c(long j) {
            C7558r.m22104h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // p117g7.C7489u.AbstractC7490a
        /* renamed from: d */
        public void mo22415d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C7434d0.this.m22659U() + ", " + C7434d0.this.m22658V();
            if (!C7434d0.f16014a0) {
                C7558r.m22104h("DefaultAudioSink", str);
                return;
            }
            throw new C7439e(str, null);
        }

        @Override // p117g7.C7489u.AbstractC7490a
        /* renamed from: e */
        public void mo22414e(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C7434d0.this.m22659U() + ", " + C7434d0.this.m22658V();
            if (!C7434d0.f16014a0) {
                C7558r.m22104h("DefaultAudioSink", str);
                return;
            }
            throw new C7439e(str, null);
        }

        /* synthetic */ C7442h(C7434d0 d0Var, C7435a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.d0$i */
    /* loaded from: classes7.dex */
    public final class C7443i {

        /* renamed from: a */
        private final Handler f16063a = new Handler();

        /* renamed from: b */
        private final AudioTrack.StreamEventCallback f16064b;

        /* renamed from: g7.d0$i$a */
        /* loaded from: classes7.dex */
        class C7444a extends AudioTrack.StreamEventCallback {

            /* renamed from: a */
            final /* synthetic */ C7434d0 f16066a;

            C7444a(C7434d0 d0Var) {
                this.f16066a = d0Var;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i) {
                boolean z;
                if (audioTrack == C7434d0.this.f16033s) {
                    z = true;
                } else {
                    z = false;
                }
                C7510a.m22366f(z);
                if (C7434d0.this.f16030p != null && C7434d0.this.f38349S) {
                    C7434d0.this.f16030p.mo22453g();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                boolean z;
                if (audioTrack == C7434d0.this.f16033s) {
                    z = true;
                } else {
                    z = false;
                }
                C7510a.m22366f(z);
                if (C7434d0.this.f16030p != null && C7434d0.this.f38349S) {
                    C7434d0.this.f16030p.mo22453g();
                }
            }
        }

        public C7443i() {
            this.f16064b = new C7444a(C7434d0.this);
        }

        /* renamed from: a */
        public void m22608a(AudioTrack audioTrack) {
            final Handler handler = this.f16063a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: g7.h0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f16064b);
        }

        /* renamed from: b */
        public void m22607b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f16064b);
            this.f16063a.removeCallbacksAndMessages(null);
        }
    }

    public C7434d0(C7449f fVar, AbstractC7436b bVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        this.f16015a = fVar;
        this.f16016b = (AbstractC7436b) C7510a.m22367e(bVar);
        int i = C7557q0.f16368a;
        if (i < 21 || !z) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f16017c = z4;
        if (i < 23 || !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.f16025k = z5;
        if (i < 29 || !z3) {
            z6 = false;
        } else {
            z6 = true;
        }
        this.f16026l = z6;
        this.f16022h = new ConditionVariable(true);
        this.f16023i = new C7489u(new C7442h(this, null));
        C7493x xVar = new C7493x();
        this.f16018d = xVar;
        C7480r0 r0Var = new C7480r0();
        this.f16019e = r0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C7471n0(), xVar, r0Var);
        Collections.addAll(arrayList, bVar.mo22614b());
        this.f16020f = (AbstractC7453h[]) arrayList.toArray(new AbstractC7453h[0]);
        this.f16021g = new AbstractC7453h[]{new C7460j0()};
        this.f38338H = 1.0f;
        this.f16034t = C7445e.f16068f;
        this.f38351U = 0;
        this.f38352V = new C7491v(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.f9028d;
        this.f16036v = new C7440f(playbackParameters, false, 0L, 0L, null);
        this.f16037w = playbackParameters;
        this.f38346P = -1;
        this.f38339I = new AbstractC7453h[0];
        this.f38340J = new ByteBuffer[0];
        this.f16024j = new ArrayDeque<>();
        this.f16028n = new C7441g<>(100L);
        this.f16029o = new C7441g<>(100L);
    }

    /* renamed from: F */
    private void m22674F(long j) {
        PlaybackParameters playbackParameters;
        boolean z;
        if (m22637o0()) {
            playbackParameters = this.f16016b.mo22613c(m22667M());
        } else {
            playbackParameters = PlaybackParameters.f9028d;
        }
        if (m22637o0()) {
            z = this.f16016b.mo22611e(m22660T());
        } else {
            z = false;
        }
        this.f16024j.add(new C7440f(playbackParameters, z, Math.max(0L, j), this.f16032r.m22622i(m22658V()), null));
        m22638n0();
        AbstractC7481s.AbstractC7484c cVar = this.f16030p;
        if (cVar != null) {
            cVar.mo22459a(z);
        }
    }

    /* renamed from: G */
    private long m22673G(long j) {
        while (!this.f16024j.isEmpty() && j >= this.f16024j.getFirst().f16058d) {
            this.f16036v = this.f16024j.remove();
        }
        C7440f fVar = this.f16036v;
        long j2 = j - fVar.f16058d;
        if (fVar.f16055a.equals(PlaybackParameters.f9028d)) {
            return this.f16036v.f16057c + j2;
        }
        if (this.f16024j.isEmpty()) {
            return this.f16036v.f16057c + this.f16016b.mo22615a(j2);
        }
        C7440f first = this.f16024j.getFirst();
        return first.f16057c - C7557q0.m22171W(first.f16058d - j, this.f16036v.f16055a.f9029a);
    }

    /* renamed from: H */
    private long m22672H(long j) {
        return j + this.f16032r.m22622i(this.f16016b.mo22612d());
    }

    /* renamed from: I */
    private AudioTrack m22671I() {
        try {
            return ((C7437c) C7510a.m22367e(this.f16032r)).m22630a(this.f38353W, this.f16034t, this.f38351U);
        } catch (AbstractC7481s.C7483b e) {
            m22649d0();
            AbstractC7481s.AbstractC7484c cVar = this.f16030p;
            if (cVar != null) {
                cVar.mo22457c(e);
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m22670J() {
        /*
            r9 = this;
            int r0 = r9.f38346P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L_0x000b
            r9.f38346P = r2
        L_0x0009:
            r0 = r1
            goto L_0x000c
        L_0x000b:
            r0 = r2
        L_0x000c:
            int r4 = r9.f38346P
            g7.h[] r5 = r9.f38339I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo22408g()
        L_0x001f:
            r9.m22646f0(r7)
            boolean r0 = r4.mo22411c()
            if (r0 != 0) goto L_0x0029
            return r2
        L_0x0029:
            int r0 = r9.f38346P
            int r0 = r0 + r1
            r9.f38346P = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f38343M
            if (r0 == 0) goto L_0x003b
            r9.m22635q0(r0, r7)
            java.nio.ByteBuffer r0 = r9.f38343M
            if (r0 == 0) goto L_0x003b
            return r2
        L_0x003b:
            r9.f38346P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p117g7.C7434d0.m22670J():boolean");
    }

    /* renamed from: K */
    private void m22669K() {
        int i = 0;
        while (true) {
            AbstractC7453h[] hVarArr = this.f38339I;
            if (i < hVarArr.length) {
                AbstractC7453h hVar = hVarArr[i];
                hVar.flush();
                this.f38340J[i] = hVar.mo22410d();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static AudioFormat m22668L(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* renamed from: M */
    private PlaybackParameters m22667M() {
        return m22661S().f16055a;
    }

    /* renamed from: N */
    private static int m22666N(int i) {
        int i2 = C7557q0.f16368a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(C7557q0.f16369b) && i == 1) {
            i = 2;
        }
        return C7557q0.m22203G(i);
    }

    /* renamed from: O */
    private static Pair<Integer, Integer> m22665O(C6722k kVar, C7449f fVar) {
        boolean z;
        if (fVar == null) {
            return null;
        }
        int f = C7562u.m22082f((String) C7510a.m22367e(kVar.f14329v), kVar.f14326s);
        int i = 6;
        if (f == 5 || f == 6 || f == 18 || f == 17 || f == 7 || f == 8 || f == 14) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        if (f == 18 && !fVar.m22599e(18)) {
            f = 6;
        } else if (f == 8 && !fVar.m22599e(8)) {
            f = 7;
        }
        if (!fVar.m22599e(f)) {
            return null;
        }
        if (f != 18) {
            i = kVar.f37969I;
            if (i > fVar.m22600d()) {
                return null;
            }
        } else if (C7557q0.f16368a >= 29 && (i = m22663Q(18, kVar.f37970J)) == 0) {
            C7558r.m22104h("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int N = m22666N(i);
        if (N == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f), Integer.valueOf(N));
    }

    /* renamed from: P */
    private static int m22664P(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return C7426b.m22694d(byteBuffer);
            case 7:
            case 8:
                return C7458i0.m22590e(byteBuffer);
            case 9:
                int m = C7466l0.m22564m(C7557q0.m22201H(byteBuffer, byteBuffer.position()));
                if (m != -1) {
                    return m;
                }
                throw new IllegalArgumentException();
            case 10:
                return Spliterator.IMMUTABLE;
            case 11:
            case 12:
                return RecyclerView.ItemAnimator.FLAG_MOVED;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i);
            case 14:
                int a = C7426b.m22697a(byteBuffer);
                if (a == -1) {
                    return 0;
                }
                return C7426b.m22690h(byteBuffer, a) * 16;
            case 15:
                return 512;
            case 16:
                return Spliterator.IMMUTABLE;
            case 17:
                return C7429c.m22685c(byteBuffer);
        }
    }

    /* renamed from: Q */
    private static int m22663Q(int i, int i2) {
        boolean isDirectPlaybackSupported;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i3 = 8; i3 > 0; i3--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(C7557q0.m22203G(i3)).build(), build);
            if (isDirectPlaybackSupported) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static int m22662R(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    /* renamed from: S */
    private C7440f m22661S() {
        C7440f fVar = this.f16035u;
        if (fVar != null) {
            return fVar;
        }
        if (!this.f16024j.isEmpty()) {
            return this.f16024j.getLast();
        }
        return this.f16036v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public long m22659U() {
        C7437c cVar = this.f16032r;
        if (cVar.f16045c == 0) {
            return this.f16040z / cVar.f16044b;
        }
        return this.f38331A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public long m22658V() {
        C7437c cVar = this.f16032r;
        if (cVar.f16045c == 0) {
            return this.f38332B / cVar.f16046d;
        }
        return this.f38333C;
    }

    /* renamed from: W */
    private void m22657W() {
        boolean z;
        this.f16022h.block();
        AudioTrack I = m22671I();
        this.f16033s = I;
        if (m22653a0(I)) {
            m22645g0(this.f16033s);
            AudioTrack audioTrack = this.f16033s;
            C6722k kVar = this.f16032r.f16043a;
            audioTrack.setOffloadDelayPadding(kVar.f37972L, kVar.f37973M);
        }
        this.f38351U = this.f16033s.getAudioSessionId();
        C7489u uVar = this.f16023i;
        AudioTrack audioTrack2 = this.f16033s;
        C7437c cVar = this.f16032r;
        if (cVar.f16045c == 2) {
            z = true;
        } else {
            z = false;
        }
        uVar.m22421t(audioTrack2, z, cVar.f16049g, cVar.f16046d, cVar.f16050h);
        m22641k0();
        int i = this.f38352V.f16237a;
        if (i != 0) {
            this.f16033s.attachAuxEffect(i);
            this.f16033s.setAuxEffectSendLevel(this.f38352V.f16238b);
        }
        this.f38336F = true;
    }

    /* renamed from: X */
    private static boolean m22656X(int i) {
        return (C7557q0.f16368a >= 24 && i == -6) || i == -32;
    }

    /* renamed from: Y */
    private boolean m22655Y() {
        return this.f16033s != null;
    }

    /* renamed from: Z */
    private static boolean m22654Z() {
        return C7557q0.f16368a >= 30 && C7557q0.f16371d.startsWith("Pixel");
    }

    /* renamed from: a0 */
    private static boolean m22653a0(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (C7557q0.f16368a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    private static boolean m22652b0(C6722k kVar, C7445e eVar) {
        int f;
        int G;
        boolean isOffloadedPlaybackSupported;
        boolean z;
        if (C7557q0.f16368a < 29 || (f = C7562u.m22082f((String) C7510a.m22367e(kVar.f14329v), kVar.f14326s)) == 0 || (G = C7557q0.m22203G(kVar.f37969I)) == 0) {
            return false;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(m22668L(kVar.f37970J, G, f), eVar.m22606a());
        if (!isOffloadedPlaybackSupported) {
            return false;
        }
        if (kVar.f37972L == 0 && kVar.f37973M == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || m22654Z()) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private static boolean m22651c0(C6722k kVar, C7449f fVar) {
        return m22665O(kVar, fVar) != null;
    }

    /* renamed from: d0 */
    private void m22649d0() {
        if (this.f16032r.m22616o()) {
            this.f38355Y = true;
        }
    }

    /* renamed from: e0 */
    private void m22647e0() {
        if (!this.f38348R) {
            this.f38348R = true;
            this.f16023i.m22433h(m22658V());
            this.f16033s.stop();
            this.f16039y = 0;
        }
    }

    /* renamed from: f0 */
    private void m22646f0(long j) {
        ByteBuffer byteBuffer;
        int length = this.f38339I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f38340J[i - 1];
            } else {
                byteBuffer = this.f38341K;
                if (byteBuffer == null) {
                    byteBuffer = AbstractC7453h.f16082a;
                }
            }
            if (i == length) {
                m22635q0(byteBuffer, j);
            } else {
                AbstractC7453h hVar = this.f38339I[i];
                if (i > this.f38346P) {
                    hVar.mo22405f(byteBuffer);
                }
                ByteBuffer d = hVar.mo22410d();
                this.f38340J[i] = d;
                if (d.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: g0 */
    private void m22645g0(AudioTrack audioTrack) {
        if (this.f16027m == null) {
            this.f16027m = new C7443i();
        }
        this.f16027m.m22608a(audioTrack);
    }

    /* renamed from: h0 */
    private void m22644h0() {
        this.f16040z = 0L;
        this.f38331A = 0L;
        this.f38332B = 0L;
        this.f38333C = 0L;
        this.f38356Z = false;
        this.f38334D = 0;
        this.f16036v = new C7440f(m22667M(), m22660T(), 0L, 0L, null);
        this.f38337G = 0L;
        this.f16035u = null;
        this.f16024j.clear();
        this.f38341K = null;
        this.f38342L = 0;
        this.f38343M = null;
        this.f38348R = false;
        this.f38347Q = false;
        this.f38346P = -1;
        this.f16038x = null;
        this.f16039y = 0;
        this.f16019e.m22483n();
        m22669K();
    }

    /* renamed from: i0 */
    private void m22643i0(PlaybackParameters playbackParameters, boolean z) {
        C7440f S = m22661S();
        if (!playbackParameters.equals(S.f16055a) || z != S.f16056b) {
            C7440f fVar = new C7440f(playbackParameters, z, -9223372036854775807L, -9223372036854775807L, null);
            if (m22655Y()) {
                this.f16035u = fVar;
            } else {
                this.f16036v = fVar;
            }
        }
    }

    /* renamed from: j0 */
    private void m22642j0(PlaybackParameters playbackParameters) {
        if (m22655Y()) {
            try {
                this.f16033s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.f9029a).setPitch(playbackParameters.f9030b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C7558r.m22103i("DefaultAudioSink", "Failed to set playback params", e);
            }
            playbackParameters = new PlaybackParameters(this.f16033s.getPlaybackParams().getSpeed(), this.f16033s.getPlaybackParams().getPitch());
            this.f16023i.m22420u(playbackParameters.f9029a);
        }
        this.f16037w = playbackParameters;
    }

    /* renamed from: k0 */
    private void m22641k0() {
        if (m22655Y()) {
            if (C7557q0.f16368a >= 21) {
                m22640l0(this.f16033s, this.f38338H);
            } else {
                m22639m0(this.f16033s, this.f38338H);
            }
        }
    }

    /* renamed from: l0 */
    private static void m22640l0(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: m0 */
    private static void m22639m0(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: n0 */
    private void m22638n0() {
        AbstractC7453h[] hVarArr = this.f16032r.f16051i;
        ArrayList arrayList = new ArrayList();
        for (AbstractC7453h hVar : hVarArr) {
            if (hVar.mo22412b()) {
                arrayList.add(hVar);
            } else {
                hVar.flush();
            }
        }
        int size = arrayList.size();
        this.f38339I = (AbstractC7453h[]) arrayList.toArray(new AbstractC7453h[size]);
        this.f38340J = new ByteBuffer[size];
        m22669K();
    }

    /* renamed from: o0 */
    private boolean m22637o0() {
        if (this.f38353W || !"audio/raw".equals(this.f16032r.f16043a.f14329v) || m22636p0(this.f16032r.f16043a.f37971K)) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    private boolean m22636p0(int i) {
        return this.f16017c && C7557q0.m22134o0(i);
    }

    /* renamed from: q0 */
    private void m22635q0(ByteBuffer byteBuffer, long j) {
        int i;
        boolean z;
        boolean z2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f38343M;
            boolean z3 = true;
            if (byteBuffer2 != null) {
                if (byteBuffer2 == byteBuffer) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C7510a.m22371a(z2);
            } else {
                this.f38343M = byteBuffer;
                if (C7557q0.f16368a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f38344N;
                    if (bArr == null || bArr.length < remaining) {
                        this.f38344N = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f38344N, 0, remaining);
                    byteBuffer.position(position);
                    this.f38345O = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C7557q0.f16368a < 21) {
                int c = this.f16023i.m22438c(this.f38332B);
                if (c > 0) {
                    i = this.f16033s.write(this.f38344N, this.f38345O, Math.min(remaining2, c));
                    if (i > 0) {
                        this.f38345O += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else if (this.f38353W) {
                if (j != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                C7510a.m22366f(z);
                i = m22633s0(this.f16033s, byteBuffer, remaining2, j);
            } else {
                i = m22634r0(this.f16033s, byteBuffer, remaining2);
            }
            this.f38354X = SystemClock.elapsedRealtime();
            if (i < 0) {
                boolean X = m22656X(i);
                if (X) {
                    m22649d0();
                }
                AbstractC7481s.C7485d dVar = new AbstractC7481s.C7485d(i, this.f16032r.f16043a, X);
                AbstractC7481s.AbstractC7484c cVar = this.f16030p;
                if (cVar != null) {
                    cVar.mo22457c(dVar);
                }
                if (!dVar.f16198l) {
                    this.f16029o.m22609b(dVar);
                    return;
                }
                throw dVar;
            }
            this.f16029o.m22610a();
            if (m22653a0(this.f16033s)) {
                long j2 = this.f38333C;
                if (j2 > 0) {
                    this.f38356Z = false;
                }
                if (this.f38349S && this.f16030p != null && i < remaining2 && !this.f38356Z) {
                    this.f16030p.mo22456d(this.f16023i.m22436e(j2));
                }
            }
            int i2 = this.f16032r.f16045c;
            if (i2 == 0) {
                this.f38332B += i;
            }
            if (i == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer != this.f38341K) {
                        z3 = false;
                    }
                    C7510a.m22366f(z3);
                    this.f38333C += this.f38334D * this.f38342L;
                }
                this.f38343M = null;
            }
        }
    }

    /* renamed from: r0 */
    private static int m22634r0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: s0 */
    private int m22633s0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (C7557q0.f16368a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f16038x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f16038x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f16038x.putInt(1431633921);
        }
        if (this.f16039y == 0) {
            this.f16038x.putInt(4, i);
            this.f16038x.putLong(8, j * 1000);
            this.f16038x.position(0);
            this.f16039y = i;
        }
        int remaining = this.f16038x.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f16038x, remaining, 1);
            if (write < 0) {
                this.f16039y = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int r0 = m22634r0(audioTrack, byteBuffer, i);
        if (r0 < 0) {
            this.f16039y = 0;
            return r0;
        }
        this.f16039y -= r0;
        return r0;
    }

    /* renamed from: T */
    public boolean m22660T() {
        return m22661S().f16056b;
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: a */
    public boolean mo22481a(C6722k kVar) {
        return mo22472l(kVar) != 0;
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: b */
    public PlaybackParameters mo22480b() {
        if (this.f16025k) {
            return this.f16037w;
        }
        return m22667M();
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: c */
    public boolean mo22479c() {
        return !m22655Y() || (this.f38347Q && !mo22476h());
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: f */
    public void mo22478f(PlaybackParameters playbackParameters) {
        PlaybackParameters playbackParameters2 = new PlaybackParameters(C7557q0.m22131q(playbackParameters.f9029a, 0.1f, 8.0f), C7557q0.m22131q(playbackParameters.f9030b, 0.1f, 8.0f));
        if (!this.f16025k || C7557q0.f16368a < 23) {
            m22643i0(playbackParameters2, m22660T());
        } else {
            m22642j0(playbackParameters2);
        }
    }

    @Override // p117g7.AbstractC7481s
    public void flush() {
        if (m22655Y()) {
            m22644h0();
            if (this.f16023i.m22431j()) {
                this.f16033s.pause();
            }
            if (m22653a0(this.f16033s)) {
                ((C7443i) C7510a.m22367e(this.f16027m)).m22607b(this.f16033s);
            }
            AudioTrack audioTrack = this.f16033s;
            this.f16033s = null;
            if (C7557q0.f16368a < 21 && !this.f38350T) {
                this.f38351U = 0;
            }
            C7437c cVar = this.f16031q;
            if (cVar != null) {
                this.f16032r = cVar;
                this.f16031q = null;
            }
            this.f16023i.m22423r();
            this.f16022h.close();
            new C7435a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f16029o.m22610a();
        this.f16028n.m22610a();
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: g */
    public void mo22477g(C7445e eVar) {
        if (!this.f16034t.equals(eVar)) {
            this.f16034t = eVar;
            if (!this.f38353W) {
                flush();
            }
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: h */
    public boolean mo22476h() {
        if (!m22655Y() || !this.f16023i.m22432i(m22658V())) {
            return false;
        }
        return true;
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: i */
    public void mo22475i(int i) {
        boolean z;
        if (this.f38351U != i) {
            this.f38351U = i;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f38350T = z;
            flush();
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: j */
    public void mo22474j() {
        this.f38349S = false;
        if (m22655Y() && this.f16023i.m22424q()) {
            this.f16033s.pause();
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: k */
    public void mo22473k() {
        if (this.f38353W) {
            this.f38353W = false;
            flush();
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: l */
    public int mo22472l(C6722k kVar) {
        if ("audio/raw".equals(kVar.f14329v)) {
            if (!C7557q0.m22132p0(kVar.f37971K)) {
                C7558r.m22104h("DefaultAudioSink", "Invalid PCM encoding: " + kVar.f37971K);
                return 0;
            }
            int i = kVar.f37971K;
            if (i == 2 || (this.f16017c && i == 4)) {
                return 2;
            }
            return 1;
        } else if ((!this.f16026l || this.f38355Y || !m22652b0(kVar, this.f16034t)) && !m22651c0(kVar, this.f16015a)) {
            return 0;
        } else {
            return 2;
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: m */
    public void mo22471m(C6722k kVar, int i, int[] iArr) {
        AbstractC7453h[] hVarArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AbstractC7453h[] hVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(kVar.f14329v)) {
            C7510a.m22371a(C7557q0.m22132p0(kVar.f37971K));
            int c0 = C7557q0.m22158c0(kVar.f37971K, kVar.f37969I);
            if (m22636p0(kVar.f37971K)) {
                hVarArr2 = this.f16021g;
            } else {
                hVarArr2 = this.f16020f;
            }
            this.f16019e.m22482o(kVar.f37972L, kVar.f37973M);
            if (C7557q0.f16368a < 21 && kVar.f37969I == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.f16018d.m22401m(iArr2);
            AbstractC7453h.C7454a aVar = new AbstractC7453h.C7454a(kVar.f37970J, kVar.f37969I, kVar.f37971K);
            for (AbstractC7453h hVar : hVarArr2) {
                try {
                    AbstractC7453h.C7454a e = hVar.mo22409e(aVar);
                    if (hVar.mo22412b()) {
                        aVar = e;
                    }
                } catch (AbstractC7453h.C7455b e2) {
                    throw new AbstractC7481s.C7482a(e2, kVar);
                }
            }
            int i9 = aVar.f16086c;
            i4 = aVar.f16084a;
            i3 = C7557q0.m22203G(aVar.f16085b);
            hVarArr = hVarArr2;
            i2 = i9;
            i7 = c0;
            i5 = C7557q0.m22158c0(i9, aVar.f16085b);
            i6 = 0;
        } else {
            AbstractC7453h[] hVarArr3 = new AbstractC7453h[0];
            int i10 = kVar.f37970J;
            i5 = -1;
            if (!this.f16026l || !m22652b0(kVar, this.f16034t)) {
                Pair<Integer, Integer> O = m22665O(kVar, this.f16015a);
                if (O != null) {
                    hVarArr = hVarArr3;
                    i2 = ((Integer) O.first).intValue();
                    i4 = i10;
                    i7 = -1;
                    i3 = ((Integer) O.second).intValue();
                    i6 = 2;
                } else {
                    throw new AbstractC7481s.C7482a("Unable to configure passthrough for: " + kVar, kVar);
                }
            } else {
                hVarArr = hVarArr3;
                i2 = C7562u.m22082f((String) C7510a.m22367e(kVar.f14329v), kVar.f14326s);
                i6 = 1;
                i3 = C7557q0.m22203G(kVar.f37969I);
                i4 = i10;
                i7 = -1;
            }
        }
        if (i2 == 0) {
            throw new AbstractC7481s.C7482a("Invalid output encoding (mode=" + i6 + ") for: " + kVar, kVar);
        } else if (i3 != 0) {
            this.f38355Y = false;
            C7437c cVar = new C7437c(kVar, i7, i6, i5, i4, i3, i2, i, this.f16025k, hVarArr);
            if (m22655Y()) {
                this.f16031q = cVar;
            } else {
                this.f16032r = cVar;
            }
        } else {
            throw new AbstractC7481s.C7482a("Invalid output channel config (mode=" + i6 + ") for: " + kVar, kVar);
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: n */
    public void mo22470n(AbstractC7481s.AbstractC7484c cVar) {
        this.f16030p = cVar;
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: o */
    public boolean mo22469o(ByteBuffer byteBuffer, long j, int i) {
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer2 = this.f38341K;
        if (byteBuffer2 == null || byteBuffer == byteBuffer2) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        if (this.f16031q != null) {
            if (!m22670J()) {
                return false;
            }
            if (!this.f16031q.m22629b(this.f16032r)) {
                m22647e0();
                if (mo22476h()) {
                    return false;
                }
                flush();
            } else {
                this.f16032r = this.f16031q;
                this.f16031q = null;
                if (m22653a0(this.f16033s)) {
                    this.f16033s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f16033s;
                    C6722k kVar = this.f16032r.f16043a;
                    audioTrack.setOffloadDelayPadding(kVar.f37972L, kVar.f37973M);
                    this.f38356Z = true;
                }
            }
            m22674F(j);
        }
        if (!m22655Y()) {
            try {
                m22657W();
            } catch (AbstractC7481s.C7483b e) {
                if (!e.f16195l) {
                    this.f16028n.m22609b(e);
                    return false;
                }
                throw e;
            }
        }
        this.f16028n.m22610a();
        if (this.f38336F) {
            this.f38337G = Math.max(0L, j);
            this.f38335E = false;
            this.f38336F = false;
            if (this.f16025k && C7557q0.f16368a >= 23) {
                m22642j0(this.f16037w);
            }
            m22674F(j);
            if (this.f38349S) {
                mo22461w();
            }
        }
        if (!this.f16023i.m22429l(m22658V())) {
            return false;
        }
        if (this.f38341K == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7510a.m22371a(z2);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C7437c cVar = this.f16032r;
            if (cVar.f16045c != 0 && this.f38334D == 0) {
                int P = m22664P(cVar.f16049g, byteBuffer);
                this.f38334D = P;
                if (P == 0) {
                    return true;
                }
            }
            if (this.f16035u != null) {
                if (!m22670J()) {
                    return false;
                }
                m22674F(j);
                this.f16035u = null;
            }
            long n = this.f38337G + this.f16032r.m22617n(m22659U() - this.f16019e.m22484m());
            if (!this.f38335E && Math.abs(n - j) > 200000) {
                C7558r.m22109c("DefaultAudioSink", "Discontinuity detected [expected " + n + ", got " + j + "]");
                this.f38335E = true;
            }
            if (this.f38335E) {
                if (!m22670J()) {
                    return false;
                }
                long j2 = j - n;
                this.f38337G += j2;
                this.f38335E = false;
                m22674F(j);
                AbstractC7481s.AbstractC7484c cVar2 = this.f16030p;
                if (!(cVar2 == null || j2 == 0)) {
                    cVar2.mo22454f();
                }
            }
            if (this.f16032r.f16045c == 0) {
                this.f16040z += byteBuffer.remaining();
            } else {
                this.f38331A += this.f38334D * i;
            }
            this.f38341K = byteBuffer;
            this.f38342L = i;
        }
        m22646f0(j);
        if (!this.f38341K.hasRemaining()) {
            this.f38341K = null;
            this.f38342L = 0;
            return true;
        } else if (!this.f16023i.m22430k(m22658V())) {
            return false;
        } else {
            C7558r.m22104h("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: p */
    public void mo22468p() {
        boolean z;
        if (C7557q0.f16368a < 25) {
            flush();
            return;
        }
        this.f16029o.m22610a();
        this.f16028n.m22610a();
        if (m22655Y()) {
            m22644h0();
            if (this.f16023i.m22431j()) {
                this.f16033s.pause();
            }
            this.f16033s.flush();
            this.f16023i.m22423r();
            C7489u uVar = this.f16023i;
            AudioTrack audioTrack = this.f16033s;
            C7437c cVar = this.f16032r;
            if (cVar.f16045c == 2) {
                z = true;
            } else {
                z = false;
            }
            uVar.m22421t(audioTrack, z, cVar.f16049g, cVar.f16046d, cVar.f16050h);
            this.f38336F = true;
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: q */
    public void mo22467q(C7491v vVar) {
        if (!this.f38352V.equals(vVar)) {
            int i = vVar.f16237a;
            float f = vVar.f16238b;
            AudioTrack audioTrack = this.f16033s;
            if (audioTrack != null) {
                if (this.f38352V.f16237a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f16033s.setAuxEffectSendLevel(f);
                }
            }
            this.f38352V = vVar;
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: r */
    public void mo22466r() {
        if (!this.f38347Q && m22655Y() && m22670J()) {
            m22647e0();
            this.f38347Q = true;
        }
    }

    @Override // p117g7.AbstractC7481s
    public void reset() {
        flush();
        for (AbstractC7453h hVar : this.f16020f) {
            hVar.reset();
        }
        for (AbstractC7453h hVar2 : this.f16021g) {
            hVar2.reset();
        }
        this.f38349S = false;
        this.f38355Y = false;
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: s */
    public long mo22465s(boolean z) {
        if (!m22655Y() || this.f38336F) {
            return Long.MIN_VALUE;
        }
        return m22672H(m22673G(Math.min(this.f16023i.m22437d(z), this.f16032r.m22622i(m22658V()))));
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: t */
    public void mo22464t() {
        this.f38335E = true;
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: u */
    public void mo22463u(float f) {
        if (this.f38338H != f) {
            this.f38338H = f;
            m22641k0();
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: v */
    public void mo22462v() {
        boolean z;
        if (C7557q0.f16368a >= 21) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        C7510a.m22366f(this.f38350T);
        if (!this.f38353W) {
            this.f38353W = true;
            flush();
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: w */
    public void mo22461w() {
        this.f38349S = true;
        if (m22655Y()) {
            this.f16023i.m22419v();
            this.f16033s.play();
        }
    }

    @Override // p117g7.AbstractC7481s
    /* renamed from: x */
    public void mo22460x(boolean z) {
        m22643i0(m22667M(), z);
    }
}
