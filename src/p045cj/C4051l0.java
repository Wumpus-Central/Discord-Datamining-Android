package p045cj;

import bj.AbstractC3623b;
import bj.C3680n0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC10270b;
import kotlinx.serialization.json.AbstractC10273e;
import kotlinx.serialization.json.C10274f;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import nf.C11075i;
import p014aj.AbstractC1410d;
import p014aj.AbstractC1413e;
import p014aj.AbstractC1429h;
import p449yi.AbstractC14437h;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a'\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u001a\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¨\u0006\u001a"}, m15073d2 = {"Lyi/h;", "serializer", "", "actualSerializer", "", "classDiscriminator", "", "f", "Laj/h;", "kind", "b", "T", "Lkotlinx/serialization/json/e;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "d", "(Lkotlinx/serialization/json/e;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "type", "Lkotlinx/serialization/json/JsonObject;", "jsonTree", "", "e", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/Json;", "json", "c", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cj.l0 */
/* loaded from: classes8.dex */
public final class C4051l0 {
    /* renamed from: b */
    public static final void m32936b(AbstractC1429h kind) {
        C9971q.m14633g(kind, "kind");
        if (kind instanceof AbstractC1429h.C1431b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        } else if (kind instanceof AbstractC1413e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        } else if (kind instanceof AbstractC1410d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    /* renamed from: c */
    public static final String m32935c(SerialDescriptor serialDescriptor, Json json) {
        C9971q.m14633g(serialDescriptor, "<this>");
        C9971q.m14633g(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof AbstractC10270b) {
                return ((AbstractC10270b) annotation).discriminator();
            }
        }
        return json.m13765e().m13741c();
    }

    /* renamed from: d */
    public static final <T> T m32934d(AbstractC10273e eVar, DeserializationStrategy<? extends T> deserializer) {
        String str;
        JsonPrimitive k;
        C9971q.m14633g(eVar, "<this>");
        C9971q.m14633g(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC3623b) || eVar.mo13730d().m13765e().m13732l()) {
            return (T) deserializer.deserialize(eVar);
        }
        String c = m32935c(deserializer.getDescriptor(), eVar.mo13730d());
        JsonElement g = eVar.mo13729g();
        SerialDescriptor descriptor = deserializer.getDescriptor();
        if (g instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) g;
            JsonElement jsonElement = (JsonElement) jsonObject.get(c);
            if (jsonElement == null || (k = C10274f.m13718k(jsonElement)) == null) {
                str = null;
            } else {
                str = k.mo13692a();
            }
            DeserializationStrategy<T> c2 = ((AbstractC3623b) deserializer).mo13932c(eVar, str);
            if (c2 != null) {
                return (T) C4068s0.m32888b(eVar.mo13730d(), c, jsonObject, c2);
            }
            m32933e(str, jsonObject);
            throw new C11075i();
        }
        throw C4025a0.m33034d(-1, "Expected " + C9951f0.m14684b(JsonObject.class) + " as the serialized body of " + descriptor.mo13676i() + ", but had " + C9951f0.m14684b(g.getClass()));
    }

    /* renamed from: e */
    public static final Void m32933e(String str, JsonObject jsonTree) {
        String str2;
        C9971q.m14633g(jsonTree, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw C4025a0.m33033e(-1, "Polymorphic serializer was not found for " + str2, jsonTree.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m32932f(AbstractC14437h<?> hVar, AbstractC14437h<Object> hVar2, String str) {
        if ((hVar instanceof SealedClassSerializer) && C3680n0.m33820a(hVar2.getDescriptor()).contains(str)) {
            String i = hVar.getDescriptor().mo13676i();
            String i2 = hVar2.getDescriptor().mo13676i();
            throw new IllegalStateException(("Sealed class '" + i2 + "' cannot be serialized as base class '" + i + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
