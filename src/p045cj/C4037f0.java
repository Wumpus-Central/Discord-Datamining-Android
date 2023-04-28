package p045cj;

import eg.C6884j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006 "}, m15073d2 = {"Lcj/f0;", "Lcj/k0;", "", "firstEscapedChar", "currentSize", "", "string", "", "d", "expected", "e", "oldSize", "additional", "f", "", "value", "writeLong", "", "char", "a", "text", "c", "b", "g", "toString", "", "[C", "array", "I", "size", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.f0 */
/* loaded from: classes8.dex */
public final class C4037f0 implements AbstractC4049k0 {

    /* renamed from: a */
    private char[] f6633a = C4034e.f6630c.m32983d();

    /* renamed from: b */
    private int f6634b;

    /* renamed from: d */
    private final void m32979d(int i, int i2, String str) {
        int i3;
        int length = str.length();
        while (i < length) {
            int f = m32977f(i2, 2);
            char charAt = str.charAt(i);
            if (charAt < C4066r0.m32895a().length) {
                byte b = C4066r0.m32895a()[charAt];
                if (b == 0) {
                    i3 = f + 1;
                    this.f6633a[f] = charAt;
                } else {
                    if (b == 1) {
                        String str2 = C4066r0.m32894b()[charAt];
                        C9971q.m14636d(str2);
                        int f2 = m32977f(f, str2.length());
                        str2.getChars(0, str2.length(), this.f6633a, f2);
                        i2 = f2 + str2.length();
                        this.f6634b = i2;
                    } else {
                        char[] cArr = this.f6633a;
                        cArr[f] = '\\';
                        cArr[f + 1] = (char) b;
                        i2 = f + 2;
                        this.f6634b = i2;
                    }
                    i++;
                }
            } else {
                i3 = f + 1;
                this.f6633a[f] = charAt;
            }
            i2 = i3;
            i++;
        }
        int f3 = m32977f(i2, 1);
        this.f6633a[f3] = '\"';
        this.f6634b = f3 + 1;
    }

    /* renamed from: e */
    private final void m32978e(int i) {
        m32977f(this.f6634b, i);
    }

    /* renamed from: f */
    private final int m32977f(int i, int i2) {
        int c;
        int i3 = i2 + i;
        char[] cArr = this.f6633a;
        if (cArr.length <= i3) {
            c = C6884j.m23961c(i3, i * 2);
            char[] copyOf = Arrays.copyOf(cArr, c);
            C9971q.m14634f(copyOf, "copyOf(this, newSize)");
            this.f6633a = copyOf;
        }
        return i;
    }

    @Override // p045cj.AbstractC4049k0
    /* renamed from: a */
    public void mo32941a(char c) {
        m32978e(1);
        char[] cArr = this.f6633a;
        int i = this.f6634b;
        this.f6634b = i + 1;
        cArr[i] = c;
    }

    @Override // p045cj.AbstractC4049k0
    /* renamed from: b */
    public void mo32940b(String text) {
        C9971q.m14633g(text, "text");
        m32978e(text.length() + 2);
        char[] cArr = this.f6633a;
        int i = this.f6634b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < C4066r0.m32895a().length && C4066r0.m32895a()[c] != 0) {
                m32979d(i4 - i2, i4, text);
                return;
            }
        }
        cArr[i3] = '\"';
        this.f6634b = i3 + 1;
    }

    @Override // p045cj.AbstractC4049k0
    /* renamed from: c */
    public void mo32939c(String text) {
        C9971q.m14633g(text, "text");
        int length = text.length();
        if (length != 0) {
            m32978e(length);
            text.getChars(0, text.length(), this.f6633a, this.f6634b);
            this.f6634b += length;
        }
    }

    /* renamed from: g */
    public void m32976g() {
        C4034e.f6630c.m32984c(this.f6633a);
    }

    public String toString() {
        return new String(this.f6633a, 0, this.f6634b);
    }

    @Override // p045cj.AbstractC4049k0
    public void writeLong(long j) {
        mo32939c(String.valueOf(j));
    }
}
