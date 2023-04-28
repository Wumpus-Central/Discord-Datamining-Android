package com.brentvatne.exoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p049ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.C5235c;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.C5246a;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.AbstractC5311f;
import com.google.android.exoplayer2.upstream.DataSource;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;
import p004a3.AbstractC1258b;
import p004a3.C1257a;
import p029b9.AbstractC3419j;
import p029b9.C3399a;
import p029b9.C3405f;
import p079e7.C6715e;
import p079e7.C6717f;
import p079e7.C6722k;
import p079e7.C6730q;
import p081e9.AbstractC6769e;
import p081e9.C6780n;
import p081e9.C6781o;
import p119g9.C7557q0;
import p153i8.AbstractC8299u;
import p153i8.C8232b;
import p153i8.C8243e0;
import p153i8.C8264k0;
import p153i8.C8296t0;
import p153i8.C8302u0;
import p193k7.AbstractC9815v;
import p193k7.AbstractC9818x;
import p193k7.C9776g0;
import p193k7.C9784h0;
import p193k7.C9785i;
import p193k7.C9802l0;
import p193k7.C9808o;
import p439y7.AbstractC14289n;
import p439y7.C14300x;
import p454z2.C14526a;
import p454z2.C14527b;
import p459z7.AbstractC14583f;
import p459z7.C14576a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.brentvatne.exoplayer.f */
/* loaded from: classes.dex */
class C4148f extends FrameLayout implements LifecycleEventListener, Player.AbstractC5153a, AbstractC6769e.AbstractC6770a, AbstractC1258b, AudioManager.OnAudioFocusChangeListener, AbstractC14583f, AbstractC9815v {

    /* renamed from: p0 */
    private static final CookieManager f6955p0;

    /* renamed from: A */
    private boolean f35896A;

    /* renamed from: B */
    private boolean f35897B;

    /* renamed from: N */
    private Handler f35909N;

    /* renamed from: O */
    private Uri f35910O;

    /* renamed from: P */
    private String f35911P;

    /* renamed from: Q */
    private boolean f35912Q;

    /* renamed from: R */
    private String f35913R;

    /* renamed from: S */
    private Dynamic f35914S;

    /* renamed from: T */
    private String f35915T;

    /* renamed from: U */
    private Dynamic f35916U;

    /* renamed from: V */
    private String f35917V;

    /* renamed from: W */
    private Dynamic f35918W;

    /* renamed from: a0 */
    private ReadableArray f6956a0;

    /* renamed from: b0 */
    private boolean f6957b0;

    /* renamed from: f0 */
    private Map<String, String> f6961f0;

    /* renamed from: k */
    private final C4155h f6966k;

    /* renamed from: k0 */
    private boolean f6967k0;

    /* renamed from: l */
    private final AbstractC4147e f6968l;

    /* renamed from: l0 */
    private final ThemedReactContext f6969l0;

    /* renamed from: m */
    private final C6781o f6970m;

    /* renamed from: m0 */
    private final AudioManager f6971m0;

    /* renamed from: n */
    private PlayerControlView f6972n;

    /* renamed from: n0 */
    private final C1257a f6973n0;

    /* renamed from: o */
    private View f6974o;

    /* renamed from: p */
    private Player.AbstractC5153a f6976p;

    /* renamed from: q */
    private C4144d f6977q;

    /* renamed from: r */
    private DataSource.Factory f6978r;

    /* renamed from: s */
    private SimpleExoPlayer f6979s;

    /* renamed from: t */
    private C3405f f6980t;

    /* renamed from: u */
    private boolean f6981u;

    /* renamed from: v */
    private int f6982v;

    /* renamed from: w */
    private long f6983w;

    /* renamed from: x */
    private boolean f6984x;

    /* renamed from: y */
    private boolean f6985y;

    /* renamed from: z */
    private boolean f6986z;

    /* renamed from: C */
    private boolean f35898C = false;

    /* renamed from: D */
    private boolean f35899D = false;

    /* renamed from: E */
    private float f35900E = 1.0f;

    /* renamed from: F */
    private float f35901F = 1.0f;

    /* renamed from: G */
    private int f35902G = 3;

    /* renamed from: H */
    private int f35903H = 0;

    /* renamed from: I */
    private long f35904I = -9223372036854775807L;

    /* renamed from: J */
    private int f35905J = 50000;

    /* renamed from: K */
    private int f35906K = 50000;

    /* renamed from: L */
    private int f35907L = 2500;

    /* renamed from: M */
    private int f35908M = 5000;

    /* renamed from: c0 */
    private boolean f6958c0 = true;

    /* renamed from: d0 */
    private float f6959d0 = 250.0f;

    /* renamed from: e0 */
    private boolean f6960e0 = false;

    /* renamed from: g0 */
    private boolean f6962g0 = false;

    /* renamed from: h0 */
    private UUID f6963h0 = null;

