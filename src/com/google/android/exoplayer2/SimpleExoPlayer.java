package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.C5164b;
import com.google.android.exoplayer2.C5169d;
import com.google.android.exoplayer2.C5178g;
import com.google.android.exoplayer2.C5255u0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p029b9.AbstractC3425m;
import p029b9.C3405f;
import p079e7.AbstractC6727n;
import p079e7.AbstractC6735v;
import p079e7.C6713c;
import p079e7.C6715e;
import p079e7.C6717f;
import p079e7.C6721j;
import p079e7.C6722k;
import p079e7.C6730q;
import p079e7.C6736w;
import p081e9.AbstractC6769e;
import p081e9.C6781o;
import p098f7.C7030d1;
import p117g7.AbstractC7451g;
import p117g7.AbstractC7478r;
import p117g7.C7445e;
import p119g9.AbstractC7516c;
import p119g9.C7510a;
import p119g9.C7511a0;
import p119g9.C7557q0;
import p119g9.C7558r;
import p133h9.AbstractC7940a0;
import p133h9.AbstractC7958l;
import p133h9.AbstractC7959m;
import p133h9.AbstractC7965q;
import p133h9.C7956j;
import p152i7.C8221f;
import p152i7.C8225i;
import p153i8.AbstractC8236c0;
import p153i8.AbstractC8299u;
import p153i8.C8256j;
import p154i9.AbstractC8310a;
import p172j7.AbstractC9502b;
import p172j7.C9501a;
import p228m7.AbstractC10521o;
import p228m7.C10512g;
import p317r8.AbstractC12465l;
import p317r8.C12453b;
import p459z7.AbstractC14583f;
import p459z7.C14576a;

/* loaded from: classes7.dex */
public class SimpleExoPlayer extends AbstractC5174e implements Player.AbstractC5155c, Player.AbstractC5154b {

    /* renamed from: A */
    private int f37207A;

    /* renamed from: B */
    private C8221f f37208B;

    /* renamed from: C */
    private C8221f f37209C;

    /* renamed from: D */
    private int f37210D;

    /* renamed from: E */
    private C7445e f37211E;

    /* renamed from: G */
    private boolean f37213G;

    /* renamed from: H */
    private List<C12453b> f37214H;

    /* renamed from: I */
    private AbstractC7959m f37215I;

    /* renamed from: J */
    private AbstractC8310a f37216J;

    /* renamed from: K */
    private boolean f37217K;

    /* renamed from: L */
    private boolean f37218L;

    /* renamed from: M */
    private C7511a0 f37219M;

    /* renamed from: N */
    private boolean f37220N;

    /* renamed from: O */
    private boolean f37221O;

    /* renamed from: P */
    private C9501a f37222P;

    /* renamed from: b */
    protected final AbstractC5252t0[] f9032b;

    /* renamed from: c */
    private final Context f9033c;

    /* renamed from: d */
    private final C5172d0 f9034d;

    /* renamed from: e */
    private final SurfaceHolder$CallbackC5158c f9035e;

    /* renamed from: k */
    private final C7030d1 f9041k;

    /* renamed from: l */
    private final C5164b f9042l;

    /* renamed from: m */
    private final C5169d f9043m;

    /* renamed from: n */
    private final C5255u0 f9044n;

    /* renamed from: o */
    private final C5333w0 f9045o;

    /* renamed from: p */
    private final C5335x0 f9046p;

    /* renamed from: q */
    private final long f9047q;

    /* renamed from: r */
    private C6722k f9048r;

    /* renamed from: s */
    private C6722k f9049s;

    /* renamed from: t */
    private AudioTrack f9050t;

    /* renamed from: u */
    private Surface f9051u;

    /* renamed from: v */
    private boolean f9052v;

    /* renamed from: w */
    private int f9053w;

    /* renamed from: x */
    private SurfaceHolder f9054x;

    /* renamed from: y */
    private TextureView f9055y;

    /* renamed from: z */
    private int f9056z;

    /* renamed from: f */
    private final CopyOnWriteArraySet<AbstractC7965q> f9036f = new CopyOnWriteArraySet<>();

    /* renamed from: g */
    private final CopyOnWriteArraySet<AbstractC7451g> f9037g = new CopyOnWriteArraySet<>();

    /* renamed from: h */
    private final CopyOnWriteArraySet<AbstractC12465l> f9038h = new CopyOnWriteArraySet<>();

    /* renamed from: i */
    private final CopyOnWriteArraySet<AbstractC14583f> f9039i = new CopyOnWriteArraySet<>();

