package p228m7;

/* renamed from: m7.l */
/* loaded from: classes7.dex */
final class C10518l {
    /* renamed from: a */
    public static int m12974a(AbstractC10515j jVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int j = jVar.mo12933j(bArr, i + i3, i2 - i3);
            if (j == -1) {
                break;
            }
            i3 += j;
        }
        return i3;
    }
}
