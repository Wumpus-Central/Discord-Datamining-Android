package p162ik;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Calendar;
import java.util.Date;

/* renamed from: ik.a */
/* loaded from: classes8.dex */
public class C8685a {

    /* renamed from: a */
    private static final int[][] f19180a = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, RNCWebViewManager.COMMAND_CLEAR_CACHE}, new int[]{1}, new int[]{0}};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ik.a$a */
    /* loaded from: classes8.dex */
    public enum EnumC0276a {
        TRUNCATE,
        ROUND,
        CEILING
    }

    /* renamed from: a */
    private static void m18397a(Calendar calendar, int i, EnumC0276a aVar) {
        boolean z;
        int[][] iArr;
        int i2;
        char c;
        boolean z2;
        char c2;
        if (calendar.get(1) > 280000000) {
            throw new ArithmeticException("Calendar value too large for accurate calculations");
        } else if (i != 14) {
            Date time = calendar.getTime();
            long time2 = time.getTime();
            int i3 = calendar.get(14);
            EnumC0276a aVar2 = EnumC0276a.TRUNCATE;
            if (aVar2 == aVar || i3 < 500) {
                time2 -= i3;
            }
            if (i == 13) {
                z = true;
            } else {
                z = false;
            }
            int i4 = calendar.get(13);
            if (!z && (aVar2 == aVar || i4 < 30)) {
                time2 -= i4 * 1000;
            }
            if (i == 12) {
                z = true;
            }
            int i5 = calendar.get(12);
            if (!z && (aVar2 == aVar || i5 < 30)) {
                time2 -= i5 * 60000;
            }
            if (time.getTime() != time2) {
                time.setTime(time2);
                calendar.setTime(time);
            }
            boolean z3 = false;
            for (int[] iArr2 : f19180a) {
                for (int i6 : iArr2) {
                    if (i6 == i) {
                        if (aVar != EnumC0276a.CEILING && (aVar != EnumC0276a.ROUND || !z3)) {
                            return;
                        } else {
                            if (i == 1001) {
                                if (calendar.get(5) == 1) {
                                    calendar.add(5, 15);
                                    return;
                                }
                                calendar.add(5, -15);
                                calendar.add(2, 1);
                                return;
                            } else if (i != 9) {
                                calendar.add(iArr2[0], 1);
                                return;
                            } else if (calendar.get(11) == 0) {
                                calendar.add(11, 12);
                                return;
                            } else {
                                calendar.add(11, -12);
                                calendar.add(5, 1);
                                return;
                            }
                        }
                    }
                }
                if (i != 9) {
                    if (i == 1001 && iArr2[0] == 5) {
                        int i7 = calendar.get(5) - 1;
                        if (i7 >= 15) {
                            i7 -= 15;
                        }
                        if (i7 > 7) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i2 = i7;
                        c = '\f';
                        z2 = true;
                    }
                    c = '\f';
                    z2 = false;
                    i2 = 0;
                } else {
                    if (iArr2[0] == 11) {
                        int i8 = calendar.get(11);
                        c = '\f';
                        if (i8 >= 12) {
                            i8 -= 12;
                        }
                        if (i8 >= 6) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i2 = i8;
                        z2 = true;
                    }
                    c = '\f';
                    z2 = false;
                    i2 = 0;
                }
                if (!z2) {
                    c2 = 0;
                    int actualMinimum = calendar.getActualMinimum(iArr2[0]);
                    int actualMaximum = calendar.getActualMaximum(iArr2[0]);
                    int i9 = calendar.get(iArr2[0]) - actualMinimum;
                    if (i9 > (actualMaximum - actualMinimum) / 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i2 = i9;
                } else {
                    c2 = 0;
                }
                if (i2 != 0) {
                    int i10 = iArr2[c2];
                    calendar.set(i10, calendar.get(i10) - i2);
                }
            }
            throw new IllegalArgumentException("The field " + i + " is not supported");
        }
    }

    /* renamed from: b */
    public static Calendar m18396b(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            m18397a(calendar2, i, EnumC0276a.TRUNCATE);
            return calendar2;
        }
        throw new IllegalArgumentException("The date must not be null");
    }
}
