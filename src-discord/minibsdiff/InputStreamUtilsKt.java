package com.discord.minibsdiff;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0000\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\f"}, d2 = {"readNBytes", "", "Ljava/io/InputStream;", "b", "", "off", "len", "n", "readOffset", "", "skipNBytes", "", "minibsdiff_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InputStreamUtilsKt {
    public static final byte[] readNBytes(InputStream inputStream, int i10) {
        q.g(inputStream, "<this>");
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            i11 += inputStream.read(bArr, i11, i10 - i11);
        }
        return bArr;
    }

    public static final long readOffset(InputStream inputStream) {
        q.g(inputStream, "<this>");
        long j10 = ByteBuffer.wrap(readNBytes(inputStream, 8)).order(ByteOrder.LITTLE_ENDIAN).getLong();
        if (0 == (Long.MIN_VALUE & j10)) {
            return j10;
        }
        return -(j10 & Long.MAX_VALUE);
    }

    public static final void skipNBytes(InputStream inputStream, long j10) {
        q.g(inputStream, "<this>");
        long j11 = 0;
        while (j11 < j10) {
            j11 += inputStream.skip(j10 - j11);
        }
    }

    public static final int readNBytes(InputStream inputStream, byte[] b10, int i10, int i11) {
        q.g(inputStream, "<this>");
        q.g(b10, "b");
        int i12 = 0;
        while (i12 < i11) {
            i12 += inputStream.read(b10, i10 + i12, i11 - i12);
        }
        return i12;
    }
}
