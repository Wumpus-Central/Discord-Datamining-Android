package p439y7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p119g9.C7557q0;
import p152i7.C8216b;
import p439y7.AbstractC14284k;

/* renamed from: y7.a0 */
/* loaded from: classes7.dex */
public final class C14268a0 implements AbstractC14284k {

    /* renamed from: a */
    private final MediaCodec f32248a;

    /* renamed from: b */
    private ByteBuffer[] f32249b;

    /* renamed from: c */
    private ByteBuffer[] f32250c;

    /* renamed from: y7.a0$b */
    /* loaded from: classes7.dex */
    public static final class C14270b implements AbstractC14284k.AbstractC14285a {
        @Override // p439y7.AbstractC14284k.AbstractC14285a
        /* renamed from: a */
        public AbstractC14284k mo1133a(MediaCodec mediaCodec) {
            return new C14268a0(mediaCodec);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m1205k(AbstractC14284k.AbstractC14286b bVar, MediaCodec mediaCodec, long j, long j2) {
        bVar.mo1132a(this, j, j2);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: a */
    public void mo1142a(int i, int i2, C8216b bVar, long j, int i3) {
        this.f32248a.queueSecureInputBuffer(i, i2, bVar.m20296a(), j, i3);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: b */
    public void mo1141b(int i) {
        this.f32248a.setVideoScalingMode(i);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: c */
    public ByteBuffer mo1140c(int i) {
        if (C7557q0.f16368a >= 21) {
            return this.f32248a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) C7557q0.m22145j(this.f32249b))[i];
    }

    @Override // p439y7.AbstractC14284k
    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f32248a.configure(mediaFormat, surface, mediaCrypto, i);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: d */
    public void mo1139d(Surface surface) {
        this.f32248a.setOutputSurface(surface);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: e */
    public void mo1138e(final AbstractC14284k.AbstractC14286b bVar, Handler handler) {
        this.f32248a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: y7.z
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C14268a0.this.m1205k(bVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: f */
    public void mo1137f(int i, long j) {
        this.f32248a.releaseOutputBuffer(i, j);
    }

    @Override // p439y7.AbstractC14284k
    public void flush() {
        this.f32248a.flush();
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: g */
    public int mo1136g() {
        return this.f32248a.dequeueInputBuffer(0L);
    }

    @Override // p439y7.AbstractC14284k
    public MediaFormat getOutputFormat() {
        return this.f32248a.getOutputFormat();
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: h */
    public int mo1135h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f32248a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && C7557q0.f16368a < 21) {
                this.f32250c = this.f32248a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // p439y7.AbstractC14284k
    /* renamed from: i */
    public ByteBuffer mo1134i(int i) {
        if (C7557q0.f16368a >= 21) {
            return this.f32248a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) C7557q0.m22145j(this.f32250c))[i];
    }

    @Override // p439y7.AbstractC14284k
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f32248a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p439y7.AbstractC14284k
    public void release() {
        this.f32249b = null;
        this.f32250c = null;
        this.f32248a.release();
    }

    @Override // p439y7.AbstractC14284k
    public void releaseOutputBuffer(int i, boolean z) {
        this.f32248a.releaseOutputBuffer(i, z);
    }

    @Override // p439y7.AbstractC14284k
    public void setParameters(Bundle bundle) {
        this.f32248a.setParameters(bundle);
    }

    @Override // p439y7.AbstractC14284k
    public void start() {
        this.f32248a.start();
        if (C7557q0.f16368a < 21) {
            this.f32249b = this.f32248a.getInputBuffers();
            this.f32250c = this.f32248a.getOutputBuffers();
        }
    }

    private C14268a0(MediaCodec mediaCodec) {
        this.f32248a = mediaCodec;
    }
}
