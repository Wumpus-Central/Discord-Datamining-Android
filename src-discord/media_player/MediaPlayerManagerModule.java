package com.discord.media_player;

import android.app.Activity;
import android.view.View;
import com.discord.media_player.reactevents.MediaPlayerMuteStateChanged;
import com.discord.media_player.reactevents.MediaPlayerPause;
import com.discord.media_player.reactevents.MediaPlayerProgress;
import com.discord.portals.PortalViewContext;
import com.discord.portals.PortalViewContextManager;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kg.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.l;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p2;

@ReactModule(name = MediaPlayerManagerModule.NAME)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0016J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0014H\u0007J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001cH\u0007J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u001cH\u0007J\u0016\u0010#\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%J\u0015\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u001cH\u0007J$\u0010*\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000e0,H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/discord/media_player/MediaPlayerManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mediaPlayerProgressMap", "", "", "Lkotlinx/coroutines/Job;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "addListener", "", "type", "", "changeProgress", "portal", "seekToSec", "", "getName", "onMediaPlayerProgress", "time", "", "duration", "onMuteToggle", "isMuted", "", "removeListeners", "count", "setLoopPlayback", "loop", "setMuted", "muted", "startPlayerProgressInterval", "mediaPlayer", "Lcom/discord/media_player/MediaPlayer;", "stopPlayerProgressInterval", "(D)Lkotlin/Unit;", "toggle", "play", "withPlayer", "callback", "Lkotlin/Function1;", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "Companion", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MediaPlayerManagerModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "MediaPlayerManager";
    private final ReactApplicationContext reactContext;
    private final CoroutineScope scope;
    private final Map<Double, Job> mediaPlayerProgressMap = new LinkedHashMap();
    private final ReactEvents reactEvents = new ReactEvents(x.a("MediaPlayerPause", f0.b(MediaPlayerPause.class)), x.a("MediaPlayerProgress", f0.b(MediaPlayerProgress.class)), x.a("MediaPlayerMuteStateChanged", f0.b(MediaPlayerMuteStateChanged.class)));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/media_player/MediaPlayerManagerModule$Companion;", "", "()V", "NAME", "", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.reactContext = reactContext;
        kotlinx.coroutines.x b10 = p2.b(null, 1, null);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        q.f(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.scope = k0.a(b10.f0(m1.a(newSingleThreadExecutor)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaPlayerProgress(double d10, long j10, long j11) {
        ReactEvents reactEvents = this.reactEvents;
        ReactApplicationContext reactApplicationContext = this.reactContext;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        reactEvents.emitModuleEvent(reactApplicationContext, new MediaPlayerProgress(d10, timeUnit.toSeconds(j10), timeUnit.toSeconds(j11)));
    }

    private final void withPlayer(final double d10, final Function1<? super SimpleExoPlayer, Unit> function1) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.discord.media_player.a
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPlayerManagerModule.withPlayer$lambda$2(d10, function1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withPlayer$lambda$2(double d10, Function1 callback) {
        WeakReference<View> view;
        View view2;
        Player player;
        q.g(callback, "$callback");
        PortalViewContext viewContext = PortalViewContextManager.INSTANCE.getViewContext(d10);
        if (viewContext != null && (view = viewContext.getView()) != null && (view2 = view.get()) != null) {
            SimpleExoPlayer simpleExoPlayer = null;
            if (!(view2 instanceof PlayerView)) {
                view2 = null;
            }
            PlayerView playerView = (PlayerView) view2;
            if (playerView != null && (player = playerView.getPlayer()) != null) {
                q.f(player, "player");
                if (player instanceof SimpleExoPlayer) {
                    simpleExoPlayer = player;
                }
                SimpleExoPlayer simpleExoPlayer2 = simpleExoPlayer;
                if (simpleExoPlayer2 != null) {
                    callback.invoke(simpleExoPlayer2);
                }
            }
        }
    }

    @ReactMethod
    public final void addListener(String type) {
        q.g(type, "type");
    }

    @ReactMethod
    public final void changeProgress(double d10, int i10) {
        withPlayer(d10, new MediaPlayerManagerModule$changeProgress$1(i10));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public final void onMuteToggle(double d10, boolean z10) {
        this.reactEvents.emitModuleEvent(this.reactContext, new MediaPlayerMuteStateChanged(d10, z10));
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }

    @ReactMethod
    public final void setLoopPlayback(double d10, boolean z10) {
        withPlayer(d10, new MediaPlayerManagerModule$setLoopPlayback$1(z10));
    }

    @ReactMethod
    public final void setMuted(double d10, boolean z10) {
        withPlayer(d10, new MediaPlayerManagerModule$setMuted$1(z10));
    }

    public final void startPlayerProgressInterval(double d10, MediaPlayer mediaPlayer) {
        Job d11;
        q.g(mediaPlayer, "mediaPlayer");
        stopPlayerProgressInterval(d10);
        onMediaPlayerProgress(d10, mediaPlayer.currentPositionMs(), mediaPlayer.durationMs());
        Double valueOf = Double.valueOf(d10);
        Map<Double, Job> map = this.mediaPlayerProgressMap;
        d11 = l.d(this.scope, null, null, new MediaPlayerManagerModule$startPlayerProgressInterval$1(mediaPlayer, this, d10, null), 3, null);
        map.put(valueOf, d11);
    }

    public final Unit stopPlayerProgressInterval(double d10) {
        Job remove = this.mediaPlayerProgressMap.remove(Double.valueOf(d10));
        if (remove == null) {
            return null;
        }
        Job.a.a(remove, null, 1, null);
        return Unit.f22063a;
    }

    @ReactMethod
    public final void toggle(double d10, boolean z10) {
        withPlayer(d10, new MediaPlayerManagerModule$toggle$1(z10, this, d10));
    }
}
