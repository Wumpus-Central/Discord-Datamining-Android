package com.discord.media.engine.video.screen_capture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import bg.C3491c;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.GlRectDrawer;
import org.webrtc.GlTextureFrameBuffer;
import org.webrtc.GlUtil;
import org.webrtc.JniCommon;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import p163j$.util.Spliterator;

@Metadata(m15074d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\nR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m15073d2 = {"Lcom/discord/media/engine/video/screen_capture/ThumbnailEmitter;", "", "width", "", "height", "periodMs", "", "onNextThumbnail", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "(IIJLkotlin/jvm/functions/Function1;)V", "frameDrawer", "Lorg/webrtc/VideoFrameDrawer;", "lastTimestampNs", "outputByteBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "periodNs", "rectDrawer", "Lorg/webrtc/GlRectDrawer;", "released", "", "createThumbnail", "frame", "Lorg/webrtc/VideoFrame;", "onFrame", "release", "Companion", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ThumbnailEmitter {
    public static final Companion Companion = new Companion(null);
    private static final Matrix renderMatrix;
    private final int height;
    private long lastTimestampNs;
    private final Function1<Bitmap, Unit> onNextThumbnail;
    private final ByteBuffer outputByteBuffer;
    private final long periodNs;
    private boolean released;
    private final int width;
    private final GlRectDrawer rectDrawer = new GlRectDrawer();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m15073d2 = {"Lcom/discord/media/engine/video/screen_capture/ThumbnailEmitter$Companion;", "", "()V", "renderMatrix", "Landroid/graphics/Matrix;", "toNanoSeconds", "", "milliseconds", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long toNanoSeconds(long j) {
            long j2 = (long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            return j * j2 * j2;
        }
    }

    static {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        renderMatrix = matrix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThumbnailEmitter(int i, int i2, long j, Function1<? super Bitmap, Unit> onNextThumbnail) {
        C9971q.m14633g(onNextThumbnail, "onNextThumbnail");
        this.width = i;
        this.height = i2;
        this.onNextThumbnail = onNextThumbnail;
        this.outputByteBuffer = JniCommon.nativeAllocateByteBuffer(i * i2 * 4);
        long nanoSeconds = Companion.toNanoSeconds(j);
        this.periodNs = nanoSeconds;
        this.lastTimestampNs = -nanoSeconds;
    }

    private final Bitmap createThumbnail(VideoFrame videoFrame) {
        int a;
        int a2;
        int a3;
        int a4;
        GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
        glTextureFrameBuffer.setSize(this.width, this.height);
        GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(Spliterator.SUBSIZED);
        float rotatedWidth = videoFrame.getRotatedWidth();
        float rotatedHeight = videoFrame.getRotatedHeight();
        int i = this.width;
        int i2 = this.height;
        if (rotatedWidth / rotatedHeight < i / i2) {
            float f = rotatedWidth * (i2 / rotatedHeight);
            VideoFrameDrawer videoFrameDrawer = this.frameDrawer;
            GlRectDrawer glRectDrawer = this.rectDrawer;
            Matrix matrix = renderMatrix;
            a3 = C3491c.m34305a((i - f) / 2.0f);
            a4 = C3491c.m34305a(f);
            videoFrameDrawer.drawFrame(videoFrame, glRectDrawer, matrix, a3, 0, a4, this.height);
        } else {
            float f2 = rotatedHeight * (i / rotatedWidth);
            VideoFrameDrawer videoFrameDrawer2 = this.frameDrawer;
            GlRectDrawer glRectDrawer2 = this.rectDrawer;
            Matrix matrix2 = renderMatrix;
            a = C3491c.m34305a((i2 - f2) / 2.0f);
            int i3 = this.width;
            a2 = C3491c.m34305a(f2);
            videoFrameDrawer2.drawFrame(videoFrame, glRectDrawer2, matrix2, 0, a, i3, a2);
        }
        this.outputByteBuffer.rewind();
        GLES20.glReadPixels(0, 0, glTextureFrameBuffer.getWidth(), glTextureFrameBuffer.getHeight(), 6408, 5121, this.outputByteBuffer);
        GlUtil.checkNoGLES2Error("ThumbnailEmitter.createThumbnail");
        glTextureFrameBuffer.release();
        this.outputByteBuffer.rewind();
        Bitmap bitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
        bitmap.copyPixelsFromBuffer(this.outputByteBuffer);
        C9971q.m14634f(bitmap, "bitmap");
        return bitmap;
    }

    public final synchronized void onFrame(VideoFrame frame) {
        C9971q.m14633g(frame, "frame");
        if (!this.released) {
            long timestampNs = frame.getTimestampNs();
            if (timestampNs - this.lastTimestampNs > this.periodNs) {
                this.lastTimestampNs = timestampNs;
                this.onNextThumbnail.invoke(createThumbnail(frame));
            }
        }
    }

    public final synchronized void release() {
        if (!this.released) {
            this.released = true;
            this.frameDrawer.release();
            this.rectDrawer.release();
            JniCommon.nativeFreeByteBuffer(this.outputByteBuffer);
        }
    }
}
