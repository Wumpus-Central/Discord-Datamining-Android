package com.discord.media.engine.video.egl_renderer;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import co.discord.media_engine.SharedEglBaseContext;
import com.discord.media.engine.types.Debug;
import eg.j;
import j$.util.Spliterator;
import java.text.DecimalFormat;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import org.webrtc.EglBase;
import org.webrtc.EglHelper;
import org.webrtc.GlRectDrawer;
import org.webrtc.GlUtil;
import org.webrtc.Logging;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import org.webrtc.VideoSink;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000 O2\u00020\u0001:\u0002OPB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u000e\u0010-\u001a\u00020.2\u0006\u00101\u001a\u000202J\u0010\u00103\u001a\u00020.2\u0006\u00101\u001a\u00020\u0010H\u0002J\u0006\u00104\u001a\u00020.J\u0006\u00105\u001a\u00020.J\u0010\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020\u0003H\u0002J\u0018\u00108\u001a\u00020.2\u0006\u00107\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020.H\u0002J\b\u0010<\u001a\u00020\u001dH\u0002J\u0010\u0010=\u001a\u00020.2\u0006\u0010>\u001a\u00020&H\u0016J\u0006\u0010?\u001a\u00020.J\u0010\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020\u001dH\u0002J\u0006\u0010B\u001a\u00020.J\u0014\u0010C\u001a\u00020.2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020.0EJ\b\u0010F\u001a\u00020.H\u0002J\u0012\u0010G\u001a\u00020.2\b\b\u0002\u0010H\u001a\u00020\u001fH\u0002J\u0010\u0010I\u001a\u00020.2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020\u001aJ\u000e\u0010L\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010M\u001a\u00020.2\u0006\u0010N\u001a\u00020!R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/discord/media/engine/video/egl_renderer/EglRenderer;", "Lorg/webrtc/VideoSink;", "name", "", "(Ljava/lang/String;)V", "drawMatrix", "Landroid/graphics/Matrix;", "drawer", "Lorg/webrtc/RendererCommon$GlDrawer;", "eglBase", "Lorg/webrtc/EglBase;", "eglSurfaceCreationRunnable", "Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;", "errorCallback", "Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;", "fpsReductionLock", "", "frameDrawer", "Lorg/webrtc/VideoFrameDrawer;", "frameLock", "framesDropped", "", "framesReceived", "framesRendered", "handlerLock", "layoutAspectRatio", "", "layoutLock", "logStatisticsRunnable", "Ljava/lang/Runnable;", "minRenderPeriodNs", "", "mirrorHorizontally", "", "getName", "()Ljava/lang/String;", "nextFrameTimeNs", "pendingFrame", "Lorg/webrtc/VideoFrame;", "renderSwapBufferTimeNs", "renderThreadHandler", "Landroid/os/Handler;", "renderTimeNs", "statisticsLock", "statisticsStartTimeNs", "createEglSurface", "", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "surface", "Landroid/view/Surface;", "createEglSurfaceInternal", "disableFpsReduction", "init", "logD", "string", "logE", "e", "", "logStatistics", "logStatisticsTask", "onFrame", "frame", "pauseVideo", "postToRenderThread", "runnable", "release", "releaseEglSurface", "completionCallback", "Lkotlin/Function0;", "renderFrameOnRenderThread", "resetStatistics", "currentTimeNs", "setErrorCallback", "setFpsReduction", "fps", "setLayoutAspectRatio", "setMirror", "mirror", "Companion", "EglSurfaceCreation", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public class EglRenderer implements VideoSink {
    public static final Companion Companion = new Companion(null);
    private static final long LOG_INTERVAL_MS = 4000;
    private static final String TAG = "EglRenderer";
    private static final boolean USE_PRESENTATION_TIMESTAMP = false;
    private EglBase eglBase;
    private volatile ErrorCallback errorCallback;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private float layoutAspectRatio;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private Handler renderThreadHandler;
    private long renderTimeNs;
    private long statisticsStartTimeNs;
    private final Object handlerLock = new Object();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final RendererCommon.GlDrawer drawer = new GlRectDrawer();
    private final Matrix drawMatrix = new Matrix();
    private final Object frameLock = new Object();
    private final Object layoutLock = new Object();
    private final Object statisticsLock = new Object();
    private final Runnable logStatisticsRunnable = new Runnable() { // from class: com.discord.media.engine.video.egl_renderer.f
        @Override // java.lang.Runnable
        public final void run() {
            EglRenderer.logStatisticsRunnable$lambda$2(EglRenderer.this);
        }
    };
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;", "", "()V", "LOG_INTERVAL_MS", "", "TAG", "", "USE_PRESENTATION_TIMESTAMP", "", "averageTimeAsString", "sumTimeNs", "count", "", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String averageTimeAsString(long j10, int i10) {
            if (i10 <= 0) {
                return "NA";
            }
            long micros = TimeUnit.NANOSECONDS.toMicros(j10 / i10);
            return micros + " us";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;", "Ljava/lang/Runnable;", "(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V", "surface", "", "run", "", "setSurface", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public final class EglSurfaceCreation implements Runnable {
        private Object surface;

        public EglSurfaceCreation() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            Object obj = this.surface;
            if (obj != null) {
                EglBase eglBase = EglRenderer.this.eglBase;
                if (eglBase != null) {
                    if (!eglBase.hasSurface()) {
                        if (obj instanceof Surface) {
                            eglBase.createSurface((Surface) obj);
                        } else if (obj instanceof SurfaceTexture) {
                            eglBase.createSurface((SurfaceTexture) obj);
                        } else {
                            throw new IllegalStateException(("Invalid surface: " + obj).toString());
                        }
                        eglBase.makeCurrent();
                        GLES20.glPixelStorei(3317, 1);
                    }
                }
            }
        }

        public final synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    public EglRenderer(String name) {
        q.g(name, "name");
        this.name = name;
    }

    private final void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$8$lambda$7(EglRenderer this$0, long j10) {
        q.g(this$0, "this$0");
        this$0.logD("Creating EglBase");
        this$0.eglBase = EglHelper.create(SharedEglBaseContext.getEglContext(), EglBase.CONFIG_PLAIN);
        Debug debug = Debug.INSTANCE;
    }

    private final void logD(String str) {
        String str2 = this.name;
        Logging.d(str2, "name: " + str);
    }

    private final void logE(String str, Throwable th2) {
        String str2 = this.name;
        Logging.e(str2, "name: " + str, th2);
    }

    private final void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j10 = nanoTime - this.statisticsStartTimeNs;
            if (j10 > 0 && !(this.minRenderPeriodNs == Long.MAX_VALUE && this.framesReceived == 0)) {
                float nanos = ((float) (this.framesRendered * TimeUnit.SECONDS.toNanos(1L))) / ((float) j10);
                long millis = TimeUnit.NANOSECONDS.toMillis(j10);
                int i10 = this.framesReceived;
                int i11 = this.framesDropped;
                int i12 = this.framesRendered;
                String format = decimalFormat.format(nanos);
                Companion companion = Companion;
                String averageTimeAsString = companion.averageTimeAsString(this.renderTimeNs, this.framesRendered);
                String averageTimeAsString2 = companion.averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered);
                logD("[logStatistics] Duration: " + millis + " ms. Frames received: " + i10 + ". Dropped: " + i11 + ". Rendered: " + i12 + ". Render fps: " + format + ". Average render time: " + averageTimeAsString + ". Average swapBuffer time: " + averageTimeAsString2 + ".");
                resetStatistics(nanoTime);
                Unit unit = Unit.f22035a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logStatisticsRunnable$lambda$2(EglRenderer this$0) {
        q.g(this$0, "this$0");
        this$0.logStatistics();
        synchronized (this$0.handlerLock) {
            Handler handler = this$0.renderThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(this$0.logStatisticsTask());
                handler.postDelayed(this$0.logStatisticsTask(), LOG_INTERVAL_MS);
            }
            Unit unit = Unit.f22035a;
        }
    }

    private final Runnable logStatisticsTask() {
        return this.logStatisticsRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFrame$lambda$25$lambda$24$lambda$23(EglRenderer this$0) {
        q.g(this$0, "this$0");
        this$0.renderFrameOnRenderThread();
    }

    private final void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$13$lambda$11(EglRenderer this$0, CountDownLatch eglCleanupBarrier) {
        q.g(this$0, "this$0");
        q.g(eglCleanupBarrier, "$eglCleanupBarrier");
        Object lock = EglBase.lock;
        q.f(lock, "lock");
        synchronized (lock) {
            GLES20.glUseProgram(0);
            Unit unit = Unit.f22035a;
        }
        this$0.drawer.release();
        this$0.frameDrawer.release();
        EglBase eglBase = this$0.eglBase;
        if (eglBase != null) {
            this$0.logD("eglBase detach and release.");
            eglBase.detachCurrent();
            eglBase.release();
        }
        this$0.eglBase = null;
        eglCleanupBarrier.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$13$lambda$12(EglRenderer this$0, Looper renderLooper) {
        q.g(this$0, "this$0");
        q.g(renderLooper, "$renderLooper");
        this$0.logD("Quitting render thread.");
        renderLooper.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseEglSurface$lambda$30$lambda$29$lambda$28(EglRenderer this$0, Function0 completionCallback) {
        q.g(this$0, "this$0");
        q.g(completionCallback, "$completionCallback");
        EglBase eglBase = this$0.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            eglBase.releaseSurface();
        }
        completionCallback.invoke();
    }

    private final void renderFrameOnRenderThread() {
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        long d10;
        synchronized (this.frameLock) {
            VideoFrame videoFrame = this.pendingFrame;
            if (videoFrame != null) {
                this.pendingFrame = null;
                EglBase eglBase = this.eglBase;
                if (eglBase == null || !eglBase.hasSurface()) {
                    logD("Dropping frame - No surface");
                    return;
                }
                long nanoTime = System.nanoTime();
                synchronized (this.fpsReductionLock) {
                    long j10 = this.minRenderPeriodNs;
                    z10 = false;
                    if (j10 > 0) {
                        if (j10 != Long.MAX_VALUE) {
                            long j11 = this.nextFrameTimeNs;
                            if (nanoTime < j11) {
                                logD("Skipping frame rendering - fps reduction is active.");
                            } else {
                                long j12 = j11 + j10;
                                this.nextFrameTimeNs = j12;
                                d10 = j.d(j12, nanoTime);
                                this.nextFrameTimeNs = d10;
                            }
                        }
                        z11 = false;
                    }
                    z11 = true;
                }
                float rotatedAspectRatio = WebRtcExtensionsKt.getRotatedAspectRatio(videoFrame);
                synchronized (this.layoutLock) {
                    f10 = this.layoutAspectRatio;
                    if (f10 == 0.0f) {
                        z10 = true;
                    }
                    if (z10) {
                        f10 = rotatedAspectRatio;
                    }
                }
                if (rotatedAspectRatio > f10) {
                    f11 = f10 / rotatedAspectRatio;
                    f12 = 1.0f;
                } else {
                    f12 = rotatedAspectRatio / f10;
                    f11 = 1.0f;
                }
                this.drawMatrix.reset();
                this.drawMatrix.preTranslate(0.5f, 0.5f);
                Matrix matrix = this.drawMatrix;
                if (this.mirrorHorizontally) {
                    f13 = -1.0f;
                } else {
                    f13 = 1.0f;
                }
                matrix.preScale(f13, 1.0f);
                this.drawMatrix.preScale(f11, f12);
                this.drawMatrix.preTranslate(-0.5f, -0.5f);
                try {
                    if (z11) {
                        try {
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            GLES20.glClear(Spliterator.SUBSIZED);
                            this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, eglBase.surfaceWidth(), eglBase.surfaceHeight());
                            long nanoTime2 = System.nanoTime();
                            eglBase.swapBuffers();
                            long nanoTime3 = System.nanoTime();
                            synchronized (this.statisticsLock) {
                                this.framesRendered++;
                                this.renderTimeNs += nanoTime3 - nanoTime;
                                this.renderSwapBufferTimeNs += nanoTime3 - nanoTime2;
                                Unit unit = Unit.f22035a;
                            }
                        } catch (GlUtil.GlOutOfMemoryException e10) {
                            logE("Error while drawing frame", e10);
                            ErrorCallback errorCallback = this.errorCallback;
                            if (errorCallback != null) {
                                errorCallback.onGlOutOfMemory();
                            }
                            this.drawer.release();
                            this.frameDrawer.release();
                        }
                    }
                } finally {
                    videoFrame.release();
                }
            }
        }
    }

    private final void resetStatistics(long j10) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j10;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
            Unit unit = Unit.f22035a;
        }
    }

    static /* synthetic */ void resetStatistics$default(EglRenderer eglRenderer, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = System.nanoTime();
            }
            eglRenderer.resetStatistics(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetStatistics");
    }

    public final void createEglSurface(Surface surface) {
        q.g(surface, "surface");
        createEglSurfaceInternal(surface);
    }

    public final void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getName() {
        return this.name;
    }

    public final void init() {
        boolean z10;
        final long nanoTime = System.nanoTime();
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                logD("Initializing EglRenderer");
                HandlerThread handlerThread = new HandlerThread(this.name + TAG);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                q.f(looper, "renderThread.looper");
                HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(looper, new EglRenderer$init$1$handler$1(this));
                this.renderThreadHandler = handlerWithExceptionCallback;
                Debug debug = Debug.INSTANCE;
                ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new Runnable() { // from class: com.discord.media.engine.video.egl_renderer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.init$lambda$8$lambda$7(EglRenderer.this, nanoTime);
                    }
                });
                handlerWithExceptionCallback.post(this.eglSurfaceCreationRunnable);
                resetStatistics$default(this, 0L, 1, null);
                handlerWithExceptionCallback.postDelayed(this.logStatisticsRunnable, LOG_INTERVAL_MS);
            } else {
                throw new IllegalStateException((this.name + ": already initialized").toString());
            }
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame frame) {
        boolean z10;
        q.g(frame, "frame");
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                logD("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.frameLock) {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame != null) {
                    videoFrame.release();
                    z10 = true;
                } else {
                    z10 = false;
                }
                frame.retain();
                this.pendingFrame = frame;
                handler.post(new Runnable() { // from class: com.discord.media.engine.video.egl_renderer.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.onFrame$lambda$25$lambda$24$lambda$23(EglRenderer.this);
                    }
                });
            }
            if (z10) {
                synchronized (this.statisticsLock) {
                    this.framesDropped++;
                }
            }
        }
    }

    public final void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public final void release() {
        logD("Releasing.");
        long nanoTime = System.nanoTime();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                logD("Already released");
                return;
            }
            handler.removeCallbacks(this.logStatisticsRunnable);
            handler.postAtFrontOfQueue(new Runnable() { // from class: com.discord.media.engine.video.egl_renderer.a
                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.release$lambda$13$lambda$11(EglRenderer.this, countDownLatch);
                }
            });
            final Looper looper = handler.getLooper();
            q.f(looper, "handler.looper");
            handler.post(new Runnable() { // from class: com.discord.media.engine.video.egl_renderer.b
                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.release$lambda$13$lambda$12(EglRenderer.this, looper);
                }
            });
            this.renderThreadHandler = null;
            Unit unit = Unit.f22035a;
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            synchronized (this.frameLock) {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame != null) {
                    videoFrame.release();
                }
                this.pendingFrame = null;
            }
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            logD("release done: " + millis + " ms");
        }
    }

    public final void releaseEglSurface(final Function0<Unit> completionCallback) {
        q.g(completionCallback, "completionCallback");
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                handler.postAtFrontOfQueue(new Runnable() { // from class: com.discord.media.engine.video.egl_renderer.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.releaseEglSurface$lambda$30$lambda$29$lambda$28(EglRenderer.this, completionCallback);
                    }
                });
                return;
            }
            completionCallback.invoke();
        }
    }

    public final void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public final void setFpsReduction(float f10) {
        long j10;
        logD("setFpsReduction: " + f10);
        synchronized (this.fpsReductionLock) {
            long j11 = this.minRenderPeriodNs;
            if (f10 <= 0.0f) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = ((float) TimeUnit.SECONDS.toNanos(1L)) / f10;
            }
            this.minRenderPeriodNs = j10;
            if (j10 != j11) {
                this.nextFrameTimeNs = System.nanoTime();
            }
            Unit unit = Unit.f22035a;
        }
    }

    public final void setLayoutAspectRatio(float f10) {
        boolean z10;
        logD("setLayoutAspectRatio: " + f10);
        synchronized (this.layoutLock) {
            if (Float.isInfinite(f10) || Float.isNaN(f10)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.layoutAspectRatio = f10;
            } else {
                this.layoutAspectRatio = 0.0f;
            }
            Unit unit = Unit.f22035a;
        }
    }

    public final void setMirror(boolean z10) {
        logD("setMirrorHorizontally: " + z10);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z10;
            Unit unit = Unit.f22035a;
        }
    }

    public final void createEglSurface(SurfaceTexture surfaceTexture) {
        q.g(surfaceTexture, "surfaceTexture");
        createEglSurfaceInternal(surfaceTexture);
    }
}
