package p117g7;

import com.google.android.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;
import p079e7.C6722k;

/* renamed from: g7.s */
/* loaded from: classes7.dex */
public interface AbstractC7481s {

    /* renamed from: g7.s$b */
    /* loaded from: classes7.dex */
    public static final class C7483b extends Exception {

        /* renamed from: k */
        public final int f16194k;

        /* renamed from: l */
        public final boolean f16195l;

        /* renamed from: m */
        public final C6722k f16196m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C7483b(int r3, int r4, int r5, int r6, p079e7.C6722k r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L_0x0032
                java.lang.String r4 = " (recoverable)"
                goto L_0x0034
            L_0x0032:
                java.lang.String r4 = ""
            L_0x0034:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f16194k = r3
                r2.f16195l = r8
                r2.f16196m = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p117g7.AbstractC7481s.C7483b.<init>(int, int, int, int, e7.k, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: g7.s$c */
    /* loaded from: classes7.dex */
    public interface AbstractC7484c {
        /* renamed from: a */
        void mo22459a(boolean z);

        /* renamed from: b */
        void mo22458b(long j);

        /* renamed from: c */
        void mo22457c(Exception exc);

        /* renamed from: d */
        void mo22456d(long j);

        /* renamed from: e */
        void mo22455e(int i, long j, long j2);

        /* renamed from: f */
        void mo22454f();

        /* renamed from: g */
        void mo22453g();
    }

    /* renamed from: g7.s$d */
    /* loaded from: classes7.dex */
    public static final class C7485d extends Exception {

        /* renamed from: k */
        public final int f16197k;

        /* renamed from: l */
        public final boolean f16198l;

        /* renamed from: m */
        public final C6722k f16199m;

        public C7485d(int i, C6722k kVar, boolean z) {
            super("AudioTrack write failed: " + i);
            this.f16198l = z;
            this.f16197k = i;
            this.f16199m = kVar;
        }
    }

    /* renamed from: a */
    boolean mo22481a(C6722k kVar);

    /* renamed from: b */
    PlaybackParameters mo22480b();

    /* renamed from: c */
    boolean mo22479c();

    /* renamed from: f */
    void mo22478f(PlaybackParameters playbackParameters);

    void flush();

    /* renamed from: g */
    void mo22477g(C7445e eVar);

    /* renamed from: h */
    boolean mo22476h();

    /* renamed from: i */
    void mo22475i(int i);

    /* renamed from: j */
    void mo22474j();

    /* renamed from: k */
    void mo22473k();

    /* renamed from: l */
    int mo22472l(C6722k kVar);

    /* renamed from: m */
    void mo22471m(C6722k kVar, int i, int[] iArr);

    /* renamed from: n */
    void mo22470n(AbstractC7484c cVar);

    /* renamed from: o */
    boolean mo22469o(ByteBuffer byteBuffer, long j, int i);

    /* renamed from: p */
    void mo22468p();

    /* renamed from: q */
    void mo22467q(C7491v vVar);

    /* renamed from: r */
    void mo22466r();

    void reset();

    /* renamed from: s */
    long mo22465s(boolean z);

    /* renamed from: t */
    void mo22464t();

    /* renamed from: u */
    void mo22463u(float f);

    /* renamed from: v */
    void mo22462v();

    /* renamed from: w */
    void mo22461w();

    /* renamed from: x */
    void mo22460x(boolean z);

    /* renamed from: g7.s$a */
    /* loaded from: classes7.dex */
    public static final class C7482a extends Exception {

        /* renamed from: k */
        public final C6722k f16193k;

        public C7482a(Throwable th2, C6722k kVar) {
            super(th2);
            this.f16193k = kVar;
        }

        public C7482a(String str, C6722k kVar) {
            super(str);
            this.f16193k = kVar;
        }
    }
}
