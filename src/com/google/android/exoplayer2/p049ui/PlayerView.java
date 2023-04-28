package com.google.android.exoplayer2.p049ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C2337a;
import cc.AbstractC3884i0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p049ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.p049ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.ArrayList;
import java.util.List;
import p041c8.C3778a;
import p042c9.C3786f;
import p042c9.C3787g;
import p042c9.C3788h;
import p042c9.C3790j;
import p042c9.C3791k;
import p042c9.C3792l;
import p062d9.AbstractC6411e;
import p062d9.C6414h;
import p079e7.AbstractC6714d;
import p079e7.AbstractC6729p;
import p079e7.C6730q;
import p080e8.C6738a;
import p119g9.AbstractC7539j;
import p119g9.C7510a;
import p119g9.C7557q0;
import p133h9.AbstractC7965q;
import p133h9.C7956j;
import p133h9.C7964p;
import p173j8.AbstractC9505c;
import p173j8.C9504b;
import p173j8.C9506d;
import p317r8.AbstractC12465l;
import p317r8.C12453b;
import p459z7.C14576a;

/* renamed from: com.google.android.exoplayer2.ui.PlayerView */
/* loaded from: classes5.dex */
public class PlayerView extends FrameLayout implements AbstractC9505c {

    /* renamed from: A */
    private int f37342A;

    /* renamed from: B */
    private boolean f37343B;

    /* renamed from: C */
    private boolean f37344C;

    /* renamed from: D */
    private CharSequence f37345D;

    /* renamed from: E */
    private int f37346E;

    /* renamed from: F */
    private boolean f37347F;

    /* renamed from: G */
    private boolean f37348G;

    /* renamed from: H */
    private boolean f37349H;

    /* renamed from: I */
    private int f37350I;

    /* renamed from: J */
    private boolean f37351J;

    /* renamed from: k */
    private final View$OnLayoutChangeListenerC5266a f9614k;

    /* renamed from: l */
    private final AspectRatioFrameLayout f9615l;

    /* renamed from: m */
    private final View f9616m;

    /* renamed from: n */
    private final View f9617n;

    /* renamed from: o */
    private final ImageView f9618o;

    /* renamed from: p */
    private final SubtitleView f9619p;

    /* renamed from: q */
    private final View f9620q;

    /* renamed from: r */
    private final TextView f9621r;

    /* renamed from: s */
    private final PlayerControlView f9622s;

    /* renamed from: t */
    private final FrameLayout f9623t;

    /* renamed from: u */
    private final FrameLayout f9624u;

    /* renamed from: v */
    private Player f9625v;

    /* renamed from: w */
    private boolean f9626w;

    /* renamed from: x */
    private PlayerControlView.AbstractC5265d f9627x;

    /* renamed from: y */
    private boolean f9628y;

    /* renamed from: z */
    private Drawable f9629z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$a */
    /* loaded from: classes5.dex */
    public final class View$OnLayoutChangeListenerC5266a implements Player.AbstractC5153a, AbstractC12465l, AbstractC7965q, View.OnLayoutChangeListener, AbstractC6411e, PlayerControlView.AbstractC5265d {

        /* renamed from: k */
        private final Timeline.C5160b f9630k = new Timeline.C5160b();

        /* renamed from: l */
        private Object f9631l;

        public View$OnLayoutChangeListenerC5266a() {
        }

        @Override // com.google.android.exoplayer2.p049ui.PlayerControlView.AbstractC5265d
        /* renamed from: a */
        public void mo29701a(int i) {
            PlayerView.this.m29733J();
        }

        @Override // p133h9.AbstractC7965q
        /* renamed from: d */
        public void mo20981d(int i, int i2, int i3, float f) {
            float f2;
            if (i2 == 0 || i == 0) {
                f2 = 1.0f;
            } else {
                f2 = (i * f) / i2;
            }
            if (PlayerView.this.f9617n instanceof TextureView) {
                if (i3 == 90 || i3 == 270) {
                    f2 = 1.0f / f2;
                }
                if (PlayerView.this.f37350I != 0) {
                    PlayerView.this.f9617n.removeOnLayoutChangeListener(this);
                }
                PlayerView.this.f37350I = i3;
                if (PlayerView.this.f37350I != 0) {
                    PlayerView.this.f9617n.addOnLayoutChangeListener(this);
                }
                PlayerView.m29711q((TextureView) PlayerView.this.f9617n, PlayerView.this.f37350I);
            }
            PlayerView playerView = PlayerView.this;
            playerView.m29742A(f2, playerView.f9615l, PlayerView.this.f9617n);
        }

