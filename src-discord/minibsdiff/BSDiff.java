package com.discord.minibsdiff;

import ii.o;
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
import ji.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import kotlin.sequences.Sequence;
import pf.c;
import wf.e;
import wf.g;
import wf.j;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ8\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/minibsdiff/BSDiff;", "", "()V", "BSDIFF_CONFIG_MAGIC", "", "BUFFER_SIZE_BYTES", "", "bspatchStreaming", "", "oldPath", "Ljava/io/File;", "patchPath", "newPath", "bspatchStreamingInner", "oldRandomAccessFile", "Ljava/io/RandomAccessFile;", "oldInputStream", "Ljava/io/InputStream;", "ctrlInputStream", "diffInputStream", "extraInputStream", "newOutputStream", "Ljava/io/OutputStream;", "chunkRange", "Lkotlin/sequences/Sequence;", "", "total", "BsPatchError", "minibsdiff_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BSDiff {
    private static final byte[] BSDIFF_CONFIG_MAGIC;
    private static final long BUFFER_SIZE_BYTES = 1000000;
    public static final BSDiff INSTANCE = new BSDiff();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/minibsdiff/BSDiff$BsPatchError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "minibsdiff_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class BsPatchError extends Exception {
        
        public BsPatchError(String message) {
            super(message);
            q.g(message, "message");
        }
    }

    static {
        byte[] bytes = "MBSDIF43".getBytes(d.f19886b);
        q.f(bytes, "this as java.lang.String).getBytes(charset)");
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
            long j10 = 32 + readOffset;
            InputStreamUtilsKt.skipNBytes(inputStream3, j10);
            InputStreamUtilsKt.skipNBytes(inputStream4, j10 + readOffset2);
            long j11 = 0;
            while (j11 < readOffset3) {
                long readOffset4 = InputStreamUtilsKt.readOffset(inputStream2);
                long readOffset5 = InputStreamUtilsKt.readOffset(inputStream2);
                long readOffset6 = InputStreamUtilsKt.readOffset(inputStream2);
                if (j11 + readOffset4 + readOffset5 <= readOffset3) {
                    Iterator<Integer> it = chunkRange(readOffset4).iterator();
                    while (true) {
                        int i10 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        int intValue = it.next().intValue();
                        InputStreamUtilsKt.readNBytes(inputStream, bArr, 0, intValue);
                        InputStreamUtilsKt.readNBytes(inputStream3, bArr2, 0, intValue);
                        int i11 = 0;
                        while (i11 < intValue) {
                            bArr[i11] = (byte) (bArr[i11] + bArr2[i11]);
                            i11++;
                            i10 = 0;
                        }
                        outputStream.write(bArr, i10, intValue);
                        it = it;
                        readOffset3 = readOffset3;
                    }
                    for (Integer num : chunkRange(readOffset5)) {
                        int intValue2 = num.intValue();
                        InputStreamUtilsKt.readNBytes(inputStream4, bArr, 0, intValue2);
                        outputStream.write(bArr, 0, intValue2);
                    }
                    randomAccessFile.seek(randomAccessFile.getFilePointer() + readOffset6);
                    j11 += readOffset4 + readOffset5;
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

    private final Sequence<Integer> chunkRange(long j10) {
        g q10;
        e o10;
        Sequence J;
        Sequence<Integer> y10;
        q10 = j.q(0, j10);
        o10 = j.o(q10, BUFFER_SIZE_BYTES);
        J = r.J(o10);
        y10 = o.y(J, new BSDiff$chunkRange$1(j10));
        return y10;
    }

    public final void bspatchStreaming(File oldPath, File patchPath, File newPath) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        BufferedInputStream bufferedInputStream3;
        BufferedOutputStream bufferedOutputStream;
        q.g(oldPath, "oldPath");
        q.g(patchPath, "patchPath");
        q.g(newPath, "newPath");
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
                Unit unit = Unit.f20666a;
                th = null;
                c.a(inputStream, th);
                c.a(bufferedInputStream3, th);
                c.a(bufferedInputStream2, th);
                c.a(bufferedInputStream, th);
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
