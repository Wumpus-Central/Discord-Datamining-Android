package p163j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.r */
/* loaded from: classes2.dex */
public final class C9269r extends C9264m {

    /* renamed from: h */
    private static final Unsafe f20352h;

    /* renamed from: i */
    private static final long f20353i;

    /* renamed from: e */
    C9270s f20354e;

    /* renamed from: f */
    volatile C9270s f20355f;

    /* renamed from: g */
    volatile Thread f20356g;
    volatile int lockState;

    static {
        try {
            Unsafe c = AbstractC9274w.m16556c();
            f20352h = c;
            f20353i = c.objectFieldOffset(C9269r.class.getDeclaredField("lockState"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9269r(C9270s sVar) {
        super(-2, null, null, null);
        int j;
        int compareComparables;
        this.f20355f = sVar;
        sVar = null;
        while (sVar != null) {
            sVar = (C9270s) sVar.f20339d;
            sVar.f20359g = null;
            sVar.f20358f = null;
            if (sVar == null) {
                sVar.f20357e = null;
                sVar.f20361i = false;
            } else {
                Object obj = sVar.f20337b;
                int i = sVar.f20336a;
                C9270s sVar2 = sVar;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = sVar2.f20337b;
                    int i2 = sVar2.f20336a;
                    j = i2 > i ? -1 : i2 < i ? 1 : ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) ? m16561j(obj, obj2) : compareComparables;
                    C9270s sVar3 = j <= 0 ? sVar2.f20358f : sVar2.f20359g;
                    if (sVar3 == null) {
                        break;
                    }
                    sVar2 = sVar3;
                }
                sVar.f20357e = sVar2;
                if (j <= 0) {
                    sVar2.f20358f = sVar;
                } else {
                    sVar2.f20359g = sVar;
                }
                sVar = m16568c(sVar, sVar);
            }
        }
        this.f20354e = sVar;
    }

    /* renamed from: b */
    static C9270s m16569b(C9270s sVar, C9270s sVar2) {
        while (sVar2 != null && sVar2 != sVar2) {
            sVar2 = sVar2.f20357e;
            if (sVar2 == null) {
                sVar2.f20361i = false;
                return sVar2;
            } else if (sVar2.f20361i) {
                sVar2.f20361i = false;
                return sVar2;
            } else {
                C9270s sVar3 = sVar2.f20358f;
                sVar3 = null;
                if (sVar3 == sVar2) {
                    sVar3 = sVar2.f20359g;
                    if (sVar3 != null && sVar3.f20361i) {
                        sVar3.f20361i = false;
                        sVar2.f20361i = true;
                        sVar2 = m16563h(sVar2, sVar2);
                        sVar2 = sVar2.f20357e;
                        sVar3 = sVar2 == null ? null : sVar2.f20359g;
                    }
                    if (sVar3 != null) {
                        C9270s sVar4 = sVar3.f20358f;
                        C9270s sVar5 = sVar3.f20359g;
                        if ((sVar5 != null && sVar5.f20361i) || (sVar4 != null && sVar4.f20361i)) {
                            if (sVar5 == null || !sVar5.f20361i) {
                                if (sVar4 != null) {
                                    sVar4.f20361i = false;
                                }
                                sVar3.f20361i = true;
                                sVar2 = m16562i(sVar2, sVar3);
                                sVar2 = sVar2.f20357e;
                                if (sVar2 != null) {
                                    sVar3 = sVar2.f20359g;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f20361i = sVar2 == null ? false : sVar2.f20361i;
                                C9270s sVar6 = sVar3.f20359g;
                                if (sVar6 != null) {
                                    sVar6.f20361i = false;
                                }
                            }
                            if (sVar2 != null) {
                                sVar2.f20361i = false;
                                sVar2 = m16563h(sVar2, sVar2);
                            }
                            sVar2 = sVar2;
                        }
                        sVar3.f20361i = true;
                    }
                } else {
                    if (sVar3 != null && sVar3.f20361i) {
                        sVar3.f20361i = false;
                        sVar2.f20361i = true;
                        sVar2 = m16562i(sVar2, sVar2);
                        sVar2 = sVar2.f20357e;
                        sVar3 = sVar2 == null ? null : sVar2.f20358f;
                    }
                    if (sVar3 != null) {
                        C9270s sVar7 = sVar3.f20358f;
                        C9270s sVar8 = sVar3.f20359g;
                        if ((sVar7 != null && sVar7.f20361i) || (sVar8 != null && sVar8.f20361i)) {
                            if (sVar7 == null || !sVar7.f20361i) {
                                if (sVar8 != null) {
                                    sVar8.f20361i = false;
                                }
                                sVar3.f20361i = true;
                                sVar2 = m16563h(sVar2, sVar3);
                                sVar2 = sVar2.f20357e;
                                if (sVar2 != null) {
                                    sVar3 = sVar2.f20358f;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f20361i = sVar2 == null ? false : sVar2.f20361i;
                                C9270s sVar9 = sVar3.f20358f;
                                if (sVar9 != null) {
                                    sVar9.f20361i = false;
                                }
                            }
                            if (sVar2 != null) {
                                sVar2.f20361i = false;
                                sVar2 = m16562i(sVar2, sVar2);
                            }
                            sVar2 = sVar2;
                        }
                        sVar3.f20361i = true;
                    }
                }
            }
        }
        return sVar2;
    }

    /* renamed from: c */
    static C9270s m16568c(C9270s sVar, C9270s sVar2) {
        C9270s sVar3;
        sVar2.f20361i = true;
        while (true) {
            C9270s sVar4 = sVar2.f20357e;
            if (sVar4 == null) {
                sVar2.f20361i = false;
                return sVar2;
            } else if (!sVar4.f20361i || (sVar3 = sVar4.f20357e) == null) {
                break;
            } else {
                C9270s sVar5 = sVar3.f20358f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.f20359g;
                    if (sVar5 == null || !sVar5.f20361i) {
                        if (sVar2 == sVar4.f20359g) {
                            sVar = m16563h(sVar, sVar4);
                            C9270s sVar6 = sVar4.f20357e;
                            sVar3 = sVar6 == null ? null : sVar6.f20357e;
                            sVar4 = sVar6;
                            sVar2 = sVar4;
                        }
                        if (sVar4 != null) {
                            sVar4.f20361i = false;
                            if (sVar3 != null) {
                                sVar3.f20361i = true;
                                sVar = m16562i(sVar, sVar3);
                            }
                        }
                    } else {
                        sVar5.f20361i = false;
                        sVar4.f20361i = false;
                        sVar3.f20361i = true;
                        sVar2 = sVar3;
                    }
                } else if (sVar5 == null || !sVar5.f20361i) {
                    if (sVar2 == sVar4.f20358f) {
                        sVar = m16562i(sVar, sVar4);
                        C9270s sVar7 = sVar4.f20357e;
                        sVar3 = sVar7 == null ? null : sVar7.f20357e;
                        sVar4 = sVar7;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.f20361i = false;
                        if (sVar3 != null) {
                            sVar3.f20361i = true;
                            sVar = m16563h(sVar, sVar3);
                        }
                    }
                } else {
                    sVar5.f20361i = false;
                    sVar4.f20361i = false;
                    sVar3.f20361i = true;
                    sVar2 = sVar3;
                }
            }
        }
        return sVar;
    }

    /* renamed from: d */
    private final void m16567d() {
        boolean z = false;
        while (true) {
            int i = this.lockState;
            if ((i & (-3)) == 0) {
                if (f20352h.compareAndSwapInt(this, f20353i, i, 1)) {
                    break;
                }
            } else if ((i & 2) == 0) {
                if (f20352h.compareAndSwapInt(this, f20353i, i, i | 2)) {
                    this.f20356g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.f20356g = null;
        }
    }

    /* renamed from: e */
    private final void m16566e() {
        if (!f20352h.compareAndSwapInt(this, f20353i, 0, 1)) {
            m16567d();
        }
    }

    /* renamed from: h */
    static C9270s m16563h(C9270s sVar, C9270s sVar2) {
        C9270s sVar3 = sVar2.f20359g;
        if (sVar3 != null) {
            C9270s sVar4 = sVar3.f20358f;
            sVar2.f20359g = sVar4;
            if (sVar4 != null) {
                sVar4.f20357e = sVar2;
            }
            C9270s sVar5 = sVar2.f20357e;
            sVar3.f20357e = sVar5;
            if (sVar5 == null) {
                sVar3.f20361i = false;
                sVar = sVar3;
            } else if (sVar5.f20358f == sVar2) {
                sVar5.f20358f = sVar3;
            } else {
                sVar5.f20359g = sVar3;
            }
            sVar3.f20358f = sVar2;
            sVar2.f20357e = sVar3;
        }
        return sVar;
    }

    /* renamed from: i */
    static C9270s m16562i(C9270s sVar, C9270s sVar2) {
        C9270s sVar3 = sVar2.f20358f;
        if (sVar3 != null) {
            C9270s sVar4 = sVar3.f20359g;
            sVar2.f20358f = sVar4;
            if (sVar4 != null) {
                sVar4.f20357e = sVar2;
            }
            C9270s sVar5 = sVar2.f20357e;
            sVar3.f20357e = sVar5;
            if (sVar5 == null) {
                sVar3.f20361i = false;
                sVar = sVar3;
            } else if (sVar5.f20359g == sVar2) {
                sVar5.f20359g = sVar3;
            } else {
                sVar5.f20358f = sVar3;
            }
            sVar3.f20359g = sVar2;
            sVar2.f20357e = sVar3;
        }
        return sVar;
    }

    /* renamed from: j */
    static int m16561j(Object obj, Object obj2) {
        int compareTo;
        if (obj != null && obj2 != null && (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) != 0) {
            return compareTo;
        }
        return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.concurrent.C9264m
    /* renamed from: a */
    public final C9264m mo16560a(int i, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        C9270s sVar = null;
        if (obj != null) {
            C9264m mVar = this.f20355f;
            while (mVar != null) {
                int i2 = this.lockState;
                if ((i2 & 3) == 0) {
                    Unsafe unsafe = f20352h;
                    long j = f20353i;
                    if (unsafe.compareAndSwapInt(this, j, i2, i2 + 4)) {
                        try {
                            C9270s sVar2 = this.f20354e;
                            if (sVar2 != null) {
                                sVar = sVar2.m16559b(i, obj, null);
                            }
                            if (AbstractC9274w.m16558a(unsafe, this, j) == 6 && (thread2 = this.f20356g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return sVar;
                        } catch (Throwable th2) {
                            if (AbstractC9274w.m16558a(f20352h, this, f20353i) == 6 && (thread = this.f20356g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th2;
                        }
                    }
                } else if (mVar.f20336a == i && ((obj2 = mVar.f20337b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return mVar;
                } else {
                    mVar = mVar.f20339d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7 A[LOOP:0: B:3:0x000c->B:54:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0071 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p163j$.util.concurrent.C9270s m16565f(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.s r2 = r1.f20354e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = r9
        L_0x000c:
            if (r10 != 0) goto L_0x0022
            j$.util.concurrent.s r9 = new j$.util.concurrent.s
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f20354e = r9
            r1.f20355f = r9
            goto L_0x00a2
        L_0x0022:
            int r5 = r10.f20336a
            r11 = 1
            if (r5 <= r0) goto L_0x0029
            r5 = -1
            goto L_0x0065
        L_0x0029:
            if (r5 >= r0) goto L_0x002d
            r12 = r11
            goto L_0x0068
        L_0x002d:
            java.lang.Object r5 = r10.f20337b
            if (r5 == r4) goto L_0x00aa
            if (r5 == 0) goto L_0x003b
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L_0x003b
            goto L_0x00aa
        L_0x003b:
            if (r2 != 0) goto L_0x0043
            java.lang.Class r2 = p163j$.util.concurrent.ConcurrentHashMap.comparableClassFor(r17)
            if (r2 == 0) goto L_0x0049
        L_0x0043:
            int r6 = p163j$.util.concurrent.ConcurrentHashMap.compareComparables(r2, r4, r5)
            if (r6 != 0) goto L_0x0067
        L_0x0049:
            if (r3 != 0) goto L_0x0061
            j$.util.concurrent.s r3 = r10.f20358f
            if (r3 == 0) goto L_0x0055
            j$.util.concurrent.s r3 = r3.m16559b(r0, r4, r2)
            if (r3 != 0) goto L_0x005f
        L_0x0055:
            j$.util.concurrent.s r3 = r10.f20359g
            if (r3 == 0) goto L_0x0060
            j$.util.concurrent.s r3 = r3.m16559b(r0, r4, r2)
            if (r3 == 0) goto L_0x0060
        L_0x005f:
            return r3
        L_0x0060:
            r3 = r11
        L_0x0061:
            int r5 = m16561j(r4, r5)
        L_0x0065:
            r12 = r5
            goto L_0x0068
        L_0x0067:
            r12 = r6
        L_0x0068:
            if (r12 > 0) goto L_0x006d
            j$.util.concurrent.s r5 = r10.f20358f
            goto L_0x006f
        L_0x006d:
            j$.util.concurrent.s r5 = r10.f20359g
        L_0x006f:
            if (r5 != 0) goto L_0x00a7
            j$.util.concurrent.s r13 = r1.f20355f
            j$.util.concurrent.s r14 = new j$.util.concurrent.s
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f20355f = r14
            if (r13 == 0) goto L_0x0087
            r13.f20360h = r14
        L_0x0087:
            if (r12 > 0) goto L_0x008c
            r10.f20358f = r14
            goto L_0x008e
        L_0x008c:
            r10.f20359g = r14
        L_0x008e:
            boolean r0 = r10.f20361i
            if (r0 != 0) goto L_0x0095
            r14.f20361i = r11
            goto L_0x00a2
        L_0x0095:
            r15.m16566e()
            j$.util.concurrent.s r0 = r1.f20354e     // Catch: all -> 0x00a3
            j$.util.concurrent.s r0 = m16568c(r0, r14)     // Catch: all -> 0x00a3
            r1.f20354e = r0     // Catch: all -> 0x00a3
            r1.lockState = r9
        L_0x00a2:
            return r8
        L_0x00a3:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        L_0x00a7:
            r10 = r5
            goto L_0x000c
        L_0x00aa:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.concurrent.C9269r.m16565f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m16564g(p163j$.util.concurrent.C9270s r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.concurrent.C9269r.m16564g(j$.util.concurrent.s):boolean");
    }
}
