.class public final Lcom/discord/billing/types/SkuDetailsParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/billing/types/SkuDetailsParams;",
        "",
        "()V",
        "create",
        "Lcom/android/billingclient/api/SkuDetailsParams;",
        "skuType",
        "Lcom/discord/billing/types/SkuType;",
        "skuIds",
        "",
        "",
        "billing_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/billing/types/SkuDetailsParams;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/billing/types/SkuDetailsParams;

    invoke-direct {v0}, Lcom/discord/billing/types/SkuDetailsParams;-><init>()V

    sput-object v0, Lcom/discord/billing/types/SkuDetailsParams;->INSTANCE:Lcom/discord/billing/types/SkuDetailsParams;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/discord/billing/types/SkuType;Ljava/util/List;)Lcom/android/billingclient/api/SkuDetailsParams;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/billing/types/SkuType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/android/billingclient/api/SkuDetailsParams;"
        }
    .end annotation

    .line 1
    const-string v0, "skuType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "skuIds"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/android/billingclient/api/SkuDetailsParams;->c()Lcom/android/billingclient/api/SkuDetailsParams$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Lcom/discord/billing/types/SkuType;->getRawType()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/SkuDetailsParams$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetailsParams$a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/SkuDetailsParams$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/SkuDetailsParams$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/android/billingclient/api/SkuDetailsParams$a;->a()Lcom/android/billingclient/api/SkuDetailsParams;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string p2, "newBuilder()\n           \u2026Ids)\n            .build()"

    .line 32
    .line 33
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p1
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
    .line 67
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
.end method
