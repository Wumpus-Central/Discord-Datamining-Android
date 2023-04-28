package net.time4j.p248tz;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: net.time4j.tz.SPX */
/* loaded from: classes8.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = -1000776907354520172L;

    /* renamed from: k */
    private transient Object f24430k;

    /* renamed from: l */
    private transient int f24431l;

    public SPX() {
    }

    /* renamed from: a */
    private Object m11342a(ObjectInput objectInput, byte b) {
        return new C10991a((AbstractC11001k) objectInput.readObject(), (AbstractC11002l) objectInput.readObject());
    }

    /* renamed from: b */
    private Object m11341b(ObjectInput objectInput, byte b) {
        int i;
        int readInt = objectInput.readInt();
        if ((b & 15) == 1) {
            i = objectInput.readInt();
        } else {
            i = 0;
        }
        return C11028p.m11180q(readInt, i);
    }

    /* renamed from: c */
    private Object m11340c(byte b) {
        int i = b & 15;
        return C11025n.m11201d(EnumC10992b.values()[i / 2], EnumC10997g.values()[i % 2]);
    }

    /* renamed from: d */
    private Object m11339d(ObjectInput objectInput, byte b) {
        AbstractC11001k kVar = (AbstractC11001k) objectInput.readObject();
        AbstractC11008m mVar = (AbstractC11008m) objectInput.readObject();
        AbstractC11027o oVar = AbstractC11002l.f24453n;
        if ((b & 15) == 1) {
            oVar = (AbstractC11027o) objectInput.readObject();
        }
        return new C10993c(kVar, mVar, oVar);
    }

    /* renamed from: e */
    private void m11338e(ObjectOutput objectOutput) {
        C10991a aVar = (C10991a) this.f24430k;
        objectOutput.writeByte(192);
        objectOutput.writeObject(aVar.mo11286z());
        objectOutput.writeObject(aVar.m11334R());
    }

    /* renamed from: f */
    private void m11337f(ObjectOutput objectOutput) {
        boolean z;
        int i;
        C11028p pVar = (C11028p) this.f24430k;
        if (pVar.m11188i() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 241;
        } else {
            i = 240;
        }
        objectOutput.writeByte(i);
        objectOutput.writeInt(pVar.m11187j());
        if (z) {
            objectOutput.writeInt(pVar.m11188i());
        }
    }

    /* renamed from: g */
    private void m11336g(ObjectOutput objectOutput) {
        objectOutput.writeByte(((C11025n) this.f24430k).m11202c() | 208);
    }

    /* renamed from: h */
    private void m11335h(ObjectOutput objectOutput) {
        boolean z;
        int i;
        C10993c cVar = (C10993c) this.f24430k;
        if (cVar.mo11319E() != AbstractC11002l.f24453n) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 225;
        } else {
            i = 224;
        }
        objectOutput.writeByte(i);
        objectOutput.writeObject(cVar.mo11286z());
        objectOutput.writeObject(cVar.mo11287y());
        if (z) {
            objectOutput.writeObject(cVar.mo11319E());
        }
    }

    private Object readResolve() {
        return this.f24430k;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        switch ((readByte & 255) >> 4) {
            case 12:
                this.f24430k = m11342a(objectInput, readByte);
                return;
            case 13:
                this.f24430k = m11340c(readByte);
                return;
            case 14:
                this.f24430k = m11339d(objectInput, readByte);
                return;
            case 15:
                this.f24430k = m11341b(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        switch (this.f24431l) {
            case 12:
                m11338e(objectOutput);
                return;
            case 13:
                m11336g(objectOutput);
                return;
            case 14:
                m11335h(objectOutput);
                return;
            case 15:
                m11337f(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i) {
        this.f24430k = obj;
        this.f24431l = i;
    }
}
