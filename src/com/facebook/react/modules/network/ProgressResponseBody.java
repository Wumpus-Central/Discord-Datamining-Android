package com.facebook.react.modules.network;

import fk.AbstractC7359g;
import fk.C7366m;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;

/* loaded from: classes7.dex */
public class ProgressResponseBody extends ResponseBody {
    private BufferedSource mBufferedSource;
    private final ProgressListener mProgressListener;
    private final ResponseBody mResponseBody;
    private long mTotalBytesRead = 0;

    public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
        this.mResponseBody = responseBody;
        this.mProgressListener = progressListener;
    }

    static /* synthetic */ long access$014(ProgressResponseBody progressResponseBody, long j) {
        long j2 = progressResponseBody.mTotalBytesRead + j;
        progressResponseBody.mTotalBytesRead = j2;
        return j2;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        if (this.mBufferedSource == null) {
            this.mBufferedSource = C7366m.m22819d(source(this.mResponseBody.source()));
        }
        return this.mBufferedSource;
    }

    public long totalBytesRead() {
        return this.mTotalBytesRead;
    }

    private Source source(Source source) {
        return new AbstractC7359g(source) { // from class: com.facebook.react.modules.network.ProgressResponseBody.1
            @Override // fk.AbstractC7359g, okio.Source
            public long read(Buffer buffer, long j) {
                long j2;
                boolean z;
                long read = super.read(buffer, j);
                ProgressResponseBody progressResponseBody = ProgressResponseBody.this;
                int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
                if (i != 0) {
                    j2 = read;
                } else {
                    j2 = 0;
                }
                ProgressResponseBody.access$014(progressResponseBody, j2);
                ProgressListener progressListener = ProgressResponseBody.this.mProgressListener;
                long j3 = ProgressResponseBody.this.mTotalBytesRead;
                long contentLength = ProgressResponseBody.this.mResponseBody.contentLength();
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                progressListener.onProgress(j3, contentLength, z);
                return read;
            }
        };
    }
}
