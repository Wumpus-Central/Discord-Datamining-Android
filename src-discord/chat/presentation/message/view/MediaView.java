package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.discord.chat.R;
import com.discord.chat.databinding.MediaViewBinding;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaPlayerManager;
import com.discord.media_player.MediaPlayerManagerModule;
import com.discord.media_player.MediaPlayerView;
import com.discord.media_player.MediaSource;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.portals.PortalViewContextManager;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.l;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010)\u001a\u00020*H\u0014J\u0012\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0010\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020*H\u0002J\b\u00101\u001a\u00020*H\u0002J$\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c032\u0006\u0010 \u001a\u00020!2\u0006\u00104\u001a\u00020\u0012H\u0002J\b\u00105\u001a\u00020*H\u0002J\b\u00106\u001a\u00020*H\u0002J\u0081\u0001\u00107\u001a\u00020*2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010%\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0002\u00108J(\u00109\u001a\u00020*2\u0016\u0010:\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010<\u0012\u0004\u0012\u00020*\u0018\u00010;2\b\u0010=\u001a\u0004\u0018\u00010>J\u0010\u0010?\u001a\u00020*2\u0006\u00101\u001a\u00020\u0012H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\u00020\u0012*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006@"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attachStateChangeListener", "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "binding", "Lcom/discord/chat/databinding/MediaViewBinding;", "getBinding$annotations", "()V", "managerModule", "Lcom/discord/media_player/MediaPlayerManagerModule;", "mediaCanPlayInline", "", "mediaHidePlayButton", "mediaOrientation", "Ljava/lang/Integer;", "mediaPlayThirdParty", "mediaPlaybackState", "Lcom/discord/media_player/MediaPlayer$Event;", "mediaPlayer", "Lcom/discord/media_player/MediaPlayer;", "mediaPlayerView", "Lcom/discord/media_player/MediaPlayerView;", "mediaPortalEvent", "Lcom/discord/portals/PortalViewContextManager$Event;", "mediaShouldResume", "mediaSource", "Lcom/discord/media_player/MediaSource;", "mediaViewDetached", "mediaViewFocused", "mediaViewScrolling", "mediaVolumeOn", "shouldShowGifIndicator", "getShouldShowGifIndicator", "(Lcom/discord/media_player/MediaSource;)Z", "onAttachedToWindow", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onWindowFocusChanged", "hasWindowFocus", "pause", "play", "prepareMediaPlayer", "Lkotlin/Pair;", "loopMedia", "registerForPortal", "releasePlayer", "setMediaData", "(Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZ)V", "setOnMediaClickListeners", "onClickListener", "Lkotlin/Function1;", "", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "togglePortalControl", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class MediaView extends FrameLayout {
    private final ViewAttachedListener attachStateChangeListener;
    private final MediaViewBinding binding;
    private final MediaPlayerManagerModule managerModule;
    private boolean mediaCanPlayInline;
    private boolean mediaHidePlayButton;
    private Integer mediaOrientation;
    private boolean mediaPlayThirdParty;
    private MediaPlayer.Event mediaPlaybackState;
    private MediaPlayer mediaPlayer;
    private MediaPlayerView mediaPlayerView;
    private PortalViewContextManager.Event mediaPortalEvent;
    private boolean mediaShouldResume;
    private MediaSource mediaSource;
    private boolean mediaViewDetached;
    private boolean mediaViewFocused;
    private boolean mediaViewScrolling;
    private boolean mediaVolumeOn;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private static /* synthetic */ void getBinding$annotations() {
    }

    private final boolean getShouldShowGifIndicator(MediaSource mediaSource) {
        return mediaSource.isGifv() && !mediaSource.getShouldAutoPlay();
    }

    private final void pause() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        togglePortalControl(false);
    }

    public final void play() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.play();
        }
        togglePortalControl(true);
    }

    private final Pair<MediaPlayer, MediaPlayerView> prepareMediaPlayer(MediaSource mediaSource, boolean z10) {
        float f10;
        MediaPlayerView mediaPlayerView = this.mediaPlayerView;
        if (mediaPlayerView == null) {
            Context context = getContext();
            q.f(context, "context");
            mediaPlayerView = new MediaPlayerView(context);
            addView(mediaPlayerView.getView(), 0, new FrameLayout.LayoutParams(-1, -1));
        }
        mediaPlayerView.setVisible(true);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            MediaPlayerManager mediaPlayerManager = MediaPlayerManager.INSTANCE;
            Context context2 = getContext();
            q.f(context2, "context");
            Double portal = mediaSource.getPortal();
            q.d(portal);
            mediaPlayer = mediaPlayerManager.acquire(context2, portal.doubleValue());
        }
        mediaPlayer.setEventListener(new MediaView$prepareMediaPlayer$1$1(this));
        mediaPlayer.setVolumeListener(new MediaView$prepareMediaPlayer$1$2(this));
        if (mediaSource.isGifv()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        mediaPlayer.setVolume(f10);
        MediaPlayer.preparePlayer$default(mediaPlayer, mediaSource, true, z10, 0L, mediaPlayerView, null, 40, null);
        this.mediaPlayer = mediaPlayer;
        this.mediaPlayerView = mediaPlayerView;
        ViewMeasureExtensionsKt.measureAndLayout(this);
        return new Pair<>(mediaPlayer, mediaPlayerView);
    }

    private final void registerForPortal() {
        Double portal;
        Pair<MediaPlayer, MediaPlayerView> pair;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null && (portal = mediaSource.getPortal()) != null) {
            double doubleValue = portal.doubleValue();
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null && this.mediaPlayerView != null) {
                q.d(mediaPlayer);
                MediaPlayerView mediaPlayerView = this.mediaPlayerView;
                q.d(mediaPlayerView);
                pair = new Pair<>(mediaPlayer, mediaPlayerView);
            } else if (mediaSource.isValid()) {
                pair = prepareMediaPlayer(mediaSource, mediaSource.isGifv());
            } else {
                return;
            }
            MediaPlayer a10 = pair.a();
            PortalViewContextManager.INSTANCE.addPortal(doubleValue, pair.b().getView(), new MediaView$registerForPortal$1(this), new MediaView$registerForPortal$2(this, doubleValue, a10), new MediaView$registerForPortal$3(this, a10, doubleValue, mediaSource), new MediaView$registerForPortal$4(mediaSource, this));
        }
    }

    public final void releasePlayer() {
        Double d10;
        Double portal;
        MediaPlayerManagerModule mediaPlayerManagerModule = this.managerModule;
        if (mediaPlayerManagerModule != null) {
            MediaSource mediaSource = this.mediaSource;
            if (mediaSource != null && (portal = mediaSource.getPortal()) != null) {
                mediaPlayerManagerModule.toggle(portal.doubleValue(), false);
            } else {
                return;
            }
        }
        MediaPlayerManager mediaPlayerManager = MediaPlayerManager.INSTANCE;
        MediaSource mediaSource2 = this.mediaSource;
        if (mediaSource2 != null) {
            d10 = mediaSource2.getPortal();
        } else {
            d10 = null;
        }
        mediaPlayerManager.release(d10);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            Unit unit = Unit.f20685a;
            this.mediaPlayer = null;
        }
        MediaPlayerView mediaPlayerView = this.mediaPlayerView;
        if (mediaPlayerView != null) {
            mediaPlayerView.reset();
        }
    }

    public static /* synthetic */ void setMediaData$default(MediaView mediaView, MediaSource mediaSource, boolean z10, boolean z11, boolean z12, MediaPlayer.Event event, boolean z13, Integer num, PortalViewContextManager.Event event2, boolean z14, boolean z15, boolean z16, int i10, Object obj) {
        if (obj == null) {
            mediaView.setMediaData((i10 & 1) != 0 ? mediaView.mediaSource : mediaSource, (i10 & 2) != 0 ? mediaView.mediaViewDetached : z10, (i10 & 4) != 0 ? mediaView.mediaViewScrolling : z11, (i10 & 8) != 0 ? mediaView.mediaViewFocused : z12, (i10 & 16) != 0 ? mediaView.mediaPlaybackState : event, (i10 & 32) != 0 ? mediaView.mediaVolumeOn : z13, (i10 & 64) != 0 ? mediaView.mediaOrientation : num, (i10 & 128) != 0 ? mediaView.mediaPortalEvent : event2, (i10 & 256) != 0 ? mediaView.mediaCanPlayInline : z14, (i10 & 512) != 0 ? mediaView.mediaPlayThirdParty : z15, (i10 & 1024) != 0 ? mediaView.mediaHidePlayButton : z16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMediaData");
    }

    public static final void setMediaData$lambda$3(MediaView this$0, MediaSource mediaSource, View view) {
        q.g(this$0, "this$0");
        if (this$0.mediaPlayer == null || this$0.mediaPlayerView == null) {
            this$0.prepareMediaPlayer(mediaSource, false);
        } else {
            this$0.play();
        }
    }

    public static final void setMediaData$lambda$5(MediaView this$0, boolean z10, MediaSource mediaSource, View view) {
        Double portal;
        float f10;
        q.g(this$0, "this$0");
        MediaPlayer mediaPlayer = this$0.mediaPlayer;
        if (mediaPlayer != null) {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            mediaPlayer.setVolume(f10);
        }
        if (mediaSource != null && (portal = mediaSource.getPortal()) != null) {
            double doubleValue = portal.doubleValue();
            MediaPlayerManagerModule mediaPlayerManagerModule = this$0.managerModule;
            if (mediaPlayerManagerModule != null) {
                mediaPlayerManagerModule.onMuteToggle(doubleValue, z10);
            }
        }
    }

    public static final void setOnMediaClickListeners$lambda$7(MediaView this$0, Function1 function1, View view) {
        Double portal;
        q.g(this$0, "this$0");
        this$0.registerForPortal();
        MediaSource mediaSource = this$0.mediaSource;
        Double d10 = null;
        if (!(mediaSource == null || (portal = mediaSource.getPortal()) == null)) {
            portal.doubleValue();
            MediaSource mediaSource2 = this$0.mediaSource;
            boolean z10 = false;
            if (mediaSource2 != null && mediaSource2.isValid()) {
                z10 = true;
            }
            if (z10) {
                d10 = portal;
            }
        }
        function1.invoke(d10);
    }

    private final void togglePortalControl(boolean z10) {
        Double portal;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null && (portal = mediaSource.getPortal()) != null) {
            double doubleValue = portal.doubleValue();
            MediaPlayerManagerModule mediaPlayerManagerModule = this.managerModule;
            if (mediaPlayerManagerModule != null) {
                mediaPlayerManagerModule.toggle(doubleValue, z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.d(CoroutineViewUtilsKt.attachedScope(this, true), null, null, new MediaView$onAttachedToWindow$1(this, null), 3, null);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        Integer num;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            num = Integer.valueOf(configuration.orientation);
        } else {
            num = null;
        }
        setMediaData$default(this, null, false, false, false, null, false, num, null, false, false, false, 1983, null);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        setMediaData$default(this, null, false, false, z10, null, false, null, null, false, false, false, 2039, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setMediaData(final com.discord.media_player.MediaSource r23, boolean r24, boolean r25, boolean r26, com.discord.media_player.MediaPlayer.Event r27, final boolean r28, java.lang.Integer r29, com.discord.portals.PortalViewContextManager.Event r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.MediaView.setMediaData(com.discord.media_player.MediaSource, boolean, boolean, boolean, com.discord.media_player.MediaPlayer$Event, boolean, java.lang.Integer, com.discord.portals.PortalViewContextManager$Event, boolean, boolean, boolean):void");
    }

    public final void setOnMediaClickListeners(final Function1<? super Double, Unit> function1, View.OnLongClickListener onLongClickListener) {
        View.OnClickListener onClickListener;
        if (function1 != null) {
            onClickListener = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MediaView.setOnMediaClickListeners$lambda$7(MediaView.this, function1, view);
                }
            };
        } else {
            onClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, onClickListener, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this, false, onLongClickListener, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        MediaViewBinding inflate = MediaViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.mediaViewFocused = true;
        this.mediaViewDetached = true;
        this.mediaCanPlayInline = true;
        ThemedReactContext themedReactContext = (ThemedReactContext) (!(context instanceof ThemedReactContext) ? null : context);
        this.managerModule = themedReactContext != null ? (MediaPlayerManagerModule) themedReactContext.getNativeModule(MediaPlayerManagerModule.class) : null;
        ViewAttachedListener viewAttachedListener = new ViewAttachedListener(this, new MediaView$attachStateChangeListener$1(this), new MediaView$attachStateChangeListener$2(this));
        this.attachStateChangeListener = viewAttachedListener;
        addOnAttachStateChangeListener(viewAttachedListener);
        ImageView _init_$lambda$0 = inflate.inlineMediaPlayButton;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        ViewBackgroundUtilsKt.setBackgroundOval$default(_init_$lambda$0, -16777216, 0, 2, null);
        ColorUtilsKt.setTintColor(_init_$lambda$0, (Integer) (-1));
        I18nUtilsKt.i18nContentDescription$default(_init_$lambda$0, I18nMessage.PLAY_FULL_VIDEO, (Function1) null, 2, (Object) null);
        SimpleDraweeView simpleDraweeView = inflate.inlineMediaGifIndicator;
        q.f(simpleDraweeView, "binding.inlineMediaGifIndicator");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Gif);
        SimpleDraweeView simpleDraweeView2 = inflate.inlineMediaImagePreview;
        simpleDraweeView2.getHierarchy().z(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(simpleDraweeView2.getResources().getDimensionPixelSize(R.dimen.message_media_view_stroke), ColorUtilsKt.getColorCompat(context, R.color.chat_media_view_stroke));
        simpleDraweeView2.getHierarchy().y(gradientDrawable);
    }
}
