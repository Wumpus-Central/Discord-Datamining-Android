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
import qf.a;
import ri.e;
import ri.g;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0000¢\u0006\u0002\u0010!R4\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00018\u00008\u00000\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/discord/serialization/IntEnumSerializer;", "T", "Lcom/discord/serialization/IntEnum;", "Lkotlinx/serialization/KSerializer;", "type", "Lkotlin/reflect/KClass;", "default", "(Lkotlin/reflect/KClass;Lcom/discord/serialization/IntEnum;)V", "choices", "", "kotlin.jvm.PlatformType", "[Lcom/discord/serialization/IntEnum;", "choicesNumbers", "", "[Ljava/lang/Integer;", "getDefault", "()Lcom/discord/serialization/IntEnum;", "Lcom/discord/serialization/IntEnum;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/serialization/IntEnum;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/serialization/IntEnum;)V", "serialization_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public class IntEnumSerializer<T extends IntEnum> implements KSerializer<T> {
    private final T[] choices;
    private final Integer[] choicesNumbers;

    
    private final T f1default;
    private final SerialDescriptor descriptor;
    private final String serialName;

    public IntEnumSerializer(KClass<T> type, T t10) {
        List A;
        q.g(type, "type");
        this.f1default = t10;
        String d10 = type.d();
        q.d(d10);
        this.serialName = d10;
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
        this.descriptor = g.a(this.serialName, e.f.f25628a);
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

    @Override 
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    
    @Override 
    public   void serialize(Encoder encoder, Object obj) {
        serialize(encoder, (Encoder) ((IntEnum) obj));
    }

    
    @Override 
    
    public final T deserialize(kotlinx.serialization.encoding.Decoder r6) {
        
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
                encoder.x(this.choicesNumbers[O].intValue());
                return;
            }
            String str = this.serialName;
            T[] tArr = this.choices;
            throw new IllegalStateException((value + " is not a valid enum " + str + ", choices are " + tArr).toString());
        }
        encoder.x(t10.getSerialNumber());
    }

    public  IntEnumSerializer(KClass kClass, IntEnum intEnum, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i10 & 2) != 0 ? null : intEnum);
    }
}
