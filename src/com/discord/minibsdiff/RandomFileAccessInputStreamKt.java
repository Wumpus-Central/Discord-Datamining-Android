package com.discord.minibsdiff;

import java.io.InputStream;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m15073d2 = {"inputStream", "Ljava/io/InputStream;", "Ljava/io/RandomAccessFile;", "minibsdiff_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class RandomFileAccessInputStreamKt {
    public static final InputStream inputStream(RandomAccessFile randomAccessFile) {
        C9677q.m14633g(randomAccessFile, "<this>");
        return new RandomFileAccessInputStream(randomAccessFile);
    }
}
