package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.TopicOperation;
import java.util.regex.Pattern;
import p420x9.C13996n;

/* renamed from: com.google.firebase.messaging.v0 */
/* loaded from: classes3.dex */
final class C5865v0 {

    /* renamed from: d */
    private static final Pattern f11638d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f11639a;

    /* renamed from: b */
    private final String f11640b;

    /* renamed from: c */
    private final String f11641c;

    private C5865v0(@TopicOperation.TopicOperations String str, String str2) {
        this.f11639a = m27055d(str2, str);
        this.f11640b = str;
        this.f11641c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5865v0 m27058a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C5865v0(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m27055d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f11638d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    /* renamed from: b */
    public String m27057b() {
        return this.f11640b;
    }

    /* renamed from: c */
    public String m27056c() {
        return this.f11639a;
    }

    /* renamed from: e */
    public String m27054e() {
        return this.f11641c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5865v0)) {
            return false;
        }
        C5865v0 v0Var = (C5865v0) obj;
        if (!this.f11639a.equals(v0Var.f11639a) || !this.f11640b.equals(v0Var.f11640b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f11640b, this.f11639a);
    }
}
