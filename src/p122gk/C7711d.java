package p122gk;

import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, m15073d2 = {"", "algorithm", "Lgk/c;", "a", "okio"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: gk.d */
/* loaded from: classes8.dex */
public final class C7711d {

    @Metadata(m15074d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00020\u0002H\u0016R\u001c\u0010\r\u001a\n \t*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, m15073d2 = {"gk/d$a", "Lgk/c;", "", "input", "", "offset", "byteCount", "", "update", "kotlin.jvm.PlatformType", "a", "Ljava/security/MessageDigest;", "Ljava/security/MessageDigest;", "digest", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: gk.d$a */
    /* loaded from: classes8.dex */
    public static final class C7712a implements AbstractC7710c {

        /* renamed from: a */
        private final MessageDigest f16737a;

        /* renamed from: b */
        final /* synthetic */ String f16738b;

        C7712a(String str) {
            this.f16738b = str;
            this.f16737a = MessageDigest.getInstance(str);
        }

        @Override // p122gk.AbstractC7710c
        /* renamed from: a */
        public byte[] mo21577a() {
            return this.f16737a.digest();
        }

        @Override // p122gk.AbstractC7710c
        public void update(byte[] input, int i, int i2) {
            C9971q.m14633g(input, "input");
            this.f16737a.update(input, i, i2);
        }
    }

    /* renamed from: a */
    public static final AbstractC7710c m21578a(String algorithm) {
        C9971q.m14633g(algorithm, "algorithm");
        return new C7712a(algorithm);
    }
}
