package p193k7;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p119g9.C7557q0;
import p119g9.C7558r;

/* renamed from: k7.a */
/* loaded from: classes7.dex */
final class C9758a {
    /* renamed from: a */
    public static byte[] m15416a(byte[] bArr) {
        if (C7557q0.f16368a >= 27) {
            return bArr;
        }
        return C7557q0.m22140l0(m15414c(C7557q0.m22207E(bArr)));
    }

    /* renamed from: b */
    public static byte[] m15415b(byte[] bArr) {
        if (C7557q0.f16368a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C7557q0.m22207E(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb2.append("{\"k\":\"");
                sb2.append(m15413d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(m15413d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return C7557q0.m22140l0(sb2.toString());
        } catch (JSONException e) {
            C7558r.m22108d("ClearKeyUtil", "Failed to adjust response data: " + C7557q0.m22207E(bArr), e);
            return bArr;
        }
    }

    /* renamed from: c */
    private static String m15414c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    private static String m15413d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
