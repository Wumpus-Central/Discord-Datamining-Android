.class public abstract Lkotlinx/serialization/json/Json;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwi/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/serialization/json/Json$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u0019\u0008\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\u0008#\u0010$J)\u0010\u0007\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J)\u0010\u000c\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u0010\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0019\u001a\u0004\u0008\u0013\u0010\u001aR \u0010\"\u001a\u00020\u001c8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u001d\u0012\u0004\u0008 \u0010!\u001a\u0004\u0008\u001e\u0010\u001f\u0082\u0001\u0002%&\u00a8\u0006\'"
    }
    d2 = {
        "Lkotlinx/serialization/json/Json;",
        "Lwi/m;",
        "T",
        "Lwi/h;",
        "serializer",
        "value",
        "",
        "c",
        "(Lwi/h;Ljava/lang/Object;)Ljava/lang/String;",
        "Lkotlinx/serialization/DeserializationStrategy;",
        "deserializer",
        "string",
        "b",
        "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;",
        "Lkotlinx/serialization/json/JsonElement;",
        "element",
        "d",
        "(Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;",
        "Lkotlinx/serialization/json/c;",
        "a",
        "Lkotlinx/serialization/json/c;",
        "e",
        "()Lkotlinx/serialization/json/c;",
        "configuration",
        "Lbj/c;",
        "Lbj/c;",
        "()Lbj/c;",
        "serializersModule",
        "Laj/u;",
        "Laj/u;",
        "f",
        "()Laj/u;",
        "get_schemaCache$kotlinx_serialization_json$annotations",
        "()V",
        "_schemaCache",
        "<init>",
        "(Lkotlinx/serialization/json/c;Lbj/c;)V",
        "Lkotlinx/serialization/json/Json$a;",
        "Lkotlinx/serialization/json/j;",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final d:Lkotlinx/serialization/json/Json$a;


# instance fields
.field private final a:Lkotlinx/serialization/json/c;

.field private final b:Lbj/c;

.field private final c:Laj/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/serialization/json/Json$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/Json$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlinx/serialization/json/Json;->d:Lkotlinx/serialization/json/Json$a;

    return-void
.end method

.method private constructor <init>(Lkotlinx/serialization/json/c;Lbj/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlinx/serialization/json/Json;->a:Lkotlinx/serialization/json/c;

    .line 3
    iput-object p2, p0, Lkotlinx/serialization/json/Json;->b:Lbj/c;

    .line 4
    new-instance p1, Laj/u;

    invoke-direct {p1}, Laj/u;-><init>()V

    iput-object p1, p0, Lkotlinx/serialization/json/Json;->c:Laj/u;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/serialization/json/c;Lbj/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lkotlinx/serialization/json/Json;-><init>(Lkotlinx/serialization/json/c;Lbj/c;)V

    return-void
.end method


# virtual methods
.method public a()Lbj/c;
    .locals 1

    iget-object v0, p0, Lkotlinx/serialization/json/Json;->b:Lbj/c;

    return-object v0
.end method

.method public final b(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/serialization/DeserializationStrategy<",
            "+TT;>;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "string"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Laj/q0;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Laj/q0;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Laj/n0;

    .line 17
    .line 18
    sget-object v3, Laj/t0;->m:Laj/t0;

    .line 19
    .line 20
    invoke-interface {p1}, Lkotlinx/serialization/DeserializationStrategy;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const/4 v6, 0x0

    .line 25
    move-object v1, p2

    .line 26
    move-object v2, p0

    .line 27
    move-object v4, v0

    .line 28
    invoke-direct/range {v1 .. v6}, Laj/n0;-><init>(Lkotlinx/serialization/json/Json;Laj/t0;Laj/a;Lkotlinx/serialization/descriptors/SerialDescriptor;Laj/n0$a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p1}, Laj/n0;->C(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0}, Laj/a;->w()V

    .line 36
    .line 37
    .line 38
    return-object p1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public final c(Lwi/h;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwi/h<",
            "-TT;>;TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Laj/f0;

    .line 7
    .line 8
    invoke-direct {v0}, Laj/f0;-><init>()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p0, v0, p1, p2}, Laj/e0;->a(Lkotlinx/serialization/json/Json;Laj/k0;Lwi/h;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Laj/f0;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {v0}, Laj/f0;->g()V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-virtual {v0}, Laj/f0;->g()V

    .line 24
    .line 25
    .line 26
    throw p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public final d(Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/serialization/DeserializationStrategy<",
            "+TT;>;",
            "Lkotlinx/serialization/json/JsonElement;",
            ")TT;"
        }
    .end annotation

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "element"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p2, p1}, Laj/s0;->a(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public final e()Lkotlinx/serialization/json/c;
    .locals 1

    iget-object v0, p0, Lkotlinx/serialization/json/Json;->a:Lkotlinx/serialization/json/c;

    return-object v0
.end method

.method public final f()Laj/u;
    .locals 1

    iget-object v0, p0, Lkotlinx/serialization/json/Json;->c:Laj/u;

    return-object v0
.end method
