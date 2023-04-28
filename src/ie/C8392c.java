package ie;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: ie.c */
/* loaded from: classes6.dex */
public class C8392c {

    /* renamed from: a */
    public final int f18293a;

    /* renamed from: b */
    public final ByteBuffer f18294b;

    /* renamed from: c */
    public final MediaCodec.BufferInfo f18295c;

    public C8392c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f18293a = i;
        this.f18294b = byteBuffer;
        if (bufferInfo == null) {
            this.f18295c = new MediaCodec.BufferInfo();
        } else {
            this.f18295c = bufferInfo;
        }
    }
}
