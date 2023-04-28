package ie;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import je.C9568e;
import re.C12574c;

/* renamed from: ie.d */
/* loaded from: classes6.dex */
public final class C8393d implements AbstractC8390a {

    /* renamed from: a */
    private MediaCodec f18296a;

    /* renamed from: b */
    private boolean f18297b;

    /* renamed from: c */
    private boolean f18298c;

    /* renamed from: d */
    private final MediaCodec.BufferInfo f18299d = new MediaCodec.BufferInfo();

    /* renamed from: d */
    private void m19865d() {
        this.f18296a.start();
        this.f18297b = true;
    }

    @Override // ie.AbstractC8390a
    /* renamed from: a */
    public void mo19868a(C8392c cVar) {
        MediaCodec mediaCodec = this.f18296a;
        int i = cVar.f18293a;
        MediaCodec.BufferInfo bufferInfo = cVar.f18295c;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    @Override // ie.AbstractC8390a
    /* renamed from: b */
    public C8392c mo19867b(int i) {
        if (i >= 0) {
            return new C8392c(i, this.f18296a.getInputBuffer(i), null);
        }
        return null;
    }

    @Override // ie.AbstractC8390a
    /* renamed from: c */
    public int mo19866c(long j) {
        return this.f18296a.dequeueOutputBuffer(this.f18299d, j);
    }

    @Override // ie.AbstractC8390a
    /* renamed from: e */
    public int mo19864e(long j) {
        return this.f18296a.dequeueInputBuffer(j);
    }

    @Override // ie.AbstractC8390a
    /* renamed from: f */
    public C8392c mo19863f(int i) {
        if (i >= 0) {
            return new C8392c(i, this.f18296a.getOutputBuffer(i), this.f18299d);
        }
        return null;
    }

    @Override // ie.AbstractC8390a
    /* renamed from: g */
    public void mo19862g(MediaFormat mediaFormat, Surface surface) {
        boolean z;
        MediaCodec e = C12574c.m6496e(mediaFormat, surface, false, C9568e.EnumC9569a.DECODER_NOT_FOUND, C9568e.EnumC9569a.DECODER_FORMAT_NOT_FOUND, C9568e.EnumC9569a.DECODER_CONFIGURATION_ERROR);
        this.f18296a = e;
        if (e == null) {
            z = true;
        } else {
            z = false;
        }
        this.f18298c = z;
    }

    @Override // ie.AbstractC8390a
    public String getName() {
        try {
            return this.f18296a.getName();
        } catch (IllegalStateException e) {
            throw new C9568e(C9568e.EnumC9569a.CODEC_IN_RELEASED_STATE, e);
        }
    }

    @Override // ie.AbstractC8390a
    public MediaFormat getOutputFormat() {
        return this.f18296a.getOutputFormat();
    }

    @Override // ie.AbstractC8390a
    /* renamed from: h */
    public void mo19861h(int i, boolean z) {
        this.f18296a.releaseOutputBuffer(i, z);
    }

    @Override // ie.AbstractC8390a
    public boolean isRunning() {
        return this.f18297b;
    }

    @Override // ie.AbstractC8390a
    public void release() {
        if (!this.f18298c) {
            this.f18296a.release();
            this.f18298c = true;
        }
    }

    @Override // ie.AbstractC8390a
    public void start() {
        if (this.f18296a == null) {
            throw new IllegalStateException("Codec is not initialized");
        } else if (!this.f18297b) {
            try {
                m19865d();
            } catch (Exception e) {
                throw new C9568e(C9568e.EnumC9569a.INTERNAL_CODEC_ERROR, e);
            }
        }
    }

    @Override // ie.AbstractC8390a
    public void stop() {
        if (this.f18297b) {
            this.f18296a.stop();
            this.f18297b = false;
        }
    }
}
