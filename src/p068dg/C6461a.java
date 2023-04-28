package p068dg;

import cg.AbstractC3999a;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p163j$.util.concurrent.ThreadLocalRandom;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"Ldg/a;", "Lcg/a;", "", "from", "until", "d", "Ljava/util/Random;", "e", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib-jdk8"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: dg.a */
/* loaded from: classes8.dex */
public final class C6461a extends AbstractC3999a {
    @Override // cg.AbstractC4002c
    /* renamed from: d */
    public int mo25537d(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // cg.AbstractC3999a
    /* renamed from: e */
    public Random mo25536e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C9971q.m14634f(current, "current()");
        return current;
    }
}
