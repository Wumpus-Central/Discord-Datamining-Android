package pf;

import ag.AbstractC1385a;
import eg.C6882h;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;
import p267of.AbstractC11283p;

@Metadata(m15074d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\r\b\u0000\u0018\u0000 f*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006xyz{|}BG\b\u0002\u0012\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0006\u0010P\u001a\u00020N\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010R\u001a\u00020\u0006\u0012\u0006\u0010S\u001a\u00020\u0006¢\u0006\u0004\bt\u0010uB\t\b\u0016¢\u0006\u0004\bt\u00109B\u0011\b\u0016\u0012\u0006\u0010v\u001a\u00020\u0006¢\u0006\u0004\bt\u0010wJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0018\u0010 \u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eH\u0002J\u001c\u0010#\u001a\u00020\u00152\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0002J\"\u0010&\u001a\u00020\u00152\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0$H\u0002J\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eJ\b\u0010(\u001a\u00020\u0015H\u0016J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010*J\u001a\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u00020\b2\u0014\u0010%\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J\u0019\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u0010-J\b\u00102\u001a\u00020\bH\u0016J\u0013\u00104\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00105\u001a\u00020\u0006H\u0016J\b\u00107\u001a\u000206H\u0016J\u000f\u00108\u001a\u00020\bH\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0011J#\u0010:\u001a\u00020\u00152\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u00020\u00152\n\u00108\u001a\u0006\u0012\u0002\b\u00030$H\u0000¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u00020\u00152\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0000¢\u0006\u0004\b>\u0010;J\u0017\u0010@\u001a\u00020\u00152\u0006\u0010?\u001a\u00028\u0001H\u0000¢\u0006\u0004\b@\u0010*J\u001b\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010AH\u0000¢\u0006\u0004\bB\u0010CJ\u001b\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010DH\u0000¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000¢\u0006\u0004\bH\u0010IR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010JR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010OR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010OR\u0016\u0010R\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010>R\u0016\u0010S\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010>R\u0016\u0010T\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010>R$\u0010X\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bV\u0010WR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010ZR\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010]R$\u0010a\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010`R$\u0010e\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010\n\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010WR\u0014\u0010h\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010WR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00010m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR&\u0010s\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010q0i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010k¨\u0006~"}, m15073d2 = {"Lpf/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "n", "", "s", "capacity", "r", "", "j", "()[Ljava/lang/Object;", "key", "C", "(Ljava/lang/Object;)I", "newHashSize", "H", "i", "", "G", "u", "value", "v", "index", "L", "removedHash", "J", "", "other", "q", "", "entry", "F", "", "from", "E", "k", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "clear", "", "equals", "hashCode", "", "toString", "m", "()V", "p", "(Ljava/util/Map$Entry;)Z", "o", "(Ljava/util/Collection;)Z", "I", "element", "M", "Lpf/d$e;", "D", "()Lpf/d$e;", "Lpf/d$f;", "N", "()Lpf/d$f;", "Lpf/d$b;", "t", "()Lpf/d$b;", "[Ljava/lang/Object;", "keysArray", "l", "valuesArray", "", "[I", "presenceArray", "hashArray", "maxProbeDistance", "length", "hashShift", "<set-?>", "A", "()I", "size", "Lpf/f;", "Lpf/f;", "keysView", "Lpf/g;", "Lpf/g;", "valuesView", "Lpf/e;", "Lpf/e;", "entriesView", "Z", "isReadOnly$kotlin_stdlib", "()Z", "isReadOnly", "w", "y", "hashSize", "", "z", "()Ljava/util/Set;", "keys", "", "B", "()Ljava/util/Collection;", "values", "", "x", "entries", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "(I)V", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: pf.d */
/* loaded from: classes8.dex */
public final class C11654d<K, V> implements Map<K, V>, Serializable, AbstractC1385a {

    /* renamed from: w */
    private static final C11655a f26001w = new C11655a(null);

    /* renamed from: k */
    private K[] f26002k;

    /* renamed from: l */
    private V[] f26003l;

    /* renamed from: m */
    private int[] f26004m;

    /* renamed from: n */
    private int[] f26005n;

    /* renamed from: o */
    private int f26006o;

    /* renamed from: p */
    private int f26007p;

    /* renamed from: q */
    private int f26008q;

    /* renamed from: r */
    private int f26009r;

    /* renamed from: s */
    private C11661f<K> f26010s;

    /* renamed from: t */
    private C11662g<V> f26011t;

    /* renamed from: u */
    private C11660e<K, V> f26012u;

    /* renamed from: v */
    private boolean f26013v;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, m15073d2 = {"Lpf/d$a;", "", "", "capacity", "c", "hashSize", "d", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: pf.d$a */
    /* loaded from: classes8.dex */
    public static final class C11655a {
        private C11655a() {
        }

        public /* synthetic */ C11655a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final int m9074c(int i) {
            return Integer.highestOneBit(C6882h.m23978c(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final int m9073d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    @Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0096\u0002J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¨\u0006\u0014"}, m15073d2 = {"Lpf/d$b;", "K", "V", "Lpf/d$d;", "", "", "Lpf/d$c;", "j", "", "m", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "", "k", "Lpf/d;", "map", "<init>", "(Lpf/d;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: pf.d$b */
    /* loaded from: classes8.dex */
    public static final class C11656b<K, V> extends C0370d<K, V> implements Iterator<Map.Entry<K, V>>, AbstractC1385a, p163j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11656b(C11654d<K, V> map) {
            super(map);
            C9971q.m14633g(map, "map");
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        /* renamed from: j */
        public C11657c<K, V> next() {
            if (m9069b() < ((C11654d) m9067f()).f26007p) {
                int b = m9069b();
                m9065h(b + 1);
                m9064i(b);
                C11657c<K, V> cVar = new C11657c<>(m9067f(), m9068d());
                m9066g();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: k */
        public final void m9071k(StringBuilder sb2) {
            C9971q.m14633g(sb2, "sb");
            if (m9069b() < ((C11654d) m9067f()).f26007p) {
                int b = m9069b();
                m9065h(b + 1);
                m9064i(b);
                Object obj = ((C11654d) m9067f()).f26002k[m9068d()];
                if (C9971q.m14638b(obj, m9067f())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = ((C11654d) m9067f()).f26003l;
                C9971q.m14636d(objArr);
                Object obj2 = objArr[m9068d()];
                if (C9971q.m14638b(obj2, m9067f())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                m9066g();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: m */
        public final int m9070m() {
            int i;
            if (m9069b() < ((C11654d) m9067f()).f26007p) {
                int b = m9069b();
                m9065h(b + 1);
                m9064i(b);
                Object obj = ((C11654d) m9067f()).f26002k[m9068d()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = ((C11654d) m9067f()).f26003l;
                C9971q.m14636d(objArr);
                Object obj2 = objArr[m9068d()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                m9066g();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, m15073d2 = {"Lpf/d$c;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lpf/d;", "k", "Lpf/d;", "map", "l", "I", "index", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "<init>", "(Lpf/d;I)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: pf.d$c */
    /* loaded from: classes8.dex */
    public static final class C11657c<K, V> implements Map.Entry<K, V>, AbstractC1385a {

        /* renamed from: k */
        private final C11654d<K, V> f26014k;

        /* renamed from: l */
        private final int f26015l;

        public C11657c(C11654d<K, V> map, int i) {
            C9971q.m14633g(map, "map");
            this.f26014k = map;
            this.f26015l = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (C9971q.m14638b(entry.getKey(), getKey()) && C9971q.m14638b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((C11654d) this.f26014k).f26002k[this.f26015l];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((C11654d) this.f26014k).f26003l;
            C9971q.m14636d(objArr);
            return (V) objArr[this.f26015l];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.f26014k.m9090m();
            Object[] j = this.f26014k.m9092j();
            int i = this.f26015l;
            V v2 = (V) j[i];
            j[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    @Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, m15073d2 = {"Lpf/d$d;", "K", "V", "", "", "g", "()V", "", "hasNext", "remove", "Lpf/d;", "k", "Lpf/d;", "f", "()Lpf/d;", "map", "", "l", "I", "b", "()I", "h", "(I)V", "index", "m", "d", "i", "lastIndex", "<init>", "(Lpf/d;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: pf.d$d */
    /* loaded from: classes8.dex */
    public static class C0370d<K, V> {

        /* renamed from: k */
        private final C11654d<K, V> f26016k;

        /* renamed from: l */
        private int f26017l;

        /* renamed from: m */
        private int f26018m = -1;

        public C0370d(C11654d<K, V> map) {
            C9971q.m14633g(map, "map");
            this.f26016k = map;
            m9066g();
        }

        /* renamed from: b */
        public final int m9069b() {
            return this.f26017l;
        }

        /* renamed from: d */
        public final int m9068d() {
            return this.f26018m;
        }

        /* renamed from: f */
        public final C11654d<K, V> m9067f() {
            return this.f26016k;
        }

        /* renamed from: g */
        public final void m9066g() {
            while (this.f26017l < ((C11654d) this.f26016k).f26007p) {
                int[] iArr = ((C11654d) this.f26016k).f26004m;
                int i = this.f26017l;
                if (iArr[i] < 0) {
                    this.f26017l = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: h */
        public final void m9065h(int i) {
            this.f26017l = i;
        }

        public final boolean hasNext() {
            return this.f26017l < ((C11654d) this.f26016k).f26007p;
        }

        /* renamed from: i */
        public final void m9064i(int i) {
            this.f26018m = i;
        }

        public final void remove() {
            boolean z;
            if (this.f26018m != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f26016k.m9090m();
                this.f26016k.m9102L(this.f26018m);
                this.f26018m = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m15073d2 = {"Lpf/d$e;", "K", "V", "Lpf/d$d;", "", "next", "()Ljava/lang/Object;", "Lpf/d;", "map", "<init>", "(Lpf/d;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: pf.d$e */
    /* loaded from: classes8.dex */
    public static final class C11658e<K, V> extends C0370d<K, V> implements java.util.Iterator<K>, AbstractC1385a, p163j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11658e(C11654d<K, V> map) {
            super(map);
            C9971q.m14633g(map, "map");
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public K next() {
            if (m9069b() < ((C11654d) m9067f()).f26007p) {
                int b = m9069b();
                m9065h(b + 1);
                m9064i(b);
                K k = (K) ((C11654d) m9067f()).f26002k[m9068d()];
                m9066g();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m15073d2 = {"Lpf/d$f;", "K", "V", "Lpf/d$d;", "", "next", "()Ljava/lang/Object;", "Lpf/d;", "map", "<init>", "(Lpf/d;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: pf.d$f */
    /* loaded from: classes8.dex */
    public static final class C11659f<K, V> extends C0370d<K, V> implements java.util.Iterator<V>, AbstractC1385a, p163j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11659f(C11654d<K, V> map) {
            super(map);
            C9971q.m14633g(map, "map");
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public V next() {
            if (m9069b() < ((C11654d) m9067f()).f26007p) {
                int b = m9069b();
                m9065h(b + 1);
                m9064i(b);
                Object[] objArr = ((C11654d) m9067f()).f26003l;
                C9971q.m14636d(objArr);
                V v = (V) objArr[m9068d()];
                m9066g();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    private C11654d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.f26002k = kArr;
        this.f26003l = vArr;
        this.f26004m = iArr;
        this.f26005n = iArr2;
        this.f26006o = i;
        this.f26007p = i2;
        this.f26008q = f26001w.m9073d(m9078y());
    }

    /* renamed from: C */
    private final int m9111C(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.f26008q;
    }

    /* renamed from: E */
    private final boolean m9109E(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m9084s(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (m9108F(entry)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    private final boolean m9108F(Map.Entry<? extends K, ? extends V> entry) {
        int i = m9093i(entry.getKey());
        Object[] j = m9092j();
        if (i >= 0) {
            j[i] = entry.getValue();
            return true;
        }
        int i2 = (-i) - 1;
        if (C9971q.m14638b(entry.getValue(), j[i2])) {
            return false;
        }
        j[i2] = entry.getValue();
        return true;
    }

    /* renamed from: G */
    private final boolean m9107G(int i) {
        int C = m9111C(this.f26002k[i]);
        int i2 = this.f26006o;
        while (true) {
            int[] iArr = this.f26005n;
            if (iArr[C] == 0) {
                iArr[C] = i + 1;
                this.f26004m[i] = C;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = C - 1;
            if (C == 0) {
                C = m9078y() - 1;
            } else {
                C = i3;
            }
        }
    }

    /* renamed from: H */
    private final void m9106H(int i) {
        if (this.f26007p > size()) {
            m9089n();
        }
        int i2 = 0;
        if (i != m9078y()) {
            this.f26005n = new int[i];
            this.f26008q = f26001w.m9073d(i);
        } else {
            C9897e.m14984k(this.f26005n, 0, 0, m9078y());
        }
        while (i2 < this.f26007p) {
            int i3 = i2 + 1;
            if (m9107G(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: J */
    private final void m9104J(int i) {
        int g = C6882h.m23974g(this.f26006o * 2, m9078y() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            int i4 = i - 1;
            if (i == 0) {
                i = m9078y() - 1;
            } else {
                i = i4;
            }
            i2++;
            if (i2 > this.f26006o) {
                this.f26005n[i3] = 0;
                return;
            }
            int[] iArr = this.f26005n;
            int i5 = iArr[i];
            if (i5 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i3] = -1;
            } else {
                int i6 = i5 - 1;
                if (((m9111C(this.f26002k[i6]) - i) & (m9078y() - 1)) >= i2) {
                    this.f26005n[i3] = i5;
                    this.f26004m[i6] = i3;
                }
                g--;
            }
            i3 = i;
            i2 = 0;
            g--;
        } while (g >= 0);
        this.f26005n[i3] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m9102L(int i) {
        C11653c.m9118f(this.f26002k, i);
        m9104J(this.f26004m[i]);
        this.f26004m[i] = -1;
        this.f26009r = size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final V[] m9092j() {
        V[] vArr = this.f26003l;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C11653c.m9120d(m9080w());
        this.f26003l = vArr2;
        return vArr2;
    }

    /* renamed from: n */
    private final void m9089n() {
        int i;
        V[] vArr = this.f26003l;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f26007p;
            if (i2 >= i) {
                break;
            }
            if (this.f26004m[i2] >= 0) {
                K[] kArr = this.f26002k;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C11653c.m9117g(this.f26002k, i3, i);
        if (vArr != null) {
            C11653c.m9117g(vArr, i3, this.f26007p);
        }
        this.f26007p = i3;
    }

    /* renamed from: q */
    private final boolean m9086q(Map<?, ?> map) {
        return size() == map.size() && m9088o(map.entrySet());
    }

    /* renamed from: r */
    private final void m9085r(int i) {
        V[] vArr;
        if (i < 0) {
            throw new OutOfMemoryError();
        } else if (i > m9080w()) {
            int w = (m9080w() * 3) / 2;
            if (i <= w) {
                i = w;
            }
            this.f26002k = (K[]) C11653c.m9119e(this.f26002k, i);
            V[] vArr2 = this.f26003l;
            if (vArr2 != null) {
                vArr = (V[]) C11653c.m9119e(vArr2, i);
            } else {
                vArr = null;
            }
            this.f26003l = vArr;
            int[] copyOf = Arrays.copyOf(this.f26004m, i);
            C9971q.m14634f(copyOf, "copyOf(this, newSize)");
            this.f26004m = copyOf;
            int c = f26001w.m9074c(i);
            if (c > m9078y()) {
                m9106H(c);
            }
        } else if ((this.f26007p + i) - size() > m9080w()) {
            m9106H(m9078y());
        }
    }

    /* renamed from: s */
    private final void m9084s(int i) {
        m9085r(this.f26007p + i);
    }

    /* renamed from: u */
    private final int m9082u(K k) {
        int C = m9111C(k);
        int i = this.f26006o;
        while (true) {
            int i2 = this.f26005n[C];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C9971q.m14638b(this.f26002k[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = C - 1;
            if (C == 0) {
                C = m9078y() - 1;
            } else {
                C = i4;
            }
        }
    }

    /* renamed from: v */
    private final int m9081v(V v) {
        int i = this.f26007p;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f26004m[i] >= 0) {
                V[] vArr = this.f26003l;
                C9971q.m14636d(vArr);
                if (C9971q.m14638b(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: w */
    private final int m9080w() {
        return this.f26002k.length;
    }

    /* renamed from: y */
    private final int m9078y() {
        return this.f26005n.length;
    }

    /* renamed from: A */
    public int m9113A() {
        return this.f26009r;
    }

    /* renamed from: B */
    public Collection<V> m9112B() {
        C11662g<V> gVar = this.f26011t;
        if (gVar != null) {
            return gVar;
        }
        C11662g<V> gVar2 = new C11662g<>(this);
        this.f26011t = gVar2;
        return gVar2;
    }

    /* renamed from: D */
    public final C11658e<K, V> m9110D() {
        return new C11658e<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public final boolean m9105I(Map.Entry<? extends K, ? extends V> entry) {
        C9971q.m14633g(entry, "entry");
        m9090m();
        int u = m9082u(entry.getKey());
        if (u < 0) {
            return false;
        }
        V[] vArr = this.f26003l;
        C9971q.m14636d(vArr);
        if (!C9971q.m14638b(vArr[u], entry.getValue())) {
            return false;
        }
        m9102L(u);
        return true;
    }

    /* renamed from: K */
    public final int m9103K(K k) {
        m9090m();
        int u = m9082u(k);
        if (u < 0) {
            return -1;
        }
        m9102L(u);
        return u;
    }

    /* renamed from: M */
    public final boolean m9101M(V v) {
        m9090m();
        int v2 = m9081v(v);
        if (v2 < 0) {
            return false;
        }
        m9102L(v2);
        return true;
    }

    /* renamed from: N */
    public final C11659f<K, V> m9100N() {
        return new C11659f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        m9090m();
        AbstractC11283p g = new IntRange(0, this.f26007p - 1).iterator();
        while (g.hasNext()) {
            int nextInt = g.nextInt();
            int[] iArr = this.f26004m;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.f26005n[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        C11653c.m9117g(this.f26002k, 0, this.f26007p);
        V[] vArr = this.f26003l;
        if (vArr != null) {
            C11653c.m9117g(vArr, 0, this.f26007p);
        }
        this.f26009r = 0;
        this.f26007p = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m9082u(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m9081v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m9079x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof Map) && m9086q((Map) obj))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int u = m9082u(obj);
        if (u < 0) {
            return null;
        }
        V[] vArr = this.f26003l;
        C9971q.m14636d(vArr);
        return vArr[u];
    }

    @Override // java.util.Map
    public int hashCode() {
        C11656b<K, V> t = m9083t();
        int i = 0;
        while (t.hasNext()) {
            i += t.m9070m();
        }
        return i;
    }

    /* renamed from: i */
    public final int m9093i(K k) {
        m9090m();
        while (true) {
            int C = m9111C(k);
            int g = C6882h.m23974g(this.f26006o * 2, m9078y() / 2);
            int i = 0;
            while (true) {
                int i2 = this.f26005n[C];
                if (i2 <= 0) {
                    if (this.f26007p >= m9080w()) {
                        m9084s(1);
                    } else {
                        int i3 = this.f26007p;
                        int i4 = i3 + 1;
                        this.f26007p = i4;
                        this.f26002k[i3] = k;
                        this.f26004m[i3] = C;
                        this.f26005n[C] = i4;
                        this.f26009r = size() + 1;
                        if (i > this.f26006o) {
                            this.f26006o = i;
                        }
                        return i3;
                    }
                } else if (C9971q.m14638b(this.f26002k[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > g) {
                        m9106H(m9078y() * 2);
                        break;
                    }
                    int i5 = C - 1;
                    if (C == 0) {
                        C = m9078y() - 1;
                    } else {
                        C = i5;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public final Map<K, V> m9091k() {
        m9090m();
        this.f26013v = true;
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m9077z();
    }

    /* renamed from: m */
    public final void m9090m() {
        if (this.f26013v) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o */
    public final boolean m9088o(Collection<?> m) {
        C9971q.m14633g(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!m9087p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final boolean m9087p(Map.Entry<? extends K, ? extends V> entry) {
        C9971q.m14633g(entry, "entry");
        int u = m9082u(entry.getKey());
        if (u < 0) {
            return false;
        }
        V[] vArr = this.f26003l;
        C9971q.m14636d(vArr);
        return C9971q.m14638b(vArr[u], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        m9090m();
        int i = m9093i(k);
        V[] j = m9092j();
        if (i < 0) {
            int i2 = (-i) - 1;
            V v2 = j[i2];
            j[i2] = v;
            return v2;
        }
        j[i] = v;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        C9971q.m14633g(from, "from");
        m9090m();
        m9109E(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int K = m9103K(obj);
        if (K < 0) {
            return null;
        }
        V[] vArr = this.f26003l;
        C9971q.m14636d(vArr);
        V v = vArr[K];
        C11653c.m9118f(vArr, K);
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m9113A();
    }

    /* renamed from: t */
    public final C11656b<K, V> m9083t() {
        return new C11656b<>(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        C11656b<K, V> t = m9083t();
        int i = 0;
        while (t.hasNext()) {
            if (i > 0) {
                sb2.append(", ");
            }
            t.m9071k(sb2);
            i++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "sb.toString()");
        return sb3;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m9112B();
    }

    /* renamed from: x */
    public Set<Map.Entry<K, V>> m9079x() {
        C11660e<K, V> eVar = this.f26012u;
        if (eVar != null) {
            return eVar;
        }
        C11660e<K, V> eVar2 = new C11660e<>(this);
        this.f26012u = eVar2;
        return eVar2;
    }

    /* renamed from: z */
    public Set<K> m9077z() {
        C11661f<K> fVar = this.f26010s;
        if (fVar != null) {
            return fVar;
        }
        C11661f<K> fVar2 = new C11661f<>(this);
        this.f26010s = fVar2;
        return fVar2;
    }

    public C11654d() {
        this(8);
    }

    public C11654d(int i) {
        this(C11653c.m9120d(i), null, new int[i], new int[f26001w.m9074c(i)], 2, 0);
    }
}
