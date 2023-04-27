.class public Lcom/android/billingclient/api/BillingFlowParams$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/BillingFlowParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/BillingFlowParams$c$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:I


# direct methods
.method synthetic constructor <init>(Lv2/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/BillingFlowParams$c;->b:I

    return-void
.end method

.method public static a()Lcom/android/billingclient/api/BillingFlowParams$c$a;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/BillingFlowParams$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$c$a;-><init>(Lv2/m;)V

    return-object v0
.end method

.method static bridge synthetic c(Lcom/android/billingclient/api/BillingFlowParams$c;)Lcom/android/billingclient/api/BillingFlowParams$c$a;
    .locals 2

    .line 1
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams$c;->a()Lcom/android/billingclient/api/BillingFlowParams$c$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/android/billingclient/api/BillingFlowParams$c;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$c$a;

    .line 8
    .line 9
    .line 10
    iget p0, p0, Lcom/android/billingclient/api/BillingFlowParams$c;->b:I

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lcom/android/billingclient/api/BillingFlowParams$c$a;->e(I)Lcom/android/billingclient/api/BillingFlowParams$c$a;

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
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
.end method

.method static bridge synthetic e(Lcom/android/billingclient/api/BillingFlowParams$c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$c;->a:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic f(Lcom/android/billingclient/api/BillingFlowParams$c;I)V
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/BillingFlowParams$c;->b:I

    return-void
.end method


# virtual methods
.method final b()I
    .locals 1

    iget v0, p0, Lcom/android/billingclient/api/BillingFlowParams$c;->b:I

    return v0
.end method

.method final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$c;->a:Ljava/lang/String;

    return-object v0
.end method
