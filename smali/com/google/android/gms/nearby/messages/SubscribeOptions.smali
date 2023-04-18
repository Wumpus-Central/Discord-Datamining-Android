.class public final Lcom/google/android/gms/nearby/messages/SubscribeOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/google/android/gms/nearby/messages/SubscribeOptions;


# instance fields
.field private final a:Lxa/i;

.field private final b:Lxa/a;

.field private final c:Lxa/j;

.field public final d:Z

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/SubscribeOptions$a;->a()Lcom/google/android/gms/nearby/messages/SubscribeOptions;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->f:Lcom/google/android/gms/nearby/messages/SubscribeOptions;

    return-void
.end method

.method synthetic constructor <init>(Lxa/i;Lxa/a;Lxa/j;ZILxa/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->a:Lxa/i;

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->b:Lxa/a;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->c:Lxa/j;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->d:Z

    iput p1, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->e:I

    return-void
.end method


# virtual methods
.method public a()Lxa/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->c:Lxa/j;

    return-object v0
.end method

.method public b()Lxa/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->b:Lxa/a;

    return-object v0
.end method

.method public c()Lxa/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->a:Lxa/i;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->a:Lxa/i;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->b:Lxa/a;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SubscribeOptions{strategy="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", filter="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
