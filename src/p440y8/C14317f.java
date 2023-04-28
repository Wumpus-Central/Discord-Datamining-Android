package p440y8;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayDeque;
import java.util.Map;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p383v8.C13452a;
import p383v8.C13453b;
import p383v8.C13454c;
import p383v8.C13455d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y8.f */
/* loaded from: classes7.dex */
public final class C14317f {
    /* renamed from: a */
    public static void m924a(Spannable spannable, int i, int i2, C14318g gVar, C14315d dVar, Map<String, C14318g> map, int i3) {
        C14315d e;
        int i4;
        int i5 = -1;
        if (gVar.m899k() != -1) {
            spannable.setSpan(new StyleSpan(gVar.m899k()), i, i2, 33);
        }
        if (gVar.m892r()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (gVar.m891s()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (gVar.m894p()) {
            C13454c.m3648a(spannable, new ForegroundColorSpan(gVar.m907c()), i, i2, 33);
        }
        if (gVar.m895o()) {
            C13454c.m3648a(spannable, new BackgroundColorSpan(gVar.m908b()), i, i2, 33);
        }
        if (gVar.m906d() != null) {
            C13454c.m3648a(spannable, new TypefaceSpan(gVar.m906d()), i, i2, 33);
        }
        if (gVar.m896n() != null) {
            C14311b bVar = (C14311b) C7510a.m22367e(gVar.m896n());
            int i6 = bVar.f32368a;
            if (i6 == -1) {
                if (i3 == 2 || i3 == 1) {
                    i6 = 3;
                } else {
                    i6 = 1;
                }
                i4 = 1;
            } else {
                i4 = bVar.f32369b;
            }
            int i7 = bVar.f32370c;
            if (i7 == -2) {
                i7 = 1;
            }
            C13454c.m3648a(spannable, new C13455d(i6, i4, i7), i, i2, 33);
        }
        int i8 = gVar.m901i();
        if (i8 == 2) {
            C14315d d = m921d(dVar, map);
            if (!(d == null || (e = m920e(d, map)) == null)) {
                if (e.m934g() != 1 || e.m935f(0).f32389b == null) {
                    C7558r.m22106f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) C7557q0.m22145j(e.m935f(0).f32389b);
                    C14318g gVar2 = d.f32393f;
                    if (gVar2 != null) {
                        i5 = gVar2.m902h();
                    }
                    spannable.setSpan(new C13453b(str, i5), i, i2, 33);
                }
            }
        } else if (i8 == 3 || i8 == 4) {
            spannable.setSpan(new C14310a(), i, i2, 33);
        }
        if (gVar.m897m()) {
            C13454c.m3648a(spannable, new C13452a(), i, i2, 33);
        }
        int f = gVar.m904f();
        if (f == 1) {
            C13454c.m3648a(spannable, new AbsoluteSizeSpan((int) gVar.m905e(), true), i, i2, 33);
        } else if (f == 2) {
            C13454c.m3648a(spannable, new RelativeSizeSpan(gVar.m905e()), i, i2, 33);
        } else if (f == 3) {
            C13454c.m3648a(spannable, new RelativeSizeSpan(gVar.m905e() / 100.0f), i, i2, 33);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m923b(String str) {
        return str.replaceAll("\r\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(" *\n *", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m922c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    /* renamed from: d */
    private static C14315d m921d(C14315d dVar, Map<String, C14318g> map) {
        while (dVar != null) {
            C14318g f = m919f(dVar.f32393f, dVar.m929l(), map);
            if (f != null && f.m901i() == 1) {
                return dVar;
            }
            dVar = dVar.f32397j;
        }
        return null;
    }

    /* renamed from: e */
    private static C14315d m920e(C14315d dVar, Map<String, C14318g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            C14315d dVar2 = (C14315d) arrayDeque.pop();
            C14318g f = m919f(dVar2.f32393f, dVar2.m929l(), map);
            if (f != null && f.m901i() == 3) {
                return dVar2;
            }
            for (int g = dVar2.m934g() - 1; g >= 0; g--) {
                arrayDeque.push(dVar2.m935f(g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C14318g m919f(C14318g gVar, String[] strArr, Map<String, C14318g> map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C14318g gVar2 = new C14318g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.m909a(map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return gVar.m909a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.m909a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }
}
