.class public final synthetic Lcom/android/billingclient/api/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/a;

.field public final synthetic b:Lcom/android/billingclient/api/QueryProductDetailsParams;

.field public final synthetic c:Lu2/d;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/a;Lcom/android/billingclient/api/QueryProductDetailsParams;Lu2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/t;->a:Lcom/android/billingclient/api/a;

    iput-object p2, p0, Lcom/android/billingclient/api/t;->b:Lcom/android/billingclient/api/QueryProductDetailsParams;

    iput-object p3, p0, Lcom/android/billingclient/api/t;->c:Lu2/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/t;->a:Lcom/android/billingclient/api/a;

    iget-object v1, p0, Lcom/android/billingclient/api/t;->b:Lcom/android/billingclient/api/QueryProductDetailsParams;

    iget-object v2, p0, Lcom/android/billingclient/api/t;->c:Lu2/d;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/a;->F(Lcom/android/billingclient/api/QueryProductDetailsParams;Lu2/d;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
