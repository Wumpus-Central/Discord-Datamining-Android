.class public Lcom/facebook/react/jstasks/NoRetryPolicy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;


# static fields
.field public static final INSTANCE:Lcom/facebook/react/jstasks/NoRetryPolicy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/jstasks/NoRetryPolicy;

    invoke-direct {v0}, Lcom/facebook/react/jstasks/NoRetryPolicy;-><init>()V

    sput-object v0, Lcom/facebook/react/jstasks/NoRetryPolicy;->INSTANCE:Lcom/facebook/react/jstasks/NoRetryPolicy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canRetry()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public copy()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;
    .locals 0

    return-object p0
.end method

.method public getDelay()I
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Should not retrieve delay as canRetry is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/jstasks/NoRetryPolicy;->canRetry()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public update()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Should not update as canRetry is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/jstasks/NoRetryPolicy;->canRetry()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
