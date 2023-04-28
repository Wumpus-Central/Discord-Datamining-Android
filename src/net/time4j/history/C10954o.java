package net.time4j.history;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: net.time4j.history.o */
/* loaded from: classes8.dex */
public final class C10954o {

    /* renamed from: d */
    static final C10954o f24311d = new C10954o(EnumC10944n.f24301k, ViewDefaults.NUMBER_OF_LINES);

    /* renamed from: e */
    private static final Comparator<C10954o> f24312e = new C10956b();

    /* renamed from: a */
    private final List<C10954o> f24313a;

    /* renamed from: b */
    private final EnumC10944n f24314b;

    /* renamed from: c */
    private final int f24315c;

    /* renamed from: net.time4j.history.o$b */
    /* loaded from: classes8.dex */
    private static class C10956b implements Comparator<C10954o> {
        private C10956b() {
        }

        /* renamed from: b */
        public int compare(C10954o oVar, C10954o oVar2) {
            if (oVar.f24315c < oVar2.f24315c) {
                return -1;
            }
            if (oVar.f24315c > oVar2.f24315c) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10954o(EnumC10944n nVar, int i) {
        this.f24313a = Collections.emptyList();
        this.f24314b = nVar;
        this.f24315c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C10954o m11479e(DataInput dataInput) {
        int readInt = dataInput.readInt();
        if (readInt == 0) {
            EnumC10944n valueOf = EnumC10944n.valueOf(dataInput.readUTF());
            int readInt2 = dataInput.readInt();
            if (readInt2 == Integer.MAX_VALUE && valueOf == EnumC10944n.f24301k) {
                return f24311d;
            }
            return new C10954o(valueOf, readInt2);
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C10954o(EnumC10944n.valueOf(dataInput.readUTF()), dataInput.readInt()));
        }
        return new C10954o(arrayList);
    }

    /* renamed from: b */
    public C10954o m11482b(C10954o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f24313a);
        if (arrayList.isEmpty()) {
            arrayList.add(this);
        }
        if (oVar.f24313a.isEmpty()) {
            arrayList.add(oVar);
        } else {
            arrayList.addAll(oVar.f24313a);
        }
        return new C10954o(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m11481c(C10934h hVar) {
        int a = hVar.m11544c().m11528a(hVar.m11542e());
        int size = this.f24313a.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            C10954o oVar = this.f24313a.get(i2);
            if (a >= i && a < oVar.f24315c) {
                return oVar.f24314b.mo11486a(this, hVar);
            }
            i = oVar.f24315c;
        }
        return this.f24314b.mo11486a(this, hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C10934h m11480d(EnumC10937j jVar, int i) {
        return m11478f(jVar, i).mo11484b(jVar, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10954o)) {
            return false;
        }
        C10954o oVar = (C10954o) obj;
        if (this.f24313a.equals(oVar.f24313a) && this.f24314b == oVar.f24314b && this.f24315c == oVar.f24315c) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public EnumC10944n m11478f(EnumC10937j jVar, int i) {
        int a = jVar.m11528a(i);
        int size = this.f24313a.size();
        int i2 = Integer.MIN_VALUE;
        EnumC10944n nVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C10954o oVar = this.f24313a.get(i3);
            if (a >= i2 && a < oVar.f24315c) {
                return oVar.f24314b;
            }
            i2 = oVar.f24315c;
            nVar = oVar.f24314b;
        }
        if (a == i2 && jVar == EnumC10937j.BYZANTINE && nVar == EnumC10944n.f24303m) {
            return nVar;
        }
        return this.f24314b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m11477g(DataOutput dataOutput) {
        int size = this.f24313a.size();
        dataOutput.writeInt(size);
        if (size == 0) {
            dataOutput.writeUTF(this.f24314b.name());
            dataOutput.writeInt(this.f24315c);
            return;
        }
        for (int i = 0; i < size; i++) {
            C10954o oVar = this.f24313a.get(i);
            dataOutput.writeUTF(oVar.f24314b.name());
            dataOutput.writeInt(oVar.f24315c);
        }
    }

    public int hashCode() {
        return (this.f24313a.hashCode() * 17) + (this.f24314b.hashCode() * 37) + this.f24315c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f24313a.isEmpty()) {
            sb2.append('[');
            sb2.append(this.f24314b);
            if (this.f24315c != Integer.MAX_VALUE) {
                sb2.append("->");
                sb2.append(this.f24315c);
            }
        } else {
            boolean z = true;
            for (C10954o oVar : this.f24313a) {
                if (z) {
                    sb2.append('[');
                    z = false;
                } else {
                    sb2.append(',');
                }
                sb2.append(oVar.f24314b);
                sb2.append("->");
                sb2.append(oVar.f24315c);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    C10954o(List<C10954o> list) {
        Collections.sort(list, f24312e);
        Iterator<C10954o> it = list.iterator();
        C10954o oVar = null;
        while (it.hasNext()) {
            C10954o next = it.next();
            if (oVar == null || next.f24315c != oVar.f24315c) {
                oVar = next;
            } else if (next.f24314b == oVar.f24314b) {
                it.remove();
            } else {
                throw new IllegalArgumentException("Multiple strategies with overlapping validity range: " + list);
            }
        }
        this.f24313a = Collections.unmodifiableList(list);
        this.f24314b = EnumC10944n.f24301k;
        this.f24315c = ViewDefaults.NUMBER_OF_LINES;
    }
}
