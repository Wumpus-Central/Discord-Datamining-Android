package io.sentry;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.sentry.C8815c4;
import io.sentry.C8843d;
import io.sentry.C8856e4;
import io.sentry.C8897i3;
import io.sentry.C8908j3;
import io.sentry.C9032r2;
import io.sentry.C9051s4;
import io.sentry.C9137w1;
import io.sentry.C9147x1;
import io.sentry.C9157y3;
import io.sentry.EnumC8866f4;
import io.sentry.EnumC8935m3;
import io.sentry.EnumC8942n3;
import io.sentry.clientreport.C8823b;
import io.sentry.profilemeasurements.C8966a;
import io.sentry.profilemeasurements.C8967b;
import io.sentry.protocol.C8970a;
import io.sentry.protocol.C8971b;
import io.sentry.protocol.C8973c;
import io.sentry.protocol.C8975d;
import io.sentry.protocol.C8977e;
import io.sentry.protocol.C8981f;
import io.sentry.protocol.C8983g;
import io.sentry.protocol.C8985h;
import io.sentry.protocol.C8987i;
import io.sentry.protocol.C8989j;
import io.sentry.protocol.C8991k;
import io.sentry.protocol.C8995m;
import io.sentry.protocol.C8997n;
import io.sentry.protocol.C8999o;
import io.sentry.protocol.C9003q;
import io.sentry.protocol.C9005r;
import io.sentry.protocol.C9007s;
import io.sentry.protocol.C9009t;
import io.sentry.protocol.C9011u;
import io.sentry.protocol.C9013v;
import io.sentry.protocol.C9015w;
import io.sentry.protocol.C9020z;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C9111k;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.c1 */
/* loaded from: classes8.dex */
public final class C8812c1 implements AbstractC8924l0 {

    /* renamed from: c */
    private static final Charset f19482c = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C8951o3 f19483a;

    /* renamed from: b */
    private final Map<Class<?>, AbstractC9030r0<?>> f19484b;

    public C8812c1(C8951o3 o3Var) {
        this.f19483a = o3Var;
        HashMap hashMap = new HashMap();
        this.f19484b = hashMap;
        hashMap.put(C8970a.class, new C8970a.C0278a());
        hashMap.put(C8843d.class, new C8843d.C8844a());
        hashMap.put(C8971b.class, new C8971b.C8972a());
        hashMap.put(C8973c.class, new C8973c.C8974a());
        hashMap.put(DebugImage.class, new DebugImage.C8969a());
        hashMap.put(C8975d.class, new C8975d.C8976a());
        hashMap.put(C8977e.class, new C8977e.C8978a());
        hashMap.put(C8977e.EnumC8979b.class, new C8977e.EnumC8979b.C8980a());
        hashMap.put(C8981f.class, new C8981f.C8982a());
        hashMap.put(C8983g.class, new C8983g.C8984a());
        hashMap.put(C8985h.class, new C8985h.C8986a());
        hashMap.put(C8987i.class, new C8987i.C8988a());
        hashMap.put(C8989j.class, new C8989j.C8990a());
        hashMap.put(C9137w1.class, new C9137w1.C9139b());
        hashMap.put(C9147x1.class, new C9147x1.C9148a());
        hashMap.put(C8966a.class, new C8966a.C0277a());
        hashMap.put(C8967b.class, new C8967b.C8968a());
        hashMap.put(C8991k.class, new C8991k.C8992a());
        hashMap.put(C8995m.class, new C8995m.C8996a());
        hashMap.put(C8997n.class, new C8997n.C8998a());
        hashMap.put(C9032r2.class, new C9032r2.C9033a());
        hashMap.put(C8897i3.class, new C8897i3.C8898a());
        hashMap.put(C8908j3.class, new C8908j3.C8909a());
        hashMap.put(C8999o.class, new C8999o.C9000a());
        hashMap.put(EnumC8935m3.class, new EnumC8935m3.C8936a());
        hashMap.put(EnumC8942n3.class, new EnumC8942n3.C8943a());
        hashMap.put(C9003q.class, new C9003q.C9004a());
        hashMap.put(C9005r.class, new C9005r.C9006a());
        hashMap.put(C9007s.class, new C9007s.C9008a());
        hashMap.put(C9009t.class, new C9009t.C9010a());
        hashMap.put(C9011u.class, new C9011u.C9012a());
        hashMap.put(C9013v.class, new C9013v.C9014a());
        hashMap.put(C9015w.class, new C9015w.C9016a());
        hashMap.put(C9157y3.class, new C9157y3.C9158a());
        hashMap.put(C8815c4.class, new C8815c4.C8816a());
        hashMap.put(C8856e4.class, new C8856e4.C8857a());
        hashMap.put(EnumC8866f4.class, new EnumC8866f4.C8867a());
        hashMap.put(C9020z.class, new C9020z.C9021a());
        hashMap.put(C9051s4.class, new C9051s4.C9052a());
        hashMap.put(C8823b.class, new C8823b.C8824a());
    }

