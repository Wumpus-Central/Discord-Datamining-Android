package p161ij;

import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;

/* renamed from: ij.s */
/* loaded from: classes8.dex */
public final class C8668s {

    /* renamed from: a */
    private final List<String> f19153a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8668s(String[] strArr) {
        this.f19153a = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    /* renamed from: a */
    private boolean m18414a(char c, char c2) {
        if (c >= 'a' && c <= 'z') {
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char) ((c2 + 'a') - 65);
            }
            if (c == c2) {
                return true;
            }
            return false;
        } else if (c >= 'A' && c <= 'Z') {
            char c3 = (char) ((c + 'a') - 65);
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char) ((c2 + 'a') - 65);
            }
            if (c3 == c2) {
                return true;
            }
            return false;
        } else if (Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private <V extends Enum<V>> V m18410e(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        V v;
        String str;
        boolean z4;
        V[] enumConstants = cls.getEnumConstants();
        int size = this.f19153a.size();
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        String str2 = "";
        String str3 = str2;
        int i3 = 0;
        V v2 = null;
        int i4 = 0;
        while (i3 < enumConstants.length) {
            boolean isEmpty = str3.isEmpty();
            if (isEmpty) {
                if (i3 >= size) {
                    str3 = enumConstants[i3].name();
                } else {
                    str3 = this.f19153a.get(i3);
                }
            }
            int length2 = str3.length();
            int i5 = index;
            int i6 = 0;
            boolean z5 = true;
            while (z5 && i6 < length2) {
                int i7 = index + i6;
                if (i7 >= length) {
                    str = str2;
                    v = v2;
                    z5 = false;
                } else {
                    char charAt = charSequence.charAt(i7);
                    str = str2;
                    char charAt2 = str3.charAt(i6);
                    if (z3) {
                        v = v2;
                        if (charAt == 160) {
                            charAt = ' ';
                        }
                        if (charAt2 == 160) {
                            charAt2 = ' ';
                        }
                    } else {
                        v = v2;
                    }
                    if (!z ? charAt != charAt2 : charAt != charAt2 && !m18414a(charAt, charAt2)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        i5++;
                    }
                    z5 = z4;
                }
                i6++;
                size = size;
                str2 = str;
                v2 = v;
            }
            if (z3 && isEmpty && length2 == 5 && str3.charAt(4) == '.' && i5 == (i2 = index + 3) && i2 < length && charSequence.charAt(i2) == '.') {
                i3--;
                str3 = ((Object) str3.subSequence(index, i2)) + ".";
            } else {
                if (z2 || length2 == 1) {
                    int i8 = i5 - index;
                    if (i4 < i8) {
                        v2 = enumConstants[i3];
                        i4 = i8;
                        str3 = str2;
                        i = 1;
                        i3 += i;
                        size = size;
                        str2 = str2;
                    } else if (i4 == i8) {
                        str3 = str2;
                        i = 1;
                        v2 = null;
                        i3 += i;
                        size = size;
                        str2 = str2;
                    }
                } else if (z5) {
                    parsePosition.setIndex(i5);
                    return enumConstants[i3];
                }
                str3 = str2;
            }
            v2 = v2;
            i = 1;
            i3 += i;
            size = size;
            str2 = str2;
        }
        if (v2 == null) {
            parsePosition.setErrorIndex(index);
        } else {
            parsePosition.setIndex(index + i4);
        }
        return v2;
    }

    /* renamed from: b */
    public List<String> m18413b() {
        return this.f19153a;
    }

    /* renamed from: c */
    public <V extends Enum<V>> V m18412c(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, AbstractC8048d dVar) {
        AbstractC8046c<Boolean> cVar = C8627a.f19060i;
        Boolean bool = Boolean.TRUE;
        return (V) m18410e(charSequence, parsePosition, cls, ((Boolean) dVar.mo15674c(cVar, bool)).booleanValue(), ((Boolean) dVar.mo15674c(C8627a.f19061j, Boolean.FALSE)).booleanValue(), ((Boolean) dVar.mo15674c(C8627a.f19062k, bool)).booleanValue());
    }

    /* renamed from: d */
    public <V extends Enum<V>> V m18411d(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, EnumC8637g gVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (gVar == EnumC8637g.STRICT) {
            z3 = false;
        } else if (gVar == EnumC8637g.LAX) {
            z3 = true;
        } else {
            z2 = false;
            z3 = true;
            z = true;
            return (V) m18410e(charSequence, parsePosition, cls, z3, z2, z);
        }
        z2 = z3;
        z = z2;
        return (V) m18410e(charSequence, parsePosition, cls, z3, z2, z);
    }

    /* renamed from: f */
    public String m18409f(Enum<?> r3) {
        int ordinal = r3.ordinal();
        if (this.f19153a.size() <= ordinal) {
            return r3.name();
        }
        return this.f19153a.get(ordinal);
    }

    public String toString() {
        int size = this.f19153a.size();
        StringBuilder sb2 = new StringBuilder((size * 16) + 2);
        sb2.append('{');
        boolean z = true;
        for (int i = 0; i < size; i++) {
            if (z) {
                z = false;
            } else {
                sb2.append(',');
            }
            sb2.append(this.f19153a.get(i));
        }
        sb2.append('}');
        return sb2.toString();
    }
}
