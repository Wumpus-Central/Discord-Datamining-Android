package okio;

import java.io.Closeable;
import kotlin.Metadata;

@Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m15073d2 = {"Lokio/Source;", "Ljava/io/Closeable;", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public interface Source extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(Buffer buffer, long j);

    Timeout timeout();
}
