.class final enum Lnet/time4j/tz/model/k;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/time4j/tz/model/k;",
        ">;",
        "Ljava/util/Comparator<",
        "Lnet/time4j/tz/model/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lnet/time4j/tz/model/k;

.field private static final synthetic l:[Lnet/time4j/tz/model/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/time4j/tz/model/k;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/time4j/tz/model/k;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/time4j/tz/model/k;->k:Lnet/time4j/tz/model/k;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lnet/time4j/tz/model/k;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lnet/time4j/tz/model/k;->l:[Lnet/time4j/tz/model/k;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/time4j/tz/model/k;
    .locals 1

    const-class v0, Lnet/time4j/tz/model/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/time4j/tz/model/k;

    return-object p0
.end method

.method public static values()[Lnet/time4j/tz/model/k;
    .locals 1

    sget-object v0, Lnet/time4j/tz/model/k;->l:[Lnet/time4j/tz/model/k;

    invoke-virtual {v0}, [Lnet/time4j/tz/model/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/time4j/tz/model/k;

    return-object v0
.end method


# virtual methods
.method public a(Lnet/time4j/tz/model/d;Lnet/time4j/tz/model/d;)I
    .locals 2

    .line 1
    const/16 v0, 0x7d0

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lnet/time4j/tz/model/d;->b(I)Lnet/time4j/f0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p2, v0}, Lnet/time4j/tz/model/d;->b(I)Lnet/time4j/f0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v1, v0}, Lfj/m;->Q(Lfj/m;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lnet/time4j/tz/model/d;->f()Lnet/time4j/g0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p2}, Lnet/time4j/tz/model/d;->f()Lnet/time4j/g0;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1, p2}, Lnet/time4j/g0;->q0(Lnet/time4j/g0;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :cond_0
    return v0
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
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lnet/time4j/tz/model/d;

    check-cast p2, Lnet/time4j/tz/model/d;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/tz/model/k;->a(Lnet/time4j/tz/model/d;Lnet/time4j/tz/model/d;)I

    move-result p1

    return p1
.end method
