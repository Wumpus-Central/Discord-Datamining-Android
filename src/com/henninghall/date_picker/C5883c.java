package com.henninghall.date_picker;

import ae.EnumC1366a;
import ae.EnumC1367b;
import ae.EnumC1368c;
import ae.EnumC1369d;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;

/* renamed from: com.henninghall.date_picker.c */
/* loaded from: classes6.dex */
public class C5883c {

    /* renamed from: a */
    private final C5897k f11697a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C5884a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11698a;

        /* renamed from: b */
        static final /* synthetic */ int[] f11699b;

        static {
            int[] iArr = new int[EnumC1368c.values().length];
            f11699b = iArr;
            try {
                iArr[EnumC1368c.nativeAndroid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11699b[EnumC1368c.iosClone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC1367b.values().length];
            f11698a = iArr2;
            try {
                iArr2[EnumC1367b.datetime.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11698a[EnumC1367b.time.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11698a[EnumC1367b.date.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5883c(C5897k kVar) {
        this.f11697a = kVar;
    }

    /* renamed from: c */
    private ArrayList<EnumC1369d> m26985c() {
        String replaceAll = C5892g.m26968c(this.f11697a.m26931u()).replaceAll("\\('(.+?)'\\)", "\\${$1}").replaceAll("'.+?'", "").replaceAll("\\$\\{(.+?)\\}", "('$1')");
        ArrayList arrayList = new ArrayList(Arrays.asList(EnumC1369d.values()));
        ArrayList<EnumC1369d> arrayList2 = new ArrayList<>();
        EnumC1369d dVar = EnumC1369d.DAY;
        arrayList.remove(dVar);
        arrayList2.add(dVar);
        for (char c : replaceAll.toCharArray()) {
            try {
                EnumC1369d j = C5899l.m26916j(c);
                if (arrayList.contains(j)) {
                    arrayList.remove(j);
                    arrayList2.add(j);
                }
            } catch (Exception unused) {
            }
        }
        EnumC1369d dVar2 = EnumC1369d.AM_PM;
        if (arrayList.contains(dVar2)) {
            arrayList.remove(dVar2);
            arrayList2.add(dVar2);
        }
        if (!arrayList.isEmpty()) {
            Log.e("RNDatePicker", arrayList.size() + " wheel types cannot be ordered. Wheel type 0: " + arrayList.get(0));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public String m26987a() {
        Calendar t = this.f11697a.m26932t();
        String s = this.f11697a.m26933s();
        if (t != null) {
            return C5899l.m26924b(t);
        }
        return s;
    }

    /* renamed from: b */
    public ArrayList<EnumC1369d> m26986b() {
        ArrayList<EnumC1369d> c = m26985c();
        ArrayList<EnumC1369d> f = m26982f();
        ArrayList<EnumC1369d> arrayList = new ArrayList<>();
        Iterator<EnumC1369d> it = c.iterator();
        while (it.hasNext()) {
            EnumC1369d next = it.next();
            if (f.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public int m26984d() {
        int i = C5884a.f11699b[this.f11697a.m26954D().ordinal()];
        if (i == 1) {
            return C5896j.f11729b;
        }
        if (i != 2) {
            return C5896j.f11728a;
        }
        return C5896j.f11728a;
    }

    /* renamed from: e */
    public int m26983e() {
        int intValue = this.f11697a.m26935q().intValue() / 35;
        if (intValue % 2 == 0) {
            return intValue + 1;
        }
        return intValue;
    }

    /* renamed from: f */
    public ArrayList<EnumC1369d> m26982f() {
        ArrayList<EnumC1369d> arrayList = new ArrayList<>();
        EnumC1367b z = this.f11697a.m26926z();
        int i = C5884a.f11698a[z.ordinal()];
        if (i == 1) {
            arrayList.add(EnumC1369d.DAY);
            arrayList.add(EnumC1369d.HOUR);
            arrayList.add(EnumC1369d.MINUTE);
        } else if (i == 2) {
            arrayList.add(EnumC1369d.HOUR);
            arrayList.add(EnumC1369d.MINUTE);
        } else if (i == 3) {
            arrayList.add(EnumC1369d.YEAR);
            arrayList.add(EnumC1369d.MONTH);
            arrayList.add(EnumC1369d.DATE);
        }
        if ((z == EnumC1367b.time || z == EnumC1367b.datetime) && this.f11697a.f11745p.m26979i()) {
            arrayList.add(EnumC1369d.AM_PM);
        }
        return arrayList;
    }

    /* renamed from: g */
    public boolean m26981g() {
        return this.f11697a.m26954D() == EnumC1368c.nativeAndroid;
    }

    /* renamed from: h */
    public boolean m26980h() {
        return this.f11697a.m26926z() == EnumC1367b.time && !m26979i();
    }

    /* renamed from: i */
    public boolean m26979i() {
        if (this.f11697a.m26934r() == EnumC1366a.locale) {
            return C5892g.m26962i(this.f11697a.m26931u());
        }
        return C5899l.m26923c();
    }
}
