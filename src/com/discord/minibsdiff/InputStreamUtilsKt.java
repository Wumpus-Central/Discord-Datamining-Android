package com.discord.minibsdiff;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0000\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\f"}, m15073d2 = {"readNBytes", "", "Ljava/io/InputStream;", "b", "", "off", "len", "n", "readOffset", "", "skipNBytes", "", "minibsdiff_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class InputStreamUtilsKt {
    public static final byte[] readNBytes(InputStream inputStream, int i) {
        C9971q.m14633g(inputStream, "<this>");
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            i2 += inputStream.read(bArr, i2, i - i2);
        }
        return bArr;
    }

    public static final long readOffset(InputStream inputStream) {
        C9971q.m14633g(inputStream, "<this>");
        long j = ByteBuffer.wrap(readNBytes(inputStream, 8)).order(ByteOrder.LITTLE_ENDIAN).getLong();
        if (0 == (Long.MIN_VALUE & j)) {
            return j;
        }
        return -(j & Long.MAX_VALUE);
    }

    public static final void skipNBytes(InputStream inputStream, long j) {
        C9971q.m14633g(inputStream, "<this>");
        long j2 = 0;
        while (j2 < j) {
            j2 += inputStream.skip(j - j2);
        }
    }

    public static final int readNBytes(InputStream inputStream, byte[] b, int i, int i2) {
        C9971q.m14633g(inputStream, "<this>");
        C9971q.m14633g(b, "b");
        int i3 = 0;
        while (i3 < i2) {
            i3 += inputStream.read(b, i + i3, i2 - i3);
        }
        return i3;
    }
}
