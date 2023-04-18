.class public final synthetic Lcom/android/billingclient/api/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/a;

.field public final synthetic b:Lu2/b;

.field public final synthetic c:Lu2/c;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/a;Lu2/b;Lu2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/v;->a:Lcom/android/billingclient/api/a;

    iput-object p2, p0, Lcom/android/billingclient/api/v;->b:Lu2/b;

    iput-object p3, p0, Lcom/android/billingclient/api/v;->c:Lu2/c;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/v;->a:Lcom/android/billingclient/api/a;

    iget-object v1, p0, Lcom/android/billingclient/api/v;->b:Lu2/b;

    iget-object v2, p0, Lcom/android/billingclient/api/v;->c:Lu2/c;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/a;->E(Lu2/b;Lu2/c;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