    /* renamed from: i0 */
    private String f6964i0 = null;

    /* renamed from: j0 */
    private String[] f6965j0 = null;

    /* renamed from: o0 */
    private final Handler f6975o0 = new HandlerC4149a();

    /* renamed from: com.brentvatne.exoplayer.f$a */
    /* loaded from: classes.dex */
    class HandlerC4149a extends Handler {
        HandlerC4149a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1 && C4148f.this.f6979s != null && C4148f.this.f6979s.mo30355P() == 3 && C4148f.this.f6979s.mo30371G()) {
                long Y = C4148f.this.f6979s.mo30341Y();
                C4148f.this.f6966k.m32522o(Y, (C4148f.this.f6979s.m30277Z() * C4148f.this.f6979s.getDuration()) / 100, C4148f.this.f6979s.getDuration(), C4148f.this.m32563j0(Y));
                sendMessageDelayed(obtainMessage(1), Math.round(C4148f.this.f6959d0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.f$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC4150b implements View.OnClickListener {
        View$OnClickListenerC4150b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4148f.this.m32574e1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.f$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC4151c implements View.OnClickListener {
        View$OnClickListenerC4151c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C4148f.this.f6979s != null && C4148f.this.f6979s.mo30355P() == 4) {
                C4148f.this.f6979s.m30274c0(0L);
            }
            C4148f.this.m32621J0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.f$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC4152d implements View.OnClickListener {
        View$OnClickListenerC4152d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4148f.this.m32621J0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.f$e */
    /* loaded from: classes.dex */
    public class C4153e implements Player.AbstractC5153a {
        C4153e() {
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
        public /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
            C6730q.m24449c(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            C6730q.m24448d(this, z);
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
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            C6730q.m24444h(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C6730q.m24443i(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onPlaybackStateChanged(int i) {
            C6730q.m24442j(this, i);
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
        public void onPlayerStateChanged(boolean z, int i) {
            C4148f fVar = C4148f.this;
            fVar.m32548t0(fVar.f6974o);
            C4148f.this.f6979s.mo30314l(C4148f.this.f6976p);
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
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.f$f */
    /* loaded from: classes.dex */
    public class RunnableC0104f implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C4148f f6992k;

        RunnableC0104f(C4148f fVar) {
            this.f6992k = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            AbstractC9818x X;
            boolean z;
            int i2;
            C4148f fVar;
            if (C4148f.this.f6979s == null) {
                C4148f.this.f6980t = new C3405f(new C3399a.C3400b());
                C3405f fVar2 = C4148f.this.f6980t;
                C3405f.C3411e o = C4148f.this.f6980t.m34481o();
                if (C4148f.this.f35903H == 0) {
                    i2 = ViewDefaults.NUMBER_OF_LINES;
                } else {
                    i2 = C4148f.this.f35903H;
                }
                fVar2.m34486N(o.m34450g(i2));
                C6780n nVar = new C6780n(true, 65536);
                C6715e.C6716a aVar = new C6715e.C6716a();
                aVar.m24546c(nVar);
                aVar.m24545d(C4148f.this.f35905J, C4148f.this.f35906K, C4148f.this.f35907L, C4148f.this.f35908M);
                aVar.m24543f(-1);
                aVar.m24544e(true);
                C6715e b = aVar.m24547b();
                C6717f i3 = new C6717f(C4148f.this.getContext()).m24535i(0);
                C4148f fVar3 = C4148f.this;
                fVar3.f6979s = new SimpleExoPlayer.C5157b(fVar3.getContext(), i3).m30441z(C4148f.this.f6980t).m30443x(C4148f.this.f6970m).m30442y(b).m30444w();
                C4148f.this.f6979s.mo30364K(this.f6992k);
                C4148f.this.f6979s.m30532E0(this.f6992k);
                C4148f.this.f6977q.setPlayer(C4148f.this.f6979s);
                C4148f.this.f6973n0.m41517b(this.f6992k);
                C4148f.this.f6970m.mo24340g(new Handler(), this.f6992k);
                C4148f.this.m32617L0(!fVar.f35896A);
                C4148f.this.f6981u = true;
                C4148f.this.f6979s.m30509Y0(new PlaybackParameters(C4148f.this.f35900E, 1.0f));
            }
            if (C4148f.this.f6981u && C4148f.this.f35910O != null) {
                C4148f.this.f6977q.m32647g();
                if (this.f6992k.f6963h0 != null) {
                    try {
                        X = C4148f.this.m32594X(this.f6992k.f6963h0, this.f6992k.f6964i0, this.f6992k.f6965j0);
                    } catch (C9802l0 e) {
                        if (C7557q0.f16368a < 18) {
                            i = C14527b.f32945a;
                        } else if (e.f21840k == 1) {
                            i = C14527b.f32947c;
                        } else {
                            i = C14527b.f32946b;
                        }
                        C4148f.this.f6966k.m32531f(C4148f.this.getResources().getString(i), e);
                        return;
                    }
                } else {
                    X = null;
                }
                ArrayList b0 = C4148f.this.m32584b0();
                C4148f fVar4 = C4148f.this;
                AbstractC8299u Z = fVar4.m32590Z(fVar4.f35910O, C4148f.this.f35911P, X);
                if (b0.size() != 0) {
                    b0.add(0, Z);
                    Z = new C8243e0((AbstractC8299u[]) b0.toArray(new AbstractC8299u[b0.size()]));
                }
                if (C4148f.this.f6982v != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C4148f.this.f6979s.mo30373F(C4148f.this.f6982v, C4148f.this.f6983w);
                }
                C4148f.this.f6979s.m30519Q0(Z, !z, false);
                C4148f.this.f6981u = false;
                C4148f fVar5 = C4148f.this;
                fVar5.m32548t0(fVar5.f6977q);
                C4148f.this.f6966k.m32524m();
                C4148f.this.f6984x = true;
            }
            C4148f.this.m32555o0();
            C4148f fVar6 = C4148f.this;
            fVar6.m32538z0(fVar6.f6967k0);
            C4148f.this.m32598V();
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        f6955p0 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public C4148f(ThemedReactContext themedReactContext, AbstractC4147e eVar) {
        super(themedReactContext);
        this.f6969l0 = themedReactContext;
        this.f6966k = new C4155h(themedReactContext);
        this.f6968l = eVar;
        this.f6970m = eVar.mo32641b();
        m32569g0();
        this.f6971m0 = (AudioManager) themedReactContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        themedReactContext.addLifecycleEventListener(this);
        this.f6973n0 = new C1257a(themedReactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public void m32617L0(boolean z) {
        SimpleExoPlayer simpleExoPlayer = this.f6979s;
        if (simpleExoPlayer != null) {
            if (z) {
                boolean w0 = m32543w0();
                this.f35899D = w0;
                if (w0) {
                    this.f6979s.mo30305o(true);
                    return;
                }
                return;
            }
            simpleExoPlayer.mo30305o(false);
        }
    }

    /* renamed from: U */
    private void m32600U() {
        if (this.f6979s != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            this.f6972n.setLayoutParams(layoutParams);
            int indexOfChild = indexOfChild(this.f6972n);
            if (indexOfChild != -1) {
                removeViewAt(indexOfChild);
            }
            addView(this.f6972n, 1, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m32598V() {
        m32607Q0(this.f35912Q);
        m32623I0(this.f35898C);
    }

    /* renamed from: W */
    private DataSource.Factory m32596W(boolean z) {
        C6781o oVar;
        ThemedReactContext themedReactContext = this.f6969l0;
        if (z) {
            oVar = this.f6970m;
        } else {
            oVar = null;
        }
        return C4142b.m32657c(themedReactContext, oVar, this.f6961f0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public AbstractC9818x m32594X(UUID uuid, String str, String[] strArr) {
        if (C7557q0.f16368a < 18) {
            return null;
        }
        C9784h0 h0Var = new C9784h0(str, m32592Y(false));
        if (strArr != null) {
            for (int i = 0; i < strArr.length - 1; i += 2) {
                h0Var.m15365e(strArr[i], strArr[i + 1]);
            }
        }
        return new C9785i(uuid, C9776g0.m15393z(uuid), h0Var, null, false, 3);
    }

    /* renamed from: Y */
    private AbstractC5311f.AbstractC5314c m32592Y(boolean z) {
        return C4142b.m32656d(this.f6969l0, z ? this.f6970m : null, this.f6961f0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public AbstractC8299u m32590Z(Uri uri, String str, AbstractC9818x xVar) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = "." + str;
        } else {
            str2 = uri.getLastPathSegment();
        }
        int m0 = C7557q0.m22138m0(str2);
        if (m0 == 0) {
            return new DashMediaSource.Factory(new C5235c.C5236a(this.f6978r), m32596W(false)).m29957e(xVar).m29955g(this.f6968l.mo32642a(this.f35902G)).m29960b(uri);
        }
        if (m0 == 1) {
            return new SsMediaSource.Factory(new C5246a.C0142a(this.f6978r), m32596W(false)).m29844e(xVar).m29842g(this.f6968l.mo32642a(this.f35902G)).m29847b(uri);
        }
        if (m0 == 2) {
            return new HlsMediaSource.Factory(this.f6978r).m29858e(xVar).m29856g(this.f6968l.mo32642a(this.f35902G)).m29861b(uri);
        }
        if (m0 == 3) {
            return new C8264k0.C8266b(this.f6978r).m20136e(xVar).m20134g(this.f6968l.mo32642a(this.f35902G)).m20139b(uri);
        }
        throw new IllegalStateException("Unsupported type: " + m0);
    }

    /* renamed from: a0 */
    private AbstractC8299u m32587a0(String str, Uri uri, String str2, String str3) {
        return new C8296t0.C8298b(this.f6978r).m20006a(uri, C6722k.m24529e(str, str2, -1, str3), -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public ArrayList<AbstractC8299u> m32584b0() {
        String str;
        ArrayList<AbstractC8299u> arrayList = new ArrayList<>();
        if (this.f6956a0 == null) {
            return arrayList;
        }
        for (int i = 0; i < this.f6956a0.size(); i++) {
            ReadableMap map = this.f6956a0.getMap(i);
            String string = map.getString("language");
            if (map.hasKey("title")) {
                str = map.getString("title");
            } else {
                str = string + " " + i;
            }
            AbstractC8299u a0 = m32587a0(str, Uri.parse(map.getString("uri")), map.getString("type"), string);
            if (a0 != null) {
                arrayList.add(a0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r0 != 4) goto L_0x0028;
     */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m32583b1() {
        /*
            r3 = this;
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r3.f6979s
            if (r0 == 0) goto L_0x0025
            int r0 = r0.mo30355P()
            r1 = 1
            if (r0 == r1) goto L_0x0021
            r2 = 2
            if (r0 == r2) goto L_0x0015
            r2 = 3
            if (r0 == r2) goto L_0x0015
            r1 = 4
            if (r0 == r1) goto L_0x0021
            goto L_0x0028
        L_0x0015:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r3.f6979s
            boolean r0 = r0.mo30371G()
            if (r0 != 0) goto L_0x0028
            r3.m32617L0(r1)
            goto L_0x0028
        L_0x0021:
            r3.m32557n0()
            goto L_0x0028
        L_0x0025:
            r3.m32557n0()
        L_0x0028:
            boolean r0 = r3.f6957b0
            if (r0 != 0) goto L_0x0031
            boolean r0 = r3.f6958c0
            r3.setKeepScreenOn(r0)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.C4148f.m32583b1():void");
    }

    /* renamed from: c1 */
    private void m32580c1() {
        this.f6975o0.sendEmptyMessage(1);
    }

    /* renamed from: d0 */
    private void m32578d0() {
        this.f6975o0.removeMessages(1);
    }

    /* renamed from: d1 */
    private void m32577d1() {
        m32550r0();
        m32546u0();
    }

    /* renamed from: e0 */
    private void m32575e0() {
        this.f6982v = -1;
        this.f6983w = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public void m32574e1() {
        if (this.f6979s != null) {
            m32548t0(this.f6972n);
            if (this.f6972n.m29783J()) {
                this.f6972n.m29786G();
            } else {
                this.f6972n.m29777P();
            }
        }
    }

    /* renamed from: f1 */
    private void m32571f1() {
        long j;
        this.f6982v = this.f6979s.mo30311m();
        if (this.f6979s.mo30273h()) {
            j = Math.max(0L, this.f6979s.mo30341Y());
        } else {
            j = -9223372036854775807L;
        }
        this.f6983w = j;
    }

    /* renamed from: g0 */
    private void m32569g0() {
        m32575e0();
        this.f6978r = m32596W(true);
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = f6955p0;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C4144d dVar = new C4144d(getContext());
        this.f6977q = dVar;
        dVar.setLayoutParams(layoutParams);
        addView(this.f6977q, 0, layoutParams);
        this.f35909N = new Handler();
    }

    /* renamed from: g1 */
    private void m32568g1() {
        int i;
        String str;
        if (this.f6984x) {
            int i2 = 0;
            this.f6984x = false;
            m32601T0(this.f35913R, this.f35914S);
            m32595W0(this.f35915T, this.f35916U);
            m32599U0(this.f35917V, this.f35918W);
            C6722k L0 = this.f6979s.m30524L0();
            if (L0 != null) {
                i = L0.f37961A;
            } else {
                i = 0;
            }
            if (L0 != null) {
                i2 = L0.f37962B;
            }
            if (L0 != null) {
                str = L0.f14318k;
            } else {
                str = "-1";
            }
            this.f6966k.m32525l(this.f6979s.getDuration(), this.f6979s.mo30341Y(), i, i2, m32566h0(), m32561k0(), m32558m0(), str);
        }
    }

    /* renamed from: h0 */
    private WritableArray m32566h0() {
        WritableArray createArray = Arguments.createArray();
        AbstractC3419j.C3420a g = this.f6980t.m34424g();
        int l0 = m32559l0(1);
        if (!(g == null || l0 == -1)) {
            TrackGroupArray e = g.m34416e(l0);
            for (int i = 0; i < e.f9362k; i++) {
                C6722k a = e.m29997a(i).m19990a(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                String str = a.f14318k;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                createMap.putString("title", str);
                createMap.putString("type", a.f14329v);
                String str3 = a.f14320m;
                if (str3 == null) {
                    str3 = str2;
                }
                createMap.putString("language", str3);
                int i2 = a.f14325r;
                if (i2 != -1) {
                    str2 = String.format(Locale.US, "%.2fMbps", Float.valueOf(i2 / 1000000.0f));
                }
                createMap.putString("bitrate", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    /* renamed from: i0 */
    private int m32565i0(TrackGroupArray trackGroupArray) {
        if (trackGroupArray.f9362k == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i = 0; i < trackGroupArray.f9362k; i++) {
            String str = trackGroupArray.m29997a(i).m19990a(0).f14320m;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: k0 */
    private WritableArray m32561k0() {
        WritableArray createArray = Arguments.createArray();
        AbstractC3419j.C3420a g = this.f6980t.m34424g();
        int l0 = m32559l0(3);
        if (!(g == null || l0 == -1)) {
            TrackGroupArray e = g.m34416e(l0);
            for (int i = 0; i < e.f9362k; i++) {
                C6722k a = e.m29997a(i).m19990a(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                String str = a.f14318k;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                createMap.putString("title", str);
                createMap.putString("type", a.f14329v);
                String str3 = a.f14320m;
                if (str3 != null) {
                    str2 = str3;
                }
                createMap.putString("language", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    /* renamed from: m0 */
    private WritableArray m32558m0() {
        WritableArray createArray = Arguments.createArray();
        AbstractC3419j.C3420a g = this.f6980t.m34424g();
        int l0 = m32559l0(2);
        if (!(g == null || l0 == -1)) {
            TrackGroupArray e = g.m34416e(l0);
            for (int i = 0; i < e.f9362k; i++) {
                C8302u0 a = e.m29997a(i);
                for (int i2 = 0; i2 < a.f18099k; i2++) {
                    C6722k a2 = a.m19990a(i2);
                    WritableMap createMap = Arguments.createMap();
                    int i3 = a2.f37961A;
                    if (i3 == -1) {
                        i3 = 0;
                    }
                    createMap.putInt("width", i3);
                    int i4 = a2.f37962B;
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    createMap.putInt("height", i4);
                    int i5 = a2.f14325r;
                    if (i5 == -1) {
                        i5 = 0;
                    }
                    createMap.putInt("bitrate", i5);
                    String str = a2.f14326s;
                    if (str == null) {
                        str = "";
                    }
                    createMap.putString("codecs", str);
                    String str2 = a2.f14318k;
                    if (str2 == null) {
                        str2 = String.valueOf(i2);
                    }
                    createMap.putString("trackId", str2);
                    createArray.pushMap(createMap);
                }
            }
        }
        return createArray;
    }

    /* renamed from: n0 */
    private void m32557n0() {
        new Handler().postDelayed(new RunnableC0104f(this), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public void m32555o0() {
        if (this.f6972n == null) {
            this.f6972n = new PlayerControlView(getContext());
        }
        this.f6972n.setPlayer(this.f6979s);
        this.f6972n.m29777P();
        this.f6974o = this.f6972n.findViewById(C14526a.f32944c);
        this.f6977q.setOnClickListener(new View$OnClickListenerC4150b());
        ((ImageButton) this.f6972n.findViewById(C14526a.f32943b)).setOnClickListener(new View$OnClickListenerC4151c());
        ((ImageButton) this.f6972n.findViewById(C14526a.f32942a)).setOnClickListener(new View$OnClickListenerC4152d());
        C4153e eVar = new C4153e();
        this.f6976p = eVar;
        this.f6979s.mo30364K(eVar);
    }

    /* renamed from: p0 */
    private static boolean m32554p0(ExoPlaybackException exoPlaybackException) {
        Log.e("ExoPlayer Exception", exoPlaybackException.toString());
        if (exoPlaybackException.f8953k != 0) {
            return false;
        }
        for (Throwable h = exoPlaybackException.m30554h(); h != null; h = h.getCause()) {
            if ((h instanceof C8232b) || (h instanceof AbstractC5311f.C5315d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q0 */
    private void m32552q0(boolean z) {
        if (this.f35897B != z) {
            this.f35897B = z;
            if (z) {
                this.f6966k.m32533d(true);
            } else {
                this.f6966k.m32533d(false);
            }
        }
    }

    /* renamed from: r0 */
    private void m32550r0() {
        if (this.f6985y) {
            m32631E0(false);
        }
        this.f6971m0.abandonAudioFocus(this);
    }

    /* renamed from: s0 */
    private void m32549s0() {
        SimpleExoPlayer simpleExoPlayer = this.f6979s;
        if (simpleExoPlayer != null && simpleExoPlayer.mo30371G()) {
            m32617L0(false);
        }
        setKeepScreenOn(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public void m32548t0(View view) {
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: u0 */
    private void m32546u0() {
        if (this.f6979s != null) {
            m32571f1();
            this.f6979s.m30518R0();
            this.f6979s.m30517S0(this);
            this.f6980t = null;
            this.f6979s = null;
        }
        this.f6975o0.removeMessages(1);
        this.f6969l0.removeLifecycleEventListener(this);
        this.f6973n0.m41518a();
        this.f6970m.mo24343a(this);
    }

    /* renamed from: v0 */
    private void m32545v0() {
        this.f6981u = true;
        m32557n0();
    }

    /* renamed from: w0 */
    private boolean m32543w0() {
        if (this.f6957b0 || this.f35910O == null || this.f35899D || this.f6971m0.requestAudioFocus(this, 3, 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public void m32639A0(boolean z) {
        this.f6957b0 = z;
    }

    /* renamed from: B0 */
    public void m32637B0(String[] strArr) {
        this.f6965j0 = strArr;
    }

    /* renamed from: C0 */
    public void m32635C0(String str) {
        this.f6964i0 = str;
    }

    /* renamed from: D0 */
    public void m32633D0(UUID uuid) {
        this.f6963h0 = uuid;
    }

    /* renamed from: E0 */
    public void m32631E0(boolean z) {
        int i;
        if (z != this.f6985y) {
            this.f6985y = z;
            Activity currentActivity = this.f6969l0.getCurrentActivity();
            if (currentActivity != null) {
                View decorView = currentActivity.getWindow().getDecorView();
                if (this.f6985y) {
                    if (C7557q0.f16368a >= 19) {
                        i = 4102;
                    } else {
                        i = 6;
                    }
                    this.f6966k.m32527j();
                    decorView.setSystemUiVisibility(i);
                    this.f6966k.m32529h();
                    return;
                }
                this.f6966k.m32528i();
                decorView.setSystemUiVisibility(0);
                this.f6966k.m32530g();
            }
        }
    }

    /* renamed from: F0 */
    public void m32629F0(boolean z) {
        this.f6977q.setHideShutterView(z);
    }

    /* renamed from: G0 */
    public void m32627G0(int i) {
        this.f35903H = i;
        if (this.f6979s != null) {
            C3405f fVar = this.f6980t;
            C3405f.C3411e o = fVar.m34481o();
            int i2 = this.f35903H;
            if (i2 == 0) {
                i2 = ViewDefaults.NUMBER_OF_LINES;
            }
            fVar.m34486N(o.m34450g(i2));
        }
    }

    /* renamed from: H0 */
    public void m32625H0(int i) {
        this.f35902G = i;
        m32546u0();
        m32557n0();
    }

    /* renamed from: I0 */
    public void m32623I0(boolean z) {
        float f;
        this.f35898C = z;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.f35901F = f;
        SimpleExoPlayer simpleExoPlayer = this.f6979s;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.m30502d1(f);
        }
    }

    /* renamed from: J0 */
    public void m32621J0(boolean z) {
        this.f35896A = z;
        if (this.f6979s == null) {
            return;
        }
        if (!z) {
            m32583b1();
        } else {
            m32549s0();
        }
    }

    /* renamed from: K0 */
    public void m32619K0(boolean z) {
        this.f6960e0 = z;
    }

    /* renamed from: M0 */
    public void m32615M0(boolean z) {
        this.f6958c0 = z;
    }

    /* renamed from: N0 */
    public void m32613N0(float f) {
        this.f6959d0 = f;
    }

    /* renamed from: O0 */
    public void m32611O0(float f) {
        this.f35900E = f;
        if (this.f6979s != null) {
            this.f6979s.m30509Y0(new PlaybackParameters(this.f35900E, 1.0f));
        }
    }

    /* renamed from: P0 */
    public void m32609P0(Uri uri, String str) {
        if (uri != null) {
            boolean equals = uri.equals(this.f35910O);
            this.f35910O = uri;
            this.f35911P = str;
            this.f6978r = m32596W(true);
            if (!equals) {
                m32545v0();
            }
        }
    }

    /* renamed from: Q0 */
    public void m32607Q0(boolean z) {
        SimpleExoPlayer simpleExoPlayer = this.f6979s;
        if (simpleExoPlayer != null) {
            if (z) {
                simpleExoPlayer.mo30352R(1);
            } else {
                simpleExoPlayer.mo30352R(0);
            }
        }
        this.f35912Q = z;
    }

    /* renamed from: R0 */
    public void m32605R0(boolean z) {
        this.f6962g0 = z;
    }

    /* renamed from: S0 */
    public void m32603S0(int i) {
        this.f6977q.setResizeMode(i);
    }

    /* renamed from: T0 */
    public void m32601T0(String str, Dynamic dynamic) {
        this.f35913R = str;
        this.f35914S = dynamic;
        m32597V0(1, str, dynamic);
    }

    /* renamed from: U0 */
    public void m32599U0(String str, Dynamic dynamic) {
        this.f35917V = str;
        this.f35918W = dynamic;
        m32597V0(3, str, dynamic);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a A[LOOP:4: B:75:0x0116->B:77:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m32597V0(int r11, java.lang.String r12, com.facebook.react.bridge.Dynamic r13) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.C4148f.m32597V0(int, java.lang.String, com.facebook.react.bridge.Dynamic):void");
    }

    /* renamed from: W0 */
    public void m32595W0(String str, Dynamic dynamic) {
        this.f35915T = str;
        this.f35916U = dynamic;
        m32597V0(2, str, dynamic);
    }

    /* renamed from: X0 */
    public void m32593X0(Uri uri, String str, Map<String, String> map) {
        if (uri != null) {
            boolean equals = uri.equals(this.f35910O);
            this.f35910O = uri;
            this.f35911P = str;
            this.f6961f0 = map;
            this.f6978r = C4142b.m32657c(this.f6969l0, this.f6970m, map);
            if (!equals) {
                m32545v0();
            }
        }
    }

    /* renamed from: Y0 */
    public void m32591Y0(ReadableArray readableArray) {
        this.f6956a0 = readableArray;
        m32545v0();
    }

    /* renamed from: Z0 */
    public void m32589Z0(boolean z) {
        boolean z2;
        if (!z || this.f6963h0 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f6977q.setUseTextureView(z2);
    }

    /* renamed from: a1 */
    public void m32586a1(float f) {
        this.f35901F = f;
        SimpleExoPlayer simpleExoPlayer = this.f6979s;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.m30502d1(f);
        }
    }

    @Override // p004a3.AbstractC1258b
    /* renamed from: b */
    public void mo32585b() {
        this.f6966k.m32536a();
    }

    /* renamed from: c0 */
    public void m32581c0() {
        m32577d1();
    }

    /* renamed from: f0 */
    public void m32572f0() {
        if (this.f35910O != null) {
            this.f6979s.m30500e1(true);
            this.f35910O = null;
            this.f35911P = null;
            this.f6961f0 = null;
            this.f6978r = null;
            m32575e0();
        }
    }

    @Override // p081e9.AbstractC6769e.AbstractC6770a
    /* renamed from: i */
    public void mo23555i(int i, long j, long j2) {
        int i2;
        String str;
        if (this.f6962g0) {
            SimpleExoPlayer simpleExoPlayer = this.f6979s;
            if (simpleExoPlayer == null) {
                this.f6966k.m32534c(j2, 0, 0, "-1");
                return;
            }
            C6722k L0 = simpleExoPlayer.m30524L0();
            int i3 = 0;
            if (L0 != null) {
                i2 = L0.f37961A;
            } else {
                i2 = 0;
            }
            if (L0 != null) {
                i3 = L0.f37962B;
            }
            if (L0 != null) {
                str = L0.f14318k;
            } else {
                str = "-1";
            }
            this.f6966k.m32534c(j2, i3, i2, str);
        }
    }

    /* renamed from: j0 */
    public double m32563j0(long j) {
        Timeline.C5161c cVar = new Timeline.C5161c();
        if (!this.f6979s.mo30287w().m30435q()) {
            this.f6979s.mo30287w().m30436n(this.f6979s.mo30311m(), cVar);
        }
        return cVar.f9095f + j;
    }

    /* renamed from: l0 */
    public int m32559l0(int i) {
        SimpleExoPlayer simpleExoPlayer = this.f6979s;
        if (simpleExoPlayer == null) {
            return -1;
        }
        int K0 = simpleExoPlayer.m30525K0();
        for (int i2 = 0; i2 < K0; i2++) {
            if (this.f6979s.mo30377D(i2) == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: m */
    public /* synthetic */ void mo15305m(int i, AbstractC8299u.C8300a aVar) {
        C9808o.m15306b(this, i, aVar);
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: n */
    public void mo15304n(int i, AbstractC8299u.C8300a aVar) {
        Log.d("DRM Info", "onDrmKeysRestored");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m32557n0();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == -2) {
            this.f6966k.m32535b(false);
        } else if (i == -1) {
            this.f35899D = false;
            this.f6966k.m32535b(false);
            m32549s0();
            this.f6971m0.abandonAudioFocus(this);
        } else if (i == 1) {
            this.f35899D = true;
            this.f6966k.m32535b(true);
        }
        SimpleExoPlayer simpleExoPlayer = this.f6979s;
        if (simpleExoPlayer == null) {
            return;
        }
        if (i == -3) {
            if (!this.f35898C) {
                simpleExoPlayer.m30502d1(this.f35901F * 0.8f);
            }
        } else if (i == 1 && !this.f35898C) {
            simpleExoPlayer.m30502d1(this.f35901F * 1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
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
    public /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
        C6730q.m24449c(this, z);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        m32577d1();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f6986z = true;
        if (!this.f6960e0) {
            m32617L0(false);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (!this.f6960e0 || !this.f6986z) {
            m32617L0(!this.f35896A);
        }
        this.f6986z = false;
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        C6730q.m24448d(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onIsPlayingChanged(boolean z) {
        C6730q.m24447e(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        C6730q.m24445g(this, mediaItem, i);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        C6730q.m24444h(this, z, i);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.f6966k.m32523n(playbackParameters.f9029a);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onPlaybackStateChanged(int i) {
        C6730q.m24442j(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        C6730q.m24441k(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String str = "ExoPlaybackException type : " + exoPlaybackException.f8953k;
        int i = exoPlaybackException.f8953k;
        if (i == 1) {
            Exception g = exoPlaybackException.m30555g();
            if (g instanceof AbstractC14289n.C14290a) {
                AbstractC14289n.C14290a aVar = (AbstractC14289n.C14290a) g;
                str = aVar.f32347m.f32304a == null ? aVar.getCause() instanceof C14300x.C14303c ? getResources().getString(C14527b.f32951g) : aVar.f32346l ? getResources().getString(C14527b.f32950f, aVar.f32345k) : getResources().getString(C14527b.f32949e, aVar.f32345k) : getResources().getString(C14527b.f32948d, aVar.f32347m.f32304a);
            }
        } else if (i == 0) {
            str = getResources().getString(C14527b.f32952h);
        }
        this.f6966k.m32531f(str, exoPlaybackException);
        this.f6981u = true;
        if (m32554p0(exoPlaybackException)) {
            m32575e0();
            m32557n0();
            return;
        }
        m32571f1();
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onPlayerStateChanged(boolean z, int i) {
        String str;
        String str2 = "onStateChanged: playWhenReady=" + z + ", playbackState=";
        if (i == 1) {
            String str3 = str2 + "idle";
            this.f6966k.m32526k();
            m32578d0();
            if (!z) {
                setKeepScreenOn(false);
            }
            str = str3;
        } else if (i == 2) {
            str = str2 + "buffering";
            m32552q0(true);
            m32578d0();
            setKeepScreenOn(this.f6958c0);
        } else if (i == 3) {
            str = str2 + "ready";
            this.f6966k.m32521p();
            m32552q0(false);
            m32580c1();
            m32568g1();
            PlayerControlView playerControlView = this.f6972n;
            if (playerControlView != null) {
                playerControlView.m29777P();
            }
            setKeepScreenOn(this.f6958c0);
        } else if (i != 4) {
            str = str2 + "unknown";
        } else {
            str = str2 + "ended";
            this.f6966k.m32532e();
            m32550r0();
            setKeepScreenOn(false);
        }
        Log.d("ReactExoplayerView", str);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onPositionDiscontinuity(int i) {
        if (this.f6981u) {
            m32571f1();
        }
        if (i == 0 && this.f6979s.mo30348U() == 1) {
            this.f6966k.m32532e();
        }
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onSeekProcessed() {
        this.f6966k.m32519r(this.f6979s.mo30341Y(), this.f35904I);
        this.f35904I = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onStaticMetadataChanged(List list) {
        C6730q.m24434r(this, list);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        C6730q.m24433s(this, timeline, i);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onTimelineChanged(Timeline timeline, Object obj, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: p */
    public void mo15303p(int i, AbstractC8299u.C8300a aVar) {
        Log.d("DRM Info", "onDrmKeysLoaded");
    }

    @Override // p459z7.AbstractC14583f
    /* renamed from: s */
    public void mo174s(C14576a aVar) {
        this.f6966k.m32517t(aVar);
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        this.f6966k.m32518s(i);
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: t */
    public void mo15302t(int i, AbstractC8299u.C8300a aVar, Exception exc) {
        Log.d("DRM Info", "onDrmSessionManagerError");
        this.f6966k.m32531f("onDrmSessionManagerError", exc);
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: v */
    public void mo15301v(int i, AbstractC8299u.C8300a aVar) {
        Log.d("DRM Info", "onDrmKeysRemoved");
    }

    /* renamed from: x0 */
    public void m32541x0(long j) {
        SimpleExoPlayer simpleExoPlayer = this.f6979s;
        if (simpleExoPlayer != null) {
            this.f35904I = j;
            simpleExoPlayer.m30274c0(j);
        }
    }

    /* renamed from: y0 */
    public void m32539y0(int i, int i2, int i3, int i4) {
        this.f35905J = i;
        this.f35906K = i2;
        this.f35907L = i3;
        this.f35908M = i4;
        m32546u0();
        m32557n0();
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: z */
    public /* synthetic */ void mo15300z(int i, AbstractC8299u.C8300a aVar) {
        C9808o.m15307a(this, i, aVar);
    }

    /* renamed from: z0 */
    public void m32538z0(boolean z) {
        this.f6967k0 = z;
        if (this.f6979s != null && this.f6977q != null) {
            if (z) {
                m32600U();
                return;
            }
            int indexOfChild = indexOfChild(this.f6972n);
            if (indexOfChild != -1) {
                removeViewAt(indexOfChild);
            }
        }
    }
}
