package p061d8;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p030bc.C3452d;
import p119g9.C7557q0;
import p459z7.AbstractC14585h;
import p459z7.C14576a;
import p459z7.C14582e;

/* renamed from: d8.a */
/* loaded from: classes7.dex */
public final class C6401a extends AbstractC14585h {

    /* renamed from: c */
    private static final Pattern f13379c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    private final CharsetDecoder f13380a = C3452d.f5595c.newDecoder();

    /* renamed from: b */
    private final CharsetDecoder f13381b = C3452d.f5594b.newDecoder();

    /* JADX WARN: Finally extract failed */
    /* renamed from: c */
    private String m25616c(ByteBuffer byteBuffer) {
        try {
            return this.f13380a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f13381b.decode(byteBuffer).toString();
                this.f13381b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f13381b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f13381b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f13380a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // p459z7.AbstractC14585h
    /* renamed from: b */
    protected C14576a mo161b(C14582e eVar, ByteBuffer byteBuffer) {
        String c = m25616c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c == null) {
            return new C14576a(new C6404c(bArr, null, null));
        }
        Matcher matcher = f13379c.matcher(c);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String U0 = C7557q0.m22174U0(matcher.group(1));
            String group = matcher.group(2);
            if (U0 != null) {
                if (U0.equals("streamurl")) {
                    str2 = group;
                } else if (U0.equals("streamtitle")) {
                    str = group;
                }
            }
        }
        return new C14576a(new C6404c(bArr, str, str2));
    }
}
