package ie;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import je.C9568e;
import org.webrtc.MediaStreamTrack;
import re.C12574c;

/* renamed from: ie.e */
/* loaded from: classes6.dex */
public class C8394e implements AbstractC8391b {

    /* renamed from: a */
    private MediaCodec f18300a;

    /* renamed from: c */
    private boolean f18302c;

    /* renamed from: b */
    private boolean f18301b = true;

    /* renamed from: d */
    private final MediaCodec.BufferInfo f18303d = new MediaCodec.BufferInfo();

    /* renamed from: i */
    private void m19852i() {
        if (!this.f18302c) {
            this.f18300a.start();
            this.f18302c = true;
        }
    }

    @Override // ie.AbstractC8391b
    /* renamed from: a */
    public void mo19860a(C8392c cVar) {
        MediaCodec mediaCodec = this.f18300a;
        int i = cVar.f18293a;
        MediaCodec.BufferInfo bufferInfo = cVar.f18295c;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    @Override // ie.AbstractC8391b
    /* renamed from: b */
    public C8392c mo19859b(int i) {
        if (i >= 0) {
            return new C8392c(i, this.f18300a.getInputBuffer(i), null);
        }
        return null;
    }

    @Override // ie.AbstractC8391b
    /* renamed from: c */
    public int mo19858c(long j) {
        return this.f18300a.dequeueOutputBuffer(this.f18303d, j);
    }

    @Override // ie.AbstractC8391b
    public Surface createInputSurface() {
        return this.f18300a.createInputSurface();
    }

    @Override // ie.AbstractC8391b
    /* renamed from: d */
    public void mo19857d(MediaFormat mediaFormat) {
        boolean z;
        if (mediaFormat.containsKey("mime") && mediaFormat.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            if (!mediaFormat.containsKey("color-format")) {
                mediaFormat.setInteger("color-format", 2130708361);
            }
            if (!mediaFormat.containsKey("frame-rate")) {
                mediaFormat.setInteger("frame-rate", 30);
            }
        }
        MediaCodec e = C12574c.m6496e(mediaFormat, null, true, C9568e.EnumC9569a.ENCODER_NOT_FOUND, C9568e.EnumC9569a.ENCODER_FORMAT_NOT_FOUND, C9568e.EnumC9569a.ENCODER_CONFIGURATION_ERROR);
        this.f18300a = e;
        if (e == null) {
            z = true;
        } else {
            z = false;
        }
        this.f18301b = z;
    }

    @Override // ie.AbstractC8391b
    /* renamed from: e */
    public int mo19856e(long j) {
        return this.f18300a.dequeueInputBuffer(j);
    }

    @Override // ie.AbstractC8391b
    /* renamed from: f */
    public C8392c mo19855f(int i) {
        if (i >= 0) {
            return new C8392c(i, this.f18300a.getOutputBuffer(i), this.f18303d);
        }
        return null;
    }

    @Override // ie.AbstractC8391b
    /* renamed from: g */
    public void mo19854g() {
        this.f18300a.signalEndOfInputStream();
    }

    @Override // ie.AbstractC8391b
    public String getName() {
        try {
            return this.f18300a.getName();
        } catch (IllegalStateException e) {
            throw new C9568e(C9568e.EnumC9569a.CODEC_IN_RELEASED_STATE, e);
        }
    }

    @Override // ie.AbstractC8391b
    public MediaFormat getOutputFormat() {
        return this.f18300a.getOutputFormat();
    }

    @Override // ie.AbstractC8391b
    /* renamed from: h */
    public void mo19853h(int i) {
        this.f18300a.releaseOutputBuffer(i, false);
    }

    @Override // ie.AbstractC8391b
    public boolean isRunning() {
        return this.f18302c;
    }

    @Override // ie.AbstractC8391b
    public void release() {
        if (!this.f18301b) {
            this.f18300a.release();
            this.f18301b = true;
        }
    }

    @Override // ie.AbstractC8391b
    public void start() {
        try {
            m19852i();
        } catch (Exception e) {
            throw new C9568e(C9568e.EnumC9569a.INTERNAL_CODEC_ERROR, e);
        }
    }

    @Override // ie.AbstractC8391b
    public void stop() {
        if (this.f18302c) {
            this.f18300a.stop();
            this.f18302c = false;
        }
    }
}
