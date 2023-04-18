.class public Lw/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/a0$a;
    }
.end annotation


# static fields
.field private static final a:Lw/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/a0$a;

    invoke-direct {v0}, Lw/a0$a;-><init>()V

    sput-object v0, Lw/a0;->a:Lw/w;

    return-void
.end method

.method public static a()Lw/w;
    .locals 1

    sget-object v0, Lw/a0;->a:Lw/w;

    return-object v0
.end method
