package p045cj;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9937j;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.json.C10271c;
import kotlinx.serialization.json.C10287m;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import nf.AbstractC11058c;
import nf.C11052a;
import nf.C11055b;
import nf.C11075i;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0006\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0006\u0010\u000e\u001a\u00020\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m15073d2 = {"Lcj/j0;", "", "Lkotlinx/serialization/json/JsonElement;", "i", "Lnf/c;", "", "h", "(Lnf/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "j", "g", "e", "Lcj/a;", "a", "Lcj/a;", "lexer", "b", "Z", "isLenient", "", "c", "I", "stackDepth", "Lkotlinx/serialization/json/c;", "configuration", "<init>", "(Lkotlinx/serialization/json/c;Lcj/a;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.j0 */
/* loaded from: classes8.dex */
public final class C4045j0 {

    /* renamed from: a */
    private final AbstractC4024a f6653a;

    /* renamed from: b */
    private final boolean f6654b;

    /* renamed from: c */
    private int f6655c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, m15073d2 = {"Lnf/c;", "", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m14701f = "JsonTreeReader.kt", m14700l = {112}, m14699m = "invokeSuspend")
    /* renamed from: cj.j0$a */
    /* loaded from: classes8.dex */
    public static final class C4046a extends AbstractC9937j implements Function3<AbstractC11058c<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {

        /* renamed from: l */
        int f6656l;

        /* renamed from: m */
        private /* synthetic */ Object f6657m;

        C4046a(Continuation<? super C4046a> continuation) {
            super(3, continuation);
        }

        /* renamed from: a */
        public final Object invoke(AbstractC11058c<Unit, JsonElement> cVar, Unit unit, Continuation<? super JsonElement> continuation) {
            C4046a aVar = new C4046a(continuation);
            aVar.f6657m = cVar;
            return aVar.invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C13080d.m4646d();
            int i = this.f6656l;
            if (i == 0) {
                C11093t.m10930b(obj);
                AbstractC11058c cVar = (AbstractC11058c) this.f6657m;
                byte E = C4045j0.this.f6653a.m33067E();
                if (E == 1) {
                    return C4045j0.this.m32944j(true);
                }
                if (E == 0) {
                    return C4045j0.this.m32944j(false);
                }
                if (E == 6) {
                    C4045j0 j0Var = C4045j0.this;
                    this.f6656l = 1;
                    obj = j0Var.m32946h(cVar, this);
                    if (obj == d) {
                        return d;
                    }
                } else if (E == 8) {
                    return C4045j0.this.m32948f();
                } else {
                    AbstractC4024a.m33039y(C4045j0.this.f6653a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new C11075i();
                }
            } else if (i == 1) {
                C11093t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (JsonElement) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "kotlinx.serialization.json.internal.JsonTreeReader", m14701f = "JsonTreeReader.kt", m14700l = {23}, m14699m = "readObject")
    /* renamed from: cj.j0$b */
    /* loaded from: classes8.dex */
    public static final class C4047b extends AbstractC9930d {

        /* renamed from: k */
        Object f6659k;

        /* renamed from: l */
        Object f6660l;

        /* renamed from: m */
        Object f6661m;

        /* renamed from: n */
        Object f6662n;

        /* renamed from: o */
        /* synthetic */ Object f6663o;

        /* renamed from: q */
        int f6665q;

        C4047b(Continuation<? super C4047b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            this.f6663o = obj;
            this.f6665q |= Integer.MIN_VALUE;
            return C4045j0.this.m32946h(null, this);
        }
    }

    public C4045j0(C10271c configuration, AbstractC4024a lexer) {
        C9971q.m14633g(configuration, "configuration");
        C9971q.m14633g(lexer, "lexer");
        this.f6653a = lexer;
        this.f6654b = configuration.m13731m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final JsonElement m32948f() {
        boolean z;
        int i;
        byte m = this.f6653a.mo32901m();
        if (this.f6653a.m33067E() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f6653a.mo32904f()) {
                arrayList.add(m32949e());
                m = this.f6653a.mo32901m();
                if (m != 4) {
                    AbstractC4024a aVar = this.f6653a;
                    if (m == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i = aVar.f6613a;
                    if (!z) {
                        AbstractC4024a.m33039y(aVar, "Expected end of the array or comma", i, null, 4, null);
                        throw new C11075i();
                    }
                }
            }
            if (m == 8) {
                this.f6653a.m33049n((byte) 9);
            } else if (m == 4) {
                AbstractC4024a.m33039y(this.f6653a, "Unexpected trailing comma", 0, null, 6, null);
                throw new C11075i();
            }
            return new JsonArray(arrayList);
        }
        AbstractC4024a.m33039y(this.f6653a, "Unexpected leading comma", 0, null, 6, null);
        throw new C11075i();
    }

    /* renamed from: g */
    private final JsonElement m32947g() {
        return (JsonElement) C11055b.m11032b(new C11052a(new C4046a(null)), Unit.f22042a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please submit an issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m32946h(nf.AbstractC11058c<kotlin.Unit, kotlinx.serialization.json.JsonElement> r21, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p045cj.C4045j0.m32946h(nf.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: i */
    private final JsonElement m32945i() {
        String str;
        byte n = this.f6653a.m33049n((byte) 6);
        if (this.f6653a.m33067E() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f6653a.mo32904f()) {
                    break;
                }
                if (this.f6654b) {
                    str = this.f6653a.m33045s();
                } else {
                    str = this.f6653a.m33047q();
                }
                this.f6653a.m33049n((byte) 5);
                linkedHashMap.put(str, m32949e());
                n = this.f6653a.mo32901m();
                if (n != 4) {
                    if (n != 7) {
                        AbstractC4024a.m33039y(this.f6653a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new C11075i();
                    }
                }
            }
            if (n == 6) {
                this.f6653a.m33049n((byte) 7);
            } else if (n == 4) {
                AbstractC4024a.m33039y(this.f6653a, "Unexpected trailing comma", 0, null, 6, null);
                throw new C11075i();
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractC4024a.m33039y(this.f6653a, "Unexpected leading comma", 0, null, 6, null);
        throw new C11075i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final JsonPrimitive m32944j(boolean z) {
        String str;
        if (this.f6654b || !z) {
            str = this.f6653a.m33045s();
        } else {
            str = this.f6653a.m33047q();
        }
        if (z || !C9971q.m14638b(str, "null")) {
            return new C10287m(str, z, null, 4, null);
        }
        return JsonNull.INSTANCE;
    }

    /* renamed from: e */
    public final JsonElement m32949e() {
        JsonElement jsonElement;
        byte E = this.f6653a.m33067E();
        if (E == 1) {
            return m32944j(true);
        }
        if (E == 0) {
            return m32944j(false);
        }
        if (E == 6) {
            int i = this.f6655c + 1;
            this.f6655c = i;
            if (i == 200) {
                jsonElement = m32947g();
            } else {
                jsonElement = m32945i();
            }
            this.f6655c--;
            return jsonElement;
        } else if (E == 8) {
            return m32948f();
        } else {
            AbstractC4024a.m33039y(this.f6653a, "Cannot begin reading element, unexpected token: " + ((int) E), 0, null, 6, null);
            throw new C11075i();
        }
    }
}
