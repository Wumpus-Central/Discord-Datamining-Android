.class final Lnet/time4j/calendar/m;
.super Lfj/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lfj/e<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field static final k:Lnet/time4j/calendar/m;

.field private static final serialVersionUID:J = -0xf809c43c4f2116aL


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnet/time4j/calendar/m;

    invoke-direct {v0}, Lnet/time4j/calendar/m;-><init>()V

    sput-object v0, Lnet/time4j/calendar/m;->k:Lnet/time4j/calendar/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "RELATED_GREGORIAN_YEAR"

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


# virtual methods
.method public G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/m;->y()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()C
    .locals 1

    const/16 v0, 0x72

    return v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/m;->x()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/lang/Integer;

    return-object v0
.end method

.method protected readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/m;->k:Lnet/time4j/calendar/m;

    return-object v0
.end method

.method protected w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x()Ljava/lang/Integer;
    .locals 1

    const v0, 0x3b9ac9ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public y()Ljava/lang/Integer;
    .locals 1

    const v0, -0x3b9ac9ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