    /* renamed from: j */
    private final CopyOnWriteArraySet<AbstractC9502b> f9040j = new CopyOnWriteArraySet<>();

    /* renamed from: F */
    private float f37212F = 1.0f;

    /* renamed from: com.google.android.exoplayer2.SimpleExoPlayer$b */
    /* loaded from: classes7.dex */
    public static final class C5157b {

        /* renamed from: a */
        private final Context f9057a;

        /* renamed from: b */
        private final AbstractC6735v f9058b;

        /* renamed from: c */
        private AbstractC7516c f9059c;

        /* renamed from: d */
        private AbstractC3425m f9060d;

        /* renamed from: e */
        private AbstractC8236c0 f9061e;

        /* renamed from: f */
        private AbstractC6727n f9062f;

        /* renamed from: g */
        private AbstractC6769e f9063g;

        /* renamed from: h */
        private C7030d1 f9064h;

        /* renamed from: i */
        private Looper f9065i;

        /* renamed from: j */
        private C7511a0 f9066j;

        /* renamed from: k */
        private C7445e f9067k;

        /* renamed from: l */
        private boolean f9068l;

        /* renamed from: m */
        private int f9069m;

        /* renamed from: n */
        private boolean f9070n;

        /* renamed from: o */
        private boolean f9071o;

        /* renamed from: p */
        private int f9072p;

        /* renamed from: q */
        private boolean f9073q;

        /* renamed from: r */
        private C6736w f9074r;

        /* renamed from: s */
        private AbstractC5192h0 f9075s;

        /* renamed from: t */
        private long f9076t;

        /* renamed from: u */
        private long f9077u;

        /* renamed from: v */
        private boolean f9078v;

        /* renamed from: w */
        private boolean f9079w;

        public C5157b(Context context) {
            this(context, new C6717f(context), new C10512g());
        }

        /* renamed from: w */
        public SimpleExoPlayer m30444w() {
            C7510a.m22366f(!this.f9079w);
            this.f9079w = true;
            return new SimpleExoPlayer(this);
        }

        /* renamed from: x */
        public C5157b m30443x(AbstractC6769e eVar) {
            C7510a.m22366f(!this.f9079w);
            this.f9063g = eVar;
            return this;
        }

        /* renamed from: y */
        public C5157b m30442y(AbstractC6727n nVar) {
            C7510a.m22366f(!this.f9079w);
            this.f9062f = nVar;
            return this;
        }

        /* renamed from: z */
        public C5157b m30441z(AbstractC3425m mVar) {
            C7510a.m22366f(!this.f9079w);
            this.f9060d = mVar;
            return this;
        }

        public C5157b(Context context, AbstractC6735v vVar) {
            this(context, vVar, new C10512g());
        }

        public C5157b(Context context, AbstractC6735v vVar, AbstractC10521o oVar) {
            this(context, vVar, new C3405f(context), new C8256j(context, oVar), new C6715e(), C6781o.m24336l(context), new C7030d1(AbstractC7516c.f16293a));
        }

