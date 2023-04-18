.class public Lad/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lad/b$b;
    }
.end annotation


# static fields
.field private static final a:Lad/a;

.field private static volatile b:Lad/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lad/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lad/b$b;-><init>(Lad/b$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lad/b;->a:Lad/a;

    .line 8
    .line 9
    sput-object v0, Lad/b;->b:Lad/a;

    .line 10
    .line 11
    return-void
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

.method public static a()Lad/a;
    .locals 1

    sget-object v0, Lad/b;->b:Lad/a;

    return-object v0
.end method
