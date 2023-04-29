.class public final Lcom/discord/billing/types/QueryProductDetailsParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/billing/types/QueryProductDetailsParams;",
        "",
        "()V",
        "create",
        "Lcom/android/billingclient/api/QueryProductDetailsParams;",
        "productType",
        "Lcom/discord/billing/types/ProductType;",
        "productIds",
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
.field public static final INSTANCE:Lcom/discord/billing/types/QueryProductDetailsParams;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/billing/types/QueryProductDetailsParams;

    invoke-direct {v0}, Lcom/discord/billing/types/QueryProductDetailsParams;-><init>()V

    sput-object v0, Lcom/discord/billing/types/QueryProductDetailsParams;->INSTANCE:Lcom/discord/billing/types/QueryProductDetailsParams;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/discord/billing/types/ProductType;Ljava/util/List;)Lcom/android/billingclient/api/QueryProductDetailsParams;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/billing/types/ProductType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/android/billingclient/api/QueryProductDetailsParams;"
        }
    .end annotation

    .line 1
    const-string v0, "productType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "productIds"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {}, Lcom/android/billingclient/api/QueryProductDetailsParams$b;->a()Lcom/android/billingclient/api/QueryProductDetailsParams$b$a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2, v1}, Lcom/android/billingclient/api/QueryProductDetailsParams$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/QueryProductDetailsParams$b$a;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p1}, Lcom/discord/billing/types/ProductType;->getRawProductType()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/QueryProductDetailsParams$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/QueryProductDetailsParams$b$a;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Lcom/android/billingclient/api/QueryProductDetailsParams$b$a;->a()Lcom/android/billingclient/api/QueryProductDetailsParams$b;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "newBuilder()\n           \u2026                 .build()"

    .line 53
    .line 54
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {}, Lcom/android/billingclient/api/QueryProductDetailsParams;->a()Lcom/android/billingclient/api/QueryProductDetailsParams$a;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/QueryProductDetailsParams$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/QueryProductDetailsParams$a;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string p2, "newBuilder().setProductList(productList)"

    .line 70
    .line 71
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/android/billingclient/api/QueryProductDetailsParams$a;->a()Lcom/android/billingclient/api/QueryProductDetailsParams;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string p2, "params.build()"

    .line 79
    .line 80
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object p1
.end method
