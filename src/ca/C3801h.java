package ca;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import pa.AbstractC11599k;
import pa.C11606r;

/* renamed from: ca.h */
/* loaded from: classes5.dex */
public class C3801h {

    /* renamed from: a */
    private static final Pattern f6295a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f6296b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f6297c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    public static Map<String, String> m33570a(URI uri, String str) {
        String str2;
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap<>();
            C11606r c = C11606r.m9278c(AbstractC11599k.m9287b('='));
            for (String str3 : C11606r.m9278c(AbstractC11599k.m9287b('&')).m9279b().m9277d(rawQuery)) {
                List<String> f = c.m9275f(str3);
                if (f.isEmpty() || f.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                String b = m33569b(f.get(0), str);
                if (f.size() == 2) {
                    str2 = m33569b(f.get(1), str);
                } else {
                    str2 = null;
                }
                emptyMap.put(b, str2);
            }
        }
        return emptyMap;
    }

    /* renamed from: b */
    private static String m33569b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
