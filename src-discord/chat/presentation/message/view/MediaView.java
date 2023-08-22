package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
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
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.l;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010/\u001a\u000200H\u0014J\u0012\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u000103H\u0014J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u00020\u0019H\u0016J\b\u00106\u001a\u000200H\u0002J\b\u00107\u001a\u000200H\u0002J$\u00108\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\"092\u0006\u0010&\u001a\u00020'2\u0006\u0010:\u001a\u00020\u0019H\u0002J\b\u0010;\u001a\u000200H\u0002J\b\u0010<\u001a\u000200H\u0002J±\u0001\u0010=\u001a\u0002002\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010+\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010>J(\u0010?\u001a\u0002002\u0016\u0010@\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u000200\u0018\u00010A2\b\u0010C\u001a\u0004\u0018\u00010DJ=\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020\u00192\b\u0010G\u001a\u0004\u0018\u00010\u00102\b\u0010H\u001a\u0004\u0018\u00010\u000e2\b\u0010I\u001a\u0004\u0018\u00010\u00072\b\u0010J\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010KJ\u0010\u0010L\u001a\u0002002\u0006\u00107\u001a\u00020\u0019H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010,\u001a\u00020\u0019*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006M"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attachStateChangeListener", "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "attachmentTagBackgroundColor", "Ljava/lang/Integer;", "attachmentTagIcon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "attachmentTagText", "", "attachmentTagTextColor", "binding", "Lcom/discord/chat/databinding/MediaViewBinding;", "getBinding$annotations", "()V", "managerModule", "Lcom/discord/media_player/MediaPlayerManagerModule;", "mediaCanPlayInline", "", "mediaHidePlayButton", "mediaOrientation", "mediaPlayThirdParty", "mediaPlaybackState", "Lcom/discord/media_player/MediaPlayer$Event;", "mediaPlayer", "Lcom/discord/media_player/MediaPlayer;", "mediaPlayerView", "Lcom/discord/media_player/MediaPlayerView;", "mediaPortalEvent", "Lcom/discord/portals/PortalViewContextManager$Event;", "mediaShouldResume", "mediaSource", "Lcom/discord/media_player/MediaSource;", "mediaViewDetached", "mediaViewFocused", "mediaViewScrolling", "mediaVolumeOn", "shouldShowGifIndicator", "getShouldShowGifIndicator", "(Lcom/discord/media_player/MediaSource;)Z", "onAttachedToWindow", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onWindowFocusChanged", "hasWindowFocus", "pause", "play", "prepareMediaPlayer", "Lkotlin/Pair;", "loopMedia", "registerForPortal", "releasePlayer", "setMediaData", "(Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZLjava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setOnMediaClickListeners", "onClickListener", "Lkotlin/Function1;", "", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "setupTag", "isTagVisible", "content", "icon", ViewProps.BACKGROUND_COLOR, "textColor", "(ZLjava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Ljava/lang/Integer;Ljava/lang/Integer;)V", "togglePortalControl", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public class MediaView extends FrameLayout {
    private final ViewAttachedListener attachStateChangeListener;
    private Integer attachmentTagBackgroundColor;
    private ReactAsset attachmentTagIcon;
    private String attachmentTagText;
    private Integer attachmentTagTextColor;
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

    
    public MediaView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  MediaView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private static  void getBinding$annotations() {
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
            q.g(context, "context");
            mediaPlayerView = new MediaPlayerView(context);
            addView(mediaPlayerView.getView(), 0, new FrameLayout.LayoutParams(-1, -1));
        }
        mediaPlayerView.setVisible(true);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            MediaPlayerManager mediaPlayerManager = MediaPlayerManager.INSTANCE;
            Context context2 = getContext();
            q.g(context2, "context");
            Double portal = mediaSource.getPortal();
            q.e(portal);
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
                q.e(mediaPlayer);
                MediaPlayerView mediaPlayerView = this.mediaPlayerView;
                q.e(mediaPlayerView);
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
            Unit unit = Unit.f21213a;
            this.mediaPlayer = null;
        }
        MediaPlayerView mediaPlayerView = this.mediaPlayerView;
        if (mediaPlayerView != null) {
            mediaPlayerView.reset();
        }
    }

    public static  void setMediaData$default(MediaView mediaView, MediaSource mediaSource, boolean z10, boolean z11, boolean z12, MediaPlayer.Event event, boolean z13, Integer num, PortalViewContextManager.Event event2, boolean z14, boolean z15, boolean z16, String str, ReactAsset reactAsset, Integer num2, Integer num3, int i10, Object obj) {
        if (obj == null) {
            mediaView.setMediaData((i10 & 1) != 0 ? mediaView.mediaSource : mediaSource, (i10 & 2) != 0 ? mediaView.mediaViewDetached : z10, (i10 & 4) != 0 ? mediaView.mediaViewScrolling : z11, (i10 & 8) != 0 ? mediaView.mediaViewFocused : z12, (i10 & 16) != 0 ? mediaView.mediaPlaybackState : event, (i10 & 32) != 0 ? mediaView.mediaVolumeOn : z13, (i10 & 64) != 0 ? mediaView.mediaOrientation : num, (i10 & 128) != 0 ? mediaView.mediaPortalEvent : event2, (i10 & 256) != 0 ? mediaView.mediaCanPlayInline : z14, (i10 & 512) != 0 ? mediaView.mediaPlayThirdParty : z15, (i10 & 1024) != 0 ? mediaView.mediaHidePlayButton : z16, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? mediaView.attachmentTagText : str, (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? mediaView.attachmentTagIcon : reactAsset, (i10 & 8192) != 0 ? mediaView.attachmentTagBackgroundColor : num2, (i10 & 16384) != 0 ? mediaView.attachmentTagTextColor : num3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMediaData");
    }

    public static final void setMediaData$lambda$3(MediaView this$0, MediaSource mediaSource, View view) {
        q.h(this$0, "this$0");
        if (this$0.mediaPlayer == null || this$0.mediaPlayerView == null) {
            this$0.prepareMediaPlayer(mediaSource, false);
        } else {
            this$0.play();
        }
    }

    public static final void setMediaData$lambda$5(MediaView this$0, boolean z10, MediaSource mediaSource, View view) {
        Double portal;
        float f10;
        q.h(this$0, "this$0");
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
        q.h(this$0, "this$0");
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

    private final void setupTag(boolean z10, String str, ReactAsset reactAsset, Integer num, Integer num2) {
        int i10;
        boolean z11;
        int i11;
        ConstraintLayout setupTag$lambda$8 = this.binding.attachmentTag;
        q.g(setupTag$lambda$8, "setupTag$lambda$8");
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setupTag$lambda$8.setVisibility(i10);
        if (num != null) {
            setupTag$lambda$8.setBackgroundTintList(ColorStateList.valueOf(num.intValue()));
        }
        ConstraintLayout constraintLayout = this.binding.attachmentTag;
        q.g(constraintLayout, "binding.attachmentTag");
        if (constraintLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (num2 != null) {
                i11 = num2.intValue();
            } else {
                i11 = R.color.white_500;
            }
            SimpleDraweeView setupTag$lambda$9 = this.binding.attachmentTagIcon;
            if (reactAsset != null) {
                q.g(setupTag$lambda$9, "setupTag$lambda$9");
                setupTag$lambda$9.setVisibility(0);
                ReactAssetUtilsKt.setReactAsset(setupTag$lambda$9, reactAsset);
                ColorUtilsKt.setTintColor(setupTag$lambda$9, Integer.valueOf(i11));
            } else {
                q.g(setupTag$lambda$9, "setupTag$lambda$9");
                setupTag$lambda$9.setVisibility(8);
            }
            TextView textView = this.binding.attachmentTagText;
            textView.setTextColor(i11);
            textView.setText(str);
        }
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

    @Override 
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.d(CoroutineViewUtilsKt.attachedScope(this, true), null, null, new MediaView$onAttachedToWindow$1(this, null), 3, null);
    }

    @Override 
    protected void onConfigurationChanged(Configuration configuration) {
        Integer num;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            num = Integer.valueOf(configuration.orientation);
        } else {
            num = null;
        }
        setMediaData$default(this, null, false, false, false, null, false, num, null, false, false, false, null, null, null, null, 32703, null);
    }

    @Override 
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        setMediaData$default(this, null, false, false, z10, null, false, null, null, false, false, false, null, null, null, null, 32759, null);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public final void setMediaData(final com.discord.media_player.MediaSource r25, boolean r26, boolean r27, boolean r28, com.discord.media_player.MediaPlayer.Event r29, final boolean r30, java.lang.Integer r31, com.discord.portals.PortalViewContextManager.Event r32, boolean r33, boolean r34, boolean r35, java.lang.String r36, com.discord.react_asset_fetcher.ReactAsset r37, java.lang.Integer r38, java.lang.Integer r39) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.MediaView.setMediaData(com.discord.media_player.MediaSource, boolean, boolean, boolean, com.discord.media_player.MediaPlayer$Event, boolean, java.lang.Integer, com.discord.portals.PortalViewContextManager$Event, boolean, boolean, boolean, java.lang.String, com.discord.react_asset_fetcher.ReactAsset, java.lang.Integer, java.lang.Integer):void");
    }

    public final void setOnMediaClickListeners(final Function1<? super Double, Unit> function1, View.OnLongClickListener onLongClickListener) {
        View.OnClickListener onClickListener;
        if (function1 != null) {
            onClickListener = new View.OnClickListener() { 
                @Override 
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

    
    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        MediaViewBinding inflate = MediaViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
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
        q.g(_init_$lambda$0, "_init_$lambda$0");
        ViewBackgroundUtilsKt.setBackgroundOval$default(_init_$lambda$0, -16777216, 0, 2, null);
        ColorUtilsKt.setTintColor(_init_$lambda$0, (Integer) (-1));
        I18nUtilsKt.i18nContentDescription$default(_init_$lambda$0, I18nMessage.PLAY_FULL_VIDEO, (Function1) null, 2, (Object) null);
        SimpleDraweeView simpleDraweeView = inflate.inlineMediaGifIndicator;
        q.g(simpleDraweeView, "binding.inlineMediaGifIndicator");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Gif);
        SimpleDraweeView simpleDraweeView2 = inflate.inlineMediaImagePreview;
        simpleDraweeView2.getHierarchy().z(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(simpleDraweeView2.getResources().getDimensionPixelSize(R.dimen.message_media_view_stroke), ColorUtilsKt.getColorCompat(context, R.color.chat_media_view_stroke));
        simpleDraweeView2.getHierarchy().y(gradientDrawable);
    }
}
