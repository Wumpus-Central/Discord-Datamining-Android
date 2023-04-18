.class public final Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/common/mapbuffer/MapBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;",
        "",
        "()V",
        "KEY_RANGE",
        "Lkotlin/ranges/IntRange;",
        "getKEY_RANGE$ReactAndroid_release",
        "()Lkotlin/ranges/IntRange;",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;

.field private static final KEY_RANGE:Lkotlin/ranges/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;->$$INSTANCE:Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;

    .line 7
    .line 8
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const v2, 0xffff

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;->KEY_RANGE:Lkotlin/ranges/IntRange;

    .line 18
    .line 19
    return-void
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getKEY_RANGE$ReactAndroid_release()Lkotlin/ranges/IntRange;
    .locals 1

    sget-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;->KEY_RANGE:Lkotlin/ranges/IntRange;

    return-object v0
.end method
