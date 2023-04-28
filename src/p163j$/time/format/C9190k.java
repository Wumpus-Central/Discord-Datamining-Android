package p163j$.time.format;

import p163j$.time.temporal.EnumC9213a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.k */
/* loaded from: classes2.dex */
public final class C9190k implements AbstractC9186g {

    /* renamed from: c */
    static final String[] f20172c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d */
    static final C9190k f20173d = new C9190k("+HH:MM:ss", "Z");

    /* renamed from: a */
    private final String f20174a;

    /* renamed from: b */
    private final int f20175b;

    static {
        new C9190k("+HH:MM:ss", "0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9190k(String str, String str2) {
        int i = 0;
        while (true) {
            String[] strArr = f20172c;
            if (i >= 9) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            } else if (strArr[i].equals(str)) {
                this.f20175b = i;
                this.f20174a = str2;
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        Long e = rVar.m16688e(EnumC9213a.OFFSET_SECONDS);
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int i = (int) longValue;
        if (longValue == i) {
            if (i != 0) {
                int abs = Math.abs((i / 3600) % 100);
                int abs2 = Math.abs((i / 60) % 60);
                int abs3 = Math.abs(i % 60);
                int length = sb2.length();
                sb2.append(i < 0 ? "-" : "+");
                sb2.append((char) ((abs / 10) + 48));
                sb2.append((char) ((abs % 10) + 48));
                int i2 = this.f20175b;
                if (i2 >= 3 || (i2 >= 1 && abs2 > 0)) {
                    int i3 = i2 % 2;
                    String str = ":";
                    sb2.append(i3 == 0 ? str : "");
                    sb2.append((char) ((abs2 / 10) + 48));
                    sb2.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        if (i3 != 0) {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append((char) ((abs3 / 10) + 48));
                        sb2.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb2.setLength(length);
                }
                return true;
            }
            sb2.append(this.f20174a);
            return true;
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        String replace = this.f20174a.replace("'", "''");
        return "Offset(" + f20172c[this.f20175b] + ",'" + replace + "')";
    }
}
