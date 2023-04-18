.class public abstract Lcj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwi/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcj/a$a;,
        Lcj/a$b;,
        Lcj/a$c;,
        Lcj/a$d;,
        Lcj/a$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0001\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00192\u00020\u0001:\u0005\u0011\u0019\u001a\u000e\tB\u001b\u0008\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J7\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u0082\u0001\u0001\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcj/a;",
        "Lwi/e;",
        "T",
        "Lwi/h;",
        "serializer",
        "value",
        "",
        "",
        "",
        "e",
        "(Lwi/h;Ljava/lang/Object;)Ljava/util/Map;",
        "Lkotlinx/serialization/DeserializationStrategy;",
        "deserializer",
        "map",
        "d",
        "(Lkotlinx/serialization/DeserializationStrategy;Ljava/util/Map;)Ljava/lang/Object;",
        "Lbj/c;",
        "a",
        "Lbj/c;",
        "()Lbj/c;",
        "serializersModule",
        "",
        "ctorMarker",
        "<init>",
        "(Lbj/c;Ljava/lang/Void;)V",
        "b",
        "c",
        "Lcj/a$a;",
        "kotlinx-serialization-properties"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:Lcj/a$a;


# instance fields
.field private final a:Lbj/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcj/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcj/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcj/a;->b:Lcj/a$a;

    return-void
.end method

.method private constructor <init>(Lbj/c;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcj/a;->a:Lbj/c;

    return-void
.end method

.method public synthetic constructor <init>(Lbj/c;Ljava/lang/Void;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcj/a;-><init>(Lbj/c;Ljava/lang/Void;)V

    return-void
.end method


# virtual methods
.method public a()Lbj/c;
    .locals 1

    iget-object v0, p0, Lcj/a;->a:Lbj/c;

    return-object v0
.end method

.method public final d(Lkotlinx/serialization/DeserializationStrategy;Ljava/util/Map;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/serialization/DeserializationStrategy<",
            "+TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)TT;"
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
    const-string v0, "map"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcj/a$c;

    .line 12
    .line 13
    invoke-interface {p1}, Lkotlinx/serialization/DeserializationStrategy;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, p0, p2, v1}, Lcj/a$c;-><init>(Lcj/a;Ljava/util/Map;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcj/a$b;->C(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
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

.method public final e(Lwi/h;Ljava/lang/Object;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwi/h<",
            "-TT;>;TT;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
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
    new-instance v0, Lcj/a$d;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcj/a$d;-><init>(Lcj/a;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lcj/a$e;->q(Lwi/h;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcj/a$e;->k0()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
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
