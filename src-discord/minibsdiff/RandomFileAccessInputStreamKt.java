package com.discord.minibsdiff;

import java.io.InputStream;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"inputStream", "Ljava/io/InputStream;", "Ljava/io/RandomAccessFile;", "minibsdiff_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class RandomFileAccessInputStreamKt {
    public static final InputStream inputStream(RandomAccessFile randomAccessFile) {
        q.g(randomAccessFile, "<this>");
        return new RandomFileAccessInputStream(randomAccessFile);
    }
}
