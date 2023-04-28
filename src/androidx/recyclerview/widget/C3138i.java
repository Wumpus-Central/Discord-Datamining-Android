package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
class C3138i {

    /* renamed from: a */
    final AbstractC3139a f4867a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    public interface AbstractC3139a {
        /* renamed from: a */
        AdapterHelper.C3064b mo35112a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo35111b(AdapterHelper.C3064b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3138i(AbstractC3139a aVar) {
        this.f4867a = aVar;
    }

    /* renamed from: a */
    private int m35118a(List<AdapterHelper.C3064b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4528a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m35116c(List<AdapterHelper.C3064b> list, int i, AdapterHelper.C3064b bVar, int i2, AdapterHelper.C3064b bVar2) {
        int i3;
        int i4 = bVar.f4531d;
        int i5 = bVar2.f4529b;
        if (i4 < i5) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        int i6 = bVar.f4529b;
        if (i6 < i5) {
            i3++;
        }
        if (i5 <= i6) {
            bVar.f4529b = i6 + bVar2.f4531d;
        }
        int i7 = bVar2.f4529b;
        if (i7 <= i4) {
            bVar.f4531d = i4 + bVar2.f4531d;
        }
        bVar2.f4529b = i7 + i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    private void m35115d(List<AdapterHelper.C3064b> list, int i, int i2) {
        AdapterHelper.C3064b bVar = list.get(i);
        AdapterHelper.C3064b bVar2 = list.get(i2);
        int i3 = bVar2.f4528a;
        if (i3 == 1) {
            m35116c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            m35114e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            m35113f(list, i, bVar, i2, bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35117b(List<AdapterHelper.C3064b> list) {
        while (true) {
            int a = m35118a(list);
            if (a != -1) {
                m35115d(list, a, a + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    void m35114e(List<AdapterHelper.C3064b> list, int i, AdapterHelper.C3064b bVar, int i2, AdapterHelper.C3064b bVar2) {
        boolean z;
        int i3 = bVar.f4529b;
        int i4 = bVar.f4531d;
        boolean z2 = false;
        if (i3 < i4) {
            if (bVar2.f4529b == i3 && bVar2.f4531d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.f4529b == i4 + 1 && bVar2.f4531d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = bVar2.f4529b;
        if (i4 < i5) {
            bVar2.f4529b = i5 - 1;
        } else {
            int i6 = bVar2.f4531d;
            if (i4 < i5 + i6) {
                bVar2.f4531d = i6 - 1;
                bVar.f4528a = 2;
                bVar.f4531d = 1;
                if (bVar2.f4531d == 0) {
                    list.remove(i2);
                    this.f4867a.mo35111b(bVar2);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.f4529b;
        int i8 = bVar2.f4529b;
        AdapterHelper.C3064b bVar3 = null;
        if (i7 <= i8) {
            bVar2.f4529b = i8 + 1;
        } else {
            int i9 = bVar2.f4531d;
            if (i7 < i8 + i9) {
                bVar3 = this.f4867a.mo35112a(2, i7 + 1, (i8 + i9) - i7, null);
                bVar2.f4531d = bVar.f4529b - bVar2.f4529b;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f4867a.mo35111b(bVar);
            return;
        }
        if (z) {
            if (bVar3 != null) {
                int i10 = bVar.f4529b;
                if (i10 > bVar3.f4529b) {
                    bVar.f4529b = i10 - bVar3.f4531d;
                }
                int i11 = bVar.f4531d;
                if (i11 > bVar3.f4529b) {
                    bVar.f4531d = i11 - bVar3.f4531d;
                }
            }
            int i12 = bVar.f4529b;
            if (i12 > bVar2.f4529b) {
                bVar.f4529b = i12 - bVar2.f4531d;
            }
            int i13 = bVar.f4531d;
            if (i13 > bVar2.f4529b) {
                bVar.f4531d = i13 - bVar2.f4531d;
            }
        } else {
            if (bVar3 != null) {
                int i14 = bVar.f4529b;
                if (i14 >= bVar3.f4529b) {
                    bVar.f4529b = i14 - bVar3.f4531d;
                }
                int i15 = bVar.f4531d;
                if (i15 >= bVar3.f4529b) {
                    bVar.f4531d = i15 - bVar3.f4531d;
                }
            }
            int i16 = bVar.f4529b;
            if (i16 >= bVar2.f4529b) {
                bVar.f4529b = i16 - bVar2.f4531d;
            }
            int i17 = bVar.f4531d;
            if (i17 >= bVar2.f4529b) {
                bVar.f4531d = i17 - bVar2.f4531d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f4529b != bVar.f4531d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m35113f(java.util.List<androidx.recyclerview.widget.AdapterHelper.C3064b> r9, int r10, androidx.recyclerview.widget.AdapterHelper.C3064b r11, int r12, androidx.recyclerview.widget.AdapterHelper.C3064b r13) {
        /*
            r8 = this;
            int r0 = r11.f4531d
            int r1 = r13.f4529b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r3
            r13.f4529b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f4531d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r3
            r13.f4531d = r5
            androidx.recyclerview.widget.i$a r0 = r8.f4867a
            int r1 = r11.f4529b
            java.lang.Object r5 = r13.f4530c
            androidx.recyclerview.widget.AdapterHelper$b r0 = r0.mo35112a(r2, r1, r3, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r4
        L_0x0021:
            int r1 = r11.f4529b
            int r5 = r13.f4529b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r3
            r13.f4529b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f4531d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.i$a r4 = r8.f4867a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f4530c
            androidx.recyclerview.widget.AdapterHelper$b r4 = r4.mo35112a(r2, r1, r5, r3)
            int r1 = r13.f4531d
            int r1 = r1 - r5
            r13.f4531d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f4531d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.i$a r11 = r8.f4867a
            r11.mo35111b(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r9.add(r10, r4)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C3138i.m35113f(java.util.List, int, androidx.recyclerview.widget.AdapterHelper$b, int, androidx.recyclerview.widget.AdapterHelper$b):void");
    }
}
