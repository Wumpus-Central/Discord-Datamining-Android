package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.AbstractC4849b;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import p129h5.AbstractC7805b;
import p129h5.C7840i;
import p129h5.C7848j;
import p129h5.C7872n3;

/* renamed from: com.facebook.hermes.intl.o */
/* loaded from: classes7.dex */
public class C4889o implements AbstractC4849b {

    /* renamed from: a */
    private DateFormat f8092a = null;

    /* renamed from: com.facebook.hermes.intl.o$a */
    /* loaded from: classes7.dex */
    private static class C4890a {
        /* renamed from: a */
        public static String m31546a(String str) {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    z = !z;
                } else if (!z && ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                    sb2.append(str.charAt(i));
                }
            }
            return sb2.toString();
        }
    }

    /* renamed from: i */
    private static String m31547i(AbstractC4849b.EnumC4859k kVar, AbstractC4849b.EnumC4851c cVar, AbstractC4849b.EnumC4860l lVar, AbstractC4849b.EnumC4856h hVar, AbstractC4849b.EnumC0116b bVar, AbstractC4849b.EnumC4853e eVar, AbstractC4849b.EnumC4855g gVar, AbstractC4849b.EnumC4857i iVar, AbstractC4849b.EnumC4858j jVar, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kVar.m31620a());
        sb2.append(cVar.m31627a());
        sb2.append(lVar.m31619a());
        sb2.append(hVar.m31623a());
        sb2.append(bVar.m31628a());
        if (z) {
            sb2.append(eVar.m31626a());
        } else {
            sb2.append(eVar.m31625b());
        }
        sb2.append(gVar.m31624a());
        sb2.append(iVar.m31622a());
        sb2.append(jVar.m31621a());
        return sb2.toString();
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: a */
    public AttributedCharacterIterator mo31555a(double d) {
        AttributedCharacterIterator formatToCharacterIterator;
        formatToCharacterIterator = this.f8092a.formatToCharacterIterator(Double.valueOf(d));
        return formatToCharacterIterator;
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: b */
    public String mo31554b(AbstractC7805b<?> bVar) {
        NumberingSystem instance;
        String name;
        instance = NumberingSystem.getInstance((ULocale) bVar.mo21162h());
        name = instance.getName();
        return name;
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: c */
    public String mo31553c(double d) {
        String format;
        format = this.f8092a.format(new Date((long) d));
        return format;
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: d */
    public AbstractC4849b.EnumC4854f mo31552d(AbstractC7805b<?> bVar) {
        DateFormat timeInstance;
        String pattern;
        AbstractC4849b.EnumC4854f fVar;
        try {
            timeInstance = DateFormat.getTimeInstance(0, (ULocale) bVar.mo21162h());
            pattern = ((SimpleDateFormat) timeInstance).toPattern();
            String a = C4890a.m31546a(pattern);
            if (a.contains(String.valueOf('h'))) {
                fVar = AbstractC4849b.EnumC4854f.H12;
            } else if (a.contains(String.valueOf('K'))) {
                fVar = AbstractC4849b.EnumC4854f.H11;
            } else if (a.contains(String.valueOf('H'))) {
                fVar = AbstractC4849b.EnumC4854f.H23;
            } else {
                fVar = AbstractC4849b.EnumC4854f.H24;
            }
            return fVar;
        } catch (ClassCastException unused) {
            return AbstractC4849b.EnumC4854f.H24;
        }
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: e */
    public String mo31551e(AttributedCharacterIterator.Attribute attribute, String str) {
        DateFormat.Field field;
        DateFormat.Field field2;
        DateFormat.Field field3;
        DateFormat.Field field4;
        DateFormat.Field field5;
        DateFormat.Field field6;
        DateFormat.Field field7;
        DateFormat.Field field8;
        DateFormat.Field field9;
        DateFormat.Field field10;
        DateFormat.Field field11;
        DateFormat.Field field12;
        DateFormat.Field field13;
        field = DateFormat.Field.DAY_OF_WEEK;
        if (attribute == field) {
            return "weekday";
        }
        field2 = DateFormat.Field.ERA;
        if (attribute == field2) {
            return "era";
        }
        field3 = DateFormat.Field.YEAR;
        if (attribute == field3) {
            try {
                Double.parseDouble(str);
                return "year";
            } catch (NumberFormatException unused) {
                return "yearName";
            }
        } else {
            field4 = DateFormat.Field.MONTH;
            if (attribute == field4) {
                return "month";
            }
            field5 = DateFormat.Field.DAY_OF_MONTH;
            if (attribute == field5) {
                return "day";
            }
            field6 = DateFormat.Field.HOUR0;
            if (attribute == field6) {
                return "hour";
            }
            field7 = DateFormat.Field.HOUR1;
            if (attribute == field7) {
                return "hour";
            }
            field8 = DateFormat.Field.HOUR_OF_DAY0;
            if (attribute == field8) {
                return "hour";
            }
            field9 = DateFormat.Field.HOUR_OF_DAY1;
            if (attribute == field9) {
                return "hour";
            }
            field10 = DateFormat.Field.MINUTE;
            if (attribute == field10) {
                return "minute";
            }
            field11 = DateFormat.Field.SECOND;
            if (attribute == field11) {
                return "second";
            }
            field12 = DateFormat.Field.TIME_ZONE;
            if (attribute == field12) {
                return "timeZoneName";
            }
            field13 = DateFormat.Field.AM_PM;
            if (attribute == field13) {
                return "dayPeriod";
            }
            if (attribute.toString().equals("android.icu.text.DateFormat$Field(related year)")) {
                return "relatedYear";
            }
            return "literal";
        }
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: f */
    public String mo31550f(AbstractC7805b<?> bVar) {
        Calendar instance;
        TimeZone timeZone;
        String id2;
        instance = Calendar.getInstance((ULocale) bVar.mo21162h());
        timeZone = instance.getTimeZone();
        id2 = timeZone.getID();
        return id2;
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: g */
    public void mo31549g(AbstractC7805b<?> bVar, String str, String str2, AbstractC4849b.EnumC4852d dVar, AbstractC4849b.EnumC4859k kVar, AbstractC4849b.EnumC4851c cVar, AbstractC4849b.EnumC4860l lVar, AbstractC4849b.EnumC4856h hVar, AbstractC4849b.EnumC0116b bVar2, AbstractC4849b.EnumC4853e eVar, AbstractC4849b.EnumC4855g gVar, AbstractC4849b.EnumC4857i iVar, AbstractC4849b.EnumC4858j jVar, AbstractC4849b.EnumC4854f fVar, Object obj) {
        Calendar calendar;
        NumberingSystem instanceByName;
        TimeZone timeZone;
        DateFormat patternInstance;
        DateFormat patternInstance2;
        String i = m31547i(kVar, cVar, lVar, hVar, bVar2, eVar, gVar, iVar, jVar, fVar == AbstractC4849b.EnumC4854f.H11 || fVar == AbstractC4849b.EnumC4854f.H12);
        if (!str.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(C7840i.m21251h(str));
            AbstractC7805b<?> d = bVar.mo21166d();
            d.mo21164f("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) d.mo21162h());
        } else {
            calendar = null;
        }
        if (!str2.isEmpty()) {
            try {
                instanceByName = NumberingSystem.getInstanceByName(C7840i.m21251h(str2));
                if (instanceByName != null) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    arrayList2.add(C7840i.m21251h(str2));
                    bVar.mo21164f("nu", arrayList2);
                } else {
                    throw new C7848j("Invalid numbering system: " + str2);
                }
            } catch (RuntimeException unused) {
                throw new C7848j("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            patternInstance2 = DateFormat.getPatternInstance(calendar, i, (ULocale) bVar.mo21162h());
            this.f8092a = patternInstance2;
        } else {
            patternInstance = DateFormat.getPatternInstance(i, (ULocale) bVar.mo21162h());
            this.f8092a = patternInstance;
        }
        if (!C7840i.m21245n(obj) && !C7840i.m21249j(obj)) {
            timeZone = TimeZone.getTimeZone(C7840i.m21251h(obj));
            this.f8092a.setTimeZone(timeZone);
        }
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: h */
    public String mo31548h(AbstractC7805b<?> bVar) {
        DateFormat dateInstance;
        Calendar calendar;
        String type;
        dateInstance = DateFormat.getDateInstance(3, (ULocale) bVar.mo21162h());
        calendar = dateInstance.getCalendar();
        type = calendar.getType();
        return C7872n3.m21209d(type);
    }
}
