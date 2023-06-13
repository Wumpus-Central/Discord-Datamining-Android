package com.discord.media.engine.video;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.discord.media.engine.video.events.OnReadyEvent;
import com.discord.media.engine.video.events.OnSizeEvent;
import com.discord.media.engine.video.texture_view.VideoStreamTextureView;
import com.discord.reactevents.ReactEvents;
import com.discord.wakelock.ScreenWakeLock;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import org.webrtc.RendererCommon;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u0017"}, d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/media/engine/video/texture_view/VideoStreamTextureView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "onDropViewInstance", "", "view", "setMirror", "Landroid/view/View;", "mirror", "", "setStreamId", "streamId", "Companion", "RenderListener", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoStreamViewManager extends SimpleViewManager<VideoStreamTextureView> {
    public static final String WAKE_LOCK_KEY = "DCDVideoRenderer";
    public static final Companion Companion = new Companion(null);
    private static final ReactEvents reactEvents = new ReactEvents(x.a("onReady", f0.b(OnReadyEvent.class)), x.a("onSize", f0.b(OnSizeEvent.class)));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager$Companion;", "", "()V", "WAKE_LOCK_KEY", "", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager$RenderListener;", "Lorg/webrtc/RendererCommon$RendererEvents;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "onFirstFrameRendered", "", "onFrameResolutionChanged", "width", "", "height", ViewProps.ROTATION, "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class RenderListener implements RendererCommon.RendererEvents {
        private final View view;

        public RenderListener(View view) {
            q.g(view, "view");
            this.view = view;
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            VideoStreamViewManager.reactEvents.emitEvent(this.view, new OnReadyEvent());
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int i10, int i11, int i12) {
            int i13;
            int i14 = i12 % 180;
            if (i14 == 0) {
                i13 = i10;
            } else {
                i13 = i11;
            }
            if (i14 == 0) {
                i10 = i11;
            }
            VideoStreamViewManager.reactEvents.emitEvent(this.view, new OnSizeEvent(i13, i10));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return WAKE_LOCK_KEY;
    }

    @ReactProp(name = "mirror")
    public final void setMirror(View view, boolean z10) {
        q.g(view, "view");
        ((VideoStreamTextureView) view).setMirror(z10);
    }

    @ReactProp(name = "streamId")
    public final void setStreamId(View view, String str) {
        Unit unit;
        q.g(view, "view");
        VideoStreamTextureView videoStreamTextureView = (VideoStreamTextureView) view;
        if (str != null) {
            videoStreamTextureView.startRenderingStream(str, new RenderListener(view));
            unit = Unit.f22105a;
        } else {
            unit = null;
        }
        if (unit == null) {
            videoStreamTextureView.reset();
        }
        synchronized (this) {
            Context context = ((VideoStreamTextureView) view).getContext();
            q.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            Activity currentActivity = ((ReactContext) context).getCurrentActivity();
            if (currentActivity != null) {
                AttachedVideoSinks attachedVideoSinks = AttachedVideoSinks.INSTANCE;
                if (attachedVideoSinks.anySinksActive()) {
                    ScreenWakeLock.INSTANCE.requestLock(currentActivity, WAKE_LOCK_KEY);
                } else if (!attachedVideoSinks.anySinksActive()) {
                    ScreenWakeLock.INSTANCE.releaseLock(currentActivity, WAKE_LOCK_KEY);
                }
            }
            Unit unit2 = Unit.f22105a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public VideoStreamTextureView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return new VideoStreamTextureView(reactContext, null, 2, null);
    }

    public void onDropViewInstance(VideoStreamTextureView view) {
        q.g(view, "view");
        setStreamId(view, null);
    }
}
