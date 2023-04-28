package p439y7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p152i7.C8216b;
import p439y7.C14268a0;

/* renamed from: y7.k */
/* loaded from: classes7.dex */
public interface AbstractC14284k {

    /* renamed from: y7.k$a */
    /* loaded from: classes7.dex */
    public interface AbstractC14285a {

        /* renamed from: a */
        public static final AbstractC14285a f32301a = new C14268a0.C14270b();

        /* renamed from: a */
        AbstractC14284k mo1133a(MediaCodec mediaCodec);
    }

    /* renamed from: y7.k$b */
    /* loaded from: classes7.dex */
    public interface AbstractC14286b {
        /* renamed from: a */
        void mo1132a(AbstractC14284k kVar, long j, long j2);
    }

    /* renamed from: a */
    void mo1142a(int i, int i2, C8216b bVar, long j, int i3);

    /* renamed from: b */
    void mo1141b(int i);

    /* renamed from: c */
    ByteBuffer mo1140c(int i);

    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    /* renamed from: d */
    void mo1139d(Surface surface);

    /* renamed from: e */
    void mo1138e(AbstractC14286b bVar, Handler handler);

    /* renamed from: f */
    void mo1137f(int i, long j);

    void flush();

    /* renamed from: g */
    int mo1136g();

    MediaFormat getOutputFormat();

    /* renamed from: h */
    int mo1135h(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: i */
    ByteBuffer mo1134i(int i);

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void release();

    void releaseOutputBuffer(int i, boolean z);

    void setParameters(Bundle bundle);

    void start();
}
