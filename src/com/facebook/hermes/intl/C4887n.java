package com.facebook.hermes.intl;

import com.facebook.hermes.intl.AbstractC4849b;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p129h5.AbstractC7805b;
import p129h5.C7840i;
import p163j$.util.DesugarTimeZone;

/* renamed from: com.facebook.hermes.intl.n */
/* loaded from: classes7.dex */
public class C4887n implements AbstractC4849b {

    /* renamed from: a */
    private DateFormat f8091a = null;

    /* renamed from: com.facebook.hermes.intl.n$a */
    /* loaded from: classes7.dex */
    private static class C4888a {
        /* renamed from: a */
        public static String m31556a(String str) {
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

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: a */
    public AttributedCharacterIterator mo31555a(double d) {
        return this.f8091a.formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: b */
    public String mo31554b(AbstractC7805b<?> bVar) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: c */
    public String mo31553c(double d) {
        return this.f8091a.format(new Date((long) d));
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: d */
    public AbstractC4849b.EnumC4854f mo31552d(AbstractC7805b<?> bVar) {
        AbstractC4849b.EnumC4854f fVar;
        try {
            String a = C4888a.m31556a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (Locale) bVar.mo21162h())).toPattern());
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
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute == DateFormat.Field.YEAR) {
            try {
                Double.parseDouble(str);
                return "year";
            } catch (NumberFormatException unused) {
                return "yearName";
            }
        } else if (attribute == DateFormat.Field.MONTH) {
            return "month";
        } else {
            if (attribute == DateFormat.Field.DAY_OF_MONTH) {
                return "day";
            }
            if (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) {
                return "hour";
            }
            if (attribute == DateFormat.Field.MINUTE) {
                return "minute";
            }
            if (attribute == DateFormat.Field.SECOND) {
                return "second";
            }
            if (attribute == DateFormat.Field.TIME_ZONE) {
                return "timeZoneName";
            }
            if (attribute == DateFormat.Field.AM_PM) {
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
        return Calendar.getInstance((Locale) bVar.mo21162h()).getTimeZone().getID();
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: g */
    public void mo31549g(AbstractC7805b<?> bVar, String str, String str2, AbstractC4849b.EnumC4852d dVar, AbstractC4849b.EnumC4859k kVar, AbstractC4849b.EnumC4851c cVar, AbstractC4849b.EnumC4860l lVar, AbstractC4849b.EnumC4856h hVar, AbstractC4849b.EnumC0116b bVar2, AbstractC4849b.EnumC4853e eVar, AbstractC4849b.EnumC4855g gVar, AbstractC4849b.EnumC4857i iVar, AbstractC4849b.EnumC4858j jVar, AbstractC4849b.EnumC4854f fVar, Object obj) {
        if (!str.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(C7840i.m21251h(str));
            bVar.mo21164f("ca", arrayList);
        }
        if (!str2.isEmpty()) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add(C7840i.m21251h(str2));
            bVar.mo21164f("nu", arrayList2);
        }
        boolean z = true;
        boolean z2 = (lVar == null && hVar == null && bVar2 == null) ? false : true;
        if (eVar == null && gVar == null && iVar == null) {
            z = false;
        }
        if (z2 && z) {
            this.f8091a = DateFormat.getDateTimeInstance(0, 0, (Locale) bVar.mo21162h());
        } else if (z2) {
            this.f8091a = DateFormat.getDateInstance(0, (Locale) bVar.mo21162h());
        } else if (z) {
            this.f8091a = DateFormat.getTimeInstance(0, (Locale) bVar.mo21162h());
        }
        if (!C7840i.m21245n(obj) && !C7840i.m21249j(obj)) {
            this.f8091a.setTimeZone(DesugarTimeZone.getTimeZone(C7840i.m21251h(obj)));
        }
    }

    @Override // com.facebook.hermes.intl.AbstractC4849b
    /* renamed from: h */
    public String mo31548h(AbstractC7805b<?> bVar) {
        return DateFormat.getDateInstance(3, (Locale) bVar.mo21162h()).getCalendar().toString();
    }
}