        @Override // p133h9.AbstractC7965q
        /* renamed from: e */
        public void mo20980e() {
            if (PlayerView.this.f9616m != null) {
                PlayerView.this.f9616m.setVisibility(4);
            }
        }

        @Override // p133h9.AbstractC7965q
        /* renamed from: f */
        public /* synthetic */ void mo20979f(int i, int i2) {
            C7964p.m20982a(this, i, i2);
        }

        @Override // p317r8.AbstractC12465l
        /* renamed from: n */
        public void mo6665n(List<C12453b> list) {
            if (PlayerView.this.f9619p != null) {
                PlayerView.this.f9619p.mo6665n(list);
            }
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

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m29711q((TextureView) view, PlayerView.this.f37350I);
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
            PlayerView.this.m29734I();
            PlayerView.this.m29732K();
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C6730q.m24443i(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onPlaybackStateChanged(int i) {
            PlayerView.this.m29734I();
            PlayerView.this.m29731L();
            PlayerView.this.m29732K();
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
        public void onPositionDiscontinuity(int i) {
            if (PlayerView.this.m29703y() && PlayerView.this.f37348G) {
                PlayerView.this.m29705w();
            }
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

        @Override // p062d9.AbstractC6411e
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return PlayerView.this.m29735H();
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
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            Player player = (Player) C7510a.m22367e(PlayerView.this.f9625v);
            Timeline w = player.mo30287w();
            if (w.m30435q()) {
                this.f9631l = null;
            } else if (!player.mo30289v().m29995e()) {
                this.f9631l = w.mo20026g(player.mo30367I(), this.f9630k, true).f9083b;
            } else {
                Object obj = this.f9631l;
                if (obj != null) {
                    int b = w.mo20027b(obj);
                    if (b != -1) {
                        if (player.mo30311m() == w.m30439f(b, this.f9630k).f9084c) {
                            return;
                        }
                    }
                    this.f9631l = null;
                }
            }
            PlayerView.this.m29730M(false);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private boolean m29741B(C14576a aVar) {
        byte[] bArr;
        int i;
        boolean z = false;
        int i2 = -1;
        for (int i3 = 0; i3 < aVar.m183f(); i3++) {
            C14576a.AbstractC14577b e = aVar.m184e(i3);
            if (e instanceof C6738a) {
                C6738a aVar2 = (C6738a) e;
                bArr = aVar2.f14377o;
                i = aVar2.f14376n;
            } else if (e instanceof C3778a) {
                C3778a aVar3 = (C3778a) e;
                bArr = aVar3.f6197r;
                i = aVar3.f6190k;
            } else {
                continue;
            }
            if (i2 == -1 || i == 3) {
                z = m29740C(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                if (i == 3) {
                    break;
                }
                i2 = i;
            }
        }
        return z;
    }

    /* renamed from: C */
    private boolean m29740C(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                m29742A(intrinsicWidth / intrinsicHeight, this.f9615l, this.f9618o);
                this.f9618o.setImageDrawable(drawable);
                this.f9618o.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    private static void m29739D(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* renamed from: E */
    private boolean m29738E() {
        Player player = this.f9625v;
        if (player == null) {
            return true;
        }
        int P = player.mo30355P();
        if (!this.f37347F || (P != 1 && P != 4 && this.f9625v.mo30371G())) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private void m29736G(boolean z) {
        int i;
        if (m29728O()) {
            PlayerControlView playerControlView = this.f9622s;
            if (z) {
                i = 0;
            } else {
                i = this.f37346E;
            }
            playerControlView.setShowTimeoutMs(i);
            this.f9622s.m29777P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public boolean m29735H() {
        if (!m29728O() || this.f9625v == null) {
            return false;
        }
        if (!this.f9622s.m29783J()) {
            m29702z(true);
        } else if (this.f37349H) {
            this.f9622s.m29786G();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r4.f9625v.mo30371G() == false) goto L_0x0020;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m29734I() {
        /*
            r4 = this;
            android.view.View r0 = r4.f9620q
            if (r0 == 0) goto L_0x002b
            com.google.android.exoplayer2.Player r0 = r4.f9625v
            r1 = 0
            if (r0 == 0) goto L_0x0020
            int r0 = r0.mo30355P()
            r2 = 2
            if (r0 != r2) goto L_0x0020
            int r0 = r4.f37342A
            r3 = 1
            if (r0 == r2) goto L_0x0021
            if (r0 != r3) goto L_0x0020
            com.google.android.exoplayer2.Player r0 = r4.f9625v
            boolean r0 = r0.mo30371G()
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            android.view.View r0 = r4.f9620q
            if (r3 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = 8
        L_0x0028:
            r0.setVisibility(r1)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.PlayerView.m29734I():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m29733J() {
        PlayerControlView playerControlView = this.f9622s;
        String str = null;
        if (playerControlView == null || !this.f9626w) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            if (this.f37349H) {
                str = getResources().getString(C3791k.f6240a);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(C3791k.f6244e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m29732K() {
        if (!m29703y() || !this.f37348G) {
            m29702z(false);
        } else {
            m29705w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m29731L() {
        TextView textView = this.f9621r;
        if (textView != null) {
            CharSequence charSequence = this.f37345D;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f9621r.setVisibility(0);
                return;
            }
            Player player = this.f9625v;
            if (player != null) {
                player.mo30308n();
            }
            this.f9621r.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m29730M(boolean z) {
        Player player = this.f9625v;
        if (player != null && !player.mo30289v().m29995e()) {
            if (z && !this.f37343B) {
                m29710r();
            }
            TrackSelectionArray B = player.mo30380B();
            for (int i = 0; i < B.f9544a; i++) {
                if (player.mo30377D(i) == 2 && B.m29828a(i) != null) {
                    m29706v();
                    return;
                }
            }
            m29710r();
            if (m29729N()) {
                for (C14576a aVar : player.mo30325g()) {
                    if (m29741B(aVar)) {
                        return;
                    }
                }
                if (m29740C(this.f9629z)) {
                    return;
                }
            }
            m29706v();
        } else if (!this.f37343B) {
            m29706v();
            m29710r();
        }
    }

    /* renamed from: N */
    private boolean m29729N() {
        if (!this.f9628y) {
            return false;
        }
        C7510a.m22364h(this.f9618o);
        return true;
    }

    /* renamed from: O */
    private boolean m29728O() {
        if (!this.f9626w) {
            return false;
        }
        C7510a.m22364h(this.f9622s);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m29711q(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f || i == 0)) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: r */
    private void m29710r() {
        View view = this.f9616m;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: s */
    private static void m29709s(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C3787g.f6211f));
        imageView.setBackgroundColor(resources.getColor(C3786f.f6205a));
    }

    /* renamed from: t */
    private static void m29708t(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C3787g.f6211f, null));
        imageView.setBackgroundColor(resources.getColor(C3786f.f6205a, null));
    }

    /* renamed from: v */
    private void m29706v() {
        ImageView imageView = this.f9618o;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f9618o.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: x */
    private boolean m29704x(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public boolean m29703y() {
        Player player = this.f9625v;
        return player != null && player.mo30333d() && this.f9625v.mo30371G();
    }

    /* renamed from: z */
    private void m29702z(boolean z) {
        boolean z2;
        if ((!m29703y() || !this.f37348G) && m29728O()) {
            if (!this.f9622s.m29783J() || this.f9622s.getShowTimeoutMs() > 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean E = m29738E();
            if (z || z2 || E) {
                m29736G(E);
            }
        }
    }

    /* renamed from: A */
    protected void m29742A(float f, AspectRatioFrameLayout aspectRatioFrameLayout, View view) {
        if (aspectRatioFrameLayout != null) {
            if (view instanceof C6414h) {
                f = 0.0f;
            }
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* renamed from: F */
    public void m29737F() {
        m29736G(m29738E());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.f9625v;
        if (player != null && player.mo30333d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean x = m29704x(keyEvent.getKeyCode());
        if (x && m29728O() && !this.f9622s.m29783J()) {
            m29702z(true);
            return true;
        } else if (m29707u(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            m29702z(true);
            return true;
        } else {
            if (x && m29728O()) {
                m29702z(true);
            }
            return false;
        }
    }

    public List<C9506d> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f9624u;
        if (frameLayout != null) {
            arrayList.add(new C9506d(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f9622s;
        if (playerControlView != null) {
            arrayList.add(new C9506d(playerControlView, 0));
        }
        return AbstractC3884i0.m33401u(arrayList);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ View[] getAdOverlayViews() {
        return C9504b.m16115a(this);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C7510a.m22363i(this.f9623t, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f37347F;
    }

    public boolean getControllerHideOnTouch() {
        return this.f37349H;
    }

    public int getControllerShowTimeoutMs() {
        return this.f37346E;
    }

    public Drawable getDefaultArtwork() {
        return this.f9629z;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f9624u;
    }

    public Player getPlayer() {
        return this.f9625v;
    }

    public int getResizeMode() {
        C7510a.m22364h(this.f9615l);
        return this.f9615l.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f9619p;
    }

    public boolean getUseArtwork() {
        return this.f9628y;
    }

    public boolean getUseController() {
        return this.f9626w;
    }

    public View getVideoSurfaceView() {
        return this.f9617n;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m29728O() || this.f9625v == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f37351J = true;
            return true;
        } else if (action != 1 || !this.f37351J) {
            return false;
        } else {
            this.f37351J = false;
            performClick();
            return true;
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m29728O() || this.f9625v == null) {
            return false;
        }
        m29702z(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return m29735H();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.AbstractC5260b bVar) {
        C7510a.m22364h(this.f9615l);
        this.f9615l.setAspectRatioListener(bVar);
    }

    public void setControlDispatcher(AbstractC6714d dVar) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setControlDispatcher(dVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.f37347F = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f37348G = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C7510a.m22364h(this.f9622s);
        this.f37349H = z;
        m29733J();
    }

    public void setControllerShowTimeoutMs(int i) {
        C7510a.m22364h(this.f9622s);
        this.f37346E = i;
        if (this.f9622s.m29783J()) {
            m29737F();
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.AbstractC5265d dVar) {
        C7510a.m22364h(this.f9622s);
        PlayerControlView.AbstractC5265d dVar2 = this.f9627x;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                this.f9622s.m29782K(dVar2);
            }
            this.f9627x = dVar;
            if (dVar != null) {
                this.f9622s.m29743z(dVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z;
        if (this.f9621r != null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        this.f37345D = charSequence;
        m29731L();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f9629z != drawable) {
            this.f9629z = drawable;
            m29730M(false);
        }
    }

    public void setErrorMessageProvider(AbstractC7539j<? super ExoPlaybackException> jVar) {
        if (jVar != null) {
            m29731L();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setFastForwardIncrementMs(i);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f37343B != z) {
            this.f37343B = z;
            m29730M(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(AbstractC6729p pVar) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setPlaybackPreparer(pVar);
    }

    public void setPlayer(Player player) {
        boolean z;
        boolean z2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (player == null || player.mo30285x() == Looper.getMainLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7510a.m22371a(z2);
        Player player2 = this.f9625v;
        if (player2 != player) {
            if (player2 != null) {
                player2.mo30314l(this.f9614k);
                Player.AbstractC5155c p = player2.mo30302p();
                if (p != null) {
                    p.mo30512W(this.f9614k);
                    View view = this.f9617n;
                    if (view instanceof TextureView) {
                        p.mo30527J((TextureView) view);
                    } else if (view instanceof C6414h) {
                        ((C6414h) view).setVideoComponent(null);
                    } else if (view instanceof SurfaceView) {
                        p.mo30516T((SurfaceView) view);
                    }
                }
                Player.AbstractC5154b E = player2.mo30375E();
                if (E != null) {
                    E.mo30492i(this.f9614k);
                }
            }
            SubtitleView subtitleView = this.f9619p;
            if (subtitleView != null) {
                subtitleView.setCues(null);
            }
            this.f9625v = player;
            if (m29728O()) {
                this.f9622s.setPlayer(player);
            }
            m29734I();
            m29731L();
            m29730M(true);
            if (player != null) {
                Player.AbstractC5155c p2 = player.mo30302p();
                if (p2 != null) {
                    View view2 = this.f9617n;
                    if (view2 instanceof TextureView) {
                        p2.mo30538A((TextureView) view2);
                    } else if (view2 instanceof C6414h) {
                        ((C6414h) view2).setVideoComponent(p2);
                    } else if (view2 instanceof SurfaceView) {
                        p2.mo30490j((SurfaceView) view2);
                    }
                    p2.mo30481q(this.f9614k);
                }
                Player.AbstractC5154b E2 = player.mo30375E();
                if (E2 != null) {
                    E2.mo30535C(this.f9614k);
                    SubtitleView subtitleView2 = this.f9619p;
                    if (subtitleView2 != null) {
                        subtitleView2.setCues(E2.mo30477s());
                    }
                }
                player.mo30364K(this.f9614k);
                m29702z(false);
                return;
            }
            m29705w();
        }
    }

    public void setRepeatToggleModes(int i) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C7510a.m22364h(this.f9615l);
        this.f9615l.setResizeMode(i);
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setRewindIncrementMs(i);
    }

    public void setShowBuffering(int i) {
        if (this.f37342A != i) {
            this.f37342A = i;
            m29734I();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C7510a.m22364h(this.f9622s);
        this.f9622s.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f9616m;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        boolean z2;
        if (!z || this.f9618o != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7510a.m22366f(z2);
        if (this.f9628y != z) {
            this.f9628y = z;
            m29730M(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2;
        if (!z || this.f9622s != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7510a.m22366f(z2);
        if (this.f9626w != z) {
            this.f9626w = z;
            if (m29728O()) {
                this.f9622s.setPlayer(this.f9625v);
            } else {
                PlayerControlView playerControlView = this.f9622s;
                if (playerControlView != null) {
                    playerControlView.m29786G();
                    this.f9622s.setPlayer(null);
                }
            }
            m29733J();
        }
    }

    public void setUseSensorRotation(boolean z) {
        if (this.f37344C != z) {
            this.f37344C = z;
            View view = this.f9617n;
            if (view instanceof C6414h) {
                ((C6414h) view).setUseSensorRotation(z);
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f9617n;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* renamed from: u */
    public boolean m29707u(KeyEvent keyEvent) {
        return m29728O() && this.f9622s.m29791B(keyEvent);
    }

    /* renamed from: w */
    public void m29705w() {
        PlayerControlView playerControlView = this.f9622s;
        if (playerControlView != null) {
            playerControlView.m29786G();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        int i8;
        View$OnLayoutChangeListenerC5266a aVar = new View$OnLayoutChangeListenerC5266a();
        this.f9614k = aVar;
        if (isInEditMode()) {
            this.f9615l = null;
            this.f9616m = null;
            this.f9617n = null;
            this.f9618o = null;
            this.f9619p = null;
            this.f9620q = null;
            this.f9621r = null;
            this.f9622s = null;
            this.f9623t = null;
            this.f9624u = null;
            ImageView imageView = new ImageView(context);
            if (C7557q0.f16368a >= 23) {
                m29708t(getResources(), imageView);
            } else {
                m29709s(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i9 = C3790j.f6239c;
        this.f37344C = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3792l.f35878I, 0, 0);
            try {
                int i10 = C3792l.f35888S;
                z3 = obtainStyledAttributes.hasValue(i10);
                int color = obtainStyledAttributes.getColor(i10, 0);
                i9 = obtainStyledAttributes.getResourceId(C3792l.f35884O, i9);
                z2 = obtainStyledAttributes.getBoolean(C3792l.f35890U, true);
                int resourceId = obtainStyledAttributes.getResourceId(C3792l.f35880K, 0);
                z = obtainStyledAttributes.getBoolean(C3792l.f35891V, true);
                i4 = obtainStyledAttributes.getInt(C3792l.f35889T, 1);
                i5 = obtainStyledAttributes.getInt(C3792l.f35885P, 0);
                int i11 = obtainStyledAttributes.getInt(C3792l.f35887R, 5000);
                boolean z7 = obtainStyledAttributes.getBoolean(C3792l.f35882M, true);
                z6 = obtainStyledAttributes.getBoolean(C3792l.f35879J, true);
                i6 = obtainStyledAttributes.getInteger(C3792l.f35886Q, 0);
                this.f37343B = obtainStyledAttributes.getBoolean(C3792l.f35883N, this.f37343B);
                boolean z8 = obtainStyledAttributes.getBoolean(C3792l.f35881L, true);
                this.f37344C = obtainStyledAttributes.getBoolean(C3792l.f35892W, this.f37344C);
                obtainStyledAttributes.recycle();
                z4 = z7;
                z5 = z8;
                i8 = i11;
                i2 = resourceId;
                i3 = color;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i8 = 5000;
            z6 = true;
            i6 = 0;
            z5 = true;
            i5 = 0;
            z4 = true;
            i4 = 1;
            i3 = 0;
            z3 = false;
            z2 = true;
            i2 = 0;
            z = true;
        }
        LayoutInflater.from(context).inflate(i9, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(C3788h.f6215d);
        this.f9615l = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            m29739D(aspectRatioFrameLayout, i5);
        }
        View findViewById = findViewById(C3788h.f6232u);
        this.f9616m = findViewById;
        if (findViewById != null && z3) {
            findViewById.setBackgroundColor(i3);
        }
        if (aspectRatioFrameLayout == null || i4 == 0) {
            this.f9617n = null;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                this.f9617n = new TextureView(context);
            } else if (i4 == 3) {
                C6414h hVar = new C6414h(context);
                hVar.setSingleTapListener(aVar);
                hVar.setUseSensorRotation(this.f37344C);
                this.f9617n = hVar;
            } else if (i4 != 4) {
                this.f9617n = new SurfaceView(context);
            } else {
                this.f9617n = new C7956j(context);
            }
            this.f9617n.setLayoutParams(layoutParams);
            aspectRatioFrameLayout.addView(this.f9617n, 0);
        }
        this.f9623t = (FrameLayout) findViewById(C3788h.f6212a);
        this.f9624u = (FrameLayout) findViewById(C3788h.f6222k);
        ImageView imageView2 = (ImageView) findViewById(C3788h.f6213b);
        this.f9618o = imageView2;
        this.f9628y = z2 && imageView2 != null;
        if (i2 != 0) {
            this.f9629z = C2337a.m38133e(getContext(), i2);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C3788h.f6233v);
        this.f9619p = subtitleView;
        if (subtitleView != null) {
            subtitleView.m29697d();
            subtitleView.m29696e();
        }
        View findViewById2 = findViewById(C3788h.f6214c);
        this.f9620q = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f37342A = i6;
        TextView textView = (TextView) findViewById(C3788h.f6219h);
        this.f9621r = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i12 = C3788h.f6216e;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i12);
        View findViewById3 = findViewById(C3788h.f6217f);
        if (playerControlView != null) {
            this.f9622s = playerControlView;
            i7 = 0;
        } else if (findViewById3 != null) {
            i7 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f9622s = playerControlView2;
            playerControlView2.setId(i12);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            i7 = 0;
            this.f9622s = null;
        }
        PlayerControlView playerControlView3 = this.f9622s;
        if (playerControlView3 == null) {
            i8 = i7;
        }
        this.f37346E = i8;
        this.f37349H = z4;
        this.f37347F = z6;
        this.f37348G = z5;
        this.f9626w = (!z || playerControlView3 == null) ? i7 : 1;
        m29705w();
        m29733J();
        PlayerControlView playerControlView4 = this.f9622s;
        if (playerControlView4 != null) {
            playerControlView4.m29743z(aVar);
        }
    }
}
