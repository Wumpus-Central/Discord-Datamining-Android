.class final enum Lcom/facebook/datasource/a$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/datasource/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/datasource/a$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lcom/facebook/datasource/a$d;

.field public static final enum l:Lcom/facebook/datasource/a$d;

.field public static final enum m:Lcom/facebook/datasource/a$d;

.field private static final synthetic n:[Lcom/facebook/datasource/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/facebook/datasource/a$d;

    .line 2
    .line 3
    const-string v1, "IN_PROGRESS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/facebook/datasource/a$d;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/facebook/datasource/a$d;->k:Lcom/facebook/datasource/a$d;

    .line 10
    .line 11
    new-instance v1, Lcom/facebook/datasource/a$d;

    .line 12
    .line 13
    const-string v3, "SUCCESS"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lcom/facebook/datasource/a$d;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/facebook/datasource/a$d;->l:Lcom/facebook/datasource/a$d;

    .line 20
    .line 21
    new-instance v3, Lcom/facebook/datasource/a$d;

    .line 22
    .line 23
    const-string v5, "FAILURE"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lcom/facebook/datasource/a$d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/facebook/datasource/a$d;->m:Lcom/facebook/datasource/a$d;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lcom/facebook/datasource/a$d;

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
    sput-object v5, Lcom/facebook/datasource/a$d;->n:[Lcom/facebook/datasource/a$d;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/datasource/a$d;
    .locals 1

    const-class v0, Lcom/facebook/datasource/a$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/datasource/a$d;

    return-object p0
.end method

.method public static values()[Lcom/facebook/datasource/a$d;
    .locals 1

    sget-object v0, Lcom/facebook/datasource/a$d;->n:[Lcom/facebook/datasource/a$d;

    invoke-virtual {v0}, [Lcom/facebook/datasource/a$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/datasource/a$d;

    return-object v0
.end method
