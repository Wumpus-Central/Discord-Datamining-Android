package okio;

import fk.C7369p;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H&J\b\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001cH&J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\"H&J\b\u0010%\u001a\u00020$H&J\b\u0010&\u001a\u00020$H&J\u0010\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0007H&J\u0010\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020)H&J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0016H&J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0016H&J\b\u00100\u001a\u00020\u0000H&J\b\u00102\u001a\u000201H&R\u0014\u00105\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m15073d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/Buffer;", "o", "", "h0", "", "byteCount", "", "a0", "P", "", "readByte", "", "readShort", "", "readInt", "readLong", "i0", "B0", "skip", "Lokio/ByteString;", "o0", "e0", "Lfk/p;", "options", "t0", "", "g0", "V", "sink", "readFully", "y", "Lokio/Sink;", "x0", "", "s0", "T", "limit", "E", "Ljava/nio/charset/Charset;", "charset", "l0", "bytes", "v", "targetBytes", "A", "peek", "Ljava/io/InputStream;", "E0", "c", "()Lokio/Buffer;", "buffer", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    /* renamed from: A */
    long mo9742A(ByteString byteString);

    /* renamed from: B0 */
    long mo9741B0();

    /* renamed from: E */
    String mo9740E(long j);

    /* renamed from: E0 */
    InputStream mo9739E0();

    /* renamed from: P */
    boolean mo9738P(long j);

    /* renamed from: T */
    String mo9737T();

    /* renamed from: V */
    byte[] mo9736V(long j);

    /* renamed from: a0 */
    void mo9735a0(long j);

    /* renamed from: c */
    Buffer mo9734c();

    /* renamed from: e0 */
    ByteString mo9733e0(long j);

    /* renamed from: g0 */
    byte[] mo9732g0();

    /* renamed from: h0 */
    boolean mo9731h0();

    /* renamed from: i0 */
    long mo9730i0();

    /* renamed from: l0 */
    String mo9729l0(Charset charset);

    /* renamed from: o */
    Buffer mo9728o();

    /* renamed from: o0 */
    ByteString mo9727o0();

    BufferedSource peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    /* renamed from: s0 */
    String mo9726s0();

    void skip(long j);

    /* renamed from: t0 */
    int mo9725t0(C7369p pVar);

    /* renamed from: v */
    long mo9724v(ByteString byteString);

    /* renamed from: x0 */
    long mo9723x0(Sink sink);

    /* renamed from: y */
    void mo9722y(Buffer buffer, long j);
}
