package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.video.internal.encoder.e */
/* loaded from: classes.dex */
public interface AbstractC2003e extends AutoCloseable {
    /* renamed from: D */
    MediaCodec.BufferInfo mo39205D();

    /* renamed from: G */
    boolean mo39204G();

    /* renamed from: W */
    long mo39203W();

    /* renamed from: a */
    ByteBuffer mo39202a();

    @Override // java.lang.AutoCloseable
    void close();

    long size();
}
