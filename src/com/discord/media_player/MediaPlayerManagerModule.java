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
import com.google.android.exoplayer2.p049ui.PlayerView;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9656f0;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.AbstractC9941x;
import kotlinx.coroutines.C9846k0;
import kotlinx.coroutines.C9851l;
import kotlinx.coroutines.C9858m1;
import kotlinx.coroutines.C9871p2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import nf.C10853x;

@ReactModule(name = MediaPlayerManagerModule.NAME)
@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0016J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0014H\u0007J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001cH\u0007J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u001cH\u0007J\u0016\u0010#\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%J\u0015\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u001cH\u0007J$\u0010*\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000e0,H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayerManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mediaPlayerProgressMap", "", "", "Lkotlinx/coroutines/Job;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "addListener", "", "type", "", "changeProgress", "portal", "seekToSec", "", "getName", "onMediaPlayerProgress", "time", "", "duration", "onMuteToggle", "isMuted", "", "removeListeners", "count", "setLoopPlayback", "loop", "setMuted", "muted", "startPlayerProgressInterval", "mediaPlayer", "Lcom/discord/media_player/MediaPlayer;", "stopPlayerProgressInterval", "(D)Lkotlin/Unit;", "toggle", "play", "withPlayer", "callback", "Lkotlin/Function1;", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "Companion", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class MediaPlayerManagerModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "MediaPlayerManager";
    private final ReactApplicationContext reactContext;
    private final CoroutineScope scope;
    private final Map<Double, Job> mediaPlayerProgressMap = new LinkedHashMap();
    private final ReactEvents reactEvents = new ReactEvents(C10853x.m10921a("MediaPlayerPause", C9656f0.m14684b(MediaPlayerPause.class)), C10853x.m10921a("MediaPlayerProgress", C9656f0.m14684b(MediaPlayerProgress.class)), C10853x.m10921a("MediaPlayerMuteStateChanged", C9656f0.m14684b(MediaPlayerMuteStateChanged.class)));

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayerManagerModule$Companion;", "", "()V", "NAME", "", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
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
        C9677q.m14633g(reactContext, "reactContext");
        this.reactContext = reactContext;
        AbstractC9941x b = C9871p2.m14110b(null, 1, null);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C9677q.m14634f(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.scope = C9846k0.m14187a(b.mo3485f0(C9858m1.m14166a(newSingleThreadExecutor)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaPlayerProgress(double d, long j, long j2) {
        ReactEvents reactEvents = this.reactEvents;
        ReactApplicationContext reactApplicationContext = this.reactContext;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        reactEvents.emitModuleEvent(reactApplicationContext, new MediaPlayerProgress(d, timeUnit.toSeconds(j), timeUnit.toSeconds(j2)));
    }

    private final void withPlayer(final double d, final Function1<? super SimpleExoPlayer, Unit> function1) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.discord.media_player.a
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPlayerManagerModule.withPlayer$lambda$2(d, function1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withPlayer$lambda$2(double d, Function1 callback) {
        WeakReference<View> view;
        View view2;
        Player player;
        C9677q.m14633g(callback, "$callback");
        PortalViewContext viewContext = PortalViewContextManager.INSTANCE.getViewContext(d);
        if (viewContext != null && (view = viewContext.getView()) != null && (view2 = view.get()) != null) {
            SimpleExoPlayer simpleExoPlayer = null;
            if (!(view2 instanceof PlayerView)) {
                view2 = null;
            }
            PlayerView playerView = (PlayerView) view2;
            if (playerView != null && (player = playerView.getPlayer()) != null) {
                C9677q.m14634f(player, "player");
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
        C9677q.m14633g(type, "type");
    }

    @ReactMethod
    public final void changeProgress(double d, int i) {
        withPlayer(d, new MediaPlayerManagerModule$changeProgress$1(i));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public final void onMuteToggle(double d, boolean z) {
        this.reactEvents.emitModuleEvent(this.reactContext, new MediaPlayerMuteStateChanged(d, z));
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @ReactMethod
    public final void setLoopPlayback(double d, boolean z) {
        withPlayer(d, new MediaPlayerManagerModule$setLoopPlayback$1(z));
    }

    @ReactMethod
    public final void setMuted(double d, boolean z) {
        withPlayer(d, new MediaPlayerManagerModule$setMuted$1(z));
    }

    public final void startPlayerProgressInterval(double d, MediaPlayer mediaPlayer) {
        Job d2;
        C9677q.m14633g(mediaPlayer, "mediaPlayer");
        stopPlayerProgressInterval(d);
        onMediaPlayerProgress(d, mediaPlayer.currentPositionMs(), mediaPlayer.durationMs());
        Double valueOf = Double.valueOf(d);
        Map<Double, Job> map = this.mediaPlayerProgressMap;
        d2 = C9851l.m14174d(this.scope, null, null, new MediaPlayerManagerModule$startPlayerProgressInterval$1(mediaPlayer, this, d, null), 3, null);
        map.put(valueOf, d2);
    }

    public final Unit stopPlayerProgressInterval(double d) {
        Job remove = this.mediaPlayerProgressMap.remove(Double.valueOf(d));
        if (remove == null) {
            return null;
        }
        Job.C9704a.m14571a(remove, null, 1, null);
        return Unit.f25780a;
    }

    @ReactMethod
    public final void toggle(double d, boolean z) {
        withPlayer(d, new MediaPlayerManagerModule$toggle$1(z, this, d));
    }
}