    /* renamed from: f */
    private String m17997f(Object obj, boolean z) {
        StringWriter stringWriter = new StringWriter();
        C9161z0 z0Var = new C9161z0(stringWriter, this.f19483a.getMaxDepth());
        if (z) {
            z0Var.m16924R("\t");
        }
        z0Var.m16754F0(this.f19483a.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.AbstractC8924l0
    /* renamed from: a */
    public <T> void mo17607a(T t, Writer writer) {
        C9111k.m16995a(t, "The entity is required.");
        C9111k.m16995a(writer, "The Writer object is required.");
        AbstractC8869g0 logger = this.f19483a.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        if (logger.mo17721d(n3Var)) {
            this.f19483a.getLogger().mo17722c(n3Var, "Serializing object: %s", m17997f(t, true));
        }
        new C9161z0(writer, this.f19483a.getMaxDepth()).m16754F0(this.f19483a.getLogger(), t);
        writer.flush();
    }

    @Override // io.sentry.AbstractC8924l0
    /* renamed from: b */
    public void mo17606b(C9025q2 q2Var, OutputStream outputStream) {
        C9111k.m16995a(q2Var, "The SentryEnvelope object is required.");
        C9111k.m16995a(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f19482c));
        try {
            q2Var.m17206c().serialize(new C9161z0(bufferedWriter, this.f19483a.getMaxDepth()), this.f19483a.getLogger());
            bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            for (C8879h3 h3Var : q2Var.m17205d()) {
                try {
                    byte[] v = h3Var.m17777v();
                    h3Var.m17776w().serialize(new C9161z0(bufferedWriter, this.f19483a.getMaxDepth()), this.f19483a.getLogger());
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    bufferedWriter.flush();
                    outputStream.write(v);
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                } catch (Exception e) {
                    this.f19483a.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.AbstractC8924l0
    /* renamed from: c */
    public <T> T mo17605c(Reader reader, Class<T> cls) {
        try {
            C9146x0 x0Var = new C9146x0(reader);
            AbstractC9030r0<?> r0Var = this.f19484b.get(cls);
            if (r0Var != null) {
                return cls.cast(r0Var.mo16758a(x0Var, this.f19483a.getLogger()));
            }
            return null;
        } catch (Exception e) {
            this.f19483a.getLogger().mo17723b(EnumC8942n3.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.AbstractC8924l0
    /* renamed from: d */
    public C9025q2 mo17604d(InputStream inputStream) {
        C9111k.m16995a(inputStream, "The InputStream object is required.");
        try {
            return this.f19483a.getEnvelopeReader().mo17597a(inputStream);
        } catch (IOException e) {
            this.f19483a.getLogger().mo17723b(EnumC8942n3.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.AbstractC8924l0
    /* renamed from: e */
    public String mo17603e(Map<String, Object> map) {
        return m17997f(map, false);
    }
}