        public C5157b(Context context, AbstractC6735v vVar, AbstractC3425m mVar, AbstractC8236c0 c0Var, AbstractC6727n nVar, AbstractC6769e eVar, C7030d1 d1Var) {
            this.f9057a = context;
            this.f9058b = vVar;
            this.f9060d = mVar;
            this.f9061e = c0Var;
            this.f9062f = nVar;
            this.f9063g = eVar;
            this.f9064h = d1Var;
            this.f9065i = C7557q0.m22185P();
            this.f9067k = C7445e.f16068f;
            this.f9069m = 0;
            this.f9072p = 1;
            this.f9073q = true;
            this.f9074r = C6736w.f14371g;
            this.f9075s = new C5178g.C5180b().m30265a();
            this.f9059c = AbstractC7516c.f16293a;
            this.f9076t = 500L;
            this.f9077u = 2000L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.SimpleExoPlayer$c */
    /* loaded from: classes7.dex */
    public final class SurfaceHolder$CallbackC5158c implements AbstractC7940a0, AbstractC7478r, AbstractC12465l, AbstractC14583f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C5169d.AbstractC5171b, C5164b.AbstractC0139b, C5255u0.AbstractC5257b, Player.AbstractC5153a {
        private SurfaceHolder$CallbackC5158c() {
        }

        @Override // p117g7.AbstractC7478r
        /* renamed from: A */
        public void mo22520A(C8221f fVar) {
            SimpleExoPlayer.this.f37209C = fVar;
            SimpleExoPlayer.this.f9041k.mo22520A(fVar);
        }

        @Override // p133h9.AbstractC7940a0
        /* renamed from: B */
        public void mo21115B(C6722k kVar, C8225i iVar) {
            SimpleExoPlayer.this.f9048r = kVar;
            SimpleExoPlayer.this.f9041k.mo21115B(kVar, iVar);
        }

        @Override // p117g7.AbstractC7478r
        /* renamed from: D */
        public void mo22519D(int i, long j, long j2) {
            SimpleExoPlayer.this.f9041k.mo22519D(i, j, j2);
        }

        @Override // p133h9.AbstractC7940a0
        /* renamed from: E */
        public void mo21114E(long j, int i) {
            SimpleExoPlayer.this.f9041k.mo21114E(j, i);
        }

        @Override // p117g7.AbstractC7478r
        /* renamed from: a */
        public void mo22518a(boolean z) {
            if (SimpleExoPlayer.this.f37213G != z) {
                SimpleExoPlayer.this.f37213G = z;
                SimpleExoPlayer.this.m30520P0();
            }
        }

        @Override // com.google.android.exoplayer2.C5164b.AbstractC0139b
        /* renamed from: b */
        public void mo30403b() {
            SimpleExoPlayer.this.m30497f1(false, -1, 3);
        }

        @Override // p117g7.AbstractC7478r
        /* renamed from: c */
        public void mo22517c(Exception exc) {
            SimpleExoPlayer.this.f9041k.mo22517c(exc);
        }

        @Override // p133h9.AbstractC7940a0
        /* renamed from: d */
        public void mo21113d(int i, int i2, int i3, float f) {
            SimpleExoPlayer.this.f9041k.mo21113d(i, i2, i3, f);
            Iterator it = SimpleExoPlayer.this.f9036f.iterator();
            while (it.hasNext()) {
                ((AbstractC7965q) it.next()).mo20981d(i, i2, i3, f);
            }
        }

        @Override // p117g7.AbstractC7478r
        /* renamed from: e */
        public void mo22516e(C8221f fVar) {
            SimpleExoPlayer.this.f9041k.mo22516e(fVar);
            SimpleExoPlayer.this.f9049s = null;
            SimpleExoPlayer.this.f37209C = null;
        }

        @Override // p133h9.AbstractC7940a0
        /* renamed from: f */
        public void mo21112f(String str) {
            SimpleExoPlayer.this.f9041k.mo21112f(str);
        }

        @Override // p133h9.AbstractC7940a0
        /* renamed from: g */
        public void mo21111g(String str, long j, long j2) {
            SimpleExoPlayer.this.f9041k.mo21111g(str, j, j2);
        }

        @Override // p133h9.AbstractC7940a0
        /* renamed from: h */
        public void mo21110h(C8221f fVar) {
            SimpleExoPlayer.this.f9041k.mo21110h(fVar);
            SimpleExoPlayer.this.f9048r = null;
            SimpleExoPlayer.this.f37208B = null;
        }

        @Override // com.google.android.exoplayer2.C5255u0.AbstractC5257b
        /* renamed from: i */
        public void mo29818i(int i) {
            C9501a H0 = SimpleExoPlayer.m30529H0(SimpleExoPlayer.this.f9044n);
            if (!H0.equals(SimpleExoPlayer.this.f37222P)) {
                SimpleExoPlayer.this.f37222P = H0;
                Iterator it = SimpleExoPlayer.this.f9040j.iterator();
                while (it.hasNext()) {
                    ((AbstractC9502b) it.next()).m16122b(H0);
                }
            }
        }

        @Override // p133h9.AbstractC7940a0
        /* renamed from: j */
        public void mo21109j(Surface surface) {
            SimpleExoPlayer.this.f9041k.mo21109j(surface);
            if (SimpleExoPlayer.this.f9051u == surface) {
                Iterator it = SimpleExoPlayer.this.f9036f.iterator();
                while (it.hasNext()) {
                    ((AbstractC7965q) it.next()).mo20980e();
                }
            }
        }

        @Override // p117g7.AbstractC7478r
        /* renamed from: k */
        public void mo22515k(String str) {
            SimpleExoPlayer.this.f9041k.mo22515k(str);
        }

        @Override // p117g7.AbstractC7478r
        /* renamed from: l */
        public void mo22514l(String str, long j, long j2) {
            SimpleExoPlayer.this.f9041k.mo22514l(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.C5255u0.AbstractC5257b
        /* renamed from: m */
        public void mo29817m(int i, boolean z) {
            Iterator it = SimpleExoPlayer.this.f9040j.iterator();
            while (it.hasNext()) {
                ((AbstractC9502b) it.next()).m16123a(i, z);
            }
        }

        @Override // p317r8.AbstractC12465l
        /* renamed from: n */
        public void mo6665n(List<C12453b> list) {
            SimpleExoPlayer.this.f37214H = list;
            Iterator it = SimpleExoPlayer.this.f9038h.iterator();
            while (it.hasNext()) {
                ((AbstractC12465l) it.next()).mo6665n(list);
            }
        }

        @Override // p117g7.AbstractC7478r
        /* renamed from: o */
        public void mo22513o(long j) {
            SimpleExoPlayer.this.f9041k.mo22513o(j);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            C6730q.m24451a(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
            C6730q.m24450b(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onExperimentalSleepingForOffloadChanged(boolean z) {
            SimpleExoPlayer.this.m30495g1();
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onIsLoadingChanged(boolean z) {
            if (SimpleExoPlayer.this.f37219M == null) {
                return;
            }
            if (z && !SimpleExoPlayer.this.f37220N) {
                SimpleExoPlayer.this.f37219M.m22362a(0);
                SimpleExoPlayer.this.f37220N = true;
            } else if (!z && SimpleExoPlayer.this.f37220N) {
                SimpleExoPlayer.this.f37219M.m22360c(0);
                SimpleExoPlayer.this.f37220N = false;
            }
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            C6730q.m24447e(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onLoadingChanged(boolean z) {
            C6730q.m24446f(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            C6730q.m24445g(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onPlayWhenReadyChanged(boolean z, int i) {
            SimpleExoPlayer.this.m30495g1();
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C6730q.m24443i(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onPlaybackStateChanged(int i) {
            SimpleExoPlayer.this.m30495g1();
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            C6730q.m24441k(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C6730q.m24440l(this, exoPlaybackException);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            C6730q.m24439m(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            C6730q.m24438n(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onRepeatModeChanged(int i) {
            C6730q.m24437o(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onSeekProcessed() {
            C6730q.m24436p(this);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            C6730q.m24435q(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onStaticMetadataChanged(List list) {
            C6730q.m24434r(this, list);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SimpleExoPlayer.this.m30504c1(new Surface(surfaceTexture), true);
            SimpleExoPlayer.this.m30521O0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SimpleExoPlayer.this.m30504c1(null, true);
            SimpleExoPlayer.this.m30521O0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SimpleExoPlayer.this.m30521O0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            C6730q.m24433s(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
            C6730q.m24432t(this, timeline, obj, i);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C6730q.m24431u(this, trackGroupArray, trackSelectionArray);
        }

        @Override // com.google.android.exoplayer2.C5169d.AbstractC5171b
        /* renamed from: p */
        public void mo30383p(float f) {
            SimpleExoPlayer.this.m30513V0();
        }

        @Override // p133h9.AbstractC7940a0
        /* renamed from: q */
        public void mo21108q(C8221f fVar) {
            SimpleExoPlayer.this.f37208B = fVar;
            SimpleExoPlayer.this.f9041k.mo21108q(fVar);
        }

        @Override // com.google.android.exoplayer2.C5169d.AbstractC5171b
        /* renamed from: r */
        public void mo30382r(int i) {
            boolean G = SimpleExoPlayer.this.mo30371G();
            SimpleExoPlayer.this.m30497f1(G, i, SimpleExoPlayer.m30526J0(G, i));
        }

        @Override // p459z7.AbstractC14583f
        /* renamed from: s */
        public void mo174s(C14576a aVar) {
            SimpleExoPlayer.this.f9041k.m23595R1(aVar);
            Iterator it = SimpleExoPlayer.this.f9039i.iterator();
            while (it.hasNext()) {
                ((AbstractC14583f) it.next()).mo174s(aVar);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            SimpleExoPlayer.this.m30521O0(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.m30504c1(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.m30504c1(null, false);
            SimpleExoPlayer.this.m30521O0(0, 0);
        }

        @Override // p117g7.AbstractC7478r
        /* renamed from: u */
        public void mo22512u(C6722k kVar, C8225i iVar) {
            SimpleExoPlayer.this.f9049s = kVar;
            SimpleExoPlayer.this.f9041k.mo22512u(kVar, iVar);
        }

        @Override // p133h9.AbstractC7940a0
        /* renamed from: y */
        public void mo21107y(int i, long j) {
            SimpleExoPlayer.this.f9041k.mo21107y(i, j);
        }
    }

    protected SimpleExoPlayer(C5157b bVar) {
        C7445e eVar;
        boolean z;
        boolean z2;
        Context applicationContext = bVar.f9057a.getApplicationContext();
        this.f9033c = applicationContext;
        C7030d1 d1Var = bVar.f9064h;
        this.f9041k = d1Var;
        this.f37219M = bVar.f9066j;
        this.f37211E = bVar.f9067k;
        this.f9053w = bVar.f9072p;
        this.f37213G = bVar.f9071o;
        this.f9047q = bVar.f9077u;
        SurfaceHolder$CallbackC5158c cVar = new SurfaceHolder$CallbackC5158c();
        this.f9035e = cVar;
        Handler handler = new Handler(bVar.f9065i);
        AbstractC5252t0[] a = bVar.f9058b.mo24423a(handler, cVar, cVar, cVar, cVar);
        this.f9032b = a;
        if (C7557q0.f16368a < 21) {
            this.f37210D = m30522N0(0);
        } else {
            this.f37210D = C6713c.m24568a(applicationContext);
        }
        this.f37214H = Collections.emptyList();
        this.f37217K = true;
        C5172d0 d0Var = new C5172d0(a, bVar.f9060d, bVar.f9061e, bVar.f9062f, bVar.f9063g, d1Var, bVar.f9073q, bVar.f9074r, bVar.f9075s, bVar.f9076t, bVar.f9078v, bVar.f9059c, bVar.f9065i, this);
        this.f9034d = d0Var;
        d0Var.mo30364K(cVar);
        C5164b bVar2 = new C5164b(bVar.f9057a, handler, cVar);
        this.f9042l = bVar2;
        bVar2.m30404b(bVar.f9070n);
        C5169d dVar = new C5169d(bVar.f9057a, handler, cVar);
        this.f9043m = dVar;
        if (bVar.f9068l) {
            eVar = this.f37211E;
        } else {
            eVar = null;
        }
        dVar.m30390m(eVar);
        C5255u0 u0Var = new C5255u0(bVar.f9057a, handler, cVar);
        this.f9044n = u0Var;
        u0Var.m29820h(C7557q0.m22154e0(this.f37211E.f16071c));
        C5333w0 w0Var = new C5333w0(bVar.f9057a);
        this.f9045o = w0Var;
        if (bVar.f9069m != 0) {
            z = true;
        } else {
            z = false;
        }
        w0Var.m29458a(z);
        C5335x0 x0Var = new C5335x0(bVar.f9057a);
        this.f9046p = x0Var;
        if (bVar.f9069m == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        x0Var.m29455a(z2);
        this.f37222P = m30529H0(u0Var);
        m30514U0(1, 102, Integer.valueOf(this.f37210D));
        m30514U0(2, 102, Integer.valueOf(this.f37210D));
        m30514U0(1, 3, this.f37211E);
        m30514U0(2, 4, Integer.valueOf(this.f9053w));
        m30514U0(1, 101, Boolean.valueOf(this.f37213G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public static C9501a m30529H0(C5255u0 u0Var) {
        return new C9501a(0, u0Var.m29824d(), u0Var.m29825c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public static int m30526J0(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: N0 */
    private int m30522N0(int i) {
        AudioTrack audioTrack = this.f9050t;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i)) {
            this.f9050t.release();
            this.f9050t = null;
        }
        if (this.f9050t == null) {
            this.f9050t = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.f9050t.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public void m30521O0(int i, int i2) {
        if (i != this.f9056z || i2 != this.f37207A) {
            this.f9056z = i;
            this.f37207A = i2;
            this.f9041k.m23592S1(i, i2);
            Iterator<AbstractC7965q> it = this.f9036f.iterator();
            while (it.hasNext()) {
                it.next().mo20979f(i, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public void m30520P0() {
        this.f9041k.mo22518a(this.f37213G);
        Iterator<AbstractC7451g> it = this.f9037g.iterator();
        while (it.hasNext()) {
            it.next().m22597a(this.f37213G);
        }
    }

    /* renamed from: T0 */
    private void m30515T0() {
        TextureView textureView = this.f9055y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f9035e) {
                C7558r.m22104h("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f9055y.setSurfaceTextureListener(null);
            }
            this.f9055y = null;
        }
        SurfaceHolder surfaceHolder = this.f9054x;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f9035e);
            this.f9054x = null;
        }
    }

    /* renamed from: U0 */
    private void m30514U0(int i, int i2, Object obj) {
        AbstractC5252t0[] t0VarArr;
        for (AbstractC5252t0 t0Var : this.f9032b) {
            if (t0Var.mo24424d() == i) {
                this.f9034d.m30381A0(t0Var).m30007n(i2).m30008m(obj).m30009l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public void m30513V0() {
        m30514U0(1, 2, Float.valueOf(this.f37212F * this.f9043m.m30396g()));
    }

    /* renamed from: Z0 */
    private void m30508Z0(AbstractC7958l lVar) {
        m30514U0(2, 8, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public void m30504c1(Surface surface, boolean z) {
        AbstractC5252t0[] t0VarArr;
        ArrayList<C5218r0> arrayList = new ArrayList();
        for (AbstractC5252t0 t0Var : this.f9032b) {
            if (t0Var.mo24424d() == 2) {
                arrayList.add(this.f9034d.m30381A0(t0Var).m30007n(1).m30008m(surface).m30009l());
            }
        }
        Surface surface2 = this.f9051u;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (C5218r0 r0Var : arrayList) {
                    r0Var.m30020a(this.f9047q);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f9034d.m30296r1(false, ExoPlaybackException.m30560b(new C6721j(3)));
            }
            if (this.f9052v) {
                this.f9051u.release();
            }
        }
        this.f9051u = surface;
        this.f9052v = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f1 */
    public void m30497f1(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.f9034d.m30303o1(z2, i3, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public void m30495g1() {
        int P = mo30355P();
        boolean z = true;
        if (P != 1) {
            if (P == 2 || P == 3) {
                boolean I0 = m30528I0();
                C5333w0 w0Var = this.f9045o;
                if (!mo30371G() || I0) {
                    z = false;
                }
                w0Var.m29457b(z);
                this.f9046p.m29454b(mo30371G());
                return;
            } else if (P != 4) {
                throw new IllegalStateException();
            }
        }
        this.f9045o.m29457b(false);
        this.f9046p.m29454b(false);
    }

    /* renamed from: h1 */
    private void m30493h1() {
        IllegalStateException illegalStateException;
        if (Looper.myLooper() == mo30285x()) {
            return;
        }
        if (!this.f37217K) {
            if (this.f37218L) {
                illegalStateException = null;
            } else {
                illegalStateException = new IllegalStateException();
            }
            C7558r.m22103i("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", illegalStateException);
            this.f37218L = true;
            return;
        }
        throw new IllegalStateException("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: A */
    public void mo30538A(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        m30493h1();
        m30515T0();
        if (textureView != null) {
            m30508Z0(null);
        }
        this.f9055y = textureView;
        if (textureView == null) {
            m30504c1(null, true);
            m30521O0(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            C7558r.m22104h("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f9035e);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            m30504c1(null, true);
            m30521O0(0, 0);
            return;
        }
        m30504c1(new Surface(surfaceTexture), true);
        m30521O0(textureView.getWidth(), textureView.getHeight());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public TrackSelectionArray mo30380B() {
        m30493h1();
        return this.f9034d.mo30380B();
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5154b
    /* renamed from: C */
    public void mo30535C(AbstractC12465l lVar) {
        C7510a.m22367e(lVar);
        this.f9038h.add(lVar);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: D */
    public int mo30377D(int i) {
        m30493h1();
        return this.f9034d.mo30377D(i);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public Player.AbstractC5154b mo30375E() {
        return this;
    }

    /* renamed from: E0 */
    public void m30532E0(AbstractC14583f fVar) {
        C7510a.m22367e(fVar);
        this.f9039i.add(fVar);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public void mo30373F(int i, long j) {
        m30493h1();
        this.f9041k.m23598Q1();
        this.f9034d.mo30373F(i, j);
    }

    /* renamed from: F0 */
    public void m30531F0() {
        m30493h1();
        m30515T0();
        m30504c1(null, false);
        m30521O0(0, 0);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: G */
    public boolean mo30371G() {
        m30493h1();
        return this.f9034d.mo30371G();
    }

    /* renamed from: G0 */
    public void m30530G0(SurfaceHolder surfaceHolder) {
        m30493h1();
        if (surfaceHolder != null && surfaceHolder == this.f9054x) {
            m30505b1(null);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: H */
    public void mo30369H(boolean z) {
        m30493h1();
        this.f9034d.mo30369H(z);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: I */
    public int mo30367I() {
        m30493h1();
        return this.f9034d.mo30367I();
    }

    /* renamed from: I0 */
    public boolean m30528I0() {
        m30493h1();
        return this.f9034d.m30378C0();
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: J */
    public void mo30527J(TextureView textureView) {
        m30493h1();
        if (textureView != null && textureView == this.f9055y) {
            mo30538A(null);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: K */
    public void mo30364K(Player.AbstractC5153a aVar) {
        C7510a.m22367e(aVar);
        this.f9034d.mo30364K(aVar);
    }

    /* renamed from: K0 */
    public int m30525K0() {
        m30493h1();
        return this.f9034d.m30370G0();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: L */
    public int mo30362L() {
        m30493h1();
        return this.f9034d.mo30362L();
    }

    /* renamed from: L0 */
    public C6722k m30524L0() {
        return this.f9048r;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: M */
    public long mo30360M() {
        m30493h1();
        return this.f9034d.mo30360M();
    }

    /* renamed from: M0 */
    public float m30523M0() {
        return this.f37212F;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: O */
    public long mo30357O() {
        m30493h1();
        return this.f9034d.mo30357O();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: P */
    public int mo30355P() {
        m30493h1();
        return this.f9034d.mo30355P();
    }

    @Deprecated
    /* renamed from: Q0 */
    public void m30519Q0(AbstractC8299u uVar, boolean z, boolean z2) {
        int i;
        m30493h1();
        List<AbstractC8299u> singletonList = Collections.singletonList(uVar);
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        m30510X0(singletonList, i, -9223372036854775807L);
        mo30335c();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: R */
    public void mo30352R(int i) {
        m30493h1();
        this.f9034d.mo30352R(i);
    }

    /* renamed from: R0 */
    public void m30518R0() {
        AudioTrack audioTrack;
        m30493h1();
        if (C7557q0.f16368a < 21 && (audioTrack = this.f9050t) != null) {
            audioTrack.release();
            this.f9050t = null;
        }
        this.f9042l.m30404b(false);
        this.f9044n.m29821g();
        this.f9045o.m29457b(false);
        this.f9046p.m29454b(false);
        this.f9043m.m30394i();
        this.f9034d.m30323g1();
        this.f9041k.m23586U1();
        m30515T0();
        Surface surface = this.f9051u;
        if (surface != null) {
            if (this.f9052v) {
                surface.release();
            }
            this.f9051u = null;
        }
        if (this.f37220N) {
            ((C7511a0) C7510a.m22367e(this.f37219M)).m22360c(0);
            this.f37220N = false;
        }
        this.f37214H = Collections.emptyList();
        this.f37221O = true;
    }

    /* renamed from: S0 */
    public void m30517S0(AbstractC14583f fVar) {
        this.f9039i.remove(fVar);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: T */
    public void mo30516T(SurfaceView surfaceView) {
        m30493h1();
        SurfaceHolder surfaceHolder = null;
        if (!(surfaceView instanceof C7956j)) {
            if (surfaceView != null) {
                surfaceHolder = surfaceView.getHolder();
            }
            m30530G0(surfaceHolder);
        } else if (surfaceView.getHolder() == this.f9054x) {
            m30508Z0(null);
            this.f9054x = null;
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: U */
    public int mo30348U() {
        m30493h1();
        return this.f9034d.mo30348U();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: V */
    public boolean mo30346V() {
        m30493h1();
        return this.f9034d.mo30346V();
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: W */
    public void mo30512W(AbstractC7965q qVar) {
        this.f9036f.remove(qVar);
    }

    /* renamed from: W0 */
    public void m30511W0(AbstractC8299u uVar) {
        m30493h1();
        this.f9041k.m23583V1();
        this.f9034d.m30317j1(uVar);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: X */
    public long mo30343X() {
        m30493h1();
        return this.f9034d.mo30343X();
    }

    /* renamed from: X0 */
    public void m30510X0(List<AbstractC8299u> list, int i, long j) {
        m30493h1();
        this.f9041k.m23583V1();
        this.f9034d.m30312l1(list, i, j);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: Y */
    public long mo30341Y() {
        m30493h1();
        return this.f9034d.mo30341Y();
    }

    /* renamed from: Y0 */
    public void m30509Y0(PlaybackParameters playbackParameters) {
        m30493h1();
        this.f9034d.m30300p1(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: a */
    public void mo30507a(Surface surface) {
        m30493h1();
        m30515T0();
        if (surface != null) {
            m30508Z0(null);
        }
        int i = 0;
        m30504c1(surface, false);
        if (surface != null) {
            i = -1;
        }
        m30521O0(i, i);
    }

    /* renamed from: a1 */
    public void m30506a1(int i) {
        m30493h1();
        this.f9053w = i;
        m30514U0(2, 4, Integer.valueOf(i));
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: b */
    public PlaybackParameters mo30337b() {
        m30493h1();
        return this.f9034d.mo30337b();
    }

    /* renamed from: b1 */
    public void m30505b1(SurfaceHolder surfaceHolder) {
        m30493h1();
        m30515T0();
        if (surfaceHolder != null) {
            m30508Z0(null);
        }
        this.f9054x = surfaceHolder;
        if (surfaceHolder == null) {
            m30504c1(null, false);
            m30521O0(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f9035e);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m30504c1(null, false);
            m30521O0(0, 0);
            return;
        }
        m30504c1(surface, false);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        m30521O0(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: c */
    public void mo30335c() {
        m30493h1();
        boolean G = mo30371G();
        int p = this.f9043m.m30387p(G, 2);
        m30497f1(G, p, m30526J0(G, p));
        this.f9034d.mo30335c();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public boolean mo30333d() {
        m30493h1();
        return this.f9034d.mo30333d();
    }

    /* renamed from: d1 */
    public void m30502d1(float f) {
        m30493h1();
        float q = C7557q0.m22131q(f, 0.0f, 1.0f);
        if (this.f37212F != q) {
            this.f37212F = q;
            m30513V0();
            this.f9041k.m23589T1(q);
            Iterator<AbstractC7451g> it = this.f9037g.iterator();
            while (it.hasNext()) {
                it.next().m22596b(q);
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public long mo30330e() {
        m30493h1();
        return this.f9034d.mo30330e();
    }

    /* renamed from: e1 */
    public void m30500e1(boolean z) {
        m30493h1();
        this.f9043m.m30387p(mo30371G(), 1);
        this.f9034d.m30298q1(z);
        this.f37214H = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: f */
    public void mo30499f(Surface surface) {
        m30493h1();
        if (surface != null && surface == this.f9051u) {
            m30531F0();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: g */
    public List<C14576a> mo30325g() {
        m30493h1();
        return this.f9034d.mo30325g();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        m30493h1();
        return this.f9034d.getDuration();
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5154b
    /* renamed from: i */
    public void mo30492i(AbstractC12465l lVar) {
        this.f9038h.remove(lVar);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: j */
    public void mo30490j(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        m30493h1();
        if (surfaceView instanceof C7956j) {
            AbstractC7958l videoDecoderOutputBufferRenderer = ((C7956j) surfaceView).getVideoDecoderOutputBufferRenderer();
            m30531F0();
            this.f9054x = surfaceView.getHolder();
            m30508Z0(videoDecoderOutputBufferRenderer);
            return;
        }
        if (surfaceView == null) {
            surfaceHolder = null;
        } else {
            surfaceHolder = surfaceView.getHolder();
        }
        m30505b1(surfaceHolder);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: k */
    public void mo30488k(AbstractC7959m mVar) {
        m30493h1();
        if (this.f37215I == mVar) {
            m30514U0(2, 6, null);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: l */
    public void mo30314l(Player.AbstractC5153a aVar) {
        this.f9034d.mo30314l(aVar);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: m */
    public int mo30311m() {
        m30493h1();
        return this.f9034d.mo30311m();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public ExoPlaybackException mo30308n() {
        m30493h1();
        return this.f9034d.mo30308n();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: o */
    public void mo30305o(boolean z) {
        m30493h1();
        int p = this.f9043m.m30387p(z, mo30355P());
        m30497f1(z, p, m30526J0(z, p));
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: p */
    public Player.AbstractC5155c mo30302p() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: q */
    public void mo30481q(AbstractC7965q qVar) {
        C7510a.m22367e(qVar);
        this.f9036f.add(qVar);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: r */
    public void mo30479r(AbstractC7959m mVar) {
        m30493h1();
        this.f37215I = mVar;
        m30514U0(2, 6, mVar);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5154b
    /* renamed from: s */
    public List<C12453b> mo30477s() {
        m30493h1();
        return this.f37214H;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: t */
    public int mo30293t() {
        m30493h1();
        return this.f9034d.mo30293t();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: u */
    public int mo30291u() {
        m30493h1();
        return this.f9034d.mo30291u();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public TrackGroupArray mo30289v() {
        m30493h1();
        return this.f9034d.mo30289v();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: w */
    public Timeline mo30287w() {
        m30493h1();
        return this.f9034d.mo30287w();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: x */
    public Looper mo30285x() {
        return this.f9034d.mo30285x();
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: y */
    public void mo30470y(AbstractC8310a aVar) {
        m30493h1();
        this.f37216J = aVar;
        m30514U0(6, 7, aVar);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5155c
    /* renamed from: z */
    public void mo30468z(AbstractC8310a aVar) {
        m30493h1();
        if (this.f37216J == aVar) {
            m30514U0(6, 7, null);
        }
    }
}
