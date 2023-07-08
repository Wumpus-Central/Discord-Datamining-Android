package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.w0;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.media_player.MediaPlayer;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.LightTheme;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import ff.n;
import java.util.Arrays;
import ki.a;
import ki.c;
import ki.d;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.l;
import wf.j;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \\2\u00020\u0001:\u0002\\]B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010/\u001a\u0002002\u0006\u0010+\u001a\u00020,H\u0002J#\u00101\u001a\u0002002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u00103\u001a\u00020(H\u0002¢\u0006\u0002\u00104J\u0010\u00105\u001a\u0002002\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u00106\u001a\u0002002\u0006\u0010+\u001a\u00020,H\u0002J\u001a\u00107\u001a\u0002002\u0006\u0010+\u001a\u00020,2\b\b\u0002\u00108\u001a\u00020(H\u0002J\b\u00109\u001a\u000200H\u0002J\u000f\u0010:\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010;J\b\u0010<\u001a\u000200H\u0002J\u0012\u0010=\u001a\u0002002\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\b\u0010@\u001a\u000200H\u0002J\u0010\u0010A\u001a\u0002002\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020(H\u0002J\u000e\u0010D\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020GJ%\u0010H\u001a\u0002002\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010?ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u0002002\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010O\u001a\u00020(H\u0002J-\u0010P\u001a\u0002002\b\u0010Q\u001a\u0004\u0018\u00010\u00072\f\u0010R\u001a\b\u0012\u0004\u0012\u0002000S2\b\u0010T\u001a\u0004\u0018\u00010U¢\u0006\u0002\u0010VJ\u000e\u0010'\u001a\u0002002\u0006\u0010'\u001a\u00020(J\u0010\u0010W\u001a\u0002002\u0006\u0010X\u001a\u00020(H\u0002J\f\u0010Y\u001a\u00020?*\u00020\u0007H\u0002J\f\u0010Z\u001a\u00020?*\u00020\u0007H\u0002J\f\u0010[\u001a\u00020\u0007*\u00020\u001eH\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animatorManager", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;", "getAnimatorManager", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;", "animatorManager$delegate", "Lkotlin/Lazy;", "attachStateChangeListener", "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "binding", "Lcom/discord/chat/databinding/AudioPlayerViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/AudioPlayerViewBinding;", "bounceAnimator", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getBounceAnimator", "()Landroid/view/animation/Animation;", "bounceAnimator$delegate", "durationJob", "Lkotlinx/coroutines/Job;", "durationMs", "", "listener", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;", "getListener", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;", "setListener", "(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;)V", "playerJob", "resetJob", "shouldAnimate", "", "startTimeMS", "Ljava/lang/Long;", "state", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;", "uploadFinished", "wasPlayingBeforeBeingPaused", "configureAudioWave", "", "configureDuration", "overrideDuration", "isPlaying", "(Ljava/lang/Long;Z)V", "configureLoading", "configurePlayButton", "configurePlayerState", "hasSourceChanged", "configureProgress", "getCurrentPosition", "()Ljava/lang/Long;", "maybeLogPlaybackEnded", "maybeLogPlaybackFailed", "errorMessage", "", "maybeLogPlaybackStarted", "prepareAudio", "reset", "logDuration", "setDurationMs", "setSampleData", "sampleData", "", "setSourceUrl", "messageId", "Lcom/discord/primitives/MessageId;", "sourceUrl", "setSourceUrl-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "setState", "forceRefresh", "setUploadProgress", "progress", "onCancelUpload", "Lkotlin/Function0;", "attachmentsOpacity", "", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Ljava/lang/Float;)V", "toggleDurationEmitter", "shouldEmit", "timeRemainingAccessibilityText", "timeRemainingText", "toSeconds", "Companion", "Listener", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioPlayerView extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    public static final long RESET_DELAY_MS = 500;
    private final Lazy animatorManager$delegate;
    private final ViewAttachedListener attachStateChangeListener;
    private final AudioPlayerViewBinding binding;
    private final Lazy bounceAnimator$delegate;
    private Job durationJob;
    private long durationMs;
    private Listener listener;
    private Job playerJob;
    private Job resetJob;
    private boolean shouldAnimate;
    private Long startTimeMS;
    private AudioPlayerViewState state;
    private boolean uploadFinished;
    private boolean wasPlayingBeforeBeingPaused;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Companion;", "", "()V", "RESET_DELAY_MS", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;", "", "voiceMessagePlaybackEnded", "", "endDurationSecs", "", "durationListeningSecs", "voiceMessagePlaybackFailed", "errorMessage", "", "voiceMessagePlaybackStarted", "startedDurationSecs", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Listener {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener$Companion;", "", "()V", "secondsSinceStart", "", "startTimeMS", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final float secondsSinceStart(long j10) {
                Comparable e10;
                a.C0287a aVar = a.f20580l;
                e10 = j.e(a.e(c.t(System.currentTimeMillis() - j10, d.MILLISECONDS)), a.e(a.f20580l.b()));
                return (float) a.F(((a) e10).K(), d.SECONDS);
            }
        }

        void voiceMessagePlaybackEnded(float f10, float f11);

        void voiceMessagePlaybackFailed(String str);

        void voiceMessagePlaybackStarted(float f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ AudioPlayerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(AudioPlayerView this$0, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        q.g(this$0, "this$0");
        boolean isPlaying$chat_release = this$0.state.isPlaying$chat_release(this$0.wasPlayingBeforeBeingPaused);
        if (isPlaying$chat_release) {
            this$0.getAnimatorManager().startAnimator(isPlaying$chat_release, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureAudioWave(AudioPlayerViewState audioPlayerViewState) {
        int i10;
        this.binding.wave.setOnAudioProgressChange(new AudioPlayerView$configureAudioWave$1(this, audioPlayerViewState));
        AudioWaveView audioWaveView = this.binding.wave;
        if (audioPlayerViewState.isPlaying$chat_release(this.wasPlayingBeforeBeingPaused)) {
            i10 = getContext().getColor(R.color.brand_430);
        } else if (audioPlayerViewState.getCurrentProgress$chat_release() != null) {
            i10 = ThemeManagerKt.getTheme().getInteractiveMuted();
        } else {
            i10 = ThemeManagerKt.getTheme().getInteractiveNormal();
        }
        audioWaveView.setDefaultPaintColor(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureDuration(Long l10, boolean z10) {
        long j10;
        CharSequence charSequence;
        boolean z11;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
            Long l11 = null;
            if (player$chat_release != null) {
                if (player$chat_release.durationMs() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    player$chat_release = null;
                }
                if (player$chat_release != null) {
                    l11 = Long.valueOf(player$chat_release.durationMs() - player$chat_release.currentPositionMs());
                }
            }
            if (l11 != null) {
                j10 = l11.longValue();
            } else {
                return;
            }
        }
        int seconds = toSeconds(j10);
        int seconds2 = toSeconds(this.durationMs);
        LinearLayout linearLayout = this.binding.playerContainer;
        if (z10) {
            Context context = getContext();
            q.f(context, "context");
            charSequence = I18nUtilsKt.i18nFormat(context, I18nMessage.VOICE_MESSAGES_PLAYING_A11Y_STATUS, new AudioPlayerView$configureDuration$1(this, seconds2, seconds));
        } else {
            Context context2 = getContext();
            q.f(context2, "context");
            charSequence = I18nUtilsKt.i18nFormat(context2, I18nMessage.VOICE_MESSAGES_A11Y_STATUS, new AudioPlayerView$configureDuration$2(this, seconds2));
        }
        linearLayout.setContentDescription(charSequence);
        this.binding.text.setText("  " + timeRemainingText(seconds) + "  ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void configureDuration$default(AudioPlayerView audioPlayerView, Long l10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        audioPlayerView.configureDuration(l10, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r4 != false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void configureLoading(com.discord.chat.presentation.message.view.voicemessages.AudioPlayerViewState r4) {
        /*
            r3 = this;
            com.discord.chat.databinding.AudioPlayerViewBinding r0 = r3.binding
            android.widget.ProgressBar r0 = r0.progress
            java.lang.String r1 = "binding.progress"
            kotlin.jvm.internal.q.f(r0, r1)
            com.discord.media_player.MediaPlayer$Event r1 = r4.getMediaState$chat_release()
            com.discord.media_player.MediaPlayer$Event$BufferStart r2 = com.discord.media_player.MediaPlayer.Event.BufferStart.INSTANCE
            boolean r1 = kotlin.jvm.internal.q.b(r1, r2)
            r2 = 0
            if (r1 == 0) goto L_0x0029
            com.discord.media_player.MediaPlayer r4 = r4.getPlayer$chat_release()
            r1 = 1
            if (r4 == 0) goto L_0x0025
            boolean r4 = r4.shouldPlay()
            if (r4 != r1) goto L_0x0025
            r4 = r1
            goto L_0x0026
        L_0x0025:
            r4 = r2
        L_0x0026:
            if (r4 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            if (r1 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r2 = 8
        L_0x002f:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.configureLoading(com.discord.chat.presentation.message.view.voicemessages.AudioPlayerViewState):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configurePlayButton(final AudioPlayerViewState audioPlayerViewState) {
        ReactAsset reactAsset;
        int i10;
        View.OnClickListener onClickListener;
        final boolean isPlaying$chat_release = audioPlayerViewState.isPlaying$chat_release(this.wasPlayingBeforeBeingPaused);
        SimpleDraweeView simpleDraweeView = this.binding.button;
        q.f(simpleDraweeView, "binding.button");
        if (isPlaying$chat_release) {
            reactAsset = ReactAsset.Pause;
        } else {
            reactAsset = ReactAsset.Play;
        }
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, reactAsset);
        SimpleDraweeView simpleDraweeView2 = this.binding.button;
        if (isPlaying$chat_release) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        simpleDraweeView2.setPadding(i10, 0, 0, 0);
        getAnimatorManager().startAnimator(isPlaying$chat_release, this.shouldAnimate);
        LinearLayout linearLayout = this.binding.playerContainer;
        q.f(linearLayout, "binding.playerContainer");
        if (audioPlayerViewState.getSourceUrl() != null) {
            onClickListener = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.voicemessages.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudioPlayerView.configurePlayButton$lambda$5(AudioPlayerView.this, audioPlayerViewState, isPlaying$chat_release, view);
                }
            };
        } else {
            onClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(linearLayout, false, onClickListener, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configurePlayButton$lambda$5(AudioPlayerView this$0, AudioPlayerViewState state, boolean z10, View view) {
        q.g(this$0, "this$0");
        q.g(state, "$state");
        this$0.binding.buttonContainer.startAnimation(this$0.getBounceAnimator());
        if (state.getPlayer$chat_release() == null) {
            this$0.prepareAudio(state);
        } else if (!z10) {
            state.play$chat_release();
        } else {
            state.pause$chat_release();
        }
    }

    private final void configurePlayerState(AudioPlayerViewState audioPlayerViewState, boolean z10) {
        boolean z11;
        boolean b10 = q.b(audioPlayerViewState.getMediaState$chat_release(), MediaPlayer.Event.PlaybackEnded.INSTANCE);
        boolean z12 = false;
        if ((!z10 || AudioPlayerManager.INSTANCE.hasCurrentPlayer(audioPlayerViewState.getAudioSource())) && !b10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            reset(!b10);
            return;
        }
        boolean z13 = !hasWindowFocus();
        if (q.b(audioPlayerViewState.getMediaState$chat_release(), MediaPlayer.Event.StartedPlaying.INSTANCE) && !z13 && audioPlayerViewState.getAttached()) {
            z12 = true;
        }
        setKeepScreenOn(z12);
    }

    static /* synthetic */ void configurePlayerState$default(AudioPlayerView audioPlayerView, AudioPlayerViewState audioPlayerViewState, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        audioPlayerView.configurePlayerState(audioPlayerViewState, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureProgress() {
        float f10;
        AudioWaveView audioWaveView = this.binding.wave;
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null) {
            f10 = player$chat_release.currentPositionPercentage();
        } else {
            AudioPlayerManager.CurrentProgress currentProgress$chat_release = this.state.getCurrentProgress$chat_release();
            if (currentProgress$chat_release != null) {
                f10 = currentProgress$chat_release.getCurrentProgressPercentage();
            } else {
                f10 = 0.0f;
            }
        }
        audioWaveView.setAudioProgress(f10, true);
    }

    private final AudioPlayerWipeAnimatorManager getAnimatorManager() {
        return (AudioPlayerWipeAnimatorManager) this.animatorManager$delegate.getValue();
    }

    private final Animation getBounceAnimator() {
        return (Animation) this.bounceAnimator$delegate.getValue();
    }

    private final Long getCurrentPosition() {
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null) {
            return Long.valueOf(player$chat_release.currentPositionMs());
        }
        AudioPlayerManager.CurrentProgress currentProgress$chat_release = this.state.getCurrentProgress$chat_release();
        if (currentProgress$chat_release != null) {
            return Long.valueOf(currentProgress$chat_release.getCurrentProgress());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeLogPlaybackEnded() {
        Long currentPosition = getCurrentPosition();
        if (currentPosition != null) {
            long longValue = currentPosition.longValue();
            Long l10 = this.startTimeMS;
            if (l10 != null) {
                float secondsSinceStart = Listener.Companion.secondsSinceStart(l10.longValue());
                this.startTimeMS = null;
                Listener listener = this.listener;
                if (listener != null) {
                    a.C0287a aVar = a.f20580l;
                    listener.voiceMessagePlaybackEnded((float) a.F(c.t(longValue, d.MILLISECONDS), d.SECONDS), secondsSinceStart);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeLogPlaybackFailed(String str) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.voiceMessagePlaybackFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeLogPlaybackStarted() {
        Long currentPosition = getCurrentPosition();
        if (currentPosition != null) {
            long longValue = currentPosition.longValue();
            this.startTimeMS = Long.valueOf(System.currentTimeMillis());
            Listener listener = this.listener;
            if (listener != null) {
                a.C0287a aVar = a.f20580l;
                listener.voiceMessagePlaybackStarted((float) a.F(c.t(longValue, d.MILLISECONDS), d.SECONDS));
            }
        }
    }

    private final void prepareAudio(AudioPlayerViewState audioPlayerViewState) {
        AudioPlayerManager.AudioSource audioSource = audioPlayerViewState.getAudioSource();
        if (audioSource != null) {
            AudioPlayerManager audioPlayerManager = AudioPlayerManager.INSTANCE;
            Context context = getContext();
            q.f(context, "context");
            audioPlayerManager.setupPlayer(context, audioSource, this.durationMs, new AudioPlayerView$prepareAudio$1(this));
            this.binding.wave.setEnabled(true);
        }
    }

    private final void reset(boolean z10) {
        Job d10;
        boolean z11 = false;
        toggleDurationEmitter(false);
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null && player$chat_release.shouldPlay()) {
            z11 = true;
        }
        this.wasPlayingBeforeBeingPaused = z11;
        if (z10) {
            this.state.storeDuration$chat_release();
        }
        this.state.releasePlayer$chat_release();
        d10 = l.d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioPlayerView$reset$1(this, null), 3, null);
        this.resetJob = d10;
        l.d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioPlayerView$reset$2(this, null), 3, null);
    }

    private final synchronized void setState(AudioPlayerViewState audioPlayerViewState, boolean z10) {
        if (!z10) {
            if (q.b(this.state, audioPlayerViewState)) {
                return;
            }
        }
        boolean z11 = !q.b(audioPlayerViewState.getSourceUrl(), this.state.getSourceUrl());
        if (z11 && AudioPlayerManager.INSTANCE.hasCurrentPlayer(audioPlayerViewState.getAudioSource())) {
            prepareAudio(audioPlayerViewState);
        }
        this.state = audioPlayerViewState;
        configurePlayButton(audioPlayerViewState);
        configureLoading(audioPlayerViewState);
        configureAudioWave(audioPlayerViewState);
        toggleDurationEmitter(audioPlayerViewState.shouldEmitDuration$chat_release());
        configurePlayerState(audioPlayerViewState, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setState$default(AudioPlayerView audioPlayerView, AudioPlayerViewState audioPlayerViewState, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            audioPlayerViewState = audioPlayerView.state;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        audioPlayerView.setState(audioPlayerViewState, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String timeRemainingAccessibilityText(int i10) {
        if (i10 >= 60) {
            return timeRemainingText(i10);
        }
        return String.valueOf(i10);
    }

    private final String timeRemainingText(int i10) {
        String format = String.format("%01d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i10 / 60), Integer.valueOf(i10 % 60)}, 2));
        q.f(format, "format(this, *args)");
        return format;
    }

    private final int toSeconds(long j10) {
        a.C0287a aVar = a.f20580l;
        return (int) Math.ceil(a.F(c.t(j10, d.MILLISECONDS), d.SECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleDurationEmitter(boolean z10) {
        Job d10;
        Job job = this.durationJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
            Unit unit = Unit.f20663a;
        }
        this.durationJob = null;
        if (z10) {
            d10 = l.d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioPlayerView$toggleDurationEmitter$2(this, null), 3, null);
            this.durationJob = d10;
        }
    }

    public final AudioPlayerViewBinding getBinding() {
        return this.binding;
    }

    public final Listener getListener() {
        return this.listener;
    }

    public final void setDurationMs(long j10) {
        long j11;
        boolean z10;
        this.durationMs = j10;
        AudioPlayerManager.CurrentProgress currentProgress$chat_release = this.state.getCurrentProgress$chat_release();
        if (currentProgress$chat_release != null) {
            j11 = currentProgress$chat_release.getCurrentProgress();
        } else {
            j11 = 0;
        }
        AudioWaveView setDurationMs$lambda$3 = this.binding.wave;
        setDurationMs$lambda$3.setDuration(Long.valueOf(j10));
        q.f(setDurationMs$lambda$3, "setDurationMs$lambda$3");
        AudioWaveView.setAudioProgress$default(setDurationMs$lambda$3, ((float) j11) / ((float) j10), false, 2, null);
        if (this.state.getCurrentProgress$chat_release() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setDurationMs$lambda$3.setEnabled(z10);
        configureDuration(Long.valueOf(j10 - j11), false);
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
    }

    public final void setSampleData(byte[] sampleData) {
        q.g(sampleData, "sampleData");
        this.binding.wave.setOriginalSampleData(sampleData);
    }

    /* renamed from: setSourceUrl-ntcYbpo  reason: not valid java name */
    public final void m324setSourceUrlntcYbpo(String messageId, String str) {
        q.g(messageId, "messageId");
        this.binding.wave.setEnabled(false);
        if (!q.b(str, this.state.getSourceUrl())) {
            if (str == null) {
                reset(false);
            } else {
                setState(new AudioPlayerViewState(messageId, str, false, 4, null), true);
            }
        }
    }

    public final void setUploadProgress(Integer num, Function0<Unit> onCancelUpload, Float f10) {
        boolean z10;
        float f11;
        q.g(onCancelUpload, "onCancelUpload");
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        View root = this.binding.getRoot();
        if (f10 != null) {
            f11 = f10.floatValue();
        } else {
            f11 = 1.0f;
        }
        root.setAlpha(f11);
        AttachmentUploadOverlayView attachmentUploadOverlayView = this.binding.uploadOverlay;
        Integer valueOf = Integer.valueOf(SizeUtilsKt.getDpToPx(32));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        Paint paint = shapeDrawable.getPaint();
        Context context = getContext();
        q.f(context, "context");
        paint.setColor(ColorUtilsKt.getColorCompat(context, 17170445));
        Unit unit = Unit.f20663a;
        attachmentUploadOverlayView.configureProgressView(valueOf, shapeDrawable, Integer.valueOf(SizeUtilsKt.getDpToPx(16)), Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()), Integer.valueOf(SizeUtilsKt.getDpToPx(29)), Integer.valueOf(ThemeManagerKt.getTheme().getBackgroundModifierAccent()));
        this.binding.uploadOverlay.configureCompleteView(Integer.valueOf(SizeUtilsKt.getDpToPx(32)), Integer.valueOf(SizeUtilsKt.getDpToPx(19)));
        if (z10 && !this.uploadFinished) {
            this.binding.uploadOverlayBackground.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
            LinearLayout linearLayout = this.binding.uploadOverlayBackground;
            q.f(linearLayout, "binding.uploadOverlayBackground");
            linearLayout.setVisibility(0);
        }
        AudioPlayerView$setUploadProgress$hideOverlayBackground$1 audioPlayerView$setUploadProgress$hideOverlayBackground$1 = new AudioPlayerView$setUploadProgress$hideOverlayBackground$1(this);
        AttachmentUploadOverlayView attachmentUploadOverlayView2 = this.binding.uploadOverlay;
        q.f(attachmentUploadOverlayView2, "binding.uploadOverlay");
        AttachmentUploadOverlayView.setProgress$default(attachmentUploadOverlayView2, num, null, 2, null);
        this.binding.uploadOverlay.setUploadCancel(onCancelUpload);
        this.binding.uploadOverlay.setOnProgressAnimationComplete(audioPlayerView$setUploadProgress$hideOverlayBackground$1);
    }

    public final void shouldAnimate(boolean z10) {
        this.shouldAnimate = z10;
        this.binding.wave.setShouldAnimate(z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Lazy b10;
        Lazy b11;
        int i11;
        q.g(context, "context");
        AudioPlayerViewBinding inflate = AudioPlayerViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.state = new AudioPlayerViewState(null, null, false, 7, null);
        this.shouldAnimate = true;
        ViewAttachedListener viewAttachedListener = new ViewAttachedListener(this, new AudioPlayerView$attachStateChangeListener$1(this), null, 4, null);
        this.attachStateChangeListener = viewAttachedListener;
        b10 = n.b(new AudioPlayerView$bounceAnimator$2(context));
        this.bounceAnimator$delegate = b10;
        b11 = n.b(new AudioPlayerView$animatorManager$2(context, this));
        this.animatorManager$delegate = b11;
        addOnAttachStateChangeListener(viewAttachedListener);
        LinearLayout _init_$lambda$0 = inflate.playerContainer;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        _init_$lambda$0.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        _init_$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$0, SizeUtilsKt.getDpToPx(24));
        _init_$lambda$0.setOrientation(0);
        _init_$lambda$0.setGravity(16);
        SimpleDraweeView simpleDraweeView = inflate.button;
        q.f(simpleDraweeView, "binding.button");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        SimpleDraweeSpanTextView _init_$lambda$1 = inflate.text;
        q.f(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimaryMedium);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        if (ThemeManagerKt.getTheme() instanceof LightTheme) {
            i11 = R.drawable.drawable_audio_play_button_gradient_light;
        } else {
            i11 = R.drawable.drawable_audio_play_button_gradient_dark;
        }
        inflate.buttonContainer.setBackgroundResource(i11);
        inflate.wipe.setBackgroundResource(i11);
        w0.q0(this, new androidx.core.view.a() { // from class: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.3
            @Override // androidx.core.view.a
            public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
                int i12;
                q.g(host, "host");
                q.g(child, "child");
                q.g(event, "event");
                LinearLayout linearLayout = AudioPlayerView.this.getBinding().playerContainer;
                if (event.getAction() == 32768) {
                    i12 = 2;
                } else {
                    i12 = 0;
                }
                linearLayout.setImportantForAccessibility(i12);
                return super.onRequestSendAccessibilityEvent(host, child, event);
            }
        });
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.chat.presentation.message.view.voicemessages.e
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                AudioPlayerView._init_$lambda$2(AudioPlayerView.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
    }
}
