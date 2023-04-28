package p419x8;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p119g9.C7510a;
import p119g9.C7558r;
import p119g9.C7560s;
import p119g9.C7570y;
import p317r8.AbstractC12456d;
import p317r8.AbstractC12458f;
import p317r8.C12453b;

/* renamed from: x8.a */
/* loaded from: classes7.dex */
public final class C13949a extends AbstractC12456d {

    /* renamed from: q */
    private static final Pattern f31447q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    private static final Pattern f31448r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    private final StringBuilder f31449o = new StringBuilder();

    /* renamed from: p */
    private final ArrayList<String> f31450p = new ArrayList<>();

    public C13949a() {
        super("SubripDecoder");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: B */
    private C12453b m2205B(Spanned spanned, String str) {
        char c;
        char c2;
        C12453b.C0400b n = new C12453b.C0400b().m6682n(spanned);
        if (str == null) {
            return n.m6695a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            n.m6685k(0);
        } else if (c == 3 || c == 4 || c == 5) {
            n.m6685k(2);
        } else {
            n.m6685k(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            n.m6687i(2);
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            n.m6687i(0);
        } else {
            n.m6687i(1);
        }
        return n.m6686j(m2204C(n.m6692d())).m6688h(m2204C(n.m6693c()), 0).m6695a();
    }

    /* renamed from: C */
    static float m2204C(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: D */
    private static long m2203D(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        long parseLong = j + (Long.parseLong((String) C7510a.m22367e(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) C7510a.m22367e(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* renamed from: E */
    private String m2202E(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f31448r.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i += length;
        }
        return sb2.toString();
    }

    @Override // p317r8.AbstractC12456d
    /* renamed from: z */
    protected AbstractC12458f mo154z(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        C7560s sVar = new C7560s();
        C7570y yVar = new C7570y(bArr, i);
        while (true) {
            String p = yVar.m22000p();
            int i2 = 0;
            if (p == null) {
                break;
            } else if (p.length() != 0) {
                try {
                    Integer.parseInt(p);
                    String p2 = yVar.m22000p();
                    if (p2 == null) {
                        C7558r.m22104h("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f31447q.matcher(p2);
                    if (matcher.matches()) {
                        sVar.m22094a(m2203D(matcher, 1));
                        sVar.m22094a(m2203D(matcher, 6));
                        this.f31449o.setLength(0);
                        this.f31450p.clear();
                        for (String p3 = yVar.m22000p(); !TextUtils.isEmpty(p3); p3 = yVar.m22000p()) {
                            if (this.f31449o.length() > 0) {
                                this.f31449o.append("<br>");
                            }
                            this.f31449o.append(m2202E(p3, this.f31450p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f31449o.toString());
                        while (true) {
                            if (i2 >= this.f31450p.size()) {
                                str = null;
                                break;
                            }
                            str = this.f31450p.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(m2205B(fromHtml, str));
                        arrayList.add(C12453b.f28078q);
                    } else {
                        C7558r.m22104h("SubripDecoder", "Skipping invalid timing: " + p2);
                    }
                } catch (NumberFormatException unused) {
                    C7558r.m22104h("SubripDecoder", "Skipping invalid index: " + p);
                }
            }
        }
        return new C13950b((C12453b[]) arrayList.toArray(new C12453b[0]), sVar.m22091d());
    }
}
