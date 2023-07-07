package com.discord.media.engine.video.texture_view;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.logging.Log;
import com.discord.media.engine.types.Debug;
import com.discord.media.engine.video.egl_renderer.EglRenderer;
import com.discord.media.engine.video.egl_renderer.ErrorCallback;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.q;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J \u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0017J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J \u0010 \u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/discord/media/engine/video/texture_view/TextureViewEglRenderer;", "Lcom/discord/media/engine/video/egl_renderer/EglRenderer;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;", ZeroconfModule.KEY_SERVICE_NAME, "", "(Ljava/lang/String;)V", "frameRotation", "", "isFirstFrameRendered", "", "layoutLock", "", "rendererEvents", "Lorg/webrtc/RendererCommon$RendererEvents;", "rotatedFrameHeight", "rotatedFrameWidth", "surfaceTextureFrameCount", "webRtcFrameCount", "debugOnFrame", "", "initialize", "onFrame", "frame", "Lorg/webrtc/VideoFrame;", "onGlOutOfMemory", "onSurfaceTextureAvailable", "surface", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "onSurfaceTextureSizeChanged", "w", "h", "onSurfaceTextureUpdated", "updateFrameDimensionsAndReportEvents", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextureViewEglRenderer extends EglRenderer implements TextureView.SurfaceTextureListener, ErrorCallback {
    public static final Companion Companion = new Companion(null);
    private static final AtomicInteger count = new AtomicInteger();
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private final Object layoutLock = new Object();
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceTextureFrameCount;
    private int webRtcFrameCount;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/media/engine/video/texture_view/TextureViewEglRenderer$Companion;", "", "()V", "count", "Ljava/util/concurrent/atomic/AtomicInteger;", "toNiceString", "", "", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toNiceString(float f10) {
            k0 k0Var = k0.f20766a;
            String format = String.format(Locale.getDefault(), "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1));
            q.f(format, "format(locale, format, *args)");
            return format;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewEglRenderer(String name) {
        super(name);
        q.g(name, "name");
    }

    private final void debugOnFrame() {
        int i10 = this.webRtcFrameCount + 1;
        this.webRtcFrameCount = i10;
        if (i10 % 100 == 0) {
            int i11 = i10 % 500;
            Debug debug = Debug.INSTANCE;
            getName();
        }
    }

    private final void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            if (!this.isFirstFrameRendered) {
                this.isFirstFrameRendered = true;
                RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                if (rendererEvents != null) {
                    rendererEvents.onFirstFrameRendered();
                }
            }
            if (!(this.rotatedFrameWidth == videoFrame.getRotatedWidth() && this.rotatedFrameHeight == videoFrame.getRotatedHeight() && this.frameRotation == videoFrame.getRotation())) {
                RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                if (rendererEvents2 != null) {
                    rendererEvents2.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                }
                this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                this.frameRotation = videoFrame.getRotation();
            }
            Unit unit = Unit.f20717a;
        }
    }

    public final void initialize(RendererCommon.RendererEvents rendererEvents) {
        q.g(rendererEvents, "rendererEvents");
        if (ThreadUtilsKt.isOnMainThread()) {
            this.rendererEvents = rendererEvents;
            synchronized (this.layoutLock) {
                this.isFirstFrameRendered = false;
                this.rotatedFrameWidth = 0;
                this.rotatedFrameHeight = 0;
                this.frameRotation = 0;
                Unit unit = Unit.f20717a;
            }
            init();
            setErrorCallback(this);
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    @Override // com.discord.media.engine.video.egl_renderer.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame frame) {
        q.g(frame, "frame");
        updateFrameDimensionsAndReportEvents(frame);
        super.onFrame(frame);
    }

    @Override // com.discord.media.engine.video.egl_renderer.ErrorCallback
    public void onGlOutOfMemory() {
        Log.e$default(Log.INSTANCE, getName(), "onGlOutOfMemory on render thread", (Throwable) null, 4, (Object) null);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
        q.g(surface, "surface");
        if (ThreadUtilsKt.isOnMainThread()) {
            Log log = Log.INSTANCE;
            String name = getName();
            int incrementAndGet = count.incrementAndGet();
            Log.i$default(log, name, "createEglSurface (" + incrementAndGet + " total)", (Throwable) null, 4, (Object) null);
            createEglSurface(surface);
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        q.g(surface, "surface");
        if (ThreadUtilsKt.isOnMainThread()) {
            long currentTimeMillis = System.currentTimeMillis();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            releaseEglSurface(new TextureViewEglRenderer$onSurfaceTextureDestroyed$1$1(countDownLatch));
            ThreadUtils.awaitUninterruptibly(countDownLatch, Long.MAX_VALUE);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Log log = Log.INSTANCE;
            String name = getName();
            int decrementAndGet = count.decrementAndGet();
            Log.i$default(log, name, "releaseEglSurface (" + currentTimeMillis2 + " ms) (" + decrementAndGet + " total)", (Throwable) null, 4, (Object) null);
            return true;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        q.g(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        q.g(surface, "surface");
    }
}
