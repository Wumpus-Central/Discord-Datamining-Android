package fk;

import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.ByteString;
import okio.Sink;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0019\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m15073d2 = {"Lfk/j;", "Lfk/f;", "Lokio/Buffer;", "source", "", "byteCount", "", "K", "Ljava/security/MessageDigest;", "l", "Ljava/security/MessageDigest;", "messageDigest", "Ljavax/crypto/Mac;", "m", "Ljavax/crypto/Mac;", "mac", "Lokio/ByteString;", "b", "()Lokio/ByteString;", "hash", "Lokio/Sink;", "sink", "", "algorithm", "<init>", "(Lokio/Sink;Ljava/lang/String;)V", "n", "a", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.j */
/* loaded from: classes8.dex */
public final class C7362j extends AbstractC7358f {

    /* renamed from: n */
    public static final C7363a f15856n = new C7363a(null);

    /* renamed from: l */
    private final MessageDigest f15857l;

    /* renamed from: m */
    private final Mac f15858m = null;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m15073d2 = {"Lfk/j$a;", "", "Lokio/Sink;", "sink", "Lfk/j;", "a", "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: fk.j$a */
    /* loaded from: classes8.dex */
    public static final class C7363a {
        private C7363a() {
        }

        public /* synthetic */ C7363a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7362j m22826a(Sink sink) {
            C9971q.m14633g(sink, "sink");
            return new C7362j(sink, "MD5");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7362j(Sink sink, String algorithm) {
        super(sink);
        C9971q.m14633g(sink, "sink");
        C9971q.m14633g(algorithm, "algorithm");
        this.f15857l = MessageDigest.getInstance(algorithm);
    }

    @Override // fk.AbstractC7358f, okio.Sink
    /* renamed from: K */
    public void mo392K(Buffer source, long j) {
        C9971q.m14633g(source, "source");
        C7355c.m22840b(source.size(), 0L, j);
        C7377u uVar = source.f25530k;
        C9971q.m14636d(uVar);
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, uVar.f15888c - uVar.f15887b);
            MessageDigest messageDigest = this.f15857l;
            if (messageDigest != null) {
                messageDigest.update(uVar.f15886a, uVar.f15887b, min);
            } else {
                Mac mac = this.f15858m;
                C9971q.m14636d(mac);
                mac.update(uVar.f15886a, uVar.f15887b, min);
            }
            j2 += min;
            uVar = uVar.f15891f;
            C9971q.m14636d(uVar);
        }
        super.mo392K(source, j);
    }

    /* renamed from: b */
    public final ByteString m22827b() {
        byte[] result;
        MessageDigest messageDigest = this.f15857l;
        if (messageDigest != null) {
            result = messageDigest.digest();
        } else {
            Mac mac = this.f15858m;
            C9971q.m14636d(mac);
            result = mac.doFinal();
        }
        C9971q.m14634f(result, "result");
        return new ByteString(result);
    }
}
