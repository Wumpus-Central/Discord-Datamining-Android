package com.google.api.client.googleapis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class GoogleUtils {

    /* renamed from: a */
    public static final String f11457a;

    /* renamed from: b */
    public static final Integer f11458b;

    /* renamed from: c */
    public static final Integer f11459c;

    /* renamed from: d */
    public static final Integer f11460d;

    /* renamed from: e */
    static final Pattern f11461e;

    static {
        String a = m27344a();
        f11457a = a;
        Pattern compile = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)(-SNAPSHOT)?");
        f11461e = compile;
        Matcher matcher = compile.matcher(a);
        matcher.find();
        f11458b = Integer.valueOf(Integer.parseInt(matcher.group(1)));
        f11459c = Integer.valueOf(Integer.parseInt(matcher.group(2)));
        f11460d = Integer.valueOf(Integer.parseInt(matcher.group(3)));
    }

    private GoogleUtils() {
    }

    /* renamed from: a */
    private static String m27344a() {
        String str = null;
        try {
            InputStream resourceAsStream = GoogleUtils.class.getResourceAsStream("google-api-client.properties");
            if (resourceAsStream != null) {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                str = properties.getProperty("google-api-client.version");
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        if (str == null) {
            return "unknown-version";
        }
        return str;
    }
}
