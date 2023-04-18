.class final Lnet/time4j/h;
.super Lfj/e;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lfj/e<",
        "Lnet/time4j/f0;",
        ">;",
        "Lnet/time4j/e;"
    }
.end annotation


# static fields
.field static final k:Lnet/time4j/h;

.field private static final serialVersionUID:J = -0x5a7b55ff2ce1b515L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnet/time4j/h;

    invoke-direct {v0}, Lnet/time4j/h;-><init>()V

    sput-object v0, Lnet/time4j/h;->k:Lnet/time4j/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "CALENDAR_DATE"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lfj/e;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lnet/time4j/h;->k:Lnet/time4j/h;

    return-object v0
.end method


# virtual methods
.method public G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/h;->y()Lnet/time4j/f0;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/h;->x()Lnet/time4j/f0;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/time4j/f0;

    return-object v0
.end method

.method protected w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x()Lnet/time4j/f0;
    .locals 1

    sget-object v0, Lnet/time4j/f0;->o:Lnet/time4j/f0;

    return-object v0
.end method

.method public y()Lnet/time4j/f0;
    .locals 1

    sget-object v0, Lnet/time4j/f0;->n:Lnet/time4j/f0;

    return-object v0
.end method
