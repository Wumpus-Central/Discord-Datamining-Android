package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import p359u3.C13182a;
import p380v5.C13434e;
import p394w3.C13740j;
import p455z3.AbstractC14537h;

/* renamed from: com.facebook.imagepipeline.producers.l */
/* loaded from: classes7.dex */
public class C5000l extends AbstractC4960c0 {
    public C5000l(AbstractC14537h hVar) {
        super(C13182a.m4396a(), hVar);
    }

    /* renamed from: g */
    static byte[] m31032g(String str) {
        C13740j.m2839b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (m31031h(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        C13740j.m2834g(decode);
        return decode.getBytes();
    }

    /* renamed from: h */
    static boolean m31031h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] split = str.split(";");
        return split[split.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: d */
    protected C13434e mo30910d(ImageRequest imageRequest) {
        byte[] g = m31032g(imageRequest.getSourceUri().toString());
        return m31174c(new ByteArrayInputStream(g), g.length);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: f */
    protected String mo30909f() {
        return "DataFetchProducer";
    }
}
