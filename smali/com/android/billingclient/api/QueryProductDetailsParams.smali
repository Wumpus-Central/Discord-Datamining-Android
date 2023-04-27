.class public final Lcom/android/billingclient/api/QueryProductDetailsParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/QueryProductDetailsParams$a;,
        Lcom/android/billingclient/api/QueryProductDetailsParams$b;
    }
.end annotation


# instance fields
.field private final a:Lsa/b0;


# direct methods
.method synthetic constructor <init>(Lcom/android/billingclient/api/QueryProductDetailsParams$a;Lv2/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/android/billingclient/api/QueryProductDetailsParams$a;->c(Lcom/android/billingclient/api/QueryProductDetailsParams$a;)Lsa/b0;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/QueryProductDetailsParams;->a:Lsa/b0;

    return-void
.end method

.method public static a()Lcom/android/billingclient/api/QueryProductDetailsParams$a;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/QueryProductDetailsParams$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/QueryProductDetailsParams$a;-><init>(Lv2/u;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lsa/b0;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/QueryProductDetailsParams;->a:Lsa/b0;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/QueryProductDetailsParams;->a:Lsa/b0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/QueryProductDetailsParams$b;

    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryProductDetailsParams$b;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
