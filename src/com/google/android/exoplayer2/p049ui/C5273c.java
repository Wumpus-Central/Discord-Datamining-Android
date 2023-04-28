package com.google.android.exoplayer2.p049ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import cc.AbstractC3899l0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.p049ui.C5273c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p119g9.C7510a;
import p119g9.C7557q0;
import p383v8.C13452a;
import p383v8.C13453b;
import p383v8.C13455d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.ui.c */
/* loaded from: classes5.dex */
public final class C5273c {

    /* renamed from: a */
    private static final Pattern f9668a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: com.google.android.exoplayer2.ui.c$b */
    /* loaded from: classes5.dex */
    public static class C5275b {

        /* renamed from: a */
        public final String f9669a;

        /* renamed from: b */
        public final Map<String, String> f9670b;

        private C5275b(String str, Map<String, String> map) {
            this.f9669a = str;
            this.f9670b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.c$c */
    /* loaded from: classes5.dex */
    public static final class C0143c {

        /* renamed from: e */
        private static final Comparator<C0143c> f9671e = new Comparator() { // from class: com.google.android.exoplayer2.ui.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e;
                e = C5273c.C0143c.m29668e((C5273c.C0143c) obj, (C5273c.C0143c) obj2);
                return e;
            }
        };

        /* renamed from: f */
        private static final Comparator<C0143c> f9672f = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int f;
                f = C5273c.C0143c.m29667f((C5273c.C0143c) obj, (C5273c.C0143c) obj2);
                return f;
            }
        };

        /* renamed from: a */
        public final int f9673a;

        /* renamed from: b */
        public final int f9674b;

        /* renamed from: c */
        public final String f9675c;

        /* renamed from: d */
        public final String f9676d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ int m29668e(C0143c cVar, C0143c cVar2) {
            int compare = Integer.compare(cVar2.f9674b, cVar.f9674b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f9675c.compareTo(cVar2.f9675c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar.f9676d.compareTo(cVar2.f9676d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ int m29667f(C0143c cVar, C0143c cVar2) {
            int compare = Integer.compare(cVar2.f9673a, cVar.f9673a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f9675c.compareTo(cVar.f9675c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar2.f9676d.compareTo(cVar.f9676d);
        }

        private C0143c(int i, int i2, String str, String str2) {
            this.f9673a = i;
            this.f9674b = i2;
            this.f9675c = str;
            this.f9676d = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.c$d */
    /* loaded from: classes5.dex */
    public static final class C5276d {

        /* renamed from: a */
        private final List<C0143c> f9677a = new ArrayList();

        /* renamed from: b */
        private final List<C0143c> f9678b = new ArrayList();
    }

    /* renamed from: a */
    public static C5275b m29680a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new C5275b("", AbstractC3899l0.m33370r());
        }
        if (!(charSequence instanceof Spanned)) {
            return new C5275b(m29679b(charSequence), AbstractC3899l0.m33370r());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer num : hashSet) {
            int intValue = num.intValue();
            hashMap.put(C5272b.m29682a("bg_" + intValue), C7557q0.m22209D("background-color:%s;", C5272b.m29681b(intValue)));
        }
        SparseArray<C5276d> c = m29678c(spanned, f);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < c.size()) {
            int keyAt = c.keyAt(i);
            sb2.append(m29679b(spanned.subSequence(i2, keyAt)));
            C5276d dVar = c.get(keyAt);
            Collections.sort(dVar.f9678b, C0143c.f9672f);
            for (C0143c cVar : dVar.f9678b) {
                sb2.append(cVar.f9676d);
            }
            Collections.sort(dVar.f9677a, C0143c.f9671e);
            for (C0143c cVar2 : dVar.f9677a) {
                sb2.append(cVar2.f9675c);
            }
            i++;
            i2 = keyAt;
        }
        sb2.append(m29679b(spanned.subSequence(i2, spanned.length())));
        return new C5275b(sb2.toString(), hashMap);
    }

    /* renamed from: b */
    private static String m29679b(CharSequence charSequence) {
        return f9668a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* renamed from: c */
    private static SparseArray<C5276d> m29678c(Spanned spanned, float f) {
        Object[] spans;
        SparseArray<C5276d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e = m29676e(obj, f);
            String d = m29677d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e != null) {
                C7510a.m22367e(d);
                C0143c cVar = new C0143c(spanStart, spanEnd, e, d);
                m29675f(sparseArray, spanStart).f9677a.add(cVar);
                m29675f(sparseArray, spanEnd).f9678b.add(cVar);
            }
        }
        return sparseArray;
    }

    /* renamed from: d */
    private static String m29677d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C13452a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof C13455d)) {
            return "</span>";
        }
        if (!(obj instanceof TypefaceSpan)) {
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "</b>";
                }
                if (style == 2) {
                    return "</i>";
                }
                if (style == 3) {
                    return "</i></b>";
                }
            } else if (obj instanceof C13453b) {
                return "<rt>" + m29679b(((C13453b) obj).f30057a) + "</rt></ruby>";
            } else if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
            return null;
        } else if (((TypefaceSpan) obj).getFamily() != null) {
            return "</span>";
        } else {
            return null;
        }
    }

    /* renamed from: e */
    private static String m29676e(Object obj, float f) {
        float f2;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return C7557q0.m22209D("<span style='color:%s;'>", C5272b.m29681b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return C7557q0.m22209D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof C13452a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                f2 = absoluteSizeSpan.getSize();
            } else {
                f2 = absoluteSizeSpan.getSize() / f;
            }
            return C7557q0.m22209D("<span style='font-size:%.2fpx;'>", Float.valueOf(f2));
        } else if (obj instanceof RelativeSizeSpan) {
            return C7557q0.m22209D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family != null) {
                    return C7557q0.m22209D("<span style='font-family:\"%s\";'>", family);
                }
                return null;
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "<b>";
                }
                if (style == 2) {
                    return "<i>";
                }
                if (style != 3) {
                    return null;
                }
                return "<b><i>";
            } else if (obj instanceof C13453b) {
                int i = ((C13453b) obj).f30058b;
                if (i == -1) {
                    return "<ruby style='ruby-position:unset;'>";
                }
                if (i == 1) {
                    return "<ruby style='ruby-position:over;'>";
                }
                if (i != 2) {
                    return null;
                }
                return "<ruby style='ruby-position:under;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (!(obj instanceof C13455d)) {
                    return null;
                }
                C13455d dVar = (C13455d) obj;
                return C7557q0.m22209D("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m29673h(dVar.f30059a, dVar.f30060b), m29674g(dVar.f30061c));
            }
        }
    }

    /* renamed from: f */
    private static C5276d m29675f(SparseArray<C5276d> sparseArray, int i) {
        C5276d dVar = sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        C5276d dVar2 = new C5276d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    /* renamed from: g */
    private static String m29674g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* renamed from: h */
    private static String m29673h(int i, int i2) {
        StringBuilder sb2 = new StringBuilder();
        if (i2 == 1) {
            sb2.append("filled ");
        } else if (i2 == 2) {
            sb2.append("open ");
        }
        if (i == 0) {
            sb2.append(ViewProps.NONE);
        } else if (i == 1) {
            sb2.append("circle");
        } else if (i == 2) {
            sb2.append("dot");
        } else if (i != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
