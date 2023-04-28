package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C2094a;
import java.lang.reflect.Method;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
class C3305b extends AbstractC3304a {

    /* renamed from: d */
    private final SparseIntArray f5280d;

    /* renamed from: e */
    private final Parcel f5281e;

    /* renamed from: f */
    private final int f5282f;

    /* renamed from: g */
    private final int f5283g;

    /* renamed from: h */
    private final String f5284h;

    /* renamed from: i */
    private int f5285i;

    /* renamed from: j */
    private int f5286j;

    /* renamed from: k */
    private int f5287k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3305b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2094a(), new C2094a(), new C2094a());
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: A */
    public void mo34723A(byte[] bArr) {
        if (bArr != null) {
            this.f5281e.writeInt(bArr.length);
            this.f5281e.writeByteArray(bArr);
            return;
        }
        this.f5281e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: C */
    protected void mo34722C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5281e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: E */
    public void mo34721E(int i) {
        this.f5281e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: G */
    public void mo34720G(Parcelable parcelable) {
        this.f5281e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: I */
    public void mo34719I(String str) {
        this.f5281e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: a */
    public void mo34718a() {
        int i = this.f5285i;
        if (i >= 0) {
            int i2 = this.f5280d.get(i);
            int dataPosition = this.f5281e.dataPosition();
            this.f5281e.setDataPosition(i2);
            this.f5281e.writeInt(dataPosition - i2);
            this.f5281e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: b */
    protected AbstractC3304a mo34717b() {
        Parcel parcel = this.f5281e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5286j;
        if (i == this.f5282f) {
            i = this.f5283g;
        }
        return new C3305b(parcel, dataPosition, i, this.f5284h + "  ", this.f5277a, this.f5278b, this.f5279c);
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: g */
    public boolean mo34716g() {
        return this.f5281e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: i */
    public byte[] mo34715i() {
        int readInt = this.f5281e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5281e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: k */
    protected CharSequence mo34714k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5281e);
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: m */
    public boolean mo34713m(int i) {
        while (this.f5286j < this.f5283g) {
            int i2 = this.f5287k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f5281e.setDataPosition(this.f5286j);
            int readInt = this.f5281e.readInt();
            this.f5287k = this.f5281e.readInt();
            this.f5286j += readInt;
        }
        if (this.f5287k == i) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: o */
    public int mo34712o() {
        return this.f5281e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: q */
    public <T extends Parcelable> T mo34711q() {
        return (T) this.f5281e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: s */
    public String mo34710s() {
        return this.f5281e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: w */
    public void mo34709w(int i) {
        mo34718a();
        this.f5285i = i;
        this.f5280d.put(i, this.f5281e.dataPosition());
        mo34721E(0);
        mo34721E(i);
    }

    @Override // androidx.versionedparcelable.AbstractC3304a
    /* renamed from: y */
    public void mo34708y(boolean z) {
        this.f5281e.writeInt(z ? 1 : 0);
    }

    private C3305b(Parcel parcel, int i, int i2, String str, C2094a<String, Method> aVar, C2094a<String, Method> aVar2, C2094a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f5280d = new SparseIntArray();
        this.f5285i = -1;
        this.f5287k = -1;
        this.f5281e = parcel;
        this.f5282f = i;
        this.f5283g = i2;
        this.f5286j = i;
        this.f5284h = str;
    }
}
