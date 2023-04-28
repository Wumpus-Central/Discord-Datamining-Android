package p266oe;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: oe.d */
/* loaded from: classes6.dex */
public interface AbstractC11262d {
    /* renamed from: a */
    String mo10312a();

    /* renamed from: b */
    void mo10311b(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    /* renamed from: c */
    int mo10310c(MediaFormat mediaFormat, int i);

    void release();
}
