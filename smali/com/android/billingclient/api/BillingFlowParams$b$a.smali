.class public Lcom/android/billingclient/api/BillingFlowParams$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/BillingFlowParams$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/android/billingclient/api/ProductDetails;

.field private b:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Lu2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic d(Lcom/android/billingclient/api/BillingFlowParams$b$a;)Lcom/android/billingclient/api/ProductDetails;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/BillingFlowParams$b$a;->a:Lcom/android/billingclient/api/ProductDetails;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/android/billingclient/api/BillingFlowParams$b$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/BillingFlowParams$b$a;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/BillingFlowParams$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$b$a;->a:Lcom/android/billingclient/api/ProductDetails;

    .line 2
    .line 3
    const-string v1, "ProductDetails is required for constructing ProductDetailsParams."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lra/t;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$b$a;->b:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "offerToken is required for constructing ProductDetailsParams."

    .line 11
    .line 12
    invoke-static {v0, v1}, Lra/t;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/android/billingclient/api/BillingFlowParams$b;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, v1}, Lcom/android/billingclient/api/BillingFlowParams$b;-><init>(Lcom/android/billingclient/api/BillingFlowParams$b$a;Lu2/l;)V

    .line 19
    .line 20
    .line 21
    return-object v0
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
.end method

.method public b(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$b$a;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$b$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Lcom/android/billingclient/api/ProductDetails;)Lcom/android/billingclient/api/BillingFlowParams$b$a;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$b$a;->a:Lcom/android/billingclient/api/ProductDetails;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->b()Lcom/android/billingclient/api/ProductDetails$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->b()Lcom/android/billingclient/api/ProductDetails$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->b()Lcom/android/billingclient/api/ProductDetails$a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$a;->d()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$b$a;->b:Ljava/lang/String;

    .line 25
    .line 26
    :cond_0
    return-object p0
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
.end method
