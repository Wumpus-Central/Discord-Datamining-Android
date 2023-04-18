.class final Lnet/time4j/q0;
.super Lfj/e;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lfj/e<",
        "Lnet/time4j/g0;",
        ">;",
        "Lnet/time4j/u0;"
    }
.end annotation


# static fields
.field static final k:Lnet/time4j/q0;

.field private static final serialVersionUID:J = -0x33849585978fb8e4L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnet/time4j/q0;

    invoke-direct {v0}, Lnet/time4j/q0;-><init>()V

    sput-object v0, Lnet/time4j/q0;->k:Lnet/time4j/q0;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "WALL_TIME"

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

    sget-object v0, Lnet/time4j/q0;->k:Lnet/time4j/q0;

    return-object v0
.end method


# virtual methods
.method public G()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/q0;->y()Lnet/time4j/g0;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/q0;->x()Lnet/time4j/g0;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/time4j/g0;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/time4j/g0;

    return-object v0
.end method

.method protected w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x()Lnet/time4j/g0;
    .locals 3

    const/16 v0, 0x3b

    const v1, 0x3b9ac9ff

    const/16 v2, 0x17

    invoke-static {v2, v0, v0, v1}, Lnet/time4j/g0;->M0(IIII)Lnet/time4j/g0;

    move-result-object v0

    return-object v0
.end method

.method public y()Lnet/time4j/g0;
    .locals 1

    sget-object v0, Lnet/time4j/g0;->w:Lnet/time4j/g0;

    return-object v0
.end method
