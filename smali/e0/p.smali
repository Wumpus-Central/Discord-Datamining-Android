.class public Le0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Le0/p;


# instance fields
.field private final a:Le0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le0/p;

    const-string v1, "1.1.0"

    invoke-direct {v0, v1}, Le0/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Le0/p;->b:Le0/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Le0/o;->j(Ljava/lang/String;)Le0/o;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Le0/p;->a:Le0/o;

    .line 9
    .line 10
    return-void
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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
.end method

.method public static a()Le0/p;
    .locals 1

    sget-object v0, Le0/p;->b:Le0/p;

    return-object v0
.end method


# virtual methods
.method public b()Le0/o;
    .locals 1

    iget-object v0, p0, Le0/p;->a:Le0/o;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le0/p;->a:Le0/o;

    invoke-virtual {v0}, Le0/o;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
