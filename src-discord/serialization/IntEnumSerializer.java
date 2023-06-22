package com.discord.serialization;

import com.discord.serialization.IntEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import vg.a;
import xj.e;
import xj.g;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0000¢\u0006\u0002\u0010!R4\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00018\u00008\u00000\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/discord/serialization/IntEnumSerializer;", "T", "Lcom/discord/serialization/IntEnum;", "Lkotlinx/serialization/KSerializer;", "type", "Lkotlin/reflect/KClass;", "default", "(Lkotlin/reflect/KClass;Lcom/discord/serialization/IntEnum;)V", "choices", "", "kotlin.jvm.PlatformType", "[Lcom/discord/serialization/IntEnum;", "choicesNumbers", "", "[Ljava/lang/Integer;", "getDefault", "()Lcom/discord/serialization/IntEnum;", "Lcom/discord/serialization/IntEnum;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/serialization/IntEnum;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/serialization/IntEnum;)V", "serialization_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class IntEnumSerializer<T extends IntEnum> implements KSerializer<T> {
    private final T[] choices;
    private final Integer[] choicesNumbers;

    /* renamed from: default  reason: not valid java name */
    private final T f1default;
    private final SerialDescriptor descriptor;
    private final String serialName;

    public IntEnumSerializer(KClass<T> type, T t10) {
        List A;
        q.g(type, "type");
        this.f1default = t10;
        String l10 = type.l();
        q.d(l10);
        this.serialName = l10;
        Object[] enumConstants = a.b(type).getEnumConstants();
        q.d(enumConstants);
        T[] tArr = (T[]) ((IntEnum[]) enumConstants);
        this.choices = tArr;
        ArrayList arrayList = new ArrayList(tArr.length);
        boolean z10 = false;
        for (T t11 : tArr) {
            arrayList.add(Integer.valueOf(t11.getSerialNumber()));
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        this.choicesNumbers = numArr;
        this.descriptor = g.a(this.serialName, e.f.f32135a);
        if (numArr.length == this.choices.length) {
            A = f.A(numArr);
            if (!(A.size() == numArr.length ? true : z10)) {
                throw new IllegalArgumentException("There must be no duplicates of serial numbers.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("There must be exactly one serial number for every enum constant.".toString());
    }

    public final T getDefault() {
        return this.f1default;
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vj.h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        serialize(encoder, (Encoder) ((IntEnum) obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((r0 >= 0 && r0 < r5.choices.length) == false) goto L_0x0024;
     */
    @Override // kotlinx.serialization.DeserializationStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T deserialize(kotlinx.serialization.encoding.Decoder r6) {
        /*
            r5 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.q.g(r6, r0)
            int r6 = r6.h()
            java.lang.Integer[] r0 = r5.choicesNumbers
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            int r0 = kotlin.collections.b.O(r0, r1)
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == r3) goto L_0x0024
            if (r0 < 0) goto L_0x0021
            T extends com.discord.serialization.IntEnum[] r4 = r5.choices
            int r4 = r4.length
            if (r0 >= r4) goto L_0x0021
            r4 = r1
            goto L_0x0022
        L_0x0021:
            r4 = r2
        L_0x0022:
            if (r4 != 0) goto L_0x0029
        L_0x0024:
            T extends com.discord.serialization.IntEnum r4 = r5.f1default
            if (r4 == 0) goto L_0x0029
            return r4
        L_0x0029:
            if (r0 == r3) goto L_0x002d
            r3 = r1
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 == 0) goto L_0x0070
            if (r0 < 0) goto L_0x0038
            T extends com.discord.serialization.IntEnum[] r6 = r5.choices
            int r6 = r6.length
            if (r0 >= r6) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = r2
        L_0x0039:
            if (r1 == 0) goto L_0x0045
            T extends com.discord.serialization.IntEnum[] r6 = r5.choices
            r6 = r6[r0]
            java.lang.String r0 = "choices[index]"
            kotlin.jvm.internal.q.f(r6, r0)
            return r6
        L_0x0045:
            java.lang.String r6 = r5.serialName
            T extends com.discord.serialization.IntEnum[] r1 = r5.choices
            int r1 = r1.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " is not among valid "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = " choices, choices size is "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = r2.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x0070:
            java.lang.String r0 = r5.serialName
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = " is not a valid serial value of "
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.serialization.IntEnumSerializer.deserialize(kotlinx.serialization.encoding.Decoder):com.discord.serialization.IntEnum");
    }

    public final void serialize(Encoder encoder, T value) {
        int O;
        T t10;
        q.g(encoder, "encoder");
        q.g(value, "value");
        O = f.O(this.choices, value);
        if (O != -1 || (t10 = this.f1default) == null) {
            if (O != -1) {
                encoder.B(this.choicesNumbers[O].intValue());
                return;
            }
            String str = this.serialName;
            T[] tArr = this.choices;
            throw new IllegalStateException((value + " is not a valid enum " + str + ", choices are " + tArr).toString());
        }
        encoder.B(t10.getSerialNumber());
    }

    public /* synthetic */ IntEnumSerializer(KClass kClass, IntEnum intEnum, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i10 & 2) != 0 ? null : intEnum);
    }
}
