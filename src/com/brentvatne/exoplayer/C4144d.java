package com.brentvatne.exoplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C2337a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p049ui.SubtitleView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.List;
import p079e7.C6730q;
import p133h9.AbstractC7965q;
import p133h9.C7964p;
import p317r8.AbstractC12465l;
import p317r8.C12453b;

@TargetApi(16)
/* renamed from: com.brentvatne.exoplayer.d */
/* loaded from: classes.dex */
public final class C4144d extends FrameLayout {

    /* renamed from: k */
    private View f6942k;

    /* renamed from: l */
    private final View f6943l;

    /* renamed from: m */
    private final SubtitleView f6944m;

    /* renamed from: n */
    private final C4141a f6945n;

    /* renamed from: o */
    private final C4146b f6946o;

    /* renamed from: p */
    private SimpleExoPlayer f6947p;

    /* renamed from: q */
    private Context f6948q;

    /* renamed from: r */
    private ViewGroup.LayoutParams f6949r;

    /* renamed from: s */
    private boolean f6950s;

    /* renamed from: t */
    private boolean f6951t;

    /* renamed from: u */
    private final Runnable f6952u;

    /* renamed from: com.brentvatne.exoplayer.d$a */
    /* loaded from: classes.dex */
    class RunnableC4145a implements Runnable {
        RunnableC4145a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4144d dVar = C4144d.this;
            dVar.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C4144d.this.getHeight(), 1073741824));
            C4144d dVar2 = C4144d.this;
            dVar2.layout(dVar2.getLeft(), C4144d.this.getTop(), C4144d.this.getRight(), C4144d.this.getBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.brentvatne.exoplayer.d$b */
    /* loaded from: classes.dex */
    public final class C4146b implements AbstractC7965q, AbstractC12465l, Player.AbstractC5153a {
        private C4146b() {
        }

        @Override // p133h9.AbstractC7965q
        /* renamed from: d */
        public void mo20981d(int i, int i2, int i3, float f) {
            boolean z;
            float f2;
            if (C4144d.this.f6945n.getAspectRatio() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C4141a aVar = C4144d.this.f6945n;
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = (i * f) / i2;
            }
            aVar.setAspectRatio(f2);
            if (z) {
                C4144d dVar = C4144d.this;
                dVar.post(dVar.f6952u);
            }
        }

        @Override // p133h9.AbstractC7965q
        /* renamed from: e */
        public void mo20980e() {
            C4144d.this.f6943l.setVisibility(4);
        }

        @Override // p133h9.AbstractC7965q
        /* renamed from: f */
        public /* synthetic */ void mo20979f(int i, int i2) {
            C7964p.m20982a(this, i, i2);
        }

        @Override // p317r8.AbstractC12465l
        /* renamed from: n */
        public void mo6665n(List<C12453b> list) {
            C4144d.this.f6944m.mo6665n(list);
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
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onSeekProcessed() {
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
            C4144d.this.m32645i();
        }

        /* synthetic */ C4146b(C4144d dVar, RunnableC4145a aVar) {
            this();
        }
    }

    public C4144d(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private void m32648f() {
        View view = this.f6942k;
        if (view instanceof TextureView) {
            this.f6947p.mo30527J((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f6947p.mo30516T((SurfaceView) view);
        }
    }

    /* renamed from: h */
    private void m32646h() {
        View view = this.f6942k;
        if (view instanceof TextureView) {
            this.f6947p.mo30538A((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f6947p.mo30490j((SurfaceView) view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m32645i() {
        SimpleExoPlayer simpleExoPlayer = this.f6947p;
        if (simpleExoPlayer != null) {
            TrackSelectionArray B = simpleExoPlayer.mo30380B();
            for (int i = 0; i < B.f9544a; i++) {
                if (this.f6947p.mo30377D(i) == 2 && B.m29828a(i) != null) {
                    return;
                }
            }
            this.f6943l.setVisibility(0);
        }
    }

    /* renamed from: j */
    private void m32644j() {
        this.f6943l.setVisibility(this.f6951t ? 4 : 0);
    }

    /* renamed from: k */
    private void m32643k() {
        View view;
        if (this.f6950s) {
            view = new TextureView(this.f6948q);
        } else {
            view = new SurfaceView(this.f6948q);
        }
        view.setLayoutParams(this.f6949r);
        this.f6942k = view;
        if (this.f6945n.getChildAt(0) != null) {
            this.f6945n.removeViewAt(0);
        }
        this.f6945n.addView(this.f6942k, 0, this.f6949r);
        if (this.f6947p != null) {
            m32646h();
        }
    }

    /* renamed from: g */
    public void m32647g() {
        this.f6945n.m32660a();
    }

    public View getVideoSurfaceView() {
        return this.f6942k;
    }

    public void setHideShutterView(boolean z) {
        this.f6951t = z;
        m32644j();
    }

    public void setPlayer(SimpleExoPlayer simpleExoPlayer) {
        SimpleExoPlayer simpleExoPlayer2 = this.f6947p;
        if (simpleExoPlayer2 != simpleExoPlayer) {
            if (simpleExoPlayer2 != null) {
                simpleExoPlayer2.mo30492i(this.f6946o);
                this.f6947p.mo30512W(this.f6946o);
                this.f6947p.mo30314l(this.f6946o);
                m32648f();
            }
            this.f6947p = simpleExoPlayer;
            this.f6943l.setVisibility(0);
            if (simpleExoPlayer != null) {
                m32646h();
                simpleExoPlayer.mo30481q(this.f6946o);
                simpleExoPlayer.mo30364K(this.f6946o);
                simpleExoPlayer.mo30535C(this.f6946o);
            }
        }
    }

    public void setResizeMode(int i) {
        if (this.f6945n.getResizeMode() != i) {
            this.f6945n.setResizeMode(i);
            post(this.f6952u);
        }
    }

    public void setUseTextureView(boolean z) {
        if (z != this.f6950s) {
            this.f6950s = z;
            m32643k();
        }
    }

    public C4144d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4144d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6950s = true;
        this.f6951t = false;
        this.f6952u = new RunnableC4145a();
        this.f6948q = context;
        this.f6949r = new ViewGroup.LayoutParams(-1, -1);
        this.f6946o = new C4146b(this, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        C4141a aVar = new C4141a(context);
        this.f6945n = aVar;
        aVar.setLayoutParams(layoutParams);
        View view = new View(getContext());
        this.f6943l = view;
        view.setLayoutParams(this.f6949r);
        view.setBackgroundColor(C2337a.m38135c(context, 17170444));
        SubtitleView subtitleView = new SubtitleView(context);
        this.f6944m = subtitleView;
        subtitleView.setLayoutParams(this.f6949r);
        subtitleView.m29697d();
        subtitleView.m29696e();
        m32643k();
        aVar.addView(view, 1, this.f6949r);
        aVar.addView(subtitleView, 2, this.f6949r);
        addViewInLayout(aVar, 0, layoutParams);
    }
}
