.class public final synthetic Lcom/android/billingclient/api/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/a;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lv2/g;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lv2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/s;->a:Lcom/android/billingclient/api/a;

    iput-object p2, p0, Lcom/android/billingclient/api/s;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/s;->c:Ljava/util/List;

    iput-object p5, p0, Lcom/android/billingclient/api/s;->d:Lv2/g;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/android/billingclient/api/s;->a:Lcom/android/billingclient/api/a;

    iget-object v1, p0, Lcom/android/billingclient/api/s;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/android/billingclient/api/s;->c:Ljava/util/List;

    iget-object v3, p0, Lcom/android/billingclient/api/s;->d:Lv2/g;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lcom/android/billingclient/api/a;->G(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lv2/g;)Ljava/lang/Object;

    return-object v4
.end method
