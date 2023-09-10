package com.discord.emoji;

import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0005J\r\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/discord/emoji/Surrogates;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toAssetUrl", "toAssetUrl-impl", "toCodePoints", "toCodePoints-impl", "toString", "toString-impl", "withoutDiversity", "withoutDiversity-impl", "emoji_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class Surrogates {
    private final String value;

    private  Surrogates(String str) {
        this.value = str;
    }

    
    public static final  Surrogates m480boximpl(String str) {
        return new Surrogates(str);
    }

    
    public static String m481constructorimpl(String value) {
        q.h(value, "value");
        return value;
    }

    
    public static boolean m482equalsimpl(String str, Object obj) {
        return (obj instanceof Surrogates) && q.c(str, ((Surrogates) obj).m489unboximpl());
    }

    
    public static final boolean m483equalsimpl0(String str, String str2) {
        return q.c(str, str2);
    }

    
    public static int m484hashCodeimpl(String str) {
        return str.hashCode();
    }

    
    public static final String m485toAssetUrlimpl(String str) {
        String str2 = m486toCodePointsimpl(str);
        return "asset:
    }

    
    private static final String m486toCodePointsimpl(String str) {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < str.length()) {
            int codePointAt = str.codePointAt(i10);
            if (sb2.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append("-");
            }
            sb2.append(Integer.toHexString(codePointAt));
            i10 += Character.charCount(codePointAt);
        }
        String sb3 = sb2.toString();
        q.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    
    public static String m487toStringimpl(String str) {
        return "Surrogates(value=" + str + ")";
    }

    
    public static final String m488withoutDiversityimpl(String str) {
        String a02;
        char[] chars = Character.toChars(str.codePointAt(0));
        q.g(chars, "toChars(value.codePointAt(0))");
        a02 = f.a0(chars, "", null, null, 0, null, null, 62, null);
        return a02;
    }

    public boolean equals(Object obj) {
        return m482equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m484hashCodeimpl(this.value);
    }

    public String toString() {
        return m487toStringimpl(this.value);
    }

    
    public final  String m489unboximpl() {
        return this.value;
    }
}
