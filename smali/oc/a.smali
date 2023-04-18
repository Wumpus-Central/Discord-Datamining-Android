.class public final Loc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loc/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Loc/d$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Loc/d$a;->k:Loc/d$a;

    .line 5
    .line 6
    iput-object v0, p0, Loc/a;->b:Loc/d$a;

    .line 7
    .line 8
    return-void
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

.method public static b()Loc/a;
    .locals 1

    new-instance v0, Loc/a;

    invoke-direct {v0}, Loc/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Loc/d;
    .locals 3

    new-instance v0, Loc/a$a;

    iget v1, p0, Loc/a;->a:I

    iget-object v2, p0, Loc/a;->b:Loc/d$a;

    invoke-direct {v0, v1, v2}, Loc/a$a;-><init>(ILoc/d$a;)V

    return-object v0
.end method

.method public c(I)Loc/a;
    .locals 0

    iput p1, p0, Loc/a;->a:I

    return-object p0
.end method
