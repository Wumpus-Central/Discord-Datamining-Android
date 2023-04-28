package cg;

import java.util.Random;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"Lcg/a;", "Lcg/c;", "", "bitCount", "b", "c", "Ljava/util/Random;", "e", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cg.a */
/* loaded from: classes8.dex */
public abstract class AbstractC3999a extends AbstractC4002c {
    @Override // cg.AbstractC4002c
    /* renamed from: b */
    public int mo33126b(int i) {
        return C4004d.m33120e(mo25536e().nextInt(), i);
    }

    @Override // cg.AbstractC4002c
    /* renamed from: c */
    public int mo33125c() {
        return mo25536e().nextInt();
    }

    /* renamed from: e */
    public abstract Random mo25536e();
}
