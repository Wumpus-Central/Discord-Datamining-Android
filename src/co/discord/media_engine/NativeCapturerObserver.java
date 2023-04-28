package co.discord.media_engine;

import android.content.Context;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;

/* loaded from: classes.dex */
public final class NativeCapturerObserver implements CapturerObserver {
    private long nativeHandle_;
    private boolean startCaptureOnReconfigure_;
    private SurfaceTextureHelper surfaceTextureHelper_;
    private VideoCapturer videoCapturer_;

    static {
        System.loadLibrary("discord");
    }

    public NativeCapturerObserver(long j, Context context, String str) {
        this(j, context, CameraEnumeratorProvider.createCapturer(str));
    }

    private native void nativeOnFrame(long j, VideoFrame.Buffer buffer, int i, int i2, int i3, long j2);

    public synchronized void dispose() {
        VideoCapturer videoCapturer = this.videoCapturer_;
        if (videoCapturer != null) {
            try {
                videoCapturer.stopCapture();
                this.videoCapturer_.dispose();
                this.videoCapturer_ = null;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper_;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.surfaceTextureHelper_ = null;
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrame(this.nativeHandle_, videoFrame.getBuffer(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs());
    }

    public synchronized void reconfigure(int i, int i2, int i3) {
        VideoCapturer videoCapturer = this.videoCapturer_;
        if (videoCapturer != null) {
            if (this.startCaptureOnReconfigure_) {
                this.startCaptureOnReconfigure_ = false;
                videoCapturer.startCapture(i, i2, i3);
            } else {
                videoCapturer.changeCaptureFormat(i, i2, i3);
            }
        }
    }

    public void repeatLastFrame() {
        this.surfaceTextureHelper_.forceFrame();
    }

    public NativeCapturerObserver(long j, Context context, VideoCapturer videoCapturer) {
        SurfaceTextureHelper create = SurfaceTextureHelper.create("DiscordTextureCapture", SharedEglBaseContext.getEglContext());
        this.surfaceTextureHelper_ = create;
        this.startCaptureOnReconfigure_ = true;
        this.nativeHandle_ = j;
        this.videoCapturer_ = videoCapturer;
        videoCapturer.initialize(create, context, this);
    }
}
