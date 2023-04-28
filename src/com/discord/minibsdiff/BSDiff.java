package com.discord.minibsdiff;

import eg.C6315e;
import eg.C6318g;
import eg.C6322j;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9618r;
import kotlin.jvm.internal.C9677q;
import kotlin.sequences.Sequence;
import p307qi.C12051o;
import p327ri.C12563d;
import p427xf.C14001c;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ8\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/minibsdiff/BSDiff;", "", "()V", "BSDIFF_CONFIG_MAGIC", "", "BUFFER_SIZE_BYTES", "", "bspatchStreaming", "", "oldPath", "Ljava/io/File;", "patchPath", "newPath", "bspatchStreamingInner", "oldRandomAccessFile", "Ljava/io/RandomAccessFile;", "oldInputStream", "Ljava/io/InputStream;", "ctrlInputStream", "diffInputStream", "extraInputStream", "newOutputStream", "Ljava/io/OutputStream;", "chunkRange", "Lkotlin/sequences/Sequence;", "", "total", "BsPatchError", "minibsdiff_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class BSDiff {
    private static final byte[] BSDIFF_CONFIG_MAGIC;
    private static final long BUFFER_SIZE_BYTES = 1000000;
    public static final BSDiff INSTANCE = new BSDiff();

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/minibsdiff/BSDiff$BsPatchError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "minibsdiff_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class BsPatchError extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BsPatchError(String message) {
            super(message);
            C9677q.m14633g(message, "message");
        }
    }

    static {
        byte[] bytes = "MBSDIF43".getBytes(C12563d.f32852b);
        C9677q.m14634f(bytes, "this as java.lang.String).getBytes(charset)");
        BSDIFF_CONFIG_MAGIC = bytes;
    }

    private BSDiff() {
    }

    private final void bspatchStreamingInner(RandomAccessFile randomAccessFile, InputStream inputStream, InputStream inputStream2, InputStream inputStream3, InputStream inputStream4, OutputStream outputStream) {
        byte[] bArr = new byte[1000000];
        byte[] bArr2 = new byte[1000000];
        if (Arrays.equals(InputStreamUtilsKt.readNBytes(inputStream2, 8), BSDIFF_CONFIG_MAGIC)) {
            long readOffset = InputStreamUtilsKt.readOffset(inputStream2);
            long readOffset2 = InputStreamUtilsKt.readOffset(inputStream2);
            long readOffset3 = InputStreamUtilsKt.readOffset(inputStream2);
            long j = 32 + readOffset;
            InputStreamUtilsKt.skipNBytes(inputStream3, j);
            InputStreamUtilsKt.skipNBytes(inputStream4, j + readOffset2);
            long j2 = 0;
            while (j2 < readOffset3) {
                long readOffset4 = InputStreamUtilsKt.readOffset(inputStream2);
                long readOffset5 = InputStreamUtilsKt.readOffset(inputStream2);
                long readOffset6 = InputStreamUtilsKt.readOffset(inputStream2);
                if (j2 + readOffset4 + readOffset5 <= readOffset3) {
                    Iterator<Integer> it = chunkRange(readOffset4).iterator();
                    while (true) {
                        int i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        int intValue = it.next().intValue();
                        InputStreamUtilsKt.readNBytes(inputStream, bArr, 0, intValue);
                        InputStreamUtilsKt.readNBytes(inputStream3, bArr2, 0, intValue);
                        int i2 = 0;
                        while (i2 < intValue) {
                            bArr[i2] = (byte) (bArr[i2] + bArr2[i2]);
                            i2++;
                            i = 0;
                        }
                        outputStream.write(bArr, i, intValue);
                        it = it;
                        readOffset3 = readOffset3;
                    }
                    for (Integer num : chunkRange(readOffset5)) {
                        int intValue2 = num.intValue();
                        InputStreamUtilsKt.readNBytes(inputStream4, bArr, 0, intValue2);
                        outputStream.write(bArr, 0, intValue2);
                    }
                    randomAccessFile.seek(randomAccessFile.getFilePointer() + readOffset6);
                    j2 += readOffset4 + readOffset5;
                    readOffset3 = readOffset3;
                } else {
                    throw new BsPatchError("Corrupted patch, attempting to make new file that's too big");
                }
            }
            outputStream.close();
            return;
        }
        throw new BsPatchError("Bad magic config header for patch file!");
    }

    private final Sequence<Integer> chunkRange(long j) {
        C6318g p;
        C6315e n;
        Sequence K;
        Sequence<Integer> y;
        p = C6322j.m23948p(0, j);
        n = C6322j.m23950n(p, BUFFER_SIZE_BYTES);
        K = C9618r.m14782K(n);
        y = C12051o.m7420y(K, new BSDiff$chunkRange$1(j));
        return y;
    }

    public final void bspatchStreaming(File oldPath, File patchPath, File newPath) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        BufferedInputStream bufferedInputStream3;
        BufferedOutputStream bufferedOutputStream;
        C9677q.m14633g(oldPath, "oldPath");
        C9677q.m14633g(patchPath, "patchPath");
        C9677q.m14633g(newPath, "newPath");
        RandomAccessFile randomAccessFile = new RandomAccessFile(oldPath, "r");
        BufferedOutputStream inputStream = RandomFileAccessInputStreamKt.inputStream(randomAccessFile);
        FileInputStream fileInputStream = new FileInputStream(patchPath);
        if (fileInputStream instanceof BufferedInputStream) {
            bufferedInputStream = (BufferedInputStream) fileInputStream;
        } else {
            bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
        }
        FileInputStream fileInputStream2 = new FileInputStream(patchPath);
        if (fileInputStream2 instanceof BufferedInputStream) {
            bufferedInputStream2 = (BufferedInputStream) fileInputStream2;
        } else {
            bufferedInputStream2 = new BufferedInputStream(fileInputStream2, 8192);
        }
        FileInputStream fileInputStream3 = new FileInputStream(patchPath);
        if (fileInputStream3 instanceof BufferedInputStream) {
            bufferedInputStream3 = (BufferedInputStream) fileInputStream3;
        } else {
            bufferedInputStream3 = new BufferedInputStream(fileInputStream3, 8192);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(newPath);
        if (fileOutputStream instanceof BufferedOutputStream) {
            bufferedOutputStream = (BufferedOutputStream) fileOutputStream;
        } else {
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
        }
        try {
            try {
                INSTANCE.bspatchStreamingInner(randomAccessFile, inputStream, bufferedInputStream, bufferedInputStream2, bufferedInputStream3, inputStream);
                Unit unit = Unit.f25780a;
                th = null;
                C14001c.m1713a(inputStream, th);
                C14001c.m1713a(bufferedInputStream3, th);
                C14001c.m1713a(bufferedInputStream2, th);
                C14001c.m1713a(bufferedInputStream, th);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
