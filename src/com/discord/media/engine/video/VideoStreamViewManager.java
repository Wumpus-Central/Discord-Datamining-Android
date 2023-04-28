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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9656f0;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C10853x;
import org.webrtc.RendererCommon;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u0017"}, m15073d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/media/engine/video/texture_view/VideoStreamTextureView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "onDropViewInstance", "", "view", "setMirror", "Landroid/view/View;", "mirror", "", "setStreamId", "streamId", "Companion", "RenderListener", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class VideoStreamViewManager extends SimpleViewManager<VideoStreamTextureView> {
    public static final String WAKE_LOCK_KEY = "DCDVideoRenderer";
    public static final Companion Companion = new Companion(null);
    private static final ReactEvents reactEvents = new ReactEvents(C10853x.m10921a("onReady", C9656f0.m14684b(OnReadyEvent.class)), C10853x.m10921a("onSize", C9656f0.m14684b(OnSizeEvent.class)));

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager$Companion;", "", "()V", "WAKE_LOCK_KEY", "", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m15073d2 = {"Lcom/discord/media/engine/video/VideoStreamViewManager$RenderListener;", "Lorg/webrtc/RendererCommon$RendererEvents;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "onFirstFrameRendered", "", "onFrameResolutionChanged", "width", "", "height", ViewProps.ROTATION, "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class RenderListener implements RendererCommon.RendererEvents {
        private final View view;

        public RenderListener(View view) {
            C9677q.m14633g(view, "view");
            this.view = view;
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            VideoStreamViewManager.reactEvents.emitEvent(this.view, new OnReadyEvent());
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int i, int i2, int i3) {
            int i4;
            int i5 = i3 % 180;
            if (i5 == 0) {
                i4 = i;
            } else {
                i4 = i2;
            }
            if (i5 == 0) {
                i = i2;
            }
            VideoStreamViewManager.reactEvents.emitEvent(this.view, new OnSizeEvent(i4, i));
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
    public final void setMirror(View view, boolean z) {
        C9677q.m14633g(view, "view");
        ((VideoStreamTextureView) view).setMirror(z);
    }

    @ReactProp(name = "streamId")
    public final void setStreamId(View view, String str) {
        Unit unit;
        C9677q.m14633g(view, "view");
        VideoStreamTextureView videoStreamTextureView = (VideoStreamTextureView) view;
        if (str != null) {
            videoStreamTextureView.startRenderingStream(str, new RenderListener(view));
            unit = Unit.f25780a;
        } else {
            unit = null;
        }
        if (unit == null) {
            videoStreamTextureView.reset();
        }
        synchronized (this) {
            Context context = ((VideoStreamTextureView) view).getContext();
            C9677q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            Activity currentActivity = ((ReactContext) context).getCurrentActivity();
            if (currentActivity != null) {
                AttachedVideoSinks attachedVideoSinks = AttachedVideoSinks.INSTANCE;
                if (attachedVideoSinks.anySinksActive()) {
                    ScreenWakeLock.INSTANCE.requestLock(currentActivity, WAKE_LOCK_KEY);
                } else if (!attachedVideoSinks.anySinksActive()) {
                    ScreenWakeLock.INSTANCE.releaseLock(currentActivity, WAKE_LOCK_KEY);
                }
            }
            Unit unit2 = Unit.f25780a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public VideoStreamTextureView createViewInstance(ThemedReactContext reactContext) {
        C9677q.m14633g(reactContext, "reactContext");
        return new VideoStreamTextureView(reactContext, null, 2, null);
    }

    public void onDropViewInstance(VideoStreamTextureView view) {
        C9677q.m14633g(view, "view");
        setStreamId(view, null);
    }
}
