package com.google.android.exoplayer2.p049ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.C5176f;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p049ui.AbstractC5281h;
import com.google.android.exoplayer2.p049ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p042c9.C3787g;
import p042c9.C3788h;
import p042c9.C3789i;
import p042c9.C3790j;
import p042c9.C3791k;
import p042c9.C3792l;
import p079e7.AbstractC6714d;
import p079e7.AbstractC6729p;
import p079e7.C6713c;
import p079e7.C6720i;
import p079e7.C6730q;
import p119g9.C7510a;
import p119g9.C7515b0;
import p119g9.C7557q0;

/* renamed from: com.google.android.exoplayer2.ui.PlayerControlView */
/* loaded from: classes5.dex */
public class PlayerControlView extends FrameLayout {

    /* renamed from: A */
    private final Timeline.C5160b f37319A;

    /* renamed from: B */
    private final Timeline.C5161c f37320B;

    /* renamed from: C */
    private final Runnable f37321C;

    /* renamed from: D */
    private final Runnable f37322D;

    /* renamed from: E */
    private final Drawable f37323E;

    /* renamed from: F */
    private final Drawable f37324F;

    /* renamed from: G */
    private final Drawable f37325G;

    /* renamed from: H */
    private final String f37326H;

    /* renamed from: I */
    private final String f37327I;

    /* renamed from: J */
    private final String f37328J;

    /* renamed from: K */
    private final Drawable f37329K;

    /* renamed from: L */
    private final Drawable f37330L;

    /* renamed from: M */
    private final float f37331M;

    /* renamed from: N */
    private final float f37332N;

    /* renamed from: O */
    private final String f37333O;

    /* renamed from: P */
    private final String f37334P;

    /* renamed from: Q */
    private Player f37335Q;

    /* renamed from: R */
    private AbstractC6714d f37336R;

    /* renamed from: S */
    private boolean f37337S;

    /* renamed from: T */
    private boolean f37338T;

    /* renamed from: U */
    private boolean f37339U;

    /* renamed from: V */
    private boolean f37340V;

    /* renamed from: W */
    private int f37341W;

    /* renamed from: a0 */
    private int f9584a0;

    /* renamed from: b0 */
    private int f9585b0;

    /* renamed from: c0 */
    private boolean f9586c0;

    /* renamed from: d0 */
    private boolean f9587d0;

    /* renamed from: e0 */
    private boolean f9588e0;

    /* renamed from: f0 */
    private boolean f9589f0;

    /* renamed from: g0 */
    private boolean f9590g0;

    /* renamed from: h0 */
    private long f9591h0;

    /* renamed from: i0 */
    private long[] f9592i0;

    /* renamed from: j0 */
    private boolean[] f9593j0;

    /* renamed from: k */
    private final View$OnClickListenerC5263b f9594k;

    /* renamed from: k0 */
    private long[] f9595k0;

    /* renamed from: l */
    private final CopyOnWriteArrayList<AbstractC5265d> f9596l;

    /* renamed from: l0 */
    private boolean[] f9597l0;

    /* renamed from: m */
    private final View f9598m;

    /* renamed from: m0 */
    private long f9599m0;

    /* renamed from: n */
    private final View f9600n;

    /* renamed from: o */
    private final View f9601o;

    /* renamed from: p */
    private final View f9602p;

    /* renamed from: q */
    private final View f9603q;

    /* renamed from: r */
    private final View f9604r;

    /* renamed from: s */
    private final ImageView f9605s;

    /* renamed from: t */
    private final ImageView f9606t;

    /* renamed from: u */
    private final View f9607u;

    /* renamed from: v */
    private final TextView f9608v;

    /* renamed from: w */
    private final TextView f9609w;

    /* renamed from: x */
    private final AbstractC5281h f9610x;

    /* renamed from: y */
    private final StringBuilder f9611y;

