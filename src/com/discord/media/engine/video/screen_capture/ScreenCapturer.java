package com.discord.media.engine.video.screen_capture;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import co.discord.media_engine.NativeCapturerObserver;
import co.discord.media_engine.SoundshareAudioSource;
import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.CapturerObserver;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.TimestampAligner;
import org.webrtc.VideoFrame;

@Metadata(m15074d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 <2\u00020\u0001:\u0003<=>B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fJ\n\u0010*\u001a\u0004\u0018\u00010+H\u0003J\b\u0010,\u001a\u00020%H\u0014J\b\u0010-\u001a\u00020%H\u0016J \u0010.\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u000201H\u0016J\u0012\u00102\u001a\u00020%2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0006\u00105\u001a\u00020%J\u0006\u00106\u001a\u00020%J\u0010\u00107\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u00108\u001a\u00020%2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020%H\u0016J\b\u0010;\u001a\u00020%H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0012\u0010\"\u001a\u00060#R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m15073d2 = {"Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;", "Lorg/webrtc/ScreenCapturerAndroid;", "mediaProjectionPermissionResultData", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "calculatedSize", "Landroid/graphics/Point;", "context", "Landroid/content/Context;", "currMeasuredSize", "Landroid/graphics/Rect;", "framerate", "", "intervalNanos", "lastFrameTimestamp", "", "Ljava/lang/Long;", "lastMeasuredSize", "maxDimension", "nativeObserver", "Lco/discord/media_engine/NativeCapturerObserver;", "soundshare", "Lco/discord/media_engine/SoundshareAudioSource;", "getSoundshare", "()Lco/discord/media_engine/SoundshareAudioSource;", "surfaceTextureHelper", "Lorg/webrtc/SurfaceTextureHelper;", "value", "Lcom/discord/media/engine/video/screen_capture/ThumbnailEmitter;", "thumbnailEmitter", "getThumbnailEmitter", "()Lcom/discord/media/engine/video/screen_capture/ThumbnailEmitter;", "setThumbnailEmitter", "(Lcom/discord/media/engine/video/screen_capture/ThumbnailEmitter;)V", "watchdog", "Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Watchdog;", "changeCaptureFormat", "", "width", "height", "changeCaptureFormatInternal", "measuredSize", "createRecorder", "Landroid/media/AudioRecord;", "createVirtualDisplay", "dispose", "initialize", "applicationContext", "capturerObserver", "Lorg/webrtc/CapturerObserver;", "onFrame", "frame", "Lorg/webrtc/VideoFrame;", "release", "scheduleWatchdog", "setFramerate", "startCapture", "startWatchdog", "stopCapture", "stopWatchdog", "Companion", "OnStopCallback", "Watchdog", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ScreenCapturer extends ScreenCapturerAndroid {
    private static final int AUDIO_FORMAT = 2;
    private static final int CHANNEL_CONFIG = 16;
    public static final Companion Companion = new Companion(null);
    private static final int MIN_REPEAT_FRAMERATE = 10;
    private static final int SAMPLING_RATE_IN_HZ = 44100;
    private static final String TAG = "ScreenCapturer";
    private Context context;
    private int framerate;
    private int intervalNanos;
    private Long lastFrameTimestamp;
    private int maxDimension;
    private NativeCapturerObserver nativeObserver;
    private SurfaceTextureHelper surfaceTextureHelper;
    private ThumbnailEmitter thumbnailEmitter;
    private final Watchdog watchdog = new Watchdog();
    private final SoundshareAudioSource soundshare = new SoundshareAudioSource();
    private final Rect lastMeasuredSize = new Rect();
    private final Rect currMeasuredSize = new Rect();
    private final Point calculatedSize = new Point();

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Companion;", "", "()V", "AUDIO_FORMAT", "", "CHANNEL_CONFIG", "MIN_REPEAT_FRAMERATE", "SAMPLING_RATE_IN_HZ", "TAG", "", "closestMod16", "n", "getScreenSize", "Landroid/graphics/Rect;", "context", "Landroid/content/Context;", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int closestMod16(int i) {
            int i2 = i % 16;
            if (i2 >= 8) {
                i += 16;
            }
            return i - i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Rect getScreenSize(Context context) {
            return new Rect(0, 0, context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$OnStopCallback;", "Landroid/media/projection/MediaProjection$Callback;", "()V", "onStop", "", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static class OnStopCallback extends MediaProjection.Callback {
        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            Log.i$default(Log.INSTANCE, ScreenCapturer.TAG, "onStop", (Throwable) null, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Watchdog;", "Ljava/lang/Runnable;", "(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;)V", "run", "", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public final class Watchdog implements Runnable {
        public Watchdog() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ScreenCapturer.this.framerate > 0) {
                Long l = ScreenCapturer.this.lastFrameTimestamp;
                if (l != null) {
                    ScreenCapturer screenCapturer = ScreenCapturer.this;
                    if (TimestampAligner.getRtcTimeNanos() - l.longValue() > screenCapturer.intervalNanos) {
                        NativeCapturerObserver nativeCapturerObserver = screenCapturer.nativeObserver;
                        if (nativeCapturerObserver == null) {
                            C9971q.m14615y("nativeObserver");
                            nativeCapturerObserver = null;
                        }
                        nativeCapturerObserver.repeatLastFrame();
                    }
                }
                ScreenCapturer.this.scheduleWatchdog();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenCapturer(Intent mediaProjectionPermissionResultData) {
        super(mediaProjectionPermissionResultData, new OnStopCallback());
        C9971q.m14633g(mediaProjectionPermissionResultData, "mediaProjectionPermissionResultData");
    }

    private final AudioRecord createRecorder() {
        AudioPlaybackCaptureConfiguration.Builder addMatchingUsage;
        AudioPlaybackCaptureConfiguration.Builder addMatchingUsage2;
        AudioPlaybackCaptureConfiguration.Builder addMatchingUsage3;
        AudioPlaybackCaptureConfiguration build;
        AudioRecord.Builder audioPlaybackCaptureConfig;
        MediaProjection mediaProjection = this.mediaProjection;
        if (mediaProjection == null) {
            return null;
        }
        addMatchingUsage = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection).addMatchingUsage(1);
        addMatchingUsage2 = addMatchingUsage.addMatchingUsage(14);
        addMatchingUsage3 = addMatchingUsage2.addMatchingUsage(0);
        build = addMatchingUsage3.build();
        C9971q.m14634f(build, "Builder(mediaProjection)…\n                .build()");
        try {
            audioPlaybackCaptureConfig = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(SAMPLING_RATE_IN_HZ).setChannelMask(16).build()).setAudioPlaybackCaptureConfig(build);
            return audioPlaybackCaptureConfig.build();
        } catch (SecurityException e) {
            Log.INSTANCE.m32179e(TAG, "Failed to record audio", e);
            return null;
        }
    }

    private final void setFramerate(int i) {
        if (i <= 0) {
            this.framerate = 0;
            this.intervalNanos = 0;
            return;
        }
        this.framerate = i;
        this.intervalNanos = 1000000000 / Math.max(10, i / 2);
    }

    private final void startWatchdog() {
        scheduleWatchdog();
    }

    private final void stopWatchdog() {
        this.framerate = 0;
        this.lastFrameTimestamp = null;
    }

    @Override // org.webrtc.ScreenCapturerAndroid, org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        changeCaptureFormatInternal(this.lastMeasuredSize, Math.max(i, i2));
        setFramerate(i3);
    }

    public final synchronized void changeCaptureFormatInternal(Rect measuredSize, int i) {
        C9971q.m14633g(measuredSize, "measuredSize");
        int max = Math.max(measuredSize.width(), measuredSize.height());
        if (max > 0) {
            float f = i / max;
            this.calculatedSize.set((int) (measuredSize.width() * f), (int) (measuredSize.height() * f));
            Point point = this.calculatedSize;
            Companion companion = Companion;
            point.set(companion.closestMod16(point.x), companion.closestMod16(this.calculatedSize.y));
            Point point2 = this.calculatedSize;
            super.changeCaptureFormat(point2.x, point2.y, this.framerate);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.webrtc.ScreenCapturerAndroid
    public void createVirtualDisplay() {
        try {
            super.createVirtualDisplay();
        } catch (Throwable th2) {
            Log.INSTANCE.m32179e(TAG, "error in createVirtualDisplay", th2);
        }
    }

    @Override // org.webrtc.ScreenCapturerAndroid, org.webrtc.VideoCapturer
    public void dispose() {
        release();
        super.dispose();
    }

    public final SoundshareAudioSource getSoundshare() {
        return this.soundshare;
    }

    public final ThumbnailEmitter getThumbnailEmitter() {
        return this.thumbnailEmitter;
    }

    @Override // org.webrtc.ScreenCapturerAndroid, org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context applicationContext, CapturerObserver capturerObserver) {
        C9971q.m14633g(surfaceTextureHelper, "surfaceTextureHelper");
        C9971q.m14633g(applicationContext, "applicationContext");
        C9971q.m14633g(capturerObserver, "capturerObserver");
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.context = applicationContext;
        this.nativeObserver = (NativeCapturerObserver) capturerObserver;
        super.initialize(surfaceTextureHelper, applicationContext, capturerObserver);
    }

    @Override // org.webrtc.ScreenCapturerAndroid, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (videoFrame != null) {
            Rect rect = this.currMeasuredSize;
            Companion companion = Companion;
            Context context = this.context;
            if (context == null) {
                C9971q.m14615y("context");
                context = null;
            }
            rect.set(companion.getScreenSize(context));
            if (!C9971q.m14638b(this.currMeasuredSize, this.lastMeasuredSize)) {
                this.lastMeasuredSize.set(this.currMeasuredSize);
                changeCaptureFormatInternal(this.currMeasuredSize, this.maxDimension);
            }
            this.lastFrameTimestamp = Long.valueOf(videoFrame.getTimestampNs());
            ThumbnailEmitter thumbnailEmitter = this.thumbnailEmitter;
            if (thumbnailEmitter != null) {
                thumbnailEmitter.onFrame(videoFrame);
            }
        }
        super.onFrame(videoFrame);
    }

    public final void release() {
        stopCapture();
        this.soundshare.release();
        setThumbnailEmitter(null);
    }

    public final void scheduleWatchdog() {
        if (this.framerate > 0) {
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (surfaceTextureHelper == null) {
                C9971q.m14615y("surfaceTextureHelper");
                surfaceTextureHelper = null;
            }
            surfaceTextureHelper.getHandler().postDelayed(this.watchdog, this.intervalNanos / 1000000);
        }
    }

    public final void setThumbnailEmitter(ThumbnailEmitter thumbnailEmitter) {
        ThumbnailEmitter thumbnailEmitter2 = this.thumbnailEmitter;
        if (thumbnailEmitter2 != null) {
            thumbnailEmitter2.release();
        }
        this.thumbnailEmitter = thumbnailEmitter;
    }

    @Override // org.webrtc.ScreenCapturerAndroid, org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        AudioRecord createRecorder;
        super.startCapture(i, i2, i3);
        this.maxDimension = Math.max(i, i2);
        setFramerate(i3);
        if (Build.VERSION.SDK_INT >= 29 && (createRecorder = createRecorder()) != null) {
            this.soundshare.startRecording(createRecorder);
        }
        startWatchdog();
    }

    @Override // org.webrtc.ScreenCapturerAndroid, org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        super.stopCapture();
        this.soundshare.stopRecording();
        stopWatchdog();
    }
}
