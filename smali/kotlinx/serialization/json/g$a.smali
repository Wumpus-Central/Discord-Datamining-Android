.class final Lkotlinx/serialization/json/g$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/serialization/json/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lyi/a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lyi/a;",
        "",
        "a",
        "(Lyi/a;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final k:Lkotlinx/serialization/json/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/serialization/json/g$a;

    invoke-direct {v0}, Lkotlinx/serialization/json/g$a;-><init>()V

    sput-object v0, Lkotlinx/serialization/json/g$a;->k:Lkotlinx/serialization/json/g$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lyi/a;)V
    .locals 8

    .line 1
    const-string v0, "$this$buildSerialDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v2, "JsonPrimitive"

    .line 7
    .line 8
    sget-object v0, Lkotlinx/serialization/json/g$a$a;->k:Lkotlinx/serialization/json/g$a$a;

    .line 9
    .line 10
    invoke-static {v0}, Lkotlinx/serialization/json/h;->a(Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/16 v6, 0xc

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    move-object v1, p1

    .line 20
    invoke-static/range {v1 .. v7}, Lyi/a;->b(Lyi/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;ZILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const-string v2, "JsonNull"

    .line 24
    .line 25
    sget-object v0, Lkotlinx/serialization/json/g$a$b;->k:Lkotlinx/serialization/json/g$a$b;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlinx/serialization/json/h;->a(Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static/range {v1 .. v7}, Lyi/a;->b(Lyi/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;ZILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const-string v2, "JsonLiteral"

    .line 35
    .line 36
    sget-object v0, Lkotlinx/serialization/json/g$a$c;->k:Lkotlinx/serialization/json/g$a$c;

    .line 37
    .line 38
    invoke-static {v0}, Lkotlinx/serialization/json/h;->a(Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static/range {v1 .. v7}, Lyi/a;->b(Lyi/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;ZILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-string v2, "JsonObject"

    .line 46
    .line 47
    sget-object v0, Lkotlinx/serialization/json/g$a$d;->k:Lkotlinx/serialization/json/g$a$d;

    .line 48
    .line 49
    invoke-static {v0}, Lkotlinx/serialization/json/h;->a(Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static/range {v1 .. v7}, Lyi/a;->b(Lyi/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;ZILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const-string v2, "JsonArray"

    .line 57
    .line 58
    sget-object v0, Lkotlinx/serialization/json/g$a$e;->k:Lkotlinx/serialization/json/g$a$e;

    .line 59
    .line 60
    invoke-static {v0}, Lkotlinx/serialization/json/h;->a(Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static/range {v1 .. v7}, Lyi/a;->b(Lyi/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;ZILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lyi/a;

    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/g$a;->a(Lyi/a;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
