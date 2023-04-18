.class public final Lsh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmg/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmg/a$a<",
            "Lsh/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsh/d$a;

    invoke-direct {v0}, Lsh/d$a;-><init>()V

    sput-object v0, Lsh/d;->a:Lmg/a$a;

    return-void
.end method

.method public static final a()Lmg/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/a$a<",
            "Lsh/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lsh/d;->a:Lmg/a$a;

    return-object v0
.end method
