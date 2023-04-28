package p326ri;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¨\u0006\b"}, m15073d2 = {"", "", "c", "char", "", "radix", "b", "a", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/text/CharsKt")
/* renamed from: ri.b */
/* loaded from: classes8.dex */
public class C12690b {
    /* renamed from: a */
    public static int m5870a(int i) {
        if (new IntRange(2, 36).contains(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new IntRange(2, 36));
    }

    /* renamed from: b */
    public static final int m5869b(char c, int i) {
        return Character.digit((int) c, i);
    }

    /* renamed from: c */
    public static boolean m5868c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
