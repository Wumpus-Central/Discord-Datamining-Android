.class public Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/SubscribeOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lya/i;

.field private b:Lya/a;

.field private c:Lya/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lya/i;->s:Lya/i;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->a:Lya/i;

    .line 7
    .line 8
    sget-object v0, Lya/a;->q:Lya/a;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->b:Lya/a;

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
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
.end method


# virtual methods
.method public a()Lcom/google/android/gms/nearby/messages/SubscribeOptions;
    .locals 8

    new-instance v7, Lcom/google/android/gms/nearby/messages/SubscribeOptions;

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->a:Lya/i;

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->b:Lya/a;

    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->c:Lya/j;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/nearby/messages/SubscribeOptions;-><init>(Lya/i;Lya/a;Lya/j;ZILya/o;)V

    return-object v7
.end method

.method public b(Lya/i;)Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->a:Lya/i;

    return-object p0
.end method
