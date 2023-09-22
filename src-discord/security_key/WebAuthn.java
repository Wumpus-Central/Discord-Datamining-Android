package com.discord.security_key;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Base64;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.google.android.gms.tasks.Task;
import com.reactnativecommunity.webview.RNCWebViewManager;
import gg.j;
import ha.e;
import ha.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;
import m9.b;
import m9.g;
import m9.h;
import m9.i;
import m9.j;
import m9.o;
import m9.p;
import m9.r;
import m9.s;
import m9.t;
import m9.u;
import m9.v;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import qf.p;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0017\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\f\u0010\n\u001a\u00020\u0007*\u00020\bH\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006!"}, d2 = {"Lcom/discord/security_key/WebAuthn;", "", "Lorg/json/JSONArray;", "array", "", "Lm9/q;", "parseCredentialDescriptors", "", "", "toBase64", "decodeBase64", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "challenge", "Landroid/app/Activity;", "currentActivity", "register", "authenticate", "Lkotlin/Function1;", "resolve", "Lkotlin/jvm/functions/Function1;", "getResolve", "()Lkotlin/jvm/functions/Function1;", "reject", "getReject", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "security_key_release"}, k = 1, mv = {1, 8, 0})

public final class WebAuthn {
    private static final int BASE64_FLAG = 11;
    public static final Companion Companion = new Companion(null);
    private static final int REQUEST_CODE_AUTHENTICATE = 4002;
    private static final int REQUEST_CODE_REGISTER = 4001;
    private final Function1<String, Unit> reject;
    private final Function1<String, Unit> resolve;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/security_key/WebAuthn$Companion;", "", "()V", "BASE64_FLAG", "", "REQUEST_CODE_AUTHENTICATE", "REQUEST_CODE_REGISTER", "security_key_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public WebAuthn(Function1<? super String, Unit> resolve, Function1<? super String, Unit> reject) {
        q.h(resolve, "resolve");
        q.h(reject, "reject");
        this.resolve = resolve;
        this.reject = reject;
    }

    
    public static final void authenticate$lambda$4(Function1 tmp0, Object obj) {
        q.h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    
    public static final void authenticate$lambda$5(WebAuthn this$0, Exception it) {
        q.h(this$0, "this$0");
        q.h(it, "it");
        this$0.reject.invoke("task failed");
    }

    private final byte[] decodeBase64(String str) {
        byte[] decode = Base64.decode(str, 11);
        q.g(decode, "decode(this, BASE64_FLAG)");
        return decode;
    }

    private final List<m9.q> parseCredentialDescriptors(JSONArray jSONArray) {
        IntRange q10;
        ArrayList arrayList = new ArrayList();
        q10 = j.q(0, jSONArray.length());
        Iterator<Integer> it = q10.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((p) it).nextInt());
            String uVar = u.PUBLIC_KEY.toString();
            String string = jSONObject.getString("id");
            q.g(string, "obj.getString(\"id\")");
            arrayList.add(new m9.q(uVar, decodeBase64(string), null));
        }
        return arrayList;
    }

    
    public static final void register$lambda$2(Function1 tmp0, Object obj) {
        q.h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    
    public static final void register$lambda$3(WebAuthn this$0, Exception it) {
        q.h(this$0, "this$0");
        q.h(it, "it");
        this$0.reject.invoke("task failed");
    }

    private final String toBase64(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 11);
        q.g(encodeToString, "encodeToString(this, BASE64_FLAG)");
        return encodeToString;
    }

    public final void authenticate(String challenge, Activity activity) {
        q.h(challenge, "challenge");
        s.a aVar = new s.a();
        JSONObject jSONObject = new JSONObject(new JSONTokener(challenge)).getJSONObject("publicKey");
        String string = jSONObject.getString("challenge");
        q.g(string, "obj.getString(\"challenge\")");
        aVar.c(decodeBase64(string));
        JSONArray jSONArray = jSONObject.getJSONArray("allowCredentials");
        q.g(jSONArray, "obj.getJSONArray(\"allowCredentials\")");
        aVar.b(parseCredentialDescriptors(jSONArray));
        aVar.d(jSONObject.getString("rpId"));
        aVar.e(Double.valueOf(jSONObject.getDouble("timeout") / ((double) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)));
        Task<PendingIntent> D = a.a(activity).D(aVar.a());
        final WebAuthn$authenticate$1 webAuthn$authenticate$1 = new WebAuthn$authenticate$1(activity);
        D.f(new f() { 
            @Override 
            public final void b(Object obj) {
                WebAuthn.authenticate$lambda$4(Function1.this, obj);
            }
        });
        D.d(new e() { 
            @Override 
            public final void onFailure(Exception exc) {
                WebAuthn.authenticate$lambda$5(WebAuthn.this, exc);
            }
        });
    }

    public final Function1<String, Unit> getReject() {
        return this.reject;
    }

    public final Function1<String, Unit> getResolve() {
        return this.resolve;
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        byte[] bArr;
        if (i10 != 4001 && i10 != REQUEST_CODE_AUTHENTICATE) {
            return;
        }
        if (i11 != -1) {
            this.reject.invoke("activity failed");
            return;
        }
        if (intent != null) {
            bArr = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
        } else {
            bArr = null;
        }
        if (bArr == null) {
            this.reject.invoke("credential data missing");
            return;
        }
        o r10 = o.r(bArr);
        if (r10.G() instanceof h) {
            Function1<String, Unit> function1 = this.reject;
            i G = r10.G();
            q.f(G, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse");
            String A = ((h) G).A();
            q.e(A);
            function1.invoke(A);
        } else if (i10 == 4001) {
            byte[] A2 = r10.A();
            q.g(A2, "credential.rawId");
            String base64 = toBase64(A2);
            i G2 = r10.G();
            q.f(G2, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse");
            g gVar = (g) G2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", base64);
            jSONObject.put("rawId", base64);
            jSONObject.put("type", u.PUBLIC_KEY.toString());
            JSONObject jSONObject2 = new JSONObject();
            byte[] r11 = gVar.r();
            q.g(r11, "response.clientDataJSON");
            jSONObject2.put("clientDataJSON", toBase64(r11));
            byte[] z10 = gVar.z();
            q.g(z10, "response.attestationObject");
            jSONObject2.put("attestationObject", toBase64(z10));
            jSONObject.put("response", jSONObject2);
            Function1<String, Unit> function12 = this.resolve;
            String jSONObject3 = jSONObject.toString();
            q.g(jSONObject3, "obj.toString()");
            function12.invoke(jSONObject3);
        } else if (i10 == REQUEST_CODE_AUTHENTICATE) {
            byte[] A3 = r10.A();
            q.g(A3, "credential.rawId");
            String base642 = toBase64(A3);
            i G3 = r10.G();
            q.f(G3, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse");
            m9.f fVar = (m9.f) G3;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("id", base642);
            jSONObject4.put("rawId", base642);
            jSONObject4.put("type", u.PUBLIC_KEY.toString());
            JSONObject jSONObject5 = new JSONObject();
            byte[] r12 = fVar.r();
            q.g(r12, "response.clientDataJSON");
            jSONObject5.put("clientDataJSON", toBase64(r12));
            byte[] z11 = fVar.z();
            q.g(z11, "response.authenticatorData");
            jSONObject5.put("authenticatorData", toBase64(z11));
            byte[] G4 = fVar.G();
            q.g(G4, "response.signature");
            jSONObject5.put("signature", toBase64(G4));
            byte[] H = fVar.H();
            if (H != null) {
                jSONObject5.put("userHandle", toBase64(H));
            }
            jSONObject4.put("response", jSONObject5);
            Function1<String, Unit> function13 = this.resolve;
            String jSONObject6 = jSONObject4.toString();
            q.g(jSONObject6, "obj.toString()");
            function13.invoke(jSONObject6);
        }
    }

    public final void register(String challenge, Activity activity) {
        IntRange q10;
        q.h(challenge, "challenge");
        p.a aVar = new p.a();
        JSONObject jSONObject = new JSONObject(new JSONTokener(challenge)).getJSONObject("publicKey");
        String string = jSONObject.getJSONObject("user").getString("id");
        q.g(string, "obj.getJSONObject(\"user\").getString(\"id\")");
        aVar.h(new v(decodeBase64(string), jSONObject.getJSONObject("user").getString(ZeroconfModule.KEY_SERVICE_NAME), null, jSONObject.getJSONObject("user").getString("displayName")));
        String string2 = jSONObject.getString("challenge");
        q.g(string2, "obj.getString(\"challenge\")");
        aVar.c(decodeBase64(string2));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        q10 = j.q(0, jSONArray.length());
        Iterator<Integer> it = q10.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(((qf.p) it).nextInt());
            arrayList.add(new r(jSONObject2.getString("type"), jSONObject2.getInt("alg")));
        }
        aVar.e(arrayList);
        aVar.g(Double.valueOf(jSONObject.getDouble("timeout") / ((double) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)));
        JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
        q.g(jSONArray2, "obj.getJSONArray(\"excludeCredentials\")");
        aVar.d(parseCredentialDescriptors(jSONArray2));
        j.a aVar2 = new j.a();
        JSONObject jSONObject3 = jSONObject.getJSONObject("authenticatorSelection");
        if (jSONObject3.has("authenticatorAttachment")) {
            aVar2.b(b.a(jSONObject3.getString("authenticatorAttachment")));
        }
        aVar.b(aVar2.a());
        aVar.f(new t(jSONObject.getJSONObject("rp").getString("id"), jSONObject.getJSONObject("rp").getString(ZeroconfModule.KEY_SERVICE_NAME), null));
        Task<PendingIntent> C = a.a(activity).C(aVar.a());
        final WebAuthn$register$2 webAuthn$register$2 = new WebAuthn$register$2(activity);
        C.f(new f() { 
            @Override 
            public final void b(Object obj) {
                WebAuthn.register$lambda$2(Function1.this, obj);
            }
        });
        C.d(new e() { 
            @Override 
            public final void onFailure(Exception exc) {
                WebAuthn.register$lambda$3(WebAuthn.this, exc);
            }
        });
    }
}
