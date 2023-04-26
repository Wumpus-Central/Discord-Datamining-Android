.class public final enum Lcom/facebook/hermes/intl/c$i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/hermes/intl/c$i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lcom/facebook/hermes/intl/c$i;

.field public static final enum l:Lcom/facebook/hermes/intl/c$i;

.field public static final enum m:Lcom/facebook/hermes/intl/c$i;

.field private static final synthetic n:[Lcom/facebook/hermes/intl/c$i;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/facebook/hermes/intl/c$i;

    .line 2
    .line 3
    const-string v1, "SHORT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/c$i;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/facebook/hermes/intl/c$i;->k:Lcom/facebook/hermes/intl/c$i;

    .line 10
    .line 11
    new-instance v1, Lcom/facebook/hermes/intl/c$i;

    .line 12
    .line 13
    const-string v3, "NARROW"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lcom/facebook/hermes/intl/c$i;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/facebook/hermes/intl/c$i;->l:Lcom/facebook/hermes/intl/c$i;

    .line 20
    .line 21
    new-instance v3, Lcom/facebook/hermes/intl/c$i;

    .line 22
    .line 23
    const-string v5, "LONG"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lcom/facebook/hermes/intl/c$i;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/facebook/hermes/intl/c$i;->m:Lcom/facebook/hermes/intl/c$i;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lcom/facebook/hermes/intl/c$i;

    .line 33
    .line 34
    aput-object v0, v5, v2

    .line 35
    .line 36
    aput-object v1, v5, v4

    .line 37
    .line 38
    aput-object v3, v5, v6

    .line 39
    .line 40
    sput-object v5, Lcom/facebook/hermes/intl/c$i;->n:[Lcom/facebook/hermes/intl/c$i;

    .line 41
    .line 42
    return-void
    .line 43
    .line 44
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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/hermes/intl/c$i;
    .locals 1

    const-class v0, Lcom/facebook/hermes/intl/c$i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/hermes/intl/c$i;

    return-object p0
.end method

.method public static values()[Lcom/facebook/hermes/intl/c$i;
    .locals 1

    sget-object v0, Lcom/facebook/hermes/intl/c$i;->n:[Lcom/facebook/hermes/intl/c$i;

    invoke-virtual {v0}, [Lcom/facebook/hermes/intl/c$i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/hermes/intl/c$i;

    return-object v0
.end method


# virtual methods
.method public a()Landroid/icu/text/MeasureFormat$FormatWidth;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/c$a;->e:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lg5/e;->a()Landroid/icu/text/MeasureFormat$FormatWidth;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-static {}, Lg5/c;->a()Landroid/icu/text/MeasureFormat$FormatWidth;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_1
    invoke-static {}, Lg5/d;->a()Landroid/icu/text/MeasureFormat$FormatWidth;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/c$a;->e:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const-string v0, "long"

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    const-string v0, "narrow"

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_2
    const-string v0, "short"

    .line 31
    .line 32
    return-object v0
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
.end method
