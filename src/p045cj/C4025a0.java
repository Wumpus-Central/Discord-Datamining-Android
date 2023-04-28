package p045cj;

import eg.C6884j;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.C11075i;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a \u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a \u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0016\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u001a"}, m15073d2 = {"", "offset", "", "message", "Lcj/w;", "d", "", "input", "e", "", "value", "output", "Lcj/y;", "b", "Lcj/a;", "result", "", "i", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "c", "key", "a", "j", "f", "g", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cj.a0 */
/* loaded from: classes8.dex */
public final class C4025a0 {
    /* renamed from: a */
    public static final C4075w m33037a(Number value, String key, String output) {
        C9971q.m14633g(value, "value");
        C9971q.m14633g(key, "key");
        C9971q.m14633g(output, "output");
        return m33034d(-1, m33028j(value, key, output));
    }

    /* renamed from: b */
    public static final C4078y m33036b(Number value, String output) {
        C9971q.m14633g(value, "value");
        C9971q.m14633g(output, "output");
        return new C4078y("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m33030h(output, 0, 1, null)));
    }

    /* renamed from: c */
    public static final C4078y m33035c(SerialDescriptor keyDescriptor) {
        C9971q.m14633g(keyDescriptor, "keyDescriptor");
        return new C4078y("Value of type '" + keyDescriptor.mo13676i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.mo13678g() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* renamed from: d */
    public static final C4075w m33034d(int i, String message) {
        C9971q.m14633g(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        return new C4075w(message);
    }

    /* renamed from: e */
    public static final C4075w m33033e(int i, String message, CharSequence input) {
        C9971q.m14633g(message, "message");
        C9971q.m14633g(input, "input");
        return m33034d(i, message + "\nJSON input: " + ((Object) m33031g(input, i)));
    }

    /* renamed from: f */
    public static final C4075w m33032f(String key, String input) {
        C9971q.m14633g(key, "key");
        C9971q.m14633g(input, "input");
        return m33034d(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) m33030h(input, 0, 1, null)));
    }

    /* renamed from: g */
    private static final CharSequence m33031g(CharSequence charSequence, int i) {
        String str;
        int c;
        int g;
        int length;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i == -1) {
            if (charSequence.length() - 60 <= 0) {
                return charSequence;
            }
            return str2 + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        if (i2 <= 0) {
            str = "";
        } else {
            str = str2;
        }
        if (i3 >= charSequence.length()) {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        c = C6884j.m23961c(i2, 0);
        g = C6884j.m23957g(i3, charSequence.length());
        sb2.append(charSequence.subSequence(c, g).toString());
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: h */
    static /* synthetic */ CharSequence m33030h(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return m33031g(charSequence, i);
    }

    /* renamed from: i */
    public static final Void m33029i(AbstractC4024a aVar, Number result) {
        C9971q.m14633g(aVar, "<this>");
        C9971q.m14633g(result, "result");
        AbstractC4024a.m33039y(aVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new C11075i();
    }

    /* renamed from: j */
    private static final String m33028j(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m33030h(str2, 0, 1, null));
    }
}