    /* renamed from: z */
    private final Formatter f9612z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$b */
    /* loaded from: classes5.dex */
    public final class View$OnClickListenerC5263b implements Player.AbstractC5153a, AbstractC5281h.AbstractC5282a, View.OnClickListener {
        private View$OnClickListenerC5263b() {
        }

        @Override // com.google.android.exoplayer2.p049ui.AbstractC5281h.AbstractC5282a
        /* renamed from: a */
        public void mo29654a(AbstractC5281h hVar, long j) {
            if (PlayerControlView.this.f9609w != null) {
                PlayerControlView.this.f9609w.setText(C7557q0.m22152f0(PlayerControlView.this.f9611y, PlayerControlView.this.f9612z, j));
            }
        }

        @Override // com.google.android.exoplayer2.p049ui.AbstractC5281h.AbstractC5282a
        /* renamed from: b */
        public void mo29653b(AbstractC5281h hVar, long j, boolean z) {
            PlayerControlView.this.f37340V = false;
            if (!z && PlayerControlView.this.f37335Q != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.m29779N(playerControlView.f37335Q, j);
            }
        }

        @Override // com.google.android.exoplayer2.p049ui.AbstractC5281h.AbstractC5282a
        /* renamed from: c */
        public void mo29652c(AbstractC5281h hVar, long j) {
            PlayerControlView.this.f37340V = true;
            if (PlayerControlView.this.f9609w != null) {
                PlayerControlView.this.f9609w.setText(C7557q0.m22152f0(PlayerControlView.this.f9611y, PlayerControlView.this.f9612z, j));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = PlayerControlView.this.f37335Q;
            if (player != null) {
                if (PlayerControlView.this.f9600n == view) {
                    PlayerControlView.this.f37336R.mo24556i(player);
                } else if (PlayerControlView.this.f9598m == view) {
                    PlayerControlView.this.f37336R.mo24557h(player);
                } else if (PlayerControlView.this.f9603q == view) {
                    if (player.mo30355P() != 4) {
                        PlayerControlView.this.f37336R.mo24560e(player);
                    }
                } else if (PlayerControlView.this.f9604r == view) {
                    PlayerControlView.this.f37336R.mo24564a(player);
                } else if (PlayerControlView.this.f9601o == view) {
                    PlayerControlView.this.m29789D(player);
                } else if (PlayerControlView.this.f9602p == view) {
                    PlayerControlView.this.m29790C(player);
                } else if (PlayerControlView.this.f9605s == view) {
                    PlayerControlView.this.f37336R.mo24561d(player, C7515b0.m22353a(player.mo30348U(), PlayerControlView.this.f9585b0));
                } else if (PlayerControlView.this.f9606t == view) {
                    PlayerControlView.this.f37336R.mo24562c(player, !player.mo30346V());
                }
            }
        }

        @Override // com.google.android.exoplayer2.Player.AbstractC5153a
        public void onEvents(Player player, Player.Events events) {
            if (events.mo22065c(5, 6)) {
                PlayerControlView.this.m29773T();
            }
            if (events.mo22065c(5, 6, 8)) {
                PlayerControlView.this.m29772U();
            }
            if (events.mo22066b(9)) {
                PlayerControlView.this.m29771V();
            }
            if (events.mo22066b(10)) {
                PlayerControlView.this.m29770W();
            }
            if (events.mo22065c(9, 10, 12, 0)) {
                PlayerControlView.this.m29774S();
            }
            if (events.mo22065c(12, 0)) {
                PlayerControlView.this.m29769X();
            }
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

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$c */
    /* loaded from: classes5.dex */
    public interface AbstractC5264c {
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$d */
    /* loaded from: classes5.dex */
    public interface AbstractC5265d {
        /* renamed from: a */
        void mo29701a(int i);
    }

    static {
        C6720i.m24534a("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private static boolean m29792A(Timeline timeline, Timeline.C5161c cVar) {
        if (timeline.mo20022p() > 100) {
            return false;
        }
        int p = timeline.mo20022p();
        for (int i = 0; i < p; i++) {
            if (timeline.m30436n(i, cVar).f9105p == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m29790C(Player player) {
        this.f37336R.mo24554k(player, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m29789D(Player player) {
        int P = player.mo30355P();
        if (P == 1) {
            this.f37336R.mo24558g(player);
        } else if (P == 4) {
            m29780M(player, player.mo30311m(), -9223372036854775807L);
        }
        this.f37336R.mo24554k(player, true);
    }

    /* renamed from: E */
    private void m29788E(Player player) {
        int P = player.mo30355P();
        if (P == 1 || P == 4 || !player.mo30371G()) {
            m29789D(player);
        } else {
            m29790C(player);
        }
    }

    /* renamed from: F */
    private static int m29787F(TypedArray typedArray, int i) {
        return typedArray.getInt(C3792l.f6287z, i);
    }

    /* renamed from: H */
    private void m29785H() {
        removeCallbacks(this.f37322D);
        if (this.f37341W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.f37341W;
            this.f9591h0 = uptimeMillis + i;
            if (this.f37337S) {
                postDelayed(this.f37322D, i);
                return;
            }
            return;
        }
        this.f9591h0 = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: I */
    private static boolean m29784I(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* renamed from: L */
    private void m29781L() {
        View view;
        View view2;
        boolean O = m29778O();
        if (!O && (view2 = this.f9601o) != null) {
            view2.requestFocus();
        } else if (O && (view = this.f9602p) != null) {
            view.requestFocus();
        }
    }

    /* renamed from: M */
    private boolean m29780M(Player player, int i, long j) {
        return this.f37336R.mo24563b(player, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m29779N(Player player, long j) {
        int i;
        Timeline w = player.mo30287w();
        if (this.f37339U && !w.m30435q()) {
            int p = w.mo20022p();
            i = 0;
            while (true) {
                long d = w.m30436n(i, this.f37320B).m30415d();
                if (j < d) {
                    break;
                } else if (i == p - 1) {
                    j = d;
                    break;
                } else {
                    j -= d;
                    i++;
                }
            }
        } else {
            i = player.mo30311m();
        }
        if (!m29780M(player, i, j)) {
            m29772U();
        }
    }

    /* renamed from: O */
    private boolean m29778O() {
        Player player = this.f37335Q;
        if (player == null || player.mo30355P() == 4 || this.f37335Q.mo30355P() == 1 || !this.f37335Q.mo30371G()) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private void m29776Q() {
        m29773T();
        m29774S();
        m29771V();
        m29770W();
        m29769X();
    }

    /* renamed from: R */
    private void m29775R(boolean z, boolean z2, View view) {
        float f;
        int i;
        if (view != null) {
            view.setEnabled(z2);
            if (z2) {
                f = this.f37331M;
            } else {
                f = this.f37332N;
            }
            view.setAlpha(f);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m29774S() {
        /*
            r8 = this;
            boolean r0 = r8.m29783J()
            if (r0 == 0) goto L_0x009a
            boolean r0 = r8.f37337S
            if (r0 != 0) goto L_0x000c
            goto L_0x009a
        L_0x000c:
            com.google.android.exoplayer2.Player r0 = r8.f37335Q
            r1 = 0
            if (r0 == 0) goto L_0x0073
            com.google.android.exoplayer2.Timeline r2 = r0.mo30287w()
            boolean r3 = r2.m30435q()
            if (r3 != 0) goto L_0x0073
            boolean r3 = r0.mo30333d()
            if (r3 != 0) goto L_0x0073
            int r3 = r0.mo30311m()
            com.google.android.exoplayer2.Timeline$c r4 = r8.f37320B
            r2.m30436n(r3, r4)
            com.google.android.exoplayer2.Timeline$c r2 = r8.f37320B
            boolean r3 = r2.f9097h
            r4 = 1
            if (r3 != 0) goto L_0x0040
            boolean r2 = r2.m30413f()
            if (r2 == 0) goto L_0x0040
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r2 = r1
            goto L_0x0041
        L_0x0040:
            r2 = r4
        L_0x0041:
            if (r3 == 0) goto L_0x004d
            e7.d r5 = r8.f37336R
            boolean r5 = r5.mo24559f()
            if (r5 == 0) goto L_0x004d
            r5 = r4
            goto L_0x004e
        L_0x004d:
            r5 = r1
        L_0x004e:
            if (r3 == 0) goto L_0x005a
            e7.d r6 = r8.f37336R
            boolean r6 = r6.mo24555j()
            if (r6 == 0) goto L_0x005a
            r6 = r4
            goto L_0x005b
        L_0x005a:
            r6 = r1
        L_0x005b:
            com.google.android.exoplayer2.Timeline$c r7 = r8.f37320B
            boolean r7 = r7.m30413f()
            if (r7 == 0) goto L_0x0069
            com.google.android.exoplayer2.Timeline$c r7 = r8.f37320B
            boolean r7 = r7.f9098i
            if (r7 != 0) goto L_0x006f
        L_0x0069:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0070
        L_0x006f:
            r1 = r4
        L_0x0070:
            r0 = r1
            r1 = r2
            goto L_0x0077
        L_0x0073:
            r0 = r1
            r3 = r0
            r5 = r3
            r6 = r5
        L_0x0077:
            boolean r2 = r8.f9588e0
            android.view.View r4 = r8.f9598m
            r8.m29775R(r2, r1, r4)
            boolean r1 = r8.f9586c0
            android.view.View r2 = r8.f9604r
            r8.m29775R(r1, r5, r2)
            boolean r1 = r8.f9587d0
            android.view.View r2 = r8.f9603q
            r8.m29775R(r1, r6, r2)
            boolean r1 = r8.f9589f0
            android.view.View r2 = r8.f9600n
            r8.m29775R(r1, r0, r2)
            com.google.android.exoplayer2.ui.h r0 = r8.f9610x
            if (r0 == 0) goto L_0x009a
            r0.setEnabled(r3)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.PlayerControlView.m29774S():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m29773T() {
        boolean z;
        boolean z2;
        int i;
        if (m29783J() && this.f37337S) {
            boolean O = m29778O();
            View view = this.f9601o;
            int i2 = 8;
            boolean z3 = true;
            if (view != null) {
                if (!O || !view.isFocused()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z = z2 | false;
                View view2 = this.f9601o;
                if (O) {
                    i = 8;
                } else {
                    i = 0;
                }
                view2.setVisibility(i);
            } else {
                z = false;
            }
            View view3 = this.f9602p;
            if (view3 != null) {
                if (O || !view3.isFocused()) {
                    z3 = false;
                }
                z |= z3;
                View view4 = this.f9602p;
                if (O) {
                    i2 = 0;
                }
                view4.setVisibility(i2);
            }
            if (z) {
                m29781L();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m29772U() {
        long j;
        long j2;
        int i;
        long j3;
        if (m29783J() && this.f37337S) {
            Player player = this.f37335Q;
            if (player != null) {
                j2 = this.f9599m0 + player.mo30360M();
                j = this.f9599m0 + player.mo30343X();
            } else {
                j2 = 0;
                j = 0;
            }
            TextView textView = this.f9609w;
            if (textView != null && !this.f37340V) {
                textView.setText(C7557q0.m22152f0(this.f9611y, this.f9612z, j2));
            }
            AbstractC5281h hVar = this.f9610x;
            if (hVar != null) {
                hVar.setPosition(j2);
                this.f9610x.setBufferedPosition(j);
            }
            removeCallbacks(this.f37321C);
            if (player == null) {
                i = 1;
            } else {
                i = player.mo30355P();
            }
            long j4 = 1000;
            if (player != null && player.mo30279Q()) {
                AbstractC5281h hVar2 = this.f9610x;
                if (hVar2 != null) {
                    j3 = hVar2.getPreferredUpdateDelay();
                } else {
                    j3 = 1000;
                }
                long min = Math.min(j3, 1000 - (j2 % 1000));
                float f = player.mo30337b().f9029a;
                if (f > 0.0f) {
                    j4 = ((float) min) / f;
                }
                postDelayed(this.f37321C, C7557q0.m22127s(j4, this.f9584a0, 1000L));
            } else if (i != 4 && i != 1) {
                postDelayed(this.f37321C, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m29771V() {
        ImageView imageView;
        if (m29783J() && this.f37337S && (imageView = this.f9605s) != null) {
            if (this.f9585b0 == 0) {
                m29775R(false, false, imageView);
                return;
            }
            Player player = this.f37335Q;
            if (player == null) {
                m29775R(true, false, imageView);
                this.f9605s.setImageDrawable(this.f37323E);
                this.f9605s.setContentDescription(this.f37326H);
                return;
            }
            m29775R(true, true, imageView);
            int U = player.mo30348U();
            if (U == 0) {
                this.f9605s.setImageDrawable(this.f37323E);
                this.f9605s.setContentDescription(this.f37326H);
            } else if (U == 1) {
                this.f9605s.setImageDrawable(this.f37324F);
                this.f9605s.setContentDescription(this.f37327I);
            } else if (U == 2) {
                this.f9605s.setImageDrawable(this.f37325G);
                this.f9605s.setContentDescription(this.f37328J);
            }
            this.f9605s.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m29770W() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (m29783J() && this.f37337S && (imageView = this.f9606t) != null) {
            Player player = this.f37335Q;
            if (!this.f9590g0) {
                m29775R(false, false, imageView);
            } else if (player == null) {
                m29775R(true, false, imageView);
                this.f9606t.setImageDrawable(this.f37330L);
                this.f9606t.setContentDescription(this.f37334P);
            } else {
                m29775R(true, true, imageView);
                ImageView imageView2 = this.f9606t;
                if (player.mo30346V()) {
                    drawable = this.f37329K;
                } else {
                    drawable = this.f37330L;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f9606t;
                if (player.mo30346V()) {
                    str = this.f37333O;
                } else {
                    str = this.f37334P;
                }
                imageView3.setContentDescription(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m29769X() {
        boolean z;
        int i;
        int i2;
        int i3;
        Timeline.C5161c cVar;
        int i4;
        Player player = this.f37335Q;
        if (player != null) {
            boolean z2 = true;
            if (!this.f37338T || !m29792A(player.mo30287w(), this.f37320B)) {
                z = false;
            } else {
                z = true;
            }
            this.f37339U = z;
            long j = 0;
            this.f9599m0 = 0L;
            Timeline w = player.mo30287w();
            if (!w.m30435q()) {
                int m = player.mo30311m();
                boolean z3 = this.f37339U;
                if (z3) {
                    i2 = 0;
                } else {
                    i2 = m;
                }
                if (z3) {
                    i3 = w.mo20022p() - 1;
                } else {
                    i3 = m;
                }
                long j2 = 0;
                i = 0;
                while (true) {
                    if (i2 > i3) {
                        break;
                    }
                    if (i2 == m) {
                        this.f9599m0 = C6713c.m24565d(j2);
                    }
                    w.m30436n(i2, this.f37320B);
                    Timeline.C5161c cVar2 = this.f37320B;
                    if (cVar2.f9105p == -9223372036854775807L) {
                        C7510a.m22366f(this.f37339U ^ z2);
                        break;
                    }
                    int i5 = cVar2.f9102m;
                    while (true) {
                        cVar = this.f37320B;
                        if (i5 <= cVar.f9103n) {
                            w.m30439f(i5, this.f37319A);
                            int c = this.f37319A.m30431c();
                            for (int i6 = 0; i6 < c; i6++) {
                                long f = this.f37319A.m30428f(i6);
                                if (f == Long.MIN_VALUE) {
                                    long j3 = this.f37319A.f9085d;
                                    if (j3 != -9223372036854775807L) {
                                        f = j3;
                                    }
                                }
                                long l = f + this.f37319A.m30422l();
                                if (l >= 0) {
                                    long[] jArr = this.f9592i0;
                                    if (i == jArr.length) {
                                        if (jArr.length == 0) {
                                            i4 = 1;
                                        } else {
                                            i4 = jArr.length * 2;
                                        }
                                        this.f9592i0 = Arrays.copyOf(jArr, i4);
                                        this.f9593j0 = Arrays.copyOf(this.f9593j0, i4);
                                    }
                                    this.f9592i0[i] = C6713c.m24565d(j2 + l);
                                    this.f9593j0[i] = this.f37319A.m30421m(i6);
                                    i++;
                                }
                            }
                            i5++;
                        }
                    }
                    j2 += cVar.f9105p;
                    i2++;
                    z2 = true;
                }
                j = j2;
            } else {
                i = 0;
            }
            long d = C6713c.m24565d(j);
            TextView textView = this.f9608v;
            if (textView != null) {
                textView.setText(C7557q0.m22152f0(this.f9611y, this.f9612z, d));
            }
            AbstractC5281h hVar = this.f9610x;
            if (hVar != null) {
                hVar.setDuration(d);
                int length = this.f9595k0.length;
                int i7 = i + length;
                long[] jArr2 = this.f9592i0;
                if (i7 > jArr2.length) {
                    this.f9592i0 = Arrays.copyOf(jArr2, i7);
                    this.f9593j0 = Arrays.copyOf(this.f9593j0, i7);
                }
                System.arraycopy(this.f9595k0, 0, this.f9592i0, i, length);
                System.arraycopy(this.f9597l0, 0, this.f9593j0, i, length);
                this.f9610x.mo29655b(this.f9592i0, this.f9593j0, i7);
            }
            m29772U();
        }
    }

    /* renamed from: B */
    public boolean m29791B(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f37335Q;
        if (player == null || !m29784I(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.mo30355P() == 4) {
                return true;
            }
            this.f37336R.mo24560e(player);
            return true;
        } else if (keyCode == 89) {
            this.f37336R.mo24564a(player);
            return true;
        } else if (keyEvent.getRepeatCount() != 0) {
            return true;
        } else {
            if (keyCode == 79 || keyCode == 85) {
                m29788E(player);
                return true;
            } else if (keyCode == 87) {
                this.f37336R.mo24556i(player);
                return true;
            } else if (keyCode == 88) {
                this.f37336R.mo24557h(player);
                return true;
            } else if (keyCode == 126) {
                m29789D(player);
                return true;
            } else if (keyCode != 127) {
                return true;
            } else {
                m29790C(player);
                return true;
            }
        }
    }

    /* renamed from: G */
    public void m29786G() {
        if (m29783J()) {
            setVisibility(8);
            Iterator<AbstractC5265d> it = this.f9596l.iterator();
            while (it.hasNext()) {
                it.next().mo29701a(getVisibility());
            }
            removeCallbacks(this.f37321C);
            removeCallbacks(this.f37322D);
            this.f9591h0 = -9223372036854775807L;
        }
    }

    /* renamed from: J */
    public boolean m29783J() {
        return getVisibility() == 0;
    }

    /* renamed from: K */
    public void m29782K(AbstractC5265d dVar) {
        this.f9596l.remove(dVar);
    }

    /* renamed from: P */
    public void m29777P() {
        if (!m29783J()) {
            setVisibility(0);
            Iterator<AbstractC5265d> it = this.f9596l.iterator();
            while (it.hasNext()) {
                it.next().mo29701a(getVisibility());
            }
            m29776Q();
            m29781L();
        }
        m29785H();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m29791B(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f37322D);
        } else if (motionEvent.getAction() == 1) {
            m29785H();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Player getPlayer() {
        return this.f37335Q;
    }

    public int getRepeatToggleModes() {
        return this.f9585b0;
    }

    public boolean getShowShuffleButton() {
        return this.f9590g0;
    }

    public int getShowTimeoutMs() {
        return this.f37341W;
    }

    public boolean getShowVrButton() {
        View view = this.f9607u;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37337S = true;
        long j = this.f9591h0;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                m29786G();
            } else {
                postDelayed(this.f37322D, uptimeMillis);
            }
        } else if (m29783J()) {
            m29785H();
        }
        m29776Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37337S = false;
        removeCallbacks(this.f37321C);
        removeCallbacks(this.f37322D);
    }

    public void setControlDispatcher(AbstractC6714d dVar) {
        if (this.f37336R != dVar) {
            this.f37336R = dVar;
            m29774S();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        AbstractC6714d dVar = this.f37336R;
        if (dVar instanceof C5176f) {
            ((C5176f) dVar).m30271m(i);
            m29774S();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(AbstractC6729p pVar) {
    }

    public void setPlayer(Player player) {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (!(player == null || player.mo30285x() == Looper.getMainLooper())) {
            z2 = false;
        }
        C7510a.m22371a(z2);
        Player player2 = this.f37335Q;
        if (player2 != player) {
            if (player2 != null) {
                player2.mo30314l(this.f9594k);
            }
            this.f37335Q = player;
            if (player != null) {
                player.mo30364K(this.f9594k);
            }
            m29776Q();
        }
    }

    public void setProgressUpdateListener(AbstractC5264c cVar) {
    }

    public void setRepeatToggleModes(int i) {
        this.f9585b0 = i;
        Player player = this.f37335Q;
        if (player != null) {
            int U = player.mo30348U();
            if (i == 0 && U != 0) {
                this.f37336R.mo24561d(this.f37335Q, 0);
            } else if (i == 1 && U == 2) {
                this.f37336R.mo24561d(this.f37335Q, 1);
            } else if (i == 2 && U == 1) {
                this.f37336R.mo24561d(this.f37335Q, 2);
            }
        }
        m29771V();
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        AbstractC6714d dVar = this.f37336R;
        if (dVar instanceof C5176f) {
            ((C5176f) dVar).m30270n(i);
            m29774S();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        this.f9587d0 = z;
        m29774S();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f37338T = z;
        m29769X();
    }

    public void setShowNextButton(boolean z) {
        this.f9589f0 = z;
        m29774S();
    }

    public void setShowPreviousButton(boolean z) {
        this.f9588e0 = z;
        m29774S();
    }

    public void setShowRewindButton(boolean z) {
        this.f9586c0 = z;
        m29774S();
    }

    public void setShowShuffleButton(boolean z) {
        this.f9590g0 = z;
        m29770W();
    }

    public void setShowTimeoutMs(int i) {
        this.f37341W = i;
        if (m29783J()) {
            m29785H();
        }
    }

    public void setShowVrButton(boolean z) {
        int i;
        View view = this.f9607u;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f9584a0 = C7557q0.m22129r(i, 16, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z;
        View view = this.f9607u;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            m29775R(showVrButton, z, this.f9607u);
        }
    }

    /* renamed from: z */
    public void m29743z(AbstractC5265d dVar) {
        C7510a.m22367e(dVar);
        this.f9596l.add(dVar);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = C3790j.f6238b;
        int i3 = 5000;
        this.f37341W = 5000;
        this.f9585b0 = 0;
        this.f9584a0 = ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f9591h0 = -9223372036854775807L;
        this.f9586c0 = true;
        this.f9587d0 = true;
        this.f9588e0 = true;
        this.f9589f0 = true;
        this.f9590g0 = false;
        int i4 = 15000;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3792l.f6284w, 0, 0);
            try {
                i3 = obtainStyledAttributes.getInt(C3792l.f35870A, 5000);
                i4 = obtainStyledAttributes.getInt(C3792l.f6286y, 15000);
                this.f37341W = obtainStyledAttributes.getInt(C3792l.f35876G, this.f37341W);
                i2 = obtainStyledAttributes.getResourceId(C3792l.f6285x, i2);
                this.f9585b0 = m29787F(obtainStyledAttributes, this.f9585b0);
                this.f9586c0 = obtainStyledAttributes.getBoolean(C3792l.f35874E, this.f9586c0);
                this.f9587d0 = obtainStyledAttributes.getBoolean(C3792l.f35871B, this.f9587d0);
                this.f9588e0 = obtainStyledAttributes.getBoolean(C3792l.f35873D, this.f9588e0);
                this.f9589f0 = obtainStyledAttributes.getBoolean(C3792l.f35872C, this.f9589f0);
                this.f9590g0 = obtainStyledAttributes.getBoolean(C3792l.f35875F, this.f9590g0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(C3792l.f35877H, this.f9584a0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f9596l = new CopyOnWriteArrayList<>();
        this.f37319A = new Timeline.C5160b();
        this.f37320B = new Timeline.C5161c();
        StringBuilder sb2 = new StringBuilder();
        this.f9611y = sb2;
        this.f9612z = new Formatter(sb2, Locale.getDefault());
        this.f9592i0 = new long[0];
        this.f9593j0 = new boolean[0];
        this.f9595k0 = new long[0];
        this.f9597l0 = new boolean[0];
        View$OnClickListenerC5263b bVar = new View$OnClickListenerC5263b();
        this.f9594k = bVar;
        this.f37336R = new C5176f(i4, i3);
        this.f37321C = new Runnable() { // from class: c9.d
            @Override // java.lang.Runnable
            public final void run() {
                PlayerControlView.this.m29772U();
            }
        };
        this.f37322D = new Runnable() { // from class: c9.e
            @Override // java.lang.Runnable
            public final void run() {
                PlayerControlView.this.m29786G();
            }
        };
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        int i5 = C3788h.f6227p;
        AbstractC5281h hVar = (AbstractC5281h) findViewById(i5);
        View findViewById = findViewById(C3788h.f6228q);
        if (hVar != null) {
            this.f9610x = hVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i5);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f9610x = defaultTimeBar;
        } else {
            this.f9610x = null;
        }
        this.f9608v = (TextView) findViewById(C3788h.f6218g);
        this.f9609w = (TextView) findViewById(C3788h.f6225n);
        AbstractC5281h hVar2 = this.f9610x;
        if (hVar2 != null) {
            hVar2.mo29656a(bVar);
        }
        View findViewById2 = findViewById(C3788h.f6224m);
        this.f9601o = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(C3788h.f6223l);
        this.f9602p = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        View findViewById4 = findViewById(C3788h.f6226o);
        this.f9598m = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(bVar);
        }
        View findViewById5 = findViewById(C3788h.f6221j);
        this.f9600n = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(C3788h.f6230s);
        this.f9604r = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(C3788h.f6220i);
        this.f9603q = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(C3788h.f6229r);
        this.f9605s = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(C3788h.f6231t);
        this.f9606t = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View findViewById8 = findViewById(C3788h.f6234w);
        this.f9607u = findViewById8;
        setShowVrButton(false);
        m29775R(false, false, findViewById8);
        Resources resources = context.getResources();
        this.f37331M = resources.getInteger(C3789i.f6236b) / 100.0f;
        this.f37332N = resources.getInteger(C3789i.f6235a) / 100.0f;
        this.f37323E = resources.getDrawable(C3787g.f6207b);
        this.f37324F = resources.getDrawable(C3787g.f6208c);
        this.f37325G = resources.getDrawable(C3787g.f6206a);
        this.f37329K = resources.getDrawable(C3787g.f6210e);
        this.f37330L = resources.getDrawable(C3787g.f6209d);
        this.f37326H = resources.getString(C3791k.f6242c);
        this.f37327I = resources.getString(C3791k.f6243d);
        this.f37328J = resources.getString(C3791k.f6241b);
        this.f37333O = resources.getString(C3791k.f6246g);
        this.f37334P = resources.getString(C3791k.f6245f);
    }
}
