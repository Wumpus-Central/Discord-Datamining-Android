.class public final Lnet/time4j/w0;
.super Lfj/f;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/u;
.implements Ljava/io/Serializable;


# static fields
.field public static final k:Lnet/time4j/w0;

.field private static final serialVersionUID:J = -0x4520d4f79dfcd6cbL


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnet/time4j/w0;

    invoke-direct {v0}, Lnet/time4j/w0;-><init>()V

    sput-object v0, Lnet/time4j/w0;->k:Lnet/time4j/w0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lfj/f;-><init>()V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lnet/time4j/w0;->k:Lnet/time4j/w0;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()C
    .locals 1

    const/16 v0, 0x59

    return v0
.end method

.method protected c(Lfj/x;)Lfj/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/x<",
            "TT;>;)",
            "Lfj/m0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/x;->x(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lnet/time4j/a1;->O()Lfj/m0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
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
.end method

.method public getLength()D
    .locals 2

    sget-object v0, Lnet/time4j/f;->n:Lnet/time4j/f;

    invoke-interface {v0}, Lfj/w;->getLength()D

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WEEK_BASED_YEARS"

    return-object v0
.end method
