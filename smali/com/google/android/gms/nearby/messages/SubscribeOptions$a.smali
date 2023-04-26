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
.field private a:Lxa/i;

.field private b:Lxa/a;

.field private c:Lxa/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lxa/i;->s:Lxa/i;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->a:Lxa/i;

    .line 7
    .line 8
    sget-object v0, Lxa/a;->q:Lxa/a;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->b:Lxa/a;

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
.end method


# virtual methods
.method public a()Lcom/google/android/gms/nearby/messages/SubscribeOptions;
    .locals 8

    new-instance v7, Lcom/google/android/gms/nearby/messages/SubscribeOptions;

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->a:Lxa/i;

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->b:Lxa/a;

    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->c:Lxa/j;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/nearby/messages/SubscribeOptions;-><init>(Lxa/i;Lxa/a;Lxa/j;ZILxa/o;)V

    return-object v7
.end method

.method public b(Lxa/i;)Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->a:Lxa/i;

    return-object p0
.end method
