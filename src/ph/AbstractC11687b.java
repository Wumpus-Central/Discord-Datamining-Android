package ph;

import java.io.IOException;
import java.io.InputStream;
import ph.AbstractC11686a;
import ph.AbstractC11724q;

/* renamed from: ph.b */
/* loaded from: classes8.dex */
public abstract class AbstractC11687b<MessageType extends AbstractC11724q> implements AbstractC11727s<MessageType> {

    /* renamed from: a */
    private static final C11697g f26102a = C11697g.m8880c();

    /* renamed from: e */
    private MessageType m9030e(MessageType messagetype) {
        if (messagetype == null || messagetype.mo8775j()) {
            return messagetype;
        }
        throw m9029f(messagetype).m8716a().m8802i(messagetype);
    }

    /* renamed from: f */
    private C11742w m9029f(MessageType messagetype) {
        if (messagetype instanceof AbstractC11686a) {
            return ((AbstractC11686a) messagetype).m9034b();
        }
        return new C11742w(messagetype);
    }

    /* renamed from: g */
    public MessageType mo8774a(InputStream inputStream, C11697g gVar) {
        return m9030e(m9025j(inputStream, gVar));
    }

    /* renamed from: h */
    public MessageType mo8772c(InputStream inputStream, C11697g gVar) {
        return m9030e(m9024k(inputStream, gVar));
    }

    /* renamed from: i */
    public MessageType mo8773b(AbstractC11691d dVar, C11697g gVar) {
        return m9030e(m9023l(dVar, gVar));
    }

    /* renamed from: j */
    public MessageType m9025j(InputStream inputStream, C11697g gVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return m9024k(new AbstractC11686a.AbstractC0372a.C0373a(inputStream, C11694e.m9005B(read, inputStream)), gVar);
        } catch (IOException e) {
            throw new C11713k(e.getMessage());
        }
    }

    /* renamed from: k */
    public MessageType m9024k(InputStream inputStream, C11697g gVar) {
        C11694e g = C11694e.m8980g(inputStream);
        MessageType messagetype = (MessageType) ((AbstractC11724q) mo8771d(g, gVar));
        try {
            g.m8986a(0);
            return messagetype;
        } catch (C11713k e) {
            throw e.m8802i(messagetype);
        }
    }

    /* renamed from: l */
    public MessageType m9023l(AbstractC11691d dVar, C11697g gVar) {
        try {
            C11694e v = dVar.mo8757v();
            MessageType messagetype = (MessageType) ((AbstractC11724q) mo8771d(v, gVar));
            try {
                v.m8986a(0);
                return messagetype;
            } catch (C11713k e) {
                throw e.m8802i(messagetype);
            }
        } catch (C11713k e2) {
            throw e2;
        }
    }
}
