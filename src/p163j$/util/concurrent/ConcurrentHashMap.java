package p163j$.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.BiFunction;
import p163j$.util.function.Function;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.ConcurrentHashMap */
/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, AbstractC9273v {
    private static final long ABASE;
    private static final int ASHIFT;
    private static final long BASECOUNT;
    private static final long CELLSBUSY;
    private static final long CELLVALUE;
    private static final int DEFAULT_CAPACITY = 16;
    private static final int DEFAULT_CONCURRENCY_LEVEL = 16;
    static final int HASH_BITS = Integer.MAX_VALUE;
    private static final float LOAD_FACTOR = 0.75f;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_ARRAY_SIZE = 2147483639;
    private static final int MIN_TRANSFER_STRIDE = 16;
    static final int MIN_TREEIFY_CAPACITY = 64;
    static final int MOVED = -1;
    static final int RESERVED = -3;
    private static int RESIZE_STAMP_BITS = 16;
    private static final long SIZECTL;
    private static final long TRANSFERINDEX;
    static final int TREEBIN = -2;
    static final int TREEIFY_THRESHOLD = 8;

    /* renamed from: U */
    private static final Unsafe f38719U;
    static final int UNTREEIFY_THRESHOLD = 6;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    private volatile transient long baseCount;
    private volatile transient int cellsBusy;
    private volatile transient C9255d[] counterCells;
    private transient C9257f entrySet;
    private transient C9261j keySet;
    private volatile transient C9264m[] nextTable;
    private volatile transient int sizeCtl;
    volatile transient C9264m[] table;
    private volatile transient int transferIndex;
    private transient C9271t values;
    private static final int MAX_RESIZERS = (1 << (32 - 16)) - 1;
    private static final int RESIZE_STAMP_SHIFT = 32 - 16;
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C9266o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe c = AbstractC9274w.m16556c();
            f38719U = c;
            SIZECTL = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            TRANSFERINDEX = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            BASECOUNT = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            CELLSBUSY = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            CELLVALUE = c.objectFieldOffset(C9255d.class.getDeclaredField("value"));
            ABASE = c.arrayBaseOffset(C9264m[].class);
            int arrayIndexScale = c.arrayIndexScale(C9264m[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                ASHIFT = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                return;
            }
            throw new Error("data type scale not a power of two");
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i) {
        if (i >= 0) {
            this.sizeCtl = i >= 536870912 ? MAXIMUM_CAPACITY : tableSizeFor(i + (i >>> 1) + 1);
            return;
        }
        throw new IllegalArgumentException();
    }

    public ConcurrentHashMap(int i, float f) {
        this(i, f, 1);
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        long j = (long) (((i < i2 ? i2 : i) / f) + 1.0d);
        this.sizeCtl = j >= 1073741824 ? MAXIMUM_CAPACITY : tableSizeFor((int) j);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L_0x0014;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addCount(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.d[] r0 = r11.counterCells
            if (r0 != 0) goto L_0x0014
            sun.misc.Unsafe r1 = p163j$.util.concurrent.ConcurrentHashMap.f38719U
            long r3 = p163j$.util.concurrent.ConcurrentHashMap.BASECOUNT
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L_0x003b
        L_0x0014:
            r1 = 1
            if (r0 == 0) goto L_0x0096
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x0096
            int r3 = p163j$.util.concurrent.ThreadLocalRandom.m16579b()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L_0x0096
            sun.misc.Unsafe r3 = p163j$.util.concurrent.ConcurrentHashMap.f38719U
            long r5 = p163j$.util.concurrent.ConcurrentHashMap.CELLVALUE
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L_0x0034
            r1 = r0
            goto L_0x0096
        L_0x0034:
            if (r14 > r1) goto L_0x0037
            return
        L_0x0037:
            long r9 = r11.sumCount()
        L_0x003b:
            if (r14 < 0) goto L_0x0095
        L_0x003d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x0095
            j$.util.concurrent.m[] r12 = r11.table
            if (r12 == 0) goto L_0x0095
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L_0x0095
            int r13 = resizeStamp(r13)
            if (r4 >= 0) goto L_0x007c
            int r14 = p163j$.util.concurrent.ConcurrentHashMap.RESIZE_STAMP_SHIFT
            int r14 = r4 >>> r14
            if (r14 != r13) goto L_0x0095
            int r14 = r13 + 1
            if (r4 == r14) goto L_0x0095
            int r14 = p163j$.util.concurrent.ConcurrentHashMap.MAX_RESIZERS
            int r13 = r13 + r14
            if (r4 == r13) goto L_0x0095
            j$.util.concurrent.m[] r13 = r11.nextTable
            if (r13 == 0) goto L_0x0095
            int r14 = r11.transferIndex
            if (r14 > 0) goto L_0x006b
            goto L_0x0095
        L_0x006b:
            sun.misc.Unsafe r0 = p163j$.util.concurrent.ConcurrentHashMap.f38719U
            long r2 = p163j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L_0x0090
            r11.transfer(r12, r13)
            goto L_0x0090
        L_0x007c:
            sun.misc.Unsafe r0 = p163j$.util.concurrent.ConcurrentHashMap.f38719U
            long r2 = p163j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r14 = p163j$.util.concurrent.ConcurrentHashMap.RESIZE_STAMP_SHIFT
            int r13 = r13 << r14
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L_0x0090
            r13 = 0
            r11.transfer(r12, r13)
        L_0x0090:
            long r9 = r11.sumCount()
            goto L_0x003d
        L_0x0095:
            return
        L_0x0096:
            r11.fullAddCount(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.concurrent.ConcurrentHashMap.addCount(long, int):void");
    }

    static final <K, V> boolean casTabAt(C9264m[] mVarArr, int i, C9264m mVar, C9264m mVar2) {
        return AbstractC0481a.m16571a(f38719U, mVarArr, (i << ASHIFT) + ABASE, mVar, mVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> comparableClassFor(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int compareComparables(Class<?> cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
        if (r24.counterCells != r7) goto L_0x00af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
        r1 = new p163j$.util.concurrent.C9255d[r8 << 1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
        if (r2 >= r8) goto L_0x00ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
        r24.counterCells = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void fullAddCount(long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.concurrent.ConcurrentHashMap.fullAddCount(long, boolean):void");
    }

    private final C9264m[] initTable() {
        while (true) {
            C9264m[] mVarArr = this.table;
            if (mVarArr != null && mVarArr.length != 0) {
                return mVarArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else if (f38719U.compareAndSwapInt(this, SIZECTL, i, -1)) {
                try {
                    C9264m[] mVarArr2 = this.table;
                    if (mVarArr2 == null || mVarArr2.length == 0) {
                        int i2 = i > 0 ? i : 16;
                        C9264m[] mVarArr3 = new C9264m[i2];
                        this.table = mVarArr3;
                        i = i2 - (i2 >>> 2);
                        mVarArr2 = mVarArr3;
                    }
                    return mVarArr2;
                } finally {
                    this.sizeCtl = i;
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j;
        int i;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        C9264m mVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            mVar = new C9264m(spread(readObject.hashCode()), readObject, readObject2, mVar);
            j3++;
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        boolean z = true;
        if (j3 >= 536870912) {
            i = MAXIMUM_CAPACITY;
        } else {
            int i2 = (int) j3;
            i = tableSizeFor(i2 + (i2 >>> 1) + 1);
        }
        C9264m[] mVarArr = new C9264m[i];
        int i3 = i - 1;
        while (mVar != null) {
            mVar = mVar.f20339d;
            int i4 = mVar.f20336a;
            int i5 = i4 & i3;
            C9264m tabAt = tabAt(mVarArr, i5);
            if (tabAt != null) {
                Object obj2 = mVar.f20337b;
                if (tabAt.f20336a >= 0) {
                    int i6 = 0;
                    for (C9264m mVar2 = tabAt; mVar2 != null; mVar2 = mVar2.f20339d) {
                        if (mVar2.f20336a == i4 && ((obj = mVar2.f20337b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        } else {
                            i6++;
                        }
                    }
                    z = true;
                    if (z && i6 >= 8) {
                        long j4 = j2 + 1;
                        mVar.f20339d = tabAt;
                        C9264m mVar3 = mVar;
                        C9270s sVar = null;
                        C9270s sVar2 = null;
                        while (mVar3 != null) {
                            C9270s sVar3 = new C9270s(mVar3.f20336a, mVar3.f20337b, mVar3.f20338c, null, null);
                            sVar3.f20360h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f20339d = sVar3;
                            }
                            mVar3 = mVar3.f20339d;
                            sVar2 = sVar3;
                            j4 = j4;
                        }
                        setTabAt(mVarArr, i5, new C9269r(sVar));
                        j2 = j4;
                    }
                } else if (((C9269r) tabAt).m16565f(i4, obj2, mVar.f20338c) == null) {
                    j2 += j;
                }
                z = false;
            }
            if (z) {
                j2++;
                mVar.f20339d = tabAt;
                setTabAt(mVarArr, i5, mVar);
            }
            j = 1;
            z = true;
        }
        this.table = mVarArr;
        this.sizeCtl = i - (i >>> 2);
        this.baseCount = j2;
    }

    static final int resizeStamp(int i) {
        return Integer.numberOfLeadingZeros(i) | (1 << (RESIZE_STAMP_BITS - 1));
    }

    static final <K, V> void setTabAt(C9264m[] mVarArr, int i, C9264m mVar) {
        f38719U.putObjectVolatile(mVarArr, (i << ASHIFT) + ABASE, mVar);
    }

    static final int spread(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <K, V> C9264m tabAt(C9264m[] mVarArr, int i) {
        return (C9264m) f38719U.getObjectVolatile(mVarArr, (i << ASHIFT) + ABASE);
    }

    private static final int tableSizeFor(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 0) {
            return 1;
        }
        return i7 >= MAXIMUM_CAPACITY ? MAXIMUM_CAPACITY : 1 + i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r6v18, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r6v22, types: [j$.util.concurrent.m] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void transfer(p163j$.util.concurrent.C9264m[] r30, p163j$.util.concurrent.C9264m[] r31) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.concurrent.ConcurrentHashMap.transfer(j$.util.concurrent.m[], j$.util.concurrent.m[]):void");
    }

    private final void treeifyBin(C9264m[] mVarArr, int i) {
        if (mVarArr != null) {
            int length = mVarArr.length;
            if (length < 64) {
                tryPresize(length << 1);
                return;
            }
            C9264m tabAt = tabAt(mVarArr, i);
            if (tabAt != null && tabAt.f20336a >= 0) {
                synchronized (tabAt) {
                    if (tabAt(mVarArr, i) == tabAt) {
                        C9270s sVar = null;
                        C9264m mVar = tabAt;
                        C9270s sVar2 = null;
                        while (mVar != null) {
                            C9270s sVar3 = new C9270s(mVar.f20336a, mVar.f20337b, mVar.f20338c, null, null);
                            sVar3.f20360h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f20339d = sVar3;
                            }
                            mVar = mVar.f20339d;
                            sVar2 = sVar3;
                        }
                        setTabAt(mVarArr, i, new C9269r(sVar));
                    }
                }
            }
        }
    }

    private final void tryPresize(int i) {
        int length;
        C9264m[] mVarArr;
        int tableSizeFor = i >= 536870912 ? MAXIMUM_CAPACITY : tableSizeFor(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 >= 0) {
                C9264m[] mVarArr2 = this.table;
                if (mVarArr2 == null || (length = mVarArr2.length) == 0) {
                    int i3 = i2 > tableSizeFor ? i2 : tableSizeFor;
                    if (f38719U.compareAndSwapInt(this, SIZECTL, i2, -1)) {
                        try {
                            if (this.table == mVarArr2) {
                                this.table = new C9264m[i3];
                                i2 = i3 - (i3 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i2;
                        }
                    } else {
                        continue;
                    }
                } else if (tableSizeFor > i2 && length < MAXIMUM_CAPACITY) {
                    if (mVarArr2 == this.table) {
                        int resizeStamp = resizeStamp(length);
                        if (i2 < 0) {
                            if ((i2 >>> RESIZE_STAMP_SHIFT) == resizeStamp && i2 != resizeStamp + 1 && i2 != resizeStamp + MAX_RESIZERS && (mVarArr = this.nextTable) != null && this.transferIndex > 0) {
                                if (f38719U.compareAndSwapInt(this, SIZECTL, i2, i2 + 1)) {
                                    transfer(mVarArr2, mVarArr);
                                }
                            } else {
                                return;
                            }
                        } else if (f38719U.compareAndSwapInt(this, SIZECTL, i2, (resizeStamp << RESIZE_STAMP_SHIFT) + 2)) {
                            transfer(mVarArr2, null);
                        }
                    } else {
                        continue;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    static <K, V> C9264m untreeify(C9264m mVar) {
        C9264m mVar2 = null;
        C9264m mVar3 = null;
        while (mVar != null) {
            C9264m mVar4 = new C9264m(mVar.f20336a, mVar.f20337b, mVar.f20338c, null);
            if (mVar3 == null) {
                mVar2 = mVar4;
            } else {
                mVar3.f20339d = mVar4;
            }
            mVar = mVar.f20339d;
            mVar3 = mVar4;
        }
        return mVar2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = 0;
        int i2 = 1;
        while (i2 < 16) {
            i++;
            i2 <<= 1;
        }
        int i3 = 32 - i;
        int i4 = i2 - 1;
        C9266o[] oVarArr = new C9266o[16];
        for (int i5 = 0; i5 < 16; i5++) {
            oVarArr[i5] = new C9266o();
        }
        objectOutputStream.putFields().put("segments", oVarArr);
        objectOutputStream.putFields().put("segmentShift", i3);
        objectOutputStream.putFields().put("segmentMask", i4);
        objectOutputStream.writeFields();
        C9264m[] mVarArr = this.table;
        if (mVarArr != null) {
            C9268q qVar = new C9268q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C9264m c = qVar.m16570c();
                if (c == null) {
                    break;
                }
                objectOutputStream.writeObject(c.f20337b);
                objectOutputStream.writeObject(c.f20338c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public void clear() {
        C9264m tabAt;
        C9264m[] mVarArr = this.table;
        int i = 0;
        long j = 0;
        loop0: while (true) {
            while (mVarArr != null && i < mVarArr.length) {
                tabAt = tabAt(mVarArr, i);
                if (tabAt == null) {
                    i++;
                } else {
                    int i2 = tabAt.f20336a;
                    if (i2 == -1) {
                        break;
                    }
                    synchronized (tabAt) {
                        if (tabAt(mVarArr, i) == tabAt) {
                            for (C9264m mVar = i2 >= 0 ? tabAt : tabAt instanceof C9269r ? ((C9269r) tabAt).f20355f : null; mVar != null; mVar = mVar.f20339d) {
                                j--;
                            }
                            i++;
                            setTabAt(mVarArr, i, null);
                        }
                    }
                }
            }
            mVarArr = helpTransfer(mVarArr, tabAt);
        }
        if (j != 0) {
            addCount(j, -1);
        }
    }

    @Override // p163j$.util.Map
    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        C9264m mVar;
        Object obj;
        if (k == null || biFunction == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C9264m[] mVarArr = this.table;
        int i = 0;
        V v = null;
        int i2 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i3 = (length - 1) & spread;
                    C9264m tabAt = tabAt(mVarArr, i3);
                    if (tabAt == null) {
                        C9265n nVar = new C9265n();
                        synchronized (nVar) {
                            if (casTabAt(mVarArr, i3, null, nVar)) {
                                Object apply = biFunction.apply(k, null);
                                if (apply != null) {
                                    mVar = new C9264m(spread, k, apply, null);
                                    i2 = 1;
                                } else {
                                    i2 = i2;
                                    mVar = null;
                                }
                                setTabAt(mVarArr, i3, mVar);
                                v = (V) apply;
                                i = 1;
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    } else {
                        int i4 = tabAt.f20336a;
                        if (i4 == -1) {
                            mVarArr = helpTransfer(mVarArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(mVarArr, i3) == tabAt) {
                                    if (i4 >= 0) {
                                        C9264m mVar2 = null;
                                        C9264m mVar3 = tabAt;
                                        i = 1;
                                        while (true) {
                                            if (mVar3.f20336a != spread || ((obj = mVar3.f20337b) != k && (obj == null || !k.equals(obj)))) {
                                                C9264m mVar4 = mVar3.f20339d;
                                                if (mVar4 == null) {
                                                    Object apply2 = biFunction.apply(k, null);
                                                    if (apply2 != null) {
                                                        mVar3.f20339d = new C9264m(spread, k, apply2, null);
                                                        i2 = 1;
                                                    }
                                                    v = (V) apply2;
                                                } else {
                                                    i++;
                                                    mVar2 = mVar3;
                                                    mVar3 = mVar4;
                                                }
                                            }
                                        }
                                        v = (V) biFunction.apply(k, mVar3.f20338c);
                                        if (v != null) {
                                            mVar3.f20338c = v;
                                        } else {
                                            C9264m mVar5 = mVar3.f20339d;
                                            if (mVar2 != null) {
                                                mVar2.f20339d = mVar5;
                                            } else {
                                                setTabAt(mVarArr, i3, mVar5);
                                            }
                                            i2 = -1;
                                        }
                                    } else if (tabAt instanceof C9269r) {
                                        C9269r rVar = (C9269r) tabAt;
                                        C9270s sVar = rVar.f20354e;
                                        C9270s b = sVar != null ? sVar.m16559b(spread, k, null) : null;
                                        Object apply3 = biFunction.apply(k, b == null ? null : b.f20338c);
                                        if (apply3 != null) {
                                            if (b != null) {
                                                b.f20338c = apply3;
                                            } else {
                                                rVar.m16565f(spread, k, apply3);
                                                i = 1;
                                                i2 = 1;
                                                v = (V) apply3;
                                            }
                                        } else if (b != null) {
                                            if (rVar.m16564g(b)) {
                                                setTabAt(mVarArr, i3, untreeify(rVar.f20355f));
                                            }
                                            i = 1;
                                            v = (V) apply3;
                                            i2 = -1;
                                        }
                                        i = 1;
                                        v = (V) apply3;
                                    }
                                }
                            }
                            if (i != 0) {
                                if (i >= 8) {
                                    treeifyBin(mVarArr, i3);
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = initTable();
        }
        if (i2 != 0) {
            addCount(i2, i);
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute((ConcurrentHashMap<K, V>) obj, (BiFunction<? super ConcurrentHashMap<K, V>, ? super V, ? extends V>) BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p163j$.util.Map
    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        C9270s b;
        Object obj;
        if (k == null || function == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C9264m[] mVarArr = this.table;
        V v = null;
        int i = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i2 = (length - 1) & spread;
                    C9264m tabAt = tabAt(mVarArr, i2);
                    boolean z = true;
                    if (tabAt == null) {
                        C9265n nVar = new C9265n();
                        synchronized (nVar) {
                            if (casTabAt(mVarArr, i2, null, nVar)) {
                                Object apply = function.apply(k);
                                setTabAt(mVarArr, i2, apply != null ? new C9264m(spread, k, apply, null) : null);
                                v = (V) apply;
                                i = 1;
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    } else {
                        int i3 = tabAt.f20336a;
                        if (i3 == -1) {
                            mVarArr = helpTransfer(mVarArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(mVarArr, i2) == tabAt) {
                                    if (i3 >= 0) {
                                        C9264m mVar = tabAt;
                                        int i4 = 1;
                                        while (true) {
                                            if (mVar.f20336a != spread || ((obj = mVar.f20337b) != k && (obj == null || !k.equals(obj)))) {
                                                C9264m mVar2 = mVar.f20339d;
                                                if (mVar2 == null) {
                                                    Object apply2 = function.apply(k);
                                                    if (apply2 != null) {
                                                        mVar.f20339d = new C9264m(spread, k, apply2, null);
                                                    } else {
                                                        z = false;
                                                    }
                                                    v = (V) apply2;
                                                } else {
                                                    i4++;
                                                    mVar = mVar2;
                                                }
                                            }
                                        }
                                        v = (V) mVar.f20338c;
                                        z = false;
                                        i = i4;
                                    } else if (tabAt instanceof C9269r) {
                                        C9269r rVar = (C9269r) tabAt;
                                        C9270s sVar = rVar.f20354e;
                                        i = 2;
                                        if (sVar == null || (b = sVar.m16559b(spread, k, null)) == null) {
                                            v = (V) function.apply(k);
                                            if (v != null) {
                                                rVar.m16565f(spread, k, v);
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            v = (V) b.f20338c;
                                            z = false;
                                        }
                                    }
                                }
                                z = false;
                            }
                            if (i != 0) {
                                if (i >= 8) {
                                    treeifyBin(mVarArr, i2);
                                }
                                if (!z) {
                                    return v;
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = initTable();
        }
        if (v != null) {
            addCount(1L, i);
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent((ConcurrentHashMap<K, V>) obj, (Function<? super ConcurrentHashMap<K, V>, ? extends V>) Function.VivifiedWrapper.convert(function));
    }

    @Override // p163j$.util.Map
    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        C9270s b;
        Object obj;
        if (k == null || biFunction == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C9264m[] mVarArr = this.table;
        int i = 0;
        V v = null;
        int i2 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i3 = (length - 1) & spread;
                    C9264m tabAt = tabAt(mVarArr, i3);
                    if (tabAt == null) {
                        break;
                    }
                    int i4 = tabAt.f20336a;
                    if (i4 == -1) {
                        mVarArr = helpTransfer(mVarArr, tabAt);
                    } else {
                        synchronized (tabAt) {
                            if (tabAt(mVarArr, i3) == tabAt) {
                                if (i4 >= 0) {
                                    i2 = 1;
                                    C9264m mVar = null;
                                    C9264m mVar2 = tabAt;
                                    while (true) {
                                        if (mVar2.f20336a != spread || ((obj = mVar2.f20337b) != k && (obj == null || !k.equals(obj)))) {
                                            C9264m mVar3 = mVar2.f20339d;
                                            if (mVar3 == null) {
                                                break;
                                            }
                                            i2++;
                                            mVar = mVar2;
                                            mVar2 = mVar3;
                                        }
                                    }
                                    v = (V) biFunction.apply(k, mVar2.f20338c);
                                    if (v != null) {
                                        mVar2.f20338c = v;
                                    } else {
                                        C9264m mVar4 = mVar2.f20339d;
                                        if (mVar != null) {
                                            mVar.f20339d = mVar4;
                                        } else {
                                            setTabAt(mVarArr, i3, mVar4);
                                        }
                                        i = -1;
                                    }
                                } else if (tabAt instanceof C9269r) {
                                    C9269r rVar = (C9269r) tabAt;
                                    C9270s sVar = rVar.f20354e;
                                    i2 = 2;
                                    if (!(sVar == null || (b = sVar.m16559b(spread, k, null)) == null)) {
                                        v = (V) biFunction.apply(k, b.f20338c);
                                        if (v != null) {
                                            b.f20338c = v;
                                        } else {
                                            if (rVar.m16564g(b)) {
                                                setTabAt(mVarArr, i3, untreeify(rVar.f20355f));
                                            }
                                            i = -1;
                                        }
                                    }
                                }
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
            mVarArr = initTable();
        }
        if (i != 0) {
            addCount(i, i2);
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent((ConcurrentHashMap<K, V>) obj, (BiFunction<? super ConcurrentHashMap<K, V>, ? super V, ? extends V>) BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        C9264m[] mVarArr = this.table;
        if (mVarArr != null) {
            C9268q qVar = new C9268q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C9264m c = qVar.m16570c();
                if (c == null) {
                    break;
                }
                Object obj2 = c.f20338c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Enumeration<V> elements() {
        C9264m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C9260i(mVarArr, length, length, this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C9257f fVar = this.entrySet;
        if (fVar != null) {
            return fVar;
        }
        C9257f fVar2 = new C9257f(this);
        this.entrySet = fVar2;
        return fVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C9264m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        C9268q qVar = new C9268q(mVarArr, length, 0, length);
        while (true) {
            C9264m c = qVar.m16570c();
            if (c != null) {
                Object obj2 = c.f20338c;
                Object obj3 = map.get(c.f20337b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p163j$.util.concurrent.AbstractC9273v, p163j$.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        biConsumer.getClass();
        C9264m[] mVarArr = this.table;
        if (mVarArr != null) {
            C9268q qVar = new C9268q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C9264m c = qVar.m16570c();
                if (c != null) {
                    biConsumer.accept((Object) c.f20337b, (Object) c.f20338c);
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.f20338c;
     */
    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.m[] r1 = r4.table
            r2 = 0
            if (r1 == 0) goto L_0x004e
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.m r1 = tabAt(r1, r3)
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f20336a
            if (r3 != r0) goto L_0x002c
            java.lang.Object r3 = r1.f20337b
            if (r3 == r5) goto L_0x0029
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x0029:
            java.lang.Object r5 = r1.f20338c
            return r5
        L_0x002c:
            if (r3 >= 0) goto L_0x0037
            j$.util.concurrent.m r5 = r1.mo16560a(r0, r5)
            if (r5 == 0) goto L_0x0036
            java.lang.Object r2 = r5.f20338c
        L_0x0036:
            return r2
        L_0x0037:
            j$.util.concurrent.m r1 = r1.f20339d
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f20336a
            if (r3 != r0) goto L_0x0037
            java.lang.Object r3 = r1.f20337b
            if (r3 == r5) goto L_0x004b
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x004b:
            java.lang.Object r5 = r1.f20338c
            return r5
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p163j$.util.Map
    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 == null ? v : v2;
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public int hashCode() {
        C9264m[] mVarArr = this.table;
        int i = 0;
        if (mVarArr != null) {
            C9268q qVar = new C9268q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C9264m c = qVar.m16570c();
                if (c == null) {
                    break;
                }
                i += c.f20338c.hashCode() ^ c.f20337b.hashCode();
            }
        }
        return i;
    }

    final C9264m[] helpTransfer(C9264m[] mVarArr, C9264m mVar) {
        C9264m[] mVarArr2;
        int i;
        if (mVarArr == null || !(mVar instanceof C9259h) || (mVarArr2 = ((C9259h) mVar).f20329e) == null) {
            return this.table;
        }
        int resizeStamp = resizeStamp(mVarArr.length);
        while (true) {
            if (mVarArr2 == this.nextTable && this.table == mVarArr && (i = this.sizeCtl) < 0 && (i >>> RESIZE_STAMP_SHIFT) == resizeStamp && i != resizeStamp + 1 && i != MAX_RESIZERS + resizeStamp && this.transferIndex > 0) {
                if (f38719U.compareAndSwapInt(this, SIZECTL, i, i + 1)) {
                    transfer(mVarArr, mVarArr2);
                    break;
                }
            } else {
                break;
            }
        }
        return mVarArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public boolean isEmpty() {
        return sumCount() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public Set<K> keySet() {
        C9261j jVar = this.keySet;
        if (jVar != null) {
            return jVar;
        }
        C9261j jVar2 = new C9261j(this);
        this.keySet = jVar2;
        return jVar2;
    }

    public Enumeration<K> keys() {
        C9264m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C9260i(mVarArr, length, length, this, 0);
    }

    public long mappingCount() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0L;
        }
        return sumCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p163j$.util.Map
    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        int i;
        V v2;
        V v3;
        Object obj;
        V v4 = v;
        if (k == null || v4 == null || biFunction == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C9264m[] mVarArr = this.table;
        int i2 = 0;
        V v5 = null;
        int i3 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & spread;
                    C9264m tabAt = tabAt(mVarArr, i4);
                    i = 1;
                    if (tabAt != null) {
                        int i5 = tabAt.f20336a;
                        if (i5 == -1) {
                            mVarArr = helpTransfer(mVarArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                v5 = v5;
                                if (tabAt(mVarArr, i4) == tabAt) {
                                    if (i5 >= 0) {
                                        C9264m mVar = null;
                                        C9264m mVar2 = tabAt;
                                        int i6 = 1;
                                        while (true) {
                                            if (mVar2.f20336a != spread || ((obj = mVar2.f20337b) != k && (obj == null || !k.equals(obj)))) {
                                                C9264m mVar3 = mVar2.f20339d;
                                                if (mVar3 == null) {
                                                    mVar2.f20339d = new C9264m(spread, k, v4, null);
                                                    i3 = 1;
                                                    v3 = v4;
                                                    break;
                                                }
                                                i6++;
                                                mVar = mVar2;
                                                mVar2 = mVar3;
                                            }
                                        }
                                        Object apply = biFunction.apply(mVar2.f20338c, v4);
                                        if (apply != 0) {
                                            mVar2.f20338c = apply;
                                            v3 = apply;
                                        } else {
                                            C9264m mVar4 = mVar2.f20339d;
                                            if (mVar != null) {
                                                mVar.f20339d = mVar4;
                                            } else {
                                                setTabAt(mVarArr, i4, mVar4);
                                            }
                                            i3 = -1;
                                            v3 = apply;
                                        }
                                        i2 = i6;
                                        v5 = v3;
                                    } else {
                                        v5 = v5;
                                        if (tabAt instanceof C9269r) {
                                            C9269r rVar = (C9269r) tabAt;
                                            C9270s sVar = rVar.f20354e;
                                            C9270s b = sVar == null ? null : sVar.m16559b(spread, k, null);
                                            V apply2 = b == null ? v4 : biFunction.apply(b.f20338c, v4);
                                            i2 = 2;
                                            if (apply2 != null) {
                                                if (b != null) {
                                                    b.f20338c = apply2;
                                                } else {
                                                    rVar.m16565f(spread, k, apply2);
                                                    i3 = 1;
                                                }
                                            } else if (b != null) {
                                                if (rVar.m16564g(b)) {
                                                    setTabAt(mVarArr, i4, untreeify(rVar.f20355f));
                                                }
                                                v2 = apply2;
                                                i3 = -1;
                                                v5 = v2;
                                            }
                                            v2 = apply2;
                                            v5 = v2;
                                        }
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    treeifyBin(mVarArr, i4);
                                }
                                i = i3;
                                v4 = v5;
                            }
                        }
                    } else if (casTabAt(mVarArr, i4, null, new C9264m(spread, k, v4, null))) {
                        break;
                    }
                }
            }
            mVarArr = initTable();
        }
        if (i != 0) {
            addCount(i, i2);
        }
        return v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge((ConcurrentHashMap<K, V>) obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public V put(K k, V v) {
        return putVal(k, v, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        tryPresize(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            putVal(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p163j$.util.Map
    public V putIfAbsent(K k, V v) {
        return putVal(k, v, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        r7 = (V) r6.f20338c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r11 != false) goto L_0x0082;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        r6.f20338c = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V putVal(K r9, V r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x009e
            if (r10 == 0) goto L_0x009e
            int r1 = r9.hashCode()
            int r1 = spread(r1)
            j$.util.concurrent.m[] r2 = r8.table
            r3 = 0
        L_0x0010:
            if (r2 == 0) goto L_0x0098
            int r4 = r2.length
            if (r4 != 0) goto L_0x0017
            goto L_0x0098
        L_0x0017:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.m r5 = tabAt(r2, r4)
            if (r5 != 0) goto L_0x002d
            j$.util.concurrent.m r5 = new j$.util.concurrent.m
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = casTabAt(r2, r4, r0, r5)
            if (r4 == 0) goto L_0x0010
            goto L_0x008f
        L_0x002d:
            int r6 = r5.f20336a
            r7 = -1
            if (r6 != r7) goto L_0x0037
            j$.util.concurrent.m[] r2 = r8.helpTransfer(r2, r5)
            goto L_0x0010
        L_0x0037:
            monitor-enter(r5)
            j$.util.concurrent.m r7 = tabAt(r2, r4)     // Catch: all -> 0x0095
            if (r7 != r5) goto L_0x0081
            if (r6 < 0) goto L_0x0069
            r3 = 1
            r6 = r5
        L_0x0042:
            int r7 = r6.f20336a     // Catch: all -> 0x0095
            if (r7 != r1) goto L_0x0059
            java.lang.Object r7 = r6.f20337b     // Catch: all -> 0x0095
            if (r7 == r9) goto L_0x0052
            if (r7 == 0) goto L_0x0059
            boolean r7 = r9.equals(r7)     // Catch: all -> 0x0095
            if (r7 == 0) goto L_0x0059
        L_0x0052:
            java.lang.Object r7 = r6.f20338c     // Catch: all -> 0x0095
            if (r11 != 0) goto L_0x0082
            r6.f20338c = r10     // Catch: all -> 0x0095
            goto L_0x0082
        L_0x0059:
            j$.util.concurrent.m r7 = r6.f20339d     // Catch: all -> 0x0095
            if (r7 != 0) goto L_0x0065
            j$.util.concurrent.m r7 = new j$.util.concurrent.m     // Catch: all -> 0x0095
            r7.<init>(r1, r9, r10, r0)     // Catch: all -> 0x0095
            r6.f20339d = r7     // Catch: all -> 0x0095
            goto L_0x0081
        L_0x0065:
            int r3 = r3 + 1
            r6 = r7
            goto L_0x0042
        L_0x0069:
            boolean r6 = r5 instanceof p163j$.util.concurrent.C9269r     // Catch: all -> 0x0095
            if (r6 == 0) goto L_0x0081
            r3 = r5
            j$.util.concurrent.r r3 = (p163j$.util.concurrent.C9269r) r3     // Catch: all -> 0x0095
            j$.util.concurrent.s r3 = r3.m16565f(r1, r9, r10)     // Catch: all -> 0x0095
            r6 = 2
            if (r3 == 0) goto L_0x007e
            java.lang.Object r7 = r3.f20338c     // Catch: all -> 0x0095
            if (r11 != 0) goto L_0x007f
            r3.f20338c = r10     // Catch: all -> 0x0095
            goto L_0x007f
        L_0x007e:
            r7 = r0
        L_0x007f:
            r3 = r6
            goto L_0x0082
        L_0x0081:
            r7 = r0
        L_0x0082:
            monitor-exit(r5)     // Catch: all -> 0x0095
            if (r3 == 0) goto L_0x0010
            r9 = 8
            if (r3 < r9) goto L_0x008c
            r8.treeifyBin(r2, r4)
        L_0x008c:
            if (r7 == 0) goto L_0x008f
            return r7
        L_0x008f:
            r9 = 1
            r8.addCount(r9, r3)
            return r0
        L_0x0095:
            r9 = move-exception
            monitor-exit(r5)     // Catch: all -> 0x0095
            throw r9
        L_0x0098:
            j$.util.concurrent.m[] r2 = r8.initTable()
            goto L_0x0010
        L_0x009e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.concurrent.ConcurrentHashMap.putVal(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public V remove(Object obj) {
        return replaceNode(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p163j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || replaceNode(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p163j$.util.Map
    public V replace(K k, V v) {
        if (k != null && v != null) {
            return replaceNode(k, v, null);
        }
        throw null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p163j$.util.Map
    public boolean replace(K k, V v, V v2) {
        if (k != null && v != null && v2 != null) {
            return replaceNode(k, v2, v) != null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p163j$.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        biFunction.getClass();
        C9264m[] mVarArr = this.table;
        if (mVarArr != null) {
            C9268q qVar = new C9268q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C9264m c = qVar.m16570c();
                if (c != null) {
                    Object obj = c.f20338c;
                    Object obj2 = c.f20337b;
                    do {
                        Object apply = biFunction.apply(obj2, obj);
                        apply.getClass();
                        if (replaceNode(obj2, apply, obj) == null) {
                            obj = get(obj2);
                        }
                    } while (obj != null);
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final V replaceNode(Object obj, V v, Object obj2) {
        int length;
        int i;
        C9264m tabAt;
        V v2;
        boolean z;
        C9270s b;
        C9264m untreeify;
        Object obj3;
        int spread = spread(obj.hashCode());
        C9264m[] mVarArr = this.table;
        while (true) {
            if (mVarArr == null || (length = mVarArr.length) == 0 || (tabAt = tabAt(mVarArr, (i = (length - 1) & spread))) == null) {
                break;
            }
            int i2 = tabAt.f20336a;
            if (i2 == -1) {
                mVarArr = helpTransfer(mVarArr, tabAt);
            } else {
                synchronized (tabAt) {
                    if (tabAt(mVarArr, i) == tabAt) {
                        z = true;
                        if (i2 >= 0) {
                            C9264m mVar = null;
                            C9264m mVar2 = tabAt;
                            while (true) {
                                if (mVar2.f20336a != spread || ((obj3 = mVar2.f20337b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                    C9264m mVar3 = mVar2.f20339d;
                                    if (mVar3 == null) {
                                        break;
                                    }
                                    mVar = mVar2;
                                    mVar2 = mVar3;
                                }
                            }
                            v2 = (V) mVar2.f20338c;
                            if (obj2 == null || obj2 == v2 || (v2 != null && obj2.equals(v2))) {
                                if (v != null) {
                                    mVar2.f20338c = v;
                                } else if (mVar != null) {
                                    mVar.f20339d = mVar2.f20339d;
                                } else {
                                    untreeify = mVar2.f20339d;
                                    setTabAt(mVarArr, i, untreeify);
                                }
                            }
                            v2 = null;
                        } else if (tabAt instanceof C9269r) {
                            C9269r rVar = (C9269r) tabAt;
                            C9270s sVar = rVar.f20354e;
                            if (sVar != null && (b = sVar.m16559b(spread, obj, null)) != null) {
                                v2 = (V) b.f20338c;
                                if (obj2 == null || obj2 == v2 || (v2 != null && obj2.equals(v2))) {
                                    if (v != null) {
                                        b.f20338c = v;
                                    } else if (rVar.m16564g(b)) {
                                        untreeify = untreeify(rVar.f20355f);
                                        setTabAt(mVarArr, i, untreeify);
                                    }
                                }
                            }
                            v2 = null;
                        }
                    }
                    z = false;
                    v2 = null;
                }
                if (z) {
                    if (v2 != null) {
                        if (v == null) {
                            addCount(-1L, -1);
                        }
                        return v2;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public int size() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0;
        }
        if (sumCount > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) sumCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long sumCount() {
        C9255d[] dVarArr = this.counterCells;
        long j = this.baseCount;
        if (dVarArr != null) {
            for (C9255d dVar : dVarArr) {
                if (dVar != null) {
                    j += dVar.value;
                }
            }
        }
        return j;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        C9264m[] mVarArr = this.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        C9268q qVar = new C9268q(mVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        C9264m c = qVar.m16570c();
        if (c != null) {
            while (true) {
                Object obj = c.f20337b;
                Object obj2 = c.f20338c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                c = qVar.m16570c();
                if (c == null) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, p163j$.util.Map
    public Collection<V> values() {
        C9271t tVar = this.values;
        if (tVar != null) {
            return tVar;
        }
        C9271t tVar2 = new C9271t(this);
        this.values = tVar2;
        return tVar2;
    }
}
