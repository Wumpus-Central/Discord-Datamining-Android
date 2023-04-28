package net.time4j;

import p143hj.AbstractC8086w;

/* renamed from: net.time4j.n0 */
/* loaded from: classes8.dex */
public enum EnumC10974n0 implements AbstractC8086w {
    SECONDS(1.0d),
    NANOSECONDS(1.0E-9d);
    
    private final double length;

    EnumC10974n0(double d) {
        this.length = d;
    }

    @Override // p143hj.AbstractC8086w
    public double getLength() {
        return this.length;
    }
}
