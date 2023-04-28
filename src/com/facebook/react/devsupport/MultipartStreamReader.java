package com.facebook.react.devsupport;

import java.util.HashMap;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes7.dex */
public class MultipartStreamReader {
    private static final String CRLF = "\r\n";
    private final String mBoundary;
    private long mLastProgressEvent;
    private final BufferedSource mSource;

    /* loaded from: classes7.dex */
    public interface ChunkListener {
        void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z);

        void onChunkProgress(Map<String, String> map, long j, long j2);
    }

    public MultipartStreamReader(BufferedSource bufferedSource, String str) {
        this.mSource = bufferedSource;
        this.mBoundary = str;
    }

    private void emitChunk(Buffer buffer, boolean z, ChunkListener chunkListener) {
        ByteString e = ByteString.m9714e("\r\n\r\n");
        long v = buffer.mo9724v(e);
        if (v == -1) {
            chunkListener.onChunkComplete(null, buffer, z);
            return;
        }
        Buffer buffer2 = new Buffer();
        Buffer buffer3 = new Buffer();
        buffer.read(buffer2, v);
        buffer.skip(e.m9697v());
        buffer.mo9723x0(buffer3);
        chunkListener.onChunkComplete(parseHeaders(buffer2), buffer3, z);
    }

    private void emitProgress(Map<String, String> map, long j, boolean z, ChunkListener chunkListener) {
        long j2;
        if (map != null && chunkListener != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastProgressEvent > 16 || z) {
                this.mLastProgressEvent = currentTimeMillis;
                if (map.get("Content-Length") != null) {
                    j2 = Long.parseLong(map.get("Content-Length"));
                } else {
                    j2 = 0;
                }
                chunkListener.onChunkProgress(map, j, j2);
            }
        }
    }

    private Map<String, String> parseHeaders(Buffer buffer) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str : buffer.mo9726s0().split(CRLF)) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                hashMap.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        }
        return hashMap;
    }

    public boolean readAllParts(ChunkListener chunkListener) {
        boolean z;
        long j;
        ByteString e = ByteString.m9714e("\r\n--" + this.mBoundary + CRLF);
        ByteString e2 = ByteString.m9714e("\r\n--" + this.mBoundary + "--" + CRLF);
        ByteString e3 = ByteString.m9714e("\r\n\r\n");
        Buffer buffer = new Buffer();
        long j2 = 0L;
        long j3 = 0L;
        long j4 = 0L;
        Map<String, String> map = null;
        while (true) {
            long max = Math.max(j2 - e2.m9697v(), j3);
            long Q = buffer.m9779Q(e, max);
            if (Q == -1) {
                Q = buffer.m9779Q(e2, max);
                z = true;
            } else {
                z = false;
            }
            if (Q == -1) {
                long size = buffer.size();
                if (map == null) {
                    long Q2 = buffer.m9779Q(e3, max);
                    if (Q2 >= 0) {
                        this.mSource.read(buffer, Q2);
                        Buffer buffer2 = new Buffer();
                        j = j3;
                        buffer.m9760s(buffer2, max, Q2 - max);
                        j4 = buffer2.size() + e3.m9697v();
                        map = parseHeaders(buffer2);
                    } else {
                        j = j3;
                    }
                } else {
                    j = j3;
                    emitProgress(map, buffer.size() - j4, false, chunkListener);
                }
                if (this.mSource.read(buffer, 4096) <= 0) {
                    return false;
                }
                j2 = size;
                j3 = j;
            } else {
                long j5 = Q - j3;
                if (j3 > 0) {
                    Buffer buffer3 = new Buffer();
                    buffer.skip(j3);
                    buffer.read(buffer3, j5);
                    emitProgress(map, buffer3.size() - j4, true, chunkListener);
                    emitChunk(buffer3, z, chunkListener);
                    j4 = 0;
                    map = null;
                } else {
                    buffer.skip(Q);
                }
                if (z) {
                    return true;
                }
                j3 = e.m9697v();
                j2 = j3;
            }
        }
    }
}
