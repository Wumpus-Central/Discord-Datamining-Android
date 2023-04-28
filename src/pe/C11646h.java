package pe;

import android.media.MediaCodec;
import ie.C8392c;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\n"}, m15073d2 = {"Lpe/h;", "Lpe/a;", "Lie/c;", "sourceFrame", "targetFrame", "", "a", "release", "<init>", "()V", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* renamed from: pe.h */
/* loaded from: classes6.dex */
public final class C11646h implements AbstractC11638a {
    @Override // pe.AbstractC11638a
    /* renamed from: a */
    public void mo9158a(C8392c sourceFrame, C8392c targetFrame) {
        ByteBuffer byteBuffer;
        C9971q.m14633g(sourceFrame, "sourceFrame");
        C9971q.m14633g(targetFrame, "targetFrame");
        ByteBuffer byteBuffer2 = sourceFrame.f18294b;
        if (byteBuffer2 == null || (byteBuffer = targetFrame.f18294b) == null) {
            throw new IllegalArgumentException("Source or target frame doesn't have a buffer, cannot process it!");
        }
        byteBuffer.put(byteBuffer2);
        targetFrame.f18294b.flip();
        MediaCodec.BufferInfo bufferInfo = targetFrame.f18295c;
        bufferInfo.offset = 0;
        MediaCodec.BufferInfo bufferInfo2 = sourceFrame.f18295c;
        bufferInfo.size = bufferInfo2.size;
        bufferInfo.presentationTimeUs = bufferInfo2.presentationTimeUs;
        bufferInfo.flags = bufferInfo2.flags;
    }

    @Override // pe.AbstractC11638a
    public void release() {
    }
}
