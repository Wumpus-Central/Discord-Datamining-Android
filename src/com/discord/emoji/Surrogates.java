package com.discord.emoji;

import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0005J\r\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m15073d2 = {"Lcom/discord/emoji/Surrogates;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toAssetUrl", "toAssetUrl-impl", "toCodePoints", "toCodePoints-impl", "toString", "toString-impl", "withoutDiversity", "withoutDiversity-impl", "emoji_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class Surrogates {
    private final String value;

    private /* synthetic */ Surrogates(String str) {
        this.value = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Surrogates m41985boximpl(String str) {
        return new Surrogates(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m41986constructorimpl(String value) {
        C9971q.m14633g(value, "value");
        return value;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m41987equalsimpl(String str, Object obj) {
        return (obj instanceof Surrogates) && C9971q.m14638b(str, ((Surrogates) obj).m41994unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m41988equalsimpl0(String str, String str2) {
        return C9971q.m14638b(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m41989hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toAssetUrl-impl  reason: not valid java name */
    public static final String m41990toAssetUrlimpl(String str) {
        String str2 = m41991toCodePointsimpl(str);
        return "asset:///emoji-" + str2 + ".png";
    }

    /* renamed from: toCodePoints-impl  reason: not valid java name */
    private static final String m41991toCodePointsimpl(String str) {
        boolean z;
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (sb2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb2.append("-");
            }
            sb2.append(Integer.toHexString(codePointAt));
            i += Character.charCount(codePointAt);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m41992toStringimpl(String str) {
        return "Surrogates(value=" + str + ")";
    }

    /* renamed from: withoutDiversity-impl  reason: not valid java name */
    public static final String m41993withoutDiversityimpl(String str) {
        String a0;
        char[] chars = Character.toChars(str.codePointAt(0));
        C9971q.m14634f(chars, "toChars(value.codePointAt(0))");
        a0 = C9899f.m14936a0(chars, "", null, null, 0, null, null, 62, null);
        return a0;
    }

    public boolean equals(Object obj) {
        return m41987equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m41989hashCodeimpl(this.value);
    }

    public String toString() {
        return m41992toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m41994unboximpl() {
        return this.value;
    }
}
