package pa;

/* renamed from: pa.h */
/* loaded from: classes3.dex */
final class C11596h extends AbstractC11595g {

    /* renamed from: a */
    private final char f25860a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11596h(char c) {
        this.f25860a = c;
    }

    @Override // pa.AbstractC11599k
    /* renamed from: a */
    public final boolean mo9288a(char c) {
        return c == this.f25860a;
    }

    public final String toString() {
        int i = this.f25860a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb2.append("CharMatcher.is('");
        sb2.append(copyValueOf);
        sb2.append("')");
        return sb2.toString();
    }
}
